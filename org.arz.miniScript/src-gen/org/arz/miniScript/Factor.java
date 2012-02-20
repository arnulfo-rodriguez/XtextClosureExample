/**
 * <copyright>
 * </copyright>
 *
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
 *   <li>{@link org.arz.miniScript.Factor#getTerm <em>Term</em>}</li>
 *   <li>{@link org.arz.miniScript.Factor#getFactorTail <em>Factor Tail</em>}</li>
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
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getFactor_Term()
   * @model containment="true"
   * @generated
   */
  Expression getTerm();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Factor#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Expression value);

  /**
   * Returns the value of the '<em><b>Factor Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor Tail</em>' containment reference.
   * @see #setFactorTail(FactorTail)
   * @see org.arz.miniScript.MiniScriptPackage#getFactor_FactorTail()
   * @model containment="true"
   * @generated
   */
  FactorTail getFactorTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Factor#getFactorTail <em>Factor Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Tail</em>' containment reference.
   * @see #getFactorTail()
   * @generated
   */
  void setFactorTail(FactorTail value);

} // Factor
