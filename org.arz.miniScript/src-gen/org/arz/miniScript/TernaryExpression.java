/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getTrueExpr <em>True Expr</em>}</li>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getFalseExpr <em>False Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression()
 * @model
 * @generated
 */
public interface TernaryExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.TernaryOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.TernaryOperator
   * @see #setOperator(TernaryOperator)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_Operator()
   * @model
   * @generated
   */
  TernaryOperator getOperator();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see org.arz.miniScript.TernaryOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(TernaryOperator value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>True Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>True Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>True Expr</em>' containment reference.
   * @see #setTrueExpr(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_TrueExpr()
   * @model containment="true"
   * @generated
   */
  Expression getTrueExpr();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getTrueExpr <em>True Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>True Expr</em>' containment reference.
   * @see #getTrueExpr()
   * @generated
   */
  void setTrueExpr(Expression value);

  /**
   * Returns the value of the '<em><b>False Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>False Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>False Expr</em>' containment reference.
   * @see #setFalseExpr(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_FalseExpr()
   * @model containment="true"
   * @generated
   */
  Expression getFalseExpr();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getFalseExpr <em>False Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>False Expr</em>' containment reference.
   * @see #getFalseExpr()
   * @generated
   */
  void setFalseExpr(Expression value);

} // TernaryExpression
