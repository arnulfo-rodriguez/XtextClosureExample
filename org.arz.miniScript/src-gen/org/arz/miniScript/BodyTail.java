/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.BodyTail#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.BodyTail#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getBodyTail()
 * @model
 * @generated
 */
public interface BodyTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getBodyTail_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.BodyTail#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(BodyTail)
   * @see org.arz.miniScript.MiniScriptPackage#getBodyTail_Tail()
   * @model containment="true"
   * @generated
   */
  BodyTail getTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.BodyTail#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(BodyTail value);

} // BodyTail
