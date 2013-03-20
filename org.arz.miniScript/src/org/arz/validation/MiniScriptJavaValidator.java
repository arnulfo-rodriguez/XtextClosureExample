package org.arz.validation;

import org.arz.miniScript.Model;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;


public class MiniScriptJavaValidator extends AbstractMiniScriptJavaValidator {

	public static final String INTERPRETERFAILED = "INTERPRETERFAILED";

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital",
	// MyDslPackage.Literals.GREETING__NAME);
	// }
	// }

	@Check()
	public void runAssertStatements(Model m) {

	}

}
