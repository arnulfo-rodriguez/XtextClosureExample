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


    // $ANTLR start "entryRuleProgramTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:117:1: entryRuleProgramTail : ruleProgramTail EOF ;
    public final void entryRuleProgramTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:118:1: ( ruleProgramTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:119:1: ruleProgramTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailRule()); 
            }
            pushFollow(FOLLOW_ruleProgramTail_in_entryRuleProgramTail186);
            ruleProgramTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramTail193); if (state.failed) return ;

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
    // $ANTLR end "entryRuleProgramTail"


    // $ANTLR start "ruleProgramTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:126:1: ruleProgramTail : ( ( rule__ProgramTail__Group__0 ) ) ;
    public final void ruleProgramTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:130:2: ( ( ( rule__ProgramTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:131:1: ( ( rule__ProgramTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:131:1: ( ( rule__ProgramTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:132:1: ( rule__ProgramTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:133:1: ( rule__ProgramTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:133:2: rule__ProgramTail__Group__0
            {
            pushFollow(FOLLOW_rule__ProgramTail__Group__0_in_ruleProgramTail219);
            rule__ProgramTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getGroup()); 
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
    // $ANTLR end "ruleProgramTail"


    // $ANTLR start "entryRuleExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:145:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:146:1: ( ruleExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:147:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression246);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression253); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:154:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:158:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:159:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:159:1: ( ( rule__Expression__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:160:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:161:1: ( rule__Expression__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:161:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression279);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:173:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:174:1: ( ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:175:1: ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration306);
            ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration313); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:182:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:186:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:187:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:187:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:188:1: ( rule__FunctionDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:189:1: ( rule__FunctionDeclaration__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:189:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration339);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:201:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:202:1: ( ruleBody EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:203:1: ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody366);
            ruleBody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody373); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:210:1: ruleBody : ( ( rule__Body__Alternatives ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:214:2: ( ( ( rule__Body__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__Body__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( ( rule__Body__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:216:1: ( rule__Body__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:1: ( rule__Body__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:217:2: rule__Body__Alternatives
            {
            pushFollow(FOLLOW_rule__Body__Alternatives_in_ruleBody399);
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


    // $ANTLR start "entryRuleBodyTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:229:1: entryRuleBodyTail : ruleBodyTail EOF ;
    public final void entryRuleBodyTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:230:1: ( ruleBodyTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:231:1: ruleBodyTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailRule()); 
            }
            pushFollow(FOLLOW_ruleBodyTail_in_entryRuleBodyTail426);
            ruleBodyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyTail433); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBodyTail"


    // $ANTLR start "ruleBodyTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:238:1: ruleBodyTail : ( ( rule__BodyTail__Group__0 ) ) ;
    public final void ruleBodyTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:242:2: ( ( ( rule__BodyTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__BodyTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( ( rule__BodyTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:244:1: ( rule__BodyTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:1: ( rule__BodyTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:245:2: rule__BodyTail__Group__0
            {
            pushFollow(FOLLOW_rule__BodyTail__Group__0_in_ruleBodyTail459);
            rule__BodyTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getGroup()); 
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
    // $ANTLR end "ruleBodyTail"


    // $ANTLR start "entryRuleFunctionParameters"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:257:1: entryRuleFunctionParameters : ruleFunctionParameters EOF ;
    public final void entryRuleFunctionParameters() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:258:1: ( ruleFunctionParameters EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:259:1: ruleFunctionParameters EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters486);
            ruleFunctionParameters();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameters493); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:266:1: ruleFunctionParameters : ( ( rule__FunctionParameters__Group__0 ) ) ;
    public final void ruleFunctionParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:2: ( ( ( rule__FunctionParameters__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__FunctionParameters__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( ( rule__FunctionParameters__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:1: ( rule__FunctionParameters__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:1: ( rule__FunctionParameters__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:273:2: rule__FunctionParameters__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group__0_in_ruleFunctionParameters519);
            rule__FunctionParameters__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getGroup()); 
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


    // $ANTLR start "entryRuleFunctionParametersTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:285:1: entryRuleFunctionParametersTail : ruleFunctionParametersTail EOF ;
    public final void entryRuleFunctionParametersTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:286:1: ( ruleFunctionParametersTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:287:1: ruleFunctionParametersTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionParametersTail_in_entryRuleFunctionParametersTail546);
            ruleFunctionParametersTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParametersTail553); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionParametersTail"


    // $ANTLR start "ruleFunctionParametersTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:294:1: ruleFunctionParametersTail : ( ( rule__FunctionParametersTail__Group__0 ) ) ;
    public final void ruleFunctionParametersTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:2: ( ( ( rule__FunctionParametersTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__FunctionParametersTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( ( rule__FunctionParametersTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:1: ( rule__FunctionParametersTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:1: ( rule__FunctionParametersTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:301:2: rule__FunctionParametersTail__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__0_in_ruleFunctionParametersTail579);
            rule__FunctionParametersTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionParametersTail"


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:313:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:314:1: ( ruleApply EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:315:1: ruleApply EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyRule()); 
            }
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply606);
            ruleApply();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply613); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:322:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:2: ( ( ( rule__Apply__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__Apply__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( ( rule__Apply__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:1: ( rule__Apply__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:1: ( rule__Apply__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:329:2: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_rule__Apply__Group__0_in_ruleApply639);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:341:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:342:1: ( ruleFunctor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:343:1: ruleFunctor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctorRule()); 
            }
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor666);
            ruleFunctor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor673); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:350:1: ruleFunctor : ( ( rule__Functor__Alternatives ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:2: ( ( ( rule__Functor__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__Functor__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( ( rule__Functor__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:1: ( rule__Functor__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctorAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:1: ( rule__Functor__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:357:2: rule__Functor__Alternatives
            {
            pushFollow(FOLLOW_rule__Functor__Alternatives_in_ruleFunctor699);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:369:1: entryRuleApplyTail : ruleApplyTail EOF ;
    public final void entryRuleApplyTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:370:1: ( ruleApplyTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:371:1: ruleApplyTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailRule()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_entryRuleApplyTail726);
            ruleApplyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplyTail733); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:378:1: ruleApplyTail : ( ( rule__ApplyTail__Group__0 ) ) ;
    public final void ruleApplyTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:382:2: ( ( ( rule__ApplyTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__ApplyTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( ( rule__ApplyTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:1: ( rule__ApplyTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:1: ( rule__ApplyTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:385:2: rule__ApplyTail__Group__0
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__0_in_ruleApplyTail759);
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


    // $ANTLR start "entryRuleFunctionArguments"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:397:1: entryRuleFunctionArguments : ruleFunctionArguments EOF ;
    public final void entryRuleFunctionArguments() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:398:1: ( ruleFunctionArguments EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:399:1: ruleFunctionArguments EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments786);
            ruleFunctionArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArguments793); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:406:1: ruleFunctionArguments : ( ( rule__FunctionArguments__Group__0 ) ) ;
    public final void ruleFunctionArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:410:2: ( ( ( rule__FunctionArguments__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__FunctionArguments__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( ( rule__FunctionArguments__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:1: ( rule__FunctionArguments__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:1: ( rule__FunctionArguments__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:413:2: rule__FunctionArguments__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__0_in_ruleFunctionArguments819);
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


    // $ANTLR start "entryRuleFunctionArgumentsTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:425:1: entryRuleFunctionArgumentsTail : ruleFunctionArgumentsTail EOF ;
    public final void entryRuleFunctionArgumentsTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:426:1: ( ruleFunctionArgumentsTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:427:1: ruleFunctionArgumentsTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_entryRuleFunctionArgumentsTail846);
            ruleFunctionArgumentsTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArgumentsTail853); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionArgumentsTail"


    // $ANTLR start "ruleFunctionArgumentsTail"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:434:1: ruleFunctionArgumentsTail : ( ( rule__FunctionArgumentsTail__Group__0 ) ) ;
    public final void ruleFunctionArgumentsTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:438:2: ( ( ( rule__FunctionArgumentsTail__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__FunctionArgumentsTail__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( ( rule__FunctionArgumentsTail__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:1: ( rule__FunctionArgumentsTail__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:1: ( rule__FunctionArgumentsTail__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:441:2: rule__FunctionArgumentsTail__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__0_in_ruleFunctionArgumentsTail879);
            rule__FunctionArgumentsTail__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getGroup()); 
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
    // $ANTLR end "ruleFunctionArgumentsTail"


    // $ANTLR start "entryRuleLiteralExpr"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:453:1: entryRuleLiteralExpr : ruleLiteralExpr EOF ;
    public final void entryRuleLiteralExpr() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:454:1: ( ruleLiteralExpr EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:455:1: ruleLiteralExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr906);
            ruleLiteralExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpr913); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:462:1: ruleLiteralExpr : ( ( rule__LiteralExpr__ValueAssignment ) ) ;
    public final void ruleLiteralExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:466:2: ( ( ( rule__LiteralExpr__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:467:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:467:1: ( ( rule__LiteralExpr__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:468:1: ( rule__LiteralExpr__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:1: ( rule__LiteralExpr__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:469:2: rule__LiteralExpr__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr939);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:481:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:482:1: ( ruleSymbolReference EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:483:1: ruleSymbolReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference966);
            ruleSymbolReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSymbolReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference973); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:490:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:494:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( ( rule__SymbolReference__IdAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:1: ( rule__SymbolReference__IdAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:1: ( rule__SymbolReference__IdAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:497:2: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference999);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:509:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:510:1: ( ruleNumericExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:511:1: ruleNumericExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1026);
            ruleNumericExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumericExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression1033); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:518:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:522:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( ( rule__NumericExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( ( rule__NumericExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:1: ( rule__NumericExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:1: ( rule__NumericExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:525:2: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression1059);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:537:1: entryRuleExprTail : ruleExprTail EOF ;
    public final void entryRuleExprTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:538:1: ( ruleExprTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:539:1: ruleExprTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailRule()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_entryRuleExprTail1086);
            ruleExprTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTail1093); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:546:1: ruleExprTail : ( ( rule__ExprTail__Alternatives ) ) ;
    public final void ruleExprTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:550:2: ( ( ( rule__ExprTail__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:551:1: ( ( rule__ExprTail__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:551:1: ( ( rule__ExprTail__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:552:1: ( rule__ExprTail__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:553:1: ( rule__ExprTail__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:553:2: rule__ExprTail__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprTail__Alternatives_in_ruleExprTail1119);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:565:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:566:1: ( ruleFactor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:567:1: ruleFactor EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorRule()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor1146);
            ruleFactor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor1153); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:574:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:578:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:579:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:579:1: ( ( rule__Factor__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:580:1: ( rule__Factor__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:581:1: ( rule__Factor__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:581:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor1179);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:593:1: entryRuleFactorTail : ruleFactorTail EOF ;
    public final void entryRuleFactorTail() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:594:1: ( ruleFactorTail EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:595:1: ruleFactorTail EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailRule()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_entryRuleFactorTail1206);
            ruleFactorTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFactorTailRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactorTail1213); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:602:1: ruleFactorTail : ( ( rule__FactorTail__Alternatives ) ) ;
    public final void ruleFactorTail() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:606:2: ( ( ( rule__FactorTail__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:607:1: ( ( rule__FactorTail__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:607:1: ( ( rule__FactorTail__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:608:1: ( rule__FactorTail__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:609:1: ( rule__FactorTail__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:609:2: rule__FactorTail__Alternatives
            {
            pushFollow(FOLLOW_rule__FactorTail__Alternatives_in_ruleFactorTail1239);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:621:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:622:1: ( ruleTerm EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:623:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1266);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1273); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:630:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:634:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:635:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:635:1: ( ( rule__Term__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:636:1: ( rule__Term__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getAlternatives()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:637:1: ( rule__Term__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:637:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1299);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:649:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:650:1: ( ruleVariableAssignment EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:651:1: ruleVariableAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment1326);
            ruleVariableAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment1333); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:658:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:662:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:663:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:663:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:664:1: ( rule__VariableAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:665:1: ( rule__VariableAssignment__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:665:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment1359);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:677:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:678:1: ( ruleParenthesisExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:679:1: ruleParenthesisExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1386);
            ruleParenthesisExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParenthesisExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression1393); if (state.failed) return ;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:686:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:690:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:691:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:691:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:692:1: ( rule__ParenthesisExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:693:1: ( rule__ParenthesisExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:693:2: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1419);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:705:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:709:1: ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleNumericExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||LA1_2==12||(LA1_2>=14 && LA1_2<=15)||(LA1_2>=17 && LA1_2<=22)) ) {
                    alt1=3;
                }
                else if ( (LA1_2==23) ) {
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
            case RULE_NUM:
            case 14:
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:710:1: ( ruleFunctionDeclaration )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:710:1: ( ruleFunctionDeclaration )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:711:1: ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1455);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:716:6: ( ruleVariableAssignment )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:716:6: ( ruleVariableAssignment )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:717:1: ruleVariableAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1472);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:722:6: ( ruleNumericExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:722:6: ( ruleNumericExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:723:1: ruleNumericExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getNumericExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1489);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:733:1: rule__Body__Alternatives : ( ( ( rule__Body__ExpressionAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) );
    public final void rule__Body__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:737:1: ( ( ( rule__Body__ExpressionAssignment_0 ) ) | ( ( rule__Body__Group_1__0 ) ) )
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:738:1: ( ( rule__Body__ExpressionAssignment_0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:738:1: ( ( rule__Body__ExpressionAssignment_0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:739:1: ( rule__Body__ExpressionAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getExpressionAssignment_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:740:1: ( rule__Body__ExpressionAssignment_0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:740:2: rule__Body__ExpressionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Body__ExpressionAssignment_0_in_rule__Body__Alternatives1521);
                    rule__Body__ExpressionAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyAccess().getExpressionAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:744:6: ( ( rule__Body__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:744:6: ( ( rule__Body__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:745:1: ( rule__Body__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:746:1: ( rule__Body__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:746:2: rule__Body__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1539);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:755:1: rule__Functor__Alternatives : ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) );
    public final void rule__Functor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:759:1: ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:760:1: ( ruleSymbolReference )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:760:1: ( ruleSymbolReference )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:761:1: ruleSymbolReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1572);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:766:6: ( ruleParenthesisExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:766:6: ( ruleParenthesisExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:767:1: ruleParenthesisExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1589);
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


    // $ANTLR start "rule__ExprTail__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:777:1: rule__ExprTail__Alternatives : ( ( ( rule__ExprTail__Group_0__0 ) ) | ( ( rule__ExprTail__Group_1__0 ) ) );
    public final void rule__ExprTail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:781:1: ( ( ( rule__ExprTail__Group_0__0 ) ) | ( ( rule__ExprTail__Group_1__0 ) ) )
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:782:1: ( ( rule__ExprTail__Group_0__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:782:1: ( ( rule__ExprTail__Group_0__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:783:1: ( rule__ExprTail__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTailAccess().getGroup_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:784:1: ( rule__ExprTail__Group_0__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:784:2: rule__ExprTail__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprTail__Group_0__0_in_rule__ExprTail__Alternatives1621);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:788:6: ( ( rule__ExprTail__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:788:6: ( ( rule__ExprTail__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:789:1: ( rule__ExprTail__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTailAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:790:1: ( rule__ExprTail__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:790:2: rule__ExprTail__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprTail__Group_1__0_in_rule__ExprTail__Alternatives1639);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:799:1: rule__FactorTail__Alternatives : ( ( ( rule__FactorTail__Group_0__0 ) ) | ( ( rule__FactorTail__Group_1__0 ) ) );
    public final void rule__FactorTail__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:803:1: ( ( ( rule__FactorTail__Group_0__0 ) ) | ( ( rule__FactorTail__Group_1__0 ) ) )
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:804:1: ( ( rule__FactorTail__Group_0__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:804:1: ( ( rule__FactorTail__Group_0__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:805:1: ( rule__FactorTail__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getGroup_0()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:806:1: ( rule__FactorTail__Group_0__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:806:2: rule__FactorTail__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FactorTail__Group_0__0_in_rule__FactorTail__Alternatives1672);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:810:6: ( ( rule__FactorTail__Group_1__0 ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:810:6: ( ( rule__FactorTail__Group_1__0 ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:811:1: ( rule__FactorTail__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFactorTailAccess().getGroup_1()); 
                    }
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:812:1: ( rule__FactorTail__Group_1__0 )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:812:2: rule__FactorTail__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactorTail__Group_1__0_in_rule__FactorTail__Alternatives1690);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:821:1: rule__Term__Alternatives : ( ( ruleLiteralExpr ) | ( ruleApply ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:825:1: ( ( ruleLiteralExpr ) | ( ruleApply ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_NUM) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==14) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:826:1: ( ruleLiteralExpr )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:826:1: ( ruleLiteralExpr )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:827:1: ruleLiteralExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getLiteralExprParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1723);
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:832:6: ( ruleApply )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:832:6: ( ruleApply )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:833:1: ruleApply
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleApply_in_rule__Term__Alternatives1740);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:845:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:849:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:850:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01770);
            rule__Program__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01773);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:857:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:861:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:862:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:862:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:863:1: ( rule__Program__ExpressionsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:864:1: ( rule__Program__ExpressionsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:864:2: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1800);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:874:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:878:1: ( rule__Program__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:879:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11830);
            rule__Program__Group__1__Impl();

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:885:1: rule__Program__Group__1__Impl : ( ( rule__Program__TailAssignment_1 )? ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:889:1: ( ( ( rule__Program__TailAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( ( rule__Program__TailAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( ( rule__Program__TailAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:891:1: ( rule__Program__TailAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getTailAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:892:1: ( rule__Program__TailAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:892:2: rule__Program__TailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Program__TailAssignment_1_in_rule__Program__Group__1__Impl1857);
                    rule__Program__TailAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getTailAssignment_1()); 
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


    // $ANTLR start "rule__ProgramTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:906:1: rule__ProgramTail__Group__0 : rule__ProgramTail__Group__0__Impl rule__ProgramTail__Group__1 ;
    public final void rule__ProgramTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:910:1: ( rule__ProgramTail__Group__0__Impl rule__ProgramTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:911:2: rule__ProgramTail__Group__0__Impl rule__ProgramTail__Group__1
            {
            pushFollow(FOLLOW_rule__ProgramTail__Group__0__Impl_in_rule__ProgramTail__Group__01892);
            rule__ProgramTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProgramTail__Group__1_in_rule__ProgramTail__Group__01895);
            rule__ProgramTail__Group__1();

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
    // $ANTLR end "rule__ProgramTail__Group__0"


    // $ANTLR start "rule__ProgramTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:918:1: rule__ProgramTail__Group__0__Impl : ( ';' ) ;
    public final void rule__ProgramTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:922:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:923:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:923:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:924:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getSemicolonKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__ProgramTail__Group__0__Impl1923); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getSemicolonKeyword_0()); 
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
    // $ANTLR end "rule__ProgramTail__Group__0__Impl"


    // $ANTLR start "rule__ProgramTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:937:1: rule__ProgramTail__Group__1 : rule__ProgramTail__Group__1__Impl rule__ProgramTail__Group__2 ;
    public final void rule__ProgramTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:941:1: ( rule__ProgramTail__Group__1__Impl rule__ProgramTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:942:2: rule__ProgramTail__Group__1__Impl rule__ProgramTail__Group__2
            {
            pushFollow(FOLLOW_rule__ProgramTail__Group__1__Impl_in_rule__ProgramTail__Group__11954);
            rule__ProgramTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ProgramTail__Group__2_in_rule__ProgramTail__Group__11957);
            rule__ProgramTail__Group__2();

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
    // $ANTLR end "rule__ProgramTail__Group__1"


    // $ANTLR start "rule__ProgramTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:949:1: rule__ProgramTail__Group__1__Impl : ( ( rule__ProgramTail__ExpressionAssignment_1 ) ) ;
    public final void rule__ProgramTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:953:1: ( ( ( rule__ProgramTail__ExpressionAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:954:1: ( ( rule__ProgramTail__ExpressionAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:954:1: ( ( rule__ProgramTail__ExpressionAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:955:1: ( rule__ProgramTail__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getExpressionAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:956:1: ( rule__ProgramTail__ExpressionAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:956:2: rule__ProgramTail__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__ProgramTail__ExpressionAssignment_1_in_rule__ProgramTail__Group__1__Impl1984);
            rule__ProgramTail__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__ProgramTail__Group__1__Impl"


    // $ANTLR start "rule__ProgramTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:966:1: rule__ProgramTail__Group__2 : rule__ProgramTail__Group__2__Impl ;
    public final void rule__ProgramTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:970:1: ( rule__ProgramTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:971:2: rule__ProgramTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ProgramTail__Group__2__Impl_in_rule__ProgramTail__Group__22014);
            rule__ProgramTail__Group__2__Impl();

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
    // $ANTLR end "rule__ProgramTail__Group__2"


    // $ANTLR start "rule__ProgramTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:977:1: rule__ProgramTail__Group__2__Impl : ( ( rule__ProgramTail__TailAssignment_2 )? ) ;
    public final void rule__ProgramTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:981:1: ( ( ( rule__ProgramTail__TailAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:982:1: ( ( rule__ProgramTail__TailAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:982:1: ( ( rule__ProgramTail__TailAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:983:1: ( rule__ProgramTail__TailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getTailAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:984:1: ( rule__ProgramTail__TailAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:984:2: rule__ProgramTail__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ProgramTail__TailAssignment_2_in_rule__ProgramTail__Group__2__Impl2041);
                    rule__ProgramTail__TailAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getTailAssignment_2()); 
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
    // $ANTLR end "rule__ProgramTail__Group__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1000:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1004:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1005:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02078);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02081);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1012:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1016:1: ( ( 'func' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1017:1: ( 'func' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1017:1: ( 'func' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1018:1: 'func'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            }
            match(input,13,FOLLOW_13_in_rule__FunctionDeclaration__Group__0__Impl2109); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1031:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1035:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1036:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12140);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12143);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1043:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1047:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1048:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1048:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1049:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__FunctionDeclaration__Group__1__Impl2171); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1062:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1066:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1067:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22202);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22205);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1074:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1078:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1079:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1079:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1080:1: ( rule__FunctionDeclaration__ParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1081:1: ( rule__FunctionDeclaration__ParametersAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1081:2: rule__FunctionDeclaration__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2232);
                    rule__FunctionDeclaration__ParametersAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1091:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1095:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1096:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32263);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32266);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1103:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1107:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1108:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1108:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1109:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__FunctionDeclaration__Group__3__Impl2294); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1122:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1126:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1127:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42325);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1133:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1137:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1138:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1138:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1139:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1140:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1140:2: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl2352);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1160:1: rule__Body__Group_1__0 : rule__Body__Group_1__0__Impl rule__Body__Group_1__1 ;
    public final void rule__Body__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1164:1: ( rule__Body__Group_1__0__Impl rule__Body__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1165:2: rule__Body__Group_1__0__Impl rule__Body__Group_1__1
            {
            pushFollow(FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02392);
            rule__Body__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02395);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1172:1: rule__Body__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Body__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1176:1: ( ( '{' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1177:1: ( '{' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1177:1: ( '{' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1178:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_0()); 
            }
            match(input,16,FOLLOW_16_in_rule__Body__Group_1__0__Impl2423); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_1_0()); 
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
    // $ANTLR end "rule__Body__Group_1__0__Impl"


    // $ANTLR start "rule__Body__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1191:1: rule__Body__Group_1__1 : rule__Body__Group_1__1__Impl rule__Body__Group_1__2 ;
    public final void rule__Body__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1195:1: ( rule__Body__Group_1__1__Impl rule__Body__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1196:2: rule__Body__Group_1__1__Impl rule__Body__Group_1__2
            {
            pushFollow(FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12454);
            rule__Body__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12457);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1203:1: rule__Body__Group_1__1__Impl : ( ( rule__Body__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__Body__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1207:1: ( ( ( rule__Body__ExpressionsAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1208:1: ( ( rule__Body__ExpressionsAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1208:1: ( ( rule__Body__ExpressionsAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1209:1: ( rule__Body__ExpressionsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1210:1: ( rule__Body__ExpressionsAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1210:2: rule__Body__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Body__ExpressionsAssignment_1_1_in_rule__Body__Group_1__1__Impl2484);
            rule__Body__ExpressionsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsAssignment_1_1()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1220:1: rule__Body__Group_1__2 : rule__Body__Group_1__2__Impl rule__Body__Group_1__3 ;
    public final void rule__Body__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1224:1: ( rule__Body__Group_1__2__Impl rule__Body__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1225:2: rule__Body__Group_1__2__Impl rule__Body__Group_1__3
            {
            pushFollow(FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22514);
            rule__Body__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22517);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1232:1: rule__Body__Group_1__2__Impl : ( ( rule__Body__TailAssignment_1_2 )? ) ;
    public final void rule__Body__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1236:1: ( ( ( rule__Body__TailAssignment_1_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1237:1: ( ( rule__Body__TailAssignment_1_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1237:1: ( ( rule__Body__TailAssignment_1_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1238:1: ( rule__Body__TailAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getTailAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1239:1: ( rule__Body__TailAssignment_1_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1239:2: rule__Body__TailAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Body__TailAssignment_1_2_in_rule__Body__Group_1__2__Impl2544);
                    rule__Body__TailAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getTailAssignment_1_2()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1249:1: rule__Body__Group_1__3 : rule__Body__Group_1__3__Impl ;
    public final void rule__Body__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1253:1: ( rule__Body__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1254:2: rule__Body__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32575);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1260:1: rule__Body__Group_1__3__Impl : ( '}' ) ;
    public final void rule__Body__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1264:1: ( ( '}' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1265:1: ( '}' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1265:1: ( '}' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1266:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_1_3()); 
            }
            match(input,17,FOLLOW_17_in_rule__Body__Group_1__3__Impl2603); if (state.failed) return ;
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


    // $ANTLR start "rule__BodyTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1287:1: rule__BodyTail__Group__0 : rule__BodyTail__Group__0__Impl rule__BodyTail__Group__1 ;
    public final void rule__BodyTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1291:1: ( rule__BodyTail__Group__0__Impl rule__BodyTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1292:2: rule__BodyTail__Group__0__Impl rule__BodyTail__Group__1
            {
            pushFollow(FOLLOW_rule__BodyTail__Group__0__Impl_in_rule__BodyTail__Group__02642);
            rule__BodyTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BodyTail__Group__1_in_rule__BodyTail__Group__02645);
            rule__BodyTail__Group__1();

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
    // $ANTLR end "rule__BodyTail__Group__0"


    // $ANTLR start "rule__BodyTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1299:1: rule__BodyTail__Group__0__Impl : ( ';' ) ;
    public final void rule__BodyTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1303:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1304:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1304:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1305:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getSemicolonKeyword_0()); 
            }
            match(input,12,FOLLOW_12_in_rule__BodyTail__Group__0__Impl2673); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getSemicolonKeyword_0()); 
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
    // $ANTLR end "rule__BodyTail__Group__0__Impl"


    // $ANTLR start "rule__BodyTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1318:1: rule__BodyTail__Group__1 : rule__BodyTail__Group__1__Impl rule__BodyTail__Group__2 ;
    public final void rule__BodyTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1322:1: ( rule__BodyTail__Group__1__Impl rule__BodyTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1323:2: rule__BodyTail__Group__1__Impl rule__BodyTail__Group__2
            {
            pushFollow(FOLLOW_rule__BodyTail__Group__1__Impl_in_rule__BodyTail__Group__12704);
            rule__BodyTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BodyTail__Group__2_in_rule__BodyTail__Group__12707);
            rule__BodyTail__Group__2();

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
    // $ANTLR end "rule__BodyTail__Group__1"


    // $ANTLR start "rule__BodyTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1330:1: rule__BodyTail__Group__1__Impl : ( ( rule__BodyTail__ExpressionAssignment_1 ) ) ;
    public final void rule__BodyTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1334:1: ( ( ( rule__BodyTail__ExpressionAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( ( rule__BodyTail__ExpressionAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( ( rule__BodyTail__ExpressionAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:1: ( rule__BodyTail__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getExpressionAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1337:1: ( rule__BodyTail__ExpressionAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1337:2: rule__BodyTail__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__BodyTail__ExpressionAssignment_1_in_rule__BodyTail__Group__1__Impl2734);
            rule__BodyTail__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getExpressionAssignment_1()); 
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
    // $ANTLR end "rule__BodyTail__Group__1__Impl"


    // $ANTLR start "rule__BodyTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1347:1: rule__BodyTail__Group__2 : rule__BodyTail__Group__2__Impl ;
    public final void rule__BodyTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1351:1: ( rule__BodyTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1352:2: rule__BodyTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyTail__Group__2__Impl_in_rule__BodyTail__Group__22764);
            rule__BodyTail__Group__2__Impl();

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
    // $ANTLR end "rule__BodyTail__Group__2"


    // $ANTLR start "rule__BodyTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1358:1: rule__BodyTail__Group__2__Impl : ( ( rule__BodyTail__TailAssignment_2 )? ) ;
    public final void rule__BodyTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1362:1: ( ( ( rule__BodyTail__TailAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ( ( rule__BodyTail__TailAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ( ( rule__BodyTail__TailAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1364:1: ( rule__BodyTail__TailAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getTailAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:1: ( rule__BodyTail__TailAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1365:2: rule__BodyTail__TailAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BodyTail__TailAssignment_2_in_rule__BodyTail__Group__2__Impl2791);
                    rule__BodyTail__TailAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getTailAssignment_2()); 
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
    // $ANTLR end "rule__BodyTail__Group__2__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1381:1: rule__FunctionParameters__Group__0 : rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 ;
    public final void rule__FunctionParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1385:1: ( rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1386:2: rule__FunctionParameters__Group__0__Impl rule__FunctionParameters__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group__0__Impl_in_rule__FunctionParameters__Group__02828);
            rule__FunctionParameters__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParameters__Group__1_in_rule__FunctionParameters__Group__02831);
            rule__FunctionParameters__Group__1();

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
    // $ANTLR end "rule__FunctionParameters__Group__0"


    // $ANTLR start "rule__FunctionParameters__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1393:1: rule__FunctionParameters__Group__0__Impl : ( ( rule__FunctionParameters__ParameterAssignment_0 ) ) ;
    public final void rule__FunctionParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ( ( ( rule__FunctionParameters__ParameterAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1398:1: ( ( rule__FunctionParameters__ParameterAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1398:1: ( ( rule__FunctionParameters__ParameterAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1399:1: ( rule__FunctionParameters__ParameterAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParameterAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1400:1: ( rule__FunctionParameters__ParameterAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1400:2: rule__FunctionParameters__ParameterAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionParameters__ParameterAssignment_0_in_rule__FunctionParameters__Group__0__Impl2858);
            rule__FunctionParameters__ParameterAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParameterAssignment_0()); 
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
    // $ANTLR end "rule__FunctionParameters__Group__0__Impl"


    // $ANTLR start "rule__FunctionParameters__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1410:1: rule__FunctionParameters__Group__1 : rule__FunctionParameters__Group__1__Impl ;
    public final void rule__FunctionParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1414:1: ( rule__FunctionParameters__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1415:2: rule__FunctionParameters__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParameters__Group__1__Impl_in_rule__FunctionParameters__Group__12888);
            rule__FunctionParameters__Group__1__Impl();

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
    // $ANTLR end "rule__FunctionParameters__Group__1"


    // $ANTLR start "rule__FunctionParameters__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1421:1: rule__FunctionParameters__Group__1__Impl : ( ( rule__FunctionParameters__NextParametersAssignment_1 )? ) ;
    public final void rule__FunctionParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1425:1: ( ( ( rule__FunctionParameters__NextParametersAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1426:1: ( ( rule__FunctionParameters__NextParametersAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1426:1: ( ( rule__FunctionParameters__NextParametersAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1427:1: ( rule__FunctionParameters__NextParametersAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getNextParametersAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( rule__FunctionParameters__NextParametersAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:2: rule__FunctionParameters__NextParametersAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FunctionParameters__NextParametersAssignment_1_in_rule__FunctionParameters__Group__1__Impl2915);
                    rule__FunctionParameters__NextParametersAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getNextParametersAssignment_1()); 
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
    // $ANTLR end "rule__FunctionParameters__Group__1__Impl"


    // $ANTLR start "rule__FunctionParametersTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1442:1: rule__FunctionParametersTail__Group__0 : rule__FunctionParametersTail__Group__0__Impl rule__FunctionParametersTail__Group__1 ;
    public final void rule__FunctionParametersTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1446:1: ( rule__FunctionParametersTail__Group__0__Impl rule__FunctionParametersTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1447:2: rule__FunctionParametersTail__Group__0__Impl rule__FunctionParametersTail__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__0__Impl_in_rule__FunctionParametersTail__Group__02950);
            rule__FunctionParametersTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__1_in_rule__FunctionParametersTail__Group__02953);
            rule__FunctionParametersTail__Group__1();

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
    // $ANTLR end "rule__FunctionParametersTail__Group__0"


    // $ANTLR start "rule__FunctionParametersTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1454:1: rule__FunctionParametersTail__Group__0__Impl : ( ',' ) ;
    public final void rule__FunctionParametersTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1459:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1460:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getCommaKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionParametersTail__Group__0__Impl2981); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getCommaKeyword_0()); 
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
    // $ANTLR end "rule__FunctionParametersTail__Group__0__Impl"


    // $ANTLR start "rule__FunctionParametersTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1473:1: rule__FunctionParametersTail__Group__1 : rule__FunctionParametersTail__Group__1__Impl rule__FunctionParametersTail__Group__2 ;
    public final void rule__FunctionParametersTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1477:1: ( rule__FunctionParametersTail__Group__1__Impl rule__FunctionParametersTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1478:2: rule__FunctionParametersTail__Group__1__Impl rule__FunctionParametersTail__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__1__Impl_in_rule__FunctionParametersTail__Group__13012);
            rule__FunctionParametersTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__2_in_rule__FunctionParametersTail__Group__13015);
            rule__FunctionParametersTail__Group__2();

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
    // $ANTLR end "rule__FunctionParametersTail__Group__1"


    // $ANTLR start "rule__FunctionParametersTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1485:1: rule__FunctionParametersTail__Group__1__Impl : ( ( rule__FunctionParametersTail__ParameterAssignment_1 ) ) ;
    public final void rule__FunctionParametersTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1489:1: ( ( ( rule__FunctionParametersTail__ParameterAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1490:1: ( ( rule__FunctionParametersTail__ParameterAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1490:1: ( ( rule__FunctionParametersTail__ParameterAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1491:1: ( rule__FunctionParametersTail__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getParameterAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1492:1: ( rule__FunctionParametersTail__ParameterAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1492:2: rule__FunctionParametersTail__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionParametersTail__ParameterAssignment_1_in_rule__FunctionParametersTail__Group__1__Impl3042);
            rule__FunctionParametersTail__ParameterAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getParameterAssignment_1()); 
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
    // $ANTLR end "rule__FunctionParametersTail__Group__1__Impl"


    // $ANTLR start "rule__FunctionParametersTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1502:1: rule__FunctionParametersTail__Group__2 : rule__FunctionParametersTail__Group__2__Impl ;
    public final void rule__FunctionParametersTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1506:1: ( rule__FunctionParametersTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1507:2: rule__FunctionParametersTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionParametersTail__Group__2__Impl_in_rule__FunctionParametersTail__Group__23072);
            rule__FunctionParametersTail__Group__2__Impl();

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
    // $ANTLR end "rule__FunctionParametersTail__Group__2"


    // $ANTLR start "rule__FunctionParametersTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1513:1: rule__FunctionParametersTail__Group__2__Impl : ( ( rule__FunctionParametersTail__NextParametersAssignment_2 )? ) ;
    public final void rule__FunctionParametersTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1517:1: ( ( ( rule__FunctionParametersTail__NextParametersAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1518:1: ( ( rule__FunctionParametersTail__NextParametersAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1518:1: ( ( rule__FunctionParametersTail__NextParametersAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1519:1: ( rule__FunctionParametersTail__NextParametersAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getNextParametersAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:1: ( rule__FunctionParametersTail__NextParametersAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:2: rule__FunctionParametersTail__NextParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionParametersTail__NextParametersAssignment_2_in_rule__FunctionParametersTail__Group__2__Impl3099);
                    rule__FunctionParametersTail__NextParametersAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getNextParametersAssignment_2()); 
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
    // $ANTLR end "rule__FunctionParametersTail__Group__2__Impl"


    // $ANTLR start "rule__Apply__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1536:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1540:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1541:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__03136);
            rule__Apply__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__03139);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1548:1: rule__Apply__Group__0__Impl : ( ( rule__Apply__FunctorAssignment_0 ) ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1552:1: ( ( ( rule__Apply__FunctorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1553:1: ( ( rule__Apply__FunctorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1553:1: ( ( rule__Apply__FunctorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1554:1: ( rule__Apply__FunctorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getFunctorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1555:1: ( rule__Apply__FunctorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1555:2: rule__Apply__FunctorAssignment_0
            {
            pushFollow(FOLLOW_rule__Apply__FunctorAssignment_0_in_rule__Apply__Group__0__Impl3166);
            rule__Apply__FunctorAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getFunctorAssignment_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1565:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1569:1: ( rule__Apply__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1570:2: rule__Apply__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__13196);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1576:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__ArgumentsAssignment_1 )? ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1580:1: ( ( ( rule__Apply__ArgumentsAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1581:1: ( ( rule__Apply__ArgumentsAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1581:1: ( ( rule__Apply__ArgumentsAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1582:1: ( rule__Apply__ArgumentsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1583:1: ( rule__Apply__ArgumentsAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1583:2: rule__Apply__ArgumentsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_in_rule__Apply__Group__1__Impl3223);
                    rule__Apply__ArgumentsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsAssignment_1()); 
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


    // $ANTLR start "rule__ApplyTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1597:1: rule__ApplyTail__Group__0 : rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1 ;
    public final void rule__ApplyTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1601:1: ( rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1602:2: rule__ApplyTail__Group__0__Impl rule__ApplyTail__Group__1
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__0__Impl_in_rule__ApplyTail__Group__03258);
            rule__ApplyTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__1_in_rule__ApplyTail__Group__03261);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1609:1: rule__ApplyTail__Group__0__Impl : ( () ) ;
    public final void rule__ApplyTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1613:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1614:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1614:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1615:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getApplyFunctionAlphaAction_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1616:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1618:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getApplyFunctionAlphaAction_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1628:1: rule__ApplyTail__Group__1 : rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2 ;
    public final void rule__ApplyTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1632:1: ( rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1633:2: rule__ApplyTail__Group__1__Impl rule__ApplyTail__Group__2
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__1__Impl_in_rule__ApplyTail__Group__13319);
            rule__ApplyTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__2_in_rule__ApplyTail__Group__13322);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1640:1: rule__ApplyTail__Group__1__Impl : ( '(' ) ;
    public final void rule__ApplyTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1644:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1645:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1645:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1646:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__ApplyTail__Group__1__Impl3350); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1659:1: rule__ApplyTail__Group__2 : rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3 ;
    public final void rule__ApplyTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1663:1: ( rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1664:2: rule__ApplyTail__Group__2__Impl rule__ApplyTail__Group__3
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__2__Impl_in_rule__ApplyTail__Group__23381);
            rule__ApplyTail__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__3_in_rule__ApplyTail__Group__23384);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1671:1: rule__ApplyTail__Group__2__Impl : ( ( rule__ApplyTail__ArgsAssignment_2 )? ) ;
    public final void rule__ApplyTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1675:1: ( ( ( rule__ApplyTail__ArgsAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1676:1: ( ( rule__ApplyTail__ArgsAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1676:1: ( ( rule__ApplyTail__ArgsAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1677:1: ( rule__ApplyTail__ArgsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgsAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1678:1: ( rule__ApplyTail__ArgsAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_NUM)||(LA15_0>=13 && LA15_0<=14)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1678:2: rule__ApplyTail__ArgsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ApplyTail__ArgsAssignment_2_in_rule__ApplyTail__Group__2__Impl3411);
                    rule__ApplyTail__ArgsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgsAssignment_2()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1688:1: rule__ApplyTail__Group__3 : rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4 ;
    public final void rule__ApplyTail__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1692:1: ( rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1693:2: rule__ApplyTail__Group__3__Impl rule__ApplyTail__Group__4
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__3__Impl_in_rule__ApplyTail__Group__33442);
            rule__ApplyTail__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ApplyTail__Group__4_in_rule__ApplyTail__Group__33445);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1700:1: rule__ApplyTail__Group__3__Impl : ( ')' ) ;
    public final void rule__ApplyTail__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1704:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1705:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1705:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1706:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,15,FOLLOW_15_in_rule__ApplyTail__Group__3__Impl3473); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1719:1: rule__ApplyTail__Group__4 : rule__ApplyTail__Group__4__Impl ;
    public final void rule__ApplyTail__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1723:1: ( rule__ApplyTail__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1724:2: rule__ApplyTail__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ApplyTail__Group__4__Impl_in_rule__ApplyTail__Group__43504);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1730:1: rule__ApplyTail__Group__4__Impl : ( ( rule__ApplyTail__NextCallAssignment_4 )? ) ;
    public final void rule__ApplyTail__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1734:1: ( ( ( rule__ApplyTail__NextCallAssignment_4 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1735:1: ( ( rule__ApplyTail__NextCallAssignment_4 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1735:1: ( ( rule__ApplyTail__NextCallAssignment_4 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1736:1: ( rule__ApplyTail__NextCallAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getNextCallAssignment_4()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1737:1: ( rule__ApplyTail__NextCallAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1737:2: rule__ApplyTail__NextCallAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ApplyTail__NextCallAssignment_4_in_rule__ApplyTail__Group__4__Impl3531);
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


    // $ANTLR start "rule__FunctionArguments__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1757:1: rule__FunctionArguments__Group__0 : rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1 ;
    public final void rule__FunctionArguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1761:1: ( rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1762:2: rule__FunctionArguments__Group__0__Impl rule__FunctionArguments__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__0__Impl_in_rule__FunctionArguments__Group__03572);
            rule__FunctionArguments__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionArguments__Group__1_in_rule__FunctionArguments__Group__03575);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1769:1: rule__FunctionArguments__Group__0__Impl : ( ( rule__FunctionArguments__ArgumentAssignment_0 ) ) ;
    public final void rule__FunctionArguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1773:1: ( ( ( rule__FunctionArguments__ArgumentAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1774:1: ( ( rule__FunctionArguments__ArgumentAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1774:1: ( ( rule__FunctionArguments__ArgumentAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1775:1: ( rule__FunctionArguments__ArgumentAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1776:1: ( rule__FunctionArguments__ArgumentAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1776:2: rule__FunctionArguments__ArgumentAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionArguments__ArgumentAssignment_0_in_rule__FunctionArguments__Group__0__Impl3602);
            rule__FunctionArguments__ArgumentAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentAssignment_0()); 
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1786:1: rule__FunctionArguments__Group__1 : rule__FunctionArguments__Group__1__Impl ;
    public final void rule__FunctionArguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1790:1: ( rule__FunctionArguments__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1791:2: rule__FunctionArguments__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArguments__Group__1__Impl_in_rule__FunctionArguments__Group__13632);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1797:1: rule__FunctionArguments__Group__1__Impl : ( ( rule__FunctionArguments__NextArgumentsAssignment_1 )? ) ;
    public final void rule__FunctionArguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1801:1: ( ( ( rule__FunctionArguments__NextArgumentsAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1802:1: ( ( rule__FunctionArguments__NextArgumentsAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1802:1: ( ( rule__FunctionArguments__NextArgumentsAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1803:1: ( rule__FunctionArguments__NextArgumentsAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:1: ( rule__FunctionArguments__NextArgumentsAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:2: rule__FunctionArguments__NextArgumentsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FunctionArguments__NextArgumentsAssignment_1_in_rule__FunctionArguments__Group__1__Impl3659);
                    rule__FunctionArguments__NextArgumentsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsAssignment_1()); 
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


    // $ANTLR start "rule__FunctionArgumentsTail__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1818:1: rule__FunctionArgumentsTail__Group__0 : rule__FunctionArgumentsTail__Group__0__Impl rule__FunctionArgumentsTail__Group__1 ;
    public final void rule__FunctionArgumentsTail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1822:1: ( rule__FunctionArgumentsTail__Group__0__Impl rule__FunctionArgumentsTail__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1823:2: rule__FunctionArgumentsTail__Group__0__Impl rule__FunctionArgumentsTail__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__0__Impl_in_rule__FunctionArgumentsTail__Group__03694);
            rule__FunctionArgumentsTail__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__1_in_rule__FunctionArgumentsTail__Group__03697);
            rule__FunctionArgumentsTail__Group__1();

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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__0"


    // $ANTLR start "rule__FunctionArgumentsTail__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1830:1: rule__FunctionArgumentsTail__Group__0__Impl : ( ',' ) ;
    public final void rule__FunctionArgumentsTail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1834:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1835:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1835:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1836:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getCommaKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__FunctionArgumentsTail__Group__0__Impl3725); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getCommaKeyword_0()); 
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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__0__Impl"


    // $ANTLR start "rule__FunctionArgumentsTail__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1849:1: rule__FunctionArgumentsTail__Group__1 : rule__FunctionArgumentsTail__Group__1__Impl rule__FunctionArgumentsTail__Group__2 ;
    public final void rule__FunctionArgumentsTail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1853:1: ( rule__FunctionArgumentsTail__Group__1__Impl rule__FunctionArgumentsTail__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1854:2: rule__FunctionArgumentsTail__Group__1__Impl rule__FunctionArgumentsTail__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__1__Impl_in_rule__FunctionArgumentsTail__Group__13756);
            rule__FunctionArgumentsTail__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__2_in_rule__FunctionArgumentsTail__Group__13759);
            rule__FunctionArgumentsTail__Group__2();

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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__1"


    // $ANTLR start "rule__FunctionArgumentsTail__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1861:1: rule__FunctionArgumentsTail__Group__1__Impl : ( ( rule__FunctionArgumentsTail__ArgumentAssignment_1 ) ) ;
    public final void rule__FunctionArgumentsTail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1865:1: ( ( ( rule__FunctionArgumentsTail__ArgumentAssignment_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1866:1: ( ( rule__FunctionArgumentsTail__ArgumentAssignment_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1866:1: ( ( rule__FunctionArgumentsTail__ArgumentAssignment_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1867:1: ( rule__FunctionArgumentsTail__ArgumentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getArgumentAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:1: ( rule__FunctionArgumentsTail__ArgumentAssignment_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:2: rule__FunctionArgumentsTail__ArgumentAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__ArgumentAssignment_1_in_rule__FunctionArgumentsTail__Group__1__Impl3786);
            rule__FunctionArgumentsTail__ArgumentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getArgumentAssignment_1()); 
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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__1__Impl"


    // $ANTLR start "rule__FunctionArgumentsTail__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1878:1: rule__FunctionArgumentsTail__Group__2 : rule__FunctionArgumentsTail__Group__2__Impl ;
    public final void rule__FunctionArgumentsTail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1882:1: ( rule__FunctionArgumentsTail__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1883:2: rule__FunctionArgumentsTail__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArgumentsTail__Group__2__Impl_in_rule__FunctionArgumentsTail__Group__23816);
            rule__FunctionArgumentsTail__Group__2__Impl();

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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__2"


    // $ANTLR start "rule__FunctionArgumentsTail__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1889:1: rule__FunctionArgumentsTail__Group__2__Impl : ( ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )? ) ;
    public final void rule__FunctionArgumentsTail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1893:1: ( ( ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1894:1: ( ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1894:1: ( ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1895:1: ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:1: ( rule__FunctionArgumentsTail__NextArgumentsAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1896:2: rule__FunctionArgumentsTail__NextArgumentsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionArgumentsTail__NextArgumentsAssignment_2_in_rule__FunctionArgumentsTail__Group__2__Impl3843);
                    rule__FunctionArgumentsTail__NextArgumentsAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsAssignment_2()); 
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
    // $ANTLR end "rule__FunctionArgumentsTail__Group__2__Impl"


    // $ANTLR start "rule__NumericExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1912:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1916:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1917:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03880);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03883);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1924:1: rule__NumericExpression__Group__0__Impl : ( ( rule__NumericExpression__FactorAssignment_0 ) ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1928:1: ( ( ( rule__NumericExpression__FactorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1929:1: ( ( rule__NumericExpression__FactorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1929:1: ( ( rule__NumericExpression__FactorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1930:1: ( rule__NumericExpression__FactorAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:1: ( rule__NumericExpression__FactorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:2: rule__NumericExpression__FactorAssignment_0
            {
            pushFollow(FOLLOW_rule__NumericExpression__FactorAssignment_0_in_rule__NumericExpression__Group__0__Impl3910);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1941:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1945:1: ( rule__NumericExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1946:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13940);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1952:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__ExprTailAssignment_1 )? ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1956:1: ( ( ( rule__NumericExpression__ExprTailAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1957:1: ( ( rule__NumericExpression__ExprTailAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1957:1: ( ( rule__NumericExpression__ExprTailAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1958:1: ( rule__NumericExpression__ExprTailAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getExprTailAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:1: ( rule__NumericExpression__ExprTailAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=19 && LA19_0<=20)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1959:2: rule__NumericExpression__ExprTailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NumericExpression__ExprTailAssignment_1_in_rule__NumericExpression__Group__1__Impl3967);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1973:1: rule__ExprTail__Group_0__0 : rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1 ;
    public final void rule__ExprTail__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1977:1: ( rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1978:2: rule__ExprTail__Group_0__0__Impl rule__ExprTail__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__0__Impl_in_rule__ExprTail__Group_0__04002);
            rule__ExprTail__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_0__1_in_rule__ExprTail__Group_0__04005);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1985:1: rule__ExprTail__Group_0__0__Impl : ( '+' ) ;
    public final void rule__ExprTail__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1989:1: ( ( '+' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1990:1: ( '+' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1990:1: ( '+' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1991:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getPlusSignKeyword_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__ExprTail__Group_0__0__Impl4033); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2004:1: rule__ExprTail__Group_0__1 : rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2 ;
    public final void rule__ExprTail__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2008:1: ( rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2009:2: rule__ExprTail__Group_0__1__Impl rule__ExprTail__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__1__Impl_in_rule__ExprTail__Group_0__14064);
            rule__ExprTail__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_0__2_in_rule__ExprTail__Group_0__14067);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2016:1: rule__ExprTail__Group_0__1__Impl : ( ( rule__ExprTail__FactorAssignment_0_1 ) ) ;
    public final void rule__ExprTail__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2020:1: ( ( ( rule__ExprTail__FactorAssignment_0_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2021:1: ( ( rule__ExprTail__FactorAssignment_0_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2021:1: ( ( rule__ExprTail__FactorAssignment_0_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2022:1: ( rule__ExprTail__FactorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorAssignment_0_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2023:1: ( rule__ExprTail__FactorAssignment_0_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2023:2: rule__ExprTail__FactorAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ExprTail__FactorAssignment_0_1_in_rule__ExprTail__Group_0__1__Impl4094);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2033:1: rule__ExprTail__Group_0__2 : rule__ExprTail__Group_0__2__Impl ;
    public final void rule__ExprTail__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2037:1: ( rule__ExprTail__Group_0__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2038:2: rule__ExprTail__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_0__2__Impl_in_rule__ExprTail__Group_0__24124);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2044:1: rule__ExprTail__Group_0__2__Impl : ( ( rule__ExprTail__ExprTailAssignment_0_2 )? ) ;
    public final void rule__ExprTail__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2048:1: ( ( ( rule__ExprTail__ExprTailAssignment_0_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2049:1: ( ( rule__ExprTail__ExprTailAssignment_0_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2049:1: ( ( rule__ExprTail__ExprTailAssignment_0_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2050:1: ( rule__ExprTail__ExprTailAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailAssignment_0_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:1: ( rule__ExprTail__ExprTailAssignment_0_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=19 && LA20_0<=20)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2051:2: rule__ExprTail__ExprTailAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__ExprTail__ExprTailAssignment_0_2_in_rule__ExprTail__Group_0__2__Impl4151);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2067:1: rule__ExprTail__Group_1__0 : rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1 ;
    public final void rule__ExprTail__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2071:1: ( rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2072:2: rule__ExprTail__Group_1__0__Impl rule__ExprTail__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__0__Impl_in_rule__ExprTail__Group_1__04188);
            rule__ExprTail__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_1__1_in_rule__ExprTail__Group_1__04191);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2079:1: rule__ExprTail__Group_1__0__Impl : ( '-' ) ;
    public final void rule__ExprTail__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2083:1: ( ( '-' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2084:1: ( '-' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2084:1: ( '-' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2085:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getHyphenMinusKeyword_1_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__ExprTail__Group_1__0__Impl4219); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2098:1: rule__ExprTail__Group_1__1 : rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2 ;
    public final void rule__ExprTail__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2102:1: ( rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2103:2: rule__ExprTail__Group_1__1__Impl rule__ExprTail__Group_1__2
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__1__Impl_in_rule__ExprTail__Group_1__14250);
            rule__ExprTail__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTail__Group_1__2_in_rule__ExprTail__Group_1__14253);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2110:1: rule__ExprTail__Group_1__1__Impl : ( ( rule__ExprTail__FactorAssignment_1_1 ) ) ;
    public final void rule__ExprTail__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2114:1: ( ( ( rule__ExprTail__FactorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2115:1: ( ( rule__ExprTail__FactorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2115:1: ( ( rule__ExprTail__FactorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2116:1: ( rule__ExprTail__FactorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2117:1: ( rule__ExprTail__FactorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2117:2: rule__ExprTail__FactorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExprTail__FactorAssignment_1_1_in_rule__ExprTail__Group_1__1__Impl4280);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2127:1: rule__ExprTail__Group_1__2 : rule__ExprTail__Group_1__2__Impl ;
    public final void rule__ExprTail__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2131:1: ( rule__ExprTail__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2132:2: rule__ExprTail__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprTail__Group_1__2__Impl_in_rule__ExprTail__Group_1__24310);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2138:1: rule__ExprTail__Group_1__2__Impl : ( ( rule__ExprTail__ExprTailAssignment_1_2 )? ) ;
    public final void rule__ExprTail__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2142:1: ( ( ( rule__ExprTail__ExprTailAssignment_1_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2143:1: ( ( rule__ExprTail__ExprTailAssignment_1_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2143:1: ( ( rule__ExprTail__ExprTailAssignment_1_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2144:1: ( rule__ExprTail__ExprTailAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2145:1: ( rule__ExprTail__ExprTailAssignment_1_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=19 && LA21_0<=20)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2145:2: rule__ExprTail__ExprTailAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__ExprTail__ExprTailAssignment_1_2_in_rule__ExprTail__Group_1__2__Impl4337);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2161:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2165:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2166:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__04374);
            rule__Factor__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__04377);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2173:1: rule__Factor__Group__0__Impl : ( ( rule__Factor__TermAssignment_0 ) ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2177:1: ( ( ( rule__Factor__TermAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2178:1: ( ( rule__Factor__TermAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2178:1: ( ( rule__Factor__TermAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2179:1: ( rule__Factor__TermAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2180:1: ( rule__Factor__TermAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2180:2: rule__Factor__TermAssignment_0
            {
            pushFollow(FOLLOW_rule__Factor__TermAssignment_0_in_rule__Factor__Group__0__Impl4404);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2190:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2194:1: ( rule__Factor__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2195:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__14434);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2201:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__FactorTailAssignment_1 )? ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2205:1: ( ( ( rule__Factor__FactorTailAssignment_1 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2206:1: ( ( rule__Factor__FactorTailAssignment_1 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2206:1: ( ( rule__Factor__FactorTailAssignment_1 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2207:1: ( rule__Factor__FactorTailAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailAssignment_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2208:1: ( rule__Factor__FactorTailAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=21 && LA22_0<=22)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2208:2: rule__Factor__FactorTailAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Factor__FactorTailAssignment_1_in_rule__Factor__Group__1__Impl4461);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2222:1: rule__FactorTail__Group_0__0 : rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1 ;
    public final void rule__FactorTail__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2226:1: ( rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2227:2: rule__FactorTail__Group_0__0__Impl rule__FactorTail__Group_0__1
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__0__Impl_in_rule__FactorTail__Group_0__04496);
            rule__FactorTail__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_0__1_in_rule__FactorTail__Group_0__04499);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2234:1: rule__FactorTail__Group_0__0__Impl : ( '*' ) ;
    public final void rule__FactorTail__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2238:1: ( ( '*' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2239:1: ( '*' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2239:1: ( '*' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2240:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getAsteriskKeyword_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__FactorTail__Group_0__0__Impl4527); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2253:1: rule__FactorTail__Group_0__1 : rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2 ;
    public final void rule__FactorTail__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2257:1: ( rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2258:2: rule__FactorTail__Group_0__1__Impl rule__FactorTail__Group_0__2
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__1__Impl_in_rule__FactorTail__Group_0__14558);
            rule__FactorTail__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_0__2_in_rule__FactorTail__Group_0__14561);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2265:1: rule__FactorTail__Group_0__1__Impl : ( ( rule__FactorTail__TermAssignment_0_1 ) ) ;
    public final void rule__FactorTail__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2269:1: ( ( ( rule__FactorTail__TermAssignment_0_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2270:1: ( ( rule__FactorTail__TermAssignment_0_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2270:1: ( ( rule__FactorTail__TermAssignment_0_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2271:1: ( rule__FactorTail__TermAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermAssignment_0_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2272:1: ( rule__FactorTail__TermAssignment_0_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2272:2: rule__FactorTail__TermAssignment_0_1
            {
            pushFollow(FOLLOW_rule__FactorTail__TermAssignment_0_1_in_rule__FactorTail__Group_0__1__Impl4588);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2282:1: rule__FactorTail__Group_0__2 : rule__FactorTail__Group_0__2__Impl ;
    public final void rule__FactorTail__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2286:1: ( rule__FactorTail__Group_0__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2287:2: rule__FactorTail__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_0__2__Impl_in_rule__FactorTail__Group_0__24618);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2293:1: rule__FactorTail__Group_0__2__Impl : ( ( rule__FactorTail__FactorTailAssignment_0_2 )? ) ;
    public final void rule__FactorTail__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2297:1: ( ( ( rule__FactorTail__FactorTailAssignment_0_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2298:1: ( ( rule__FactorTail__FactorTailAssignment_0_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2298:1: ( ( rule__FactorTail__FactorTailAssignment_0_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2299:1: ( rule__FactorTail__FactorTailAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailAssignment_0_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2300:1: ( rule__FactorTail__FactorTailAssignment_0_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=21 && LA23_0<=22)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2300:2: rule__FactorTail__FactorTailAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__FactorTail__FactorTailAssignment_0_2_in_rule__FactorTail__Group_0__2__Impl4645);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2316:1: rule__FactorTail__Group_1__0 : rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1 ;
    public final void rule__FactorTail__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2320:1: ( rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2321:2: rule__FactorTail__Group_1__0__Impl rule__FactorTail__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__0__Impl_in_rule__FactorTail__Group_1__04682);
            rule__FactorTail__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_1__1_in_rule__FactorTail__Group_1__04685);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2328:1: rule__FactorTail__Group_1__0__Impl : ( '/' ) ;
    public final void rule__FactorTail__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2332:1: ( ( '/' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2333:1: ( '/' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2333:1: ( '/' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2334:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getSolidusKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__FactorTail__Group_1__0__Impl4713); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2347:1: rule__FactorTail__Group_1__1 : rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2 ;
    public final void rule__FactorTail__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2351:1: ( rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2352:2: rule__FactorTail__Group_1__1__Impl rule__FactorTail__Group_1__2
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__1__Impl_in_rule__FactorTail__Group_1__14744);
            rule__FactorTail__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FactorTail__Group_1__2_in_rule__FactorTail__Group_1__14747);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2359:1: rule__FactorTail__Group_1__1__Impl : ( ( rule__FactorTail__TermAssignment_1_1 ) ) ;
    public final void rule__FactorTail__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2363:1: ( ( ( rule__FactorTail__TermAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2364:1: ( ( rule__FactorTail__TermAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2364:1: ( ( rule__FactorTail__TermAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2365:1: ( rule__FactorTail__TermAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermAssignment_1_1()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2366:1: ( rule__FactorTail__TermAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2366:2: rule__FactorTail__TermAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FactorTail__TermAssignment_1_1_in_rule__FactorTail__Group_1__1__Impl4774);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2376:1: rule__FactorTail__Group_1__2 : rule__FactorTail__Group_1__2__Impl ;
    public final void rule__FactorTail__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2380:1: ( rule__FactorTail__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2381:2: rule__FactorTail__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FactorTail__Group_1__2__Impl_in_rule__FactorTail__Group_1__24804);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2387:1: rule__FactorTail__Group_1__2__Impl : ( ( rule__FactorTail__FactorTailAssignment_1_2 )? ) ;
    public final void rule__FactorTail__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2391:1: ( ( ( rule__FactorTail__FactorTailAssignment_1_2 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2392:1: ( ( rule__FactorTail__FactorTailAssignment_1_2 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2392:1: ( ( rule__FactorTail__FactorTailAssignment_1_2 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2393:1: ( rule__FactorTail__FactorTailAssignment_1_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailAssignment_1_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2394:1: ( rule__FactorTail__FactorTailAssignment_1_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=21 && LA24_0<=22)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2394:2: rule__FactorTail__FactorTailAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__FactorTail__FactorTailAssignment_1_2_in_rule__FactorTail__Group_1__2__Impl4831);
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


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2410:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2414:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2415:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04868);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04871);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2422:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__IdAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2426:1: ( ( ( rule__VariableAssignment__IdAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2427:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2427:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2428:1: ( rule__VariableAssignment__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:1: ( rule__VariableAssignment__IdAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:2: rule__VariableAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl4898);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2439:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2443:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14928);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14931);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2451:1: rule__VariableAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2455:1: ( ( '=' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2456:1: ( '=' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2456:1: ( '=' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2457:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__VariableAssignment__Group__1__Impl4959); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2470:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2474:1: ( rule__VariableAssignment__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2475:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24990);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2481:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2485:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2486:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2486:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2487:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            }
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2488:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2488:2: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl5017);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2504:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2508:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2509:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__05053);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__05056);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2516:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2520:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2521:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2521:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2522:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__ParenthesisExpression__Group__0__Impl5084); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2535:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2539:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2540:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__15115);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__15118);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2547:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2551:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2552:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2552:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2553:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl5145);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2564:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2568:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2569:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__25174);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2575:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2579:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2580:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2580:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2581:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__ParenthesisExpression__Group__2__Impl5202); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2601:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2605:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2606:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2606:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2607:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_05244);
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


    // $ANTLR start "rule__Program__TailAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2616:1: rule__Program__TailAssignment_1 : ( ruleProgramTail ) ;
    public final void rule__Program__TailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2620:1: ( ( ruleProgramTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2621:1: ( ruleProgramTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2621:1: ( ruleProgramTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2622:1: ruleProgramTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramAccess().getTailProgramTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleProgramTail_in_rule__Program__TailAssignment_15275);
            ruleProgramTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramAccess().getTailProgramTailParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Program__TailAssignment_1"


    // $ANTLR start "rule__ProgramTail__ExpressionAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2631:1: rule__ProgramTail__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ProgramTail__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2635:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2636:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2636:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2637:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__ProgramTail__ExpressionAssignment_15306);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ProgramTail__ExpressionAssignment_1"


    // $ANTLR start "rule__ProgramTail__TailAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2646:1: rule__ProgramTail__TailAssignment_2 : ( ruleProgramTail ) ;
    public final void rule__ProgramTail__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2650:1: ( ( ruleProgramTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2651:1: ( ruleProgramTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2651:1: ( ruleProgramTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2652:1: ruleProgramTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProgramTailAccess().getTailProgramTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleProgramTail_in_rule__ProgramTail__TailAssignment_25337);
            ruleProgramTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProgramTailAccess().getTailProgramTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ProgramTail__TailAssignment_2"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2661:1: rule__FunctionDeclaration__ParametersAssignment_2 : ( ruleFunctionParameters ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2665:1: ( ( ruleFunctionParameters ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2666:1: ( ruleFunctionParameters )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2666:1: ( ruleFunctionParameters )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2667:1: ruleFunctionParameters
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getParametersFunctionParametersParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionParameters_in_rule__FunctionDeclaration__ParametersAssignment_25368);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2676:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleBody ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2680:1: ( ( ruleBody ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2681:1: ( ruleBody )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2681:1: ( ruleBody )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2682:1: ruleBody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionDeclarationAccess().getBodyBodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_45399);
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


    // $ANTLR start "rule__Body__ExpressionAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2691:1: rule__Body__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2695:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2696:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2696:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2697:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionAssignment_05430);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Body__ExpressionAssignment_0"


    // $ANTLR start "rule__Body__ExpressionsAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2706:1: rule__Body__ExpressionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2710:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2711:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2711:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2712:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_15461);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Body__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__Body__TailAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2721:1: rule__Body__TailAssignment_1_2 : ( ruleBodyTail ) ;
    public final void rule__Body__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2725:1: ( ( ruleBodyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2726:1: ( ruleBodyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2726:1: ( ruleBodyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2727:1: ruleBodyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyAccess().getTailBodyTailParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleBodyTail_in_rule__Body__TailAssignment_1_25492);
            ruleBodyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyAccess().getTailBodyTailParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Body__TailAssignment_1_2"


    // $ANTLR start "rule__BodyTail__ExpressionAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2736:1: rule__BodyTail__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__BodyTail__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2740:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2741:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2741:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2742:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__BodyTail__ExpressionAssignment_15523);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getExpressionExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BodyTail__ExpressionAssignment_1"


    // $ANTLR start "rule__BodyTail__TailAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2751:1: rule__BodyTail__TailAssignment_2 : ( ruleBodyTail ) ;
    public final void rule__BodyTail__TailAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2755:1: ( ( ruleBodyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2756:1: ( ruleBodyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2756:1: ( ruleBodyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2757:1: ruleBodyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyTailAccess().getTailBodyTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleBodyTail_in_rule__BodyTail__TailAssignment_25554);
            ruleBodyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyTailAccess().getTailBodyTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BodyTail__TailAssignment_2"


    // $ANTLR start "rule__FunctionParameters__ParameterAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2766:1: rule__FunctionParameters__ParameterAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionParameters__ParameterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2770:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2771:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2771:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2772:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getParameterIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParameters__ParameterAssignment_05585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getParameterIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__FunctionParameters__ParameterAssignment_0"


    // $ANTLR start "rule__FunctionParameters__NextParametersAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2781:1: rule__FunctionParameters__NextParametersAssignment_1 : ( ruleFunctionParametersTail ) ;
    public final void rule__FunctionParameters__NextParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2785:1: ( ( ruleFunctionParametersTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2786:1: ( ruleFunctionParametersTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2786:1: ( ruleFunctionParametersTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2787:1: ruleFunctionParametersTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersAccess().getNextParametersFunctionParametersTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionParametersTail_in_rule__FunctionParameters__NextParametersAssignment_15616);
            ruleFunctionParametersTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersAccess().getNextParametersFunctionParametersTailParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionParameters__NextParametersAssignment_1"


    // $ANTLR start "rule__FunctionParametersTail__ParameterAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2796:1: rule__FunctionParametersTail__ParameterAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionParametersTail__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2800:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2801:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2801:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2802:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getParameterIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionParametersTail__ParameterAssignment_15647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getParameterIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionParametersTail__ParameterAssignment_1"


    // $ANTLR start "rule__FunctionParametersTail__NextParametersAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2811:1: rule__FunctionParametersTail__NextParametersAssignment_2 : ( ruleFunctionParametersTail ) ;
    public final void rule__FunctionParametersTail__NextParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2815:1: ( ( ruleFunctionParametersTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2816:1: ( ruleFunctionParametersTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2816:1: ( ruleFunctionParametersTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2817:1: ruleFunctionParametersTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionParametersTailAccess().getNextParametersFunctionParametersTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionParametersTail_in_rule__FunctionParametersTail__NextParametersAssignment_25678);
            ruleFunctionParametersTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionParametersTailAccess().getNextParametersFunctionParametersTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__FunctionParametersTail__NextParametersAssignment_2"


    // $ANTLR start "rule__Apply__FunctorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2826:1: rule__Apply__FunctorAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Apply__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2830:1: ( ( ruleFunctor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2831:1: ( ruleFunctor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2831:1: ( ruleFunctor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2832:1: ruleFunctor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getFunctorFunctorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunctor_in_rule__Apply__FunctorAssignment_05709);
            ruleFunctor();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getFunctorFunctorParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Apply__FunctorAssignment_0"


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2841:1: rule__Apply__ArgumentsAssignment_1 : ( ruleApplyTail ) ;
    public final void rule__Apply__ArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2845:1: ( ( ruleApplyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2846:1: ( ruleApplyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2846:1: ( ruleApplyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2847:1: ruleApplyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_rule__Apply__ArgumentsAssignment_15740);
            ruleApplyTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyAccess().getArgumentsApplyTailParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Apply__ArgumentsAssignment_1"


    // $ANTLR start "rule__ApplyTail__ArgsAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2856:1: rule__ApplyTail__ArgsAssignment_2 : ( ruleFunctionArguments ) ;
    public final void rule__ApplyTail__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2860:1: ( ( ruleFunctionArguments ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2861:1: ( ruleFunctionArguments )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2861:1: ( ruleFunctionArguments )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2862:1: ruleFunctionArguments
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionArguments_in_rule__ApplyTail__ArgsAssignment_25771);
            ruleFunctionArguments();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplyTailAccess().getArgsFunctionArgumentsParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ApplyTail__ArgsAssignment_2"


    // $ANTLR start "rule__ApplyTail__NextCallAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2871:1: rule__ApplyTail__NextCallAssignment_4 : ( ruleApplyTail ) ;
    public final void rule__ApplyTail__NextCallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2875:1: ( ( ruleApplyTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2876:1: ( ruleApplyTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2876:1: ( ruleApplyTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2877:1: ruleApplyTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplyTailAccess().getNextCallApplyTailParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleApplyTail_in_rule__ApplyTail__NextCallAssignment_45802);
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


    // $ANTLR start "rule__FunctionArguments__ArgumentAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2886:1: rule__FunctionArguments__ArgumentAssignment_0 : ( ruleExpression ) ;
    public final void rule__FunctionArguments__ArgumentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2890:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2891:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2891:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2892:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getArgumentExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentAssignment_05833);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getArgumentExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__FunctionArguments__ArgumentAssignment_0"


    // $ANTLR start "rule__FunctionArguments__NextArgumentsAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2901:1: rule__FunctionArguments__NextArgumentsAssignment_1 : ( ruleFunctionArgumentsTail ) ;
    public final void rule__FunctionArguments__NextArgumentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2905:1: ( ( ruleFunctionArgumentsTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2906:1: ( ruleFunctionArgumentsTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2906:1: ( ruleFunctionArgumentsTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2907:1: ruleFunctionArgumentsTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_rule__FunctionArguments__NextArgumentsAssignment_15864);
            ruleFunctionArgumentsTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionArguments__NextArgumentsAssignment_1"


    // $ANTLR start "rule__FunctionArgumentsTail__ArgumentAssignment_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2916:1: rule__FunctionArgumentsTail__ArgumentAssignment_1 : ( ruleExpression ) ;
    public final void rule__FunctionArgumentsTail__ArgumentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2920:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2921:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2921:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2922:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getArgumentExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionArgumentsTail__ArgumentAssignment_15895);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getArgumentExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__FunctionArgumentsTail__ArgumentAssignment_1"


    // $ANTLR start "rule__FunctionArgumentsTail__NextArgumentsAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2931:1: rule__FunctionArgumentsTail__NextArgumentsAssignment_2 : ( ruleFunctionArgumentsTail ) ;
    public final void rule__FunctionArgumentsTail__NextArgumentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2935:1: ( ( ruleFunctionArgumentsTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2936:1: ( ruleFunctionArgumentsTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2936:1: ( ruleFunctionArgumentsTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2937:1: ruleFunctionArgumentsTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFunctionArgumentsTail_in_rule__FunctionArgumentsTail__NextArgumentsAssignment_25926);
            ruleFunctionArgumentsTail();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionArgumentsTailAccess().getNextArgumentsFunctionArgumentsTailParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__FunctionArgumentsTail__NextArgumentsAssignment_2"


    // $ANTLR start "rule__LiteralExpr__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2946:1: rule__LiteralExpr__ValueAssignment : ( RULE_NUM ) ;
    public final void rule__LiteralExpr__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2950:1: ( ( RULE_NUM ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2951:1: ( RULE_NUM )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2951:1: ( RULE_NUM )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2952:1: RULE_NUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralExprAccess().getValueNumTerminalRuleCall_0()); 
            }
            match(input,RULE_NUM,FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment5957); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2961:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2965:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2966:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2966:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2967:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5988); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2976:1: rule__NumericExpression__FactorAssignment_0 : ( ruleFactor ) ;
    public final void rule__NumericExpression__FactorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2980:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2981:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2981:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2982:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getFactorFactorParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__FactorAssignment_06019);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2991:1: rule__NumericExpression__ExprTailAssignment_1 : ( ruleExprTail ) ;
    public final void rule__NumericExpression__ExprTailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2995:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2996:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2996:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2997:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumericExpressionAccess().getExprTailExprTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__NumericExpression__ExprTailAssignment_16050);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3006:1: rule__ExprTail__FactorAssignment_0_1 : ( ruleFactor ) ;
    public final void rule__ExprTail__FactorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3010:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3011:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3011:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3012:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_0_16081);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3021:1: rule__ExprTail__ExprTailAssignment_0_2 : ( ruleExprTail ) ;
    public final void rule__ExprTail__ExprTailAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3025:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3026:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3026:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3027:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_0_26112);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3036:1: rule__ExprTail__FactorAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__ExprTail__FactorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3040:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3041:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3041:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3042:1: ruleFactor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getFactorFactorParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_1_16143);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3051:1: rule__ExprTail__ExprTailAssignment_1_2 : ( ruleExprTail ) ;
    public final void rule__ExprTail__ExprTailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3055:1: ( ( ruleExprTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3056:1: ( ruleExprTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3056:1: ( ruleExprTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3057:1: ruleExprTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTailAccess().getExprTailExprTailParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_1_26174);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3066:1: rule__Factor__TermAssignment_0 : ( ruleTerm ) ;
    public final void rule__Factor__TermAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3070:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3071:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3071:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3072:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getTermTermParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__TermAssignment_06205);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3081:1: rule__Factor__FactorTailAssignment_1 : ( ruleFactorTail ) ;
    public final void rule__Factor__FactorTailAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3085:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3086:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3086:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3087:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorAccess().getFactorTailFactorTailParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_16236);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3096:1: rule__FactorTail__TermAssignment_0_1 : ( ruleTerm ) ;
    public final void rule__FactorTail__TermAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3100:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3101:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3101:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3102:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_0_16267);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3111:1: rule__FactorTail__FactorTailAssignment_0_2 : ( ruleFactorTail ) ;
    public final void rule__FactorTail__FactorTailAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3115:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3116:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3116:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3117:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_0_26298);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3126:1: rule__FactorTail__TermAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__FactorTail__TermAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3130:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3131:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3131:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3132:1: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getTermTermParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_1_16329);
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3141:1: rule__FactorTail__FactorTailAssignment_1_2 : ( ruleFactorTail ) ;
    public final void rule__FactorTail__FactorTailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3145:1: ( ( ruleFactorTail ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3146:1: ( ruleFactorTail )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3146:1: ( ruleFactorTail )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3147:1: ruleFactorTail
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFactorTailAccess().getFactorTailFactorTailParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_1_26360);
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


    // $ANTLR start "rule__VariableAssignment__IdAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3156:1: rule__VariableAssignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3160:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3161:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3161:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3162:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_06391); if (state.failed) return ;
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3171:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3175:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3176:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3176:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3177:1: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_26422);
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
    public static final BitSet FOLLOW_ruleProgramTail_in_entryRuleProgramTail186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramTail193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__0_in_ruleProgramTail219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Alternatives_in_ruleBody399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyTail_in_entryRuleBodyTail426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyTail433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__0_in_ruleBodyTail459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_entryRuleFunctionParameters486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameters493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group__0_in_ruleFunctionParameters519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_entryRuleFunctionParametersTail546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParametersTail553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__0_in_ruleFunctionParametersTail579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0_in_ruleApply639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functor__Alternatives_in_ruleFunctor699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_entryRuleApplyTail726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplyTail733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__0_in_ruleApplyTail759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_entryRuleFunctionArguments786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArguments793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__0_in_ruleFunctionArguments819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_entryRuleFunctionArgumentsTail846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArgumentsTail853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__0_in_ruleFunctionArgumentsTail879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_entryRuleLiteralExpr906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpr913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralExpr__ValueAssignment_in_ruleLiteralExpr939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_entryRuleExprTail1086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTail1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Alternatives_in_ruleExprTail1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_entryRuleFactorTail1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactorTail1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Alternatives_in_ruleFactorTail1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment1326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__Expression__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionAssignment_0_in_rule__Body__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0_in_rule__Body__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__0_in_rule__ExprTail__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__0_in_rule__ExprTail__Alternatives1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__0_in_rule__FactorTail__Alternatives1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__0_in_rule__FactorTail__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpr_in_rule__Term__Alternatives1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Term__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__01770 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__01773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__TailAssignment_1_in_rule__Program__Group__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__0__Impl_in_rule__ProgramTail__Group__01892 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__1_in_rule__ProgramTail__Group__01895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ProgramTail__Group__0__Impl1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__1__Impl_in_rule__ProgramTail__Group__11954 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__2_in_rule__ProgramTail__Group__11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__ExpressionAssignment_1_in_rule__ProgramTail__Group__1__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__Group__2__Impl_in_rule__ProgramTail__Group__22014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgramTail__TailAssignment_2_in_rule__ProgramTail__Group__2__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__02078 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FunctionDeclaration__Group__0__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__12140 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FunctionDeclaration__Group__1__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__22202 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__22205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_in_rule__FunctionDeclaration__Group__2__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__32263 = new BitSet(new long[]{0x0000000000016030L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__32266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FunctionDeclaration__Group__3__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__42325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__0__Impl_in_rule__Body__Group_1__02392 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1_in_rule__Body__Group_1__02395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Body__Group_1__0__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__1__Impl_in_rule__Body__Group_1__12454 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2_in_rule__Body__Group_1__12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ExpressionsAssignment_1_1_in_rule__Body__Group_1__1__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__2__Impl_in_rule__Body__Group_1__22514 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3_in_rule__Body__Group_1__22517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__TailAssignment_1_2_in_rule__Body__Group_1__2__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_1__3__Impl_in_rule__Body__Group_1__32575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group_1__3__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__0__Impl_in_rule__BodyTail__Group__02642 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__1_in_rule__BodyTail__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BodyTail__Group__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__1__Impl_in_rule__BodyTail__Group__12704 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__2_in_rule__BodyTail__Group__12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__ExpressionAssignment_1_in_rule__BodyTail__Group__1__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__Group__2__Impl_in_rule__BodyTail__Group__22764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyTail__TailAssignment_2_in_rule__BodyTail__Group__2__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group__0__Impl_in_rule__FunctionParameters__Group__02828 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group__1_in_rule__FunctionParameters__Group__02831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__ParameterAssignment_0_in_rule__FunctionParameters__Group__0__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__Group__1__Impl_in_rule__FunctionParameters__Group__12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParameters__NextParametersAssignment_1_in_rule__FunctionParameters__Group__1__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__0__Impl_in_rule__FunctionParametersTail__Group__02950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__1_in_rule__FunctionParametersTail__Group__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionParametersTail__Group__0__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__1__Impl_in_rule__FunctionParametersTail__Group__13012 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__2_in_rule__FunctionParametersTail__Group__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__ParameterAssignment_1_in_rule__FunctionParametersTail__Group__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__Group__2__Impl_in_rule__FunctionParametersTail__Group__23072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionParametersTail__NextParametersAssignment_2_in_rule__FunctionParametersTail__Group__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__03136 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__03139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__FunctorAssignment_0_in_rule__Apply__Group__0__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__13196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_in_rule__Apply__Group__1__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__0__Impl_in_rule__ApplyTail__Group__03258 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__1_in_rule__ApplyTail__Group__03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__1__Impl_in_rule__ApplyTail__Group__13319 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__2_in_rule__ApplyTail__Group__13322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ApplyTail__Group__1__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__2__Impl_in_rule__ApplyTail__Group__23381 = new BitSet(new long[]{0x000000000000E030L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__3_in_rule__ApplyTail__Group__23384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__ArgsAssignment_2_in_rule__ApplyTail__Group__2__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__3__Impl_in_rule__ApplyTail__Group__33442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__4_in_rule__ApplyTail__Group__33445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ApplyTail__Group__3__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__Group__4__Impl_in_rule__ApplyTail__Group__43504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ApplyTail__NextCallAssignment_4_in_rule__ApplyTail__Group__4__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__0__Impl_in_rule__FunctionArguments__Group__03572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__1_in_rule__FunctionArguments__Group__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__ArgumentAssignment_0_in_rule__FunctionArguments__Group__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__Group__1__Impl_in_rule__FunctionArguments__Group__13632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArguments__NextArgumentsAssignment_1_in_rule__FunctionArguments__Group__1__Impl3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__0__Impl_in_rule__FunctionArgumentsTail__Group__03694 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__1_in_rule__FunctionArgumentsTail__Group__03697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FunctionArgumentsTail__Group__0__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__1__Impl_in_rule__FunctionArgumentsTail__Group__13756 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__2_in_rule__FunctionArgumentsTail__Group__13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__ArgumentAssignment_1_in_rule__FunctionArgumentsTail__Group__1__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__Group__2__Impl_in_rule__FunctionArgumentsTail__Group__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgumentsTail__NextArgumentsAssignment_2_in_rule__FunctionArgumentsTail__Group__2__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__03880 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__03883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__FactorAssignment_0_in_rule__NumericExpression__Group__0__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__13940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__ExprTailAssignment_1_in_rule__NumericExpression__Group__1__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__0__Impl_in_rule__ExprTail__Group_0__04002 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__1_in_rule__ExprTail__Group_0__04005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExprTail__Group_0__0__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__1__Impl_in_rule__ExprTail__Group_0__14064 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__2_in_rule__ExprTail__Group_0__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__FactorAssignment_0_1_in_rule__ExprTail__Group_0__1__Impl4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_0__2__Impl_in_rule__ExprTail__Group_0__24124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__ExprTailAssignment_0_2_in_rule__ExprTail__Group_0__2__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__0__Impl_in_rule__ExprTail__Group_1__04188 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__1_in_rule__ExprTail__Group_1__04191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ExprTail__Group_1__0__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__1__Impl_in_rule__ExprTail__Group_1__14250 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__2_in_rule__ExprTail__Group_1__14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__FactorAssignment_1_1_in_rule__ExprTail__Group_1__1__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__Group_1__2__Impl_in_rule__ExprTail__Group_1__24310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTail__ExprTailAssignment_1_2_in_rule__ExprTail__Group_1__2__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__04374 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__04377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__TermAssignment_0_in_rule__Factor__Group__0__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__FactorTailAssignment_1_in_rule__Factor__Group__1__Impl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__0__Impl_in_rule__FactorTail__Group_0__04496 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__1_in_rule__FactorTail__Group_0__04499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FactorTail__Group_0__0__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__1__Impl_in_rule__FactorTail__Group_0__14558 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__2_in_rule__FactorTail__Group_0__14561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__TermAssignment_0_1_in_rule__FactorTail__Group_0__1__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_0__2__Impl_in_rule__FactorTail__Group_0__24618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__FactorTailAssignment_0_2_in_rule__FactorTail__Group_0__2__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__0__Impl_in_rule__FactorTail__Group_1__04682 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__1_in_rule__FactorTail__Group_1__04685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FactorTail__Group_1__0__Impl4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__1__Impl_in_rule__FactorTail__Group_1__14744 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__2_in_rule__FactorTail__Group_1__14747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__TermAssignment_1_1_in_rule__FactorTail__Group_1__1__Impl4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__Group_1__2__Impl_in_rule__FactorTail__Group_1__24804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorTail__FactorTailAssignment_1_2_in_rule__FactorTail__Group_1__2__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__04868 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__04871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__14928 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__14931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__VariableAssignment__Group__1__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__24990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__05053 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__05056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ParenthesisExpression__Group__0__Impl5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__15115 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__15118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__25174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ParenthesisExpression__Group__2__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_05244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramTail_in_rule__Program__TailAssignment_15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ProgramTail__ExpressionAssignment_15306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgramTail_in_rule__ProgramTail__TailAssignment_25337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameters_in_rule__FunctionDeclaration__ParametersAssignment_25368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__FunctionDeclaration__BodyAssignment_45399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionAssignment_05430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Body__ExpressionsAssignment_1_15461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyTail_in_rule__Body__TailAssignment_1_25492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BodyTail__ExpressionAssignment_15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyTail_in_rule__BodyTail__TailAssignment_25554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParameters__ParameterAssignment_05585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_rule__FunctionParameters__NextParametersAssignment_15616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionParametersTail__ParameterAssignment_15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParametersTail_in_rule__FunctionParametersTail__NextParametersAssignment_25678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Apply__FunctorAssignment_05709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_rule__Apply__ArgumentsAssignment_15740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArguments_in_rule__ApplyTail__ArgsAssignment_25771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplyTail_in_rule__ApplyTail__NextCallAssignment_45802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionArguments__ArgumentAssignment_05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_rule__FunctionArguments__NextArgumentsAssignment_15864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionArgumentsTail__ArgumentAssignment_15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgumentsTail_in_rule__FunctionArgumentsTail__NextArgumentsAssignment_25926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUM_in_rule__LiteralExpr__ValueAssignment5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__FactorAssignment_06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__NumericExpression__ExprTailAssignment_16050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_0_16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_0_26112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__ExprTail__FactorAssignment_1_16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTail_in_rule__ExprTail__ExprTailAssignment_1_26174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__TermAssignment_06205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__Factor__FactorTailAssignment_16236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_0_16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_0_26298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FactorTail__TermAssignment_1_16329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorTail_in_rule__FactorTail__FactorTailAssignment_1_26360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_06391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_26422 = new BitSet(new long[]{0x0000000000000002L});

}