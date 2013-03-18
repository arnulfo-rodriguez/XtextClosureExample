package org.arz.interpreter;

import java.util.Stack;

public class Context {
	private Stack<EvaluationEnvironment>  environments = new Stack<EvaluationEnvironment>();
	
	public Context()
	{
	   environments.push(EvaluationEnvironment.getRootEnvironment());
	}
	
	public EvaluationEnvironment getCurrentEnvironment() {
		return environments.peek();
	}

	public EvaluationEnvironment pushEnvironment(EvaluationEnvironment env) {
		return environments.push(env);
	}

	public void popEnvironment() {
		environments.pop();
	}
    
}
