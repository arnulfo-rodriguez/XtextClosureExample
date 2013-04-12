/**
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.arz.miniScript.MiniScriptPackage
 * @generated
 */
public interface MiniScriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MiniScriptFactory eINSTANCE = org.arz.miniScript.impl.MiniScriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  Program createProgram();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Block Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Expression</em>'.
   * @generated
   */
  BlockExpression createBlockExpression();

  /**
   * Returns a new object of class '<em>Let Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Let Expression</em>'.
   * @generated
   */
  LetExpression createLetExpression();

  /**
   * Returns a new object of class '<em>Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ternary Expression</em>'.
   * @generated
   */
  TernaryExpression createTernaryExpression();

  /**
   * Returns a new object of class '<em>Logical Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Binary Expression</em>'.
   * @generated
   */
  LogicalBinaryExpression createLogicalBinaryExpression();

  /**
   * Returns a new object of class '<em>Logical Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Unary Expression</em>'.
   * @generated
   */
  LogicalUnaryExpression createLogicalUnaryExpression();

  /**
   * Returns a new object of class '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Declaration</em>'.
   * @generated
   */
  FunctionDeclaration createFunctionDeclaration();

  /**
   * Returns a new object of class '<em>Symbol Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Reference</em>'.
   * @generated
   */
  SymbolReference createSymbolReference();

  /**
   * Returns a new object of class '<em>Literal Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Boolean</em>'.
   * @generated
   */
  LiteralBoolean createLiteralBoolean();

  /**
   * Returns a new object of class '<em>Literal Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Number</em>'.
   * @generated
   */
  LiteralNumber createLiteralNumber();

  /**
   * Returns a new object of class '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Assignment</em>'.
   * @generated
   */
  VariableAssignment createVariableAssignment();

  /**
   * Returns a new object of class '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Expression</em>'.
   * @generated
   */
  ComparisonExpression createComparisonExpression();

  /**
   * Returns a new object of class '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression</em>'.
   * @generated
   */
  NumericExpression createNumericExpression();

  /**
   * Returns a new object of class '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Factor</em>'.
   * @generated
   */
  Factor createFactor();

  /**
   * Returns a new object of class '<em>Apply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Apply</em>'.
   * @generated
   */
  Apply createApply();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MiniScriptPackage getMiniScriptPackage();

} //MiniScriptFactory
