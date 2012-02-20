/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.ApplyTail#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.arz.miniScript.ApplyTail#getNextCall <em>Next Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getApplyTail()
 * @model
 * @generated
 */
public interface ApplyTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link org.arz.miniScript.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see org.arz.miniScript.MiniScriptPackage#getApplyTail_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArguments();

  /**
   * Returns the value of the '<em><b>Next Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Call</em>' containment reference.
   * @see #setNextCall(ApplyTail)
   * @see org.arz.miniScript.MiniScriptPackage#getApplyTail_NextCall()
   * @model containment="true"
   * @generated
   */
  ApplyTail getNextCall();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ApplyTail#getNextCall <em>Next Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Call</em>' containment reference.
   * @see #getNextCall()
   * @generated
   */
  void setNextCall(ApplyTail value);

} // ApplyTail
