/**
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.AdditionOperator;
import org.arz.miniScript.Expression;
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
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getLeftFactor <em>Left Factor</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.NumericExpressionImpl#getRightFactor <em>Right Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumericExpressionImpl extends ExpressionImpl implements NumericExpression
{
  /**
   * The cached value of the '{@link #getLeftFactor() <em>Left Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftFactor()
   * @generated
   * @ordered
   */
  protected Expression leftFactor;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final AdditionOperator OPERATOR_EDEFAULT = AdditionOperator.ADD;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected AdditionOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightFactor() <em>Right Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightFactor()
   * @generated
   * @ordered
   */
  protected Expression rightFactor;

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
  public Expression getLeftFactor()
  {
    return leftFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftFactor(Expression newLeftFactor, NotificationChain msgs)
  {
    Expression oldLeftFactor = leftFactor;
    leftFactor = newLeftFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR, oldLeftFactor, newLeftFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftFactor(Expression newLeftFactor)
  {
    if (newLeftFactor != leftFactor)
    {
      NotificationChain msgs = null;
      if (leftFactor != null)
        msgs = ((InternalEObject)leftFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR, null, msgs);
      if (newLeftFactor != null)
        msgs = ((InternalEObject)newLeftFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR, null, msgs);
      msgs = basicSetLeftFactor(newLeftFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR, newLeftFactor, newLeftFactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(AdditionOperator newOperator)
  {
    AdditionOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightFactor()
  {
    return rightFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightFactor(Expression newRightFactor, NotificationChain msgs)
  {
    Expression oldRightFactor = rightFactor;
    rightFactor = newRightFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR, oldRightFactor, newRightFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightFactor(Expression newRightFactor)
  {
    if (newRightFactor != rightFactor)
    {
      NotificationChain msgs = null;
      if (rightFactor != null)
        msgs = ((InternalEObject)rightFactor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR, null, msgs);
      if (newRightFactor != null)
        msgs = ((InternalEObject)newRightFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR, null, msgs);
      msgs = basicSetRightFactor(newRightFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR, newRightFactor, newRightFactor));
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR:
        return basicSetLeftFactor(null, msgs);
      case MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR:
        return basicSetRightFactor(null, msgs);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR:
        return getLeftFactor();
      case MiniScriptPackage.NUMERIC_EXPRESSION__OPERATOR:
        return getOperator();
      case MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR:
        return getRightFactor();
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR:
        setLeftFactor((Expression)newValue);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__OPERATOR:
        setOperator((AdditionOperator)newValue);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR:
        setRightFactor((Expression)newValue);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR:
        setLeftFactor((Expression)null);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR:
        setRightFactor((Expression)null);
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
      case MiniScriptPackage.NUMERIC_EXPRESSION__LEFT_FACTOR:
        return leftFactor != null;
      case MiniScriptPackage.NUMERIC_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case MiniScriptPackage.NUMERIC_EXPRESSION__RIGHT_FACTOR:
        return rightFactor != null;
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

} //NumericExpressionImpl
