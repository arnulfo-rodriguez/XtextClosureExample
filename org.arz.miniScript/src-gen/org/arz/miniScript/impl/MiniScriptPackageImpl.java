/**
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.AdditionOperator;
import org.arz.miniScript.Apply;
import org.arz.miniScript.BinaryLogicalOperator;
import org.arz.miniScript.Body;
import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.ComparisonOperator;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorOperator;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LiteralExpr;
import org.arz.miniScript.LogicalBinaryExpression;
import org.arz.miniScript.LogicalUnaryExpression;
import org.arz.miniScript.MiniScriptFactory;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.Model;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.UnaryLogicalOperator;
import org.arz.miniScript.VariableAssignment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalUnaryExpressionEClass = null;

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
  private EClass symbolReferenceEClass = null;

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
  private EClass variableAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalBinaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonExpressionEClass = null;

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
  private EClass factorEClass = null;

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
  private EEnum additionOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum factorOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum comparisonOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryLogicalOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryLogicalOperatorEEnum = null;

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
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalUnaryExpression()
  {
    return logicalUnaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicalUnaryExpression_Operator()
  {
    return (EAttribute)logicalUnaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalUnaryExpression_Expression()
  {
    return (EReference)logicalUnaryExpressionEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getFunctionDeclaration_Parameters()
  {
    return (EAttribute)functionDeclarationEClass.getEStructuralFeatures().get(0);
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
  public EReference getBody_Expressions()
  {
    return (EReference)bodyEClass.getEStructuralFeatures().get(0);
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
  public EClass getLogicalBinaryExpression()
  {
    return logicalBinaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalBinaryExpression_LeftExpr()
  {
    return (EReference)logicalBinaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicalBinaryExpression_Operator()
  {
    return (EAttribute)logicalBinaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalBinaryExpression_RightExpr()
  {
    return (EReference)logicalBinaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparisonExpression()
  {
    return comparisonExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpression_LeftExpr()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparisonExpression_Operator()
  {
    return (EAttribute)comparisonExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparisonExpression_RightExpr()
  {
    return (EReference)comparisonExpressionEClass.getEStructuralFeatures().get(2);
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
  public EReference getNumericExpression_LeftFactor()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericExpression_Operator()
  {
    return (EAttribute)numericExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericExpression_RightFactor()
  {
    return (EReference)numericExpressionEClass.getEStructuralFeatures().get(2);
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
  public EReference getFactor_LeftTerm()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFactor_Operator()
  {
    return (EAttribute)factorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFactor_RightTerm()
  {
    return (EReference)factorEClass.getEStructuralFeatures().get(2);
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
  public EEnum getAdditionOperator()
  {
    return additionOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFactorOperator()
  {
    return factorOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getComparisonOperator()
  {
    return comparisonOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryLogicalOperator()
  {
    return binaryLogicalOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryLogicalOperator()
  {
    return unaryLogicalOperatorEEnum;
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

    expressionEClass = createEClass(EXPRESSION);

    logicalUnaryExpressionEClass = createEClass(LOGICAL_UNARY_EXPRESSION);
    createEAttribute(logicalUnaryExpressionEClass, LOGICAL_UNARY_EXPRESSION__OPERATOR);
    createEReference(logicalUnaryExpressionEClass, LOGICAL_UNARY_EXPRESSION__EXPRESSION);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEAttribute(functionDeclarationEClass, FUNCTION_DECLARATION__PARAMETERS);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__BODY);

    bodyEClass = createEClass(BODY);
    createEReference(bodyEClass, BODY__EXPRESSIONS);

    symbolReferenceEClass = createEClass(SYMBOL_REFERENCE);
    createEAttribute(symbolReferenceEClass, SYMBOL_REFERENCE__ID);

    literalExprEClass = createEClass(LITERAL_EXPR);
    createEAttribute(literalExprEClass, LITERAL_EXPR__VALUE);

    variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
    createEAttribute(variableAssignmentEClass, VARIABLE_ASSIGNMENT__ID);
    createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);

    logicalBinaryExpressionEClass = createEClass(LOGICAL_BINARY_EXPRESSION);
    createEReference(logicalBinaryExpressionEClass, LOGICAL_BINARY_EXPRESSION__LEFT_EXPR);
    createEAttribute(logicalBinaryExpressionEClass, LOGICAL_BINARY_EXPRESSION__OPERATOR);
    createEReference(logicalBinaryExpressionEClass, LOGICAL_BINARY_EXPRESSION__RIGHT_EXPR);

    comparisonExpressionEClass = createEClass(COMPARISON_EXPRESSION);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__LEFT_EXPR);
    createEAttribute(comparisonExpressionEClass, COMPARISON_EXPRESSION__OPERATOR);
    createEReference(comparisonExpressionEClass, COMPARISON_EXPRESSION__RIGHT_EXPR);

    numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__LEFT_FACTOR);
    createEAttribute(numericExpressionEClass, NUMERIC_EXPRESSION__OPERATOR);
    createEReference(numericExpressionEClass, NUMERIC_EXPRESSION__RIGHT_FACTOR);

    factorEClass = createEClass(FACTOR);
    createEReference(factorEClass, FACTOR__LEFT_TERM);
    createEAttribute(factorEClass, FACTOR__OPERATOR);
    createEReference(factorEClass, FACTOR__RIGHT_TERM);

    applyEClass = createEClass(APPLY);
    createEReference(applyEClass, APPLY__FUNCTOR);
    createEReference(applyEClass, APPLY__ARGUMENTS);

    // Create enums
    additionOperatorEEnum = createEEnum(ADDITION_OPERATOR);
    factorOperatorEEnum = createEEnum(FACTOR_OPERATOR);
    comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
    binaryLogicalOperatorEEnum = createEEnum(BINARY_LOGICAL_OPERATOR);
    unaryLogicalOperatorEEnum = createEEnum(UNARY_LOGICAL_OPERATOR);
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
    logicalUnaryExpressionEClass.getESuperTypes().add(this.getExpression());
    functionDeclarationEClass.getESuperTypes().add(this.getExpression());
    symbolReferenceEClass.getESuperTypes().add(this.getExpression());
    literalExprEClass.getESuperTypes().add(this.getExpression());
    variableAssignmentEClass.getESuperTypes().add(this.getExpression());
    logicalBinaryExpressionEClass.getESuperTypes().add(this.getExpression());
    comparisonExpressionEClass.getESuperTypes().add(this.getExpression());
    numericExpressionEClass.getESuperTypes().add(this.getExpression());
    factorEClass.getESuperTypes().add(this.getExpression());
    applyEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProgram_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalUnaryExpressionEClass, LogicalUnaryExpression.class, "LogicalUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogicalUnaryExpression_Operator(), this.getUnaryLogicalOperator(), "operator", null, 0, 1, LogicalUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalUnaryExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, LogicalUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDeclaration_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDeclaration_Body(), this.getBody(), null, "body", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyEClass, Body.class, "Body", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBody_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Body.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolReferenceEClass, SymbolReference.class, "SymbolReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbolReference_Id(), ecorePackage.getEString(), "id", null, 0, 1, SymbolReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExprEClass, LiteralExpr.class, "LiteralExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralExpr_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LiteralExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableAssignment_Id(), ecorePackage.getEString(), "id", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalBinaryExpressionEClass, LogicalBinaryExpression.class, "LogicalBinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalBinaryExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, LogicalBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicalBinaryExpression_Operator(), this.getBinaryLogicalOperator(), "operator", null, 0, 1, LogicalBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalBinaryExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, LogicalBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonExpressionEClass, ComparisonExpression.class, "ComparisonExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparisonExpression_LeftExpr(), this.getExpression(), null, "leftExpr", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparisonExpression_Operator(), this.getComparisonOperator(), "operator", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparisonExpression_RightExpr(), this.getExpression(), null, "rightExpr", null, 0, 1, ComparisonExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericExpression_LeftFactor(), this.getExpression(), null, "leftFactor", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumericExpression_Operator(), this.getAdditionOperator(), "operator", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericExpression_RightFactor(), this.getExpression(), null, "rightFactor", null, 0, 1, NumericExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(factorEClass, Factor.class, "Factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFactor_LeftTerm(), this.getExpression(), null, "leftTerm", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFactor_Operator(), this.getFactorOperator(), "operator", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFactor_RightTerm(), this.getExpression(), null, "rightTerm", null, 0, 1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applyEClass, Apply.class, "Apply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApply_Functor(), this.getExpression(), null, "functor", null, 0, 1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApply_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, Apply.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(additionOperatorEEnum, AdditionOperator.class, "AdditionOperator");
    addEEnumLiteral(additionOperatorEEnum, AdditionOperator.ADD);
    addEEnumLiteral(additionOperatorEEnum, AdditionOperator.SUBTRACT);

    initEEnum(factorOperatorEEnum, FactorOperator.class, "FactorOperator");
    addEEnumLiteral(factorOperatorEEnum, FactorOperator.MULT);
    addEEnumLiteral(factorOperatorEEnum, FactorOperator.DIVISION);

    initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GT);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GTE);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LT);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LTE);
    addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQ);

    initEEnum(binaryLogicalOperatorEEnum, BinaryLogicalOperator.class, "BinaryLogicalOperator");
    addEEnumLiteral(binaryLogicalOperatorEEnum, BinaryLogicalOperator.AND);
    addEEnumLiteral(binaryLogicalOperatorEEnum, BinaryLogicalOperator.OR);

    initEEnum(unaryLogicalOperatorEEnum, UnaryLogicalOperator.class, "UnaryLogicalOperator");
    addEEnumLiteral(unaryLogicalOperatorEEnum, UnaryLogicalOperator.NOT);

    // Create resource
    createResource(eNS_URI);
  }

} //MiniScriptPackageImpl
