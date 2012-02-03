/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript.util;

import org.arz.miniScript.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.arz.miniScript.MiniScriptPackage
 * @generated
 */
public class MiniScriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MiniScriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniScriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MiniScriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MiniScriptSwitch<Adapter> modelSwitch =
    new MiniScriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseProgramTail(ProgramTail object)
      {
        return createProgramTailAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionDeclaration(FunctionDeclaration object)
      {
        return createFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseBody(Body object)
      {
        return createBodyAdapter();
      }
      @Override
      public Adapter caseBodyTail(BodyTail object)
      {
        return createBodyTailAdapter();
      }
      @Override
      public Adapter caseFunctionParameters(FunctionParameters object)
      {
        return createFunctionParametersAdapter();
      }
      @Override
      public Adapter caseFunctionParametersTail(FunctionParametersTail object)
      {
        return createFunctionParametersTailAdapter();
      }
      @Override
      public Adapter caseApply(Apply object)
      {
        return createApplyAdapter();
      }
      @Override
      public Adapter caseFunctor(Functor object)
      {
        return createFunctorAdapter();
      }
      @Override
      public Adapter caseApplyTail(ApplyTail object)
      {
        return createApplyTailAdapter();
      }
      @Override
      public Adapter caseFunctionArguments(FunctionArguments object)
      {
        return createFunctionArgumentsAdapter();
      }
      @Override
      public Adapter caseFunctionArgumentsTail(FunctionArgumentsTail object)
      {
        return createFunctionArgumentsTailAdapter();
      }
      @Override
      public Adapter caseLiteralExpr(LiteralExpr object)
      {
        return createLiteralExprAdapter();
      }
      @Override
      public Adapter caseSymbolReference(SymbolReference object)
      {
        return createSymbolReferenceAdapter();
      }
      @Override
      public Adapter caseNumericExpression(NumericExpression object)
      {
        return createNumericExpressionAdapter();
      }
      @Override
      public Adapter caseExprTail(ExprTail object)
      {
        return createExprTailAdapter();
      }
      @Override
      public Adapter caseFactor(Factor object)
      {
        return createFactorAdapter();
      }
      @Override
      public Adapter caseFactorTail(FactorTail object)
      {
        return createFactorTailAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseVariableAssignment(VariableAssignment object)
      {
        return createVariableAssignmentAdapter();
      }
      @Override
      public Adapter caseParenthesisExpression(ParenthesisExpression object)
      {
        return createParenthesisExpressionAdapter();
      }
      @Override
      public Adapter caseApplyFunctionAlpha(ApplyFunctionAlpha object)
      {
        return createApplyFunctionAlphaAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.ProgramTail <em>Program Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.ProgramTail
   * @generated
   */
  public Adapter createProgramTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FunctionDeclaration
   * @generated
   */
  public Adapter createFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Body
   * @generated
   */
  public Adapter createBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.BodyTail <em>Body Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.BodyTail
   * @generated
   */
  public Adapter createBodyTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FunctionParameters <em>Function Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FunctionParameters
   * @generated
   */
  public Adapter createFunctionParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FunctionParametersTail <em>Function Parameters Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FunctionParametersTail
   * @generated
   */
  public Adapter createFunctionParametersTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Apply
   * @generated
   */
  public Adapter createApplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Functor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Functor
   * @generated
   */
  public Adapter createFunctorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.ApplyTail <em>Apply Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.ApplyTail
   * @generated
   */
  public Adapter createApplyTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FunctionArguments <em>Function Arguments</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FunctionArguments
   * @generated
   */
  public Adapter createFunctionArgumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FunctionArgumentsTail <em>Function Arguments Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FunctionArgumentsTail
   * @generated
   */
  public Adapter createFunctionArgumentsTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.LiteralExpr <em>Literal Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.LiteralExpr
   * @generated
   */
  public Adapter createLiteralExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.SymbolReference <em>Symbol Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.SymbolReference
   * @generated
   */
  public Adapter createSymbolReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.NumericExpression
   * @generated
   */
  public Adapter createNumericExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.ExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.ExprTail
   * @generated
   */
  public Adapter createExprTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Factor
   * @generated
   */
  public Adapter createFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.FactorTail <em>Factor Tail</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.FactorTail
   * @generated
   */
  public Adapter createFactorTailAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.VariableAssignment
   * @generated
   */
  public Adapter createVariableAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.ParenthesisExpression <em>Parenthesis Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.ParenthesisExpression
   * @generated
   */
  public Adapter createParenthesisExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.arz.miniScript.ApplyFunctionAlpha <em>Apply Function Alpha</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.arz.miniScript.ApplyFunctionAlpha
   * @generated
   */
  public Adapter createApplyFunctionAlphaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MiniScriptAdapterFactory
