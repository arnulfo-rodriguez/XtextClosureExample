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
 *   <li>{@link org.arz.miniScript.NumericExpression#getLeftFactor <em>Left Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.NumericExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.NumericExpression#getRightFactor <em>Right Factor</em>}</li>
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
   * Returns the value of the '<em><b>Left Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Factor</em>' containment reference.
   * @see #setLeftFactor(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression_LeftFactor()
   * @model containment="true"
   * @generated
   */
  Expression getLeftFactor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.NumericExpression#getLeftFactor <em>Left Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Factor</em>' containment reference.
   * @see #getLeftFactor()
   * @generated
   */
  void setLeftFactor(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.AdditionOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.AdditionOperator
   * @see #setOperator(AdditionOperator)
   * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression_Operator()
   * @model
   * @generated
   */
  AdditionOperator getOperator();

  /**
   * Sets the value of the '{@link org.arz.miniScript.NumericExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.AdditionOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(AdditionOperator value);

  /**
   * Returns the value of the '<em><b>Right Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Factor</em>' containment reference.
   * @see #setRightFactor(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getNumericExpression_RightFactor()
   * @model containment="true"
   * @generated
   */
  Expression getRightFactor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.NumericExpression#getRightFactor <em>Right Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Factor</em>' containment reference.
   * @see #getRightFactor()
   * @generated
   */
  void setRightFactor(Expression value);

} // NumericExpression
