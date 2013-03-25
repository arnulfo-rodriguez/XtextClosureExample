package org.arz.runtime;

public abstract class Closure {

	protected Context context;

	public Closure(EvaluationEnvironment environment) {
		this.context = new Context(environment);
	}

	public Object apply(Object...arguments)
	{
		context.pushEnvironment("closureEnv");
		Object result = executeBody(arguments);
		context.popEnvironment();
		return result;
	}

	protected abstract Object executeBody(Object[] arguments);
  
}
