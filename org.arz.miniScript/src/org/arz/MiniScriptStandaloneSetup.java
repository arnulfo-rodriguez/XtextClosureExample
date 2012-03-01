package org.arz;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class MiniScriptStandaloneSetup extends
		MiniScriptStandaloneSetupGenerated {

	public static void doSetup() {
		new MiniScriptStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
