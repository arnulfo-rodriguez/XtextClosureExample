package org.arz.interpreter;

import java.util.HashMap;

public class EvaluationEnvironment {
	private EvaluationEnvironment() {
	};

	private static EvaluationEnvironment nullEnvironment = new EvaluationEnvironment();
	private EvaluationEnvironment parent;
	private HashMap<String, Object> map = new HashMap<String, Object>();
	private String name;

	public static EvaluationEnvironment getRootEnvironment() {
		return nullEnvironment.createChildEnv("root");
	}

	private EvaluationEnvironment(EvaluationEnvironment env,String name) {
		this.parent = env;
		this.name = name;
	}

	public EvaluationEnvironment createChildEnv(String name) {
		return new EvaluationEnvironment(this,name);
	}

	public Object get(String name) {
		Object result = map.get(name);
		if (result != null) {
			return result;
		} else if ((result == null) && (parent != nullEnvironment)) {
			return parent.get(name);
		} else {
			return null;
		}
	}

	public Object set(String name, Object obj) {
		if (map.containsKey(name)) {
			map.remove(name);
		}
		map.put(name, obj);
		return obj;
	}

}
