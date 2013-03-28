/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.LetExpression#getAssigment <em>Assigment</em>}</li>
 *   <li>{@link org.arz.miniScript.LetExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getLetExpression()
 * @model
 * @generated
 */
public interface LetExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Assigment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigment</em>' containment reference.
   * @see #setAssigment(VariableAssignment)
   * @see org.arz.miniScript.MiniScriptPackage#getLetExpression_Assigment()
   * @model containment="true"
   * @generated
   */
  VariableAssignment getAssigment();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LetExpression#getAssigment <em>Assigment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assigment</em>' containment reference.
   * @see #getAssigment()
   * @generated
   */
  void setAssigment(VariableAssignment value);

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
   * @see org.arz.miniScript.MiniScriptPackage#getLetExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LetExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // LetExpression
