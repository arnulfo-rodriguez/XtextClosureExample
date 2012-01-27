/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.ExprTail#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.ExprTail#getExprTail <em>Expr Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getExprTail()
 * @model
 * @generated
 */
public interface ExprTail extends EObject
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
   * @see #setFactor(Factor)
   * @see org.arz.miniScript.MiniScriptPackage#getExprTail_Factor()
   * @model containment="true"
   * @generated
   */
  Factor getFactor();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ExprTail#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(Factor value);

  /**
   * Returns the value of the '<em><b>Expr Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr Tail</em>' containment reference.
   * @see #setExprTail(ExprTail)
   * @see org.arz.miniScript.MiniScriptPackage#getExprTail_ExprTail()
   * @model containment="true"
   * @generated
   */
  ExprTail getExprTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ExprTail#getExprTail <em>Expr Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr Tail</em>' containment reference.
   * @see #getExprTail()
   * @generated
   */
  void setExprTail(ExprTail value);

} // ExprTail
