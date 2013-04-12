/**
 */
package org.arz.miniScript.util;

import org.arz.miniScript.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.arz.miniScript.MiniScriptPackage
 * @generated
 */
public class MiniScriptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MiniScriptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniScriptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MiniScriptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MiniScriptPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = caseModel(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.BLOCK_EXPRESSION:
      {
        BlockExpression blockExpression = (BlockExpression)theEObject;
        T result = caseBlockExpression(blockExpression);
        if (result == null) result = caseExpression(blockExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.LET_EXPRESSION:
      {
        LetExpression letExpression = (LetExpression)theEObject;
        T result = caseLetExpression(letExpression);
        if (result == null) result = caseExpression(letExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.TERNARY_EXPRESSION:
      {
        TernaryExpression ternaryExpression = (TernaryExpression)theEObject;
        T result = caseTernaryExpression(ternaryExpression);
        if (result == null) result = caseExpression(ternaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.LOGICAL_BINARY_EXPRESSION:
      {
        LogicalBinaryExpression logicalBinaryExpression = (LogicalBinaryExpression)theEObject;
        T result = caseLogicalBinaryExpression(logicalBinaryExpression);
        if (result == null) result = caseExpression(logicalBinaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.LOGICAL_UNARY_EXPRESSION:
      {
        LogicalUnaryExpression logicalUnaryExpression = (LogicalUnaryExpression)theEObject;
        T result = caseLogicalUnaryExpression(logicalUnaryExpression);
        if (result == null) result = caseExpression(logicalUnaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = caseExpression(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.SYMBOL_REFERENCE:
      {
        SymbolReference symbolReference = (SymbolReference)theEObject;
        T result = caseSymbolReference(symbolReference);
        if (result == null) result = caseExpression(symbolReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.LITERAL_BOOLEAN:
      {
        LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
        T result = caseLiteralBoolean(literalBoolean);
        if (result == null) result = caseExpression(literalBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.LITERAL_NUMBER:
      {
        LiteralNumber literalNumber = (LiteralNumber)theEObject;
        T result = caseLiteralNumber(literalNumber);
        if (result == null) result = caseExpression(literalNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.VARIABLE_ASSIGNMENT:
      {
        VariableAssignment variableAssignment = (VariableAssignment)theEObject;
        T result = caseVariableAssignment(variableAssignment);
        if (result == null) result = caseExpression(variableAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.COMPARISON_EXPRESSION:
      {
        ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
        T result = caseComparisonExpression(comparisonExpression);
        if (result == null) result = caseExpression(comparisonExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.NUMERIC_EXPRESSION:
      {
        NumericExpression numericExpression = (NumericExpression)theEObject;
        T result = caseNumericExpression(numericExpression);
        if (result == null) result = caseExpression(numericExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.FACTOR:
      {
        Factor factor = (Factor)theEObject;
        T result = caseFactor(factor);
        if (result == null) result = caseExpression(factor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MiniScriptPackage.APPLY:
      {
        Apply apply = (Apply)theEObject;
        T result = caseApply(apply);
        if (result == null) result = caseExpression(apply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockExpression(BlockExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Let Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Let Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLetExpression(LetExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ternary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTernaryExpression(TernaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Binary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Binary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalBinaryExpression(LogicalBinaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalUnaryExpression(LogicalUnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolReference(SymbolReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralBoolean(LiteralBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralNumber(LiteralNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignment(VariableAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparisonExpression(ComparisonExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericExpression(NumericExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactor(Factor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Apply</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Apply</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApply(Apply object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MiniScriptSwitch
