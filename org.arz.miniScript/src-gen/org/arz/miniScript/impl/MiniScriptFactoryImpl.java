/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.impl;

import org.arz.miniScript.*;

import org.eclipse.emf.ecore.EClass;
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
      MiniScriptFactory theMiniScriptFactory = (MiniScriptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.arz.org/MiniScript"); 
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
      case MiniScriptPackage.FUNCTION_PARAMETERS: return createFunctionParameters();
      case MiniScriptPackage.APPLY_FUNCTION: return createApplyFunction();
      case MiniScriptPackage.APPLY_FUNCTION_ALPHA: return createApplyFunctionAlpha();
      case MiniScriptPackage.FUNCTION_ARGUMENTS: return createFunctionArguments();
      case MiniScriptPackage.LITERAL_EXPR: return createLiteralExpr();
      case MiniScriptPackage.SYMBOL_REFERENCE: return createSymbolReference();
      case MiniScriptPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case MiniScriptPackage.NUMERIC_EXPRESSION: return createNumericExpression();
      case MiniScriptPackage.EXPR_TAIL: return createExprTail();
      case MiniScriptPackage.FACTOR: return createFactor();
      case MiniScriptPackage.FACTOR_TAIL: return createFactorTail();
      case MiniScriptPackage.TERM: return createTerm();
      case MiniScriptPackage.PARENTHESIS_EXPRESSION: return createParenthesisExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public FunctionParameters createFunctionParameters()
  {
    FunctionParametersImpl functionParameters = new FunctionParametersImpl();
    return functionParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFunction createApplyFunction()
  {
    ApplyFunctionImpl applyFunction = new ApplyFunctionImpl();
    return applyFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplyFunctionAlpha createApplyFunctionAlpha()
  {
    ApplyFunctionAlphaImpl applyFunctionAlpha = new ApplyFunctionAlphaImpl();
    return applyFunctionAlpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionArguments createFunctionArguments()
  {
    FunctionArgumentsImpl functionArguments = new FunctionArgumentsImpl();
    return functionArguments;
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
  public ExprTail createExprTail()
  {
    ExprTailImpl exprTail = new ExprTailImpl();
    return exprTail;
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
  public FactorTail createFactorTail()
  {
    FactorTailImpl factorTail = new FactorTailImpl();
    return factorTail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesisExpression createParenthesisExpression()
  {
    ParenthesisExpressionImpl parenthesisExpression = new ParenthesisExpressionImpl();
    return parenthesisExpression;
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
