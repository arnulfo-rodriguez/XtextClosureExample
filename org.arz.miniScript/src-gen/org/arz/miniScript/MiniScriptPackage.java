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
  String eNS_URI = "http://www.arz.org/MiniScript";

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
   * The feature id for the '<em><b>Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__EXPRESSION = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.TermImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getTerm()
   * @generated
   */
  int TERM = 16;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ParenthesisExpressionImpl <em>Parenthesis Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ParenthesisExpressionImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getParenthesisExpression()
   * @generated
   */
  int PARENTHESIS_EXPRESSION = 17;

  /**
   * The number of structural features of the '<em>Parenthesis Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENTHESIS_EXPRESSION_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

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
  int EXPRESSION_FEATURE_COUNT = PARENTHESIS_EXPRESSION_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
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
   * The meta object id for the '{@link org.arz.miniScript.impl.FunctionParametersImpl <em>Function Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FunctionParametersImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionParameters()
   * @generated
   */
  int FUNCTION_PARAMETERS = 5;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETERS__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>Function Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ApplyFunctionImpl <em>Apply Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ApplyFunctionImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApplyFunction()
   * @generated
   */
  int APPLY_FUNCTION = 6;

  /**
   * The feature id for the '<em><b>Functor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION__FUNCTOR = TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>App3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION__APP3 = TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Apply Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.ApplyFunctionAlphaImpl <em>Apply Function Alpha</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ApplyFunctionAlphaImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApplyFunctionAlpha()
   * @generated
   */
  int APPLY_FUNCTION_ALPHA = 7;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION_ALPHA__ARGS = 0;

  /**
   * The feature id for the '<em><b>Next Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION_ALPHA__NEXT_CALL = 1;

  /**
   * The number of structural features of the '<em>Apply Function Alpha</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLY_FUNCTION_ALPHA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FunctionArgumentsImpl <em>Function Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FunctionArgumentsImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionArguments()
   * @generated
   */
  int FUNCTION_ARGUMENTS = 8;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENTS__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Function Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.LiteralExprImpl <em>Literal Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.LiteralExprImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getLiteralExpr()
   * @generated
   */
  int LITERAL_EXPR = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPR__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.SymbolReferenceImpl <em>Symbol Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.SymbolReferenceImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getSymbolReference()
   * @generated
   */
  int SYMBOL_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REFERENCE__ID = 0;

  /**
   * The number of structural features of the '<em>Symbol Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.VariableAssignmentImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getVariableAssignment()
   * @generated
   */
  int VARIABLE_ASSIGNMENT = 11;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__SYMBOL = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.NumericExpressionImpl <em>Numeric Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.NumericExpressionImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getNumericExpression()
   * @generated
   */
  int NUMERIC_EXPRESSION = 12;

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
   * The meta object id for the '{@link org.arz.miniScript.impl.ExprTailImpl <em>Expr Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.ExprTailImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getExprTail()
   * @generated
   */
  int EXPR_TAIL = 13;

  /**
   * The feature id for the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TAIL__FACTOR = 0;

  /**
   * The feature id for the '<em><b>Expr Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TAIL__EXPR_TAIL = 1;

  /**
   * The number of structural features of the '<em>Expr Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_TAIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FactorImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 14;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__TERM = 0;

  /**
   * The feature id for the '<em><b>Factor Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__FACTOR_TAIL = 1;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.arz.miniScript.impl.FactorTailImpl <em>Factor Tail</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.arz.miniScript.impl.FactorTailImpl
   * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFactorTail()
   * @generated
   */
  int FACTOR_TAIL = 15;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL__TERM = 0;

  /**
   * The feature id for the '<em><b>Factor Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL__FACTOR_TAIL = 1;

  /**
   * The number of structural features of the '<em>Factor Tail</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_TAIL_FEATURE_COUNT = 2;


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
   * Returns the meta object for the containment reference list '{@link org.arz.miniScript.Program#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression</em>'.
   * @see org.arz.miniScript.Program#getExpression()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Expression();

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
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.FunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see org.arz.miniScript.FunctionDeclaration#getParameters()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Parameters();

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
   * Returns the meta object for class '{@link org.arz.miniScript.FunctionParameters <em>Function Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Parameters</em>'.
   * @see org.arz.miniScript.FunctionParameters
   * @generated
   */
  EClass getFunctionParameters();

  /**
   * Returns the meta object for the attribute list '{@link org.arz.miniScript.FunctionParameters#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see org.arz.miniScript.FunctionParameters#getParameters()
   * @see #getFunctionParameters()
   * @generated
   */
  EAttribute getFunctionParameters_Parameters();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.ApplyFunction <em>Apply Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Function</em>'.
   * @see org.arz.miniScript.ApplyFunction
   * @generated
   */
  EClass getApplyFunction();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ApplyFunction#getFunctor <em>Functor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functor</em>'.
   * @see org.arz.miniScript.ApplyFunction#getFunctor()
   * @see #getApplyFunction()
   * @generated
   */
  EReference getApplyFunction_Functor();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ApplyFunction#getApp3 <em>App3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>App3</em>'.
   * @see org.arz.miniScript.ApplyFunction#getApp3()
   * @see #getApplyFunction()
   * @generated
   */
  EReference getApplyFunction_App3();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.ApplyFunctionAlpha <em>Apply Function Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Apply Function Alpha</em>'.
   * @see org.arz.miniScript.ApplyFunctionAlpha
   * @generated
   */
  EClass getApplyFunctionAlpha();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ApplyFunctionAlpha#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Args</em>'.
   * @see org.arz.miniScript.ApplyFunctionAlpha#getArgs()
   * @see #getApplyFunctionAlpha()
   * @generated
   */
  EReference getApplyFunctionAlpha_Args();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ApplyFunctionAlpha#getNextCall <em>Next Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next Call</em>'.
   * @see org.arz.miniScript.ApplyFunctionAlpha#getNextCall()
   * @see #getApplyFunctionAlpha()
   * @generated
   */
  EReference getApplyFunctionAlpha_NextCall();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.FunctionArguments <em>Function Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Arguments</em>'.
   * @see org.arz.miniScript.FunctionArguments
   * @generated
   */
  EClass getFunctionArguments();

  /**
   * Returns the meta object for the containment reference list '{@link org.arz.miniScript.FunctionArguments#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see org.arz.miniScript.FunctionArguments#getArguments()
   * @see #getFunctionArguments()
   * @generated
   */
  EReference getFunctionArguments_Arguments();

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
   * Returns the meta object for class '{@link org.arz.miniScript.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment</em>'.
   * @see org.arz.miniScript.VariableAssignment
   * @generated
   */
  EClass getVariableAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.VariableAssignment#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbol</em>'.
   * @see org.arz.miniScript.VariableAssignment#getSymbol()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Symbol();

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
   * Returns the meta object for class '{@link org.arz.miniScript.ExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Tail</em>'.
   * @see org.arz.miniScript.ExprTail
   * @generated
   */
  EClass getExprTail();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ExprTail#getFactor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Factor</em>'.
   * @see org.arz.miniScript.ExprTail#getFactor()
   * @see #getExprTail()
   * @generated
   */
  EReference getExprTail_Factor();

  /**
   * Returns the meta object for the containment reference '{@link org.arz.miniScript.ExprTail#getExprTail <em>Expr Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr Tail</em>'.
   * @see org.arz.miniScript.ExprTail#getExprTail()
   * @see #getExprTail()
   * @generated
   */
  EReference getExprTail_ExprTail();

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
   * Returns the meta object for class '{@link org.arz.miniScript.FactorTail <em>Factor Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor Tail</em>'.
   * @see org.arz.miniScript.FactorTail
   * @generated
   */
  EClass getFactorTail();

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
   * Returns the meta object for class '{@link org.arz.miniScript.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.arz.miniScript.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link org.arz.miniScript.ParenthesisExpression <em>Parenthesis Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parenthesis Expression</em>'.
   * @see org.arz.miniScript.ParenthesisExpression
   * @generated
   */
  EClass getParenthesisExpression();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__EXPRESSION = eINSTANCE.getProgram_Expression();

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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getFunctionDeclaration_Parameters();

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
     * The meta object literal for the '{@link org.arz.miniScript.impl.FunctionParametersImpl <em>Function Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.FunctionParametersImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionParameters()
     * @generated
     */
    EClass FUNCTION_PARAMETERS = eINSTANCE.getFunctionParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PARAMETERS__PARAMETERS = eINSTANCE.getFunctionParameters_Parameters();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ApplyFunctionImpl <em>Apply Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ApplyFunctionImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApplyFunction()
     * @generated
     */
    EClass APPLY_FUNCTION = eINSTANCE.getApplyFunction();

    /**
     * The meta object literal for the '<em><b>Functor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_FUNCTION__FUNCTOR = eINSTANCE.getApplyFunction_Functor();

    /**
     * The meta object literal for the '<em><b>App3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_FUNCTION__APP3 = eINSTANCE.getApplyFunction_App3();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ApplyFunctionAlphaImpl <em>Apply Function Alpha</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ApplyFunctionAlphaImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getApplyFunctionAlpha()
     * @generated
     */
    EClass APPLY_FUNCTION_ALPHA = eINSTANCE.getApplyFunctionAlpha();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_FUNCTION_ALPHA__ARGS = eINSTANCE.getApplyFunctionAlpha_Args();

    /**
     * The meta object literal for the '<em><b>Next Call</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPLY_FUNCTION_ALPHA__NEXT_CALL = eINSTANCE.getApplyFunctionAlpha_NextCall();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.FunctionArgumentsImpl <em>Function Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.FunctionArgumentsImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getFunctionArguments()
     * @generated
     */
    EClass FUNCTION_ARGUMENTS = eINSTANCE.getFunctionArguments();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_ARGUMENTS__ARGUMENTS = eINSTANCE.getFunctionArguments_Arguments();

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
     * The meta object literal for the '{@link org.arz.miniScript.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.VariableAssignmentImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getVariableAssignment()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__SYMBOL = eINSTANCE.getVariableAssignment_Symbol();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

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
     * The meta object literal for the '{@link org.arz.miniScript.impl.ExprTailImpl <em>Expr Tail</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ExprTailImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getExprTail()
     * @generated
     */
    EClass EXPR_TAIL = eINSTANCE.getExprTail();

    /**
     * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_TAIL__FACTOR = eINSTANCE.getExprTail_Factor();

    /**
     * The meta object literal for the '<em><b>Expr Tail</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_TAIL__EXPR_TAIL = eINSTANCE.getExprTail_ExprTail();

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
     * The meta object literal for the '{@link org.arz.miniScript.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.TermImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link org.arz.miniScript.impl.ParenthesisExpressionImpl <em>Parenthesis Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.arz.miniScript.impl.ParenthesisExpressionImpl
     * @see org.arz.miniScript.impl.MiniScriptPackageImpl#getParenthesisExpression()
     * @generated
     */
    EClass PARENTHESIS_EXPRESSION = eINSTANCE.getParenthesisExpression();

  }

} //MiniScriptPackage
