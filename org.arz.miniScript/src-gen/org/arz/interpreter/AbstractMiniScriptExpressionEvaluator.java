
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

		
		if ( expr instanceof FunctionDeclaration ) {
			return evalFunctionDeclaration( (FunctionDeclaration)expr, localLog );
		}
		
		if ( expr instanceof LiteralExpr ) {
			return evalLiteralExpr( (LiteralExpr)expr, localLog );
		}
		
		if ( expr instanceof SymbolReference ) {
			return evalSymbolReference( (SymbolReference)expr, localLog );
		}
		
		if ( expr instanceof VariableAssignment ) {
			return evalVariableAssignment( (VariableAssignment)expr, localLog );
		}
		
		if ( expr instanceof Apply ) {
			return evalApply( (Apply)expr, localLog );
		}
		
		if ( expr instanceof NumericExpression ) {
			return evalNumericExpression( (NumericExpression)expr, localLog );
		}
		
		if ( expr instanceof Factor ) {
			return evalFactor( (Factor)expr, localLog );
		}
		
		
		throw new InterpreterException(expr, "generated eval(...) method cannot handle type "+expr.eClass().getName());
	}

	
	
	protected Object evalFunctionDeclaration( FunctionDeclaration expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalFunctionDeclaration not implemented");
	} 
	
	protected Object evalLiteralExpr( LiteralExpr expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalLiteralExpr not implemented");
	} 
	
	protected Object evalSymbolReference( SymbolReference expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolReference not implemented");
	} 
	
	protected Object evalVariableAssignment( VariableAssignment expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalVariableAssignment not implemented");
	} 
	
	protected Object evalApply( Apply expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalApply not implemented");
	} 
	
	protected Object evalNumericExpression( NumericExpression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalNumericExpression not implemented");
	} 
	
	protected Object evalFactor( Factor expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalFactor not implemented");
	} 
	


}
