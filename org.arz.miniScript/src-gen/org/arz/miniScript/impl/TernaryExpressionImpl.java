/**
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.TernaryExpression;
import org.arz.miniScript.TernaryOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getFirstExpression <em>First Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getSecondExpression <em>Second Expression</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getThirdExpression <em>Third Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TernaryExpressionImpl extends ExpressionImpl implements TernaryExpression
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final TernaryOperator OPERATOR_EDEFAULT = TernaryOperator.IF_EXPRESSION;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected TernaryOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getFirstExpression() <em>First Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstExpression()
   * @generated
   * @ordered
   */
  protected Expression firstExpression;

  /**
   * The cached value of the '{@link #getSecondExpression() <em>Second Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondExpression()
   * @generated
   * @ordered
   */
  protected Expression secondExpression;

  /**
   * The cached value of the '{@link #getThirdExpression() <em>Third Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThirdExpression()
   * @generated
   * @ordered
   */
  protected Expression thirdExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TernaryExpressionImpl()
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
    return MiniScriptPackage.Literals.TERNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TernaryOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(TernaryOperator newOperator)
  {
    TernaryOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFirstExpression()
  {
    return firstExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstExpression(Expression newFirstExpression, NotificationChain msgs)
  {
    Expression oldFirstExpression = firstExpression;
    firstExpression = newFirstExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION, oldFirstExpression, newFirstExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstExpression(Expression newFirstExpression)
  {
    if (newFirstExpression != firstExpression)
    {
      NotificationChain msgs = null;
      if (firstExpression != null)
        msgs = ((InternalEObject)firstExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION, null, msgs);
      if (newFirstExpression != null)
        msgs = ((InternalEObject)newFirstExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION, null, msgs);
      msgs = basicSetFirstExpression(newFirstExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION, newFirstExpression, newFirstExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSecondExpression()
  {
    return secondExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondExpression(Expression newSecondExpression, NotificationChain msgs)
  {
    Expression oldSecondExpression = secondExpression;
    secondExpression = newSecondExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION, oldSecondExpression, newSecondExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondExpression(Expression newSecondExpression)
  {
    if (newSecondExpression != secondExpression)
    {
      NotificationChain msgs = null;
      if (secondExpression != null)
        msgs = ((InternalEObject)secondExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION, null, msgs);
      if (newSecondExpression != null)
        msgs = ((InternalEObject)newSecondExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION, null, msgs);
      msgs = basicSetSecondExpression(newSecondExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION, newSecondExpression, newSecondExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getThirdExpression()
  {
    return thirdExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThirdExpression(Expression newThirdExpression, NotificationChain msgs)
  {
    Expression oldThirdExpression = thirdExpression;
    thirdExpression = newThirdExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION, oldThirdExpression, newThirdExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThirdExpression(Expression newThirdExpression)
  {
    if (newThirdExpression != thirdExpression)
    {
      NotificationChain msgs = null;
      if (thirdExpression != null)
        msgs = ((InternalEObject)thirdExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION, null, msgs);
      if (newThirdExpression != null)
        msgs = ((InternalEObject)newThirdExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION, null, msgs);
      msgs = basicSetThirdExpression(newThirdExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION, newThirdExpression, newThirdExpression));
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
      case MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION:
        return basicSetFirstExpression(null, msgs);
      case MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION:
        return basicSetSecondExpression(null, msgs);
      case MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION:
        return basicSetThirdExpression(null, msgs);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__OPERATOR:
        return getOperator();
      case MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION:
        return getFirstExpression();
      case MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION:
        return getSecondExpression();
      case MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION:
        return getThirdExpression();
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
      case MiniScriptPackage.TERNARY_EXPRESSION__OPERATOR:
        setOperator((TernaryOperator)newValue);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION:
        setFirstExpression((Expression)newValue);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION:
        setSecondExpression((Expression)newValue);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION:
        setThirdExpression((Expression)newValue);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION:
        setFirstExpression((Expression)null);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION:
        setSecondExpression((Expression)null);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION:
        setThirdExpression((Expression)null);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case MiniScriptPackage.TERNARY_EXPRESSION__FIRST_EXPRESSION:
        return firstExpression != null;
      case MiniScriptPackage.TERNARY_EXPRESSION__SECOND_EXPRESSION:
        return secondExpression != null;
      case MiniScriptPackage.TERNARY_EXPRESSION__THIRD_EXPRESSION:
        return thirdExpression != null;
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

} //TernaryExpressionImpl
