/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.ApplyFunctionAlpha;
import org.arz.miniScript.FunctionArguments;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Function Alpha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.ApplyFunctionAlphaImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.ApplyFunctionAlphaImpl#getNextCall <em>Next Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyFunctionAlphaImpl extends MinimalEObjectImpl.Container implements ApplyFunctionAlpha
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected FunctionArguments args;

  /**
   * The cached value of the '{@link #getNextCall() <em>Next Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextCall()
   * @generated
   * @ordered
   */
  protected ApplyFunctionAlpha nextCall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyFunctionAlphaImpl()
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
    return MiniScriptPackage.Literals.APPLY_FUNCTION_ALPHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArguments getArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgs(FunctionArguments newArgs, NotificationChain msgs)
  {
    FunctionArguments oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS, oldArgs, newArgs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(FunctionArguments newArgs)
  {
    if (newArgs != args)
    {
      NotificationChain msgs = null;
      if (args != null)
        msgs = ((InternalEObject)args).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS, null, msgs);
      if (newArgs != null)
        msgs = ((InternalEObject)newArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS, null, msgs);
      msgs = basicSetArgs(newArgs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS, newArgs, newArgs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFunctionAlpha getNextCall()
  {
    return nextCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextCall(ApplyFunctionAlpha newNextCall, NotificationChain msgs)
  {
    ApplyFunctionAlpha oldNextCall = nextCall;
    nextCall = newNextCall;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL, oldNextCall, newNextCall);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextCall(ApplyFunctionAlpha newNextCall)
  {
    if (newNextCall != nextCall)
    {
      NotificationChain msgs = null;
      if (nextCall != null)
        msgs = ((InternalEObject)nextCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL, null, msgs);
      if (newNextCall != null)
        msgs = ((InternalEObject)newNextCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL, null, msgs);
      msgs = basicSetNextCall(newNextCall, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL, newNextCall, newNextCall));
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
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS:
        return basicSetArgs(null, msgs);
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL:
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
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS:
        return getArgs();
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL:
        return getNextCall();
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
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS:
        setArgs((FunctionArguments)newValue);
        return;
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL:
        setNextCall((ApplyFunctionAlpha)newValue);
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
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS:
        setArgs((FunctionArguments)null);
        return;
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL:
        setNextCall((ApplyFunctionAlpha)null);
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
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__ARGS:
        return args != null;
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA__NEXT_CALL:
        return nextCall != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplyFunctionAlphaImpl
