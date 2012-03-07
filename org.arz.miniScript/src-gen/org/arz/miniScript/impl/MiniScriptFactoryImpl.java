/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniScriptFactoryImpl extends EFactoryImpl implements MiniScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MiniScriptFactory init()
  {
    try
    {
      MiniScriptFactory theMiniScriptFactory = (MiniScriptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.arz.org/miniScript"); 
      if (theMiniScriptFactory != null)
      {
        return theMiniScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MiniScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MiniScriptPackage.MODEL: return createModel();
      case MiniScriptPackage.PROGRAM: return createProgram();
      case MiniScriptPackage.EXPRESSION: return createExpression();
      case MiniScriptPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case MiniScriptPackage.BODY: return createBody();
      case MiniScriptPackage.LITERAL_EXPR: return createLiteralExpr();
      case MiniScriptPackage.SYMBOL_REFERENCE: return createSymbolReference();
      case MiniScriptPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case MiniScriptPackage.APPLY: return createApply();
      case MiniScriptPackage.NUMERIC_EXPRESSION: return createNumericExpression();
      case MiniScriptPackage.FACTOR: return createFactor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MiniScriptPackage.ADDITION_OPERATOR:
        return createAdditionOperatorFromString(eDataType, initialValue);
      case MiniScriptPackage.FACTOR_OPERATOR:
        return createFactorOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MiniScriptPackage.ADDITION_OPERATOR:
        return convertAdditionOperatorToString(eDataType, instanceValue);
      case MiniScriptPackage.FACTOR_OPERATOR:
        return convertFactorOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpr createLiteralExpr()
  {
    LiteralExprImpl literalExpr = new LiteralExprImpl();
    return literalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolReference createSymbolReference()
  {
    SymbolReferenceImpl symbolReference = new SymbolReferenceImpl();
    return symbolReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAssignment createVariableAssignment()
  {
    VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
    return variableAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Apply createApply()
  {
    ApplyImpl apply = new ApplyImpl();
    return apply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericExpression createNumericExpression()
  {
    NumericExpressionImpl numericExpression = new NumericExpressionImpl();
    return numericExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditionOperator createAdditionOperatorFromString(EDataType eDataType, String initialValue)
  {
    AdditionOperator result = AdditionOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAdditionOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactorOperator createFactorOperatorFromString(EDataType eDataType, String initialValue)
  {
    FactorOperator result = FactorOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFactorOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniScriptPackage getMiniScriptPackage()
  {
    return (MiniScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MiniScriptPackage getPackage()
  {
    return MiniScriptPackage.eINSTANCE;
  }

} //MiniScriptFactoryImpl
