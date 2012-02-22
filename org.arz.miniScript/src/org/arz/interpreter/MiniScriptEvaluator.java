package org.arz.interpreter;

import org.arz.miniScript.Apply;
import org.arz.miniScript.Factor;

import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;

import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.VariableAssignment;
import org.eclipse.emf.common.util.EList;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;

public class MiniScriptEvaluator extends AbstractMiniScriptExpressionEvaluator {

	private MyEnvironment getCurrentEnv() {
		return (MyEnvironment) ctx.environment.get("myEnv");
	}

	private MyEnvironment newEnvironment() {
		return getCurrentEnv().createChildEnv();
	}

	private MyEnvironment pushEnv(String envName) {
		MyEnvironment childEnv = newEnvironment();
		ctx.environment.push(envName);
		setNewEnvironment(childEnv);
		return childEnv;
	}

	private void popEnv() {
		ctx.environment.pop();
	}

	private void setNewEnvironment(MyEnvironment rootEnvironment) {
		this.ctx.environment.put("myEnv", rootEnvironment);
	}

	public MiniScriptEvaluator(ExecutionContext ctx) {
		super(ctx);
		setNewEnvironment(MyEnvironment.getRootEnvironment());
	}

	@Override
	protected Object evalSymbolReference(SymbolReference expr, LogEntry log)
			throws InterpreterException {
		return getCurrentEnv().get(expr.getId());
	}

	@Override
	protected Object evalApply(Apply expr, LogEntry log)
			throws InterpreterException {
		Closure closure = (Closure) eval(expr.getFunctor(), log);
		FunctionDeclaration functionDeclaration = closure.getDeclaration();
		EList<String> pList = functionDeclaration.getParameters();
		MyEnvironment childEnv = pushEnv("function");
		int index = 0;
		for (String p : pList) {
			childEnv.set(p, eval(expr.getArguments().get(index), log));
			index++;
		}
		Object result = eval(closure.getDeclaration().getBody(), log);
		popEnv();
		return result;
	}

	@Override
	protected Object evalFunctionDeclaration(FunctionDeclaration expr,
			LogEntry log) throws InterpreterException {
		return new Closure(expr, newEnvironment());
	}

	@Override
	protected Object evalLiteralExpr(LiteralExpr expr, LogEntry log)
			throws InterpreterException {
		return Integer.parseInt(expr.getValue());
	}

	@Override
	protected Object evalNumericExpression(NumericExpression expr, LogEntry log)
			throws InterpreterException {
		Integer leftResult = (Integer) eval(expr.getLeftFactor(), log);
		Integer rightResult = (Integer) eval(expr.getRightFactor(), log);
		return leftResult.intValue()
				+ (rightResult.intValue() * ((expr.getOperator().compareTo("-") == 0) ? -1
						: 1));
	}

	@Override
	protected Object evalFactor(Factor factor, LogEntry log) {
		// TODO Auto-generated method stub
		Integer leftResult = (Integer) eval(factor.getLeftTerm(), log);
		Integer rightResult = (Integer) eval(factor.getRightTerm(), log);
		return new Integer((int) (((double) leftResult.intValue()) * ((factor
				.getOperator().compareTo("/") == 0) ? rightResult.intValue()
				: (1 / (double) rightResult.intValue()))));
	}


	@Override
	protected Object evalVariableAssignment(VariableAssignment expr,
			LogEntry log) throws InterpreterException {
		Object rightSide = eval(expr.getExpression(), log);
		getCurrentEnv().set(expr.getId(), rightSide);
		return rightSide;
	}

}
