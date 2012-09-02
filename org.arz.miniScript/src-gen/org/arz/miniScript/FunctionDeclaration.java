/**
 */
package org.arz.miniScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.FunctionDeclaration#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.arz.miniScript.FunctionDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Expression
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionDeclaration_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see org.arz.miniScript.MiniScriptPackage#getFunctionDeclaration_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link org.arz.miniScript.FunctionDeclaration#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

} // FunctionDeclaration
