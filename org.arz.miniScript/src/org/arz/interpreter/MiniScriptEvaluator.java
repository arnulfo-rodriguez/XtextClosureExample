package org.arz.interpreter;

import org.arz.miniScript.Apply;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorTail;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.NumExprTail;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.VariableAssignment;
import org.eclipse.emf.common.util.EList;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;


public class MiniScriptEvaluator extends AbstractMiniScriptExpressionEvaluator {

	private MyEnvironment getCurrentEnv()
	{
		return (MyEnvironment)ctx.environment.get("myEnv");
	}
	
	private MyEnvironment newEnvironment()
	{
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
		  Closure closure = (Closure)eval(expr.getFunctor(),log);
		  FunctionDeclaration functionDeclaration = closure.getDeclaration();
		  EList<String> pList = functionDeclaration.getParameters();
		  MyEnvironment childEnv = pushEnv("function");
		  int index = 0;
		  for (String p : pList)
		  {
			  childEnv.set(p,eval(expr.getArguments().get(index),log));
			  index++;
		  }
		  Object result = eval(closure.getDeclaration().getBody(),log);
		  popEnv();
		  return result;
	}

	
	@Override
	protected Object evalFunctionDeclaration(FunctionDeclaration expr,
			LogEntry log) throws InterpreterException {
		return new Closure(expr,newEnvironment());
	}
	
	@Override
	protected Object evalLiteralExpr( LiteralExpr expr, LogEntry log )  throws InterpreterException {
		return Integer.parseInt(expr.getValue());
	} 
	

	@Override
	protected Object evalNumericExpression( NumericExpression expr, LogEntry log )  throws InterpreterException {
		Integer termResult = (Integer)eval(expr.getFactor(),log);
		Object result = termResult;
		if (expr.getExprTail() != null)
		{
			result = evalNumExprTail(termResult,expr.getExprTail(),log);
		}
		return result;
	} 
	
	@Override
	protected Object evalFactor(Factor factor, LogEntry log) {
		// TODO Auto-generated method stub
		Integer termResult = (Integer) eval(factor.getTerm(),log);
		Integer result = termResult;
		if (factor.getFactorTail() != null)
		{
			result = evalFactorTail(termResult,factor.getFactorTail(),log);
		}
		return result;
	}

	private Integer evalFactorTail(Integer termResult, FactorTail factorTail,
			LogEntry log) {
		Integer result;
		int rightSide = ((Integer)eval(factorTail.getTerm(),log)).intValue();
		if (factorTail.getOperator().equals("*"))
		{
			result = termResult.intValue() * rightSide;
		}else{
			result = (int) ((double)termResult.intValue() / (double)rightSide);
		}
		if (factorTail.getFactorTail() != null)
		{
			result = evalFactorTail(result,factorTail.getFactorTail(),log);
		}
        return new Integer(result);
	}

	private Integer evalNumExprTail(Integer termResult, NumExprTail numExprTail,LogEntry log) {
		Integer result;
		int rightSide = ((Integer)eval(numExprTail.getFactor(),log)).intValue();
		if (numExprTail.getOperator().equals("+"))
		{
			result = termResult.intValue() + rightSide;
		}else{
			result = termResult.intValue() - rightSide;
		}
		if (numExprTail.getExprTail() != null)
		{
			result = evalNumExprTail(result,numExprTail.getExprTail(),log);
		}
        return result;
	}

	@Override
	protected Object evalVariableAssignment( VariableAssignment expr, LogEntry log )  throws InterpreterException {
		Object rightSide = eval(expr.getExpression(),log);		
		getCurrentEnv().set(expr.getId(),rightSide);
		return rightSide;
	}

}
