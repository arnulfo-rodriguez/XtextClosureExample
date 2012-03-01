package org.arz.interpreter;

import org.arz.miniScript.FunctionDeclaration;

public class Closure {

	private FunctionDeclaration declaration;
	private MyEnvironment parentEnvironment;

	public Closure(FunctionDeclaration declaration, MyEnvironment environment) {
		this.declaration = declaration;
		this.parentEnvironment = environment;
	}

	public FunctionDeclaration getDeclaration() {
		return declaration;
	}

	public MyEnvironment getExecutionEnvironment() {
		return parentEnvironment.createChildEnv();
	}
}
