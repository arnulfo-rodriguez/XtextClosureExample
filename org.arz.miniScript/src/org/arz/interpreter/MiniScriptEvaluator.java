package org.arz.interpreter;

import org.arz.miniScript.AdditionOperator;
import org.arz.miniScript.Apply;
import org.arz.miniScript.BinaryLogicalOperator;
import org.arz.miniScript.Body;
import org.arz.miniScript.BooleanValue;
import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorOperator;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralBoolean;
import org.arz.miniScript.LiteralNumber;
import org.arz.miniScript.LogicalBinaryExpression;
import org.arz.miniScript.LogicalUnaryExpression;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.TernaryExpression;
import org.arz.miniScript.VariableAssignment;
import org.eclipse.emf.common.util.EList;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;

public class MiniScriptEvaluator extends AbstractMiniScriptExpressionEvaluator {

	ComparisonExpressionEvaluator expressionEvaluator;

	private MyEnvironment getCurrentEnv() {
		return (MyEnvironment) ctx.environment.get("myEnv");
	}

	private MyEnvironment pushEnv(String envName, MyEnvironment myEnvironment) {
		ctx.environment.push(envName);
		setNewEnvironment(myEnvironment);
		return myEnvironment;
	}

	private void popEnv() {
		ctx.environment.pop();
	}

	private void setNewEnvironment(MyEnvironment rootEnvironment) {
		this.ctx.environment.put("myEnv", rootEnvironment);
	}

	public MiniScriptEvaluator(ExecutionContext ctx) {
		super(ctx);
		setNewEnvironment(MyEnvironment.getRootEnvironment().createChildEnv());
		expressionEvaluator = new ComparisonExpressionEvaluator(this);
	}

	@Override
	protected Object evalSymbolReference(SymbolReference expr, LogEntry log)
			throws InterpreterException {
		return checkNull(expr, getCurrentEnv().get(expr.getId()));
	}

	@Override
	protected Object evalApply(Apply expr, LogEntry log)
			throws InterpreterException {
		Closure closure = (Closure) evalCheckNullLog(expr.getFunctor(), log);
		FunctionDeclaration functionDeclaration = closure.getDeclaration();
		EList<String> pList = functionDeclaration.getParameters();
		MyEnvironment childEnv = pushEnv("function",
				closure.getExecutionEnvironment());
		int index = 0;
		for (String p : pList) {
			childEnv.set(p, eval(expr.getArguments().get(index), log));
			index++;
		}
		Object result = evalBody(log, closure.getDeclaration().getBody());
		popEnv();
		return result;
	}

	private Object evalBody(LogEntry log, Body body) {
		Object result = null;
		for (Expression expr : body.getExpressions()) {
			result = eval(expr, log);
		}
		return result;
	}

	@Override
	protected Object evalFunctionDeclaration(FunctionDeclaration expr,
			LogEntry log) throws InterpreterException {
		return new Closure(expr, getCurrentEnv());
	}

	@Override
	protected Object evalNumericExpression(NumericExpression expr, LogEntry log)
			throws InterpreterException {
		Integer leftResult = (Integer) evalCheckNullLog(expr.getLeftFactor(),
				log);
		Integer rightResult = (Integer) evalCheckNullLog(expr.getRightFactor(),
				log);
		return leftResult.intValue()
				+ (rightResult.intValue() * ((expr.getOperator() == AdditionOperator.SUBTRACT) ? -1
						: 1));
	}

	@Override
	protected Object evalFactor(Factor factor, LogEntry log) {
		Integer leftResult = (Integer) evalCheckNullLog(factor.getLeftTerm(),
				log);
		Integer rightResult = (Integer) evalCheckNullLog(factor.getRightTerm(),
				log);
		return new Integer(
				(int) (((double) leftResult.intValue()) * ((factor
						.getOperator() == FactorOperator.MULT) ? rightResult
						.intValue() : (1 / (double) rightResult.intValue()))));
	}

	@Override
	protected Object evalVariableAssignment(VariableAssignment expr,
			LogEntry log) throws InterpreterException {
		Object rightSide = evalCheckNullLog(expr.getExpression(), log);
		getCurrentEnv().set(expr.getId(), rightSide);
		return rightSide;
	}

	@Override
	protected Object evalLiteralBoolean(LiteralBoolean expr, LogEntry log)
			throws InterpreterException {
		return expr.getValue() == BooleanValue.TRUE;
	}

	@Override
	protected Object evalLiteralNumber(LiteralNumber expr, LogEntry log)
			throws InterpreterException {
		return expr.getValue();
	}

	@Override
	protected Object evalTernaryExpression(TernaryExpression expr, LogEntry log)
			throws InterpreterException {
		// assume 'if' since is the only one so far
		return ((Boolean) eval(expr.getCondition(), log)) ? eval(
				expr.getTrueExpr(), log) : eval(expr.getFalseExpr(), log);

	}

	@Override
	protected Object evalLogicalBinaryExpression(LogicalBinaryExpression expr,
			LogEntry log) throws InterpreterException {
		// TODO Auto-generated method stub
		if (expr.getOperator() == BinaryLogicalOperator.AND) {
			return ((Boolean) eval(expr.getLeftExpr(), log))
					&& ((Boolean) eval(expr.getRightExpr(), log));
		} else { // assume or since we only have those two so far
			return ((Boolean) eval(expr.getLeftExpr(), log))
					|| ((Boolean) eval(expr.getRightExpr(), log));
		}
	}

	@Override
	protected Object evalLogicalUnaryExpression(LogicalUnaryExpression expr,
			LogEntry log) throws InterpreterException {
		// assume 'not'
		return !(Boolean) eval(expr.getExpression(), log);
	}

	@Override
	protected Object evalComparisonExpression(ComparisonExpression expr,
			LogEntry log) throws InterpreterException {
		return expressionEvaluator.evaluate(expr, log);
	}
}
