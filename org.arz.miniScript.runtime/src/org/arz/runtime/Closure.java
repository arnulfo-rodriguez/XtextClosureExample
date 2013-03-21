package org.arz.runtime;

public class Closure {

	private EvaluationEnvironment parentEnvironment;

	public Closure(EvaluationEnvironment environment) {
		this.parentEnvironment = environment;
	}

	public EvaluationEnvironment getExecutionEnvironment() {
		return parentEnvironment.createChildEnv("closure-env");
	}
}
