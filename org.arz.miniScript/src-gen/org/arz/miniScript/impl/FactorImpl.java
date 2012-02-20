/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorTail;
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
 *   <li>{@link org.arz.miniScript.impl.FactorImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.FactorImpl#getFactorTail <em>Factor Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactorImpl extends ExpressionImpl implements Factor
{
  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Expression term;

  /**
   * The cached value of the '{@link #getFactorTail() <em>Factor Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactorTail()
   * @generated
   * @ordered
   */
  protected FactorTail factorTail;

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
  public Expression getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Expression newTerm, NotificationChain msgs)
  {
    Expression oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Expression newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactorTail getFactorTail()
  {
    return factorTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactorTail(FactorTail newFactorTail, NotificationChain msgs)
  {
    FactorTail oldFactorTail = factorTail;
    factorTail = newFactorTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__FACTOR_TAIL, oldFactorTail, newFactorTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactorTail(FactorTail newFactorTail)
  {
    if (newFactorTail != factorTail)
    {
      NotificationChain msgs = null;
      if (factorTail != null)
        msgs = ((InternalEObject)factorTail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__FACTOR_TAIL, null, msgs);
      if (newFactorTail != null)
        msgs = ((InternalEObject)newFactorTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FACTOR__FACTOR_TAIL, null, msgs);
      msgs = basicSetFactorTail(newFactorTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FACTOR__FACTOR_TAIL, newFactorTail, newFactorTail));
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
      case MiniScriptPackage.FACTOR__TERM:
        return basicSetTerm(null, msgs);
      case MiniScriptPackage.FACTOR__FACTOR_TAIL:
        return basicSetFactorTail(null, msgs);
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
      case MiniScriptPackage.FACTOR__TERM:
        return getTerm();
      case MiniScriptPackage.FACTOR__FACTOR_TAIL:
        return getFactorTail();
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
      case MiniScriptPackage.FACTOR__TERM:
        setTerm((Expression)newValue);
        return;
      case MiniScriptPackage.FACTOR__FACTOR_TAIL:
        setFactorTail((FactorTail)newValue);
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
      case MiniScriptPackage.FACTOR__TERM:
        setTerm((Expression)null);
        return;
      case MiniScriptPackage.FACTOR__FACTOR_TAIL:
        setFactorTail((FactorTail)null);
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
      case MiniScriptPackage.FACTOR__TERM:
        return term != null;
      case MiniScriptPackage.FACTOR__FACTOR_TAIL:
        return factorTail != null;
    }
    return super.eIsSet(featureID);
  }

} //FactorImpl
