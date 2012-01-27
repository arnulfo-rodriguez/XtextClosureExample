/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.ApplyFunction;
import org.arz.miniScript.ApplyFunctionAlpha;
import org.arz.miniScript.MiniScriptPackage;
import org.arz.miniScript.SymbolReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.ApplyFunctionImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.ApplyFunctionImpl#getApp3 <em>App3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyFunctionImpl extends TermImpl implements ApplyFunction
{
  /**
   * The cached value of the '{@link #getFunctor() <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctor()
   * @generated
   * @ordered
   */
  protected SymbolReference functor;

  /**
   * The cached value of the '{@link #getApp3() <em>App3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApp3()
   * @generated
   * @ordered
   */
  protected ApplyFunctionAlpha app3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyFunctionImpl()
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
    return MiniScriptPackage.Literals.APPLY_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolReference getFunctor()
  {
    return functor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctor(SymbolReference newFunctor, NotificationChain msgs)
  {
    SymbolReference oldFunctor = functor;
    functor = newFunctor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION__FUNCTOR, oldFunctor, newFunctor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctor(SymbolReference newFunctor)
  {
    if (newFunctor != functor)
    {
      NotificationChain msgs = null;
      if (functor != null)
        msgs = ((InternalEObject)functor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION__FUNCTOR, null, msgs);
      if (newFunctor != null)
        msgs = ((InternalEObject)newFunctor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION__FUNCTOR, null, msgs);
      msgs = basicSetFunctor(newFunctor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION__FUNCTOR, newFunctor, newFunctor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFunctionAlpha getApp3()
  {
    return app3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetApp3(ApplyFunctionAlpha newApp3, NotificationChain msgs)
  {
    ApplyFunctionAlpha oldApp3 = app3;
    app3 = newApp3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION__APP3, oldApp3, newApp3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApp3(ApplyFunctionAlpha newApp3)
  {
    if (newApp3 != app3)
    {
      NotificationChain msgs = null;
      if (app3 != null)
        msgs = ((InternalEObject)app3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION__APP3, null, msgs);
      if (newApp3 != null)
        msgs = ((InternalEObject)newApp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY_FUNCTION__APP3, null, msgs);
      msgs = basicSetApp3(newApp3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY_FUNCTION__APP3, newApp3, newApp3));
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
      case MiniScriptPackage.APPLY_FUNCTION__FUNCTOR:
        return basicSetFunctor(null, msgs);
      case MiniScriptPackage.APPLY_FUNCTION__APP3:
        return basicSetApp3(null, msgs);
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
      case MiniScriptPackage.APPLY_FUNCTION__FUNCTOR:
        return getFunctor();
      case MiniScriptPackage.APPLY_FUNCTION__APP3:
        return getApp3();
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
      case MiniScriptPackage.APPLY_FUNCTION__FUNCTOR:
        setFunctor((SymbolReference)newValue);
        return;
      case MiniScriptPackage.APPLY_FUNCTION__APP3:
        setApp3((ApplyFunctionAlpha)newValue);
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
      case MiniScriptPackage.APPLY_FUNCTION__FUNCTOR:
        setFunctor((SymbolReference)null);
        return;
      case MiniScriptPackage.APPLY_FUNCTION__APP3:
        setApp3((ApplyFunctionAlpha)null);
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
      case MiniScriptPackage.APPLY_FUNCTION__FUNCTOR:
        return functor != null;
      case MiniScriptPackage.APPLY_FUNCTION__APP3:
        return app3 != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplyFunctionImpl
