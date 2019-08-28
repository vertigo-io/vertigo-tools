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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'id'", "'label'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'alter'", "'required'", "'persistent'", "'expression'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'type'", "'inOut'", "'attribute'", "'Task'", "'request'", "'dtDefinition'", "'fieldName'", "'filter'", "'range'", "'FacetDefinition'", "'keyConcept'", "'domainCriteria'", "'listFilterBuilderClass'", "'listFilterBuilderQuery'", "'facets'", "'FacetedQueryDefinition'", "'dtIndex'", "'from'", "'indexCopyTo'", "'loaderId'", "'IndexDefinition'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"in\"'", "'\"out\"'"
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

                if ( (LA1_0==17||LA1_0==20||LA1_0==41) ) {
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
    // InternalVertigoDsl.g:268:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_AlterDomain_3= ruleAlterDomain | this_FileInfo_4= ruleFileInfo | this_DeclaredDomain_5= ruleDeclaredDomain | this_DtDefinition_6= ruleDtDefinition | this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition | this_AlterDtDefinition_8= ruleAlterDtDefinition | this_Association_9= ruleAssociation | this_TaskDefinition_10= ruleTaskDefinition | this_FacetDefinition_11= ruleFacetDefinition | this_IndexDefinition_12= ruleIndexDefinition | this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Formatter_1 = null;

        EObject this_Domain_2 = null;

        EObject this_AlterDomain_3 = null;

        EObject this_FileInfo_4 = null;

        EObject this_DeclaredDomain_5 = null;

        EObject this_DtDefinition_6 = null;

        EObject this_DeclaredDtDefinition_7 = null;

        EObject this_AlterDtDefinition_8 = null;

        EObject this_Association_9 = null;

        EObject this_TaskDefinition_10 = null;

        EObject this_FacetDefinition_11 = null;

        EObject this_IndexDefinition_12 = null;

        EObject this_FacetedQueryDefinition_13 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:274:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_AlterDomain_3= ruleAlterDomain | this_FileInfo_4= ruleFileInfo | this_DeclaredDomain_5= ruleDeclaredDomain | this_DtDefinition_6= ruleDtDefinition | this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition | this_AlterDtDefinition_8= ruleAlterDtDefinition | this_Association_9= ruleAssociation | this_TaskDefinition_10= ruleTaskDefinition | this_FacetDefinition_11= ruleFacetDefinition | this_IndexDefinition_12= ruleIndexDefinition | this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition ) )
            // InternalVertigoDsl.g:275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_AlterDomain_3= ruleAlterDomain | this_FileInfo_4= ruleFileInfo | this_DeclaredDomain_5= ruleDeclaredDomain | this_DtDefinition_6= ruleDtDefinition | this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition | this_AlterDtDefinition_8= ruleAlterDtDefinition | this_Association_9= ruleAssociation | this_TaskDefinition_10= ruleTaskDefinition | this_FacetDefinition_11= ruleFacetDefinition | this_IndexDefinition_12= ruleIndexDefinition | this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition )
            {
            // InternalVertigoDsl.g:275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_AlterDomain_3= ruleAlterDomain | this_FileInfo_4= ruleFileInfo | this_DeclaredDomain_5= ruleDeclaredDomain | this_DtDefinition_6= ruleDtDefinition | this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition | this_AlterDtDefinition_8= ruleAlterDtDefinition | this_Association_9= ruleAssociation | this_TaskDefinition_10= ruleTaskDefinition | this_FacetDefinition_11= ruleFacetDefinition | this_IndexDefinition_12= ruleIndexDefinition | this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition )
            int alt5=14;
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
                    // InternalVertigoDsl.g:303:3: this_AlterDomain_3= ruleAlterDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAlterDomainParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlterDomain_3=ruleAlterDomain();

                    state._fsp--;


                    			current = this_AlterDomain_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:312:3: this_FileInfo_4= ruleFileInfo
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFileInfoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileInfo_4=ruleFileInfo();

                    state._fsp--;


                    			current = this_FileInfo_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:321:3: this_DeclaredDomain_5= ruleDeclaredDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDomainParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDomain_5=ruleDeclaredDomain();

                    state._fsp--;


                    			current = this_DeclaredDomain_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:330:3: this_DtDefinition_6= ruleDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtDefinition_6=ruleDtDefinition();

                    state._fsp--;


                    			current = this_DtDefinition_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:339:3: this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDtDefinitionParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDtDefinition_7=ruleDeclaredDtDefinition();

                    state._fsp--;


                    			current = this_DeclaredDtDefinition_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:348:3: this_AlterDtDefinition_8= ruleAlterDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAlterDtDefinitionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlterDtDefinition_8=ruleAlterDtDefinition();

                    state._fsp--;


                    			current = this_AlterDtDefinition_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalVertigoDsl.g:357:3: this_Association_9= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAssociationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_9=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalVertigoDsl.g:366:3: this_TaskDefinition_10= ruleTaskDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTaskDefinitionParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskDefinition_10=ruleTaskDefinition();

                    state._fsp--;


                    			current = this_TaskDefinition_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalVertigoDsl.g:375:3: this_FacetDefinition_11= ruleFacetDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFacetDefinitionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_FacetDefinition_11=ruleFacetDefinition();

                    state._fsp--;


                    			current = this_FacetDefinition_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalVertigoDsl.g:384:3: this_IndexDefinition_12= ruleIndexDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getIndexDefinitionParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexDefinition_12=ruleIndexDefinition();

                    state._fsp--;


                    			current = this_IndexDefinition_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalVertigoDsl.g:393:3: this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFacetedQueryDefinitionParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_FacetedQueryDefinition_13=ruleFacetedQueryDefinition();

                    state._fsp--;


                    			current = this_FacetedQueryDefinition_13;
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
    // InternalVertigoDsl.g:405:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:405:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:406:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
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
    // InternalVertigoDsl.g:412:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:418:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:419:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:419:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:420:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:428:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:429:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:429:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:430:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:450:1: entryRuleDeclaredDtDefinition returns [EObject current=null] : iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF ;
    public final EObject entryRuleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDtDefinition = null;


        try {
            // InternalVertigoDsl.g:450:61: (iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF )
            // InternalVertigoDsl.g:451:2: iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF
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
    // InternalVertigoDsl.g:457:1: ruleDeclaredDtDefinition returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:463:2: ( (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:464:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:464:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:465:3: otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDtDefinitionAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:473:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:474:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:474:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:475:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:495:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:495:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:496:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalVertigoDsl.g:502:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // InternalVertigoDsl.g:508:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:509:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:509:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:510:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:518:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:519:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:519:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:520:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:548:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:549:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:549:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:550:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:566:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:567:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:575:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:576:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:576:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:577:6: lv_args_9_0= RULE_STRING
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

            // InternalVertigoDsl.g:594:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:595:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:603:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:604:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:604:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:605:6: lv_msg_12_0= RULE_STRING
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
    // InternalVertigoDsl.g:630:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:630:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:631:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:637:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:643:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:644:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:644:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:645:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:653:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:654:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:654:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:655:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:683:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:684:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:684:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:685:5: lv_storeName_6_0= RULE_STRING
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
    // InternalVertigoDsl.g:709:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:709:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:710:2: iv_ruleFormatter= ruleFormatter EOF
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
    // InternalVertigoDsl.g:716:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:722:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:723:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:723:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:724:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:732:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:733:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:733:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:734:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:762:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:763:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:763:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:764:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:780:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVertigoDsl.g:781:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:789:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:790:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:790:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:791:6: lv_args_9_0= RULE_STRING
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
    // InternalVertigoDsl.g:816:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:816:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:817:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:823:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_storeType_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_indexType_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_unit_29_0=null;
        Token otherlv_30=null;
        Enumerator lv_dataType_6_0 = null;

        Enumerator lv_multiple_26_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:829:2: ( (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) )
            // InternalVertigoDsl.g:830:2: (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            {
            // InternalVertigoDsl.g:830:2: (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            // InternalVertigoDsl.g:831:3: otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:839:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:840:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:840:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:841:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getDataTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:869:3: ( (lv_dataType_6_0= ruleDataType ) )
            // InternalVertigoDsl.g:870:4: (lv_dataType_6_0= ruleDataType )
            {
            // InternalVertigoDsl.g:870:4: (lv_dataType_6_0= ruleDataType )
            // InternalVertigoDsl.g:871:5: lv_dataType_6_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_dataType_6_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_6_0,
            						"io.vertigo.dsl.VertigoDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:888:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:889:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:889:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:890:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				
            // InternalVertigoDsl.g:893:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:894:6: ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:894:6: ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=7;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4) ) {
                    alt11=5;
                }
                else if ( LA11_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5) ) {
                    alt11=6;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVertigoDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:896:5: {...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalVertigoDsl.g:896:103: ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:897:6: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalVertigoDsl.g:900:9: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:900:10: {...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:900:19: (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:900:20: otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,32,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDomainAccess().getFormatterKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getColonKeyword_7_0_1());
            	    								
            	    // InternalVertigoDsl.g:908:9: ( (otherlv_10= RULE_ID ) )
            	    // InternalVertigoDsl.g:909:10: (otherlv_10= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:909:10: (otherlv_10= RULE_ID )
            	    // InternalVertigoDsl.g:910:11: otherlv_10= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    										
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    											newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_7_0_2_0());
            	    										

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
            	    // InternalVertigoDsl.g:927:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:927:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:928:5: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalVertigoDsl.g:928:103: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:929:6: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalVertigoDsl.g:932:9: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:932:10: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:932:19: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:932:20: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getStoreTypeKeyword_7_1_0());
            	    								
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getColonKeyword_7_1_1());
            	    								
            	    // InternalVertigoDsl.g:940:9: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:941:10: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:941:10: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:942:11: lv_storeType_13_0= RULE_STRING
            	    {
            	    lv_storeType_13_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_storeType_13_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_7_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"storeType",
            	    												lv_storeType_13_0,
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
            	    // InternalVertigoDsl.g:964:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:964:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:965:5: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalVertigoDsl.g:965:103: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:966:6: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalVertigoDsl.g:969:9: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:969:10: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:969:19: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:969:20: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,34,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getIndexTypeKeyword_7_2_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getColonKeyword_7_2_1());
            	    								
            	    // InternalVertigoDsl.g:977:9: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:978:10: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:978:10: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:979:11: lv_indexType_16_0= RULE_STRING
            	    {
            	    lv_indexType_16_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_indexType_16_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_7_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"indexType",
            	    												lv_indexType_16_0,
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
            	    // InternalVertigoDsl.g:1001:4: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1001:4: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalVertigoDsl.g:1002:5: {...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1002:103: ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    // InternalVertigoDsl.g:1003:6: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3);
            	    					
            	    // InternalVertigoDsl.g:1006:9: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    // InternalVertigoDsl.g:1006:10: {...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1006:19: (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    // InternalVertigoDsl.g:1006:20: otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']'
            	    {
            	    otherlv_17=(Token)match(input,35,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getConstraintKeyword_7_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getColonKeyword_7_3_1());
            	    								
            	    otherlv_19=(Token)match(input,36,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_7_3_2());
            	    								
            	    // InternalVertigoDsl.g:1018:9: ( (otherlv_20= RULE_ID ) )
            	    // InternalVertigoDsl.g:1019:10: (otherlv_20= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1019:10: (otherlv_20= RULE_ID )
            	    // InternalVertigoDsl.g:1020:11: otherlv_20= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    										
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    											newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_7_3_3_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1031:9: ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==37) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:1032:10: (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:1032:10: (otherlv_21= ',' )+
            	    	    int cnt9=0;
            	    	    loop9:
            	    	    do {
            	    	        int alt9=2;
            	    	        int LA9_0 = input.LA(1);

            	    	        if ( (LA9_0==37) ) {
            	    	            alt9=1;
            	    	        }


            	    	        switch (alt9) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:1033:11: otherlv_21= ','
            	    	    	    {
            	    	    	    otherlv_21=(Token)match(input,37,FOLLOW_28); 

            	    	    	    											newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getCommaKeyword_7_3_4_0());
            	    	    	    										

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt9 >= 1 ) break loop9;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(9, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt9++;
            	    	    } while (true);

            	    	    // InternalVertigoDsl.g:1038:10: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:1039:11: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:1039:11: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:1040:12: otherlv_22= RULE_ID
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getDomainRule());
            	    	    												}
            	    	    											
            	    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    	    												newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_7_3_4_1_0());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,38,FOLLOW_25); 

            	    									newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_7_3_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:1062:4: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1062:4: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1063:5: {...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // InternalVertigoDsl.g:1063:103: ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1064:6: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 4);
            	    					
            	    // InternalVertigoDsl.g:1067:9: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1067:10: {...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1067:19: (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1067:20: otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) )
            	    {
            	    otherlv_24=(Token)match(input,39,FOLLOW_13); 

            	    									newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getMultipleKeyword_7_4_0());
            	    								
            	    otherlv_25=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getColonKeyword_7_4_1());
            	    								
            	    // InternalVertigoDsl.g:1075:9: ( (lv_multiple_26_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1076:10: (lv_multiple_26_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1076:10: (lv_multiple_26_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1077:11: lv_multiple_26_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_7_4_2_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_multiple_26_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDomainRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiple",
            	    												lv_multiple_26_0,
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
            	    // InternalVertigoDsl.g:1100:4: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1100:4: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1101:5: {...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // InternalVertigoDsl.g:1101:103: ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1102:6: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 5);
            	    					
            	    // InternalVertigoDsl.g:1105:9: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1105:10: {...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1105:19: (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1105:20: otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) )
            	    {
            	    otherlv_27=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getUnitKeyword_7_5_0());
            	    								
            	    otherlv_28=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_28, grammarAccess.getDomainAccess().getColonKeyword_7_5_1());
            	    								
            	    // InternalVertigoDsl.g:1113:9: ( (lv_unit_29_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1114:10: (lv_unit_29_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1114:10: (lv_unit_29_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1115:11: lv_unit_29_0= RULE_STRING
            	    {
            	    lv_unit_29_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_unit_29_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_7_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"unit",
            	    												lv_unit_29_0,
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				

            }

            otherlv_30=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleAlterDomain"
    // InternalVertigoDsl.g:1153:1: entryRuleAlterDomain returns [EObject current=null] : iv_ruleAlterDomain= ruleAlterDomain EOF ;
    public final EObject entryRuleAlterDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDomain = null;


        try {
            // InternalVertigoDsl.g:1153:52: (iv_ruleAlterDomain= ruleAlterDomain EOF )
            // InternalVertigoDsl.g:1154:2: iv_ruleAlterDomain= ruleAlterDomain EOF
            {
             newCompositeNode(grammarAccess.getAlterDomainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterDomain=ruleAlterDomain();

            state._fsp--;

             current =iv_ruleAlterDomain; 
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
    // $ANTLR end "entryRuleAlterDomain"


    // $ANTLR start "ruleAlterDomain"
    // InternalVertigoDsl.g:1160:1: ruleAlterDomain returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) ;
    public final EObject ruleAlterDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_storeType_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_indexType_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_unit_29_0=null;
        Token otherlv_30=null;
        Enumerator lv_dataType_6_0 = null;

        Enumerator lv_multiple_26_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1166:2: ( (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) )
            // InternalVertigoDsl.g:1167:2: (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            {
            // InternalVertigoDsl.g:1167:2: (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            // InternalVertigoDsl.g:1168:3: otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDomainAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:1176:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:1177:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:1177:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:1178:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDomainRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDomainAccess().getDomainDomainTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAlterDomainAccess().getDataTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getAlterDomainAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:1201:3: ( (lv_dataType_6_0= ruleDataType ) )
            // InternalVertigoDsl.g:1202:4: (lv_dataType_6_0= ruleDataType )
            {
            // InternalVertigoDsl.g:1202:4: (lv_dataType_6_0= ruleDataType )
            // InternalVertigoDsl.g:1203:5: lv_dataType_6_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAlterDomainAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_24);
            lv_dataType_6_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlterDomainRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_6_0,
            						"io.vertigo.dsl.VertigoDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:1220:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1221:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1221:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1222:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            				
            // InternalVertigoDsl.g:1225:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1226:6: ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1226:6: ( ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVertigoDsl.g:1227:4: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1227:4: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1228:5: {...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1228:108: ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:1229:6: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalVertigoDsl.g:1232:9: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:1232:10: {...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1232:19: (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:1232:20: otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,32,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAlterDomainAccess().getFormatterKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAlterDomainAccess().getColonKeyword_7_0_1());
            	    								
            	    // InternalVertigoDsl.g:1240:9: ( (otherlv_10= RULE_ID ) )
            	    // InternalVertigoDsl.g:1241:10: (otherlv_10= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1241:10: (otherlv_10= RULE_ID )
            	    // InternalVertigoDsl.g:1242:11: otherlv_10= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    										
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    											newLeafNode(otherlv_10, grammarAccess.getAlterDomainAccess().getFormatterFormatterCrossReference_7_0_2_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1259:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1259:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1260:5: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1260:108: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1261:6: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalVertigoDsl.g:1264:9: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1264:10: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1264:19: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1264:20: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAlterDomainAccess().getStoreTypeKeyword_7_1_0());
            	    								
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAlterDomainAccess().getColonKeyword_7_1_1());
            	    								
            	    // InternalVertigoDsl.g:1272:9: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1273:10: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1273:10: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1274:11: lv_storeType_13_0= RULE_STRING
            	    {
            	    lv_storeType_13_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_storeType_13_0, grammarAccess.getAlterDomainAccess().getStoreTypeSTRINGTerminalRuleCall_7_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"storeType",
            	    												lv_storeType_13_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1296:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1296:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1297:5: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1297:108: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1298:6: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalVertigoDsl.g:1301:9: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1301:10: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1301:19: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1301:20: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,34,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAlterDomainAccess().getIndexTypeKeyword_7_2_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getAlterDomainAccess().getColonKeyword_7_2_1());
            	    								
            	    // InternalVertigoDsl.g:1309:9: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1310:10: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1310:10: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1311:11: lv_indexType_16_0= RULE_STRING
            	    {
            	    lv_indexType_16_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_indexType_16_0, grammarAccess.getAlterDomainAccess().getIndexTypeSTRINGTerminalRuleCall_7_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"indexType",
            	    												lv_indexType_16_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalVertigoDsl.g:1334:5: {...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1334:108: ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    // InternalVertigoDsl.g:1335:6: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3);
            	    					
            	    // InternalVertigoDsl.g:1338:9: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    // InternalVertigoDsl.g:1338:10: {...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1338:19: (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    // InternalVertigoDsl.g:1338:20: otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']'
            	    {
            	    otherlv_17=(Token)match(input,35,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAlterDomainAccess().getConstraintKeyword_7_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAlterDomainAccess().getColonKeyword_7_3_1());
            	    								
            	    otherlv_19=(Token)match(input,36,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAlterDomainAccess().getLeftSquareBracketKeyword_7_3_2());
            	    								
            	    // InternalVertigoDsl.g:1350:9: ( (otherlv_20= RULE_ID ) )
            	    // InternalVertigoDsl.g:1351:10: (otherlv_20= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1351:10: (otherlv_20= RULE_ID )
            	    // InternalVertigoDsl.g:1352:11: otherlv_20= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    										
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    											newLeafNode(otherlv_20, grammarAccess.getAlterDomainAccess().getConstraintConstraintCrossReference_7_3_3_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1363:9: ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==37) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:1364:10: (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:1364:10: (otherlv_21= ',' )+
            	    	    int cnt12=0;
            	    	    loop12:
            	    	    do {
            	    	        int alt12=2;
            	    	        int LA12_0 = input.LA(1);

            	    	        if ( (LA12_0==37) ) {
            	    	            alt12=1;
            	    	        }


            	    	        switch (alt12) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:1365:11: otherlv_21= ','
            	    	    	    {
            	    	    	    otherlv_21=(Token)match(input,37,FOLLOW_28); 

            	    	    	    											newLeafNode(otherlv_21, grammarAccess.getAlterDomainAccess().getCommaKeyword_7_3_4_0());
            	    	    	    										

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

            	    	    // InternalVertigoDsl.g:1370:10: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:1371:11: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:1371:11: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:1372:12: otherlv_22= RULE_ID
            	    	    {

            	    	    												if (current==null) {
            	    	    													current = createModelElement(grammarAccess.getAlterDomainRule());
            	    	    												}
            	    	    											
            	    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    	    												newLeafNode(otherlv_22, grammarAccess.getAlterDomainAccess().getConstraintsConstraintCrossReference_7_3_4_1_0());
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,38,FOLLOW_25); 

            	    									newLeafNode(otherlv_23, grammarAccess.getAlterDomainAccess().getRightSquareBracketKeyword_7_3_5());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:1394:4: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1394:4: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1395:5: {...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 4)");
            	    }
            	    // InternalVertigoDsl.g:1395:108: ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1396:6: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 4);
            	    					
            	    // InternalVertigoDsl.g:1399:9: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1399:10: {...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1399:19: (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1399:20: otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) )
            	    {
            	    otherlv_24=(Token)match(input,39,FOLLOW_13); 

            	    									newLeafNode(otherlv_24, grammarAccess.getAlterDomainAccess().getMultipleKeyword_7_4_0());
            	    								
            	    otherlv_25=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAlterDomainAccess().getColonKeyword_7_4_1());
            	    								
            	    // InternalVertigoDsl.g:1407:9: ( (lv_multiple_26_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1408:10: (lv_multiple_26_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1408:10: (lv_multiple_26_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1409:11: lv_multiple_26_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAlterDomainAccess().getMultipleBooleanStringEnumRuleCall_7_4_2_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_multiple_26_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAlterDomainRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiple",
            	    												lv_multiple_26_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVertigoDsl.g:1432:4: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1432:4: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1433:5: {...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 5)");
            	    }
            	    // InternalVertigoDsl.g:1433:108: ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1434:6: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 5);
            	    					
            	    // InternalVertigoDsl.g:1437:9: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1437:10: {...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1437:19: (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1437:20: otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) )
            	    {
            	    otherlv_27=(Token)match(input,40,FOLLOW_13); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAlterDomainAccess().getUnitKeyword_7_5_0());
            	    								
            	    otherlv_28=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_28, grammarAccess.getAlterDomainAccess().getColonKeyword_7_5_1());
            	    								
            	    // InternalVertigoDsl.g:1445:9: ( (lv_unit_29_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1446:10: (lv_unit_29_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1446:10: (lv_unit_29_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1447:11: lv_unit_29_0= RULE_STRING
            	    {
            	    lv_unit_29_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_unit_29_0, grammarAccess.getAlterDomainAccess().getUnitSTRINGTerminalRuleCall_7_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"unit",
            	    												lv_unit_29_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7()) ) {
                throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            				

            }

            otherlv_30=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getAlterDomainAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAlterDomain"


    // $ANTLR start "entryRuleRefToDomainType"
    // InternalVertigoDsl.g:1485:1: entryRuleRefToDomainType returns [EObject current=null] : iv_ruleRefToDomainType= ruleRefToDomainType EOF ;
    public final EObject entryRuleRefToDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToDomainType = null;


        try {
            // InternalVertigoDsl.g:1485:56: (iv_ruleRefToDomainType= ruleRefToDomainType EOF )
            // InternalVertigoDsl.g:1486:2: iv_ruleRefToDomainType= ruleRefToDomainType EOF
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
    // InternalVertigoDsl.g:1492:1: ruleRefToDomainType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefToDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1498:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:1499:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:1499:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVertigoDsl.g:1500:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVertigoDsl.g:1500:3: ()
            // InternalVertigoDsl.g:1501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefToDomainTypeAccess().getRefToDomainTypeAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:1507:3: ( (otherlv_1= RULE_ID ) )
            // InternalVertigoDsl.g:1508:4: (otherlv_1= RULE_ID )
            {
            // InternalVertigoDsl.g:1508:4: (otherlv_1= RULE_ID )
            // InternalVertigoDsl.g:1509:5: otherlv_1= RULE_ID
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
    // InternalVertigoDsl.g:1524:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1524:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1525:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
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
    // InternalVertigoDsl.g:1531:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:1537:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1538:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1538:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1539:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1543:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1544:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1544:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1545:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1548:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1549:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1549:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVertigoDsl.g:1550:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1550:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1551:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1551:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1552:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1555:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1555:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1555:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1555:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1563:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1564:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1564:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1565:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:1582:9: (otherlv_5= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==37) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1583:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,37,FOLLOW_32); 

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
            	    // InternalVertigoDsl.g:1594:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1594:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1595:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1595:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1596:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1599:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1599:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1599:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1599:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1607:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1608:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1608:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1609:11: lv_label_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:1625:9: (otherlv_9= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==37) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1626:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_32); 

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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
    // InternalVertigoDsl.g:1653:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1653:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1654:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
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
    // InternalVertigoDsl.g:1660:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
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
            // InternalVertigoDsl.g:1666:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1667:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1667:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1668:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1672:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1673:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1673:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1674:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1677:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1678:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1678:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=5;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt22=4;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVertigoDsl.g:1679:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1679:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1680:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1680:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1681:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1684:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1684:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1684:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1684:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1692:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1693:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1693:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1694:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:1711:9: (otherlv_5= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==37) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1712:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,37,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1723:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1723:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1724:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1724:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1725:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1728:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1728:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1728:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1728:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1736:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1737:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1737:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1738:11: lv_label_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:1754:9: (otherlv_9= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==37) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1755:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1766:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1766:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1767:5: {...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1767:124: ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1768:6: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1771:9: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1771:10: {...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1771:19: (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1771:20: otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1779:9: ( (lv_required_12_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1780:10: (lv_required_12_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1780:10: (lv_required_12_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1781:11: lv_required_12_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:1798:9: (otherlv_13= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==37) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1799:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,37,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1810:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1810:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1811:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1811:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1812:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1815:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1815:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1815:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1815:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,43,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1823:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1824:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1824:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1825:11: lv_persistent_16_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:1842:9: (otherlv_17= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==37) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1843:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,37,FOLLOW_35); 

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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalVertigoDsl.g:1870:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1870:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1871:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
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
    // InternalVertigoDsl.g:1877:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:1883:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:1884:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:1884:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:1885:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1889:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1890:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1890:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1891:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1894:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1895:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1895:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=4;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt26=3;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalVertigoDsl.g:1896:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1896:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1897:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1897:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1898:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1901:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1901:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1901:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1901:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1909:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1910:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1910:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1911:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:1928:9: (otherlv_5= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==37) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1929:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,37,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1940:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1940:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1941:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1941:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1942:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1945:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1945:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1945:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1945:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1953:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1954:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1954:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1955:11: lv_label_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:1971:9: (otherlv_9= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==37) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1972:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1983:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1983:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1984:5: {...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1984:128: ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1985:6: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1988:9: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1988:10: {...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1988:19: (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1988:20: otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,44,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1996:9: ( (lv_expressionString_12_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1997:10: (lv_expressionString_12_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1997:10: (lv_expressionString_12_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1998:11: lv_expressionString_12_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:2014:9: (otherlv_13= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==37) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2015:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,37,FOLLOW_38); 

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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalVertigoDsl.g:2042:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:2042:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:2043:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
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
    // InternalVertigoDsl.g:2049:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2055:2: ( (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2056:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2056:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2057:3: otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:2061:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2062:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2062:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2063:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdFieldAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionIdFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:2080:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:2081:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:2081:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:2082:5: lv_idString_2_0= ruleDtDefinitionIdString
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

            // InternalVertigoDsl.g:2099:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:2100:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2109:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:2109:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:2110:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
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
    // InternalVertigoDsl.g:2116:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2122:2: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2123:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2123:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2124:3: otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:2128:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2129:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2129:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2130:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:2147:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:2148:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:2148:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:2149:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
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

            // InternalVertigoDsl.g:2166:3: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:2167:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2176:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:2176:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:2177:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
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
    // InternalVertigoDsl.g:2183:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2189:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2190:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2190:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2191:3: otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:2195:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2196:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2196:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2197:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getDtDefinitionComputedFieldAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionComputedFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:2214:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:2215:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:2215:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:2216:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
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

            // InternalVertigoDsl.g:2233:3: (otherlv_3= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:2234:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2243:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:2243:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:2244:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:2250:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2256:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2257:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2257:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2258:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2266:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2267:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2267:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2268:5: lv_stereoType_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:2284:3: (otherlv_3= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:2285:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2294:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:2294:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:2295:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
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
    // InternalVertigoDsl.g:2301:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2307:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2308:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2308:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2309:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2317:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2318:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2318:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2319:5: lv_storeName_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:2335:3: (otherlv_3= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVertigoDsl.g:2336:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2345:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:2345:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:2346:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
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
    // InternalVertigoDsl.g:2352:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2358:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2359:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2359:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2360:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2368:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2369:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2369:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2370:5: lv_displayField_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:2386:3: (otherlv_3= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVertigoDsl.g:2387:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2396:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:2396:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:2397:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
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
    // InternalVertigoDsl.g:2403:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2409:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2410:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2410:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2411:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2419:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2420:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2420:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2421:5: lv_sortField_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:2437:3: (otherlv_3= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVertigoDsl.g:2438:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2447:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2447:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:2448:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:2454:1: ruleDtDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_13=null;
        EObject lv_dtDefinitionStereotype_5_0 = null;

        EObject lv_dtDefinitionIdField_6_0 = null;

        EObject lv_dtDefinitionDataFields_7_0 = null;

        EObject lv_dtDefinitionComputedFields_8_0 = null;

        EObject lv_dtDefinitionDataSpace_10_0 = null;

        EObject lv_dtDefinitionSortField_11_0 = null;

        EObject lv_dtDefinitionDisplayField_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2460:2: ( (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalVertigoDsl.g:2461:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:2461:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalVertigoDsl.g:2462:3: otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2470:3: ()
            // InternalVertigoDsl.g:2471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDtDefinitionAccess().getDtDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:2477:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:2478:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2478:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:2479:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:2499:3: ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVertigoDsl.g:2500:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2500:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2501:5: lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_dtDefinitionStereotype_5_0=ruleDtDefinitionStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionStereotype",
                    						lv_dtDefinitionStereotype_5_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionStereotype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2518:3: ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVertigoDsl.g:2519:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2519:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2520:5: lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_dtDefinitionIdField_6_0=ruleDtDefinitionIdField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionIdField",
                    						lv_dtDefinitionIdField_6_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionIdField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2537:3: ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVertigoDsl.g:2538:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2538:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2539:5: lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_dtDefinitionDataFields_7_0=ruleDtDefinitionDataField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionDataFields",
            	    						lv_dtDefinitionDataFields_7_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // InternalVertigoDsl.g:2556:3: ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVertigoDsl.g:2557:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2557:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2558:5: lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_dtDefinitionComputedFields_8_0=ruleDtDefinitionComputedField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionComputedFields",
            	    						lv_dtDefinitionComputedFields_8_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionComputedField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalVertigoDsl.g:2575:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2576:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2576:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2577:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2580:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2581:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2581:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
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
            	    // InternalVertigoDsl.g:2582:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2582:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2583:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2583:109: ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2584:6: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2587:9: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2587:10: {...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2587:19: ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2587:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2587:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2588:10: lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionDataSpace_10_0=ruleDtDefinitionDataSpace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDataSpace",
            	    											lv_dtDefinitionDataSpace_10_0,
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
            	    // InternalVertigoDsl.g:2610:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2610:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2611:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2611:109: ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2612:6: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2615:9: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2615:10: {...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2615:19: ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2615:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2615:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2616:10: lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionSortField_11_0=ruleDtDefinitionSortField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionSortField",
            	    											lv_dtDefinitionSortField_11_0,
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
            	    // InternalVertigoDsl.g:2638:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2638:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2639:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2639:109: ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2640:6: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:2643:9: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2643:10: {...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2643:19: ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2643:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2643:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2644:10: lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionDisplayField_12_0=ruleDtDefinitionDisplayField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDisplayField",
            	    											lv_dtDefinitionDisplayField_12_0,
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

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleAlterDtDefinition"
    // InternalVertigoDsl.g:2681:1: entryRuleAlterDtDefinition returns [EObject current=null] : iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF ;
    public final EObject entryRuleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2681:58: (iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF )
            // InternalVertigoDsl.g:2682:2: iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF
            {
             newCompositeNode(grammarAccess.getAlterDtDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterDtDefinition=ruleAlterDtDefinition();

            state._fsp--;

             current =iv_ruleAlterDtDefinition; 
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
    // $ANTLR end "entryRuleAlterDtDefinition"


    // $ANTLR start "ruleAlterDtDefinition"
    // InternalVertigoDsl.g:2688:1: ruleAlterDtDefinition returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) ;
    public final EObject ruleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_12=null;
        EObject lv_dtDefinitionStereotype_4_0 = null;

        EObject lv_dtDefinitionIdField_5_0 = null;

        EObject lv_dtDefinitionDataFields_6_0 = null;

        EObject lv_dtDefinitionComputedFields_7_0 = null;

        EObject lv_dtDefinitionDataSpace_9_0 = null;

        EObject lv_dtDefinitionSortField_10_0 = null;

        EObject lv_dtDefinitionDisplayField_11_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2694:2: ( (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // InternalVertigoDsl.g:2695:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // InternalVertigoDsl.g:2695:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // InternalVertigoDsl.g:2696:3: otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDtDefinitionAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2704:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:2705:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:2705:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:2706:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitioneDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterDtDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2721:3: ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVertigoDsl.g:2722:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2722:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2723:5: lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_41);
                    lv_dtDefinitionStereotype_4_0=ruleDtDefinitionStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionStereotype",
                    						lv_dtDefinitionStereotype_4_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionStereotype");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2740:3: ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVertigoDsl.g:2741:4: (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2741:4: (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2742:5: lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_dtDefinitionIdField_5_0=ruleDtDefinitionIdField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionIdField",
                    						lv_dtDefinitionIdField_5_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionIdField");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2759:3: ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==45) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalVertigoDsl.g:2760:4: (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2760:4: (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2761:5: lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_dtDefinitionDataFields_6_0=ruleDtDefinitionDataField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionDataFields",
            	    						lv_dtDefinitionDataFields_6_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            // InternalVertigoDsl.g:2778:3: ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==46) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalVertigoDsl.g:2779:4: (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2779:4: (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2780:5: lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_43);
            	    lv_dtDefinitionComputedFields_7_0=ruleDtDefinitionComputedField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionComputedFields",
            	    						lv_dtDefinitionComputedFields_7_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionComputedField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalVertigoDsl.g:2797:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2798:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2798:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2799:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            				
            // InternalVertigoDsl.g:2802:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2803:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2803:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop43:
            do {
                int alt43=4;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
                    alt43=2;
                }
                else if ( LA43_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
                    alt43=3;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalVertigoDsl.g:2804:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2804:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2805:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2805:114: ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2806:6: ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0);
            	    					
            	    // InternalVertigoDsl.g:2809:9: ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2809:10: {...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2809:19: ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2809:20: (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2809:20: (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2810:10: lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_8_0_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionDataSpace_9_0=ruleDtDefinitionDataSpace();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDataSpace",
            	    											lv_dtDefinitionDataSpace_9_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionDataSpace");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2832:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2832:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2833:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2833:114: ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2834:6: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1);
            	    					
            	    // InternalVertigoDsl.g:2837:9: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2837:10: {...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2837:19: ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2837:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2837:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2838:10: lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_8_1_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionSortField_10_0=ruleDtDefinitionSortField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionSortField",
            	    											lv_dtDefinitionSortField_10_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionSortField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2860:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2860:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2861:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2861:114: ( ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2862:6: ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2);
            	    					
            	    // InternalVertigoDsl.g:2865:9: ({...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2865:10: {...}? => ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2865:19: ( (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2865:20: (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2865:20: (lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2866:10: lv_dtDefinitionDisplayField_11_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_8_2_0());
            	    									
            	    pushFollow(FOLLOW_44);
            	    lv_dtDefinitionDisplayField_11_0=ruleDtDefinitionDisplayField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionDisplayField",
            	    											lv_dtDefinitionDisplayField_11_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionDisplayField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            				

            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getAlterDtDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleAlterDtDefinition"


    // $ANTLR start "entryRuleAssociation"
    // InternalVertigoDsl.g:2903:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:2903:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:2904:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:2910:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
            // InternalVertigoDsl.g:2916:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:2917:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:2917:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:2918:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:2926:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:2927:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2927:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:2928:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:2948:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2949:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2949:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2950:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:2953:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2954:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2954:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=13;
                alt55 = dfa55.predict(input);
                switch (alt55) {
            	case 1 :
            	    // InternalVertigoDsl.g:2955:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2955:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2956:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2956:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2957:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:2960:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:2960:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2960:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:2960:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,51,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:2968:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2969:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2969:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2970:11: lv_fkFieldName_7_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:2986:9: (otherlv_8= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==37) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2987:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2998:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2998:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2999:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2999:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3000:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:3003:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:3003:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3003:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:3003:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:3011:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:3012:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3012:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:3013:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3024:9: (otherlv_12= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==37) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3025:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3036:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3036:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3037:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3037:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3038:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:3041:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:3041:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3041:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:3041:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:3049:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:3050:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3050:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:3051:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3062:9: (otherlv_16= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==37) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3063:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3074:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3074:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3075:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:3075:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3076:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:3079:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:3079:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3079:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:3079:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:3087:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3088:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3088:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3089:11: lv_navigabilityA_19_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:3106:9: (otherlv_20= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==37) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3107:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3118:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3118:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3119:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:3119:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3120:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:3123:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:3123:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3123:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:3123:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,55,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:3131:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3132:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3132:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3133:11: lv_navigabilityB_23_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:3150:9: (otherlv_24= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==37) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3151:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3162:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3162:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3163:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:3163:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3164:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:3167:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:3167:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3167:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:3167:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,56,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_49); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:3175:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3176:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3176:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3177:11: lv_multiplicityA_27_0= ruleMultiplicityString
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

            	    // InternalVertigoDsl.g:3194:9: (otherlv_28= ',' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==37) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3195:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3206:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3206:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3207:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:3207:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3208:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:3211:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:3211:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3211:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:3211:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,24,FOLLOW_49); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:3219:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3220:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3220:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3221:11: lv_multiplicityB_31_0= ruleMultiplicityString
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

            	    // InternalVertigoDsl.g:3238:9: (otherlv_32= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==37) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3239:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3250:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3250:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3251:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:3251:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3252:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:3255:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:3255:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3255:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:3255:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,58,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:3263:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3264:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3264:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3265:11: lv_labelA_35_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:3281:9: (otherlv_36= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==37) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3282:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3293:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3293:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3294:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:3294:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3295:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:3298:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:3298:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3298:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:3298:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:3306:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3307:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3307:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3308:11: lv_labelB_39_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:3324:9: (otherlv_40= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==37) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3325:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3336:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3336:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3337:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:3337:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3338:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:3341:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:3341:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3341:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:3341:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,60,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:3349:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3350:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3350:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3351:11: lv_roleA_43_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:3367:9: (otherlv_44= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==37) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3368:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3379:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3379:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3380:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:3380:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3381:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:3384:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:3384:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3384:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:3384:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,61,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:3392:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3393:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3393:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3394:11: lv_roleB_47_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:3410:9: (otherlv_48= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==37) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3411:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,37,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:3422:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3422:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:3423:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:3423:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:3424:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:3427:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:3427:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3427:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:3427:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) )
            	    {
            	    otherlv_49=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:3435:9: ( (lv_type_51_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3436:10: (lv_type_51_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3436:10: (lv_type_51_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3437:11: lv_type_51_0= RULE_STRING
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
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
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
    // InternalVertigoDsl.g:3475:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:3475:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:3476:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:3482:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:3488:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3489:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3489:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:3490:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:3494:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3495:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3495:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3496:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:3499:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3500:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3500:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=4;
                int LA59_0 = input.LA(1);

                if ( LA59_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt59=2;
                }
                else if ( LA59_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt59=3;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalVertigoDsl.g:3501:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3501:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3502:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3502:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3503:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:3506:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:3506:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3506:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:3506:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:3514:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:3515:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:3515:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:3516:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:3533:9: (otherlv_5= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==37) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3534:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,37,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:3545:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3545:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3546:5: {...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3546:116: ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3547:6: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:3550:9: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:3550:10: {...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3550:19: (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:3550:20: otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getRequiredKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_29); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:3558:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3559:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3559:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3560:11: lv_required_8_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:3577:9: (otherlv_9= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==37) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3578:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:3589:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3589:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3590:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3590:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3591:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:3594:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:3594:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3594:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:3594:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_53); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:3602:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:3603:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:3603:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:3604:11: lv_inout_12_0= ruleInOutString
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

            	    // InternalVertigoDsl.g:3621:9: (otherlv_13= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==37) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3622:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,37,FOLLOW_52); 

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
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // InternalVertigoDsl.g:3649:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:3649:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:3650:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
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
    // InternalVertigoDsl.g:3656:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3662:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3663:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3663:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3664:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:3668:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3669:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3669:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3670:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:3686:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3687:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3687:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3688:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
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

            // InternalVertigoDsl.g:3705:3: (otherlv_3= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==37) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVertigoDsl.g:3706:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3715:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3715:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3716:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:3722:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3728:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3729:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3729:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3730:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3738:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3739:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3739:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3740:5: lv_storeName_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:3756:3: (otherlv_3= ',' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalVertigoDsl.g:3757:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3766:1: entryRuleTaskRequestString returns [EObject current=null] : iv_ruleTaskRequestString= ruleTaskRequestString EOF ;
    public final EObject entryRuleTaskRequestString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequestString = null;


        try {
            // InternalVertigoDsl.g:3766:58: (iv_ruleTaskRequestString= ruleTaskRequestString EOF )
            // InternalVertigoDsl.g:3767:2: iv_ruleTaskRequestString= ruleTaskRequestString EOF
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
    // InternalVertigoDsl.g:3773:1: ruleTaskRequestString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleTaskRequestString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3779:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:3780:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalVertigoDsl.g:3780:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3781:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3781:3: (lv_string_0_0= RULE_STRING )
            // InternalVertigoDsl.g:3782:4: lv_string_0_0= RULE_STRING
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
    // InternalVertigoDsl.g:3801:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3801:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3802:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:3808:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:3814:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3815:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3815:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            // InternalVertigoDsl.g:3816:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3824:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3825:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3825:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3826:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:3854:3: ( (lv_classname_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3855:4: (lv_classname_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3855:4: (lv_classname_6_0= RULE_STRING )
            // InternalVertigoDsl.g:3856:5: lv_classname_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:3872:3: (otherlv_7= ',' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVertigoDsl.g:3873:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRequestKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getColonKeyword_9());
            		
            // InternalVertigoDsl.g:3886:3: ( (lv_request_10_0= ruleTaskRequestString ) )
            // InternalVertigoDsl.g:3887:4: (lv_request_10_0= ruleTaskRequestString )
            {
            // InternalVertigoDsl.g:3887:4: (lv_request_10_0= ruleTaskRequestString )
            // InternalVertigoDsl.g:3888:5: lv_request_10_0= ruleTaskRequestString
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

            // InternalVertigoDsl.g:3905:3: (otherlv_11= ',' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalVertigoDsl.g:3906:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,37,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalVertigoDsl.g:3911:3: ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==64) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalVertigoDsl.g:3912:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:3912:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:3913:5: lv_taskAttributes_12_0= ruleTaskAttribute
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
            	    break loop64;
                }
            } while (true);

            // InternalVertigoDsl.g:3930:3: ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalVertigoDsl.g:3931:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:3931:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:3932:5: lv_taskDataSpace_13_0= ruleTaskDataSpace
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
    // InternalVertigoDsl.g:3957:1: entryRuleFacetDefinitionDtDefinition returns [EObject current=null] : iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF ;
    public final EObject entryRuleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionDtDefinition = null;


        try {
            // InternalVertigoDsl.g:3957:68: (iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF )
            // InternalVertigoDsl.g:3958:2: iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF
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
    // InternalVertigoDsl.g:3964:1: ruleFacetDefinitionDtDefinition returns [EObject current=null] : (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3970:2: ( (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3971:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3971:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3972:3: otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionDtDefinitionAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3980:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:3981:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:3981:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:3982:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:3993:3: (otherlv_3= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==37) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalVertigoDsl.g:3994:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4003:1: entryRuleFacetDefinitionFieldName returns [EObject current=null] : iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF ;
    public final EObject entryRuleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionFieldName = null;


        try {
            // InternalVertigoDsl.g:4003:65: (iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF )
            // InternalVertigoDsl.g:4004:2: iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF
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
    // InternalVertigoDsl.g:4010:1: ruleFacetDefinitionFieldName returns [EObject current=null] : (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4016:2: ( (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4017:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4017:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4018:3: otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionFieldNameAccess().getFieldNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionFieldNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4026:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4027:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4027:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4028:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4044:3: (otherlv_3= ',' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==37) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalVertigoDsl.g:4045:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4054:1: entryRuleFacetDefinitionLabel returns [EObject current=null] : iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF ;
    public final EObject entryRuleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionLabel = null;


        try {
            // InternalVertigoDsl.g:4054:61: (iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF )
            // InternalVertigoDsl.g:4055:2: iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF
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
    // InternalVertigoDsl.g:4061:1: ruleFacetDefinitionLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4067:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4068:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4068:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4069:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionLabelAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4077:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4078:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4078:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4079:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4095:3: (otherlv_3= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==37) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalVertigoDsl.g:4096:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4105:1: entryRuleFacetDefinitionRangeString returns [EObject current=null] : iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF ;
    public final EObject entryRuleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRangeString = null;


        try {
            // InternalVertigoDsl.g:4105:67: (iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF )
            // InternalVertigoDsl.g:4106:2: iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF
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
    // InternalVertigoDsl.g:4112:1: ruleFacetDefinitionRangeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:4118:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4119:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4119:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4120:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4124:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4125:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4125:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4126:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:4129:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4130:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4130:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=3;
                int LA71_0 = input.LA(1);

                if ( LA71_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt71=1;
                }
                else if ( LA71_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt71=2;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalVertigoDsl.g:4131:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4131:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4132:5: {...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4132:123: ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4133:6: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:4136:9: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:4136:10: {...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4136:19: (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:4136:20: otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,69,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:4144:9: ( (lv_filterString_4_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4145:10: (lv_filterString_4_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4145:10: (lv_filterString_4_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4146:11: lv_filterString_4_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:4162:9: (otherlv_5= ',' )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==37) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4163:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,37,FOLLOW_61); 

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
            	    // InternalVertigoDsl.g:4174:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4174:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4175:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4175:123: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4176:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:4179:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:4179:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4179:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:4179:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:4187:9: ( (lv_labelString_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4188:10: (lv_labelString_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4188:10: (lv_labelString_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4189:11: lv_labelString_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:4205:9: (otherlv_9= ',' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==37) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4206:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,37,FOLLOW_61); 

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
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
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
    // InternalVertigoDsl.g:4233:1: entryRuleFacetDefinitionRange returns [EObject current=null] : iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF ;
    public final EObject entryRuleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRange = null;


        try {
            // InternalVertigoDsl.g:4233:61: (iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF )
            // InternalVertigoDsl.g:4234:2: iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF
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
    // InternalVertigoDsl.g:4240:1: ruleFacetDefinitionRange returns [EObject current=null] : (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionRangeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4246:2: ( (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4247:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4247:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4248:3: otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeAccess().getRangeKeyword_0());
            		
            // InternalVertigoDsl.g:4252:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4253:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4253:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4254:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionRangeAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionRangeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4271:3: ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) )
            // InternalVertigoDsl.g:4272:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            {
            // InternalVertigoDsl.g:4272:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            // InternalVertigoDsl.g:4273:5: lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString
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

            // InternalVertigoDsl.g:4290:3: (otherlv_3= ',' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==37) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalVertigoDsl.g:4291:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4300:1: entryRuleFacetDefinition returns [EObject current=null] : iv_ruleFacetDefinition= ruleFacetDefinition EOF ;
    public final EObject entryRuleFacetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinition = null;


        try {
            // InternalVertigoDsl.g:4300:56: (iv_ruleFacetDefinition= ruleFacetDefinition EOF )
            // InternalVertigoDsl.g:4301:2: iv_ruleFacetDefinition= ruleFacetDefinition EOF
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
    // InternalVertigoDsl.g:4307:1: ruleFacetDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleFacetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_facetDefinitionDtDefinition_6_0 = null;

        EObject lv_facetDefinitionFieldName_7_0 = null;

        EObject lv_facetDefinitonLabel_8_0 = null;

        EObject lv_facetDefinitionRange_9_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4313:2: ( (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4314:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4314:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4315:3: otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,71,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionAccess().getFacetDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4323:3: ()
            // InternalVertigoDsl.g:4324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetDefinitionAccess().getFacetDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4330:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4331:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4331:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4332:5: lv_name_3_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:4352:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4353:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4353:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4354:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4357:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?)
            // InternalVertigoDsl.g:4358:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4358:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=5;
                int LA74_0 = input.LA(1);

                if ( LA74_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt74=1;
                }
                else if ( LA74_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt74=2;
                }
                else if ( LA74_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt74=3;
                }
                else if ( LA74_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt74=4;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalVertigoDsl.g:4359:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4359:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    // InternalVertigoDsl.g:4360:5: {...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4360:112: ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    // InternalVertigoDsl.g:4361:6: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4364:9: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    // InternalVertigoDsl.g:4364:10: {...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4364:19: ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    // InternalVertigoDsl.g:4364:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    {
            	    // InternalVertigoDsl.g:4364:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    // InternalVertigoDsl.g:4365:10: lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionDtDefinitionFacetDefinitionDtDefinitionParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_64);
            	    lv_facetDefinitionDtDefinition_6_0=ruleFacetDefinitionDtDefinition();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetDefinitionDtDefinition",
            	    											lv_facetDefinitionDtDefinition_6_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetDefinitionDtDefinition");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:4387:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4387:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    // InternalVertigoDsl.g:4388:5: {...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4388:112: ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    // InternalVertigoDsl.g:4389:6: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4392:9: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    // InternalVertigoDsl.g:4392:10: {...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4392:19: ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    // InternalVertigoDsl.g:4392:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    {
            	    // InternalVertigoDsl.g:4392:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    // InternalVertigoDsl.g:4393:10: lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionFieldNameFacetDefinitionFieldNameParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_64);
            	    lv_facetDefinitionFieldName_7_0=ruleFacetDefinitionFieldName();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetDefinitionFieldName",
            	    											lv_facetDefinitionFieldName_7_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetDefinitionFieldName");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:4415:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4415:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    // InternalVertigoDsl.g:4416:5: {...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4416:112: ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    // InternalVertigoDsl.g:4417:6: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4420:9: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    // InternalVertigoDsl.g:4420:10: {...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4420:19: ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    // InternalVertigoDsl.g:4420:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    {
            	    // InternalVertigoDsl.g:4420:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    // InternalVertigoDsl.g:4421:10: lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitonLabelFacetDefinitionLabelParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_64);
            	    lv_facetDefinitonLabel_8_0=ruleFacetDefinitionLabel();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetDefinitonLabel",
            	    											lv_facetDefinitonLabel_8_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetDefinitionLabel");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:4443:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4443:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    // InternalVertigoDsl.g:4444:5: {...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:4444:112: ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    // InternalVertigoDsl.g:4445:6: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:4448:9: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    int cnt73=0;
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==70) ) {
            	            int LA73_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt73=1;
            	            }


            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4448:10: {...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4448:19: ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    // InternalVertigoDsl.g:4448:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    {
            	    	    // InternalVertigoDsl.g:4448:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    // InternalVertigoDsl.g:4449:10: lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionRangeFacetDefinitionRangeParserRuleCall_5_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_64);
            	    	    lv_facetDefinitionRange_9_0=ruleFacetDefinitionRange();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"facetDefinitionRange",
            	    	    											lv_facetDefinitionRange_9_0,
            	    	    											"io.vertigo.dsl.VertigoDsl.FacetDefinitionRange");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt73 >= 1 ) break loop73;
            	                EarlyExitException eee =
            	                    new EarlyExitException(73, input);
            	                throw eee;
            	        }
            	        cnt73++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getFacetDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVertigoDsl.g:4487:1: entryRuleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF ;
    public final EObject entryRuleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4487:73: (iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4488:2: iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:4494:1: ruleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4500:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4501:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4501:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4502:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4510:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4511:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4511:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4512:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4523:3: (otherlv_3= ',' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==37) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalVertigoDsl.g:4524:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4533:1: entryRuleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF ;
    public final EObject entryRuleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionDomainCriteria = null;


        try {
            // InternalVertigoDsl.g:4533:77: (iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF )
            // InternalVertigoDsl.g:4534:2: iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF
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
    // InternalVertigoDsl.g:4540:1: ruleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refToDomainType_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4546:2: ( (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4547:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4547:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4548:3: otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getDomainCriteriaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4556:3: ( (lv_refToDomainType_2_0= ruleRefToDomainType ) )
            // InternalVertigoDsl.g:4557:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            {
            // InternalVertigoDsl.g:4557:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            // InternalVertigoDsl.g:4558:5: lv_refToDomainType_2_0= ruleRefToDomainType
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

            // InternalVertigoDsl.g:4575:3: (otherlv_3= ',' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==37) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalVertigoDsl.g:4576:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4585:1: entryRuleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderQuery = null;


        try {
            // InternalVertigoDsl.g:4585:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF )
            // InternalVertigoDsl.g:4586:2: iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF
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
    // InternalVertigoDsl.g:4592:1: ruleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4598:2: ( (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4599:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4599:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4600:3: otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getListFilterBuilderClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4608:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4609:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4609:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4610:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4626:3: (otherlv_3= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==37) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalVertigoDsl.g:4627:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4636:1: entryRuleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderClass = null;


        try {
            // InternalVertigoDsl.g:4636:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF )
            // InternalVertigoDsl.g:4637:2: iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF
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
    // InternalVertigoDsl.g:4643:1: ruleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4649:2: ( (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4650:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4650:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4651:3: otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getListFilterBuilderQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4659:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4660:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4660:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4661:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4677:3: (otherlv_3= ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==37) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalVertigoDsl.g:4678:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4687:1: entryRuleFacetedQueryDefinitionFacets returns [EObject current=null] : iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF ;
    public final EObject entryRuleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionFacets = null;


        try {
            // InternalVertigoDsl.g:4687:69: (iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF )
            // InternalVertigoDsl.g:4688:2: iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF
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
    // InternalVertigoDsl.g:4694:1: ruleFacetedQueryDefinitionFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) ;
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
            // InternalVertigoDsl.g:4700:2: ( (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) )
            // InternalVertigoDsl.g:4701:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            {
            // InternalVertigoDsl.g:4701:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            // InternalVertigoDsl.g:4702:3: otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVertigoDsl.g:4714:3: ( (otherlv_3= RULE_ID ) )
            // InternalVertigoDsl.g:4715:4: (otherlv_3= RULE_ID )
            {
            // InternalVertigoDsl.g:4715:4: (otherlv_3= RULE_ID )
            // InternalVertigoDsl.g:4716:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetDefinitionFacetDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalVertigoDsl.g:4727:3: ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==37) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalVertigoDsl.g:4728:4: (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:4728:4: (otherlv_4= ',' )+
            	    int cnt79=0;
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==37) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4729:5: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,37,FOLLOW_28); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt79 >= 1 ) break loop79;
            	                EarlyExitException eee =
            	                    new EarlyExitException(79, input);
            	                throw eee;
            	        }
            	        cnt79++;
            	    } while (true);

            	    // InternalVertigoDsl.g:4734:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalVertigoDsl.g:4735:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:4735:5: (otherlv_5= RULE_ID )
            	    // InternalVertigoDsl.g:4736:6: otherlv_5= RULE_ID
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
            	    break loop80;
                }
            } while (true);

            otherlv_6=(Token)match(input,38,FOLLOW_39); 

            			newLeafNode(otherlv_6, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getRightSquareBracketKeyword_5());
            		
            // InternalVertigoDsl.g:4752:3: (otherlv_7= ',' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==37) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalVertigoDsl.g:4753:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4762:1: entryRuleFacetedQueryDefinition returns [EObject current=null] : iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF ;
    public final EObject entryRuleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinition = null;


        try {
            // InternalVertigoDsl.g:4762:63: (iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF )
            // InternalVertigoDsl.g:4763:2: iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF
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
    // InternalVertigoDsl.g:4769:1: ruleFacetedQueryDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        EObject lv_facetedQueryDefinitionKeyConcept_6_0 = null;

        EObject lv_facetedQueryDefinitionDomainCriteria_7_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderQuery_8_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderClass_9_0 = null;

        EObject lv_facetedQueryDefinitionFacets_10_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4775:2: ( (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalVertigoDsl.g:4776:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalVertigoDsl.g:4776:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalVertigoDsl.g:4777:3: otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,77,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4785:3: ()
            // InternalVertigoDsl.g:4786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4792:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4793:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4793:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4794:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4814:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4815:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4815:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4816:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4819:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4820:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4820:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+
            int cnt82=0;
            loop82:
            do {
                int alt82=6;
                int LA82_0 = input.LA(1);

                if ( LA82_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt82=1;
                }
                else if ( LA82_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt82=2;
                }
                else if ( LA82_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt82=3;
                }
                else if ( LA82_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt82=4;
                }
                else if ( LA82_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt82=5;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalVertigoDsl.g:4821:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4821:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:4822:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4822:119: ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:4823:6: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4826:9: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:4826:10: {...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4826:19: ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:4826:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:4826:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:4827:10: lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyConceptFacetedQueryDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_facetedQueryDefinitionKeyConcept_6_0=ruleFacetedQueryDefinitionKeyConcept();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionKeyConcept",
            	    											lv_facetedQueryDefinitionKeyConcept_6_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionKeyConcept");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:4849:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4849:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    // InternalVertigoDsl.g:4850:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4850:119: ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    // InternalVertigoDsl.g:4851:6: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4854:9: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    // InternalVertigoDsl.g:4854:10: {...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4854:19: ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    // InternalVertigoDsl.g:4854:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    {
            	    // InternalVertigoDsl.g:4854:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    // InternalVertigoDsl.g:4855:10: lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionDomainCriteriaFacetedQueryDefinitionDomainCriteriaParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_facetedQueryDefinitionDomainCriteria_7_0=ruleFacetedQueryDefinitionDomainCriteria();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionDomainCriteria",
            	    											lv_facetedQueryDefinitionDomainCriteria_7_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionDomainCriteria");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:4877:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4877:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:4878:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4878:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    // InternalVertigoDsl.g:4879:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4882:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    // InternalVertigoDsl.g:4882:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4882:19: ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    // InternalVertigoDsl.g:4882:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    {
            	    // InternalVertigoDsl.g:4882:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    // InternalVertigoDsl.g:4883:10: lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderQueryFacetedQueryDefinitionListFilterBuilderQueryParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_facetedQueryDefinitionListFilterBuilderQuery_8_0=ruleFacetedQueryDefinitionListFilterBuilderQuery();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionListFilterBuilderQuery",
            	    											lv_facetedQueryDefinitionListFilterBuilderQuery_8_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionListFilterBuilderQuery");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:4905:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4905:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    // InternalVertigoDsl.g:4906:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:4906:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    // InternalVertigoDsl.g:4907:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:4910:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    // InternalVertigoDsl.g:4910:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4910:19: ( (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    // InternalVertigoDsl.g:4910:20: (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    {
            	    // InternalVertigoDsl.g:4910:20: (lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    // InternalVertigoDsl.g:4911:10: lv_facetedQueryDefinitionListFilterBuilderClass_9_0= ruleFacetedQueryDefinitionListFilterBuilderClass
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderClassFacetedQueryDefinitionListFilterBuilderClassParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_facetedQueryDefinitionListFilterBuilderClass_9_0=ruleFacetedQueryDefinitionListFilterBuilderClass();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionListFilterBuilderClass",
            	    											lv_facetedQueryDefinitionListFilterBuilderClass_9_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionListFilterBuilderClass");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:4933:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4933:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    // InternalVertigoDsl.g:4934:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:4934:119: ( ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    // InternalVertigoDsl.g:4935:6: ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:4938:9: ({...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    // InternalVertigoDsl.g:4938:10: {...}? => ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4938:19: ( (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets ) )
            	    // InternalVertigoDsl.g:4938:20: (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets )
            	    {
            	    // InternalVertigoDsl.g:4938:20: (lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets )
            	    // InternalVertigoDsl.g:4939:10: lv_facetedQueryDefinitionFacets_10_0= ruleFacetedQueryDefinitionFacets
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionFacetsFacetedQueryDefinitionFacetsParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_67);
            	    lv_facetedQueryDefinitionFacets_10_0=ruleFacetedQueryDefinitionFacets();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionFacets",
            	    											lv_facetedQueryDefinitionFacets_10_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionFacets");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFacetedQueryDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVertigoDsl.g:4977:1: entryRuleIndexDefinitionKeyConcept returns [EObject current=null] : iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF ;
    public final EObject entryRuleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4977:66: (iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4978:2: iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:4984:1: ruleIndexDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4990:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4991:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4991:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4992:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5000:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5001:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5001:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5002:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5013:3: (otherlv_3= ',' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==37) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalVertigoDsl.g:5014:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5023:1: entryRuleIndexDefinitionDtIndex returns [EObject current=null] : iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF ;
    public final EObject entryRuleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionDtIndex = null;


        try {
            // InternalVertigoDsl.g:5023:63: (iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF )
            // InternalVertigoDsl.g:5024:2: iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF
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
    // InternalVertigoDsl.g:5030:1: ruleIndexDefinitionDtIndex returns [EObject current=null] : (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5036:2: ( (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5037:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5037:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5038:3: otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionDtIndexAccess().getDtIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionDtIndexAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5046:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5047:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5047:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5048:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionDtIndexRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionDtIndexAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5059:3: (otherlv_3= ',' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==37) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalVertigoDsl.g:5060:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5069:1: entryRuleIndexDefinitionIndexCopyToString returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyToString = null;


        try {
            // InternalVertigoDsl.g:5069:73: (iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF )
            // InternalVertigoDsl.g:5070:2: iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF
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
    // InternalVertigoDsl.g:5076:1: ruleIndexDefinitionIndexCopyToString returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5082:2: ( (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:5083:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:5083:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:5084:3: otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getColonKeyword_2());
            		
            // InternalVertigoDsl.g:5096:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5097:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5097:4: (lv_string_3_0= RULE_STRING )
            // InternalVertigoDsl.g:5098:5: lv_string_3_0= RULE_STRING
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
    // InternalVertigoDsl.g:5122:1: entryRuleIndexDefinitionIndexCopyTo returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyTo = null;


        try {
            // InternalVertigoDsl.g:5122:67: (iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF )
            // InternalVertigoDsl.g:5123:2: iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF
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
    // InternalVertigoDsl.g:5129:1: ruleIndexDefinitionIndexCopyTo returns [EObject current=null] : (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_indexDefinitionIndexCopyToString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:5135:2: ( (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5136:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5136:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5137:3: otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexCopyToKeyword_0());
            		
            // InternalVertigoDsl.g:5141:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:5142:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:5142:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:5143:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexDefinitionIndexCopyToRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:5160:3: ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) )
            // InternalVertigoDsl.g:5161:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            {
            // InternalVertigoDsl.g:5161:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            // InternalVertigoDsl.g:5162:5: lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString
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

            // InternalVertigoDsl.g:5179:3: (otherlv_3= ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==37) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalVertigoDsl.g:5180:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5189:1: entryRuleIndexDefinitionLoaderId returns [EObject current=null] : iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF ;
    public final EObject entryRuleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionLoaderId = null;


        try {
            // InternalVertigoDsl.g:5189:64: (iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF )
            // InternalVertigoDsl.g:5190:2: iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF
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
    // InternalVertigoDsl.g:5196:1: ruleIndexDefinitionLoaderId returns [EObject current=null] : (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_loaderIdString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5202:2: ( (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5203:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5203:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5204:3: otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionLoaderIdAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5212:3: ( (lv_loaderIdString_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5213:4: (lv_loaderIdString_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5213:4: (lv_loaderIdString_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5214:5: lv_loaderIdString_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:5230:3: (otherlv_3= ',' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==37) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalVertigoDsl.g:5231:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5240:1: entryRuleIndexDefinition returns [EObject current=null] : iv_ruleIndexDefinition= ruleIndexDefinition EOF ;
    public final EObject entryRuleIndexDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinition = null;


        try {
            // InternalVertigoDsl.g:5240:56: (iv_ruleIndexDefinition= ruleIndexDefinition EOF )
            // InternalVertigoDsl.g:5241:2: iv_ruleIndexDefinition= ruleIndexDefinition EOF
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
    // InternalVertigoDsl.g:5247:1: ruleIndexDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleIndexDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        EObject lv_indexDefinitionKeyConcept_6_0 = null;

        EObject lv_indexDefinitionDtIndex_7_0 = null;

        EObject lv_indexDefinitionLoaderId_8_0 = null;

        EObject lv_indexDefinitionIndexCopyTo_9_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:5253:2: ( (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:5254:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:5254:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:5255:3: otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5263:3: ()
            // InternalVertigoDsl.g:5264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexDefinitionAccess().getIndexDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5270:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5271:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5271:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5272:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5292:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5293:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5293:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5294:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5297:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5298:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5298:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+
            int cnt87=0;
            loop87:
            do {
                int alt87=5;
                int LA87_0 = input.LA(1);

                if ( LA87_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt87=1;
                }
                else if ( LA87_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt87=2;
                }
                else if ( LA87_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt87=3;
                }
                else if ( LA87_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt87=4;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalVertigoDsl.g:5299:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5299:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5300:5: {...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5300:112: ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5301:6: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5304:9: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5304:10: {...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5304:19: ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5304:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5304:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5305:10: lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyConceptIndexDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_71);
            	    lv_indexDefinitionKeyConcept_6_0=ruleIndexDefinitionKeyConcept();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"indexDefinitionKeyConcept",
            	    											lv_indexDefinitionKeyConcept_6_0,
            	    											"io.vertigo.dsl.VertigoDsl.IndexDefinitionKeyConcept");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:5327:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5327:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    // InternalVertigoDsl.g:5328:5: {...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5328:112: ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    // InternalVertigoDsl.g:5329:6: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5332:9: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    // InternalVertigoDsl.g:5332:10: {...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5332:19: ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    // InternalVertigoDsl.g:5332:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    {
            	    // InternalVertigoDsl.g:5332:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    // InternalVertigoDsl.g:5333:10: lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionDtIndexIndexDefinitionDtIndexParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_71);
            	    lv_indexDefinitionDtIndex_7_0=ruleIndexDefinitionDtIndex();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"indexDefinitionDtIndex",
            	    											lv_indexDefinitionDtIndex_7_0,
            	    											"io.vertigo.dsl.VertigoDsl.IndexDefinitionDtIndex");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:5355:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5355:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    // InternalVertigoDsl.g:5356:5: {...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5356:112: ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    // InternalVertigoDsl.g:5357:6: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5360:9: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    // InternalVertigoDsl.g:5360:10: {...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5360:19: ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    // InternalVertigoDsl.g:5360:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    {
            	    // InternalVertigoDsl.g:5360:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    // InternalVertigoDsl.g:5361:10: lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionLoaderIdIndexDefinitionLoaderIdParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_71);
            	    lv_indexDefinitionLoaderId_8_0=ruleIndexDefinitionLoaderId();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"indexDefinitionLoaderId",
            	    											lv_indexDefinitionLoaderId_8_0,
            	    											"io.vertigo.dsl.VertigoDsl.IndexDefinitionLoaderId");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:5383:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5383:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    // InternalVertigoDsl.g:5384:5: {...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5384:112: ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    // InternalVertigoDsl.g:5385:6: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5388:9: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    // InternalVertigoDsl.g:5388:10: {...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5388:19: ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    // InternalVertigoDsl.g:5388:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    {
            	    // InternalVertigoDsl.g:5388:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    // InternalVertigoDsl.g:5389:10: lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionIndexCopyToIndexDefinitionIndexCopyToParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_71);
            	    lv_indexDefinitionIndexCopyTo_9_0=ruleIndexDefinitionIndexCopyTo();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getIndexDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"indexDefinitionIndexCopyTo",
            	    											lv_indexDefinitionIndexCopyTo_9_0,
            	    											"io.vertigo.dsl.VertigoDsl.IndexDefinitionIndexCopyTo");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt87 >= 1 ) break loop87;
                        EarlyExitException eee =
                            new EarlyExitException(87, input);
                        throw eee;
                }
                cnt87++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIndexDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVertigoDsl.g:5427:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
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
            // InternalVertigoDsl.g:5433:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:5434:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:5434:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt88=9;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt88=1;
                }
                break;
            case 84:
                {
                alt88=2;
                }
                break;
            case 85:
                {
                alt88=3;
                }
                break;
            case 86:
                {
                alt88=4;
                }
                break;
            case 87:
                {
                alt88=5;
                }
                break;
            case 88:
                {
                alt88=6;
                }
                break;
            case 89:
                {
                alt88=7;
                }
                break;
            case 90:
                {
                alt88=8;
                }
                break;
            case 91:
                {
                alt88=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalVertigoDsl.g:5435:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:5435:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:5436:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5443:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:5443:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:5444:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5451:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:5451:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:5452:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:5459:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:5459:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:5460:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:5467:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:5467:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:5468:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:5475:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:5475:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:5476:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:5483:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:5483:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:5484:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:5491:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:5491:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:5492:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:5499:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:5499:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:5500:4: enumLiteral_8= 'DataStream'
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
    // InternalVertigoDsl.g:5510:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5516:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:5517:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:5517:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==92) ) {
                alt89=1;
            }
            else if ( (LA89_0==93) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalVertigoDsl.g:5518:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:5518:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:5519:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5526:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:5526:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:5527:4: enumLiteral_1= '\"false\"'
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
    // InternalVertigoDsl.g:5537:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5543:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) )
            // InternalVertigoDsl.g:5544:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            {
            // InternalVertigoDsl.g:5544:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==94) ) {
                alt90=1;
            }
            else if ( (LA90_0==95) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalVertigoDsl.g:5545:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:5545:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:5546:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5553:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:5553:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:5554:4: enumLiteral_1= '\"0..*\"'
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
    // InternalVertigoDsl.g:5564:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5570:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:5571:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:5571:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==96) ) {
                alt91=1;
            }
            else if ( (LA91_0==97) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalVertigoDsl.g:5572:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:5572:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:5573:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5580:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:5580:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:5581:4: enumLiteral_1= '\"out\"'
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
    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\21\3\22\16\uffff";
    static final String dfa_3s = "\1\51\1\122\2\23\16\uffff";
    static final String dfa_4s = "\4\uffff\1\16\1\7\1\12\1\1\1\14\1\3\1\15\1\2\1\5\1\13\1\11\1\4\1\6\1\10";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\uffff\1\1\24\uffff\1\2",
            "\1\11\1\5\1\uffff\1\7\6\uffff\1\14\1\uffff\1\13\23\uffff\1\6\16\uffff\1\15\5\uffff\1\10\5\uffff\1\4\4\uffff\1\12",
            "\1\17\1\16",
            "\1\20\1\21",
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
            return "275:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_AlterDomain_3= ruleAlterDomain | this_FileInfo_4= ruleFileInfo | this_DeclaredDomain_5= ruleDeclaredDomain | this_DtDefinition_6= ruleDtDefinition | this_DeclaredDtDefinition_7= ruleDeclaredDtDefinition | this_AlterDtDefinition_8= ruleAlterDtDefinition | this_Association_9= ruleAssociation | this_TaskDefinition_10= ruleTaskDefinition | this_FacetDefinition_11= ruleFacetDefinition | this_IndexDefinition_12= ruleIndexDefinition | this_FacetedQueryDefinition_13= ruleFacetedQueryDefinition )";
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

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 2954:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA55_0==27) ) {s = 1;}

                        else if ( LA55_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA55_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA55_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA55_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA55_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA55_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA55_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA55_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA55_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA55_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA55_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA55_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000120002L});
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x000000000FF80000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018F00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000018F08000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002008014000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008014000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000014000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C2008014000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0008014000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000014000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000102008014000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100008014000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0003E00028008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003600028008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003600028000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0003400028000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0003000028000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7FF8000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7FF8002008000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7FF8000008000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000040000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000042008004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000040008004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000002008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000058L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000058L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000008000000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000034100L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000008000000L,0x0000000000034100L});

}
