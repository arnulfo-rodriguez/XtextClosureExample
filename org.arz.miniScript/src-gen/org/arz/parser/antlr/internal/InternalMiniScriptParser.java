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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'{'", "'}'", "'let'", "','", "'('", "')'", "'func'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'not'", "'and'", "'or'", "'if'", "'true'", "'false'"
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
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==14||LA1_0==16||LA1_0==18||(LA1_0>=30 && LA1_0<=35)) ) {
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:172:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_LogicalBinaryExpression_2 = null;

        EObject this_LogicalUnaryExpression_3 = null;

        EObject this_TernaryExpression_4 = null;

        EObject this_ComparisonExpression_5 = null;

        EObject this_LetExpression_6 = null;

        EObject this_BlockExpression_7 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:175:28: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )
            int alt2=8;
            alt2 = dfa2.predict(input);
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
                case 5 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:217:5: this_TernaryExpression_4= ruleTernaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTernaryExpression_in_ruleExpression470);
                    this_TernaryExpression_4=ruleTernaryExpression();

                    state._fsp--;

                     
                            current = this_TernaryExpression_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:227:5: this_ComparisonExpression_5= ruleComparisonExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleComparisonExpression_in_ruleExpression497);
                    this_ComparisonExpression_5=ruleComparisonExpression();

                    state._fsp--;

                     
                            current = this_ComparisonExpression_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:237:5: this_LetExpression_6= ruleLetExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleLetExpression_in_ruleExpression524);
                    this_LetExpression_6=ruleLetExpression();

                    state._fsp--;

                     
                            current = this_LetExpression_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:247:5: this_BlockExpression_7= ruleBlockExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleBlockExpression_in_ruleExpression551);
                    this_BlockExpression_7=ruleBlockExpression();

                    state._fsp--;

                     
                            current = this_BlockExpression_7; 
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


    // $ANTLR start "entryRuleBlockExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:263:1: entryRuleBlockExpression returns [EObject current=null] : iv_ruleBlockExpression= ruleBlockExpression EOF ;
    public final EObject entryRuleBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:264:2: (iv_ruleBlockExpression= ruleBlockExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:265:2: iv_ruleBlockExpression= ruleBlockExpression EOF
            {
             newCompositeNode(grammarAccess.getBlockExpressionRule()); 
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression586);
            iv_ruleBlockExpression=ruleBlockExpression();

            state._fsp--;

             current =iv_ruleBlockExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression596); 

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:272:1: ruleBlockExpression returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' ) ;
    public final EObject ruleBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:275:28: ( (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:276:1: (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:276:1: (otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:276:3: otherlv_0= '{' ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBlockExpression633); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:280:1: ( ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==12||LA3_0==14||LA3_0==16||LA3_0==18||(LA3_0>=30 && LA3_0<=35)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:280:2: ( (lv_expressions_1_0= ruleExpression ) ) otherlv_2= ';'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:280:2: ( (lv_expressions_1_0= ruleExpression ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:281:1: (lv_expressions_1_0= ruleExpression )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:281:1: (lv_expressions_1_0= ruleExpression )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:282:3: lv_expressions_1_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBlockExpression655);
            	    lv_expressions_1_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_1_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleBlockExpression667); 

            	        	newLeafNode(otherlv_2, grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBlockExpression681); 

                	newLeafNode(otherlv_3, grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:314:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:315:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:316:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
             newCompositeNode(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression717);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;

             current =iv_ruleLetExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression727); 

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:323:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_assigment_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:326:28: ( (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:327:1: (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:327:1: (otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:327:3: otherlv_0= 'let' ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' ) ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleLetExpression764); 

                	newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:331:1: ( ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ',' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:331:2: ( (lv_assigment_1_0= ruleVariableAssignment ) ) otherlv_2= ','
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:331:2: ( (lv_assigment_1_0= ruleVariableAssignment ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:332:1: (lv_assigment_1_0= ruleVariableAssignment )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:332:1: (lv_assigment_1_0= ruleVariableAssignment )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:333:3: lv_assigment_1_0= ruleVariableAssignment
            {
             
            	        newCompositeNode(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableAssignment_in_ruleLetExpression786);
            lv_assigment_1_0=ruleVariableAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"assigment",
                    		lv_assigment_1_0, 
                    		"VariableAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleLetExpression798); 

                	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1());
                

            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:353:2: ( (lv_expression_3_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:354:1: (lv_expression_3_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:354:1: (lv_expression_3_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:355:3: lv_expression_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLetExpression820);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:379:1: entryRuleTernaryExpression returns [EObject current=null] : iv_ruleTernaryExpression= ruleTernaryExpression EOF ;
    public final EObject entryRuleTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:380:2: (iv_ruleTernaryExpression= ruleTernaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:381:2: iv_ruleTernaryExpression= ruleTernaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression856);
            iv_ruleTernaryExpression=ruleTernaryExpression();

            state._fsp--;

             current =iv_ruleTernaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryExpression866); 

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
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:388:1: ruleTernaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleTernaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_firstExpression_2_0 = null;

        EObject lv_secondExpression_4_0 = null;

        EObject lv_thirdExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:391:28: ( ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:1: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:1: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:2: ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:2: ( (lv_operator_0_0= ruleTernaryOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:393:1: (lv_operator_0_0= ruleTernaryOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:393:1: (lv_operator_0_0= ruleTernaryOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:394:3: lv_operator_0_0= ruleTernaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTernaryOperator_in_ruleTernaryExpression912);
            lv_operator_0_0=ruleTernaryOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"TernaryOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTernaryExpression924); 

                	newLeafNode(otherlv_1, grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:414:1: ( (lv_firstExpression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:415:1: (lv_firstExpression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:415:1: (lv_firstExpression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:416:3: lv_firstExpression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression945);
            lv_firstExpression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"firstExpression",
                    		lv_firstExpression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTernaryExpression957); 

                	newLeafNode(otherlv_3, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:436:1: ( (lv_secondExpression_4_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:1: (lv_secondExpression_4_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:1: (lv_secondExpression_4_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:438:3: lv_secondExpression_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression978);
            lv_secondExpression_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"secondExpression",
                    		lv_secondExpression_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleTernaryExpression990); 

                	newLeafNode(otherlv_5, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:458:1: ( (lv_thirdExpression_6_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:459:1: (lv_thirdExpression_6_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:459:1: (lv_thirdExpression_6_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:460:3: lv_thirdExpression_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression1011);
            lv_thirdExpression_6_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTernaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"thirdExpression",
                    		lv_thirdExpression_6_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleTernaryExpression1023); 

                	newLeafNode(otherlv_7, grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7());
                

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
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleLogicalBinaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:488:1: entryRuleLogicalBinaryExpression returns [EObject current=null] : iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF ;
    public final EObject entryRuleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBinaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:489:2: (iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:490:2: iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression1059);
            iv_ruleLogicalBinaryExpression=ruleLogicalBinaryExpression();

            state._fsp--;

             current =iv_ruleLogicalBinaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalBinaryExpression1069); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:497:1: ruleLogicalBinaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_leftExpr_2_0 = null;

        EObject lv_rightExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:500:28: ( ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:501:1: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:501:1: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:501:2: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:501:2: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:502:1: (lv_operator_0_0= ruleBinaryLogicalOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:502:1: (lv_operator_0_0= ruleBinaryLogicalOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:503:3: lv_operator_0_0= ruleBinaryLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression1115);
            lv_operator_0_0=ruleBinaryLogicalOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"BinaryLogicalOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLogicalBinaryExpression1127); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:523:1: ( (lv_leftExpr_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:524:1: (lv_leftExpr_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:524:1: (lv_leftExpr_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:525:3: lv_leftExpr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression1148);
            lv_leftExpr_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"leftExpr",
                    		lv_leftExpr_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLogicalBinaryExpression1160); 

                	newLeafNode(otherlv_3, grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:545:1: ( (lv_rightExpr_4_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:546:1: (lv_rightExpr_4_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:546:1: (lv_rightExpr_4_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:547:3: lv_rightExpr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression1181);
            lv_rightExpr_4_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalBinaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"rightExpr",
                    		lv_rightExpr_4_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleLogicalBinaryExpression1193); 

                	newLeafNode(otherlv_5, grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5());
                

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:575:1: entryRuleLogicalUnaryExpression returns [EObject current=null] : iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF ;
    public final EObject entryRuleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:576:2: (iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:577:2: iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression1229);
            iv_ruleLogicalUnaryExpression=ruleLogicalUnaryExpression();

            state._fsp--;

             current =iv_ruleLogicalUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalUnaryExpression1239); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:584:1: ruleLogicalUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:587:28: ( ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:588:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:588:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:588:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:588:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:589:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:589:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:590:3: lv_operator_0_0= ruleUnaryLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression1285);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleLogicalUnaryExpression1297); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:610:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:611:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:611:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:612:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalUnaryExpression1318);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicalUnaryExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLogicalUnaryExpression1330); 

                	newLeafNode(otherlv_3, grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3());
                

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:640:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:641:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:642:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1366);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression1376); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:649:1: ruleComparisonExpression returns [EObject current=null] : (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:652:28: ( (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:653:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:653:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:654:5: this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1423);
            this_NumericExpression_0=ruleNumericExpression();

            state._fsp--;

             
                    current = this_NumericExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:662:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=24 && LA4_0<=29)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:662:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:662:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:663:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:668:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:669:1: (lv_operator_2_0= ruleComparisonOperator )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:669:1: (lv_operator_2_0= ruleComparisonOperator )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:670:3: lv_operator_2_0= ruleComparisonOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression1453);
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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:686:2: ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:687:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:687:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:688:3: lv_rightExpr_3_0= ruleNumericExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1474);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:712:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:713:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:714:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1512);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration1522); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:721:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:724:28: ( (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:725:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:725:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:725:3: otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFunctionDeclaration1559); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDeclaration1571); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:733:1: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:733:2: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:733:2: ( (lv_parameters_2_0= RULE_ID ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:734:1: (lv_parameters_2_0= RULE_ID )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:734:1: (lv_parameters_2_0= RULE_ID )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:735:3: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration1589); 

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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:751:2: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:751:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration1607); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:755:1: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:756:1: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:756:1: (lv_parameters_4_0= RULE_ID )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:757:3: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration1624); 

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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDeclaration1645); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:777:1: ( (lv_body_6_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:1: (lv_body_6_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:1: (lv_body_6_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:779:3: lv_body_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionDeclaration1666);
            lv_body_6_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_6_0, 
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleSymbolReference"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:803:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:804:2: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:805:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1702);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference1712); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:812:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:815:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:816:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:816:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:817:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:817:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:818:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolReference1753); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:842:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:843:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:844:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1793);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression1803); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:851:1: ruleNumericExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightFactor_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:854:28: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:855:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:855:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:856:5: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1850);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:864:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:864:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:864:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:865:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:870:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:871:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:871:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:872:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1880);
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

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:888:2: ( (lv_rightFactor_3_0= ruleFactor ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:889:1: (lv_rightFactor_3_0= ruleFactor )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:889:1: (lv_rightFactor_3_0= ruleFactor )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:890:3: lv_rightFactor_3_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1901);
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
            	    break loop7;
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:914:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:915:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:916:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1939);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1949); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:923:1: ruleFactor returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightTerm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:926:28: ( (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:927:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:927:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:928:5: this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleFactor1996);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:936:1: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:936:2: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:936:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:937:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:942:2: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:943:1: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:943:1: (lv_operator_2_0= ruleFactorOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:944:3: lv_operator_2_0= ruleFactorOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactorOperator_in_ruleFactor2026);
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

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:960:2: ( (lv_rightTerm_3_0= ruleTerm ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:961:1: (lv_rightTerm_3_0= ruleTerm )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:961:1: (lv_rightTerm_3_0= ruleTerm )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:962:3: lv_rightTerm_3_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleFactor2047);
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
            	    break loop8;
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:986:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:987:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:988:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2085);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2095); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:995:1: ruleTerm returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpression_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:998:28: ( (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:999:1: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:999:1: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=34 && LA9_0<=35)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID||LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1000:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleTerm2142);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1010:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleTerm2169);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1026:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1027:2: (iv_ruleApply= ruleApply EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1028:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply2204);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply2214); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1035:1: ruleApply returns [EObject current=null] : (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1038:28: ( (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1039:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1039:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1040:5: this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            {
             
                    newCompositeNode(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctor_in_ruleApply2261);
            this_Functor_0=ruleFunctor();

            state._fsp--;

             
                    current = this_Functor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1048:1: ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1048:2: () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1048:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1049:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleApply2282); 

            	        	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1());
            	        
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1058:1: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==12||LA11_0==14||LA11_0==16||LA11_0==18||(LA11_0>=30 && LA11_0<=35)) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1058:2: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1058:2: ( (lv_arguments_3_0= ruleExpression ) )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1059:1: (lv_arguments_3_0= ruleExpression )
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1059:1: (lv_arguments_3_0= ruleExpression )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1060:3: lv_arguments_3_0= ruleExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleApply2304);
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

            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1076:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==15) ) {
            	                    alt10=1;
            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1076:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleApply2317); 

            	            	        	newLeafNode(otherlv_4, grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0());
            	            	        
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1080:1: ( (lv_arguments_5_0= ruleExpression ) )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1081:1: (lv_arguments_5_0= ruleExpression )
            	            	    {
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1081:1: (lv_arguments_5_0= ruleExpression )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1082:3: lv_arguments_5_0= ruleExpression
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleApply2338);
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
            	            	    break loop10;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleApply2354); 

            	        	newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1110:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1111:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1112:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor2392);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor2402); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1119:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1122:28: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1123:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1123:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1124:5: this_SymbolReference_0= ruleSymbolReference
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolReference_in_ruleFunctor2449);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;

                     
                            current = this_SymbolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1134:5: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleFunctor2476);
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


    // $ANTLR start "entryRuleLiteralExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1150:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1151:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1152:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2511);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression2521); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1159:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralNumber_0 = null;

        EObject this_LiteralBoolean_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1162:28: ( (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1163:1: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1163:1: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=34 && LA14_0<=35)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1164:5: this_LiteralNumber_0= ruleLiteralNumber
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleLiteralExpression2568);
                    this_LiteralNumber_0=ruleLiteralNumber();

                    state._fsp--;

                     
                            current = this_LiteralNumber_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1174:5: this_LiteralBoolean_1= ruleLiteralBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression2595);
                    this_LiteralBoolean_1=ruleLiteralBoolean();

                    state._fsp--;

                     
                            current = this_LiteralBoolean_1; 
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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1191:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1192:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2630);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean2640); 

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1199:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1202:28: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1203:1: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1203:1: ( (lv_value_0_0= ruleBooleanValue ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1204:1: (lv_value_0_0= ruleBooleanValue )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1204:1: (lv_value_0_0= ruleBooleanValue )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1205:3: lv_value_0_0= ruleBooleanValue
            {
             
            	        newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean2685);
            lv_value_0_0=ruleBooleanValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BooleanValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNumber"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1229:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1230:2: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1231:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
             newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber2720);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;

             current =iv_ruleLiteralNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber2730); 

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
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1238:1: ruleLiteralNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1241:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1242:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1242:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1243:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1243:1: (lv_value_0_0= RULE_INT )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1244:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralNumber2771); 

            			newLeafNode(lv_value_0_0, grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralNumberRule());
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
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleVariableAssignment"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1268:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1269:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1270:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2811);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2821); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1277:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1280:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1282:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1282:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1283:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssignment2863); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleVariableAssignment2880); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1303:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1304:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1304:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1305:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignment2901);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1330:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1331:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2937);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression2947); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1338:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1341:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1342:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1342:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1342:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleParenthesisExpression2984); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisExpression3006);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleParenthesisExpression3017); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1367:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1369:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1370:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1370:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==21) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1370:2: (enumLiteral_0= '+' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1370:2: (enumLiteral_0= '+' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1370:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleAdditionOperator3067); 

                            current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1376:6: (enumLiteral_1= '-' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1376:6: (enumLiteral_1= '-' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1376:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_21_in_ruleAdditionOperator3084); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1386:1: ruleFactorOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleFactorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1388:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:2: (enumLiteral_0= '*' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:2: (enumLiteral_0= '*' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleFactorOperator3129); 

                            current = grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1395:6: (enumLiteral_1= '/' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1395:6: (enumLiteral_1= '/' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1395:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleFactorOperator3146); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1405:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
    public final Enumerator ruleComparisonOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1407:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1408:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1408:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt17=1;
                }
                break;
            case 25:
                {
                alt17=2;
                }
                break;
            case 26:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 29:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1408:2: (enumLiteral_0= '>' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1408:2: (enumLiteral_0= '>' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1408:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleComparisonOperator3191); 

                            current = grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1414:6: (enumLiteral_1= '>=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1414:6: (enumLiteral_1= '>=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1414:8: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator3208); 

                            current = grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1420:6: (enumLiteral_2= '<' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1420:6: (enumLiteral_2= '<' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1420:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator3225); 

                            current = grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1426:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1426:6: (enumLiteral_3= '<=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1426:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator3242); 

                            current = grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1432:6: (enumLiteral_4= '==' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1432:6: (enumLiteral_4= '==' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1432:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleComparisonOperator3259); 

                            current = grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1438:6: (enumLiteral_5= '!=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1438:6: (enumLiteral_5= '!=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1438:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleComparisonOperator3276); 

                            current = grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5()); 
                        

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


    // $ANTLR start "ruleUnaryLogicalOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1448:1: ruleUnaryLogicalOperator returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1450:28: ( (enumLiteral_0= 'not' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1451:1: (enumLiteral_0= 'not' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1451:1: (enumLiteral_0= 'not' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1451:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleUnaryLogicalOperator3320); 

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


    // $ANTLR start "ruleBinaryLogicalOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1461:1: ruleBinaryLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1463:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1464:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1464:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1464:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1464:2: (enumLiteral_0= 'and' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1464:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleBinaryLogicalOperator3364); 

                            current = grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1470:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1470:6: (enumLiteral_1= 'or' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1470:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleBinaryLogicalOperator3381); 

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


    // $ANTLR start "ruleTernaryOperator"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1480:1: ruleTernaryOperator returns [Enumerator current=null] : (enumLiteral_0= 'if' ) ;
    public final Enumerator ruleTernaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1482:28: ( (enumLiteral_0= 'if' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1483:1: (enumLiteral_0= 'if' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1483:1: (enumLiteral_0= 'if' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1483:3: enumLiteral_0= 'if'
            {
            enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleTernaryOperator3425); 

                    current = grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleTernaryOperator"


    // $ANTLR start "ruleBooleanValue"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1493:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1495:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1496:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1496:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1496:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1496:2: (enumLiteral_0= 'true' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1496:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleBooleanValue3469); 

                            current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1502:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1502:6: (enumLiteral_1= 'false' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1502:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleBooleanValue3486); 

                            current = grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBooleanValue"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\2\uffff\1\6\7\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\13\7\uffff";
    static final String DFA2_maxS =
        "\1\43\1\uffff\1\35\7\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\6\6\uffff\1\10\1\uffff\1\7\1\uffff\1\6\1\uffff\1\1\13"+
            "\uffff\1\4\2\3\1\5\2\6",
            "",
            "\1\6\3\uffff\3\6\1\uffff\1\11\12\6",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression | this_LetExpression_6= ruleLetExpression | this_BlockExpression_7= ruleBlockExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram233 = new BitSet(new long[]{0x0000000FC0055032L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram255 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram267 = new BitSet(new long[]{0x0000000FC0055032L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleExpression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleExpression389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_ruleExpression416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_ruleExpression443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_ruleExpression470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleExpression497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_ruleExpression524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_ruleExpression551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBlockExpression633 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBlockExpression655 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBlockExpression667 = new BitSet(new long[]{0x0000000FC0057030L});
    public static final BitSet FOLLOW_13_in_ruleBlockExpression681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLetExpression764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleLetExpression786 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLetExpression798 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetExpression820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryExpression866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryOperator_in_ruleTernaryExpression912 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTernaryExpression924 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression945 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTernaryExpression957 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression978 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTernaryExpression990 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression1011 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTernaryExpression1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression1059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalBinaryExpression1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression1115 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLogicalBinaryExpression1127 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression1148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLogicalBinaryExpression1160 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression1181 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLogicalBinaryExpression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression1229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalUnaryExpression1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression1285 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLogicalUnaryExpression1297 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalUnaryExpression1318 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLogicalUnaryExpression1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1423 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression1453 = new BitSet(new long[]{0x0000000C00010030L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunctionDeclaration1559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDeclaration1571 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1589 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1624 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDeclaration1645 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDeclaration1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolReference1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1850 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1880 = new BitSet(new long[]{0x0000000C00010030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1901 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1996 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleFactorOperator_in_ruleFactor2026 = new BitSet(new long[]{0x0000000C00010030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor2047 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleTerm2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleTerm2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_ruleApply2261 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleApply2282 = new BitSet(new long[]{0x0000000FC0075030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply2304 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleApply2317 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply2338 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_ruleApply2354 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor2392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_ruleFunctor2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleFunctor2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleLiteralExpression2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber2720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralNumber2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssignment2863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariableAssignment2880 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignment2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleParenthesisExpression2984 = new BitSet(new long[]{0x0000000FC0055030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisExpression3006 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleParenthesisExpression3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAdditionOperator3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAdditionOperator3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFactorOperator3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFactorOperator3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparisonOperator3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComparisonOperator3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComparisonOperator3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUnaryLogicalOperator3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryLogicalOperator3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBinaryLogicalOperator3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTernaryOperator3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBooleanValue3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBooleanValue3486 = new BitSet(new long[]{0x0000000000000002L});

}