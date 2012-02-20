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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "';'", "'func'", "'('", "')'", "','", "'{'", "'}'", "'='"
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


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:201:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:202:1: ( ruleApply EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:203:1: ruleApply EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyRule()); 
            }
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply366);
            ruleApply();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply373); if (state.failed) return ;

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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:210:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:214:2: ( ( ( rule__Apply__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__Apply__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__Apply__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:216:1: ( rule__Apply__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:1: ( rule__Apply__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:2: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_rule__Apply__Group__0_in_ruleApply399);
            rule__Apply__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getGroup()); 
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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleFunctor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:229:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:230:1: ( ruleFunctor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:231:1: ruleFunctor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctorRule()); 
            }
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor426);
            ruleFunctor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:238:1: ruleFunctor : ( ( rule__Functor__Alternatives ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:242:2: ( ( ( rule__Functor__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__Functor__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__Functor__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:244:1: ( rule__Functor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctorAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:1: ( rule__Functor__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:2: rule__Functor__Alternatives
            {
            pushFollow(FOLLOW_rule__Functor__Alternatives_in_ruleFunctor459);
            rule__Functor__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleApplyTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:257:1: entryRuleApplyTail : ruleApplyTail EOF ;
    public final void entryRuleApplyTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:258:1: ( ruleApplyTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:259:1: ruleApplyTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailRule()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_entryRuleApplyTail486);
            ruleApplyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyTail493); if (state.failed) return ;

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
    // $ANTLR end "entryRuleApplyTail"


    // $ANTLR start "ruleApplyTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:266:1: ruleApplyTail : ( ( rule__ApplyTail__Group__0 ) ) ;
    public final void ruleApplyTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:2: ( ( ( rule__ApplyTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__ApplyTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__ApplyTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:1: ( rule__ApplyTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:1: ( rule__ApplyTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:2: rule__ApplyTail__Group__0
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__0_in_ruleApplyTail519);
            rule__ApplyTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getGroup()); 
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
    // $ANTLR end "ruleApplyTail"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:285:1: entryRuleLiteralExpr : ruleLiteralExpr EOF ;
    public final void entryRuleLiteralExpr() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:286:1: ( ruleLiteralExpr EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:287:1: ruleLiteralExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr546);
            ruleLiteralExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr553); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:294:1: ruleLiteralExpr : ( ( rule__LiteralExpr__ValueAssignment ) ) ;
    public final void ruleLiteralExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:2: ( ( ( rule__LiteralExpr__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:1: ( rule__LiteralExpr__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:1: ( rule__LiteralExpr__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:2: rule__LiteralExpr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr579);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:313:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:314:1: ( ruleSymbolReference EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:315:1: ruleSymbolReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference606);
            ruleSymbolReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference613); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:322:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__SymbolReference__IdAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:1: ( rule__SymbolReference__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:1: ( rule__SymbolReference__IdAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:2: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference639);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:341:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:342:1: ( ruleNumericExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:343:1: ruleNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression666);
            ruleNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression673); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:350:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__NumericExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__NumericExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:1: ( rule__NumericExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:1: ( rule__NumericExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:2: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression699);
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


    // $ANTLR start "entryRuleNumExprTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:369:1: entryRuleNumExprTail : ruleNumExprTail EOF ;
    public final void entryRuleNumExprTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:370:1: ( ruleNumExprTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:371:1: ruleNumExprTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailRule()); 
            }
            pushFollow(FOLLOW_ruleNumExprTail_in_entryRuleNumExprTail726);
            ruleNumExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumExprTail733); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumExprTail"


    // $ANTLR start "ruleNumExprTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:378:1: ruleNumExprTail : ( ( rule__NumExprTail__Group__0 ) ) ;
    public final void ruleNumExprTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:382:2: ( ( ( rule__NumExprTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__NumExprTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__NumExprTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:1: ( rule__NumExprTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:1: ( rule__NumExprTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:2: rule__NumExprTail__Group__0
            {
            pushFollow(FOLLOW_rule__NumExprTail__Group__0_in_ruleNumExprTail759);
            rule__NumExprTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getGroup()); 
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
    // $ANTLR end "ruleNumExprTail"


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:397:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:398:1: ( ruleFactor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:399:1: ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor786);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor793); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:406:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:410:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__Factor__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:1: ( rule__Factor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:1: ( rule__Factor__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor819);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:425:1: entryRuleFactorTail : ruleFactorTail EOF ;
    public final void entryRuleFactorTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:426:1: ( ruleFactorTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:427:1: ruleFactorTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailRule()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_entryRuleFactorTail846);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorTail853); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:434:1: ruleFactorTail : ( ( rule__FactorTail__Group__0 ) ) ;
    public final void ruleFactorTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:438:2: ( ( ( rule__FactorTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__FactorTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__FactorTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:1: ( rule__FactorTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:1: ( rule__FactorTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:2: rule__FactorTail__Group__0
            {
            pushFollow(FOLLOW_rule__FactorTail__Group__0_in_ruleFactorTail879);
            rule__FactorTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getGroup()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:453:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:454:1: ( ruleTerm EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:455:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm906);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm913); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:462:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:466:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:467:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:467:1: ( ( rule__Term__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:468:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:1: ( rule__Term__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm939);
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


    // $ANTLR start "entryRuleVariableAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:481:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:482:1: ( ruleVariableAssignment EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:483:1: ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment966);
            ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment973); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariableAssignment"


    // $ANTLR start "ruleVariableAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:490:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:494:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:1: ( rule__VariableAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:1: ( rule__VariableAssignment__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment999);
            rule__VariableAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getGroup()); 
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
    // $ANTLR end "ruleVariableAssignment"


    // $ANTLR start "entryRuleParenthesisExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:509:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:510:1: ( ruleParenthesisExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:511:1: ruleParenthesisExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1026);
            ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression1033); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:518:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:522:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:1: ( rule__ParenthesisExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:1: ( rule__ParenthesisExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:2: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1059);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:537:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:541:1: ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==23) ) {
                    alt1=2;
                }
                else if ( (LA1_2==EOF||(LA1_2>=12 && LA1_2<=16)||(LA1_2>=18 && LA1_2<=20)) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUM:
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:542:1: ( ruleFunctionDeclaration )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:542:1: ( ruleFunctionDeclaration )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:543:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1095);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:548:6: ( ruleVariableAssignment )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:548:6: ( ruleVariableAssignment )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:549:1: ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1112);
                    ruleVariableAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:554:6: ( ruleNumericExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:554:6: ( ruleNumericExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:555:1: ruleNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1129);
                    ruleNumericExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:565:1: rule__Body__Alternatives : ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:569:1: ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_NUM)||(LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:570:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:570:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:571:1: ( rule__Body__ExpressionsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getExpressionsAssignment_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:572:1: ( rule__Body__ExpressionsAssignment_0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:572:2: rule__Body__ExpressionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1161);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:576:6: ( ( rule__Body__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:576:6: ( ( rule__Body__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:577:1: ( rule__Body__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:578:1: ( rule__Body__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:578:2: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1179);
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


    // $ANTLR start "rule__Functor__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:587:1: rule__Functor__Alternatives : ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) );
    public final void rule__Functor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:591:1: ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:592:1: ( ruleSymbolReference )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:592:1: ( ruleSymbolReference )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:593:1: ruleSymbolReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1212);
                    ruleSymbolReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:598:6: ( ruleParenthesisExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:598:6: ( ruleParenthesisExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:599:1: ruleParenthesisExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1229);
                    ruleParenthesisExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
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
    // $ANTLR end "rule__Functor__Alternatives"


    // $ANTLR start "rule__NumExprTail__OperatorAlternatives_0_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:609:1: rule__NumExprTail__OperatorAlternatives_0_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__NumExprTail__OperatorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:613:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:614:1: ( '+' )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:614:1: ( '+' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:615:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumExprTailAccess().getOperatorPlusSignKeyword_0_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__NumExprTail__OperatorAlternatives_0_01262); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumExprTailAccess().getOperatorPlusSignKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:622:6: ( '-' )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:622:6: ( '-' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:623:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNumExprTailAccess().getOperatorHyphenMinusKeyword_0_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__NumExprTail__OperatorAlternatives_0_01282); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNumExprTailAccess().getOperatorHyphenMinusKeyword_0_0_1()); 
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
    // $ANTLR end "rule__NumExprTail__OperatorAlternatives_0_0"


    // $ANTLR start "rule__FactorTail__OperatorAlternatives_0_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:635:1: rule__FactorTail__OperatorAlternatives_0_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__FactorTail__OperatorAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:639:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:640:1: ( '*' )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:640:1: ( '*' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:641:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getOperatorAsteriskKeyword_0_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__FactorTail__OperatorAlternatives_0_01317); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorTailAccess().getOperatorAsteriskKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:648:6: ( '/' )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:648:6: ( '/' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:649:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getOperatorSolidusKeyword_0_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__FactorTail__OperatorAlternatives_0_01337); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorTailAccess().getOperatorSolidusKeyword_0_0_1()); 
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
    // $ANTLR end "rule__FactorTail__OperatorAlternatives_0_0"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:661:1: rule__Term__Alternatives : ( ( ruleLiteralExpr ) | ( ruleApply ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:665:1: ( ( ruleLiteralExpr ) | ( ruleApply ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NUM) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:666:1: ( ruleLiteralExpr )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:666:1: ( ruleLiteralExpr )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:667:1: ruleLiteralExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1371);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:672:6: ( ruleApply )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:672:6: ( ruleApply )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:673:1: ruleApply
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleApply_in_rule__Term__Alternatives1388);
                    ruleApply();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:685:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:689:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:690:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01418);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01421);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:697:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:701:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:702:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:702:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:703:1: ( rule__Program__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:704:1: ( rule__Program__ExpressionsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:704:2: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1448);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:714:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:718:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:719:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11478);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11481);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:726:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:730:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:731:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:731:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:732:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Program__Group__1__Impl1509); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:745:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:749:1: ( rule__Program__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:750:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21540);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:756:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:760:1: ( ( ( rule__Program__Group_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:761:1: ( ( rule__Program__Group_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:761:1: ( ( rule__Program__Group_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:762:1: ( rule__Program__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:763:1: ( rule__Program__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_NUM)||(LA7_0>=17 && LA7_0<=18)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:763:2: rule__Program__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1567);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:779:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:783:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:784:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01604);
            rule__Program__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01607);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:791:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:795:1: ( ( ( rule__Program__ExpressionsAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:796:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:796:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:797:1: ( rule__Program__ExpressionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:798:1: ( rule__Program__ExpressionsAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:798:2: rule__Program__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl1634);
            rule__Program__ExpressionsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:808:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:812:1: ( rule__Program__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:813:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11664);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:819:1: rule__Program__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:823:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:824:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:824:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:825:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Program__Group_2__1__Impl1692); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:842:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:846:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:847:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01727);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01730);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:854:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:858:1: ( ( 'func' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:859:1: ( 'func' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:859:1: ( 'func' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:860:1: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__FunctionDeclaration__Group__0__Impl1758); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:873:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:877:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:878:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11789);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11792);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:885:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:889:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:891:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionDeclaration__Group__1__Impl1820); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:904:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:908:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:909:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21851);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21854);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:916:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__Group_2__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:920:1: ( ( ( rule__FunctionDeclaration__Group_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:921:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:921:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:922:1: ( rule__FunctionDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:923:1: ( rule__FunctionDeclaration__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:923:2: rule__FunctionDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl1881);
                    rule__FunctionDeclaration__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:933:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:937:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:938:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31912);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31915);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:945:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:949:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:950:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:950:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:951:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__FunctionDeclaration__Group__3__Impl1943); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:964:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:968:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41974);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:975:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:979:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:980:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:980:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:981:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:982:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:982:2: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl2001);
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


    // $ANTLR start "rule__FunctionDeclaration__Group_2__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1002:1: rule__FunctionDeclaration__Group_2__0 : rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 ;
    public final void rule__FunctionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1006:1: ( rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1007:2: rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__02041);
            rule__FunctionDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__02044);
            rule__FunctionDeclaration__Group_2__1();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_2__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1014:1: rule__FunctionDeclaration__Group_2__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1018:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1019:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1019:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1020:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1021:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1021:2: rule__FunctionDeclaration__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl2071);
            rule__FunctionDeclaration__ParametersAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1031:1: rule__FunctionDeclaration__Group_2__1 : rule__FunctionDeclaration__Group_2__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1035:1: ( rule__FunctionDeclaration__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1036:2: rule__FunctionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__12101);
            rule__FunctionDeclaration__Group_2__1__Impl();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_2__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_2__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1042:1: rule__FunctionDeclaration__Group_2__1__Impl : ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1046:1: ( ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1047:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1047:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1048:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1049:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1049:2: rule__FunctionDeclaration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl2128);
            	    rule__FunctionDeclaration__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1063:1: rule__FunctionDeclaration__Group_2_1__0 : rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 ;
    public final void rule__FunctionDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1067:1: ( rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1068:2: rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__02163);
            rule__FunctionDeclaration__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__02166);
            rule__FunctionDeclaration__Group_2_1__1();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__0"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1075:1: rule__FunctionDeclaration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1079:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1080:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1080:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1081:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__FunctionDeclaration__Group_2_1__0__Impl2194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1094:1: rule__FunctionDeclaration__Group_2_1__1 : rule__FunctionDeclaration__Group_2_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1098:1: ( rule__FunctionDeclaration__Group_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1099:2: rule__FunctionDeclaration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__12225);
            rule__FunctionDeclaration__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__1"


    // $ANTLR start "rule__FunctionDeclaration__Group_2_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1105:1: rule__FunctionDeclaration__Group_2_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1109:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1110:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1110:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1111:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1112:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1112:2: rule__FunctionDeclaration__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl2252);
            rule__FunctionDeclaration__ParametersAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 
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
    // $ANTLR end "rule__FunctionDeclaration__Group_2_1__1__Impl"


    // $ANTLR start "rule__Body__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1126:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1130:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1131:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02286);
            rule__Body__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02289);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1138:1: rule__Body__Group_1__0__Impl : ( () ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1142:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1143:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1143:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1144:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getBodyAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1145:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1147:1: 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1157:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl rule__Body__Group_1__2 ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1161:1: ( rule__Body__Group_1__1__Impl rule__Body__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1162:2: rule__Body__Group_1__1__Impl rule__Body__Group_1__2
            {
            pushFollow(FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12347);
            rule__Body__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12350);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1169:1: rule__Body__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1173:1: ( ( '{' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1174:1: ( '{' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1174:1: ( '{' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1175:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Body__Group_1__1__Impl2378); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1188:1: rule__Body__Group_1__2 : rule__Body__Group_1__2__Impl rule__Body__Group_1__3 ;
    public final void rule__Body__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1192:1: ( rule__Body__Group_1__2__Impl rule__Body__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1193:2: rule__Body__Group_1__2__Impl rule__Body__Group_1__3
            {
            pushFollow(FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22409);
            rule__Body__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22412);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1200:1: rule__Body__Group_1__2__Impl : ( ( rule__Body__Group_1_2__0 )* ) ;
    public final void rule__Body__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1204:1: ( ( ( rule__Body__Group_1_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1205:1: ( ( rule__Body__Group_1_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1205:1: ( ( rule__Body__Group_1_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1206:1: ( rule__Body__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getGroup_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1207:1: ( rule__Body__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NUM)||(LA10_0>=17 && LA10_0<=18)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1207:2: rule__Body__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_1_2__0_in_rule__Body__Group_1__2__Impl2439);
            	    rule__Body__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getGroup_1_2()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1217:1: rule__Body__Group_1__3 : rule__Body__Group_1__3__Impl ;
    public final void rule__Body__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1221:1: ( rule__Body__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1222:2: rule__Body__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32470);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1228:1: rule__Body__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Body__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1232:1: ( ( '}' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1233:1: ( '}' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1233:1: ( '}' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1234:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Body__Group_1__3__Impl2498); if (state.failed) return ;
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


    // $ANTLR start "rule__Body__Group_1_2__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1255:1: rule__Body__Group_1_2__0 : rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1 ;
    public final void rule__Body__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1259:1: ( rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1260:2: rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1_2__0__Impl_in_rule__Body__Group_1_2__02537);
            rule__Body__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1_2__1_in_rule__Body__Group_1_2__02540);
            rule__Body__Group_1_2__1();

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
    // $ANTLR end "rule__Body__Group_1_2__0"


    // $ANTLR start "rule__Body__Group_1_2__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1267:1: rule__Body__Group_1_2__0__Impl : ( ( rule__Body__ExpressionsAssignment_1_2_0 ) ) ;
    public final void rule__Body__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1271:1: ( ( ( rule__Body__ExpressionsAssignment_1_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1272:1: ( ( rule__Body__ExpressionsAssignment_1_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1272:1: ( ( rule__Body__ExpressionsAssignment_1_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1273:1: ( rule__Body__ExpressionsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1274:1: ( rule__Body__ExpressionsAssignment_1_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1274:2: rule__Body__ExpressionsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_1_2_0_in_rule__Body__Group_1_2__0__Impl2567);
            rule__Body__ExpressionsAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2_0()); 
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
    // $ANTLR end "rule__Body__Group_1_2__0__Impl"


    // $ANTLR start "rule__Body__Group_1_2__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1284:1: rule__Body__Group_1_2__1 : rule__Body__Group_1_2__1__Impl ;
    public final void rule__Body__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1288:1: ( rule__Body__Group_1_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1289:2: rule__Body__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1_2__1__Impl_in_rule__Body__Group_1_2__12597);
            rule__Body__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Body__Group_1_2__1"


    // $ANTLR start "rule__Body__Group_1_2__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1295:1: rule__Body__Group_1_2__1__Impl : ( ';' ) ;
    public final void rule__Body__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1299:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1300:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1300:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1301:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Body__Group_1_2__1__Impl2625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1()); 
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
    // $ANTLR end "rule__Body__Group_1_2__1__Impl"


    // $ANTLR start "rule__Apply__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1318:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1322:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1323:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02660);
            rule__Apply__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02663);
            rule__Apply__Group__1();

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
    // $ANTLR end "rule__Apply__Group__0"


    // $ANTLR start "rule__Apply__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1330:1: rule__Apply__Group__0__Impl : ( ruleFunctor ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1334:1: ( ( ruleFunctor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( ruleFunctor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( ruleFunctor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:1: ruleFunctor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl2690);
            ruleFunctor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
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
    // $ANTLR end "rule__Apply__Group__0__Impl"


    // $ANTLR start "rule__Apply__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1347:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1351:1: ( rule__Apply__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1352:2: rule__Apply__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12719);
            rule__Apply__Group__1__Impl();

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
    // $ANTLR end "rule__Apply__Group__1"


    // $ANTLR start "rule__Apply__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1358:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__Group_1__0 )? ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1362:1: ( ( ( rule__Apply__Group_1__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ( ( rule__Apply__Group_1__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ( ( rule__Apply__Group_1__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1364:1: ( rule__Apply__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:1: ( rule__Apply__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:2: rule__Apply__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl2746);
                    rule__Apply__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Apply__Group__1__Impl"


    // $ANTLR start "rule__Apply__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1379:1: rule__Apply__Group_1__0 : rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 ;
    public final void rule__Apply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1383:1: ( rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1384:2: rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__02781);
            rule__Apply__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__02784);
            rule__Apply__Group_1__1();

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
    // $ANTLR end "rule__Apply__Group_1__0"


    // $ANTLR start "rule__Apply__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1391:1: rule__Apply__Group_1__0__Impl : ( () ) ;
    public final void rule__Apply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1395:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1396:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1396:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1398:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1400:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply__Group_1__0__Impl"


    // $ANTLR start "rule__Apply__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1410:1: rule__Apply__Group_1__1 : rule__Apply__Group_1__1__Impl ;
    public final void rule__Apply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1414:1: ( rule__Apply__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1415:2: rule__Apply__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__12842);
            rule__Apply__Group_1__1__Impl();

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
    // $ANTLR end "rule__Apply__Group_1__1"


    // $ANTLR start "rule__Apply__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1421:1: rule__Apply__Group_1__1__Impl : ( ( rule__Apply__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__Apply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1425:1: ( ( ( rule__Apply__ArgumentsAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1426:1: ( ( rule__Apply__ArgumentsAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1426:1: ( ( rule__Apply__ArgumentsAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1427:1: ( rule__Apply__ArgumentsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( rule__Apply__ArgumentsAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:2: rule__Apply__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_1_in_rule__Apply__Group_1__1__Impl2869);
            rule__Apply__ArgumentsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_1()); 
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
    // $ANTLR end "rule__Apply__Group_1__1__Impl"


    // $ANTLR start "rule__ApplyTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1442:1: rule__ApplyTail__Group__0 : rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1 ;
    public final void rule__ApplyTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1446:1: ( rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1447:2: rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__0__Impl_in_rule__ApplyTail__Group__02903);
            rule__ApplyTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__1_in_rule__ApplyTail__Group__02906);
            rule__ApplyTail__Group__1();

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
    // $ANTLR end "rule__ApplyTail__Group__0"


    // $ANTLR start "rule__ApplyTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1454:1: rule__ApplyTail__Group__0__Impl : ( () ) ;
    public final void rule__ApplyTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1460:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getApplyTailAction_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1461:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1463:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getApplyTailAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplyTail__Group__0__Impl"


    // $ANTLR start "rule__ApplyTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1473:1: rule__ApplyTail__Group__1 : rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2 ;
    public final void rule__ApplyTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1477:1: ( rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1478:2: rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__1__Impl_in_rule__ApplyTail__Group__12964);
            rule__ApplyTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__2_in_rule__ApplyTail__Group__12967);
            rule__ApplyTail__Group__2();

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
    // $ANTLR end "rule__ApplyTail__Group__1"


    // $ANTLR start "rule__ApplyTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1485:1: rule__ApplyTail__Group__1__Impl : ( '(' ) ;
    public final void rule__ApplyTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1489:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1490:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1490:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1491:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,18,FOLLOW_18_in_rule__ApplyTail__Group__1__Impl2995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1()); 
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
    // $ANTLR end "rule__ApplyTail__Group__1__Impl"


    // $ANTLR start "rule__ApplyTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1504:1: rule__ApplyTail__Group__2 : rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3 ;
    public final void rule__ApplyTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1508:1: ( rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1509:2: rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__2__Impl_in_rule__ApplyTail__Group__23026);
            rule__ApplyTail__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__3_in_rule__ApplyTail__Group__23029);
            rule__ApplyTail__Group__3();

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
    // $ANTLR end "rule__ApplyTail__Group__2"


    // $ANTLR start "rule__ApplyTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1516:1: rule__ApplyTail__Group__2__Impl : ( ( rule__ApplyTail__Group_2__0 )? ) ;
    public final void rule__ApplyTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:1: ( ( ( rule__ApplyTail__Group_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1521:1: ( ( rule__ApplyTail__Group_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1521:1: ( ( rule__ApplyTail__Group_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1522:1: ( rule__ApplyTail__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1523:1: ( rule__ApplyTail__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_NUM)||(LA12_0>=17 && LA12_0<=18)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1523:2: rule__ApplyTail__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ApplyTail__Group_2__0_in_rule__ApplyTail__Group__2__Impl3056);
                    rule__ApplyTail__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ApplyTail__Group__2__Impl"


    // $ANTLR start "rule__ApplyTail__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1533:1: rule__ApplyTail__Group__3 : rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4 ;
    public final void rule__ApplyTail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1537:1: ( rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1538:2: rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__3__Impl_in_rule__ApplyTail__Group__33087);
            rule__ApplyTail__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__4_in_rule__ApplyTail__Group__33090);
            rule__ApplyTail__Group__4();

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
    // $ANTLR end "rule__ApplyTail__Group__3"


    // $ANTLR start "rule__ApplyTail__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1545:1: rule__ApplyTail__Group__3__Impl : ( ')' ) ;
    public final void rule__ApplyTail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1549:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1550:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1550:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1551:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__ApplyTail__Group__3__Impl3118); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3()); 
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
    // $ANTLR end "rule__ApplyTail__Group__3__Impl"


    // $ANTLR start "rule__ApplyTail__Group__4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1564:1: rule__ApplyTail__Group__4 : rule__ApplyTail__Group__4__Impl ;
    public final void rule__ApplyTail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1568:1: ( rule__ApplyTail__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1569:2: rule__ApplyTail__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__4__Impl_in_rule__ApplyTail__Group__43149);
            rule__ApplyTail__Group__4__Impl();

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
    // $ANTLR end "rule__ApplyTail__Group__4"


    // $ANTLR start "rule__ApplyTail__Group__4__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1575:1: rule__ApplyTail__Group__4__Impl : ( ( rule__ApplyTail__NextCallAssignment_4 )? ) ;
    public final void rule__ApplyTail__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1579:1: ( ( ( rule__ApplyTail__NextCallAssignment_4 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1580:1: ( ( rule__ApplyTail__NextCallAssignment_4 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1580:1: ( ( rule__ApplyTail__NextCallAssignment_4 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1581:1: ( rule__ApplyTail__NextCallAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getNextCallAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1582:1: ( rule__ApplyTail__NextCallAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1582:2: rule__ApplyTail__NextCallAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ApplyTail__NextCallAssignment_4_in_rule__ApplyTail__Group__4__Impl3176);
                    rule__ApplyTail__NextCallAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getNextCallAssignment_4()); 
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
    // $ANTLR end "rule__ApplyTail__Group__4__Impl"


    // $ANTLR start "rule__ApplyTail__Group_2__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1602:1: rule__ApplyTail__Group_2__0 : rule__ApplyTail__Group_2__0__Impl rule__ApplyTail__Group_2__1 ;
    public final void rule__ApplyTail__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1606:1: ( rule__ApplyTail__Group_2__0__Impl rule__ApplyTail__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1607:2: rule__ApplyTail__Group_2__0__Impl rule__ApplyTail__Group_2__1
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group_2__0__Impl_in_rule__ApplyTail__Group_2__03217);
            rule__ApplyTail__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group_2__1_in_rule__ApplyTail__Group_2__03220);
            rule__ApplyTail__Group_2__1();

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
    // $ANTLR end "rule__ApplyTail__Group_2__0"


    // $ANTLR start "rule__ApplyTail__Group_2__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1614:1: rule__ApplyTail__Group_2__0__Impl : ( ( rule__ApplyTail__ArgumentsAssignment_2_0 ) ) ;
    public final void rule__ApplyTail__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1618:1: ( ( ( rule__ApplyTail__ArgumentsAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1619:1: ( ( rule__ApplyTail__ArgumentsAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1619:1: ( ( rule__ApplyTail__ArgumentsAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1620:1: ( rule__ApplyTail__ArgumentsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgumentsAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1621:1: ( rule__ApplyTail__ArgumentsAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1621:2: rule__ApplyTail__ArgumentsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ApplyTail__ArgumentsAssignment_2_0_in_rule__ApplyTail__Group_2__0__Impl3247);
            rule__ApplyTail__ArgumentsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgumentsAssignment_2_0()); 
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
    // $ANTLR end "rule__ApplyTail__Group_2__0__Impl"


    // $ANTLR start "rule__ApplyTail__Group_2__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1631:1: rule__ApplyTail__Group_2__1 : rule__ApplyTail__Group_2__1__Impl ;
    public final void rule__ApplyTail__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1635:1: ( rule__ApplyTail__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1636:2: rule__ApplyTail__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group_2__1__Impl_in_rule__ApplyTail__Group_2__13277);
            rule__ApplyTail__Group_2__1__Impl();

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
    // $ANTLR end "rule__ApplyTail__Group_2__1"


    // $ANTLR start "rule__ApplyTail__Group_2__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1642:1: rule__ApplyTail__Group_2__1__Impl : ( ( rule__ApplyTail__Group_2_1__0 )* ) ;
    public final void rule__ApplyTail__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1646:1: ( ( ( rule__ApplyTail__Group_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1647:1: ( ( rule__ApplyTail__Group_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1647:1: ( ( rule__ApplyTail__Group_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1648:1: ( rule__ApplyTail__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getGroup_2_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1649:1: ( rule__ApplyTail__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1649:2: rule__ApplyTail__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ApplyTail__Group_2_1__0_in_rule__ApplyTail__Group_2__1__Impl3304);
            	    rule__ApplyTail__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__ApplyTail__Group_2__1__Impl"


    // $ANTLR start "rule__ApplyTail__Group_2_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1663:1: rule__ApplyTail__Group_2_1__0 : rule__ApplyTail__Group_2_1__0__Impl rule__ApplyTail__Group_2_1__1 ;
    public final void rule__ApplyTail__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1667:1: ( rule__ApplyTail__Group_2_1__0__Impl rule__ApplyTail__Group_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1668:2: rule__ApplyTail__Group_2_1__0__Impl rule__ApplyTail__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group_2_1__0__Impl_in_rule__ApplyTail__Group_2_1__03339);
            rule__ApplyTail__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group_2_1__1_in_rule__ApplyTail__Group_2_1__03342);
            rule__ApplyTail__Group_2_1__1();

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
    // $ANTLR end "rule__ApplyTail__Group_2_1__0"


    // $ANTLR start "rule__ApplyTail__Group_2_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1675:1: rule__ApplyTail__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ApplyTail__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1679:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1680:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1680:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1681:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ApplyTail__Group_2_1__0__Impl3370); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getCommaKeyword_2_1_0()); 
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
    // $ANTLR end "rule__ApplyTail__Group_2_1__0__Impl"


    // $ANTLR start "rule__ApplyTail__Group_2_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1694:1: rule__ApplyTail__Group_2_1__1 : rule__ApplyTail__Group_2_1__1__Impl ;
    public final void rule__ApplyTail__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1698:1: ( rule__ApplyTail__Group_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1699:2: rule__ApplyTail__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group_2_1__1__Impl_in_rule__ApplyTail__Group_2_1__13401);
            rule__ApplyTail__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ApplyTail__Group_2_1__1"


    // $ANTLR start "rule__ApplyTail__Group_2_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1705:1: rule__ApplyTail__Group_2_1__1__Impl : ( ( rule__ApplyTail__ArgumentsAssignment_2_1_1 ) ) ;
    public final void rule__ApplyTail__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1709:1: ( ( ( rule__ApplyTail__ArgumentsAssignment_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1710:1: ( ( rule__ApplyTail__ArgumentsAssignment_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1710:1: ( ( rule__ApplyTail__ArgumentsAssignment_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1711:1: ( rule__ApplyTail__ArgumentsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgumentsAssignment_2_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1712:1: ( rule__ApplyTail__ArgumentsAssignment_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1712:2: rule__ApplyTail__ArgumentsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ApplyTail__ArgumentsAssignment_2_1_1_in_rule__ApplyTail__Group_2_1__1__Impl3428);
            rule__ApplyTail__ArgumentsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgumentsAssignment_2_1_1()); 
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
    // $ANTLR end "rule__ApplyTail__Group_2_1__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1726:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1730:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1731:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03462);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03465);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1738:1: rule__NumericExpression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1742:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1743:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1743:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1744:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl3492);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1755:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1759:1: ( rule__NumericExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1760:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13521);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1766:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__Group_1__0 )? ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1770:1: ( ( ( rule__NumericExpression__Group_1__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1771:1: ( ( rule__NumericExpression__Group_1__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1771:1: ( ( rule__NumericExpression__Group_1__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1772:1: ( rule__NumericExpression__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1773:1: ( rule__NumericExpression__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=12 && LA15_0<=13)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1773:2: rule__NumericExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl3548);
                    rule__NumericExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getGroup_1()); 
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


    // $ANTLR start "rule__NumericExpression__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1787:1: rule__NumericExpression__Group_1__0 : rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 ;
    public final void rule__NumericExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1791:1: ( rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1792:2: rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__03583);
            rule__NumericExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__03586);
            rule__NumericExpression__Group_1__1();

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
    // $ANTLR end "rule__NumericExpression__Group_1__0"


    // $ANTLR start "rule__NumericExpression__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1799:1: rule__NumericExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NumericExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1803:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1805:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1806:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1808:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getNumericExpressionFactorAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NumericExpression__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1818:1: rule__NumericExpression__Group_1__1 : rule__NumericExpression__Group_1__1__Impl ;
    public final void rule__NumericExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1822:1: ( rule__NumericExpression__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1823:2: rule__NumericExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__13644);
            rule__NumericExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__NumericExpression__Group_1__1"


    // $ANTLR start "rule__NumericExpression__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1829:1: rule__NumericExpression__Group_1__1__Impl : ( ( rule__NumericExpression__NumExprTailAssignment_1_1 ) ) ;
    public final void rule__NumericExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1833:1: ( ( ( rule__NumericExpression__NumExprTailAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1834:1: ( ( rule__NumericExpression__NumExprTailAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1834:1: ( ( rule__NumericExpression__NumExprTailAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1835:1: ( rule__NumericExpression__NumExprTailAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getNumExprTailAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1836:1: ( rule__NumericExpression__NumExprTailAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1836:2: rule__NumericExpression__NumExprTailAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumericExpression__NumExprTailAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl3671);
            rule__NumericExpression__NumExprTailAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getNumExprTailAssignment_1_1()); 
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
    // $ANTLR end "rule__NumericExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NumExprTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1850:1: rule__NumExprTail__Group__0 : rule__NumExprTail__Group__0__Impl rule__NumExprTail__Group__1 ;
    public final void rule__NumExprTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1854:1: ( rule__NumExprTail__Group__0__Impl rule__NumExprTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1855:2: rule__NumExprTail__Group__0__Impl rule__NumExprTail__Group__1
            {
            pushFollow(FOLLOW_rule__NumExprTail__Group__0__Impl_in_rule__NumExprTail__Group__03705);
            rule__NumExprTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumExprTail__Group__1_in_rule__NumExprTail__Group__03708);
            rule__NumExprTail__Group__1();

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
    // $ANTLR end "rule__NumExprTail__Group__0"


    // $ANTLR start "rule__NumExprTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1862:1: rule__NumExprTail__Group__0__Impl : ( ( rule__NumExprTail__OperatorAssignment_0 ) ) ;
    public final void rule__NumExprTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1866:1: ( ( ( rule__NumExprTail__OperatorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1867:1: ( ( rule__NumExprTail__OperatorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1867:1: ( ( rule__NumExprTail__OperatorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:1: ( rule__NumExprTail__OperatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getOperatorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:1: ( rule__NumExprTail__OperatorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:2: rule__NumExprTail__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__NumExprTail__OperatorAssignment_0_in_rule__NumExprTail__Group__0__Impl3735);
            rule__NumExprTail__OperatorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getOperatorAssignment_0()); 
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
    // $ANTLR end "rule__NumExprTail__Group__0__Impl"


    // $ANTLR start "rule__NumExprTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1879:1: rule__NumExprTail__Group__1 : rule__NumExprTail__Group__1__Impl rule__NumExprTail__Group__2 ;
    public final void rule__NumExprTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1883:1: ( rule__NumExprTail__Group__1__Impl rule__NumExprTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1884:2: rule__NumExprTail__Group__1__Impl rule__NumExprTail__Group__2
            {
            pushFollow(FOLLOW_rule__NumExprTail__Group__1__Impl_in_rule__NumExprTail__Group__13765);
            rule__NumExprTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumExprTail__Group__2_in_rule__NumExprTail__Group__13768);
            rule__NumExprTail__Group__2();

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
    // $ANTLR end "rule__NumExprTail__Group__1"


    // $ANTLR start "rule__NumExprTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1891:1: rule__NumExprTail__Group__1__Impl : ( ( rule__NumExprTail__FactorAssignment_1 ) ) ;
    public final void rule__NumExprTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1895:1: ( ( ( rule__NumExprTail__FactorAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( ( rule__NumExprTail__FactorAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( ( rule__NumExprTail__FactorAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1897:1: ( rule__NumExprTail__FactorAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getFactorAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:1: ( rule__NumExprTail__FactorAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:2: rule__NumExprTail__FactorAssignment_1
            {
            pushFollow(FOLLOW_rule__NumExprTail__FactorAssignment_1_in_rule__NumExprTail__Group__1__Impl3795);
            rule__NumExprTail__FactorAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getFactorAssignment_1()); 
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
    // $ANTLR end "rule__NumExprTail__Group__1__Impl"


    // $ANTLR start "rule__NumExprTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1908:1: rule__NumExprTail__Group__2 : rule__NumExprTail__Group__2__Impl ;
    public final void rule__NumExprTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1912:1: ( rule__NumExprTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1913:2: rule__NumExprTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NumExprTail__Group__2__Impl_in_rule__NumExprTail__Group__23825);
            rule__NumExprTail__Group__2__Impl();

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
    // $ANTLR end "rule__NumExprTail__Group__2"


    // $ANTLR start "rule__NumExprTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1919:1: rule__NumExprTail__Group__2__Impl : ( ( rule__NumExprTail__ExprTailAssignment_2 )? ) ;
    public final void rule__NumExprTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1923:1: ( ( ( rule__NumExprTail__ExprTailAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1924:1: ( ( rule__NumExprTail__ExprTailAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1924:1: ( ( rule__NumExprTail__ExprTailAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1925:1: ( rule__NumExprTail__ExprTailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getExprTailAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1926:1: ( rule__NumExprTail__ExprTailAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=13)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1926:2: rule__NumExprTail__ExprTailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__NumExprTail__ExprTailAssignment_2_in_rule__NumExprTail__Group__2__Impl3852);
                    rule__NumExprTail__ExprTailAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getExprTailAssignment_2()); 
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
    // $ANTLR end "rule__NumExprTail__Group__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1942:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1946:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1947:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03889);
            rule__Factor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03892);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1954:1: rule__Factor__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1958:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1960:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl3919);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1971:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1975:1: ( rule__Factor__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1976:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13948);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1982:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1986:1: ( ( ( rule__Factor__Group_1__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1987:1: ( ( rule__Factor__Group_1__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1987:1: ( ( rule__Factor__Group_1__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1988:1: ( rule__Factor__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1989:1: ( rule__Factor__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=14 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1989:2: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl3975);
                    rule__Factor__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getGroup_1()); 
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


    // $ANTLR start "rule__Factor__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2003:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2007:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2008:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__04010);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__04013);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2015:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2019:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2020:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2020:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2021:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTermAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2022:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2024:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorTermAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2034:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2038:1: ( rule__Factor__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2039:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__14071);
            rule__Factor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2045:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__FactorTailAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2049:1: ( ( ( rule__Factor__FactorTailAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2050:1: ( ( rule__Factor__FactorTailAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2050:1: ( ( rule__Factor__FactorTailAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:1: ( rule__Factor__FactorTailAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2052:1: ( rule__Factor__FactorTailAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2052:2: rule__Factor__FactorTailAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Factor__FactorTailAssignment_1_1_in_rule__Factor__Group_1__1__Impl4098);
            rule__Factor__FactorTailAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorTailAssignment_1_1()); 
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
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__FactorTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2066:1: rule__FactorTail__Group__0 : rule__FactorTail__Group__0__Impl rule__FactorTail__Group__1 ;
    public final void rule__FactorTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2070:1: ( rule__FactorTail__Group__0__Impl rule__FactorTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2071:2: rule__FactorTail__Group__0__Impl rule__FactorTail__Group__1
            {
            pushFollow(FOLLOW_rule__FactorTail__Group__0__Impl_in_rule__FactorTail__Group__04132);
            rule__FactorTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group__1_in_rule__FactorTail__Group__04135);
            rule__FactorTail__Group__1();

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
    // $ANTLR end "rule__FactorTail__Group__0"


    // $ANTLR start "rule__FactorTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2078:1: rule__FactorTail__Group__0__Impl : ( ( rule__FactorTail__OperatorAssignment_0 ) ) ;
    public final void rule__FactorTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2082:1: ( ( ( rule__FactorTail__OperatorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2083:1: ( ( rule__FactorTail__OperatorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2083:1: ( ( rule__FactorTail__OperatorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2084:1: ( rule__FactorTail__OperatorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getOperatorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2085:1: ( rule__FactorTail__OperatorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2085:2: rule__FactorTail__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__FactorTail__OperatorAssignment_0_in_rule__FactorTail__Group__0__Impl4162);
            rule__FactorTail__OperatorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getOperatorAssignment_0()); 
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
    // $ANTLR end "rule__FactorTail__Group__0__Impl"


    // $ANTLR start "rule__FactorTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2095:1: rule__FactorTail__Group__1 : rule__FactorTail__Group__1__Impl rule__FactorTail__Group__2 ;
    public final void rule__FactorTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2099:1: ( rule__FactorTail__Group__1__Impl rule__FactorTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2100:2: rule__FactorTail__Group__1__Impl rule__FactorTail__Group__2
            {
            pushFollow(FOLLOW_rule__FactorTail__Group__1__Impl_in_rule__FactorTail__Group__14192);
            rule__FactorTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group__2_in_rule__FactorTail__Group__14195);
            rule__FactorTail__Group__2();

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
    // $ANTLR end "rule__FactorTail__Group__1"


    // $ANTLR start "rule__FactorTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2107:1: rule__FactorTail__Group__1__Impl : ( ( rule__FactorTail__TermAssignment_1 ) ) ;
    public final void rule__FactorTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2111:1: ( ( ( rule__FactorTail__TermAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2112:1: ( ( rule__FactorTail__TermAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2112:1: ( ( rule__FactorTail__TermAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2113:1: ( rule__FactorTail__TermAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2114:1: ( rule__FactorTail__TermAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2114:2: rule__FactorTail__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__FactorTail__TermAssignment_1_in_rule__FactorTail__Group__1__Impl4222);
            rule__FactorTail__TermAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermAssignment_1()); 
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
    // $ANTLR end "rule__FactorTail__Group__1__Impl"


    // $ANTLR start "rule__FactorTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2124:1: rule__FactorTail__Group__2 : rule__FactorTail__Group__2__Impl ;
    public final void rule__FactorTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2128:1: ( rule__FactorTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2129:2: rule__FactorTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FactorTail__Group__2__Impl_in_rule__FactorTail__Group__24252);
            rule__FactorTail__Group__2__Impl();

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
    // $ANTLR end "rule__FactorTail__Group__2"


    // $ANTLR start "rule__FactorTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2135:1: rule__FactorTail__Group__2__Impl : ( ( rule__FactorTail__FactorTailAssignment_2 )? ) ;
    public final void rule__FactorTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2139:1: ( ( ( rule__FactorTail__FactorTailAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2140:1: ( ( rule__FactorTail__FactorTailAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2140:1: ( ( rule__FactorTail__FactorTailAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2141:1: ( rule__FactorTail__FactorTailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2142:1: ( rule__FactorTail__FactorTailAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=14 && LA18_0<=15)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2142:2: rule__FactorTail__FactorTailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FactorTail__FactorTailAssignment_2_in_rule__FactorTail__Group__2__Impl4279);
                    rule__FactorTail__FactorTailAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailAssignment_2()); 
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
    // $ANTLR end "rule__FactorTail__Group__2__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2158:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2162:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2163:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04316);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04319);
            rule__VariableAssignment__Group__1();

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
    // $ANTLR end "rule__VariableAssignment__Group__0"


    // $ANTLR start "rule__VariableAssignment__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2170:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__IdAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2174:1: ( ( ( rule__VariableAssignment__IdAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2175:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2175:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2176:1: ( rule__VariableAssignment__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2177:1: ( rule__VariableAssignment__IdAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2177:2: rule__VariableAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl4346);
            rule__VariableAssignment__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
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
    // $ANTLR end "rule__VariableAssignment__Group__0__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2187:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2191:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2192:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14376);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14379);
            rule__VariableAssignment__Group__2();

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
    // $ANTLR end "rule__VariableAssignment__Group__1"


    // $ANTLR start "rule__VariableAssignment__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2199:1: rule__VariableAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2203:1: ( ( '=' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2204:1: ( '=' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2204:1: ( '=' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2205:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__VariableAssignment__Group__1__Impl4407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__VariableAssignment__Group__1__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2218:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2222:1: ( rule__VariableAssignment__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2223:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24438);
            rule__VariableAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__VariableAssignment__Group__2"


    // $ANTLR start "rule__VariableAssignment__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2229:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2233:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2234:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2234:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2235:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2236:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2236:2: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl4465);
            rule__VariableAssignment__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
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
    // $ANTLR end "rule__VariableAssignment__Group__2__Impl"


    // $ANTLR start "rule__ParenthesisExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2252:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2256:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2257:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__04501);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__04504);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2264:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2268:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2269:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2269:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2270:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__ParenthesisExpression__Group__0__Impl4532); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2283:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2287:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2288:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14563);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14566);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2295:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2299:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2300:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2300:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2301:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4593);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2312:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2316:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2317:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24622);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2323:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2327:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2328:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2328:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2329:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__ParenthesisExpression__Group__2__Impl4650); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2349:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2353:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2354:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2354:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2355:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04692);
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


    // $ANTLR start "rule__Program__ExpressionsAssignment_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2364:1: rule__Program__ExpressionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2368:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2369:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2369:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2370:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_04723);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__Program__ExpressionsAssignment_2_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2379:1: rule__FunctionDeclaration__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2383:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2384:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2384:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2385:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_04754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_2_0"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2394:1: rule__FunctionDeclaration__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2398:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2399:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2399:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2400:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_14785); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__FunctionDeclaration__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__FunctionDeclaration__BodyAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2409:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleBody ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2413:1: ( ( ruleBody ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2414:1: ( ruleBody )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2414:1: ( ruleBody )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2415:1: ruleBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44816);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2424:1: rule__Body__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2428:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2430:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04847);
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


    // $ANTLR start "rule__Body__ExpressionsAssignment_1_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2439:1: rule__Body__ExpressionsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2443:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2445:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_2_04878);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
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
    // $ANTLR end "rule__Body__ExpressionsAssignment_1_2_0"


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2454:1: rule__Apply__ArgumentsAssignment_1_1 : ( ruleApplyTail ) ;
    public final void rule__Apply__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2458:1: ( ( ruleApplyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2459:1: ( ruleApplyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2459:1: ( ruleApplyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2460:1: ruleApplyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_rule__Apply__ArgumentsAssignment_1_14909);
            ruleApplyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__ApplyTail__ArgumentsAssignment_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2469:1: rule__ApplyTail__ArgumentsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ApplyTail__ArgumentsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2473:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2474:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2474:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2475:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ApplyTail__ArgumentsAssignment_2_04940);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ApplyTail__ArgumentsAssignment_2_0"


    // $ANTLR start "rule__ApplyTail__ArgumentsAssignment_2_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2484:1: rule__ApplyTail__ArgumentsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ApplyTail__ArgumentsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2488:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2489:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2489:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2490:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ApplyTail__ArgumentsAssignment_2_1_14971);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgumentsExpressionParserRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__ApplyTail__ArgumentsAssignment_2_1_1"


    // $ANTLR start "rule__ApplyTail__NextCallAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2499:1: rule__ApplyTail__NextCallAssignment_4 : ( ruleApplyTail ) ;
    public final void rule__ApplyTail__NextCallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2503:1: ( ( ruleApplyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2504:1: ( ruleApplyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2504:1: ( ruleApplyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2505:1: ruleApplyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_rule__ApplyTail__NextCallAssignment_45002);
            ruleApplyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__ApplyTail__NextCallAssignment_4"


    // $ANTLR start "rule__LiteralExpr__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2514:1: rule__LiteralExpr__ValueAssignment : ( RULE_NUM ) ;
    public final void rule__LiteralExpr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2518:1: ( ( RULE_NUM ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2519:1: ( RULE_NUM )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2519:1: ( RULE_NUM )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2520:1: RULE_NUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
            }
            match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment5033); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2529:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2533:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2534:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2534:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2535:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5064); if (state.failed) return ;
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


    // $ANTLR start "rule__NumericExpression__NumExprTailAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2544:1: rule__NumericExpression__NumExprTailAssignment_1_1 : ( ruleNumExprTail ) ;
    public final void rule__NumericExpression__NumExprTailAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2548:1: ( ( ruleNumExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2549:1: ( ruleNumExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2549:1: ( ruleNumExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2550:1: ruleNumExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getNumExprTailNumExprTailParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleNumExprTail_in_rule__NumericExpression__NumExprTailAssignment_1_15095);
            ruleNumExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getNumExprTailNumExprTailParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__NumericExpression__NumExprTailAssignment_1_1"


    // $ANTLR start "rule__NumExprTail__OperatorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2559:1: rule__NumExprTail__OperatorAssignment_0 : ( ( rule__NumExprTail__OperatorAlternatives_0_0 ) ) ;
    public final void rule__NumExprTail__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2563:1: ( ( ( rule__NumExprTail__OperatorAlternatives_0_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2564:1: ( ( rule__NumExprTail__OperatorAlternatives_0_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2564:1: ( ( rule__NumExprTail__OperatorAlternatives_0_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2565:1: ( rule__NumExprTail__OperatorAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getOperatorAlternatives_0_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2566:1: ( rule__NumExprTail__OperatorAlternatives_0_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2566:2: rule__NumExprTail__OperatorAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__NumExprTail__OperatorAlternatives_0_0_in_rule__NumExprTail__OperatorAssignment_05126);
            rule__NumExprTail__OperatorAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getOperatorAlternatives_0_0()); 
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
    // $ANTLR end "rule__NumExprTail__OperatorAssignment_0"


    // $ANTLR start "rule__NumExprTail__FactorAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2575:1: rule__NumExprTail__FactorAssignment_1 : ( ruleFactor ) ;
    public final void rule__NumExprTail__FactorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2579:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2580:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2580:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2581:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getFactorFactorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumExprTail__FactorAssignment_15159);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getFactorFactorParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NumExprTail__FactorAssignment_1"


    // $ANTLR start "rule__NumExprTail__ExprTailAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2590:1: rule__NumExprTail__ExprTailAssignment_2 : ( ruleNumExprTail ) ;
    public final void rule__NumExprTail__ExprTailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2594:1: ( ( ruleNumExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2595:1: ( ruleNumExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2595:1: ( ruleNumExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2596:1: ruleNumExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumExprTailAccess().getExprTailNumExprTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleNumExprTail_in_rule__NumExprTail__ExprTailAssignment_25190);
            ruleNumExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumExprTailAccess().getExprTailNumExprTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__NumExprTail__ExprTailAssignment_2"


    // $ANTLR start "rule__Factor__FactorTailAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2605:1: rule__Factor__FactorTailAssignment_1_1 : ( ruleFactorTail ) ;
    public final void rule__Factor__FactorTailAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2609:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2610:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2610:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2611:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_1_15221);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Factor__FactorTailAssignment_1_1"


    // $ANTLR start "rule__FactorTail__OperatorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2620:1: rule__FactorTail__OperatorAssignment_0 : ( ( rule__FactorTail__OperatorAlternatives_0_0 ) ) ;
    public final void rule__FactorTail__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2624:1: ( ( ( rule__FactorTail__OperatorAlternatives_0_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2625:1: ( ( rule__FactorTail__OperatorAlternatives_0_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2625:1: ( ( rule__FactorTail__OperatorAlternatives_0_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2626:1: ( rule__FactorTail__OperatorAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getOperatorAlternatives_0_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:1: ( rule__FactorTail__OperatorAlternatives_0_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:2: rule__FactorTail__OperatorAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__FactorTail__OperatorAlternatives_0_0_in_rule__FactorTail__OperatorAssignment_05252);
            rule__FactorTail__OperatorAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getOperatorAlternatives_0_0()); 
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
    // $ANTLR end "rule__FactorTail__OperatorAssignment_0"


    // $ANTLR start "rule__FactorTail__TermAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2636:1: rule__FactorTail__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__FactorTail__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2640:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2641:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2641:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2642:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_15285);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FactorTail__TermAssignment_1"


    // $ANTLR start "rule__FactorTail__FactorTailAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2651:1: rule__FactorTail__FactorTailAssignment_2 : ( ruleFactorTail ) ;
    public final void rule__FactorTail__FactorTailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2655:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2656:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2656:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2657:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_25316);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__FactorTail__FactorTailAssignment_2"


    // $ANTLR start "rule__VariableAssignment__IdAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2666:1: rule__VariableAssignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2670:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2671:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2671:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2672:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_05347); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__VariableAssignment__IdAssignment_0"


    // $ANTLR start "rule__VariableAssignment__ExpressionAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2681:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2685:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2686:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2686:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2687:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_25378);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VariableAssignment__ExpressionAssignment_2"

    // Delegated rules


 

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
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0_in_ruleApply399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functor__Alternatives_in_ruleFunctor459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_entryRuleApplyTail486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyTail493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__0_in_ruleApplyTail519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_entryRuleNumExprTail726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumExprTail733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__0_in_ruleNumExprTail759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_entryRuleFactorTail846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorTail853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__0_in_ruleFactorTail879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NumExprTail__OperatorAlternatives_0_01262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NumExprTail__OperatorAlternatives_0_01282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FactorTail__OperatorAlternatives_0_01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FactorTail__OperatorAlternatives_0_01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Term__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01418 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11478 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group__1__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1567 = new BitSet(new long[]{0x0000000000060032L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Program__Group_2__1__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01727 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FunctionDeclaration__Group__0__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11789 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionDeclaration__Group__1__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21851 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31912 = new BitSet(new long[]{0x0000000000260030L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FunctionDeclaration__Group__3__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__02041 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__02044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__12101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl2128 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__02163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__02166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FunctionDeclaration__Group_2_1__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02286 = new BitSet(new long[]{0x0000000000260030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12347 = new BitSet(new long[]{0x0000000000460030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Body__Group_1__1__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22409 = new BitSet(new long[]{0x0000000000460030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__0_in_rule__Body__Group_1__2__Impl2439 = new BitSet(new long[]{0x0000000000060032L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Body__Group_1__3__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__0__Impl_in_rule__Body__Group_1_2__02537 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__1_in_rule__Body__Group_1_2__02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_1_2_0_in_rule__Body__Group_1_2__0__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__1__Impl_in_rule__Body__Group_1_2__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group_1_2__1__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02660 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__02781 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__12842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_1_in_rule__Apply__Group_1__1__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__0__Impl_in_rule__ApplyTail__Group__02903 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__1_in_rule__ApplyTail__Group__02906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__1__Impl_in_rule__ApplyTail__Group__12964 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__2_in_rule__ApplyTail__Group__12967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ApplyTail__Group__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__2__Impl_in_rule__ApplyTail__Group__23026 = new BitSet(new long[]{0x00000000000E0030L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__3_in_rule__ApplyTail__Group__23029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2__0_in_rule__ApplyTail__Group__2__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__3__Impl_in_rule__ApplyTail__Group__33087 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__4_in_rule__ApplyTail__Group__33090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ApplyTail__Group__3__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__4__Impl_in_rule__ApplyTail__Group__43149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__NextCallAssignment_4_in_rule__ApplyTail__Group__4__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2__0__Impl_in_rule__ApplyTail__Group_2__03217 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2__1_in_rule__ApplyTail__Group_2__03220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__ArgumentsAssignment_2_0_in_rule__ApplyTail__Group_2__0__Impl3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2__1__Impl_in_rule__ApplyTail__Group_2__13277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2_1__0_in_rule__ApplyTail__Group_2__1__Impl3304 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2_1__0__Impl_in_rule__ApplyTail__Group_2_1__03339 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2_1__1_in_rule__ApplyTail__Group_2_1__03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ApplyTail__Group_2_1__0__Impl3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group_2_1__1__Impl_in_rule__ApplyTail__Group_2_1__13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__ArgumentsAssignment_2_1_1_in_rule__ApplyTail__Group_2_1__1__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03462 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__03583 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__03586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__13644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__NumExprTailAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__0__Impl_in_rule__NumExprTail__Group__03705 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__1_in_rule__NumExprTail__Group__03708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__OperatorAssignment_0_in_rule__NumExprTail__Group__0__Impl3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__1__Impl_in_rule__NumExprTail__Group__13765 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__2_in_rule__NumExprTail__Group__13768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__FactorAssignment_1_in_rule__NumExprTail__Group__1__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__Group__2__Impl_in_rule__NumExprTail__Group__23825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__ExprTailAssignment_2_in_rule__NumExprTail__Group__2__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03889 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__04010 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__04013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__FactorTailAssignment_1_1_in_rule__Factor__Group_1__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__0__Impl_in_rule__FactorTail__Group__04132 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__1_in_rule__FactorTail__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__OperatorAssignment_0_in_rule__FactorTail__Group__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__1__Impl_in_rule__FactorTail__Group__14192 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__2_in_rule__FactorTail__Group__14195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__TermAssignment_1_in_rule__FactorTail__Group__1__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group__2__Impl_in_rule__FactorTail__Group__24252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__FactorTailAssignment_2_in_rule__FactorTail__Group__2__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14376 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VariableAssignment__Group__1__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__04501 = new BitSet(new long[]{0x0000000000060030L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__04504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ParenthesisExpression__Group__0__Impl4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14563 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ParenthesisExpression__Group__2__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_04723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_04754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_14785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_2_04878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_rule__Apply__ArgumentsAssignment_1_14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ApplyTail__ArgumentsAssignment_2_04940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ApplyTail__ArgumentsAssignment_2_1_14971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_rule__ApplyTail__NextCallAssignment_45002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_rule__NumericExpression__NumExprTailAssignment_1_15095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumExprTail__OperatorAlternatives_0_0_in_rule__NumExprTail__OperatorAssignment_05126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumExprTail__FactorAssignment_15159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumExprTail_in_rule__NumExprTail__ExprTailAssignment_25190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_1_15221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__OperatorAlternatives_0_0_in_rule__FactorTail__OperatorAssignment_05252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_15285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_25316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_05347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_25378 = new BitSet(new long[]{0x0000000000000002L});

}