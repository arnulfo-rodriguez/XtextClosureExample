package org.arz.interpreter;

import org.arz.miniScript.FunctionDeclaration;

public class Closure {

	private FunctionDeclaration declaration;
	private EvaluationEnvironment parentEnvironment;

	public Closure(FunctionDeclaration declaration, EvaluationEnvironment environment) {
		this.declaration = declaration;
		this.parentEnvironment = environment;
	}

	public FunctionDeclaration getDeclaration() {
		return declaration;
	}

	public EvaluationEnvironment getExecutionEnvironment() {
		return parentEnvironment.createChildEnv("closure-env");
	}
}
