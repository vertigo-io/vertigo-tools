package io.vertigo.dsl.parser.antlr.internal;

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
import io.vertigo.dsl.services.VertigoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVertigoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'alter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'label'", "'required'", "'persistent'", "'expression'", "'id'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'type'", "'inOut'", "'attribute'", "'Task'", "'request'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"in\"'", "'\"out\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_ESCAPED_CHAR=6;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

        public InternalVertigoDslParser(TokenStream input, VertigoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected VertigoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalVertigoDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalVertigoDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalVertigoDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalVertigoDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageString_1_0= rulePackageString ) ) ( (lv_elements_2_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_packageString_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:78:2: ( (otherlv_0= 'package' ( (lv_packageString_1_0= rulePackageString ) ) ( (lv_elements_2_0= ruleElement ) )* ) )
            // InternalVertigoDsl.g:79:2: (otherlv_0= 'package' ( (lv_packageString_1_0= rulePackageString ) ) ( (lv_elements_2_0= ruleElement ) )* )
            {
            // InternalVertigoDsl.g:79:2: (otherlv_0= 'package' ( (lv_packageString_1_0= rulePackageString ) ) ( (lv_elements_2_0= ruleElement ) )* )
            // InternalVertigoDsl.g:80:3: otherlv_0= 'package' ( (lv_packageString_1_0= rulePackageString ) ) ( (lv_elements_2_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalVertigoDsl.g:84:3: ( (lv_packageString_1_0= rulePackageString ) )
            // InternalVertigoDsl.g:85:4: (lv_packageString_1_0= rulePackageString )
            {
            // InternalVertigoDsl.g:85:4: (lv_packageString_1_0= rulePackageString )
            // InternalVertigoDsl.g:86:5: lv_packageString_1_0= rulePackageString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPackageStringPackageStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_packageString_1_0=rulePackageString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"packageString",
            						lv_packageString_1_0,
            						"io.vertigo.dsl.VertigoDsl.PackageString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:103:3: ( (lv_elements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18||LA1_0==25||LA1_0==29||(LA1_0>=32 && LA1_0<=34)||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVertigoDsl.g:104:4: (lv_elements_2_0= ruleElement )
            	    {
            	    // InternalVertigoDsl.g:104:4: (lv_elements_2_0= ruleElement )
            	    // InternalVertigoDsl.g:105:5: lv_elements_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"io.vertigo.dsl.VertigoDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageString"
    // InternalVertigoDsl.g:126:1: entryRulePackageString returns [EObject current=null] : iv_rulePackageString= rulePackageString EOF ;
    public final EObject entryRulePackageString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageString = null;


        try {
            // InternalVertigoDsl.g:126:54: (iv_rulePackageString= rulePackageString EOF )
            // InternalVertigoDsl.g:127:2: iv_rulePackageString= rulePackageString EOF
            {
             newCompositeNode(grammarAccess.getPackageStringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageString=rulePackageString();

            state._fsp--;

             current =iv_rulePackageString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackageString"


    // $ANTLR start "rulePackageString"
    // InternalVertigoDsl.g:133:1: rulePackageString returns [EObject current=null] : ( ( (lv_package_0_0= ruleKEYWORDID ) ) ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )* ) ;
    public final EObject rulePackageString() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_package_0_0 = null;

        EObject lv_packages_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:139:2: ( ( ( (lv_package_0_0= ruleKEYWORDID ) ) ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )* ) )
            // InternalVertigoDsl.g:140:2: ( ( (lv_package_0_0= ruleKEYWORDID ) ) ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )* )
            {
            // InternalVertigoDsl.g:140:2: ( ( (lv_package_0_0= ruleKEYWORDID ) ) ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )* )
            // InternalVertigoDsl.g:141:3: ( (lv_package_0_0= ruleKEYWORDID ) ) ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )*
            {
            // InternalVertigoDsl.g:141:3: ( (lv_package_0_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:142:4: (lv_package_0_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:142:4: (lv_package_0_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:143:5: lv_package_0_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getPackageStringAccess().getPackageKEYWORDIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_package_0_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageStringRule());
            					}
            					add(
            						current,
            						"package",
            						lv_package_0_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:160:3: ( (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVertigoDsl.g:161:4: (otherlv_1= '.' )+ ( (lv_packages_2_0= ruleKEYWORDID ) )
            	    {
            	    // InternalVertigoDsl.g:161:4: (otherlv_1= '.' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==13) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:162:5: otherlv_1= '.'
            	    	    {
            	    	    otherlv_1=(Token)match(input,13,FOLLOW_6); 

            	    	    					newLeafNode(otherlv_1, grammarAccess.getPackageStringAccess().getFullStopKeyword_1_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalVertigoDsl.g:167:4: ( (lv_packages_2_0= ruleKEYWORDID ) )
            	    // InternalVertigoDsl.g:168:5: (lv_packages_2_0= ruleKEYWORDID )
            	    {
            	    // InternalVertigoDsl.g:168:5: (lv_packages_2_0= ruleKEYWORDID )
            	    // InternalVertigoDsl.g:169:6: lv_packages_2_0= ruleKEYWORDID
            	    {

            	    						newCompositeNode(grammarAccess.getPackageStringAccess().getPackagesKEYWORDIDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_packages_2_0=ruleKEYWORDID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPackageStringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"packages",
            	    							lv_packages_2_0,
            	    							"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "rulePackageString"


    // $ANTLR start "entryRuleKEYWORDID"
    // InternalVertigoDsl.g:191:1: entryRuleKEYWORDID returns [EObject current=null] : iv_ruleKEYWORDID= ruleKEYWORDID EOF ;
    public final EObject entryRuleKEYWORDID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKEYWORDID = null;


        try {
            // InternalVertigoDsl.g:191:50: (iv_ruleKEYWORDID= ruleKEYWORDID EOF )
            // InternalVertigoDsl.g:192:2: iv_ruleKEYWORDID= ruleKEYWORDID EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORDID=ruleKEYWORDID();

            state._fsp--;

             current =iv_ruleKEYWORDID; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKEYWORDID"


    // $ANTLR start "ruleKEYWORDID"
    // InternalVertigoDsl.g:198:1: ruleKEYWORDID returns [EObject current=null] : ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) ) ) ;
    public final EObject ruleKEYWORDID() throws RecognitionException {
        EObject current = null;

        Token lv_keywordID_0_1=null;
        Token lv_keywordID_0_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:204:2: ( ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) ) ) )
            // InternalVertigoDsl.g:205:2: ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) ) )
            {
            // InternalVertigoDsl.g:205:2: ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) ) )
            // InternalVertigoDsl.g:206:3: ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) )
            {
            // InternalVertigoDsl.g:206:3: ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' ) )
            // InternalVertigoDsl.g:207:4: (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' )
            {
            // InternalVertigoDsl.g:207:4: (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVertigoDsl.g:208:5: lv_keywordID_0_1= RULE_ID
                    {
                    lv_keywordID_0_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_keywordID_0_1, grammarAccess.getKEYWORDIDAccess().getKeywordIDIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKEYWORDIDRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"keywordID",
                    						lv_keywordID_0_1,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:223:5: lv_keywordID_0_2= 'domain'
                    {
                    lv_keywordID_0_2=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_keywordID_0_2, grammarAccess.getKEYWORDIDAccess().getKeywordIDDomainKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKEYWORDIDRule());
                    					}
                    					setWithLastConsumed(current, "keywordID", lv_keywordID_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleKEYWORDID"


    // $ANTLR start "entryRuleElement"
    // InternalVertigoDsl.g:239:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalVertigoDsl.g:239:48: (iv_ruleElement= ruleElement EOF )
            // InternalVertigoDsl.g:240:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalVertigoDsl.g:246:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Formatter_1 = null;

        EObject this_Domain_2 = null;

        EObject this_FileInfo_3 = null;

        EObject this_DeclaredDomain_4 = null;

        EObject this_DtDefinition_5 = null;

        EObject this_DeclaredDtDefinition_6 = null;

        EObject this_Association_7 = null;

        EObject this_TaskDefinition_8 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:252:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition ) )
            // InternalVertigoDsl.g:253:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )
            {
            // InternalVertigoDsl.g:253:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )
            int alt5=9;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:254:3: this_Constraint_0= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_0=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:263:3: this_Formatter_1= ruleFormatter
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFormatterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Formatter_1=ruleFormatter();

                    state._fsp--;


                    			current = this_Formatter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:272:3: this_Domain_2= ruleDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDomainParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Domain_2=ruleDomain();

                    state._fsp--;


                    			current = this_Domain_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:281:3: this_FileInfo_3= ruleFileInfo
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFileInfoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileInfo_3=ruleFileInfo();

                    state._fsp--;


                    			current = this_FileInfo_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:290:3: this_DeclaredDomain_4= ruleDeclaredDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDomainParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDomain_4=ruleDeclaredDomain();

                    state._fsp--;


                    			current = this_DeclaredDomain_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:299:3: this_DtDefinition_5= ruleDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtDefinition_5=ruleDtDefinition();

                    state._fsp--;


                    			current = this_DtDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:308:3: this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDtDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDtDefinition_6=ruleDeclaredDtDefinition();

                    state._fsp--;


                    			current = this_DeclaredDtDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:317:3: this_Association_7= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAssociationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_7=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:326:3: this_TaskDefinition_8= ruleTaskDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTaskDefinitionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskDefinition_8=ruleTaskDefinition();

                    state._fsp--;


                    			current = this_TaskDefinition_8;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDeclaredDomain"
    // InternalVertigoDsl.g:338:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:338:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:339:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
            {
             newCompositeNode(grammarAccess.getDeclaredDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredDomain=ruleDeclaredDomain();

            state._fsp--;

             current =iv_ruleDeclaredDomain; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaredDomain"


    // $ANTLR start "ruleDeclaredDomain"
    // InternalVertigoDsl.g:345:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:351:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:352:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:352:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:353:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:361:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:362:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:362:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:363:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclaredDomainAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDeclaredDomain"


    // $ANTLR start "entryRuleDeclaredDtDefinition"
    // InternalVertigoDsl.g:383:1: entryRuleDeclaredDtDefinition returns [EObject current=null] : iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF ;
    public final EObject entryRuleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDtDefinition = null;


        try {
            // InternalVertigoDsl.g:383:61: (iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF )
            // InternalVertigoDsl.g:384:2: iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF
            {
             newCompositeNode(grammarAccess.getDeclaredDtDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredDtDefinition=ruleDeclaredDtDefinition();

            state._fsp--;

             current =iv_ruleDeclaredDtDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaredDtDefinition"


    // $ANTLR start "ruleDeclaredDtDefinition"
    // InternalVertigoDsl.g:390:1: ruleDeclaredDtDefinition returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:396:2: ( (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:397:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:397:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:398:3: otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDtDefinitionAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:406:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:407:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:407:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:408:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclaredDtDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaredDtDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDeclaredDtDefinition"


    // $ANTLR start "entryRuleConstraint"
    // InternalVertigoDsl.g:428:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:428:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:429:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalVertigoDsl.g:435:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_className_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_args_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_msg_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:441:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:442:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:442:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:443:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:451:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:452:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:452:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:453:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:481:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:482:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:482:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:483:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_className_6_0, grammarAccess.getConstraintAccess().getClassNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_6_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:499:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:500:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:508:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:509:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:509:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:510:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_args_9_0, grammarAccess.getConstraintAccess().getArgsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"args",
                    							lv_args_9_0,
                    							"io.vertigo.dsl.VertigoDsl.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:527:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:528:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:536:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:537:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:537:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:538:6: lv_msg_12_0= RULE_STRING
                    {
                    lv_msg_12_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_msg_12_0, grammarAccess.getConstraintAccess().getMsgSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msg",
                    							lv_msg_12_0,
                    							"io.vertigo.dsl.VertigoDsl.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleFileInfo"
    // InternalVertigoDsl.g:563:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:563:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:564:2: iv_ruleFileInfo= ruleFileInfo EOF
            {
             newCompositeNode(grammarAccess.getFileInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileInfo=ruleFileInfo();

            state._fsp--;

             current =iv_ruleFileInfo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileInfo"


    // $ANTLR start "ruleFileInfo"
    // InternalVertigoDsl.g:570:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleFileInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_storeName_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:576:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:577:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:577:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:578:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:586:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:587:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:587:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:588:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFileInfoAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFileInfoAccess().getStoreNameKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFileInfoAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:616:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:617:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:617:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:618:5: lv_storeName_6_0= RULE_STRING
            {
            lv_storeName_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_storeName_6_0, grammarAccess.getFileInfoAccess().getStoreNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"storeName",
            						lv_storeName_6_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFileInfoAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleFileInfo"


    // $ANTLR start "entryRuleFormatter"
    // InternalVertigoDsl.g:642:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:642:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:643:2: iv_ruleFormatter= ruleFormatter EOF
            {
             newCompositeNode(grammarAccess.getFormatterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormatter=ruleFormatter();

            state._fsp--;

             current =iv_ruleFormatter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormatter"


    // $ANTLR start "ruleFormatter"
    // InternalVertigoDsl.g:649:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleFormatter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_className_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_args_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:655:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:656:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:656:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:657:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:665:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:666:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:666:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:667:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFormatterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFormatterAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFormatterAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:695:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:696:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:696:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:697:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_className_6_0, grammarAccess.getFormatterAccess().getClassNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_6_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:713:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVertigoDsl.g:714:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:722:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:723:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:723:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:724:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_args_9_0, grammarAccess.getFormatterAccess().getArgsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormatterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"args",
                    							lv_args_9_0,
                    							"io.vertigo.dsl.VertigoDsl.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFormatterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFormatter"


    // $ANTLR start "entryRuleDomain"
    // InternalVertigoDsl.g:749:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:749:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:750:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // InternalVertigoDsl.g:756:1: ruleDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_storeType_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_indexType_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_unit_31_0=null;
        Token otherlv_32=null;
        Enumerator lv_dataType_8_0 = null;

        Enumerator lv_multiple_28_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:762:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:763:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:763:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:764:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:764:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:765:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:768:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:769:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:769:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalVertigoDsl.g:770:3: ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:770:3: ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:771:4: {...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:771:100: ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:772:5: ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:775:8: ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:775:9: {...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:775:18: ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:775:19: (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:775:19: (otherlv_1= 'create' | otherlv_2= 'alter' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==18) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==29) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalVertigoDsl.g:776:9: otherlv_1= 'create'
            	            {
            	            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	            									newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getCreateKeyword_0_0_0());
            	            								

            	            }
            	            break;
            	        case 2 :
            	            // InternalVertigoDsl.g:781:9: otherlv_2= 'alter'
            	            {
            	            otherlv_2=(Token)match(input,29,FOLLOW_7); 

            	            									newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getAlterKeyword_0_0_1());
            	            								

            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,16,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:790:8: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:791:9: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:791:9: (lv_name_4_0= RULE_ID )
            	    // InternalVertigoDsl.g:792:10: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    										newLeafNode(lv_name_4_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_4_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,20,FOLLOW_22); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    otherlv_6=(Token)match(input,30,FOLLOW_13); 

            	    								newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getDataTypeKeyword_0_4());
            	    							
            	    otherlv_7=(Token)match(input,22,FOLLOW_23); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getColonKeyword_0_5());
            	    							
            	    // InternalVertigoDsl.g:820:8: ( (lv_dataType_8_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:821:9: (lv_dataType_8_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:821:9: (lv_dataType_8_0= ruleDataType )
            	    // InternalVertigoDsl.g:822:10: lv_dataType_8_0= ruleDataType
            	    {

            	    										newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_24);
            	    lv_dataType_8_0=ruleDataType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDomainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataType",
            	    											lv_dataType_8_0,
            	    											"io.vertigo.dsl.VertigoDsl.DataType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,31,FOLLOW_13); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getFormatterKeyword_0_7());
            	    							
            	    otherlv_10=(Token)match(input,22,FOLLOW_8); 

            	    								newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getColonKeyword_0_8());
            	    							
            	    // InternalVertigoDsl.g:847:8: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:848:9: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:848:9: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:849:10: otherlv_11= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    									
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    										newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_0_9_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:866:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:866:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) )
            	    // InternalVertigoDsl.g:867:4: {...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:867:100: ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) )
            	    // InternalVertigoDsl.g:868:5: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:871:8: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) )
            	    // InternalVertigoDsl.g:871:9: {...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:871:18: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' )
            	    // InternalVertigoDsl.g:871:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}'
            	    {
            	    // InternalVertigoDsl.g:871:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            	    // InternalVertigoDsl.g:872:9: ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    {
            	    // InternalVertigoDsl.g:872:9: ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    // InternalVertigoDsl.g:873:10: ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* )
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    									
            	    // InternalVertigoDsl.g:876:10: ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* )
            	    // InternalVertigoDsl.g:877:11: ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )*
            	    {
            	    // InternalVertigoDsl.g:877:11: ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )*
            	    loop12:
            	    do {
            	        int alt12=6;
            	        int LA12_0 = input.LA(1);

            	        if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0) ) {
            	            alt12=1;
            	        }
            	        else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1) ) {
            	            alt12=2;
            	        }
            	        else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2) ) {
            	            alt12=3;
            	        }
            	        else if ( LA12_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3) ) {
            	            alt12=4;
            	        }
            	        else if ( LA12_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4) ) {
            	            alt12=5;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:878:9: ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:878:9: ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:879:10: {...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0)");
            	    	    }
            	    	    // InternalVertigoDsl.g:879:110: ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:880:11: ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0);
            	    	    										
            	    	    // InternalVertigoDsl.g:883:14: ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:883:15: {...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:883:24: (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:883:25: otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,32,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_13, grammarAccess.getDomainAccess().getStoreTypeKeyword_1_0_0_0());
            	    	    													
            	    	    otherlv_14=(Token)match(input,22,FOLLOW_14); 

            	    	    														newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getColonKeyword_1_0_0_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:891:14: ( (lv_storeType_15_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:892:15: (lv_storeType_15_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:892:15: (lv_storeType_15_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:893:16: lv_storeType_15_0= RULE_STRING
            	    	    {
            	    	    lv_storeType_15_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    	    																newLeafNode(lv_storeType_15_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_1_0_0_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"storeType",
            	    	    																	lv_storeType_15_0,
            	    	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	    	    															

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalVertigoDsl.g:915:9: ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:915:9: ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:916:10: {...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1)");
            	    	    }
            	    	    // InternalVertigoDsl.g:916:110: ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:917:11: ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1);
            	    	    										
            	    	    // InternalVertigoDsl.g:920:14: ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:920:15: {...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:920:24: (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:920:25: otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,33,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_16, grammarAccess.getDomainAccess().getIndexTypeKeyword_1_0_1_0());
            	    	    													
            	    	    otherlv_17=(Token)match(input,22,FOLLOW_14); 

            	    	    														newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getColonKeyword_1_0_1_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:928:14: ( (lv_indexType_18_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:929:15: (lv_indexType_18_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:929:15: (lv_indexType_18_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:930:16: lv_indexType_18_0= RULE_STRING
            	    	    {
            	    	    lv_indexType_18_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    	    																newLeafNode(lv_indexType_18_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_1_0_1_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"indexType",
            	    	    																	lv_indexType_18_0,
            	    	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	    	    															

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalVertigoDsl.g:952:9: ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:952:9: ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) )
            	    	    // InternalVertigoDsl.g:953:10: {...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2)");
            	    	    }
            	    	    // InternalVertigoDsl.g:953:110: ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) )
            	    	    // InternalVertigoDsl.g:954:11: ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2);
            	    	    										
            	    	    // InternalVertigoDsl.g:957:14: ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) )
            	    	    // InternalVertigoDsl.g:957:15: {...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:957:24: (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' )
            	    	    // InternalVertigoDsl.g:957:25: otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']'
            	    	    {
            	    	    otherlv_19=(Token)match(input,34,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getConstraintKeyword_1_0_2_0());
            	    	    													
            	    	    otherlv_20=(Token)match(input,22,FOLLOW_27); 

            	    	    														newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getColonKeyword_1_0_2_1());
            	    	    													
            	    	    otherlv_21=(Token)match(input,35,FOLLOW_8); 

            	    	    														newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_1_0_2_2());
            	    	    													
            	    	    // InternalVertigoDsl.g:969:14: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:970:15: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:970:15: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:971:16: otherlv_22= RULE_ID
            	    	    {

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    															
            	    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    	    																newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_1_0_2_3_0());
            	    	    															

            	    	    }


            	    	    }

            	    	    // InternalVertigoDsl.g:982:14: ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )*
            	    	    loop11:
            	    	    do {
            	    	        int alt11=2;
            	    	        int LA11_0 = input.LA(1);

            	    	        if ( (LA11_0==36) ) {
            	    	            alt11=1;
            	    	        }


            	    	        switch (alt11) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:983:15: (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) )
            	    	    	    {
            	    	    	    // InternalVertigoDsl.g:983:15: (otherlv_23= ',' )+
            	    	    	    int cnt10=0;
            	    	    	    loop10:
            	    	    	    do {
            	    	    	        int alt10=2;
            	    	    	        int LA10_0 = input.LA(1);

            	    	    	        if ( (LA10_0==36) ) {
            	    	    	            alt10=1;
            	    	    	        }


            	    	    	        switch (alt10) {
            	    	    	    	case 1 :
            	    	    	    	    // InternalVertigoDsl.g:984:16: otherlv_23= ','
            	    	    	    	    {
            	    	    	    	    otherlv_23=(Token)match(input,36,FOLLOW_29); 

            	    	    	    	    																newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getCommaKeyword_1_0_2_4_0());
            	    	    	    	    															

            	    	    	    	    }
            	    	    	    	    break;

            	    	    	    	default :
            	    	    	    	    if ( cnt10 >= 1 ) break loop10;
            	    	    	                EarlyExitException eee =
            	    	    	                    new EarlyExitException(10, input);
            	    	    	                throw eee;
            	    	    	        }
            	    	    	        cnt10++;
            	    	    	    } while (true);

            	    	    	    // InternalVertigoDsl.g:989:15: ( (otherlv_24= RULE_ID ) )
            	    	    	    // InternalVertigoDsl.g:990:16: (otherlv_24= RULE_ID )
            	    	    	    {
            	    	    	    // InternalVertigoDsl.g:990:16: (otherlv_24= RULE_ID )
            	    	    	    // InternalVertigoDsl.g:991:17: otherlv_24= RULE_ID
            	    	    	    {

            	    	    	    																	if (current==null) {
            	    	    	    																		current = createModelElement(grammarAccess.getDomainRule());
            	    	    	    																	}
            	    	    	    																
            	    	    	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    	    	    																	newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_1_0_2_4_1_0());
            	    	    	    																

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop11;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_25=(Token)match(input,37,FOLLOW_26); 

            	    	    														newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_1_0_2_5());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalVertigoDsl.g:1013:9: ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:1013:9: ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:1014:10: {...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3)");
            	    	    }
            	    	    // InternalVertigoDsl.g:1014:110: ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) )
            	    	    // InternalVertigoDsl.g:1015:11: ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3);
            	    	    										
            	    	    // InternalVertigoDsl.g:1018:14: ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) )
            	    	    // InternalVertigoDsl.g:1018:15: {...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:1018:24: (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) )
            	    	    // InternalVertigoDsl.g:1018:25: otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,38,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_26, grammarAccess.getDomainAccess().getMultipleKeyword_1_0_3_0());
            	    	    													
            	    	    otherlv_27=(Token)match(input,22,FOLLOW_30); 

            	    	    														newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getColonKeyword_1_0_3_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:1026:14: ( (lv_multiple_28_0= ruleBooleanString ) )
            	    	    // InternalVertigoDsl.g:1027:15: (lv_multiple_28_0= ruleBooleanString )
            	    	    {
            	    	    // InternalVertigoDsl.g:1027:15: (lv_multiple_28_0= ruleBooleanString )
            	    	    // InternalVertigoDsl.g:1028:16: lv_multiple_28_0= ruleBooleanString
            	    	    {

            	    	    																newCompositeNode(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_1_0_3_2_0());
            	    	    															
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_multiple_28_0=ruleBooleanString();

            	    	    state._fsp--;


            	    	    																if (current==null) {
            	    	    																	current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																set(
            	    	    																	current,
            	    	    																	"multiple",
            	    	    																	lv_multiple_28_0,
            	    	    																	"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    	    																afterParserOrEnumRuleCall();
            	    	    															

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalVertigoDsl.g:1051:9: ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:1051:9: ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:1052:10: {...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4)");
            	    	    }
            	    	    // InternalVertigoDsl.g:1052:110: ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:1053:11: ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4);
            	    	    										
            	    	    // InternalVertigoDsl.g:1056:14: ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:1056:15: {...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:1056:24: (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:1056:25: otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,39,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_29, grammarAccess.getDomainAccess().getUnitKeyword_1_0_4_0());
            	    	    													
            	    	    otherlv_30=(Token)match(input,22,FOLLOW_14); 

            	    	    														newLeafNode(otherlv_30, grammarAccess.getDomainAccess().getColonKeyword_1_0_4_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:1064:14: ( (lv_unit_31_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:1065:15: (lv_unit_31_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:1065:15: (lv_unit_31_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:1066:16: lv_unit_31_0= RULE_STRING
            	    	    {
            	    	    lv_unit_31_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    	    																newLeafNode(lv_unit_31_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_1_0_4_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"unit",
            	    	    																	lv_unit_31_0,
            	    	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	    	    															

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    									

            	    }

            	    otherlv_32=(Token)match(input,25,FOLLOW_25); 

            	    								newLeafNode(otherlv_32, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_1_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleRefToDomainType"
    // InternalVertigoDsl.g:1116:1: entryRuleRefToDomainType returns [EObject current=null] : iv_ruleRefToDomainType= ruleRefToDomainType EOF ;
    public final EObject entryRuleRefToDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToDomainType = null;


        try {
            // InternalVertigoDsl.g:1116:56: (iv_ruleRefToDomainType= ruleRefToDomainType EOF )
            // InternalVertigoDsl.g:1117:2: iv_ruleRefToDomainType= ruleRefToDomainType EOF
            {
             newCompositeNode(grammarAccess.getRefToDomainTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefToDomainType=ruleRefToDomainType();

            state._fsp--;

             current =iv_ruleRefToDomainType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRefToDomainType"


    // $ANTLR start "ruleRefToDomainType"
    // InternalVertigoDsl.g:1123:1: ruleRefToDomainType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefToDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1129:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:1130:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:1130:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVertigoDsl.g:1131:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVertigoDsl.g:1131:3: ()
            // InternalVertigoDsl.g:1132:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefToDomainTypeAccess().getRefToDomainTypeAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:1138:3: ( (otherlv_1= RULE_ID ) )
            // InternalVertigoDsl.g:1139:4: (otherlv_1= RULE_ID )
            {
            // InternalVertigoDsl.g:1139:4: (otherlv_1= RULE_ID )
            // InternalVertigoDsl.g:1140:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefToDomainTypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRefToDomainTypeAccess().getRefDomainTypeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleRefToDomainType"


    // $ANTLR start "entryRuleDtDefinitionIdString"
    // InternalVertigoDsl.g:1155:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1155:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1156:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionIdStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionIdString=ruleDtDefinitionIdString();

            state._fsp--;

             current =iv_ruleDtDefinitionIdString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionIdString"


    // $ANTLR start "ruleDtDefinitionIdString"
    // InternalVertigoDsl.g:1162:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_refToDomainType_4_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1168:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1169:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1169:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1170:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1174:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1175:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1175:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1176:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1179:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1180:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1180:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVertigoDsl.g:1181:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1181:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1182:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1182:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1183:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1186:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1186:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1186:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1186:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1194:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1195:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1195:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1196:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionIdStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
            	    lv_refToDomainType_4_0=ruleRefToDomainType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionIdStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"refToDomainType",
            	    												lv_refToDomainType_4_0,
            	    												"io.vertigo.dsl.VertigoDsl.RefToDomainType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1213:9: (otherlv_5= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==36) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1214:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_33); 

            	            										newLeafNode(otherlv_5, grammarAccess.getDtDefinitionIdStringAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1225:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1225:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1226:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1226:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1227:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1230:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1230:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1230:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1230:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1238:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1239:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1239:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1240:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            	    											newLeafNode(lv_label_8_0, grammarAccess.getDtDefinitionIdStringAccess().getLabelSTRINGTerminalRuleCall_1_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionIdStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"label",
            	    												lv_label_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1256:9: (otherlv_9= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==36) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1257:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_33); 

            	            										newLeafNode(otherlv_9, grammarAccess.getDtDefinitionIdStringAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDtDefinitionIdStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDtDefinitionIdString"


    // $ANTLR start "entryRuleDtDefinitionDataFieldString"
    // InternalVertigoDsl.g:1284:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1284:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1285:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionDataFieldString=ruleDtDefinitionDataFieldString();

            state._fsp--;

             current =iv_ruleDtDefinitionDataFieldString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionDataFieldString"


    // $ANTLR start "ruleDtDefinitionDataFieldString"
    // InternalVertigoDsl.g:1291:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
    public final EObject ruleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_refToDomainType_4_0 = null;

        Enumerator lv_required_12_0 = null;

        Enumerator lv_persistent_16_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1297:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1298:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1298:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1299:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1303:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1304:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1304:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1305:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1308:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1309:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1309:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=5;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt21=4;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVertigoDsl.g:1310:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1310:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1311:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1311:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1312:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1315:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1315:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1315:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1315:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1323:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1324:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1324:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1325:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_refToDomainType_4_0=ruleRefToDomainType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"refToDomainType",
            	    												lv_refToDomainType_4_0,
            	    												"io.vertigo.dsl.VertigoDsl.RefToDomainType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1342:9: (otherlv_5= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==36) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1343:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_36); 

            	            										newLeafNode(otherlv_5, grammarAccess.getDtDefinitionDataFieldStringAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1354:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1354:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1355:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1355:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1356:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1359:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1359:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1359:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1359:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1367:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1368:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1368:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1369:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            	    											newLeafNode(lv_label_8_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelSTRINGTerminalRuleCall_1_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"label",
            	    												lv_label_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1385:9: (otherlv_9= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==36) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1386:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_36); 

            	            										newLeafNode(otherlv_9, grammarAccess.getDtDefinitionDataFieldStringAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1397:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1397:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1398:5: {...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1398:124: ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1399:6: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1402:9: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1402:10: {...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1402:19: (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1402:20: otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,41,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,22,FOLLOW_30); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1410:9: ( (lv_required_12_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1411:10: (lv_required_12_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1411:10: (lv_required_12_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1412:11: lv_required_12_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredBooleanStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_required_12_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"required",
            	    												lv_required_12_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1429:9: (otherlv_13= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==36) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1430:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,36,FOLLOW_36); 

            	            										newLeafNode(otherlv_13, grammarAccess.getDtDefinitionDataFieldStringAccess().getCommaKeyword_1_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:1441:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1441:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1442:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1442:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1443:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1446:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1446:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1446:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1446:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,22,FOLLOW_30); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1454:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1455:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1455:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1456:11: lv_persistent_16_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentBooleanStringEnumRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_persistent_16_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"persistent",
            	    												lv_persistent_16_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1473:9: (otherlv_17= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==36) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1474:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,36,FOLLOW_36); 

            	            										newLeafNode(otherlv_17, grammarAccess.getDtDefinitionDataFieldStringAccess().getCommaKeyword_1_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_18=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDtDefinitionDataFieldStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDtDefinitionDataFieldString"


    // $ANTLR start "entryRuleDtDefinitionComputedFieldString"
    // InternalVertigoDsl.g:1501:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1501:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1502:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionComputedFieldString=ruleDtDefinitionComputedFieldString();

            state._fsp--;

             current =iv_ruleDtDefinitionComputedFieldString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionComputedFieldString"


    // $ANTLR start "ruleDtDefinitionComputedFieldString"
    // InternalVertigoDsl.g:1508:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_expressionString_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_refToDomainType_4_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1514:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:1515:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:1515:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:1516:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1520:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1521:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1521:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1522:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1525:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1526:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1526:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVertigoDsl.g:1527:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1527:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1528:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1528:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1529:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1532:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1532:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1532:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1532:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1540:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1541:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1541:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1542:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
            	    lv_refToDomainType_4_0=ruleRefToDomainType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"refToDomainType",
            	    												lv_refToDomainType_4_0,
            	    												"io.vertigo.dsl.VertigoDsl.RefToDomainType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1559:9: (otherlv_5= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==36) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1560:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_39); 

            	            										newLeafNode(otherlv_5, grammarAccess.getDtDefinitionComputedFieldStringAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1571:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1571:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1572:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1572:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1573:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1576:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1576:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1576:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1576:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1584:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1585:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1585:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1586:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    											newLeafNode(lv_label_8_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelSTRINGTerminalRuleCall_1_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"label",
            	    												lv_label_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1602:9: (otherlv_9= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==36) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1603:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_39); 

            	            										newLeafNode(otherlv_9, grammarAccess.getDtDefinitionComputedFieldStringAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1614:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1614:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1615:5: {...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1615:128: ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1616:6: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1619:9: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1619:10: {...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1619:19: (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1619:20: otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,43,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1627:9: ( (lv_expressionString_12_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1628:10: (lv_expressionString_12_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1628:10: (lv_expressionString_12_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1629:11: lv_expressionString_12_0= RULE_STRING
            	    {
            	    lv_expressionString_12_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    											newLeafNode(lv_expressionString_12_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionStringSTRINGTerminalRuleCall_1_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"expressionString",
            	    												lv_expressionString_12_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1645:9: (otherlv_13= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==36) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1646:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,36,FOLLOW_39); 

            	            										newLeafNode(otherlv_13, grammarAccess.getDtDefinitionComputedFieldStringAccess().getCommaKeyword_1_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDtDefinitionComputedFieldStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleDtDefinitionComputedFieldString"


    // $ANTLR start "entryRuleDtDefinitionIdField"
    // InternalVertigoDsl.g:1673:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:1673:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:1674:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionIdFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionIdField=ruleDtDefinitionIdField();

            state._fsp--;

             current =iv_ruleDtDefinitionIdField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionIdField"


    // $ANTLR start "ruleDtDefinitionIdField"
    // InternalVertigoDsl.g:1680:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1686:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1687:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1687:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1688:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:1692:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1693:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1693:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1694:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtDefinitionIdFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionIdFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:1710:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:1711:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:1711:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:1712:5: lv_idString_2_0= ruleDtDefinitionIdString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdFieldAccess().getIdStringDtDefinitionIdStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_idString_2_0=ruleDtDefinitionIdString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionIdFieldRule());
            					}
            					set(
            						current,
            						"idString",
            						lv_idString_2_0,
            						"io.vertigo.dsl.VertigoDsl.DtDefinitionIdString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:1729:3: (otherlv_3= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVertigoDsl.g:1730:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionIdField"


    // $ANTLR start "entryRuleDtDefinitionDataField"
    // InternalVertigoDsl.g:1739:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:1739:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:1740:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionDataFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionDataField=ruleDtDefinitionDataField();

            state._fsp--;

             current =iv_ruleDtDefinitionDataField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionDataField"


    // $ANTLR start "ruleDtDefinitionDataField"
    // InternalVertigoDsl.g:1746:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1752:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1753:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1753:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1754:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:1758:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1759:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1759:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1760:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtDefinitionDataFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionDataFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:1776:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:1777:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:1777:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:1778:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionDataFieldAccess().getDataFieldStringDtDefinitionDataFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_dataFieldString_2_0=ruleDtDefinitionDataFieldString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldRule());
            					}
            					set(
            						current,
            						"dataFieldString",
            						lv_dataFieldString_2_0,
            						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataFieldString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:1795:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:1796:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionDataField"


    // $ANTLR start "entryRuleDtDefinitionComputedField"
    // InternalVertigoDsl.g:1805:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:1805:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:1806:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionComputedFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionComputedField=ruleDtDefinitionComputedField();

            state._fsp--;

             current =iv_ruleDtDefinitionComputedField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionComputedField"


    // $ANTLR start "ruleDtDefinitionComputedField"
    // InternalVertigoDsl.g:1812:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1818:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1819:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1819:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1820:3: otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:1824:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1825:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1825:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1826:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtDefinitionComputedFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionComputedFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:1842:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:1843:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:1843:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:1844:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionComputedFieldAccess().getComputedFieldStringDtDefinitionComputedFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_computedFieldString_2_0=ruleDtDefinitionComputedFieldString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionComputedFieldRule());
            					}
            					set(
            						current,
            						"computedFieldString",
            						lv_computedFieldString_2_0,
            						"io.vertigo.dsl.VertigoDsl.DtDefinitionComputedFieldString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:1861:3: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:1862:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionComputedField"


    // $ANTLR start "entryRuleDtDefinitionStereotype"
    // InternalVertigoDsl.g:1871:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:1871:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:1872:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionStereotypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionStereotype=ruleDtDefinitionStereotype();

            state._fsp--;

             current =iv_ruleDtDefinitionStereotype; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionStereotype"


    // $ANTLR start "ruleDtDefinitionStereotype"
    // InternalVertigoDsl.g:1878:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1884:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1885:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1885:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1886:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1894:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1895:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1895:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1896:5: lv_stereoType_2_0= RULE_STRING
            {
            lv_stereoType_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_stereoType_2_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereoTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionStereotypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stereoType",
            						lv_stereoType_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1912:3: (otherlv_3= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:1913:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionStereotypeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionStereotype"


    // $ANTLR start "entryRuleDtDefinitionDataSpace"
    // InternalVertigoDsl.g:1922:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:1922:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:1923:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionDataSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionDataSpace=ruleDtDefinitionDataSpace();

            state._fsp--;

             current =iv_ruleDtDefinitionDataSpace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionDataSpace"


    // $ANTLR start "ruleDtDefinitionDataSpace"
    // InternalVertigoDsl.g:1929:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1935:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1936:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1936:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1937:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1945:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1946:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1946:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1947:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_storeName_2_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionDataSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"storeName",
            						lv_storeName_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1963:3: (otherlv_3= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:1964:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataSpaceAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionDataSpace"


    // $ANTLR start "entryRuleDtDefinitionDisplayField"
    // InternalVertigoDsl.g:1973:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:1973:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:1974:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionDisplayFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionDisplayField=ruleDtDefinitionDisplayField();

            state._fsp--;

             current =iv_ruleDtDefinitionDisplayField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionDisplayField"


    // $ANTLR start "ruleDtDefinitionDisplayField"
    // InternalVertigoDsl.g:1980:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1986:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1987:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1987:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1988:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1996:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1997:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1997:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1998:5: lv_displayField_2_0= RULE_STRING
            {
            lv_displayField_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_displayField_2_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionDisplayFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"displayField",
            						lv_displayField_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:2014:3: (otherlv_3= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVertigoDsl.g:2015:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDisplayFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionDisplayField"


    // $ANTLR start "entryRuleDtDefinitionSortField"
    // InternalVertigoDsl.g:2024:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:2024:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:2025:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionSortFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionSortField=ruleDtDefinitionSortField();

            state._fsp--;

             current =iv_ruleDtDefinitionSortField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinitionSortField"


    // $ANTLR start "ruleDtDefinitionSortField"
    // InternalVertigoDsl.g:2031:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2037:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2038:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2038:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2039:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2047:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2048:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2048:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2049:5: lv_sortField_2_0= RULE_STRING
            {
            lv_sortField_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_sortField_2_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionSortFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sortField",
            						lv_sortField_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:2065:3: (otherlv_3= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVertigoDsl.g:2066:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionSortFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionSortField"


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:2075:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2075:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:2076:2: iv_ruleDtDefinition= ruleDtDefinition EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinition=ruleDtDefinition();

            state._fsp--;

             current =iv_ruleDtDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDtDefinition"


    // $ANTLR start "ruleDtDefinition"
    // InternalVertigoDsl.g:2082:1: ruleDtDefinition returns [EObject current=null] : ( () (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'DtDefinition' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_14=null;
        EObject lv_dtDefinitionStereotype_6_0 = null;

        EObject lv_dtDefinitionIdField_7_0 = null;

        EObject lv_dtDefinitionDataFields_8_0 = null;

        EObject lv_dtDefinitionComputedFields_9_0 = null;

        EObject lv_dtDefinitionDataSpace_11_0 = null;

        EObject lv_dtDefinitionSortField_12_0 = null;

        EObject lv_dtDefinitionDisplayField_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2088:2: ( ( () (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'DtDefinition' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2089:2: ( () (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'DtDefinition' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2089:2: ( () (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'DtDefinition' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2090:3: () (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'DtDefinition' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            // InternalVertigoDsl.g:2090:3: ()
            // InternalVertigoDsl.g:2091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDtDefinitionAccess().getDtDefinitionActionAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:2097:3: (otherlv_1= 'create' | otherlv_2= 'alter' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            else if ( (LA33_0==29) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalVertigoDsl.g:2098:4: otherlv_1= 'create'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getCreateKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:2103:4: otherlv_2= 'alter'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDtDefinitionAccess().getAlterKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_2());
            		
            // InternalVertigoDsl.g:2112:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalVertigoDsl.g:2113:4: (lv_name_4_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2113:4: (lv_name_4_0= RULE_ID )
            // InternalVertigoDsl.g:2114:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:2134:3: ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVertigoDsl.g:2135:4: (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2135:4: (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2136:5: lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_dtDefinitionStereotype_6_0=ruleDtDefinitionStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionStereotype",
                    						lv_dtDefinitionStereotype_6_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionStereotype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2153:3: ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVertigoDsl.g:2154:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2154:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2155:5: lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_dtDefinitionIdField_7_0=ruleDtDefinitionIdField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionIdField",
                    						lv_dtDefinitionIdField_7_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionIdField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2172:3: ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVertigoDsl.g:2173:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2173:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2174:5: lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_dtDefinitionDataFields_8_0=ruleDtDefinitionDataField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionDataFields",
            	    						lv_dtDefinitionDataFields_8_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalVertigoDsl.g:2191:3: ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVertigoDsl.g:2192:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2192:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2193:5: lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionComputedFields_9_0=ruleDtDefinitionComputedField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionComputedFields",
            	    						lv_dtDefinitionComputedFields_9_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionComputedField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalVertigoDsl.g:2210:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2211:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2211:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2212:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2215:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2216:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2216:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalVertigoDsl.g:2217:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2217:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2218:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2218:109: ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2219:6: ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2222:9: ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2222:10: {...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2222:19: ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2222:20: (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2222:20: (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2223:10: lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_45);
            	    lv_dtDefinitionDataSpace_11_0=ruleDtDefinitionDataSpace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDataSpace",
            	    											lv_dtDefinitionDataSpace_11_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionDataSpace");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2245:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2245:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2246:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2246:109: ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2247:6: ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2250:9: ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2250:10: {...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2250:19: ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2250:20: (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2250:20: (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2251:10: lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_45);
            	    lv_dtDefinitionSortField_12_0=ruleDtDefinitionSortField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionSortField",
            	    											lv_dtDefinitionSortField_12_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionSortField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2273:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2273:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2274:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2274:109: ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2275:6: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:2278:9: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2278:10: {...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2278:19: ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2278:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2278:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2279:10: lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_45);
            	    lv_dtDefinitionDisplayField_13_0=ruleDtDefinitionDisplayField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDisplayField",
            	    											lv_dtDefinitionDisplayField_13_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionDisplayField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleDtDefinition"


    // $ANTLR start "entryRuleAssociation"
    // InternalVertigoDsl.g:2316:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:2316:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:2317:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalVertigoDsl.g:2323:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_fkFieldName_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_labelA_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_labelB_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_roleA_43_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token lv_roleB_47_0=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token lv_type_51_0=null;
        Token otherlv_52=null;
        Enumerator lv_navigabilityA_19_0 = null;

        Enumerator lv_navigabilityB_23_0 = null;

        Enumerator lv_multiplicityA_27_0 = null;

        Enumerator lv_multiplicityB_31_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2329:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:2330:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:2330:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:2331:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:2339:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:2340:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2340:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:2341:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2361:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2362:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2362:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2363:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:2366:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2367:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2367:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=13;
                alt50 = dfa50.predict(input);
                switch (alt50) {
            	case 1 :
            	    // InternalVertigoDsl.g:2368:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2368:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2369:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2369:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2370:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:2373:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:2373:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2373:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:2373:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:2381:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2382:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2382:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2383:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            	    											newLeafNode(lv_fkFieldName_7_0, grammarAccess.getAssociationAccess().getFkFieldNameSTRINGTerminalRuleCall_4_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"fkFieldName",
            	    												lv_fkFieldName_7_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2399:9: (otherlv_8= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==36) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2400:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2411:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2411:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2412:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2412:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2413:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:2416:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:2416:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2416:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:2416:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:2424:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:2425:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2425:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:2426:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2437:9: (otherlv_12= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==36) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2438:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2449:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2449:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2450:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2450:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2451:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:2454:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:2454:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2454:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:2454:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:2462:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:2463:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2463:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:2464:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_48); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2475:9: (otherlv_16= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==36) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2476:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getCommaKeyword_4_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:2487:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2487:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2488:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2488:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2489:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:2492:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:2492:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2492:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:2492:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,22,FOLLOW_30); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:2500:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2501:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2501:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2502:11: lv_navigabilityA_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_48);
            	    lv_navigabilityA_19_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"navigabilityA",
            	    												lv_navigabilityA_19_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2519:9: (otherlv_20= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==36) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2520:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_20, grammarAccess.getAssociationAccess().getCommaKeyword_4_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:2531:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2531:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2532:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:2532:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2533:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:2536:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:2536:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2536:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:2536:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,55,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,22,FOLLOW_30); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:2544:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2545:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2545:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2546:11: lv_navigabilityB_23_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_48);
            	    lv_navigabilityB_23_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"navigabilityB",
            	    												lv_navigabilityB_23_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2563:9: (otherlv_24= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==36) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2564:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_24, grammarAccess.getAssociationAccess().getCommaKeyword_4_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVertigoDsl.g:2575:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2575:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2576:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:2576:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2577:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:2580:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:2580:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2580:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:2580:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,56,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,22,FOLLOW_50); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:2588:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2589:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2589:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2590:11: lv_multiplicityA_27_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_48);
            	    lv_multiplicityA_27_0=ruleMultiplicityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiplicityA",
            	    												lv_multiplicityA_27_0,
            	    												"io.vertigo.dsl.VertigoDsl.MultiplicityString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2607:9: (otherlv_28= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==36) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2608:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_28, grammarAccess.getAssociationAccess().getCommaKeyword_4_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalVertigoDsl.g:2619:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2619:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2620:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:2620:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2621:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:2624:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:2624:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2624:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:2624:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,22,FOLLOW_50); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:2632:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2633:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2633:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2634:11: lv_multiplicityB_31_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_48);
            	    lv_multiplicityB_31_0=ruleMultiplicityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiplicityB",
            	    												lv_multiplicityB_31_0,
            	    												"io.vertigo.dsl.VertigoDsl.MultiplicityString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2651:9: (otherlv_32= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==36) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2652:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_32, grammarAccess.getAssociationAccess().getCommaKeyword_4_6_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalVertigoDsl.g:2663:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2663:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2664:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:2664:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2665:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:2668:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:2668:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2668:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:2668:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,58,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:2676:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2677:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2677:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2678:11: lv_labelA_35_0= RULE_STRING
            	    {
            	    lv_labelA_35_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            	    											newLeafNode(lv_labelA_35_0, grammarAccess.getAssociationAccess().getLabelASTRINGTerminalRuleCall_4_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"labelA",
            	    												lv_labelA_35_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2694:9: (otherlv_36= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==36) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2695:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_36, grammarAccess.getAssociationAccess().getCommaKeyword_4_7_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalVertigoDsl.g:2706:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2706:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2707:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:2707:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2708:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:2711:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:2711:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2711:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:2711:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:2719:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2720:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2720:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2721:11: lv_labelB_39_0= RULE_STRING
            	    {
            	    lv_labelB_39_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            	    											newLeafNode(lv_labelB_39_0, grammarAccess.getAssociationAccess().getLabelBSTRINGTerminalRuleCall_4_8_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"labelB",
            	    												lv_labelB_39_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2737:9: (otherlv_40= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==36) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2738:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_40, grammarAccess.getAssociationAccess().getCommaKeyword_4_8_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalVertigoDsl.g:2749:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2749:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2750:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:2750:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2751:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:2754:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:2754:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2754:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:2754:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,60,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:2762:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2763:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2763:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2764:11: lv_roleA_43_0= RULE_STRING
            	    {
            	    lv_roleA_43_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            	    											newLeafNode(lv_roleA_43_0, grammarAccess.getAssociationAccess().getRoleASTRINGTerminalRuleCall_4_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"roleA",
            	    												lv_roleA_43_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2780:9: (otherlv_44= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==36) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2781:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_44, grammarAccess.getAssociationAccess().getCommaKeyword_4_9_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalVertigoDsl.g:2792:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2792:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2793:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:2793:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2794:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:2797:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:2797:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2797:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:2797:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,61,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:2805:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2806:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2806:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2807:11: lv_roleB_47_0= RULE_STRING
            	    {
            	    lv_roleB_47_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

            	    											newLeafNode(lv_roleB_47_0, grammarAccess.getAssociationAccess().getRoleBSTRINGTerminalRuleCall_4_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"roleB",
            	    												lv_roleB_47_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2823:9: (otherlv_48= ',' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==36) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2824:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,36,FOLLOW_49); 

            	            										newLeafNode(otherlv_48, grammarAccess.getAssociationAccess().getCommaKeyword_4_10_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalVertigoDsl.g:2835:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2835:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:2836:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:2836:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:2837:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:2840:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:2840:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2840:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:2840:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) )
            	    {
            	    otherlv_49=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,22,FOLLOW_14); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:2848:9: ( (lv_type_51_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2849:10: (lv_type_51_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2849:10: (lv_type_51_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2850:11: lv_type_51_0= RULE_STRING
            	    {
            	    lv_type_51_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

            	    											newLeafNode(lv_type_51_0, grammarAccess.getAssociationAccess().getTypeSTRINGTerminalRuleCall_4_11_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												lv_type_51_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				

            }

            otherlv_52=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_52, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleTaskAttributeString"
    // InternalVertigoDsl.g:2888:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:2888:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:2889:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
            {
             newCompositeNode(grammarAccess.getTaskAttributeStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskAttributeString=ruleTaskAttributeString();

            state._fsp--;

             current =iv_ruleTaskAttributeString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskAttributeString"


    // $ANTLR start "ruleTaskAttributeString"
    // InternalVertigoDsl.g:2895:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
    public final EObject ruleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_required_8_0 = null;

        Enumerator lv_inout_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2901:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2902:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2902:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2903:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:2907:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2908:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2908:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2909:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:2912:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2913:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2913:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=4;
                int LA54_0 = input.LA(1);

                if ( LA54_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt54=3;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalVertigoDsl.g:2914:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2914:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2915:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2915:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2916:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:2919:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:2919:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2919:19: (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:2919:20: otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,22,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:2927:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalVertigoDsl.g:2928:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2928:10: (otherlv_4= RULE_ID )
            	    // InternalVertigoDsl.g:2929:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_52); 

            	    											newLeafNode(otherlv_4, grammarAccess.getTaskAttributeStringAccess().getDomainDomainTypeCrossReference_1_0_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2940:9: (otherlv_5= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==36) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2941:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,36,FOLLOW_53); 

            	            										newLeafNode(otherlv_5, grammarAccess.getTaskAttributeStringAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2952:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2952:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2953:5: {...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2953:116: ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2954:6: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:2957:9: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:2957:10: {...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2957:19: (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:2957:20: otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getRequiredKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,22,FOLLOW_30); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:2965:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2966:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2966:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2967:11: lv_required_8_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRequiredBooleanStringEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_52);
            	    lv_required_8_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"required",
            	    												lv_required_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2984:9: (otherlv_9= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==36) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2985:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,36,FOLLOW_53); 

            	            										newLeafNode(otherlv_9, grammarAccess.getTaskAttributeStringAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2996:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2996:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2997:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2997:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2998:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:3001:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:3001:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3001:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:3001:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,22,FOLLOW_54); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:3009:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:3010:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:3010:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:3011:11: lv_inout_12_0= ruleInOutString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getInoutInOutStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_52);
            	    lv_inout_12_0=ruleInOutString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inout",
            	    												lv_inout_12_0,
            	    												"io.vertigo.dsl.VertigoDsl.InOutString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3028:9: (otherlv_13= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==36) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3029:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,36,FOLLOW_53); 

            	            										newLeafNode(otherlv_13, grammarAccess.getTaskAttributeStringAccess().getCommaKeyword_1_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskAttributeStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleTaskAttributeString"


    // $ANTLR start "entryRuleTaskAttribute"
    // InternalVertigoDsl.g:3056:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:3056:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:3057:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
            {
             newCompositeNode(grammarAccess.getTaskAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskAttribute=ruleTaskAttribute();

            state._fsp--;

             current =iv_ruleTaskAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskAttribute"


    // $ANTLR start "ruleTaskAttribute"
    // InternalVertigoDsl.g:3063:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3069:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3070:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3070:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3071:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:3075:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3076:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3076:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3077:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:3093:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3094:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3094:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3095:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
            {

            					newCompositeNode(grammarAccess.getTaskAttributeAccess().getTaskAttributeStringTaskAttributeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_taskAttributeString_2_0=ruleTaskAttributeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskAttributeRule());
            					}
            					set(
            						current,
            						"taskAttributeString",
            						lv_taskAttributeString_2_0,
            						"io.vertigo.dsl.VertigoDsl.TaskAttributeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3112:3: (otherlv_3= ',' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVertigoDsl.g:3113:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskAttributeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskAttribute"


    // $ANTLR start "entryRuleTaskDataSpace"
    // InternalVertigoDsl.g:3122:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3122:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3123:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
            {
             newCompositeNode(grammarAccess.getTaskDataSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDataSpace=ruleTaskDataSpace();

            state._fsp--;

             current =iv_ruleTaskDataSpace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskDataSpace"


    // $ANTLR start "ruleTaskDataSpace"
    // InternalVertigoDsl.g:3129:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3135:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) ) )
            // InternalVertigoDsl.g:3136:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) )
            {
            // InternalVertigoDsl.g:3136:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:3137:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3145:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3146:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3146:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3147:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_storeName_2_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDataSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"storeName",
            						lv_storeName_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

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
    // $ANTLR end "ruleTaskDataSpace"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalVertigoDsl.g:3167:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3167:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3168:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinition=ruleTaskDefinition();

            state._fsp--;

             current =iv_ruleTaskDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalVertigoDsl.g:3174:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_classname_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_request_10_0=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_taskAttributes_12_0 = null;

        EObject lv_taskDataSpace_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3180:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3181:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3181:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            // InternalVertigoDsl.g:3182:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3190:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3191:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3191:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3192:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskDefinitionAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:3220:3: ( (lv_classname_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3221:4: (lv_classname_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3221:4: (lv_classname_6_0= RULE_STRING )
            // InternalVertigoDsl.g:3222:5: lv_classname_6_0= RULE_STRING
            {
            lv_classname_6_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

            					newLeafNode(lv_classname_6_0, grammarAccess.getTaskDefinitionAccess().getClassnameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"classname",
            						lv_classname_6_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3238:3: (otherlv_7= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalVertigoDsl.g:3239:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_57); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRequestKeyword_8());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getColonKeyword_9());
            		
            // InternalVertigoDsl.g:3252:3: ( (lv_request_10_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3253:4: (lv_request_10_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3253:4: (lv_request_10_0= RULE_STRING )
            // InternalVertigoDsl.g:3254:5: lv_request_10_0= RULE_STRING
            {
            lv_request_10_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            					newLeafNode(lv_request_10_0, grammarAccess.getTaskDefinitionAccess().getRequestSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"request",
            						lv_request_10_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3270:3: (otherlv_11= ',' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalVertigoDsl.g:3271:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,36,FOLLOW_59); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalVertigoDsl.g:3276:3: ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==64) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalVertigoDsl.g:3277:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:3277:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:3278:5: lv_taskAttributes_12_0= ruleTaskAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskAttributeParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_59);
            	    lv_taskAttributes_12_0=ruleTaskAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taskAttributes",
            	    						lv_taskAttributes_12_0,
            	    						"io.vertigo.dsl.VertigoDsl.TaskAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalVertigoDsl.g:3295:3: ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==27) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVertigoDsl.g:3296:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:3296:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:3297:5: lv_taskDataSpace_13_0= ruleTaskDataSpace
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskDataSpaceTaskDataSpaceParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_taskDataSpace_13_0=ruleTaskDataSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"taskDataSpace",
                    						lv_taskDataSpace_13_0,
                    						"io.vertigo.dsl.VertigoDsl.TaskDataSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "ruleDataType"
    // InternalVertigoDsl.g:3322:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3328:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:3329:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:3329:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt60=9;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt60=1;
                }
                break;
            case 68:
                {
                alt60=2;
                }
                break;
            case 69:
                {
                alt60=3;
                }
                break;
            case 70:
                {
                alt60=4;
                }
                break;
            case 71:
                {
                alt60=5;
                }
                break;
            case 72:
                {
                alt60=6;
                }
                break;
            case 73:
                {
                alt60=7;
                }
                break;
            case 74:
                {
                alt60=8;
                }
                break;
            case 75:
                {
                alt60=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalVertigoDsl.g:3330:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:3330:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:3331:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3338:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:3338:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:3339:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:3346:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:3346:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:3347:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:3354:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:3354:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:3355:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:3362:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:3362:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:3363:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:3370:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:3370:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:3371:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:3378:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:3378:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:3379:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:3386:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:3386:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:3387:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:3394:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:3394:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:3395:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleBooleanString"
    // InternalVertigoDsl.g:3405:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3411:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:3412:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:3412:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==76) ) {
                alt61=1;
            }
            else if ( (LA61_0==77) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalVertigoDsl.g:3413:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:3413:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:3414:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3421:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:3421:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:3422:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanStringAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBooleanString"


    // $ANTLR start "ruleMultiplicityString"
    // InternalVertigoDsl.g:3432:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3438:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) )
            // InternalVertigoDsl.g:3439:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            {
            // InternalVertigoDsl.g:3439:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==78) ) {
                alt62=1;
            }
            else if ( (LA62_0==79) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalVertigoDsl.g:3440:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:3440:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:3441:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3448:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:3448:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:3449:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMultiplicityString"


    // $ANTLR start "ruleInOutString"
    // InternalVertigoDsl.g:3459:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3465:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:3466:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:3466:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==80) ) {
                alt63=1;
            }
            else if ( (LA63_0==81) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalVertigoDsl.g:3467:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:3467:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:3468:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3475:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:3475:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:3476:4: enumLiteral_1= '\"out\"'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_OUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInOutStringAccess().getINOUT_OUTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleInOutString"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\17\2\20\1\uffff\1\20\10\uffff";
    static final String dfa_3s = "\1\47\1\101\1\21\1\uffff\1\21\10\uffff";
    static final String dfa_4s = "\3\uffff\1\3\1\uffff\1\2\1\6\1\10\1\11\1\4\1\1\1\5\1\7";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\uffff\1\1\6\uffff\1\3\3\uffff\1\2\2\uffff\3\3\3\uffff\2\3",
            "\1\3\1\6\1\uffff\1\12\6\uffff\1\11\1\uffff\1\5\25\uffff\1\7\16\uffff\1\10",
            "\1\3\1\6",
            "",
            "\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "253:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\17\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\47\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\1\1\2\1\5\1\6\1\7\1\3\1\4\1\0\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\2\uffff\1\2\6\uffff\1\11\3\uffff\1\3\2\uffff\1\4\1\5\1\6\3\uffff\1\7\1\10",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 769:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\31\15\uffff";
    static final String dfa_16s = "\1\76\15\uffff";
    static final String dfa_17s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_18s = "\1\0\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\31\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 2367:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA50_0==25) ) {s = 1;}

                        else if ( LA50_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA50_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA50_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA50_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA50_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA50_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA50_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA50_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA50_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA50_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA50_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA50_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000C722048002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF8L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C722040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C702000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000011002004000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010002004000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000070000004000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000071002004000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000070002004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000090000004000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000091002004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000090002004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003F0000A000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000370000A000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000360000A000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000340000A000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000300000A000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7FF8000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7FF8001002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x7FF8000002000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000020000004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000021002004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000020002004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000000100A000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x000000000A000000L,0x0000000000000001L});

}
