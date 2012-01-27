/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.FactorTail#getTerm <em>Term</em>}</li>
 *   <li>{@link org.arz.miniScript.FactorTail#getFactorTail <em>Factor Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getFactorTail()
 * @model
 * @generated
 */
public interface FactorTail extends EObject
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
   * @see #setTerm(Term)
   * @see org.arz.miniScript.MiniScriptPackage#getFactorTail_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FactorTail#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

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
   * @see org.arz.miniScript.MiniScriptPackage#getFactorTail_FactorTail()
   * @model containment="true"
   * @generated
   */
  FactorTail getFactorTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FactorTail#getFactorTail <em>Factor Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor Tail</em>' containment reference.
   * @see #getFactorTail()
   * @generated
   */
  void setFactorTail(FactorTail value);

} // FactorTail
