/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Arguments Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.FunctionArgumentsTail#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.arz.miniScript.FunctionArgumentsTail#getNextArguments <em>Next Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getFunctionArgumentsTail()
 * @model
 * @generated
 */
public interface FunctionArgumentsTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionArgumentsTail_Argument()
   * @model containment="true"
   * @generated
   */
  Expression getArgument();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FunctionArgumentsTail#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(Expression value);

  /**
   * Returns the value of the '<em><b>Next Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Arguments</em>' containment reference.
   * @see #setNextArguments(FunctionArgumentsTail)
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionArgumentsTail_NextArguments()
   * @model containment="true"
   * @generated
   */
  FunctionArgumentsTail getNextArguments();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FunctionArgumentsTail#getNextArguments <em>Next Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Arguments</em>' containment reference.
   * @see #getNextArguments()
   * @generated
   */
  void setNextArguments(FunctionArgumentsTail value);

} // FunctionArgumentsTail
