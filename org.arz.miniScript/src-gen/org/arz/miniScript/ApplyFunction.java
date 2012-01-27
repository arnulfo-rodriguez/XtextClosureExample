/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.ApplyFunction#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.arz.miniScript.ApplyFunction#getApp3 <em>App3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getApplyFunction()
 * @model
 * @generated
 */
public interface ApplyFunction extends Term
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
   * @see #setFunctor(SymbolReference)
   * @see org.arz.miniScript.MiniScriptPackage#getApplyFunction_Functor()
   * @model containment="true"
   * @generated
   */
  SymbolReference getFunctor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ApplyFunction#getFunctor <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' containment reference.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(SymbolReference value);

  /**
   * Returns the value of the '<em><b>App3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>App3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>App3</em>' containment reference.
   * @see #setApp3(ApplyFunctionAlpha)
   * @see org.arz.miniScript.MiniScriptPackage#getApplyFunction_App3()
   * @model containment="true"
   * @generated
   */
  ApplyFunctionAlpha getApp3();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ApplyFunction#getApp3 <em>App3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>App3</em>' containment reference.
   * @see #getApp3()
   * @generated
   */
  void setApp3(ApplyFunctionAlpha value);

} // ApplyFunction
