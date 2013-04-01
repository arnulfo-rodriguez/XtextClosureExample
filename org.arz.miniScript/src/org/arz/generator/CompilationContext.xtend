package org.arz.generator

import java.util.HashSet
import java.util.Collection
import java.util.ArrayList

class SymbolKind 
{
   public val String name;
   
   private new(String name){
   	 this.name = name;
   }
   
   public static val SymbolKind Parameter = new SymbolKind("Parameter")
   public static val SymbolKind Variable = new SymbolKind("Variable")
	
}

class Symbol {
	private val String name;
	private val SymbolKind kind;
	
	public new(String name,SymbolKind kind)
	{
		this.name = name;
		this.kind = kind;
	}
	
	def public String getName(){
		 name;
	}
	
	def public SymbolKind getKind()
	{
		 kind;
	}
}

class CompilationContext {
	
	val HashSet<Symbol> symbols = new HashSet<Symbol>();
	val Collection<String> innerClasses = new ArrayList<String>();
	@Property var String currentClassName;
	private static int clazzCount = 0;
	private static val String classNamePrefix = "Closure"

	
	CompilationContext parent;
	
		
	private new(CompilationContext parent)
	{
		this.parent = parent;
	}
	
	def static CompilationContext getRootContext()
	{
		new CompilationContext(null);
	}
	
	def CompilationContext newChildContext()
	{
		new CompilationContext(this)
	}
	
	def void addClass(String clazz)
	{
		innerClasses.add(clazz);
	}
	
	def Iterable<String> getClasses()
	{
		innerClasses;
	}
	
	
	def void addVariable(String symbol)
	{
		if (!hasSymbol(symbol))
		{
		   symbols.add(new Symbol(symbol,SymbolKind::Variable));
		 }
	}
	
	def String generateClassName()
	{
		clazzCount = clazzCount + 1;
		 currentClassName = '''«classNamePrefix»_«clazzCount»'''
		 return currentClassName;
	}
	
	def String getCurrenctClassName()
	{
		 if (currentClassName != null)
		 {
		 	currentClassName
		 }else{
		 	parent.getCurrentClassName
		 }
	}
	
	def void addParameter(String symbol)
	{
		if (!hasSymbolLocally(symbol))
		    symbols.add(new Symbol(symbol,SymbolKind::Parameter));
	}
	
	def boolean hasSymbolLocally(String name)
	{
		symbols.findFirst[symbol | symbol.name.equals(name)] != null
	}
	
	def boolean hasSymbol(String name)
	{
		 hasSymbolLocally(name) || (parent != null && parent.hasSymbol(name))
	}
	
	def Iterable<String> getLocalSymbols()
	{
		symbols.map[symbol | symbol.name]
	}
		
}

