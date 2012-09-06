/*
* generated by Xtext
*/
package org.arz.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.arz.services.MiniScriptGrammarAccess;

public class MiniScriptParser extends AbstractContentAssistParser {
	
	@Inject
	private MiniScriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.arz.ui.contentassist.antlr.internal.InternalMiniScriptParser createParser() {
		org.arz.ui.contentassist.antlr.internal.InternalMiniScriptParser result = new org.arz.ui.contentassist.antlr.internal.InternalMiniScriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getBodyAccess().getAlternatives(), "rule__Body__Alternatives");
					put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
					put(grammarAccess.getFunctorAccess().getAlternatives(), "rule__Functor__Alternatives");
					put(grammarAccess.getLiteralExprAccess().getAlternatives(), "rule__LiteralExpr__Alternatives");
					put(grammarAccess.getAdditionOperatorAccess().getAlternatives(), "rule__AdditionOperator__Alternatives");
					put(grammarAccess.getFactorOperatorAccess().getAlternatives(), "rule__FactorOperator__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getBinaryLogicalOperatorAccess().getAlternatives(), "rule__BinaryLogicalOperator__Alternatives");
					put(grammarAccess.getBooleanValueAccess().getAlternatives(), "rule__BooleanValue__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_2(), "rule__Program__Group_2__0");
					put(grammarAccess.getTernaryExpressionAccess().getGroup(), "rule__TernaryExpression__Group__0");
					put(grammarAccess.getLogicalBinaryExpressionAccess().getGroup(), "rule__LogicalBinaryExpression__Group__0");
					put(grammarAccess.getLogicalUnaryExpressionAccess().getGroup(), "rule__LogicalUnaryExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
					put(grammarAccess.getComparisonExpressionAccess().getGroup_1(), "rule__ComparisonExpression__Group_1__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup(), "rule__FunctionDeclaration__Group__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_2(), "rule__FunctionDeclaration__Group_2__0");
					put(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1(), "rule__FunctionDeclaration__Group_2_1__0");
					put(grammarAccess.getBodyAccess().getGroup_1(), "rule__Body__Group_1__0");
					put(grammarAccess.getBodyAccess().getGroup_1_2(), "rule__Body__Group_1_2__0");
					put(grammarAccess.getNumericExpressionAccess().getGroup(), "rule__NumericExpression__Group__0");
					put(grammarAccess.getNumericExpressionAccess().getGroup_1(), "rule__NumericExpression__Group_1__0");
					put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
					put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
					put(grammarAccess.getApplyAccess().getGroup(), "rule__Apply__Group__0");
					put(grammarAccess.getApplyAccess().getGroup_1(), "rule__Apply__Group_1__0");
					put(grammarAccess.getApplyAccess().getGroup_1_2(), "rule__Apply__Group_1_2__0");
					put(grammarAccess.getApplyAccess().getGroup_1_2_1(), "rule__Apply__Group_1_2_1__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
					put(grammarAccess.getParenthesisExpressionAccess().getGroup(), "rule__ParenthesisExpression__Group__0");
					put(grammarAccess.getProgramAccess().getExpressionsAssignment_0(), "rule__Program__ExpressionsAssignment_0");
					put(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0(), "rule__Program__ExpressionsAssignment_2_0");
					put(grammarAccess.getTernaryExpressionAccess().getOperatorAssignment_0(), "rule__TernaryExpression__OperatorAssignment_0");
					put(grammarAccess.getTernaryExpressionAccess().getConditionAssignment_2(), "rule__TernaryExpression__ConditionAssignment_2");
					put(grammarAccess.getTernaryExpressionAccess().getTrueExprAssignment_4(), "rule__TernaryExpression__TrueExprAssignment_4");
					put(grammarAccess.getTernaryExpressionAccess().getFalseExprAssignment_6(), "rule__TernaryExpression__FalseExprAssignment_6");
					put(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorAssignment_0(), "rule__LogicalBinaryExpression__OperatorAssignment_0");
					put(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprAssignment_2(), "rule__LogicalBinaryExpression__LeftExprAssignment_2");
					put(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprAssignment_4(), "rule__LogicalBinaryExpression__RightExprAssignment_4");
					put(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorAssignment_0(), "rule__LogicalUnaryExpression__OperatorAssignment_0");
					put(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionAssignment_2(), "rule__LogicalUnaryExpression__ExpressionAssignment_2");
					put(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1(), "rule__ComparisonExpression__OperatorAssignment_1_1");
					put(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2(), "rule__ComparisonExpression__RightExprAssignment_1_2");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0(), "rule__FunctionDeclaration__ParametersAssignment_2_0");
					put(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1(), "rule__FunctionDeclaration__ParametersAssignment_2_1_1");
					put(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4(), "rule__FunctionDeclaration__BodyAssignment_4");
					put(grammarAccess.getBodyAccess().getExpressionsAssignment_0(), "rule__Body__ExpressionsAssignment_0");
					put(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2_0(), "rule__Body__ExpressionsAssignment_1_2_0");
					put(grammarAccess.getSymbolReferenceAccess().getIdAssignment(), "rule__SymbolReference__IdAssignment");
					put(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2(), "rule__NumericExpression__RightFactorAssignment_1_2");
					put(grammarAccess.getFactorAccess().getOperatorAssignment_1_1(), "rule__Factor__OperatorAssignment_1_1");
					put(grammarAccess.getFactorAccess().getRightTermAssignment_1_2(), "rule__Factor__RightTermAssignment_1_2");
					put(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0(), "rule__Apply__ArgumentsAssignment_1_2_0");
					put(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1(), "rule__Apply__ArgumentsAssignment_1_2_1_1");
					put(grammarAccess.getLiteralBooleanAccess().getValueAssignment(), "rule__LiteralBoolean__ValueAssignment");
					put(grammarAccess.getLiteralNumberAccess().getValueAssignment(), "rule__LiteralNumber__ValueAssignment");
					put(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0(), "rule__VariableAssignment__IdAssignment_0");
					put(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2(), "rule__VariableAssignment__ExpressionAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.arz.ui.contentassist.antlr.internal.InternalMiniScriptParser typedParser = (org.arz.ui.contentassist.antlr.internal.InternalMiniScriptParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MiniScriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MiniScriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
