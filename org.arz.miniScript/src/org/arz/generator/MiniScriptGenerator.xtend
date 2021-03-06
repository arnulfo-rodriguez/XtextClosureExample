/*
 * generated by Xtext
 */
package org.arz.generator

import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import org.arz.miniScript.Apply
import org.arz.miniScript.BinaryLogicalOperator
import org.arz.miniScript.BlockExpression
import org.arz.miniScript.ComparisonExpression
import org.arz.miniScript.ComparisonOperator
import org.arz.miniScript.Expression
import org.arz.miniScript.Factor
import org.arz.miniScript.FunctionDeclaration
import org.arz.miniScript.LetExpression
import org.arz.miniScript.LiteralBoolean
import org.arz.miniScript.LiteralNumber
import org.arz.miniScript.LogicalBinaryExpression
import org.arz.miniScript.LogicalUnaryExpression
import org.arz.miniScript.NumericExpression
import org.arz.miniScript.Program
import org.arz.miniScript.SymbolReference
import org.arz.miniScript.TernaryExpression
import org.arz.miniScript.TernaryOperator
import org.arz.miniScript.UnaryLogicalOperator
import org.arz.miniScript.VariableAssignment
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class MiniScriptGenerator implements IGenerator {
	
	private String numericType="Double"
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var name = resource.URI.segments.last.replace("." + resource.URI.fileExtension,"")
		fsa.generateFile(name + ".java",doCompileProgram(resource.allContents.filter(typeof(Program)).head,name))
	}
	
	
    def String doCompileProgram(Program program,String name) { 
    	var rootContext = CompilationContext::getRootContext;
    	var code = doCompileStatementSequence(program.expressions,rootContext)
    	'''class «name»
    	{
    		interface Closure {public Object apply(Object...arguments);}
    		
    	    «doGenerateInnerClasses(rootContext)»
    	    «doGenerateMethods(rootContext)»
    		«doGenerateFieldDeclarations(rootContext)»
    		public Object eval()
    		{
   			   «code»
    		}
    	}'''
    }
    
	def doGenerateFieldDeclarations(CompilationContext context) { 
		context.getLocalSymbols().map[symbol | '''Object «symbol»;'''].join("\n")
	}
    
	def String doCompileStatementSequence(List<Expression> l,CompilationContext context) { 
		var rerversedList =  new ArrayList(l.map[exp | doCompileExpression(exp,context)]).reverse
		var newList = new LinkedList<String>();
		newList.add(("return " + rerversedList.head));
		newList.addAll(rerversedList.tail);
		return newList.reverse.map[str | str + ";"].join("\n")
	}


	
def String doCompileExpression(Expression e, CompilationContext context)
{
	return switch(e)
	{
 		FunctionDeclaration  :  doCompileFunctionDeclaration(e,context)
 		VariableAssignment :  doCompileVariableAssignment(e,context)
	    LogicalBinaryExpression :  doCompileLogicalBinaryExpression(e,context)
		LogicalUnaryExpression :  doCompileLogicalUnaryExpression (e,context)
		TernaryExpression :  doCompileTernaryExpression (e,context)
		ComparisonExpression:  doCompileComparisonExpression(e,context)
		NumericExpression:  doCompileNumericExpression(e,context)
		LiteralNumber:  doCompileLiteralNumber(e,context)
		LiteralBoolean:  doCompileLiteralBoolean(e,context)
		Apply:  doCompileApply(e,context)
		SymbolReference:  doCompileSymbolReference(e,context)
		Factor:  doCompileFactor(e,context)
		LetExpression:  doCompileLetExpression(e,context)
		BlockExpression: doCompileBlockExpression(e,context)
		default: ""
    }
}
	def String doCompileBlockExpression(BlockExpression expression, CompilationContext context) {
		var methodName = context.generateMethodName("Block")
		var body = doCompileStatementSequence(expression.expressions,context)
		context.addMethod('''private Object «methodName»()
		{
			«body»
		}''')
		
		'''«methodName»()'''
	}

	def String doCompileLetExpression(LetExpression LetExpression,CompilationContext context) { 
		
		var newContext = context.newChildContext;
		var bodyCode = doCompileLetBody(LetExpression.assigment,LetExpression.expression,newContext)
	   
		'''new  Closure()
		{
		        «doGenerateInnerClasses(newContext)»
		        «doGenerateMethods(newContext)»
			    «doGenerateFieldDeclarations(newContext)»
				«bodyCode»
		}.apply()'''
		
	}
	
	def doGenerateMethods(CompilationContext context) { 
		context.methods.join('\n')
	}

	
	def doCompileLetBody(VariableAssignment assigment, Expression body, CompilationContext context) { 
		''' @Override public Object apply(Object...arguments)
	       {
	       	  «doCompileExpression(assigment,context)»;
	       	  return «doCompileExpression(body,context)»;
	  	   }
	  	'''
	}



def String doCompileSymbolReference(SymbolReference symbolReference,CompilationContext context){
	'''«symbolReference.id»'''
}

def String doCompileApply(Apply apply,CompilationContext context){
	'''«cast("Closure",doCompileExpression(apply.functor,context))».apply(«apply.arguments.map[arg | doCompileExpression(arg,context)].join(",")»)'''
}

def String doCompileLiteralNumber(LiteralNumber literalNumber,CompilationContext context){
	'''new «numericType»(«literalNumber.value.toString()»)'''
}

def String doCompileLiteralBoolean(LiteralBoolean literalBoolean,CompilationContext context){
	'''new Boolean(«literalBoolean.value.literal»)'''
}

def String doCompileFactor(Factor factor,CompilationContext context){
		'''«cast(numericType,doCompileExpression(factor.leftTerm,context))» «factor.operator.literal» «cast(numericType,doCompileExpression(factor.rightTerm,context))»'''
}
	
def String doCompileNumericExpression(NumericExpression numericExpression,CompilationContext context){
	'''«cast(numericType,doCompileExpression(numericExpression.leftFactor,context))» «numericExpression.operator.literal» «cast(numericType,doCompileExpression(numericExpression.rightFactor,context))»'''
}
	
	
def String doCompileFunctionDeclaration  (FunctionDeclaration   functionDeclaration,CompilationContext context){
	var newContext = context.newChildContext;
	var clazzName = newContext.generateClassName;
	var code = doCompileExecuteBody(functionDeclaration.parameters,functionDeclaration.body,newContext)
	var String clazz = '''class «clazzName» implements Closure
	{
		    «doGenerateInnerClasses(newContext)»
		    «doGenerateMethods(newContext)»
		    «doGenerateFieldDeclarations(newContext)»
			«code»
	}'''
	context.addClass(clazz);
	'''new «clazzName»()'''
}


def doGenerateInnerClasses(CompilationContext context) { 
	context.classes.join("\n");
}


def String doCompileExecuteBody(List<String> parameters, Expression body,CompilationContext context) { 
	'''
	 private boolean __invoked__= false;
	  @Override public Object apply(Object...arguments)
	  {
	  	if (__invoked__)
	  	{
	  	  return new «context.currenctClassName»().applyImpl(arguments);
	  	}
	  	__invoked__ = true;
	  	return applyImpl(arguments);
	  }
	  private Object applyImpl(Object[] arguments) {
		«doCompileSetupArguments(parameters,context)»
	 return «doCompileExpression(body,context)»;
	}
	'''
}


def String doCompileSetupArguments(List<String> list,CompilationContext context) {
	list.forEach[parameter | context.addParameter(parameter)]
	if (list.size > 0)
	{
	(0..list.size()-1).map[i | '''«list.get(i)» = arguments[«i»];'''].join("\n")
    } else {
    	""
    }
} 


def String doCompileVariableAssignment (VariableAssignment  variableAssignment,CompilationContext context ){
	context.addVariable(variableAssignment.id)
	'''«variableAssignment.id» = «doCompileExpression(variableAssignment.expression,context)»'''
}

def String doCompileLogicalBinaryExpression (LogicalBinaryExpression  logicalBinaryExpression,CompilationContext context ){
	'''«cast("Boolean",doCompileExpression(logicalBinaryExpression.leftExpr,context))» «getJavaLogicalOperator(logicalBinaryExpression.operator)» «cast("Boolean",doCompileExpression(logicalBinaryExpression.rightExpr,context))»'''
}


def String doCompileLogicalUnaryExpression (LogicalUnaryExpression  logicalUnaryExpression,CompilationContext context ){
	'''(!«cast("Boolean",doCompileExpression(logicalUnaryExpression.expression,context))»)'''
}

def String doCompileTernaryExpression (TernaryExpression  ternaryExpression,CompilationContext context){
	switch(ternaryExpression.operator)
	{
		case TernaryOperator::IF_EXPRESSION : compileIf(ternaryExpression,context)
	}
}
	
	def String compileIf(TernaryExpression expression,CompilationContext context) { 
		'''«cast("Boolean",doCompileExpression(expression.firstExpression,context))» ? 
		(«doCompileExpression(expression.secondExpression,context)»):
		(«doCompileExpression(expression.thirdExpression,context)»)'''
	}


def String doCompileComparisonExpression(ComparisonExpression comparisonExpression,CompilationContext context){
	if (isEqualityExpression(comparisonExpression))
	{
		doCompileEquality(comparisonExpression,context)
	}else{
		doCompileInequality(comparisonExpression,context)
	}
}
	def String doCompileInequality(ComparisonExpression expression,CompilationContext context) { 
		'''«cast(numericType,doCompileExpression(expression.leftExpr,context))» «expression.operator.literal» «cast(numericType,doCompileExpression(expression.rightExpr,context))»'''
	}

	def String doCompileEquality(ComparisonExpression expression,CompilationContext context) { 
		var result = '''(«doCompileExpression(expression.leftExpr,context)»).equals(«doCompileExpression(expression.rightExpr,context)»)'''
		if (expression.operator == ComparisonOperator::NOTEQ)
		{
			result = '''(!«result»)'''
		}
		return result.toString()
	}


def boolean isEqualityExpression(ComparisonExpression expression) { 
	return expression.operator == ComparisonOperator::EQ || expression.operator == ComparisonOperator::NOTEQ
}


def String cast(String type,String expression) {
	'''((«type»)(«expression»))'''
}

	def getJavaLogicalOperator(BinaryLogicalOperator operator) { 
		switch operator
		{
			case BinaryLogicalOperator::AND: "&&"
			case BinaryLogicalOperator::OR: "||"
		}
	}
	
	def getJavaLogicalOperator(UnaryLogicalOperator operator) { 
		switch operator
		{
			case UnaryLogicalOperator::NOT: "!"
		}
		
	}

}
