/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.Apply#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.arz.miniScript.Apply#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getApply()
 * @model
 * @generated
 */
public interface Apply extends Term
{
  /**
   * Returns the value of the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' containment reference.
   * @see #setFunctor(Functor)
   * @see org.arz.miniScript.MiniScriptPackage#getApply_Functor()
   * @model containment="true"
   * @generated
   */
  Functor getFunctor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Apply#getFunctor <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' containment reference.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(Functor value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(ApplyTail)
   * @see org.arz.miniScript.MiniScriptPackage#getApply_Arguments()
   * @model containment="true"
   * @generated
   */
  ApplyTail getArguments();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Apply#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(ApplyTail value);

} // Apply
