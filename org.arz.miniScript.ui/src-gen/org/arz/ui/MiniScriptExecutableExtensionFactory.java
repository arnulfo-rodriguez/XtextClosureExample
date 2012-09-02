/*
 * generated by Xtext
 */
package org.arz.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.arz.ui.internal.MiniScriptActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MiniScriptExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MiniScriptActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MiniScriptActivator.getInstance().getInjector(MiniScriptActivator.ORG_ARZ_MINISCRIPT);
	}
	
}
