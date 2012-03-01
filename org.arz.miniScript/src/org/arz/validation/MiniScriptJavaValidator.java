package org.arz.validation;

import org.arz.interpreter.ExprModelInterpreter;
import org.arz.miniScript.Model;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MessageList;
import de.itemis.xtext.typesystem.ITypesystem;

public class MiniScriptJavaValidator extends AbstractMiniScriptJavaValidator {

	@Inject
	private ITypesystem ts;

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
		try {
			ts.checkTypesystemConstraints(m, this);
			MessageList errors = new ExprModelInterpreter().runModel(m, ts);

			for (MessageList.MessageItem o : errors.getMessages()) {
				error(o.message, o.element, null, -1, INTERPRETERFAILED);
			}
		} catch (InterpreterException e) {
			if (e.getFailedObject() != null) {
				error(e.getMessage(), e.getFailedObject(), null, -1,
						INTERPRETERFAILED);
			} else {
				error(e.getMessage(), m, null, -1, INTERPRETERFAILED);
				e.printStackTrace();
			}
		}
	}

}
