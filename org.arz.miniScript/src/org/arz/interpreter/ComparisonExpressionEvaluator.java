package org.arz.interpreter;

import java.util.HashMap;
import java.util.Map;

import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.ComparisonOperator;
import org.arz.miniScript.Expression;

import de.itemis.interpreter.logging.LogEntry;


abstract class BaseBinaryFunction implements BinaryFunction<Object, LogEntry, ComparisonExpression> {

	protected MiniScriptEvaluator evaluator;

	public BaseBinaryFunction(MiniScriptEvaluator evaluator) {
		super();
		this.evaluator = evaluator;
	}

	public abstract Object apply(LogEntry l, ComparisonExpression c);

}


public class ComparisonExpressionEvaluator {
	MiniScriptEvaluator evaluator;
	Map<ComparisonOperator, BinaryFunction<Object, LogEntry, ComparisonExpression>> functions;

	public ComparisonExpressionEvaluator(MiniScriptEvaluator evaluator) {
		super();
		this.evaluator = evaluator;
		functions  = InitializeFunctions();
	}

	public Object evaluate(ComparisonExpression expr,LogEntry log)
	{
		return functions.get(expr.getOperator()).apply(log,expr);
	}
	
	private Map<ComparisonOperator, BinaryFunction<Object,  LogEntry, ComparisonExpression>> InitializeFunctions() {
		Map<ComparisonOperator, BinaryFunction<Object,  LogEntry, ComparisonExpression>> map = new HashMap<ComparisonOperator, BinaryFunction<Object,  LogEntry, ComparisonExpression>>();
        map.put(ComparisonOperator.LT,new BaseBinaryFunction(evaluator){

			@Override
			public Object apply(LogEntry log, ComparisonExpression compExpr) {
				return (Integer)evaluator.eval(compExpr.getLeftExpr(),log) < (Integer)evaluator.eval(compExpr.getRightExpr(),log);
			}
        	
        });
        
        map.put(ComparisonOperator.LTE,new BaseBinaryFunction(evaluator){

			@Override
			public Object apply(LogEntry log, ComparisonExpression compExpr) {
				return (Integer)evaluator.eval(compExpr.getLeftExpr(),log) <= (Integer)evaluator.eval(compExpr.getRightExpr(),log);
			}
        	
        });

        
        map.put(ComparisonOperator.EQ,new BaseBinaryFunction(evaluator){

			@Override
			public Object apply(LogEntry log, ComparisonExpression compExpr) {
				return evaluator.eval(compExpr.getLeftExpr(),log) == evaluator.eval(compExpr.getRightExpr(),log);
			}
        });
        
        map.put(ComparisonOperator.GT,new BaseBinaryFunction(evaluator){

			@Override
			public Object apply(LogEntry log, ComparisonExpression compExpr) {
				return (Integer)evaluator.eval(compExpr.getLeftExpr(),log) > (Integer)evaluator.eval(compExpr.getRightExpr(),log);
			}
        });

        map.put(ComparisonOperator.GTE,new BaseBinaryFunction(evaluator){

			@Override
			public Object apply(LogEntry log, ComparisonExpression compExpr) {
				return (Integer)evaluator.eval(compExpr.getLeftExpr(),log) >= (Integer)evaluator.eval(compExpr.getRightExpr(),log);
			}
        });

        return map;
	}

}
