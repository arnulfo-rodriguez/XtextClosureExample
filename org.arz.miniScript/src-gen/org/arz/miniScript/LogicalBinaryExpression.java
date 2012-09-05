/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.LogicalBinaryExpression#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.arz.miniScript.LogicalBinaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.LogicalBinaryExpression#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getLogicalBinaryExpression()
 * @model
 * @generated
 */
public interface LogicalBinaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Expr</em>' containment reference.
   * @see #setLeftExpr(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getLogicalBinaryExpression_LeftExpr()
   * @model containment="true"
   * @generated
   */
  Expression getLeftExpr();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LogicalBinaryExpression#getLeftExpr <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Expr</em>' containment reference.
   * @see #getLeftExpr()
   * @generated
   */
  void setLeftExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.BinaryLogicalOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.BinaryLogicalOperator
   * @see #setOperator(BinaryLogicalOperator)
   * @see org.arz.miniScript.MiniScriptPackage#getLogicalBinaryExpression_Operator()
   * @model
   * @generated
   */
  BinaryLogicalOperator getOperator();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LogicalBinaryExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.BinaryLogicalOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(BinaryLogicalOperator value);

  /**
   * Returns the value of the '<em><b>Right Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Expr</em>' containment reference.
   * @see #setRightExpr(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getLogicalBinaryExpression_RightExpr()
   * @model containment="true"
   * @generated
   */
  Expression getRightExpr();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LogicalBinaryExpression#getRightExpr <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Expr</em>' containment reference.
   * @see #getRightExpr()
   * @generated
   */
  void setRightExpr(Expression value);

} // LogicalBinaryExpression
