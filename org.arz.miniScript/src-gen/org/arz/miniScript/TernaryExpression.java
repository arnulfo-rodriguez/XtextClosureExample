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
 *   <li>{@link org.arz.miniScript.TernaryExpression#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getSecondExpression <em>Second Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.TernaryExpression#getThirdExpression <em>Third Expression</em>}</li>
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
   * Returns the value of the '<em><b>First Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Expression</em>' containment reference.
   * @see #setFirstExpression(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_FirstExpression()
   * @model containment="true"
   * @generated
   */
  Expression getFirstExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getFirstExpression <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Expression</em>' containment reference.
   * @see #getFirstExpression()
   * @generated
   */
  void setFirstExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Second Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Second Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Expression</em>' containment reference.
   * @see #setSecondExpression(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_SecondExpression()
   * @model containment="true"
   * @generated
   */
  Expression getSecondExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getSecondExpression <em>Second Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Expression</em>' containment reference.
   * @see #getSecondExpression()
   * @generated
   */
  void setSecondExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Third Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Third Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Third Expression</em>' containment reference.
   * @see #setThirdExpression(Expression)
   * @see org.arz.miniScript.MiniScriptPackage#getTernaryExpression_ThirdExpression()
   * @model containment="true"
   * @generated
   */
  Expression getThirdExpression();

  /**
   * Sets the value of the '{@link org.arz.miniScript.TernaryExpression#getThirdExpression <em>Third Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Third Expression</em>' containment reference.
   * @see #getThirdExpression()
   * @generated
   */
  void setThirdExpression(Expression value);

} // TernaryExpression
