/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumExprTail;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Num Expr Tail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.NumExprTailImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.NumExprTailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.NumExprTailImpl#getExprTail <em>Expr Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumExprTailImpl extends MinimalEObjectImpl.Container implements NumExprTail
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected Expression factor;

  /**
   * The cached value of the '{@link #getExprTail() <em>Expr Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprTail()
   * @generated
   * @ordered
   */
  protected NumExprTail exprTail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumExprTailImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniScriptPackage.Literals.NUM_EXPR_TAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUM_EXPR_TAIL__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactor(Expression newFactor, NotificationChain msgs)
  {
    Expression oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUM_EXPR_TAIL__FACTOR, oldFactor, newFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(Expression newFactor)
  {
    if (newFactor != factor)
    {
      NotificationChain msgs = null;
      if (factor != null)
        msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUM_EXPR_TAIL__FACTOR, null, msgs);
      if (newFactor != null)
        msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUM_EXPR_TAIL__FACTOR, null, msgs);
      msgs = basicSetFactor(newFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUM_EXPR_TAIL__FACTOR, newFactor, newFactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumExprTail getExprTail()
  {
    return exprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprTail(NumExprTail newExprTail, NotificationChain msgs)
  {
    NumExprTail oldExprTail = exprTail;
    exprTail = newExprTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL, oldExprTail, newExprTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprTail(NumExprTail newExprTail)
  {
    if (newExprTail != exprTail)
    {
      NotificationChain msgs = null;
      if (exprTail != null)
        msgs = ((InternalEObject)exprTail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL, null, msgs);
      if (newExprTail != null)
        msgs = ((InternalEObject)newExprTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL, null, msgs);
      msgs = basicSetExprTail(newExprTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL, newExprTail, newExprTail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniScriptPackage.NUM_EXPR_TAIL__FACTOR:
        return basicSetFactor(null, msgs);
      case MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL:
        return basicSetExprTail(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniScriptPackage.NUM_EXPR_TAIL__OPERATOR:
        return getOperator();
      case MiniScriptPackage.NUM_EXPR_TAIL__FACTOR:
        return getFactor();
      case MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL:
        return getExprTail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniScriptPackage.NUM_EXPR_TAIL__OPERATOR:
        setOperator((String)newValue);
        return;
      case MiniScriptPackage.NUM_EXPR_TAIL__FACTOR:
        setFactor((Expression)newValue);
        return;
      case MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL:
        setExprTail((NumExprTail)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniScriptPackage.NUM_EXPR_TAIL__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MiniScriptPackage.NUM_EXPR_TAIL__FACTOR:
        setFactor((Expression)null);
        return;
      case MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL:
        setExprTail((NumExprTail)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniScriptPackage.NUM_EXPR_TAIL__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case MiniScriptPackage.NUM_EXPR_TAIL__FACTOR:
        return factor != null;
      case MiniScriptPackage.NUM_EXPR_TAIL__EXPR_TAIL:
        return exprTail != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //NumExprTailImpl
