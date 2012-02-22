package org.arz.miniscript.tests;

import junit.framework.Assert;

import org.arz.MiniScriptInjectorProvider;
import org.arz.miniScript.Apply;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.VariableAssignment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(MiniScriptInjectorProvider.class)
public class ParsingTests {
	@Inject
	private ParseHelper<Program> parserHelper;
	@Inject
	private IScopeProvider scopeProvider;

	@Test
	public void parseSymbol() {
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

	@Test
	public void parseSymbolAssigment() {
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

	@Test
	public void parseFunction() {
		StringBuilder builder = new StringBuilder();
		builder.append("func() 1");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof FunctionDeclaration);
			FunctionDeclaration f = (FunctionDeclaration) expression;
			Assert.assertTrue(f.getParameters().size() == 0);
			Assert.assertTrue(f.getBody().getExpressions().size() == 1);
			Assert.assertTrue(f.getBody().getExpressions().get(0) instanceof LiteralExpr);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseSimpleApply() {
		StringBuilder builder = new StringBuilder();
		builder.append("foo(x,y);");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof Apply);
			Apply f = (Apply) expression;
			EList<Expression> tail = f.getArguments();
			Assert.assertTrue(tail.size() == 2);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseApplySequence() {
		StringBuilder builder = new StringBuilder();
		builder.append("foo(x,y)(z);");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof Apply);
			Apply f = (Apply) expression;
			Assert.assertTrue(f.getArguments().size() == 1);
			Assert.assertTrue(f.getFunctor() instanceof Apply);
			f = (Apply) f.getFunctor();
			Assert.assertTrue(f.getArguments().size() == 2);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseSum() {
		StringBuilder builder = new StringBuilder();
		builder.append("a + b");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof NumericExpression);
			NumericExpression f = (NumericExpression) expression;
			Assert.assertTrue(f.getLeftFactor() instanceof SymbolReference);
			Assert.assertTrue(f.getOperator().compareTo("+") == 0);
			Assert.assertTrue(f.getRightFactor() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void parseSubtract() {
		StringBuilder builder = new StringBuilder();
		builder.append("a - b");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof NumericExpression);
			NumericExpression f = (NumericExpression) expression;
			Assert.assertTrue(f.getLeftFactor() instanceof SymbolReference);
			Assert.assertTrue(f.getOperator().compareTo("-") == 0);
			Assert.assertTrue(f.getRightFactor() instanceof SymbolReference);

		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void parseMultiplication() {
		StringBuilder builder = new StringBuilder();
		builder.append("a * b");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof Factor);
			Factor f = (Factor) expression;
			Assert.assertTrue(f.getLeftTerm() instanceof SymbolReference);
			Assert.assertTrue(f.getOperator().compareTo("*") == 0);
			Assert.assertTrue(f.getRightTerm() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void parseDivision() {
		StringBuilder builder = new StringBuilder();
		builder.append("a / b");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof Factor);
			Factor f = (Factor) expression;
			Assert.assertTrue(f.getLeftTerm() instanceof SymbolReference);
			Assert.assertTrue(f.getOperator().compareTo("/") == 0);
			Assert.assertTrue(f.getRightTerm() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	@Test
	public void parseComplexNumericExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("((a / b) * (c -d)) - 2;");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof NumericExpression);
			NumericExpression f = (NumericExpression) expression;
			Assert.assertTrue(f.getLeftFactor() instanceof Factor);
			Assert.assertTrue(((Factor)f.getLeftFactor()).getLeftTerm() instanceof Factor);
			Assert.assertTrue(((Factor)f.getLeftFactor()).getRightTerm() instanceof NumericExpression);
			Assert.assertTrue(f.getOperator().compareTo("-") == 0);
			Assert.assertTrue(f.getRightFactor() instanceof LiteralExpr);
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
