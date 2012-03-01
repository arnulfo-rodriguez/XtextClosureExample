package org.arz.interpreter;

import org.arz.miniScript.Expression;
import org.arz.miniScript.Program;
import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;

public class MiniScriptStatementExecutor extends
		AbstractMiniScriptStatementExecutor {

	public MiniScriptStatementExecutor(ExecutionContext ctx) {
		super(ctx);
	}

	@Override
	public void execute(EObject statement, LogEntry parentLog)
			throws InterpreterException {
		// TODO Auto-generated method stub
		LogEntry localLog = log(statement, parentLog);
		Program p = (Program) statement;
		for (Expression expr : p.getExpressions()) {
			ctx.getEvaluator().eval(expr, localLog);

		}
	}

}
