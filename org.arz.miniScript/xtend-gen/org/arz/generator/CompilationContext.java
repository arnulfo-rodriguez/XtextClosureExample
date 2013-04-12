package org.arz.generator;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.arz.generator.Symbol;
import org.arz.generator.SymbolKind;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class CompilationContext {
  private final HashSet<Symbol> symbols = new Function0<HashSet<Symbol>>() {
    public HashSet<Symbol> apply() {
      HashSet<Symbol> _hashSet = new HashSet<Symbol>();
      return _hashSet;
    }
  }.apply();
  
  private final Collection<String> innerClasses = new Function0<Collection<String>>() {
    public Collection<String> apply() {
      ArrayList<String> _arrayList = new ArrayList<String>();
      return _arrayList;
    }
  }.apply();
  
  private final Collection<String> methods = new Function0<Collection<String>>() {
    public Collection<String> apply() {
      ArrayList<String> _arrayList = new ArrayList<String>();
      return _arrayList;
    }
  }.apply();
  
  private String _currentClassName;
  
  public String getCurrentClassName() {
    return this._currentClassName;
  }
  
  public void setCurrentClassName(final String currentClassName) {
    this._currentClassName = currentClassName;
  }
  
  private static int nameCount = 0;
  
  private final static String classNamePrefix = "Closure";
  
  private CompilationContext parent;
  
  private CompilationContext(final CompilationContext parent) {
    this.parent = parent;
  }
  
  public static CompilationContext getRootContext() {
    CompilationContext _compilationContext = new CompilationContext(null);
    return _compilationContext;
  }
  
  public CompilationContext newChildContext() {
    CompilationContext _compilationContext = new CompilationContext(this);
    return _compilationContext;
  }
  
  public void addClass(final String clazz) {
    this.innerClasses.add(clazz);
  }
  
  public Iterable<String> getClasses() {
    return this.innerClasses;
  }
  
  public void addVariable(final String symbol) {
    boolean _hasSymbol = this.hasSymbol(symbol);
    boolean _not = (!_hasSymbol);
    if (_not) {
      Symbol _symbol = new Symbol(symbol, SymbolKind.Variable);
      this.symbols.add(_symbol);
    }
  }
  
  public String generateClassName() {
    int _plus = (CompilationContext.nameCount + 1);
    CompilationContext.nameCount = _plus;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(CompilationContext.classNamePrefix, "");
    _builder.append("_");
    _builder.append(CompilationContext.nameCount, "");
    this.setCurrentClassName(_builder.toString());
    return this.getCurrentClassName();
  }
  
  public String generateMethodName(final String prefix) {
    int _plus = (CompilationContext.nameCount + 1);
    CompilationContext.nameCount = _plus;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(prefix, "");
    _builder.append("_");
    _builder.append(CompilationContext.nameCount, "");
    return _builder.toString();
  }
  
  public String getCurrenctClassName() {
    String _xifexpression = null;
    String _currentClassName = this.getCurrentClassName();
    boolean _notEquals = (!Objects.equal(_currentClassName, null));
    if (_notEquals) {
      String _currentClassName_1 = this.getCurrentClassName();
      _xifexpression = _currentClassName_1;
    } else {
      String _currentClassName_2 = this.parent.getCurrentClassName();
      _xifexpression = _currentClassName_2;
    }
    return _xifexpression;
  }
  
  public void addParameter(final String symbol) {
    boolean _hasSymbolLocally = this.hasSymbolLocally(symbol);
    boolean _not = (!_hasSymbolLocally);
    if (_not) {
      Symbol _symbol = new Symbol(symbol, SymbolKind.Parameter);
      this.symbols.add(_symbol);
    }
  }
  
  public boolean hasSymbolLocally(final String name) {
    final Function1<Symbol,Boolean> _function = new Function1<Symbol,Boolean>() {
        public Boolean apply(final Symbol symbol) {
          String _name = symbol.getName();
          boolean _equals = _name.equals(name);
          return Boolean.valueOf(_equals);
        }
      };
    Symbol _findFirst = IterableExtensions.<Symbol>findFirst(this.symbols, _function);
    boolean _notEquals = (!Objects.equal(_findFirst, null));
    return _notEquals;
  }
  
  public boolean hasSymbol(final String name) {
    boolean _or = false;
    boolean _hasSymbolLocally = this.hasSymbolLocally(name);
    if (_hasSymbolLocally) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(this.parent, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _hasSymbol = this.parent.hasSymbol(name);
        _and = (_notEquals && _hasSymbol);
      }
      _or = (_hasSymbolLocally || _and);
    }
    return _or;
  }
  
  public Iterable<String> getLocalSymbols() {
    final Function1<Symbol,String> _function = new Function1<Symbol,String>() {
        public String apply(final Symbol symbol) {
          String _name = symbol.getName();
          return _name;
        }
      };
    Iterable<String> _map = IterableExtensions.<Symbol, String>map(this.symbols, _function);
    return _map;
  }
  
  public void addMethod(final String method) {
    this.methods.add(method);
  }
  
  public Iterable<String> getMethods() {
    return this.methods;
  }
}
