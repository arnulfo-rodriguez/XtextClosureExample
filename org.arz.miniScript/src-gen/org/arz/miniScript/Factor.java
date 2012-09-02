/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.Factor#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link org.arz.miniScript.Factor#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.Factor#getRightTerm <em>Right Term</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getFactor()
 * @model
 * @generated
 */
public interface Factor extends Expression
{
  /**
   * Returns the value of the '<em><b>Left Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Term</em>' containment reference.
   * @see #setLeftTerm(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getFactor_LeftTerm()
   * @model containment="true"
   * @generated
   */
  Expression getLeftTerm();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Factor#getLeftTerm <em>Left Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Term</em>' containment reference.
   * @see #getLeftTerm()
   * @generated
   */
  void setLeftTerm(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.FactorOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.FactorOperator
   * @see #setOperator(FactorOperator)
   * @see org.arz.miniScript.MiniScriptPackage#getFactor_Operator()
   * @model
   * @generated
   */
  FactorOperator getOperator();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Factor#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.FactorOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(FactorOperator value);

  /**
   * Returns the value of the '<em><b>Right Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Term</em>' containment reference.
   * @see #setRightTerm(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getFactor_RightTerm()
   * @model containment="true"
   * @generated
   */
  Expression getRightTerm();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Factor#getRightTerm <em>Right Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Term</em>' containment reference.
   * @see #getRightTerm()
   * @generated
   */
  void setRightTerm(Expression value);

} // Factor
