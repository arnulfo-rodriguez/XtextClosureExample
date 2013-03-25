package org.arz.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.arz.miniScript.Apply;
import org.arz.miniScript.Body;
import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralBoolean;
import org.arz.miniScript.LiteralNumber;
import org.arz.miniScript.LogicalBinaryExpression;
import org.arz.miniScript.LogicalUnaryExpression;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.TernaryExpression;
import org.arz.miniScript.VariableAssignment;
import org.arz.services.MiniScriptGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MiniScriptSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MiniScriptGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MiniScriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MiniScriptPackage.APPLY:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Apply(context, (Apply) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.COMPARISON_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_ComparisonExpression(context, (ComparisonExpression) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FACTOR:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.LITERAL_BOOLEAN:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLiteralBooleanRule() ||
				   context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LiteralBoolean(context, (LiteralBoolean) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.LITERAL_NUMBER:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLiteralExpressionRule() ||
				   context == grammarAccess.getLiteralNumberRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LiteralNumber(context, (LiteralNumber) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.LOGICAL_BINARY_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLogicalBinaryExpressionRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LogicalBinaryExpression(context, (LogicalBinaryExpression) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.LOGICAL_UNARY_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLogicalUnaryExpressionRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LogicalUnaryExpression(context, (LogicalUnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.NUMERIC_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_NumericExpression(context, (NumericExpression) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.PROGRAM:
				if(context == grammarAccess.getModelRule() ||
				   context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.SYMBOL_REFERENCE:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getSymbolReferenceRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_SymbolReference(context, (SymbolReference) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.TERNARY_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getTernaryExpressionRule()) {
					sequence_TernaryExpression(context, (TernaryExpression) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.VARIABLE_ASSIGNMENT:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getVariableAssignmentRule()) {
					sequence_VariableAssignment(context, (VariableAssignment) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((functor=Apply_Apply_1_0 (arguments+=Expression arguments+=Expression*)?) | functor=Apply_Apply_1_0)
	 */
	protected void sequence_Apply(EObject context, Apply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftExpr=ComparisonExpression_ComparisonExpression_1_0 operator=ComparisonOperator rightExpr=NumericExpression)
	 */
	protected void sequence_ComparisonExpression(EObject context, ComparisonExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__LEFT_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__LEFT_EXPR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__RIGHT_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.COMPARISON_EXPRESSION__RIGHT_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0(), semanticObject.getLeftExpr());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0(), semanticObject.getRightExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftTerm=Factor_Factor_1_0 operator=FactorOperator rightTerm=Term)
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.FACTOR__LEFT_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.FACTOR__LEFT_TERM));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.FACTOR__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.FACTOR__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.FACTOR__RIGHT_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.FACTOR__RIGHT_TERM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0(), semanticObject.getLeftTerm());
		feeder.accept(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0(), semanticObject.getRightTerm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=ID parameters+=ID*)? body=Body)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanValue
	 */
	protected void sequence_LiteralBoolean(EObject context, LiteralBoolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LITERAL_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LITERAL_BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_LiteralNumber(EObject context, LiteralNumber semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LITERAL_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LITERAL_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=BinaryLogicalOperator leftExpr=Expression rightExpr=Expression)
	 */
	protected void sequence_LogicalBinaryExpression(EObject context, LogicalBinaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__LEFT_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__LEFT_EXPR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__RIGHT_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LOGICAL_BINARY_EXPRESSION__RIGHT_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0(), semanticObject.getLeftExpr());
		feeder.accept(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0(), semanticObject.getRightExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryLogicalOperator expression=Expression)
	 */
	protected void sequence_LogicalUnaryExpression(EObject context, LogicalUnaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LOGICAL_UNARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LOGICAL_UNARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LOGICAL_UNARY_EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LOGICAL_UNARY_EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftFactor=NumericExpression_NumericExpression_1_0 operator=AdditionOperator rightFactor=Factor)
	 */
	protected void sequence_NumericExpression(EObject context, NumericExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__LEFT_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__LEFT_FACTOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__RIGHT_FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__RIGHT_FACTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0(), semanticObject.getLeftFactor());
		feeder.accept(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0(), semanticObject.getRightFactor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression expressions+=Expression*)
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_SymbolReference(EObject context, SymbolReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.SYMBOL_REFERENCE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.SYMBOL_REFERENCE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator=TernaryOperator firstExpression=Expression secondExpression=Expression thirdExpression=Expression)
	 */
	protected void sequence_TernaryExpression(EObject context, TernaryExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__FIRST_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__FIRST_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__SECOND_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__SECOND_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__THIRD_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.TERNARY_EXPRESSION__THIRD_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0(), semanticObject.getFirstExpression());
		feeder.accept(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0(), semanticObject.getSecondExpression());
		feeder.accept(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0(), semanticObject.getThirdExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID expression=Expression)
	 */
	protected void sequence_VariableAssignment(EObject context, VariableAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.VARIABLE_ASSIGNMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.VARIABLE_ASSIGNMENT__ID));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.VARIABLE_ASSIGNMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
