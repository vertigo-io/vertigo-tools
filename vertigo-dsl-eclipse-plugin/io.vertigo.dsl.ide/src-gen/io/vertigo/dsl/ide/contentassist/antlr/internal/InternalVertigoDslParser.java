package io.vertigo.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import io.vertigo.dsl.services.VertigoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVertigoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'0..1'", "'0..*'", "'package'", "'.'", "'declare'", "'Domain'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'}'", "'args'", "'msg'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "']'", "','", "'multiple'", "'unit'", "'domain:'", "'label:'", "'required:'", "'DtDefinition'", "'stereoType'", "'id'", "'field'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVertigoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVertigoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVertigoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVertigoDsl.g"; }


    	private VertigoDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(VertigoDslGrammarAccess grammarAccess) {
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
    // InternalVertigoDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:54:1: ( ruleModel EOF )
            // InternalVertigoDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVertigoDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalVertigoDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalVertigoDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalVertigoDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalVertigoDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalVertigoDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleElement"
    // InternalVertigoDsl.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:79:1: ( ruleElement EOF )
            // InternalVertigoDsl.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalVertigoDsl.g:87:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:91:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalVertigoDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalVertigoDsl.g:92:2: ( ( rule__Element__Alternatives ) )
            // InternalVertigoDsl.g:93:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalVertigoDsl.g:94:3: ( rule__Element__Alternatives )
            // InternalVertigoDsl.g:94:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDeclaredDomain"
    // InternalVertigoDsl.g:103:1: entryRuleDeclaredDomain : ruleDeclaredDomain EOF ;
    public final void entryRuleDeclaredDomain() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:104:1: ( ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:105:1: ruleDeclaredDomain EOF
            {
             before(grammarAccess.getDeclaredDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredDomain();

            state._fsp--;

             after(grammarAccess.getDeclaredDomainRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaredDomain"


    // $ANTLR start "ruleDeclaredDomain"
    // InternalVertigoDsl.g:112:1: ruleDeclaredDomain : ( ( rule__DeclaredDomain__Group__0 ) ) ;
    public final void ruleDeclaredDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:116:2: ( ( ( rule__DeclaredDomain__Group__0 ) ) )
            // InternalVertigoDsl.g:117:2: ( ( rule__DeclaredDomain__Group__0 ) )
            {
            // InternalVertigoDsl.g:117:2: ( ( rule__DeclaredDomain__Group__0 ) )
            // InternalVertigoDsl.g:118:3: ( rule__DeclaredDomain__Group__0 )
            {
             before(grammarAccess.getDeclaredDomainAccess().getGroup()); 
            // InternalVertigoDsl.g:119:3: ( rule__DeclaredDomain__Group__0 )
            // InternalVertigoDsl.g:119:4: rule__DeclaredDomain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredDomain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredDomain"


    // $ANTLR start "entryRuleConstraint"
    // InternalVertigoDsl.g:128:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:129:1: ( ruleConstraint EOF )
            // InternalVertigoDsl.g:130:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalVertigoDsl.g:137:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:141:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalVertigoDsl.g:142:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalVertigoDsl.g:142:2: ( ( rule__Constraint__Group__0 ) )
            // InternalVertigoDsl.g:143:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalVertigoDsl.g:144:3: ( rule__Constraint__Group__0 )
            // InternalVertigoDsl.g:144:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleFileInfo"
    // InternalVertigoDsl.g:153:1: entryRuleFileInfo : ruleFileInfo EOF ;
    public final void entryRuleFileInfo() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:154:1: ( ruleFileInfo EOF )
            // InternalVertigoDsl.g:155:1: ruleFileInfo EOF
            {
             before(grammarAccess.getFileInfoRule()); 
            pushFollow(FOLLOW_1);
            ruleFileInfo();

            state._fsp--;

             after(grammarAccess.getFileInfoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileInfo"


    // $ANTLR start "ruleFileInfo"
    // InternalVertigoDsl.g:162:1: ruleFileInfo : ( ( rule__FileInfo__Group__0 ) ) ;
    public final void ruleFileInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:166:2: ( ( ( rule__FileInfo__Group__0 ) ) )
            // InternalVertigoDsl.g:167:2: ( ( rule__FileInfo__Group__0 ) )
            {
            // InternalVertigoDsl.g:167:2: ( ( rule__FileInfo__Group__0 ) )
            // InternalVertigoDsl.g:168:3: ( rule__FileInfo__Group__0 )
            {
             before(grammarAccess.getFileInfoAccess().getGroup()); 
            // InternalVertigoDsl.g:169:3: ( rule__FileInfo__Group__0 )
            // InternalVertigoDsl.g:169:4: rule__FileInfo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileInfo"


    // $ANTLR start "entryRuleFormatter"
    // InternalVertigoDsl.g:178:1: entryRuleFormatter : ruleFormatter EOF ;
    public final void entryRuleFormatter() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:179:1: ( ruleFormatter EOF )
            // InternalVertigoDsl.g:180:1: ruleFormatter EOF
            {
             before(grammarAccess.getFormatterRule()); 
            pushFollow(FOLLOW_1);
            ruleFormatter();

            state._fsp--;

             after(grammarAccess.getFormatterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormatter"


    // $ANTLR start "ruleFormatter"
    // InternalVertigoDsl.g:187:1: ruleFormatter : ( ( rule__Formatter__Group__0 ) ) ;
    public final void ruleFormatter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:191:2: ( ( ( rule__Formatter__Group__0 ) ) )
            // InternalVertigoDsl.g:192:2: ( ( rule__Formatter__Group__0 ) )
            {
            // InternalVertigoDsl.g:192:2: ( ( rule__Formatter__Group__0 ) )
            // InternalVertigoDsl.g:193:3: ( rule__Formatter__Group__0 )
            {
             before(grammarAccess.getFormatterAccess().getGroup()); 
            // InternalVertigoDsl.g:194:3: ( rule__Formatter__Group__0 )
            // InternalVertigoDsl.g:194:4: rule__Formatter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatter"


    // $ANTLR start "entryRuleDomain"
    // InternalVertigoDsl.g:203:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:204:1: ( ruleDomain EOF )
            // InternalVertigoDsl.g:205:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalVertigoDsl.g:212:1: ruleDomain : ( ( rule__Domain__UnorderedGroup ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:216:2: ( ( ( rule__Domain__UnorderedGroup ) ) )
            // InternalVertigoDsl.g:217:2: ( ( rule__Domain__UnorderedGroup ) )
            {
            // InternalVertigoDsl.g:217:2: ( ( rule__Domain__UnorderedGroup ) )
            // InternalVertigoDsl.g:218:3: ( rule__Domain__UnorderedGroup )
            {
             before(grammarAccess.getDomainAccess().getUnorderedGroup()); 
            // InternalVertigoDsl.g:219:3: ( rule__Domain__UnorderedGroup )
            // InternalVertigoDsl.g:219:4: rule__Domain__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Domain__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleFieldDescriptionString"
    // InternalVertigoDsl.g:228:1: entryRuleFieldDescriptionString : ruleFieldDescriptionString EOF ;
    public final void entryRuleFieldDescriptionString() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:229:1: ( ruleFieldDescriptionString EOF )
            // InternalVertigoDsl.g:230:1: ruleFieldDescriptionString EOF
            {
             before(grammarAccess.getFieldDescriptionStringRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldDescriptionString();

            state._fsp--;

             after(grammarAccess.getFieldDescriptionStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldDescriptionString"


    // $ANTLR start "ruleFieldDescriptionString"
    // InternalVertigoDsl.g:237:1: ruleFieldDescriptionString : ( ( rule__FieldDescriptionString__Group__0 ) ) ;
    public final void ruleFieldDescriptionString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:241:2: ( ( ( rule__FieldDescriptionString__Group__0 ) ) )
            // InternalVertigoDsl.g:242:2: ( ( rule__FieldDescriptionString__Group__0 ) )
            {
            // InternalVertigoDsl.g:242:2: ( ( rule__FieldDescriptionString__Group__0 ) )
            // InternalVertigoDsl.g:243:3: ( rule__FieldDescriptionString__Group__0 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getGroup()); 
            // InternalVertigoDsl.g:244:3: ( rule__FieldDescriptionString__Group__0 )
            // InternalVertigoDsl.g:244:4: rule__FieldDescriptionString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldDescriptionString"


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:253:1: entryRuleDtDefinition : ruleDtDefinition EOF ;
    public final void entryRuleDtDefinition() throws RecognitionException {
        try {
            // InternalVertigoDsl.g:254:1: ( ruleDtDefinition EOF )
            // InternalVertigoDsl.g:255:1: ruleDtDefinition EOF
            {
             before(grammarAccess.getDtDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDtDefinition();

            state._fsp--;

             after(grammarAccess.getDtDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinition"


    // $ANTLR start "ruleDtDefinition"
    // InternalVertigoDsl.g:262:1: ruleDtDefinition : ( ( rule__DtDefinition__UnorderedGroup ) ) ;
    public final void ruleDtDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:266:2: ( ( ( rule__DtDefinition__UnorderedGroup ) ) )
            // InternalVertigoDsl.g:267:2: ( ( rule__DtDefinition__UnorderedGroup ) )
            {
            // InternalVertigoDsl.g:267:2: ( ( rule__DtDefinition__UnorderedGroup ) )
            // InternalVertigoDsl.g:268:3: ( rule__DtDefinition__UnorderedGroup )
            {
             before(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()); 
            // InternalVertigoDsl.g:269:3: ( rule__DtDefinition__UnorderedGroup )
            // InternalVertigoDsl.g:269:4: rule__DtDefinition__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDtDefinition"


    // $ANTLR start "ruleDataType"
    // InternalVertigoDsl.g:278:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:282:1: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalVertigoDsl.g:283:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalVertigoDsl.g:283:2: ( ( rule__DataType__Alternatives ) )
            // InternalVertigoDsl.g:284:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalVertigoDsl.g:285:3: ( rule__DataType__Alternatives )
            // InternalVertigoDsl.g:285:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleBooleanString"
    // InternalVertigoDsl.g:294:1: ruleBooleanString : ( ( rule__BooleanString__Alternatives ) ) ;
    public final void ruleBooleanString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:298:1: ( ( ( rule__BooleanString__Alternatives ) ) )
            // InternalVertigoDsl.g:299:2: ( ( rule__BooleanString__Alternatives ) )
            {
            // InternalVertigoDsl.g:299:2: ( ( rule__BooleanString__Alternatives ) )
            // InternalVertigoDsl.g:300:3: ( rule__BooleanString__Alternatives )
            {
             before(grammarAccess.getBooleanStringAccess().getAlternatives()); 
            // InternalVertigoDsl.g:301:3: ( rule__BooleanString__Alternatives )
            // InternalVertigoDsl.g:301:4: rule__BooleanString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanString"


    // $ANTLR start "ruleMultiplicityString"
    // InternalVertigoDsl.g:310:1: ruleMultiplicityString : ( ( rule__MultiplicityString__Alternatives ) ) ;
    public final void ruleMultiplicityString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:314:1: ( ( ( rule__MultiplicityString__Alternatives ) ) )
            // InternalVertigoDsl.g:315:2: ( ( rule__MultiplicityString__Alternatives ) )
            {
            // InternalVertigoDsl.g:315:2: ( ( rule__MultiplicityString__Alternatives ) )
            // InternalVertigoDsl.g:316:3: ( rule__MultiplicityString__Alternatives )
            {
             before(grammarAccess.getMultiplicityStringAccess().getAlternatives()); 
            // InternalVertigoDsl.g:317:3: ( rule__MultiplicityString__Alternatives )
            // InternalVertigoDsl.g:317:4: rule__MultiplicityString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicityString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicityString"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalVertigoDsl.g:325:1: rule__Element__Alternatives : ( ( ruleConstraint ) | ( ruleFormatter ) | ( ruleDomain ) | ( ruleFileInfo ) | ( ruleDeclaredDomain ) | ( ruleDtDefinition ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:329:1: ( ( ruleConstraint ) | ( ruleFormatter ) | ( ruleDomain ) | ( ruleFileInfo ) | ( ruleDeclaredDomain ) | ( ruleDtDefinition ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 28:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt1=1;
                    }
                    break;
                case 38:
                    {
                    alt1=2;
                    }
                    break;
                case 36:
                    {
                    alt1=4;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 52:
                    {
                    alt1=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 47:
            case 48:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 54:
            case 55:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalVertigoDsl.g:330:2: ( ruleConstraint )
                    {
                    // InternalVertigoDsl.g:330:2: ( ruleConstraint )
                    // InternalVertigoDsl.g:331:3: ruleConstraint
                    {
                     before(grammarAccess.getElementAccess().getConstraintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getConstraintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:336:2: ( ruleFormatter )
                    {
                    // InternalVertigoDsl.g:336:2: ( ruleFormatter )
                    // InternalVertigoDsl.g:337:3: ruleFormatter
                    {
                     before(grammarAccess.getElementAccess().getFormatterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFormatter();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFormatterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:342:2: ( ruleDomain )
                    {
                    // InternalVertigoDsl.g:342:2: ( ruleDomain )
                    // InternalVertigoDsl.g:343:3: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:348:2: ( ruleFileInfo )
                    {
                    // InternalVertigoDsl.g:348:2: ( ruleFileInfo )
                    // InternalVertigoDsl.g:349:3: ruleFileInfo
                    {
                     before(grammarAccess.getElementAccess().getFileInfoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFileInfo();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFileInfoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:354:2: ( ruleDeclaredDomain )
                    {
                    // InternalVertigoDsl.g:354:2: ( ruleDeclaredDomain )
                    // InternalVertigoDsl.g:355:3: ruleDeclaredDomain
                    {
                     before(grammarAccess.getElementAccess().getDeclaredDomainParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDeclaredDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDeclaredDomainParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:360:2: ( ruleDtDefinition )
                    {
                    // InternalVertigoDsl.g:360:2: ( ruleDtDefinition )
                    // InternalVertigoDsl.g:361:3: ruleDtDefinition
                    {
                     before(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDtDefinition();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_5()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__FieldDescriptionString__Alternatives_1_0"
    // InternalVertigoDsl.g:370:1: rule__FieldDescriptionString__Alternatives_1_0 : ( ( ( rule__FieldDescriptionString__Group_1_0_0__0 ) ) | ( ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 ) ) );
    public final void rule__FieldDescriptionString__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:374:1: ( ( ( rule__FieldDescriptionString__Group_1_0_0__0 ) ) | ( ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==49) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVertigoDsl.g:375:2: ( ( rule__FieldDescriptionString__Group_1_0_0__0 ) )
                    {
                    // InternalVertigoDsl.g:375:2: ( ( rule__FieldDescriptionString__Group_1_0_0__0 ) )
                    // InternalVertigoDsl.g:376:3: ( rule__FieldDescriptionString__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_0_0()); 
                    // InternalVertigoDsl.g:377:3: ( rule__FieldDescriptionString__Group_1_0_0__0 )
                    // InternalVertigoDsl.g:377:4: rule__FieldDescriptionString__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:381:2: ( ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 ) )
                    {
                    // InternalVertigoDsl.g:381:2: ( ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 ) )
                    // InternalVertigoDsl.g:382:3: ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 )
                    {
                     before(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainAssignment_1_0_1()); 
                    // InternalVertigoDsl.g:383:3: ( rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 )
                    // InternalVertigoDsl.g:383:4: rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainAssignment_1_0_1()); 

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
    // $ANTLR end "rule__FieldDescriptionString__Alternatives_1_0"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalVertigoDsl.g:391:1: rule__DataType__Alternatives : ( ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'Boolean' ) ) | ( ( 'String' ) ) | ( ( 'LocalDate' ) ) | ( ( 'Instant' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Long' ) ) | ( ( 'DataStream' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:395:1: ( ( ( 'Integer' ) ) | ( ( 'Double' ) ) | ( ( 'Boolean' ) ) | ( ( 'String' ) ) | ( ( 'LocalDate' ) ) | ( ( 'Instant' ) ) | ( ( 'BigDecimal' ) ) | ( ( 'Long' ) ) | ( ( 'DataStream' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVertigoDsl.g:396:2: ( ( 'Integer' ) )
                    {
                    // InternalVertigoDsl.g:396:2: ( ( 'Integer' ) )
                    // InternalVertigoDsl.g:397:3: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 
                    // InternalVertigoDsl.g:398:3: ( 'Integer' )
                    // InternalVertigoDsl.g:398:4: 'Integer'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:402:2: ( ( 'Double' ) )
                    {
                    // InternalVertigoDsl.g:402:2: ( ( 'Double' ) )
                    // InternalVertigoDsl.g:403:3: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalVertigoDsl.g:404:3: ( 'Double' )
                    // InternalVertigoDsl.g:404:4: 'Double'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:408:2: ( ( 'Boolean' ) )
                    {
                    // InternalVertigoDsl.g:408:2: ( ( 'Boolean' ) )
                    // InternalVertigoDsl.g:409:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // InternalVertigoDsl.g:410:3: ( 'Boolean' )
                    // InternalVertigoDsl.g:410:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:414:2: ( ( 'String' ) )
                    {
                    // InternalVertigoDsl.g:414:2: ( ( 'String' ) )
                    // InternalVertigoDsl.g:415:3: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 
                    // InternalVertigoDsl.g:416:3: ( 'String' )
                    // InternalVertigoDsl.g:416:4: 'String'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:420:2: ( ( 'LocalDate' ) )
                    {
                    // InternalVertigoDsl.g:420:2: ( ( 'LocalDate' ) )
                    // InternalVertigoDsl.g:421:3: ( 'LocalDate' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4()); 
                    // InternalVertigoDsl.g:422:3: ( 'LocalDate' )
                    // InternalVertigoDsl.g:422:4: 'LocalDate'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:426:2: ( ( 'Instant' ) )
                    {
                    // InternalVertigoDsl.g:426:2: ( ( 'Instant' ) )
                    // InternalVertigoDsl.g:427:3: ( 'Instant' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5()); 
                    // InternalVertigoDsl.g:428:3: ( 'Instant' )
                    // InternalVertigoDsl.g:428:4: 'Instant'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:432:2: ( ( 'BigDecimal' ) )
                    {
                    // InternalVertigoDsl.g:432:2: ( ( 'BigDecimal' ) )
                    // InternalVertigoDsl.g:433:3: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6()); 
                    // InternalVertigoDsl.g:434:3: ( 'BigDecimal' )
                    // InternalVertigoDsl.g:434:4: 'BigDecimal'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:438:2: ( ( 'Long' ) )
                    {
                    // InternalVertigoDsl.g:438:2: ( ( 'Long' ) )
                    // InternalVertigoDsl.g:439:3: ( 'Long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7()); 
                    // InternalVertigoDsl.g:440:3: ( 'Long' )
                    // InternalVertigoDsl.g:440:4: 'Long'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:444:2: ( ( 'DataStream' ) )
                    {
                    // InternalVertigoDsl.g:444:2: ( ( 'DataStream' ) )
                    // InternalVertigoDsl.g:445:3: ( 'DataStream' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8()); 
                    // InternalVertigoDsl.g:446:3: ( 'DataStream' )
                    // InternalVertigoDsl.g:446:4: 'DataStream'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8()); 

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
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__BooleanString__Alternatives"
    // InternalVertigoDsl.g:454:1: rule__BooleanString__Alternatives : ( ( ( '\"true\"' ) ) | ( ( '\"false\"' ) ) );
    public final void rule__BooleanString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:458:1: ( ( ( '\"true\"' ) ) | ( ( '\"false\"' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVertigoDsl.g:459:2: ( ( '\"true\"' ) )
                    {
                    // InternalVertigoDsl.g:459:2: ( ( '\"true\"' ) )
                    // InternalVertigoDsl.g:460:3: ( '\"true\"' )
                    {
                     before(grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalVertigoDsl.g:461:3: ( '\"true\"' )
                    // InternalVertigoDsl.g:461:4: '\"true\"'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:465:2: ( ( '\"false\"' ) )
                    {
                    // InternalVertigoDsl.g:465:2: ( ( '\"false\"' ) )
                    // InternalVertigoDsl.g:466:3: ( '\"false\"' )
                    {
                     before(grammarAccess.getBooleanStringAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalVertigoDsl.g:467:3: ( '\"false\"' )
                    // InternalVertigoDsl.g:467:4: '\"false\"'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanStringAccess().getFALSEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanString__Alternatives"


    // $ANTLR start "rule__MultiplicityString__Alternatives"
    // InternalVertigoDsl.g:475:1: rule__MultiplicityString__Alternatives : ( ( ( '0..1' ) ) | ( ( '0..*' ) ) );
    public final void rule__MultiplicityString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:479:1: ( ( ( '0..1' ) ) | ( ( '0..*' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:480:2: ( ( '0..1' ) )
                    {
                    // InternalVertigoDsl.g:480:2: ( ( '0..1' ) )
                    // InternalVertigoDsl.g:481:3: ( '0..1' )
                    {
                     before(grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0()); 
                    // InternalVertigoDsl.g:482:3: ( '0..1' )
                    // InternalVertigoDsl.g:482:4: '0..1'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:486:2: ( ( '0..*' ) )
                    {
                    // InternalVertigoDsl.g:486:2: ( ( '0..*' ) )
                    // InternalVertigoDsl.g:487:3: ( '0..*' )
                    {
                     before(grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1()); 
                    // InternalVertigoDsl.g:488:3: ( '0..*' )
                    // InternalVertigoDsl.g:488:4: '0..*'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MultiplicityString__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalVertigoDsl.g:496:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:500:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalVertigoDsl.g:501:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalVertigoDsl.g:508:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:512:1: ( ( 'package' ) )
            // InternalVertigoDsl.g:513:1: ( 'package' )
            {
            // InternalVertigoDsl.g:513:1: ( 'package' )
            // InternalVertigoDsl.g:514:2: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalVertigoDsl.g:523:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:527:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalVertigoDsl.g:528:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalVertigoDsl.g:535:1: rule__Model__Group__1__Impl : ( ( rule__Model__PackageAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:539:1: ( ( ( rule__Model__PackageAssignment_1 ) ) )
            // InternalVertigoDsl.g:540:1: ( ( rule__Model__PackageAssignment_1 ) )
            {
            // InternalVertigoDsl.g:540:1: ( ( rule__Model__PackageAssignment_1 ) )
            // InternalVertigoDsl.g:541:2: ( rule__Model__PackageAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_1()); 
            // InternalVertigoDsl.g:542:2: ( rule__Model__PackageAssignment_1 )
            // InternalVertigoDsl.g:542:3: rule__Model__PackageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PackageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalVertigoDsl.g:550:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:554:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalVertigoDsl.g:555:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalVertigoDsl.g:562:1: rule__Model__Group__2__Impl : ( ( rule__Model__Group_2__0 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:566:1: ( ( ( rule__Model__Group_2__0 )* ) )
            // InternalVertigoDsl.g:567:1: ( ( rule__Model__Group_2__0 )* )
            {
            // InternalVertigoDsl.g:567:1: ( ( rule__Model__Group_2__0 )* )
            // InternalVertigoDsl.g:568:2: ( rule__Model__Group_2__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_2()); 
            // InternalVertigoDsl.g:569:2: ( rule__Model__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVertigoDsl.g:569:3: rule__Model__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalVertigoDsl.g:577:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:581:1: ( rule__Model__Group__3__Impl )
            // InternalVertigoDsl.g:582:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalVertigoDsl.g:588:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:592:1: ( ( ( rule__Model__ElementsAssignment_3 )* ) )
            // InternalVertigoDsl.g:593:1: ( ( rule__Model__ElementsAssignment_3 )* )
            {
            // InternalVertigoDsl.g:593:1: ( ( rule__Model__ElementsAssignment_3 )* )
            // InternalVertigoDsl.g:594:2: ( rule__Model__ElementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
            // InternalVertigoDsl.g:595:2: ( rule__Model__ElementsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26||LA7_0==28||LA7_0==33||(LA7_0>=40 && LA7_0<=43)||(LA7_0>=47 && LA7_0<=48)||(LA7_0>=54 && LA7_0<=55)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVertigoDsl.g:595:3: rule__Model__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group_2__0"
    // InternalVertigoDsl.g:604:1: rule__Model__Group_2__0 : rule__Model__Group_2__0__Impl rule__Model__Group_2__1 ;
    public final void rule__Model__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:608:1: ( rule__Model__Group_2__0__Impl rule__Model__Group_2__1 )
            // InternalVertigoDsl.g:609:2: rule__Model__Group_2__0__Impl rule__Model__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1();

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
    // $ANTLR end "rule__Model__Group_2__0"


    // $ANTLR start "rule__Model__Group_2__0__Impl"
    // InternalVertigoDsl.g:616:1: rule__Model__Group_2__0__Impl : ( ( ( '.' ) ) ( ( '.' )* ) ) ;
    public final void rule__Model__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:620:1: ( ( ( ( '.' ) ) ( ( '.' )* ) ) )
            // InternalVertigoDsl.g:621:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            {
            // InternalVertigoDsl.g:621:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            // InternalVertigoDsl.g:622:2: ( ( '.' ) ) ( ( '.' )* )
            {
            // InternalVertigoDsl.g:622:2: ( ( '.' ) )
            // InternalVertigoDsl.g:623:3: ( '.' )
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 
            // InternalVertigoDsl.g:624:3: ( '.' )
            // InternalVertigoDsl.g:624:4: '.'
            {
            match(input,25,FOLLOW_5); 

            }

             after(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 

            }

            // InternalVertigoDsl.g:627:2: ( ( '.' )* )
            // InternalVertigoDsl.g:628:3: ( '.' )*
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 
            // InternalVertigoDsl.g:629:3: ( '.' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVertigoDsl.g:629:4: '.'
            	    {
            	    match(input,25,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFullStopKeyword_2_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__0__Impl"


    // $ANTLR start "rule__Model__Group_2__1"
    // InternalVertigoDsl.g:638:1: rule__Model__Group_2__1 : rule__Model__Group_2__1__Impl ;
    public final void rule__Model__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:642:1: ( rule__Model__Group_2__1__Impl )
            // InternalVertigoDsl.g:643:2: rule__Model__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_2__1__Impl();

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
    // $ANTLR end "rule__Model__Group_2__1"


    // $ANTLR start "rule__Model__Group_2__1__Impl"
    // InternalVertigoDsl.g:649:1: rule__Model__Group_2__1__Impl : ( ( rule__Model__PackagesAssignment_2_1 ) ) ;
    public final void rule__Model__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:653:1: ( ( ( rule__Model__PackagesAssignment_2_1 ) ) )
            // InternalVertigoDsl.g:654:1: ( ( rule__Model__PackagesAssignment_2_1 ) )
            {
            // InternalVertigoDsl.g:654:1: ( ( rule__Model__PackagesAssignment_2_1 ) )
            // InternalVertigoDsl.g:655:2: ( rule__Model__PackagesAssignment_2_1 )
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); 
            // InternalVertigoDsl.g:656:2: ( rule__Model__PackagesAssignment_2_1 )
            // InternalVertigoDsl.g:656:3: rule__Model__PackagesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__PackagesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPackagesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_2__1__Impl"


    // $ANTLR start "rule__DeclaredDomain__Group__0"
    // InternalVertigoDsl.g:665:1: rule__DeclaredDomain__Group__0 : rule__DeclaredDomain__Group__0__Impl rule__DeclaredDomain__Group__1 ;
    public final void rule__DeclaredDomain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:669:1: ( rule__DeclaredDomain__Group__0__Impl rule__DeclaredDomain__Group__1 )
            // InternalVertigoDsl.g:670:2: rule__DeclaredDomain__Group__0__Impl rule__DeclaredDomain__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DeclaredDomain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredDomain__Group__1();

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
    // $ANTLR end "rule__DeclaredDomain__Group__0"


    // $ANTLR start "rule__DeclaredDomain__Group__0__Impl"
    // InternalVertigoDsl.g:677:1: rule__DeclaredDomain__Group__0__Impl : ( 'declare' ) ;
    public final void rule__DeclaredDomain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:681:1: ( ( 'declare' ) )
            // InternalVertigoDsl.g:682:1: ( 'declare' )
            {
            // InternalVertigoDsl.g:682:1: ( 'declare' )
            // InternalVertigoDsl.g:683:2: 'declare'
            {
             before(grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredDomain__Group__0__Impl"


    // $ANTLR start "rule__DeclaredDomain__Group__1"
    // InternalVertigoDsl.g:692:1: rule__DeclaredDomain__Group__1 : rule__DeclaredDomain__Group__1__Impl rule__DeclaredDomain__Group__2 ;
    public final void rule__DeclaredDomain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:696:1: ( rule__DeclaredDomain__Group__1__Impl rule__DeclaredDomain__Group__2 )
            // InternalVertigoDsl.g:697:2: rule__DeclaredDomain__Group__1__Impl rule__DeclaredDomain__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DeclaredDomain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaredDomain__Group__2();

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
    // $ANTLR end "rule__DeclaredDomain__Group__1"


    // $ANTLR start "rule__DeclaredDomain__Group__1__Impl"
    // InternalVertigoDsl.g:704:1: rule__DeclaredDomain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__DeclaredDomain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:708:1: ( ( 'Domain' ) )
            // InternalVertigoDsl.g:709:1: ( 'Domain' )
            {
            // InternalVertigoDsl.g:709:1: ( 'Domain' )
            // InternalVertigoDsl.g:710:2: 'Domain'
            {
             before(grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredDomain__Group__1__Impl"


    // $ANTLR start "rule__DeclaredDomain__Group__2"
    // InternalVertigoDsl.g:719:1: rule__DeclaredDomain__Group__2 : rule__DeclaredDomain__Group__2__Impl ;
    public final void rule__DeclaredDomain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:723:1: ( rule__DeclaredDomain__Group__2__Impl )
            // InternalVertigoDsl.g:724:2: rule__DeclaredDomain__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredDomain__Group__2__Impl();

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
    // $ANTLR end "rule__DeclaredDomain__Group__2"


    // $ANTLR start "rule__DeclaredDomain__Group__2__Impl"
    // InternalVertigoDsl.g:730:1: rule__DeclaredDomain__Group__2__Impl : ( ( rule__DeclaredDomain__NameAssignment_2 ) ) ;
    public final void rule__DeclaredDomain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:734:1: ( ( ( rule__DeclaredDomain__NameAssignment_2 ) ) )
            // InternalVertigoDsl.g:735:1: ( ( rule__DeclaredDomain__NameAssignment_2 ) )
            {
            // InternalVertigoDsl.g:735:1: ( ( rule__DeclaredDomain__NameAssignment_2 ) )
            // InternalVertigoDsl.g:736:2: ( rule__DeclaredDomain__NameAssignment_2 )
            {
             before(grammarAccess.getDeclaredDomainAccess().getNameAssignment_2()); 
            // InternalVertigoDsl.g:737:2: ( rule__DeclaredDomain__NameAssignment_2 )
            // InternalVertigoDsl.g:737:3: rule__DeclaredDomain__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredDomain__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredDomainAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredDomain__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalVertigoDsl.g:746:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:750:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalVertigoDsl.g:751:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

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
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalVertigoDsl.g:758:1: rule__Constraint__Group__0__Impl : ( 'create' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:762:1: ( ( 'create' ) )
            // InternalVertigoDsl.g:763:1: ( 'create' )
            {
            // InternalVertigoDsl.g:763:1: ( 'create' )
            // InternalVertigoDsl.g:764:2: 'create'
            {
             before(grammarAccess.getConstraintAccess().getCreateKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalVertigoDsl.g:773:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:777:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalVertigoDsl.g:778:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

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
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalVertigoDsl.g:785:1: rule__Constraint__Group__1__Impl : ( 'Constraint' ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:789:1: ( ( 'Constraint' ) )
            // InternalVertigoDsl.g:790:1: ( 'Constraint' )
            {
            // InternalVertigoDsl.g:790:1: ( 'Constraint' )
            // InternalVertigoDsl.g:791:2: 'Constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalVertigoDsl.g:800:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:804:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalVertigoDsl.g:805:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

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
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalVertigoDsl.g:812:1: rule__Constraint__Group__2__Impl : ( ( rule__Constraint__NameAssignment_2 ) ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:816:1: ( ( ( rule__Constraint__NameAssignment_2 ) ) )
            // InternalVertigoDsl.g:817:1: ( ( rule__Constraint__NameAssignment_2 ) )
            {
            // InternalVertigoDsl.g:817:1: ( ( rule__Constraint__NameAssignment_2 ) )
            // InternalVertigoDsl.g:818:2: ( rule__Constraint__NameAssignment_2 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_2()); 
            // InternalVertigoDsl.g:819:2: ( rule__Constraint__NameAssignment_2 )
            // InternalVertigoDsl.g:819:3: rule__Constraint__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalVertigoDsl.g:827:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl rule__Constraint__Group__4 ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:831:1: ( rule__Constraint__Group__3__Impl rule__Constraint__Group__4 )
            // InternalVertigoDsl.g:832:2: rule__Constraint__Group__3__Impl rule__Constraint__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Constraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__4();

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
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalVertigoDsl.g:839:1: rule__Constraint__Group__3__Impl : ( '{' ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:843:1: ( ( '{' ) )
            // InternalVertigoDsl.g:844:1: ( '{' )
            {
            // InternalVertigoDsl.g:844:1: ( '{' )
            // InternalVertigoDsl.g:845:2: '{'
            {
             before(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__Constraint__Group__4"
    // InternalVertigoDsl.g:854:1: rule__Constraint__Group__4 : rule__Constraint__Group__4__Impl rule__Constraint__Group__5 ;
    public final void rule__Constraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:858:1: ( rule__Constraint__Group__4__Impl rule__Constraint__Group__5 )
            // InternalVertigoDsl.g:859:2: rule__Constraint__Group__4__Impl rule__Constraint__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__5();

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
    // $ANTLR end "rule__Constraint__Group__4"


    // $ANTLR start "rule__Constraint__Group__4__Impl"
    // InternalVertigoDsl.g:866:1: rule__Constraint__Group__4__Impl : ( 'className' ) ;
    public final void rule__Constraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:870:1: ( ( 'className' ) )
            // InternalVertigoDsl.g:871:1: ( 'className' )
            {
            // InternalVertigoDsl.g:871:1: ( 'className' )
            // InternalVertigoDsl.g:872:2: 'className'
            {
             before(grammarAccess.getConstraintAccess().getClassNameKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getClassNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__4__Impl"


    // $ANTLR start "rule__Constraint__Group__5"
    // InternalVertigoDsl.g:881:1: rule__Constraint__Group__5 : rule__Constraint__Group__5__Impl rule__Constraint__Group__6 ;
    public final void rule__Constraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:885:1: ( rule__Constraint__Group__5__Impl rule__Constraint__Group__6 )
            // InternalVertigoDsl.g:886:2: rule__Constraint__Group__5__Impl rule__Constraint__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Constraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__6();

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
    // $ANTLR end "rule__Constraint__Group__5"


    // $ANTLR start "rule__Constraint__Group__5__Impl"
    // InternalVertigoDsl.g:893:1: rule__Constraint__Group__5__Impl : ( ':' ) ;
    public final void rule__Constraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:897:1: ( ( ':' ) )
            // InternalVertigoDsl.g:898:1: ( ':' )
            {
            // InternalVertigoDsl.g:898:1: ( ':' )
            // InternalVertigoDsl.g:899:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__5__Impl"


    // $ANTLR start "rule__Constraint__Group__6"
    // InternalVertigoDsl.g:908:1: rule__Constraint__Group__6 : rule__Constraint__Group__6__Impl rule__Constraint__Group__7 ;
    public final void rule__Constraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:912:1: ( rule__Constraint__Group__6__Impl rule__Constraint__Group__7 )
            // InternalVertigoDsl.g:913:2: rule__Constraint__Group__6__Impl rule__Constraint__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Constraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__7();

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
    // $ANTLR end "rule__Constraint__Group__6"


    // $ANTLR start "rule__Constraint__Group__6__Impl"
    // InternalVertigoDsl.g:920:1: rule__Constraint__Group__6__Impl : ( ( rule__Constraint__ClassNameAssignment_6 ) ) ;
    public final void rule__Constraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:924:1: ( ( ( rule__Constraint__ClassNameAssignment_6 ) ) )
            // InternalVertigoDsl.g:925:1: ( ( rule__Constraint__ClassNameAssignment_6 ) )
            {
            // InternalVertigoDsl.g:925:1: ( ( rule__Constraint__ClassNameAssignment_6 ) )
            // InternalVertigoDsl.g:926:2: ( rule__Constraint__ClassNameAssignment_6 )
            {
             before(grammarAccess.getConstraintAccess().getClassNameAssignment_6()); 
            // InternalVertigoDsl.g:927:2: ( rule__Constraint__ClassNameAssignment_6 )
            // InternalVertigoDsl.g:927:3: rule__Constraint__ClassNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ClassNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getClassNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__6__Impl"


    // $ANTLR start "rule__Constraint__Group__7"
    // InternalVertigoDsl.g:935:1: rule__Constraint__Group__7 : rule__Constraint__Group__7__Impl rule__Constraint__Group__8 ;
    public final void rule__Constraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:939:1: ( rule__Constraint__Group__7__Impl rule__Constraint__Group__8 )
            // InternalVertigoDsl.g:940:2: rule__Constraint__Group__7__Impl rule__Constraint__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Constraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__8();

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
    // $ANTLR end "rule__Constraint__Group__7"


    // $ANTLR start "rule__Constraint__Group__7__Impl"
    // InternalVertigoDsl.g:947:1: rule__Constraint__Group__7__Impl : ( ( rule__Constraint__Group_7__0 )? ) ;
    public final void rule__Constraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:951:1: ( ( ( rule__Constraint__Group_7__0 )? ) )
            // InternalVertigoDsl.g:952:1: ( ( rule__Constraint__Group_7__0 )? )
            {
            // InternalVertigoDsl.g:952:1: ( ( rule__Constraint__Group_7__0 )? )
            // InternalVertigoDsl.g:953:2: ( rule__Constraint__Group_7__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_7()); 
            // InternalVertigoDsl.g:954:2: ( rule__Constraint__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVertigoDsl.g:954:3: rule__Constraint__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__7__Impl"


    // $ANTLR start "rule__Constraint__Group__8"
    // InternalVertigoDsl.g:962:1: rule__Constraint__Group__8 : rule__Constraint__Group__8__Impl rule__Constraint__Group__9 ;
    public final void rule__Constraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:966:1: ( rule__Constraint__Group__8__Impl rule__Constraint__Group__9 )
            // InternalVertigoDsl.g:967:2: rule__Constraint__Group__8__Impl rule__Constraint__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__Constraint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__9();

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
    // $ANTLR end "rule__Constraint__Group__8"


    // $ANTLR start "rule__Constraint__Group__8__Impl"
    // InternalVertigoDsl.g:974:1: rule__Constraint__Group__8__Impl : ( ( rule__Constraint__Group_8__0 )? ) ;
    public final void rule__Constraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:978:1: ( ( ( rule__Constraint__Group_8__0 )? ) )
            // InternalVertigoDsl.g:979:1: ( ( rule__Constraint__Group_8__0 )? )
            {
            // InternalVertigoDsl.g:979:1: ( ( rule__Constraint__Group_8__0 )? )
            // InternalVertigoDsl.g:980:2: ( rule__Constraint__Group_8__0 )?
            {
             before(grammarAccess.getConstraintAccess().getGroup_8()); 
            // InternalVertigoDsl.g:981:2: ( rule__Constraint__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVertigoDsl.g:981:3: rule__Constraint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constraint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__8__Impl"


    // $ANTLR start "rule__Constraint__Group__9"
    // InternalVertigoDsl.g:989:1: rule__Constraint__Group__9 : rule__Constraint__Group__9__Impl ;
    public final void rule__Constraint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:993:1: ( rule__Constraint__Group__9__Impl )
            // InternalVertigoDsl.g:994:2: rule__Constraint__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__9__Impl();

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
    // $ANTLR end "rule__Constraint__Group__9"


    // $ANTLR start "rule__Constraint__Group__9__Impl"
    // InternalVertigoDsl.g:1000:1: rule__Constraint__Group__9__Impl : ( '}' ) ;
    public final void rule__Constraint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1004:1: ( ( '}' ) )
            // InternalVertigoDsl.g:1005:1: ( '}' )
            {
            // InternalVertigoDsl.g:1005:1: ( '}' )
            // InternalVertigoDsl.g:1006:2: '}'
            {
             before(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__9__Impl"


    // $ANTLR start "rule__Constraint__Group_7__0"
    // InternalVertigoDsl.g:1016:1: rule__Constraint__Group_7__0 : rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1 ;
    public final void rule__Constraint__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1020:1: ( rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1 )
            // InternalVertigoDsl.g:1021:2: rule__Constraint__Group_7__0__Impl rule__Constraint__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_7__1();

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
    // $ANTLR end "rule__Constraint__Group_7__0"


    // $ANTLR start "rule__Constraint__Group_7__0__Impl"
    // InternalVertigoDsl.g:1028:1: rule__Constraint__Group_7__0__Impl : ( 'args' ) ;
    public final void rule__Constraint__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1032:1: ( ( 'args' ) )
            // InternalVertigoDsl.g:1033:1: ( 'args' )
            {
            // InternalVertigoDsl.g:1033:1: ( 'args' )
            // InternalVertigoDsl.g:1034:2: 'args'
            {
             before(grammarAccess.getConstraintAccess().getArgsKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getArgsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_7__0__Impl"


    // $ANTLR start "rule__Constraint__Group_7__1"
    // InternalVertigoDsl.g:1043:1: rule__Constraint__Group_7__1 : rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2 ;
    public final void rule__Constraint__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1047:1: ( rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2 )
            // InternalVertigoDsl.g:1048:2: rule__Constraint__Group_7__1__Impl rule__Constraint__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Constraint__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_7__2();

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
    // $ANTLR end "rule__Constraint__Group_7__1"


    // $ANTLR start "rule__Constraint__Group_7__1__Impl"
    // InternalVertigoDsl.g:1055:1: rule__Constraint__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1059:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1060:1: ( ':' )
            {
            // InternalVertigoDsl.g:1060:1: ( ':' )
            // InternalVertigoDsl.g:1061:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_7_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_7__1__Impl"


    // $ANTLR start "rule__Constraint__Group_7__2"
    // InternalVertigoDsl.g:1070:1: rule__Constraint__Group_7__2 : rule__Constraint__Group_7__2__Impl ;
    public final void rule__Constraint__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1074:1: ( rule__Constraint__Group_7__2__Impl )
            // InternalVertigoDsl.g:1075:2: rule__Constraint__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_7__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group_7__2"


    // $ANTLR start "rule__Constraint__Group_7__2__Impl"
    // InternalVertigoDsl.g:1081:1: rule__Constraint__Group_7__2__Impl : ( ( rule__Constraint__ArgsAssignment_7_2 ) ) ;
    public final void rule__Constraint__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1085:1: ( ( ( rule__Constraint__ArgsAssignment_7_2 ) ) )
            // InternalVertigoDsl.g:1086:1: ( ( rule__Constraint__ArgsAssignment_7_2 ) )
            {
            // InternalVertigoDsl.g:1086:1: ( ( rule__Constraint__ArgsAssignment_7_2 ) )
            // InternalVertigoDsl.g:1087:2: ( rule__Constraint__ArgsAssignment_7_2 )
            {
             before(grammarAccess.getConstraintAccess().getArgsAssignment_7_2()); 
            // InternalVertigoDsl.g:1088:2: ( rule__Constraint__ArgsAssignment_7_2 )
            // InternalVertigoDsl.g:1088:3: rule__Constraint__ArgsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ArgsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getArgsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_7__2__Impl"


    // $ANTLR start "rule__Constraint__Group_8__0"
    // InternalVertigoDsl.g:1097:1: rule__Constraint__Group_8__0 : rule__Constraint__Group_8__0__Impl rule__Constraint__Group_8__1 ;
    public final void rule__Constraint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1101:1: ( rule__Constraint__Group_8__0__Impl rule__Constraint__Group_8__1 )
            // InternalVertigoDsl.g:1102:2: rule__Constraint__Group_8__0__Impl rule__Constraint__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Constraint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_8__1();

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
    // $ANTLR end "rule__Constraint__Group_8__0"


    // $ANTLR start "rule__Constraint__Group_8__0__Impl"
    // InternalVertigoDsl.g:1109:1: rule__Constraint__Group_8__0__Impl : ( 'msg' ) ;
    public final void rule__Constraint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1113:1: ( ( 'msg' ) )
            // InternalVertigoDsl.g:1114:1: ( 'msg' )
            {
            // InternalVertigoDsl.g:1114:1: ( 'msg' )
            // InternalVertigoDsl.g:1115:2: 'msg'
            {
             before(grammarAccess.getConstraintAccess().getMsgKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getMsgKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_8__0__Impl"


    // $ANTLR start "rule__Constraint__Group_8__1"
    // InternalVertigoDsl.g:1124:1: rule__Constraint__Group_8__1 : rule__Constraint__Group_8__1__Impl rule__Constraint__Group_8__2 ;
    public final void rule__Constraint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1128:1: ( rule__Constraint__Group_8__1__Impl rule__Constraint__Group_8__2 )
            // InternalVertigoDsl.g:1129:2: rule__Constraint__Group_8__1__Impl rule__Constraint__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__Constraint__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group_8__2();

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
    // $ANTLR end "rule__Constraint__Group_8__1"


    // $ANTLR start "rule__Constraint__Group_8__1__Impl"
    // InternalVertigoDsl.g:1136:1: rule__Constraint__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Constraint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1140:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1141:1: ( ':' )
            {
            // InternalVertigoDsl.g:1141:1: ( ':' )
            // InternalVertigoDsl.g:1142:2: ':'
            {
             before(grammarAccess.getConstraintAccess().getColonKeyword_8_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_8__1__Impl"


    // $ANTLR start "rule__Constraint__Group_8__2"
    // InternalVertigoDsl.g:1151:1: rule__Constraint__Group_8__2 : rule__Constraint__Group_8__2__Impl ;
    public final void rule__Constraint__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1155:1: ( rule__Constraint__Group_8__2__Impl )
            // InternalVertigoDsl.g:1156:2: rule__Constraint__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group_8__2__Impl();

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
    // $ANTLR end "rule__Constraint__Group_8__2"


    // $ANTLR start "rule__Constraint__Group_8__2__Impl"
    // InternalVertigoDsl.g:1162:1: rule__Constraint__Group_8__2__Impl : ( ( rule__Constraint__MsgAssignment_8_2 ) ) ;
    public final void rule__Constraint__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1166:1: ( ( ( rule__Constraint__MsgAssignment_8_2 ) ) )
            // InternalVertigoDsl.g:1167:1: ( ( rule__Constraint__MsgAssignment_8_2 ) )
            {
            // InternalVertigoDsl.g:1167:1: ( ( rule__Constraint__MsgAssignment_8_2 ) )
            // InternalVertigoDsl.g:1168:2: ( rule__Constraint__MsgAssignment_8_2 )
            {
             before(grammarAccess.getConstraintAccess().getMsgAssignment_8_2()); 
            // InternalVertigoDsl.g:1169:2: ( rule__Constraint__MsgAssignment_8_2 )
            // InternalVertigoDsl.g:1169:3: rule__Constraint__MsgAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__MsgAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getMsgAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group_8__2__Impl"


    // $ANTLR start "rule__FileInfo__Group__0"
    // InternalVertigoDsl.g:1178:1: rule__FileInfo__Group__0 : rule__FileInfo__Group__0__Impl rule__FileInfo__Group__1 ;
    public final void rule__FileInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1182:1: ( rule__FileInfo__Group__0__Impl rule__FileInfo__Group__1 )
            // InternalVertigoDsl.g:1183:2: rule__FileInfo__Group__0__Impl rule__FileInfo__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FileInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__1();

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
    // $ANTLR end "rule__FileInfo__Group__0"


    // $ANTLR start "rule__FileInfo__Group__0__Impl"
    // InternalVertigoDsl.g:1190:1: rule__FileInfo__Group__0__Impl : ( 'create' ) ;
    public final void rule__FileInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1194:1: ( ( 'create' ) )
            // InternalVertigoDsl.g:1195:1: ( 'create' )
            {
            // InternalVertigoDsl.g:1195:1: ( 'create' )
            // InternalVertigoDsl.g:1196:2: 'create'
            {
             before(grammarAccess.getFileInfoAccess().getCreateKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__0__Impl"


    // $ANTLR start "rule__FileInfo__Group__1"
    // InternalVertigoDsl.g:1205:1: rule__FileInfo__Group__1 : rule__FileInfo__Group__1__Impl rule__FileInfo__Group__2 ;
    public final void rule__FileInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1209:1: ( rule__FileInfo__Group__1__Impl rule__FileInfo__Group__2 )
            // InternalVertigoDsl.g:1210:2: rule__FileInfo__Group__1__Impl rule__FileInfo__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FileInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__2();

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
    // $ANTLR end "rule__FileInfo__Group__1"


    // $ANTLR start "rule__FileInfo__Group__1__Impl"
    // InternalVertigoDsl.g:1217:1: rule__FileInfo__Group__1__Impl : ( 'FileInfo' ) ;
    public final void rule__FileInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1221:1: ( ( 'FileInfo' ) )
            // InternalVertigoDsl.g:1222:1: ( 'FileInfo' )
            {
            // InternalVertigoDsl.g:1222:1: ( 'FileInfo' )
            // InternalVertigoDsl.g:1223:2: 'FileInfo'
            {
             before(grammarAccess.getFileInfoAccess().getFileInfoKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getFileInfoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__1__Impl"


    // $ANTLR start "rule__FileInfo__Group__2"
    // InternalVertigoDsl.g:1232:1: rule__FileInfo__Group__2 : rule__FileInfo__Group__2__Impl rule__FileInfo__Group__3 ;
    public final void rule__FileInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1236:1: ( rule__FileInfo__Group__2__Impl rule__FileInfo__Group__3 )
            // InternalVertigoDsl.g:1237:2: rule__FileInfo__Group__2__Impl rule__FileInfo__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__FileInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__3();

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
    // $ANTLR end "rule__FileInfo__Group__2"


    // $ANTLR start "rule__FileInfo__Group__2__Impl"
    // InternalVertigoDsl.g:1244:1: rule__FileInfo__Group__2__Impl : ( ( rule__FileInfo__NameAssignment_2 ) ) ;
    public final void rule__FileInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1248:1: ( ( ( rule__FileInfo__NameAssignment_2 ) ) )
            // InternalVertigoDsl.g:1249:1: ( ( rule__FileInfo__NameAssignment_2 ) )
            {
            // InternalVertigoDsl.g:1249:1: ( ( rule__FileInfo__NameAssignment_2 ) )
            // InternalVertigoDsl.g:1250:2: ( rule__FileInfo__NameAssignment_2 )
            {
             before(grammarAccess.getFileInfoAccess().getNameAssignment_2()); 
            // InternalVertigoDsl.g:1251:2: ( rule__FileInfo__NameAssignment_2 )
            // InternalVertigoDsl.g:1251:3: rule__FileInfo__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileInfo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileInfoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__2__Impl"


    // $ANTLR start "rule__FileInfo__Group__3"
    // InternalVertigoDsl.g:1259:1: rule__FileInfo__Group__3 : rule__FileInfo__Group__3__Impl rule__FileInfo__Group__4 ;
    public final void rule__FileInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1263:1: ( rule__FileInfo__Group__3__Impl rule__FileInfo__Group__4 )
            // InternalVertigoDsl.g:1264:2: rule__FileInfo__Group__3__Impl rule__FileInfo__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__FileInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__4();

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
    // $ANTLR end "rule__FileInfo__Group__3"


    // $ANTLR start "rule__FileInfo__Group__3__Impl"
    // InternalVertigoDsl.g:1271:1: rule__FileInfo__Group__3__Impl : ( '{' ) ;
    public final void rule__FileInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1275:1: ( ( '{' ) )
            // InternalVertigoDsl.g:1276:1: ( '{' )
            {
            // InternalVertigoDsl.g:1276:1: ( '{' )
            // InternalVertigoDsl.g:1277:2: '{'
            {
             before(grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__3__Impl"


    // $ANTLR start "rule__FileInfo__Group__4"
    // InternalVertigoDsl.g:1286:1: rule__FileInfo__Group__4 : rule__FileInfo__Group__4__Impl rule__FileInfo__Group__5 ;
    public final void rule__FileInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1290:1: ( rule__FileInfo__Group__4__Impl rule__FileInfo__Group__5 )
            // InternalVertigoDsl.g:1291:2: rule__FileInfo__Group__4__Impl rule__FileInfo__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__FileInfo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__5();

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
    // $ANTLR end "rule__FileInfo__Group__4"


    // $ANTLR start "rule__FileInfo__Group__4__Impl"
    // InternalVertigoDsl.g:1298:1: rule__FileInfo__Group__4__Impl : ( 'storeName' ) ;
    public final void rule__FileInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1302:1: ( ( 'storeName' ) )
            // InternalVertigoDsl.g:1303:1: ( 'storeName' )
            {
            // InternalVertigoDsl.g:1303:1: ( 'storeName' )
            // InternalVertigoDsl.g:1304:2: 'storeName'
            {
             before(grammarAccess.getFileInfoAccess().getStoreNameKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getStoreNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__4__Impl"


    // $ANTLR start "rule__FileInfo__Group__5"
    // InternalVertigoDsl.g:1313:1: rule__FileInfo__Group__5 : rule__FileInfo__Group__5__Impl rule__FileInfo__Group__6 ;
    public final void rule__FileInfo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1317:1: ( rule__FileInfo__Group__5__Impl rule__FileInfo__Group__6 )
            // InternalVertigoDsl.g:1318:2: rule__FileInfo__Group__5__Impl rule__FileInfo__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__FileInfo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__6();

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
    // $ANTLR end "rule__FileInfo__Group__5"


    // $ANTLR start "rule__FileInfo__Group__5__Impl"
    // InternalVertigoDsl.g:1325:1: rule__FileInfo__Group__5__Impl : ( ':' ) ;
    public final void rule__FileInfo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1329:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1330:1: ( ':' )
            {
            // InternalVertigoDsl.g:1330:1: ( ':' )
            // InternalVertigoDsl.g:1331:2: ':'
            {
             before(grammarAccess.getFileInfoAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__5__Impl"


    // $ANTLR start "rule__FileInfo__Group__6"
    // InternalVertigoDsl.g:1340:1: rule__FileInfo__Group__6 : rule__FileInfo__Group__6__Impl rule__FileInfo__Group__7 ;
    public final void rule__FileInfo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1344:1: ( rule__FileInfo__Group__6__Impl rule__FileInfo__Group__7 )
            // InternalVertigoDsl.g:1345:2: rule__FileInfo__Group__6__Impl rule__FileInfo__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__FileInfo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__7();

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
    // $ANTLR end "rule__FileInfo__Group__6"


    // $ANTLR start "rule__FileInfo__Group__6__Impl"
    // InternalVertigoDsl.g:1352:1: rule__FileInfo__Group__6__Impl : ( ( rule__FileInfo__StoreNameAssignment_6 ) ) ;
    public final void rule__FileInfo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1356:1: ( ( ( rule__FileInfo__StoreNameAssignment_6 ) ) )
            // InternalVertigoDsl.g:1357:1: ( ( rule__FileInfo__StoreNameAssignment_6 ) )
            {
            // InternalVertigoDsl.g:1357:1: ( ( rule__FileInfo__StoreNameAssignment_6 ) )
            // InternalVertigoDsl.g:1358:2: ( rule__FileInfo__StoreNameAssignment_6 )
            {
             before(grammarAccess.getFileInfoAccess().getStoreNameAssignment_6()); 
            // InternalVertigoDsl.g:1359:2: ( rule__FileInfo__StoreNameAssignment_6 )
            // InternalVertigoDsl.g:1359:3: rule__FileInfo__StoreNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__FileInfo__StoreNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFileInfoAccess().getStoreNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__6__Impl"


    // $ANTLR start "rule__FileInfo__Group__7"
    // InternalVertigoDsl.g:1367:1: rule__FileInfo__Group__7 : rule__FileInfo__Group__7__Impl ;
    public final void rule__FileInfo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1371:1: ( rule__FileInfo__Group__7__Impl )
            // InternalVertigoDsl.g:1372:2: rule__FileInfo__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileInfo__Group__7__Impl();

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
    // $ANTLR end "rule__FileInfo__Group__7"


    // $ANTLR start "rule__FileInfo__Group__7__Impl"
    // InternalVertigoDsl.g:1378:1: rule__FileInfo__Group__7__Impl : ( '}' ) ;
    public final void rule__FileInfo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1382:1: ( ( '}' ) )
            // InternalVertigoDsl.g:1383:1: ( '}' )
            {
            // InternalVertigoDsl.g:1383:1: ( '}' )
            // InternalVertigoDsl.g:1384:2: '}'
            {
             before(grammarAccess.getFileInfoAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__Group__7__Impl"


    // $ANTLR start "rule__Formatter__Group__0"
    // InternalVertigoDsl.g:1394:1: rule__Formatter__Group__0 : rule__Formatter__Group__0__Impl rule__Formatter__Group__1 ;
    public final void rule__Formatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1398:1: ( rule__Formatter__Group__0__Impl rule__Formatter__Group__1 )
            // InternalVertigoDsl.g:1399:2: rule__Formatter__Group__0__Impl rule__Formatter__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Formatter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__1();

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
    // $ANTLR end "rule__Formatter__Group__0"


    // $ANTLR start "rule__Formatter__Group__0__Impl"
    // InternalVertigoDsl.g:1406:1: rule__Formatter__Group__0__Impl : ( 'create' ) ;
    public final void rule__Formatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1410:1: ( ( 'create' ) )
            // InternalVertigoDsl.g:1411:1: ( 'create' )
            {
            // InternalVertigoDsl.g:1411:1: ( 'create' )
            // InternalVertigoDsl.g:1412:2: 'create'
            {
             before(grammarAccess.getFormatterAccess().getCreateKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__0__Impl"


    // $ANTLR start "rule__Formatter__Group__1"
    // InternalVertigoDsl.g:1421:1: rule__Formatter__Group__1 : rule__Formatter__Group__1__Impl rule__Formatter__Group__2 ;
    public final void rule__Formatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1425:1: ( rule__Formatter__Group__1__Impl rule__Formatter__Group__2 )
            // InternalVertigoDsl.g:1426:2: rule__Formatter__Group__1__Impl rule__Formatter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Formatter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__2();

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
    // $ANTLR end "rule__Formatter__Group__1"


    // $ANTLR start "rule__Formatter__Group__1__Impl"
    // InternalVertigoDsl.g:1433:1: rule__Formatter__Group__1__Impl : ( 'Formatter' ) ;
    public final void rule__Formatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1437:1: ( ( 'Formatter' ) )
            // InternalVertigoDsl.g:1438:1: ( 'Formatter' )
            {
            // InternalVertigoDsl.g:1438:1: ( 'Formatter' )
            // InternalVertigoDsl.g:1439:2: 'Formatter'
            {
             before(grammarAccess.getFormatterAccess().getFormatterKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getFormatterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__1__Impl"


    // $ANTLR start "rule__Formatter__Group__2"
    // InternalVertigoDsl.g:1448:1: rule__Formatter__Group__2 : rule__Formatter__Group__2__Impl rule__Formatter__Group__3 ;
    public final void rule__Formatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1452:1: ( rule__Formatter__Group__2__Impl rule__Formatter__Group__3 )
            // InternalVertigoDsl.g:1453:2: rule__Formatter__Group__2__Impl rule__Formatter__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Formatter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__3();

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
    // $ANTLR end "rule__Formatter__Group__2"


    // $ANTLR start "rule__Formatter__Group__2__Impl"
    // InternalVertigoDsl.g:1460:1: rule__Formatter__Group__2__Impl : ( ( rule__Formatter__NameAssignment_2 ) ) ;
    public final void rule__Formatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1464:1: ( ( ( rule__Formatter__NameAssignment_2 ) ) )
            // InternalVertigoDsl.g:1465:1: ( ( rule__Formatter__NameAssignment_2 ) )
            {
            // InternalVertigoDsl.g:1465:1: ( ( rule__Formatter__NameAssignment_2 ) )
            // InternalVertigoDsl.g:1466:2: ( rule__Formatter__NameAssignment_2 )
            {
             before(grammarAccess.getFormatterAccess().getNameAssignment_2()); 
            // InternalVertigoDsl.g:1467:2: ( rule__Formatter__NameAssignment_2 )
            // InternalVertigoDsl.g:1467:3: rule__Formatter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__2__Impl"


    // $ANTLR start "rule__Formatter__Group__3"
    // InternalVertigoDsl.g:1475:1: rule__Formatter__Group__3 : rule__Formatter__Group__3__Impl rule__Formatter__Group__4 ;
    public final void rule__Formatter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1479:1: ( rule__Formatter__Group__3__Impl rule__Formatter__Group__4 )
            // InternalVertigoDsl.g:1480:2: rule__Formatter__Group__3__Impl rule__Formatter__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Formatter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__4();

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
    // $ANTLR end "rule__Formatter__Group__3"


    // $ANTLR start "rule__Formatter__Group__3__Impl"
    // InternalVertigoDsl.g:1487:1: rule__Formatter__Group__3__Impl : ( '{' ) ;
    public final void rule__Formatter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1491:1: ( ( '{' ) )
            // InternalVertigoDsl.g:1492:1: ( '{' )
            {
            // InternalVertigoDsl.g:1492:1: ( '{' )
            // InternalVertigoDsl.g:1493:2: '{'
            {
             before(grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__3__Impl"


    // $ANTLR start "rule__Formatter__Group__4"
    // InternalVertigoDsl.g:1502:1: rule__Formatter__Group__4 : rule__Formatter__Group__4__Impl rule__Formatter__Group__5 ;
    public final void rule__Formatter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1506:1: ( rule__Formatter__Group__4__Impl rule__Formatter__Group__5 )
            // InternalVertigoDsl.g:1507:2: rule__Formatter__Group__4__Impl rule__Formatter__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Formatter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__5();

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
    // $ANTLR end "rule__Formatter__Group__4"


    // $ANTLR start "rule__Formatter__Group__4__Impl"
    // InternalVertigoDsl.g:1514:1: rule__Formatter__Group__4__Impl : ( 'className' ) ;
    public final void rule__Formatter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1518:1: ( ( 'className' ) )
            // InternalVertigoDsl.g:1519:1: ( 'className' )
            {
            // InternalVertigoDsl.g:1519:1: ( 'className' )
            // InternalVertigoDsl.g:1520:2: 'className'
            {
             before(grammarAccess.getFormatterAccess().getClassNameKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getClassNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__4__Impl"


    // $ANTLR start "rule__Formatter__Group__5"
    // InternalVertigoDsl.g:1529:1: rule__Formatter__Group__5 : rule__Formatter__Group__5__Impl rule__Formatter__Group__6 ;
    public final void rule__Formatter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1533:1: ( rule__Formatter__Group__5__Impl rule__Formatter__Group__6 )
            // InternalVertigoDsl.g:1534:2: rule__Formatter__Group__5__Impl rule__Formatter__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Formatter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__6();

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
    // $ANTLR end "rule__Formatter__Group__5"


    // $ANTLR start "rule__Formatter__Group__5__Impl"
    // InternalVertigoDsl.g:1541:1: rule__Formatter__Group__5__Impl : ( ':' ) ;
    public final void rule__Formatter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1545:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1546:1: ( ':' )
            {
            // InternalVertigoDsl.g:1546:1: ( ':' )
            // InternalVertigoDsl.g:1547:2: ':'
            {
             before(grammarAccess.getFormatterAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__5__Impl"


    // $ANTLR start "rule__Formatter__Group__6"
    // InternalVertigoDsl.g:1556:1: rule__Formatter__Group__6 : rule__Formatter__Group__6__Impl rule__Formatter__Group__7 ;
    public final void rule__Formatter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1560:1: ( rule__Formatter__Group__6__Impl rule__Formatter__Group__7 )
            // InternalVertigoDsl.g:1561:2: rule__Formatter__Group__6__Impl rule__Formatter__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Formatter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__7();

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
    // $ANTLR end "rule__Formatter__Group__6"


    // $ANTLR start "rule__Formatter__Group__6__Impl"
    // InternalVertigoDsl.g:1568:1: rule__Formatter__Group__6__Impl : ( ( rule__Formatter__ClassNameAssignment_6 ) ) ;
    public final void rule__Formatter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1572:1: ( ( ( rule__Formatter__ClassNameAssignment_6 ) ) )
            // InternalVertigoDsl.g:1573:1: ( ( rule__Formatter__ClassNameAssignment_6 ) )
            {
            // InternalVertigoDsl.g:1573:1: ( ( rule__Formatter__ClassNameAssignment_6 ) )
            // InternalVertigoDsl.g:1574:2: ( rule__Formatter__ClassNameAssignment_6 )
            {
             before(grammarAccess.getFormatterAccess().getClassNameAssignment_6()); 
            // InternalVertigoDsl.g:1575:2: ( rule__Formatter__ClassNameAssignment_6 )
            // InternalVertigoDsl.g:1575:3: rule__Formatter__ClassNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__ClassNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getClassNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__6__Impl"


    // $ANTLR start "rule__Formatter__Group__7"
    // InternalVertigoDsl.g:1583:1: rule__Formatter__Group__7 : rule__Formatter__Group__7__Impl rule__Formatter__Group__8 ;
    public final void rule__Formatter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1587:1: ( rule__Formatter__Group__7__Impl rule__Formatter__Group__8 )
            // InternalVertigoDsl.g:1588:2: rule__Formatter__Group__7__Impl rule__Formatter__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Formatter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group__8();

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
    // $ANTLR end "rule__Formatter__Group__7"


    // $ANTLR start "rule__Formatter__Group__7__Impl"
    // InternalVertigoDsl.g:1595:1: rule__Formatter__Group__7__Impl : ( ( rule__Formatter__Group_7__0 )? ) ;
    public final void rule__Formatter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1599:1: ( ( ( rule__Formatter__Group_7__0 )? ) )
            // InternalVertigoDsl.g:1600:1: ( ( rule__Formatter__Group_7__0 )? )
            {
            // InternalVertigoDsl.g:1600:1: ( ( rule__Formatter__Group_7__0 )? )
            // InternalVertigoDsl.g:1601:2: ( rule__Formatter__Group_7__0 )?
            {
             before(grammarAccess.getFormatterAccess().getGroup_7()); 
            // InternalVertigoDsl.g:1602:2: ( rule__Formatter__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVertigoDsl.g:1602:3: rule__Formatter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Formatter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormatterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__7__Impl"


    // $ANTLR start "rule__Formatter__Group__8"
    // InternalVertigoDsl.g:1610:1: rule__Formatter__Group__8 : rule__Formatter__Group__8__Impl ;
    public final void rule__Formatter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1614:1: ( rule__Formatter__Group__8__Impl )
            // InternalVertigoDsl.g:1615:2: rule__Formatter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__Group__8__Impl();

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
    // $ANTLR end "rule__Formatter__Group__8"


    // $ANTLR start "rule__Formatter__Group__8__Impl"
    // InternalVertigoDsl.g:1621:1: rule__Formatter__Group__8__Impl : ( '}' ) ;
    public final void rule__Formatter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1625:1: ( ( '}' ) )
            // InternalVertigoDsl.g:1626:1: ( '}' )
            {
            // InternalVertigoDsl.g:1626:1: ( '}' )
            // InternalVertigoDsl.g:1627:2: '}'
            {
             before(grammarAccess.getFormatterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group__8__Impl"


    // $ANTLR start "rule__Formatter__Group_7__0"
    // InternalVertigoDsl.g:1637:1: rule__Formatter__Group_7__0 : rule__Formatter__Group_7__0__Impl rule__Formatter__Group_7__1 ;
    public final void rule__Formatter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1641:1: ( rule__Formatter__Group_7__0__Impl rule__Formatter__Group_7__1 )
            // InternalVertigoDsl.g:1642:2: rule__Formatter__Group_7__0__Impl rule__Formatter__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Formatter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group_7__1();

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
    // $ANTLR end "rule__Formatter__Group_7__0"


    // $ANTLR start "rule__Formatter__Group_7__0__Impl"
    // InternalVertigoDsl.g:1649:1: rule__Formatter__Group_7__0__Impl : ( 'args' ) ;
    public final void rule__Formatter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1653:1: ( ( 'args' ) )
            // InternalVertigoDsl.g:1654:1: ( 'args' )
            {
            // InternalVertigoDsl.g:1654:1: ( 'args' )
            // InternalVertigoDsl.g:1655:2: 'args'
            {
             before(grammarAccess.getFormatterAccess().getArgsKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getArgsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group_7__0__Impl"


    // $ANTLR start "rule__Formatter__Group_7__1"
    // InternalVertigoDsl.g:1664:1: rule__Formatter__Group_7__1 : rule__Formatter__Group_7__1__Impl rule__Formatter__Group_7__2 ;
    public final void rule__Formatter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1668:1: ( rule__Formatter__Group_7__1__Impl rule__Formatter__Group_7__2 )
            // InternalVertigoDsl.g:1669:2: rule__Formatter__Group_7__1__Impl rule__Formatter__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Formatter__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formatter__Group_7__2();

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
    // $ANTLR end "rule__Formatter__Group_7__1"


    // $ANTLR start "rule__Formatter__Group_7__1__Impl"
    // InternalVertigoDsl.g:1676:1: rule__Formatter__Group_7__1__Impl : ( ':' ) ;
    public final void rule__Formatter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1680:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1681:1: ( ':' )
            {
            // InternalVertigoDsl.g:1681:1: ( ':' )
            // InternalVertigoDsl.g:1682:2: ':'
            {
             before(grammarAccess.getFormatterAccess().getColonKeyword_7_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group_7__1__Impl"


    // $ANTLR start "rule__Formatter__Group_7__2"
    // InternalVertigoDsl.g:1691:1: rule__Formatter__Group_7__2 : rule__Formatter__Group_7__2__Impl ;
    public final void rule__Formatter__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1695:1: ( rule__Formatter__Group_7__2__Impl )
            // InternalVertigoDsl.g:1696:2: rule__Formatter__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__Group_7__2__Impl();

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
    // $ANTLR end "rule__Formatter__Group_7__2"


    // $ANTLR start "rule__Formatter__Group_7__2__Impl"
    // InternalVertigoDsl.g:1702:1: rule__Formatter__Group_7__2__Impl : ( ( rule__Formatter__ArgsAssignment_7_2 ) ) ;
    public final void rule__Formatter__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1706:1: ( ( ( rule__Formatter__ArgsAssignment_7_2 ) ) )
            // InternalVertigoDsl.g:1707:1: ( ( rule__Formatter__ArgsAssignment_7_2 ) )
            {
            // InternalVertigoDsl.g:1707:1: ( ( rule__Formatter__ArgsAssignment_7_2 ) )
            // InternalVertigoDsl.g:1708:2: ( rule__Formatter__ArgsAssignment_7_2 )
            {
             before(grammarAccess.getFormatterAccess().getArgsAssignment_7_2()); 
            // InternalVertigoDsl.g:1709:2: ( rule__Formatter__ArgsAssignment_7_2 )
            // InternalVertigoDsl.g:1709:3: rule__Formatter__ArgsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Formatter__ArgsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getFormatterAccess().getArgsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__Group_7__2__Impl"


    // $ANTLR start "rule__Domain__Group_0__0"
    // InternalVertigoDsl.g:1718:1: rule__Domain__Group_0__0 : rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 ;
    public final void rule__Domain__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1722:1: ( rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 )
            // InternalVertigoDsl.g:1723:2: rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Domain__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__1();

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
    // $ANTLR end "rule__Domain__Group_0__0"


    // $ANTLR start "rule__Domain__Group_0__0__Impl"
    // InternalVertigoDsl.g:1730:1: rule__Domain__Group_0__0__Impl : ( 'create' ) ;
    public final void rule__Domain__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1734:1: ( ( 'create' ) )
            // InternalVertigoDsl.g:1735:1: ( 'create' )
            {
            // InternalVertigoDsl.g:1735:1: ( 'create' )
            // InternalVertigoDsl.g:1736:2: 'create'
            {
             before(grammarAccess.getDomainAccess().getCreateKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getCreateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__0__Impl"


    // $ANTLR start "rule__Domain__Group_0__1"
    // InternalVertigoDsl.g:1745:1: rule__Domain__Group_0__1 : rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 ;
    public final void rule__Domain__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1749:1: ( rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 )
            // InternalVertigoDsl.g:1750:2: rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__2();

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
    // $ANTLR end "rule__Domain__Group_0__1"


    // $ANTLR start "rule__Domain__Group_0__1__Impl"
    // InternalVertigoDsl.g:1757:1: rule__Domain__Group_0__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1761:1: ( ( 'Domain' ) )
            // InternalVertigoDsl.g:1762:1: ( 'Domain' )
            {
            // InternalVertigoDsl.g:1762:1: ( 'Domain' )
            // InternalVertigoDsl.g:1763:2: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__1__Impl"


    // $ANTLR start "rule__Domain__Group_0__2"
    // InternalVertigoDsl.g:1772:1: rule__Domain__Group_0__2 : rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 ;
    public final void rule__Domain__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1776:1: ( rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 )
            // InternalVertigoDsl.g:1777:2: rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Domain__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__3();

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
    // $ANTLR end "rule__Domain__Group_0__2"


    // $ANTLR start "rule__Domain__Group_0__2__Impl"
    // InternalVertigoDsl.g:1784:1: rule__Domain__Group_0__2__Impl : ( ( rule__Domain__NameAssignment_0_2 ) ) ;
    public final void rule__Domain__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1788:1: ( ( ( rule__Domain__NameAssignment_0_2 ) ) )
            // InternalVertigoDsl.g:1789:1: ( ( rule__Domain__NameAssignment_0_2 ) )
            {
            // InternalVertigoDsl.g:1789:1: ( ( rule__Domain__NameAssignment_0_2 ) )
            // InternalVertigoDsl.g:1790:2: ( rule__Domain__NameAssignment_0_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0_2()); 
            // InternalVertigoDsl.g:1791:2: ( rule__Domain__NameAssignment_0_2 )
            // InternalVertigoDsl.g:1791:3: rule__Domain__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__2__Impl"


    // $ANTLR start "rule__Domain__Group_0__3"
    // InternalVertigoDsl.g:1799:1: rule__Domain__Group_0__3 : rule__Domain__Group_0__3__Impl rule__Domain__Group_0__4 ;
    public final void rule__Domain__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1803:1: ( rule__Domain__Group_0__3__Impl rule__Domain__Group_0__4 )
            // InternalVertigoDsl.g:1804:2: rule__Domain__Group_0__3__Impl rule__Domain__Group_0__4
            {
            pushFollow(FOLLOW_19);
            rule__Domain__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__4();

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
    // $ANTLR end "rule__Domain__Group_0__3"


    // $ANTLR start "rule__Domain__Group_0__3__Impl"
    // InternalVertigoDsl.g:1811:1: rule__Domain__Group_0__3__Impl : ( '{' ) ;
    public final void rule__Domain__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1815:1: ( ( '{' ) )
            // InternalVertigoDsl.g:1816:1: ( '{' )
            {
            // InternalVertigoDsl.g:1816:1: ( '{' )
            // InternalVertigoDsl.g:1817:2: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__3__Impl"


    // $ANTLR start "rule__Domain__Group_0__4"
    // InternalVertigoDsl.g:1826:1: rule__Domain__Group_0__4 : rule__Domain__Group_0__4__Impl rule__Domain__Group_0__5 ;
    public final void rule__Domain__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1830:1: ( rule__Domain__Group_0__4__Impl rule__Domain__Group_0__5 )
            // InternalVertigoDsl.g:1831:2: rule__Domain__Group_0__4__Impl rule__Domain__Group_0__5
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__5();

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
    // $ANTLR end "rule__Domain__Group_0__4"


    // $ANTLR start "rule__Domain__Group_0__4__Impl"
    // InternalVertigoDsl.g:1838:1: rule__Domain__Group_0__4__Impl : ( 'dataType' ) ;
    public final void rule__Domain__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1842:1: ( ( 'dataType' ) )
            // InternalVertigoDsl.g:1843:1: ( 'dataType' )
            {
            // InternalVertigoDsl.g:1843:1: ( 'dataType' )
            // InternalVertigoDsl.g:1844:2: 'dataType'
            {
             before(grammarAccess.getDomainAccess().getDataTypeKeyword_0_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getDataTypeKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__4__Impl"


    // $ANTLR start "rule__Domain__Group_0__5"
    // InternalVertigoDsl.g:1853:1: rule__Domain__Group_0__5 : rule__Domain__Group_0__5__Impl rule__Domain__Group_0__6 ;
    public final void rule__Domain__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1857:1: ( rule__Domain__Group_0__5__Impl rule__Domain__Group_0__6 )
            // InternalVertigoDsl.g:1858:2: rule__Domain__Group_0__5__Impl rule__Domain__Group_0__6
            {
            pushFollow(FOLLOW_20);
            rule__Domain__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__6();

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
    // $ANTLR end "rule__Domain__Group_0__5"


    // $ANTLR start "rule__Domain__Group_0__5__Impl"
    // InternalVertigoDsl.g:1865:1: rule__Domain__Group_0__5__Impl : ( ':' ) ;
    public final void rule__Domain__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1869:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1870:1: ( ':' )
            {
            // InternalVertigoDsl.g:1870:1: ( ':' )
            // InternalVertigoDsl.g:1871:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_0_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__5__Impl"


    // $ANTLR start "rule__Domain__Group_0__6"
    // InternalVertigoDsl.g:1880:1: rule__Domain__Group_0__6 : rule__Domain__Group_0__6__Impl ;
    public final void rule__Domain__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1884:1: ( rule__Domain__Group_0__6__Impl )
            // InternalVertigoDsl.g:1885:2: rule__Domain__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_0__6__Impl();

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
    // $ANTLR end "rule__Domain__Group_0__6"


    // $ANTLR start "rule__Domain__Group_0__6__Impl"
    // InternalVertigoDsl.g:1891:1: rule__Domain__Group_0__6__Impl : ( ( rule__Domain__DataTypeAssignment_0_6 ) ) ;
    public final void rule__Domain__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1895:1: ( ( ( rule__Domain__DataTypeAssignment_0_6 ) ) )
            // InternalVertigoDsl.g:1896:1: ( ( rule__Domain__DataTypeAssignment_0_6 ) )
            {
            // InternalVertigoDsl.g:1896:1: ( ( rule__Domain__DataTypeAssignment_0_6 ) )
            // InternalVertigoDsl.g:1897:2: ( rule__Domain__DataTypeAssignment_0_6 )
            {
             before(grammarAccess.getDomainAccess().getDataTypeAssignment_0_6()); 
            // InternalVertigoDsl.g:1898:2: ( rule__Domain__DataTypeAssignment_0_6 )
            // InternalVertigoDsl.g:1898:3: rule__Domain__DataTypeAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Domain__DataTypeAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDataTypeAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_0__6__Impl"


    // $ANTLR start "rule__Domain__Group_1__0"
    // InternalVertigoDsl.g:1907:1: rule__Domain__Group_1__0 : rule__Domain__Group_1__0__Impl rule__Domain__Group_1__1 ;
    public final void rule__Domain__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1911:1: ( rule__Domain__Group_1__0__Impl rule__Domain__Group_1__1 )
            // InternalVertigoDsl.g:1912:2: rule__Domain__Group_1__0__Impl rule__Domain__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_1__1();

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
    // $ANTLR end "rule__Domain__Group_1__0"


    // $ANTLR start "rule__Domain__Group_1__0__Impl"
    // InternalVertigoDsl.g:1919:1: rule__Domain__Group_1__0__Impl : ( 'formatter' ) ;
    public final void rule__Domain__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1923:1: ( ( 'formatter' ) )
            // InternalVertigoDsl.g:1924:1: ( 'formatter' )
            {
            // InternalVertigoDsl.g:1924:1: ( 'formatter' )
            // InternalVertigoDsl.g:1925:2: 'formatter'
            {
             before(grammarAccess.getDomainAccess().getFormatterKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getFormatterKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_1__0__Impl"


    // $ANTLR start "rule__Domain__Group_1__1"
    // InternalVertigoDsl.g:1934:1: rule__Domain__Group_1__1 : rule__Domain__Group_1__1__Impl rule__Domain__Group_1__2 ;
    public final void rule__Domain__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1938:1: ( rule__Domain__Group_1__1__Impl rule__Domain__Group_1__2 )
            // InternalVertigoDsl.g:1939:2: rule__Domain__Group_1__1__Impl rule__Domain__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_1__2();

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
    // $ANTLR end "rule__Domain__Group_1__1"


    // $ANTLR start "rule__Domain__Group_1__1__Impl"
    // InternalVertigoDsl.g:1946:1: rule__Domain__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1950:1: ( ( ':' ) )
            // InternalVertigoDsl.g:1951:1: ( ':' )
            {
            // InternalVertigoDsl.g:1951:1: ( ':' )
            // InternalVertigoDsl.g:1952:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_1__1__Impl"


    // $ANTLR start "rule__Domain__Group_1__2"
    // InternalVertigoDsl.g:1961:1: rule__Domain__Group_1__2 : rule__Domain__Group_1__2__Impl ;
    public final void rule__Domain__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1965:1: ( rule__Domain__Group_1__2__Impl )
            // InternalVertigoDsl.g:1966:2: rule__Domain__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_1__2__Impl();

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
    // $ANTLR end "rule__Domain__Group_1__2"


    // $ANTLR start "rule__Domain__Group_1__2__Impl"
    // InternalVertigoDsl.g:1972:1: rule__Domain__Group_1__2__Impl : ( ( rule__Domain__FormatterAssignment_1_2 ) ) ;
    public final void rule__Domain__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1976:1: ( ( ( rule__Domain__FormatterAssignment_1_2 ) ) )
            // InternalVertigoDsl.g:1977:1: ( ( rule__Domain__FormatterAssignment_1_2 ) )
            {
            // InternalVertigoDsl.g:1977:1: ( ( rule__Domain__FormatterAssignment_1_2 ) )
            // InternalVertigoDsl.g:1978:2: ( rule__Domain__FormatterAssignment_1_2 )
            {
             before(grammarAccess.getDomainAccess().getFormatterAssignment_1_2()); 
            // InternalVertigoDsl.g:1979:2: ( rule__Domain__FormatterAssignment_1_2 )
            // InternalVertigoDsl.g:1979:3: rule__Domain__FormatterAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__FormatterAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getFormatterAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_1__2__Impl"


    // $ANTLR start "rule__Domain__Group_2__0"
    // InternalVertigoDsl.g:1988:1: rule__Domain__Group_2__0 : rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 ;
    public final void rule__Domain__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:1992:1: ( rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 )
            // InternalVertigoDsl.g:1993:2: rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_2__1();

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
    // $ANTLR end "rule__Domain__Group_2__0"


    // $ANTLR start "rule__Domain__Group_2__0__Impl"
    // InternalVertigoDsl.g:2000:1: rule__Domain__Group_2__0__Impl : ( 'storeType' ) ;
    public final void rule__Domain__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2004:1: ( ( 'storeType' ) )
            // InternalVertigoDsl.g:2005:1: ( 'storeType' )
            {
            // InternalVertigoDsl.g:2005:1: ( 'storeType' )
            // InternalVertigoDsl.g:2006:2: 'storeType'
            {
             before(grammarAccess.getDomainAccess().getStoreTypeKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getStoreTypeKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_2__0__Impl"


    // $ANTLR start "rule__Domain__Group_2__1"
    // InternalVertigoDsl.g:2015:1: rule__Domain__Group_2__1 : rule__Domain__Group_2__1__Impl rule__Domain__Group_2__2 ;
    public final void rule__Domain__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2019:1: ( rule__Domain__Group_2__1__Impl rule__Domain__Group_2__2 )
            // InternalVertigoDsl.g:2020:2: rule__Domain__Group_2__1__Impl rule__Domain__Group_2__2
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_2__2();

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
    // $ANTLR end "rule__Domain__Group_2__1"


    // $ANTLR start "rule__Domain__Group_2__1__Impl"
    // InternalVertigoDsl.g:2027:1: rule__Domain__Group_2__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2031:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2032:1: ( ':' )
            {
            // InternalVertigoDsl.g:2032:1: ( ':' )
            // InternalVertigoDsl.g:2033:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_2__1__Impl"


    // $ANTLR start "rule__Domain__Group_2__2"
    // InternalVertigoDsl.g:2042:1: rule__Domain__Group_2__2 : rule__Domain__Group_2__2__Impl ;
    public final void rule__Domain__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2046:1: ( rule__Domain__Group_2__2__Impl )
            // InternalVertigoDsl.g:2047:2: rule__Domain__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_2__2__Impl();

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
    // $ANTLR end "rule__Domain__Group_2__2"


    // $ANTLR start "rule__Domain__Group_2__2__Impl"
    // InternalVertigoDsl.g:2053:1: rule__Domain__Group_2__2__Impl : ( ( rule__Domain__StoreTypeAssignment_2_2 ) ) ;
    public final void rule__Domain__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2057:1: ( ( ( rule__Domain__StoreTypeAssignment_2_2 ) ) )
            // InternalVertigoDsl.g:2058:1: ( ( rule__Domain__StoreTypeAssignment_2_2 ) )
            {
            // InternalVertigoDsl.g:2058:1: ( ( rule__Domain__StoreTypeAssignment_2_2 ) )
            // InternalVertigoDsl.g:2059:2: ( rule__Domain__StoreTypeAssignment_2_2 )
            {
             before(grammarAccess.getDomainAccess().getStoreTypeAssignment_2_2()); 
            // InternalVertigoDsl.g:2060:2: ( rule__Domain__StoreTypeAssignment_2_2 )
            // InternalVertigoDsl.g:2060:3: rule__Domain__StoreTypeAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__StoreTypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getStoreTypeAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_2__2__Impl"


    // $ANTLR start "rule__Domain__Group_3__0"
    // InternalVertigoDsl.g:2069:1: rule__Domain__Group_3__0 : rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 ;
    public final void rule__Domain__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2073:1: ( rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 )
            // InternalVertigoDsl.g:2074:2: rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_3__1();

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
    // $ANTLR end "rule__Domain__Group_3__0"


    // $ANTLR start "rule__Domain__Group_3__0__Impl"
    // InternalVertigoDsl.g:2081:1: rule__Domain__Group_3__0__Impl : ( 'indexType' ) ;
    public final void rule__Domain__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2085:1: ( ( 'indexType' ) )
            // InternalVertigoDsl.g:2086:1: ( 'indexType' )
            {
            // InternalVertigoDsl.g:2086:1: ( 'indexType' )
            // InternalVertigoDsl.g:2087:2: 'indexType'
            {
             before(grammarAccess.getDomainAccess().getIndexTypeKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getIndexTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_3__0__Impl"


    // $ANTLR start "rule__Domain__Group_3__1"
    // InternalVertigoDsl.g:2096:1: rule__Domain__Group_3__1 : rule__Domain__Group_3__1__Impl rule__Domain__Group_3__2 ;
    public final void rule__Domain__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2100:1: ( rule__Domain__Group_3__1__Impl rule__Domain__Group_3__2 )
            // InternalVertigoDsl.g:2101:2: rule__Domain__Group_3__1__Impl rule__Domain__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_3__2();

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
    // $ANTLR end "rule__Domain__Group_3__1"


    // $ANTLR start "rule__Domain__Group_3__1__Impl"
    // InternalVertigoDsl.g:2108:1: rule__Domain__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2112:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2113:1: ( ':' )
            {
            // InternalVertigoDsl.g:2113:1: ( ':' )
            // InternalVertigoDsl.g:2114:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_3_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_3__1__Impl"


    // $ANTLR start "rule__Domain__Group_3__2"
    // InternalVertigoDsl.g:2123:1: rule__Domain__Group_3__2 : rule__Domain__Group_3__2__Impl ;
    public final void rule__Domain__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2127:1: ( rule__Domain__Group_3__2__Impl )
            // InternalVertigoDsl.g:2128:2: rule__Domain__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_3__2__Impl();

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
    // $ANTLR end "rule__Domain__Group_3__2"


    // $ANTLR start "rule__Domain__Group_3__2__Impl"
    // InternalVertigoDsl.g:2134:1: rule__Domain__Group_3__2__Impl : ( ( rule__Domain__IndexTypeAssignment_3_2 ) ) ;
    public final void rule__Domain__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2138:1: ( ( ( rule__Domain__IndexTypeAssignment_3_2 ) ) )
            // InternalVertigoDsl.g:2139:1: ( ( rule__Domain__IndexTypeAssignment_3_2 ) )
            {
            // InternalVertigoDsl.g:2139:1: ( ( rule__Domain__IndexTypeAssignment_3_2 ) )
            // InternalVertigoDsl.g:2140:2: ( rule__Domain__IndexTypeAssignment_3_2 )
            {
             before(grammarAccess.getDomainAccess().getIndexTypeAssignment_3_2()); 
            // InternalVertigoDsl.g:2141:2: ( rule__Domain__IndexTypeAssignment_3_2 )
            // InternalVertigoDsl.g:2141:3: rule__Domain__IndexTypeAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__IndexTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getIndexTypeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_3__2__Impl"


    // $ANTLR start "rule__Domain__Group_4__0"
    // InternalVertigoDsl.g:2150:1: rule__Domain__Group_4__0 : rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 ;
    public final void rule__Domain__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2154:1: ( rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1 )
            // InternalVertigoDsl.g:2155:2: rule__Domain__Group_4__0__Impl rule__Domain__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__1();

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
    // $ANTLR end "rule__Domain__Group_4__0"


    // $ANTLR start "rule__Domain__Group_4__0__Impl"
    // InternalVertigoDsl.g:2162:1: rule__Domain__Group_4__0__Impl : ( 'constraint' ) ;
    public final void rule__Domain__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2166:1: ( ( 'constraint' ) )
            // InternalVertigoDsl.g:2167:1: ( 'constraint' )
            {
            // InternalVertigoDsl.g:2167:1: ( 'constraint' )
            // InternalVertigoDsl.g:2168:2: 'constraint'
            {
             before(grammarAccess.getDomainAccess().getConstraintKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getConstraintKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__0__Impl"


    // $ANTLR start "rule__Domain__Group_4__1"
    // InternalVertigoDsl.g:2177:1: rule__Domain__Group_4__1 : rule__Domain__Group_4__1__Impl rule__Domain__Group_4__2 ;
    public final void rule__Domain__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2181:1: ( rule__Domain__Group_4__1__Impl rule__Domain__Group_4__2 )
            // InternalVertigoDsl.g:2182:2: rule__Domain__Group_4__1__Impl rule__Domain__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__Domain__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__2();

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
    // $ANTLR end "rule__Domain__Group_4__1"


    // $ANTLR start "rule__Domain__Group_4__1__Impl"
    // InternalVertigoDsl.g:2189:1: rule__Domain__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2193:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2194:1: ( ':' )
            {
            // InternalVertigoDsl.g:2194:1: ( ':' )
            // InternalVertigoDsl.g:2195:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__1__Impl"


    // $ANTLR start "rule__Domain__Group_4__2"
    // InternalVertigoDsl.g:2204:1: rule__Domain__Group_4__2 : rule__Domain__Group_4__2__Impl rule__Domain__Group_4__3 ;
    public final void rule__Domain__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2208:1: ( rule__Domain__Group_4__2__Impl rule__Domain__Group_4__3 )
            // InternalVertigoDsl.g:2209:2: rule__Domain__Group_4__2__Impl rule__Domain__Group_4__3
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__3();

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
    // $ANTLR end "rule__Domain__Group_4__2"


    // $ANTLR start "rule__Domain__Group_4__2__Impl"
    // InternalVertigoDsl.g:2216:1: rule__Domain__Group_4__2__Impl : ( '[' ) ;
    public final void rule__Domain__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2220:1: ( ( '[' ) )
            // InternalVertigoDsl.g:2221:1: ( '[' )
            {
            // InternalVertigoDsl.g:2221:1: ( '[' )
            // InternalVertigoDsl.g:2222:2: '['
            {
             before(grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__2__Impl"


    // $ANTLR start "rule__Domain__Group_4__3"
    // InternalVertigoDsl.g:2231:1: rule__Domain__Group_4__3 : rule__Domain__Group_4__3__Impl rule__Domain__Group_4__4 ;
    public final void rule__Domain__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2235:1: ( rule__Domain__Group_4__3__Impl rule__Domain__Group_4__4 )
            // InternalVertigoDsl.g:2236:2: rule__Domain__Group_4__3__Impl rule__Domain__Group_4__4
            {
            pushFollow(FOLLOW_22);
            rule__Domain__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__4();

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
    // $ANTLR end "rule__Domain__Group_4__3"


    // $ANTLR start "rule__Domain__Group_4__3__Impl"
    // InternalVertigoDsl.g:2243:1: rule__Domain__Group_4__3__Impl : ( ( rule__Domain__ConstraintsAssignment_4_3 ) ) ;
    public final void rule__Domain__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2247:1: ( ( ( rule__Domain__ConstraintsAssignment_4_3 ) ) )
            // InternalVertigoDsl.g:2248:1: ( ( rule__Domain__ConstraintsAssignment_4_3 ) )
            {
            // InternalVertigoDsl.g:2248:1: ( ( rule__Domain__ConstraintsAssignment_4_3 ) )
            // InternalVertigoDsl.g:2249:2: ( rule__Domain__ConstraintsAssignment_4_3 )
            {
             before(grammarAccess.getDomainAccess().getConstraintsAssignment_4_3()); 
            // InternalVertigoDsl.g:2250:2: ( rule__Domain__ConstraintsAssignment_4_3 )
            // InternalVertigoDsl.g:2250:3: rule__Domain__ConstraintsAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ConstraintsAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getConstraintsAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__3__Impl"


    // $ANTLR start "rule__Domain__Group_4__4"
    // InternalVertigoDsl.g:2258:1: rule__Domain__Group_4__4 : rule__Domain__Group_4__4__Impl rule__Domain__Group_4__5 ;
    public final void rule__Domain__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2262:1: ( rule__Domain__Group_4__4__Impl rule__Domain__Group_4__5 )
            // InternalVertigoDsl.g:2263:2: rule__Domain__Group_4__4__Impl rule__Domain__Group_4__5
            {
            pushFollow(FOLLOW_22);
            rule__Domain__Group_4__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__5();

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
    // $ANTLR end "rule__Domain__Group_4__4"


    // $ANTLR start "rule__Domain__Group_4__4__Impl"
    // InternalVertigoDsl.g:2270:1: rule__Domain__Group_4__4__Impl : ( ( rule__Domain__Group_4_4__0 )* ) ;
    public final void rule__Domain__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2274:1: ( ( ( rule__Domain__Group_4_4__0 )* ) )
            // InternalVertigoDsl.g:2275:1: ( ( rule__Domain__Group_4_4__0 )* )
            {
            // InternalVertigoDsl.g:2275:1: ( ( rule__Domain__Group_4_4__0 )* )
            // InternalVertigoDsl.g:2276:2: ( rule__Domain__Group_4_4__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_4_4()); 
            // InternalVertigoDsl.g:2277:2: ( rule__Domain__Group_4_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVertigoDsl.g:2277:3: rule__Domain__Group_4_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Domain__Group_4_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getGroup_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__4__Impl"


    // $ANTLR start "rule__Domain__Group_4__5"
    // InternalVertigoDsl.g:2285:1: rule__Domain__Group_4__5 : rule__Domain__Group_4__5__Impl ;
    public final void rule__Domain__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2289:1: ( rule__Domain__Group_4__5__Impl )
            // InternalVertigoDsl.g:2290:2: rule__Domain__Group_4__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_4__5__Impl();

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
    // $ANTLR end "rule__Domain__Group_4__5"


    // $ANTLR start "rule__Domain__Group_4__5__Impl"
    // InternalVertigoDsl.g:2296:1: rule__Domain__Group_4__5__Impl : ( ']' ) ;
    public final void rule__Domain__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2300:1: ( ( ']' ) )
            // InternalVertigoDsl.g:2301:1: ( ']' )
            {
            // InternalVertigoDsl.g:2301:1: ( ']' )
            // InternalVertigoDsl.g:2302:2: ']'
            {
             before(grammarAccess.getDomainAccess().getRightSquareBracketKeyword_4_5()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getRightSquareBracketKeyword_4_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4__5__Impl"


    // $ANTLR start "rule__Domain__Group_4_4__0"
    // InternalVertigoDsl.g:2312:1: rule__Domain__Group_4_4__0 : rule__Domain__Group_4_4__0__Impl rule__Domain__Group_4_4__1 ;
    public final void rule__Domain__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2316:1: ( rule__Domain__Group_4_4__0__Impl rule__Domain__Group_4_4__1 )
            // InternalVertigoDsl.g:2317:2: rule__Domain__Group_4_4__0__Impl rule__Domain__Group_4_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Domain__Group_4_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_4_4__1();

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
    // $ANTLR end "rule__Domain__Group_4_4__0"


    // $ANTLR start "rule__Domain__Group_4_4__0__Impl"
    // InternalVertigoDsl.g:2324:1: rule__Domain__Group_4_4__0__Impl : ( ( ( ',' ) ) ( ( ',' )* ) ) ;
    public final void rule__Domain__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2328:1: ( ( ( ( ',' ) ) ( ( ',' )* ) ) )
            // InternalVertigoDsl.g:2329:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            {
            // InternalVertigoDsl.g:2329:1: ( ( ( ',' ) ) ( ( ',' )* ) )
            // InternalVertigoDsl.g:2330:2: ( ( ',' ) ) ( ( ',' )* )
            {
            // InternalVertigoDsl.g:2330:2: ( ( ',' ) )
            // InternalVertigoDsl.g:2331:3: ( ',' )
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_4_4_0()); 
            // InternalVertigoDsl.g:2332:3: ( ',' )
            // InternalVertigoDsl.g:2332:4: ','
            {
            match(input,46,FOLLOW_23); 

            }

             after(grammarAccess.getDomainAccess().getCommaKeyword_4_4_0()); 

            }

            // InternalVertigoDsl.g:2335:2: ( ( ',' )* )
            // InternalVertigoDsl.g:2336:3: ( ',' )*
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_4_4_0()); 
            // InternalVertigoDsl.g:2337:3: ( ',' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==46) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVertigoDsl.g:2337:4: ','
            	    {
            	    match(input,46,FOLLOW_23); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getCommaKeyword_4_4_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_4__0__Impl"


    // $ANTLR start "rule__Domain__Group_4_4__1"
    // InternalVertigoDsl.g:2346:1: rule__Domain__Group_4_4__1 : rule__Domain__Group_4_4__1__Impl ;
    public final void rule__Domain__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2350:1: ( rule__Domain__Group_4_4__1__Impl )
            // InternalVertigoDsl.g:2351:2: rule__Domain__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_4_4__1__Impl();

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
    // $ANTLR end "rule__Domain__Group_4_4__1"


    // $ANTLR start "rule__Domain__Group_4_4__1__Impl"
    // InternalVertigoDsl.g:2357:1: rule__Domain__Group_4_4__1__Impl : ( ( rule__Domain__ConstraintsAssignment_4_4_1 ) ) ;
    public final void rule__Domain__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2361:1: ( ( ( rule__Domain__ConstraintsAssignment_4_4_1 ) ) )
            // InternalVertigoDsl.g:2362:1: ( ( rule__Domain__ConstraintsAssignment_4_4_1 ) )
            {
            // InternalVertigoDsl.g:2362:1: ( ( rule__Domain__ConstraintsAssignment_4_4_1 ) )
            // InternalVertigoDsl.g:2363:2: ( rule__Domain__ConstraintsAssignment_4_4_1 )
            {
             before(grammarAccess.getDomainAccess().getConstraintsAssignment_4_4_1()); 
            // InternalVertigoDsl.g:2364:2: ( rule__Domain__ConstraintsAssignment_4_4_1 )
            // InternalVertigoDsl.g:2364:3: rule__Domain__ConstraintsAssignment_4_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Domain__ConstraintsAssignment_4_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getConstraintsAssignment_4_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_4_4__1__Impl"


    // $ANTLR start "rule__Domain__Group_5__0"
    // InternalVertigoDsl.g:2373:1: rule__Domain__Group_5__0 : rule__Domain__Group_5__0__Impl rule__Domain__Group_5__1 ;
    public final void rule__Domain__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2377:1: ( rule__Domain__Group_5__0__Impl rule__Domain__Group_5__1 )
            // InternalVertigoDsl.g:2378:2: rule__Domain__Group_5__0__Impl rule__Domain__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_5__1();

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
    // $ANTLR end "rule__Domain__Group_5__0"


    // $ANTLR start "rule__Domain__Group_5__0__Impl"
    // InternalVertigoDsl.g:2385:1: rule__Domain__Group_5__0__Impl : ( 'multiple' ) ;
    public final void rule__Domain__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2389:1: ( ( 'multiple' ) )
            // InternalVertigoDsl.g:2390:1: ( 'multiple' )
            {
            // InternalVertigoDsl.g:2390:1: ( 'multiple' )
            // InternalVertigoDsl.g:2391:2: 'multiple'
            {
             before(grammarAccess.getDomainAccess().getMultipleKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getMultipleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_5__0__Impl"


    // $ANTLR start "rule__Domain__Group_5__1"
    // InternalVertigoDsl.g:2400:1: rule__Domain__Group_5__1 : rule__Domain__Group_5__1__Impl rule__Domain__Group_5__2 ;
    public final void rule__Domain__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2404:1: ( rule__Domain__Group_5__1__Impl rule__Domain__Group_5__2 )
            // InternalVertigoDsl.g:2405:2: rule__Domain__Group_5__1__Impl rule__Domain__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__Domain__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_5__2();

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
    // $ANTLR end "rule__Domain__Group_5__1"


    // $ANTLR start "rule__Domain__Group_5__1__Impl"
    // InternalVertigoDsl.g:2412:1: rule__Domain__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2416:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2417:1: ( ':' )
            {
            // InternalVertigoDsl.g:2417:1: ( ':' )
            // InternalVertigoDsl.g:2418:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_5__1__Impl"


    // $ANTLR start "rule__Domain__Group_5__2"
    // InternalVertigoDsl.g:2427:1: rule__Domain__Group_5__2 : rule__Domain__Group_5__2__Impl ;
    public final void rule__Domain__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2431:1: ( rule__Domain__Group_5__2__Impl )
            // InternalVertigoDsl.g:2432:2: rule__Domain__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_5__2__Impl();

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
    // $ANTLR end "rule__Domain__Group_5__2"


    // $ANTLR start "rule__Domain__Group_5__2__Impl"
    // InternalVertigoDsl.g:2438:1: rule__Domain__Group_5__2__Impl : ( ( rule__Domain__MultipleAssignment_5_2 ) ) ;
    public final void rule__Domain__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2442:1: ( ( ( rule__Domain__MultipleAssignment_5_2 ) ) )
            // InternalVertigoDsl.g:2443:1: ( ( rule__Domain__MultipleAssignment_5_2 ) )
            {
            // InternalVertigoDsl.g:2443:1: ( ( rule__Domain__MultipleAssignment_5_2 ) )
            // InternalVertigoDsl.g:2444:2: ( rule__Domain__MultipleAssignment_5_2 )
            {
             before(grammarAccess.getDomainAccess().getMultipleAssignment_5_2()); 
            // InternalVertigoDsl.g:2445:2: ( rule__Domain__MultipleAssignment_5_2 )
            // InternalVertigoDsl.g:2445:3: rule__Domain__MultipleAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__MultipleAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getMultipleAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_5__2__Impl"


    // $ANTLR start "rule__Domain__Group_6__0"
    // InternalVertigoDsl.g:2454:1: rule__Domain__Group_6__0 : rule__Domain__Group_6__0__Impl rule__Domain__Group_6__1 ;
    public final void rule__Domain__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2458:1: ( rule__Domain__Group_6__0__Impl rule__Domain__Group_6__1 )
            // InternalVertigoDsl.g:2459:2: rule__Domain__Group_6__0__Impl rule__Domain__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Domain__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_6__1();

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
    // $ANTLR end "rule__Domain__Group_6__0"


    // $ANTLR start "rule__Domain__Group_6__0__Impl"
    // InternalVertigoDsl.g:2466:1: rule__Domain__Group_6__0__Impl : ( 'unit' ) ;
    public final void rule__Domain__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2470:1: ( ( 'unit' ) )
            // InternalVertigoDsl.g:2471:1: ( 'unit' )
            {
            // InternalVertigoDsl.g:2471:1: ( 'unit' )
            // InternalVertigoDsl.g:2472:2: 'unit'
            {
             before(grammarAccess.getDomainAccess().getUnitKeyword_6_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getUnitKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_6__0__Impl"


    // $ANTLR start "rule__Domain__Group_6__1"
    // InternalVertigoDsl.g:2481:1: rule__Domain__Group_6__1 : rule__Domain__Group_6__1__Impl rule__Domain__Group_6__2 ;
    public final void rule__Domain__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2485:1: ( rule__Domain__Group_6__1__Impl rule__Domain__Group_6__2 )
            // InternalVertigoDsl.g:2486:2: rule__Domain__Group_6__1__Impl rule__Domain__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Domain__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domain__Group_6__2();

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
    // $ANTLR end "rule__Domain__Group_6__1"


    // $ANTLR start "rule__Domain__Group_6__1__Impl"
    // InternalVertigoDsl.g:2493:1: rule__Domain__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Domain__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2497:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2498:1: ( ':' )
            {
            // InternalVertigoDsl.g:2498:1: ( ':' )
            // InternalVertigoDsl.g:2499:2: ':'
            {
             before(grammarAccess.getDomainAccess().getColonKeyword_6_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getColonKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_6__1__Impl"


    // $ANTLR start "rule__Domain__Group_6__2"
    // InternalVertigoDsl.g:2508:1: rule__Domain__Group_6__2 : rule__Domain__Group_6__2__Impl ;
    public final void rule__Domain__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2512:1: ( rule__Domain__Group_6__2__Impl )
            // InternalVertigoDsl.g:2513:2: rule__Domain__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Group_6__2__Impl();

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
    // $ANTLR end "rule__Domain__Group_6__2"


    // $ANTLR start "rule__Domain__Group_6__2__Impl"
    // InternalVertigoDsl.g:2519:1: rule__Domain__Group_6__2__Impl : ( ( rule__Domain__UnitAssignment_6_2 ) ) ;
    public final void rule__Domain__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2523:1: ( ( ( rule__Domain__UnitAssignment_6_2 ) ) )
            // InternalVertigoDsl.g:2524:1: ( ( rule__Domain__UnitAssignment_6_2 ) )
            {
            // InternalVertigoDsl.g:2524:1: ( ( rule__Domain__UnitAssignment_6_2 ) )
            // InternalVertigoDsl.g:2525:2: ( rule__Domain__UnitAssignment_6_2 )
            {
             before(grammarAccess.getDomainAccess().getUnitAssignment_6_2()); 
            // InternalVertigoDsl.g:2526:2: ( rule__Domain__UnitAssignment_6_2 )
            // InternalVertigoDsl.g:2526:3: rule__Domain__UnitAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Domain__UnitAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getUnitAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group_6__2__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group__0"
    // InternalVertigoDsl.g:2535:1: rule__FieldDescriptionString__Group__0 : rule__FieldDescriptionString__Group__0__Impl rule__FieldDescriptionString__Group__1 ;
    public final void rule__FieldDescriptionString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2539:1: ( rule__FieldDescriptionString__Group__0__Impl rule__FieldDescriptionString__Group__1 )
            // InternalVertigoDsl.g:2540:2: rule__FieldDescriptionString__Group__0__Impl rule__FieldDescriptionString__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FieldDescriptionString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group__1();

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
    // $ANTLR end "rule__FieldDescriptionString__Group__0"


    // $ANTLR start "rule__FieldDescriptionString__Group__0__Impl"
    // InternalVertigoDsl.g:2547:1: rule__FieldDescriptionString__Group__0__Impl : ( ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 ) ) ;
    public final void rule__FieldDescriptionString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2551:1: ( ( ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 ) ) )
            // InternalVertigoDsl.g:2552:1: ( ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 ) )
            {
            // InternalVertigoDsl.g:2552:1: ( ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 ) )
            // InternalVertigoDsl.g:2553:2: ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringAssignment_0()); 
            // InternalVertigoDsl.g:2554:2: ( rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 )
            // InternalVertigoDsl.g:2554:3: rule__FieldDescriptionString__FieldDescriptionStringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__FieldDescriptionStringAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group__0__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group__1"
    // InternalVertigoDsl.g:2562:1: rule__FieldDescriptionString__Group__1 : rule__FieldDescriptionString__Group__1__Impl rule__FieldDescriptionString__Group__2 ;
    public final void rule__FieldDescriptionString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2566:1: ( rule__FieldDescriptionString__Group__1__Impl rule__FieldDescriptionString__Group__2 )
            // InternalVertigoDsl.g:2567:2: rule__FieldDescriptionString__Group__1__Impl rule__FieldDescriptionString__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__FieldDescriptionString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group__2();

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
    // $ANTLR end "rule__FieldDescriptionString__Group__1"


    // $ANTLR start "rule__FieldDescriptionString__Group__1__Impl"
    // InternalVertigoDsl.g:2574:1: rule__FieldDescriptionString__Group__1__Impl : ( ( rule__FieldDescriptionString__UnorderedGroup_1 ) ) ;
    public final void rule__FieldDescriptionString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2578:1: ( ( ( rule__FieldDescriptionString__UnorderedGroup_1 ) ) )
            // InternalVertigoDsl.g:2579:1: ( ( rule__FieldDescriptionString__UnorderedGroup_1 ) )
            {
            // InternalVertigoDsl.g:2579:1: ( ( rule__FieldDescriptionString__UnorderedGroup_1 ) )
            // InternalVertigoDsl.g:2580:2: ( rule__FieldDescriptionString__UnorderedGroup_1 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1()); 
            // InternalVertigoDsl.g:2581:2: ( rule__FieldDescriptionString__UnorderedGroup_1 )
            // InternalVertigoDsl.g:2581:3: rule__FieldDescriptionString__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group__1__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group__2"
    // InternalVertigoDsl.g:2589:1: rule__FieldDescriptionString__Group__2 : rule__FieldDescriptionString__Group__2__Impl ;
    public final void rule__FieldDescriptionString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2593:1: ( rule__FieldDescriptionString__Group__2__Impl )
            // InternalVertigoDsl.g:2594:2: rule__FieldDescriptionString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group__2__Impl();

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
    // $ANTLR end "rule__FieldDescriptionString__Group__2"


    // $ANTLR start "rule__FieldDescriptionString__Group__2__Impl"
    // InternalVertigoDsl.g:2600:1: rule__FieldDescriptionString__Group__2__Impl : ( '}' ) ;
    public final void rule__FieldDescriptionString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2604:1: ( ( '}' ) )
            // InternalVertigoDsl.g:2605:1: ( '}' )
            {
            // InternalVertigoDsl.g:2605:1: ( '}' )
            // InternalVertigoDsl.g:2606:2: '}'
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getRightCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group__2__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_0_0__0"
    // InternalVertigoDsl.g:2616:1: rule__FieldDescriptionString__Group_1_0_0__0 : rule__FieldDescriptionString__Group_1_0_0__0__Impl rule__FieldDescriptionString__Group_1_0_0__1 ;
    public final void rule__FieldDescriptionString__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2620:1: ( rule__FieldDescriptionString__Group_1_0_0__0__Impl rule__FieldDescriptionString__Group_1_0_0__1 )
            // InternalVertigoDsl.g:2621:2: rule__FieldDescriptionString__Group_1_0_0__0__Impl rule__FieldDescriptionString__Group_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__FieldDescriptionString__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_0_0__1();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_0_0__0"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_0_0__0__Impl"
    // InternalVertigoDsl.g:2628:1: rule__FieldDescriptionString__Group_1_0_0__0__Impl : ( 'domain:' ) ;
    public final void rule__FieldDescriptionString__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2632:1: ( ( 'domain:' ) )
            // InternalVertigoDsl.g:2633:1: ( 'domain:' )
            {
            // InternalVertigoDsl.g:2633:1: ( 'domain:' )
            // InternalVertigoDsl.g:2634:2: 'domain:'
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDomainKeyword_1_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getDomainKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_0_0__1"
    // InternalVertigoDsl.g:2643:1: rule__FieldDescriptionString__Group_1_0_0__1 : rule__FieldDescriptionString__Group_1_0_0__1__Impl ;
    public final void rule__FieldDescriptionString__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2647:1: ( rule__FieldDescriptionString__Group_1_0_0__1__Impl )
            // InternalVertigoDsl.g:2648:2: rule__FieldDescriptionString__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_0_0__1"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_0_0__1__Impl"
    // InternalVertigoDsl.g:2654:1: rule__FieldDescriptionString__Group_1_0_0__1__Impl : ( ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 ) ) ;
    public final void rule__FieldDescriptionString__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2658:1: ( ( ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 ) ) )
            // InternalVertigoDsl.g:2659:1: ( ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 ) )
            {
            // InternalVertigoDsl.g:2659:1: ( ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 ) )
            // InternalVertigoDsl.g:2660:2: ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDomainAssignment_1_0_0_1()); 
            // InternalVertigoDsl.g:2661:2: ( rule__FieldDescriptionString__DomainAssignment_1_0_0_1 )
            // InternalVertigoDsl.g:2661:3: rule__FieldDescriptionString__DomainAssignment_1_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__DomainAssignment_1_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getDomainAssignment_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_1__0"
    // InternalVertigoDsl.g:2670:1: rule__FieldDescriptionString__Group_1_1__0 : rule__FieldDescriptionString__Group_1_1__0__Impl rule__FieldDescriptionString__Group_1_1__1 ;
    public final void rule__FieldDescriptionString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2674:1: ( rule__FieldDescriptionString__Group_1_1__0__Impl rule__FieldDescriptionString__Group_1_1__1 )
            // InternalVertigoDsl.g:2675:2: rule__FieldDescriptionString__Group_1_1__0__Impl rule__FieldDescriptionString__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FieldDescriptionString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_1__1();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_1__0"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_1__0__Impl"
    // InternalVertigoDsl.g:2682:1: rule__FieldDescriptionString__Group_1_1__0__Impl : ( 'label:' ) ;
    public final void rule__FieldDescriptionString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2686:1: ( ( 'label:' ) )
            // InternalVertigoDsl.g:2687:1: ( 'label:' )
            {
            // InternalVertigoDsl.g:2687:1: ( 'label:' )
            // InternalVertigoDsl.g:2688:2: 'label:'
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getLabelKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getLabelKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_1__0__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_1__1"
    // InternalVertigoDsl.g:2697:1: rule__FieldDescriptionString__Group_1_1__1 : rule__FieldDescriptionString__Group_1_1__1__Impl ;
    public final void rule__FieldDescriptionString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2701:1: ( rule__FieldDescriptionString__Group_1_1__1__Impl )
            // InternalVertigoDsl.g:2702:2: rule__FieldDescriptionString__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_1__1"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_1__1__Impl"
    // InternalVertigoDsl.g:2708:1: rule__FieldDescriptionString__Group_1_1__1__Impl : ( ( rule__FieldDescriptionString__LabelAssignment_1_1_1 ) ) ;
    public final void rule__FieldDescriptionString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2712:1: ( ( ( rule__FieldDescriptionString__LabelAssignment_1_1_1 ) ) )
            // InternalVertigoDsl.g:2713:1: ( ( rule__FieldDescriptionString__LabelAssignment_1_1_1 ) )
            {
            // InternalVertigoDsl.g:2713:1: ( ( rule__FieldDescriptionString__LabelAssignment_1_1_1 ) )
            // InternalVertigoDsl.g:2714:2: ( rule__FieldDescriptionString__LabelAssignment_1_1_1 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getLabelAssignment_1_1_1()); 
            // InternalVertigoDsl.g:2715:2: ( rule__FieldDescriptionString__LabelAssignment_1_1_1 )
            // InternalVertigoDsl.g:2715:3: rule__FieldDescriptionString__LabelAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__LabelAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getLabelAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_1__1__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_2__0"
    // InternalVertigoDsl.g:2724:1: rule__FieldDescriptionString__Group_1_2__0 : rule__FieldDescriptionString__Group_1_2__0__Impl rule__FieldDescriptionString__Group_1_2__1 ;
    public final void rule__FieldDescriptionString__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2728:1: ( rule__FieldDescriptionString__Group_1_2__0__Impl rule__FieldDescriptionString__Group_1_2__1 )
            // InternalVertigoDsl.g:2729:2: rule__FieldDescriptionString__Group_1_2__0__Impl rule__FieldDescriptionString__Group_1_2__1
            {
            pushFollow(FOLLOW_24);
            rule__FieldDescriptionString__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_2__1();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_2__0"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_2__0__Impl"
    // InternalVertigoDsl.g:2736:1: rule__FieldDescriptionString__Group_1_2__0__Impl : ( 'required:' ) ;
    public final void rule__FieldDescriptionString__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2740:1: ( ( 'required:' ) )
            // InternalVertigoDsl.g:2741:1: ( 'required:' )
            {
            // InternalVertigoDsl.g:2741:1: ( 'required:' )
            // InternalVertigoDsl.g:2742:2: 'required:'
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getRequiredKeyword_1_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getRequiredKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_2__0__Impl"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_2__1"
    // InternalVertigoDsl.g:2751:1: rule__FieldDescriptionString__Group_1_2__1 : rule__FieldDescriptionString__Group_1_2__1__Impl ;
    public final void rule__FieldDescriptionString__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2755:1: ( rule__FieldDescriptionString__Group_1_2__1__Impl )
            // InternalVertigoDsl.g:2756:2: rule__FieldDescriptionString__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__Group_1_2__1__Impl();

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
    // $ANTLR end "rule__FieldDescriptionString__Group_1_2__1"


    // $ANTLR start "rule__FieldDescriptionString__Group_1_2__1__Impl"
    // InternalVertigoDsl.g:2762:1: rule__FieldDescriptionString__Group_1_2__1__Impl : ( ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 ) ) ;
    public final void rule__FieldDescriptionString__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2766:1: ( ( ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 ) ) )
            // InternalVertigoDsl.g:2767:1: ( ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 ) )
            {
            // InternalVertigoDsl.g:2767:1: ( ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 ) )
            // InternalVertigoDsl.g:2768:2: ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getRequiredAssignment_1_2_1()); 
            // InternalVertigoDsl.g:2769:2: ( rule__FieldDescriptionString__RequiredAssignment_1_2_1 )
            // InternalVertigoDsl.g:2769:3: rule__FieldDescriptionString__RequiredAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__RequiredAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldDescriptionStringAccess().getRequiredAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__Group_1_2__1__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0__0"
    // InternalVertigoDsl.g:2778:1: rule__DtDefinition__Group_0__0 : rule__DtDefinition__Group_0__0__Impl rule__DtDefinition__Group_0__1 ;
    public final void rule__DtDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2782:1: ( rule__DtDefinition__Group_0__0__Impl rule__DtDefinition__Group_0__1 )
            // InternalVertigoDsl.g:2783:2: rule__DtDefinition__Group_0__0__Impl rule__DtDefinition__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__DtDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0__1();

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
    // $ANTLR end "rule__DtDefinition__Group_0__0"


    // $ANTLR start "rule__DtDefinition__Group_0__0__Impl"
    // InternalVertigoDsl.g:2790:1: rule__DtDefinition__Group_0__0__Impl : ( 'create' ) ;
    public final void rule__DtDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2794:1: ( ( 'create' ) )
            // InternalVertigoDsl.g:2795:1: ( 'create' )
            {
            // InternalVertigoDsl.g:2795:1: ( 'create' )
            // InternalVertigoDsl.g:2796:2: 'create'
            {
             before(grammarAccess.getDtDefinitionAccess().getCreateKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getCreateKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0__1"
    // InternalVertigoDsl.g:2805:1: rule__DtDefinition__Group_0__1 : rule__DtDefinition__Group_0__1__Impl rule__DtDefinition__Group_0__2 ;
    public final void rule__DtDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2809:1: ( rule__DtDefinition__Group_0__1__Impl rule__DtDefinition__Group_0__2 )
            // InternalVertigoDsl.g:2810:2: rule__DtDefinition__Group_0__1__Impl rule__DtDefinition__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__DtDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0__2();

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
    // $ANTLR end "rule__DtDefinition__Group_0__1"


    // $ANTLR start "rule__DtDefinition__Group_0__1__Impl"
    // InternalVertigoDsl.g:2817:1: rule__DtDefinition__Group_0__1__Impl : ( 'DtDefinition' ) ;
    public final void rule__DtDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2821:1: ( ( 'DtDefinition' ) )
            // InternalVertigoDsl.g:2822:1: ( 'DtDefinition' )
            {
            // InternalVertigoDsl.g:2822:1: ( 'DtDefinition' )
            // InternalVertigoDsl.g:2823:2: 'DtDefinition'
            {
             before(grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_0_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0__2"
    // InternalVertigoDsl.g:2832:1: rule__DtDefinition__Group_0__2 : rule__DtDefinition__Group_0__2__Impl rule__DtDefinition__Group_0__3 ;
    public final void rule__DtDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2836:1: ( rule__DtDefinition__Group_0__2__Impl rule__DtDefinition__Group_0__3 )
            // InternalVertigoDsl.g:2837:2: rule__DtDefinition__Group_0__2__Impl rule__DtDefinition__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__DtDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0__3();

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
    // $ANTLR end "rule__DtDefinition__Group_0__2"


    // $ANTLR start "rule__DtDefinition__Group_0__2__Impl"
    // InternalVertigoDsl.g:2844:1: rule__DtDefinition__Group_0__2__Impl : ( ( rule__DtDefinition__NameAssignment_0_2 ) ) ;
    public final void rule__DtDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2848:1: ( ( ( rule__DtDefinition__NameAssignment_0_2 ) ) )
            // InternalVertigoDsl.g:2849:1: ( ( rule__DtDefinition__NameAssignment_0_2 ) )
            {
            // InternalVertigoDsl.g:2849:1: ( ( rule__DtDefinition__NameAssignment_0_2 ) )
            // InternalVertigoDsl.g:2850:2: ( rule__DtDefinition__NameAssignment_0_2 )
            {
             before(grammarAccess.getDtDefinitionAccess().getNameAssignment_0_2()); 
            // InternalVertigoDsl.g:2851:2: ( rule__DtDefinition__NameAssignment_0_2 )
            // InternalVertigoDsl.g:2851:3: rule__DtDefinition__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDtDefinitionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0__3"
    // InternalVertigoDsl.g:2859:1: rule__DtDefinition__Group_0__3 : rule__DtDefinition__Group_0__3__Impl rule__DtDefinition__Group_0__4 ;
    public final void rule__DtDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2863:1: ( rule__DtDefinition__Group_0__3__Impl rule__DtDefinition__Group_0__4 )
            // InternalVertigoDsl.g:2864:2: rule__DtDefinition__Group_0__3__Impl rule__DtDefinition__Group_0__4
            {
            pushFollow(FOLLOW_27);
            rule__DtDefinition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0__4();

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
    // $ANTLR end "rule__DtDefinition__Group_0__3"


    // $ANTLR start "rule__DtDefinition__Group_0__3__Impl"
    // InternalVertigoDsl.g:2871:1: rule__DtDefinition__Group_0__3__Impl : ( '{' ) ;
    public final void rule__DtDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2875:1: ( ( '{' ) )
            // InternalVertigoDsl.g:2876:1: ( '{' )
            {
            // InternalVertigoDsl.g:2876:1: ( '{' )
            // InternalVertigoDsl.g:2877:2: '{'
            {
             before(grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0__4"
    // InternalVertigoDsl.g:2886:1: rule__DtDefinition__Group_0__4 : rule__DtDefinition__Group_0__4__Impl ;
    public final void rule__DtDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2890:1: ( rule__DtDefinition__Group_0__4__Impl )
            // InternalVertigoDsl.g:2891:2: rule__DtDefinition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0__4__Impl();

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
    // $ANTLR end "rule__DtDefinition__Group_0__4"


    // $ANTLR start "rule__DtDefinition__Group_0__4__Impl"
    // InternalVertigoDsl.g:2897:1: rule__DtDefinition__Group_0__4__Impl : ( ( rule__DtDefinition__Group_0_4__0 )? ) ;
    public final void rule__DtDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2901:1: ( ( ( rule__DtDefinition__Group_0_4__0 )? ) )
            // InternalVertigoDsl.g:2902:1: ( ( rule__DtDefinition__Group_0_4__0 )? )
            {
            // InternalVertigoDsl.g:2902:1: ( ( rule__DtDefinition__Group_0_4__0 )? )
            // InternalVertigoDsl.g:2903:2: ( rule__DtDefinition__Group_0_4__0 )?
            {
             before(grammarAccess.getDtDefinitionAccess().getGroup_0_4()); 
            // InternalVertigoDsl.g:2904:2: ( rule__DtDefinition__Group_0_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVertigoDsl.g:2904:3: rule__DtDefinition__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDtDefinitionAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0_4__0"
    // InternalVertigoDsl.g:2913:1: rule__DtDefinition__Group_0_4__0 : rule__DtDefinition__Group_0_4__0__Impl rule__DtDefinition__Group_0_4__1 ;
    public final void rule__DtDefinition__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2917:1: ( rule__DtDefinition__Group_0_4__0__Impl rule__DtDefinition__Group_0_4__1 )
            // InternalVertigoDsl.g:2918:2: rule__DtDefinition__Group_0_4__0__Impl rule__DtDefinition__Group_0_4__1
            {
            pushFollow(FOLLOW_11);
            rule__DtDefinition__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0_4__1();

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
    // $ANTLR end "rule__DtDefinition__Group_0_4__0"


    // $ANTLR start "rule__DtDefinition__Group_0_4__0__Impl"
    // InternalVertigoDsl.g:2925:1: rule__DtDefinition__Group_0_4__0__Impl : ( 'stereoType' ) ;
    public final void rule__DtDefinition__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2929:1: ( ( 'stereoType' ) )
            // InternalVertigoDsl.g:2930:1: ( 'stereoType' )
            {
            // InternalVertigoDsl.g:2930:1: ( 'stereoType' )
            // InternalVertigoDsl.g:2931:2: 'stereoType'
            {
             before(grammarAccess.getDtDefinitionAccess().getStereoTypeKeyword_0_4_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getStereoTypeKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0_4__0__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0_4__1"
    // InternalVertigoDsl.g:2940:1: rule__DtDefinition__Group_0_4__1 : rule__DtDefinition__Group_0_4__1__Impl rule__DtDefinition__Group_0_4__2 ;
    public final void rule__DtDefinition__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2944:1: ( rule__DtDefinition__Group_0_4__1__Impl rule__DtDefinition__Group_0_4__2 )
            // InternalVertigoDsl.g:2945:2: rule__DtDefinition__Group_0_4__1__Impl rule__DtDefinition__Group_0_4__2
            {
            pushFollow(FOLLOW_12);
            rule__DtDefinition__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0_4__2();

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
    // $ANTLR end "rule__DtDefinition__Group_0_4__1"


    // $ANTLR start "rule__DtDefinition__Group_0_4__1__Impl"
    // InternalVertigoDsl.g:2952:1: rule__DtDefinition__Group_0_4__1__Impl : ( ':' ) ;
    public final void rule__DtDefinition__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2956:1: ( ( ':' ) )
            // InternalVertigoDsl.g:2957:1: ( ':' )
            {
            // InternalVertigoDsl.g:2957:1: ( ':' )
            // InternalVertigoDsl.g:2958:2: ':'
            {
             before(grammarAccess.getDtDefinitionAccess().getColonKeyword_0_4_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getColonKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0_4__1__Impl"


    // $ANTLR start "rule__DtDefinition__Group_0_4__2"
    // InternalVertigoDsl.g:2967:1: rule__DtDefinition__Group_0_4__2 : rule__DtDefinition__Group_0_4__2__Impl ;
    public final void rule__DtDefinition__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2971:1: ( rule__DtDefinition__Group_0_4__2__Impl )
            // InternalVertigoDsl.g:2972:2: rule__DtDefinition__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_0_4__2__Impl();

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
    // $ANTLR end "rule__DtDefinition__Group_0_4__2"


    // $ANTLR start "rule__DtDefinition__Group_0_4__2__Impl"
    // InternalVertigoDsl.g:2978:1: rule__DtDefinition__Group_0_4__2__Impl : ( ( rule__DtDefinition__StereoTypeAssignment_0_4_2 ) ) ;
    public final void rule__DtDefinition__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2982:1: ( ( ( rule__DtDefinition__StereoTypeAssignment_0_4_2 ) ) )
            // InternalVertigoDsl.g:2983:1: ( ( rule__DtDefinition__StereoTypeAssignment_0_4_2 ) )
            {
            // InternalVertigoDsl.g:2983:1: ( ( rule__DtDefinition__StereoTypeAssignment_0_4_2 ) )
            // InternalVertigoDsl.g:2984:2: ( rule__DtDefinition__StereoTypeAssignment_0_4_2 )
            {
             before(grammarAccess.getDtDefinitionAccess().getStereoTypeAssignment_0_4_2()); 
            // InternalVertigoDsl.g:2985:2: ( rule__DtDefinition__StereoTypeAssignment_0_4_2 )
            // InternalVertigoDsl.g:2985:3: rule__DtDefinition__StereoTypeAssignment_0_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__StereoTypeAssignment_0_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDtDefinitionAccess().getStereoTypeAssignment_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_0_4__2__Impl"


    // $ANTLR start "rule__DtDefinition__Group_1__0"
    // InternalVertigoDsl.g:2994:1: rule__DtDefinition__Group_1__0 : rule__DtDefinition__Group_1__0__Impl rule__DtDefinition__Group_1__1 ;
    public final void rule__DtDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:2998:1: ( rule__DtDefinition__Group_1__0__Impl rule__DtDefinition__Group_1__1 )
            // InternalVertigoDsl.g:2999:2: rule__DtDefinition__Group_1__0__Impl rule__DtDefinition__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__DtDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_1__1();

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
    // $ANTLR end "rule__DtDefinition__Group_1__0"


    // $ANTLR start "rule__DtDefinition__Group_1__0__Impl"
    // InternalVertigoDsl.g:3006:1: rule__DtDefinition__Group_1__0__Impl : ( 'id' ) ;
    public final void rule__DtDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3010:1: ( ( 'id' ) )
            // InternalVertigoDsl.g:3011:1: ( 'id' )
            {
            // InternalVertigoDsl.g:3011:1: ( 'id' )
            // InternalVertigoDsl.g:3012:2: 'id'
            {
             before(grammarAccess.getDtDefinitionAccess().getIdKeyword_1_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getIdKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__DtDefinition__Group_1__1"
    // InternalVertigoDsl.g:3021:1: rule__DtDefinition__Group_1__1 : rule__DtDefinition__Group_1__1__Impl rule__DtDefinition__Group_1__2 ;
    public final void rule__DtDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3025:1: ( rule__DtDefinition__Group_1__1__Impl rule__DtDefinition__Group_1__2 )
            // InternalVertigoDsl.g:3026:2: rule__DtDefinition__Group_1__1__Impl rule__DtDefinition__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__DtDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_1__2();

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
    // $ANTLR end "rule__DtDefinition__Group_1__1"


    // $ANTLR start "rule__DtDefinition__Group_1__1__Impl"
    // InternalVertigoDsl.g:3033:1: rule__DtDefinition__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__DtDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3037:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3038:1: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3038:1: ( RULE_ID )
            // InternalVertigoDsl.g:3039:2: RULE_ID
            {
             before(grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__DtDefinition__Group_1__2"
    // InternalVertigoDsl.g:3048:1: rule__DtDefinition__Group_1__2 : rule__DtDefinition__Group_1__2__Impl ;
    public final void rule__DtDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3052:1: ( rule__DtDefinition__Group_1__2__Impl )
            // InternalVertigoDsl.g:3053:2: rule__DtDefinition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_1__2__Impl();

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
    // $ANTLR end "rule__DtDefinition__Group_1__2"


    // $ANTLR start "rule__DtDefinition__Group_1__2__Impl"
    // InternalVertigoDsl.g:3059:1: rule__DtDefinition__Group_1__2__Impl : ( ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 ) ) ;
    public final void rule__DtDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3063:1: ( ( ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 ) ) )
            // InternalVertigoDsl.g:3064:1: ( ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 ) )
            {
            // InternalVertigoDsl.g:3064:1: ( ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 ) )
            // InternalVertigoDsl.g:3065:2: ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 )
            {
             before(grammarAccess.getDtDefinitionAccess().getIdFieldDescriptionStringAssignment_1_2()); 
            // InternalVertigoDsl.g:3066:2: ( rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 )
            // InternalVertigoDsl.g:3066:3: rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDtDefinitionAccess().getIdFieldDescriptionStringAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__DtDefinition__Group_2__0"
    // InternalVertigoDsl.g:3075:1: rule__DtDefinition__Group_2__0 : rule__DtDefinition__Group_2__0__Impl rule__DtDefinition__Group_2__1 ;
    public final void rule__DtDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3079:1: ( rule__DtDefinition__Group_2__0__Impl rule__DtDefinition__Group_2__1 )
            // InternalVertigoDsl.g:3080:2: rule__DtDefinition__Group_2__0__Impl rule__DtDefinition__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DtDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_2__1();

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
    // $ANTLR end "rule__DtDefinition__Group_2__0"


    // $ANTLR start "rule__DtDefinition__Group_2__0__Impl"
    // InternalVertigoDsl.g:3087:1: rule__DtDefinition__Group_2__0__Impl : ( 'field' ) ;
    public final void rule__DtDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3091:1: ( ( 'field' ) )
            // InternalVertigoDsl.g:3092:1: ( 'field' )
            {
            // InternalVertigoDsl.g:3092:1: ( 'field' )
            // InternalVertigoDsl.g:3093:2: 'field'
            {
             before(grammarAccess.getDtDefinitionAccess().getFieldKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getFieldKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__DtDefinition__Group_2__1"
    // InternalVertigoDsl.g:3102:1: rule__DtDefinition__Group_2__1 : rule__DtDefinition__Group_2__1__Impl rule__DtDefinition__Group_2__2 ;
    public final void rule__DtDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3106:1: ( rule__DtDefinition__Group_2__1__Impl rule__DtDefinition__Group_2__2 )
            // InternalVertigoDsl.g:3107:2: rule__DtDefinition__Group_2__1__Impl rule__DtDefinition__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__DtDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_2__2();

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
    // $ANTLR end "rule__DtDefinition__Group_2__1"


    // $ANTLR start "rule__DtDefinition__Group_2__1__Impl"
    // InternalVertigoDsl.g:3114:1: rule__DtDefinition__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__DtDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3118:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3119:1: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3119:1: ( RULE_ID )
            // InternalVertigoDsl.g:3120:2: RULE_ID
            {
             before(grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__DtDefinition__Group_2__2"
    // InternalVertigoDsl.g:3129:1: rule__DtDefinition__Group_2__2 : rule__DtDefinition__Group_2__2__Impl ;
    public final void rule__DtDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3133:1: ( rule__DtDefinition__Group_2__2__Impl )
            // InternalVertigoDsl.g:3134:2: rule__DtDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__Group_2__2__Impl();

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
    // $ANTLR end "rule__DtDefinition__Group_2__2"


    // $ANTLR start "rule__DtDefinition__Group_2__2__Impl"
    // InternalVertigoDsl.g:3140:1: rule__DtDefinition__Group_2__2__Impl : ( ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 ) ) ;
    public final void rule__DtDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3144:1: ( ( ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 ) ) )
            // InternalVertigoDsl.g:3145:1: ( ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 ) )
            {
            // InternalVertigoDsl.g:3145:1: ( ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 ) )
            // InternalVertigoDsl.g:3146:2: ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 )
            {
             before(grammarAccess.getDtDefinitionAccess().getFieldDescriptionStringAssignment_2_2()); 
            // InternalVertigoDsl.g:3147:2: ( rule__DtDefinition__FieldDescriptionStringAssignment_2_2 )
            // InternalVertigoDsl.g:3147:3: rule__DtDefinition__FieldDescriptionStringAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__FieldDescriptionStringAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDtDefinitionAccess().getFieldDescriptionStringAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__Domain__UnorderedGroup"
    // InternalVertigoDsl.g:3156:1: rule__Domain__UnorderedGroup : rule__Domain__UnorderedGroup__0 {...}?;
    public final void rule__Domain__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
        	
        try {
            // InternalVertigoDsl.g:3161:1: ( rule__Domain__UnorderedGroup__0 {...}?)
            // InternalVertigoDsl.g:3162:2: rule__Domain__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Domain__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup"


    // $ANTLR start "rule__Domain__UnorderedGroup__Impl"
    // InternalVertigoDsl.g:3170:1: rule__Domain__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__Domain__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalVertigoDsl.g:3175:1: ( ( ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // InternalVertigoDsl.g:3176:3: ( ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // InternalVertigoDsl.g:3176:3: ( ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt15=8;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
                alt15=2;
            }
            else if ( LA15_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {
                alt15=3;
            }
            else if ( LA15_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {
                alt15=4;
            }
            else if ( LA15_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {
                alt15=5;
            }
            else if ( LA15_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {
                alt15=6;
            }
            else if ( LA15_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {
                alt15=7;
            }
            else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {
                alt15=8;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVertigoDsl.g:3177:3: ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3177:3: ({...}? => ( ( ( rule__Domain__Group_0__0 ) ) ) )
                    // InternalVertigoDsl.g:3178:4: {...}? => ( ( ( rule__Domain__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalVertigoDsl.g:3178:100: ( ( ( rule__Domain__Group_0__0 ) ) )
                    // InternalVertigoDsl.g:3179:5: ( ( rule__Domain__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3185:5: ( ( rule__Domain__Group_0__0 ) )
                    // InternalVertigoDsl.g:3186:6: ( rule__Domain__Group_0__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_0()); 
                    // InternalVertigoDsl.g:3187:6: ( rule__Domain__Group_0__0 )
                    // InternalVertigoDsl.g:3187:7: rule__Domain__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3192:3: ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3192:3: ({...}? => ( ( ( rule__Domain__Group_1__0 ) ) ) )
                    // InternalVertigoDsl.g:3193:4: {...}? => ( ( ( rule__Domain__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalVertigoDsl.g:3193:100: ( ( ( rule__Domain__Group_1__0 ) ) )
                    // InternalVertigoDsl.g:3194:5: ( ( rule__Domain__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3200:5: ( ( rule__Domain__Group_1__0 ) )
                    // InternalVertigoDsl.g:3201:6: ( rule__Domain__Group_1__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_1()); 
                    // InternalVertigoDsl.g:3202:6: ( rule__Domain__Group_1__0 )
                    // InternalVertigoDsl.g:3202:7: rule__Domain__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:3207:3: ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3207:3: ({...}? => ( ( ( rule__Domain__Group_2__0 ) ) ) )
                    // InternalVertigoDsl.g:3208:4: {...}? => ( ( ( rule__Domain__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalVertigoDsl.g:3208:100: ( ( ( rule__Domain__Group_2__0 ) ) )
                    // InternalVertigoDsl.g:3209:5: ( ( rule__Domain__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3215:5: ( ( rule__Domain__Group_2__0 ) )
                    // InternalVertigoDsl.g:3216:6: ( rule__Domain__Group_2__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_2()); 
                    // InternalVertigoDsl.g:3217:6: ( rule__Domain__Group_2__0 )
                    // InternalVertigoDsl.g:3217:7: rule__Domain__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:3222:3: ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3222:3: ({...}? => ( ( ( rule__Domain__Group_3__0 ) ) ) )
                    // InternalVertigoDsl.g:3223:4: {...}? => ( ( ( rule__Domain__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalVertigoDsl.g:3223:100: ( ( ( rule__Domain__Group_3__0 ) ) )
                    // InternalVertigoDsl.g:3224:5: ( ( rule__Domain__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3230:5: ( ( rule__Domain__Group_3__0 ) )
                    // InternalVertigoDsl.g:3231:6: ( rule__Domain__Group_3__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_3()); 
                    // InternalVertigoDsl.g:3232:6: ( rule__Domain__Group_3__0 )
                    // InternalVertigoDsl.g:3232:7: rule__Domain__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:3237:3: ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3237:3: ({...}? => ( ( ( rule__Domain__Group_4__0 ) ) ) )
                    // InternalVertigoDsl.g:3238:4: {...}? => ( ( ( rule__Domain__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalVertigoDsl.g:3238:100: ( ( ( rule__Domain__Group_4__0 ) ) )
                    // InternalVertigoDsl.g:3239:5: ( ( rule__Domain__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3245:5: ( ( rule__Domain__Group_4__0 ) )
                    // InternalVertigoDsl.g:3246:6: ( rule__Domain__Group_4__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_4()); 
                    // InternalVertigoDsl.g:3247:6: ( rule__Domain__Group_4__0 )
                    // InternalVertigoDsl.g:3247:7: rule__Domain__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:3252:3: ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3252:3: ({...}? => ( ( ( rule__Domain__Group_5__0 ) ) ) )
                    // InternalVertigoDsl.g:3253:4: {...}? => ( ( ( rule__Domain__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalVertigoDsl.g:3253:100: ( ( ( rule__Domain__Group_5__0 ) ) )
                    // InternalVertigoDsl.g:3254:5: ( ( rule__Domain__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3260:5: ( ( rule__Domain__Group_5__0 ) )
                    // InternalVertigoDsl.g:3261:6: ( rule__Domain__Group_5__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_5()); 
                    // InternalVertigoDsl.g:3262:6: ( rule__Domain__Group_5__0 )
                    // InternalVertigoDsl.g:3262:7: rule__Domain__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:3267:3: ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3267:3: ({...}? => ( ( ( rule__Domain__Group_6__0 ) ) ) )
                    // InternalVertigoDsl.g:3268:4: {...}? => ( ( ( rule__Domain__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6)");
                    }
                    // InternalVertigoDsl.g:3268:100: ( ( ( rule__Domain__Group_6__0 ) ) )
                    // InternalVertigoDsl.g:3269:5: ( ( rule__Domain__Group_6__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 6);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3275:5: ( ( rule__Domain__Group_6__0 ) )
                    // InternalVertigoDsl.g:3276:6: ( rule__Domain__Group_6__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_6()); 
                    // InternalVertigoDsl.g:3277:6: ( rule__Domain__Group_6__0 )
                    // InternalVertigoDsl.g:3277:7: rule__Domain__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:3282:3: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // InternalVertigoDsl.g:3282:3: ({...}? => ( ( ( '}' ) ) ) )
                    // InternalVertigoDsl.g:3283:4: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Domain__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7)");
                    }
                    // InternalVertigoDsl.g:3283:100: ( ( ( '}' ) ) )
                    // InternalVertigoDsl.g:3284:5: ( ( '}' ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 7);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3290:5: ( ( '}' ) )
                    // InternalVertigoDsl.g:3291:6: ( '}' )
                    {
                     before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
                    // InternalVertigoDsl.g:3292:6: ( '}' )
                    // InternalVertigoDsl.g:3292:7: '}'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__Impl"


    // $ANTLR start "rule__Domain__UnorderedGroup__0"
    // InternalVertigoDsl.g:3305:1: rule__Domain__UnorderedGroup__0 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__1 )? ;
    public final void rule__Domain__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3309:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__1 )? )
            // InternalVertigoDsl.g:3310:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3311:2: ( rule__Domain__UnorderedGroup__1 )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalVertigoDsl.g:3311:2: rule__Domain__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__0"


    // $ANTLR start "rule__Domain__UnorderedGroup__1"
    // InternalVertigoDsl.g:3317:1: rule__Domain__UnorderedGroup__1 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__2 )? ;
    public final void rule__Domain__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3321:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__2 )? )
            // InternalVertigoDsl.g:3322:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3323:2: ( rule__Domain__UnorderedGroup__2 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalVertigoDsl.g:3323:2: rule__Domain__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__1"


    // $ANTLR start "rule__Domain__UnorderedGroup__2"
    // InternalVertigoDsl.g:3329:1: rule__Domain__UnorderedGroup__2 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__3 )? ;
    public final void rule__Domain__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3333:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__3 )? )
            // InternalVertigoDsl.g:3334:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3335:2: ( rule__Domain__UnorderedGroup__3 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalVertigoDsl.g:3335:2: rule__Domain__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__2"


    // $ANTLR start "rule__Domain__UnorderedGroup__3"
    // InternalVertigoDsl.g:3341:1: rule__Domain__UnorderedGroup__3 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__4 )? ;
    public final void rule__Domain__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3345:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__4 )? )
            // InternalVertigoDsl.g:3346:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3347:2: ( rule__Domain__UnorderedGroup__4 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalVertigoDsl.g:3347:2: rule__Domain__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__3"


    // $ANTLR start "rule__Domain__UnorderedGroup__4"
    // InternalVertigoDsl.g:3353:1: rule__Domain__UnorderedGroup__4 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__5 )? ;
    public final void rule__Domain__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3357:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__5 )? )
            // InternalVertigoDsl.g:3358:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3359:2: ( rule__Domain__UnorderedGroup__5 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalVertigoDsl.g:3359:2: rule__Domain__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__4"


    // $ANTLR start "rule__Domain__UnorderedGroup__5"
    // InternalVertigoDsl.g:3365:1: rule__Domain__UnorderedGroup__5 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__6 )? ;
    public final void rule__Domain__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3369:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__6 )? )
            // InternalVertigoDsl.g:3370:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3371:2: ( rule__Domain__UnorderedGroup__6 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalVertigoDsl.g:3371:2: rule__Domain__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__5"


    // $ANTLR start "rule__Domain__UnorderedGroup__6"
    // InternalVertigoDsl.g:3377:1: rule__Domain__UnorderedGroup__6 : rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__7 )? ;
    public final void rule__Domain__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3381:1: ( rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__7 )? )
            // InternalVertigoDsl.g:3382:2: rule__Domain__UnorderedGroup__Impl ( rule__Domain__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_28);
            rule__Domain__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3383:2: ( rule__Domain__UnorderedGroup__7 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalVertigoDsl.g:3383:2: rule__Domain__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Domain__UnorderedGroup__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnorderedGroup__6"


    // $ANTLR start "rule__Domain__UnorderedGroup__7"
    // InternalVertigoDsl.g:3389:1: rule__Domain__UnorderedGroup__7 : rule__Domain__UnorderedGroup__Impl ;
    public final void rule__Domain__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3393:1: ( rule__Domain__UnorderedGroup__Impl )
            // InternalVertigoDsl.g:3394:2: rule__Domain__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domain__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__Domain__UnorderedGroup__7"


    // $ANTLR start "rule__FieldDescriptionString__UnorderedGroup_1"
    // InternalVertigoDsl.g:3401:1: rule__FieldDescriptionString__UnorderedGroup_1 : ( rule__FieldDescriptionString__UnorderedGroup_1__0 )? ;
    public final void rule__FieldDescriptionString__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
        	
        try {
            // InternalVertigoDsl.g:3406:1: ( ( rule__FieldDescriptionString__UnorderedGroup_1__0 )? )
            // InternalVertigoDsl.g:3407:2: ( rule__FieldDescriptionString__UnorderedGroup_1__0 )?
            {
            // InternalVertigoDsl.g:3407:2: ( rule__FieldDescriptionString__UnorderedGroup_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ( LA23_0 == RULE_ID || LA23_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVertigoDsl.g:3407:2: rule__FieldDescriptionString__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__UnorderedGroup_1"


    // $ANTLR start "rule__FieldDescriptionString__UnorderedGroup_1__Impl"
    // InternalVertigoDsl.g:3415:1: rule__FieldDescriptionString__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) ) ) ;
    public final void rule__FieldDescriptionString__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalVertigoDsl.g:3420:1: ( ( ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) ) ) )
            // InternalVertigoDsl.g:3421:3: ( ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) ) )
            {
            // InternalVertigoDsl.g:3421:3: ( ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( ( LA24_0 == RULE_ID || LA24_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                alt24=2;
            }
            else if ( LA24_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                alt24=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalVertigoDsl.g:3422:3: ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3422:3: ({...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) ) )
                    // InternalVertigoDsl.g:3423:4: {...}? => ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__FieldDescriptionString__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalVertigoDsl.g:3423:118: ( ( ( rule__FieldDescriptionString__Alternatives_1_0 ) ) )
                    // InternalVertigoDsl.g:3424:5: ( ( rule__FieldDescriptionString__Alternatives_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3430:5: ( ( rule__FieldDescriptionString__Alternatives_1_0 ) )
                    // InternalVertigoDsl.g:3431:6: ( rule__FieldDescriptionString__Alternatives_1_0 )
                    {
                     before(grammarAccess.getFieldDescriptionStringAccess().getAlternatives_1_0()); 
                    // InternalVertigoDsl.g:3432:6: ( rule__FieldDescriptionString__Alternatives_1_0 )
                    // InternalVertigoDsl.g:3432:7: rule__FieldDescriptionString__Alternatives_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__Alternatives_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDescriptionStringAccess().getAlternatives_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3437:3: ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3437:3: ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) ) )
                    // InternalVertigoDsl.g:3438:4: {...}? => ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__FieldDescriptionString__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalVertigoDsl.g:3438:118: ( ( ( rule__FieldDescriptionString__Group_1_1__0 ) ) )
                    // InternalVertigoDsl.g:3439:5: ( ( rule__FieldDescriptionString__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3445:5: ( ( rule__FieldDescriptionString__Group_1_1__0 ) )
                    // InternalVertigoDsl.g:3446:6: ( rule__FieldDescriptionString__Group_1_1__0 )
                    {
                     before(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_1()); 
                    // InternalVertigoDsl.g:3447:6: ( rule__FieldDescriptionString__Group_1_1__0 )
                    // InternalVertigoDsl.g:3447:7: rule__FieldDescriptionString__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:3452:3: ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3452:3: ({...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) ) )
                    // InternalVertigoDsl.g:3453:4: {...}? => ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__FieldDescriptionString__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalVertigoDsl.g:3453:118: ( ( ( rule__FieldDescriptionString__Group_1_2__0 ) ) )
                    // InternalVertigoDsl.g:3454:5: ( ( rule__FieldDescriptionString__Group_1_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3460:5: ( ( rule__FieldDescriptionString__Group_1_2__0 ) )
                    // InternalVertigoDsl.g:3461:6: ( rule__FieldDescriptionString__Group_1_2__0 )
                    {
                     before(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_2()); 
                    // InternalVertigoDsl.g:3462:6: ( rule__FieldDescriptionString__Group_1_2__0 )
                    // InternalVertigoDsl.g:3462:7: rule__FieldDescriptionString__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldDescriptionStringAccess().getGroup_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__FieldDescriptionString__UnorderedGroup_1__0"
    // InternalVertigoDsl.g:3475:1: rule__FieldDescriptionString__UnorderedGroup_1__0 : rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__1 )? ;
    public final void rule__FieldDescriptionString__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3479:1: ( rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__1 )? )
            // InternalVertigoDsl.g:3480:2: rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_29);
            rule__FieldDescriptionString__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3481:2: ( rule__FieldDescriptionString__UnorderedGroup_1__1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ( LA25_0 == RULE_ID || LA25_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVertigoDsl.g:3481:2: rule__FieldDescriptionString__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__UnorderedGroup_1__0"


    // $ANTLR start "rule__FieldDescriptionString__UnorderedGroup_1__1"
    // InternalVertigoDsl.g:3487:1: rule__FieldDescriptionString__UnorderedGroup_1__1 : rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__2 )? ;
    public final void rule__FieldDescriptionString__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3491:1: ( rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__2 )? )
            // InternalVertigoDsl.g:3492:2: rule__FieldDescriptionString__UnorderedGroup_1__Impl ( rule__FieldDescriptionString__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_29);
            rule__FieldDescriptionString__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3493:2: ( rule__FieldDescriptionString__UnorderedGroup_1__2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ( LA26_0 == RULE_ID || LA26_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVertigoDsl.g:3493:2: rule__FieldDescriptionString__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldDescriptionString__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__UnorderedGroup_1__1"


    // $ANTLR start "rule__FieldDescriptionString__UnorderedGroup_1__2"
    // InternalVertigoDsl.g:3499:1: rule__FieldDescriptionString__UnorderedGroup_1__2 : rule__FieldDescriptionString__UnorderedGroup_1__Impl ;
    public final void rule__FieldDescriptionString__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3503:1: ( rule__FieldDescriptionString__UnorderedGroup_1__Impl )
            // InternalVertigoDsl.g:3504:2: rule__FieldDescriptionString__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldDescriptionString__UnorderedGroup_1__Impl();

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
    // $ANTLR end "rule__FieldDescriptionString__UnorderedGroup_1__2"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup"
    // InternalVertigoDsl.g:3511:1: rule__DtDefinition__UnorderedGroup : rule__DtDefinition__UnorderedGroup__0 {...}?;
    public final void rule__DtDefinition__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
        	
        try {
            // InternalVertigoDsl.g:3516:1: ( rule__DtDefinition__UnorderedGroup__0 {...}?)
            // InternalVertigoDsl.g:3517:2: rule__DtDefinition__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__DtDefinition__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__UnorderedGroup"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup__Impl"
    // InternalVertigoDsl.g:3525:1: rule__DtDefinition__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) ;
    public final void rule__DtDefinition__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalVertigoDsl.g:3530:1: ( ( ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) ) )
            // InternalVertigoDsl.g:3531:3: ( ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            {
            // InternalVertigoDsl.g:3531:3: ( ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) ) | ({...}? => ( ( ( '}' ) ) ) ) )
            int alt27=4;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {
                alt27=2;
            }
            else if ( LA27_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {
                alt27=3;
            }
            else if ( LA27_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {
                alt27=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:3532:3: ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3532:3: ({...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) ) )
                    // InternalVertigoDsl.g:3533:4: {...}? => ( ( ( rule__DtDefinition__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__DtDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalVertigoDsl.g:3533:106: ( ( ( rule__DtDefinition__Group_0__0 ) ) )
                    // InternalVertigoDsl.g:3534:5: ( ( rule__DtDefinition__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3540:5: ( ( rule__DtDefinition__Group_0__0 ) )
                    // InternalVertigoDsl.g:3541:6: ( rule__DtDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getDtDefinitionAccess().getGroup_0()); 
                    // InternalVertigoDsl.g:3542:6: ( rule__DtDefinition__Group_0__0 )
                    // InternalVertigoDsl.g:3542:7: rule__DtDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDtDefinitionAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3547:3: ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3547:3: ({...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) ) )
                    // InternalVertigoDsl.g:3548:4: {...}? => ( ( ( rule__DtDefinition__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__DtDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalVertigoDsl.g:3548:106: ( ( ( rule__DtDefinition__Group_1__0 ) ) )
                    // InternalVertigoDsl.g:3549:5: ( ( rule__DtDefinition__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3555:5: ( ( rule__DtDefinition__Group_1__0 ) )
                    // InternalVertigoDsl.g:3556:6: ( rule__DtDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getDtDefinitionAccess().getGroup_1()); 
                    // InternalVertigoDsl.g:3557:6: ( rule__DtDefinition__Group_1__0 )
                    // InternalVertigoDsl.g:3557:7: rule__DtDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDtDefinitionAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:3562:3: ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) )
                    {
                    // InternalVertigoDsl.g:3562:3: ({...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) ) )
                    // InternalVertigoDsl.g:3563:4: {...}? => ( ( ( rule__DtDefinition__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__DtDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalVertigoDsl.g:3563:106: ( ( ( rule__DtDefinition__Group_2__0 ) ) )
                    // InternalVertigoDsl.g:3564:5: ( ( rule__DtDefinition__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3570:5: ( ( rule__DtDefinition__Group_2__0 ) )
                    // InternalVertigoDsl.g:3571:6: ( rule__DtDefinition__Group_2__0 )
                    {
                     before(grammarAccess.getDtDefinitionAccess().getGroup_2()); 
                    // InternalVertigoDsl.g:3572:6: ( rule__DtDefinition__Group_2__0 )
                    // InternalVertigoDsl.g:3572:7: rule__DtDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDtDefinitionAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:3577:3: ({...}? => ( ( ( '}' ) ) ) )
                    {
                    // InternalVertigoDsl.g:3577:3: ({...}? => ( ( ( '}' ) ) ) )
                    // InternalVertigoDsl.g:3578:4: {...}? => ( ( ( '}' ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__DtDefinition__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalVertigoDsl.g:3578:106: ( ( ( '}' ) ) )
                    // InternalVertigoDsl.g:3579:5: ( ( '}' ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalVertigoDsl.g:3585:5: ( ( '}' ) )
                    // InternalVertigoDsl.g:3586:6: ( '}' )
                    {
                     before(grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_3()); 
                    // InternalVertigoDsl.g:3587:6: ( '}' )
                    // InternalVertigoDsl.g:3587:7: '}'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__UnorderedGroup__Impl"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup__0"
    // InternalVertigoDsl.g:3600:1: rule__DtDefinition__UnorderedGroup__0 : rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__1 )? ;
    public final void rule__DtDefinition__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3604:1: ( rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__1 )? )
            // InternalVertigoDsl.g:3605:2: rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_6);
            rule__DtDefinition__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3606:2: ( rule__DtDefinition__UnorderedGroup__1 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:3606:2: rule__DtDefinition__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__UnorderedGroup__0"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup__1"
    // InternalVertigoDsl.g:3612:1: rule__DtDefinition__UnorderedGroup__1 : rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__2 )? ;
    public final void rule__DtDefinition__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3616:1: ( rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__2 )? )
            // InternalVertigoDsl.g:3617:2: rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_6);
            rule__DtDefinition__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3618:2: ( rule__DtDefinition__UnorderedGroup__2 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:3618:2: rule__DtDefinition__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__UnorderedGroup__1"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup__2"
    // InternalVertigoDsl.g:3624:1: rule__DtDefinition__UnorderedGroup__2 : rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__3 )? ;
    public final void rule__DtDefinition__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3628:1: ( rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__3 )? )
            // InternalVertigoDsl.g:3629:2: rule__DtDefinition__UnorderedGroup__Impl ( rule__DtDefinition__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_6);
            rule__DtDefinition__UnorderedGroup__Impl();

            state._fsp--;

            // InternalVertigoDsl.g:3630:2: ( rule__DtDefinition__UnorderedGroup__3 )?
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:3630:2: rule__DtDefinition__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DtDefinition__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__UnorderedGroup__2"


    // $ANTLR start "rule__DtDefinition__UnorderedGroup__3"
    // InternalVertigoDsl.g:3636:1: rule__DtDefinition__UnorderedGroup__3 : rule__DtDefinition__UnorderedGroup__Impl ;
    public final void rule__DtDefinition__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3640:1: ( rule__DtDefinition__UnorderedGroup__Impl )
            // InternalVertigoDsl.g:3641:2: rule__DtDefinition__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DtDefinition__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__DtDefinition__UnorderedGroup__3"


    // $ANTLR start "rule__Model__PackageAssignment_1"
    // InternalVertigoDsl.g:3648:1: rule__Model__PackageAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__PackageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3652:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3653:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3653:2: ( RULE_ID )
            // InternalVertigoDsl.g:3654:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getPackageIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPackageIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageAssignment_1"


    // $ANTLR start "rule__Model__PackagesAssignment_2_1"
    // InternalVertigoDsl.g:3663:1: rule__Model__PackagesAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Model__PackagesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3667:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3668:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3668:2: ( RULE_ID )
            // InternalVertigoDsl.g:3669:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getPackagesIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPackagesIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagesAssignment_2_1"


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // InternalVertigoDsl.g:3678:1: rule__Model__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3682:1: ( ( ruleElement ) )
            // InternalVertigoDsl.g:3683:2: ( ruleElement )
            {
            // InternalVertigoDsl.g:3683:2: ( ruleElement )
            // InternalVertigoDsl.g:3684:3: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__DeclaredDomain__NameAssignment_2"
    // InternalVertigoDsl.g:3693:1: rule__DeclaredDomain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DeclaredDomain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3697:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3698:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3698:2: ( RULE_ID )
            // InternalVertigoDsl.g:3699:3: RULE_ID
            {
             before(grammarAccess.getDeclaredDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredDomainAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredDomain__NameAssignment_2"


    // $ANTLR start "rule__Constraint__NameAssignment_2"
    // InternalVertigoDsl.g:3708:1: rule__Constraint__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constraint__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3712:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3713:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3713:2: ( RULE_ID )
            // InternalVertigoDsl.g:3714:3: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_2"


    // $ANTLR start "rule__Constraint__ClassNameAssignment_6"
    // InternalVertigoDsl.g:3723:1: rule__Constraint__ClassNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Constraint__ClassNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3727:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3728:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3728:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3729:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getClassNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getClassNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ClassNameAssignment_6"


    // $ANTLR start "rule__Constraint__ArgsAssignment_7_2"
    // InternalVertigoDsl.g:3738:1: rule__Constraint__ArgsAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Constraint__ArgsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3742:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3743:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3743:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3744:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getArgsSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getArgsSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ArgsAssignment_7_2"


    // $ANTLR start "rule__Constraint__MsgAssignment_8_2"
    // InternalVertigoDsl.g:3753:1: rule__Constraint__MsgAssignment_8_2 : ( RULE_STRING ) ;
    public final void rule__Constraint__MsgAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3757:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3758:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3758:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3759:3: RULE_STRING
            {
             before(grammarAccess.getConstraintAccess().getMsgSTRINGTerminalRuleCall_8_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getMsgSTRINGTerminalRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__MsgAssignment_8_2"


    // $ANTLR start "rule__FileInfo__NameAssignment_2"
    // InternalVertigoDsl.g:3768:1: rule__FileInfo__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FileInfo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3772:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3773:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3773:2: ( RULE_ID )
            // InternalVertigoDsl.g:3774:3: RULE_ID
            {
             before(grammarAccess.getFileInfoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__NameAssignment_2"


    // $ANTLR start "rule__FileInfo__StoreNameAssignment_6"
    // InternalVertigoDsl.g:3783:1: rule__FileInfo__StoreNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__FileInfo__StoreNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3787:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3788:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3788:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3789:3: RULE_STRING
            {
             before(grammarAccess.getFileInfoAccess().getStoreNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileInfoAccess().getStoreNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileInfo__StoreNameAssignment_6"


    // $ANTLR start "rule__Formatter__NameAssignment_2"
    // InternalVertigoDsl.g:3798:1: rule__Formatter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Formatter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3802:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3803:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3803:2: ( RULE_ID )
            // InternalVertigoDsl.g:3804:3: RULE_ID
            {
             before(grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__NameAssignment_2"


    // $ANTLR start "rule__Formatter__ClassNameAssignment_6"
    // InternalVertigoDsl.g:3813:1: rule__Formatter__ClassNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Formatter__ClassNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3817:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3818:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3818:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3819:3: RULE_STRING
            {
             before(grammarAccess.getFormatterAccess().getClassNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getClassNameSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__ClassNameAssignment_6"


    // $ANTLR start "rule__Formatter__ArgsAssignment_7_2"
    // InternalVertigoDsl.g:3828:1: rule__Formatter__ArgsAssignment_7_2 : ( RULE_STRING ) ;
    public final void rule__Formatter__ArgsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3832:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3833:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3833:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3834:3: RULE_STRING
            {
             before(grammarAccess.getFormatterAccess().getArgsSTRINGTerminalRuleCall_7_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormatterAccess().getArgsSTRINGTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formatter__ArgsAssignment_7_2"


    // $ANTLR start "rule__Domain__NameAssignment_0_2"
    // InternalVertigoDsl.g:3843:1: rule__Domain__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3847:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3848:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:3848:2: ( RULE_ID )
            // InternalVertigoDsl.g:3849:3: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__NameAssignment_0_2"


    // $ANTLR start "rule__Domain__DataTypeAssignment_0_6"
    // InternalVertigoDsl.g:3858:1: rule__Domain__DataTypeAssignment_0_6 : ( ruleDataType ) ;
    public final void rule__Domain__DataTypeAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3862:1: ( ( ruleDataType ) )
            // InternalVertigoDsl.g:3863:2: ( ruleDataType )
            {
            // InternalVertigoDsl.g:3863:2: ( ruleDataType )
            // InternalVertigoDsl.g:3864:3: ruleDataType
            {
             before(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__DataTypeAssignment_0_6"


    // $ANTLR start "rule__Domain__FormatterAssignment_1_2"
    // InternalVertigoDsl.g:3873:1: rule__Domain__FormatterAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Domain__FormatterAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3877:1: ( ( ( RULE_ID ) ) )
            // InternalVertigoDsl.g:3878:2: ( ( RULE_ID ) )
            {
            // InternalVertigoDsl.g:3878:2: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3879:3: ( RULE_ID )
            {
             before(grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_1_2_0()); 
            // InternalVertigoDsl.g:3880:3: ( RULE_ID )
            // InternalVertigoDsl.g:3881:4: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getFormatterFormatterIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getFormatterFormatterIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__FormatterAssignment_1_2"


    // $ANTLR start "rule__Domain__StoreTypeAssignment_2_2"
    // InternalVertigoDsl.g:3892:1: rule__Domain__StoreTypeAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__Domain__StoreTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3896:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3897:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3897:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3898:3: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__StoreTypeAssignment_2_2"


    // $ANTLR start "rule__Domain__IndexTypeAssignment_3_2"
    // InternalVertigoDsl.g:3907:1: rule__Domain__IndexTypeAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__Domain__IndexTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3911:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3912:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3912:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3913:3: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__IndexTypeAssignment_3_2"


    // $ANTLR start "rule__Domain__ConstraintsAssignment_4_3"
    // InternalVertigoDsl.g:3922:1: rule__Domain__ConstraintsAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__Domain__ConstraintsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3926:1: ( ( ( RULE_ID ) ) )
            // InternalVertigoDsl.g:3927:2: ( ( RULE_ID ) )
            {
            // InternalVertigoDsl.g:3927:2: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3928:3: ( RULE_ID )
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_3_0()); 
            // InternalVertigoDsl.g:3929:3: ( RULE_ID )
            // InternalVertigoDsl.g:3930:4: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getConstraintsConstraintIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ConstraintsAssignment_4_3"


    // $ANTLR start "rule__Domain__ConstraintsAssignment_4_4_1"
    // InternalVertigoDsl.g:3941:1: rule__Domain__ConstraintsAssignment_4_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Domain__ConstraintsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3945:1: ( ( ( RULE_ID ) ) )
            // InternalVertigoDsl.g:3946:2: ( ( RULE_ID ) )
            {
            // InternalVertigoDsl.g:3946:2: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:3947:3: ( RULE_ID )
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_4_1_0()); 
            // InternalVertigoDsl.g:3948:3: ( RULE_ID )
            // InternalVertigoDsl.g:3949:4: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getConstraintsConstraintIDTerminalRuleCall_4_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getConstraintsConstraintIDTerminalRuleCall_4_4_1_0_1()); 

            }

             after(grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ConstraintsAssignment_4_4_1"


    // $ANTLR start "rule__Domain__MultipleAssignment_5_2"
    // InternalVertigoDsl.g:3960:1: rule__Domain__MultipleAssignment_5_2 : ( ruleBooleanString ) ;
    public final void rule__Domain__MultipleAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3964:1: ( ( ruleBooleanString ) )
            // InternalVertigoDsl.g:3965:2: ( ruleBooleanString )
            {
            // InternalVertigoDsl.g:3965:2: ( ruleBooleanString )
            // InternalVertigoDsl.g:3966:3: ruleBooleanString
            {
             before(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanString();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__MultipleAssignment_5_2"


    // $ANTLR start "rule__Domain__UnitAssignment_6_2"
    // InternalVertigoDsl.g:3975:1: rule__Domain__UnitAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__Domain__UnitAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3979:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:3980:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:3980:2: ( RULE_STRING )
            // InternalVertigoDsl.g:3981:3: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UnitAssignment_6_2"


    // $ANTLR start "rule__FieldDescriptionString__FieldDescriptionStringAssignment_0"
    // InternalVertigoDsl.g:3990:1: rule__FieldDescriptionString__FieldDescriptionStringAssignment_0 : ( ( '{' ) ) ;
    public final void rule__FieldDescriptionString__FieldDescriptionStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:3994:1: ( ( ( '{' ) ) )
            // InternalVertigoDsl.g:3995:2: ( ( '{' ) )
            {
            // InternalVertigoDsl.g:3995:2: ( ( '{' ) )
            // InternalVertigoDsl.g:3996:3: ( '{' )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0()); 
            // InternalVertigoDsl.g:3997:3: ( '{' )
            // InternalVertigoDsl.g:3998:4: '{'
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0()); 

            }

             after(grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__FieldDescriptionStringAssignment_0"


    // $ANTLR start "rule__FieldDescriptionString__DomainAssignment_1_0_0_1"
    // InternalVertigoDsl.g:4009:1: rule__FieldDescriptionString__DomainAssignment_1_0_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FieldDescriptionString__DomainAssignment_1_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4013:1: ( ( ( RULE_ID ) ) )
            // InternalVertigoDsl.g:4014:2: ( ( RULE_ID ) )
            {
            // InternalVertigoDsl.g:4014:2: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:4015:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDomainDomainCrossReference_1_0_0_1_0()); 
            // InternalVertigoDsl.g:4016:3: ( RULE_ID )
            // InternalVertigoDsl.g:4017:4: RULE_ID
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDomainDomainIDTerminalRuleCall_1_0_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getDomainDomainIDTerminalRuleCall_1_0_0_1_0_1()); 

            }

             after(grammarAccess.getFieldDescriptionStringAccess().getDomainDomainCrossReference_1_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__DomainAssignment_1_0_0_1"


    // $ANTLR start "rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1"
    // InternalVertigoDsl.g:4028:1: rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4032:1: ( ( ( RULE_ID ) ) )
            // InternalVertigoDsl.g:4033:2: ( ( RULE_ID ) )
            {
            // InternalVertigoDsl.g:4033:2: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:4034:3: ( RULE_ID )
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainDeclaredDomainCrossReference_1_0_1_0()); 
            // InternalVertigoDsl.g:4035:3: ( RULE_ID )
            // InternalVertigoDsl.g:4036:4: RULE_ID
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainDeclaredDomainIDTerminalRuleCall_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainDeclaredDomainIDTerminalRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainDeclaredDomainCrossReference_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__DeclaredDomainAssignment_1_0_1"


    // $ANTLR start "rule__FieldDescriptionString__LabelAssignment_1_1_1"
    // InternalVertigoDsl.g:4047:1: rule__FieldDescriptionString__LabelAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__FieldDescriptionString__LabelAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4051:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:4052:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:4052:2: ( RULE_STRING )
            // InternalVertigoDsl.g:4053:3: RULE_STRING
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFieldDescriptionStringAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__LabelAssignment_1_1_1"


    // $ANTLR start "rule__FieldDescriptionString__RequiredAssignment_1_2_1"
    // InternalVertigoDsl.g:4062:1: rule__FieldDescriptionString__RequiredAssignment_1_2_1 : ( ruleBooleanString ) ;
    public final void rule__FieldDescriptionString__RequiredAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4066:1: ( ( ruleBooleanString ) )
            // InternalVertigoDsl.g:4067:2: ( ruleBooleanString )
            {
            // InternalVertigoDsl.g:4067:2: ( ruleBooleanString )
            // InternalVertigoDsl.g:4068:3: ruleBooleanString
            {
             before(grammarAccess.getFieldDescriptionStringAccess().getRequiredBooleanStringEnumRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanString();

            state._fsp--;

             after(grammarAccess.getFieldDescriptionStringAccess().getRequiredBooleanStringEnumRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldDescriptionString__RequiredAssignment_1_2_1"


    // $ANTLR start "rule__DtDefinition__NameAssignment_0_2"
    // InternalVertigoDsl.g:4077:1: rule__DtDefinition__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__DtDefinition__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4081:1: ( ( RULE_ID ) )
            // InternalVertigoDsl.g:4082:2: ( RULE_ID )
            {
            // InternalVertigoDsl.g:4082:2: ( RULE_ID )
            // InternalVertigoDsl.g:4083:3: RULE_ID
            {
             before(grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__NameAssignment_0_2"


    // $ANTLR start "rule__DtDefinition__StereoTypeAssignment_0_4_2"
    // InternalVertigoDsl.g:4092:1: rule__DtDefinition__StereoTypeAssignment_0_4_2 : ( RULE_STRING ) ;
    public final void rule__DtDefinition__StereoTypeAssignment_0_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4096:1: ( ( RULE_STRING ) )
            // InternalVertigoDsl.g:4097:2: ( RULE_STRING )
            {
            // InternalVertigoDsl.g:4097:2: ( RULE_STRING )
            // InternalVertigoDsl.g:4098:3: RULE_STRING
            {
             before(grammarAccess.getDtDefinitionAccess().getStereoTypeSTRINGTerminalRuleCall_0_4_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDtDefinitionAccess().getStereoTypeSTRINGTerminalRuleCall_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__StereoTypeAssignment_0_4_2"


    // $ANTLR start "rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2"
    // InternalVertigoDsl.g:4107:1: rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2 : ( ruleFieldDescriptionString ) ;
    public final void rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4111:1: ( ( ruleFieldDescriptionString ) )
            // InternalVertigoDsl.g:4112:2: ( ruleFieldDescriptionString )
            {
            // InternalVertigoDsl.g:4112:2: ( ruleFieldDescriptionString )
            // InternalVertigoDsl.g:4113:3: ruleFieldDescriptionString
            {
             before(grammarAccess.getDtDefinitionAccess().getIdFieldDescriptionStringFieldDescriptionStringParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDescriptionString();

            state._fsp--;

             after(grammarAccess.getDtDefinitionAccess().getIdFieldDescriptionStringFieldDescriptionStringParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__IdFieldDescriptionStringAssignment_1_2"


    // $ANTLR start "rule__DtDefinition__FieldDescriptionStringAssignment_2_2"
    // InternalVertigoDsl.g:4122:1: rule__DtDefinition__FieldDescriptionStringAssignment_2_2 : ( ruleFieldDescriptionString ) ;
    public final void rule__DtDefinition__FieldDescriptionStringAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVertigoDsl.g:4126:1: ( ( ruleFieldDescriptionString ) )
            // InternalVertigoDsl.g:4127:2: ( ruleFieldDescriptionString )
            {
            // InternalVertigoDsl.g:4127:2: ( ruleFieldDescriptionString )
            // InternalVertigoDsl.g:4128:3: ruleFieldDescriptionString
            {
             before(grammarAccess.getDtDefinitionAccess().getFieldDescriptionStringFieldDescriptionStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldDescriptionString();

            state._fsp--;

             after(grammarAccess.getDtDefinitionAccess().getFieldDescriptionStringFieldDescriptionStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DtDefinition__FieldDescriptionStringAssignment_2_2"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String dfa_1s = "\53\uffff";
    static final String dfa_2s = "\1\11\52\uffff";
    static final String dfa_3s = "\1\32\1\33\6\40\1\0\1\uffff\2\4\2\5\1\54\1\24\1\5\1\uffff\1\36\3\0\1\4\3\0\1\47\1\55\1\40\1\4\1\0\1\13\1\4\1\55\11\0";
    static final String dfa_4s = "\1\67\1\64\6\40\1\0\1\uffff\2\4\2\5\1\54\1\25\1\5\1\uffff\1\36\3\0\1\4\3\0\1\47\1\56\1\40\1\56\1\0\1\23\2\56\11\0";
    static final String dfa_5s = "\11\uffff\1\2\7\uffff\1\1\31\uffff";
    static final String dfa_6s = "\10\uffff\1\6\12\uffff\1\16\1\0\1\1\1\uffff\1\17\1\7\1\10\4\uffff\1\20\3\uffff\1\11\1\2\1\12\1\3\1\13\1\4\1\14\1\5\1\15}>";
    static final String[] dfa_7s = {
            "\1\11\1\uffff\1\1\4\uffff\1\10\6\uffff\1\2\1\3\1\4\1\5\3\uffff\1\6\1\7\5\uffff\2\11",
            "\1\12\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\uffff",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\34",
            "\1\36\1\35",
            "\1\37",
            "\1\41\51\uffff\1\40",
            "\1\uffff",
            "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52",
            "\1\41\51\uffff\1\40",
            "\1\36\1\35",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3311:2: ( rule__Domain__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_20 = input.LA(1);

                         
                        int index16_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_21 = input.LA(1);

                         
                        int index16_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_35 = input.LA(1);

                         
                        int index16_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_37 = input.LA(1);

                         
                        int index16_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_37);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_39 = input.LA(1);

                         
                        int index16_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_39);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_41 = input.LA(1);

                         
                        int index16_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_24 = input.LA(1);

                         
                        int index16_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_25 = input.LA(1);

                         
                        int index16_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA16_34 = input.LA(1);

                         
                        int index16_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_34);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA16_36 = input.LA(1);

                         
                        int index16_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_36);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA16_38 = input.LA(1);

                         
                        int index16_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_38);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA16_40 = input.LA(1);

                         
                        int index16_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_40);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA16_42 = input.LA(1);

                         
                        int index16_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_42);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA16_19 = input.LA(1);

                         
                        int index16_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_19);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA16_23 = input.LA(1);

                         
                        int index16_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_23);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA16_30 = input.LA(1);

                         
                        int index16_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index16_30);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\10\uffff\1\15\12\uffff\1\6\1\0\1\1\1\uffff\1\16\1\7\1\20\4\uffff\1\17\3\uffff\1\10\1\2\1\11\1\3\1\12\1\4\1\13\1\5\1\14}>";
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_8;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3323:2: ( rule__Domain__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_20 = input.LA(1);

                         
                        int index17_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_21 = input.LA(1);

                         
                        int index17_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_35 = input.LA(1);

                         
                        int index17_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_35);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_37 = input.LA(1);

                         
                        int index17_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_37);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_39 = input.LA(1);

                         
                        int index17_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_39);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_41 = input.LA(1);

                         
                        int index17_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_41);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_19 = input.LA(1);

                         
                        int index17_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_19);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_24 = input.LA(1);

                         
                        int index17_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_34 = input.LA(1);

                         
                        int index17_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_34);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_36 = input.LA(1);

                         
                        int index17_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_36);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_38 = input.LA(1);

                         
                        int index17_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_38);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_40 = input.LA(1);

                         
                        int index17_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_40);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_42 = input.LA(1);

                         
                        int index17_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_42);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_23 = input.LA(1);

                         
                        int index17_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_23);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_30 = input.LA(1);

                         
                        int index17_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_30);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA17_25 = input.LA(1);

                         
                        int index17_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index17_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_9s = "\10\uffff\1\0\12\uffff\1\17\1\11\1\12\1\uffff\1\20\1\6\1\10\4\uffff\1\7\3\uffff\1\1\1\13\1\2\1\14\1\3\1\15\1\4\1\16\1\5}>";
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_9;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3335:2: ( rule__Domain__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_8 = input.LA(1);

                         
                        int index18_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_34 = input.LA(1);

                         
                        int index18_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_34);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_36 = input.LA(1);

                         
                        int index18_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_36);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_38 = input.LA(1);

                         
                        int index18_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_38);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_40 = input.LA(1);

                         
                        int index18_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_42 = input.LA(1);

                         
                        int index18_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_42);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_24 = input.LA(1);

                         
                        int index18_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_24);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_30 = input.LA(1);

                         
                        int index18_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_25 = input.LA(1);

                         
                        int index18_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_20 = input.LA(1);

                         
                        int index18_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_21 = input.LA(1);

                         
                        int index18_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_35 = input.LA(1);

                         
                        int index18_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_35);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA18_37 = input.LA(1);

                         
                        int index18_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_37);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA18_39 = input.LA(1);

                         
                        int index18_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_39);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA18_41 = input.LA(1);

                         
                        int index18_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA18_19 = input.LA(1);

                         
                        int index18_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA18_23 = input.LA(1);

                         
                        int index18_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index18_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_10s = "\10\uffff\1\12\12\uffff\1\10\1\2\1\3\1\uffff\1\11\1\20\1\1\4\uffff\1\0\3\uffff\1\13\1\4\1\14\1\5\1\15\1\6\1\16\1\7\1\17}>";
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_10;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3347:2: ( rule__Domain__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_30 = input.LA(1);

                         
                        int index19_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_30);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_25 = input.LA(1);

                         
                        int index19_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_20 = input.LA(1);

                         
                        int index19_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_21 = input.LA(1);

                         
                        int index19_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_35 = input.LA(1);

                         
                        int index19_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_35);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_37 = input.LA(1);

                         
                        int index19_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_37);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_39 = input.LA(1);

                         
                        int index19_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_39);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_41 = input.LA(1);

                         
                        int index19_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_41);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_19 = input.LA(1);

                         
                        int index19_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_23 = input.LA(1);

                         
                        int index19_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_23);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA19_8 = input.LA(1);

                         
                        int index19_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA19_34 = input.LA(1);

                         
                        int index19_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_34);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA19_36 = input.LA(1);

                         
                        int index19_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_36);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA19_38 = input.LA(1);

                         
                        int index19_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_38);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA19_40 = input.LA(1);

                         
                        int index19_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_40);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA19_42 = input.LA(1);

                         
                        int index19_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_42);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA19_24 = input.LA(1);

                         
                        int index19_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index19_24);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_11s = "\10\uffff\1\5\12\uffff\1\17\1\12\1\11\1\uffff\1\6\1\20\1\10\4\uffff\1\7\3\uffff\1\0\1\13\1\1\1\14\1\2\1\15\1\3\1\16\1\4}>";
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_11;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3359:2: ( rule__Domain__UnorderedGroup__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_34 = input.LA(1);

                         
                        int index20_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_34);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_36 = input.LA(1);

                         
                        int index20_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_36);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_38 = input.LA(1);

                         
                        int index20_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_38);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_40 = input.LA(1);

                         
                        int index20_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_40);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_42 = input.LA(1);

                         
                        int index20_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_42);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_23 = input.LA(1);

                         
                        int index20_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_30 = input.LA(1);

                         
                        int index20_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_25 = input.LA(1);

                         
                        int index20_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_21 = input.LA(1);

                         
                        int index20_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_20 = input.LA(1);

                         
                        int index20_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_20);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_35 = input.LA(1);

                         
                        int index20_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_35);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_37 = input.LA(1);

                         
                        int index20_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_37);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_39 = input.LA(1);

                         
                        int index20_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_39);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_41 = input.LA(1);

                         
                        int index20_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_41);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA20_19 = input.LA(1);

                         
                        int index20_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_19);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA20_24 = input.LA(1);

                         
                        int index20_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index20_24);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_12s = "\10\uffff\1\6\12\uffff\1\10\1\16\1\17\1\uffff\1\7\1\20\1\0\4\uffff\1\11\3\uffff\1\1\1\12\1\2\1\13\1\3\1\14\1\4\1\15\1\5}>";
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_12;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3371:2: ( rule__Domain__UnorderedGroup__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_25 = input.LA(1);

                         
                        int index21_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_34 = input.LA(1);

                         
                        int index21_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_34);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_36 = input.LA(1);

                         
                        int index21_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_36);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA21_38 = input.LA(1);

                         
                        int index21_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_38);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA21_40 = input.LA(1);

                         
                        int index21_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA21_42 = input.LA(1);

                         
                        int index21_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_42);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA21_8 = input.LA(1);

                         
                        int index21_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA21_23 = input.LA(1);

                         
                        int index21_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA21_19 = input.LA(1);

                         
                        int index21_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_19);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA21_30 = input.LA(1);

                         
                        int index21_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_30);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA21_35 = input.LA(1);

                         
                        int index21_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_35);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA21_37 = input.LA(1);

                         
                        int index21_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_37);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA21_39 = input.LA(1);

                         
                        int index21_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA21_41 = input.LA(1);

                         
                        int index21_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_41);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA21_20 = input.LA(1);

                         
                        int index21_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_20);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA21_21 = input.LA(1);

                         
                        int index21_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_21);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA21_24 = input.LA(1);

                         
                        int index21_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index21_24);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\10\uffff\1\0\12\uffff\1\12\1\10\1\11\1\uffff\1\13\1\1\1\2\4\uffff\1\14\3\uffff\1\3\1\15\1\4\1\16\1\5\1\17\1\6\1\20\1\7}>";
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_13;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3383:2: ( rule__Domain__UnorderedGroup__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_8 = input.LA(1);

                         
                        int index22_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_24 = input.LA(1);

                         
                        int index22_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_25 = input.LA(1);

                         
                        int index22_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_25);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_34 = input.LA(1);

                         
                        int index22_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_34);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_36 = input.LA(1);

                         
                        int index22_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_36);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_38 = input.LA(1);

                         
                        int index22_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_38);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_40 = input.LA(1);

                         
                        int index22_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_40);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA22_42 = input.LA(1);

                         
                        int index22_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_42);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA22_20 = input.LA(1);

                         
                        int index22_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA22_21 = input.LA(1);

                         
                        int index22_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA22_19 = input.LA(1);

                         
                        int index22_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_19);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA22_23 = input.LA(1);

                         
                        int index22_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA22_30 = input.LA(1);

                         
                        int index22_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_30);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA22_35 = input.LA(1);

                         
                        int index22_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_35);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA22_37 = input.LA(1);

                         
                        int index22_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_37);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA22_39 = input.LA(1);

                         
                        int index22_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_39);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA22_41 = input.LA(1);

                         
                        int index22_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 9;}

                         
                        input.seek(index22_41);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\100\uffff";
    static final String dfa_15s = "\1\5\77\uffff";
    static final String dfa_16s = "\1\32\1\33\2\4\1\0\1\uffff\1\4\2\36\1\uffff\1\36\2\4\1\0\2\4\1\5\1\24\1\0\2\4\1\5\1\24\1\0\3\4\1\5\1\24\6\4\1\5\1\24\5\4\1\41\1\5\1\24\5\4\1\41\1\5\1\24\3\4\10\41";
    static final String dfa_17s = "\1\67\1\64\2\4\1\0\1\uffff\1\4\2\36\1\uffff\1\36\2\63\1\0\1\4\1\63\1\5\1\25\1\0\1\4\1\63\1\5\1\25\1\0\1\63\1\4\1\63\1\5\1\25\4\63\1\4\1\63\1\5\1\25\4\63\1\4\1\41\1\5\1\25\4\63\1\4\1\41\1\5\1\25\3\63\10\41";
    static final String dfa_18s = "\5\uffff\1\2\3\uffff\1\1\66\uffff";
    static final String dfa_19s = "\4\uffff\1\3\10\uffff\1\1\4\uffff\1\0\4\uffff\1\2\50\uffff}>";
    static final String[] dfa_20s = {
            "\1\5\1\uffff\1\1\4\uffff\1\4\6\uffff\4\5\3\uffff\2\5\5\uffff\1\2\1\3",
            "\1\5\1\uffff\1\5\6\uffff\1\5\1\uffff\1\5\15\uffff\1\6",
            "\1\7",
            "\1\10",
            "\1\uffff",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15",
            "\1\17\34\uffff\1\22\17\uffff\1\16\1\20\1\21",
            "\1\24\34\uffff\1\27\17\uffff\1\23\1\25\1\26",
            "\1\uffff",
            "\1\30",
            "\1\32\34\uffff\1\22\17\uffff\1\31\1\33\1\34",
            "\1\35",
            "\1\36\1\37",
            "\1\uffff",
            "\1\40",
            "\1\42\34\uffff\1\27\17\uffff\1\41\1\43\1\44",
            "\1\45",
            "\1\46\1\47",
            "\1\uffff",
            "\1\32\34\uffff\1\22\17\uffff\1\31\1\33\1\34",
            "\1\50",
            "\1\52\34\uffff\1\22\17\uffff\1\51\1\53\1\54",
            "\1\55",
            "\1\56\1\57",
            "\1\32\34\uffff\1\22\17\uffff\1\31\1\33\1\34",
            "\1\32\34\uffff\1\22\17\uffff\1\31\1\33\1\34",
            "\1\32\34\uffff\1\22\17\uffff\1\31\1\33\1\34",
            "\1\42\34\uffff\1\27\17\uffff\1\41\1\43\1\44",
            "\1\60",
            "\1\62\34\uffff\1\27\17\uffff\1\61\1\63\1\64",
            "\1\65",
            "\1\66\1\67",
            "\1\42\34\uffff\1\27\17\uffff\1\41\1\43\1\44",
            "\1\42\34\uffff\1\27\17\uffff\1\41\1\43\1\44",
            "\1\42\34\uffff\1\27\17\uffff\1\41\1\43\1\44",
            "\1\52\34\uffff\1\22\17\uffff\1\51\1\53\1\54",
            "\1\70",
            "\1\22",
            "\1\71",
            "\1\72\1\73",
            "\1\52\34\uffff\1\22\17\uffff\1\51\1\53\1\54",
            "\1\52\34\uffff\1\22\17\uffff\1\51\1\53\1\54",
            "\1\52\34\uffff\1\22\17\uffff\1\51\1\53\1\54",
            "\1\62\34\uffff\1\27\17\uffff\1\61\1\63\1\64",
            "\1\74",
            "\1\27",
            "\1\75",
            "\1\76\1\77",
            "\1\62\34\uffff\1\27\17\uffff\1\61\1\63\1\64",
            "\1\62\34\uffff\1\27\17\uffff\1\61\1\63\1\64",
            "\1\62\34\uffff\1\27\17\uffff\1\61\1\63\1\64",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\27"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3606:2: ( rule__DtDefinition__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_18 = input.LA(1);

                         
                        int index28_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index28_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_13 = input.LA(1);

                         
                        int index28_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index28_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_23 = input.LA(1);

                         
                        int index28_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index28_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_21s = "\4\uffff\1\2\10\uffff\1\3\4\uffff\1\0\4\uffff\1\1\50\uffff}>";
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_21;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3618:2: ( rule__DtDefinition__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_18 = input.LA(1);

                         
                        int index29_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_23 = input.LA(1);

                         
                        int index29_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_23);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_13 = input.LA(1);

                         
                        int index29_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index29_13);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\4\uffff\1\0\10\uffff\1\3\4\uffff\1\1\4\uffff\1\2\50\uffff}>";
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_22;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "3630:2: ( rule__DtDefinition__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_18 = input.LA(1);

                         
                        int index30_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_23 = input.LA(1);

                         
                        int index30_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 5;}

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00C18F0216000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00C18F0214000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000E000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00018F0210000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000E000000000012L});

}
