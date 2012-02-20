package org.arz.miniscript.tests;

import junit.framework.Assert;

import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.arz.MiniScriptInjectorProvider;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.VariableAssignment;


import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(MiniScriptInjectorProvider.class)
public class ParsingTests {
  @Inject private ParseHelper<Program> parserHelper;
  @Inject private IScopeProvider scopeProvider;
  
  @Test public void parseSymbol()
  {
	 StringBuilder builder = new StringBuilder();
	 builder.append("a;");
	 Program p;
	try {
		p = parserHelper.parse(builder.toString());
		Assert.assertTrue(p.getExpressions().get(0) instanceof SymbolReference);
	} catch (Exception e) {
		Assert.fail();
	}
  }
  
  @Test public void parseSymbolAssigment()
  {
	 StringBuilder builder = new StringBuilder();
	 builder.append("a=1;");
	 Program p;
	try {
		p = parserHelper.parse(builder.toString());
		Assert.assertTrue(p.getExpressions().get(0) instanceof VariableAssignment);
	} catch (Exception e) {
		Assert.fail();
	}
  }
  
  @Test public void parseFunction()
  {
	 StringBuilder builder = new StringBuilder();
	 builder.append("func() 1");
	 Program p;
	try {
		p = parserHelper.parse(builder.toString());
		Expression expression = p.getExpressions().get(0);
		Assert.assertTrue(expression instanceof FunctionDeclaration);
		FunctionDeclaration f=(FunctionDeclaration) expression;
		Assert.assertTrue(f.getParameters().size() == 0);
		Assert.assertTrue(f.getBody().getExpressions().size()==1);
		Assert.assertTrue(f.getBody().getExpressions().get(0) instanceof LiteralExpr);
	} catch (Exception e) {
		Assert.fail();
	}
  }


}
