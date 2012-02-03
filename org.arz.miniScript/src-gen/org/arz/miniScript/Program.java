/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.Program#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.arz.miniScript.Program#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends Model
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.arz.miniScript.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.arz.miniScript.MiniScriptPackage#getProgram_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

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
   * @see org.arz.miniScript.MiniScriptPackage#getProgram_Tail()
   * @model containment="true"
   * @generated
   */
  ProgramTail getTail();

  /**
   * Sets the value of the '{@link org.arz.miniScript.Program#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(ProgramTail value);

} // Program
