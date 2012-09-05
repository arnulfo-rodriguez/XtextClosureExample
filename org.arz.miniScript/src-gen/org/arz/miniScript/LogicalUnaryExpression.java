/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.LogicalUnaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.LogicalUnaryExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getLogicalUnaryExpression()
 * @model
 * @generated
 */
public interface LogicalUnaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.UnaryLogicalOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.UnaryLogicalOperator
   * @see #setOperator(UnaryLogicalOperator)
   * @see org.arz.miniScript.MiniScriptPackage#getLogicalUnaryExpression_Operator()
   * @model
   * @generated
   */
  UnaryLogicalOperator getOperator();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LogicalUnaryExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.UnaryLogicalOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(UnaryLogicalOperator value);

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
   * @see org.arz.miniScript.MiniScriptPackage#getLogicalUnaryExpression_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LogicalUnaryExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // LogicalUnaryExpression
