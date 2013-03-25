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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'('", "','", "')'", "'func'", "'{'", "'}'", "'='", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'not'", "'and'", "'or'", "'if'", "'true'", "'false'"
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

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==12||LA1_0==15||(LA1_0>=29 && LA1_0<=34)) ) {
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:172:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_LogicalBinaryExpression_2 = null;

        EObject this_LogicalUnaryExpression_3 = null;

        EObject this_TernaryExpression_4 = null;

        EObject this_ComparisonExpression_5 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:175:28: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_LogicalBinaryExpression_2= ruleLogicalBinaryExpression | this_LogicalUnaryExpression_3= ruleLogicalUnaryExpression | this_TernaryExpression_4= ruleTernaryExpression | this_ComparisonExpression_5= ruleComparisonExpression )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 15:
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
                else if ( (LA2_2==EOF||(LA2_2>=11 && LA2_2<=14)||(LA2_2>=19 && LA2_2<=28)) ) {
                    alt2=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
            case 31:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 32:
                {
                alt2=5;
                }
                break;
            case RULE_INT:
            case 12:
            case 33:
            case 34:
                {
                alt2=6;
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


    // $ANTLR start "entryRuleTernaryExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:243:1: entryRuleTernaryExpression returns [EObject current=null] : iv_ruleTernaryExpression= ruleTernaryExpression EOF ;
    public final EObject entryRuleTernaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTernaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:244:2: (iv_ruleTernaryExpression= ruleTernaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:245:2: iv_ruleTernaryExpression= ruleTernaryExpression EOF
            {
             newCompositeNode(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression532);
            iv_ruleTernaryExpression=ruleTernaryExpression();

            state._fsp--;

             current =iv_ruleTernaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryExpression542); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:252:1: ruleTernaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:255:28: ( ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:1: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:1: ( ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:2: ( (lv_operator_0_0= ruleTernaryOperator ) ) otherlv_1= '(' ( (lv_firstExpression_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_secondExpression_4_0= ruleExpression ) ) otherlv_5= ',' ( (lv_thirdExpression_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:2: ( (lv_operator_0_0= ruleTernaryOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:257:1: (lv_operator_0_0= ruleTernaryOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:257:1: (lv_operator_0_0= ruleTernaryOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:258:3: lv_operator_0_0= ruleTernaryOperator
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTernaryOperator_in_ruleTernaryExpression588);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleTernaryExpression600); 

                	newLeafNode(otherlv_1, grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:1: ( (lv_firstExpression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:279:1: (lv_firstExpression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:279:1: (lv_firstExpression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:280:3: lv_firstExpression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression621);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTernaryExpression633); 

                	newLeafNode(otherlv_3, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:300:1: ( (lv_secondExpression_4_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:301:1: (lv_secondExpression_4_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:301:1: (lv_secondExpression_4_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:302:3: lv_secondExpression_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression654);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleTernaryExpression666); 

                	newLeafNode(otherlv_5, grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:322:1: ( (lv_thirdExpression_6_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:323:1: (lv_thirdExpression_6_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:323:1: (lv_thirdExpression_6_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:324:3: lv_thirdExpression_6_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleTernaryExpression687);
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

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleTernaryExpression699); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:352:1: entryRuleLogicalBinaryExpression returns [EObject current=null] : iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF ;
    public final EObject entryRuleLogicalBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalBinaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:353:2: (iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:354:2: iv_ruleLogicalBinaryExpression= ruleLogicalBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression735);
            iv_ruleLogicalBinaryExpression=ruleLogicalBinaryExpression();

            state._fsp--;

             current =iv_ruleLogicalBinaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalBinaryExpression745); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:361:1: ruleLogicalBinaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:364:28: ( ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:1: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:1: ( ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:2: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) ) otherlv_1= '(' ( (lv_leftExpr_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_rightExpr_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:365:2: ( (lv_operator_0_0= ruleBinaryLogicalOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:1: (lv_operator_0_0= ruleBinaryLogicalOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:1: (lv_operator_0_0= ruleBinaryLogicalOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:367:3: lv_operator_0_0= ruleBinaryLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression791);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLogicalBinaryExpression803); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:387:1: ( (lv_leftExpr_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:388:1: (lv_leftExpr_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:388:1: (lv_leftExpr_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:389:3: lv_leftExpr_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression824);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLogicalBinaryExpression836); 

                	newLeafNode(otherlv_3, grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:409:1: ( (lv_rightExpr_4_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:410:1: (lv_rightExpr_4_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:410:1: (lv_rightExpr_4_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:411:3: lv_rightExpr_4_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression857);
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleLogicalBinaryExpression869); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:439:1: entryRuleLogicalUnaryExpression returns [EObject current=null] : iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF ;
    public final EObject entryRuleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalUnaryExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:440:2: (iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:441:2: iv_ruleLogicalUnaryExpression= ruleLogicalUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression905);
            iv_ruleLogicalUnaryExpression=ruleLogicalUnaryExpression();

            state._fsp--;

             current =iv_ruleLogicalUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalUnaryExpression915); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:448:1: ruleLogicalUnaryExpression returns [EObject current=null] : ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleLogicalUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_operator_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:451:28: ( ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:452:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:452:1: ( ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:452:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) ) otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:452:2: ( (lv_operator_0_0= ruleUnaryLogicalOperator ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:453:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:453:1: (lv_operator_0_0= ruleUnaryLogicalOperator )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:454:3: lv_operator_0_0= ruleUnaryLogicalOperator
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression961);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLogicalUnaryExpression973); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:474:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:475:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:475:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:476:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleLogicalUnaryExpression994);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleLogicalUnaryExpression1006); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:504:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:505:2: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:506:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1042);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression1052); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:513:1: ruleComparisonExpression returns [EObject current=null] : (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumericExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:516:28: ( (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:517:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:517:1: (this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:518:5: this_NumericExpression_0= ruleNumericExpression ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1099);
            this_NumericExpression_0=ruleNumericExpression();

            state._fsp--;

             
                    current = this_NumericExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:526:1: ( () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=23 && LA3_0<=28)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:526:2: () ( (lv_operator_2_0= ruleComparisonOperator ) ) ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:526:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:527:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:532:2: ( (lv_operator_2_0= ruleComparisonOperator ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:533:1: (lv_operator_2_0= ruleComparisonOperator )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:533:1: (lv_operator_2_0= ruleComparisonOperator )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:534:3: lv_operator_2_0= ruleComparisonOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression1129);
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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:550:2: ( (lv_rightExpr_3_0= ruleNumericExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:551:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:551:1: (lv_rightExpr_3_0= ruleNumericExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:552:3: lv_rightExpr_3_0= ruleNumericExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1150);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:576:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:577:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:578:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1188);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration1198); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:585:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:588:28: ( (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:589:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:589:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:589:3: otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration1235); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFunctionDeclaration1247); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:597:1: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:597:2: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:597:2: ( (lv_parameters_2_0= RULE_ID ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:598:1: (lv_parameters_2_0= RULE_ID )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:598:1: (lv_parameters_2_0= RULE_ID )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:599:3: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration1265); 

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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:615:2: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:615:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDeclaration1283); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:619:1: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:620:1: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:620:1: (lv_parameters_4_0= RULE_ID )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:621:3: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration1300); 

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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDeclaration1321); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:641:1: ( (lv_body_6_0= ruleBody ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:642:1: (lv_body_6_0= ruleBody )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:642:1: (lv_body_6_0= ruleBody )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:643:3: lv_body_6_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleFunctionDeclaration1342);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:667:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:668:2: (iv_ruleBody= ruleBody EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:669:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody1378);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody1388); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:676:1: ruleBody returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:679:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:680:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:680:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||LA7_0==12||LA7_0==15||(LA7_0>=29 && LA7_0<=34)) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:680:2: ( (lv_expressions_0_0= ruleExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:680:2: ( (lv_expressions_0_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:681:1: (lv_expressions_0_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:681:1: (lv_expressions_0_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:682:3: lv_expressions_0_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBody1434);
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:699:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:699:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:699:7: () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}'
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:699:7: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:700:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBodyAccess().getBodyAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleBody1462); 

                        	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:709:1: ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==12||LA6_0==15||(LA6_0>=29 && LA6_0<=34)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:709:2: ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';'
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:709:2: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:710:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:710:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleBody1484);
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

                    	    otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleBody1496); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleBody1510); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:743:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:744:2: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:745:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1547);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference1557); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:752:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:755:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:756:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:756:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:757:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:757:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:758:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolReference1598); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:782:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:783:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:784:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1638);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression1648); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:791:1: ruleNumericExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightFactor_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:794:28: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:795:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:795:1: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:796:5: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1695);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:804:1: ( () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:804:2: () ( (lv_operator_2_0= ruleAdditionOperator ) ) ( (lv_rightFactor_3_0= ruleFactor ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:804:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:805:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:810:2: ( (lv_operator_2_0= ruleAdditionOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:811:1: (lv_operator_2_0= ruleAdditionOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:811:1: (lv_operator_2_0= ruleAdditionOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:812:3: lv_operator_2_0= ruleAdditionOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1725);
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

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:828:2: ( (lv_rightFactor_3_0= ruleFactor ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:829:1: (lv_rightFactor_3_0= ruleFactor )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:829:1: (lv_rightFactor_3_0= ruleFactor )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:830:3: lv_rightFactor_3_0= ruleFactor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1746);
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
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:854:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:855:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:856:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1784);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1794); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:863:1: ruleFactor returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightTerm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:866:28: ( (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:867:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:867:1: (this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:868:5: this_Term_0= ruleTerm ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleFactor1841);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:876:1: ( () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:876:2: () ( (lv_operator_2_0= ruleFactorOperator ) ) ( (lv_rightTerm_3_0= ruleTerm ) )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:876:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:877:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:882:2: ( (lv_operator_2_0= ruleFactorOperator ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:883:1: (lv_operator_2_0= ruleFactorOperator )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:883:1: (lv_operator_2_0= ruleFactorOperator )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:884:3: lv_operator_2_0= ruleFactorOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFactorOperator_in_ruleFactor1871);
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

            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:900:2: ( (lv_rightTerm_3_0= ruleTerm ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:901:1: (lv_rightTerm_3_0= ruleTerm )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:901:1: (lv_rightTerm_3_0= ruleTerm )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:902:3: lv_rightTerm_3_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleFactor1892);
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleTerm"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:926:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:927:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:928:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1930);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1940); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:935:1: ruleTerm returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpression_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:938:28: ( (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:939:1: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:939:1: (this_LiteralExpression_0= ruleLiteralExpression | this_Apply_1= ruleApply )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=33 && LA10_0<=34)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==12) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:940:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpression_in_ruleTerm1987);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;

                     
                            current = this_LiteralExpression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:950:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleTerm2014);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:966:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:967:2: (iv_ruleApply= ruleApply EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:968:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply2049);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply2059); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:975:1: ruleApply returns [EObject current=null] : (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:978:28: ( (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:1: (this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:980:5: this_Functor_0= ruleFunctor ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            {
             
                    newCompositeNode(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctor_in_ruleApply2106);
            this_Functor_0=ruleFunctor();

            state._fsp--;

             
                    current = this_Functor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:988:1: ( () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:988:2: () otherlv_2= '(' ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:988:2: ()
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:989:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApply2127); 

            	        	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1());
            	        
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:998:1: ( ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )* )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||LA12_0==12||LA12_0==15||(LA12_0>=29 && LA12_0<=34)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:998:2: ( (lv_arguments_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:998:2: ( (lv_arguments_3_0= ruleExpression ) )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:999:1: (lv_arguments_3_0= ruleExpression )
            	            {
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:999:1: (lv_arguments_3_0= ruleExpression )
            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1000:3: lv_arguments_3_0= ruleExpression
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleExpression_in_ruleApply2149);
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

            	            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1016:2: (otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) ) )*
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==13) ) {
            	                    alt11=1;
            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1016:4: otherlv_4= ',' ( (lv_arguments_5_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleApply2162); 

            	            	        	newLeafNode(otherlv_4, grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0());
            	            	        
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1020:1: ( (lv_arguments_5_0= ruleExpression ) )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1021:1: (lv_arguments_5_0= ruleExpression )
            	            	    {
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1021:1: (lv_arguments_5_0= ruleExpression )
            	            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1022:3: lv_arguments_5_0= ruleExpression
            	            	    {
            	            	     
            	            	    	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            	            	    	    
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleApply2183);
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
            	            	    break loop11;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleApply2199); 

            	        	newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1050:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1051:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1052:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor2237);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor2247); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1059:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1062:28: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1063:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1063:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==12) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1064:5: this_SymbolReference_0= ruleSymbolReference
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolReference_in_ruleFunctor2294);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;

                     
                            current = this_SymbolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1074:5: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleFunctor2321);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1090:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1091:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1092:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
             newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2356);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;

             current =iv_ruleLiteralExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression2366); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1099:1: ruleLiteralExpression returns [EObject current=null] : (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralNumber_0 = null;

        EObject this_LiteralBoolean_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1102:28: ( (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1103:1: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1103:1: (this_LiteralNumber_0= ruleLiteralNumber | this_LiteralBoolean_1= ruleLiteralBoolean )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=33 && LA15_0<=34)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1104:5: this_LiteralNumber_0= ruleLiteralNumber
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralNumber_in_ruleLiteralExpression2413);
                    this_LiteralNumber_0=ruleLiteralNumber();

                    state._fsp--;

                     
                            current = this_LiteralNumber_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1114:5: this_LiteralBoolean_1= ruleLiteralBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression2440);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1130:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1131:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1132:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2475);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean2485); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1139:1: ruleLiteralBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleBooleanValue ) ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1142:28: ( ( (lv_value_0_0= ruleBooleanValue ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1143:1: ( (lv_value_0_0= ruleBooleanValue ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1143:1: ( (lv_value_0_0= ruleBooleanValue ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1144:1: (lv_value_0_0= ruleBooleanValue )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1144:1: (lv_value_0_0= ruleBooleanValue )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1145:3: lv_value_0_0= ruleBooleanValue
            {
             
            	        newCompositeNode(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean2530);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1169:1: entryRuleLiteralNumber returns [EObject current=null] : iv_ruleLiteralNumber= ruleLiteralNumber EOF ;
    public final EObject entryRuleLiteralNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralNumber = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1170:2: (iv_ruleLiteralNumber= ruleLiteralNumber EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1171:2: iv_ruleLiteralNumber= ruleLiteralNumber EOF
            {
             newCompositeNode(grammarAccess.getLiteralNumberRule()); 
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber2565);
            iv_ruleLiteralNumber=ruleLiteralNumber();

            state._fsp--;

             current =iv_ruleLiteralNumber; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber2575); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1178:1: ruleLiteralNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleLiteralNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1181:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1182:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1182:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1183:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1183:1: (lv_value_0_0= RULE_INT )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1184:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteralNumber2616); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1208:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1209:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1210:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2656);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2666); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1217:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1220:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1221:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1221:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1221:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1221:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1222:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1222:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1223:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssignment2708); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleVariableAssignment2725); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1243:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1244:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1244:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1245:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignment2746);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1269:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1270:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1271:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2782);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression2792); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1278:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1282:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1282:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1282:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleParenthesisExpression2829); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisExpression2851);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleParenthesisExpression2862); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1307:1: ruleAdditionOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditionOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1309:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1310:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1310:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1310:2: (enumLiteral_0= '+' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1310:2: (enumLiteral_0= '+' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1310:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleAdditionOperator2912); 

                            current = grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1316:6: (enumLiteral_1= '-' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1316:6: (enumLiteral_1= '-' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1316:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleAdditionOperator2929); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1326:1: ruleFactorOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) ;
    public final Enumerator ruleFactorOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1328:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) )
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:2: (enumLiteral_0= '*' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:2: (enumLiteral_0= '*' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1329:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleFactorOperator2974); 

                            current = grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1335:6: (enumLiteral_1= '/' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1335:6: (enumLiteral_1= '/' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1335:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleFactorOperator2991); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1345:1: ruleComparisonOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1347:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1348:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1348:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '==' ) | (enumLiteral_5= '!=' ) )
            int alt18=6;
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
            case 28:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1348:2: (enumLiteral_0= '>' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1348:2: (enumLiteral_0= '>' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1348:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleComparisonOperator3036); 

                            current = grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1354:6: (enumLiteral_1= '>=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1354:6: (enumLiteral_1= '>=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1354:8: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleComparisonOperator3053); 

                            current = grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1360:6: (enumLiteral_2= '<' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1360:6: (enumLiteral_2= '<' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1360:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleComparisonOperator3070); 

                            current = grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1366:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1366:6: (enumLiteral_3= '<=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1366:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleComparisonOperator3087); 

                            current = grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1372:6: (enumLiteral_4= '==' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1372:6: (enumLiteral_4= '==' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1372:8: enumLiteral_4= '=='
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleComparisonOperator3104); 

                            current = grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1378:6: (enumLiteral_5= '!=' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1378:6: (enumLiteral_5= '!=' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1378:8: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_28_in_ruleComparisonOperator3121); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1388:1: ruleUnaryLogicalOperator returns [Enumerator current=null] : (enumLiteral_0= 'not' ) ;
    public final Enumerator ruleUnaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1390:28: ( (enumLiteral_0= 'not' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1391:1: (enumLiteral_0= 'not' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1391:1: (enumLiteral_0= 'not' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1391:3: enumLiteral_0= 'not'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_29_in_ruleUnaryLogicalOperator3165); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1401:1: ruleBinaryLogicalOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleBinaryLogicalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1403:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1404:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1404:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1404:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1404:2: (enumLiteral_0= 'and' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1404:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleBinaryLogicalOperator3209); 

                            current = grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1410:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1410:6: (enumLiteral_1= 'or' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1410:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleBinaryLogicalOperator3226); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1420:1: ruleTernaryOperator returns [Enumerator current=null] : (enumLiteral_0= 'if' ) ;
    public final Enumerator ruleTernaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1422:28: ( (enumLiteral_0= 'if' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1423:1: (enumLiteral_0= 'if' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1423:1: (enumLiteral_0= 'if' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1423:3: enumLiteral_0= 'if'
            {
            enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleTernaryOperator3270); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1433:1: ruleBooleanValue returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1435:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1436:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1436:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            else if ( (LA20_0==34) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1436:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1436:2: (enumLiteral_0= 'true' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1436:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleBooleanValue3314); 

                            current = grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1442:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1442:6: (enumLiteral_1= 'false' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1442:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleBooleanValue3331); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram233 = new BitSet(new long[]{0x00000007E0009032L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram255 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProgram267 = new BitSet(new long[]{0x00000007E0009032L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleExpression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleExpression389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_ruleExpression416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_ruleExpression443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_ruleExpression470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_ruleExpression497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryExpression542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryOperator_in_ruleTernaryExpression588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTernaryExpression600 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression621 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTernaryExpression633 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression654 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTernaryExpression666 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTernaryExpression687 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTernaryExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalBinaryExpression745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryLogicalOperator_in_ruleLogicalBinaryExpression791 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLogicalBinaryExpression803 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression824 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLogicalBinaryExpression836 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalBinaryExpression857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLogicalBinaryExpression869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalUnaryExpression915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicalOperator_in_ruleLogicalUnaryExpression961 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLogicalUnaryExpression973 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLogicalUnaryExpression994 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLogicalUnaryExpression1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1099 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_ruleComparisonExpression1129 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleComparisonExpression1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration1235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionDeclaration1247 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1265 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDeclaration1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1300 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration1321 = new BitSet(new long[]{0x00000007E0019030L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFunctionDeclaration1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBody1462 = new BitSet(new long[]{0x00000007E0029030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody1484 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleBody1496 = new BitSet(new long[]{0x00000007E0029030L});
    public static final BitSet FOLLOW_17_in_ruleBody1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolReference1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1695 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleNumericExpression1725 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1746 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1841 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorOperator_in_ruleFactor1871 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1892 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_ruleTerm1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleTerm2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply2049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_ruleApply2106 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleApply2127 = new BitSet(new long[]{0x00000007E000D030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply2149 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleApply2162 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApply2183 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleApply2199 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor2237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_ruleFunctor2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleFunctor2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression2356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_ruleLiteralExpression2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleLiteralExpression2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleLiteralBoolean2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber2565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteralNumber2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssignment2708 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableAssignment2725 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignment2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleParenthesisExpression2829 = new BitSet(new long[]{0x00000007E0009030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisExpression2851 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleParenthesisExpression2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAdditionOperator2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAdditionOperator2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFactorOperator2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFactorOperator2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleComparisonOperator3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComparisonOperator3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComparisonOperator3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComparisonOperator3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComparisonOperator3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComparisonOperator3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUnaryLogicalOperator3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleBinaryLogicalOperator3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBinaryLogicalOperator3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTernaryOperator3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBooleanValue3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBooleanValue3331 = new BitSet(new long[]{0x0000000000000002L});

}