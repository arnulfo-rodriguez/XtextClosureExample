package org.arz.interpreter;

import org.arz.miniScript.FunctionDeclaration;

public class Closure {

	private FunctionDeclaration declaration;
	private MyEnvironment environment;

	public Closure(FunctionDeclaration declaration, MyEnvironment environment) {
		this.declaration = declaration;
		this.environment = environment;
	}

	public FunctionDeclaration getDeclaration() {
		return declaration;
	}

	public MyEnvironment getEnvironment() {
		return environment;
	}
}
