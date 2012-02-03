/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.ProgramTail#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.ProgramTail#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getProgramTail()
 * @model
 * @generated
 */
public interface ProgramTail extends EObject
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
   * @see org.arz.miniScript.MiniScriptPackage#getProgramTail_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ProgramTail#getExpression <em>Expression</em>}' containment reference.
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
   * @see #setTail(ProgramTail)
   * @see org.arz.miniScript.MiniScriptPackage#getProgramTail_Tail()
   * @model containment="true"
   * @generated
   */
  ProgramTail getTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.ProgramTail#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(ProgramTail value);

} // ProgramTail
