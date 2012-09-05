package org.arz.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.arz.services.MiniScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'func'", "'('", "','", "')'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'and'", "'or'", "'not'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMiniScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g"; }



     	private MiniScriptGrammarAccess grammarAccess;
     	
        public InternalMiniScriptParser(TokenStream input, MiniScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MiniScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:77:1: ruleModel returns [EObject current=null] : this_Program_0= ruleProgram ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Program_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:80:28: (this_Program_0= ruleProgram )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:82:5: this_Program_0= ruleProgram
            {
             
                    newCompositeNode(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleProgram_in_ruleModel131);
            this_Program_0=ruleProgram();

            state._fsp--;

             
                    current = this_Program_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:98:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:99:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:100:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram165);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:107:1: ruleProgram returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:1: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:1: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:2: ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:112:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:112:1: (lv_expressions_0_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:113:3: lv_expressions_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleProgram221);
            lv_expressions_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleProgram233); 

                	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSemicolonKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:133:1: ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||(LA1_0>=12 && LA1_0<=13)||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:133:2: ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:133:2: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:134:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:134:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:135:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleProgram255);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleProgram267); 

            	        	newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getSemicolonKeyword_2_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:163:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:164:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:165:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression305);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression315); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:172:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_LogicalBinaryExpression_2 = null;

        EObject this_LogicalUnaryExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:175:28: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==18) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||LA2_2==11||(LA2_2>=13 && LA2_2<=15)||(LA2_2>=19 && LA2_2<=29)) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 13:
                {
                alt2=3;
                }
                break;
            case 30:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:177:5: this_FunctionDeclaration_0= ruleFunctionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleExpression362);
                    this_FunctionDeclaration_0=ruleFunctionDeclaration();

                    state._fsp--;

                     
                            current = this_FunctionDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:187:5: this_VariableAssignment_1= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleExpression389);
                    this_VariableAssignment_1=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:197:5: this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_ruleExpression416);
                    this_LogicalBinaryExpression_2=ruleLogicalBinaryExpression();

                    state._fsp--;

                     
                            current = this_LogicalBinaryExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:207:5: this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_ruleExpression443);
                    this_LogicalUnaryExpression_3=ruleLogicalUnaryExpression();

                    state._fsp--;

                     
                            current = this_LogicalUnaryExpression_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalBinaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:223:1: entryRuleLogicalBinaryExpression returns [EObject current=null] : iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF ;
    public final EObject entryRuleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBinaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:224:2: (iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:225:2: iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression478);
            iv_ruleLogicalBinaryExpression=ruleLogicalBinaryExpression();

            state._fsp--;

             current =iv_ruleLogicalBinaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalBinaryExpression488); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalBinaryExpression"


    // $ANTLR start "ruleLogicalBinaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:232:1: ruleLogicalBinaryExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:235:28: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:236:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:236:1: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:237:5: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleComparisonExpression_in_ruleLogicalBinaryExpression535);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;

             
                    current = this_ComparisonExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:245:1: ( () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=28 && LA3_0<=29)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:245:2: () ( (lv_operator_2_0= ruleBinaryLogicalOperator ) ) ( (lv_rightExpr_3_0= ruleComparisonExpression ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:245:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:246:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLogicalBinaryExpressionAccess().getLogicalBinaryExpressionLeftExprAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:251:2: ( (lv_operator_2_0= ruleBinaryLogicalOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:252:1: (lv_operator_2_0= ruleBinaryLogicalOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:252:1: (lv_operator_2_0= ruleBinaryLogicalOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:253:3: lv_operator_2_0= ruleBinaryLogicalOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression565);
            	    lv_operator_2_0=ruleBinaryLogicalOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"BinaryLogicalOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:269:2: ( (lv_rightExpr_3_0= ruleComparisonExpression ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:270:1: (lv_rightExpr_3_0= ruleComparisonExpression )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:270:1: (lv_rightExpr_3_0= ruleComparisonExpression )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:271:3: lv_rightExpr_3_0= ruleComparisonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprComparisonExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparisonExpression_in_ruleLogicalBinaryExpression586);
            	    lv_rightExpr_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightExpr",
            	            		lv_rightExpr_3_0, 
            	            		"ComparisonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalBinaryExpression"


    // $ANTLR start "entryRuleLogicalUnaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:295:1: entryRuleLogicalUnaryExpression returns [EObject current=null] : iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF ;
    public final EObject entryRuleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:296:2: (iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:297:2: iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression624);
            iv_ruleLogicalUnaryExpression=ruleLogicalUnaryExpression();

            state._fsp--;

             current =iv_ruleLogicalUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalUnaryExpression634); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalUnaryExpression"


    // $ANTLR start "ruleLogicalUnaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:304:1: ruleLogicalUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) ( (lv_expression_1_0= ruleComparisonExpression ) ) ) ;
    public final EObject ruleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_0_0 = null;

        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:307:28: ( ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) ( (lv_expression_1_0= ruleComparisonExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:308:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) ( (lv_expression_1_0= ruleComparisonExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:308:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) ( (lv_expression_1_0= ruleComparisonExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:308:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) ( (lv_expression_1_0= ruleComparisonExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:308:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:309:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:309:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:310:3: lv_operator_0_0= ruleUnaryLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression680);
            lv_operator_0_0=ruleUnaryLogicalOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"UnaryLogicalOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:326:2: ( (lv_expression_1_0= ruleComparisonExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:327:1: (lv_expression_1_0= ruleComparisonExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:327:1: (lv_expression_1_0= ruleComparisonExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:328:3: lv_expression_1_0= ruleComparisonExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionComparisonExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonExpression_in_ruleLogicalUnaryExpression701);
            lv_expression_1_0=ruleComparisonExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"ComparisonExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalUnaryExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:352:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:353:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:354:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression737);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:361:1: ruleComparisonExpression returns [EObject current=null] : (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:364:28: ( (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:5: this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression794);
            this_NumericExpression_0=ruleNumericExpression();

            state._fsp--;

             
                    current = this_NumericExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:374:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=23 && LA4_0<=27)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:374:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:374:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:375:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:380:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:381:1: (lv_operator_2_0= ruleComparisonOperator )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:381:1: (lv_operator_2_0= ruleComparisonOperator )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:382:3: lv_operator_2_0= ruleComparisonOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression824);
                    lv_operator_2_0=ruleComparisonOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"operator",
                            		lv_operator_2_0, 
                            		"ComparisonOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:398:2: ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:399:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:399:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:400:3: lv_rightExpr_3_0= ruleNumericExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression845);
                    lv_rightExpr_3_0=ruleNumericExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"rightExpr",
                            		lv_rightExpr_3_0, 
                            		"NumericExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:424:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:425:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:426:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration883);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration893); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:433:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_parameters_4_0=null;
        Token otherlv_5=null;
        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:436:28: ( (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:3: otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDeclaration930); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDeclaration942); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:445:1: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:445:2: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:445:2: ( (lv_parameters_2_0= RULE_ID ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:446:1: (lv_parameters_2_0= RULE_ID )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:446:1: (lv_parameters_2_0= RULE_ID )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:447:3: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration960); 

                    			newLeafNode(lv_parameters_2_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:463:2: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:463:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDeclaration978); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:467:1: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:468:1: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:468:1: (lv_parameters_4_0= RULE_ID )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:469:3: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration995); 

                    	    			newLeafNode(lv_parameters_4_0, grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_4_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration1016); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:489:1: ( (lv_body_6_0= ruleBody ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:490:1: (lv_body_6_0= ruleBody )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:490:1: (lv_body_6_0= ruleBody )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:491:3: lv_body_6_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleFunctionDeclaration1037);
            lv_body_6_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_6_0, 
                    		"Body");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleBody"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:515:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:516:2: (iv_ruleBody= ruleBody EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:517:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1073);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:524:1: ruleBody returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:527:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:528:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:528:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=12 && LA8_0<=13)||LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:528:2: ( (lv_expressions_0_0= ruleExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:528:2: ( (lv_expressions_0_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:529:1: (lv_expressions_0_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:529:1: (lv_expressions_0_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:530:3: lv_expressions_0_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBody1129);
                    lv_expressions_0_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyRule());
                    	        }
                           		add(
                           			current, 
                           			"expressions",
                            		lv_expressions_0_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:547:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:547:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:547:7: () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}'
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:547:7: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:548:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBodyAccess().getBodyAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBody1157); 

                        	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:557:1: ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=12 && LA7_0<=13)||LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:557:2: ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';'
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:557:2: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:558:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:558:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:559:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleBody1179);
                    	    lv_expressions_3_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getBodyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_3_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleBody1191); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleBody1205); 

                        	newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleSymbolReference"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:591:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:592:2: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:593:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1242);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference1252); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolReference"


    // $ANTLR start "ruleSymbolReference"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:600:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:603:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:604:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:604:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:605:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:605:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:606:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolReference1293); 

            			newLeafNode(lv_id_0_0, grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolReference"


    // $ANTLR start "entryRuleNumericExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:630:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:631:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:632:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1333);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression1343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:639:1: ruleNumericExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightFactor_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:642:28: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:643:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:643:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:644:5: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1390);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:652:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=19 && LA9_0<=20)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:652:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:652:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:653:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:658:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:659:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:659:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:660:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1420);
            	    lv_operator_2_0=ruleAdditionOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"AdditionOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:676:2: ( (lv_rightFactor_3_0= ruleFactor ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:677:1: (lv_rightFactor_3_0= ruleFactor )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:677:1: (lv_rightFactor_3_0= ruleFactor )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:678:3: lv_rightFactor_3_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1441);
            	    lv_rightFactor_3_0=ruleFactor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightFactor",
            	            		lv_rightFactor_3_0, 
            	            		"Factor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:702:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:703:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:704:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1479);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:1: ruleFactor returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightTerm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:714:28: ( (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:715:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:715:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:716:5: this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleFactor1536);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:724:1: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:724:2: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:724:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:725:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:730:2: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:731:1: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:731:1: (lv_operator_2_0= ruleFactorOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:732:3: lv_operator_2_0= ruleFactorOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactorOperator_in_ruleFactor1566);
            	    lv_operator_2_0=ruleFactorOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"operator",
            	            		lv_operator_2_0, 
            	            		"FactorOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:748:2: ( (lv_rightTerm_3_0= ruleTerm ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:749:1: (lv_rightTerm_3_0= ruleTerm )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:749:1: (lv_rightTerm_3_0= ruleTerm )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:750:3: lv_rightTerm_3_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleFactor1587);
            	    lv_rightTerm_3_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightTerm",
            	            		lv_rightTerm_3_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleTerm"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:774:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:775:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:776:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1625);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:783:1: ruleTerm returns [EObject current=null] : (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpr_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:786:28: ( (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:787:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:787:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||LA11_0==13) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:788:5: this_LiteralExpr_0= ruleLiteralExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpr_in_ruleTerm1682);
                    this_LiteralExpr_0=ruleLiteralExpr();

                    state._fsp--;

                     
                            current = this_LiteralExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:798:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleTerm1709);
                    this_Apply_1=ruleApply();

                    state._fsp--;

                     
                            current = this_Apply_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:814:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:815:2: (iv_ruleApply= ruleApply EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:816:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply1744);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply1754); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:823:1: ruleApply returns [EObject current=null] : (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Functor_0 = null;

        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:826:28: ( (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:827:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:827:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:828:5: this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            {
             
                    newCompositeNode(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctor_in_ruleApply1801);
            this_Functor_0=ruleFunctor();

            state._fsp--;

             
                    current = this_Functor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:836:1: ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:836:2: () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:836:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:837:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleApply1822); 

            	        	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1());
            	        
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:846:1: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=12 && LA13_0<=13)||LA13_0==30) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:846:2: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:846:2: ( (lv_arguments_3_0= ruleExpression ) )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:847:1: (lv_arguments_3_0= ruleExpression )
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:847:1: (lv_arguments_3_0= ruleExpression )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:848:3: lv_arguments_3_0= ruleExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleApply1844);
            	            lv_arguments_3_0=ruleExpression();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getApplyRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"arguments",
            	                    		lv_arguments_3_0, 
            	                    		"Expression");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }

            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:864:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==14) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:864:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleApply1857); 

            	            	        	newLeafNode(otherlv_4, grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0());
            	            	        
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:868:1: ( (lv_arguments_5_0= ruleExpression ) )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:869:1: (lv_arguments_5_0= ruleExpression )
            	            	    {
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:869:1: (lv_arguments_5_0= ruleExpression )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:870:3: lv_arguments_5_0= ruleExpression
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleApply1878);
            	            	    lv_arguments_5_0=ruleExpression();

            	            	    state._fsp--;


            	            	    	        if (current==null) {
            	            	    	            current = createModelElementForParent(grammarAccess.getApplyRule());
            	            	    	        }
            	            	           		add(
            	            	           			current, 
            	            	           			"arguments",
            	            	            		lv_arguments_5_0, 
            	            	            		"Expression");
            	            	    	        afterParserOrEnumRuleCall();
            	            	    	    

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop12;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleApply1894); 

            	        	newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:898:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:899:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:900:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor1932);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor1942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:907:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:910:28: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:911:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:911:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:912:5: this_SymbolReference_0= ruleSymbolReference
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolReference_in_ruleFunctor1989);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;

                     
                            current = this_SymbolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:922:5: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleFunctor2016);
                    this_ParenthesisExpression_1=ruleParenthesisExpression();

                    state._fsp--;

                     
                            current = this_ParenthesisExpression_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:938:1: entryRuleLiteralExpr returns [EObject current=null] : iv_ruleLiteralExpr= ruleLiteralExpr EOF ;
    public final EObject entryRuleLiteralExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpr = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:939:2: (iv_ruleLiteralExpr= ruleLiteralExpr EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:940:2: iv_ruleLiteralExpr= ruleLiteralExpr EOF
            {
             newCompositeNode(grammarAccess.getLiteralExprRule()); 
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr2051);
            iv_ruleLiteralExpr=ruleLiteralExpr();

            state._fsp--;

             current =iv_ruleLiteralExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr2061); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpr"


    // $ANTLR start "ruleLiteralExpr"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:947:1: ruleLiteralExpr returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:950:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:951:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:951:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:952:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:952:1: (lv_value_0_0= RULE_INT )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:953:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralExpr2102); 

            			newLeafNode(lv_value_0_0, grammarAccess.getLiteralExprAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpr"


    // $ANTLR start "entryRuleVariableAssignment"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:977:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:978:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2142);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:986:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:989:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:990:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:990:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:990:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:990:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:991:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:991:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:992:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssignment2194); 

            			newLeafNode(lv_id_0_0, grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleVariableAssignment2211); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1012:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1013:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1013:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1014:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignment2232);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleParenthesisExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1038:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1039:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1040:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2268);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression2278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1047:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1050:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1051:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1051:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1051:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleParenthesisExpression2315); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisExpression2337);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleParenthesisExpression2348); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "ruleAdditionOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1076:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1078:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1079:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1079:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            else if ( (LA16_0==20) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1079:2: (enumLiteral_0= '+' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1079:2: (enumLiteral_0= '+' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1079:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleAdditionOperator2398); 

                            current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1085:6: (enumLiteral_1= '-' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1085:6: (enumLiteral_1= '-' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1085:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleAdditionOperator2415); 

                            current = grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleFactorOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1095:1: ruleFactorOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleFactorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1097:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1098:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1098:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1098:2: (enumLiteral_0= '*' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1098:2: (enumLiteral_0= '*' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1098:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleFactorOperator2460); 

                            current = grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1104:6: (enumLiteral_1= '/' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1104:6: (enumLiteral_1= '/' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1104:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleFactorOperator2477); 

                            current = grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "ruleComparisonOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1114:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1116:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1117:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1117:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt18=1;
                }
                break;
            case 24:
                {
                alt18=2;
                }
                break;
            case 25:
                {
                alt18=3;
                }
                break;
            case 26:
                {
                alt18=4;
                }
                break;
            case 27:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1117:2: (enumLiteral_0= '>' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1117:2: (enumLiteral_0= '>' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1117:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleComparisonOperator2522); 

                            current = grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1123:6: (enumLiteral_1= '>=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1123:6: (enumLiteral_1= '>=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1123:8: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleComparisonOperator2539); 

                            current = grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1129:6: (enumLiteral_2= '<' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1129:6: (enumLiteral_2= '<' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1129:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator2556); 

                            current = grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1135:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1135:6: (enumLiteral_3= '<=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1135:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator2573); 

                            current = grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1141:6: (enumLiteral_4= '==' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1141:6: (enumLiteral_4= '==' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1141:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator2590); 

                            current = grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleBinaryLogicalOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1151:1: ruleBinaryLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1153:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1154:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1154:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1154:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1154:2: (enumLiteral_0= 'and' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1154:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleBinaryLogicalOperator2635); 

                            current = grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1160:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1160:6: (enumLiteral_1= 'or' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1160:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleBinaryLogicalOperator2652); 

                            current = grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryLogicalOperator"


    // $ANTLR start "ruleUnaryLogicalOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1170:1: ruleUnaryLogicalOperator returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1172:28: ( (enumLiteral_0= 'not' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1173:1: (enumLiteral_0= 'not' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1173:1: (enumLiteral_0= 'not' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1173:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleUnaryLogicalOperator2696); 

                    current = grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryLogicalOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram233 = new BitSet(new long[]{0x0000000040003032L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram255 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram267 = new BitSet(new long[]{0x0000000040003032L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleExpression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleExpression389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_ruleExpression416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_ruleExpression443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalBinaryExpression488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalBinaryExpression535 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression565 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalBinaryExpression586 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalUnaryExpression634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression680 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleLogicalUnaryExpression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression794 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression824 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDeclaration930 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDeclaration942 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration960 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration995 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration1016 = new BitSet(new long[]{0x0000000040013030L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFunctionDeclaration1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBody1157 = new BitSet(new long[]{0x0000000040023030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody1179 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBody1191 = new BitSet(new long[]{0x0000000040023030L});
    public static final BitSet FOLLOW_17_in_ruleBody1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolReference1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1390 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1420 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1441 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1536 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorOperator_in_ruleFactor1566 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1587 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_ruleTerm1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleTerm1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_ruleApply1801 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleApply1822 = new BitSet(new long[]{0x000000004000B030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply1844 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleApply1857 = new BitSet(new long[]{0x0000000040003030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply1878 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleApply1894 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor1932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_ruleFunctor1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleFunctor2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralExpr2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssignment2194 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableAssignment2211 = new BitSet(new long[]{0x0000000040003030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignment2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleParenthesisExpression2315 = new BitSet(new long[]{0x0000000040003030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisExpression2337 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParenthesisExpression2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAdditionOperator2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAdditionOperator2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFactorOperator2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFactorOperator2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleComparisonOperator2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparisonOperator2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBinaryLogicalOperator2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleBinaryLogicalOperator2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUnaryLogicalOperator2696 = new BitSet(new long[]{0x0000000000000002L});

}