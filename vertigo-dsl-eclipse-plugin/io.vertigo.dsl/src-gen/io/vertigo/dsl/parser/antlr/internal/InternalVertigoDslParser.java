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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'id'", "'label'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'alter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'required'", "'persistent'", "'expression'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'type'", "'inOut'", "'attribute'", "'Task'", "'request'", "'dtDefinition'", "'fieldName'", "'filter'", "'range'", "'FacetDefinition'", "'keyConcept'", "'domainCriteria'", "'listFilterBuilderClass'", "'listFilterBuilderQuery'", "'facets'", "'FacetedQueryDefinition'", "'dtIndex'", "'from'", "'indexCopyTo'", "'loaderId'", "'IndexDefinition'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"in\"'", "'\"out\"'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_ESCAPED_CHAR=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

                if ( (LA1_0==17||LA1_0==20||LA1_0==31) ) {
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
    // InternalVertigoDsl.g:198:1: ruleKEYWORDID returns [EObject current=null] : ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) ) ) ;
    public final EObject ruleKEYWORDID() throws RecognitionException {
        EObject current = null;

        Token lv_keywordID_0_1=null;
        Token lv_keywordID_0_2=null;
        Token lv_keywordID_0_3=null;
        Token lv_keywordID_0_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:204:2: ( ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) ) ) )
            // InternalVertigoDsl.g:205:2: ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) ) )
            {
            // InternalVertigoDsl.g:205:2: ( ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) ) )
            // InternalVertigoDsl.g:206:3: ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) )
            {
            // InternalVertigoDsl.g:206:3: ( (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' ) )
            // InternalVertigoDsl.g:207:4: (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' )
            {
            // InternalVertigoDsl.g:207:4: (lv_keywordID_0_1= RULE_ID | lv_keywordID_0_2= 'domain' | lv_keywordID_0_3= 'id' | lv_keywordID_0_4= 'label' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
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
                case 3 :
                    // InternalVertigoDsl.g:234:5: lv_keywordID_0_3= 'id'
                    {
                    lv_keywordID_0_3=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_keywordID_0_3, grammarAccess.getKEYWORDIDAccess().getKeywordIDIdKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKEYWORDIDRule());
                    					}
                    					setWithLastConsumed(current, "keywordID", lv_keywordID_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:245:5: lv_keywordID_0_4= 'label'
                    {
                    lv_keywordID_0_4=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_keywordID_0_4, grammarAccess.getKEYWORDIDAccess().getKeywordIDLabelKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getKEYWORDIDRule());
                    					}
                    					setWithLastConsumed(current, "keywordID", lv_keywordID_0_4, null);
                    				

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
    // InternalVertigoDsl.g:261:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalVertigoDsl.g:261:48: (iv_ruleElement= ruleElement EOF )
            // InternalVertigoDsl.g:262:2: iv_ruleElement= ruleElement EOF
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
    // InternalVertigoDsl.g:268:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition ) ;
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

        EObject this_FacetDefinition_9 = null;

        EObject this_IndexDefinition_10 = null;

        EObject this_FacetedQueryDefinition_11 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:274:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition ) )
            // InternalVertigoDsl.g:275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )
            {
            // InternalVertigoDsl.g:275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )
            int alt5=12;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:276:3: this_Constraint_0= ruleConstraint
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
                    // InternalVertigoDsl.g:285:3: this_Formatter_1= ruleFormatter
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
                    // InternalVertigoDsl.g:294:3: this_Domain_2= ruleDomain
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
                    // InternalVertigoDsl.g:303:3: this_FileInfo_3= ruleFileInfo
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
                    // InternalVertigoDsl.g:312:3: this_DeclaredDomain_4= ruleDeclaredDomain
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
                    // InternalVertigoDsl.g:321:3: this_DtDefinition_5= ruleDtDefinition
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
                    // InternalVertigoDsl.g:330:3: this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition
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
                    // InternalVertigoDsl.g:339:3: this_Association_7= ruleAssociation
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
                    // InternalVertigoDsl.g:348:3: this_TaskDefinition_8= ruleTaskDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTaskDefinitionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskDefinition_8=ruleTaskDefinition();

                    state._fsp--;


                    			current = this_TaskDefinition_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalVertigoDsl.g:357:3: this_FacetDefinition_9= ruleFacetDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFacetDefinitionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_FacetDefinition_9=ruleFacetDefinition();

                    state._fsp--;


                    			current = this_FacetDefinition_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalVertigoDsl.g:366:3: this_IndexDefinition_10= ruleIndexDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getIndexDefinitionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexDefinition_10=ruleIndexDefinition();

                    state._fsp--;


                    			current = this_IndexDefinition_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalVertigoDsl.g:375:3: this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFacetedQueryDefinitionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_FacetedQueryDefinition_11=ruleFacetedQueryDefinition();

                    state._fsp--;


                    			current = this_FacetedQueryDefinition_11;
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
    // InternalVertigoDsl.g:387:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:387:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:388:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
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
    // InternalVertigoDsl.g:394:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:400:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:401:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:401:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:402:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:410:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:411:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:411:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:412:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:432:1: entryRuleDeclaredDtDefinition returns [EObject current=null] : iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF ;
    public final EObject entryRuleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDtDefinition = null;


        try {
            // InternalVertigoDsl.g:432:61: (iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF )
            // InternalVertigoDsl.g:433:2: iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF
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
    // InternalVertigoDsl.g:439:1: ruleDeclaredDtDefinition returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:445:2: ( (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:446:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:446:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:447:3: otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDtDefinitionAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:455:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:456:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:456:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:457:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:477:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:477:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:478:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalVertigoDsl.g:484:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // InternalVertigoDsl.g:490:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:491:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:491:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:492:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:500:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:501:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:501:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:502:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:530:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:531:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:531:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:532:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:548:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:549:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:557:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:558:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:558:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:559:6: lv_args_9_0= RULE_STRING
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

            // InternalVertigoDsl.g:576:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:577:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:585:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:586:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:586:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:587:6: lv_msg_12_0= RULE_STRING
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

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:612:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:612:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:613:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:619:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:625:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:626:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:626:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:627:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:635:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:636:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:636:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:637:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFileInfoAccess().getStoreNameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFileInfoAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:665:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:666:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:666:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:667:5: lv_storeName_6_0= RULE_STRING
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

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:691:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:691:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:692:2: iv_ruleFormatter= ruleFormatter EOF
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
    // InternalVertigoDsl.g:698:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:704:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:705:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:705:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:706:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:714:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:715:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:715:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:716:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFormatterAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFormatterAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:744:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:745:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:745:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:746:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:762:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVertigoDsl.g:763:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:771:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:772:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:772:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:773:6: lv_args_9_0= RULE_STRING
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

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:798:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:798:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:799:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:805:1: ruleDomain returns [EObject current=null] : ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_storeType_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_indexType_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_unit_30_0=null;
        Token otherlv_31=null;
        Enumerator lv_dataType_7_0 = null;

        Enumerator lv_multiple_27_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:811:2: ( ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalVertigoDsl.g:812:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalVertigoDsl.g:812:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalVertigoDsl.g:813:3: (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
            {
            // InternalVertigoDsl.g:813:3: (otherlv_0= 'create' | otherlv_1= 'alter' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVertigoDsl.g:814:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getCreateKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:819:4: otherlv_1= 'alter'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getAlterKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:828:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:829:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:829:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:830:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getDataTypeKeyword_4());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:858:3: ( (lv_dataType_7_0= ruleDataType ) )
            // InternalVertigoDsl.g:859:4: (lv_dataType_7_0= ruleDataType )
            {
            // InternalVertigoDsl.g:859:4: (lv_dataType_7_0= ruleDataType )
            // InternalVertigoDsl.g:860:5: lv_dataType_7_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_dataType_7_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_7_0,
            						"io.vertigo.dsl.VertigoDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:877:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:878:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:878:4: ( ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:879:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				
            // InternalVertigoDsl.g:882:5: ( ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:883:6: ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:883:6: ( ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVertigoDsl.g:884:4: ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:884:4: ({...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:885:5: {...}? => ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalVertigoDsl.g:885:103: ( ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:886:6: ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalVertigoDsl.g:889:9: ({...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:889:10: {...}? => (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:889:19: (otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:889:20: otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getFormatterKeyword_7_0_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getColonKeyword_7_0_1());
            	    								
            	    // InternalVertigoDsl.g:897:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:898:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:898:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:899:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    											newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_7_0_2_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:916:4: ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:916:4: ({...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:917:5: {...}? => ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalVertigoDsl.g:917:103: ( ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:918:6: ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalVertigoDsl.g:921:9: ({...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:921:10: {...}? => (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:921:19: (otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:921:20: otherlv_12= 'storeType' otherlv_13= ':' ( (lv_storeType_14_0= RULE_STRING ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getStoreTypeKeyword_7_1_0());
            	    								
            	    otherlv_13=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_13, grammarAccess.getDomainAccess().getColonKeyword_7_1_1());
            	    								
            	    // InternalVertigoDsl.g:929:9: ( (lv_storeType_14_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:930:10: (lv_storeType_14_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:930:10: (lv_storeType_14_0= RULE_STRING )
            	    // InternalVertigoDsl.g:931:11: lv_storeType_14_0= RULE_STRING
            	    {
            	    lv_storeType_14_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_storeType_14_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_7_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"storeType",
            	    												lv_storeType_14_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:953:4: ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:953:4: ({...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:954:5: {...}? => ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalVertigoDsl.g:954:103: ( ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:955:6: ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalVertigoDsl.g:958:9: ({...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:958:10: {...}? => (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:958:19: (otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:958:20: otherlv_15= 'indexType' otherlv_16= ':' ( (lv_indexType_17_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,35,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getIndexTypeKeyword_7_2_0());
            	    								
            	    otherlv_16=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_16, grammarAccess.getDomainAccess().getColonKeyword_7_2_1());
            	    								
            	    // InternalVertigoDsl.g:966:9: ( (lv_indexType_17_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:967:10: (lv_indexType_17_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:967:10: (lv_indexType_17_0= RULE_STRING )
            	    // InternalVertigoDsl.g:968:11: lv_indexType_17_0= RULE_STRING
            	    {
            	    lv_indexType_17_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_indexType_17_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_7_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"indexType",
            	    												lv_indexType_17_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:990:4: ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:990:4: ({...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) ) )
            	    // InternalVertigoDsl.g:991:5: {...}? => ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalVertigoDsl.g:991:103: ( ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) ) )
            	    // InternalVertigoDsl.g:992:6: ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3);
            	    					
            	    // InternalVertigoDsl.g:995:9: ({...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' ) )
            	    // InternalVertigoDsl.g:995:10: {...}? => (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:995:19: (otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']' )
            	    // InternalVertigoDsl.g:995:20: otherlv_18= 'constraint' otherlv_19= ':' otherlv_20= '[' ( (otherlv_21= RULE_ID ) ) ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ']'
            	    {
            	    otherlv_18=(Token)match(input,36,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getConstraintKeyword_7_3_0());
            	    								
            	    otherlv_19=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getColonKeyword_7_3_1());
            	    								
            	    otherlv_20=(Token)match(input,37,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_7_3_2());
            	    								
            	    // InternalVertigoDsl.g:1007:9: ( (otherlv_21= RULE_ID ) )
            	    // InternalVertigoDsl.g:1008:10: (otherlv_21= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1008:10: (otherlv_21= RULE_ID )
            	    // InternalVertigoDsl.g:1009:11: otherlv_21= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    										
            	    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    											newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_7_3_3_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1020:9: ( (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==38) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:1021:10: (otherlv_22= ',' )+ ( (otherlv_23= RULE_ID ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:1021:10: (otherlv_22= ',' )+
            	    	    int cnt10=0;
            	    	    loop10:
            	    	    do {
            	    	        int alt10=2;
            	    	        int LA10_0 = input.LA(1);

            	    	        if ( (LA10_0==38) ) {
            	    	            alt10=1;
            	    	        }


            	    	        switch (alt10) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:1022:11: otherlv_22= ','
            	    	    	    {
            	    	    	    otherlv_22=(Token)match(input,38,FOLLOW_28); 

            	    	    	    											newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getCommaKeyword_7_3_4_0());
            	    	    	    										

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

            	    	    // InternalVertigoDsl.g:1027:10: ( (otherlv_23= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:1028:11: (otherlv_23= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:1028:11: (otherlv_23= RULE_ID )
            	    	    // InternalVertigoDsl.g:1029:12: otherlv_23= RULE_ID
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getDomainRule());
            	    	    												}
            	    	    											
            	    	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    	    												newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_7_3_4_1_0());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,39,FOLLOW_25); 

            	    									newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_7_3_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:1051:4: ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1051:4: ({...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1052:5: {...}? => ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // InternalVertigoDsl.g:1052:103: ( ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1053:6: ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4);
            	    					
            	    // InternalVertigoDsl.g:1056:9: ({...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1056:10: {...}? => (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1056:19: (otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1056:20: otherlv_25= 'multiple' otherlv_26= ':' ( (lv_multiple_27_0= ruleBooleanString ) )
            	    {
            	    otherlv_25=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getMultipleKeyword_7_4_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_26, grammarAccess.getDomainAccess().getColonKeyword_7_4_1());
            	    								
            	    // InternalVertigoDsl.g:1064:9: ( (lv_multiple_27_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1065:10: (lv_multiple_27_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1065:10: (lv_multiple_27_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1066:11: lv_multiple_27_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_7_4_2_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_multiple_27_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDomainRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiple",
            	    												lv_multiple_27_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVertigoDsl.g:1089:4: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1089:4: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1090:5: {...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // InternalVertigoDsl.g:1090:103: ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1091:6: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5);
            	    					
            	    // InternalVertigoDsl.g:1094:9: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1094:10: {...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1094:19: (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1094:20: otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) )
            	    {
            	    otherlv_28=(Token)match(input,41,FOLLOW_13); 

            	    									newLeafNode(otherlv_28, grammarAccess.getDomainAccess().getUnitKeyword_7_5_0());
            	    								
            	    otherlv_29=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_29, grammarAccess.getDomainAccess().getColonKeyword_7_5_1());
            	    								
            	    // InternalVertigoDsl.g:1102:9: ( (lv_unit_30_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1103:10: (lv_unit_30_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1103:10: (lv_unit_30_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1104:11: lv_unit_30_0= RULE_STRING
            	    {
            	    lv_unit_30_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_unit_30_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_7_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"unit",
            	    												lv_unit_30_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				

            }

            otherlv_31=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVertigoDsl.g:1142:1: entryRuleRefToDomainType returns [EObject current=null] : iv_ruleRefToDomainType= ruleRefToDomainType EOF ;
    public final EObject entryRuleRefToDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToDomainType = null;


        try {
            // InternalVertigoDsl.g:1142:56: (iv_ruleRefToDomainType= ruleRefToDomainType EOF )
            // InternalVertigoDsl.g:1143:2: iv_ruleRefToDomainType= ruleRefToDomainType EOF
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
    // InternalVertigoDsl.g:1149:1: ruleRefToDomainType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefToDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1155:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:1156:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:1156:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVertigoDsl.g:1157:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVertigoDsl.g:1157:3: ()
            // InternalVertigoDsl.g:1158:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefToDomainTypeAccess().getRefToDomainTypeAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:1164:3: ( (otherlv_1= RULE_ID ) )
            // InternalVertigoDsl.g:1165:4: (otherlv_1= RULE_ID )
            {
            // InternalVertigoDsl.g:1165:4: (otherlv_1= RULE_ID )
            // InternalVertigoDsl.g:1166:5: otherlv_1= RULE_ID
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
    // InternalVertigoDsl.g:1181:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1181:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1182:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
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
    // InternalVertigoDsl.g:1188:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:1194:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1195:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1195:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1196:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1200:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1201:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1201:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1202:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1205:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1206:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1206:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVertigoDsl.g:1207:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1207:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1208:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1208:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1209:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1212:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1212:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1212:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1212:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1220:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1221:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1221:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1222:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionIdStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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

            	    // InternalVertigoDsl.g:1239:9: (otherlv_5= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==38) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1240:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_32); 

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
            	    // InternalVertigoDsl.g:1251:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1251:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1252:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1252:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1253:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1256:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1256:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1256:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1256:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1264:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1265:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1265:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1266:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

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

            	    // InternalVertigoDsl.g:1282:9: (otherlv_9= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==38) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1283:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_32); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1310:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1310:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1311:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
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
    // InternalVertigoDsl.g:1317:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
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
            // InternalVertigoDsl.g:1323:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1324:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1324:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1325:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1329:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1330:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1330:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1331:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1334:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1335:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1335:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVertigoDsl.g:1336:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1336:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1337:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1337:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1338:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1341:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1341:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1341:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1341:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1349:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1350:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1350:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1351:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalVertigoDsl.g:1368:9: (otherlv_5= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==38) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1369:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1380:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1380:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1381:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1381:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1382:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1385:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1385:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1385:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1385:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1393:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1394:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1394:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1395:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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

            	    // InternalVertigoDsl.g:1411:9: (otherlv_9= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==38) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1412:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1423:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1423:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1424:5: {...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1424:124: ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1425:6: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1428:9: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1428:10: {...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1428:19: (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1428:20: otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1436:9: ( (lv_required_12_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1437:10: (lv_required_12_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1437:10: (lv_required_12_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1438:11: lv_required_12_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredBooleanStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalVertigoDsl.g:1455:9: (otherlv_13= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==38) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1456:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1467:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1467:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1468:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1468:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1469:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1472:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1472:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1472:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1472:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,43,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1480:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1481:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1481:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1482:11: lv_persistent_16_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentBooleanStringEnumRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalVertigoDsl.g:1499:9: (otherlv_17= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==38) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1500:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,38,FOLLOW_35); 

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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_18=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1527:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1527:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1528:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
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
    // InternalVertigoDsl.g:1534:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:1540:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:1541:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:1541:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:1542:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1546:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1547:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1547:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1548:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1551:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1552:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1552:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalVertigoDsl.g:1553:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1553:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1554:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1554:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1555:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1558:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1558:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1558:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1558:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1566:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1567:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1567:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1568:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
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

            	    // InternalVertigoDsl.g:1585:9: (otherlv_5= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==38) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1586:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1597:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1597:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1598:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1598:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1599:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1602:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1602:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1602:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1602:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1610:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1611:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1611:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1612:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            	    // InternalVertigoDsl.g:1628:9: (otherlv_9= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==38) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1629:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1640:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1640:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1641:5: {...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1641:128: ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1642:6: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1645:9: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1645:10: {...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1645:19: (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1645:20: otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,44,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1653:9: ( (lv_expressionString_12_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1654:10: (lv_expressionString_12_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1654:10: (lv_expressionString_12_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1655:11: lv_expressionString_12_0= RULE_STRING
            	    {
            	    lv_expressionString_12_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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

            	    // InternalVertigoDsl.g:1671:9: (otherlv_13= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1672:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_38); 

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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1699:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:1699:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:1700:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
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
    // InternalVertigoDsl.g:1706:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1712:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1713:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1713:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1714:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:1718:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1719:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1719:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1720:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:1736:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:1737:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:1737:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:1738:5: lv_idString_2_0= ruleDtDefinitionIdString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdFieldAccess().getIdStringDtDefinitionIdStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalVertigoDsl.g:1755:3: (otherlv_3= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVertigoDsl.g:1756:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1765:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:1765:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:1766:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
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
    // InternalVertigoDsl.g:1772:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1778:2: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1779:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1779:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1780:3: otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:1784:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:1785:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:1785:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:1786:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getDtDefinitionDataFieldAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:1803:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:1804:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:1804:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:1805:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionDataFieldAccess().getDataFieldStringDtDefinitionDataFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalVertigoDsl.g:1822:3: (otherlv_3= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVertigoDsl.g:1823:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1832:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:1832:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:1833:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
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
    // InternalVertigoDsl.g:1839:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1845:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1846:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1846:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1847:3: otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:1851:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1852:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1852:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1853:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:1869:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:1870:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:1870:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:1871:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionComputedFieldAccess().getComputedFieldStringDtDefinitionComputedFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalVertigoDsl.g:1888:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:1889:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1898:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:1898:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:1899:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:1905:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1911:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1912:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1912:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1913:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1921:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1922:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1922:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1923:5: lv_stereoType_2_0= RULE_STRING
            {
            lv_stereoType_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalVertigoDsl.g:1939:3: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:1940:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1949:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:1949:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:1950:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
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
    // InternalVertigoDsl.g:1956:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1962:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1963:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1963:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1964:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1972:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1973:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1973:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1974:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalVertigoDsl.g:1990:3: (otherlv_3= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:1991:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2000:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:2000:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:2001:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
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
    // InternalVertigoDsl.g:2007:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2013:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2014:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2014:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2015:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2023:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2024:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2024:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2025:5: lv_displayField_2_0= RULE_STRING
            {
            lv_displayField_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalVertigoDsl.g:2041:3: (otherlv_3= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:2042:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2051:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:2051:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:2052:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
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
    // InternalVertigoDsl.g:2058:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2064:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2065:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2065:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2066:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2074:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2075:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2075:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2076:5: lv_sortField_2_0= RULE_STRING
            {
            lv_sortField_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalVertigoDsl.g:2092:3: (otherlv_3= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVertigoDsl.g:2093:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2102:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2102:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:2103:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:2109:1: ruleDtDefinition returns [EObject current=null] : ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' () ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
            // InternalVertigoDsl.g:2115:2: ( ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' () ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2116:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' () ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2116:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' () ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2117:3: (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' () ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            // InternalVertigoDsl.g:2117:3: (otherlv_0= 'create' | otherlv_1= 'alter' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==20) ) {
                alt32=1;
            }
            else if ( (LA32_0==31) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalVertigoDsl.g:2118:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:2123:4: otherlv_1= 'alter'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getAlterKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2132:3: ()
            // InternalVertigoDsl.g:2133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDtDefinitionAccess().getDtDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:2139:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalVertigoDsl.g:2140:4: (lv_name_4_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2140:4: (lv_name_4_0= RULE_ID )
            // InternalVertigoDsl.g:2141:5: lv_name_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:2161:3: ( (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVertigoDsl.g:2162:4: (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2162:4: (lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2163:5: lv_dtDefinitionStereotype_6_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:2180:3: ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVertigoDsl.g:2181:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2181:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2182:5: lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_42);
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

            // InternalVertigoDsl.g:2199:3: ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVertigoDsl.g:2200:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2200:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2201:5: lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    break loop35;
                }
            } while (true);

            // InternalVertigoDsl.g:2218:3: ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==46) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVertigoDsl.g:2219:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2219:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2220:5: lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_43);
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
            	    break loop36;
                }
            } while (true);

            // InternalVertigoDsl.g:2237:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2238:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2238:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2239:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2242:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2243:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2243:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVertigoDsl.g:2244:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2244:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2245:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2245:109: ( ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2246:6: ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2249:9: ({...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2249:10: {...}? => ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2249:19: ( (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2249:20: (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2249:20: (lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2250:10: lv_dtDefinitionDataSpace_11_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_44);
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
            	    // InternalVertigoDsl.g:2272:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2272:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2273:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2273:109: ( ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2274:6: ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2277:9: ({...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2277:10: {...}? => ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2277:19: ( (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2277:20: (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2277:20: (lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2278:10: lv_dtDefinitionSortField_12_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_44);
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
            	    // InternalVertigoDsl.g:2300:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2300:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2301:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2301:109: ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2302:6: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:2305:9: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2305:10: {...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2305:19: ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2305:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2305:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2306:10: lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_44);
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
            	    break loop37;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2343:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:2343:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:2344:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:2350:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
            // InternalVertigoDsl.g:2356:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:2357:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:2357:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:2358:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:2366:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:2367:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2367:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:2368:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2388:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2389:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2389:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2390:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:2393:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2394:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2394:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=13;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalVertigoDsl.g:2395:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2395:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2396:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2396:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2397:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:2400:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:2400:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2400:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:2400:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:2408:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2409:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2409:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2410:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            	    // InternalVertigoDsl.g:2426:9: (otherlv_8= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==38) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2427:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2438:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2438:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2439:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2439:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2440:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:2443:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:2443:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2443:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:2443:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:2451:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:2452:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2452:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:2453:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2464:9: (otherlv_12= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==38) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2465:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2476:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2476:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2477:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2477:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2478:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:2481:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:2481:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2481:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:2481:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:2489:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:2490:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2490:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:2491:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2502:9: (otherlv_16= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==38) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2503:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2514:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2514:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2515:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2515:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2516:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:2519:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:2519:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2519:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:2519:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:2527:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2528:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2528:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2529:11: lv_navigabilityA_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_47);
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

            	    // InternalVertigoDsl.g:2546:9: (otherlv_20= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==38) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2547:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2558:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2558:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2559:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:2559:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2560:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:2563:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:2563:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2563:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:2563:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,55,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:2571:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2572:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2572:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2573:11: lv_navigabilityB_23_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_47);
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

            	    // InternalVertigoDsl.g:2590:9: (otherlv_24= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==38) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2591:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2602:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2602:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2603:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:2603:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2604:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:2607:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:2607:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2607:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:2607:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,56,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_49); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:2615:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2616:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2616:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2617:11: lv_multiplicityA_27_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_47);
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

            	    // InternalVertigoDsl.g:2634:9: (otherlv_28= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==38) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2635:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2646:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2647:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:2647:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2648:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:2651:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:2651:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2651:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:2651:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,24,FOLLOW_49); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:2659:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2660:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2660:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2661:11: lv_multiplicityB_31_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_47);
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

            	    // InternalVertigoDsl.g:2678:9: (otherlv_32= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==38) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2679:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2690:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2690:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2691:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:2691:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2692:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:2695:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:2695:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2695:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:2695:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,58,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:2703:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2704:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2704:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2705:11: lv_labelA_35_0= RULE_STRING
            	    {
            	    lv_labelA_35_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            	    // InternalVertigoDsl.g:2721:9: (otherlv_36= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==38) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2722:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2733:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2733:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2734:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:2734:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2735:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:2738:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:2738:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2738:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:2738:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:2746:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2747:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2747:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2748:11: lv_labelB_39_0= RULE_STRING
            	    {
            	    lv_labelB_39_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            	    // InternalVertigoDsl.g:2764:9: (otherlv_40= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==38) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2765:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2776:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2776:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2777:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:2777:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2778:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:2781:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:2781:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2781:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:2781:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,60,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:2789:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2790:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2790:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2791:11: lv_roleA_43_0= RULE_STRING
            	    {
            	    lv_roleA_43_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            	    // InternalVertigoDsl.g:2807:9: (otherlv_44= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==38) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2808:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2819:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2819:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2820:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:2820:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2821:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:2824:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:2824:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2824:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:2824:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,61,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:2832:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2833:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2833:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2834:11: lv_roleB_47_0= RULE_STRING
            	    {
            	    lv_roleB_47_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            	    // InternalVertigoDsl.g:2850:9: (otherlv_48= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==38) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2851:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,38,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2862:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2862:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:2863:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:2863:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:2864:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:2867:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:2867:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2867:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:2867:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) )
            	    {
            	    otherlv_49=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:2875:9: ( (lv_type_51_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2876:10: (lv_type_51_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2876:10: (lv_type_51_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2877:11: lv_type_51_0= RULE_STRING
            	    {
            	    lv_type_51_0=(Token)match(input,RULE_STRING,FOLLOW_48); 

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
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				

            }

            otherlv_52=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2915:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:2915:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:2916:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:2922:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
    public final EObject ruleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_refToDomainType_4_0 = null;

        Enumerator lv_required_8_0 = null;

        Enumerator lv_inout_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2928:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2929:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2929:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2930:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:2934:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2935:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2935:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2936:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:2939:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2940:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2940:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=4;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt53=3;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalVertigoDsl.g:2941:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2941:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2942:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2942:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2943:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:2946:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:2946:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2946:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:2946:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:2954:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:2955:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:2955:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:2956:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_51);
            	    lv_refToDomainType_4_0=ruleRefToDomainType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"refToDomainType",
            	    												lv_refToDomainType_4_0,
            	    												"io.vertigo.dsl.VertigoDsl.RefToDomainType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2973:9: (otherlv_5= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==38) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2974:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:2985:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2985:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2986:5: {...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2986:116: ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2987:6: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:2990:9: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:2990:10: {...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2990:19: (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:2990:20: otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getRequiredKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:2998:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2999:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2999:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3000:11: lv_required_8_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRequiredBooleanStringEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_51);
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

            	    // InternalVertigoDsl.g:3017:9: (otherlv_9= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==38) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3018:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:3029:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3029:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3030:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3030:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3031:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:3034:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:3034:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3034:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:3034:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_53); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:3042:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:3043:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:3043:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:3044:11: lv_inout_12_0= ruleInOutString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getInoutInOutStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_51);
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

            	    // InternalVertigoDsl.g:3061:9: (otherlv_13= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==38) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3062:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_52); 

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
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3089:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:3089:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:3090:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
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
    // InternalVertigoDsl.g:3096:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3102:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3103:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3103:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3104:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:3108:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3109:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3109:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3110:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:3126:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3127:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3127:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3128:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
            {

            					newCompositeNode(grammarAccess.getTaskAttributeAccess().getTaskAttributeStringTaskAttributeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
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

            // InternalVertigoDsl.g:3145:3: (otherlv_3= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==38) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalVertigoDsl.g:3146:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3155:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3155:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3156:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:3162:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3168:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3169:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3169:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3170:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3178:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3179:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3179:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3180:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalVertigoDsl.g:3196:3: (otherlv_3= ',' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVertigoDsl.g:3197:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskDataSpaceAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskDataSpace"


    // $ANTLR start "entryRuleTaskRequestString"
    // InternalVertigoDsl.g:3206:1: entryRuleTaskRequestString returns [EObject current=null] : iv_ruleTaskRequestString= ruleTaskRequestString EOF ;
    public final EObject entryRuleTaskRequestString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequestString = null;


        try {
            // InternalVertigoDsl.g:3206:58: (iv_ruleTaskRequestString= ruleTaskRequestString EOF )
            // InternalVertigoDsl.g:3207:2: iv_ruleTaskRequestString= ruleTaskRequestString EOF
            {
             newCompositeNode(grammarAccess.getTaskRequestStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRequestString=ruleTaskRequestString();

            state._fsp--;

             current =iv_ruleTaskRequestString; 
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
    // $ANTLR end "entryRuleTaskRequestString"


    // $ANTLR start "ruleTaskRequestString"
    // InternalVertigoDsl.g:3213:1: ruleTaskRequestString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleTaskRequestString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3219:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:3220:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalVertigoDsl.g:3220:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3221:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3221:3: (lv_string_0_0= RULE_STRING )
            // InternalVertigoDsl.g:3222:4: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getTaskRequestStringAccess().getStringSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTaskRequestStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"string",
            					lv_string_0_0,
            					"io.vertigo.dsl.VertigoDsl.STRING");
            			

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
    // $ANTLR end "ruleTaskRequestString"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalVertigoDsl.g:3241:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3241:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3242:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:3248:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_request_10_0 = null;

        EObject lv_taskAttributes_12_0 = null;

        EObject lv_taskDataSpace_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3254:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3255:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3255:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            // InternalVertigoDsl.g:3256:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3265:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3266:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskDefinitionAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:3294:3: ( (lv_classname_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3295:4: (lv_classname_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3295:4: (lv_classname_6_0= RULE_STRING )
            // InternalVertigoDsl.g:3296:5: lv_classname_6_0= RULE_STRING
            {
            lv_classname_6_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

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

            // InternalVertigoDsl.g:3312:3: (otherlv_7= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalVertigoDsl.g:3313:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRequestKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getColonKeyword_9());
            		
            // InternalVertigoDsl.g:3326:3: ( (lv_request_10_0= ruleTaskRequestString ) )
            // InternalVertigoDsl.g:3327:4: (lv_request_10_0= ruleTaskRequestString )
            {
            // InternalVertigoDsl.g:3327:4: (lv_request_10_0= ruleTaskRequestString )
            // InternalVertigoDsl.g:3328:5: lv_request_10_0= ruleTaskRequestString
            {

            					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getRequestTaskRequestStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_57);
            lv_request_10_0=ruleTaskRequestString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            					}
            					set(
            						current,
            						"request",
            						lv_request_10_0,
            						"io.vertigo.dsl.VertigoDsl.TaskRequestString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3345:3: (otherlv_11= ',' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==38) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalVertigoDsl.g:3346:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalVertigoDsl.g:3351:3: ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==64) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalVertigoDsl.g:3352:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:3352:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:3353:5: lv_taskAttributes_12_0= ruleTaskAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskAttributeParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_58);
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

            // InternalVertigoDsl.g:3370:3: ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==29) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVertigoDsl.g:3371:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:3371:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:3372:5: lv_taskDataSpace_13_0= ruleTaskDataSpace
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

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFacetDefinitionDtDefinition"
    // InternalVertigoDsl.g:3397:1: entryRuleFacetDefinitionDtDefinition returns [EObject current=null] : iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF ;
    public final EObject entryRuleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionDtDefinition = null;


        try {
            // InternalVertigoDsl.g:3397:68: (iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF )
            // InternalVertigoDsl.g:3398:2: iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionDtDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionDtDefinition=ruleFacetDefinitionDtDefinition();

            state._fsp--;

             current =iv_ruleFacetDefinitionDtDefinition; 
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
    // $ANTLR end "entryRuleFacetDefinitionDtDefinition"


    // $ANTLR start "ruleFacetDefinitionDtDefinition"
    // InternalVertigoDsl.g:3404:1: ruleFacetDefinitionDtDefinition returns [EObject current=null] : (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3410:2: ( (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3411:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3411:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3412:3: otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionDtDefinitionAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3420:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:3421:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:3421:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:3422:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:3433:3: (otherlv_3= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==38) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVertigoDsl.g:3434:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionDtDefinitionAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetDefinitionDtDefinition"


    // $ANTLR start "entryRuleFacetDefinitionFieldName"
    // InternalVertigoDsl.g:3443:1: entryRuleFacetDefinitionFieldName returns [EObject current=null] : iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF ;
    public final EObject entryRuleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionFieldName = null;


        try {
            // InternalVertigoDsl.g:3443:65: (iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF )
            // InternalVertigoDsl.g:3444:2: iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionFieldNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionFieldName=ruleFacetDefinitionFieldName();

            state._fsp--;

             current =iv_ruleFacetDefinitionFieldName; 
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
    // $ANTLR end "entryRuleFacetDefinitionFieldName"


    // $ANTLR start "ruleFacetDefinitionFieldName"
    // InternalVertigoDsl.g:3450:1: ruleFacetDefinitionFieldName returns [EObject current=null] : (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3456:2: ( (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3457:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3457:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3458:3: otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionFieldNameAccess().getFieldNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionFieldNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3466:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3467:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3467:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3468:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_string_2_0, grammarAccess.getFacetDefinitionFieldNameAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionFieldNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3484:3: (otherlv_3= ',' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==38) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalVertigoDsl.g:3485:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionFieldNameAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetDefinitionFieldName"


    // $ANTLR start "entryRuleFacetDefinitionLabel"
    // InternalVertigoDsl.g:3494:1: entryRuleFacetDefinitionLabel returns [EObject current=null] : iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF ;
    public final EObject entryRuleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionLabel = null;


        try {
            // InternalVertigoDsl.g:3494:61: (iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF )
            // InternalVertigoDsl.g:3495:2: iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionLabel=ruleFacetDefinitionLabel();

            state._fsp--;

             current =iv_ruleFacetDefinitionLabel; 
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
    // $ANTLR end "entryRuleFacetDefinitionLabel"


    // $ANTLR start "ruleFacetDefinitionLabel"
    // InternalVertigoDsl.g:3501:1: ruleFacetDefinitionLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3507:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3508:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3508:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3509:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionLabelAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3517:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3518:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3518:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3519:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_string_2_0, grammarAccess.getFacetDefinitionLabelAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3535:3: (otherlv_3= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVertigoDsl.g:3536:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionLabelAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetDefinitionLabel"


    // $ANTLR start "entryRuleFacetDefinitionRangeString"
    // InternalVertigoDsl.g:3545:1: entryRuleFacetDefinitionRangeString returns [EObject current=null] : iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF ;
    public final EObject entryRuleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRangeString = null;


        try {
            // InternalVertigoDsl.g:3545:67: (iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF )
            // InternalVertigoDsl.g:3546:2: iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionRangeStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionRangeString=ruleFacetDefinitionRangeString();

            state._fsp--;

             current =iv_ruleFacetDefinitionRangeString; 
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
    // $ANTLR end "entryRuleFacetDefinitionRangeString"


    // $ANTLR start "ruleFacetDefinitionRangeString"
    // InternalVertigoDsl.g:3552:1: ruleFacetDefinitionRangeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_filterString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_labelString_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3558:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:3559:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:3559:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:3560:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:3564:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3565:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3565:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3566:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:3569:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3570:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3570:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( LA65_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt65=1;
                }
                else if ( LA65_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalVertigoDsl.g:3571:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3571:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3572:5: {...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3572:123: ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3573:6: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:3576:9: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:3576:10: {...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3576:19: (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:3576:20: otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,69,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:3584:9: ( (lv_filterString_4_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3585:10: (lv_filterString_4_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3585:10: (lv_filterString_4_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3586:11: lv_filterString_4_0= RULE_STRING
            	    {
            	    lv_filterString_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            	    											newLeafNode(lv_filterString_4_0, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterStringSTRINGTerminalRuleCall_1_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFacetDefinitionRangeStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"filterString",
            	    												lv_filterString_4_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3602:9: (otherlv_5= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==38) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3603:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_61); 

            	            										newLeafNode(otherlv_5, grammarAccess.getFacetDefinitionRangeStringAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:3614:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3614:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3615:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3615:123: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3616:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:3619:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:3619:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3619:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:3619:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:3627:9: ( (lv_labelString_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3628:10: (lv_labelString_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3628:10: (lv_labelString_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3629:11: lv_labelString_8_0= RULE_STRING
            	    {
            	    lv_labelString_8_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            	    											newLeafNode(lv_labelString_8_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelStringSTRINGTerminalRuleCall_1_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFacetDefinitionRangeStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"labelString",
            	    												lv_labelString_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3645:9: (otherlv_9= ',' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==38) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3646:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_61); 

            	            										newLeafNode(otherlv_9, grammarAccess.getFacetDefinitionRangeStringAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFacetDefinitionRangeStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleFacetDefinitionRangeString"


    // $ANTLR start "entryRuleFacetDefinitionRange"
    // InternalVertigoDsl.g:3673:1: entryRuleFacetDefinitionRange returns [EObject current=null] : iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF ;
    public final EObject entryRuleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRange = null;


        try {
            // InternalVertigoDsl.g:3673:61: (iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF )
            // InternalVertigoDsl.g:3674:2: iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionRange=ruleFacetDefinitionRange();

            state._fsp--;

             current =iv_ruleFacetDefinitionRange; 
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
    // $ANTLR end "entryRuleFacetDefinitionRange"


    // $ANTLR start "ruleFacetDefinitionRange"
    // InternalVertigoDsl.g:3680:1: ruleFacetDefinitionRange returns [EObject current=null] : (otherlv_0= 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_facetDefinitionRangeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3686:2: ( (otherlv_0= 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3687:2: (otherlv_0= 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3687:2: (otherlv_0= 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3688:3: otherlv_0= 'range' ( (lv_name_1_0= RULE_ID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeAccess().getRangeKeyword_0());
            		
            // InternalVertigoDsl.g:3692:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3693:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3693:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3694:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFacetDefinitionRangeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:3710:3: ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) )
            // InternalVertigoDsl.g:3711:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            {
            // InternalVertigoDsl.g:3711:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            // InternalVertigoDsl.g:3712:5: lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionRangeAccess().getFacetDefinitionRangeStringFacetDefinitionRangeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_facetDefinitionRangeString_2_0=ruleFacetDefinitionRangeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionRangeRule());
            					}
            					set(
            						current,
            						"facetDefinitionRangeString",
            						lv_facetDefinitionRangeString_2_0,
            						"io.vertigo.dsl.VertigoDsl.FacetDefinitionRangeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3729:3: (otherlv_3= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==38) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalVertigoDsl.g:3730:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetDefinitionRange"


    // $ANTLR start "entryRuleFacetDefinition"
    // InternalVertigoDsl.g:3739:1: entryRuleFacetDefinition returns [EObject current=null] : iv_ruleFacetDefinition= ruleFacetDefinition EOF ;
    public final EObject entryRuleFacetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinition = null;


        try {
            // InternalVertigoDsl.g:3739:56: (iv_ruleFacetDefinition= ruleFacetDefinition EOF )
            // InternalVertigoDsl.g:3740:2: iv_ruleFacetDefinition= ruleFacetDefinition EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinition=ruleFacetDefinition();

            state._fsp--;

             current =iv_ruleFacetDefinition; 
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
    // $ANTLR end "entryRuleFacetDefinition"


    // $ANTLR start "ruleFacetDefinition"
    // InternalVertigoDsl.g:3746:1: ruleFacetDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) ) ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) ) ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) ) ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )* otherlv_9= '}' ) ;
    public final EObject ruleFacetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_facetDefinitionDtDefinition_5_0 = null;

        EObject lv_facetDefinitionFieldName_6_0 = null;

        EObject lv_facetDefinitonLabel_7_0 = null;

        EObject lv_facetDefinitionRange_8_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3752:2: ( (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) ) ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) ) ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) ) ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )* otherlv_9= '}' ) )
            // InternalVertigoDsl.g:3753:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) ) ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) ) ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) ) ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )* otherlv_9= '}' )
            {
            // InternalVertigoDsl.g:3753:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) ) ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) ) ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) ) ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )* otherlv_9= '}' )
            // InternalVertigoDsl.g:3754:3: otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) ) ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) ) ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) ) ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,71,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionAccess().getFacetDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:3762:3: ()
            // InternalVertigoDsl.g:3763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetDefinitionAccess().getFacetDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:3769:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:3770:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3770:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:3771:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFacetDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_63); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:3791:3: ( (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition ) )
            // InternalVertigoDsl.g:3792:4: (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition )
            {
            // InternalVertigoDsl.g:3792:4: (lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition )
            // InternalVertigoDsl.g:3793:5: lv_facetDefinitionDtDefinition_5_0= ruleFacetDefinitionDtDefinition
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionDtDefinitionFacetDefinitionDtDefinitionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_64);
            lv_facetDefinitionDtDefinition_5_0=ruleFacetDefinitionDtDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            					}
            					set(
            						current,
            						"facetDefinitionDtDefinition",
            						lv_facetDefinitionDtDefinition_5_0,
            						"io.vertigo.dsl.VertigoDsl.FacetDefinitionDtDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3810:3: ( (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName ) )
            // InternalVertigoDsl.g:3811:4: (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName )
            {
            // InternalVertigoDsl.g:3811:4: (lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName )
            // InternalVertigoDsl.g:3812:5: lv_facetDefinitionFieldName_6_0= ruleFacetDefinitionFieldName
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionFieldNameFacetDefinitionFieldNameParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_65);
            lv_facetDefinitionFieldName_6_0=ruleFacetDefinitionFieldName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            					}
            					set(
            						current,
            						"facetDefinitionFieldName",
            						lv_facetDefinitionFieldName_6_0,
            						"io.vertigo.dsl.VertigoDsl.FacetDefinitionFieldName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3829:3: ( (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel ) )
            // InternalVertigoDsl.g:3830:4: (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel )
            {
            // InternalVertigoDsl.g:3830:4: (lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel )
            // InternalVertigoDsl.g:3831:5: lv_facetDefinitonLabel_7_0= ruleFacetDefinitionLabel
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitonLabelFacetDefinitionLabelParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_66);
            lv_facetDefinitonLabel_7_0=ruleFacetDefinitionLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            					}
            					set(
            						current,
            						"facetDefinitonLabel",
            						lv_facetDefinitonLabel_7_0,
            						"io.vertigo.dsl.VertigoDsl.FacetDefinitionLabel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3848:3: ( (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==70) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalVertigoDsl.g:3849:4: (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange )
            	    {
            	    // InternalVertigoDsl.g:3849:4: (lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange )
            	    // InternalVertigoDsl.g:3850:5: lv_facetDefinitionRange_8_0= ruleFacetDefinitionRange
            	    {

            	    					newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionRangeFacetDefinitionRangeParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_66);
            	    lv_facetDefinitionRange_8_0=ruleFacetDefinitionRange();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"facetDefinitionRange",
            	    						lv_facetDefinitionRange_8_0,
            	    						"io.vertigo.dsl.VertigoDsl.FacetDefinitionRange");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFacetDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleFacetDefinition"


    // $ANTLR start "entryRuleFacetedQueryDefinitionKeyConcept"
    // InternalVertigoDsl.g:3875:1: entryRuleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF ;
    public final EObject entryRuleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:3875:73: (iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:3876:2: iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionKeyConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionKeyConcept=ruleFacetedQueryDefinitionKeyConcept();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionKeyConcept; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionKeyConcept"


    // $ANTLR start "ruleFacetedQueryDefinitionKeyConcept"
    // InternalVertigoDsl.g:3882:1: ruleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3888:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3889:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3889:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3890:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3898:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:3899:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:3899:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:3900:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:3911:3: (otherlv_3= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==38) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalVertigoDsl.g:3912:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionKeyConcept"


    // $ANTLR start "entryRuleFacetedQueryDefinitionDomainCriteria"
    // InternalVertigoDsl.g:3921:1: entryRuleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF ;
    public final EObject entryRuleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionDomainCriteria = null;


        try {
            // InternalVertigoDsl.g:3921:77: (iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF )
            // InternalVertigoDsl.g:3922:2: iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionDomainCriteriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionDomainCriteria=ruleFacetedQueryDefinitionDomainCriteria();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionDomainCriteria; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionDomainCriteria"


    // $ANTLR start "ruleFacetedQueryDefinitionDomainCriteria"
    // InternalVertigoDsl.g:3928:1: ruleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refToDomainType_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3934:2: ( (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3935:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3935:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3936:3: otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getDomainCriteriaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3944:3: ( (lv_refToDomainType_2_0= ruleRefToDomainType ) )
            // InternalVertigoDsl.g:3945:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            {
            // InternalVertigoDsl.g:3945:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            // InternalVertigoDsl.g:3946:5: lv_refToDomainType_2_0= ruleRefToDomainType
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_refToDomainType_2_0=ruleRefToDomainType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionDomainCriteriaRule());
            					}
            					set(
            						current,
            						"refToDomainType",
            						lv_refToDomainType_2_0,
            						"io.vertigo.dsl.VertigoDsl.RefToDomainType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3963:3: (otherlv_3= ',' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalVertigoDsl.g:3964:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionDomainCriteria"


    // $ANTLR start "entryRuleFacetedQueryDefinitionListFilterBuilderQuery"
    // InternalVertigoDsl.g:3973:1: entryRuleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderQuery = null;


        try {
            // InternalVertigoDsl.g:3973:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF )
            // InternalVertigoDsl.g:3974:2: iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionListFilterBuilderQuery=ruleFacetedQueryDefinitionListFilterBuilderQuery();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionListFilterBuilderQuery; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionListFilterBuilderQuery"


    // $ANTLR start "ruleFacetedQueryDefinitionListFilterBuilderQuery"
    // InternalVertigoDsl.g:3980:1: ruleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3986:2: ( (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3987:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3987:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3988:3: otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getListFilterBuilderClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3996:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3997:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3997:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3998:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_string_2_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:4014:3: (otherlv_3= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalVertigoDsl.g:4015:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionListFilterBuilderQuery"


    // $ANTLR start "entryRuleFacetedQueryDefinitionListFilterBuilderClass"
    // InternalVertigoDsl.g:4024:1: entryRuleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderClass = null;


        try {
            // InternalVertigoDsl.g:4024:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF )
            // InternalVertigoDsl.g:4025:2: iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionListFilterBuilderClass=ruleFacetedQueryDefinitionListFilterBuilderClass();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionListFilterBuilderClass; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionListFilterBuilderClass"


    // $ANTLR start "ruleFacetedQueryDefinitionListFilterBuilderClass"
    // InternalVertigoDsl.g:4031:1: ruleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4037:2: ( (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4038:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4038:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4039:3: otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getListFilterBuilderQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4047:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4048:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4048:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4049:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_string_2_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:4065:3: (otherlv_3= ',' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==38) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalVertigoDsl.g:4066:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionListFilterBuilderClass"


    // $ANTLR start "entryRuleFacetedQueryDefinitionFacets"
    // InternalVertigoDsl.g:4075:1: entryRuleFacetedQueryDefinitionFacets returns [EObject current=null] : iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF ;
    public final EObject entryRuleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionFacets = null;


        try {
            // InternalVertigoDsl.g:4075:69: (iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF )
            // InternalVertigoDsl.g:4076:2: iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionFacetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionFacets=ruleFacetedQueryDefinitionFacets();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionFacets; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionFacets"


    // $ANTLR start "ruleFacetedQueryDefinitionFacets"
    // InternalVertigoDsl.g:4082:1: ruleFacetedQueryDefinitionFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4088:2: ( (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) )
            // InternalVertigoDsl.g:4089:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            {
            // InternalVertigoDsl.g:4089:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            // InternalVertigoDsl.g:4090:3: otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVertigoDsl.g:4102:3: ( (otherlv_3= RULE_ID ) )
            // InternalVertigoDsl.g:4103:4: (otherlv_3= RULE_ID )
            {
            // InternalVertigoDsl.g:4103:4: (otherlv_3= RULE_ID )
            // InternalVertigoDsl.g:4104:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetDefinitionFacetDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalVertigoDsl.g:4115:3: ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==38) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalVertigoDsl.g:4116:4: (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:4116:4: (otherlv_4= ',' )+
            	    int cnt72=0;
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==38) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4117:5: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_28); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt72 >= 1 ) break loop72;
            	                EarlyExitException eee =
            	                    new EarlyExitException(72, input);
            	                throw eee;
            	        }
            	        cnt72++;
            	    } while (true);

            	    // InternalVertigoDsl.g:4122:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalVertigoDsl.g:4123:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:4123:5: (otherlv_5= RULE_ID )
            	    // InternalVertigoDsl.g:4124:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(otherlv_5, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsFacetDefinitionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_6=(Token)match(input,39,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getRightSquareBracketKeyword_5());
            		
            // InternalVertigoDsl.g:4140:3: (otherlv_7= ',' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==38) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalVertigoDsl.g:4141:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_6());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionFacets"


    // $ANTLR start "entryRuleFacetedQueryDefinition"
    // InternalVertigoDsl.g:4150:1: entryRuleFacetedQueryDefinition returns [EObject current=null] : iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF ;
    public final EObject entryRuleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinition = null;


        try {
            // InternalVertigoDsl.g:4150:63: (iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF )
            // InternalVertigoDsl.g:4151:2: iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinition=ruleFacetedQueryDefinition();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinition; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinition"


    // $ANTLR start "ruleFacetedQueryDefinition"
    // InternalVertigoDsl.g:4157:1: ruleFacetedQueryDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) ) ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) ) otherlv_10= '}' ) ;
    public final EObject ruleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_facetedQueryDefinitionKeyConcept_5_0 = null;

        EObject lv_facetedQueryDefinitionDomainCriteria_6_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderQuery_7_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderClass_8_0 = null;

        EObject lv_facetedQueryDefinitionFacets_9_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4163:2: ( (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) ) ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4164:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) ) ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4164:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) ) ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4165:3: otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) ) ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,77,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4173:3: ()
            // InternalVertigoDsl.g:4174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4180:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4181:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4181:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4182:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFacetedQueryDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_68); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4202:3: ( (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept ) )
            // InternalVertigoDsl.g:4203:4: (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept )
            {
            // InternalVertigoDsl.g:4203:4: (lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept )
            // InternalVertigoDsl.g:4204:5: lv_facetedQueryDefinitionKeyConcept_5_0= ruleFacetedQueryDefinitionKeyConcept
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyConceptFacetedQueryDefinitionKeyConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_69);
            lv_facetedQueryDefinitionKeyConcept_5_0=ruleFacetedQueryDefinitionKeyConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					set(
            						current,
            						"facetedQueryDefinitionKeyConcept",
            						lv_facetedQueryDefinitionKeyConcept_5_0,
            						"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionKeyConcept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4221:3: ( (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            // InternalVertigoDsl.g:4222:4: (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria )
            {
            // InternalVertigoDsl.g:4222:4: (lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria )
            // InternalVertigoDsl.g:4223:5: lv_facetedQueryDefinitionDomainCriteria_6_0= ruleFacetedQueryDefinitionDomainCriteria
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionDomainCriteriaFacetedQueryDefinitionDomainCriteriaParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_70);
            lv_facetedQueryDefinitionDomainCriteria_6_0=ruleFacetedQueryDefinitionDomainCriteria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					set(
            						current,
            						"facetedQueryDefinitionDomainCriteria",
            						lv_facetedQueryDefinitionDomainCriteria_6_0,
            						"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionDomainCriteria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4240:3: ( (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            // InternalVertigoDsl.g:4241:4: (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            {
            // InternalVertigoDsl.g:4241:4: (lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            // InternalVertigoDsl.g:4242:5: lv_facetedQueryDefinitionListFilterBuilderQuery_7_0= ruleFacetedQueryDefinitionListFilterBuilderQuery
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderQueryFacetedQueryDefinitionListFilterBuilderQueryParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_71);
            lv_facetedQueryDefinitionListFilterBuilderQuery_7_0=ruleFacetedQueryDefinitionListFilterBuilderQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					set(
            						current,
            						"facetedQueryDefinitionListFilterBuilderQuery",
            						lv_facetedQueryDefinitionListFilterBuilderQuery_7_0,
            						"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionListFilterBuilderQuery");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4259:3: ( (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            // InternalVertigoDsl.g:4260:4: (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            {
            // InternalVertigoDsl.g:4260:4: (lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            // InternalVertigoDsl.g:4261:5: lv_facetedQueryDefinitionListFilterBuilderClass_8_0= ruleFacetedQueryDefinitionListFilterBuilderClass
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderClassFacetedQueryDefinitionListFilterBuilderClassParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_72);
            lv_facetedQueryDefinitionListFilterBuilderClass_8_0=ruleFacetedQueryDefinitionListFilterBuilderClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					set(
            						current,
            						"facetedQueryDefinitionListFilterBuilderClass",
            						lv_facetedQueryDefinitionListFilterBuilderClass_8_0,
            						"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionListFilterBuilderClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4278:3: ( (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets ) )
            // InternalVertigoDsl.g:4279:4: (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets )
            {
            // InternalVertigoDsl.g:4279:4: (lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets )
            // InternalVertigoDsl.g:4280:5: lv_facetedQueryDefinitionFacets_9_0= ruleFacetedQueryDefinitionFacets
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionFacetsFacetedQueryDefinitionFacetsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_facetedQueryDefinitionFacets_9_0=ruleFacetedQueryDefinitionFacets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            					}
            					set(
            						current,
            						"facetedQueryDefinitionFacets",
            						lv_facetedQueryDefinitionFacets_9_0,
            						"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionFacets");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFacetedQueryDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleFacetedQueryDefinition"


    // $ANTLR start "entryRuleIndexDefinitionKeyConcept"
    // InternalVertigoDsl.g:4305:1: entryRuleIndexDefinitionKeyConcept returns [EObject current=null] : iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF ;
    public final EObject entryRuleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4305:66: (iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4306:2: iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionKeyConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinitionKeyConcept=ruleIndexDefinitionKeyConcept();

            state._fsp--;

             current =iv_ruleIndexDefinitionKeyConcept; 
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
    // $ANTLR end "entryRuleIndexDefinitionKeyConcept"


    // $ANTLR start "ruleIndexDefinitionKeyConcept"
    // InternalVertigoDsl.g:4312:1: ruleIndexDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4318:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4319:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4319:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4320:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4328:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4329:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4329:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4330:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4341:3: (otherlv_3= ',' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalVertigoDsl.g:4342:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getIndexDefinitionKeyConceptAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleIndexDefinitionKeyConcept"


    // $ANTLR start "entryRuleIndexDefinitionDtIndex"
    // InternalVertigoDsl.g:4351:1: entryRuleIndexDefinitionDtIndex returns [EObject current=null] : iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF ;
    public final EObject entryRuleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionDtIndex = null;


        try {
            // InternalVertigoDsl.g:4351:63: (iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF )
            // InternalVertigoDsl.g:4352:2: iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionDtIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinitionDtIndex=ruleIndexDefinitionDtIndex();

            state._fsp--;

             current =iv_ruleIndexDefinitionDtIndex; 
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
    // $ANTLR end "entryRuleIndexDefinitionDtIndex"


    // $ANTLR start "ruleIndexDefinitionDtIndex"
    // InternalVertigoDsl.g:4358:1: ruleIndexDefinitionDtIndex returns [EObject current=null] : (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4364:2: ( (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4365:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4365:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4366:3: otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionDtIndexAccess().getDtIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionDtIndexAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4374:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4375:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4375:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4376:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionDtIndexRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionDtIndexAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4387:3: (otherlv_3= ',' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalVertigoDsl.g:4388:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getIndexDefinitionDtIndexAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleIndexDefinitionDtIndex"


    // $ANTLR start "entryRuleIndexDefinitionIndexCopyToString"
    // InternalVertigoDsl.g:4397:1: entryRuleIndexDefinitionIndexCopyToString returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyToString = null;


        try {
            // InternalVertigoDsl.g:4397:73: (iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF )
            // InternalVertigoDsl.g:4398:2: iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinitionIndexCopyToString=ruleIndexDefinitionIndexCopyToString();

            state._fsp--;

             current =iv_ruleIndexDefinitionIndexCopyToString; 
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
    // $ANTLR end "entryRuleIndexDefinitionIndexCopyToString"


    // $ANTLR start "ruleIndexDefinitionIndexCopyToString"
    // InternalVertigoDsl.g:4404:1: ruleIndexDefinitionIndexCopyToString returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4410:2: ( (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:4411:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:4411:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:4412:3: otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getColonKeyword_2());
            		
            // InternalVertigoDsl.g:4424:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4425:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4425:4: (lv_string_3_0= RULE_STRING )
            // InternalVertigoDsl.g:4426:5: lv_string_3_0= RULE_STRING
            {
            lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_string_3_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getStringSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionIndexCopyToStringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_3_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIndexDefinitionIndexCopyToString"


    // $ANTLR start "entryRuleIndexDefinitionIndexCopyTo"
    // InternalVertigoDsl.g:4450:1: entryRuleIndexDefinitionIndexCopyTo returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyTo = null;


        try {
            // InternalVertigoDsl.g:4450:67: (iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF )
            // InternalVertigoDsl.g:4451:2: iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinitionIndexCopyTo=ruleIndexDefinitionIndexCopyTo();

            state._fsp--;

             current =iv_ruleIndexDefinitionIndexCopyTo; 
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
    // $ANTLR end "entryRuleIndexDefinitionIndexCopyTo"


    // $ANTLR start "ruleIndexDefinitionIndexCopyTo"
    // InternalVertigoDsl.g:4457:1: ruleIndexDefinitionIndexCopyTo returns [EObject current=null] : (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_indexDefinitionIndexCopyToString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4463:2: ( (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4464:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4464:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4465:3: otherlv_0= 'indexCopyTo' ( (lv_name_1_0= RULE_ID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexCopyToKeyword_0());
            		
            // InternalVertigoDsl.g:4469:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:4470:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4470:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:4471:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionIndexCopyToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:4487:3: ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) )
            // InternalVertigoDsl.g:4488:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            {
            // InternalVertigoDsl.g:4488:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            // InternalVertigoDsl.g:4489:5: lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexDefinitionIndexCopyToStringIndexDefinitionIndexCopyToStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_indexDefinitionIndexCopyToString_2_0=ruleIndexDefinitionIndexCopyToString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexDefinitionIndexCopyToRule());
            					}
            					set(
            						current,
            						"indexDefinitionIndexCopyToString",
            						lv_indexDefinitionIndexCopyToString_2_0,
            						"io.vertigo.dsl.VertigoDsl.IndexDefinitionIndexCopyToString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4506:3: (otherlv_3= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==38) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalVertigoDsl.g:4507:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getIndexDefinitionIndexCopyToAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleIndexDefinitionIndexCopyTo"


    // $ANTLR start "entryRuleIndexDefinitionLoaderId"
    // InternalVertigoDsl.g:4516:1: entryRuleIndexDefinitionLoaderId returns [EObject current=null] : iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF ;
    public final EObject entryRuleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionLoaderId = null;


        try {
            // InternalVertigoDsl.g:4516:64: (iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF )
            // InternalVertigoDsl.g:4517:2: iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionLoaderIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinitionLoaderId=ruleIndexDefinitionLoaderId();

            state._fsp--;

             current =iv_ruleIndexDefinitionLoaderId; 
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
    // $ANTLR end "entryRuleIndexDefinitionLoaderId"


    // $ANTLR start "ruleIndexDefinitionLoaderId"
    // InternalVertigoDsl.g:4523:1: ruleIndexDefinitionLoaderId returns [EObject current=null] : (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_loaderIdString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4529:2: ( (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4530:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4530:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4531:3: otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionLoaderIdAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4539:3: ( (lv_loaderIdString_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4540:4: (lv_loaderIdString_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4540:4: (lv_loaderIdString_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4541:5: lv_loaderIdString_2_0= RULE_STRING
            {
            lv_loaderIdString_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            					newLeafNode(lv_loaderIdString_2_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionLoaderIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"loaderIdString",
            						lv_loaderIdString_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:4557:3: (otherlv_3= ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalVertigoDsl.g:4558:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getIndexDefinitionLoaderIdAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleIndexDefinitionLoaderId"


    // $ANTLR start "entryRuleIndexDefinition"
    // InternalVertigoDsl.g:4567:1: entryRuleIndexDefinition returns [EObject current=null] : iv_ruleIndexDefinition= ruleIndexDefinition EOF ;
    public final EObject entryRuleIndexDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinition = null;


        try {
            // InternalVertigoDsl.g:4567:56: (iv_ruleIndexDefinition= ruleIndexDefinition EOF )
            // InternalVertigoDsl.g:4568:2: iv_ruleIndexDefinition= ruleIndexDefinition EOF
            {
             newCompositeNode(grammarAccess.getIndexDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexDefinition=ruleIndexDefinition();

            state._fsp--;

             current =iv_ruleIndexDefinition; 
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
    // $ANTLR end "entryRuleIndexDefinition"


    // $ANTLR start "ruleIndexDefinition"
    // InternalVertigoDsl.g:4574:1: ruleIndexDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) ) ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) ) ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) ) ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )? otherlv_9= '}' ) ;
    public final EObject ruleIndexDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_indexDefinitionKeyConcept_5_0 = null;

        EObject lv_indexDefinitionDtIndex_6_0 = null;

        EObject lv_indexDefinitionLoaderId_7_0 = null;

        EObject lv_indexDefinitionIndexCopyTo_8_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4580:2: ( (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) ) ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) ) ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) ) ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )? otherlv_9= '}' ) )
            // InternalVertigoDsl.g:4581:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) ) ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) ) ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) ) ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )? otherlv_9= '}' )
            {
            // InternalVertigoDsl.g:4581:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) ) ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) ) ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) ) ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )? otherlv_9= '}' )
            // InternalVertigoDsl.g:4582:3: otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) ) ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) ) ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) ) ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4590:3: ()
            // InternalVertigoDsl.g:4591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexDefinitionAccess().getIndexDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4597:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4598:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4598:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4599:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getIndexDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_68); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4619:3: ( (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept ) )
            // InternalVertigoDsl.g:4620:4: (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept )
            {
            // InternalVertigoDsl.g:4620:4: (lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept )
            // InternalVertigoDsl.g:4621:5: lv_indexDefinitionKeyConcept_5_0= ruleIndexDefinitionKeyConcept
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyConceptIndexDefinitionKeyConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_75);
            lv_indexDefinitionKeyConcept_5_0=ruleIndexDefinitionKeyConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            					}
            					set(
            						current,
            						"indexDefinitionKeyConcept",
            						lv_indexDefinitionKeyConcept_5_0,
            						"io.vertigo.dsl.VertigoDsl.IndexDefinitionKeyConcept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4638:3: ( (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex ) )
            // InternalVertigoDsl.g:4639:4: (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex )
            {
            // InternalVertigoDsl.g:4639:4: (lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex )
            // InternalVertigoDsl.g:4640:5: lv_indexDefinitionDtIndex_6_0= ruleIndexDefinitionDtIndex
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionDtIndexIndexDefinitionDtIndexParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_76);
            lv_indexDefinitionDtIndex_6_0=ruleIndexDefinitionDtIndex();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            					}
            					set(
            						current,
            						"indexDefinitionDtIndex",
            						lv_indexDefinitionDtIndex_6_0,
            						"io.vertigo.dsl.VertigoDsl.IndexDefinitionDtIndex");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4657:3: ( (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId ) )
            // InternalVertigoDsl.g:4658:4: (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId )
            {
            // InternalVertigoDsl.g:4658:4: (lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId )
            // InternalVertigoDsl.g:4659:5: lv_indexDefinitionLoaderId_7_0= ruleIndexDefinitionLoaderId
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionLoaderIdIndexDefinitionLoaderIdParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_77);
            lv_indexDefinitionLoaderId_7_0=ruleIndexDefinitionLoaderId();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            					}
            					set(
            						current,
            						"indexDefinitionLoaderId",
            						lv_indexDefinitionLoaderId_7_0,
            						"io.vertigo.dsl.VertigoDsl.IndexDefinitionLoaderId");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4676:3: ( (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==80) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalVertigoDsl.g:4677:4: (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo )
                    {
                    // InternalVertigoDsl.g:4677:4: (lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo )
                    // InternalVertigoDsl.g:4678:5: lv_indexDefinitionIndexCopyTo_8_0= ruleIndexDefinitionIndexCopyTo
                    {

                    					newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionIndexCopyToIndexDefinitionIndexCopyToParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_indexDefinitionIndexCopyTo_8_0=ruleIndexDefinitionIndexCopyTo();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"indexDefinitionIndexCopyTo",
                    						lv_indexDefinitionIndexCopyTo_8_0,
                    						"io.vertigo.dsl.VertigoDsl.IndexDefinitionIndexCopyTo");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIndexDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleIndexDefinition"


    // $ANTLR start "ruleDataType"
    // InternalVertigoDsl.g:4703:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
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
            // InternalVertigoDsl.g:4709:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:4710:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:4710:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt80=9;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt80=1;
                }
                break;
            case 84:
                {
                alt80=2;
                }
                break;
            case 85:
                {
                alt80=3;
                }
                break;
            case 86:
                {
                alt80=4;
                }
                break;
            case 87:
                {
                alt80=5;
                }
                break;
            case 88:
                {
                alt80=6;
                }
                break;
            case 89:
                {
                alt80=7;
                }
                break;
            case 90:
                {
                alt80=8;
                }
                break;
            case 91:
                {
                alt80=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalVertigoDsl.g:4711:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:4711:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:4712:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:4719:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:4719:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:4720:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:4727:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:4727:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:4728:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:4735:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:4735:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:4736:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:4743:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:4743:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:4744:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:4751:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:4751:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:4752:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:4759:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:4759:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:4760:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:4767:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:4767:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:4768:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:4775:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:4775:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:4776:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,91,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4786:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4792:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:4793:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:4793:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==92) ) {
                alt81=1;
            }
            else if ( (LA81_0==93) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalVertigoDsl.g:4794:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:4794:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:4795:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:4802:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:4802:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:4803:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4813:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4819:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) )
            // InternalVertigoDsl.g:4820:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            {
            // InternalVertigoDsl.g:4820:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==94) ) {
                alt82=1;
            }
            else if ( (LA82_0==95) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalVertigoDsl.g:4821:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:4821:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:4822:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:4829:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:4829:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:4830:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4840:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4846:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:4847:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:4847:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==96) ) {
                alt83=1;
            }
            else if ( (LA83_0==97) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalVertigoDsl.g:4848:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:4848:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:4849:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:4856:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:4856:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:4857:4: enumLiteral_1= '\"out\"'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

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
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\21\3\22\14\uffff";
    static final String dfa_3s = "\1\37\1\122\2\23\14\uffff";
    static final String dfa_4s = "\4\uffff\1\4\1\1\1\11\1\6\1\3\1\2\1\13\1\10\1\12\1\14\1\7\1\5";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\uffff\1\1\12\uffff\1\2",
            "\1\10\1\7\1\uffff\1\5\6\uffff\1\4\1\uffff\1\11\23\uffff\1\13\16\uffff\1\6\5\uffff\1\14\5\uffff\1\15\4\uffff\1\12",
            "\1\10\1\7",
            "\1\17\1\16",
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
            return "275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\33\15\uffff";
    static final String dfa_9s = "\1\76\15\uffff";
    static final String dfa_10s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_11s = "\1\0\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\27\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 2394:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA49_0==27) ) {s = 1;}

                        else if ( LA49_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA49_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA49_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA49_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA49_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA49_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA49_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA49_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA49_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA49_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA49_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA49_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080120002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x000000000FF80000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000031E00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000031E08000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004008014000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008014000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000014000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C4008014000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0008014000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000014000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000104008014000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100008014000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003E00028008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003600028008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003600028000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003400028000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000028000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7FF8000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7FF8004008000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7FF8000008000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000040000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000044008004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000040008004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000004008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010000L});

}
