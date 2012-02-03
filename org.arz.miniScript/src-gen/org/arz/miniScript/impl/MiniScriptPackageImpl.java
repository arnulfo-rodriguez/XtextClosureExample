/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Apply;
import org.arz.miniScript.ApplyFunctionAlpha;
import org.arz.miniScript.ApplyTail;
import org.arz.miniScript.Body;
import org.arz.miniScript.BodyTail;
import org.arz.miniScript.ExprTail;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorTail;
import org.arz.miniScript.FunctionArguments;
import org.arz.miniScript.FunctionArgumentsTail;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.FunctionParameters;
import org.arz.miniScript.FunctionParametersTail;
import org.arz.miniScript.Functor;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.MiniScriptFactory;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.Model;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.ParenthesisExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.ProgramTail;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.Term;
import org.arz.miniScript.VariableAssignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniScriptPackageImpl extends EPackageImpl implements MiniScriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass programTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionParametersTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionArgumentsTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass factorTailEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesisExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applyFunctionAlphaEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.arz.miniScript.MiniScriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MiniScriptPackageImpl()
  {
    super(eNS_URI, MiniScriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MiniScriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MiniScriptPackage init()
  {
    if (isInited) return (MiniScriptPackage)EPackage.Registry.INSTANCE.getEPackage(MiniScriptPackage.eNS_URI);

    // Obtain or create and register package
    MiniScriptPackageImpl theMiniScriptPackage = (MiniScriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MiniScriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MiniScriptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMiniScriptPackage.createPackageContents();

    // Initialize created meta-data
    theMiniScriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMiniScriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MiniScriptPackage.eNS_URI, theMiniScriptPackage);
    return theMiniScriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgram()
  {
    return programEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Expressions()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgram_Tail()
  {
    return (EReference)programEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProgramTail()
  {
    return programTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgramTail_Expression()
  {
    return (EReference)programTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProgramTail_Tail()
  {
    return (EReference)programTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDeclaration()
  {
    return functionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Parameters()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Body()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBody()
  {
    return bodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Expression()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Expressions()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBody_Tail()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyTail()
  {
    return bodyTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyTail_Expression()
  {
    return (EReference)bodyTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyTail_Tail()
  {
    return (EReference)bodyTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionParameters()
  {
    return functionParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParameters_Parameter()
  {
    return (EAttribute)functionParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionParameters_NextParameters()
  {
    return (EReference)functionParametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionParametersTail()
  {
    return functionParametersTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionParametersTail_Parameter()
  {
    return (EAttribute)functionParametersTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionParametersTail_NextParameters()
  {
    return (EReference)functionParametersTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApply()
  {
    return applyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApply_Functor()
  {
    return (EReference)applyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApply_Arguments()
  {
    return (EReference)applyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctor()
  {
    return functorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyTail()
  {
    return applyTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionArguments()
  {
    return functionArgumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionArguments_Argument()
  {
    return (EReference)functionArgumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionArguments_NextArguments()
  {
    return (EReference)functionArgumentsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionArgumentsTail()
  {
    return functionArgumentsTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionArgumentsTail_Argument()
  {
    return (EReference)functionArgumentsTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionArgumentsTail_NextArguments()
  {
    return (EReference)functionArgumentsTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExpr()
  {
    return literalExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralExpr_Value()
  {
    return (EAttribute)literalExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolReference()
  {
    return symbolReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbolReference_Id()
  {
    return (EAttribute)symbolReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericExpression()
  {
    return numericExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_Factor()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_ExprTail()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprTail()
  {
    return exprTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprTail_Factor()
  {
    return (EReference)exprTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprTail_ExprTail()
  {
    return (EReference)exprTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactor()
  {
    return factorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_Term()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_FactorTail()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFactorTail()
  {
    return factorTailEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorTail_Term()
  {
    return (EReference)factorTailEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactorTail_FactorTail()
  {
    return (EReference)factorTailEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAssignment()
  {
    return variableAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableAssignment_Id()
  {
    return (EAttribute)variableAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Expression()
  {
    return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesisExpression()
  {
    return parenthesisExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplyFunctionAlpha()
  {
    return applyFunctionAlphaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyFunctionAlpha_Args()
  {
    return (EReference)applyFunctionAlphaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApplyFunctionAlpha_NextCall()
  {
    return (EReference)applyFunctionAlphaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniScriptFactory getMiniScriptFactory()
  {
    return (MiniScriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);

    programEClass = createEClass(PROGRAM);
    createEReference(programEClass, PROGRAM__EXPRESSIONS);
    createEReference(programEClass, PROGRAM__TAIL);

    programTailEClass = createEClass(PROGRAM_TAIL);
    createEReference(programTailEClass, PROGRAM_TAIL__EXPRESSION);
    createEReference(programTailEClass, PROGRAM_TAIL__TAIL);

    expressionEClass = createEClass(EXPRESSION);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__PARAMETERS);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__BODY);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__EXPRESSION);
    createEReference(bodyEClass, BODY__EXPRESSIONS);
    createEReference(bodyEClass, BODY__TAIL);

    bodyTailEClass = createEClass(BODY_TAIL);
    createEReference(bodyTailEClass, BODY_TAIL__EXPRESSION);
    createEReference(bodyTailEClass, BODY_TAIL__TAIL);

    functionParametersEClass = createEClass(FUNCTION_PARAMETERS);
    createEAttribute(functionParametersEClass, FUNCTION_PARAMETERS__PARAMETER);
    createEReference(functionParametersEClass, FUNCTION_PARAMETERS__NEXT_PARAMETERS);

    functionParametersTailEClass = createEClass(FUNCTION_PARAMETERS_TAIL);
    createEAttribute(functionParametersTailEClass, FUNCTION_PARAMETERS_TAIL__PARAMETER);
    createEReference(functionParametersTailEClass, FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS);

    applyEClass = createEClass(APPLY);
    createEReference(applyEClass, APPLY__FUNCTOR);
    createEReference(applyEClass, APPLY__ARGUMENTS);

    functorEClass = createEClass(FUNCTOR);

    applyTailEClass = createEClass(APPLY_TAIL);

    functionArgumentsEClass = createEClass(FUNCTION_ARGUMENTS);
    createEReference(functionArgumentsEClass, FUNCTION_ARGUMENTS__ARGUMENT);
    createEReference(functionArgumentsEClass, FUNCTION_ARGUMENTS__NEXT_ARGUMENTS);

    functionArgumentsTailEClass = createEClass(FUNCTION_ARGUMENTS_TAIL);
    createEReference(functionArgumentsTailEClass, FUNCTION_ARGUMENTS_TAIL__ARGUMENT);
    createEReference(functionArgumentsTailEClass, FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS);

    literalExprEClass = createEClass(LITERAL_EXPR);
    createEAttribute(literalExprEClass, LITERAL_EXPR__VALUE);

    symbolReferenceEClass = createEClass(SYMBOL_REFERENCE);
    createEAttribute(symbolReferenceEClass, SYMBOL_REFERENCE__ID);

    numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__FACTOR);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__EXPR_TAIL);

    exprTailEClass = createEClass(EXPR_TAIL);
    createEReference(exprTailEClass, EXPR_TAIL__FACTOR);
    createEReference(exprTailEClass, EXPR_TAIL__EXPR_TAIL);

    factorEClass = createEClass(FACTOR);
    createEReference(factorEClass, FACTOR__TERM);
    createEReference(factorEClass, FACTOR__FACTOR_TAIL);

    factorTailEClass = createEClass(FACTOR_TAIL);
    createEReference(factorTailEClass, FACTOR_TAIL__TERM);
    createEReference(factorTailEClass, FACTOR_TAIL__FACTOR_TAIL);

    termEClass = createEClass(TERM);

    variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
    createEAttribute(variableAssignmentEClass, VARIABLE_ASSIGNMENT__ID);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);

    parenthesisExpressionEClass = createEClass(PARENTHESIS_EXPRESSION);

    applyFunctionAlphaEClass = createEClass(APPLY_FUNCTION_ALPHA);
    createEReference(applyFunctionAlphaEClass, APPLY_FUNCTION_ALPHA__ARGS);
    createEReference(applyFunctionAlphaEClass, APPLY_FUNCTION_ALPHA__NEXT_CALL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    programEClass.getESuperTypes().add(this.getModel());
    expressionEClass.getESuperTypes().add(this.getParenthesisExpression());
    functionDeclarationEClass.getESuperTypes().add(this.getExpression());
    applyEClass.getESuperTypes().add(this.getTerm());
    literalExprEClass.getESuperTypes().add(this.getTerm());
    symbolReferenceEClass.getESuperTypes().add(this.getFunctor());
    numericExpressionEClass.getESuperTypes().add(this.getExpression());
    variableAssignmentEClass.getESuperTypes().add(this.getExpression());
    parenthesisExpressionEClass.getESuperTypes().add(this.getFunctor());
    applyFunctionAlphaEClass.getESuperTypes().add(this.getApplyTail());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgram_Tail(), this.getProgramTail(), null, "tail", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(programTailEClass, ProgramTail.class, "ProgramTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgramTail_Expression(), this.getExpression(), null, "expression", null, 0, 1, ProgramTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProgramTail_Tail(), this.getProgramTail(), null, "tail", null, 0, 1, ProgramTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDeclaration_Parameters(), this.getFunctionParameters(), null, "parameters", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDeclaration_Body(), this.getBody(), null, "body", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Expression(), this.getExpression(), null, "expression", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Expressions(), this.getExpression(), null, "expressions", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBody_Tail(), this.getBodyTail(), null, "tail", null, 0, 1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyTailEClass, BodyTail.class, "BodyTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyTail_Expression(), this.getExpression(), null, "expression", null, 0, 1, BodyTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBodyTail_Tail(), this.getBodyTail(), null, "tail", null, 0, 1, BodyTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionParametersEClass, FunctionParameters.class, "FunctionParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionParameters_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, FunctionParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionParameters_NextParameters(), this.getFunctionParametersTail(), null, "nextParameters", null, 0, 1, FunctionParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionParametersTailEClass, FunctionParametersTail.class, "FunctionParametersTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionParametersTail_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, FunctionParametersTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionParametersTail_NextParameters(), this.getFunctionParametersTail(), null, "nextParameters", null, 0, 1, FunctionParametersTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applyEClass, Apply.class, "Apply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApply_Functor(), this.getFunctor(), null, "functor", null, 0, 1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApply_Arguments(), this.getApplyTail(), null, "arguments", null, 0, 1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functorEClass, Functor.class, "Functor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applyTailEClass, ApplyTail.class, "ApplyTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionArgumentsEClass, FunctionArguments.class, "FunctionArguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionArguments_Argument(), this.getExpression(), null, "argument", null, 0, 1, FunctionArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionArguments_NextArguments(), this.getFunctionArgumentsTail(), null, "nextArguments", null, 0, 1, FunctionArguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionArgumentsTailEClass, FunctionArgumentsTail.class, "FunctionArgumentsTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionArgumentsTail_Argument(), this.getExpression(), null, "argument", null, 0, 1, FunctionArgumentsTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionArgumentsTail_NextArguments(), this.getFunctionArgumentsTail(), null, "nextArguments", null, 0, 1, FunctionArgumentsTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExprEClass, LiteralExpr.class, "LiteralExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralExpr_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolReferenceEClass, SymbolReference.class, "SymbolReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbolReference_Id(), ecorePackage.getEString(), "id", null, 0, 1, SymbolReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericExpression_Factor(), this.getFactor(), null, "factor", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericExpression_ExprTail(), this.getExprTail(), null, "exprTail", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprTailEClass, ExprTail.class, "ExprTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExprTail_Factor(), this.getFactor(), null, "factor", null, 0, 1, ExprTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprTail_ExprTail(), this.getExprTail(), null, "exprTail", null, 0, 1, ExprTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactor_Term(), this.getTerm(), null, "term", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactor_FactorTail(), this.getFactorTail(), null, "factorTail", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorTailEClass, FactorTail.class, "FactorTail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactorTail_Term(), this.getTerm(), null, "term", null, 0, 1, FactorTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactorTail_FactorTail(), this.getFactorTail(), null, "factorTail", null, 0, 1, FactorTail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableAssignment_Id(), ecorePackage.getEString(), "id", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesisExpressionEClass, ParenthesisExpression.class, "ParenthesisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(applyFunctionAlphaEClass, ApplyFunctionAlpha.class, "ApplyFunctionAlpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplyFunctionAlpha_Args(), this.getFunctionArguments(), null, "args", null, 0, 1, ApplyFunctionAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplyFunctionAlpha_NextCall(), this.getApplyTail(), null, "nextCall", null, 0, 1, ApplyFunctionAlpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MiniScriptPackageImpl
