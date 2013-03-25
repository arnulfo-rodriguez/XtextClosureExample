package org.arz.runtime;

import java.util.Stack;

public class Context {
	private Stack<EvaluationEnvironment>  environments = new Stack<EvaluationEnvironment>();
	
	public Context()
	{
	   environments.push(EvaluationEnvironment.getRootEnvironment());
	}
	
	public Context(EvaluationEnvironment environment) {
		environments.push(environment);
	}

	public EvaluationEnvironment getCurrentEnvironment() {
		return environments.peek();
	}

	public EvaluationEnvironment pushEnvironment(String name) {
		return environments.push(environments.peek().createChildEnv(name));
	}

	public void popEnvironment() {
		environments.pop();
	}
	
	public Object get(String name) {
		return environments.peek().get(name);
	}
	
	public Object set(String name,Object value) {
		return environments.peek().set(name,value);
	}
    
}
