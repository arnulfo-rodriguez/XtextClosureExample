package org.arz.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.arz.services.MiniScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMiniScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'func'", "'('", "')'", "'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_NUM=5;
    public static final int RULE_ML_COMMENT=8;
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
    public String getGrammarFileName() { return "../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g"; }


     
     	private MiniScriptGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MiniScriptGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:62:1: ( ruleModel EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:70:1: ruleModel : ( ruleProgram ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:74:2: ( ( ruleProgram ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:75:1: ( ruleProgram )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:75:1: ( ruleProgram )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:76:1: ruleProgram
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_ruleModel100);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProgram"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:89:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:90:1: ( ruleProgram EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:91:1: ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram126);
            ruleProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram133); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:98:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:102:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:103:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:103:1: ( ( rule__Program__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:104:1: ( rule__Program__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:105:1: ( rule__Program__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:105:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram159);
            rule__Program__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:117:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:118:1: ( ruleExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:119:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression186);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression193); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:126:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:130:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:131:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:131:1: ( ( rule__Expression__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:132:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:133:1: ( rule__Expression__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:133:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression219);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:145:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:146:1: ( ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:147:1: ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration246);
            ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:154:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:158:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:159:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:159:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:160:1: ( rule__FunctionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:161:1: ( rule__FunctionDeclaration__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:161:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration279);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleBody"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:173:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:174:1: ( ruleBody EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:175:1: ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody306);
            ruleBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody313); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:182:1: ruleBody : ( ( rule__Body__Alternatives ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:186:2: ( ( ( rule__Body__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:187:1: ( ( rule__Body__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:187:1: ( ( rule__Body__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:188:1: ( rule__Body__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:189:1: ( rule__Body__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:189:2: rule__Body__Alternatives
            {
            pushFollow(FOLLOW_rule__Body__Alternatives_in_ruleBody339);
            rule__Body__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleFunctionParameters"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:201:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:202:1: ( ruleFunctionParameters EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:203:1: ruleFunctionParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters366);
            ruleFunctionParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameters373); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionParameters"


    // $ANTLR start "ruleFunctionParameters"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:210:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Alternatives ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:214:2: ( ( ( rule__FunctionParameters__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__FunctionParameters__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__FunctionParameters__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:216:1: ( rule__FunctionParameters__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:1: ( rule__FunctionParameters__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:2: rule__FunctionParameters__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Alternatives_in_ruleFunctionParameters399);
            rule__FunctionParameters__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionParameters"


    // $ANTLR start "entryRuleApplyFunction"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:229:1: entryRuleApplyFunction : ruleApplyFunction EOF ;
    public final void entryRuleApplyFunction() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:230:1: ( ruleApplyFunction EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:231:1: ruleApplyFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleApplyFunction_in_entryRuleApplyFunction426);
            ruleApplyFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyFunction433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyFunction"


    // $ANTLR start "ruleApplyFunction"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:238:1: ruleApplyFunction : ( ( rule__ApplyFunction__Group__0 ) ) ;
    public final void ruleApplyFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:242:2: ( ( ( rule__ApplyFunction__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__ApplyFunction__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__ApplyFunction__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:244:1: ( rule__ApplyFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:1: ( rule__ApplyFunction__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:2: rule__ApplyFunction__Group__0
            {
            pushFollow(FOLLOW_rule__ApplyFunction__Group__0_in_ruleApplyFunction459);
            rule__ApplyFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyFunction"


    // $ANTLR start "entryRuleApplyFunctionAlpha"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:257:1: entryRuleApplyFunctionAlpha : ruleApplyFunctionAlpha EOF ;
    public final void entryRuleApplyFunctionAlpha() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:258:1: ( ruleApplyFunctionAlpha EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:259:1: ruleApplyFunctionAlpha EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaRule()); 
            }
            pushFollow(FOLLOW_ruleApplyFunctionAlpha_in_entryRuleApplyFunctionAlpha486);
            ruleApplyFunctionAlpha();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyFunctionAlpha493); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplyFunctionAlpha"


    // $ANTLR start "ruleApplyFunctionAlpha"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:266:1: ruleApplyFunctionAlpha : ( ( rule__ApplyFunctionAlpha__Group__0 ) ) ;
    public final void ruleApplyFunctionAlpha() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:2: ( ( ( rule__ApplyFunctionAlpha__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__ApplyFunctionAlpha__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__ApplyFunctionAlpha__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:1: ( rule__ApplyFunctionAlpha__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:1: ( rule__ApplyFunctionAlpha__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:2: rule__ApplyFunctionAlpha__Group__0
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__0_in_ruleApplyFunctionAlpha519);
            rule__ApplyFunctionAlpha__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplyFunctionAlpha"


    // $ANTLR start "entryRuleFunctionArguments"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:285:1: entryRuleFunctionArguments : ruleFunctionArguments EOF ;
    public final void entryRuleFunctionArguments() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:286:1: ( ruleFunctionArguments EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:287:1: ruleFunctionArguments EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments546);
            ruleFunctionArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArguments553); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionArguments"


    // $ANTLR start "ruleFunctionArguments"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:294:1: ruleFunctionArguments : ( ( rule__FunctionArguments__Group__0 ) ) ;
    public final void ruleFunctionArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:2: ( ( ( rule__FunctionArguments__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__FunctionArguments__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__FunctionArguments__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:1: ( rule__FunctionArguments__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:1: ( rule__FunctionArguments__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:2: rule__FunctionArguments__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__0_in_ruleFunctionArguments579);
            rule__FunctionArguments__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionArguments"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:313:1: entryRuleLiteralExpr : ruleLiteralExpr EOF ;
    public final void entryRuleLiteralExpr() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:314:1: ( ruleLiteralExpr EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:315:1: ruleLiteralExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr606);
            ruleLiteralExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralExpr"


    // $ANTLR start "ruleLiteralExpr"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:322:1: ruleLiteralExpr : ( ( rule__LiteralExpr__ValueAssignment ) ) ;
    public final void ruleLiteralExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:2: ( ( ( rule__LiteralExpr__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:1: ( rule__LiteralExpr__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:1: ( rule__LiteralExpr__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:2: rule__LiteralExpr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr639);
            rule__LiteralExpr__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpr"


    // $ANTLR start "entryRuleSymbolReference"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:341:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:342:1: ( ruleSymbolReference EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:343:1: ruleSymbolReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference666);
            ruleSymbolReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference673); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolReference"


    // $ANTLR start "ruleSymbolReference"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:350:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__SymbolReference__IdAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:1: ( rule__SymbolReference__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:1: ( rule__SymbolReference__IdAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:2: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference699);
            rule__SymbolReference__IdAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolReference"


    // $ANTLR start "entryRuleNumericExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:371:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:372:1: ( ruleNumericExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:373:1: ruleNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression728);
            ruleNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression735); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericExpression"


    // $ANTLR start "ruleNumericExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:380:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:1: ( ( rule__NumericExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:1: ( ( rule__NumericExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:386:1: ( rule__NumericExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:387:1: ( rule__NumericExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:387:2: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression761);
            rule__NumericExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericExpression"


    // $ANTLR start "entryRuleExprTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:399:1: entryRuleExprTail : ruleExprTail EOF ;
    public final void entryRuleExprTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:400:1: ( ruleExprTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:401:1: ruleExprTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailRule()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_entryRuleExprTail788);
            ruleExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTail795); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprTail"


    // $ANTLR start "ruleExprTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:408:1: ruleExprTail : ( ( rule__ExprTail__Alternatives ) ) ;
    public final void ruleExprTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:2: ( ( ( rule__ExprTail__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:1: ( ( rule__ExprTail__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:1: ( ( rule__ExprTail__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:414:1: ( rule__ExprTail__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:415:1: ( rule__ExprTail__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:415:2: rule__ExprTail__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprTail__Alternatives_in_ruleExprTail821);
            rule__ExprTail__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprTail"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:427:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:428:1: ( ruleFactor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:429:1: ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor848);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor855); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:436:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:1: ( ( rule__Factor__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:442:1: ( rule__Factor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:443:1: ( rule__Factor__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:443:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor881);
            rule__Factor__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleFactorTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:455:1: entryRuleFactorTail : ruleFactorTail EOF ;
    public final void entryRuleFactorTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:456:1: ( ruleFactorTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:457:1: ruleFactorTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailRule()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_entryRuleFactorTail908);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorTail915); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactorTail"


    // $ANTLR start "ruleFactorTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:464:1: ruleFactorTail : ( ( rule__FactorTail__Alternatives ) ) ;
    public final void ruleFactorTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:468:2: ( ( ( rule__FactorTail__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:1: ( ( rule__FactorTail__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:1: ( ( rule__FactorTail__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:470:1: ( rule__FactorTail__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:471:1: ( rule__FactorTail__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:471:2: rule__FactorTail__Alternatives
            {
            pushFollow(FOLLOW_rule__FactorTail__Alternatives_in_ruleFactorTail941);
            rule__FactorTail__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactorTail"


    // $ANTLR start "entryRuleTerm"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:483:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:484:1: ( ruleTerm EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:485:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm968);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm975); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:492:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:1: ( ( rule__Term__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:498:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:499:1: ( rule__Term__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:499:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1001);
            rule__Term__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleParenthesisExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:511:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:512:1: ( ruleParenthesisExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:513:1: ruleParenthesisExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1028);
            ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression1035); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesisExpression"


    // $ANTLR start "ruleParenthesisExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:520:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:526:1: ( rule__ParenthesisExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:527:1: ( rule__ParenthesisExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:527:2: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1061);
            rule__ParenthesisExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesisExpression"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:539:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleNumericExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:543:1: ( ( ruleFunctionDeclaration ) | ( ruleNumericExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NUM)||LA1_0==14) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:544:1: ( ruleFunctionDeclaration )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:544:1: ( ruleFunctionDeclaration )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:545:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1097);
                    ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:550:6: ( ruleNumericExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:550:6: ( ruleNumericExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:551:1: ruleNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1114);
                    ruleNumericExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Body__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:561:1: rule__Body__Alternatives : ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:565:1: ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_NUM)||(LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:566:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:566:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:567:1: ( rule__Body__ExpressionsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getExpressionsAssignment_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:568:1: ( rule__Body__ExpressionsAssignment_0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:568:2: rule__Body__ExpressionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1146);
                    rule__Body__ExpressionsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyAccess().getExpressionsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:572:6: ( ( rule__Body__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:572:6: ( ( rule__Body__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:573:1: ( rule__Body__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:574:1: ( rule__Body__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:574:2: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1164);
                    rule__Body__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Alternatives"


    // $ANTLR start "rule__FunctionParameters__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:583:1: rule__FunctionParameters__Alternatives : ( ( ( rule__FunctionParameters__Group_0__0 ) ) | ( ( rule__FunctionParameters__Group_1__0 ) ) );
    public final void rule__FunctionParameters__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:587:1: ( ( ( rule__FunctionParameters__Group_0__0 ) ) | ( ( rule__FunctionParameters__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||LA3_1==15) ) {
                    alt3=1;
                }
                else if ( (LA3_1==18) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==EOF||LA3_0==15) ) {
                alt3=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:588:1: ( ( rule__FunctionParameters__Group_0__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:588:1: ( ( rule__FunctionParameters__Group_0__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:589:1: ( rule__FunctionParameters__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionParametersAccess().getGroup_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:590:1: ( rule__FunctionParameters__Group_0__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:590:2: rule__FunctionParameters__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionParameters__Group_0__0_in_rule__FunctionParameters__Alternatives1197);
                    rule__FunctionParameters__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionParametersAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:594:6: ( ( rule__FunctionParameters__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:594:6: ( ( rule__FunctionParameters__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:595:1: ( rule__FunctionParameters__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionParametersAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:596:1: ( rule__FunctionParameters__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:596:2: rule__FunctionParameters__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionParameters__Group_1__0_in_rule__FunctionParameters__Alternatives1215);
                    rule__FunctionParameters__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionParametersAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Alternatives"


    // $ANTLR start "rule__ExprTail__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:605:1: rule__ExprTail__Alternatives : ( ( ( rule__ExprTail__Group_0__0 ) ) | ( ( rule__ExprTail__Group_1__0 ) ) );
    public final void rule__ExprTail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:609:1: ( ( ( rule__ExprTail__Group_0__0 ) ) | ( ( rule__ExprTail__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:610:1: ( ( rule__ExprTail__Group_0__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:610:1: ( ( rule__ExprTail__Group_0__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:611:1: ( rule__ExprTail__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTailAccess().getGroup_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:612:1: ( rule__ExprTail__Group_0__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:612:2: rule__ExprTail__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprTail__Group_0__0_in_rule__ExprTail__Alternatives1248);
                    rule__ExprTail__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTailAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:616:6: ( ( rule__ExprTail__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:616:6: ( ( rule__ExprTail__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:617:1: ( rule__ExprTail__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTailAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:618:1: ( rule__ExprTail__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:618:2: rule__ExprTail__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprTail__Group_1__0_in_rule__ExprTail__Alternatives1266);
                    rule__ExprTail__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTailAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Alternatives"


    // $ANTLR start "rule__FactorTail__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:627:1: rule__FactorTail__Alternatives : ( ( ( rule__FactorTail__Group_0__0 ) ) | ( ( rule__FactorTail__Group_1__0 ) ) );
    public final void rule__FactorTail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:631:1: ( ( ( rule__FactorTail__Group_0__0 ) ) | ( ( rule__FactorTail__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:632:1: ( ( rule__FactorTail__Group_0__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:632:1: ( ( rule__FactorTail__Group_0__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:633:1: ( rule__FactorTail__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getGroup_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:634:1: ( rule__FactorTail__Group_0__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:634:2: rule__FactorTail__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FactorTail__Group_0__0_in_rule__FactorTail__Alternatives1299);
                    rule__FactorTail__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorTailAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:638:6: ( ( rule__FactorTail__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:638:6: ( ( rule__FactorTail__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:639:1: ( rule__FactorTail__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:640:1: ( rule__FactorTail__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:640:2: rule__FactorTail__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactorTail__Group_1__0_in_rule__FactorTail__Alternatives1317);
                    rule__FactorTail__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorTailAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:649:1: rule__Term__Alternatives : ( ( ruleLiteralExpr ) | ( ruleApplyFunction ) | ( ruleParenthesisExpression ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:653:1: ( ( ruleLiteralExpr ) | ( ruleApplyFunction ) | ( ruleParenthesisExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_NUM:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:1: ( ruleLiteralExpr )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:1: ( ruleLiteralExpr )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:655:1: ruleLiteralExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1350);
                    ruleLiteralExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:660:6: ( ruleApplyFunction )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:660:6: ( ruleApplyFunction )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:661:1: ruleApplyFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getApplyFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleApplyFunction_in_rule__Term__Alternatives1367);
                    ruleApplyFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getApplyFunctionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:666:6: ( ruleParenthesisExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:666:6: ( ruleParenthesisExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:667:1: ruleParenthesisExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getParenthesisExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_rule__Term__Alternatives1384);
                    ruleParenthesisExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getParenthesisExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:679:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:683:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:684:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01414);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01417);
            rule__Program__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:691:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:695:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:696:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:696:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:697:1: ( rule__Program__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:698:1: ( rule__Program__ExpressionsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:698:2: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1444);
            rule__Program__ExpressionsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:708:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:712:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:713:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11474);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11477);
            rule__Program__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:720:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:724:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:725:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:725:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:726:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Program__Group__1__Impl1505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:739:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:743:1: ( rule__Program__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:744:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21536);
            rule__Program__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:750:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:754:1: ( ( ( rule__Program__Group_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:755:1: ( ( rule__Program__Group_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:755:1: ( ( rule__Program__Group_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:756:1: ( rule__Program__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:757:1: ( rule__Program__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NUM)||(LA7_0>=13 && LA7_0<=14)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:757:2: rule__Program__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1563);
            	    rule__Program__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group_2__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:773:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:777:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:778:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01600);
            rule__Program__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01603);
            rule__Program__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0"


    // $ANTLR start "rule__Program__Group_2__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:785:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__ExpressionAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:789:1: ( ( ( rule__Program__ExpressionAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:790:1: ( ( rule__Program__ExpressionAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:790:1: ( ( rule__Program__ExpressionAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:791:1: ( rule__Program__ExpressionAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:792:1: ( rule__Program__ExpressionAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:792:2: rule__Program__ExpressionAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionAssignment_2_0_in_rule__Program__Group_2__0__Impl1630);
            rule__Program__ExpressionAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__0__Impl"


    // $ANTLR start "rule__Program__Group_2__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:802:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:806:1: ( rule__Program__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:807:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11660);
            rule__Program__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1"


    // $ANTLR start "rule__Program__Group_2__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:813:1: rule__Program__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:817:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:818:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:818:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:819:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Program__Group_2__1__Impl1688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:836:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:840:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:841:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01723);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01726);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0"


    // $ANTLR start "rule__FunctionDeclaration__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:848:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:852:1: ( ( 'func' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:853:1: ( 'func' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:853:1: ( 'func' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:854:1: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__FunctionDeclaration__Group__0__Impl1754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:867:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:871:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:872:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11785);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11788);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1"


    // $ANTLR start "rule__FunctionDeclaration__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:879:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:883:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:884:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:884:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:885:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__FunctionDeclaration__Group__1__Impl1816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:898:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:902:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:903:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21847);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21850);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2"


    // $ANTLR start "rule__FunctionDeclaration__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:910:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2 ) ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:914:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:915:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:915:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:916:1: ( rule__FunctionDeclaration__ParametersAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:917:1: ( rule__FunctionDeclaration__ParametersAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:917:2: rule__FunctionDeclaration__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl1877);
            rule__FunctionDeclaration__ParametersAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:927:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:931:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:932:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31907);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31910);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3"


    // $ANTLR start "rule__FunctionDeclaration__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:939:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:943:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:944:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:944:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:945:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__FunctionDeclaration__Group__3__Impl1938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:958:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:962:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:963:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41969);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4"


    // $ANTLR start "rule__FunctionDeclaration__Group__4__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:973:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:974:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:974:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:975:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:976:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:976:2: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl1996);
            rule__FunctionDeclaration__BodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Body__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:996:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1000:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1001:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02036);
            rule__Body__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02039);
            rule__Body__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__0"


    // $ANTLR start "rule__Body__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1008:1: rule__Body__Group_1__0__Impl : ( () ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1012:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1013:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1013:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1014:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getBodyAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1015:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1017:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getBodyAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__0__Impl"


    // $ANTLR start "rule__Body__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1027:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl rule__Body__Group_1__2 ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1031:1: ( rule__Body__Group_1__1__Impl rule__Body__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1032:2: rule__Body__Group_1__1__Impl rule__Body__Group_1__2
            {
            pushFollow(FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12097);
            rule__Body__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12100);
            rule__Body__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__1"


    // $ANTLR start "rule__Body__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1039:1: rule__Body__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1043:1: ( ( '{' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1044:1: ( '{' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1044:1: ( '{' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1045:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Body__Group_1__1__Impl2128); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__1__Impl"


    // $ANTLR start "rule__Body__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1058:1: rule__Body__Group_1__2 : rule__Body__Group_1__2__Impl rule__Body__Group_1__3 ;
    public final void rule__Body__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1062:1: ( rule__Body__Group_1__2__Impl rule__Body__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1063:2: rule__Body__Group_1__2__Impl rule__Body__Group_1__3
            {
            pushFollow(FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22159);
            rule__Body__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22162);
            rule__Body__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__2"


    // $ANTLR start "rule__Body__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1070:1: rule__Body__Group_1__2__Impl : ( ( rule__Body__ExpressionsAssignment_1_2 )* ) ;
    public final void rule__Body__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1074:1: ( ( ( rule__Body__ExpressionsAssignment_1_2 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1075:1: ( ( rule__Body__ExpressionsAssignment_1_2 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1075:1: ( ( rule__Body__ExpressionsAssignment_1_2 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1076:1: ( rule__Body__ExpressionsAssignment_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1077:1: ( rule__Body__ExpressionsAssignment_1_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_NUM)||(LA8_0>=13 && LA8_0<=14)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1077:2: rule__Body__ExpressionsAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_1_2_in_rule__Body__Group_1__2__Impl2189);
            	    rule__Body__ExpressionsAssignment_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__2__Impl"


    // $ANTLR start "rule__Body__Group_1__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1087:1: rule__Body__Group_1__3 : rule__Body__Group_1__3__Impl ;
    public final void rule__Body__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1091:1: ( rule__Body__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1092:2: rule__Body__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32220);
            rule__Body__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__3"


    // $ANTLR start "rule__Body__Group_1__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1098:1: rule__Body__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Body__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1102:1: ( ( '}' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1103:1: ( '}' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1103:1: ( '}' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1104:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__Body__Group_1__3__Impl2248); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group_1__3__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_0__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1125:1: rule__FunctionParameters__Group_0__0 : rule__FunctionParameters__Group_0__0__Impl rule__FunctionParameters__Group_0__1 ;
    public final void rule__FunctionParameters__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1129:1: ( rule__FunctionParameters__Group_0__0__Impl rule__FunctionParameters__Group_0__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1130:2: rule__FunctionParameters__Group_0__0__Impl rule__FunctionParameters__Group_0__1
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_0__0__Impl_in_rule__FunctionParameters__Group_0__02287);
            rule__FunctionParameters__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParameters__Group_0__1_in_rule__FunctionParameters__Group_0__02290);
            rule__FunctionParameters__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_0__0"


    // $ANTLR start "rule__FunctionParameters__Group_0__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1137:1: rule__FunctionParameters__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionParameters__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1141:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1142:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1142:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1143:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getFunctionParametersAction_0_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1144:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1146:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getFunctionParametersAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_0__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1156:1: rule__FunctionParameters__Group_0__1 : rule__FunctionParameters__Group_0__1__Impl ;
    public final void rule__FunctionParameters__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1160:1: ( rule__FunctionParameters__Group_0__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1161:2: rule__FunctionParameters__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_0__1__Impl_in_rule__FunctionParameters__Group_0__12348);
            rule__FunctionParameters__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_0__1"


    // $ANTLR start "rule__FunctionParameters__Group_0__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1167:1: rule__FunctionParameters__Group_0__1__Impl : ( ( rule__FunctionParameters__ParametersAssignment_0_1 )? ) ;
    public final void rule__FunctionParameters__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1171:1: ( ( ( rule__FunctionParameters__ParametersAssignment_0_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1172:1: ( ( rule__FunctionParameters__ParametersAssignment_0_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1172:1: ( ( rule__FunctionParameters__ParametersAssignment_0_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1173:1: ( rule__FunctionParameters__ParametersAssignment_0_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersAssignment_0_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1174:1: ( rule__FunctionParameters__ParametersAssignment_0_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1174:2: rule__FunctionParameters__ParametersAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__FunctionParameters__ParametersAssignment_0_1_in_rule__FunctionParameters__Group_0__1__Impl2375);
                    rule__FunctionParameters__ParametersAssignment_0_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1188:1: rule__FunctionParameters__Group_1__0 : rule__FunctionParameters__Group_1__0__Impl rule__FunctionParameters__Group_1__1 ;
    public final void rule__FunctionParameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1192:1: ( rule__FunctionParameters__Group_1__0__Impl rule__FunctionParameters__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1193:2: rule__FunctionParameters__Group_1__0__Impl rule__FunctionParameters__Group_1__1
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1__0__Impl_in_rule__FunctionParameters__Group_1__02410);
            rule__FunctionParameters__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1__1_in_rule__FunctionParameters__Group_1__02413);
            rule__FunctionParameters__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1__0"


    // $ANTLR start "rule__FunctionParameters__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1200:1: rule__FunctionParameters__Group_1__0__Impl : ( ( rule__FunctionParameters__ParametersAssignment_1_0 ) ) ;
    public final void rule__FunctionParameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1204:1: ( ( ( rule__FunctionParameters__ParametersAssignment_1_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1205:1: ( ( rule__FunctionParameters__ParametersAssignment_1_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1205:1: ( ( rule__FunctionParameters__ParametersAssignment_1_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1206:1: ( rule__FunctionParameters__ParametersAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersAssignment_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1207:1: ( rule__FunctionParameters__ParametersAssignment_1_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1207:2: rule__FunctionParameters__ParametersAssignment_1_0
            {
            pushFollow(FOLLOW_rule__FunctionParameters__ParametersAssignment_1_0_in_rule__FunctionParameters__Group_1__0__Impl2440);
            rule__FunctionParameters__ParametersAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1217:1: rule__FunctionParameters__Group_1__1 : rule__FunctionParameters__Group_1__1__Impl ;
    public final void rule__FunctionParameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1221:1: ( rule__FunctionParameters__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1222:2: rule__FunctionParameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1__1__Impl_in_rule__FunctionParameters__Group_1__12470);
            rule__FunctionParameters__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1__1"


    // $ANTLR start "rule__FunctionParameters__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1228:1: rule__FunctionParameters__Group_1__1__Impl : ( ( ( rule__FunctionParameters__Group_1_1__0 ) ) ( ( rule__FunctionParameters__Group_1_1__0 )* ) ) ;
    public final void rule__FunctionParameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1232:1: ( ( ( ( rule__FunctionParameters__Group_1_1__0 ) ) ( ( rule__FunctionParameters__Group_1_1__0 )* ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1233:1: ( ( ( rule__FunctionParameters__Group_1_1__0 ) ) ( ( rule__FunctionParameters__Group_1_1__0 )* ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1233:1: ( ( ( rule__FunctionParameters__Group_1_1__0 ) ) ( ( rule__FunctionParameters__Group_1_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1234:1: ( ( rule__FunctionParameters__Group_1_1__0 ) ) ( ( rule__FunctionParameters__Group_1_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1234:1: ( ( rule__FunctionParameters__Group_1_1__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1235:1: ( rule__FunctionParameters__Group_1_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getGroup_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1236:1: ( rule__FunctionParameters__Group_1_1__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1236:2: rule__FunctionParameters__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1_1__0_in_rule__FunctionParameters__Group_1__1__Impl2499);
            rule__FunctionParameters__Group_1_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getGroup_1_1()); 
            }

            }

            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1239:1: ( ( rule__FunctionParameters__Group_1_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1240:1: ( rule__FunctionParameters__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getGroup_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1241:1: ( rule__FunctionParameters__Group_1_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1241:2: rule__FunctionParameters__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionParameters__Group_1_1__0_in_rule__FunctionParameters__Group_1__1__Impl2511);
            	    rule__FunctionParameters__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getGroup_1_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1__1__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_1_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1256:1: rule__FunctionParameters__Group_1_1__0 : rule__FunctionParameters__Group_1_1__0__Impl rule__FunctionParameters__Group_1_1__1 ;
    public final void rule__FunctionParameters__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1260:1: ( rule__FunctionParameters__Group_1_1__0__Impl rule__FunctionParameters__Group_1_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1261:2: rule__FunctionParameters__Group_1_1__0__Impl rule__FunctionParameters__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1_1__0__Impl_in_rule__FunctionParameters__Group_1_1__02548);
            rule__FunctionParameters__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1_1__1_in_rule__FunctionParameters__Group_1_1__02551);
            rule__FunctionParameters__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1_1__0"


    // $ANTLR start "rule__FunctionParameters__Group_1_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1268:1: rule__FunctionParameters__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionParameters__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1272:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1273:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1273:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1274:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getCommaKeyword_1_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionParameters__Group_1_1__0__Impl2579); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getCommaKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1_1__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group_1_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1287:1: rule__FunctionParameters__Group_1_1__1 : rule__FunctionParameters__Group_1_1__1__Impl ;
    public final void rule__FunctionParameters__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1291:1: ( rule__FunctionParameters__Group_1_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1292:2: rule__FunctionParameters__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group_1_1__1__Impl_in_rule__FunctionParameters__Group_1_1__12610);
            rule__FunctionParameters__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1_1__1"


    // $ANTLR start "rule__FunctionParameters__Group_1_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1298:1: rule__FunctionParameters__Group_1_1__1__Impl : ( ( rule__FunctionParameters__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__FunctionParameters__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1302:1: ( ( ( rule__FunctionParameters__ParametersAssignment_1_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1303:1: ( ( rule__FunctionParameters__ParametersAssignment_1_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1303:1: ( ( rule__FunctionParameters__ParametersAssignment_1_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1304:1: ( rule__FunctionParameters__ParametersAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersAssignment_1_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1305:1: ( rule__FunctionParameters__ParametersAssignment_1_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1305:2: rule__FunctionParameters__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__FunctionParameters__ParametersAssignment_1_1_1_in_rule__FunctionParameters__Group_1_1__1__Impl2637);
            rule__FunctionParameters__ParametersAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__Group_1_1__1__Impl"


    // $ANTLR start "rule__ApplyFunction__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1319:1: rule__ApplyFunction__Group__0 : rule__ApplyFunction__Group__0__Impl rule__ApplyFunction__Group__1 ;
    public final void rule__ApplyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1323:1: ( rule__ApplyFunction__Group__0__Impl rule__ApplyFunction__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1324:2: rule__ApplyFunction__Group__0__Impl rule__ApplyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__ApplyFunction__Group__0__Impl_in_rule__ApplyFunction__Group__02671);
            rule__ApplyFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyFunction__Group__1_in_rule__ApplyFunction__Group__02674);
            rule__ApplyFunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__Group__0"


    // $ANTLR start "rule__ApplyFunction__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1331:1: rule__ApplyFunction__Group__0__Impl : ( ( rule__ApplyFunction__FunctorAssignment_0 ) ) ;
    public final void rule__ApplyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( ( ( rule__ApplyFunction__FunctorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:1: ( ( rule__ApplyFunction__FunctorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:1: ( ( rule__ApplyFunction__FunctorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1337:1: ( rule__ApplyFunction__FunctorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAccess().getFunctorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1338:1: ( rule__ApplyFunction__FunctorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1338:2: rule__ApplyFunction__FunctorAssignment_0
            {
            pushFollow(FOLLOW_rule__ApplyFunction__FunctorAssignment_0_in_rule__ApplyFunction__Group__0__Impl2701);
            rule__ApplyFunction__FunctorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAccess().getFunctorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__Group__0__Impl"


    // $ANTLR start "rule__ApplyFunction__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1348:1: rule__ApplyFunction__Group__1 : rule__ApplyFunction__Group__1__Impl ;
    public final void rule__ApplyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1352:1: ( rule__ApplyFunction__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1353:2: rule__ApplyFunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplyFunction__Group__1__Impl_in_rule__ApplyFunction__Group__12731);
            rule__ApplyFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__Group__1"


    // $ANTLR start "rule__ApplyFunction__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1359:1: rule__ApplyFunction__Group__1__Impl : ( ( rule__ApplyFunction__App3Assignment_1 ) ) ;
    public final void rule__ApplyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ( ( ( rule__ApplyFunction__App3Assignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1364:1: ( ( rule__ApplyFunction__App3Assignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1364:1: ( ( rule__ApplyFunction__App3Assignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:1: ( rule__ApplyFunction__App3Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAccess().getApp3Assignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1366:1: ( rule__ApplyFunction__App3Assignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1366:2: rule__ApplyFunction__App3Assignment_1
            {
            pushFollow(FOLLOW_rule__ApplyFunction__App3Assignment_1_in_rule__ApplyFunction__Group__1__Impl2758);
            rule__ApplyFunction__App3Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAccess().getApp3Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__Group__1__Impl"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1380:1: rule__ApplyFunctionAlpha__Group__0 : rule__ApplyFunctionAlpha__Group__0__Impl rule__ApplyFunctionAlpha__Group__1 ;
    public final void rule__ApplyFunctionAlpha__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1384:1: ( rule__ApplyFunctionAlpha__Group__0__Impl rule__ApplyFunctionAlpha__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1385:2: rule__ApplyFunctionAlpha__Group__0__Impl rule__ApplyFunctionAlpha__Group__1
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__0__Impl_in_rule__ApplyFunctionAlpha__Group__02792);
            rule__ApplyFunctionAlpha__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__1_in_rule__ApplyFunctionAlpha__Group__02795);
            rule__ApplyFunctionAlpha__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__0"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1392:1: rule__ApplyFunctionAlpha__Group__0__Impl : ( () ) ;
    public final void rule__ApplyFunctionAlpha__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1396:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1398:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getApplyFunctionAlphaAction_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1399:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1401:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getApplyFunctionAlphaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__0__Impl"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1411:1: rule__ApplyFunctionAlpha__Group__1 : rule__ApplyFunctionAlpha__Group__1__Impl rule__ApplyFunctionAlpha__Group__2 ;
    public final void rule__ApplyFunctionAlpha__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1415:1: ( rule__ApplyFunctionAlpha__Group__1__Impl rule__ApplyFunctionAlpha__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1416:2: rule__ApplyFunctionAlpha__Group__1__Impl rule__ApplyFunctionAlpha__Group__2
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__1__Impl_in_rule__ApplyFunctionAlpha__Group__12853);
            rule__ApplyFunctionAlpha__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__2_in_rule__ApplyFunctionAlpha__Group__12856);
            rule__ApplyFunctionAlpha__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__1"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1423:1: rule__ApplyFunctionAlpha__Group__1__Impl : ( '(' ) ;
    public final void rule__ApplyFunctionAlpha__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1427:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1429:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__ApplyFunctionAlpha__Group__1__Impl2884); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__1__Impl"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1442:1: rule__ApplyFunctionAlpha__Group__2 : rule__ApplyFunctionAlpha__Group__2__Impl rule__ApplyFunctionAlpha__Group__3 ;
    public final void rule__ApplyFunctionAlpha__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1446:1: ( rule__ApplyFunctionAlpha__Group__2__Impl rule__ApplyFunctionAlpha__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1447:2: rule__ApplyFunctionAlpha__Group__2__Impl rule__ApplyFunctionAlpha__Group__3
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__2__Impl_in_rule__ApplyFunctionAlpha__Group__22915);
            rule__ApplyFunctionAlpha__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__3_in_rule__ApplyFunctionAlpha__Group__22918);
            rule__ApplyFunctionAlpha__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__2"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1454:1: rule__ApplyFunctionAlpha__Group__2__Impl : ( ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )? ) ;
    public final void rule__ApplyFunctionAlpha__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:1: ( ( ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1460:1: ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getArgsAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1461:1: ( rule__ApplyFunctionAlpha__ArgsAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_NUM)||(LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1461:2: rule__ApplyFunctionAlpha__ArgsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ApplyFunctionAlpha__ArgsAssignment_2_in_rule__ApplyFunctionAlpha__Group__2__Impl2945);
                    rule__ApplyFunctionAlpha__ArgsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getArgsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__2__Impl"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1471:1: rule__ApplyFunctionAlpha__Group__3 : rule__ApplyFunctionAlpha__Group__3__Impl rule__ApplyFunctionAlpha__Group__4 ;
    public final void rule__ApplyFunctionAlpha__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1475:1: ( rule__ApplyFunctionAlpha__Group__3__Impl rule__ApplyFunctionAlpha__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1476:2: rule__ApplyFunctionAlpha__Group__3__Impl rule__ApplyFunctionAlpha__Group__4
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__3__Impl_in_rule__ApplyFunctionAlpha__Group__32976);
            rule__ApplyFunctionAlpha__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__4_in_rule__ApplyFunctionAlpha__Group__32979);
            rule__ApplyFunctionAlpha__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__3"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1483:1: rule__ApplyFunctionAlpha__Group__3__Impl : ( ')' ) ;
    public final void rule__ApplyFunctionAlpha__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1487:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1488:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1488:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1489:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ApplyFunctionAlpha__Group__3__Impl3007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__3__Impl"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1502:1: rule__ApplyFunctionAlpha__Group__4 : rule__ApplyFunctionAlpha__Group__4__Impl ;
    public final void rule__ApplyFunctionAlpha__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1506:1: ( rule__ApplyFunctionAlpha__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1507:2: rule__ApplyFunctionAlpha__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplyFunctionAlpha__Group__4__Impl_in_rule__ApplyFunctionAlpha__Group__43038);
            rule__ApplyFunctionAlpha__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__4"


    // $ANTLR start "rule__ApplyFunctionAlpha__Group__4__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1513:1: rule__ApplyFunctionAlpha__Group__4__Impl : ( ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )? ) ;
    public final void rule__ApplyFunctionAlpha__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1517:1: ( ( ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1518:1: ( ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1518:1: ( ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1519:1: ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getNextCallAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:1: ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:2: rule__ApplyFunctionAlpha__NextCallAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ApplyFunctionAlpha__NextCallAssignment_4_in_rule__ApplyFunctionAlpha__Group__4__Impl3065);
                    rule__ApplyFunctionAlpha__NextCallAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getNextCallAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__Group__4__Impl"


    // $ANTLR start "rule__FunctionArguments__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1540:1: rule__FunctionArguments__Group__0 : rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1 ;
    public final void rule__FunctionArguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1544:1: ( rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1545:2: rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__0__Impl_in_rule__FunctionArguments__Group__03106);
            rule__FunctionArguments__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionArguments__Group__1_in_rule__FunctionArguments__Group__03109);
            rule__FunctionArguments__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group__0"


    // $ANTLR start "rule__FunctionArguments__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1552:1: rule__FunctionArguments__Group__0__Impl : ( ( rule__FunctionArguments__ArgumentsAssignment_0 ) ) ;
    public final void rule__FunctionArguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1556:1: ( ( ( rule__FunctionArguments__ArgumentsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1557:1: ( ( rule__FunctionArguments__ArgumentsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1557:1: ( ( rule__FunctionArguments__ArgumentsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1558:1: ( rule__FunctionArguments__ArgumentsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentsAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1559:1: ( rule__FunctionArguments__ArgumentsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1559:2: rule__FunctionArguments__ArgumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionArguments__ArgumentsAssignment_0_in_rule__FunctionArguments__Group__0__Impl3136);
            rule__FunctionArguments__ArgumentsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group__0__Impl"


    // $ANTLR start "rule__FunctionArguments__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1569:1: rule__FunctionArguments__Group__1 : rule__FunctionArguments__Group__1__Impl ;
    public final void rule__FunctionArguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1573:1: ( rule__FunctionArguments__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1574:2: rule__FunctionArguments__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__1__Impl_in_rule__FunctionArguments__Group__13166);
            rule__FunctionArguments__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group__1"


    // $ANTLR start "rule__FunctionArguments__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1580:1: rule__FunctionArguments__Group__1__Impl : ( ( rule__FunctionArguments__Group_1__0 )* ) ;
    public final void rule__FunctionArguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1584:1: ( ( ( rule__FunctionArguments__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1585:1: ( ( rule__FunctionArguments__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1585:1: ( ( rule__FunctionArguments__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1586:1: ( rule__FunctionArguments__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1587:1: ( rule__FunctionArguments__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1587:2: rule__FunctionArguments__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionArguments__Group_1__0_in_rule__FunctionArguments__Group__1__Impl3193);
            	    rule__FunctionArguments__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group__1__Impl"


    // $ANTLR start "rule__FunctionArguments__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1601:1: rule__FunctionArguments__Group_1__0 : rule__FunctionArguments__Group_1__0__Impl rule__FunctionArguments__Group_1__1 ;
    public final void rule__FunctionArguments__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1605:1: ( rule__FunctionArguments__Group_1__0__Impl rule__FunctionArguments__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1606:2: rule__FunctionArguments__Group_1__0__Impl rule__FunctionArguments__Group_1__1
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group_1__0__Impl_in_rule__FunctionArguments__Group_1__03228);
            rule__FunctionArguments__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionArguments__Group_1__1_in_rule__FunctionArguments__Group_1__03231);
            rule__FunctionArguments__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group_1__0"


    // $ANTLR start "rule__FunctionArguments__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1613:1: rule__FunctionArguments__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionArguments__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1617:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1618:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1618:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1619:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_1_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionArguments__Group_1__0__Impl3259); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionArguments__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1632:1: rule__FunctionArguments__Group_1__1 : rule__FunctionArguments__Group_1__1__Impl ;
    public final void rule__FunctionArguments__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1636:1: ( rule__FunctionArguments__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1637:2: rule__FunctionArguments__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group_1__1__Impl_in_rule__FunctionArguments__Group_1__13290);
            rule__FunctionArguments__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group_1__1"


    // $ANTLR start "rule__FunctionArguments__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1643:1: rule__FunctionArguments__Group_1__1__Impl : ( ( rule__FunctionArguments__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__FunctionArguments__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1647:1: ( ( ( rule__FunctionArguments__ArgumentsAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1648:1: ( ( rule__FunctionArguments__ArgumentsAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1648:1: ( ( rule__FunctionArguments__ArgumentsAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1649:1: ( rule__FunctionArguments__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentsAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1650:1: ( rule__FunctionArguments__ArgumentsAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1650:2: rule__FunctionArguments__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FunctionArguments__ArgumentsAssignment_1_1_in_rule__FunctionArguments__Group_1__1__Impl3317);
            rule__FunctionArguments__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentsAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__Group_1__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1665:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1669:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1670:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03352);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03355);
            rule__NumericExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__0"


    // $ANTLR start "rule__NumericExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1677:1: rule__NumericExpression__Group__0__Impl : ( ( rule__NumericExpression__FactorAssignment_0 ) ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1681:1: ( ( ( rule__NumericExpression__FactorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1682:1: ( ( rule__NumericExpression__FactorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1682:1: ( ( rule__NumericExpression__FactorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1683:1: ( rule__NumericExpression__FactorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1684:1: ( rule__NumericExpression__FactorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1684:2: rule__NumericExpression__FactorAssignment_0
            {
            pushFollow(FOLLOW_rule__NumericExpression__FactorAssignment_0_in_rule__NumericExpression__Group__0__Impl3382);
            rule__NumericExpression__FactorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getFactorAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__0__Impl"


    // $ANTLR start "rule__NumericExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1694:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1698:1: ( rule__NumericExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1699:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13412);
            rule__NumericExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__1"


    // $ANTLR start "rule__NumericExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1705:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__ExprTailAssignment_1 )? ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1709:1: ( ( ( rule__NumericExpression__ExprTailAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1710:1: ( ( rule__NumericExpression__ExprTailAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1710:1: ( ( rule__NumericExpression__ExprTailAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1711:1: ( rule__NumericExpression__ExprTailAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getExprTailAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1712:1: ( rule__NumericExpression__ExprTailAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1712:2: rule__NumericExpression__ExprTailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NumericExpression__ExprTailAssignment_1_in_rule__NumericExpression__Group__1__Impl3439);
                    rule__NumericExpression__ExprTailAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getExprTailAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group__1__Impl"


    // $ANTLR start "rule__ExprTail__Group_0__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1726:1: rule__ExprTail__Group_0__0 : rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1 ;
    public final void rule__ExprTail__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1730:1: ( rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1731:2: rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__0__Impl_in_rule__ExprTail__Group_0__03474);
            rule__ExprTail__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_0__1_in_rule__ExprTail__Group_0__03477);
            rule__ExprTail__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__0"


    // $ANTLR start "rule__ExprTail__Group_0__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1738:1: rule__ExprTail__Group_0__0__Impl : ( '+' ) ;
    public final void rule__ExprTail__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1742:1: ( ( '+' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1743:1: ( '+' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1743:1: ( '+' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1744:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getPlusSignKeyword_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ExprTail__Group_0__0__Impl3505); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getPlusSignKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__0__Impl"


    // $ANTLR start "rule__ExprTail__Group_0__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1757:1: rule__ExprTail__Group_0__1 : rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2 ;
    public final void rule__ExprTail__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1761:1: ( rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1762:2: rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__1__Impl_in_rule__ExprTail__Group_0__13536);
            rule__ExprTail__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_0__2_in_rule__ExprTail__Group_0__13539);
            rule__ExprTail__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__1"


    // $ANTLR start "rule__ExprTail__Group_0__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1769:1: rule__ExprTail__Group_0__1__Impl : ( ( rule__ExprTail__FactorAssignment_0_1 ) ) ;
    public final void rule__ExprTail__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1773:1: ( ( ( rule__ExprTail__FactorAssignment_0_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1774:1: ( ( rule__ExprTail__FactorAssignment_0_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1774:1: ( ( rule__ExprTail__FactorAssignment_0_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1775:1: ( rule__ExprTail__FactorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorAssignment_0_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1776:1: ( rule__ExprTail__FactorAssignment_0_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1776:2: rule__ExprTail__FactorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprTail__FactorAssignment_0_1_in_rule__ExprTail__Group_0__1__Impl3566);
            rule__ExprTail__FactorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getFactorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__1__Impl"


    // $ANTLR start "rule__ExprTail__Group_0__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1786:1: rule__ExprTail__Group_0__2 : rule__ExprTail__Group_0__2__Impl ;
    public final void rule__ExprTail__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1790:1: ( rule__ExprTail__Group_0__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1791:2: rule__ExprTail__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__2__Impl_in_rule__ExprTail__Group_0__23596);
            rule__ExprTail__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__2"


    // $ANTLR start "rule__ExprTail__Group_0__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1797:1: rule__ExprTail__Group_0__2__Impl : ( ( rule__ExprTail__ExprTailAssignment_0_2 )? ) ;
    public final void rule__ExprTail__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1801:1: ( ( ( rule__ExprTail__ExprTailAssignment_0_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1802:1: ( ( rule__ExprTail__ExprTailAssignment_0_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1802:1: ( ( rule__ExprTail__ExprTailAssignment_0_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1803:1: ( rule__ExprTail__ExprTailAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailAssignment_0_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:1: ( rule__ExprTail__ExprTailAssignment_0_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=19 && LA15_0<=20)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:2: rule__ExprTail__ExprTailAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprTail__ExprTailAssignment_0_2_in_rule__ExprTail__Group_0__2__Impl3623);
                    rule__ExprTail__ExprTailAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getExprTailAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_0__2__Impl"


    // $ANTLR start "rule__ExprTail__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1820:1: rule__ExprTail__Group_1__0 : rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1 ;
    public final void rule__ExprTail__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1824:1: ( rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1825:2: rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__0__Impl_in_rule__ExprTail__Group_1__03660);
            rule__ExprTail__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_1__1_in_rule__ExprTail__Group_1__03663);
            rule__ExprTail__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__0"


    // $ANTLR start "rule__ExprTail__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1832:1: rule__ExprTail__Group_1__0__Impl : ( '-' ) ;
    public final void rule__ExprTail__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1836:1: ( ( '-' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1837:1: ( '-' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1837:1: ( '-' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1838:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ExprTail__Group_1__0__Impl3691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getHyphenMinusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__0__Impl"


    // $ANTLR start "rule__ExprTail__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1851:1: rule__ExprTail__Group_1__1 : rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2 ;
    public final void rule__ExprTail__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1855:1: ( rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1856:2: rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__1__Impl_in_rule__ExprTail__Group_1__13722);
            rule__ExprTail__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_1__2_in_rule__ExprTail__Group_1__13725);
            rule__ExprTail__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__1"


    // $ANTLR start "rule__ExprTail__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1863:1: rule__ExprTail__Group_1__1__Impl : ( ( rule__ExprTail__FactorAssignment_1_1 ) ) ;
    public final void rule__ExprTail__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1867:1: ( ( ( rule__ExprTail__FactorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:1: ( ( rule__ExprTail__FactorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:1: ( ( rule__ExprTail__FactorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:1: ( rule__ExprTail__FactorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1870:1: ( rule__ExprTail__FactorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1870:2: rule__ExprTail__FactorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprTail__FactorAssignment_1_1_in_rule__ExprTail__Group_1__1__Impl3752);
            rule__ExprTail__FactorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getFactorAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__1__Impl"


    // $ANTLR start "rule__ExprTail__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1880:1: rule__ExprTail__Group_1__2 : rule__ExprTail__Group_1__2__Impl ;
    public final void rule__ExprTail__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1884:1: ( rule__ExprTail__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1885:2: rule__ExprTail__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__2__Impl_in_rule__ExprTail__Group_1__23782);
            rule__ExprTail__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__2"


    // $ANTLR start "rule__ExprTail__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1891:1: rule__ExprTail__Group_1__2__Impl : ( ( rule__ExprTail__ExprTailAssignment_1_2 )? ) ;
    public final void rule__ExprTail__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1895:1: ( ( ( rule__ExprTail__ExprTailAssignment_1_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( ( rule__ExprTail__ExprTailAssignment_1_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( ( rule__ExprTail__ExprTailAssignment_1_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1897:1: ( rule__ExprTail__ExprTailAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:1: ( rule__ExprTail__ExprTailAssignment_1_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=19 && LA16_0<=20)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:2: rule__ExprTail__ExprTailAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__ExprTail__ExprTailAssignment_1_2_in_rule__ExprTail__Group_1__2__Impl3809);
                    rule__ExprTail__ExprTailAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getExprTailAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1914:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1918:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1919:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03846);
            rule__Factor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03849);
            rule__Factor__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1926:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__TermAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1930:1: ( ( ( rule__Factor__TermAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:1: ( ( rule__Factor__TermAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:1: ( ( rule__Factor__TermAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1932:1: ( rule__Factor__TermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1933:1: ( rule__Factor__TermAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1933:2: rule__Factor__TermAssignment_0
            {
            pushFollow(FOLLOW_rule__Factor__TermAssignment_0_in_rule__Factor__Group__0__Impl3876);
            rule__Factor__TermAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getTermAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1943:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1947:1: ( rule__Factor__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1948:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13906);
            rule__Factor__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1954:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__FactorTailAssignment_1 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1958:1: ( ( ( rule__Factor__FactorTailAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:1: ( ( rule__Factor__FactorTailAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:1: ( ( rule__Factor__FactorTailAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1960:1: ( rule__Factor__FactorTailAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1961:1: ( rule__Factor__FactorTailAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1961:2: rule__Factor__FactorTailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Factor__FactorTailAssignment_1_in_rule__Factor__Group__1__Impl3933);
                    rule__Factor__FactorTailAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorTailAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__FactorTail__Group_0__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1975:1: rule__FactorTail__Group_0__0 : rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1 ;
    public final void rule__FactorTail__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1979:1: ( rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1980:2: rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__0__Impl_in_rule__FactorTail__Group_0__03968);
            rule__FactorTail__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_0__1_in_rule__FactorTail__Group_0__03971);
            rule__FactorTail__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__0"


    // $ANTLR start "rule__FactorTail__Group_0__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1987:1: rule__FactorTail__Group_0__0__Impl : ( '*' ) ;
    public final void rule__FactorTail__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1991:1: ( ( '*' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1992:1: ( '*' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1992:1: ( '*' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1993:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getAsteriskKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__FactorTail__Group_0__0__Impl3999); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getAsteriskKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__0__Impl"


    // $ANTLR start "rule__FactorTail__Group_0__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2006:1: rule__FactorTail__Group_0__1 : rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2 ;
    public final void rule__FactorTail__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2010:1: ( rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2011:2: rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__1__Impl_in_rule__FactorTail__Group_0__14030);
            rule__FactorTail__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_0__2_in_rule__FactorTail__Group_0__14033);
            rule__FactorTail__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__1"


    // $ANTLR start "rule__FactorTail__Group_0__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2018:1: rule__FactorTail__Group_0__1__Impl : ( ( rule__FactorTail__TermAssignment_0_1 ) ) ;
    public final void rule__FactorTail__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2022:1: ( ( ( rule__FactorTail__TermAssignment_0_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2023:1: ( ( rule__FactorTail__TermAssignment_0_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2023:1: ( ( rule__FactorTail__TermAssignment_0_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2024:1: ( rule__FactorTail__TermAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermAssignment_0_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2025:1: ( rule__FactorTail__TermAssignment_0_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2025:2: rule__FactorTail__TermAssignment_0_1
            {
            pushFollow(FOLLOW_rule__FactorTail__TermAssignment_0_1_in_rule__FactorTail__Group_0__1__Impl4060);
            rule__FactorTail__TermAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__1__Impl"


    // $ANTLR start "rule__FactorTail__Group_0__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2035:1: rule__FactorTail__Group_0__2 : rule__FactorTail__Group_0__2__Impl ;
    public final void rule__FactorTail__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2039:1: ( rule__FactorTail__Group_0__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2040:2: rule__FactorTail__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__2__Impl_in_rule__FactorTail__Group_0__24090);
            rule__FactorTail__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__2"


    // $ANTLR start "rule__FactorTail__Group_0__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2046:1: rule__FactorTail__Group_0__2__Impl : ( ( rule__FactorTail__FactorTailAssignment_0_2 )? ) ;
    public final void rule__FactorTail__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2050:1: ( ( ( rule__FactorTail__FactorTailAssignment_0_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:1: ( ( rule__FactorTail__FactorTailAssignment_0_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:1: ( ( rule__FactorTail__FactorTailAssignment_0_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2052:1: ( rule__FactorTail__FactorTailAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailAssignment_0_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2053:1: ( rule__FactorTail__FactorTailAssignment_0_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=21 && LA18_0<=22)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2053:2: rule__FactorTail__FactorTailAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__FactorTail__FactorTailAssignment_0_2_in_rule__FactorTail__Group_0__2__Impl4117);
                    rule__FactorTail__FactorTailAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_0__2__Impl"


    // $ANTLR start "rule__FactorTail__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2069:1: rule__FactorTail__Group_1__0 : rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1 ;
    public final void rule__FactorTail__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2073:1: ( rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2074:2: rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__0__Impl_in_rule__FactorTail__Group_1__04154);
            rule__FactorTail__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_1__1_in_rule__FactorTail__Group_1__04157);
            rule__FactorTail__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__0"


    // $ANTLR start "rule__FactorTail__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2081:1: rule__FactorTail__Group_1__0__Impl : ( '/' ) ;
    public final void rule__FactorTail__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2085:1: ( ( '/' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2086:1: ( '/' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2086:1: ( '/' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2087:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getSolidusKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__FactorTail__Group_1__0__Impl4185); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getSolidusKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__0__Impl"


    // $ANTLR start "rule__FactorTail__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2100:1: rule__FactorTail__Group_1__1 : rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2 ;
    public final void rule__FactorTail__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2104:1: ( rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2105:2: rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__1__Impl_in_rule__FactorTail__Group_1__14216);
            rule__FactorTail__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_1__2_in_rule__FactorTail__Group_1__14219);
            rule__FactorTail__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__1"


    // $ANTLR start "rule__FactorTail__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2112:1: rule__FactorTail__Group_1__1__Impl : ( ( rule__FactorTail__TermAssignment_1_1 ) ) ;
    public final void rule__FactorTail__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2116:1: ( ( ( rule__FactorTail__TermAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2117:1: ( ( rule__FactorTail__TermAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2117:1: ( ( rule__FactorTail__TermAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2118:1: ( rule__FactorTail__TermAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2119:1: ( rule__FactorTail__TermAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2119:2: rule__FactorTail__TermAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FactorTail__TermAssignment_1_1_in_rule__FactorTail__Group_1__1__Impl4246);
            rule__FactorTail__TermAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__1__Impl"


    // $ANTLR start "rule__FactorTail__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2129:1: rule__FactorTail__Group_1__2 : rule__FactorTail__Group_1__2__Impl ;
    public final void rule__FactorTail__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2133:1: ( rule__FactorTail__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2134:2: rule__FactorTail__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__2__Impl_in_rule__FactorTail__Group_1__24276);
            rule__FactorTail__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__2"


    // $ANTLR start "rule__FactorTail__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2140:1: rule__FactorTail__Group_1__2__Impl : ( ( rule__FactorTail__FactorTailAssignment_1_2 )? ) ;
    public final void rule__FactorTail__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2144:1: ( ( ( rule__FactorTail__FactorTailAssignment_1_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2145:1: ( ( rule__FactorTail__FactorTailAssignment_1_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2145:1: ( ( rule__FactorTail__FactorTailAssignment_1_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2146:1: ( rule__FactorTail__FactorTailAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2147:1: ( rule__FactorTail__FactorTailAssignment_1_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=21 && LA19_0<=22)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2147:2: rule__FactorTail__FactorTailAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__FactorTail__FactorTailAssignment_1_2_in_rule__FactorTail__Group_1__2__Impl4303);
                    rule__FactorTail__FactorTailAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__Group_1__2__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2163:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2167:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2168:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__04340);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__04343);
            rule__ParenthesisExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__0"


    // $ANTLR start "rule__ParenthesisExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2175:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2179:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2180:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2180:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2181:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ParenthesisExpression__Group__0__Impl4371); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__0__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2194:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2198:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2199:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14402);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14405);
            rule__ParenthesisExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__1"


    // $ANTLR start "rule__ParenthesisExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2206:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2210:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2211:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2211:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2212:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4432);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__1__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2223:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2227:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2228:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24461);
            rule__ParenthesisExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__2"


    // $ANTLR start "rule__ParenthesisExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2234:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2238:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2239:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2239:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2240:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__ParenthesisExpression__Group__2__Impl4489); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesisExpression__Group__2__Impl"


    // $ANTLR start "rule__Program__ExpressionsAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2260:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2264:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2265:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2265:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2266:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04531);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExpressionsAssignment_0"


    // $ANTLR start "rule__Program__ExpressionAssignment_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2275:1: rule__Program__ExpressionAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2279:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2280:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2280:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2281:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionAssignment_2_04562);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionExpressionParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ExpressionAssignment_2_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2290:1: rule__FunctionDeclaration__ParametersAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2294:1: ( ( ruleFunctionParameters ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2295:1: ( ruleFunctionParameters )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2295:1: ( ruleFunctionParameters )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2296:1: ruleFunctionParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersFunctionParametersParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionParameters_in_rule__FunctionDeclaration__ParametersAssignment_24593);
            ruleFunctionParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersFunctionParametersParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2305:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleBody ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2309:1: ( ( ruleBody ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2310:1: ( ruleBody )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2310:1: ( ruleBody )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2311:1: ruleBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44624);
            ruleBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionDeclaration__BodyAssignment_4"


    // $ANTLR start "rule__Body__ExpressionsAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2320:1: rule__Body__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2324:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2325:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2325:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2326:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04655);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__ExpressionsAssignment_0"


    // $ANTLR start "rule__Body__ExpressionsAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2335:1: rule__Body__ExpressionsAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2339:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2340:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2340:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2341:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_24686);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__ExpressionsAssignment_1_2"


    // $ANTLR start "rule__FunctionParameters__ParametersAssignment_0_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2350:1: rule__FunctionParameters__ParametersAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__FunctionParameters__ParametersAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2354:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2355:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2355:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2356:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_0_14717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__ParametersAssignment_0_1"


    // $ANTLR start "rule__FunctionParameters__ParametersAssignment_1_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2365:1: rule__FunctionParameters__ParametersAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__FunctionParameters__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2369:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2370:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2370:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2371:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_1_04748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__ParametersAssignment_1_0"


    // $ANTLR start "rule__FunctionParameters__ParametersAssignment_1_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2380:1: rule__FunctionParameters__ParametersAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionParameters__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2384:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2385:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2385:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2386:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_1_1_14779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParametersIDTerminalRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionParameters__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__ApplyFunction__FunctorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2395:1: rule__ApplyFunction__FunctorAssignment_0 : ( ruleSymbolReference ) ;
    public final void rule__ApplyFunction__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2399:1: ( ( ruleSymbolReference ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2400:1: ( ruleSymbolReference )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2400:1: ( ruleSymbolReference )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2401:1: ruleSymbolReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAccess().getFunctorSymbolReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSymbolReference_in_rule__ApplyFunction__FunctorAssignment_04810);
            ruleSymbolReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAccess().getFunctorSymbolReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__FunctorAssignment_0"


    // $ANTLR start "rule__ApplyFunction__App3Assignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2410:1: rule__ApplyFunction__App3Assignment_1 : ( ruleApplyFunctionAlpha ) ;
    public final void rule__ApplyFunction__App3Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2414:1: ( ( ruleApplyFunctionAlpha ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2415:1: ( ruleApplyFunctionAlpha )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2415:1: ( ruleApplyFunctionAlpha )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2416:1: ruleApplyFunctionAlpha
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAccess().getApp3ApplyFunctionAlphaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleApplyFunctionAlpha_in_rule__ApplyFunction__App3Assignment_14841);
            ruleApplyFunctionAlpha();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAccess().getApp3ApplyFunctionAlphaParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunction__App3Assignment_1"


    // $ANTLR start "rule__ApplyFunctionAlpha__ArgsAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2425:1: rule__ApplyFunctionAlpha__ArgsAssignment_2 : ( ruleFunctionArguments ) ;
    public final void rule__ApplyFunctionAlpha__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:1: ( ( ruleFunctionArguments ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2430:1: ( ruleFunctionArguments )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2430:1: ( ruleFunctionArguments )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2431:1: ruleFunctionArguments
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionArguments_in_rule__ApplyFunctionAlpha__ArgsAssignment_24872);
            ruleFunctionArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__ArgsAssignment_2"


    // $ANTLR start "rule__ApplyFunctionAlpha__NextCallAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2440:1: rule__ApplyFunctionAlpha__NextCallAssignment_4 : ( ruleApplyFunctionAlpha ) ;
    public final void rule__ApplyFunctionAlpha__NextCallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:1: ( ( ruleApplyFunctionAlpha ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2445:1: ( ruleApplyFunctionAlpha )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2445:1: ( ruleApplyFunctionAlpha )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2446:1: ruleApplyFunctionAlpha
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyFunctionAlphaAccess().getNextCallApplyFunctionAlphaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleApplyFunctionAlpha_in_rule__ApplyFunctionAlpha__NextCallAssignment_44903);
            ruleApplyFunctionAlpha();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyFunctionAlphaAccess().getNextCallApplyFunctionAlphaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyFunctionAlpha__NextCallAssignment_4"


    // $ANTLR start "rule__FunctionArguments__ArgumentsAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2455:1: rule__FunctionArguments__ArgumentsAssignment_0 : ( ruleExpression ) ;
    public final void rule__FunctionArguments__ArgumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2459:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2460:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2460:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2461:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentsAssignment_04934);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentsExpressionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__ArgumentsAssignment_0"


    // $ANTLR start "rule__FunctionArguments__ArgumentsAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2470:1: rule__FunctionArguments__ArgumentsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionArguments__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2474:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2475:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2475:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2476:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentsAssignment_1_14965);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentsExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArguments__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__LiteralExpr__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2485:1: rule__LiteralExpr__ValueAssignment : ( RULE_NUM ) ;
    public final void rule__LiteralExpr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2489:1: ( ( RULE_NUM ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2490:1: ( RULE_NUM )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2490:1: ( RULE_NUM )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2491:1: RULE_NUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
            }
            match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment4996); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpr__ValueAssignment"


    // $ANTLR start "rule__SymbolReference__IdAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2500:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2504:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2505:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2505:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2506:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5027); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolReference__IdAssignment"


    // $ANTLR start "rule__NumericExpression__FactorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2517:1: rule__NumericExpression__FactorAssignment_0 : ( ruleFactor ) ;
    public final void rule__NumericExpression__FactorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2521:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2522:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2522:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2523:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorFactorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__FactorAssignment_05060);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getFactorFactorParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__FactorAssignment_0"


    // $ANTLR start "rule__NumericExpression__ExprTailAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2532:1: rule__NumericExpression__ExprTailAssignment_1 : ( ruleExprTail ) ;
    public final void rule__NumericExpression__ExprTailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2536:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2537:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2537:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2538:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getExprTailExprTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__NumericExpression__ExprTailAssignment_15091);
            ruleExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getExprTailExprTailParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__ExprTailAssignment_1"


    // $ANTLR start "rule__ExprTail__FactorAssignment_0_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2547:1: rule__ExprTail__FactorAssignment_0_1 : ( ruleFactor ) ;
    public final void rule__ExprTail__FactorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2551:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2552:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2552:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2553:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_0_15122);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__FactorAssignment_0_1"


    // $ANTLR start "rule__ExprTail__ExprTailAssignment_0_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2562:1: rule__ExprTail__ExprTailAssignment_0_2 : ( ruleExprTail ) ;
    public final void rule__ExprTail__ExprTailAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2566:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2567:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2567:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2568:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_0_25153);
            ruleExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__ExprTailAssignment_0_2"


    // $ANTLR start "rule__ExprTail__FactorAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2577:1: rule__ExprTail__FactorAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__ExprTail__FactorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2581:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2582:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2582:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2583:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_1_15184);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__FactorAssignment_1_1"


    // $ANTLR start "rule__ExprTail__ExprTailAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2592:1: rule__ExprTail__ExprTailAssignment_1_2 : ( ruleExprTail ) ;
    public final void rule__ExprTail__ExprTailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2596:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2597:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2597:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2598:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_1_25215);
            ruleExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTail__ExprTailAssignment_1_2"


    // $ANTLR start "rule__Factor__TermAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2607:1: rule__Factor__TermAssignment_0 : ( ruleTerm ) ;
    public final void rule__Factor__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2611:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2612:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2612:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2613:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__TermAssignment_05246);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getTermTermParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__TermAssignment_0"


    // $ANTLR start "rule__Factor__FactorTailAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2622:1: rule__Factor__FactorTailAssignment_1 : ( ruleFactorTail ) ;
    public final void rule__Factor__FactorTailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2626:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2628:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_15277);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorTailAssignment_1"


    // $ANTLR start "rule__FactorTail__TermAssignment_0_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2637:1: rule__FactorTail__TermAssignment_0_1 : ( ruleTerm ) ;
    public final void rule__FactorTail__TermAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2641:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2642:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2642:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2643:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_0_15308);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__TermAssignment_0_1"


    // $ANTLR start "rule__FactorTail__FactorTailAssignment_0_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2652:1: rule__FactorTail__FactorTailAssignment_0_2 : ( ruleFactorTail ) ;
    public final void rule__FactorTail__FactorTailAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2656:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2657:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2657:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2658:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_0_25339);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__FactorTailAssignment_0_2"


    // $ANTLR start "rule__FactorTail__TermAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2667:1: rule__FactorTail__TermAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__FactorTail__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2671:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2672:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2672:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2673:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_1_15370);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__TermAssignment_1_1"


    // $ANTLR start "rule__FactorTail__FactorTailAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2682:1: rule__FactorTail__FactorTailAssignment_1_2 : ( ruleFactorTail ) ;
    public final void rule__FactorTail__FactorTailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2686:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2687:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2687:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2688:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_1_25401);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FactorTail__FactorTailAssignment_1_2"

    // $ANTLR start synpred13_InternalMiniScript
    public final void synpred13_InternalMiniScript_fragment() throws RecognitionException {   
        // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:2: ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )
        // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:2: rule__ApplyFunctionAlpha__NextCallAssignment_4
        {
        pushFollow(FOLLOW_rule__ApplyFunctionAlpha__NextCallAssignment_4_in_synpred13_InternalMiniScript3065);
        rule__ApplyFunctionAlpha__NextCallAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalMiniScript

    // Delegated rules

    public final boolean synpred13_InternalMiniScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalMiniScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\17\uffff";
    static final String DFA12_eofS =
        "\1\2\16\uffff";
    static final String DFA12_minS =
        "\1\4\1\0\15\uffff";
    static final String DFA12_maxS =
        "\1\26\1\0\15\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA12_specialS =
        "\1\uffff\1\0\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\2\6\uffff\2\2\1\1\1\2\1\uffff\6\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1520:1: ( rule__ApplyFunctionAlpha__NextCallAssignment_4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalMiniScript()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Alternatives_in_ruleBody339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameters373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Alternatives_in_ruleFunctionParameters399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyFunction_in_entryRuleApplyFunction426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyFunction433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunction__Group__0_in_ruleApplyFunction459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyFunctionAlpha_in_entryRuleApplyFunctionAlpha486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyFunctionAlpha493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__0_in_ruleApplyFunctionAlpha519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArguments553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__0_in_ruleFunctionArguments579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_entryRuleExprTail788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTail795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Alternatives_in_ruleExprTail821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_entryRuleFactorTail908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorTail915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Alternatives_in_ruleFactorTail941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_0__0_in_rule__FunctionParameters__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1__0_in_rule__FunctionParameters__Alternatives1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__0_in_rule__ExprTail__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__0_in_rule__ExprTail__Alternatives1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__0_in_rule__FactorTail__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__0_in_rule__FactorTail__Alternatives1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyFunction_in_rule__Term__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_rule__Term__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01414 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11474 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Program__Group__1__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1563 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionAssignment_2_0_in_rule__Program__Group_2__0__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Program__Group_2__1__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01723 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FunctionDeclaration__Group__0__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FunctionDeclaration__Group__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21847 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31907 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FunctionDeclaration__Group__3__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02036 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12097 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group_1__1__Impl2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22159 = new BitSet(new long[]{0x0000000000026030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_1_2_in_rule__Body__Group_1__2__Impl2189 = new BitSet(new long[]{0x0000000000006032L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group_1__3__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_0__0__Impl_in_rule__FunctionParameters__Group_0__02287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_0__1_in_rule__FunctionParameters__Group_0__02290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_0__1__Impl_in_rule__FunctionParameters__Group_0__12348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__ParametersAssignment_0_1_in_rule__FunctionParameters__Group_0__1__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1__0__Impl_in_rule__FunctionParameters__Group_1__02410 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1__1_in_rule__FunctionParameters__Group_1__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__ParametersAssignment_1_0_in_rule__FunctionParameters__Group_1__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1__1__Impl_in_rule__FunctionParameters__Group_1__12470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1_1__0_in_rule__FunctionParameters__Group_1__1__Impl2499 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1_1__0_in_rule__FunctionParameters__Group_1__1__Impl2511 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1_1__0__Impl_in_rule__FunctionParameters__Group_1_1__02548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1_1__1_in_rule__FunctionParameters__Group_1_1__02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionParameters__Group_1_1__0__Impl2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group_1_1__1__Impl_in_rule__FunctionParameters__Group_1_1__12610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__ParametersAssignment_1_1_1_in_rule__FunctionParameters__Group_1_1__1__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunction__Group__0__Impl_in_rule__ApplyFunction__Group__02671 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ApplyFunction__Group__1_in_rule__ApplyFunction__Group__02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunction__FunctorAssignment_0_in_rule__ApplyFunction__Group__0__Impl2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunction__Group__1__Impl_in_rule__ApplyFunction__Group__12731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunction__App3Assignment_1_in_rule__ApplyFunction__Group__1__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__0__Impl_in_rule__ApplyFunctionAlpha__Group__02792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__1_in_rule__ApplyFunctionAlpha__Group__02795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__1__Impl_in_rule__ApplyFunctionAlpha__Group__12853 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__2_in_rule__ApplyFunctionAlpha__Group__12856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ApplyFunctionAlpha__Group__1__Impl2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__2__Impl_in_rule__ApplyFunctionAlpha__Group__22915 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__3_in_rule__ApplyFunctionAlpha__Group__22918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__ArgsAssignment_2_in_rule__ApplyFunctionAlpha__Group__2__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__3__Impl_in_rule__ApplyFunctionAlpha__Group__32976 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__4_in_rule__ApplyFunctionAlpha__Group__32979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ApplyFunctionAlpha__Group__3__Impl3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__Group__4__Impl_in_rule__ApplyFunctionAlpha__Group__43038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__NextCallAssignment_4_in_rule__ApplyFunctionAlpha__Group__4__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__0__Impl_in_rule__FunctionArguments__Group__03106 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__1_in_rule__FunctionArguments__Group__03109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__ArgumentsAssignment_0_in_rule__FunctionArguments__Group__0__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__1__Impl_in_rule__FunctionArguments__Group__13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group_1__0_in_rule__FunctionArguments__Group__1__Impl3193 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group_1__0__Impl_in_rule__FunctionArguments__Group_1__03228 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group_1__1_in_rule__FunctionArguments__Group_1__03231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionArguments__Group_1__0__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group_1__1__Impl_in_rule__FunctionArguments__Group_1__13290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__ArgumentsAssignment_1_1_in_rule__FunctionArguments__Group_1__1__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03352 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__FactorAssignment_0_in_rule__NumericExpression__Group__0__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__ExprTailAssignment_1_in_rule__NumericExpression__Group__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__0__Impl_in_rule__ExprTail__Group_0__03474 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__1_in_rule__ExprTail__Group_0__03477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExprTail__Group_0__0__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__1__Impl_in_rule__ExprTail__Group_0__13536 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__2_in_rule__ExprTail__Group_0__13539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__FactorAssignment_0_1_in_rule__ExprTail__Group_0__1__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__2__Impl_in_rule__ExprTail__Group_0__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__ExprTailAssignment_0_2_in_rule__ExprTail__Group_0__2__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__0__Impl_in_rule__ExprTail__Group_1__03660 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__1_in_rule__ExprTail__Group_1__03663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExprTail__Group_1__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__1__Impl_in_rule__ExprTail__Group_1__13722 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__2_in_rule__ExprTail__Group_1__13725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__FactorAssignment_1_1_in_rule__ExprTail__Group_1__1__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__2__Impl_in_rule__ExprTail__Group_1__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__ExprTailAssignment_1_2_in_rule__ExprTail__Group_1__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03846 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__TermAssignment_0_in_rule__Factor__Group__0__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__FactorTailAssignment_1_in_rule__Factor__Group__1__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__0__Impl_in_rule__FactorTail__Group_0__03968 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__1_in_rule__FactorTail__Group_0__03971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FactorTail__Group_0__0__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__1__Impl_in_rule__FactorTail__Group_0__14030 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__2_in_rule__FactorTail__Group_0__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__TermAssignment_0_1_in_rule__FactorTail__Group_0__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__2__Impl_in_rule__FactorTail__Group_0__24090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__FactorTailAssignment_0_2_in_rule__FactorTail__Group_0__2__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__0__Impl_in_rule__FactorTail__Group_1__04154 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__1_in_rule__FactorTail__Group_1__04157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FactorTail__Group_1__0__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__1__Impl_in_rule__FactorTail__Group_1__14216 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__2_in_rule__FactorTail__Group_1__14219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__TermAssignment_1_1_in_rule__FactorTail__Group_1__1__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__2__Impl_in_rule__FactorTail__Group_1__24276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__FactorTailAssignment_1_2_in_rule__FactorTail__Group_1__2__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__04340 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParenthesisExpression__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14402 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParenthesisExpression__Group__2__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionAssignment_2_04562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_rule__FunctionDeclaration__ParametersAssignment_24593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_24686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_0_14717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_1_04748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameters__ParametersAssignment_1_1_14779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_rule__ApplyFunction__FunctorAssignment_04810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyFunctionAlpha_in_rule__ApplyFunction__App3Assignment_14841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_rule__ApplyFunctionAlpha__ArgsAssignment_24872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyFunctionAlpha_in_rule__ApplyFunctionAlpha__NextCallAssignment_44903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentsAssignment_04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentsAssignment_1_14965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__FactorAssignment_05060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__NumericExpression__ExprTailAssignment_15091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_0_15122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_0_25153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_1_15184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_1_25215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__TermAssignment_05246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_15277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_0_15308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_0_25339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_1_15370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_1_25401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyFunctionAlpha__NextCallAssignment_4_in_synpred13_InternalMiniScript3065 = new BitSet(new long[]{0x0000000000000002L});

}