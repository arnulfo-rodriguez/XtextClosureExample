/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorOperator;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.FactorImpl#getLeftTerm <em>Left Term</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.FactorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.FactorImpl#getRightTerm <em>Right Term</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorImpl extends ExpressionImpl implements Factor
{
  /**
   * The cached value of the '{@link #getLeftTerm() <em>Left Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftTerm()
   * @generated
   * @ordered
   */
  protected Expression leftTerm;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final FactorOperator OPERATOR_EDEFAULT = FactorOperator.MULT;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected FactorOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightTerm() <em>Right Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightTerm()
   * @generated
   * @ordered
   */
  protected Expression rightTerm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactorImpl()
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
    return MiniScriptPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeftTerm()
  {
    return leftTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftTerm(Expression newLeftTerm, NotificationChain msgs)
  {
    Expression oldLeftTerm = leftTerm;
    leftTerm = newLeftTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__LEFT_TERM, oldLeftTerm, newLeftTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftTerm(Expression newLeftTerm)
  {
    if (newLeftTerm != leftTerm)
    {
      NotificationChain msgs = null;
      if (leftTerm != null)
        msgs = ((InternalEObject)leftTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__LEFT_TERM, null, msgs);
      if (newLeftTerm != null)
        msgs = ((InternalEObject)newLeftTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__LEFT_TERM, null, msgs);
      msgs = basicSetLeftTerm(newLeftTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__LEFT_TERM, newLeftTerm, newLeftTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactorOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(FactorOperator newOperator)
  {
    FactorOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightTerm()
  {
    return rightTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightTerm(Expression newRightTerm, NotificationChain msgs)
  {
    Expression oldRightTerm = rightTerm;
    rightTerm = newRightTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__RIGHT_TERM, oldRightTerm, newRightTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightTerm(Expression newRightTerm)
  {
    if (newRightTerm != rightTerm)
    {
      NotificationChain msgs = null;
      if (rightTerm != null)
        msgs = ((InternalEObject)rightTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__RIGHT_TERM, null, msgs);
      if (newRightTerm != null)
        msgs = ((InternalEObject)newRightTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__RIGHT_TERM, null, msgs);
      msgs = basicSetRightTerm(newRightTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__RIGHT_TERM, newRightTerm, newRightTerm));
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
      case MiniScriptPackage.FACTOR__LEFT_TERM:
        return basicSetLeftTerm(null, msgs);
      case MiniScriptPackage.FACTOR__RIGHT_TERM:
        return basicSetRightTerm(null, msgs);
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
      case MiniScriptPackage.FACTOR__LEFT_TERM:
        return getLeftTerm();
      case MiniScriptPackage.FACTOR__OPERATOR:
        return getOperator();
      case MiniScriptPackage.FACTOR__RIGHT_TERM:
        return getRightTerm();
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
      case MiniScriptPackage.FACTOR__LEFT_TERM:
        setLeftTerm((Expression)newValue);
        return;
      case MiniScriptPackage.FACTOR__OPERATOR:
        setOperator((FactorOperator)newValue);
        return;
      case MiniScriptPackage.FACTOR__RIGHT_TERM:
        setRightTerm((Expression)newValue);
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
      case MiniScriptPackage.FACTOR__LEFT_TERM:
        setLeftTerm((Expression)null);
        return;
      case MiniScriptPackage.FACTOR__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MiniScriptPackage.FACTOR__RIGHT_TERM:
        setRightTerm((Expression)null);
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
      case MiniScriptPackage.FACTOR__LEFT_TERM:
        return leftTerm != null;
      case MiniScriptPackage.FACTOR__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case MiniScriptPackage.FACTOR__RIGHT_TERM:
        return rightTerm != null;
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

} //FactorImpl
