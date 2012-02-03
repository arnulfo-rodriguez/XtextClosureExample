/*
* generated by Xtext
*/
grammar InternalMiniScript;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.arz.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.arz.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.arz.services.MiniScriptGrammarAccess;

}

@parser::members {

 	private MiniScriptGrammarAccess grammarAccess;
 	
    public InternalMiniScriptParser(TokenStream input, MiniScriptGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected MiniScriptGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
    }
    this_Program_0=ruleProgram
    { 
        $current = $this_Program_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
	    }
		lv_expressions_0_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_0_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getTailProgramTailParserRuleCall_1_0()); 
	    }
		lv_tail_1_0=ruleProgramTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		set(
       			$current, 
       			"tail",
        		lv_tail_1_0, 
        		"ProgramTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleProgramTail
entryRuleProgramTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramTailRule()); }
	 iv_ruleProgramTail=ruleProgramTail 
	 { $current=$iv_ruleProgramTail.current; } 
	 EOF 
;

// Rule ProgramTail
ruleProgramTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=';' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProgramTailAccess().getSemicolonKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
	    }
		lv_expression_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramTailRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramTailAccess().getTailProgramTailParserRuleCall_2_0()); 
	    }
		lv_tail_2_0=ruleProgramTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramTailRule());
	        }
       		set(
       			$current, 
       			"tail",
        		lv_tail_2_0, 
        		"ProgramTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
    }
    this_FunctionDeclaration_0=ruleFunctionDeclaration
    { 
        $current = $this_FunctionDeclaration_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
    }
    this_VariableAssignment_1=ruleVariableAssignment
    { 
        $current = $this_VariableAssignment_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
    }
    this_NumericExpression_2=ruleNumericExpression
    { 
        $current = $this_NumericExpression_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleFunctionDeclaration
entryRuleFunctionDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionDeclarationRule()); }
	 iv_ruleFunctionDeclaration=ruleFunctionDeclaration 
	 { $current=$iv_ruleFunctionDeclaration.current; } 
	 EOF 
;

// Rule FunctionDeclaration
ruleFunctionDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='func' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersFunctionParametersParserRuleCall_2_0()); 
	    }
		lv_parameters_2_0=ruleFunctionParameters		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		set(
       			$current, 
       			"parameters",
        		lv_parameters_2_0, 
        		"FunctionParameters");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
	    }
		lv_body_4_0=ruleBody		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
	        }
       		set(
       			$current, 
       			"body",
        		lv_body_4_0, 
        		"Body");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBodyRule()); }
	 iv_ruleBody=ruleBody 
	 { $current=$iv_ruleBody.current; } 
	 EOF 
;

// Rule Body
ruleBody returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_0_0()); 
	    }
		lv_expression_0_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_0_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
	    }
		lv_expressions_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyRule());
	        }
       		set(
       			$current, 
       			"expressions",
        		lv_expressions_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBodyAccess().getTailBodyTailParserRuleCall_1_2_0()); 
	    }
		lv_tail_3_0=ruleBodyTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyRule());
	        }
       		set(
       			$current, 
       			"tail",
        		lv_tail_3_0, 
        		"BodyTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3());
    }
))
;





// Entry rule entryRuleBodyTail
entryRuleBodyTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBodyTailRule()); }
	 iv_ruleBodyTail=ruleBodyTail 
	 { $current=$iv_ruleBodyTail.current; } 
	 EOF 
;

// Rule BodyTail
ruleBodyTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=';' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBodyTailAccess().getSemicolonKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBodyTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
	    }
		lv_expression_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyTailRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBodyTailAccess().getTailBodyTailParserRuleCall_2_0()); 
	    }
		lv_tail_2_0=ruleBodyTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBodyTailRule());
	        }
       		set(
       			$current, 
       			"tail",
        		lv_tail_2_0, 
        		"BodyTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFunctionParameters
entryRuleFunctionParameters returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionParametersRule()); }
	 iv_ruleFunctionParameters=ruleFunctionParameters 
	 { $current=$iv_ruleFunctionParameters.current; } 
	 EOF 
;

// Rule FunctionParameters
ruleFunctionParameters returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_parameter_0_0=RULE_ID
		{
			newLeafNode(lv_parameter_0_0, grammarAccess.getFunctionParametersAccess().getParameterIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionParametersRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"parameter",
        		lv_parameter_0_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionParametersAccess().getNextParametersFunctionParametersTailParserRuleCall_1_0()); 
	    }
		lv_nextParameters_1_0=ruleFunctionParametersTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
	        }
       		set(
       			$current, 
       			"nextParameters",
        		lv_nextParameters_1_0, 
        		"FunctionParametersTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFunctionParametersTail
entryRuleFunctionParametersTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionParametersTailRule()); }
	 iv_ruleFunctionParametersTail=ruleFunctionParametersTail 
	 { $current=$iv_ruleFunctionParametersTail.current; } 
	 EOF 
;

// Rule FunctionParametersTail
ruleFunctionParametersTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=',' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionParametersTailAccess().getCommaKeyword_0());
    }
(
(
		lv_parameter_1_0=RULE_ID
		{
			newLeafNode(lv_parameter_1_0, grammarAccess.getFunctionParametersTailAccess().getParameterIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionParametersTailRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"parameter",
        		lv_parameter_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionParametersTailAccess().getNextParametersFunctionParametersTailParserRuleCall_2_0()); 
	    }
		lv_nextParameters_2_0=ruleFunctionParametersTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionParametersTailRule());
	        }
       		set(
       			$current, 
       			"nextParameters",
        		lv_nextParameters_2_0, 
        		"FunctionParametersTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleApply
entryRuleApply returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplyRule()); }
	 iv_ruleApply=ruleApply 
	 { $current=$iv_ruleApply.current; } 
	 EOF 
;

// Rule Apply
ruleApply returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getApplyAccess().getFunctorFunctorParserRuleCall_0_0()); 
	    }
		lv_functor_0_0=ruleFunctor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplyRule());
	        }
       		set(
       			$current, 
       			"functor",
        		lv_functor_0_0, 
        		"Functor");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_0()); 
	    }
		lv_arguments_1_0=ruleApplyTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplyRule());
	        }
       		set(
       			$current, 
       			"arguments",
        		lv_arguments_1_0, 
        		"ApplyTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFunctor
entryRuleFunctor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctorRule()); }
	 iv_ruleFunctor=ruleFunctor 
	 { $current=$iv_ruleFunctor.current; } 
	 EOF 
;

// Rule Functor
ruleFunctor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
    }
    this_SymbolReference_0=ruleSymbolReference
    { 
        $current = $this_SymbolReference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
    }
    this_ParenthesisExpression_1=ruleParenthesisExpression
    { 
        $current = $this_ParenthesisExpression_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleApplyTail
entryRuleApplyTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getApplyTailRule()); }
	 iv_ruleApplyTail=ruleApplyTail 
	 { $current=$iv_ruleApplyTail.current; } 
	 EOF 
;

// Rule ApplyTail
ruleApplyTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getApplyTailAccess().getApplyFunctionAlphaAction_0(),
            $current);
    }
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplyTailAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
	    }
		lv_args_2_0=ruleFunctionArguments		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplyTailRule());
	        }
       		set(
       			$current, 
       			"args",
        		lv_args_2_0, 
        		"FunctionArguments");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
	    }
		lv_nextCall_4_0=ruleApplyTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getApplyTailRule());
	        }
       		set(
       			$current, 
       			"nextCall",
        		lv_nextCall_4_0, 
        		"ApplyTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFunctionArguments
entryRuleFunctionArguments returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionArgumentsRule()); }
	 iv_ruleFunctionArguments=ruleFunctionArguments 
	 { $current=$iv_ruleFunctionArguments.current; } 
	 EOF 
;

// Rule FunctionArguments
ruleFunctionArguments returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgumentExpressionParserRuleCall_0_0()); 
	    }
		lv_argument_0_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
	        }
       		set(
       			$current, 
       			"argument",
        		lv_argument_0_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_1_0()); 
	    }
		lv_nextArguments_1_0=ruleFunctionArgumentsTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
	        }
       		set(
       			$current, 
       			"nextArguments",
        		lv_nextArguments_1_0, 
        		"FunctionArgumentsTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFunctionArgumentsTail
entryRuleFunctionArgumentsTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionArgumentsTailRule()); }
	 iv_ruleFunctionArgumentsTail=ruleFunctionArgumentsTail 
	 { $current=$iv_ruleFunctionArgumentsTail.current; } 
	 EOF 
;

// Rule FunctionArgumentsTail
ruleFunctionArgumentsTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0=',' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFunctionArgumentsTailAccess().getCommaKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionArgumentsTailAccess().getArgumentExpressionParserRuleCall_1_0()); 
	    }
		lv_argument_1_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionArgumentsTailRule());
	        }
       		set(
       			$current, 
       			"argument",
        		lv_argument_1_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_2_0()); 
	    }
		lv_nextArguments_2_0=ruleFunctionArgumentsTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionArgumentsTailRule());
	        }
       		set(
       			$current, 
       			"nextArguments",
        		lv_nextArguments_2_0, 
        		"FunctionArgumentsTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleLiteralExpr
entryRuleLiteralExpr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLiteralExprRule()); }
	 iv_ruleLiteralExpr=ruleLiteralExpr 
	 { $current=$iv_ruleLiteralExpr.current; } 
	 EOF 
;

// Rule LiteralExpr
ruleLiteralExpr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_NUM
		{
			newLeafNode(lv_value_0_0, grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLiteralExprRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"Num");
	    }

)
)
;





// Entry rule entryRuleSymbolReference
entryRuleSymbolReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSymbolReferenceRule()); }
	 iv_ruleSymbolReference=ruleSymbolReference 
	 { $current=$iv_ruleSymbolReference.current; } 
	 EOF 
;

// Rule SymbolReference
ruleSymbolReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSymbolReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRuleNumericExpression
entryRuleNumericExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumericExpressionRule()); }
	 iv_ruleNumericExpression=ruleNumericExpression 
	 { $current=$iv_ruleNumericExpression.current; } 
	 EOF 
;

// Rule NumericExpression
ruleNumericExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorFactorParserRuleCall_0_0()); 
	    }
		lv_factor_0_0=ruleFactor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
	        }
       		set(
       			$current, 
       			"factor",
        		lv_factor_0_0, 
        		"Factor");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getExprTailExprTailParserRuleCall_1_0()); 
	    }
		lv_exprTail_1_0=ruleExprTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
	        }
       		set(
       			$current, 
       			"exprTail",
        		lv_exprTail_1_0, 
        		"ExprTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleExprTail
entryRuleExprTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExprTailRule()); }
	 iv_ruleExprTail=ruleExprTail 
	 { $current=$iv_ruleExprTail.current; } 
	 EOF 
;

// Rule ExprTail
ruleExprTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='+' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getPlusSignKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_0_1_0()); 
	    }
		lv_factor_1_0=ruleFactor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprTailRule());
	        }
       		set(
       			$current, 
       			"factor",
        		lv_factor_1_0, 
        		"Factor");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_0_2_0()); 
	    }
		lv_exprTail_2_0=ruleExprTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprTailRule());
	        }
       		set(
       			$current, 
       			"exprTail",
        		lv_exprTail_2_0, 
        		"ExprTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
    |(	otherlv_3='-' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExprTailAccess().getHyphenMinusKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_1_1_0()); 
	    }
		lv_factor_4_0=ruleFactor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprTailRule());
	        }
       		set(
       			$current, 
       			"factor",
        		lv_factor_4_0, 
        		"Factor");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_1_2_0()); 
	    }
		lv_exprTail_5_0=ruleExprTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getExprTailRule());
	        }
       		set(
       			$current, 
       			"exprTail",
        		lv_exprTail_5_0, 
        		"ExprTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?))
;





// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	 iv_ruleFactor=ruleFactor 
	 { $current=$iv_ruleFactor.current; } 
	 EOF 
;

// Rule Factor
ruleFactor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getFactorAccess().getTermTermParserRuleCall_0_0()); 
	    }
		lv_term_0_0=ruleTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorRule());
	        }
       		set(
       			$current, 
       			"term",
        		lv_term_0_0, 
        		"Term");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_0()); 
	    }
		lv_factorTail_1_0=ruleFactorTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorRule());
	        }
       		set(
       			$current, 
       			"factorTail",
        		lv_factorTail_1_0, 
        		"FactorTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleFactorTail
entryRuleFactorTail returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFactorTailRule()); }
	 iv_ruleFactorTail=ruleFactorTail 
	 { $current=$iv_ruleFactorTail.current; } 
	 EOF 
;

// Rule FactorTail
ruleFactorTail returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='*' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFactorTailAccess().getAsteriskKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_0_1_0()); 
	    }
		lv_term_1_0=ruleTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorTailRule());
	        }
       		set(
       			$current, 
       			"term",
        		lv_term_1_0, 
        		"Term");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_0_2_0()); 
	    }
		lv_factorTail_2_0=ruleFactorTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorTailRule());
	        }
       		set(
       			$current, 
       			"factorTail",
        		lv_factorTail_2_0, 
        		"FactorTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
    |(	otherlv_3='/' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFactorTailAccess().getSolidusKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_1_0()); 
	    }
		lv_term_4_0=ruleTerm		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorTailRule());
	        }
       		set(
       			$current, 
       			"term",
        		lv_term_4_0, 
        		"Term");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_1_2_0()); 
	    }
		lv_factorTail_5_0=ruleFactorTail		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFactorTailRule());
	        }
       		set(
       			$current, 
       			"factorTail",
        		lv_factorTail_5_0, 
        		"FactorTail");
	        afterParserOrEnumRuleCall();
	    }

)
)?))
;





// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	 iv_ruleTerm=ruleTerm 
	 { $current=$iv_ruleTerm.current; } 
	 EOF 
;

// Rule Term
ruleTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
    }
    this_LiteralExpr_0=ruleLiteralExpr
    { 
        $current = $this_LiteralExpr_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
    }
    this_Apply_1=ruleApply
    { 
        $current = $this_Apply_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableAssignmentRule()); }
	 iv_ruleVariableAssignment=ruleVariableAssignment 
	 { $current=$iv_ruleVariableAssignment.current; } 
	 EOF 
;

// Rule VariableAssignment
ruleVariableAssignment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_id_0_0=RULE_ID
		{
			newLeafNode(lv_id_0_0, grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableAssignmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleParenthesisExpression
entryRuleParenthesisExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParenthesisExpressionRule()); }
	 iv_ruleParenthesisExpression=ruleParenthesisExpression 
	 { $current=$iv_ruleParenthesisExpression.current; } 
	 EOF 
;

// Rule ParenthesisExpression
ruleParenthesisExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2());
    }
)
;





RULE_NUM : '0'..'9';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


