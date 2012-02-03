package org.arz.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.arz.miniScript.Apply;
import org.arz.miniScript.ApplyFunctionAlpha;
import org.arz.miniScript.Body;
import org.arz.miniScript.BodyTail;
import org.arz.miniScript.ExprTail;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorTail;
import org.arz.miniScript.FunctionArguments;
import org.arz.miniScript.FunctionArgumentsTail;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.FunctionParameters;
import org.arz.miniScript.FunctionParametersTail;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.ProgramTail;
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
				   context == grammarAccess.getTermRule()) {
					sequence_Apply(context, (Apply) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.APPLY_FUNCTION_ALPHA:
				if(context == grammarAccess.getApplyTailRule()) {
					sequence_ApplyTail(context, (ApplyFunctionAlpha) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.BODY:
				if(context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.BODY_TAIL:
				if(context == grammarAccess.getBodyTailRule()) {
					sequence_BodyTail(context, (BodyTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.EXPR_TAIL:
				if(context == grammarAccess.getExprTailRule()) {
					sequence_ExprTail(context, (ExprTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FACTOR:
				if(context == grammarAccess.getFactorRule()) {
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
			case MiniScriptPackage.FUNCTION_ARGUMENTS:
				if(context == grammarAccess.getFunctionArgumentsRule()) {
					sequence_FunctionArguments(context, (FunctionArguments) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL:
				if(context == grammarAccess.getFunctionArgumentsTailRule()) {
					sequence_FunctionArgumentsTail(context, (FunctionArgumentsTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getParenthesisExpressionRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_PARAMETERS:
				if(context == grammarAccess.getFunctionParametersRule()) {
					sequence_FunctionParameters(context, (FunctionParameters) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL:
				if(context == grammarAccess.getFunctionParametersTailRule()) {
					sequence_FunctionParametersTail(context, (FunctionParametersTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.LITERAL_EXPR:
				if(context == grammarAccess.getLiteralExprRule() ||
				   context == grammarAccess.getTermRule()) {
					sequence_LiteralExpr(context, (LiteralExpr) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.NUMERIC_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getNumericExpressionRule() ||
				   context == grammarAccess.getParenthesisExpressionRule()) {
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
			case MiniScriptPackage.PROGRAM_TAIL:
				if(context == grammarAccess.getProgramTailRule()) {
					sequence_ProgramTail(context, (ProgramTail) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.SYMBOL_REFERENCE:
				if(context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getSymbolReferenceRule()) {
					sequence_SymbolReference(context, (SymbolReference) semanticObject); 
					return; 
				}
				else break;
			case MiniScriptPackage.VARIABLE_ASSIGNMENT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctorRule() ||
				   context == grammarAccess.getParenthesisExpressionRule() ||
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
	 *     (args=FunctionArguments? nextCall=ApplyTail?)
	 */
	protected void sequence_ApplyTail(EObject context, ApplyFunctionAlpha semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functor=Functor arguments=ApplyTail?)
	 */
	protected void sequence_Apply(EObject context, Apply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression tail=BodyTail?)
	 */
	protected void sequence_BodyTail(EObject context, BodyTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression | (expressions=Expression tail=BodyTail?))
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((factor=Factor exprTail=ExprTail?) | (factor=Factor exprTail=ExprTail?))
	 */
	protected void sequence_ExprTail(EObject context, ExprTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((term=Term factorTail=FactorTail?) | (term=Term factorTail=FactorTail?))
	 */
	protected void sequence_FactorTail(EObject context, FactorTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term=Term factorTail=FactorTail?)
	 */
	protected void sequence_Factor(EObject context, Factor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (argument=Expression nextArguments=FunctionArgumentsTail?)
	 */
	protected void sequence_FunctionArgumentsTail(EObject context, FunctionArgumentsTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (argument=Expression nextArguments=FunctionArgumentsTail?)
	 */
	protected void sequence_FunctionArguments(EObject context, FunctionArguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameters=FunctionParameters? body=Body)
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ID nextParameters=FunctionParametersTail?)
	 */
	protected void sequence_FunctionParametersTail(EObject context, FunctionParametersTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ID nextParameters=FunctionParametersTail?)
	 */
	protected void sequence_FunctionParameters(EObject context, FunctionParameters semanticObject) {
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
	 *     (factor=Factor exprTail=ExprTail?)
	 */
	protected void sequence_NumericExpression(EObject context, NumericExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression tail=ProgramTail?)
	 */
	protected void sequence_ProgramTail(EObject context, ProgramTail semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression tail=ProgramTail?)
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
