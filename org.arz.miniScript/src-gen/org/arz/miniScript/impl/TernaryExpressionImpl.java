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
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getTrueExpr <em>True Expr</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.TernaryExpressionImpl#getFalseExpr <em>False Expr</em>}</li>
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
  protected static final TernaryOperator OPERATOR_EDEFAULT = TernaryOperator.IF;

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
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getTrueExpr() <em>True Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueExpr()
   * @generated
   * @ordered
   */
  protected Expression trueExpr;

  /**
   * The cached value of the '{@link #getFalseExpr() <em>False Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseExpr()
   * @generated
   * @ordered
   */
  protected Expression falseExpr;

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
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTrueExpr()
  {
    return trueExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrueExpr(Expression newTrueExpr, NotificationChain msgs)
  {
    Expression oldTrueExpr = trueExpr;
    trueExpr = newTrueExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR, oldTrueExpr, newTrueExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrueExpr(Expression newTrueExpr)
  {
    if (newTrueExpr != trueExpr)
    {
      NotificationChain msgs = null;
      if (trueExpr != null)
        msgs = ((InternalEObject)trueExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR, null, msgs);
      if (newTrueExpr != null)
        msgs = ((InternalEObject)newTrueExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR, null, msgs);
      msgs = basicSetTrueExpr(newTrueExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR, newTrueExpr, newTrueExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getFalseExpr()
  {
    return falseExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalseExpr(Expression newFalseExpr, NotificationChain msgs)
  {
    Expression oldFalseExpr = falseExpr;
    falseExpr = newFalseExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR, oldFalseExpr, newFalseExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalseExpr(Expression newFalseExpr)
  {
    if (newFalseExpr != falseExpr)
    {
      NotificationChain msgs = null;
      if (falseExpr != null)
        msgs = ((InternalEObject)falseExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR, null, msgs);
      if (newFalseExpr != null)
        msgs = ((InternalEObject)newFalseExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR, null, msgs);
      msgs = basicSetFalseExpr(newFalseExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR, newFalseExpr, newFalseExpr));
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
      case MiniScriptPackage.TERNARY_EXPRESSION__CONDITION:
        return basicSetCondition(null, msgs);
      case MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR:
        return basicSetTrueExpr(null, msgs);
      case MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR:
        return basicSetFalseExpr(null, msgs);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__CONDITION:
        return getCondition();
      case MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR:
        return getTrueExpr();
      case MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR:
        return getFalseExpr();
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
      case MiniScriptPackage.TERNARY_EXPRESSION__CONDITION:
        setCondition((Expression)newValue);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR:
        setTrueExpr((Expression)newValue);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR:
        setFalseExpr((Expression)newValue);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__CONDITION:
        setCondition((Expression)null);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR:
        setTrueExpr((Expression)null);
        return;
      case MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR:
        setFalseExpr((Expression)null);
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
      case MiniScriptPackage.TERNARY_EXPRESSION__CONDITION:
        return condition != null;
      case MiniScriptPackage.TERNARY_EXPRESSION__TRUE_EXPR:
        return trueExpr != null;
      case MiniScriptPackage.TERNARY_EXPRESSION__FALSE_EXPR:
        return falseExpr != null;
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
