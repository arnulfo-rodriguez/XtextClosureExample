/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.Expression;
import org.arz.miniScript.FunctionArgumentsTail;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Arguments Tail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.FunctionArgumentsTailImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.FunctionArgumentsTailImpl#getNextArguments <em>Next Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionArgumentsTailImpl extends MinimalEObjectImpl.Container implements FunctionArgumentsTail
{
  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected Expression argument;

  /**
   * The cached value of the '{@link #getNextArguments() <em>Next Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextArguments()
   * @generated
   * @ordered
   */
  protected FunctionArgumentsTail nextArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionArgumentsTailImpl()
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
    return MiniScriptPackage.Literals.FUNCTION_ARGUMENTS_TAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(Expression newArgument, NotificationChain msgs)
  {
    Expression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(Expression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT, newArgument, newArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArgumentsTail getNextArguments()
  {
    return nextArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextArguments(FunctionArgumentsTail newNextArguments, NotificationChain msgs)
  {
    FunctionArgumentsTail oldNextArguments = nextArguments;
    nextArguments = newNextArguments;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS, oldNextArguments, newNextArguments);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextArguments(FunctionArgumentsTail newNextArguments)
  {
    if (newNextArguments != nextArguments)
    {
      NotificationChain msgs = null;
      if (nextArguments != null)
        msgs = ((InternalEObject)nextArguments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS, null, msgs);
      if (newNextArguments != null)
        msgs = ((InternalEObject)newNextArguments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS, null, msgs);
      msgs = basicSetNextArguments(newNextArguments, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS, newNextArguments, newNextArguments));
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
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT:
        return basicSetArgument(null, msgs);
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS:
        return basicSetNextArguments(null, msgs);
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
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT:
        return getArgument();
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS:
        return getNextArguments();
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
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT:
        setArgument((Expression)newValue);
        return;
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS:
        setNextArguments((FunctionArgumentsTail)newValue);
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
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT:
        setArgument((Expression)null);
        return;
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS:
        setNextArguments((FunctionArgumentsTail)null);
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
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__ARGUMENT:
        return argument != null;
      case MiniScriptPackage.FUNCTION_ARGUMENTS_TAIL__NEXT_ARGUMENTS:
        return nextArguments != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionArgumentsTailImpl
