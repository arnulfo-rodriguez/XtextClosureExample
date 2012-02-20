package org.arz.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.arz.miniScript.Apply;
import org.arz.miniScript.ApplyTail;
import org.arz.miniScript.Body;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorTail;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumExprTail;
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
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractMiniScriptSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected MiniScriptGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MiniScriptPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MiniScriptPackage.APPLY:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Apply(context, (Apply) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.APPLY_TAIL:
				if(context == grammarAccess.getApplyTailRule()) {
					sequence_ApplyTail(context, (ApplyTail) semanticObject); 
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
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_Factor(context, (Factor) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FACTOR_TAIL:
				if(context == grammarAccess.getFactorTailRule()) {
					sequence_FactorTail(context, (FactorTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
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
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getLiteralExprRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LiteralExpr(context, (LiteralExpr) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.NUM_EXPR_TAIL:
				if(context == grammarAccess.getNumExprTailRule()) {
					sequence_NumExprTail(context, (NumExprTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.NUMERIC_EXPRESSION:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getApplyAccess().getApplyFunctorAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
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
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
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
				   context == grammarAccess.getFactorAccess().getFactorTermAction_1_0() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0() ||
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
	 *     ((arguments+=Expression arguments+=Expression*)? nextCall=ApplyTail?)
	 */
	protected void sequence_ApplyTail(EObject context, ApplyTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functor=Apply_Apply_1_0 arguments=ApplyTail)
	 */
	protected void sequence_Apply(EObject context, Apply semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.APPLY__FUNCTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.APPLY__FUNCTOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.APPLY__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.APPLY__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(), semanticObject.getFunctor());
		feeder.accept(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_1_0(), semanticObject.getArguments());
		feeder.finish();
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
	 *     ((operator='*' | operator='/') term=Term factorTail=FactorTail?)
	 */
	protected void sequence_FactorTail(EObject context, FactorTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term=Factor_Factor_1_0 factorTail=FactorTail)
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.FACTOR__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.FACTOR__TERM));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.FACTOR__FACTOR_TAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.FACTOR__FACTOR_TAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFactorAccess().getFactorTermAction_1_0(), semanticObject.getTerm());
		feeder.accept(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_1_0(), semanticObject.getFactorTail());
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
	 *     value=Num
	 */
	protected void sequence_LiteralExpr(EObject context, LiteralExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.LITERAL_EXPR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.LITERAL_EXPR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((operator='+' | operator='-') factor=Factor exprTail=NumExprTail?)
	 */
	protected void sequence_NumExprTail(EObject context, NumExprTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (factor=NumericExpression_NumericExpression_1_0 numExprTail=NumExprTail)
	 */
	protected void sequence_NumericExpression(EObject context, NumericExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__FACTOR));
			if(transientValues.isValueTransient(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__NUM_EXPR_TAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniScriptPackage.Literals.NUMERIC_EXPRESSION__NUM_EXPR_TAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0(), semanticObject.getFactor());
		feeder.accept(grammarAccess.getNumericExpressionAccess().getNumExprTailNumExprTailParserRuleCall_1_1_0(), semanticObject.getNumExprTail());
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
