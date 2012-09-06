
package org.arz.interpreter;

import org.eclipse.emf.ecore.EObject;
import org.arz.miniScript.*; 

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.AbstractExpressionEvaluator;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;


public abstract class AbstractMiniScriptExpressionEvaluator extends AbstractExpressionEvaluator {

	public AbstractMiniScriptExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
	}

	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {

		LogEntry localLog = parentLog.child(LogEntry.Kind.eval, expr, "evaluating "+expr.eClass().getName());

		
		if ( expr instanceof TernaryExpression ) {
			return evalTernaryExpression( (TernaryExpression)expr, localLog );
		}
		
		if ( expr instanceof LogicalBinaryExpression ) {
			return evalLogicalBinaryExpression( (LogicalBinaryExpression)expr, localLog );
		}
		
		if ( expr instanceof LogicalUnaryExpression ) {
			return evalLogicalUnaryExpression( (LogicalUnaryExpression)expr, localLog );
		}
		
		if ( expr instanceof FunctionDeclaration ) {
			return evalFunctionDeclaration( (FunctionDeclaration)expr, localLog );
		}
		
		if ( expr instanceof SymbolReference ) {
			return evalSymbolReference( (SymbolReference)expr, localLog );
		}
		
		if ( expr instanceof LiteralBoolean ) {
			return evalLiteralBoolean( (LiteralBoolean)expr, localLog );
		}
		
		if ( expr instanceof LiteralNumber ) {
			return evalLiteralNumber( (LiteralNumber)expr, localLog );
		}
		
		if ( expr instanceof VariableAssignment ) {
			return evalVariableAssignment( (VariableAssignment)expr, localLog );
		}
		
		if ( expr instanceof ComparisonExpression ) {
			return evalComparisonExpression( (ComparisonExpression)expr, localLog );
		}
		
		if ( expr instanceof NumericExpression ) {
			return evalNumericExpression( (NumericExpression)expr, localLog );
		}
		
		if ( expr instanceof Factor ) {
			return evalFactor( (Factor)expr, localLog );
		}
		
		if ( expr instanceof Apply ) {
			return evalApply( (Apply)expr, localLog );
		}
		
		
		throw new InterpreterException(expr, "generated eval(...) method cannot handle type "+expr.eClass().getName());
	}

	
	
	protected Object evalTernaryExpression( TernaryExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalTernaryExpression not implemented");
	} 
	
	protected Object evalLogicalBinaryExpression( LogicalBinaryExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLogicalBinaryExpression not implemented");
	} 
	
	protected Object evalLogicalUnaryExpression( LogicalUnaryExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLogicalUnaryExpression not implemented");
	} 
	
	protected Object evalFunctionDeclaration( FunctionDeclaration expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalFunctionDeclaration not implemented");
	} 
	
	protected Object evalSymbolReference( SymbolReference expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolReference not implemented");
	} 
	
	protected Object evalLiteralBoolean( LiteralBoolean expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLiteralBoolean not implemented");
	} 
	
	protected Object evalLiteralNumber( LiteralNumber expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLiteralNumber not implemented");
	} 
	
	protected Object evalVariableAssignment( VariableAssignment expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalVariableAssignment not implemented");
	} 
	
	protected Object evalComparisonExpression( ComparisonExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalComparisonExpression not implemented");
	} 
	
	protected Object evalNumericExpression( NumericExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalNumericExpression not implemented");
	} 
	
	protected Object evalFactor( Factor expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalFactor not implemented");
	} 
	
	protected Object evalApply( Apply expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalApply not implemented");
	} 
	


}
