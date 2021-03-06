/**
 */
package org.arz.miniScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.arz.miniScript.LiteralBoolean#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.arz.miniScript.MiniScriptPackage#getLiteralBoolean()
 * @model
 * @generated
 */
public interface LiteralBoolean extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link org.arz.miniScript.BooleanValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see org.arz.miniScript.BooleanValue
   * @see #setValue(BooleanValue)
   * @see org.arz.miniScript.MiniScriptPackage#getLiteralBoolean_Value()
   * @model
   * @generated
   */
  BooleanValue getValue();

  /**
   * Sets the value of the '{@link org.arz.miniScript.LiteralBoolean#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see org.arz.miniScript.BooleanValue
   * @see #getValue()
   * @generated
   */
  void setValue(BooleanValue value);

} // LiteralBoolean
