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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'func'", "'('", "')'", "'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'", "'='"
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:106:1: ruleProgram returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleProgramTail ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;

        EObject lv_tail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:109:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleProgramTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleProgramTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleProgramTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:110:2: ( (lv_expressions_0_0= ruleExpression ) ) ( (lv_tail_1_0= ruleProgramTail ) )?
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

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:128:2: ( (lv_tail_1_0= ruleProgramTail ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:129:1: (lv_tail_1_0= ruleProgramTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:129:1: (lv_tail_1_0= ruleProgramTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:130:3: lv_tail_1_0= ruleProgramTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramAccess().getTailProgramTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProgramTail_in_ruleProgram242);
                    lv_tail_1_0=ruleProgramTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_1_0, 
                            		"ProgramTail");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProgramTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:154:1: entryRuleProgramTail returns [EObject current=null] : iv_ruleProgramTail= ruleProgramTail EOF ;
    public final EObject entryRuleProgramTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:155:2: (iv_ruleProgramTail= ruleProgramTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:156:2: iv_ruleProgramTail= ruleProgramTail EOF
            {
             newCompositeNode(grammarAccess.getProgramTailRule()); 
            pushFollow(FOLLOW_ruleProgramTail_in_entryRuleProgramTail279);
            iv_ruleProgramTail=ruleProgramTail();

            state._fsp--;

             current =iv_ruleProgramTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramTail289); 

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
    // $ANTLR end "entryRuleProgramTail"


    // $ANTLR start "ruleProgramTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:163:1: ruleProgramTail returns [EObject current=null] : (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleProgramTail ) )? ) ;
    public final EObject ruleProgramTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:166:28: ( (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleProgramTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:167:1: (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleProgramTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:167:1: (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleProgramTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:167:3: otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleProgramTail ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleProgramTail326); 

                	newLeafNode(otherlv_0, grammarAccess.getProgramTailAccess().getSemicolonKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:171:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:172:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:172:1: (lv_expression_1_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:173:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getProgramTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleProgramTail347);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProgramTailRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:189:2: ( (lv_tail_2_0= ruleProgramTail ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:190:1: (lv_tail_2_0= ruleProgramTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:190:1: (lv_tail_2_0= ruleProgramTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:191:3: lv_tail_2_0= ruleProgramTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getProgramTailAccess().getTailProgramTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProgramTail_in_ruleProgramTail368);
                    lv_tail_2_0=ruleProgramTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProgramTailRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_2_0, 
                            		"ProgramTail");
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
    // $ANTLR end "ruleProgramTail"


    // $ANTLR start "entryRuleExpression"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:215:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:216:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:217:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression405);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression415); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:224:1: ruleExpression returns [EObject current=null] : (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_VariableAssignment_1 = null;

        EObject this_NumericExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:227:28: ( (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:228:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:228:1: (this_FunctionDeclaration_0= ruleFunctionDeclaration | this_VariableAssignment_1= ruleVariableAssignment | this_NumericExpression_2= ruleNumericExpression )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==EOF||LA3_2==12||(LA3_2>=14 && LA3_2<=15)||(LA3_2>=17 && LA3_2<=22)) ) {
                    alt3=3;
                }
                else if ( (LA3_2==23) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUM:
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:229:5: this_FunctionDeclaration_0= ruleFunctionDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleExpression462);
                    this_FunctionDeclaration_0=ruleFunctionDeclaration();

                    state._fsp--;

                     
                            current = this_FunctionDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:239:5: this_VariableAssignment_1= ruleVariableAssignment
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleVariableAssignment_in_ruleExpression489);
                    this_VariableAssignment_1=ruleVariableAssignment();

                    state._fsp--;

                     
                            current = this_VariableAssignment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:249:5: this_NumericExpression_2= ruleNumericExpression
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNumericExpression_in_ruleExpression516);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:265:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:266:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:267:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration551);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;

             current =iv_ruleFunctionDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration561); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:274:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameters ) )? otherlv_3= ')' ( (lv_body_4_0= ruleBody ) ) ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_body_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:277:28: ( (otherlv_0= 'func' otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameters ) )? otherlv_3= ')' ( (lv_body_4_0= ruleBody ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:1: (otherlv_0= 'func' otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameters ) )? otherlv_3= ')' ( (lv_body_4_0= ruleBody ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:1: (otherlv_0= 'func' otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameters ) )? otherlv_3= ')' ( (lv_body_4_0= ruleBody ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:278:3: otherlv_0= 'func' otherlv_1= '(' ( (lv_parameters_2_0= ruleFunctionParameters ) )? otherlv_3= ')' ( (lv_body_4_0= ruleBody ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleFunctionDeclaration598); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDeclaration610); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:286:1: ( (lv_parameters_2_0= ruleFunctionParameters ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:287:1: (lv_parameters_2_0= ruleFunctionParameters )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:287:1: (lv_parameters_2_0= ruleFunctionParameters )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:288:3: lv_parameters_2_0= ruleFunctionParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParametersFunctionParametersParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameters_in_ruleFunctionDeclaration631);
                    lv_parameters_2_0=ruleFunctionParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"FunctionParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration644); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:308:1: ( (lv_body_4_0= ruleBody ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:309:1: (lv_body_4_0= ruleBody )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:309:1: (lv_body_4_0= ruleBody )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:310:3: lv_body_4_0= ruleBody
            {
             
            	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBody_in_ruleFunctionDeclaration665);
            lv_body_4_0=ruleBody();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_4_0, 
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:334:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:335:2: (iv_ruleBody= ruleBody EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:336:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody701);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody711); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:343:1: ruleBody returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_0_0 = null;

        EObject lv_expressions_2_0 = null;

        EObject lv_tail_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:346:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:347:1: ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:347:1: ( ( (lv_expression_0_0= ruleExpression ) ) | (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NUM)||(LA6_0>=13 && LA6_0<=14)) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:347:2: ( (lv_expression_0_0= ruleExpression ) )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:347:2: ( (lv_expression_0_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:348:1: (lv_expression_0_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:348:1: (lv_expression_0_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:349:3: lv_expression_0_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBody757);
                    lv_expression_0_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:6: (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:6: (otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}' )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:366:8: otherlv_1= '{' ( (lv_expressions_2_0= ruleExpression ) ) ( (lv_tail_3_0= ruleBodyTail ) )? otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBody776); 

                        	newLeafNode(otherlv_1, grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:370:1: ( (lv_expressions_2_0= ruleExpression ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:371:1: (lv_expressions_2_0= ruleExpression )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:371:1: (lv_expressions_2_0= ruleExpression )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:372:3: lv_expressions_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleBody797);
                    lv_expressions_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyRule());
                    	        }
                           		set(
                           			current, 
                           			"expressions",
                            		lv_expressions_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:388:2: ( (lv_tail_3_0= ruleBodyTail ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:389:1: (lv_tail_3_0= ruleBodyTail )
                            {
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:389:1: (lv_tail_3_0= ruleBodyTail )
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:390:3: lv_tail_3_0= ruleBodyTail
                            {
                             
                            	        newCompositeNode(grammarAccess.getBodyAccess().getTailBodyTailParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleBodyTail_in_ruleBody818);
                            lv_tail_3_0=ruleBodyTail();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getBodyRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"tail",
                                    		lv_tail_3_0, 
                                    		"BodyTail");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBody831); 

                        	newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3());
                        

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


    // $ANTLR start "entryRuleBodyTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:418:1: entryRuleBodyTail returns [EObject current=null] : iv_ruleBodyTail= ruleBodyTail EOF ;
    public final EObject entryRuleBodyTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:419:2: (iv_ruleBodyTail= ruleBodyTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:420:2: iv_ruleBodyTail= ruleBodyTail EOF
            {
             newCompositeNode(grammarAccess.getBodyTailRule()); 
            pushFollow(FOLLOW_ruleBodyTail_in_entryRuleBodyTail868);
            iv_ruleBodyTail=ruleBodyTail();

            state._fsp--;

             current =iv_ruleBodyTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyTail878); 

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
    // $ANTLR end "entryRuleBodyTail"


    // $ANTLR start "ruleBodyTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:427:1: ruleBodyTail returns [EObject current=null] : (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleBodyTail ) )? ) ;
    public final EObject ruleBodyTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:430:28: ( (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleBodyTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:431:1: (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleBodyTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:431:1: (otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleBodyTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:431:3: otherlv_0= ';' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_tail_2_0= ruleBodyTail ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleBodyTail915); 

                	newLeafNode(otherlv_0, grammarAccess.getBodyTailAccess().getSemicolonKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:435:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:436:1: (lv_expression_1_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:436:1: (lv_expression_1_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:437:3: lv_expression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getBodyTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleBodyTail936);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBodyTailRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:453:2: ( (lv_tail_2_0= ruleBodyTail ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:454:1: (lv_tail_2_0= ruleBodyTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:454:1: (lv_tail_2_0= ruleBodyTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:455:3: lv_tail_2_0= ruleBodyTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getBodyTailAccess().getTailBodyTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBodyTail_in_ruleBodyTail957);
                    lv_tail_2_0=ruleBodyTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBodyTailRule());
                    	        }
                           		set(
                           			current, 
                           			"tail",
                            		lv_tail_2_0, 
                            		"BodyTail");
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
    // $ANTLR end "ruleBodyTail"


    // $ANTLR start "entryRuleFunctionParameters"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:479:1: entryRuleFunctionParameters returns [EObject current=null] : iv_ruleFunctionParameters= ruleFunctionParameters EOF ;
    public final EObject entryRuleFunctionParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameters = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:480:2: (iv_ruleFunctionParameters= ruleFunctionParameters EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:481:2: iv_ruleFunctionParameters= ruleFunctionParameters EOF
            {
             newCompositeNode(grammarAccess.getFunctionParametersRule()); 
            pushFollow(FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters994);
            iv_ruleFunctionParameters=ruleFunctionParameters();

            state._fsp--;

             current =iv_ruleFunctionParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameters1004); 

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
    // $ANTLR end "entryRuleFunctionParameters"


    // $ANTLR start "ruleFunctionParameters"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:488:1: ruleFunctionParameters returns [EObject current=null] : ( ( (lv_parameter_0_0= RULE_ID ) ) ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )? ) ;
    public final EObject ruleFunctionParameters() throws RecognitionException {
        EObject current = null;

        Token lv_parameter_0_0=null;
        EObject lv_nextParameters_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:491:28: ( ( ( (lv_parameter_0_0= RULE_ID ) ) ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:492:1: ( ( (lv_parameter_0_0= RULE_ID ) ) ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:492:1: ( ( (lv_parameter_0_0= RULE_ID ) ) ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:492:2: ( (lv_parameter_0_0= RULE_ID ) ) ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:492:2: ( (lv_parameter_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:493:1: (lv_parameter_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:493:1: (lv_parameter_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:494:3: lv_parameter_0_0= RULE_ID
            {
            lv_parameter_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParameters1046); 

            			newLeafNode(lv_parameter_0_0, grammarAccess.getFunctionParametersAccess().getParameterIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionParametersRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter",
                    		lv_parameter_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:510:2: ( (lv_nextParameters_1_0= ruleFunctionParametersTail ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:511:1: (lv_nextParameters_1_0= ruleFunctionParametersTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:511:1: (lv_nextParameters_1_0= ruleFunctionParametersTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:512:3: lv_nextParameters_1_0= ruleFunctionParametersTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParametersAccess().getNextParametersFunctionParametersTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParametersTail_in_ruleFunctionParameters1072);
                    lv_nextParameters_1_0=ruleFunctionParametersTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParametersRule());
                    	        }
                           		set(
                           			current, 
                           			"nextParameters",
                            		lv_nextParameters_1_0, 
                            		"FunctionParametersTail");
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
    // $ANTLR end "ruleFunctionParameters"


    // $ANTLR start "entryRuleFunctionParametersTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:536:1: entryRuleFunctionParametersTail returns [EObject current=null] : iv_ruleFunctionParametersTail= ruleFunctionParametersTail EOF ;
    public final EObject entryRuleFunctionParametersTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParametersTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:537:2: (iv_ruleFunctionParametersTail= ruleFunctionParametersTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:538:2: iv_ruleFunctionParametersTail= ruleFunctionParametersTail EOF
            {
             newCompositeNode(grammarAccess.getFunctionParametersTailRule()); 
            pushFollow(FOLLOW_ruleFunctionParametersTail_in_entryRuleFunctionParametersTail1109);
            iv_ruleFunctionParametersTail=ruleFunctionParametersTail();

            state._fsp--;

             current =iv_ruleFunctionParametersTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParametersTail1119); 

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
    // $ANTLR end "entryRuleFunctionParametersTail"


    // $ANTLR start "ruleFunctionParametersTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:545:1: ruleFunctionParametersTail returns [EObject current=null] : (otherlv_0= ',' ( (lv_parameter_1_0= RULE_ID ) ) ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )? ) ;
    public final EObject ruleFunctionParametersTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameter_1_0=null;
        EObject lv_nextParameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:548:28: ( (otherlv_0= ',' ( (lv_parameter_1_0= RULE_ID ) ) ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:549:1: (otherlv_0= ',' ( (lv_parameter_1_0= RULE_ID ) ) ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:549:1: (otherlv_0= ',' ( (lv_parameter_1_0= RULE_ID ) ) ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:549:3: otherlv_0= ',' ( (lv_parameter_1_0= RULE_ID ) ) ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFunctionParametersTail1156); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionParametersTailAccess().getCommaKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:553:1: ( (lv_parameter_1_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:554:1: (lv_parameter_1_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:554:1: (lv_parameter_1_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:555:3: lv_parameter_1_0= RULE_ID
            {
            lv_parameter_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionParametersTail1173); 

            			newLeafNode(lv_parameter_1_0, grammarAccess.getFunctionParametersTailAccess().getParameterIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionParametersTailRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"parameter",
                    		lv_parameter_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:571:2: ( (lv_nextParameters_2_0= ruleFunctionParametersTail ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:572:1: (lv_nextParameters_2_0= ruleFunctionParametersTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:572:1: (lv_nextParameters_2_0= ruleFunctionParametersTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:573:3: lv_nextParameters_2_0= ruleFunctionParametersTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParametersTailAccess().getNextParametersFunctionParametersTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParametersTail_in_ruleFunctionParametersTail1199);
                    lv_nextParameters_2_0=ruleFunctionParametersTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParametersTailRule());
                    	        }
                           		set(
                           			current, 
                           			"nextParameters",
                            		lv_nextParameters_2_0, 
                            		"FunctionParametersTail");
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
    // $ANTLR end "ruleFunctionParametersTail"


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:597:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:598:2: (iv_ruleApply= ruleApply EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:599:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply1236);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply1246); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:606:1: ruleApply returns [EObject current=null] : ( ( (lv_functor_0_0= ruleFunctor ) ) ( (lv_arguments_1_0= ruleApplyTail ) )? ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        EObject lv_functor_0_0 = null;

        EObject lv_arguments_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:609:28: ( ( ( (lv_functor_0_0= ruleFunctor ) ) ( (lv_arguments_1_0= ruleApplyTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:610:1: ( ( (lv_functor_0_0= ruleFunctor ) ) ( (lv_arguments_1_0= ruleApplyTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:610:1: ( ( (lv_functor_0_0= ruleFunctor ) ) ( (lv_arguments_1_0= ruleApplyTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:610:2: ( (lv_functor_0_0= ruleFunctor ) ) ( (lv_arguments_1_0= ruleApplyTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:610:2: ( (lv_functor_0_0= ruleFunctor ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:611:1: (lv_functor_0_0= ruleFunctor )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:611:1: (lv_functor_0_0= ruleFunctor )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:612:3: lv_functor_0_0= ruleFunctor
            {
             
            	        newCompositeNode(grammarAccess.getApplyAccess().getFunctorFunctorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctor_in_ruleApply1292);
            lv_functor_0_0=ruleFunctor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getApplyRule());
            	        }
                   		set(
                   			current, 
                   			"functor",
                    		lv_functor_0_0, 
                    		"Functor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:628:2: ( (lv_arguments_1_0= ruleApplyTail ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:629:1: (lv_arguments_1_0= ruleApplyTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:629:1: (lv_arguments_1_0= ruleApplyTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:630:3: lv_arguments_1_0= ruleApplyTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplyTail_in_ruleApply1313);
                    lv_arguments_1_0=ruleApplyTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyRule());
                    	        }
                           		set(
                           			current, 
                           			"arguments",
                            		lv_arguments_1_0, 
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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:654:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:655:2: (iv_ruleFunctor= ruleFunctor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:656:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor1350);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor1360); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:663:1: ruleFunctor returns [EObject current=null] : (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject this_SymbolReference_0 = null;

        EObject this_ParenthesisExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:666:28: ( (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:667:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:667:1: (this_SymbolReference_0= ruleSymbolReference | this_ParenthesisExpression_1= ruleParenthesisExpression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==14) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:668:5: this_SymbolReference_0= ruleSymbolReference
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSymbolReference_in_ruleFunctor1407);
                    this_SymbolReference_0=ruleSymbolReference();

                    state._fsp--;

                     
                            current = this_SymbolReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:678:5: this_ParenthesisExpression_1= ruleParenthesisExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_ruleFunctor1434);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:694:1: entryRuleApplyTail returns [EObject current=null] : iv_ruleApplyTail= ruleApplyTail EOF ;
    public final EObject entryRuleApplyTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplyTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:695:2: (iv_ruleApplyTail= ruleApplyTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:696:2: iv_ruleApplyTail= ruleApplyTail EOF
            {
             newCompositeNode(grammarAccess.getApplyTailRule()); 
            pushFollow(FOLLOW_ruleApplyTail_in_entryRuleApplyTail1469);
            iv_ruleApplyTail=ruleApplyTail();

            state._fsp--;

             current =iv_ruleApplyTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyTail1479); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:703:1: ruleApplyTail returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ( (lv_nextCall_4_0= ruleApplyTail ) )? ) ;
    public final EObject ruleApplyTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_args_2_0 = null;

        EObject lv_nextCall_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:706:28: ( ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ( (lv_nextCall_4_0= ruleApplyTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:707:1: ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ( (lv_nextCall_4_0= ruleApplyTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:707:1: ( () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ( (lv_nextCall_4_0= ruleApplyTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:707:2: () otherlv_1= '(' ( (lv_args_2_0= ruleFunctionArguments ) )? otherlv_3= ')' ( (lv_nextCall_4_0= ruleApplyTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:707:2: ()
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:708:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getApplyTailAccess().getApplyFunctionAlphaAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleApplyTail1525); 

                	newLeafNode(otherlv_1, grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:717:1: ( (lv_args_2_0= ruleFunctionArguments ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_NUM)||(LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:718:1: (lv_args_2_0= ruleFunctionArguments )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:718:1: (lv_args_2_0= ruleFunctionArguments )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:719:3: lv_args_2_0= ruleFunctionArguments
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyTailAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionArguments_in_ruleApplyTail1546);
                    lv_args_2_0=ruleFunctionArguments();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyTailRule());
                    	        }
                           		set(
                           			current, 
                           			"args",
                            		lv_args_2_0, 
                            		"FunctionArguments");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleApplyTail1559); 

                	newLeafNode(otherlv_3, grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:739:1: ( (lv_nextCall_4_0= ruleApplyTail ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:740:1: (lv_nextCall_4_0= ruleApplyTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:740:1: (lv_nextCall_4_0= ruleApplyTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:741:3: lv_nextCall_4_0= ruleApplyTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleApplyTail_in_ruleApplyTail1580);
                    lv_nextCall_4_0=ruleApplyTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getApplyTailRule());
                    	        }
                           		set(
                           			current, 
                           			"nextCall",
                            		lv_nextCall_4_0, 
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


    // $ANTLR start "entryRuleFunctionArguments"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:765:1: entryRuleFunctionArguments returns [EObject current=null] : iv_ruleFunctionArguments= ruleFunctionArguments EOF ;
    public final EObject entryRuleFunctionArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArguments = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:766:2: (iv_ruleFunctionArguments= ruleFunctionArguments EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:767:2: iv_ruleFunctionArguments= ruleFunctionArguments EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentsRule()); 
            pushFollow(FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments1617);
            iv_ruleFunctionArguments=ruleFunctionArguments();

            state._fsp--;

             current =iv_ruleFunctionArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArguments1627); 

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
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:774:1: ruleFunctionArguments returns [EObject current=null] : ( ( (lv_argument_0_0= ruleExpression ) ) ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )? ) ;
    public final EObject ruleFunctionArguments() throws RecognitionException {
        EObject current = null;

        EObject lv_argument_0_0 = null;

        EObject lv_nextArguments_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:777:28: ( ( ( (lv_argument_0_0= ruleExpression ) ) ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:1: ( ( (lv_argument_0_0= ruleExpression ) ) ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:1: ( ( (lv_argument_0_0= ruleExpression ) ) ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:2: ( (lv_argument_0_0= ruleExpression ) ) ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:778:2: ( (lv_argument_0_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:779:1: (lv_argument_0_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:779:1: (lv_argument_0_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:780:3: lv_argument_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getArgumentExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionArguments1673);
            lv_argument_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:796:2: ( (lv_nextArguments_1_0= ruleFunctionArgumentsTail ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:797:1: (lv_nextArguments_1_0= ruleFunctionArgumentsTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:797:1: (lv_nextArguments_1_0= ruleFunctionArgumentsTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:798:3: lv_nextArguments_1_0= ruleFunctionArgumentsTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_ruleFunctionArguments1694);
                    lv_nextArguments_1_0=ruleFunctionArgumentsTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionArgumentsRule());
                    	        }
                           		set(
                           			current, 
                           			"nextArguments",
                            		lv_nextArguments_1_0, 
                            		"FunctionArgumentsTail");
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
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleFunctionArgumentsTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:822:1: entryRuleFunctionArgumentsTail returns [EObject current=null] : iv_ruleFunctionArgumentsTail= ruleFunctionArgumentsTail EOF ;
    public final EObject entryRuleFunctionArgumentsTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgumentsTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:823:2: (iv_ruleFunctionArgumentsTail= ruleFunctionArgumentsTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:824:2: iv_ruleFunctionArgumentsTail= ruleFunctionArgumentsTail EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentsTailRule()); 
            pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_entryRuleFunctionArgumentsTail1731);
            iv_ruleFunctionArgumentsTail=ruleFunctionArgumentsTail();

            state._fsp--;

             current =iv_ruleFunctionArgumentsTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArgumentsTail1741); 

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
    // $ANTLR end "entryRuleFunctionArgumentsTail"


    // $ANTLR start "ruleFunctionArgumentsTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:831:1: ruleFunctionArgumentsTail returns [EObject current=null] : (otherlv_0= ',' ( (lv_argument_1_0= ruleExpression ) ) ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )? ) ;
    public final EObject ruleFunctionArgumentsTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_argument_1_0 = null;

        EObject lv_nextArguments_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:834:28: ( (otherlv_0= ',' ( (lv_argument_1_0= ruleExpression ) ) ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:835:1: (otherlv_0= ',' ( (lv_argument_1_0= ruleExpression ) ) ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:835:1: (otherlv_0= ',' ( (lv_argument_1_0= ruleExpression ) ) ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:835:3: otherlv_0= ',' ( (lv_argument_1_0= ruleExpression ) ) ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFunctionArgumentsTail1778); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionArgumentsTailAccess().getCommaKeyword_0());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:839:1: ( (lv_argument_1_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:840:1: (lv_argument_1_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:840:1: (lv_argument_1_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:841:3: lv_argument_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getFunctionArgumentsTailAccess().getArgumentExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleFunctionArgumentsTail1799);
            lv_argument_1_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionArgumentsTailRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_1_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:857:2: ( (lv_nextArguments_2_0= ruleFunctionArgumentsTail ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:858:1: (lv_nextArguments_2_0= ruleFunctionArgumentsTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:858:1: (lv_nextArguments_2_0= ruleFunctionArgumentsTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:859:3: lv_nextArguments_2_0= ruleFunctionArgumentsTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_ruleFunctionArgumentsTail1820);
                    lv_nextArguments_2_0=ruleFunctionArgumentsTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionArgumentsTailRule());
                    	        }
                           		set(
                           			current, 
                           			"nextArguments",
                            		lv_nextArguments_2_0, 
                            		"FunctionArgumentsTail");
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
    // $ANTLR end "ruleFunctionArgumentsTail"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:883:1: entryRuleLiteralExpr returns [EObject current=null] : iv_ruleLiteralExpr= ruleLiteralExpr EOF ;
    public final EObject entryRuleLiteralExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpr = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:884:2: (iv_ruleLiteralExpr= ruleLiteralExpr EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:885:2: iv_ruleLiteralExpr= ruleLiteralExpr EOF
            {
             newCompositeNode(grammarAccess.getLiteralExprRule()); 
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr1857);
            iv_ruleLiteralExpr=ruleLiteralExpr();

            state._fsp--;

             current =iv_ruleLiteralExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr1867); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:892:1: ruleLiteralExpr returns [EObject current=null] : ( (lv_value_0_0= RULE_NUM ) ) ;
    public final EObject ruleLiteralExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:895:28: ( ( (lv_value_0_0= RULE_NUM ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:896:1: ( (lv_value_0_0= RULE_NUM ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:896:1: ( (lv_value_0_0= RULE_NUM ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:897:1: (lv_value_0_0= RULE_NUM )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:897:1: (lv_value_0_0= RULE_NUM )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:898:3: lv_value_0_0= RULE_NUM
            {
            lv_value_0_0=(Token)match(input,RULE_NUM,FOLLOW_RULE_NUM_in_ruleLiteralExpr1908); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:922:1: entryRuleSymbolReference returns [EObject current=null] : iv_ruleSymbolReference= ruleSymbolReference EOF ;
    public final EObject entryRuleSymbolReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolReference = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:923:2: (iv_ruleSymbolReference= ruleSymbolReference EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:924:2: iv_ruleSymbolReference= ruleSymbolReference EOF
            {
             newCompositeNode(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1948);
            iv_ruleSymbolReference=ruleSymbolReference();

            state._fsp--;

             current =iv_ruleSymbolReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference1958); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:931:1: ruleSymbolReference returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolReference() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:934:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:935:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:935:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:936:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:936:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:937:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolReference1999); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:961:1: entryRuleNumericExpression returns [EObject current=null] : iv_ruleNumericExpression= ruleNumericExpression EOF ;
    public final EObject entryRuleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:962:2: (iv_ruleNumericExpression= ruleNumericExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:963:2: iv_ruleNumericExpression= ruleNumericExpression EOF
            {
             newCompositeNode(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression2039);
            iv_ruleNumericExpression=ruleNumericExpression();

            state._fsp--;

             current =iv_ruleNumericExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression2049); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:970:1: ruleNumericExpression returns [EObject current=null] : ( ( (lv_factor_0_0= ruleFactor ) ) ( (lv_exprTail_1_0= ruleExprTail ) )? ) ;
    public final EObject ruleNumericExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_factor_0_0 = null;

        EObject lv_exprTail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:973:28: ( ( ( (lv_factor_0_0= ruleFactor ) ) ( (lv_exprTail_1_0= ruleExprTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:974:1: ( ( (lv_factor_0_0= ruleFactor ) ) ( (lv_exprTail_1_0= ruleExprTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:974:1: ( ( (lv_factor_0_0= ruleFactor ) ) ( (lv_exprTail_1_0= ruleExprTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:974:2: ( (lv_factor_0_0= ruleFactor ) ) ( (lv_exprTail_1_0= ruleExprTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:974:2: ( (lv_factor_0_0= ruleFactor ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:975:1: (lv_factor_0_0= ruleFactor )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:975:1: (lv_factor_0_0= ruleFactor )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:976:3: lv_factor_0_0= ruleFactor
            {
             
            	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getFactorFactorParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFactor_in_ruleNumericExpression2095);
            lv_factor_0_0=ruleFactor();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"factor",
                    		lv_factor_0_0, 
                    		"Factor");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:992:2: ( (lv_exprTail_1_0= ruleExprTail ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=19 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:993:1: (lv_exprTail_1_0= ruleExprTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:993:1: (lv_exprTail_1_0= ruleExprTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:994:3: lv_exprTail_1_0= ruleExprTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumericExpressionAccess().getExprTailExprTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprTail_in_ruleNumericExpression2116);
                    lv_exprTail_1_0=ruleExprTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumericExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"exprTail",
                            		lv_exprTail_1_0, 
                            		"ExprTail");
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
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleExprTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1018:1: entryRuleExprTail returns [EObject current=null] : iv_ruleExprTail= ruleExprTail EOF ;
    public final EObject entryRuleExprTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1019:2: (iv_ruleExprTail= ruleExprTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1020:2: iv_ruleExprTail= ruleExprTail EOF
            {
             newCompositeNode(grammarAccess.getExprTailRule()); 
            pushFollow(FOLLOW_ruleExprTail_in_entryRuleExprTail2153);
            iv_ruleExprTail=ruleExprTail();

            state._fsp--;

             current =iv_ruleExprTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTail2163); 

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
    // $ANTLR end "entryRuleExprTail"


    // $ANTLR start "ruleExprTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1027:1: ruleExprTail returns [EObject current=null] : ( (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? ) | (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? ) ) ;
    public final EObject ruleExprTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_factor_1_0 = null;

        EObject lv_exprTail_2_0 = null;

        EObject lv_factor_4_0 = null;

        EObject lv_exprTail_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1030:28: ( ( (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? ) | (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1031:1: ( (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? ) | (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1031:1: ( (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? ) | (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            else if ( (LA19_0==20) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1031:2: (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1031:2: (otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )? )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1031:4: otherlv_0= '+' ( (lv_factor_1_0= ruleFactor ) ) ( (lv_exprTail_2_0= ruleExprTail ) )?
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleExprTail2201); 

                        	newLeafNode(otherlv_0, grammarAccess.getExprTailAccess().getPlusSignKeyword_0_0());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1035:1: ( (lv_factor_1_0= ruleFactor ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1036:1: (lv_factor_1_0= ruleFactor )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1036:1: (lv_factor_1_0= ruleFactor )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1037:3: lv_factor_1_0= ruleFactor
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactor_in_ruleExprTail2222);
                    lv_factor_1_0=ruleFactor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprTailRule());
                    	        }
                           		set(
                           			current, 
                           			"factor",
                            		lv_factor_1_0, 
                            		"Factor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1053:2: ( (lv_exprTail_2_0= ruleExprTail ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=19 && LA17_0<=20)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1054:1: (lv_exprTail_2_0= ruleExprTail )
                            {
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1054:1: (lv_exprTail_2_0= ruleExprTail )
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1055:3: lv_exprTail_2_0= ruleExprTail
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExprTail_in_ruleExprTail2243);
                            lv_exprTail_2_0=ruleExprTail();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprTailRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"exprTail",
                                    		lv_exprTail_2_0, 
                                    		"ExprTail");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1072:6: (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1072:6: (otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )? )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1072:8: otherlv_3= '-' ( (lv_factor_4_0= ruleFactor ) ) ( (lv_exprTail_5_0= ruleExprTail ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExprTail2264); 

                        	newLeafNode(otherlv_3, grammarAccess.getExprTailAccess().getHyphenMinusKeyword_1_0());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1076:1: ( (lv_factor_4_0= ruleFactor ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1077:1: (lv_factor_4_0= ruleFactor )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1077:1: (lv_factor_4_0= ruleFactor )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1078:3: lv_factor_4_0= ruleFactor
                    {
                     
                    	        newCompositeNode(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactor_in_ruleExprTail2285);
                    lv_factor_4_0=ruleFactor();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExprTailRule());
                    	        }
                           		set(
                           			current, 
                           			"factor",
                            		lv_factor_4_0, 
                            		"Factor");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1094:2: ( (lv_exprTail_5_0= ruleExprTail ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=19 && LA18_0<=20)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1095:1: (lv_exprTail_5_0= ruleExprTail )
                            {
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1095:1: (lv_exprTail_5_0= ruleExprTail )
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1096:3: lv_exprTail_5_0= ruleExprTail
                            {
                             
                            	        newCompositeNode(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExprTail_in_ruleExprTail2306);
                            lv_exprTail_5_0=ruleExprTail();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getExprTailRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"exprTail",
                                    		lv_exprTail_5_0, 
                                    		"ExprTail");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleExprTail"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1120:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1121:2: (iv_ruleFactor= ruleFactor EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1122:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor2344);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor2354); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1129:1: ruleFactor returns [EObject current=null] : ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_factorTail_1_0= ruleFactorTail ) )? ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        EObject lv_factorTail_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1132:28: ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_factorTail_1_0= ruleFactorTail ) )? ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1133:1: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_factorTail_1_0= ruleFactorTail ) )? )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1133:1: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_factorTail_1_0= ruleFactorTail ) )? )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1133:2: ( (lv_term_0_0= ruleTerm ) ) ( (lv_factorTail_1_0= ruleFactorTail ) )?
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1133:2: ( (lv_term_0_0= ruleTerm ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1134:1: (lv_term_0_0= ruleTerm )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1134:1: (lv_term_0_0= ruleTerm )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1135:3: lv_term_0_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getFactorAccess().getTermTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleFactor2400);
            lv_term_0_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactorRule());
            	        }
                   		set(
                   			current, 
                   			"term",
                    		lv_term_0_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1151:2: ( (lv_factorTail_1_0= ruleFactorTail ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=21 && LA20_0<=22)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1152:1: (lv_factorTail_1_0= ruleFactorTail )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1152:1: (lv_factorTail_1_0= ruleFactorTail )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1153:3: lv_factorTail_1_0= ruleFactorTail
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactorTail_in_ruleFactor2421);
                    lv_factorTail_1_0=ruleFactorTail();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorRule());
                    	        }
                           		set(
                           			current, 
                           			"factorTail",
                            		lv_factorTail_1_0, 
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFactorTail"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1177:1: entryRuleFactorTail returns [EObject current=null] : iv_ruleFactorTail= ruleFactorTail EOF ;
    public final EObject entryRuleFactorTail() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactorTail = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1178:2: (iv_ruleFactorTail= ruleFactorTail EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1179:2: iv_ruleFactorTail= ruleFactorTail EOF
            {
             newCompositeNode(grammarAccess.getFactorTailRule()); 
            pushFollow(FOLLOW_ruleFactorTail_in_entryRuleFactorTail2458);
            iv_ruleFactorTail=ruleFactorTail();

            state._fsp--;

             current =iv_ruleFactorTail; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorTail2468); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1186:1: ruleFactorTail returns [EObject current=null] : ( (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) | (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? ) ) ;
    public final EObject ruleFactorTail() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_term_1_0 = null;

        EObject lv_factorTail_2_0 = null;

        EObject lv_term_4_0 = null;

        EObject lv_factorTail_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1189:28: ( ( (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) | (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:1: ( (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) | (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:1: ( (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? ) | (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:2: (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:2: (otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )? )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1190:4: otherlv_0= '*' ( (lv_term_1_0= ruleTerm ) ) ( (lv_factorTail_2_0= ruleFactorTail ) )?
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleFactorTail2506); 

                        	newLeafNode(otherlv_0, grammarAccess.getFactorTailAccess().getAsteriskKeyword_0_0());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1194:1: ( (lv_term_1_0= ruleTerm ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1195:1: (lv_term_1_0= ruleTerm )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1195:1: (lv_term_1_0= ruleTerm )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1196:3: lv_term_1_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleFactorTail2527);
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

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1212:2: ( (lv_factorTail_2_0= ruleFactorTail ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=21 && LA21_0<=22)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1213:1: (lv_factorTail_2_0= ruleFactorTail )
                            {
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1213:1: (lv_factorTail_2_0= ruleFactorTail )
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1214:3: lv_factorTail_2_0= ruleFactorTail
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactorTail_in_ruleFactorTail2548);
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
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1231:6: (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1231:6: (otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )? )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1231:8: otherlv_3= '/' ( (lv_term_4_0= ruleTerm ) ) ( (lv_factorTail_5_0= ruleFactorTail ) )?
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFactorTail2569); 

                        	newLeafNode(otherlv_3, grammarAccess.getFactorTailAccess().getSolidusKeyword_1_0());
                        
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1235:1: ( (lv_term_4_0= ruleTerm ) )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1236:1: (lv_term_4_0= ruleTerm )
                    {
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1236:1: (lv_term_4_0= ruleTerm )
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1237:3: lv_term_4_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleFactorTail2590);
                    lv_term_4_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactorTailRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_4_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1253:2: ( (lv_factorTail_5_0= ruleFactorTail ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=21 && LA22_0<=22)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1254:1: (lv_factorTail_5_0= ruleFactorTail )
                            {
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1254:1: (lv_factorTail_5_0= ruleFactorTail )
                            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1255:3: lv_factorTail_5_0= ruleFactorTail
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactorTail_in_ruleFactorTail2611);
                            lv_factorTail_5_0=ruleFactorTail();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactorTailRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"factorTail",
                                    		lv_factorTail_5_0, 
                                    		"FactorTail");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleFactorTail"


    // $ANTLR start "entryRuleTerm"
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1279:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1280:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1281:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm2649);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm2659); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1288:1: ruleTerm returns [EObject current=null] : (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralExpr_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1291:28: ( (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1292:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1292:1: (this_LiteralExpr_0= ruleLiteralExpr | this_Apply_1= ruleApply )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NUM) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID||LA24_0==14) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1293:5: this_LiteralExpr_0= ruleLiteralExpr
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLiteralExpr_in_ruleTerm2706);
                    this_LiteralExpr_0=ruleLiteralExpr();

                    state._fsp--;

                     
                            current = this_LiteralExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1303:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleTerm2733);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1319:1: entryRuleVariableAssignment returns [EObject current=null] : iv_ruleVariableAssignment= ruleVariableAssignment EOF ;
    public final EObject entryRuleVariableAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssignment = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1320:2: (iv_ruleVariableAssignment= ruleVariableAssignment EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1321:2: iv_ruleVariableAssignment= ruleVariableAssignment EOF
            {
             newCompositeNode(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2768);
            iv_ruleVariableAssignment=ruleVariableAssignment();

            state._fsp--;

             current =iv_ruleVariableAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment2778); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1328:1: ruleVariableAssignment returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariableAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1331:28: ( ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1332:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1332:1: ( ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1332:2: ( (lv_id_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1332:2: ( (lv_id_0_0= RULE_ID ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1333:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1333:1: (lv_id_0_0= RULE_ID )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1334:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssignment2820); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleVariableAssignment2837); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1354:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1355:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1355:1: (lv_expression_2_0= ruleExpression )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1356:3: lv_expression_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleVariableAssignment2858);
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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1380:1: entryRuleParenthesisExpression returns [EObject current=null] : iv_ruleParenthesisExpression= ruleParenthesisExpression EOF ;
    public final EObject entryRuleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpression = null;


        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1381:2: (iv_ruleParenthesisExpression= ruleParenthesisExpression EOF )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1382:2: iv_ruleParenthesisExpression= ruleParenthesisExpression EOF
            {
             newCompositeNode(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2894);
            iv_ruleParenthesisExpression=ruleParenthesisExpression();

            state._fsp--;

             current =iv_ruleParenthesisExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression2904); 

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
    // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1389:1: ruleParenthesisExpression returns [EObject current=null] : (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1392:28: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1393:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            {
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1393:1: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
            // ../org.arz.miniScript/src-gen/org/arz/parser/antlr/internal/InternalMiniScript.g:1393:3: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleParenthesisExpression2941); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesisExpression2963);
            this_Expression_1=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleParenthesisExpression2974); 

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
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgram221 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleProgramTail_in_ruleProgram242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramTail_in_entryRuleProgramTail279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramTail289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProgramTail326 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleProgramTail347 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleProgramTail_in_ruleProgramTail368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleExpression462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_ruleExpression489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_ruleExpression516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleFunctionDeclaration598 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration610 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_ruleFunctionDeclaration631 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration644 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_ruleBody_in_ruleFunctionDeclaration665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBody776 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBody797 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_ruleBodyTail_in_ruleBody818 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBody831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyTail_in_entryRuleBodyTail868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyTail878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBodyTail915 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBodyTail936 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleBodyTail_in_ruleBodyTail957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameters1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParameters1046 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_ruleFunctionParameters1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_entryRuleFunctionParametersTail1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParametersTail1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunctionParametersTail1156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionParametersTail1173 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_ruleFunctionParametersTail1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_ruleApply1292 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_ruleApply1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_ruleFunctor1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_ruleFunctor1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_entryRuleApplyTail1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyTail1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleApplyTail1525 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_ruleApplyTail1546 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleApplyTail1559 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_ruleApplyTail1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArguments1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionArguments1673 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_ruleFunctionArguments1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_entryRuleFunctionArgumentsTail1731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArgumentsTail1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFunctionArgumentsTail1778 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionArgumentsTail1799 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_ruleFunctionArgumentsTail1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr1857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_ruleLiteralExpr1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference1948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolReference1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleNumericExpression2095 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleExprTail_in_ruleNumericExpression2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_entryRuleExprTail2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTail2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleExprTail2201 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExprTail2222 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleExprTail_in_ruleExprTail2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleExprTail2264 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleFactor_in_ruleExprTail2285 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleExprTail_in_ruleExprTail2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor2344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactor2400 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_ruleFactor2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_entryRuleFactorTail2458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorTail2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFactorTail2506 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactorTail2527 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_ruleFactorTail2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFactorTail2569 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFactorTail2590 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_ruleFactorTail2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm2649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_ruleTerm2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleTerm2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment2768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssignment2820 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVariableAssignment2837 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariableAssignment2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression2894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleParenthesisExpression2941 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesisExpression2963 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleParenthesisExpression2974 = new BitSet(new long[]{0x0000000000000002L});

}