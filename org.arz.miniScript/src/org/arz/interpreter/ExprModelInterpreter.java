package org.arz.interpreter;

import org.arz.miniScript.Model;

import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MessageList;
import de.itemis.interpreter.logging.LogEntry;
import de.itemis.xtext.typesystem.ITypesystem;

public class ExprModelInterpreter {
	public MessageList runModel(Model m, ITypesystem ts)
			throws InterpreterException {
		ExecutionContext ctx = new ExecutionContext(ts);
		LogEntry log = LogEntry.root("running model " + m.toString());
		LogEntry.setMostRecentRoot(log);
		new MiniScriptEvaluator(ctx);
		new MiniScriptStatementExecutor(ctx).execute(m, log);
		return ctx.messages;
	}
	
	
}