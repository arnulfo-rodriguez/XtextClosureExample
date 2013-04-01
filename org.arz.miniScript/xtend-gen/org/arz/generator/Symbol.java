package org.arz.generator;

import org.arz.generator.SymbolKind;

@SuppressWarnings("all")
public class Symbol {
  private final String name;
  
  private final SymbolKind kind;
  
  public Symbol(final String name, final SymbolKind kind) {
    this.name = name;
    this.kind = kind;
  }
  
  public String getName() {
    return this.name;
  }
  
  public SymbolKind getKind() {
    return this.kind;
  }
}
