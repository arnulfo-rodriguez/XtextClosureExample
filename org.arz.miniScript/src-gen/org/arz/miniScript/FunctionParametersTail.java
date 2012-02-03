/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameters Tail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.FunctionParametersTail#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.arz.miniScript.FunctionParametersTail#getNextParameters <em>Next Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getFunctionParametersTail()
 * @model
 * @generated
 */
public interface FunctionParametersTail extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionParametersTail_Parameter()
   * @model
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FunctionParametersTail#getParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #getParameter()
   * @generated
   */
  void setParameter(String value);

  /**
   * Returns the value of the '<em><b>Next Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next Parameters</em>' containment reference.
   * @see #setNextParameters(FunctionParametersTail)
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionParametersTail_NextParameters()
   * @model containment="true"
   * @generated
   */
  FunctionParametersTail getNextParameters();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FunctionParametersTail#getNextParameters <em>Next Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next Parameters</em>' containment reference.
   * @see #getNextParameters()
   * @generated
   */
  void setNextParameters(FunctionParametersTail value);

} // FunctionParametersTail
