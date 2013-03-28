package org.arz.miniscript.tests;

import junit.framework.Assert;

import org.arz.MiniScriptInjectorProvider;
import org.arz.miniScript.AdditionOperator;
import org.arz.miniScript.Apply;
import org.arz.miniScript.BinaryLogicalOperator;
import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.ComparisonOperator;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorOperator;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LetExpression;
import org.arz.miniScript.LiteralNumber;
import org.arz.miniScript.LogicalBinaryExpression;
import org.arz.miniScript.LogicalUnaryExpression;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.UnaryLogicalOperator;
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
			Assert.assertEquals(0, f.getParameters().size());
			Assert.assertEquals(1, f.getBody().getExpressions().size());
			Assert.assertTrue(f.getBody().getExpressions().get(0) instanceof LiteralNumber);
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
			Assert.assertEquals(2, tail.size());
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
			Assert.assertEquals(1, f.getArguments().size());
			Assert.assertTrue(f.getFunctor() instanceof Apply);
			f = (Apply) f.getFunctor();
			Assert.assertEquals(2, f.getArguments().size());
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
			Assert.assertEquals(AdditionOperator.ADD, f.getOperator());
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
			Assert.assertEquals(AdditionOperator.SUBTRACT, f.getOperator());
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
			Assert.assertEquals(FactorOperator.MULT, f.getOperator());
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
			Assert.assertEquals(FactorOperator.DIVISION, f.getOperator());
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
			Assert.assertTrue(((Factor) f.getLeftFactor()).getLeftTerm() instanceof Factor);
			Assert.assertTrue(((Factor) f.getLeftFactor()).getRightTerm() instanceof NumericExpression);
			Assert.assertEquals(AdditionOperator.SUBTRACT, f.getOperator());
			Assert.assertTrue(f.getRightFactor() instanceof LiteralNumber);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseUnaryExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("not(a)");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof LogicalUnaryExpression);
			LogicalUnaryExpression unaryExpression = (LogicalUnaryExpression) expression;
			Assert.assertEquals(UnaryLogicalOperator.NOT,
					unaryExpression.getOperator());
			Assert.assertTrue(unaryExpression.getExpression() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseComparisonExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("a > b");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof ComparisonExpression);
			ComparisonExpression compExpression = (ComparisonExpression) expression;
			Assert.assertEquals(ComparisonOperator.GT,
					compExpression.getOperator());
			Assert.assertTrue(compExpression.getLeftExpr() instanceof SymbolReference);
			Assert.assertTrue(compExpression.getRightExpr() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseBinaryLogicalExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("and(a , b)");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof LogicalBinaryExpression);
			LogicalBinaryExpression compExpression = (LogicalBinaryExpression) expression;
			Assert.assertEquals(BinaryLogicalOperator.AND,
					compExpression.getOperator());
			Assert.assertTrue(compExpression.getLeftExpr() instanceof SymbolReference);
			Assert.assertTrue(compExpression.getRightExpr() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseCpomplexLogicalExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("and(a,(not( b > c)))");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof LogicalBinaryExpression);
			LogicalBinaryExpression compExpression = (LogicalBinaryExpression) expression;
			Assert.assertEquals(BinaryLogicalOperator.AND,
					compExpression.getOperator());
			Assert.assertTrue(compExpression.getLeftExpr() instanceof SymbolReference);
			Assert.assertTrue(compExpression.getRightExpr() instanceof LogicalUnaryExpression);
		} catch (Exception e) {
			Assert.fail();
		}
	}

	@Test
	public void parseLetExpression() {
		StringBuilder builder = new StringBuilder();
		builder.append("let a=1,a;");
		Program p;
		try {
			p = parserHelper.parse(builder.toString());
			Expression expression = p.getExpressions().get(0);
			Assert.assertTrue(expression instanceof LetExpression);
			LetExpression letExpr = (LetExpression) expression;
			Assert.assertTrue(letExpr.getAssigment() instanceof VariableAssignment);
			Assert.assertTrue(letExpr.getExpression() instanceof SymbolReference);
		} catch (Exception e) {
			Assert.fail();
		}

	}

}
