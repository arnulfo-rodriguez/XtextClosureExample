/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Function Alpha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.ApplyFunctionAlpha#getArgs <em>Args</em>}</li>
 *   <li>{@link org.arz.miniScript.ApplyFunctionAlpha#getNextCall <em>Next Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getApplyFunctionAlpha()
 * @model
 * @generated
 */
public interface ApplyFunctionAlpha extends EObject
{
  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference.
   * @see #setArgs(FunctionArguments)
   * @see org.arz.miniScript.MiniScriptPackage#getApplyFunctionAlpha_Args()
   * @model containment="true"
   * @generated
   */
  FunctionArguments getArgs();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ApplyFunctionAlpha#getArgs <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' containment reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(FunctionArguments value);

  /**
   * Returns the value of the '<em><b>Next Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Call</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Call</em>' containment reference.
   * @see #setNextCall(ApplyFunctionAlpha)
   * @see org.arz.miniScript.MiniScriptPackage#getApplyFunctionAlpha_NextCall()
   * @model containment="true"
   * @generated
   */
  ApplyFunctionAlpha getNextCall();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ApplyFunctionAlpha#getNextCall <em>Next Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Call</em>' containment reference.
   * @see #getNextCall()
   * @generated
   */
  void setNextCall(ApplyFunctionAlpha value);

} // ApplyFunctionAlpha
