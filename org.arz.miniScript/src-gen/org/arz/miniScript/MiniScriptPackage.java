/**
 * <copyright>
 * </copyright>
 *
 */
package org.arz.miniScript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.arz.miniScript.MiniScriptFactory
 * @model kind="package"
 * @generated
 */
public interface MiniScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "miniScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.arz.org/miniScript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "miniScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MiniScriptPackage eINSTANCE = org.arz.miniScript.impl.MiniScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ModelImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ProgramImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EXPRESSIONS = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ExpressionImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FunctionDeclarationImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.BodyImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getBody()
   * @generated
   */
  int BODY = 4;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.LiteralExprImpl <em>Literal Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.LiteralExprImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getLiteralExpr()
   * @generated
   */
  int LITERAL_EXPR = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPR__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.SymbolReferenceImpl <em>Symbol Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.SymbolReferenceImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getSymbolReference()
   * @generated
   */
  int SYMBOL_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REFERENCE__ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.NumExprTailImpl <em>Num Expr Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.NumExprTailImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getNumExprTail()
   * @generated
   */
  int NUM_EXPR_TAIL = 7;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPR_TAIL__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPR_TAIL__FACTOR = 1;

  /**
   * The feature id for the '<em><b>Expr Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPR_TAIL__EXPR_TAIL = 2;

  /**
   * The number of structural features of the '<em>Num Expr Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUM_EXPR_TAIL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FactorTailImpl <em>Factor Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FactorTailImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactorTail()
   * @generated
   */
  int FACTOR_TAIL = 8;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL__TERM = 1;

  /**
   * The feature id for the '<em><b>Factor Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL__FACTOR_TAIL = 2;

  /**
   * The number of structural features of the '<em>Factor Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.VariableAssignmentImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getVariableAssignment()
   * @generated
   */
  int VARIABLE_ASSIGNMENT = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__ID = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ApplyImpl <em>Apply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ApplyImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApply()
   * @generated
   */
  int APPLY = 10;

  /**
   * The feature id for the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__FUNCTOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Apply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.NumericExpressionImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getNumericExpression()
   * @generated
   */
  int NUMERIC_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__FACTOR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION__EXPR_TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Numeric Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FactorImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 12;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Factor Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_TAIL = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.arz.miniScript.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see org.arz.miniScript.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.arz.miniScript.Program#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.arz.miniScript.Program#getExpressions()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Expressions();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.arz.miniScript.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.arz.miniScript.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.arz.miniScript.FunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.arz.miniScript.FunctionDeclaration#getParameters()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.FunctionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.arz.miniScript.FunctionDeclaration#getBody()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Body();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.arz.miniScript.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.arz.miniScript.Body#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.arz.miniScript.Body#getExpressions()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Expressions();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.LiteralExpr <em>Literal Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expr</em>'.
   * @see org.arz.miniScript.LiteralExpr
   * @generated
   */
  EClass getLiteralExpr();

  /**
   * Returns the meta object for the attribute '{@link org.arz.miniScript.LiteralExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.arz.miniScript.LiteralExpr#getValue()
   * @see #getLiteralExpr()
   * @generated
   */
  EAttribute getLiteralExpr_Value();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.SymbolReference <em>Symbol Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Reference</em>'.
   * @see org.arz.miniScript.SymbolReference
   * @generated
   */
  EClass getSymbolReference();

  /**
   * Returns the meta object for the attribute '{@link org.arz.miniScript.SymbolReference#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.arz.miniScript.SymbolReference#getId()
   * @see #getSymbolReference()
   * @generated
   */
  EAttribute getSymbolReference_Id();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.NumExprTail <em>Num Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Num Expr Tail</em>'.
   * @see org.arz.miniScript.NumExprTail
   * @generated
   */
  EClass getNumExprTail();

  /**
   * Returns the meta object for the attribute '{@link org.arz.miniScript.NumExprTail#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.arz.miniScript.NumExprTail#getOperator()
   * @see #getNumExprTail()
   * @generated
   */
  EAttribute getNumExprTail_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.NumExprTail#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor</em>'.
   * @see org.arz.miniScript.NumExprTail#getFactor()
   * @see #getNumExprTail()
   * @generated
   */
  EReference getNumExprTail_Factor();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.NumExprTail#getExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Tail</em>'.
   * @see org.arz.miniScript.NumExprTail#getExprTail()
   * @see #getNumExprTail()
   * @generated
   */
  EReference getNumExprTail_ExprTail();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.FactorTail <em>Factor Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor Tail</em>'.
   * @see org.arz.miniScript.FactorTail
   * @generated
   */
  EClass getFactorTail();

  /**
   * Returns the meta object for the attribute '{@link org.arz.miniScript.FactorTail#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.arz.miniScript.FactorTail#getOperator()
   * @see #getFactorTail()
   * @generated
   */
  EAttribute getFactorTail_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.FactorTail#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.arz.miniScript.FactorTail#getTerm()
   * @see #getFactorTail()
   * @generated
   */
  EReference getFactorTail_Term();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.FactorTail#getFactorTail <em>Factor Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor Tail</em>'.
   * @see org.arz.miniScript.FactorTail#getFactorTail()
   * @see #getFactorTail()
   * @generated
   */
  EReference getFactorTail_FactorTail();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment</em>'.
   * @see org.arz.miniScript.VariableAssignment
   * @generated
   */
  EClass getVariableAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.arz.miniScript.VariableAssignment#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.arz.miniScript.VariableAssignment#getId()
   * @see #getVariableAssignment()
   * @generated
   */
  EAttribute getVariableAssignment_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.VariableAssignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.arz.miniScript.VariableAssignment#getExpression()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Apply <em>Apply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply</em>'.
   * @see org.arz.miniScript.Apply
   * @generated
   */
  EClass getApply();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.Apply#getFunctor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functor</em>'.
   * @see org.arz.miniScript.Apply#getFunctor()
   * @see #getApply()
   * @generated
   */
  EReference getApply_Functor();

  /**
   * Returns the meta object for the containment reference list '{@link org.arz.miniScript.Apply#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.arz.miniScript.Apply#getArguments()
   * @see #getApply()
   * @generated
   */
  EReference getApply_Arguments();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.NumericExpression <em>Numeric Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Expression</em>'.
   * @see org.arz.miniScript.NumericExpression
   * @generated
   */
  EClass getNumericExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.NumericExpression#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor</em>'.
   * @see org.arz.miniScript.NumericExpression#getFactor()
   * @see #getNumericExpression()
   * @generated
   */
  EReference getNumericExpression_Factor();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.NumericExpression#getExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Tail</em>'.
   * @see org.arz.miniScript.NumericExpression#getExprTail()
   * @see #getNumericExpression()
   * @generated
   */
  EReference getNumericExpression_ExprTail();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see org.arz.miniScript.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.Factor#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.arz.miniScript.Factor#getTerm()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Term();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.Factor#getFactorTail <em>Factor Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor Tail</em>'.
   * @see org.arz.miniScript.Factor#getFactorTail()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_FactorTail();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MiniScriptFactory getMiniScriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ModelImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ProgramImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__EXPRESSIONS = eINSTANCE.getProgram_Expressions();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ExpressionImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.FunctionDeclarationImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getFunctionDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.BodyImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__EXPRESSIONS = eINSTANCE.getBody_Expressions();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.LiteralExprImpl <em>Literal Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.LiteralExprImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getLiteralExpr()
     * @generated
     */
    EClass LITERAL_EXPR = eINSTANCE.getLiteralExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPR__VALUE = eINSTANCE.getLiteralExpr_Value();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.SymbolReferenceImpl <em>Symbol Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.SymbolReferenceImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getSymbolReference()
     * @generated
     */
    EClass SYMBOL_REFERENCE = eINSTANCE.getSymbolReference();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_REFERENCE__ID = eINSTANCE.getSymbolReference_Id();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.NumExprTailImpl <em>Num Expr Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.NumExprTailImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getNumExprTail()
     * @generated
     */
    EClass NUM_EXPR_TAIL = eINSTANCE.getNumExprTail();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUM_EXPR_TAIL__OPERATOR = eINSTANCE.getNumExprTail_Operator();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUM_EXPR_TAIL__FACTOR = eINSTANCE.getNumExprTail_Factor();

    /**
     * The meta object literal for the '<em><b>Expr Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUM_EXPR_TAIL__EXPR_TAIL = eINSTANCE.getNumExprTail_ExprTail();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.FactorTailImpl <em>Factor Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.FactorTailImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactorTail()
     * @generated
     */
    EClass FACTOR_TAIL = eINSTANCE.getFactorTail();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR_TAIL__OPERATOR = eINSTANCE.getFactorTail_Operator();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR_TAIL__TERM = eINSTANCE.getFactorTail_Term();

    /**
     * The meta object literal for the '<em><b>Factor Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR_TAIL__FACTOR_TAIL = eINSTANCE.getFactorTail_FactorTail();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.VariableAssignmentImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getVariableAssignment()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_ASSIGNMENT__ID = eINSTANCE.getVariableAssignment_Id();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ApplyImpl <em>Apply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ApplyImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApply()
     * @generated
     */
    EClass APPLY = eINSTANCE.getApply();

    /**
     * The meta object literal for the '<em><b>Functor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY__FUNCTOR = eINSTANCE.getApply_Functor();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY__ARGUMENTS = eINSTANCE.getApply_Arguments();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.NumericExpressionImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getNumericExpression()
     * @generated
     */
    EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__FACTOR = eINSTANCE.getNumericExpression_Factor();

    /**
     * The meta object literal for the '<em><b>Expr Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION__EXPR_TAIL = eINSTANCE.getNumericExpression_ExprTail();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.FactorImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__TERM = eINSTANCE.getFactor_Term();

    /**
     * The meta object literal for the '<em><b>Factor Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__FACTOR_TAIL = eINSTANCE.getFactor_FactorTail();

  }

} //MiniScriptPackage
