package org.arz.generator;

import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class SymbolKind {
  public final String name;
  
  private SymbolKind(final String name) {
    this.name = name;
  }
  
  public final static SymbolKind Parameter = new Function0<SymbolKind>() {
    public SymbolKind apply() {
      SymbolKind _symbolKind = new SymbolKind("Parameter");
      return _symbolKind;
    }
  }.apply();
  
  public final static SymbolKind Variable = new Function0<SymbolKind>() {
    public SymbolKind apply() {
      SymbolKind _symbolKind = new SymbolKind("Variable");
      return _symbolKind;
    }
  }.apply();
}
