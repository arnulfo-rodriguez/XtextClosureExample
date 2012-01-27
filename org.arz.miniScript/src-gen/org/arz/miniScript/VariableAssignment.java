/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.VariableAssignment#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.arz.miniScript.VariableAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' containment reference.
   * @see #setSymbol(SymbolReference)
   * @see org.arz.miniScript.MiniScriptPackage#getVariableAssignment_Symbol()
   * @model containment="true"
   * @generated
   */
  SymbolReference getSymbol();

  /**
   * Sets the value of the '{@link org.arz.miniScript.VariableAssignment#getSymbol <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' containment reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(SymbolReference value);

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
   * @see org.arz.miniScript.MiniScriptPackage#getVariableAssignment_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.VariableAssignment#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // VariableAssignment
