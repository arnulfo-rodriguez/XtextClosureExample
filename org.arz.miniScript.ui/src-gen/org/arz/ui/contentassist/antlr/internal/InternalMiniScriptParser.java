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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "';'", "'func'", "'('", "')'", "','", "'{'", "'}'", "'='"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
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


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:257:1: entryRuleLiteralExpr : ruleLiteralExpr EOF ;
    public final void entryRuleLiteralExpr() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:258:1: ( ruleLiteralExpr EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:259:1: ruleLiteralExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr486);
            ruleLiteralExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr493); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:266:1: ruleLiteralExpr : ( ( rule__LiteralExpr__ValueAssignment ) ) ;
    public final void ruleLiteralExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:2: ( ( ( rule__LiteralExpr__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:1: ( rule__LiteralExpr__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:1: ( rule__LiteralExpr__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:2: rule__LiteralExpr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr519);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:285:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:286:1: ( ruleSymbolReference EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:287:1: ruleSymbolReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference546);
            ruleSymbolReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference553); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:294:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__SymbolReference__IdAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:1: ( rule__SymbolReference__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:1: ( rule__SymbolReference__IdAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:2: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference579);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:313:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:314:1: ( ruleNumericExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:315:1: ruleNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression606);
            ruleNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression613); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:322:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__NumericExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__NumericExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:1: ( rule__NumericExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:1: ( rule__NumericExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:2: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression639);
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


    // $ANTLR start "entryRuleFactor"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:341:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:342:1: ( ruleFactor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:343:1: ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor666);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor673); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:350:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__Factor__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:1: ( rule__Factor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:1: ( rule__Factor__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor699);
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


    // $ANTLR start "entryRuleTerm"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:369:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:370:1: ( ruleTerm EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:371:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm726);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm733); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:378:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:382:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__Term__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:1: ( rule__Term__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm759);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:397:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:398:1: ( ruleVariableAssignment EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:399:1: ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment786);
            ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment793); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:406:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:410:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:1: ( rule__VariableAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:1: ( rule__VariableAssignment__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment819);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:425:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:426:1: ( ruleParenthesisExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:427:1: ruleParenthesisExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression846);
            ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression853); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:434:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:438:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:1: ( rule__ParenthesisExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:1: ( rule__ParenthesisExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:2: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression879);
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


    // $ANTLR start "ruleAdditionOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:454:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:458:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:459:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:459:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:460:1: ( rule__AdditionOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:461:1: ( rule__AdditionOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:461:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator916);
            rule__AdditionOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleFactorOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:473:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:477:1: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:478:1: ( ( rule__FactorOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:478:1: ( ( rule__FactorOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:479:1: ( rule__FactorOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:480:1: ( rule__FactorOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:480:2: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__FactorOperator__Alternatives_in_ruleFactorOperator952);
            rule__FactorOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFactorOperator"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:491:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||(LA1_2>=11 && LA1_2<=15)||(LA1_2>=17 && LA1_2<=19)) ) {
                    alt1=3;
                }
                else if ( (LA1_2==22) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 17:
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:1: ( ruleFunctionDeclaration )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:1: ( ruleFunctionDeclaration )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives987);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:502:6: ( ruleVariableAssignment )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:502:6: ( ruleVariableAssignment )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:503:1: ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1004);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:508:6: ( ruleNumericExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:508:6: ( ruleNumericExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:509:1: ruleNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1021);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:519:1: rule__Body__Alternatives : ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( ( ( rule__Body__ExpressionsAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||(LA2_0>=16 && LA2_0<=17)) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:1: ( ( rule__Body__ExpressionsAssignment_0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:1: ( rule__Body__ExpressionsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getExpressionsAssignment_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:526:1: ( rule__Body__ExpressionsAssignment_0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:526:2: rule__Body__ExpressionsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1053);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:530:6: ( ( rule__Body__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:530:6: ( ( rule__Body__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:531:1: ( rule__Body__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:532:1: ( rule__Body__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:532:2: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1071);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:541:1: rule__Functor__Alternatives : ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) );
    public final void rule__Functor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:545:1: ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:546:1: ( ruleSymbolReference )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:546:1: ( ruleSymbolReference )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:547:1: ruleSymbolReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1104);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:552:6: ( ruleParenthesisExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:552:6: ( ruleParenthesisExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:553:1: ruleParenthesisExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1121);
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


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:563:1: rule__Term__Alternatives : ( ( ruleLiteralExpr ) | ( ruleApply ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:567:1: ( ( ruleLiteralExpr ) | ( ruleApply ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID||LA4_0==17) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:568:1: ( ruleLiteralExpr )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:568:1: ( ruleLiteralExpr )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:569:1: ruleLiteralExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1153);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:574:6: ( ruleApply )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:574:6: ( ruleApply )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:575:1: ruleApply
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleApply_in_rule__Term__Alternatives1170);
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


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:585:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:589:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:590:1: ( ( '+' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:590:1: ( ( '+' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:591:1: ( '+' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:592:1: ( '+' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:592:3: '+'
                    {
                    match(input,11,FOLLOW_11_in_rule__AdditionOperator__Alternatives1203); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:597:6: ( ( '-' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:597:6: ( ( '-' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:598:1: ( '-' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:599:1: ( '-' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:599:3: '-'
                    {
                    match(input,12,FOLLOW_12_in_rule__AdditionOperator__Alternatives1224); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__FactorOperator__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:609:1: rule__FactorOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:613:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:614:1: ( ( '*' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:614:1: ( ( '*' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:615:1: ( '*' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:616:1: ( '*' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:616:3: '*'
                    {
                    match(input,13,FOLLOW_13_in_rule__FactorOperator__Alternatives1260); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:621:6: ( ( '/' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:621:6: ( ( '/' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:622:1: ( '/' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:623:1: ( '/' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:623:3: '/'
                    {
                    match(input,14,FOLLOW_14_in_rule__FactorOperator__Alternatives1281); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__FactorOperator__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:635:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:639:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:640:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01314);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01317);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:647:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:651:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:652:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:652:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:653:1: ( rule__Program__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:1: ( rule__Program__ExpressionsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:2: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1344);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:664:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:668:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:669:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11374);
            rule__Program__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11377);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:676:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:680:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:681:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:681:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:682:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Program__Group__1__Impl1405); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:695:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:699:1: ( rule__Program__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:700:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21436);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:706:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:710:1: ( ( ( rule__Program__Group_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:711:1: ( ( rule__Program__Group_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:711:1: ( ( rule__Program__Group_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:712:1: ( rule__Program__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:713:1: ( rule__Program__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_INT)||(LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:713:2: rule__Program__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1463);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:729:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:733:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:734:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01500);
            rule__Program__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01503);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:741:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:745:1: ( ( ( rule__Program__ExpressionsAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:746:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:746:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:747:1: ( rule__Program__ExpressionsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:748:1: ( rule__Program__ExpressionsAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:748:2: rule__Program__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl1530);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:758:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:762:1: ( rule__Program__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:763:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11560);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:769:1: rule__Program__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:773:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:774:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:774:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:775:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Program__Group_2__1__Impl1588); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:792:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:796:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:797:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01623);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01626);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:804:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:808:1: ( ( 'func' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:809:1: ( 'func' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:809:1: ( 'func' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:810:1: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__FunctionDeclaration__Group__0__Impl1654); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:823:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:827:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:828:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11685);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11688);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:835:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:839:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:840:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:840:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:841:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__FunctionDeclaration__Group__1__Impl1716); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:854:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:858:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:859:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21747);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21750);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:866:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__Group_2__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:870:1: ( ( ( rule__FunctionDeclaration__Group_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:871:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:871:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:872:1: ( rule__FunctionDeclaration__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:873:1: ( rule__FunctionDeclaration__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:873:2: rule__FunctionDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl1777);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:883:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:887:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:888:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31808);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31811);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:895:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:899:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:900:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:900:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:901:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionDeclaration__Group__3__Impl1839); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:914:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:918:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:919:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41870);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:925:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:929:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:930:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:930:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:931:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:932:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:932:2: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl1897);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:952:1: rule__FunctionDeclaration__Group_2__0 : rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 ;
    public final void rule__FunctionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:956:1: ( rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:957:2: rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__01937);
            rule__FunctionDeclaration__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__01940);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:964:1: rule__FunctionDeclaration__Group_2__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:968:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:970:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:971:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:971:2: rule__FunctionDeclaration__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl1967);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:981:1: rule__FunctionDeclaration__Group_2__1 : rule__FunctionDeclaration__Group_2__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:985:1: ( rule__FunctionDeclaration__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:986:2: rule__FunctionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__11997);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:992:1: rule__FunctionDeclaration__Group_2__1__Impl : ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:996:1: ( ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:997:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:997:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:998:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:999:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:999:2: rule__FunctionDeclaration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl2024);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1013:1: rule__FunctionDeclaration__Group_2_1__0 : rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 ;
    public final void rule__FunctionDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1017:1: ( rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1018:2: rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__02059);
            rule__FunctionDeclaration__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__02062);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1025:1: rule__FunctionDeclaration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1029:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1030:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1030:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1031:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__FunctionDeclaration__Group_2_1__0__Impl2090); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1044:1: rule__FunctionDeclaration__Group_2_1__1 : rule__FunctionDeclaration__Group_2_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1048:1: ( rule__FunctionDeclaration__Group_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1049:2: rule__FunctionDeclaration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__12121);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1055:1: rule__FunctionDeclaration__Group_2_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1059:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1060:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1060:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1061:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1062:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1062:2: rule__FunctionDeclaration__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl2148);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1076:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1080:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1081:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02182);
            rule__Body__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02185);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1088:1: rule__Body__Group_1__0__Impl : ( () ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1092:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1093:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1093:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1094:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getBodyAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1095:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1097:1: 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1107:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl rule__Body__Group_1__2 ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1111:1: ( rule__Body__Group_1__1__Impl rule__Body__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1112:2: rule__Body__Group_1__1__Impl rule__Body__Group_1__2
            {
            pushFollow(FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12243);
            rule__Body__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12246);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1119:1: rule__Body__Group_1__1__Impl : ( '{' ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1123:1: ( ( '{' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1124:1: ( '{' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1124:1: ( '{' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1125:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Body__Group_1__1__Impl2274); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1138:1: rule__Body__Group_1__2 : rule__Body__Group_1__2__Impl rule__Body__Group_1__3 ;
    public final void rule__Body__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1142:1: ( rule__Body__Group_1__2__Impl rule__Body__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1143:2: rule__Body__Group_1__2__Impl rule__Body__Group_1__3
            {
            pushFollow(FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22305);
            rule__Body__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22308);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1150:1: rule__Body__Group_1__2__Impl : ( ( rule__Body__Group_1_2__0 )* ) ;
    public final void rule__Body__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1154:1: ( ( ( rule__Body__Group_1_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1155:1: ( ( rule__Body__Group_1_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1155:1: ( ( rule__Body__Group_1_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1156:1: ( rule__Body__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getGroup_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1157:1: ( rule__Body__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=16 && LA10_0<=17)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1157:2: rule__Body__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_1_2__0_in_rule__Body__Group_1__2__Impl2335);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1167:1: rule__Body__Group_1__3 : rule__Body__Group_1__3__Impl ;
    public final void rule__Body__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1171:1: ( rule__Body__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1172:2: rule__Body__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32366);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1178:1: rule__Body__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Body__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1182:1: ( ( '}' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1183:1: ( '}' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1183:1: ( '}' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1184:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Body__Group_1__3__Impl2394); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1205:1: rule__Body__Group_1_2__0 : rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1 ;
    public final void rule__Body__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1209:1: ( rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1210:2: rule__Body__Group_1_2__0__Impl rule__Body__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1_2__0__Impl_in_rule__Body__Group_1_2__02433);
            rule__Body__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1_2__1_in_rule__Body__Group_1_2__02436);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1217:1: rule__Body__Group_1_2__0__Impl : ( ( rule__Body__ExpressionsAssignment_1_2_0 ) ) ;
    public final void rule__Body__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1221:1: ( ( ( rule__Body__ExpressionsAssignment_1_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1222:1: ( ( rule__Body__ExpressionsAssignment_1_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1222:1: ( ( rule__Body__ExpressionsAssignment_1_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1223:1: ( rule__Body__ExpressionsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsAssignment_1_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1224:1: ( rule__Body__ExpressionsAssignment_1_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1224:2: rule__Body__ExpressionsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_1_2_0_in_rule__Body__Group_1_2__0__Impl2463);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1234:1: rule__Body__Group_1_2__1 : rule__Body__Group_1_2__1__Impl ;
    public final void rule__Body__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1238:1: ( rule__Body__Group_1_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1239:2: rule__Body__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1_2__1__Impl_in_rule__Body__Group_1_2__12493);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1245:1: rule__Body__Group_1_2__1__Impl : ( ';' ) ;
    public final void rule__Body__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1249:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1250:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1250:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1251:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getSemicolonKeyword_1_2_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Body__Group_1_2__1__Impl2521); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1268:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1272:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1273:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02556);
            rule__Apply__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02559);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1280:1: rule__Apply__Group__0__Impl : ( ruleFunctor ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1284:1: ( ( ruleFunctor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1285:1: ( ruleFunctor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1285:1: ( ruleFunctor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1286:1: ruleFunctor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl2586);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1297:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1301:1: ( rule__Apply__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1302:2: rule__Apply__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12615);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1308:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__Group_1__0 )* ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1312:1: ( ( ( rule__Apply__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1313:1: ( ( rule__Apply__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1313:1: ( ( rule__Apply__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1314:1: ( rule__Apply__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1315:1: ( rule__Apply__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1315:2: rule__Apply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl2642);
            	    rule__Apply__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1329:1: rule__Apply__Group_1__0 : rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 ;
    public final void rule__Apply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1333:1: ( rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1334:2: rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__02677);
            rule__Apply__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__02680);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1341:1: rule__Apply__Group_1__0__Impl : ( () ) ;
    public final void rule__Apply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1345:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1346:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1346:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1347:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1348:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1350:1: 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1360:1: rule__Apply__Group_1__1 : rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 ;
    public final void rule__Apply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1364:1: ( rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:2: rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__12738);
            rule__Apply__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1__2_in_rule__Apply__Group_1__12741);
            rule__Apply__Group_1__2();

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1372:1: rule__Apply__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Apply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1376:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1377:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1377:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1378:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 
            }
            match(input,17,FOLLOW_17_in_rule__Apply__Group_1__1__Impl2769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 
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


    // $ANTLR start "rule__Apply__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1391:1: rule__Apply__Group_1__2 : rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 ;
    public final void rule__Apply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1395:1: ( rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1396:2: rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__2__Impl_in_rule__Apply__Group_1__22800);
            rule__Apply__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1__3_in_rule__Apply__Group_1__22803);
            rule__Apply__Group_1__3();

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
    // $ANTLR end "rule__Apply__Group_1__2"


    // $ANTLR start "rule__Apply__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1403:1: rule__Apply__Group_1__2__Impl : ( ( rule__Apply__Group_1_2__0 )? ) ;
    public final void rule__Apply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1407:1: ( ( ( rule__Apply__Group_1_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1408:1: ( ( rule__Apply__Group_1_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1408:1: ( ( rule__Apply__Group_1_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1409:1: ( rule__Apply__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1410:1: ( rule__Apply__Group_1_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=16 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1410:2: rule__Apply__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_1_2__0_in_rule__Apply__Group_1__2__Impl2830);
                    rule__Apply__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getGroup_1_2()); 
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
    // $ANTLR end "rule__Apply__Group_1__2__Impl"


    // $ANTLR start "rule__Apply__Group_1__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1420:1: rule__Apply__Group_1__3 : rule__Apply__Group_1__3__Impl ;
    public final void rule__Apply__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1424:1: ( rule__Apply__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1425:2: rule__Apply__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__3__Impl_in_rule__Apply__Group_1__32861);
            rule__Apply__Group_1__3__Impl();

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
    // $ANTLR end "rule__Apply__Group_1__3"


    // $ANTLR start "rule__Apply__Group_1__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1431:1: rule__Apply__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Apply__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1435:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1436:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1436:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1437:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Apply__Group_1__3__Impl2889); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 
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
    // $ANTLR end "rule__Apply__Group_1__3__Impl"


    // $ANTLR start "rule__Apply__Group_1_2__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:1: rule__Apply__Group_1_2__0 : rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 ;
    public final void rule__Apply__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1462:1: ( rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1463:2: rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2__0__Impl_in_rule__Apply__Group_1_2__02928);
            rule__Apply__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1_2__1_in_rule__Apply__Group_1_2__02931);
            rule__Apply__Group_1_2__1();

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
    // $ANTLR end "rule__Apply__Group_1_2__0"


    // $ANTLR start "rule__Apply__Group_1_2__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1470:1: rule__Apply__Group_1_2__0__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) ;
    public final void rule__Apply__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1474:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1475:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1475:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1476:1: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1477:1: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1477:2: rule__Apply__ArgumentsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_2_0_in_rule__Apply__Group_1_2__0__Impl2958);
            rule__Apply__ArgumentsAssignment_1_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 
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
    // $ANTLR end "rule__Apply__Group_1_2__0__Impl"


    // $ANTLR start "rule__Apply__Group_1_2__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1487:1: rule__Apply__Group_1_2__1 : rule__Apply__Group_1_2__1__Impl ;
    public final void rule__Apply__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1491:1: ( rule__Apply__Group_1_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1492:2: rule__Apply__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2__1__Impl_in_rule__Apply__Group_1_2__12988);
            rule__Apply__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__Apply__Group_1_2__1"


    // $ANTLR start "rule__Apply__Group_1_2__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1498:1: rule__Apply__Group_1_2__1__Impl : ( ( rule__Apply__Group_1_2_1__0 )* ) ;
    public final void rule__Apply__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1502:1: ( ( ( rule__Apply__Group_1_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1503:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1503:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1504:1: ( rule__Apply__Group_1_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup_1_2_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1505:1: ( rule__Apply__Group_1_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1505:2: rule__Apply__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Group_1_2_1__0_in_rule__Apply__Group_1_2__1__Impl3015);
            	    rule__Apply__Group_1_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getGroup_1_2_1()); 
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
    // $ANTLR end "rule__Apply__Group_1_2__1__Impl"


    // $ANTLR start "rule__Apply__Group_1_2_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1519:1: rule__Apply__Group_1_2_1__0 : rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 ;
    public final void rule__Apply__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1523:1: ( rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1524:2: rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__0__Impl_in_rule__Apply__Group_1_2_1__03050);
            rule__Apply__Group_1_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__1_in_rule__Apply__Group_1_2_1__03053);
            rule__Apply__Group_1_2_1__1();

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
    // $ANTLR end "rule__Apply__Group_1_2_1__0"


    // $ANTLR start "rule__Apply__Group_1_2_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1531:1: rule__Apply__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Apply__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1535:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1536:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1536:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1537:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Apply__Group_1_2_1__0__Impl3081); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 
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
    // $ANTLR end "rule__Apply__Group_1_2_1__0__Impl"


    // $ANTLR start "rule__Apply__Group_1_2_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1550:1: rule__Apply__Group_1_2_1__1 : rule__Apply__Group_1_2_1__1__Impl ;
    public final void rule__Apply__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1554:1: ( rule__Apply__Group_1_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1555:2: rule__Apply__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__1__Impl_in_rule__Apply__Group_1_2_1__13112);
            rule__Apply__Group_1_2_1__1__Impl();

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
    // $ANTLR end "rule__Apply__Group_1_2_1__1"


    // $ANTLR start "rule__Apply__Group_1_2_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1561:1: rule__Apply__Group_1_2_1__1__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) ;
    public final void rule__Apply__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1565:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1566:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1566:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1567:1: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1568:1: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1568:2: rule__Apply__ArgumentsAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_2_1_1_in_rule__Apply__Group_1_2_1__1__Impl3139);
            rule__Apply__ArgumentsAssignment_1_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 
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
    // $ANTLR end "rule__Apply__Group_1_2_1__1__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1582:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1586:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1587:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03173);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03176);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1594:1: rule__NumericExpression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1598:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1599:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1599:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1600:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl3203);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1611:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1615:1: ( rule__NumericExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1616:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13232);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1622:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__Group_1__0 )* ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1626:1: ( ( ( rule__NumericExpression__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1627:1: ( ( rule__NumericExpression__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1627:1: ( ( rule__NumericExpression__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1628:1: ( rule__NumericExpression__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1629:1: ( rule__NumericExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1629:2: rule__NumericExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl3259);
            	    rule__NumericExpression__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1643:1: rule__NumericExpression__Group_1__0 : rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 ;
    public final void rule__NumericExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1647:1: ( rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1648:2: rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__03294);
            rule__NumericExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__03297);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1655:1: rule__NumericExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NumericExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1659:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1660:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1660:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1661:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1662:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1664:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1674:1: rule__NumericExpression__Group_1__1 : rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 ;
    public final void rule__NumericExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1678:1: ( rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1679:2: rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__13355);
            rule__NumericExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__2_in_rule__NumericExpression__Group_1__13358);
            rule__NumericExpression__Group_1__2();

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1686:1: rule__NumericExpression__Group_1__1__Impl : ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NumericExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1690:1: ( ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1691:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1691:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1692:1: ( rule__NumericExpression__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1693:1: ( rule__NumericExpression__OperatorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1693:2: rule__NumericExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumericExpression__OperatorAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl3385);
            rule__NumericExpression__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 
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


    // $ANTLR start "rule__NumericExpression__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1703:1: rule__NumericExpression__Group_1__2 : rule__NumericExpression__Group_1__2__Impl ;
    public final void rule__NumericExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1707:1: ( rule__NumericExpression__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1708:2: rule__NumericExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__2__Impl_in_rule__NumericExpression__Group_1__23415);
            rule__NumericExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__NumericExpression__Group_1__2"


    // $ANTLR start "rule__NumericExpression__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1714:1: rule__NumericExpression__Group_1__2__Impl : ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) ;
    public final void rule__NumericExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1718:1: ( ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1719:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1719:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1720:1: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1721:1: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1721:2: rule__NumericExpression__RightFactorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__NumericExpression__RightFactorAssignment_1_2_in_rule__NumericExpression__Group_1__2__Impl3442);
            rule__NumericExpression__RightFactorAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 
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
    // $ANTLR end "rule__NumericExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1737:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1741:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1742:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03478);
            rule__Factor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03481);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1749:1: rule__Factor__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1753:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1754:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1754:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1755:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl3508);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1766:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1770:1: ( rule__Factor__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1771:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13537);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1777:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1781:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1782:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1782:1: ( ( rule__Factor__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1783:1: ( rule__Factor__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1784:1: ( rule__Factor__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=14)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1784:2: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl3564);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1798:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1802:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1803:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__03599);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__03602);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1810:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1814:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1815:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1815:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1816:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1817:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1819:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1829:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1833:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1834:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__13660);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group_1__2_in_rule__Factor__Group_1__13663);
            rule__Factor__Group_1__2();

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1841:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1845:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1846:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1846:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1847:1: ( rule__Factor__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1848:1: ( rule__Factor__OperatorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1848:2: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Factor__OperatorAssignment_1_1_in_rule__Factor__Group_1__1__Impl3690);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
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


    // $ANTLR start "rule__Factor__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1858:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1862:1: ( rule__Factor__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1863:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__2__Impl_in_rule__Factor__Group_1__23720);
            rule__Factor__Group_1__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightTermAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1873:1: ( ( ( rule__Factor__RightTermAssignment_1_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1874:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1874:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1875:1: ( rule__Factor__RightTermAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1876:1: ( rule__Factor__RightTermAssignment_1_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1876:2: rule__Factor__RightTermAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Factor__RightTermAssignment_1_2_in_rule__Factor__Group_1__2__Impl3747);
            rule__Factor__RightTermAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 
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
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1892:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1897:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__03783);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__03786);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1904:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__IdAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1908:1: ( ( ( rule__VariableAssignment__IdAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1909:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1909:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1910:1: ( rule__VariableAssignment__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1911:1: ( rule__VariableAssignment__IdAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1911:2: rule__VariableAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl3813);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1921:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1925:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1926:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__13843);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__13846);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1933:1: rule__VariableAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1937:1: ( ( '=' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1938:1: ( '=' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1938:1: ( '=' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1939:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__VariableAssignment__Group__1__Impl3874); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1952:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1956:1: ( rule__VariableAssignment__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1957:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__23905);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1963:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1967:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1968:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1968:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1969:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1970:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1970:2: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl3932);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1986:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1990:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1991:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__03968);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__03971);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1998:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2002:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2003:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2003:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2004:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__ParenthesisExpression__Group__0__Impl3999); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2017:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2021:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2022:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14030);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14033);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2029:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2033:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2034:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2034:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2035:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4060);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2046:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2050:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24089);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2057:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2061:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2062:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2062:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2063:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__ParenthesisExpression__Group__2__Impl4117); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2083:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2087:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2088:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2088:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2089:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04159);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2098:1: rule__Program__ExpressionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2102:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2103:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2103:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2104:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_04190);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2113:1: rule__FunctionDeclaration__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2117:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2118:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2118:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2119:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_04221); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2128:1: rule__FunctionDeclaration__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2132:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2133:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2133:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2134:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_14252); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2143:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleBody ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2147:1: ( ( ruleBody ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2148:1: ( ruleBody )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2148:1: ( ruleBody )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2149:1: ruleBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44283);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2158:1: rule__Body__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2162:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2163:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2163:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2164:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04314);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2173:1: rule__Body__ExpressionsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2177:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2178:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2178:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2179:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_2_04345);
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


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2188:1: rule__Apply__ArgumentsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2192:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2193:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2193:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2194:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_04376);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
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
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1_2_0"


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_2_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2203:1: rule__Apply__ArgumentsAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2207:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2208:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2208:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2209:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_1_14407);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
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
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1_2_1_1"


    // $ANTLR start "rule__LiteralExpr__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2218:1: rule__LiteralExpr__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LiteralExpr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2222:1: ( ( RULE_INT ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2223:1: ( RULE_INT )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2223:1: ( RULE_INT )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2224:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LiteralExpr__ValueAssignment4438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprAccess().getValueINTTerminalRuleCall_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2233:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2237:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2238:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2238:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2239:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment4469); if (state.failed) return ;
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


    // $ANTLR start "rule__NumericExpression__OperatorAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2248:1: rule__NumericExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__NumericExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2252:1: ( ( ruleAdditionOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2253:1: ( ruleAdditionOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2253:1: ( ruleAdditionOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2254:1: ruleAdditionOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_rule__NumericExpression__OperatorAssignment_1_14500);
            ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__NumericExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__NumericExpression__RightFactorAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2263:1: rule__NumericExpression__RightFactorAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__NumericExpression__RightFactorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2267:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2268:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2268:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2269:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__RightFactorAssignment_1_24531);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__NumericExpression__RightFactorAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2278:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2282:1: ( ( ruleFactorOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2283:1: ( ruleFactorOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2283:1: ( ruleFactorOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2284:1: ruleFactorOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactorOperator_in_rule__Factor__OperatorAssignment_1_14562);
            ruleFactorOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightTermAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2293:1: rule__Factor__RightTermAssignment_1_2 : ( ruleTerm ) ;
    public final void rule__Factor__RightTermAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2297:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2298:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2298:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2299:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__RightTermAssignment_1_24593);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Factor__RightTermAssignment_1_2"


    // $ANTLR start "rule__VariableAssignment__IdAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2308:1: rule__VariableAssignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2312:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2313:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2313:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2314:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_04624); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2323:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2327:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2328:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2328:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2329:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_24655);
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
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorOperator__Alternatives_in_ruleFactorOperator952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_0_in_rule__Body__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Term__Alternatives1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AdditionOperator__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__AdditionOperator__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FactorOperator__Alternatives1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FactorOperator__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01314 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11374 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group__1__Impl1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__21436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl1463 = new BitSet(new long[]{0x0000000000030032L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__01500 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__11560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Program__Group_2__1__Impl1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__01623 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__01626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FunctionDeclaration__Group__0__Impl1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__11685 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__11688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FunctionDeclaration__Group__1__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__21747 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__21750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__31808 = new BitSet(new long[]{0x0000000000130030L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__31811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionDeclaration__Group__3__Impl1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__41870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__01937 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__11997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl2024 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__02059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__02062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FunctionDeclaration__Group_2_1__0__Impl2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__12121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02182 = new BitSet(new long[]{0x0000000000130030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12243 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Body__Group_1__1__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22305 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__0_in_rule__Body__Group_1__2__Impl2335 = new BitSet(new long[]{0x0000000000030032L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Body__Group_1__3__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__0__Impl_in_rule__Body__Group_1_2__02433 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__1_in_rule__Body__Group_1_2__02436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_1_2_0_in_rule__Body__Group_1_2__0__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1_2__1__Impl_in_rule__Body__Group_1_2__12493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Body__Group_1_2__1__Impl2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02556 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl2642 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__02677 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__02680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__12738 = new BitSet(new long[]{0x0000000000070030L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__2_in_rule__Apply__Group_1__12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Apply__Group_1__1__Impl2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__2__Impl_in_rule__Apply__Group_1__22800 = new BitSet(new long[]{0x0000000000070030L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__3_in_rule__Apply__Group_1__22803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__0_in_rule__Apply__Group_1__2__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__3__Impl_in_rule__Apply__Group_1__32861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Apply__Group_1__3__Impl2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__0__Impl_in_rule__Apply__Group_1_2__02928 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__1_in_rule__Apply__Group_1_2__02931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_2_0_in_rule__Apply__Group_1_2__0__Impl2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__1__Impl_in_rule__Apply__Group_1_2__12988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__0_in_rule__Apply__Group_1_2__1__Impl3015 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__0__Impl_in_rule__Apply__Group_1_2_1__03050 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__1_in_rule__Apply__Group_1_2_1__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Apply__Group_1_2_1__0__Impl3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__1__Impl_in_rule__Apply__Group_1_2_1__13112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_2_1_1_in_rule__Apply__Group_1_2_1__1__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03173 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl3259 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__03294 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__03297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__13355 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__2_in_rule__NumericExpression__Group_1__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__OperatorAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__2__Impl_in_rule__NumericExpression__Group_1__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__RightFactorAssignment_1_2_in_rule__NumericExpression__Group_1__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__03478 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__13537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl3564 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__03599 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__13660 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__2_in_rule__Factor__Group_1__13663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__OperatorAssignment_1_1_in_rule__Factor__Group_1__1__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__2__Impl_in_rule__Factor__Group_1__23720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__RightTermAssignment_1_2_in_rule__Factor__Group_1__2__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__03783 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__03786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__13843 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VariableAssignment__Group__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__23905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__03968 = new BitSet(new long[]{0x0000000000030030L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__03971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ParenthesisExpression__Group__0__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__14030 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__24089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ParenthesisExpression__Group__2__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_04159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_04190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_04221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_14252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_44283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_04314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_2_04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_04376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_1_14407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LiteralExpr__ValueAssignment4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__NumericExpression__OperatorAssignment_1_14500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__RightFactorAssignment_1_24531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorOperator_in_rule__Factor__OperatorAssignment_1_14562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__RightTermAssignment_1_24593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_24655 = new BitSet(new long[]{0x0000000000000002L});

}