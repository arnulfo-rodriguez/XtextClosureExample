/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.ExprTail;
import org.arz.miniScript.Factor;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumericExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getExprTail <em>Expr Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericExpressionImpl extends ExpressionImpl implements NumericExpression
{
  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected Factor factor;

  /**
   * The cached value of the '{@link #getExprTail() <em>Expr Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprTail()
   * @generated
   * @ordered
   */
  protected ExprTail exprTail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumericExpressionImpl()
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
    return MiniScriptPackage.Literals.NUMERIC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactor(Factor newFactor, NotificationChain msgs)
  {
    Factor oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR, oldFactor, newFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(Factor newFactor)
  {
    if (newFactor != factor)
    {
      NotificationChain msgs = null;
      if (factor != null)
        msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR, null, msgs);
      if (newFactor != null)
        msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR, null, msgs);
      msgs = basicSetFactor(newFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR, newFactor, newFactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprTail getExprTail()
  {
    return exprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprTail(ExprTail newExprTail, NotificationChain msgs)
  {
    ExprTail oldExprTail = exprTail;
    exprTail = newExprTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL, oldExprTail, newExprTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprTail(ExprTail newExprTail)
  {
    if (newExprTail != exprTail)
    {
      NotificationChain msgs = null;
      if (exprTail != null)
        msgs = ((InternalEObject)exprTail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL, null, msgs);
      if (newExprTail != null)
        msgs = ((InternalEObject)newExprTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL, null, msgs);
      msgs = basicSetExprTail(newExprTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL, newExprTail, newExprTail));
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR:
        return basicSetFactor(null, msgs);
      case MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL:
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR:
        return getFactor();
      case MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL:
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR:
        setFactor((Factor)newValue);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL:
        setExprTail((ExprTail)newValue);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR:
        setFactor((Factor)null);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL:
        setExprTail((ExprTail)null);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__FACTOR:
        return factor != null;
      case MiniScriptPackage.NUMERIC_EXPRESSION__EXPR_TAIL:
        return exprTail != null;
    }
    return super.eIsSet(featureID);
  }

} //NumericExpressionImpl
