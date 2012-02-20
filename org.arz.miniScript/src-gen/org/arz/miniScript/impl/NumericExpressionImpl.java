/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.NumExprTail;
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
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getNumExprTail <em>Num Expr Tail</em>}</li>
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
  protected Expression factor;

  /**
   * The cached value of the '{@link #getNumExprTail() <em>Num Expr Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumExprTail()
   * @generated
   * @ordered
   */
  protected NumExprTail numExprTail;

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
  public void setFactor(Expression newFactor)
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
  public NumExprTail getNumExprTail()
  {
    return numExprTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumExprTail(NumExprTail newNumExprTail, NotificationChain msgs)
  {
    NumExprTail oldNumExprTail = numExprTail;
    numExprTail = newNumExprTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL, oldNumExprTail, newNumExprTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumExprTail(NumExprTail newNumExprTail)
  {
    if (newNumExprTail != numExprTail)
    {
      NotificationChain msgs = null;
      if (numExprTail != null)
        msgs = ((InternalEObject)numExprTail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL, null, msgs);
      if (newNumExprTail != null)
        msgs = ((InternalEObject)newNumExprTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL, null, msgs);
      msgs = basicSetNumExprTail(newNumExprTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL, newNumExprTail, newNumExprTail));
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL:
        return basicSetNumExprTail(null, msgs);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL:
        return getNumExprTail();
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
        setFactor((Expression)newValue);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL:
        setNumExprTail((NumExprTail)newValue);
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
        setFactor((Expression)null);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL:
        setNumExprTail((NumExprTail)null);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__NUM_EXPR_TAIL:
        return numExprTail != null;
    }
    return super.eIsSet(featureID);
  }

} //NumericExpressionImpl
