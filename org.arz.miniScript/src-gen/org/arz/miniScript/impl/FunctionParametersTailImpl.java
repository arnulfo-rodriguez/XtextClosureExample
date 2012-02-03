/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.FunctionParametersTail;
import org.arz.miniScript.MiniScriptPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameters Tail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.arz.miniScript.impl.FunctionParametersTailImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.arz.miniScript.impl.FunctionParametersTailImpl#getNextParameters <em>Next Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionParametersTailImpl extends MinimalEObjectImpl.Container implements FunctionParametersTail
{
  /**
   * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected String parameter = PARAMETER_EDEFAULT;

  /**
   * The cached value of the '{@link #getNextParameters() <em>Next Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextParameters()
   * @generated
   * @ordered
   */
  protected FunctionParametersTail nextParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionParametersTailImpl()
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
    return MiniScriptPackage.Literals.FUNCTION_PARAMETERS_TAIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(String newParameter)
  {
    String oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__PARAMETER, oldParameter, parameter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionParametersTail getNextParameters()
  {
    return nextParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNextParameters(FunctionParametersTail newNextParameters, NotificationChain msgs)
  {
    FunctionParametersTail oldNextParameters = nextParameters;
    nextParameters = newNextParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS, oldNextParameters, newNextParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextParameters(FunctionParametersTail newNextParameters)
  {
    if (newNextParameters != nextParameters)
    {
      NotificationChain msgs = null;
      if (nextParameters != null)
        msgs = ((InternalEObject)nextParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS, null, msgs);
      if (newNextParameters != null)
        msgs = ((InternalEObject)newNextParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS, null, msgs);
      msgs = basicSetNextParameters(newNextParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS, newNextParameters, newNextParameters));
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
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS:
        return basicSetNextParameters(null, msgs);
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
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__PARAMETER:
        return getParameter();
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS:
        return getNextParameters();
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
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__PARAMETER:
        setParameter((String)newValue);
        return;
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS:
        setNextParameters((FunctionParametersTail)newValue);
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
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__PARAMETER:
        setParameter(PARAMETER_EDEFAULT);
        return;
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS:
        setNextParameters((FunctionParametersTail)null);
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
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__PARAMETER:
        return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
      case MiniScriptPackage.FUNCTION_PARAMETERS_TAIL__NEXT_PARAMETERS:
        return nextParameters != null;
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
    result.append(" (parameter: ");
    result.append(parameter);
    result.append(')');
    return result.toString();
  }

} //FunctionParametersTailImpl
