/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Apply;
import org.arz.miniScript.ApplyTail;
import org.arz.miniScript.Functor;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.ApplyImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.ApplyImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyImpl extends TermImpl implements Apply
{
  /**
   * The cached value of the '{@link #getFunctor() <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctor()
   * @generated
   * @ordered
   */
  protected Functor functor;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected ApplyTail arguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ApplyImpl()
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
    return MiniScriptPackage.Literals.APPLY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functor getFunctor()
  {
    return functor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctor(Functor newFunctor, NotificationChain msgs)
  {
    Functor oldFunctor = functor;
    functor = newFunctor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY__FUNCTOR, oldFunctor, newFunctor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctor(Functor newFunctor)
  {
    if (newFunctor != functor)
    {
      NotificationChain msgs = null;
      if (functor != null)
        msgs = ((InternalEObject)functor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY__FUNCTOR, null, msgs);
      if (newFunctor != null)
        msgs = ((InternalEObject)newFunctor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY__FUNCTOR, null, msgs);
      msgs = basicSetFunctor(newFunctor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY__FUNCTOR, newFunctor, newFunctor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyTail getArguments()
  {
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArguments(ApplyTail newArguments, NotificationChain msgs)
  {
    ApplyTail oldArguments = arguments;
    arguments = newArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY__ARGUMENTS, oldArguments, newArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArguments(ApplyTail newArguments)
  {
    if (newArguments != arguments)
    {
      NotificationChain msgs = null;
      if (arguments != null)
        msgs = ((InternalEObject)arguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY__ARGUMENTS, null, msgs);
      if (newArguments != null)
        msgs = ((InternalEObject)newArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.APPLY__ARGUMENTS, null, msgs);
      msgs = basicSetArguments(newArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.APPLY__ARGUMENTS, newArguments, newArguments));
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
      case MiniScriptPackage.APPLY__FUNCTOR:
        return basicSetFunctor(null, msgs);
      case MiniScriptPackage.APPLY__ARGUMENTS:
        return basicSetArguments(null, msgs);
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
      case MiniScriptPackage.APPLY__FUNCTOR:
        return getFunctor();
      case MiniScriptPackage.APPLY__ARGUMENTS:
        return getArguments();
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
      case MiniScriptPackage.APPLY__FUNCTOR:
        setFunctor((Functor)newValue);
        return;
      case MiniScriptPackage.APPLY__ARGUMENTS:
        setArguments((ApplyTail)newValue);
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
      case MiniScriptPackage.APPLY__FUNCTOR:
        setFunctor((Functor)null);
        return;
      case MiniScriptPackage.APPLY__ARGUMENTS:
        setArguments((ApplyTail)null);
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
      case MiniScriptPackage.APPLY__FUNCTOR:
        return functor != null;
      case MiniScriptPackage.APPLY__ARGUMENTS:
        return arguments != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplyImpl
