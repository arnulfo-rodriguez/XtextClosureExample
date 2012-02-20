/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import java.util.Collection;

import org.arz.miniScript.ApplyTail;
import org.arz.miniScript.Expression;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Tail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.ApplyTailImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.ApplyTailImpl#getNextCall <em>Next Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyTailImpl extends MinimalEObjectImpl.Container implements ApplyTail
{
  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Expression> arguments;

  /**
   * The cached value of the '{@link #getNextCall() <em>Next Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextCall()
   * @generated
   * @ordered
   */
  protected ApplyTail nextCall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyTailImpl()
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
    return MiniScriptPackage.Literals.APPLY_TAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Expression>(Expression.class, this, MiniScriptPackage.APPLY_TAIL__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyTail getNextCall()
  {
    return nextCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextCall(ApplyTail newNextCall, NotificationChain msgs)
  {
    ApplyTail oldNextCall = nextCall;
    nextCall = newNextCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_TAIL__NEXT_CALL, oldNextCall, newNextCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextCall(ApplyTail newNextCall)
  {
    if (newNextCall != nextCall)
    {
      NotificationChain msgs = null;
      if (nextCall != null)
        msgs = ((InternalEObject)nextCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_TAIL__NEXT_CALL, null, msgs);
      if (newNextCall != null)
        msgs = ((InternalEObject)newNextCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_TAIL__NEXT_CALL, null, msgs);
      msgs = basicSetNextCall(newNextCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_TAIL__NEXT_CALL, newNextCall, newNextCall));
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
      case MiniScriptPackage.APPLY_TAIL__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case MiniScriptPackage.APPLY_TAIL__NEXT_CALL:
        return basicSetNextCall(null, msgs);
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
      case MiniScriptPackage.APPLY_TAIL__ARGUMENTS:
        return getArguments();
      case MiniScriptPackage.APPLY_TAIL__NEXT_CALL:
        return getNextCall();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniScriptPackage.APPLY_TAIL__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Expression>)newValue);
        return;
      case MiniScriptPackage.APPLY_TAIL__NEXT_CALL:
        setNextCall((ApplyTail)newValue);
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
      case MiniScriptPackage.APPLY_TAIL__ARGUMENTS:
        getArguments().clear();
        return;
      case MiniScriptPackage.APPLY_TAIL__NEXT_CALL:
        setNextCall((ApplyTail)null);
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
      case MiniScriptPackage.APPLY_TAIL__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case MiniScriptPackage.APPLY_TAIL__NEXT_CALL:
        return nextCall != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplyTailImpl
