package org.arz.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.arz.generator.CompilationContext;
import org.arz.miniScript.AdditionOperator;
import org.arz.miniScript.Apply;
import org.arz.miniScript.BinaryLogicalOperator;
import org.arz.miniScript.Body;
import org.arz.miniScript.BooleanValue;
import org.arz.miniScript.ComparisonExpression;
import org.arz.miniScript.ComparisonOperator;
import org.arz.miniScript.Expression;
import org.arz.miniScript.Factor;
import org.arz.miniScript.FactorOperator;
import org.arz.miniScript.FunctionDeclaration;
import org.arz.miniScript.LetExpression;
import org.arz.miniScript.LiteralBoolean;
import org.arz.miniScript.LiteralNumber;
import org.arz.miniScript.LogicalBinaryExpression;
import org.arz.miniScript.LogicalUnaryExpression;
import org.arz.miniScript.NumericExpression;
import org.arz.miniScript.Program;
import org.arz.miniScript.SymbolReference;
import org.arz.miniScript.TernaryExpression;
import org.arz.miniScript.TernaryOperator;
import org.arz.miniScript.UnaryLogicalOperator;
import org.arz.miniScript.VariableAssignment;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MiniScriptGenerator implements IGenerator {
  private String numericType = "Double";
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String[] _segments = _uRI.segments();
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_segments)));
    URI _uRI_1 = resource.getURI();
    String _fileExtension = _uRI_1.fileExtension();
    String _plus = ("." + _fileExtension);
    String name = _last.replace(_plus, "");
    String _plus_1 = (name + ".java");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Program> _filter = Iterators.<Program>filter(_allContents, Program.class);
    Program _head = IteratorExtensions.<Program>head(_filter);
    String _doCompileProgram = this.doCompileProgram(_head, name);
    fsa.generateFile(_plus_1, _doCompileProgram);
  }
  
  public String doCompileProgram(final Program program, final String name) {
    String _xblockexpression = null;
    {
      CompilationContext rootContext = CompilationContext.getRootContext();
      EList<Expression> _expressions = program.getExpressions();
      String code = this.doCompileStatementSequence(_expressions, rootContext);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class ");
      _builder.append(name, "");
      _builder.newLineIfNotEmpty();
      _builder.append("    \t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("    \t    ");
      String _doGenerateInnerClasses = this.doGenerateInnerClasses(rootContext);
      _builder.append(_doGenerateInnerClasses, "    	    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    \t\t");
      String _doGenerateFieldDeclarations = this.doGenerateFieldDeclarations(rootContext);
      _builder.append(_doGenerateFieldDeclarations, "    		");
      _builder.newLineIfNotEmpty();
      _builder.append("    \t\t");
      _builder.append("public Object eval()");
      _builder.newLine();
      _builder.append("    \t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("   \t\t\t   ");
      _builder.append(code, "   			   ");
      _builder.newLineIfNotEmpty();
      _builder.append("    \t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("}");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public String doGenerateFieldDeclarations(final CompilationContext context) {
    Iterable<String> _localSymbols = context.getLocalSymbols();
    final Function1<String,CharSequence> _function = new Function1<String,CharSequence>() {
        public CharSequence apply(final String symbol) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Object ");
          _builder.append(symbol, "");
          _builder.append(";");
          return _builder;
        }
      };
    Iterable<CharSequence> _map = IterableExtensions.<String, CharSequence>map(_localSymbols, _function);
    String _join = IterableExtensions.join(_map, "\n");
    return _join;
  }
  
  public String doCompileStatementSequence(final List<Expression> l, final CompilationContext context) {
    final Function1<Expression,String> _function = new Function1<Expression,String>() {
        public String apply(final Expression exp) {
          String _doCompileExpression = MiniScriptGenerator.this.doCompileExpression(exp, context);
          return _doCompileExpression;
        }
      };
    List<String> _map = ListExtensions.<Expression, String>map(l, _function);
    ArrayList<String> _arrayList = new ArrayList<String>(_map);
    List<String> rerversedList = ListExtensions.<String>reverse(_arrayList);
    LinkedList<String> _linkedList = new LinkedList<String>();
    LinkedList<String> newList = _linkedList;
    String _head = IterableExtensions.<String>head(rerversedList);
    String _plus = ("return " + _head);
    newList.add(_plus);
    Iterable<String> _tail = IterableExtensions.<String>tail(rerversedList);
    Iterables.<String>addAll(newList, _tail);
    List<String> _reverse = ListExtensions.<String>reverse(newList);
    final Function1<String,String> _function_1 = new Function1<String,String>() {
        public String apply(final String str) {
          String _plus = (str + ";");
          return _plus;
        }
      };
    List<String> _map_1 = ListExtensions.<String, String>map(_reverse, _function_1);
    return IterableExtensions.join(_map_1, "\n");
  }
  
  public String doCompileExpression(final Expression e, final CompilationContext context) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof FunctionDeclaration) {
        final FunctionDeclaration _functionDeclaration = (FunctionDeclaration)e;
        _matched=true;
        String _doCompileFunctionDeclaration = this.doCompileFunctionDeclaration(_functionDeclaration, context);
        _switchResult = _doCompileFunctionDeclaration;
      }
    }
    if (!_matched) {
      if (e instanceof VariableAssignment) {
        final VariableAssignment _variableAssignment = (VariableAssignment)e;
        _matched=true;
        String _doCompileVariableAssignment = this.doCompileVariableAssignment(_variableAssignment, context);
        _switchResult = _doCompileVariableAssignment;
      }
    }
    if (!_matched) {
      if (e instanceof LogicalBinaryExpression) {
        final LogicalBinaryExpression _logicalBinaryExpression = (LogicalBinaryExpression)e;
        _matched=true;
        String _doCompileLogicalBinaryExpression = this.doCompileLogicalBinaryExpression(_logicalBinaryExpression, context);
        _switchResult = _doCompileLogicalBinaryExpression;
      }
    }
    if (!_matched) {
      if (e instanceof LogicalUnaryExpression) {
        final LogicalUnaryExpression _logicalUnaryExpression = (LogicalUnaryExpression)e;
        _matched=true;
        String _doCompileLogicalUnaryExpression = this.doCompileLogicalUnaryExpression(_logicalUnaryExpression, context);
        _switchResult = _doCompileLogicalUnaryExpression;
      }
    }
    if (!_matched) {
      if (e instanceof TernaryExpression) {
        final TernaryExpression _ternaryExpression = (TernaryExpression)e;
        _matched=true;
        String _doCompileTernaryExpression = this.doCompileTernaryExpression(_ternaryExpression, context);
        _switchResult = _doCompileTernaryExpression;
      }
    }
    if (!_matched) {
      if (e instanceof ComparisonExpression) {
        final ComparisonExpression _comparisonExpression = (ComparisonExpression)e;
        _matched=true;
        String _doCompileComparisonExpression = this.doCompileComparisonExpression(_comparisonExpression, context);
        _switchResult = _doCompileComparisonExpression;
      }
    }
    if (!_matched) {
      if (e instanceof NumericExpression) {
        final NumericExpression _numericExpression = (NumericExpression)e;
        _matched=true;
        String _doCompileNumericExpression = this.doCompileNumericExpression(_numericExpression, context);
        _switchResult = _doCompileNumericExpression;
      }
    }
    if (!_matched) {
      if (e instanceof LiteralNumber) {
        final LiteralNumber _literalNumber = (LiteralNumber)e;
        _matched=true;
        String _doCompileLiteralNumber = this.doCompileLiteralNumber(_literalNumber, context);
        _switchResult = _doCompileLiteralNumber;
      }
    }
    if (!_matched) {
      if (e instanceof LiteralBoolean) {
        final LiteralBoolean _literalBoolean = (LiteralBoolean)e;
        _matched=true;
        String _doCompileLiteralBoolean = this.doCompileLiteralBoolean(_literalBoolean, context);
        _switchResult = _doCompileLiteralBoolean;
      }
    }
    if (!_matched) {
      if (e instanceof Apply) {
        final Apply _apply = (Apply)e;
        _matched=true;
        String _doCompileApply = this.doCompileApply(_apply, context);
        _switchResult = _doCompileApply;
      }
    }
    if (!_matched) {
      if (e instanceof SymbolReference) {
        final SymbolReference _symbolReference = (SymbolReference)e;
        _matched=true;
        String _doCompileSymbolReference = this.doCompileSymbolReference(_symbolReference, context);
        _switchResult = _doCompileSymbolReference;
      }
    }
    if (!_matched) {
      if (e instanceof Factor) {
        final Factor _factor = (Factor)e;
        _matched=true;
        String _doCompileFactor = this.doCompileFactor(_factor, context);
        _switchResult = _doCompileFactor;
      }
    }
    if (!_matched) {
      if (e instanceof LetExpression) {
        final LetExpression _letExpression = (LetExpression)e;
        _matched=true;
        String _doCompileLetExpression = this.doCompileLetExpression(_letExpression, context);
        _switchResult = _doCompileLetExpression;
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public String doCompileLetExpression(final LetExpression LetExpression, final CompilationContext context) {
    String _xblockexpression = null;
    {
      CompilationContext newContext = context.newChildContext();
      VariableAssignment _assigment = LetExpression.getAssigment();
      Expression _expression = LetExpression.getExpression();
      ArrayList<Expression> _newArrayList = CollectionLiterals.<Expression>newArrayList(_assigment, _expression);
      CharSequence bodyCode = this.doCompileLetBody(_newArrayList, newContext);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new  org.arz.runtime.Closure()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t        ");
      String _doGenerateInnerClasses = this.doGenerateInnerClasses(newContext);
      _builder.append(_doGenerateInnerClasses, "		        ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t    ");
      String _doGenerateFieldDeclarations = this.doGenerateFieldDeclarations(newContext);
      _builder.append(_doGenerateFieldDeclarations, "			    ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t");
      _builder.append(bodyCode, "				");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("}.apply()");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public CharSequence doCompileLetBody(final List<Expression> expressions, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("@Override public Object apply(Object...arguments)");
    _builder.newLine();
    _builder.append("\t       ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t       \t ");
    String _doCompileStatementSequence = this.doCompileStatementSequence(expressions, context);
    _builder.append(_doCompileStatementSequence, "	       	 ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t  \t   ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String doCompileSymbolReference(final SymbolReference symbolReference, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    String _id = symbolReference.getId();
    _builder.append(_id, "");
    return _builder.toString();
  }
  
  public String doCompileApply(final Apply apply, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _functor = apply.getFunctor();
    String _doCompileExpression = this.doCompileExpression(_functor, context);
    String _cast = this.cast("org.arz.runtime.Closure", _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(".apply(");
    EList<Expression> _arguments = apply.getArguments();
    final Function1<Expression,String> _function = new Function1<Expression,String>() {
        public String apply(final Expression arg) {
          String _doCompileExpression = MiniScriptGenerator.this.doCompileExpression(arg, context);
          return _doCompileExpression;
        }
      };
    List<String> _map = ListExtensions.<Expression, String>map(_arguments, _function);
    String _join = IterableExtensions.join(_map, ",");
    _builder.append(_join, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String doCompileLiteralNumber(final LiteralNumber literalNumber, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    _builder.append(this.numericType, "");
    _builder.append("(");
    int _value = literalNumber.getValue();
    String _string = Integer.valueOf(_value).toString();
    _builder.append(_string, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String doCompileLiteralBoolean(final LiteralBoolean literalBoolean, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new Boolean(");
    BooleanValue _value = literalBoolean.getValue();
    String _literal = _value.getLiteral();
    _builder.append(_literal, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String doCompileFactor(final Factor factor, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _leftTerm = factor.getLeftTerm();
    String _doCompileExpression = this.doCompileExpression(_leftTerm, context);
    String _cast = this.cast(this.numericType, _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(" ");
    FactorOperator _operator = factor.getOperator();
    String _literal = _operator.getLiteral();
    _builder.append(_literal, "");
    _builder.append(" ");
    Expression _rightTerm = factor.getRightTerm();
    String _doCompileExpression_1 = this.doCompileExpression(_rightTerm, context);
    String _cast_1 = this.cast(this.numericType, _doCompileExpression_1);
    _builder.append(_cast_1, "");
    return _builder.toString();
  }
  
  public String doCompileNumericExpression(final NumericExpression numericExpression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _leftFactor = numericExpression.getLeftFactor();
    String _doCompileExpression = this.doCompileExpression(_leftFactor, context);
    String _cast = this.cast(this.numericType, _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(" ");
    AdditionOperator _operator = numericExpression.getOperator();
    String _literal = _operator.getLiteral();
    _builder.append(_literal, "");
    _builder.append(" ");
    Expression _rightFactor = numericExpression.getRightFactor();
    String _doCompileExpression_1 = this.doCompileExpression(_rightFactor, context);
    String _cast_1 = this.cast(this.numericType, _doCompileExpression_1);
    _builder.append(_cast_1, "");
    return _builder.toString();
  }
  
  public String doCompileFunctionDeclaration(final FunctionDeclaration functionDeclaration, final CompilationContext context) {
    String _xblockexpression = null;
    {
      CompilationContext newContext = context.newChildContext();
      String clazzName = newContext.generateClassName();
      EList<String> _parameters = functionDeclaration.getParameters();
      Body _body = functionDeclaration.getBody();
      EList<Expression> _expressions = _body.getExpressions();
      String code = this.doCompileExecuteBody(_parameters, _expressions, newContext);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class ");
      _builder.append(clazzName, "");
      _builder.append(" implements org.arz.runtime.Closure");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t    ");
      String _doGenerateInnerClasses = this.doGenerateInnerClasses(newContext);
      _builder.append(_doGenerateInnerClasses, "		    ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t    ");
      String _doGenerateFieldDeclarations = this.doGenerateFieldDeclarations(newContext);
      _builder.append(_doGenerateFieldDeclarations, "		    ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append(code, "			");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      String clazz = _builder.toString();
      context.addClass(clazz);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("new ");
      _builder_1.append(clazzName, "");
      _builder_1.append("()");
      _xblockexpression = (_builder_1.toString());
    }
    return _xblockexpression;
  }
  
  public String doGenerateInnerClasses(final CompilationContext context) {
    Iterable<String> _classes = context.getClasses();
    String _join = IterableExtensions.join(_classes, "\n");
    return _join;
  }
  
  public String doCompileExecuteBody(final List<String> parameters, final List<Expression> expressions, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("private boolean __invoked__= false;");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@Override public Object apply(Object...arguments)");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("if (__invoked__)");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("  \t  ");
    _builder.append("return new ");
    String _currenctClassName = context.getCurrenctClassName();
    _builder.append(_currenctClassName, "  	  ");
    _builder.append("().applyImpl(arguments);");
    _builder.newLineIfNotEmpty();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("__invoked__ = true;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("return applyImpl(arguments);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("private Object applyImpl(Object[] arguments) {");
    _builder.newLine();
    _builder.append("\t");
    String _doCompileSetupArguments = this.doCompileSetupArguments(parameters, context);
    _builder.append(_doCompileSetupArguments, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _doCompileStatementSequence = this.doCompileStatementSequence(expressions, context);
    _builder.append(_doCompileStatementSequence, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String doCompileSetupArguments(final List<String> list, final CompilationContext context) {
    String _xblockexpression = null;
    {
      final Procedure1<String> _function = new Procedure1<String>() {
          public void apply(final String parameter) {
            context.addParameter(parameter);
          }
        };
      IterableExtensions.<String>forEach(list, _function);
      String _xifexpression = null;
      int _size = list.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        int _size_1 = list.size();
        int _minus = (_size_1 - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        final Function1<Integer,CharSequence> _function_1 = new Function1<Integer,CharSequence>() {
            public CharSequence apply(final Integer i) {
              StringConcatenation _builder = new StringConcatenation();
              String _get = list.get((i).intValue());
              _builder.append(_get, "");
              _builder.append(" = arguments[");
              _builder.append(i, "");
              _builder.append("];");
              return _builder;
            }
          };
        Iterable<CharSequence> _map = IterableExtensions.<Integer, CharSequence>map(_upTo, _function_1);
        String _join = IterableExtensions.join(_map, "\n");
        _xifexpression = _join;
      } else {
        _xifexpression = "";
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String doCompileVariableAssignment(final VariableAssignment variableAssignment, final CompilationContext context) {
    String _xblockexpression = null;
    {
      String _id = variableAssignment.getId();
      context.addVariable(_id);
      StringConcatenation _builder = new StringConcatenation();
      String _id_1 = variableAssignment.getId();
      _builder.append(_id_1, "");
      _builder.append(" = ");
      Expression _expression = variableAssignment.getExpression();
      String _doCompileExpression = this.doCompileExpression(_expression, context);
      _builder.append(_doCompileExpression, "");
      _xblockexpression = (_builder.toString());
    }
    return _xblockexpression;
  }
  
  public String doCompileLogicalBinaryExpression(final LogicalBinaryExpression logicalBinaryExpression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _leftExpr = logicalBinaryExpression.getLeftExpr();
    String _doCompileExpression = this.doCompileExpression(_leftExpr, context);
    String _cast = this.cast("Boolean", _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(" ");
    BinaryLogicalOperator _operator = logicalBinaryExpression.getOperator();
    String _javaLogicalOperator = this.getJavaLogicalOperator(_operator);
    _builder.append(_javaLogicalOperator, "");
    _builder.append(" ");
    Expression _rightExpr = logicalBinaryExpression.getRightExpr();
    String _doCompileExpression_1 = this.doCompileExpression(_rightExpr, context);
    String _cast_1 = this.cast("Boolean", _doCompileExpression_1);
    _builder.append(_cast_1, "");
    return _builder.toString();
  }
  
  public String doCompileLogicalUnaryExpression(final LogicalUnaryExpression logicalUnaryExpression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(!");
    Expression _expression = logicalUnaryExpression.getExpression();
    String _doCompileExpression = this.doCompileExpression(_expression, context);
    String _cast = this.cast("Boolean", _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String doCompileTernaryExpression(final TernaryExpression ternaryExpression, final CompilationContext context) {
    String _switchResult = null;
    TernaryOperator _operator = ternaryExpression.getOperator();
    final TernaryOperator _switchValue = _operator;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(_switchValue,TernaryOperator.IF_EXPRESSION)) {
        _matched=true;
        String _compileIf = this.compileIf(ternaryExpression, context);
        _switchResult = _compileIf;
      }
    }
    return _switchResult;
  }
  
  public String compileIf(final TernaryExpression expression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _firstExpression = expression.getFirstExpression();
    String _doCompileExpression = this.doCompileExpression(_firstExpression, context);
    String _cast = this.cast("Boolean", _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(" ? ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("(");
    Expression _secondExpression = expression.getSecondExpression();
    String _doCompileExpression_1 = this.doCompileExpression(_secondExpression, context);
    _builder.append(_doCompileExpression_1, "		");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("(");
    Expression _thirdExpression = expression.getThirdExpression();
    String _doCompileExpression_2 = this.doCompileExpression(_thirdExpression, context);
    _builder.append(_doCompileExpression_2, "		");
    _builder.append(")");
    return _builder.toString();
  }
  
  public String doCompileComparisonExpression(final ComparisonExpression comparisonExpression, final CompilationContext context) {
    String _xifexpression = null;
    boolean _isEqualityExpression = this.isEqualityExpression(comparisonExpression);
    if (_isEqualityExpression) {
      String _doCompileEquality = this.doCompileEquality(comparisonExpression, context);
      _xifexpression = _doCompileEquality;
    } else {
      String _doCompileInequality = this.doCompileInequality(comparisonExpression, context);
      _xifexpression = _doCompileInequality;
    }
    return _xifexpression;
  }
  
  public String doCompileInequality(final ComparisonExpression expression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _leftExpr = expression.getLeftExpr();
    String _doCompileExpression = this.doCompileExpression(_leftExpr, context);
    String _cast = this.cast(this.numericType, _doCompileExpression);
    _builder.append(_cast, "");
    _builder.append(" ");
    ComparisonOperator _operator = expression.getOperator();
    String _literal = _operator.getLiteral();
    _builder.append(_literal, "");
    _builder.append(" ");
    Expression _rightExpr = expression.getRightExpr();
    String _doCompileExpression_1 = this.doCompileExpression(_rightExpr, context);
    String _cast_1 = this.cast(this.numericType, _doCompileExpression_1);
    _builder.append(_cast_1, "");
    return _builder.toString();
  }
  
  public String doCompileEquality(final ComparisonExpression expression, final CompilationContext context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _leftExpr = expression.getLeftExpr();
    String _doCompileExpression = this.doCompileExpression(_leftExpr, context);
    _builder.append(_doCompileExpression, "");
    _builder.append(").equals(");
    Expression _rightExpr = expression.getRightExpr();
    String _doCompileExpression_1 = this.doCompileExpression(_rightExpr, context);
    _builder.append(_doCompileExpression_1, "");
    _builder.append(")");
    CharSequence result = _builder;
    ComparisonOperator _operator = expression.getOperator();
    boolean _equals = Objects.equal(_operator, ComparisonOperator.NOTEQ);
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("(!");
      _builder_1.append(result, "");
      _builder_1.append(")");
      result = _builder_1;
    }
    return result.toString();
  }
  
  public boolean isEqualityExpression(final ComparisonExpression expression) {
    boolean _or = false;
    ComparisonOperator _operator = expression.getOperator();
    boolean _equals = Objects.equal(_operator, ComparisonOperator.EQ);
    if (_equals) {
      _or = true;
    } else {
      ComparisonOperator _operator_1 = expression.getOperator();
      boolean _equals_1 = Objects.equal(_operator_1, ComparisonOperator.NOTEQ);
      _or = (_equals || _equals_1);
    }
    return _or;
  }
  
  public String cast(final String type, final String expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((");
    _builder.append(type, "");
    _builder.append(")(");
    _builder.append(expression, "");
    _builder.append("))");
    return _builder.toString();
  }
  
  public String getJavaLogicalOperator(final BinaryLogicalOperator operator) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(operator,BinaryLogicalOperator.AND)) {
        _matched=true;
        _switchResult = "&&";
      }
    }
    if (!_matched) {
      if (Objects.equal(operator,BinaryLogicalOperator.OR)) {
        _matched=true;
        _switchResult = "||";
      }
    }
    return _switchResult;
  }
  
  public String getJavaLogicalOperator(final UnaryLogicalOperator operator) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(operator,UnaryLogicalOperator.NOT)) {
        _matched=true;
        _switchResult = "!";
      }
    }
    return _switchResult;
  }
}
