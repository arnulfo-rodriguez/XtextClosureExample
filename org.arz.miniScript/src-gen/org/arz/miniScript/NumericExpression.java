/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.NumericExpression#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.NumericExpression#getExprTail <em>Expr Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression()
 * @model
 * @generated
 */
public interface NumericExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference.
   * @see #setFactor(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression_Factor()
   * @model containment="true"
   * @generated
   */
  Expression getFactor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.NumericExpression#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(Expression value);

  /**
   * Returns the value of the '<em><b>Expr Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Tail</em>' containment reference.
   * @see #setExprTail(NumExprTail)
   * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression_ExprTail()
   * @model containment="true"
   * @generated
   */
  NumExprTail getExprTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.NumericExpression#getExprTail <em>Expr Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Tail</em>' containment reference.
   * @see #getExprTail()
   * @generated
   */
  void setExprTail(NumExprTail value);

} // NumericExpression
