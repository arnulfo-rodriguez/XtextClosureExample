package org.arz.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'func'", "'('", "','", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_NUM=5;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:76:1: ruleModel returns [EObject current=null] : this_Program_0= ruleProgram ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Program_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:79:28: (this_Program_0= ruleProgram )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:81:5: this_Program_0= ruleProgram
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:97:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:98:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:99:2: iv_ruleProgram= ruleProgram EOF
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:106:1: ruleProgram returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:109:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:1: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:1: ( ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )* )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:2: ( (lv_expressions_0_0= ruleExpression ) ) otherlv_1= ';' ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:111:1: (lv_expressions_0_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:112:3: lv_expressions_0_0= ruleExpression
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleProgram233); 

                	newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getSemicolonKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:132:1: ( ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NUM)||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:132:2: ( (lv_expressions_2_0= ruleExpression ) ) otherlv_3= ';'
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:132:2: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:133:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:133:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:134:3: lv_expressions_2_0= ruleExpression
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

            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleProgram267); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:162:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:163:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:164:2: iv_ruleExpression= ruleExpression EOF
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:171:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_NumericExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:174:28: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:175:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:175:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==23) ) {
                    alt2=2;
                }
                else if ( (LA2_2==EOF||LA2_2==12||(LA2_2>=14 && LA2_2<=16)||(LA2_2>=19 && LA2_2<=22)) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUM:
            case 14:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:176:5: this_FunctionDeclaration_0= ruleFunctionDeclaration
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:186:5: this_VariableAssignment_1= ruleVariableAssignment
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:196:5: this_NumericExpression_2= ruleNumericExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericExpression_in_ruleExpression416);
                    this_NumericExpression_2=ruleNumericExpression();

                    state._fsp--;

                     
                            current = this_NumericExpression_2; 
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


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:212:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:213:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:214:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration451);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration461); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:221:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) ;
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
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:224:28: ( (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:225:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:225:1: (otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:225:3: otherlv_0= 'func' otherlv_1= '(' ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )? otherlv_5= ')' ( (lv_body_6_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDeclaration498); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDeclaration510); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:233:1: ( ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:233:2: ( (lv_parameters_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:233:2: ( (lv_parameters_2_0= RULE_ID ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:234:1: (lv_parameters_2_0= RULE_ID )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:234:1: (lv_parameters_2_0= RULE_ID )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:235:3: lv_parameters_2_0= RULE_ID
                    {
                    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration528); 

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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:251:2: (otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:251:4: otherlv_3= ',' ( (lv_parameters_4_0= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration546); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:255:1: ( (lv_parameters_4_0= RULE_ID ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:1: (lv_parameters_4_0= RULE_ID )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:256:1: (lv_parameters_4_0= RULE_ID )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:257:3: lv_parameters_4_0= RULE_ID
                    	    {
                    	    lv_parameters_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration563); 

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
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDeclaration584); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:277:1: ( (lv_body_6_0= ruleBody ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:1: (lv_body_6_0= ruleBody )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:1: (lv_body_6_0= ruleBody )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:279:3: lv_body_6_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleFunctionDeclaration605);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:303:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:304:2: (iv_ruleBody= ruleBody EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:305:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody641);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody651); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:312:1: ruleBody returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:315:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:316:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:316:1: ( ( (lv_expressions_0_0= ruleExpression ) ) | ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NUM)||(LA6_0>=13 && LA6_0<=14)) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:316:2: ( (lv_expressions_0_0= ruleExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:316:2: ( (lv_expressions_0_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:317:1: (lv_expressions_0_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:317:1: (lv_expressions_0_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:318:3: lv_expressions_0_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBody697);
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
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:335:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:335:6: ( () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:335:7: () otherlv_2= '{' ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )* otherlv_5= '}'
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:335:7: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:336:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getBodyAccess().getBodyAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBody725); 

                        	newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:345:1: ( ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_NUM)||(LA5_0>=13 && LA5_0<=14)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:345:2: ( (lv_expressions_3_0= ruleExpression ) ) otherlv_4= ';'
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:345:2: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:346:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:346:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:347:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleBody747);
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

                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleBody759); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBody773); 

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


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:379:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:380:2: (iv_ruleApply= ruleApply EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:381:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply810);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply820); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:388:1: ruleApply returns [EObject current=null] : (this_Functor_0= ruleFunctor ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )? ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        EObject this_Functor_0 = null;

        EObject lv_arguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:391:28: ( (this_Functor_0= ruleFunctor ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:1: (this_Functor_0= ruleFunctor ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:392:1: (this_Functor_0= ruleFunctor ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:393:5: this_Functor_0= ruleFunctor ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFunctor_in_ruleApply867);
            this_Functor_0=ruleFunctor();

            state._fsp--;

             
                    current = this_Functor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:401:1: ( () ( (lv_arguments_2_0= ruleApplyTail ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:401:2: () ( (lv_arguments_2_0= ruleApplyTail ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:401:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:402:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getApplyAccess().getApplyFunctorAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:407:2: ( (lv_arguments_2_0= ruleApplyTail ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:408:1: (lv_arguments_2_0= ruleApplyTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:408:1: (lv_arguments_2_0= ruleApplyTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:409:3: lv_arguments_2_0= ruleApplyTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplyTail_in_ruleApply897);
                    lv_arguments_2_0=ruleApplyTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyRule());
                    	        }
                           		set(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"ApplyTail");
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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:433:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:434:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:435:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor935);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor945); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:442:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:445:28: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:446:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:446:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:447:5: this_SymbolReference_0= ruleSymbolReference
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolReference_in_ruleFunctor992);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;

                     
                            current = this_SymbolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:457:5: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleFunctor1019);
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


    // $ANTLR start "entryRuleApplyTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:473:1: entryRuleApplyTail returns [EObject current=null] : iv_ruleApplyTail= ruleApplyTail EOF ;
    public final EObject entryRuleApplyTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:474:2: (iv_ruleApplyTail= ruleApplyTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:475:2: iv_ruleApplyTail= ruleApplyTail EOF
            {
             newCompositeNode(grammarAccess.getApplyTailRule()); 
            pushFollow(FOLLOW_ruleApplyTail_in_entryRuleApplyTail1054);
            iv_ruleApplyTail=ruleApplyTail();

            state._fsp--;

             current =iv_ruleApplyTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyTail1064); 

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
    // $ANTLR end "entryRuleApplyTail"


    // $ANTLR start "ruleApplyTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:482:1: ruleApplyTail returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ( (lv_nextCall_6_0= ruleApplyTail ) )? ) ;
    public final EObject ruleApplyTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_nextCall_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:485:28: ( ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ( (lv_nextCall_6_0= ruleApplyTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:486:1: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ( (lv_nextCall_6_0= ruleApplyTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:486:1: ( () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ( (lv_nextCall_6_0= ruleApplyTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:486:2: () otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ( (lv_nextCall_6_0= ruleApplyTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:486:2: ()
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:487:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getApplyTailAccess().getApplyTailAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleApplyTail1110); 

                	newLeafNode(otherlv_1, grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:496:1: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NUM)||(LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:496:2: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:496:2: ( (lv_arguments_2_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:497:1: (lv_arguments_2_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:497:1: (lv_arguments_2_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:498:3: lv_arguments_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleApplyTail1132);
                    lv_arguments_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyTailRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:514:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:514:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleApplyTail1145); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getApplyTailAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:518:1: ( (lv_arguments_4_0= ruleExpression ) )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:519:1: (lv_arguments_4_0= ruleExpression )
                    	    {
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:519:1: (lv_arguments_4_0= ruleExpression )
                    	    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:520:3: lv_arguments_4_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleApplyTail1166);
                    	    lv_arguments_4_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getApplyTailRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_4_0, 
                    	            		"Expression");
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
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleApplyTail1182); 

                	newLeafNode(otherlv_5, grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:540:1: ( (lv_nextCall_6_0= ruleApplyTail ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:541:1: (lv_nextCall_6_0= ruleApplyTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:541:1: (lv_nextCall_6_0= ruleApplyTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:542:3: lv_nextCall_6_0= ruleApplyTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplyTail_in_ruleApplyTail1203);
                    lv_nextCall_6_0=ruleApplyTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyTailRule());
                    	        }
                           		set(
                           			current, 
                           			"nextCall",
                            		lv_nextCall_6_0, 
                            		"ApplyTail");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleApplyTail"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:566:1: entryRuleLiteralExpr returns [EObject current=null] : iv_ruleLiteralExpr= ruleLiteralExpr EOF ;
    public final EObject entryRuleLiteralExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpr = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:567:2: (iv_ruleLiteralExpr= ruleLiteralExpr EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:568:2: iv_ruleLiteralExpr= ruleLiteralExpr EOF
            {
             newCompositeNode(grammarAccess.getLiteralExprRule()); 
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr1240);
            iv_ruleLiteralExpr=ruleLiteralExpr();

            state._fsp--;

             current =iv_ruleLiteralExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr1250); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:575:1: ruleLiteralExpr returns [EObject current=null] : ( (lv_value_0_0= RULE_NUM ) ) ;
    public final EObject ruleLiteralExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:578:28: ( ( (lv_value_0_0= RULE_NUM ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:579:1: ( (lv_value_0_0= RULE_NUM ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:579:1: ( (lv_value_0_0= RULE_NUM ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:580:1: (lv_value_0_0= RULE_NUM )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:580:1: (lv_value_0_0= RULE_NUM )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:581:3: lv_value_0_0= RULE_NUM
            {
            lv_value_0_0=(Token)match(input,RULE_NUM,FOLLOW_RULE_NUM_in_ruleLiteralExpr1291); 

            			newLeafNode(lv_value_0_0, grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralExprRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Num");
            	    

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


    // $ANTLR start "entryRuleSymbolReference"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:605:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:606:2: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:607:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1331);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference1341); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:614:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:617:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:618:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:618:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:619:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:619:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:620:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolReference1382); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:644:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:645:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:646:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1422);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression1432); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:653:1: ruleNumericExpression returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )? ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        EObject lv_numExprTail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:656:28: ( (this_Factor_0= ruleFactor ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:657:1: (this_Factor_0= ruleFactor ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:657:1: (this_Factor_0= ruleFactor ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:658:5: this_Factor_0= ruleFactor ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression1479);
            this_Factor_0=ruleFactor();

            state._fsp--;

             
                    current = this_Factor_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:666:1: ( () ( (lv_numExprTail_2_0= ruleNumExprTail ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=19 && LA12_0<=20)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:666:2: () ( (lv_numExprTail_2_0= ruleNumExprTail ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:666:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:667:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:672:2: ( (lv_numExprTail_2_0= ruleNumExprTail ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:673:1: (lv_numExprTail_2_0= ruleNumExprTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:673:1: (lv_numExprTail_2_0= ruleNumExprTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:674:3: lv_numExprTail_2_0= ruleNumExprTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getNumExprTailNumExprTailParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExprTail_in_ruleNumericExpression1509);
                    lv_numExprTail_2_0=ruleNumExprTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"numExprTail",
                            		lv_numExprTail_2_0, 
                            		"NumExprTail");
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
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleNumExprTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:698:1: entryRuleNumExprTail returns [EObject current=null] : iv_ruleNumExprTail= ruleNumExprTail EOF ;
    public final EObject entryRuleNumExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumExprTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:699:2: (iv_ruleNumExprTail= ruleNumExprTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:700:2: iv_ruleNumExprTail= ruleNumExprTail EOF
            {
             newCompositeNode(grammarAccess.getNumExprTailRule()); 
            pushFollow(FOLLOW_ruleNumExprTail_in_entryRuleNumExprTail1547);
            iv_ruleNumExprTail=ruleNumExprTail();

            state._fsp--;

             current =iv_ruleNumExprTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExprTail1557); 

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
    // $ANTLR end "entryRuleNumExprTail"


    // $ANTLR start "ruleNumExprTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:707:1: ruleNumExprTail returns [EObject current=null] : ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) ) ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleNumExprTail ) )? ) ;
    public final EObject ruleNumExprTail() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        EObject lv_factor_1_0 = null;

        EObject lv_exprTail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:710:28: ( ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) ) ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleNumExprTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:1: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) ) ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleNumExprTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:1: ( ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) ) ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleNumExprTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:2: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) ) ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleNumExprTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:711:2: ( ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:712:1: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:712:1: ( (lv_operator_0_1= '+' | lv_operator_0_2= '-' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:713:1: (lv_operator_0_1= '+' | lv_operator_0_2= '-' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:713:1: (lv_operator_0_1= '+' | lv_operator_0_2= '-' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            else if ( (LA13_0==20) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:714:3: lv_operator_0_1= '+'
                    {
                    lv_operator_0_1=(Token)match(input,19,FOLLOW_19_in_ruleNumExprTail1602); 

                            newLeafNode(lv_operator_0_1, grammarAccess.getNumExprTailAccess().getOperatorPlusSignKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExprTailRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:726:8: lv_operator_0_2= '-'
                    {
                    lv_operator_0_2=(Token)match(input,20,FOLLOW_20_in_ruleNumExprTail1631); 

                            newLeafNode(lv_operator_0_2, grammarAccess.getNumExprTailAccess().getOperatorHyphenMinusKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumExprTailRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:741:2: ( (lv_factor_1_0= ruleFactor ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:742:1: (lv_factor_1_0= ruleFactor )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:742:1: (lv_factor_1_0= ruleFactor )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:743:3: lv_factor_1_0= ruleFactor
            {
             
            	        newCompositeNode(grammarAccess.getNumExprTailAccess().getFactorFactorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFactor_in_ruleNumExprTail1668);
            lv_factor_1_0=ruleFactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumExprTailRule());
            	        }
                   		set(
                   			current, 
                   			"factor",
                    		lv_factor_1_0, 
                    		"Factor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:759:2: ( (lv_exprTail_2_0= ruleNumExprTail ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:760:1: (lv_exprTail_2_0= ruleNumExprTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:760:1: (lv_exprTail_2_0= ruleNumExprTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:761:3: lv_exprTail_2_0= ruleNumExprTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumExprTailAccess().getExprTailNumExprTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumExprTail_in_ruleNumExprTail1689);
                    lv_exprTail_2_0=ruleNumExprTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumExprTailRule());
                    	        }
                           		set(
                           			current, 
                           			"exprTail",
                            		lv_exprTail_2_0, 
                            		"NumExprTail");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleNumExprTail"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:785:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:786:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:787:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1726);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1736); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:794:1: ruleFactor returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Term_0 = null;

        EObject lv_factorTail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:797:28: ( (this_Term_0= ruleTerm ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:798:1: (this_Term_0= ruleTerm ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:798:1: (this_Term_0= ruleTerm ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:799:5: this_Term_0= ruleTerm ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTerm_in_ruleFactor1783);
            this_Term_0=ruleTerm();

            state._fsp--;

             
                    current = this_Term_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:807:1: ( () ( (lv_factorTail_2_0= ruleFactorTail ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=21 && LA15_0<=22)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:807:2: () ( (lv_factorTail_2_0= ruleFactorTail ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:807:2: ()
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:808:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getFactorAccess().getFactorTermAction_1_0(),
                                current);
                        

                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:813:2: ( (lv_factorTail_2_0= ruleFactorTail ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:814:1: (lv_factorTail_2_0= ruleFactorTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:814:1: (lv_factorTail_2_0= ruleFactorTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:815:3: lv_factorTail_2_0= ruleFactorTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactorTail_in_ruleFactor1813);
                    lv_factorTail_2_0=ruleFactorTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"factorTail",
                            		lv_factorTail_2_0, 
                            		"FactorTail");
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFactorTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:839:1: entryRuleFactorTail returns [EObject current=null] : iv_ruleFactorTail= ruleFactorTail EOF ;
    public final EObject entryRuleFactorTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:840:2: (iv_ruleFactorTail= ruleFactorTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:841:2: iv_ruleFactorTail= ruleFactorTail EOF
            {
             newCompositeNode(grammarAccess.getFactorTailRule()); 
            pushFollow(FOLLOW_ruleFactorTail_in_entryRuleFactorTail1851);
            iv_ruleFactorTail=ruleFactorTail();

            state._fsp--;

             current =iv_ruleFactorTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorTail1861); 

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
    // $ANTLR end "entryRuleFactorTail"


    // $ANTLR start "ruleFactorTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:848:1: ruleFactorTail returns [EObject current=null] : ( ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) ) ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) ;
    public final EObject ruleFactorTail() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        EObject lv_term_1_0 = null;

        EObject lv_factorTail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:851:28: ( ( ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) ) ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:852:1: ( ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) ) ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:852:1: ( ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) ) ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:852:2: ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) ) ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:852:2: ( ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:853:1: ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:853:1: ( (lv_operator_0_1= '*' | lv_operator_0_2= '/' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:854:1: (lv_operator_0_1= '*' | lv_operator_0_2= '/' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:854:1: (lv_operator_0_1= '*' | lv_operator_0_2= '/' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==22) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:855:3: lv_operator_0_1= '*'
                    {
                    lv_operator_0_1=(Token)match(input,21,FOLLOW_21_in_ruleFactorTail1906); 

                            newLeafNode(lv_operator_0_1, grammarAccess.getFactorTailAccess().getOperatorAsteriskKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorTailRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:867:8: lv_operator_0_2= '/'
                    {
                    lv_operator_0_2=(Token)match(input,22,FOLLOW_22_in_ruleFactorTail1935); 

                            newLeafNode(lv_operator_0_2, grammarAccess.getFactorTailAccess().getOperatorSolidusKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFactorTailRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:882:2: ( (lv_term_1_0= ruleTerm ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:883:1: (lv_term_1_0= ruleTerm )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:883:1: (lv_term_1_0= ruleTerm )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:884:3: lv_term_1_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleFactorTail1972);
            lv_term_1_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactorTailRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_1_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:900:2: ( (lv_factorTail_2_0= ruleFactorTail ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:901:1: (lv_factorTail_2_0= ruleFactorTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:901:1: (lv_factorTail_2_0= ruleFactorTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:902:3: lv_factorTail_2_0= ruleFactorTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactorTail_in_ruleFactorTail1993);
                    lv_factorTail_2_0=ruleFactorTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorTailRule());
                    	        }
                           		set(
                           			current, 
                           			"factorTail",
                            		lv_factorTail_2_0, 
                            		"FactorTail");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleFactorTail"


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
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2030);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2040); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:935:1: ruleTerm returns [EObject current=null] : (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpr_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:938:28: ( (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:939:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:939:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_NUM) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||LA18_0==14) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:940:5: this_LiteralExpr_0= ruleLiteralExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpr_in_ruleTerm2087);
                    this_LiteralExpr_0=ruleLiteralExpr();

                    state._fsp--;

                     
                            current = this_LiteralExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:950:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleTerm2114);
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


    // $ANTLR start "entryRuleVariableAssignment"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:966:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:967:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:968:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2149);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2159); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:975:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:978:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:979:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:980:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:980:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:981:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssignment2201); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariableAssignment2218); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1001:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1002:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1002:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1003:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignment2239);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1027:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1028:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1029:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2275);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression2285); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1036:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1039:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1040:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1040:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1040:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleParenthesisExpression2322); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisExpression2344);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleParenthesisExpression2355); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram233 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram255 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram267 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleExpression362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleExpression389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleExpression416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDeclaration498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration510 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration528 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration563 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDeclaration584 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFunctionDeclaration605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBody725 = new BitSet(new long[]{0x0000000000046030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody747 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBody759 = new BitSet(new long[]{0x0000000000046030L});
    public static final BitSet FOLLOW_18_in_ruleBody773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_ruleApply867 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_ruleApply897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_ruleFunctor992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleFunctor1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_entryRuleApplyTail1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyTail1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleApplyTail1110 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApplyTail1132 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleApplyTail1145 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleApplyTail1166 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleApplyTail1182 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_ruleApplyTail1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr1240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_ruleLiteralExpr1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolReference1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression1479 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_ruleNumericExpression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_entryRuleNumExprTail1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExprTail1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleNumExprTail1602 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_20_in_ruleNumExprTail1631 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumExprTail1668 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_ruleNumExprTail1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor1783 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_ruleFactor1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_entryRuleFactorTail1851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorTail1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFactorTail1906 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_22_in_ruleFactorTail1935 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactorTail1972 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_ruleFactorTail1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_ruleTerm2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleTerm2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssignment2201 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariableAssignment2218 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignment2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleParenthesisExpression2322 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisExpression2344 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleParenthesisExpression2355 = new BitSet(new long[]{0x0000000000000002L});

}