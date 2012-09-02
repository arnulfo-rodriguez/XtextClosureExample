package org.arz.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.arz.miniScript.Apply;
import org.arz.miniScript.Body;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
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
			case MiniScriptPackage.FACTOR:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
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
			case MiniScriptPackage.LITERAL_EXPR:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLiteralExprRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LiteralExpr(context, (LiteralExpr) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.NUMERIC_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
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
			case MiniScriptPackage.VARIABLE_ASSIGNMENT:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
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
	 *     value=INT
	 */
	protected void sequence_LiteralExpr(EObject context, LiteralExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LITERAL_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LITERAL_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralExprAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
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
