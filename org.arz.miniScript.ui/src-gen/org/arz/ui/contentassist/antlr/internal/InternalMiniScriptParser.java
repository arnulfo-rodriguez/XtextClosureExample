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

@SuppressWarnings("all")
public class InternalMiniScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'if'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'and'", "'or'", "'true'", "'false'", "';'", "'{'", "'}'", "'let'", "','", "'('", "')'", "'func'", "'='"
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:61:1: ( ruleModel EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:69:1: ruleModel : ( ruleProgram ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:73:2: ( ( ruleProgram ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:74:1: ( ruleProgram )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:74:1: ( ruleProgram )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:75:1: ruleProgram
            {
             before(grammarAccess.getModelAccess().getProgramParserRuleCall()); 
            pushFollow(FOLLOW_ruleProgram_in_ruleModel94);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramParserRuleCall()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:88:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:89:1: ( ruleProgram EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:90:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram120);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram127); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:97:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:101:2: ( ( ( rule__Program__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:102:1: ( ( rule__Program__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:102:1: ( ( rule__Program__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:103:1: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:104:1: ( rule__Program__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:104:2: rule__Program__Group__0
            {
            pushFollow(FOLLOW_rule__Program__Group__0_in_ruleProgram153);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:116:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:117:1: ( ruleExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:118:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression180);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression187); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:125:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:129:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:130:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:130:1: ( ( rule__Expression__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:131:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:132:1: ( rule__Expression__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:132:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression213);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBlockExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:144:1: entryRuleBlockExpression : ruleBlockExpression EOF ;
    public final void entryRuleBlockExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:145:1: ( ruleBlockExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:146:1: ruleBlockExpression EOF
            {
             before(grammarAccess.getBlockExpressionRule()); 
            pushFollow(FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression240);
            ruleBlockExpression();

            state._fsp--;

             after(grammarAccess.getBlockExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockExpression247); 

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
    // $ANTLR end "entryRuleBlockExpression"


    // $ANTLR start "ruleBlockExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:153:1: ruleBlockExpression : ( ( rule__BlockExpression__Group__0 ) ) ;
    public final void ruleBlockExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:157:2: ( ( ( rule__BlockExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:158:1: ( ( rule__BlockExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:158:1: ( ( rule__BlockExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:159:1: ( rule__BlockExpression__Group__0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:160:1: ( rule__BlockExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:160:2: rule__BlockExpression__Group__0
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0_in_ruleBlockExpression273);
            rule__BlockExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:172:1: entryRuleLetExpression : ruleLetExpression EOF ;
    public final void entryRuleLetExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:173:1: ( ruleLetExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:174:1: ruleLetExpression EOF
            {
             before(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression300);
            ruleLetExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression307); 

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:181:1: ruleLetExpression : ( ( rule__LetExpression__Group__0 ) ) ;
    public final void ruleLetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:185:2: ( ( ( rule__LetExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:186:1: ( ( rule__LetExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:186:1: ( ( rule__LetExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:187:1: ( rule__LetExpression__Group__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:188:1: ( rule__LetExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:188:2: rule__LetExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression333);
            rule__LetExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleTernaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:200:1: entryRuleTernaryExpression : ruleTernaryExpression EOF ;
    public final void entryRuleTernaryExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:201:1: ( ruleTernaryExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:202:1: ruleTernaryExpression EOF
            {
             before(grammarAccess.getTernaryExpressionRule()); 
            pushFollow(FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression360);
            ruleTernaryExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTernaryExpression367); 

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
    // $ANTLR end "entryRuleTernaryExpression"


    // $ANTLR start "ruleTernaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:209:1: ruleTernaryExpression : ( ( rule__TernaryExpression__Group__0 ) ) ;
    public final void ruleTernaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:213:2: ( ( ( rule__TernaryExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:214:1: ( ( rule__TernaryExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:214:1: ( ( rule__TernaryExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:215:1: ( rule__TernaryExpression__Group__0 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:216:1: ( rule__TernaryExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:216:2: rule__TernaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__0_in_ruleTernaryExpression393);
            rule__TernaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTernaryExpression"


    // $ANTLR start "entryRuleLogicalBinaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:228:1: entryRuleLogicalBinaryExpression : ruleLogicalBinaryExpression EOF ;
    public final void entryRuleLogicalBinaryExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:229:1: ( ruleLogicalBinaryExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:230:1: ruleLogicalBinaryExpression EOF
            {
             before(grammarAccess.getLogicalBinaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression420);
            ruleLogicalBinaryExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalBinaryExpression427); 

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
    // $ANTLR end "entryRuleLogicalBinaryExpression"


    // $ANTLR start "ruleLogicalBinaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:237:1: ruleLogicalBinaryExpression : ( ( rule__LogicalBinaryExpression__Group__0 ) ) ;
    public final void ruleLogicalBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:241:2: ( ( ( rule__LogicalBinaryExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:242:1: ( ( rule__LogicalBinaryExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:242:1: ( ( rule__LogicalBinaryExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:243:1: ( rule__LogicalBinaryExpression__Group__0 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:244:1: ( rule__LogicalBinaryExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:244:2: rule__LogicalBinaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__0_in_ruleLogicalBinaryExpression453);
            rule__LogicalBinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalBinaryExpression"


    // $ANTLR start "entryRuleLogicalUnaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:256:1: entryRuleLogicalUnaryExpression : ruleLogicalUnaryExpression EOF ;
    public final void entryRuleLogicalUnaryExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:257:1: ( ruleLogicalUnaryExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:258:1: ruleLogicalUnaryExpression EOF
            {
             before(grammarAccess.getLogicalUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression480);
            ruleLogicalUnaryExpression();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalUnaryExpression487); 

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
    // $ANTLR end "entryRuleLogicalUnaryExpression"


    // $ANTLR start "ruleLogicalUnaryExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:265:1: ruleLogicalUnaryExpression : ( ( rule__LogicalUnaryExpression__Group__0 ) ) ;
    public final void ruleLogicalUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:269:2: ( ( ( rule__LogicalUnaryExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:1: ( ( rule__LogicalUnaryExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:270:1: ( ( rule__LogicalUnaryExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:271:1: ( rule__LogicalUnaryExpression__Group__0 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:1: ( rule__LogicalUnaryExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:272:2: rule__LogicalUnaryExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__0_in_ruleLogicalUnaryExpression513);
            rule__LogicalUnaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalUnaryExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:284:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:285:1: ( ruleComparisonExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:286:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression540);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpression547); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:293:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:297:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:298:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:299:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:1: ( rule__ComparisonExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:300:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression573);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:312:1: entryRuleFunctionDeclaration : ruleFunctionDeclaration EOF ;
    public final void entryRuleFunctionDeclaration() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:313:1: ( ruleFunctionDeclaration EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:314:1: ruleFunctionDeclaration EOF
            {
             before(grammarAccess.getFunctionDeclarationRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration600);
            ruleFunctionDeclaration();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration607); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:321:1: ruleFunctionDeclaration : ( ( rule__FunctionDeclaration__Group__0 ) ) ;
    public final void ruleFunctionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:325:2: ( ( ( rule__FunctionDeclaration__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:326:1: ( ( rule__FunctionDeclaration__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:327:1: ( rule__FunctionDeclaration__Group__0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:1: ( rule__FunctionDeclaration__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:328:2: rule__FunctionDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration633);
            rule__FunctionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleSymbolReference"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:340:1: entryRuleSymbolReference : ruleSymbolReference EOF ;
    public final void entryRuleSymbolReference() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:341:1: ( ruleSymbolReference EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:342:1: ruleSymbolReference EOF
            {
             before(grammarAccess.getSymbolReferenceRule()); 
            pushFollow(FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference660);
            ruleSymbolReference();

            state._fsp--;

             after(grammarAccess.getSymbolReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolReference667); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:349:1: ruleSymbolReference : ( ( rule__SymbolReference__IdAssignment ) ) ;
    public final void ruleSymbolReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:353:2: ( ( ( rule__SymbolReference__IdAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:1: ( ( rule__SymbolReference__IdAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:354:1: ( ( rule__SymbolReference__IdAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:355:1: ( rule__SymbolReference__IdAssignment )
            {
             before(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:1: ( rule__SymbolReference__IdAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:356:2: rule__SymbolReference__IdAssignment
            {
            pushFollow(FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference693);
            rule__SymbolReference__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolReferenceAccess().getIdAssignment()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:368:1: entryRuleNumericExpression : ruleNumericExpression EOF ;
    public final void entryRuleNumericExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:369:1: ( ruleNumericExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:370:1: ruleNumericExpression EOF
            {
             before(grammarAccess.getNumericExpressionRule()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression720);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getNumericExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericExpression727); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:377:1: ruleNumericExpression : ( ( rule__NumericExpression__Group__0 ) ) ;
    public final void ruleNumericExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:381:2: ( ( ( rule__NumericExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:382:1: ( ( rule__NumericExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:382:1: ( ( rule__NumericExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:383:1: ( rule__NumericExpression__Group__0 )
            {
             before(grammarAccess.getNumericExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:1: ( rule__NumericExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:384:2: rule__NumericExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression753);
            rule__NumericExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:396:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:397:1: ( ruleFactor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:398:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_ruleFactor_in_entryRuleFactor780);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactor787); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:405:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:409:2: ( ( ( rule__Factor__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:410:1: ( ( rule__Factor__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:410:1: ( ( rule__Factor__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:411:1: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:1: ( rule__Factor__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:412:2: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_rule__Factor__Group__0_in_ruleFactor813);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:424:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:425:1: ( ruleTerm EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:426:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm840);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm847); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:433:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:437:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:438:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:438:1: ( ( rule__Term__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:439:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:1: ( rule__Term__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:440:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm873);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleApply"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:452:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:453:1: ( ruleApply EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:454:1: ruleApply EOF
            {
             before(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply900);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getApplyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply907); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:461:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:465:2: ( ( ( rule__Apply__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:466:1: ( ( rule__Apply__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:466:1: ( ( rule__Apply__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:467:1: ( rule__Apply__Group__0 )
            {
             before(grammarAccess.getApplyAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:468:1: ( rule__Apply__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:468:2: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_rule__Apply__Group__0_in_ruleApply933);
            rule__Apply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:480:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:481:1: ( ruleFunctor EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:482:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_ruleFunctor_in_entryRuleFunctor960);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctor967); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:489:1: ruleFunctor : ( ( rule__Functor__Alternatives ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:493:2: ( ( ( rule__Functor__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:494:1: ( ( rule__Functor__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:494:1: ( ( rule__Functor__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:495:1: ( rule__Functor__Alternatives )
            {
             before(grammarAccess.getFunctorAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:1: ( rule__Functor__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:496:2: rule__Functor__Alternatives
            {
            pushFollow(FOLLOW_rule__Functor__Alternatives_in_ruleFunctor993);
            rule__Functor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLiteralExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:508:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:509:1: ( ruleLiteralExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:510:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression1020);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression1027); 

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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:517:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Alternatives ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:521:2: ( ( ( rule__LiteralExpression__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:522:1: ( ( rule__LiteralExpression__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:522:1: ( ( rule__LiteralExpression__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:523:1: ( rule__LiteralExpression__Alternatives )
            {
             before(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:1: ( rule__LiteralExpression__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:524:2: rule__LiteralExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__LiteralExpression__Alternatives_in_ruleLiteralExpression1053);
            rule__LiteralExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:536:1: entryRuleLiteralBoolean : ruleLiteralBoolean EOF ;
    public final void entryRuleLiteralBoolean() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:537:1: ( ruleLiteralBoolean EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:538:1: ruleLiteralBoolean EOF
            {
             before(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1080);
            ruleLiteralBoolean();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralBoolean1087); 

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:545:1: ruleLiteralBoolean : ( ( rule__LiteralBoolean__ValueAssignment ) ) ;
    public final void ruleLiteralBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:549:2: ( ( ( rule__LiteralBoolean__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:550:1: ( ( rule__LiteralBoolean__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:550:1: ( ( rule__LiteralBoolean__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:551:1: ( rule__LiteralBoolean__ValueAssignment )
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:552:1: ( rule__LiteralBoolean__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:552:2: rule__LiteralBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralBoolean__ValueAssignment_in_ruleLiteralBoolean1113);
            rule__LiteralBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleLiteralNumber"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:564:1: entryRuleLiteralNumber : ruleLiteralNumber EOF ;
    public final void entryRuleLiteralNumber() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:565:1: ( ruleLiteralNumber EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:566:1: ruleLiteralNumber EOF
            {
             before(grammarAccess.getLiteralNumberRule()); 
            pushFollow(FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber1140);
            ruleLiteralNumber();

            state._fsp--;

             after(grammarAccess.getLiteralNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralNumber1147); 

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
    // $ANTLR end "entryRuleLiteralNumber"


    // $ANTLR start "ruleLiteralNumber"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:573:1: ruleLiteralNumber : ( ( rule__LiteralNumber__ValueAssignment ) ) ;
    public final void ruleLiteralNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:577:2: ( ( ( rule__LiteralNumber__ValueAssignment ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:578:1: ( ( rule__LiteralNumber__ValueAssignment ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:578:1: ( ( rule__LiteralNumber__ValueAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:579:1: ( rule__LiteralNumber__ValueAssignment )
            {
             before(grammarAccess.getLiteralNumberAccess().getValueAssignment()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:580:1: ( rule__LiteralNumber__ValueAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:580:2: rule__LiteralNumber__ValueAssignment
            {
            pushFollow(FOLLOW_rule__LiteralNumber__ValueAssignment_in_ruleLiteralNumber1173);
            rule__LiteralNumber__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralNumber"


    // $ANTLR start "entryRuleVariableAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:592:1: entryRuleVariableAssignment : ruleVariableAssignment EOF ;
    public final void entryRuleVariableAssignment() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:593:1: ( ruleVariableAssignment EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:594:1: ruleVariableAssignment EOF
            {
             before(grammarAccess.getVariableAssignmentRule()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment1200);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssignment1207); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:601:1: ruleVariableAssignment : ( ( rule__VariableAssignment__Group__0 ) ) ;
    public final void ruleVariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:605:2: ( ( ( rule__VariableAssignment__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:606:1: ( ( rule__VariableAssignment__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:606:1: ( ( rule__VariableAssignment__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:607:1: ( rule__VariableAssignment__Group__0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:608:1: ( rule__VariableAssignment__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:608:2: rule__VariableAssignment__Group__0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment1233);
            rule__VariableAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:620:1: entryRuleParenthesisExpression : ruleParenthesisExpression EOF ;
    public final void entryRuleParenthesisExpression() throws RecognitionException {
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:621:1: ( ruleParenthesisExpression EOF )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:622:1: ruleParenthesisExpression EOF
            {
             before(grammarAccess.getParenthesisExpressionRule()); 
            pushFollow(FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1260);
            ruleParenthesisExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesisExpression1267); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:629:1: ruleParenthesisExpression : ( ( rule__ParenthesisExpression__Group__0 ) ) ;
    public final void ruleParenthesisExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:633:2: ( ( ( rule__ParenthesisExpression__Group__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:634:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:634:1: ( ( rule__ParenthesisExpression__Group__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:635:1: ( rule__ParenthesisExpression__Group__0 )
            {
             before(grammarAccess.getParenthesisExpressionAccess().getGroup()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:636:1: ( rule__ParenthesisExpression__Group__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:636:2: rule__ParenthesisExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1293);
            rule__ParenthesisExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisExpressionAccess().getGroup()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:649:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:653:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:654:1: ( ( rule__AdditionOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:655:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:656:1: ( rule__AdditionOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:656:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator1330);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:668:1: ruleFactorOperator : ( ( rule__FactorOperator__Alternatives ) ) ;
    public final void ruleFactorOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:672:1: ( ( ( rule__FactorOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:673:1: ( ( rule__FactorOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:673:1: ( ( rule__FactorOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:674:1: ( rule__FactorOperator__Alternatives )
            {
             before(grammarAccess.getFactorOperatorAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:675:1: ( rule__FactorOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:675:2: rule__FactorOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__FactorOperator__Alternatives_in_ruleFactorOperator1366);
            rule__FactorOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorOperatorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleComparisonOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:687:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:691:1: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:692:1: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:692:1: ( ( rule__ComparisonOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:693:1: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:694:1: ( rule__ComparisonOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:694:2: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1402);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "ruleUnaryLogicalOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:706:1: ruleUnaryLogicalOperator : ( ( 'not' ) ) ;
    public final void ruleUnaryLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:710:1: ( ( ( 'not' ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:711:1: ( ( 'not' ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:711:1: ( ( 'not' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:712:1: ( 'not' )
            {
             before(grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:713:1: ( 'not' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:713:3: 'not'
            {
            match(input,11,FOLLOW_11_in_ruleUnaryLogicalOperator1439); 

            }

             after(grammarAccess.getUnaryLogicalOperatorAccess().getNotEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryLogicalOperator"


    // $ANTLR start "ruleBinaryLogicalOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:726:1: ruleBinaryLogicalOperator : ( ( rule__BinaryLogicalOperator__Alternatives ) ) ;
    public final void ruleBinaryLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:730:1: ( ( ( rule__BinaryLogicalOperator__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:731:1: ( ( rule__BinaryLogicalOperator__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:731:1: ( ( rule__BinaryLogicalOperator__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:732:1: ( rule__BinaryLogicalOperator__Alternatives )
            {
             before(grammarAccess.getBinaryLogicalOperatorAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:733:1: ( rule__BinaryLogicalOperator__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:733:2: rule__BinaryLogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryLogicalOperator__Alternatives_in_ruleBinaryLogicalOperator1477);
            rule__BinaryLogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBinaryLogicalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryLogicalOperator"


    // $ANTLR start "ruleTernaryOperator"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:745:1: ruleTernaryOperator : ( ( 'if' ) ) ;
    public final void ruleTernaryOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:749:1: ( ( ( 'if' ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:750:1: ( ( 'if' ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:750:1: ( ( 'if' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:751:1: ( 'if' )
            {
             before(grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:752:1: ( 'if' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:752:3: 'if'
            {
            match(input,12,FOLLOW_12_in_ruleTernaryOperator1514); 

            }

             after(grammarAccess.getTernaryOperatorAccess().getIfExpressionEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTernaryOperator"


    // $ANTLR start "ruleBooleanValue"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:765:1: ruleBooleanValue : ( ( rule__BooleanValue__Alternatives ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:769:1: ( ( ( rule__BooleanValue__Alternatives ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:770:1: ( ( rule__BooleanValue__Alternatives ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:770:1: ( ( rule__BooleanValue__Alternatives ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:771:1: ( rule__BooleanValue__Alternatives )
            {
             before(grammarAccess.getBooleanValueAccess().getAlternatives()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:772:1: ( rule__BooleanValue__Alternatives )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:772:2: rule__BooleanValue__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue1552);
            rule__BooleanValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:783:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:787:1: ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:788:1: ( ruleFunctionDeclaration )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:788:1: ( ruleFunctionDeclaration )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:789:1: ruleFunctionDeclaration
                    {
                     before(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1587);
                    ruleFunctionDeclaration();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getFunctionDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:794:6: ( ruleVariableAssignment )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:794:6: ( ruleVariableAssignment )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:795:1: ruleVariableAssignment
                    {
                     before(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1604);
                    ruleVariableAssignment();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getVariableAssignmentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:800:6: ( ruleLogicalBinaryExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:800:6: ( ruleLogicalBinaryExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:801:1: ruleLogicalBinaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLogicalBinaryExpression_in_rule__Expression__Alternatives1621);
                    ruleLogicalBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalBinaryExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:806:6: ( ruleLogicalUnaryExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:806:6: ( ruleLogicalUnaryExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:807:1: ruleLogicalUnaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLogicalUnaryExpression_in_rule__Expression__Alternatives1638);
                    ruleLogicalUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalUnaryExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:812:6: ( ruleTernaryExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:812:6: ( ruleTernaryExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:813:1: ruleTernaryExpression
                    {
                     before(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTernaryExpression_in_rule__Expression__Alternatives1655);
                    ruleTernaryExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getTernaryExpressionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:818:6: ( ruleComparisonExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:818:6: ( ruleComparisonExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:819:1: ruleComparisonExpression
                    {
                     before(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleComparisonExpression_in_rule__Expression__Alternatives1672);
                    ruleComparisonExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getComparisonExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:824:6: ( ruleLetExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:824:6: ( ruleLetExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:825:1: ruleLetExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleLetExpression_in_rule__Expression__Alternatives1689);
                    ruleLetExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:830:6: ( ruleBlockExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:830:6: ( ruleBlockExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:831:1: ruleBlockExpression
                    {
                     before(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleBlockExpression_in_rule__Expression__Alternatives1706);
                    ruleBlockExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBlockExpressionParserRuleCall_7()); 

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


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:841:1: rule__Term__Alternatives : ( ( ruleLiteralExpression ) | ( ruleApply ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:845:1: ( ( ruleLiteralExpression ) | ( ruleApply ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=25 && LA2_0<=26)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:846:1: ( ruleLiteralExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:846:1: ( ruleLiteralExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:847:1: ruleLiteralExpression
                    {
                     before(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralExpression_in_rule__Term__Alternatives1738);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:852:6: ( ruleApply )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:852:6: ( ruleApply )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:853:1: ruleApply
                    {
                     before(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleApply_in_rule__Term__Alternatives1755);
                    ruleApply();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getApplyParserRuleCall_1()); 

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


    // $ANTLR start "rule__Functor__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:863:1: rule__Functor__Alternatives : ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) );
    public final void rule__Functor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:867:1: ( ( ruleSymbolReference ) | ( ruleParenthesisExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:868:1: ( ruleSymbolReference )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:868:1: ( ruleSymbolReference )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:869:1: ruleSymbolReference
                    {
                     before(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1787);
                    ruleSymbolReference();

                    state._fsp--;

                     after(grammarAccess.getFunctorAccess().getSymbolReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:874:6: ( ruleParenthesisExpression )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:874:6: ( ruleParenthesisExpression )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:875:1: ruleParenthesisExpression
                    {
                     before(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1804);
                    ruleParenthesisExpression();

                    state._fsp--;

                     after(grammarAccess.getFunctorAccess().getParenthesisExpressionParserRuleCall_1()); 

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


    // $ANTLR start "rule__LiteralExpression__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:885:1: rule__LiteralExpression__Alternatives : ( ( ruleLiteralNumber ) | ( ruleLiteralBoolean ) );
    public final void rule__LiteralExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:889:1: ( ( ruleLiteralNumber ) | ( ruleLiteralBoolean ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=25 && LA4_0<=26)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( ruleLiteralNumber )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:890:1: ( ruleLiteralNumber )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:891:1: ruleLiteralNumber
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLiteralNumber_in_rule__LiteralExpression__Alternatives1836);
                    ruleLiteralNumber();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:896:6: ( ruleLiteralBoolean )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:896:6: ( ruleLiteralBoolean )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:897:1: ruleLiteralBoolean
                    {
                     before(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteralBoolean_in_rule__LiteralExpression__Alternatives1853);
                    ruleLiteralBoolean();

                    state._fsp--;

                     after(grammarAccess.getLiteralExpressionAccess().getLiteralBooleanParserRuleCall_1()); 

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
    // $ANTLR end "rule__LiteralExpression__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:907:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:911:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:912:1: ( ( '+' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:912:1: ( ( '+' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:913:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:914:1: ( '+' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:914:3: '+'
                    {
                    match(input,13,FOLLOW_13_in_rule__AdditionOperator__Alternatives1886); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getAddEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:919:6: ( ( '-' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:919:6: ( ( '-' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:920:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:921:1: ( '-' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:921:3: '-'
                    {
                    match(input,14,FOLLOW_14_in_rule__AdditionOperator__Alternatives1907); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:931:1: rule__FactorOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__FactorOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:935:1: ( ( ( '*' ) ) | ( ( '/' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
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
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:936:1: ( ( '*' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:936:1: ( ( '*' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:937:1: ( '*' )
                    {
                     before(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:938:1: ( '*' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:938:3: '*'
                    {
                    match(input,15,FOLLOW_15_in_rule__FactorOperator__Alternatives1943); 

                    }

                     after(grammarAccess.getFactorOperatorAccess().getMultEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:943:6: ( ( '/' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:943:6: ( ( '/' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:944:1: ( '/' )
                    {
                     before(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:945:1: ( '/' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:945:3: '/'
                    {
                    match(input,16,FOLLOW_16_in_rule__FactorOperator__Alternatives1964); 

                    }

                     after(grammarAccess.getFactorOperatorAccess().getDivisionEnumLiteralDeclaration_1()); 

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


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:955:1: rule__ComparisonOperator__Alternatives : ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:959:1: ( ( ( '>' ) ) | ( ( '>=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:960:1: ( ( '>' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:960:1: ( ( '>' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:961:1: ( '>' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:962:1: ( '>' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:962:3: '>'
                    {
                    match(input,17,FOLLOW_17_in_rule__ComparisonOperator__Alternatives2000); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGtEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:967:6: ( ( '>=' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:967:6: ( ( '>=' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:968:1: ( '>=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:1: ( '>=' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:969:3: '>='
                    {
                    match(input,18,FOLLOW_18_in_rule__ComparisonOperator__Alternatives2021); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:974:6: ( ( '<' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:974:6: ( ( '<' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:975:1: ( '<' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:976:1: ( '<' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:976:3: '<'
                    {
                    match(input,19,FOLLOW_19_in_rule__ComparisonOperator__Alternatives2042); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLtEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:981:6: ( ( '<=' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:981:6: ( ( '<=' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:982:1: ( '<=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:983:1: ( '<=' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:983:3: '<='
                    {
                    match(input,20,FOLLOW_20_in_rule__ComparisonOperator__Alternatives2063); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLteEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:988:6: ( ( '==' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:988:6: ( ( '==' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:989:1: ( '==' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:990:1: ( '==' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:990:3: '=='
                    {
                    match(input,21,FOLLOW_21_in_rule__ComparisonOperator__Alternatives2084); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:995:6: ( ( '!=' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:995:6: ( ( '!=' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:996:1: ( '!=' )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:997:1: ( '!=' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:997:3: '!='
                    {
                    match(input,22,FOLLOW_22_in_rule__ComparisonOperator__Alternatives2105); 

                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNoteqEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__BinaryLogicalOperator__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1007:1: rule__BinaryLogicalOperator__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__BinaryLogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1011:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1012:1: ( ( 'and' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1012:1: ( ( 'and' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1013:1: ( 'and' )
                    {
                     before(grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1014:1: ( 'and' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1014:3: 'and'
                    {
                    match(input,23,FOLLOW_23_in_rule__BinaryLogicalOperator__Alternatives2141); 

                    }

                     after(grammarAccess.getBinaryLogicalOperatorAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1019:6: ( ( 'or' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1019:6: ( ( 'or' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1020:1: ( 'or' )
                    {
                     before(grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1021:1: ( 'or' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1021:3: 'or'
                    {
                    match(input,24,FOLLOW_24_in_rule__BinaryLogicalOperator__Alternatives2162); 

                    }

                     after(grammarAccess.getBinaryLogicalOperatorAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BinaryLogicalOperator__Alternatives"


    // $ANTLR start "rule__BooleanValue__Alternatives"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1031:1: rule__BooleanValue__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1035:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1036:1: ( ( 'true' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1036:1: ( ( 'true' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1037:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1038:1: ( 'true' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1038:3: 'true'
                    {
                    match(input,25,FOLLOW_25_in_rule__BooleanValue__Alternatives2198); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1043:6: ( ( 'false' ) )
                    {
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1043:6: ( ( 'false' ) )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1044:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1045:1: ( 'false' )
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1045:3: 'false'
                    {
                    match(input,26,FOLLOW_26_in_rule__BooleanValue__Alternatives2219); 

                    }

                     after(grammarAccess.getBooleanValueAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanValue__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1057:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1061:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1062:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02252);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02255);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1069:1: rule__Program__Group__0__Impl : ( ( rule__Program__ExpressionsAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1073:1: ( ( ( rule__Program__ExpressionsAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1074:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1074:1: ( ( rule__Program__ExpressionsAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1075:1: ( rule__Program__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1076:1: ( rule__Program__ExpressionsAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1076:2: rule__Program__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl2282);
            rule__Program__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExpressionsAssignment_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1086:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1090:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1091:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12312);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12315);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1098:1: rule__Program__Group__1__Impl : ( ';' ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1102:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1103:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1103:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1104:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__Program__Group__1__Impl2343); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1117:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1121:1: ( rule__Program__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1122:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22374);
            rule__Program__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1128:1: rule__Program__Group__2__Impl : ( ( rule__Program__Group_2__0 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1132:1: ( ( ( rule__Program__Group_2__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1133:1: ( ( rule__Program__Group_2__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1133:1: ( ( rule__Program__Group_2__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1134:1: ( rule__Program__Group_2__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1135:1: ( rule__Program__Group_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=11 && LA10_0<=12)||(LA10_0>=23 && LA10_0<=26)||LA10_0==28||LA10_0==30||LA10_0==32||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1135:2: rule__Program__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl2401);
            	    rule__Program__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1151:1: rule__Program__Group_2__0 : rule__Program__Group_2__0__Impl rule__Program__Group_2__1 ;
    public final void rule__Program__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1155:1: ( rule__Program__Group_2__0__Impl rule__Program__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1156:2: rule__Program__Group_2__0__Impl rule__Program__Group_2__1
            {
            pushFollow(FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__02438);
            rule__Program__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__02441);
            rule__Program__Group_2__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1163:1: rule__Program__Group_2__0__Impl : ( ( rule__Program__ExpressionsAssignment_2_0 ) ) ;
    public final void rule__Program__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1167:1: ( ( ( rule__Program__ExpressionsAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1168:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1168:1: ( ( rule__Program__ExpressionsAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1169:1: ( rule__Program__ExpressionsAssignment_2_0 )
            {
             before(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1170:1: ( rule__Program__ExpressionsAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1170:2: rule__Program__ExpressionsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl2468);
            rule__Program__ExpressionsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getExpressionsAssignment_2_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1180:1: rule__Program__Group_2__1 : rule__Program__Group_2__1__Impl ;
    public final void rule__Program__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1184:1: ( rule__Program__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1185:2: rule__Program__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__12498);
            rule__Program__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1191:1: rule__Program__Group_2__1__Impl : ( ';' ) ;
    public final void rule__Program__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1195:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1196:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1196:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1197:1: ';'
            {
             before(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 
            match(input,27,FOLLOW_27_in_rule__Program__Group_2__1__Impl2526); 
             after(grammarAccess.getProgramAccess().getSemicolonKeyword_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BlockExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1214:1: rule__BlockExpression__Group__0 : rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 ;
    public final void rule__BlockExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1218:1: ( rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1219:2: rule__BlockExpression__Group__0__Impl rule__BlockExpression__Group__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__02561);
            rule__BlockExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__02564);
            rule__BlockExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0"


    // $ANTLR start "rule__BlockExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1226:1: rule__BlockExpression__Group__0__Impl : ( '{' ) ;
    public final void rule__BlockExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1230:1: ( ( '{' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1231:1: ( '{' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1231:1: ( '{' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1232:1: '{'
            {
             before(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__BlockExpression__Group__0__Impl2592); 
             after(grammarAccess.getBlockExpressionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1245:1: rule__BlockExpression__Group__1 : rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 ;
    public final void rule__BlockExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1249:1: ( rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1250:2: rule__BlockExpression__Group__1__Impl rule__BlockExpression__Group__2
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__12623);
            rule__BlockExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__12626);
            rule__BlockExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1"


    // $ANTLR start "rule__BlockExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1257:1: rule__BlockExpression__Group__1__Impl : ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) ) ;
    public final void rule__BlockExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1261:1: ( ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1262:1: ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1262:1: ( ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1263:1: ( ( rule__BlockExpression__Group_1__0 ) ) ( ( rule__BlockExpression__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1263:1: ( ( rule__BlockExpression__Group_1__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1264:1: ( rule__BlockExpression__Group_1__0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1265:1: ( rule__BlockExpression__Group_1__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1265:2: rule__BlockExpression__Group_1__0
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_1__0_in_rule__BlockExpression__Group__1__Impl2655);
            rule__BlockExpression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getGroup_1()); 

            }

            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1268:1: ( ( rule__BlockExpression__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1269:1: ( rule__BlockExpression__Group_1__0 )*
            {
             before(grammarAccess.getBlockExpressionAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1270:1: ( rule__BlockExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=11 && LA11_0<=12)||(LA11_0>=23 && LA11_0<=26)||LA11_0==28||LA11_0==30||LA11_0==32||LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1270:2: rule__BlockExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BlockExpression__Group_1__0_in_rule__BlockExpression__Group__1__Impl2667);
            	    rule__BlockExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBlockExpressionAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__1__Impl"


    // $ANTLR start "rule__BlockExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1281:1: rule__BlockExpression__Group__2 : rule__BlockExpression__Group__2__Impl ;
    public final void rule__BlockExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1285:1: ( rule__BlockExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1286:2: rule__BlockExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__22700);
            rule__BlockExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2"


    // $ANTLR start "rule__BlockExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1292:1: rule__BlockExpression__Group__2__Impl : ( '}' ) ;
    public final void rule__BlockExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1296:1: ( ( '}' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1297:1: ( '}' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1297:1: ( '}' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1298:1: '}'
            {
             before(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__BlockExpression__Group__2__Impl2728); 
             after(grammarAccess.getBlockExpressionAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group__2__Impl"


    // $ANTLR start "rule__BlockExpression__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1317:1: rule__BlockExpression__Group_1__0 : rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1 ;
    public final void rule__BlockExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1321:1: ( rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1322:2: rule__BlockExpression__Group_1__0__Impl rule__BlockExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_1__0__Impl_in_rule__BlockExpression__Group_1__02765);
            rule__BlockExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockExpression__Group_1__1_in_rule__BlockExpression__Group_1__02768);
            rule__BlockExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__0"


    // $ANTLR start "rule__BlockExpression__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1329:1: rule__BlockExpression__Group_1__0__Impl : ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) ) ;
    public final void rule__BlockExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1333:1: ( ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1334:1: ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1334:1: ( ( rule__BlockExpression__ExpressionsAssignment_1_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1335:1: ( rule__BlockExpression__ExpressionsAssignment_1_0 )
            {
             before(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:1: ( rule__BlockExpression__ExpressionsAssignment_1_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1336:2: rule__BlockExpression__ExpressionsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BlockExpression__ExpressionsAssignment_1_0_in_rule__BlockExpression__Group_1__0__Impl2795);
            rule__BlockExpression__ExpressionsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBlockExpressionAccess().getExpressionsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BlockExpression__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1346:1: rule__BlockExpression__Group_1__1 : rule__BlockExpression__Group_1__1__Impl ;
    public final void rule__BlockExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1350:1: ( rule__BlockExpression__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1351:2: rule__BlockExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockExpression__Group_1__1__Impl_in_rule__BlockExpression__Group_1__12825);
            rule__BlockExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__1"


    // $ANTLR start "rule__BlockExpression__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1357:1: rule__BlockExpression__Group_1__1__Impl : ( ';' ) ;
    public final void rule__BlockExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1361:1: ( ( ';' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1362:1: ( ';' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1362:1: ( ';' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1363:1: ';'
            {
             before(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1()); 
            match(input,27,FOLLOW_27_in_rule__BlockExpression__Group_1__1__Impl2853); 
             after(grammarAccess.getBlockExpressionAccess().getSemicolonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1380:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1384:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1385:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__02888);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__02891);
            rule__LetExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__0"


    // $ANTLR start "rule__LetExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1392:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1396:1: ( ( 'let' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ( 'let' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1397:1: ( 'let' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1398:1: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__LetExpression__Group__0__Impl2919); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__0__Impl"


    // $ANTLR start "rule__LetExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1411:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1415:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1416:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__12950);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__12953);
            rule__LetExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__1"


    // $ANTLR start "rule__LetExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1423:1: rule__LetExpression__Group__1__Impl : ( ( rule__LetExpression__Group_1__0 ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1427:1: ( ( ( rule__LetExpression__Group_1__0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( ( rule__LetExpression__Group_1__0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1428:1: ( ( rule__LetExpression__Group_1__0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1429:1: ( rule__LetExpression__Group_1__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1430:1: ( rule__LetExpression__Group_1__0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1430:2: rule__LetExpression__Group_1__0
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__0_in_rule__LetExpression__Group__1__Impl2980);
            rule__LetExpression__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1440:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1444:1: ( rule__LetExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1445:2: rule__LetExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__23010);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__2"


    // $ANTLR start "rule__LetExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1451:1: rule__LetExpression__Group__2__Impl : ( ( rule__LetExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1455:1: ( ( ( rule__LetExpression__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1456:1: ( ( rule__LetExpression__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1456:1: ( ( rule__LetExpression__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1457:1: ( rule__LetExpression__ExpressionAssignment_2 )
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionAssignment_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:1: ( rule__LetExpression__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1458:2: rule__LetExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LetExpression__ExpressionAssignment_2_in_rule__LetExpression__Group__2__Impl3037);
            rule__LetExpression__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group__2__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1474:1: rule__LetExpression__Group_1__0 : rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 ;
    public final void rule__LetExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1478:1: ( rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1479:2: rule__LetExpression__Group_1__0__Impl rule__LetExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__0__Impl_in_rule__LetExpression__Group_1__03073);
            rule__LetExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LetExpression__Group_1__1_in_rule__LetExpression__Group_1__03076);
            rule__LetExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__0"


    // $ANTLR start "rule__LetExpression__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1486:1: rule__LetExpression__Group_1__0__Impl : ( ( rule__LetExpression__AssigmentAssignment_1_0 ) ) ;
    public final void rule__LetExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1490:1: ( ( ( rule__LetExpression__AssigmentAssignment_1_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1491:1: ( ( rule__LetExpression__AssigmentAssignment_1_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1491:1: ( ( rule__LetExpression__AssigmentAssignment_1_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1492:1: ( rule__LetExpression__AssigmentAssignment_1_0 )
            {
             before(grammarAccess.getLetExpressionAccess().getAssigmentAssignment_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1493:1: ( rule__LetExpression__AssigmentAssignment_1_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1493:2: rule__LetExpression__AssigmentAssignment_1_0
            {
            pushFollow(FOLLOW_rule__LetExpression__AssigmentAssignment_1_0_in_rule__LetExpression__Group_1__0__Impl3103);
            rule__LetExpression__AssigmentAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getAssigmentAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LetExpression__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1503:1: rule__LetExpression__Group_1__1 : rule__LetExpression__Group_1__1__Impl ;
    public final void rule__LetExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1507:1: ( rule__LetExpression__Group_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1508:2: rule__LetExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LetExpression__Group_1__1__Impl_in_rule__LetExpression__Group_1__13133);
            rule__LetExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__1"


    // $ANTLR start "rule__LetExpression__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1514:1: rule__LetExpression__Group_1__1__Impl : ( ',' ) ;
    public final void rule__LetExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1518:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1519:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1519:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1520:1: ','
            {
             before(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__LetExpression__Group_1__1__Impl3161); 
             after(grammarAccess.getLetExpressionAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1537:1: rule__TernaryExpression__Group__0 : rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 ;
    public final void rule__TernaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1541:1: ( rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1542:2: rule__TernaryExpression__Group__0__Impl rule__TernaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__0__Impl_in_rule__TernaryExpression__Group__03196);
            rule__TernaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__1_in_rule__TernaryExpression__Group__03199);
            rule__TernaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0"


    // $ANTLR start "rule__TernaryExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1549:1: rule__TernaryExpression__Group__0__Impl : ( ( rule__TernaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__TernaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1553:1: ( ( ( rule__TernaryExpression__OperatorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1554:1: ( ( rule__TernaryExpression__OperatorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1554:1: ( ( rule__TernaryExpression__OperatorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1555:1: ( rule__TernaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getOperatorAssignment_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1556:1: ( rule__TernaryExpression__OperatorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1556:2: rule__TernaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__TernaryExpression__OperatorAssignment_0_in_rule__TernaryExpression__Group__0__Impl3226);
            rule__TernaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__0__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1566:1: rule__TernaryExpression__Group__1 : rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 ;
    public final void rule__TernaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1570:1: ( rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1571:2: rule__TernaryExpression__Group__1__Impl rule__TernaryExpression__Group__2
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__1__Impl_in_rule__TernaryExpression__Group__13256);
            rule__TernaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__2_in_rule__TernaryExpression__Group__13259);
            rule__TernaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1"


    // $ANTLR start "rule__TernaryExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1578:1: rule__TernaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__TernaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1582:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1583:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1583:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1584:1: '('
            {
             before(grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__TernaryExpression__Group__1__Impl3287); 
             after(grammarAccess.getTernaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__1__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1597:1: rule__TernaryExpression__Group__2 : rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 ;
    public final void rule__TernaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1601:1: ( rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1602:2: rule__TernaryExpression__Group__2__Impl rule__TernaryExpression__Group__3
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__2__Impl_in_rule__TernaryExpression__Group__23318);
            rule__TernaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__3_in_rule__TernaryExpression__Group__23321);
            rule__TernaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2"


    // $ANTLR start "rule__TernaryExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1609:1: rule__TernaryExpression__Group__2__Impl : ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) ) ;
    public final void rule__TernaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1613:1: ( ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1614:1: ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1614:1: ( ( rule__TernaryExpression__FirstExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1615:1: ( rule__TernaryExpression__FirstExpressionAssignment_2 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getFirstExpressionAssignment_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1616:1: ( rule__TernaryExpression__FirstExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1616:2: rule__TernaryExpression__FirstExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__TernaryExpression__FirstExpressionAssignment_2_in_rule__TernaryExpression__Group__2__Impl3348);
            rule__TernaryExpression__FirstExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getFirstExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__2__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1626:1: rule__TernaryExpression__Group__3 : rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 ;
    public final void rule__TernaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1630:1: ( rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1631:2: rule__TernaryExpression__Group__3__Impl rule__TernaryExpression__Group__4
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__3__Impl_in_rule__TernaryExpression__Group__33378);
            rule__TernaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__4_in_rule__TernaryExpression__Group__33381);
            rule__TernaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3"


    // $ANTLR start "rule__TernaryExpression__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1638:1: rule__TernaryExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__TernaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1642:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1643:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1643:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1644:1: ','
            {
             before(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__TernaryExpression__Group__3__Impl3409); 
             after(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__3__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1657:1: rule__TernaryExpression__Group__4 : rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 ;
    public final void rule__TernaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1661:1: ( rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1662:2: rule__TernaryExpression__Group__4__Impl rule__TernaryExpression__Group__5
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__4__Impl_in_rule__TernaryExpression__Group__43440);
            rule__TernaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__5_in_rule__TernaryExpression__Group__43443);
            rule__TernaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4"


    // $ANTLR start "rule__TernaryExpression__Group__4__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1669:1: rule__TernaryExpression__Group__4__Impl : ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) ) ;
    public final void rule__TernaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1673:1: ( ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1674:1: ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1674:1: ( ( rule__TernaryExpression__SecondExpressionAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1675:1: ( rule__TernaryExpression__SecondExpressionAssignment_4 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getSecondExpressionAssignment_4()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1676:1: ( rule__TernaryExpression__SecondExpressionAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1676:2: rule__TernaryExpression__SecondExpressionAssignment_4
            {
            pushFollow(FOLLOW_rule__TernaryExpression__SecondExpressionAssignment_4_in_rule__TernaryExpression__Group__4__Impl3470);
            rule__TernaryExpression__SecondExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getSecondExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__4__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__5"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1686:1: rule__TernaryExpression__Group__5 : rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6 ;
    public final void rule__TernaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1690:1: ( rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1691:2: rule__TernaryExpression__Group__5__Impl rule__TernaryExpression__Group__6
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__5__Impl_in_rule__TernaryExpression__Group__53500);
            rule__TernaryExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__6_in_rule__TernaryExpression__Group__53503);
            rule__TernaryExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5"


    // $ANTLR start "rule__TernaryExpression__Group__5__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1698:1: rule__TernaryExpression__Group__5__Impl : ( ',' ) ;
    public final void rule__TernaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1702:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1703:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1703:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1704:1: ','
            {
             before(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__TernaryExpression__Group__5__Impl3531); 
             after(grammarAccess.getTernaryExpressionAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__5__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__6"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1717:1: rule__TernaryExpression__Group__6 : rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7 ;
    public final void rule__TernaryExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1721:1: ( rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1722:2: rule__TernaryExpression__Group__6__Impl rule__TernaryExpression__Group__7
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__6__Impl_in_rule__TernaryExpression__Group__63562);
            rule__TernaryExpression__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TernaryExpression__Group__7_in_rule__TernaryExpression__Group__63565);
            rule__TernaryExpression__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__6"


    // $ANTLR start "rule__TernaryExpression__Group__6__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1729:1: rule__TernaryExpression__Group__6__Impl : ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) ) ;
    public final void rule__TernaryExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1733:1: ( ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1734:1: ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1734:1: ( ( rule__TernaryExpression__ThirdExpressionAssignment_6 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1735:1: ( rule__TernaryExpression__ThirdExpressionAssignment_6 )
            {
             before(grammarAccess.getTernaryExpressionAccess().getThirdExpressionAssignment_6()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1736:1: ( rule__TernaryExpression__ThirdExpressionAssignment_6 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1736:2: rule__TernaryExpression__ThirdExpressionAssignment_6
            {
            pushFollow(FOLLOW_rule__TernaryExpression__ThirdExpressionAssignment_6_in_rule__TernaryExpression__Group__6__Impl3592);
            rule__TernaryExpression__ThirdExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTernaryExpressionAccess().getThirdExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__6__Impl"


    // $ANTLR start "rule__TernaryExpression__Group__7"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1746:1: rule__TernaryExpression__Group__7 : rule__TernaryExpression__Group__7__Impl ;
    public final void rule__TernaryExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1750:1: ( rule__TernaryExpression__Group__7__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1751:2: rule__TernaryExpression__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__TernaryExpression__Group__7__Impl_in_rule__TernaryExpression__Group__73622);
            rule__TernaryExpression__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__7"


    // $ANTLR start "rule__TernaryExpression__Group__7__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1757:1: rule__TernaryExpression__Group__7__Impl : ( ')' ) ;
    public final void rule__TernaryExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1761:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1762:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1762:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1763:1: ')'
            {
             before(grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7()); 
            match(input,33,FOLLOW_33_in_rule__TernaryExpression__Group__7__Impl3650); 
             after(grammarAccess.getTernaryExpressionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__Group__7__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1792:1: rule__LogicalBinaryExpression__Group__0 : rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1 ;
    public final void rule__LogicalBinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1796:1: ( rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1797:2: rule__LogicalBinaryExpression__Group__0__Impl rule__LogicalBinaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__0__Impl_in_rule__LogicalBinaryExpression__Group__03697);
            rule__LogicalBinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__1_in_rule__LogicalBinaryExpression__Group__03700);
            rule__LogicalBinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__0"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1804:1: rule__LogicalBinaryExpression__Group__0__Impl : ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1808:1: ( ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1809:1: ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1809:1: ( ( rule__LogicalBinaryExpression__OperatorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1810:1: ( rule__LogicalBinaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorAssignment_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1811:1: ( rule__LogicalBinaryExpression__OperatorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1811:2: rule__LogicalBinaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__OperatorAssignment_0_in_rule__LogicalBinaryExpression__Group__0__Impl3727);
            rule__LogicalBinaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1821:1: rule__LogicalBinaryExpression__Group__1 : rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2 ;
    public final void rule__LogicalBinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1825:1: ( rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1826:2: rule__LogicalBinaryExpression__Group__1__Impl rule__LogicalBinaryExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__1__Impl_in_rule__LogicalBinaryExpression__Group__13757);
            rule__LogicalBinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__2_in_rule__LogicalBinaryExpression__Group__13760);
            rule__LogicalBinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__1"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1833:1: rule__LogicalBinaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LogicalBinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1837:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1838:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1838:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1839:1: '('
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__LogicalBinaryExpression__Group__1__Impl3788); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1852:1: rule__LogicalBinaryExpression__Group__2 : rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3 ;
    public final void rule__LogicalBinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1856:1: ( rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1857:2: rule__LogicalBinaryExpression__Group__2__Impl rule__LogicalBinaryExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__2__Impl_in_rule__LogicalBinaryExpression__Group__23819);
            rule__LogicalBinaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__3_in_rule__LogicalBinaryExpression__Group__23822);
            rule__LogicalBinaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__2"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1864:1: rule__LogicalBinaryExpression__Group__2__Impl : ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1868:1: ( ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:1: ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1869:1: ( ( rule__LogicalBinaryExpression__LeftExprAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1870:1: ( rule__LogicalBinaryExpression__LeftExprAssignment_2 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprAssignment_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1871:1: ( rule__LogicalBinaryExpression__LeftExprAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1871:2: rule__LogicalBinaryExpression__LeftExprAssignment_2
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__LeftExprAssignment_2_in_rule__LogicalBinaryExpression__Group__2__Impl3849);
            rule__LogicalBinaryExpression__LeftExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1881:1: rule__LogicalBinaryExpression__Group__3 : rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4 ;
    public final void rule__LogicalBinaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1885:1: ( rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1886:2: rule__LogicalBinaryExpression__Group__3__Impl rule__LogicalBinaryExpression__Group__4
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__3__Impl_in_rule__LogicalBinaryExpression__Group__33879);
            rule__LogicalBinaryExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__4_in_rule__LogicalBinaryExpression__Group__33882);
            rule__LogicalBinaryExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__3"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1893:1: rule__LogicalBinaryExpression__Group__3__Impl : ( ',' ) ;
    public final void rule__LogicalBinaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1897:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1898:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1899:1: ','
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__LogicalBinaryExpression__Group__3__Impl3910); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__3__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1912:1: rule__LogicalBinaryExpression__Group__4 : rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5 ;
    public final void rule__LogicalBinaryExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1916:1: ( rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1917:2: rule__LogicalBinaryExpression__Group__4__Impl rule__LogicalBinaryExpression__Group__5
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__4__Impl_in_rule__LogicalBinaryExpression__Group__43941);
            rule__LogicalBinaryExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__5_in_rule__LogicalBinaryExpression__Group__43944);
            rule__LogicalBinaryExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__4"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__4__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1924:1: rule__LogicalBinaryExpression__Group__4__Impl : ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) ) ;
    public final void rule__LogicalBinaryExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1928:1: ( ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1929:1: ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1929:1: ( ( rule__LogicalBinaryExpression__RightExprAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1930:1: ( rule__LogicalBinaryExpression__RightExprAssignment_4 )
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprAssignment_4()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:1: ( rule__LogicalBinaryExpression__RightExprAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1931:2: rule__LogicalBinaryExpression__RightExprAssignment_4
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__RightExprAssignment_4_in_rule__LogicalBinaryExpression__Group__4__Impl3971);
            rule__LogicalBinaryExpression__RightExprAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__4__Impl"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__5"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1941:1: rule__LogicalBinaryExpression__Group__5 : rule__LogicalBinaryExpression__Group__5__Impl ;
    public final void rule__LogicalBinaryExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1945:1: ( rule__LogicalBinaryExpression__Group__5__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1946:2: rule__LogicalBinaryExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__LogicalBinaryExpression__Group__5__Impl_in_rule__LogicalBinaryExpression__Group__54001);
            rule__LogicalBinaryExpression__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__5"


    // $ANTLR start "rule__LogicalBinaryExpression__Group__5__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1952:1: rule__LogicalBinaryExpression__Group__5__Impl : ( ')' ) ;
    public final void rule__LogicalBinaryExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1956:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1957:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1957:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1958:1: ')'
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__LogicalBinaryExpression__Group__5__Impl4029); 
             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__Group__5__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1983:1: rule__LogicalUnaryExpression__Group__0 : rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1 ;
    public final void rule__LogicalUnaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1987:1: ( rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1988:2: rule__LogicalUnaryExpression__Group__0__Impl rule__LogicalUnaryExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__0__Impl_in_rule__LogicalUnaryExpression__Group__04072);
            rule__LogicalUnaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__1_in_rule__LogicalUnaryExpression__Group__04075);
            rule__LogicalUnaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__0"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1995:1: rule__LogicalUnaryExpression__Group__0__Impl : ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) ) ;
    public final void rule__LogicalUnaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:1999:1: ( ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2000:1: ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2000:1: ( ( rule__LogicalUnaryExpression__OperatorAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2001:1: ( rule__LogicalUnaryExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorAssignment_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2002:1: ( rule__LogicalUnaryExpression__OperatorAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2002:2: rule__LogicalUnaryExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__OperatorAssignment_0_in_rule__LogicalUnaryExpression__Group__0__Impl4102);
            rule__LogicalUnaryExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2012:1: rule__LogicalUnaryExpression__Group__1 : rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2 ;
    public final void rule__LogicalUnaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2016:1: ( rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2017:2: rule__LogicalUnaryExpression__Group__1__Impl rule__LogicalUnaryExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__1__Impl_in_rule__LogicalUnaryExpression__Group__14132);
            rule__LogicalUnaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__2_in_rule__LogicalUnaryExpression__Group__14135);
            rule__LogicalUnaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__1"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2024:1: rule__LogicalUnaryExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LogicalUnaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2028:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2029:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2029:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2030:1: '('
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__LogicalUnaryExpression__Group__1__Impl4163); 
             after(grammarAccess.getLogicalUnaryExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2043:1: rule__LogicalUnaryExpression__Group__2 : rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3 ;
    public final void rule__LogicalUnaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2047:1: ( rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2048:2: rule__LogicalUnaryExpression__Group__2__Impl rule__LogicalUnaryExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__2__Impl_in_rule__LogicalUnaryExpression__Group__24194);
            rule__LogicalUnaryExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__3_in_rule__LogicalUnaryExpression__Group__24197);
            rule__LogicalUnaryExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__2"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2055:1: rule__LogicalUnaryExpression__Group__2__Impl : ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LogicalUnaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2059:1: ( ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2060:1: ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2060:1: ( ( rule__LogicalUnaryExpression__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2061:1: ( rule__LogicalUnaryExpression__ExpressionAssignment_2 )
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionAssignment_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2062:1: ( rule__LogicalUnaryExpression__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2062:2: rule__LogicalUnaryExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__ExpressionAssignment_2_in_rule__LogicalUnaryExpression__Group__2__Impl4224);
            rule__LogicalUnaryExpression__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__2__Impl"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__3"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2072:1: rule__LogicalUnaryExpression__Group__3 : rule__LogicalUnaryExpression__Group__3__Impl ;
    public final void rule__LogicalUnaryExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2076:1: ( rule__LogicalUnaryExpression__Group__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2077:2: rule__LogicalUnaryExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LogicalUnaryExpression__Group__3__Impl_in_rule__LogicalUnaryExpression__Group__34254);
            rule__LogicalUnaryExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__3"


    // $ANTLR start "rule__LogicalUnaryExpression__Group__3__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2083:1: rule__LogicalUnaryExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__LogicalUnaryExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2087:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2088:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2088:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2089:1: ')'
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__LogicalUnaryExpression__Group__3__Impl4282); 
             after(grammarAccess.getLogicalUnaryExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__Group__3__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2110:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2114:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2115:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__04321);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__04324);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2122:1: rule__ComparisonExpression__Group__0__Impl : ( ruleNumericExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2126:1: ( ( ruleNumericExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2127:1: ( ruleNumericExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2127:1: ( ruleNumericExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2128:1: ruleNumericExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_rule__ComparisonExpression__Group__0__Impl4351);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getNumericExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2139:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2143:1: ( rule__ComparisonExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2144:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__14380);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2150:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2154:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2155:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2155:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2156:1: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2157:1: ( rule__ComparisonExpression__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=17 && LA12_0<=22)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2157:2: rule__ComparisonExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl4407);
                    rule__ComparisonExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2171:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2175:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2176:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__04442);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__04445);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2183:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2187:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2188:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2188:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2189:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2190:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2192:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExprAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2202:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2206:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2207:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__14503);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__2_in_rule__ComparisonExpression__Group_1__14506);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2214:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2218:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2219:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2219:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2220:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2221:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2221:2: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__OperatorAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl4533);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2231:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2235:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2236:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__Group_1__2__Impl_in_rule__ComparisonExpression__Group_1__24563);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2242:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2246:1: ( ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2247:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2247:1: ( ( rule__ComparisonExpression__RightExprAssignment_1_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2248:1: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2249:1: ( rule__ComparisonExpression__RightExprAssignment_1_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2249:2: rule__ComparisonExpression__RightExprAssignment_1_2
            {
            pushFollow(FOLLOW_rule__ComparisonExpression__RightExprAssignment_1_2_in_rule__ComparisonExpression__Group_1__2__Impl4590);
            rule__ComparisonExpression__RightExprAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExprAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionDeclaration__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2265:1: rule__FunctionDeclaration__Group__0 : rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 ;
    public final void rule__FunctionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2269:1: ( rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2270:2: rule__FunctionDeclaration__Group__0__Impl rule__FunctionDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__04626);
            rule__FunctionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__04629);
            rule__FunctionDeclaration__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2277:1: rule__FunctionDeclaration__Group__0__Impl : ( 'func' ) ;
    public final void rule__FunctionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2281:1: ( ( 'func' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2282:1: ( 'func' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2282:1: ( 'func' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2283:1: 'func'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionDeclaration__Group__0__Impl4657); 
             after(grammarAccess.getFunctionDeclarationAccess().getFuncKeyword_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2296:1: rule__FunctionDeclaration__Group__1 : rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 ;
    public final void rule__FunctionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2300:1: ( rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2301:2: rule__FunctionDeclaration__Group__1__Impl rule__FunctionDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__14688);
            rule__FunctionDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__14691);
            rule__FunctionDeclaration__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2308:1: rule__FunctionDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2312:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2313:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2313:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2314:1: '('
            {
             before(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__FunctionDeclaration__Group__1__Impl4719); 
             after(grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2327:1: rule__FunctionDeclaration__Group__2 : rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 ;
    public final void rule__FunctionDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2331:1: ( rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2332:2: rule__FunctionDeclaration__Group__2__Impl rule__FunctionDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__24750);
            rule__FunctionDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__24753);
            rule__FunctionDeclaration__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2339:1: rule__FunctionDeclaration__Group__2__Impl : ( ( rule__FunctionDeclaration__Group_2__0 )? ) ;
    public final void rule__FunctionDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2343:1: ( ( ( rule__FunctionDeclaration__Group_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2344:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2344:1: ( ( rule__FunctionDeclaration__Group_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2345:1: ( rule__FunctionDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2346:1: ( rule__FunctionDeclaration__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2346:2: rule__FunctionDeclaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl4780);
                    rule__FunctionDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2356:1: rule__FunctionDeclaration__Group__3 : rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 ;
    public final void rule__FunctionDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2360:1: ( rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2361:2: rule__FunctionDeclaration__Group__3__Impl rule__FunctionDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__34811);
            rule__FunctionDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__34814);
            rule__FunctionDeclaration__Group__4();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2368:1: rule__FunctionDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2372:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2373:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2373:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2374:1: ')'
            {
             before(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__FunctionDeclaration__Group__3__Impl4842); 
             after(grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2387:1: rule__FunctionDeclaration__Group__4 : rule__FunctionDeclaration__Group__4__Impl ;
    public final void rule__FunctionDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2391:1: ( rule__FunctionDeclaration__Group__4__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2392:2: rule__FunctionDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__44873);
            rule__FunctionDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2398:1: rule__FunctionDeclaration__Group__4__Impl : ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) ;
    public final void rule__FunctionDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2402:1: ( ( ( rule__FunctionDeclaration__BodyAssignment_4 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2403:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2403:1: ( ( rule__FunctionDeclaration__BodyAssignment_4 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2404:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2405:1: ( rule__FunctionDeclaration__BodyAssignment_4 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2405:2: rule__FunctionDeclaration__BodyAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl4900);
            rule__FunctionDeclaration__BodyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getBodyAssignment_4()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2425:1: rule__FunctionDeclaration__Group_2__0 : rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 ;
    public final void rule__FunctionDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2429:1: ( rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2430:2: rule__FunctionDeclaration__Group_2__0__Impl rule__FunctionDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__04940);
            rule__FunctionDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__04943);
            rule__FunctionDeclaration__Group_2__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2437:1: rule__FunctionDeclaration__Group_2__0__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) ;
    public final void rule__FunctionDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2441:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2442:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2442:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2443:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:1: ( rule__FunctionDeclaration__ParametersAssignment_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2444:2: rule__FunctionDeclaration__ParametersAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl4970);
            rule__FunctionDeclaration__ParametersAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2454:1: rule__FunctionDeclaration__Group_2__1 : rule__FunctionDeclaration__Group_2__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2458:1: ( rule__FunctionDeclaration__Group_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2459:2: rule__FunctionDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__15000);
            rule__FunctionDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2465:1: rule__FunctionDeclaration__Group_2__1__Impl : ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) ;
    public final void rule__FunctionDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2469:1: ( ( ( rule__FunctionDeclaration__Group_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2470:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2470:1: ( ( rule__FunctionDeclaration__Group_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2471:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2472:1: ( rule__FunctionDeclaration__Group_2_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2472:2: rule__FunctionDeclaration__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl5027);
            	    rule__FunctionDeclaration__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionDeclarationAccess().getGroup_2_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2486:1: rule__FunctionDeclaration__Group_2_1__0 : rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 ;
    public final void rule__FunctionDeclaration__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2490:1: ( rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2491:2: rule__FunctionDeclaration__Group_2_1__0__Impl rule__FunctionDeclaration__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__05062);
            rule__FunctionDeclaration__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__05065);
            rule__FunctionDeclaration__Group_2_1__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2498:1: rule__FunctionDeclaration__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionDeclaration__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2502:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2503:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2503:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2504:1: ','
            {
             before(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__FunctionDeclaration__Group_2_1__0__Impl5093); 
             after(grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2517:1: rule__FunctionDeclaration__Group_2_1__1 : rule__FunctionDeclaration__Group_2_1__1__Impl ;
    public final void rule__FunctionDeclaration__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2521:1: ( rule__FunctionDeclaration__Group_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2522:2: rule__FunctionDeclaration__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__15124);
            rule__FunctionDeclaration__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2528:1: rule__FunctionDeclaration__Group_2_1__1__Impl : ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__FunctionDeclaration__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2532:1: ( ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2533:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2533:1: ( ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2534:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2535:1: ( rule__FunctionDeclaration__ParametersAssignment_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2535:2: rule__FunctionDeclaration__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl5151);
            rule__FunctionDeclaration__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclarationAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__NumericExpression__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2549:1: rule__NumericExpression__Group__0 : rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 ;
    public final void rule__NumericExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2553:1: ( rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2554:2: rule__NumericExpression__Group__0__Impl rule__NumericExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__05185);
            rule__NumericExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__05188);
            rule__NumericExpression__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2561:1: rule__NumericExpression__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__NumericExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2565:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2566:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2566:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2567:1: ruleFactor
            {
             before(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl5215);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2578:1: rule__NumericExpression__Group__1 : rule__NumericExpression__Group__1__Impl ;
    public final void rule__NumericExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2582:1: ( rule__NumericExpression__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2583:2: rule__NumericExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__15244);
            rule__NumericExpression__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2589:1: rule__NumericExpression__Group__1__Impl : ( ( rule__NumericExpression__Group_1__0 )* ) ;
    public final void rule__NumericExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2593:1: ( ( ( rule__NumericExpression__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2594:1: ( ( rule__NumericExpression__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2594:1: ( ( rule__NumericExpression__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2595:1: ( rule__NumericExpression__Group_1__0 )*
            {
             before(grammarAccess.getNumericExpressionAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2596:1: ( rule__NumericExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=13 && LA15_0<=14)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2596:2: rule__NumericExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl5271);
            	    rule__NumericExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNumericExpressionAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2610:1: rule__NumericExpression__Group_1__0 : rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 ;
    public final void rule__NumericExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2614:1: ( rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2615:2: rule__NumericExpression__Group_1__0__Impl rule__NumericExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__05306);
            rule__NumericExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__05309);
            rule__NumericExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2622:1: rule__NumericExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NumericExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2626:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2627:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2628:1: ()
            {
             before(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2629:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2631:1: 
            {
            }

             after(grammarAccess.getNumericExpressionAccess().getNumericExpressionLeftFactorAction_1_0()); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2641:1: rule__NumericExpression__Group_1__1 : rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 ;
    public final void rule__NumericExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2645:1: ( rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2646:2: rule__NumericExpression__Group_1__1__Impl rule__NumericExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__15367);
            rule__NumericExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumericExpression__Group_1__2_in_rule__NumericExpression__Group_1__15370);
            rule__NumericExpression__Group_1__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2653:1: rule__NumericExpression__Group_1__1__Impl : ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__NumericExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2657:1: ( ( ( rule__NumericExpression__OperatorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2658:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2658:1: ( ( rule__NumericExpression__OperatorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2659:1: ( rule__NumericExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2660:1: ( rule__NumericExpression__OperatorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2660:2: rule__NumericExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NumericExpression__OperatorAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl5397);
            rule__NumericExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2670:1: rule__NumericExpression__Group_1__2 : rule__NumericExpression__Group_1__2__Impl ;
    public final void rule__NumericExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2674:1: ( rule__NumericExpression__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2675:2: rule__NumericExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NumericExpression__Group_1__2__Impl_in_rule__NumericExpression__Group_1__25427);
            rule__NumericExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2681:1: rule__NumericExpression__Group_1__2__Impl : ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) ;
    public final void rule__NumericExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2685:1: ( ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2686:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2686:1: ( ( rule__NumericExpression__RightFactorAssignment_1_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2687:1: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            {
             before(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2688:1: ( rule__NumericExpression__RightFactorAssignment_1_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2688:2: rule__NumericExpression__RightFactorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__NumericExpression__RightFactorAssignment_1_2_in_rule__NumericExpression__Group_1__2__Impl5454);
            rule__NumericExpression__RightFactorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getNumericExpressionAccess().getRightFactorAssignment_1_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2704:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2708:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2709:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__05490);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__05493);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2716:1: rule__Factor__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2720:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2721:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2721:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2722:1: ruleTerm
            {
             before(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl5520);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getTermParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2733:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2737:1: ( rule__Factor__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2738:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__15549);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2744:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2748:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2749:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2749:1: ( ( rule__Factor__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2750:1: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2751:1: ( rule__Factor__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=16)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2751:2: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl5576);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2765:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2769:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2770:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__05611);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__05614);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2777:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2781:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2782:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2782:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2783:1: ()
            {
             before(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2784:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2786:1: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorLeftTermAction_1_0()); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2796:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2800:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2801:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__15672);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Factor__Group_1__2_in_rule__Factor__Group_1__15675);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2808:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2812:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2813:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2813:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2814:1: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2815:1: ( rule__Factor__OperatorAssignment_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2815:2: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Factor__OperatorAssignment_1_1_in_rule__Factor__Group_1__1__Impl5702);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2825:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2829:1: ( rule__Factor__Group_1__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2830:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Factor__Group_1__2__Impl_in_rule__Factor__Group_1__25732);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2836:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightTermAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2840:1: ( ( ( rule__Factor__RightTermAssignment_1_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2841:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2841:1: ( ( rule__Factor__RightTermAssignment_1_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2842:1: ( rule__Factor__RightTermAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2843:1: ( rule__Factor__RightTermAssignment_1_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2843:2: rule__Factor__RightTermAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Factor__RightTermAssignment_1_2_in_rule__Factor__Group_1__2__Impl5759);
            rule__Factor__RightTermAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightTermAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Apply__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2859:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2863:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2864:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__05795);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__05798);
            rule__Apply__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2871:1: rule__Apply__Group__0__Impl : ( ruleFunctor ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2875:1: ( ( ruleFunctor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2876:1: ( ruleFunctor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2876:1: ( ruleFunctor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2877:1: ruleFunctor
            {
             before(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl5825);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getFunctorParserRuleCall_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2888:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2892:1: ( rule__Apply__Group__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2893:2: rule__Apply__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__15854);
            rule__Apply__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2899:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__Group_1__0 )* ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2903:1: ( ( ( rule__Apply__Group_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2904:1: ( ( rule__Apply__Group_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2904:1: ( ( rule__Apply__Group_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2905:1: ( rule__Apply__Group_1__0 )*
            {
             before(grammarAccess.getApplyAccess().getGroup_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2906:1: ( rule__Apply__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2906:2: rule__Apply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl5881);
            	    rule__Apply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getApplyAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2920:1: rule__Apply__Group_1__0 : rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 ;
    public final void rule__Apply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2924:1: ( rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2925:2: rule__Apply__Group_1__0__Impl rule__Apply__Group_1__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__05916);
            rule__Apply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__05919);
            rule__Apply__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2932:1: rule__Apply__Group_1__0__Impl : ( () ) ;
    public final void rule__Apply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2936:1: ( ( () ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2937:1: ( () )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2937:1: ( () )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2938:1: ()
            {
             before(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2939:1: ()
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2941:1: 
            {
            }

             after(grammarAccess.getApplyAccess().getApplyFunctorAction_1_0()); 

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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2951:1: rule__Apply__Group_1__1 : rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 ;
    public final void rule__Apply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2955:1: ( rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2956:2: rule__Apply__Group_1__1__Impl rule__Apply__Group_1__2
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__15977);
            rule__Apply__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_1__2_in_rule__Apply__Group_1__15980);
            rule__Apply__Group_1__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2963:1: rule__Apply__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Apply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2967:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2968:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2968:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2969:1: '('
            {
             before(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__Apply__Group_1__1__Impl6008); 
             after(grammarAccess.getApplyAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2982:1: rule__Apply__Group_1__2 : rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 ;
    public final void rule__Apply__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2986:1: ( rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2987:2: rule__Apply__Group_1__2__Impl rule__Apply__Group_1__3
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__2__Impl_in_rule__Apply__Group_1__26039);
            rule__Apply__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_1__3_in_rule__Apply__Group_1__26042);
            rule__Apply__Group_1__3();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2994:1: rule__Apply__Group_1__2__Impl : ( ( rule__Apply__Group_1_2__0 )? ) ;
    public final void rule__Apply__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2998:1: ( ( ( rule__Apply__Group_1_2__0 )? ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2999:1: ( ( rule__Apply__Group_1_2__0 )? )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:2999:1: ( ( rule__Apply__Group_1_2__0 )? )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3000:1: ( rule__Apply__Group_1_2__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_1_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3001:1: ( rule__Apply__Group_1_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_INT)||(LA18_0>=11 && LA18_0<=12)||(LA18_0>=23 && LA18_0<=26)||LA18_0==28||LA18_0==30||LA18_0==32||LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3001:2: rule__Apply__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_1_2__0_in_rule__Apply__Group_1__2__Impl6069);
                    rule__Apply__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyAccess().getGroup_1_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3011:1: rule__Apply__Group_1__3 : rule__Apply__Group_1__3__Impl ;
    public final void rule__Apply__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3015:1: ( rule__Apply__Group_1__3__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3016:2: rule__Apply__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1__3__Impl_in_rule__Apply__Group_1__36100);
            rule__Apply__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3022:1: rule__Apply__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Apply__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3026:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3027:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3027:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3028:1: ')'
            {
             before(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 
            match(input,33,FOLLOW_33_in_rule__Apply__Group_1__3__Impl6128); 
             after(grammarAccess.getApplyAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3049:1: rule__Apply__Group_1_2__0 : rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 ;
    public final void rule__Apply__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3053:1: ( rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3054:2: rule__Apply__Group_1_2__0__Impl rule__Apply__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2__0__Impl_in_rule__Apply__Group_1_2__06167);
            rule__Apply__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_1_2__1_in_rule__Apply__Group_1_2__06170);
            rule__Apply__Group_1_2__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3061:1: rule__Apply__Group_1_2__0__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) ;
    public final void rule__Apply__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3065:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3066:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3066:1: ( ( rule__Apply__ArgumentsAssignment_1_2_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3067:1: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            {
             before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3068:1: ( rule__Apply__ArgumentsAssignment_1_2_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3068:2: rule__Apply__ArgumentsAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_2_0_in_rule__Apply__Group_1_2__0__Impl6197);
            rule__Apply__ArgumentsAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3078:1: rule__Apply__Group_1_2__1 : rule__Apply__Group_1_2__1__Impl ;
    public final void rule__Apply__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3082:1: ( rule__Apply__Group_1_2__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3083:2: rule__Apply__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2__1__Impl_in_rule__Apply__Group_1_2__16227);
            rule__Apply__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3089:1: rule__Apply__Group_1_2__1__Impl : ( ( rule__Apply__Group_1_2_1__0 )* ) ;
    public final void rule__Apply__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3093:1: ( ( ( rule__Apply__Group_1_2_1__0 )* ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3094:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3094:1: ( ( rule__Apply__Group_1_2_1__0 )* )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3095:1: ( rule__Apply__Group_1_2_1__0 )*
            {
             before(grammarAccess.getApplyAccess().getGroup_1_2_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3096:1: ( rule__Apply__Group_1_2_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3096:2: rule__Apply__Group_1_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Apply__Group_1_2_1__0_in_rule__Apply__Group_1_2__1__Impl6254);
            	    rule__Apply__Group_1_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApplyAccess().getGroup_1_2_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3110:1: rule__Apply__Group_1_2_1__0 : rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 ;
    public final void rule__Apply__Group_1_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3114:1: ( rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3115:2: rule__Apply__Group_1_2_1__0__Impl rule__Apply__Group_1_2_1__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__0__Impl_in_rule__Apply__Group_1_2_1__06289);
            rule__Apply__Group_1_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__1_in_rule__Apply__Group_1_2_1__06292);
            rule__Apply__Group_1_2_1__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3122:1: rule__Apply__Group_1_2_1__0__Impl : ( ',' ) ;
    public final void rule__Apply__Group_1_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3126:1: ( ( ',' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3127:1: ( ',' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3127:1: ( ',' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3128:1: ','
            {
             before(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Apply__Group_1_2_1__0__Impl6320); 
             after(grammarAccess.getApplyAccess().getCommaKeyword_1_2_1_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3141:1: rule__Apply__Group_1_2_1__1 : rule__Apply__Group_1_2_1__1__Impl ;
    public final void rule__Apply__Group_1_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3145:1: ( rule__Apply__Group_1_2_1__1__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3146:2: rule__Apply__Group_1_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_1_2_1__1__Impl_in_rule__Apply__Group_1_2_1__16351);
            rule__Apply__Group_1_2_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3152:1: rule__Apply__Group_1_2_1__1__Impl : ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) ;
    public final void rule__Apply__Group_1_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3156:1: ( ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3157:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3157:1: ( ( rule__Apply__ArgumentsAssignment_1_2_1_1 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3158:1: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            {
             before(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3159:1: ( rule__Apply__ArgumentsAssignment_1_2_1_1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3159:2: rule__Apply__ArgumentsAssignment_1_2_1_1
            {
            pushFollow(FOLLOW_rule__Apply__ArgumentsAssignment_1_2_1_1_in_rule__Apply__Group_1_2_1__1__Impl6378);
            rule__Apply__ArgumentsAssignment_1_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getArgumentsAssignment_1_2_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariableAssignment__Group__0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3173:1: rule__VariableAssignment__Group__0 : rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 ;
    public final void rule__VariableAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3177:1: ( rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3178:2: rule__VariableAssignment__Group__0__Impl rule__VariableAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__06412);
            rule__VariableAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__06415);
            rule__VariableAssignment__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3185:1: rule__VariableAssignment__Group__0__Impl : ( ( rule__VariableAssignment__IdAssignment_0 ) ) ;
    public final void rule__VariableAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3189:1: ( ( ( rule__VariableAssignment__IdAssignment_0 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3190:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3190:1: ( ( rule__VariableAssignment__IdAssignment_0 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3191:1: ( rule__VariableAssignment__IdAssignment_0 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3192:1: ( rule__VariableAssignment__IdAssignment_0 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3192:2: rule__VariableAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl6442);
            rule__VariableAssignment__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getIdAssignment_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3202:1: rule__VariableAssignment__Group__1 : rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 ;
    public final void rule__VariableAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3206:1: ( rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3207:2: rule__VariableAssignment__Group__1__Impl rule__VariableAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__16472);
            rule__VariableAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__16475);
            rule__VariableAssignment__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3214:1: rule__VariableAssignment__Group__1__Impl : ( '=' ) ;
    public final void rule__VariableAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3218:1: ( ( '=' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3219:1: ( '=' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3219:1: ( '=' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3220:1: '='
            {
             before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__VariableAssignment__Group__1__Impl6503); 
             after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3233:1: rule__VariableAssignment__Group__2 : rule__VariableAssignment__Group__2__Impl ;
    public final void rule__VariableAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3237:1: ( rule__VariableAssignment__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3238:2: rule__VariableAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__26534);
            rule__VariableAssignment__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3244:1: rule__VariableAssignment__Group__2__Impl : ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3248:1: ( ( ( rule__VariableAssignment__ExpressionAssignment_2 ) ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3249:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3249:1: ( ( rule__VariableAssignment__ExpressionAssignment_2 ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3250:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3251:1: ( rule__VariableAssignment__ExpressionAssignment_2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3251:2: rule__VariableAssignment__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl6561);
            rule__VariableAssignment__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3267:1: rule__ParenthesisExpression__Group__0 : rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 ;
    public final void rule__ParenthesisExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3271:1: ( rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3272:2: rule__ParenthesisExpression__Group__0__Impl rule__ParenthesisExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__06597);
            rule__ParenthesisExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__06600);
            rule__ParenthesisExpression__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3279:1: rule__ParenthesisExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesisExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3283:1: ( ( '(' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3284:1: ( '(' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3284:1: ( '(' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3285:1: '('
            {
             before(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ParenthesisExpression__Group__0__Impl6628); 
             after(grammarAccess.getParenthesisExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3298:1: rule__ParenthesisExpression__Group__1 : rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 ;
    public final void rule__ParenthesisExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3302:1: ( rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2 )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3303:2: rule__ParenthesisExpression__Group__1__Impl rule__ParenthesisExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__16659);
            rule__ParenthesisExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__16662);
            rule__ParenthesisExpression__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3310:1: rule__ParenthesisExpression__Group__1__Impl : ( ruleExpression ) ;
    public final void rule__ParenthesisExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3314:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3315:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3315:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3316:1: ruleExpression
            {
             before(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl6689);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParenthesisExpressionAccess().getExpressionParserRuleCall_1()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3327:1: rule__ParenthesisExpression__Group__2 : rule__ParenthesisExpression__Group__2__Impl ;
    public final void rule__ParenthesisExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3331:1: ( rule__ParenthesisExpression__Group__2__Impl )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3332:2: rule__ParenthesisExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__26718);
            rule__ParenthesisExpression__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3338:1: rule__ParenthesisExpression__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesisExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3342:1: ( ( ')' ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3343:1: ( ')' )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3343:1: ( ')' )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3344:1: ')'
            {
             before(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__ParenthesisExpression__Group__2__Impl6746); 
             after(grammarAccess.getParenthesisExpressionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3364:1: rule__Program__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3368:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3369:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3369:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3370:1: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_06788);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3379:1: rule__Program__ExpressionsAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__Program__ExpressionsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3383:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3384:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3384:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3385:1: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_06819);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpressionsExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BlockExpression__ExpressionsAssignment_1_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3394:1: rule__BlockExpression__ExpressionsAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__BlockExpression__ExpressionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3398:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3399:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3399:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3400:1: ruleExpression
            {
             before(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__BlockExpression__ExpressionsAssignment_1_06850);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBlockExpressionAccess().getExpressionsExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockExpression__ExpressionsAssignment_1_0"


    // $ANTLR start "rule__LetExpression__AssigmentAssignment_1_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3409:1: rule__LetExpression__AssigmentAssignment_1_0 : ( ruleVariableAssignment ) ;
    public final void rule__LetExpression__AssigmentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3413:1: ( ( ruleVariableAssignment ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3414:1: ( ruleVariableAssignment )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3414:1: ( ruleVariableAssignment )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3415:1: ruleVariableAssignment
            {
             before(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleVariableAssignment_in_rule__LetExpression__AssigmentAssignment_1_06881);
            ruleVariableAssignment();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getAssigmentVariableAssignmentParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__AssigmentAssignment_1_0"


    // $ANTLR start "rule__LetExpression__ExpressionAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3424:1: rule__LetExpression__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__LetExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3428:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3429:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3429:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3430:1: ruleExpression
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LetExpression__ExpressionAssignment_26912);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LetExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__TernaryExpression__OperatorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3439:1: rule__TernaryExpression__OperatorAssignment_0 : ( ruleTernaryOperator ) ;
    public final void rule__TernaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3443:1: ( ( ruleTernaryOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3444:1: ( ruleTernaryOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3444:1: ( ruleTernaryOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3445:1: ruleTernaryOperator
            {
             before(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTernaryOperator_in_rule__TernaryExpression__OperatorAssignment_06943);
            ruleTernaryOperator();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getOperatorTernaryOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__TernaryExpression__FirstExpressionAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3454:1: rule__TernaryExpression__FirstExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__FirstExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3458:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3459:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3459:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3460:1: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TernaryExpression__FirstExpressionAssignment_26974);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getFirstExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__FirstExpressionAssignment_2"


    // $ANTLR start "rule__TernaryExpression__SecondExpressionAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3469:1: rule__TernaryExpression__SecondExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__SecondExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3473:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3474:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3474:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3475:1: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TernaryExpression__SecondExpressionAssignment_47005);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getSecondExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__SecondExpressionAssignment_4"


    // $ANTLR start "rule__TernaryExpression__ThirdExpressionAssignment_6"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3484:1: rule__TernaryExpression__ThirdExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__TernaryExpression__ThirdExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3488:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3489:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3489:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3490:1: ruleExpression
            {
             before(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__TernaryExpression__ThirdExpressionAssignment_67036);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTernaryExpressionAccess().getThirdExpressionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TernaryExpression__ThirdExpressionAssignment_6"


    // $ANTLR start "rule__LogicalBinaryExpression__OperatorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3499:1: rule__LogicalBinaryExpression__OperatorAssignment_0 : ( ruleBinaryLogicalOperator ) ;
    public final void rule__LogicalBinaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3503:1: ( ( ruleBinaryLogicalOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3504:1: ( ruleBinaryLogicalOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3504:1: ( ruleBinaryLogicalOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3505:1: ruleBinaryLogicalOperator
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBinaryLogicalOperator_in_rule__LogicalBinaryExpression__OperatorAssignment_07067);
            ruleBinaryLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getOperatorBinaryLogicalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__LogicalBinaryExpression__LeftExprAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3514:1: rule__LogicalBinaryExpression__LeftExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__LogicalBinaryExpression__LeftExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3518:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3519:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3519:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3520:1: ruleExpression
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LogicalBinaryExpression__LeftExprAssignment_27098);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getLeftExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__LeftExprAssignment_2"


    // $ANTLR start "rule__LogicalBinaryExpression__RightExprAssignment_4"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3529:1: rule__LogicalBinaryExpression__RightExprAssignment_4 : ( ruleExpression ) ;
    public final void rule__LogicalBinaryExpression__RightExprAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3533:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3534:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3534:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3535:1: ruleExpression
            {
             before(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LogicalBinaryExpression__RightExprAssignment_47129);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalBinaryExpressionAccess().getRightExprExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalBinaryExpression__RightExprAssignment_4"


    // $ANTLR start "rule__LogicalUnaryExpression__OperatorAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3544:1: rule__LogicalUnaryExpression__OperatorAssignment_0 : ( ruleUnaryLogicalOperator ) ;
    public final void rule__LogicalUnaryExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3548:1: ( ( ruleUnaryLogicalOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3549:1: ( ruleUnaryLogicalOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3549:1: ( ruleUnaryLogicalOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3550:1: ruleUnaryLogicalOperator
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryLogicalOperator_in_rule__LogicalUnaryExpression__OperatorAssignment_07160);
            ruleUnaryLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionAccess().getOperatorUnaryLogicalOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__OperatorAssignment_0"


    // $ANTLR start "rule__LogicalUnaryExpression__ExpressionAssignment_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3559:1: rule__LogicalUnaryExpression__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__LogicalUnaryExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3563:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3564:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3564:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3565:1: ruleExpression
            {
             before(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LogicalUnaryExpression__ExpressionAssignment_27191);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLogicalUnaryExpressionAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalUnaryExpression__ExpressionAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3574:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparisonOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3578:1: ( ( ruleComparisonOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3579:1: ( ruleComparisonOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3579:1: ( ruleComparisonOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3580:1: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleComparisonOperator_in_rule__ComparisonExpression__OperatorAssignment_1_17222);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparisonOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightExprAssignment_1_2"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3589:1: rule__ComparisonExpression__RightExprAssignment_1_2 : ( ruleNumericExpression ) ;
    public final void rule__ComparisonExpression__RightExprAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3593:1: ( ( ruleNumericExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3594:1: ( ruleNumericExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3594:1: ( ruleNumericExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3595:1: ruleNumericExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleNumericExpression_in_rule__ComparisonExpression__RightExprAssignment_1_27253);
            ruleNumericExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExprNumericExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightExprAssignment_1_2"


    // $ANTLR start "rule__FunctionDeclaration__ParametersAssignment_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3604:1: rule__FunctionDeclaration__ParametersAssignment_2_0 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3608:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3609:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3609:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3610:1: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_07284); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_0_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3619:1: rule__FunctionDeclaration__ParametersAssignment_2_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionDeclaration__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3623:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3624:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3624:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3625:1: RULE_ID
            {
             before(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_17315); 
             after(grammarAccess.getFunctionDeclarationAccess().getParametersIDTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3634:1: rule__FunctionDeclaration__BodyAssignment_4 : ( ruleExpression ) ;
    public final void rule__FunctionDeclaration__BodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3638:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3639:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3639:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3640:1: ruleExpression
            {
             before(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__FunctionDeclaration__BodyAssignment_47346);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionDeclarationAccess().getBodyExpressionParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__SymbolReference__IdAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3649:1: rule__SymbolReference__IdAssignment : ( RULE_ID ) ;
    public final void rule__SymbolReference__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3653:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3654:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3654:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3655:1: RULE_ID
            {
             before(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment7377); 
             after(grammarAccess.getSymbolReferenceAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3664:1: rule__NumericExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__NumericExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3668:1: ( ( ruleAdditionOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3669:1: ( ruleAdditionOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3669:1: ( ruleAdditionOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3670:1: ruleAdditionOperator
            {
             before(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditionOperator_in_rule__NumericExpression__OperatorAssignment_1_17408);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3679:1: rule__NumericExpression__RightFactorAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__NumericExpression__RightFactorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3683:1: ( ( ruleFactor ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3684:1: ( ruleFactor )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3684:1: ( ruleFactor )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3685:1: ruleFactor
            {
             before(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleFactor_in_rule__NumericExpression__RightFactorAssignment_1_27439);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getNumericExpressionAccess().getRightFactorFactorParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3694:1: rule__Factor__OperatorAssignment_1_1 : ( ruleFactorOperator ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3698:1: ( ( ruleFactorOperator ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3699:1: ( ruleFactorOperator )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3699:1: ( ruleFactorOperator )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3700:1: ruleFactorOperator
            {
             before(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFactorOperator_in_rule__Factor__OperatorAssignment_1_17470);
            ruleFactorOperator();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorFactorOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3709:1: rule__Factor__RightTermAssignment_1_2 : ( ruleTerm ) ;
    public final void rule__Factor__RightTermAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3713:1: ( ( ruleTerm ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3714:1: ( ruleTerm )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3714:1: ( ruleTerm )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3715:1: ruleTerm
            {
             before(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Factor__RightTermAssignment_1_27501);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightTermTermParserRuleCall_1_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Apply__ArgumentsAssignment_1_2_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3724:1: rule__Apply__ArgumentsAssignment_1_2_0 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3728:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3729:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3729:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3730:1: ruleExpression
            {
             before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_07532);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_0_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3739:1: rule__Apply__ArgumentsAssignment_1_2_1_1 : ( ruleExpression ) ;
    public final void rule__Apply__ArgumentsAssignment_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3743:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3744:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3744:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3745:1: ruleExpression
            {
             before(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_1_17563);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplyAccess().getArgumentsExpressionParserRuleCall_1_2_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__LiteralBoolean__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3754:1: rule__LiteralBoolean__ValueAssignment : ( ruleBooleanValue ) ;
    public final void rule__LiteralBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3758:1: ( ( ruleBooleanValue ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3759:1: ( ruleBooleanValue )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3759:1: ( ruleBooleanValue )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3760:1: ruleBooleanValue
            {
             before(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleBooleanValue_in_rule__LiteralBoolean__ValueAssignment7594);
            ruleBooleanValue();

            state._fsp--;

             after(grammarAccess.getLiteralBooleanAccess().getValueBooleanValueEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralBoolean__ValueAssignment"


    // $ANTLR start "rule__LiteralNumber__ValueAssignment"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3769:1: rule__LiteralNumber__ValueAssignment : ( RULE_INT ) ;
    public final void rule__LiteralNumber__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3773:1: ( ( RULE_INT ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3774:1: ( RULE_INT )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3774:1: ( RULE_INT )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3775:1: RULE_INT
            {
             before(grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LiteralNumber__ValueAssignment7625); 
             after(grammarAccess.getLiteralNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralNumber__ValueAssignment"


    // $ANTLR start "rule__VariableAssignment__IdAssignment_0"
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3784:1: rule__VariableAssignment__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__VariableAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3788:1: ( ( RULE_ID ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3789:1: ( RULE_ID )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3789:1: ( RULE_ID )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3790:1: RULE_ID
            {
             before(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_07656); 
             after(grammarAccess.getVariableAssignmentAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3799:1: rule__VariableAssignment__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableAssignment__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3803:1: ( ( ruleExpression ) )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3804:1: ( ruleExpression )
            {
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3804:1: ( ruleExpression )
            // ../org.arz.miniScript.ui/src-gen/org/arz/ui/contentassist/antlr/internal/InternalMiniScript.g:3805:1: ruleExpression
            {
             before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_27687);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
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


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\2\uffff\1\6\7\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\15\7\uffff";
    static final String DFA1_maxS =
        "\1\42\1\uffff\1\43\7\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\6\5\uffff\1\4\1\5\12\uffff\2\3\2\6\1\uffff\1\10\1\uffff"+
            "\1\7\1\uffff\1\6\1\uffff\1\1",
            "",
            "\12\6\4\uffff\1\6\3\uffff\3\6\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "783:1: rule__Expression__Alternatives : ( ( ruleFunctionDeclaration ) | ( ruleVariableAssignment ) | ( ruleLogicalBinaryExpression ) | ( ruleLogicalUnaryExpression ) | ( ruleTernaryExpression ) | ( ruleComparisonExpression ) | ( ruleLetExpression ) | ( ruleBlockExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0_in_ruleProgram153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_entryRuleBlockExpression240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockExpression247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0_in_ruleBlockExpression273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0_in_ruleLetExpression333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_entryRuleTernaryExpression360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTernaryExpression367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__0_in_ruleTernaryExpression393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_entryRuleLogicalBinaryExpression420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalBinaryExpression427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__0_in_ruleLogicalBinaryExpression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_entryRuleLogicalUnaryExpression480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalUnaryExpression487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__0_in_ruleLogicalUnaryExpression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_entryRuleComparisonExpression540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpression547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0_in_ruleComparisonExpression573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0_in_ruleFunctionDeclaration633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_entryRuleSymbolReference660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolReference667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SymbolReference__IdAssignment_in_ruleSymbolReference693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_entryRuleNumericExpression720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericExpression727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0_in_ruleNumericExpression753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_entryRuleFactor780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactor787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0_in_ruleFactor813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0_in_ruleApply933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_entryRuleFunctor960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctor967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functor__Alternatives_in_ruleFunctor993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralExpression__Alternatives_in_ruleLiteralExpression1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralBoolean__ValueAssignment_in_ruleLiteralBoolean1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_entryRuleLiteralNumber1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralNumber1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralNumber__ValueAssignment_in_ruleLiteralNumber1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_entryRuleVariableAssignment1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssignment1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0_in_ruleVariableAssignment1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_entryRuleParenthesisExpression1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesisExpression1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0_in_ruleParenthesisExpression1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditionOperator__Alternatives_in_ruleAdditionOperator1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactorOperator__Alternatives_in_ruleFactorOperator1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonOperator__Alternatives_in_ruleComparisonOperator1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUnaryLogicalOperator1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryLogicalOperator__Alternatives_in_ruleBinaryLogicalOperator1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTernaryOperator1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__Alternatives_in_ruleBooleanValue1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_rule__Expression__Alternatives1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__Expression__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalBinaryExpression_in_rule__Expression__Alternatives1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalUnaryExpression_in_rule__Expression__Alternatives1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryExpression_in_rule__Expression__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpression_in_rule__Expression__Alternatives1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_rule__Expression__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockExpression_in_rule__Expression__Alternatives1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_rule__Term__Alternatives1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Term__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolReference_in_rule__Functor__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesisExpression_in_rule__Functor__Alternatives1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralNumber_in_rule__LiteralExpression__Alternatives1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralBoolean_in_rule__LiteralExpression__Alternatives1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AdditionOperator__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AdditionOperator__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FactorOperator__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FactorOperator__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ComparisonOperator__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComparisonOperator__Alternatives2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComparisonOperator__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ComparisonOperator__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComparisonOperator__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComparisonOperator__Alternatives2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BinaryLogicalOperator__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BinaryLogicalOperator__Alternatives2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BooleanValue__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BooleanValue__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__0__Impl_in_rule__Program__Group__02252 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Program__Group__1_in_rule__Program__Group__02255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_0_in_rule__Program__Group__0__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__1__Impl_in_rule__Program__Group__12312 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__Program__Group__2_in_rule__Program__Group__12315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Program__Group__1__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group__2__Impl_in_rule__Program__Group__22374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0_in_rule__Program__Group__2__Impl2401 = new BitSet(new long[]{0x0000000557801832L});
    public static final BitSet FOLLOW_rule__Program__Group_2__0__Impl_in_rule__Program__Group_2__02438 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1_in_rule__Program__Group_2__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ExpressionsAssignment_2_0_in_rule__Program__Group_2__0__Impl2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__Group_2__1__Impl_in_rule__Program__Group_2__12498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Program__Group_2__1__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__0__Impl_in_rule__BlockExpression__Group__02561 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1_in_rule__BlockExpression__Group__02564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BlockExpression__Group__0__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__1__Impl_in_rule__BlockExpression__Group__12623 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2_in_rule__BlockExpression__Group__12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_1__0_in_rule__BlockExpression__Group__1__Impl2655 = new BitSet(new long[]{0x0000000557801832L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_1__0_in_rule__BlockExpression__Group__1__Impl2667 = new BitSet(new long[]{0x0000000557801832L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group__2__Impl_in_rule__BlockExpression__Group__22700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BlockExpression__Group__2__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_1__0__Impl_in_rule__BlockExpression__Group_1__02765 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_1__1_in_rule__BlockExpression__Group_1__02768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__ExpressionsAssignment_1_0_in_rule__BlockExpression__Group_1__0__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockExpression__Group_1__1__Impl_in_rule__BlockExpression__Group_1__12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BlockExpression__Group_1__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__0__Impl_in_rule__LetExpression__Group__02888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1_in_rule__LetExpression__Group__02891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LetExpression__Group__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__1__Impl_in_rule__LetExpression__Group__12950 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2_in_rule__LetExpression__Group__12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__0_in_rule__LetExpression__Group__1__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group__2__Impl_in_rule__LetExpression__Group__23010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__ExpressionAssignment_2_in_rule__LetExpression__Group__2__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__0__Impl_in_rule__LetExpression__Group_1__03073 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__1_in_rule__LetExpression__Group_1__03076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__AssigmentAssignment_1_0_in_rule__LetExpression__Group_1__0__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LetExpression__Group_1__1__Impl_in_rule__LetExpression__Group_1__13133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LetExpression__Group_1__1__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__0__Impl_in_rule__TernaryExpression__Group__03196 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__1_in_rule__TernaryExpression__Group__03199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__OperatorAssignment_0_in_rule__TernaryExpression__Group__0__Impl3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__1__Impl_in_rule__TernaryExpression__Group__13256 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__2_in_rule__TernaryExpression__Group__13259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TernaryExpression__Group__1__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__2__Impl_in_rule__TernaryExpression__Group__23318 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__3_in_rule__TernaryExpression__Group__23321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__FirstExpressionAssignment_2_in_rule__TernaryExpression__Group__2__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__3__Impl_in_rule__TernaryExpression__Group__33378 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__4_in_rule__TernaryExpression__Group__33381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TernaryExpression__Group__3__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__4__Impl_in_rule__TernaryExpression__Group__43440 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__5_in_rule__TernaryExpression__Group__43443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__SecondExpressionAssignment_4_in_rule__TernaryExpression__Group__4__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__5__Impl_in_rule__TernaryExpression__Group__53500 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__6_in_rule__TernaryExpression__Group__53503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TernaryExpression__Group__5__Impl3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__6__Impl_in_rule__TernaryExpression__Group__63562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__7_in_rule__TernaryExpression__Group__63565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__ThirdExpressionAssignment_6_in_rule__TernaryExpression__Group__6__Impl3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TernaryExpression__Group__7__Impl_in_rule__TernaryExpression__Group__73622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TernaryExpression__Group__7__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__0__Impl_in_rule__LogicalBinaryExpression__Group__03697 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__1_in_rule__LogicalBinaryExpression__Group__03700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__OperatorAssignment_0_in_rule__LogicalBinaryExpression__Group__0__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__1__Impl_in_rule__LogicalBinaryExpression__Group__13757 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__2_in_rule__LogicalBinaryExpression__Group__13760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LogicalBinaryExpression__Group__1__Impl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__2__Impl_in_rule__LogicalBinaryExpression__Group__23819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__3_in_rule__LogicalBinaryExpression__Group__23822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__LeftExprAssignment_2_in_rule__LogicalBinaryExpression__Group__2__Impl3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__3__Impl_in_rule__LogicalBinaryExpression__Group__33879 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__4_in_rule__LogicalBinaryExpression__Group__33882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LogicalBinaryExpression__Group__3__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__4__Impl_in_rule__LogicalBinaryExpression__Group__43941 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__5_in_rule__LogicalBinaryExpression__Group__43944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__RightExprAssignment_4_in_rule__LogicalBinaryExpression__Group__4__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalBinaryExpression__Group__5__Impl_in_rule__LogicalBinaryExpression__Group__54001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LogicalBinaryExpression__Group__5__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__0__Impl_in_rule__LogicalUnaryExpression__Group__04072 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__1_in_rule__LogicalUnaryExpression__Group__04075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__OperatorAssignment_0_in_rule__LogicalUnaryExpression__Group__0__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__1__Impl_in_rule__LogicalUnaryExpression__Group__14132 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__2_in_rule__LogicalUnaryExpression__Group__14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LogicalUnaryExpression__Group__1__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__2__Impl_in_rule__LogicalUnaryExpression__Group__24194 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__3_in_rule__LogicalUnaryExpression__Group__24197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__ExpressionAssignment_2_in_rule__LogicalUnaryExpression__Group__2__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalUnaryExpression__Group__3__Impl_in_rule__LogicalUnaryExpression__Group__34254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LogicalUnaryExpression__Group__3__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group__0__Impl_in_rule__ComparisonExpression__Group__04321 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1_in_rule__ComparisonExpression__Group__04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__ComparisonExpression__Group__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group__1__Impl_in_rule__ComparisonExpression__Group__14380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0_in_rule__ComparisonExpression__Group__1__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__0__Impl_in_rule__ComparisonExpression__Group_1__04442 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1_in_rule__ComparisonExpression__Group_1__04445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__1__Impl_in_rule__ComparisonExpression__Group_1__14503 = new BitSet(new long[]{0x0000000106000030L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__2_in_rule__ComparisonExpression__Group_1__14506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__OperatorAssignment_1_1_in_rule__ComparisonExpression__Group_1__1__Impl4533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__Group_1__2__Impl_in_rule__ComparisonExpression__Group_1__24563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComparisonExpression__RightExprAssignment_1_2_in_rule__ComparisonExpression__Group_1__2__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__0__Impl_in_rule__FunctionDeclaration__Group__04626 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1_in_rule__FunctionDeclaration__Group__04629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionDeclaration__Group__0__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__1__Impl_in_rule__FunctionDeclaration__Group__14688 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2_in_rule__FunctionDeclaration__Group__14691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionDeclaration__Group__1__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__2__Impl_in_rule__FunctionDeclaration__Group__24750 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3_in_rule__FunctionDeclaration__Group__24753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0_in_rule__FunctionDeclaration__Group__2__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__3__Impl_in_rule__FunctionDeclaration__Group__34811 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4_in_rule__FunctionDeclaration__Group__34814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionDeclaration__Group__3__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group__4__Impl_in_rule__FunctionDeclaration__Group__44873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__BodyAssignment_4_in_rule__FunctionDeclaration__Group__4__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__0__Impl_in_rule__FunctionDeclaration__Group_2__04940 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1_in_rule__FunctionDeclaration__Group_2__04943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_0_in_rule__FunctionDeclaration__Group_2__0__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2__1__Impl_in_rule__FunctionDeclaration__Group_2__15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0_in_rule__FunctionDeclaration__Group_2__1__Impl5027 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__0__Impl_in_rule__FunctionDeclaration__Group_2_1__05062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1_in_rule__FunctionDeclaration__Group_2_1__05065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDeclaration__Group_2_1__0__Impl5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__Group_2_1__1__Impl_in_rule__FunctionDeclaration__Group_2_1__15124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclaration__ParametersAssignment_2_1_1_in_rule__FunctionDeclaration__Group_2_1__1__Impl5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__0__Impl_in_rule__NumericExpression__Group__05185 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1_in_rule__NumericExpression__Group__05188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__Group__0__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group__1__Impl_in_rule__NumericExpression__Group__15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0_in_rule__NumericExpression__Group__1__Impl5271 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__0__Impl_in_rule__NumericExpression__Group_1__05306 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1_in_rule__NumericExpression__Group_1__05309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__1__Impl_in_rule__NumericExpression__Group_1__15367 = new BitSet(new long[]{0x0000000106000030L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__2_in_rule__NumericExpression__Group_1__15370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__OperatorAssignment_1_1_in_rule__NumericExpression__Group_1__1__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__Group_1__2__Impl_in_rule__NumericExpression__Group_1__25427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumericExpression__RightFactorAssignment_1_2_in_rule__NumericExpression__Group_1__2__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__0__Impl_in_rule__Factor__Group__05490 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Factor__Group__1_in_rule__Factor__Group__05493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__Group__0__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group__1__Impl_in_rule__Factor__Group__15549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0_in_rule__Factor__Group__1__Impl5576 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__0__Impl_in_rule__Factor__Group_1__05611 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1_in_rule__Factor__Group_1__05614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__1__Impl_in_rule__Factor__Group_1__15672 = new BitSet(new long[]{0x0000000106000030L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__2_in_rule__Factor__Group_1__15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__OperatorAssignment_1_1_in_rule__Factor__Group_1__1__Impl5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__Group_1__2__Impl_in_rule__Factor__Group_1__25732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Factor__RightTermAssignment_1_2_in_rule__Factor__Group_1__2__Impl5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__05795 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__05798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctor_in_rule__Apply__Group__0__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0_in_rule__Apply__Group__1__Impl5881 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__0__Impl_in_rule__Apply__Group_1__05916 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1_in_rule__Apply__Group_1__05919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__1__Impl_in_rule__Apply__Group_1__15977 = new BitSet(new long[]{0x0000000757801830L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__2_in_rule__Apply__Group_1__15980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Apply__Group_1__1__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__2__Impl_in_rule__Apply__Group_1__26039 = new BitSet(new long[]{0x0000000757801830L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__3_in_rule__Apply__Group_1__26042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__0_in_rule__Apply__Group_1__2__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1__3__Impl_in_rule__Apply__Group_1__36100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Apply__Group_1__3__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__0__Impl_in_rule__Apply__Group_1_2__06167 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__1_in_rule__Apply__Group_1_2__06170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_2_0_in_rule__Apply__Group_1_2__0__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2__1__Impl_in_rule__Apply__Group_1_2__16227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__0_in_rule__Apply__Group_1_2__1__Impl6254 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__0__Impl_in_rule__Apply__Group_1_2_1__06289 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__1_in_rule__Apply__Group_1_2_1__06292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Apply__Group_1_2_1__0__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_1_2_1__1__Impl_in_rule__Apply__Group_1_2_1__16351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__ArgumentsAssignment_1_2_1_1_in_rule__Apply__Group_1_2_1__1__Impl6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__0__Impl_in_rule__VariableAssignment__Group__06412 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1_in_rule__VariableAssignment__Group__06415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__IdAssignment_0_in_rule__VariableAssignment__Group__0__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__1__Impl_in_rule__VariableAssignment__Group__16472 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2_in_rule__VariableAssignment__Group__16475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__VariableAssignment__Group__1__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__Group__2__Impl_in_rule__VariableAssignment__Group__26534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableAssignment__ExpressionAssignment_2_in_rule__VariableAssignment__Group__2__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__0__Impl_in_rule__ParenthesisExpression__Group__06597 = new BitSet(new long[]{0x0000000557801830L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1_in_rule__ParenthesisExpression__Group__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ParenthesisExpression__Group__0__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__1__Impl_in_rule__ParenthesisExpression__Group__16659 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2_in_rule__ParenthesisExpression__Group__16662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ParenthesisExpression__Group__1__Impl6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesisExpression__Group__2__Impl_in_rule__ParenthesisExpression__Group__26718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ParenthesisExpression__Group__2__Impl6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_06788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Program__ExpressionsAssignment_2_06819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BlockExpression__ExpressionsAssignment_1_06850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssignment_in_rule__LetExpression__AssigmentAssignment_1_06881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LetExpression__ExpressionAssignment_26912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTernaryOperator_in_rule__TernaryExpression__OperatorAssignment_06943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TernaryExpression__FirstExpressionAssignment_26974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TernaryExpression__SecondExpressionAssignment_47005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__TernaryExpression__ThirdExpressionAssignment_67036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryLogicalOperator_in_rule__LogicalBinaryExpression__OperatorAssignment_07067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LogicalBinaryExpression__LeftExprAssignment_27098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LogicalBinaryExpression__RightExprAssignment_47129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicalOperator_in_rule__LogicalUnaryExpression__OperatorAssignment_07160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LogicalUnaryExpression__ExpressionAssignment_27191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonOperator_in_rule__ComparisonExpression__OperatorAssignment_1_17222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericExpression_in_rule__ComparisonExpression__RightExprAssignment_1_27253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_07284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDeclaration__ParametersAssignment_2_1_17315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionDeclaration__BodyAssignment_47346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SymbolReference__IdAssignment7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_rule__NumericExpression__OperatorAssignment_1_17408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactor_in_rule__NumericExpression__RightFactorAssignment_1_27439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactorOperator_in_rule__Factor__OperatorAssignment_1_17470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Factor__RightTermAssignment_1_27501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_07532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Apply__ArgumentsAssignment_1_2_1_17563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__LiteralBoolean__ValueAssignment7594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LiteralNumber__ValueAssignment7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VariableAssignment__IdAssignment_07656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__VariableAssignment__ExpressionAssignment_27687 = new BitSet(new long[]{0x0000000000000002L});

}