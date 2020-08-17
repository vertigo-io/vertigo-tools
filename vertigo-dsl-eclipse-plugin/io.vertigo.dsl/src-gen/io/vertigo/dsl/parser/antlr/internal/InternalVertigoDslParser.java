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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'id'", "'label'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'FileInfo'", "'{'", "'storeName'", "':'", "'}'", "'dataType'", "'type'", "'storeType'", "'indexType'", "'unit'", "'alter'", "','", "'cardinality'", "'persistent'", "'expression'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'handleField'", "'values'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'in'", "'out'", "'className'", "'request'", "'Task'", "'dtDefinition'", "'fieldName'", "'filter'", "'range'", "'value'", "'params'", "'FacetDefinition'", "'keyConcept'", "'domainCriteria'", "'listFilterBuilderClass'", "'geoSearchQuery'", "'listFilterBuilderQuery'", "'facets'", "'['", "']'", "'FacetedQueryDefinition'", "'dtIndex'", "'from'", "'indexCopyTo'", "'loaderId'", "'IndexDefinition'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'ValueObject'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"1..1\"'", "'\"1..*\"'", "'\"1\"'", "'\"?\"'", "'\"*\"'", "'\"*>1\"'", "'\"*>?\"'", "'\"*>*\"'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    // InternalVertigoDsl.g:268:1: ruleElement returns [EObject current=null] : (this_Domain_0= ruleDomain | this_AlterDomain_1= ruleAlterDomain | this_FileInfo_2= ruleFileInfo | this_DeclaredDomain_3= ruleDeclaredDomain | this_DtDefinition_4= ruleDtDefinition | this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition | this_AlterDtDefinition_6= ruleAlterDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Domain_0 = null;

        EObject this_AlterDomain_1 = null;

        EObject this_FileInfo_2 = null;

        EObject this_DeclaredDomain_3 = null;

        EObject this_DtDefinition_4 = null;

        EObject this_DeclaredDtDefinition_5 = null;

        EObject this_AlterDtDefinition_6 = null;

        EObject this_Association_7 = null;

        EObject this_TaskDefinition_8 = null;

        EObject this_FacetDefinition_9 = null;

        EObject this_IndexDefinition_10 = null;

        EObject this_FacetedQueryDefinition_11 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:274:2: ( (this_Domain_0= ruleDomain | this_AlterDomain_1= ruleAlterDomain | this_FileInfo_2= ruleFileInfo | this_DeclaredDomain_3= ruleDeclaredDomain | this_DtDefinition_4= ruleDtDefinition | this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition | this_AlterDtDefinition_6= ruleAlterDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition ) )
            // InternalVertigoDsl.g:275:2: (this_Domain_0= ruleDomain | this_AlterDomain_1= ruleAlterDomain | this_FileInfo_2= ruleFileInfo | this_DeclaredDomain_3= ruleDeclaredDomain | this_DtDefinition_4= ruleDtDefinition | this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition | this_AlterDtDefinition_6= ruleAlterDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )
            {
            // InternalVertigoDsl.g:275:2: (this_Domain_0= ruleDomain | this_AlterDomain_1= ruleAlterDomain | this_FileInfo_2= ruleFileInfo | this_DeclaredDomain_3= ruleDeclaredDomain | this_DtDefinition_4= ruleDtDefinition | this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition | this_AlterDtDefinition_6= ruleAlterDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )
            int alt5=12;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:276:3: this_Domain_0= ruleDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDomainParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Domain_0=ruleDomain();

                    state._fsp--;


                    			current = this_Domain_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:285:3: this_AlterDomain_1= ruleAlterDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAlterDomainParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlterDomain_1=ruleAlterDomain();

                    state._fsp--;


                    			current = this_AlterDomain_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:294:3: this_FileInfo_2= ruleFileInfo
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getFileInfoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileInfo_2=ruleFileInfo();

                    state._fsp--;


                    			current = this_FileInfo_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:303:3: this_DeclaredDomain_3= ruleDeclaredDomain
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDomainParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDomain_3=ruleDeclaredDomain();

                    state._fsp--;


                    			current = this_DeclaredDomain_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:312:3: this_DtDefinition_4= ruleDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtDefinition_4=ruleDtDefinition();

                    state._fsp--;


                    			current = this_DtDefinition_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:321:3: this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDeclaredDtDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclaredDtDefinition_5=ruleDeclaredDtDefinition();

                    state._fsp--;


                    			current = this_DeclaredDtDefinition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:330:3: this_AlterDtDefinition_6= ruleAlterDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAlterDtDefinitionParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlterDtDefinition_6=ruleAlterDtDefinition();

                    state._fsp--;


                    			current = this_AlterDtDefinition_6;
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


    // $ANTLR start "entryRuleFileInfo"
    // InternalVertigoDsl.g:477:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:477:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:478:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:484:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:490:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:491:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:491:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:492:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:500:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:501:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:501:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:502:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getFileInfoAccess().getStoreNameKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getFileInfoAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:530:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:531:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:531:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:532:5: lv_storeName_6_0= RULE_STRING
            {
            lv_storeName_6_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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


    // $ANTLR start "entryRuleDomain"
    // InternalVertigoDsl.g:556:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:556:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:557:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:563:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' ) ;
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
        Token lv_type_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_storeType_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_indexType_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_unit_19_0=null;
        Token otherlv_20=null;
        Enumerator lv_dataType_6_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:569:2: ( (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' ) )
            // InternalVertigoDsl.g:570:2: (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' )
            {
            // InternalVertigoDsl.g:570:2: (otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' )
            // InternalVertigoDsl.g:571:3: otherlv_0= 'create' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:579:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:580:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:580:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:581:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getDataTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:609:3: ( (lv_dataType_6_0= ruleDataType ) )
            // InternalVertigoDsl.g:610:4: (lv_dataType_6_0= ruleDataType )
            {
            // InternalVertigoDsl.g:610:4: (lv_dataType_6_0= ruleDataType )
            // InternalVertigoDsl.g:611:5: lv_dataType_6_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalVertigoDsl.g:628:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:629:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:629:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:630:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				
            // InternalVertigoDsl.g:633:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalVertigoDsl.g:634:6: ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:634:6: ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )*
            loop6:
            do {
                int alt6=5;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
                    alt6=3;
                }
                else if ( LA6_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
                    alt6=4;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalVertigoDsl.g:635:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:635:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:636:5: {...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalVertigoDsl.g:636:103: ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:637:6: ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalVertigoDsl.g:640:9: ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:640:10: {...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:640:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:640:20: otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDomainAccess().getTypeKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getColonKeyword_7_0_1());
            	    								
            	    // InternalVertigoDsl.g:648:9: ( (lv_type_10_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:649:10: (lv_type_10_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:649:10: (lv_type_10_0= RULE_STRING )
            	    // InternalVertigoDsl.g:650:11: lv_type_10_0= RULE_STRING
            	    {
            	    lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_type_10_0, grammarAccess.getDomainAccess().getTypeSTRINGTerminalRuleCall_7_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												true,
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
            	case 2 :
            	    // InternalVertigoDsl.g:672:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:672:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:673:5: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalVertigoDsl.g:673:103: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:674:6: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalVertigoDsl.g:677:9: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:677:10: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:677:19: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:677:20: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getStoreTypeKeyword_7_1_0());
            	    								
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getColonKeyword_7_1_1());
            	    								
            	    // InternalVertigoDsl.g:685:9: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:686:10: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:686:10: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:687:11: lv_storeType_13_0= RULE_STRING
            	    {
            	    lv_storeType_13_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_storeType_13_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_7_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"storeType",
            	    												true,
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
            	    // InternalVertigoDsl.g:709:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:709:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:710:5: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalVertigoDsl.g:710:103: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:711:6: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalVertigoDsl.g:714:9: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:714:10: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:714:19: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:714:20: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getIndexTypeKeyword_7_2_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getColonKeyword_7_2_1());
            	    								
            	    // InternalVertigoDsl.g:722:9: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:723:10: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:723:10: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:724:11: lv_indexType_16_0= RULE_STRING
            	    {
            	    lv_indexType_16_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_indexType_16_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_7_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"indexType",
            	    												true,
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
            	    // InternalVertigoDsl.g:746:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:746:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:747:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalVertigoDsl.g:747:103: ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:748:6: ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_7(), 3);
            	    					
            	    // InternalVertigoDsl.g:751:9: ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:751:10: {...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:751:19: (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:751:20: otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) )
            	    {
            	    otherlv_17=(Token)match(input,30,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getUnitKeyword_7_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getColonKeyword_7_3_1());
            	    								
            	    // InternalVertigoDsl.g:759:9: ( (lv_unit_19_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:760:10: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:760:10: (lv_unit_19_0= RULE_STRING )
            	    // InternalVertigoDsl.g:761:11: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_unit_19_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_7_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"unit",
            	    												true,
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
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_7());
            				

            }

            otherlv_20=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVertigoDsl.g:798:1: entryRuleAlterDomain returns [EObject current=null] : iv_ruleAlterDomain= ruleAlterDomain EOF ;
    public final EObject entryRuleAlterDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDomain = null;


        try {
            // InternalVertigoDsl.g:798:52: (iv_ruleAlterDomain= ruleAlterDomain EOF )
            // InternalVertigoDsl.g:799:2: iv_ruleAlterDomain= ruleAlterDomain EOF
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
    // InternalVertigoDsl.g:805:1: ruleAlterDomain returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' ) ;
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
        Token lv_type_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_storeType_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_indexType_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_unit_19_0=null;
        Token otherlv_20=null;
        Enumerator lv_dataType_6_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:811:2: ( (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' ) )
            // InternalVertigoDsl.g:812:2: (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' )
            {
            // InternalVertigoDsl.g:812:2: (otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}' )
            // InternalVertigoDsl.g:813:3: otherlv_0= 'alter' otherlv_1= 'Domain' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'dataType' otherlv_5= ':' ( (lv_dataType_6_0= ruleDataType ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDomainAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:821:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:822:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:822:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:823:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDomainRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDomainAccess().getDomainDomainTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterDomainAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getAlterDomainAccess().getDataTypeKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getAlterDomainAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:846:3: ( (lv_dataType_6_0= ruleDataType ) )
            // InternalVertigoDsl.g:847:4: (lv_dataType_6_0= ruleDataType )
            {
            // InternalVertigoDsl.g:847:4: (lv_dataType_6_0= ruleDataType )
            // InternalVertigoDsl.g:848:5: lv_dataType_6_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getAlterDomainAccess().getDataTypeDataTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalVertigoDsl.g:865:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:866:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:866:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:867:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            				
            // InternalVertigoDsl.g:870:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalVertigoDsl.g:871:6: ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:871:6: ( ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVertigoDsl.g:872:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:872:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:873:5: {...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalVertigoDsl.g:873:108: ( ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:874:6: ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 0);
            	    					
            	    // InternalVertigoDsl.g:877:9: ({...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:877:10: {...}? => (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:877:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:877:20: otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAlterDomainAccess().getTypeKeyword_7_0_0());
            	    								
            	    otherlv_9=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAlterDomainAccess().getColonKeyword_7_0_1());
            	    								
            	    // InternalVertigoDsl.g:885:9: ( (lv_type_10_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:886:10: (lv_type_10_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:886:10: (lv_type_10_0= RULE_STRING )
            	    // InternalVertigoDsl.g:887:11: lv_type_10_0= RULE_STRING
            	    {
            	    lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_type_10_0, grammarAccess.getAlterDomainAccess().getTypeSTRINGTerminalRuleCall_7_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												true,
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
            	case 2 :
            	    // InternalVertigoDsl.g:909:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:909:4: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:910:5: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalVertigoDsl.g:910:108: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:911:6: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 1);
            	    					
            	    // InternalVertigoDsl.g:914:9: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:914:10: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:914:19: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:914:20: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAlterDomainAccess().getStoreTypeKeyword_7_1_0());
            	    								
            	    otherlv_12=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAlterDomainAccess().getColonKeyword_7_1_1());
            	    								
            	    // InternalVertigoDsl.g:922:9: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:923:10: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:923:10: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:924:11: lv_storeType_13_0= RULE_STRING
            	    {
            	    lv_storeType_13_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_storeType_13_0, grammarAccess.getAlterDomainAccess().getStoreTypeSTRINGTerminalRuleCall_7_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"storeType",
            	    												true,
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
            	    // InternalVertigoDsl.g:946:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:946:4: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:947:5: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalVertigoDsl.g:947:108: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:948:6: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 2);
            	    					
            	    // InternalVertigoDsl.g:951:9: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:951:10: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:951:19: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:951:20: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAlterDomainAccess().getIndexTypeKeyword_7_2_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getAlterDomainAccess().getColonKeyword_7_2_1());
            	    								
            	    // InternalVertigoDsl.g:959:9: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:960:10: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:960:10: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:961:11: lv_indexType_16_0= RULE_STRING
            	    {
            	    lv_indexType_16_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_indexType_16_0, grammarAccess.getAlterDomainAccess().getIndexTypeSTRINGTerminalRuleCall_7_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"indexType",
            	    												true,
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
            	    // InternalVertigoDsl.g:983:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:983:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:984:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3)");
            	    }
            	    // InternalVertigoDsl.g:984:108: ( ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:985:6: ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7(), 3);
            	    					
            	    // InternalVertigoDsl.g:988:9: ({...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:988:10: {...}? => (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:988:19: (otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:988:20: otherlv_17= 'unit' otherlv_18= ':' ( (lv_unit_19_0= RULE_STRING ) )
            	    {
            	    otherlv_17=(Token)match(input,30,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAlterDomainAccess().getUnitKeyword_7_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAlterDomainAccess().getColonKeyword_7_3_1());
            	    								
            	    // InternalVertigoDsl.g:996:9: ( (lv_unit_19_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:997:10: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:997:10: (lv_unit_19_0= RULE_STRING )
            	    // InternalVertigoDsl.g:998:11: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            	    											newLeafNode(lv_unit_19_0, grammarAccess.getAlterDomainAccess().getUnitSTRINGTerminalRuleCall_7_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAlterDomainRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"unit",
            	    												true,
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
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_7());
            				

            }

            otherlv_20=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getAlterDomainAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVertigoDsl.g:1035:1: entryRuleRefToDomainType returns [EObject current=null] : iv_ruleRefToDomainType= ruleRefToDomainType EOF ;
    public final EObject entryRuleRefToDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToDomainType = null;


        try {
            // InternalVertigoDsl.g:1035:56: (iv_ruleRefToDomainType= ruleRefToDomainType EOF )
            // InternalVertigoDsl.g:1036:2: iv_ruleRefToDomainType= ruleRefToDomainType EOF
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
    // InternalVertigoDsl.g:1042:1: ruleRefToDomainType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefToDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1048:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:1049:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:1049:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVertigoDsl.g:1050:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVertigoDsl.g:1050:3: ()
            // InternalVertigoDsl.g:1051:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefToDomainTypeAccess().getRefToDomainTypeAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:1057:3: ( (otherlv_1= RULE_ID ) )
            // InternalVertigoDsl.g:1058:4: (otherlv_1= RULE_ID )
            {
            // InternalVertigoDsl.g:1058:4: (otherlv_1= RULE_ID )
            // InternalVertigoDsl.g:1059:5: otherlv_1= RULE_ID
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
    // InternalVertigoDsl.g:1074:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1074:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1075:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
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
    // InternalVertigoDsl.g:1081:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:1087:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1088:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1088:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1089:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1093:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1094:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1094:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1095:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1098:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1099:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1099:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVertigoDsl.g:1100:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1100:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1101:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1101:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1102:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1105:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1105:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1105:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1105:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1113:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1114:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1114:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1115:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionIdStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_20);
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

            	    // InternalVertigoDsl.g:1132:9: (otherlv_5= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==32) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1133:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_21); 

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
            	    // InternalVertigoDsl.g:1144:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1144:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1145:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1145:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1146:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1149:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1149:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1149:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1149:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1157:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1158:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1158:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1159:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            	    // InternalVertigoDsl.g:1175:9: (otherlv_9= ',' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==32) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1176:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,32,FOLLOW_21); 

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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalVertigoDsl.g:1203:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1203:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1204:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
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
    // InternalVertigoDsl.g:1210:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
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

        Enumerator lv_cardinality_12_0 = null;

        Enumerator lv_persistent_16_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1216:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1217:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1217:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1218:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1222:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1223:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1223:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1224:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1227:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1228:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1228:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=5;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt15=4;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVertigoDsl.g:1229:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1229:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1230:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1230:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1231:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1234:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1234:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1234:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1234:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1242:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1243:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1243:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1244:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    // InternalVertigoDsl.g:1261:9: (otherlv_5= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==32) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1262:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_24); 

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
            	    // InternalVertigoDsl.g:1273:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1273:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1274:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1274:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1275:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1278:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1278:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1278:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1278:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1286:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1287:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1287:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1288:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            	    // InternalVertigoDsl.g:1304:9: (otherlv_9= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==32) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1305:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,32,FOLLOW_24); 

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
            	    // InternalVertigoDsl.g:1316:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1316:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1317:5: {...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1317:124: ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1318:6: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1321:9: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1321:10: {...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1321:19: (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1321:20: otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getCardinalityKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_25); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1329:9: ( (lv_cardinality_12_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:1330:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:1330:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:1331:11: lv_cardinality_12_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_cardinality_12_0=ruleCardinalityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cardinality",
            	    												lv_cardinality_12_0,
            	    												"io.vertigo.dsl.VertigoDsl.CardinalityString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1348:9: (otherlv_13= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==32) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1349:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,32,FOLLOW_24); 

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
            	    // InternalVertigoDsl.g:1360:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1360:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1361:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1361:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1362:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1365:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1365:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1365:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1365:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,34,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1373:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1374:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1374:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1375:11: lv_persistent_16_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentBooleanStringEnumRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
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

            	    // InternalVertigoDsl.g:1392:9: (otherlv_17= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==32) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1393:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,32,FOLLOW_24); 

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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // InternalVertigoDsl.g:1420:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1420:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1421:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
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
    // InternalVertigoDsl.g:1427:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_expressionString_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_refToDomainType_4_0 = null;

        Enumerator lv_cardinality_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1433:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1434:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1434:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1435:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1439:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1440:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1440:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1441:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1444:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1445:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1445:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVertigoDsl.g:1446:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1446:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1447:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1447:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1448:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1451:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1451:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1451:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1451:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1459:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1460:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1460:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1461:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
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

            	    // InternalVertigoDsl.g:1478:9: (otherlv_5= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==32) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1479:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_29); 

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
            	    // InternalVertigoDsl.g:1490:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1490:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1491:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1491:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1492:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1495:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1495:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1495:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1495:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1503:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1504:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1504:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1505:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

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

            	    // InternalVertigoDsl.g:1521:9: (otherlv_9= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==32) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1522:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,32,FOLLOW_29); 

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
            	    // InternalVertigoDsl.g:1533:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1533:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1534:5: {...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1534:128: ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1535:6: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1538:9: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1538:10: {...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1538:19: (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1538:20: otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getCardinalityKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_25); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1546:9: ( (lv_cardinality_12_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:1547:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:1547:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:1548:11: lv_cardinality_12_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_cardinality_12_0=ruleCardinalityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cardinality",
            	    												lv_cardinality_12_0,
            	    												"io.vertigo.dsl.VertigoDsl.CardinalityString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1565:9: (otherlv_13= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1566:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,32,FOLLOW_29); 

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
            	case 4 :
            	    // InternalVertigoDsl.g:1577:4: ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1577:4: ({...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1578:5: {...}? => ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1578:128: ( ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1579:6: ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1582:9: ({...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1582:10: {...}? => (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1582:19: (otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1582:20: otherlv_14= 'expression' otherlv_15= ':' ( (lv_expressionString_16_0= RULE_STRING ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,35,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1590:9: ( (lv_expressionString_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1591:10: (lv_expressionString_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1591:10: (lv_expressionString_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1592:11: lv_expressionString_16_0= RULE_STRING
            	    {
            	    lv_expressionString_16_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    											newLeafNode(lv_expressionString_16_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionStringSTRINGTerminalRuleCall_1_3_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"expressionString",
            	    												lv_expressionString_16_0,
            	    												"io.vertigo.dsl.VertigoDsl.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1608:9: (otherlv_17= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==32) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1609:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,32,FOLLOW_29); 

            	            										newLeafNode(otherlv_17, grammarAccess.getDtDefinitionComputedFieldStringAccess().getCommaKeyword_1_3_3());
            	            									

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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_18=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getDtDefinitionComputedFieldStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalVertigoDsl.g:1636:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:1636:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:1637:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
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
    // InternalVertigoDsl.g:1643:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1649:2: ( (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1650:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1650:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1651:3: otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:1655:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:1656:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:1656:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:1657:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:1674:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:1675:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:1675:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:1676:5: lv_idString_2_0= ruleDtDefinitionIdString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdFieldAccess().getIdStringDtDefinitionIdStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:1693:3: (otherlv_3= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVertigoDsl.g:1694:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1703:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:1703:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:1704:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
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
    // InternalVertigoDsl.g:1710:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1716:2: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1717:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1717:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1718:3: otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:1722:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:1723:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:1723:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:1724:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:1741:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:1742:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:1742:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:1743:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionDataFieldAccess().getDataFieldStringDtDefinitionDataFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:1760:3: (otherlv_3= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVertigoDsl.g:1761:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1770:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:1770:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:1771:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
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
    // InternalVertigoDsl.g:1777:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1783:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1784:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1784:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1785:3: otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:1789:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:1790:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:1790:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:1791:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:1808:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:1809:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:1809:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:1810:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionComputedFieldAccess().getComputedFieldStringDtDefinitionComputedFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:1827:3: (otherlv_3= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVertigoDsl.g:1828:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1837:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:1837:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:1838:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:1844:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1850:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1851:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1851:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1852:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1860:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1861:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1861:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1862:5: lv_stereoType_2_0= RULE_STRING
            {
            lv_stereoType_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:1878:3: (otherlv_3= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVertigoDsl.g:1879:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1888:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:1888:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:1889:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
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
    // InternalVertigoDsl.g:1895:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1901:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1902:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1902:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1903:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1911:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1912:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1912:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1913:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:1929:3: (otherlv_3= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVertigoDsl.g:1930:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1939:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:1939:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:1940:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
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
    // InternalVertigoDsl.g:1946:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1952:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1953:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1953:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1954:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1962:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1963:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1963:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1964:5: lv_displayField_2_0= RULE_STRING
            {
            lv_displayField_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:1980:3: (otherlv_3= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVertigoDsl.g:1981:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1990:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:1990:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:1991:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
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
    // InternalVertigoDsl.g:1997:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2003:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2004:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2004:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2005:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2013:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2014:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2014:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2015:5: lv_sortField_2_0= RULE_STRING
            {
            lv_sortField_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:2031:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:2032:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDtDefinitionHandleField"
    // InternalVertigoDsl.g:2041:1: entryRuleDtDefinitionHandleField returns [EObject current=null] : iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF ;
    public final EObject entryRuleDtDefinitionHandleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionHandleField = null;


        try {
            // InternalVertigoDsl.g:2041:64: (iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF )
            // InternalVertigoDsl.g:2042:2: iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionHandleFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionHandleField=ruleDtDefinitionHandleField();

            state._fsp--;

             current =iv_ruleDtDefinitionHandleField; 
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
    // $ANTLR end "entryRuleDtDefinitionHandleField"


    // $ANTLR start "ruleDtDefinitionHandleField"
    // InternalVertigoDsl.g:2048:1: ruleDtDefinitionHandleField returns [EObject current=null] : (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionHandleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_handleField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2054:2: ( (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2055:2: (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2055:2: (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2056:3: otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionHandleFieldAccess().getHandleFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionHandleFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2064:3: ( (lv_handleField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2065:4: (lv_handleField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2065:4: (lv_handleField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2066:5: lv_handleField_2_0= RULE_STRING
            {
            lv_handleField_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_handleField_2_0, grammarAccess.getDtDefinitionHandleFieldAccess().getHandleFieldSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionHandleFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"handleField",
            						lv_handleField_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:2082:3: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:2083:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionHandleFieldAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionHandleField"


    // $ANTLR start "entryRuleDtDefinitionStaticValues"
    // InternalVertigoDsl.g:2092:1: entryRuleDtDefinitionStaticValues returns [EObject current=null] : iv_ruleDtDefinitionStaticValues= ruleDtDefinitionStaticValues EOF ;
    public final EObject entryRuleDtDefinitionStaticValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStaticValues = null;


        try {
            // InternalVertigoDsl.g:2092:65: (iv_ruleDtDefinitionStaticValues= ruleDtDefinitionStaticValues EOF )
            // InternalVertigoDsl.g:2093:2: iv_ruleDtDefinitionStaticValues= ruleDtDefinitionStaticValues EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionStaticValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionStaticValues=ruleDtDefinitionStaticValues();

            state._fsp--;

             current =iv_ruleDtDefinitionStaticValues; 
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
    // $ANTLR end "entryRuleDtDefinitionStaticValues"


    // $ANTLR start "ruleDtDefinitionStaticValues"
    // InternalVertigoDsl.g:2099:1: ruleDtDefinitionStaticValues returns [EObject current=null] : (otherlv_0= 'values' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStaticValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_handleField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2105:2: ( (otherlv_0= 'values' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2106:2: (otherlv_0= 'values' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2106:2: (otherlv_0= 'values' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2107:3: otherlv_0= 'values' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStaticValuesAccess().getValuesKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStaticValuesAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2115:3: ( (lv_handleField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2116:4: (lv_handleField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2116:4: (lv_handleField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2117:5: lv_handleField_2_0= RULE_STRING
            {
            lv_handleField_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_handleField_2_0, grammarAccess.getDtDefinitionStaticValuesAccess().getHandleFieldSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionStaticValuesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"handleField",
            						lv_handleField_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:2133:3: (otherlv_3= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:2134:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getDtDefinitionStaticValuesAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleDtDefinitionStaticValues"


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:2143:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2143:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:2144:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:2150:1: ruleDtDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_15=null;
        EObject lv_dtDefinitionStereotype_5_0 = null;

        EObject lv_dtDefinitionDataSpace_6_0 = null;

        EObject lv_dtDefinitionIdField_7_0 = null;

        EObject lv_dtDefinitionDataFields_8_0 = null;

        EObject lv_dtDefinitionComputedFields_9_0 = null;

        EObject lv_dtDefinitionSortField_11_0 = null;

        EObject lv_dtDefinitionHandleField_12_0 = null;

        EObject lv_dtDefinitionDisplayField_13_0 = null;

        EObject lv_dtDefinitionStaticValues_14_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2156:2: ( (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalVertigoDsl.g:2157:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalVertigoDsl.g:2157:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalVertigoDsl.g:2158:3: otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2166:3: ()
            // InternalVertigoDsl.g:2167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDtDefinitionAccess().getDtDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:2173:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:2174:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2174:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:2175:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:2195:3: ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:2196:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2196:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2197:5: lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_32);
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

            // InternalVertigoDsl.g:2214:3: ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVertigoDsl.g:2215:4: (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace )
                    {
                    // InternalVertigoDsl.g:2215:4: (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace )
                    // InternalVertigoDsl.g:2216:5: lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_dtDefinitionDataSpace_6_0=ruleDtDefinitionDataSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionDataSpace",
                    						lv_dtDefinitionDataSpace_6_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2233:3: ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVertigoDsl.g:2234:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2234:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2235:5: lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_34);
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

            // InternalVertigoDsl.g:2252:3: ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVertigoDsl.g:2253:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2253:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2254:5: lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_34);
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
            	    break loop33;
                }
            } while (true);

            // InternalVertigoDsl.g:2271:3: ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==37) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalVertigoDsl.g:2272:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2272:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2273:5: lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop34;
                }
            } while (true);

            // InternalVertigoDsl.g:2290:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2291:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2291:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2292:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            				
            // InternalVertigoDsl.g:2295:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2296:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2296:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) ) )*
            loop35:
            do {
                int alt35=5;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2) ) {
                    alt35=3;
                }
                else if ( LA35_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 3) ) {
                    alt35=4;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVertigoDsl.g:2297:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2297:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2298:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2298:110: ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2299:6: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0);
            	    					
            	    // InternalVertigoDsl.g:2302:9: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2302:10: {...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2302:19: ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2302:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2302:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2303:10: lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_10_0_0());
            	    									
            	    pushFollow(FOLLOW_36);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2325:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2325:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2326:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2326:110: ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2327:6: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1);
            	    					
            	    // InternalVertigoDsl.g:2330:9: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2330:10: {...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2330:19: ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2330:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2330:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2331:10: lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_10_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_dtDefinitionHandleField_12_0=ruleDtDefinitionHandleField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionHandleField",
            	    											lv_dtDefinitionHandleField_12_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionHandleField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2353:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2353:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2354:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2354:110: ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2355:6: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2);
            	    					
            	    // InternalVertigoDsl.g:2358:9: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2358:10: {...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2358:19: ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2358:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2358:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2359:10: lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_10_2_0());
            	    									
            	    pushFollow(FOLLOW_36);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:2381:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2381:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) ) )
            	    // InternalVertigoDsl.g:2382:5: {...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2382:110: ( ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) ) )
            	    // InternalVertigoDsl.g:2383:6: ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 3);
            	    					
            	    // InternalVertigoDsl.g:2386:9: ({...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) ) )
            	    // InternalVertigoDsl.g:2386:10: {...}? => ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2386:19: ( (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues ) )
            	    // InternalVertigoDsl.g:2386:20: (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues )
            	    {
            	    // InternalVertigoDsl.g:2386:20: (lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues )
            	    // InternalVertigoDsl.g:2387:10: lv_dtDefinitionStaticValues_14_0= ruleDtDefinitionStaticValues
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStaticValuesDtDefinitionStaticValuesParserRuleCall_10_3_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_dtDefinitionStaticValues_14_0=ruleDtDefinitionStaticValues();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionStaticValues",
            	    											lv_dtDefinitionStaticValues_14_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionStaticValues");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            				

            }

            otherlv_15=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalVertigoDsl.g:2424:1: entryRuleAlterDtDefinition returns [EObject current=null] : iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF ;
    public final EObject entryRuleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2424:58: (iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF )
            // InternalVertigoDsl.g:2425:2: iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF
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
    // InternalVertigoDsl.g:2431:1: ruleAlterDtDefinition returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_14=null;
        EObject lv_dtDefinitionStereotype_4_0 = null;

        EObject lv_dtDefinitionDataSpace_5_0 = null;

        EObject lv_dtDefinitionIdField_6_0 = null;

        EObject lv_dtDefinitionDataFields_7_0 = null;

        EObject lv_dtDefinitionComputedFields_8_0 = null;

        EObject lv_dtDefinitionSortField_10_0 = null;

        EObject lv_dtDefinitionHandleField_11_0 = null;

        EObject lv_dtDefinitionDisplayField_12_0 = null;

        EObject lv_dtDefinitionStaticValues_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2437:2: ( (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2438:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2438:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2439:3: otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDtDefinitionAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2447:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:2448:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:2448:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:2449:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitioneDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterDtDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2464:3: ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVertigoDsl.g:2465:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2465:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2466:5: lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_32);
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

            // InternalVertigoDsl.g:2483:3: ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==23) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVertigoDsl.g:2484:4: (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace )
                    {
                    // InternalVertigoDsl.g:2484:4: (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace )
                    // InternalVertigoDsl.g:2485:5: lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_dtDefinitionDataSpace_5_0=ruleDtDefinitionDataSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionDataSpace",
                    						lv_dtDefinitionDataSpace_5_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionDataSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:2502:3: ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVertigoDsl.g:2503:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2503:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2504:5: lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_dtDefinitionIdField_6_0=ruleDtDefinitionIdField();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
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

            // InternalVertigoDsl.g:2521:3: ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalVertigoDsl.g:2522:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2522:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2523:5: lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_34);
            	    lv_dtDefinitionDataFields_7_0=ruleDtDefinitionDataField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
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
            	    break loop39;
                }
            } while (true);

            // InternalVertigoDsl.g:2540:3: ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==37) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalVertigoDsl.g:2541:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2541:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2542:5: lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_dtDefinitionComputedFields_8_0=ruleDtDefinitionComputedField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
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
            	    break loop40;
                }
            } while (true);

            // InternalVertigoDsl.g:2559:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2560:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2560:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2561:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2564:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2565:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2565:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) ) )*
            loop41:
            do {
                int alt41=5;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
                    alt41=3;
                }
                else if ( LA41_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 3) ) {
                    alt41=4;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalVertigoDsl.g:2566:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2566:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2567:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2567:114: ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2568:6: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2571:9: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2571:10: {...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2571:19: ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2571:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2571:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2572:10: lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_36);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2594:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2594:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2595:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2595:114: ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2596:6: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2599:9: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2599:10: {...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2599:19: ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2599:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2599:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2600:10: lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_dtDefinitionHandleField_11_0=ruleDtDefinitionHandleField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionHandleField",
            	    											lv_dtDefinitionHandleField_11_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionHandleField");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2622:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2622:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2623:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2623:114: ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2624:6: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:2627:9: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2627:10: {...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2627:19: ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2627:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2627:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2628:10: lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_dtDefinitionDisplayField_12_0=ruleDtDefinitionDisplayField();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:2650:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2650:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) ) )
            	    // InternalVertigoDsl.g:2651:5: {...}? => ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2651:114: ( ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) ) )
            	    // InternalVertigoDsl.g:2652:6: ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 3);
            	    					
            	    // InternalVertigoDsl.g:2655:9: ({...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) ) )
            	    // InternalVertigoDsl.g:2655:10: {...}? => ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2655:19: ( (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues ) )
            	    // InternalVertigoDsl.g:2655:20: (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues )
            	    {
            	    // InternalVertigoDsl.g:2655:20: (lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues )
            	    // InternalVertigoDsl.g:2656:10: lv_dtDefinitionStaticValues_13_0= ruleDtDefinitionStaticValues
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionStaticValuesDtDefinitionStaticValuesParserRuleCall_9_3_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_dtDefinitionStaticValues_13_0=ruleDtDefinitionStaticValues();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dtDefinitionStaticValues",
            	    											lv_dtDefinitionStaticValues_13_0,
            	    											"io.vertigo.dsl.VertigoDsl.DtDefinitionStaticValues");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            				

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAlterDtDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalVertigoDsl.g:2693:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:2693:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:2694:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:2700:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
        Token otherlv_52=null;
        Enumerator lv_navigabilityA_19_0 = null;

        Enumerator lv_navigabilityB_23_0 = null;

        Enumerator lv_multiplicityA_27_0 = null;

        Enumerator lv_multiplicityB_31_0 = null;

        Enumerator lv_type_51_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2706:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:2707:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:2707:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:2708:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:2716:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:2717:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2717:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:2718:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2738:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2739:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2739:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2740:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:2743:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2744:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2744:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=13;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalVertigoDsl.g:2745:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2745:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2746:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2746:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2747:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:2750:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:2750:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2750:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:2750:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:2758:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2759:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2759:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2760:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:2776:9: (otherlv_8= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==32) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2777:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2788:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2788:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2789:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2789:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2790:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:2793:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:2793:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2793:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:2793:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,45,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:2801:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:2802:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2802:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:2803:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2814:9: (otherlv_12= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==32) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2815:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2826:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2826:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2827:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2827:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2828:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:2831:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:2831:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2831:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:2831:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,46,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:2839:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:2840:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2840:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:2841:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_39); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2852:9: (otherlv_16= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==32) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2853:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2864:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2864:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2865:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2865:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2866:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:2869:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:2869:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2869:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:2869:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,47,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:2877:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2878:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2878:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2879:11: lv_navigabilityA_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalVertigoDsl.g:2896:9: (otherlv_20= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==32) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2897:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2908:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2908:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2909:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:2909:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2910:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:2913:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:2913:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2913:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:2913:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,48,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,24,FOLLOW_26); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:2921:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2922:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2922:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2923:11: lv_navigabilityB_23_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalVertigoDsl.g:2940:9: (otherlv_24= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==32) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2941:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2952:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2952:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2953:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:2953:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2954:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:2957:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:2957:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2957:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:2957:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,49,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_41); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:2965:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2966:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2966:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2967:11: lv_multiplicityA_27_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalVertigoDsl.g:2984:9: (otherlv_28= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==32) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2985:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2996:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2996:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2997:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:2997:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2998:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:3001:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:3001:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3001:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:3001:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,50,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,24,FOLLOW_41); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:3009:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3010:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3010:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3011:11: lv_multiplicityB_31_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalVertigoDsl.g:3028:9: (otherlv_32= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==32) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3029:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:3040:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3040:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3041:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:3041:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3042:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:3045:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:3045:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3045:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:3045:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,51,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:3053:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3054:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3054:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3055:11: lv_labelA_35_0= RULE_STRING
            	    {
            	    lv_labelA_35_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:3071:9: (otherlv_36= ',' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==32) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3072:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:3083:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3083:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3084:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:3084:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3085:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:3088:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:3088:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3088:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:3088:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:3096:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3097:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3097:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3098:11: lv_labelB_39_0= RULE_STRING
            	    {
            	    lv_labelB_39_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:3114:9: (otherlv_40= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==32) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3115:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:3126:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3126:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3127:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:3127:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3128:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:3131:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:3131:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3131:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:3131:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:3139:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3140:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3140:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3141:11: lv_roleA_43_0= RULE_STRING
            	    {
            	    lv_roleA_43_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:3157:9: (otherlv_44= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==32) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3158:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:3169:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3169:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3170:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:3170:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3171:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:3174:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:3174:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3174:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:3174:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:3182:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3183:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3183:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3184:11: lv_roleB_47_0= RULE_STRING
            	    {
            	    lv_roleB_47_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:3200:9: (otherlv_48= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==32) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3201:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,32,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:3212:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3212:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:3213:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:3213:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) )
            	    // InternalVertigoDsl.g:3214:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:3217:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) )
            	    // InternalVertigoDsl.g:3217:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3217:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) )
            	    // InternalVertigoDsl.g:3217:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) )
            	    {
            	    otherlv_49=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,24,FOLLOW_42); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:3225:9: ( (lv_type_51_0= ruleAssociationTypeString ) )
            	    // InternalVertigoDsl.g:3226:10: (lv_type_51_0= ruleAssociationTypeString )
            	    {
            	    // InternalVertigoDsl.g:3226:10: (lv_type_51_0= ruleAssociationTypeString )
            	    // InternalVertigoDsl.g:3227:11: lv_type_51_0= ruleAssociationTypeString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getTypeAssociationTypeStringEnumRuleCall_4_11_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_type_51_0=ruleAssociationTypeString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_51_0,
            	    												"io.vertigo.dsl.VertigoDsl.AssociationTypeString");
            	    											afterParserOrEnumRuleCall();
            	    										

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
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalVertigoDsl.g:3266:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:3266:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:3267:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:3273:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
        EObject lv_refToDomainType_4_0 = null;

        Enumerator lv_cardinality_8_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3279:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:3280:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:3280:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:3281:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:3285:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3286:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3286:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3287:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:3290:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3291:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3291:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=3;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalVertigoDsl.g:3292:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3292:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3293:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3293:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3294:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:3297:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:3297:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3297:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:3297:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:3305:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:3306:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:3306:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:3307:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
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

            	    // InternalVertigoDsl.g:3324:9: (otherlv_5= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==32) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3325:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_45); 

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
            	    // InternalVertigoDsl.g:3336:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3336:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3337:5: {...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3337:116: ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3338:6: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:3341:9: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:3341:10: {...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3341:19: (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:3341:20: otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getCardinalityKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_25); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:3349:9: ( (lv_cardinality_8_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:3350:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:3350:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:3351:11: lv_cardinality_8_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
            	    lv_cardinality_8_0=ruleCardinalityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cardinality",
            	    												lv_cardinality_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.CardinalityString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3368:9: (otherlv_9= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==32) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3369:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,32,FOLLOW_45); 

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

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canLeave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getRightCurlyBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleTaskInAttribute"
    // InternalVertigoDsl.g:3396:1: entryRuleTaskInAttribute returns [EObject current=null] : iv_ruleTaskInAttribute= ruleTaskInAttribute EOF ;
    public final EObject entryRuleTaskInAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskInAttribute = null;


        try {
            // InternalVertigoDsl.g:3396:56: (iv_ruleTaskInAttribute= ruleTaskInAttribute EOF )
            // InternalVertigoDsl.g:3397:2: iv_ruleTaskInAttribute= ruleTaskInAttribute EOF
            {
             newCompositeNode(grammarAccess.getTaskInAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskInAttribute=ruleTaskInAttribute();

            state._fsp--;

             current =iv_ruleTaskInAttribute; 
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
    // $ANTLR end "entryRuleTaskInAttribute"


    // $ANTLR start "ruleTaskInAttribute"
    // InternalVertigoDsl.g:3403:1: ruleTaskInAttribute returns [EObject current=null] : (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskInAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3409:2: ( (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3410:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3410:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3411:3: otherlv_0= 'in' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskInAttributeAccess().getInKeyword_0());
            		
            // InternalVertigoDsl.g:3415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3416:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3417:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskInAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskInAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:3433:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3434:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3434:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3435:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
            {

            					newCompositeNode(grammarAccess.getTaskInAttributeAccess().getTaskAttributeStringTaskAttributeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_taskAttributeString_2_0=ruleTaskAttributeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskInAttributeRule());
            					}
            					set(
            						current,
            						"taskAttributeString",
            						lv_taskAttributeString_2_0,
            						"io.vertigo.dsl.VertigoDsl.TaskAttributeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3452:3: (otherlv_3= ',' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalVertigoDsl.g:3453:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskInAttributeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskInAttribute"


    // $ANTLR start "entryRuleTaskOutAttribute"
    // InternalVertigoDsl.g:3462:1: entryRuleTaskOutAttribute returns [EObject current=null] : iv_ruleTaskOutAttribute= ruleTaskOutAttribute EOF ;
    public final EObject entryRuleTaskOutAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskOutAttribute = null;


        try {
            // InternalVertigoDsl.g:3462:57: (iv_ruleTaskOutAttribute= ruleTaskOutAttribute EOF )
            // InternalVertigoDsl.g:3463:2: iv_ruleTaskOutAttribute= ruleTaskOutAttribute EOF
            {
             newCompositeNode(grammarAccess.getTaskOutAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskOutAttribute=ruleTaskOutAttribute();

            state._fsp--;

             current =iv_ruleTaskOutAttribute; 
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
    // $ANTLR end "entryRuleTaskOutAttribute"


    // $ANTLR start "ruleTaskOutAttribute"
    // InternalVertigoDsl.g:3469:1: ruleTaskOutAttribute returns [EObject current=null] : (otherlv_0= 'out' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskOutAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3475:2: ( (otherlv_0= 'out' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3476:2: (otherlv_0= 'out' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3476:2: (otherlv_0= 'out' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3477:3: otherlv_0= 'out' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskOutAttributeAccess().getOutKeyword_0());
            		
            // InternalVertigoDsl.g:3481:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3482:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3482:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3483:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskOutAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskOutAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:3499:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3500:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3500:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3501:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
            {

            					newCompositeNode(grammarAccess.getTaskOutAttributeAccess().getTaskAttributeStringTaskAttributeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_taskAttributeString_2_0=ruleTaskAttributeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskOutAttributeRule());
            					}
            					set(
            						current,
            						"taskAttributeString",
            						lv_taskAttributeString_2_0,
            						"io.vertigo.dsl.VertigoDsl.TaskAttributeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3518:3: (otherlv_3= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalVertigoDsl.g:3519:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskOutAttributeAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskOutAttribute"


    // $ANTLR start "entryRuleTaskDataSpace"
    // InternalVertigoDsl.g:3528:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3528:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3529:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:3535:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3541:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3542:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3542:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3543:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3551:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3552:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3552:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3553:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:3569:3: (otherlv_3= ',' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==32) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVertigoDsl.g:3570:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTaskClassName"
    // InternalVertigoDsl.g:3579:1: entryRuleTaskClassName returns [EObject current=null] : iv_ruleTaskClassName= ruleTaskClassName EOF ;
    public final EObject entryRuleTaskClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskClassName = null;


        try {
            // InternalVertigoDsl.g:3579:54: (iv_ruleTaskClassName= ruleTaskClassName EOF )
            // InternalVertigoDsl.g:3580:2: iv_ruleTaskClassName= ruleTaskClassName EOF
            {
             newCompositeNode(grammarAccess.getTaskClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskClassName=ruleTaskClassName();

            state._fsp--;

             current =iv_ruleTaskClassName; 
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
    // $ANTLR end "entryRuleTaskClassName"


    // $ANTLR start "ruleTaskClassName"
    // InternalVertigoDsl.g:3586:1: ruleTaskClassName returns [EObject current=null] : (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskClassName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3592:2: ( (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3593:2: (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3593:2: (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3594:3: otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskClassNameAccess().getClassNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskClassNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3602:3: ( (lv_className_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3603:4: (lv_className_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3603:4: (lv_className_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3604:5: lv_className_2_0= RULE_STRING
            {
            lv_className_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_className_2_0, grammarAccess.getTaskClassNameAccess().getClassNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskClassNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3620:3: (otherlv_3= ',' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==32) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVertigoDsl.g:3621:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskClassNameAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskClassName"


    // $ANTLR start "entryRuleTaskRequest"
    // InternalVertigoDsl.g:3630:1: entryRuleTaskRequest returns [EObject current=null] : iv_ruleTaskRequest= ruleTaskRequest EOF ;
    public final EObject entryRuleTaskRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequest = null;


        try {
            // InternalVertigoDsl.g:3630:52: (iv_ruleTaskRequest= ruleTaskRequest EOF )
            // InternalVertigoDsl.g:3631:2: iv_ruleTaskRequest= ruleTaskRequest EOF
            {
             newCompositeNode(grammarAccess.getTaskRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRequest=ruleTaskRequest();

            state._fsp--;

             current =iv_ruleTaskRequest; 
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
    // $ANTLR end "entryRuleTaskRequest"


    // $ANTLR start "ruleTaskRequest"
    // InternalVertigoDsl.g:3637:1: ruleTaskRequest returns [EObject current=null] : (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_request_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3643:2: ( (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3644:2: (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3644:2: (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3645:3: otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequestAccess().getRequestKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRequestAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3653:3: ( (lv_request_2_0= ruleTaskRequestString ) )
            // InternalVertigoDsl.g:3654:4: (lv_request_2_0= ruleTaskRequestString )
            {
            // InternalVertigoDsl.g:3654:4: (lv_request_2_0= ruleTaskRequestString )
            // InternalVertigoDsl.g:3655:5: lv_request_2_0= ruleTaskRequestString
            {

            					newCompositeNode(grammarAccess.getTaskRequestAccess().getRequestTaskRequestStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_request_2_0=ruleTaskRequestString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRequestRule());
            					}
            					set(
            						current,
            						"request",
            						lv_request_2_0,
            						"io.vertigo.dsl.VertigoDsl.TaskRequestString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3672:3: (otherlv_3= ',' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalVertigoDsl.g:3673:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskRequestAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleTaskRequest"


    // $ANTLR start "entryRuleTaskRequestString"
    // InternalVertigoDsl.g:3682:1: entryRuleTaskRequestString returns [EObject current=null] : iv_ruleTaskRequestString= ruleTaskRequestString EOF ;
    public final EObject entryRuleTaskRequestString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequestString = null;


        try {
            // InternalVertigoDsl.g:3682:58: (iv_ruleTaskRequestString= ruleTaskRequestString EOF )
            // InternalVertigoDsl.g:3683:2: iv_ruleTaskRequestString= ruleTaskRequestString EOF
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
    // InternalVertigoDsl.g:3689:1: ruleTaskRequestString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleTaskRequestString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3695:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:3696:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalVertigoDsl.g:3696:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3697:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3697:3: (lv_string_0_0= RULE_STRING )
            // InternalVertigoDsl.g:3698:4: lv_string_0_0= RULE_STRING
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
    // InternalVertigoDsl.g:3717:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3717:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3718:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:3724:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )* ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )? otherlv_9= '}' ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        EObject lv_taskDataSpace_4_0 = null;

        EObject lv_className_5_0 = null;

        EObject lv_request_6_0 = null;

        EObject lv_taskAttributes_7_0 = null;

        EObject lv_taskAttributes_8_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3730:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )* ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )? otherlv_9= '}' ) )
            // InternalVertigoDsl.g:3731:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )* ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )? otherlv_9= '}' )
            {
            // InternalVertigoDsl.g:3731:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )* ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )? otherlv_9= '}' )
            // InternalVertigoDsl.g:3732:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )* ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3740:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3741:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3741:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3742:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:3762:3: ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==23) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVertigoDsl.g:3763:4: (lv_taskDataSpace_4_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:3763:4: (lv_taskDataSpace_4_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:3764:5: lv_taskDataSpace_4_0= ruleTaskDataSpace
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskDataSpaceTaskDataSpaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_47);
                    lv_taskDataSpace_4_0=ruleTaskDataSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"taskDataSpace",
                    						lv_taskDataSpace_4_0,
                    						"io.vertigo.dsl.VertigoDsl.TaskDataSpace");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:3781:3: ( (lv_className_5_0= ruleTaskClassName ) )
            // InternalVertigoDsl.g:3782:4: (lv_className_5_0= ruleTaskClassName )
            {
            // InternalVertigoDsl.g:3782:4: (lv_className_5_0= ruleTaskClassName )
            // InternalVertigoDsl.g:3783:5: lv_className_5_0= ruleTaskClassName
            {

            					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getClassNameTaskClassNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_48);
            lv_className_5_0=ruleTaskClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_5_0,
            						"io.vertigo.dsl.VertigoDsl.TaskClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:3800:3: ( (lv_request_6_0= ruleTaskRequest ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==58) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalVertigoDsl.g:3801:4: (lv_request_6_0= ruleTaskRequest )
                    {
                    // InternalVertigoDsl.g:3801:4: (lv_request_6_0= ruleTaskRequest )
                    // InternalVertigoDsl.g:3802:5: lv_request_6_0= ruleTaskRequest
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getRequestTaskRequestParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_49);
                    lv_request_6_0=ruleTaskRequest();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"request",
                    						lv_request_6_0,
                    						"io.vertigo.dsl.VertigoDsl.TaskRequest");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:3819:3: ( (lv_taskAttributes_7_0= ruleTaskInAttribute ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==55) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalVertigoDsl.g:3820:4: (lv_taskAttributes_7_0= ruleTaskInAttribute )
            	    {
            	    // InternalVertigoDsl.g:3820:4: (lv_taskAttributes_7_0= ruleTaskInAttribute )
            	    // InternalVertigoDsl.g:3821:5: lv_taskAttributes_7_0= ruleTaskInAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskInAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_49);
            	    lv_taskAttributes_7_0=ruleTaskInAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taskAttributes",
            	    						lv_taskAttributes_7_0,
            	    						"io.vertigo.dsl.VertigoDsl.TaskInAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // InternalVertigoDsl.g:3838:3: ( (lv_taskAttributes_8_0= ruleTaskOutAttribute ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalVertigoDsl.g:3839:4: (lv_taskAttributes_8_0= ruleTaskOutAttribute )
                    {
                    // InternalVertigoDsl.g:3839:4: (lv_taskAttributes_8_0= ruleTaskOutAttribute )
                    // InternalVertigoDsl.g:3840:5: lv_taskAttributes_8_0= ruleTaskOutAttribute
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskOutAttributeParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_taskAttributes_8_0=ruleTaskOutAttribute();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    					}
                    					add(
                    						current,
                    						"taskAttributes",
                    						lv_taskAttributes_8_0,
                    						"io.vertigo.dsl.VertigoDsl.TaskOutAttribute");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalVertigoDsl.g:3865:1: entryRuleFacetDefinitionDtDefinition returns [EObject current=null] : iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF ;
    public final EObject entryRuleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionDtDefinition = null;


        try {
            // InternalVertigoDsl.g:3865:68: (iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF )
            // InternalVertigoDsl.g:3866:2: iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF
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
    // InternalVertigoDsl.g:3872:1: ruleFacetDefinitionDtDefinition returns [EObject current=null] : (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3878:2: ( (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3879:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3879:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3880:3: otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionDtDefinitionAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3888:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:3889:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:3889:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:3890:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:3901:3: (otherlv_3= ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalVertigoDsl.g:3902:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3911:1: entryRuleFacetDefinitionFieldName returns [EObject current=null] : iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF ;
    public final EObject entryRuleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionFieldName = null;


        try {
            // InternalVertigoDsl.g:3911:65: (iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF )
            // InternalVertigoDsl.g:3912:2: iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF
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
    // InternalVertigoDsl.g:3918:1: ruleFacetDefinitionFieldName returns [EObject current=null] : (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3924:2: ( (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3925:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3925:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3926:3: otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionFieldNameAccess().getFieldNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionFieldNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3934:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3935:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3935:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3936:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:3952:3: (otherlv_3= ',' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==32) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalVertigoDsl.g:3953:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3962:1: entryRuleFacetDefinitionLabel returns [EObject current=null] : iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF ;
    public final EObject entryRuleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionLabel = null;


        try {
            // InternalVertigoDsl.g:3962:61: (iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF )
            // InternalVertigoDsl.g:3963:2: iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF
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
    // InternalVertigoDsl.g:3969:1: ruleFacetDefinitionLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3975:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3976:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3976:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3977:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionLabelAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3985:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3986:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3986:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3987:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:4003:3: (otherlv_3= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==32) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalVertigoDsl.g:4004:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4013:1: entryRuleFacetDefinitionRangeString returns [EObject current=null] : iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF ;
    public final EObject entryRuleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRangeString = null;


        try {
            // InternalVertigoDsl.g:4013:67: (iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF )
            // InternalVertigoDsl.g:4014:2: iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF
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
    // InternalVertigoDsl.g:4020:1: ruleFacetDefinitionRangeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:4026:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4027:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4027:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4028:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4032:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4033:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4033:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4034:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:4037:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4038:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4038:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=3;
                int LA71_0 = input.LA(1);

                if ( LA71_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt71=1;
                }
                else if ( LA71_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt71=2;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalVertigoDsl.g:4039:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4039:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4040:5: {...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4040:123: ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4041:6: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:4044:9: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:4044:10: {...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4044:19: (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:4044:20: otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:4052:9: ( (lv_filterString_4_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4053:10: (lv_filterString_4_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4053:10: (lv_filterString_4_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4054:11: lv_filterString_4_0= RULE_STRING
            	    {
            	    lv_filterString_4_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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

            	    // InternalVertigoDsl.g:4070:9: (otherlv_5= ',' )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==32) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4071:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,32,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:4082:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4082:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4083:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4083:123: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4084:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:4087:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:4087:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4087:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:4087:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:4095:9: ( (lv_labelString_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4096:10: (lv_labelString_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4096:10: (lv_labelString_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4097:11: lv_labelString_8_0= RULE_STRING
            	    {
            	    lv_labelString_8_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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

            	    // InternalVertigoDsl.g:4113:9: (otherlv_9= ',' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==32) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4114:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,32,FOLLOW_52); 

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

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4141:1: entryRuleFacetDefinitionRange returns [EObject current=null] : iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF ;
    public final EObject entryRuleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRange = null;


        try {
            // InternalVertigoDsl.g:4141:61: (iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF )
            // InternalVertigoDsl.g:4142:2: iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF
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
    // InternalVertigoDsl.g:4148:1: ruleFacetDefinitionRange returns [EObject current=null] : (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionRangeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4154:2: ( (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4155:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4155:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4156:3: otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeAccess().getRangeKeyword_0());
            		
            // InternalVertigoDsl.g:4160:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4161:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4161:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4162:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:4179:3: ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) )
            // InternalVertigoDsl.g:4180:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            {
            // InternalVertigoDsl.g:4180:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            // InternalVertigoDsl.g:4181:5: lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionRangeAccess().getFacetDefinitionRangeStringFacetDefinitionRangeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:4198:3: (otherlv_3= ',' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==32) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalVertigoDsl.g:4199:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFacetDefinitionParamString"
    // InternalVertigoDsl.g:4208:1: entryRuleFacetDefinitionParamString returns [EObject current=null] : iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF ;
    public final EObject entryRuleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParamString = null;


        try {
            // InternalVertigoDsl.g:4208:67: (iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF )
            // InternalVertigoDsl.g:4209:2: iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionParamStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionParamString=ruleFacetDefinitionParamString();

            state._fsp--;

             current =iv_ruleFacetDefinitionParamString; 
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
    // $ANTLR end "entryRuleFacetDefinitionParamString"


    // $ANTLR start "ruleFacetDefinitionParamString"
    // InternalVertigoDsl.g:4215:1: ruleFacetDefinitionParamString returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_paramValueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4221:2: ( (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:4222:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:4222:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:4223:3: otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4227:3: (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:4228:4: otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,64,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionParamStringAccess().getValueKeyword_1_0());
            			
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            				newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionParamStringAccess().getColonKeyword_1_1());
            			
            // InternalVertigoDsl.g:4236:4: ( (lv_paramValueString_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4237:5: (lv_paramValueString_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4237:5: (lv_paramValueString_3_0= RULE_STRING )
            // InternalVertigoDsl.g:4238:6: lv_paramValueString_3_0= RULE_STRING
            {
            lv_paramValueString_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            						newLeafNode(lv_paramValueString_3_0, grammarAccess.getFacetDefinitionParamStringAccess().getParamValueStringSTRINGTerminalRuleCall_1_2_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getFacetDefinitionParamStringRule());
            						}
            						setWithLastConsumed(
            							current,
            							"paramValueString",
            							lv_paramValueString_3_0,
            							"io.vertigo.dsl.VertigoDsl.STRING");
            					

            }


            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetDefinitionParamStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleFacetDefinitionParamString"


    // $ANTLR start "entryRuleFacetDefinitionParam"
    // InternalVertigoDsl.g:4263:1: entryRuleFacetDefinitionParam returns [EObject current=null] : iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF ;
    public final EObject entryRuleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParam = null;


        try {
            // InternalVertigoDsl.g:4263:61: (iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF )
            // InternalVertigoDsl.g:4264:2: iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF
            {
             newCompositeNode(grammarAccess.getFacetDefinitionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetDefinitionParam=ruleFacetDefinitionParam();

            state._fsp--;

             current =iv_ruleFacetDefinitionParam; 
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
    // $ANTLR end "entryRuleFacetDefinitionParam"


    // $ANTLR start "ruleFacetDefinitionParam"
    // InternalVertigoDsl.g:4270:1: ruleFacetDefinitionParam returns [EObject current=null] : (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionParamString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4276:2: ( (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4277:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4277:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4278:3: otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamAccess().getParamsKeyword_0());
            		
            // InternalVertigoDsl.g:4282:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4283:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4283:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4284:5: lv_name_1_0= ruleKEYWORDID
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionParamAccess().getNameKEYWORDIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleKEYWORDID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionParamRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.vertigo.dsl.VertigoDsl.KEYWORDID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4301:3: ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) )
            // InternalVertigoDsl.g:4302:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            {
            // InternalVertigoDsl.g:4302:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            // InternalVertigoDsl.g:4303:5: lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionParamAccess().getFacetDefinitionParamStringFacetDefinitionParamStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_facetDefinitionParamString_2_0=ruleFacetDefinitionParamString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFacetDefinitionParamRule());
            					}
            					set(
            						current,
            						"facetDefinitionParamString",
            						lv_facetDefinitionParamString_2_0,
            						"io.vertigo.dsl.VertigoDsl.FacetDefinitionParamString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVertigoDsl.g:4320:3: (otherlv_3= ',' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==32) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalVertigoDsl.g:4321:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionParamAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetDefinitionParam"


    // $ANTLR start "entryRuleFacetDefinition"
    // InternalVertigoDsl.g:4330:1: entryRuleFacetDefinition returns [EObject current=null] : iv_ruleFacetDefinition= ruleFacetDefinition EOF ;
    public final EObject entryRuleFacetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinition = null;


        try {
            // InternalVertigoDsl.g:4330:56: (iv_ruleFacetDefinition= ruleFacetDefinition EOF )
            // InternalVertigoDsl.g:4331:2: iv_ruleFacetDefinition= ruleFacetDefinition EOF
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
    // InternalVertigoDsl.g:4337:1: ruleFacetDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleFacetDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        EObject lv_facetDefinitionDtDefinition_6_0 = null;

        EObject lv_facetDefinitionFieldName_7_0 = null;

        EObject lv_facetDefinitonLabel_8_0 = null;

        EObject lv_facetDefinitionRange_9_0 = null;

        EObject lv_facetDefinitionParam_10_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4343:2: ( (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalVertigoDsl.g:4344:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalVertigoDsl.g:4344:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalVertigoDsl.g:4345:3: otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionAccess().getFacetDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4353:3: ()
            // InternalVertigoDsl.g:4354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetDefinitionAccess().getFacetDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4360:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4361:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4361:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4362:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_55); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4382:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4383:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4384:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4387:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            // InternalVertigoDsl.g:4388:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4388:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+
            int cnt76=0;
            loop76:
            do {
                int alt76=6;
                int LA76_0 = input.LA(1);

                if ( LA76_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt76=1;
                }
                else if ( LA76_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt76=2;
                }
                else if ( LA76_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt76=3;
                }
                else if ( LA76_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt76=4;
                }
                else if ( LA76_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt76=5;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalVertigoDsl.g:4389:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4389:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    // InternalVertigoDsl.g:4390:5: {...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4390:112: ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    // InternalVertigoDsl.g:4391:6: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4394:9: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    // InternalVertigoDsl.g:4394:10: {...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4394:19: ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    // InternalVertigoDsl.g:4394:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    {
            	    // InternalVertigoDsl.g:4394:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    // InternalVertigoDsl.g:4395:10: lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionDtDefinitionFacetDefinitionDtDefinitionParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    // InternalVertigoDsl.g:4417:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4417:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    // InternalVertigoDsl.g:4418:5: {...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4418:112: ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    // InternalVertigoDsl.g:4419:6: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4422:9: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    // InternalVertigoDsl.g:4422:10: {...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4422:19: ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    // InternalVertigoDsl.g:4422:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    {
            	    // InternalVertigoDsl.g:4422:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    // InternalVertigoDsl.g:4423:10: lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionFieldNameFacetDefinitionFieldNameParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    // InternalVertigoDsl.g:4445:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4445:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    // InternalVertigoDsl.g:4446:5: {...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4446:112: ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    // InternalVertigoDsl.g:4447:6: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4450:9: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    // InternalVertigoDsl.g:4450:10: {...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4450:19: ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    // InternalVertigoDsl.g:4450:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    {
            	    // InternalVertigoDsl.g:4450:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    // InternalVertigoDsl.g:4451:10: lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitonLabelFacetDefinitionLabelParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    // InternalVertigoDsl.g:4473:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4473:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    // InternalVertigoDsl.g:4474:5: {...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:4474:112: ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    // InternalVertigoDsl.g:4475:6: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:4478:9: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    int cnt74=0;
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==63) ) {
            	            int LA74_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt74=1;
            	            }


            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4478:10: {...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4478:19: ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    // InternalVertigoDsl.g:4478:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    {
            	    	    // InternalVertigoDsl.g:4478:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    // InternalVertigoDsl.g:4479:10: lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionRangeFacetDefinitionRangeParserRuleCall_5_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_56);
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
            	    	    if ( cnt74 >= 1 ) break loop74;
            	                EarlyExitException eee =
            	                    new EarlyExitException(74, input);
            	                throw eee;
            	        }
            	        cnt74++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:4501:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4501:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    // InternalVertigoDsl.g:4502:5: {...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:4502:112: ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    // InternalVertigoDsl.g:4503:6: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:4506:9: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    int cnt75=0;
            	    loop75:
            	    do {
            	        int alt75=2;
            	        int LA75_0 = input.LA(1);

            	        if ( (LA75_0==65) ) {
            	            int LA75_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt75=1;
            	            }


            	        }


            	        switch (alt75) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4506:10: {...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4506:19: ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    // InternalVertigoDsl.g:4506:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    {
            	    	    // InternalVertigoDsl.g:4506:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    // InternalVertigoDsl.g:4507:10: lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionParamFacetDefinitionParamParserRuleCall_5_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_56);
            	    	    lv_facetDefinitionParam_10_0=ruleFacetDefinitionParam();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getFacetDefinitionRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"facetDefinitionParam",
            	    	    											lv_facetDefinitionParam_10_0,
            	    	    											"io.vertigo.dsl.VertigoDsl.FacetDefinitionParam");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt75 >= 1 ) break loop75;
            	                EarlyExitException eee =
            	                    new EarlyExitException(75, input);
            	                throw eee;
            	        }
            	        cnt75++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFacetDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVertigoDsl.g:4545:1: entryRuleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF ;
    public final EObject entryRuleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4545:73: (iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4546:2: iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:4552:1: ruleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4558:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4559:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4559:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4560:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4568:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4569:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4569:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4570:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4581:3: (otherlv_3= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==32) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalVertigoDsl.g:4582:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4591:1: entryRuleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF ;
    public final EObject entryRuleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionDomainCriteria = null;


        try {
            // InternalVertigoDsl.g:4591:77: (iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF )
            // InternalVertigoDsl.g:4592:2: iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF
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
    // InternalVertigoDsl.g:4598:1: ruleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refToDomainType_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4604:2: ( (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4605:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4605:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4606:3: otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getDomainCriteriaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4614:3: ( (lv_refToDomainType_2_0= ruleRefToDomainType ) )
            // InternalVertigoDsl.g:4615:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            {
            // InternalVertigoDsl.g:4615:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            // InternalVertigoDsl.g:4616:5: lv_refToDomainType_2_0= ruleRefToDomainType
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:4633:3: (otherlv_3= ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==32) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalVertigoDsl.g:4634:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4643:1: entryRuleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderQuery = null;


        try {
            // InternalVertigoDsl.g:4643:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF )
            // InternalVertigoDsl.g:4644:2: iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF
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
    // InternalVertigoDsl.g:4650:1: ruleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4656:2: ( (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4657:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4657:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4658:3: otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getListFilterBuilderClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4666:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4667:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4667:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4668:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:4684:3: (otherlv_3= ',' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==32) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalVertigoDsl.g:4685:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFacetedQueryDefinitionGeoSearchQuery"
    // InternalVertigoDsl.g:4694:1: entryRuleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionGeoSearchQuery = null;


        try {
            // InternalVertigoDsl.g:4694:77: (iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF )
            // InternalVertigoDsl.g:4695:2: iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF
            {
             newCompositeNode(grammarAccess.getFacetedQueryDefinitionGeoSearchQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFacetedQueryDefinitionGeoSearchQuery=ruleFacetedQueryDefinitionGeoSearchQuery();

            state._fsp--;

             current =iv_ruleFacetedQueryDefinitionGeoSearchQuery; 
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
    // $ANTLR end "entryRuleFacetedQueryDefinitionGeoSearchQuery"


    // $ANTLR start "ruleFacetedQueryDefinitionGeoSearchQuery"
    // InternalVertigoDsl.g:4701:1: ruleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4707:2: ( (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4708:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4708:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4709:3: otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getGeoSearchQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4717:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4718:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4718:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4719:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_string_2_0, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getStringSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionGeoSearchQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"string",
            						lv_string_2_0,
            						"io.vertigo.dsl.VertigoDsl.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:4735:3: (otherlv_3= ',' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==32) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalVertigoDsl.g:4736:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getCommaKeyword_3());
                    			

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
    // $ANTLR end "ruleFacetedQueryDefinitionGeoSearchQuery"


    // $ANTLR start "entryRuleFacetedQueryDefinitionListFilterBuilderClass"
    // InternalVertigoDsl.g:4745:1: entryRuleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderClass = null;


        try {
            // InternalVertigoDsl.g:4745:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF )
            // InternalVertigoDsl.g:4746:2: iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF
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
    // InternalVertigoDsl.g:4752:1: ruleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4758:2: ( (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4759:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4759:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4760:3: otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getListFilterBuilderQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4768:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4769:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4769:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4770:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:4786:3: (otherlv_3= ',' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==32) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalVertigoDsl.g:4787:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4796:1: entryRuleFacetedQueryDefinitionFacets returns [EObject current=null] : iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF ;
    public final EObject entryRuleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionFacets = null;


        try {
            // InternalVertigoDsl.g:4796:69: (iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF )
            // InternalVertigoDsl.g:4797:2: iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF
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
    // InternalVertigoDsl.g:4803:1: ruleFacetedQueryDefinitionFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) ;
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
            // InternalVertigoDsl.g:4809:2: ( (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) )
            // InternalVertigoDsl.g:4810:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            {
            // InternalVertigoDsl.g:4810:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            // InternalVertigoDsl.g:4811:3: otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVertigoDsl.g:4823:3: ( (otherlv_3= RULE_ID ) )
            // InternalVertigoDsl.g:4824:4: (otherlv_3= RULE_ID )
            {
            // InternalVertigoDsl.g:4824:4: (otherlv_3= RULE_ID )
            // InternalVertigoDsl.g:4825:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetDefinitionFacetDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalVertigoDsl.g:4836:3: ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==32) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalVertigoDsl.g:4837:4: (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:4837:4: (otherlv_4= ',' )+
            	    int cnt82=0;
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==32) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4838:5: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,32,FOLLOW_59); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_4_0());
            	    	    				

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

            	    // InternalVertigoDsl.g:4843:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalVertigoDsl.g:4844:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:4844:5: (otherlv_5= RULE_ID )
            	    // InternalVertigoDsl.g:4845:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_58); 

            	    						newLeafNode(otherlv_5, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsFacetDefinitionCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_6=(Token)match(input,74,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getRightSquareBracketKeyword_5());
            		
            // InternalVertigoDsl.g:4861:3: (otherlv_7= ',' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==32) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalVertigoDsl.g:4862:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4871:1: entryRuleFacetedQueryDefinition returns [EObject current=null] : iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF ;
    public final EObject entryRuleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinition = null;


        try {
            // InternalVertigoDsl.g:4871:63: (iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF )
            // InternalVertigoDsl.g:4872:2: iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF
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
    // InternalVertigoDsl.g:4878:1: ruleFacetedQueryDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
    public final EObject ruleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_12=null;
        EObject lv_facetedQueryDefinitionKeyConcept_6_0 = null;

        EObject lv_facetedQueryDefinitionDomainCriteria_7_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderQuery_8_0 = null;

        EObject lv_facetedQueryDefinitionGeoSearchQuery_9_0 = null;

        EObject lv_facetedQueryDefinitionListFilterBuilderClass_10_0 = null;

        EObject lv_facetedQueryDefinitionFacets_11_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4884:2: ( (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalVertigoDsl.g:4885:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalVertigoDsl.g:4885:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalVertigoDsl.g:4886:3: otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_60); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,75,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4894:3: ()
            // InternalVertigoDsl.g:4895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4901:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4902:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4902:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4903:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_61); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4923:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4924:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4924:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4925:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4928:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4929:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4929:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=7;
                int LA85_0 = input.LA(1);

                if ( LA85_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt85=1;
                }
                else if ( LA85_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt85=2;
                }
                else if ( LA85_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt85=3;
                }
                else if ( LA85_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt85=4;
                }
                else if ( LA85_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt85=5;
                }
                else if ( LA85_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                    alt85=6;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalVertigoDsl.g:4930:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4930:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:4931:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4931:119: ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:4932:6: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4935:9: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:4935:10: {...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4935:19: ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:4935:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:4935:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:4936:10: lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyConceptFacetedQueryDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_62);
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
            	    // InternalVertigoDsl.g:4958:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4958:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    // InternalVertigoDsl.g:4959:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4959:119: ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    // InternalVertigoDsl.g:4960:6: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4963:9: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    // InternalVertigoDsl.g:4963:10: {...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4963:19: ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    // InternalVertigoDsl.g:4963:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    {
            	    // InternalVertigoDsl.g:4963:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    // InternalVertigoDsl.g:4964:10: lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionDomainCriteriaFacetedQueryDefinitionDomainCriteriaParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_62);
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
            	    // InternalVertigoDsl.g:4986:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4986:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:4987:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4987:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    // InternalVertigoDsl.g:4988:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4991:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    // InternalVertigoDsl.g:4991:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4991:19: ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    // InternalVertigoDsl.g:4991:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    {
            	    // InternalVertigoDsl.g:4991:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    // InternalVertigoDsl.g:4992:10: lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderQueryFacetedQueryDefinitionListFilterBuilderQueryParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_62);
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
            	    // InternalVertigoDsl.g:5014:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5014:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:5015:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5015:119: ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    // InternalVertigoDsl.g:5016:6: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5019:9: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    // InternalVertigoDsl.g:5019:10: {...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5019:19: ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    // InternalVertigoDsl.g:5019:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    {
            	    // InternalVertigoDsl.g:5019:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    // InternalVertigoDsl.g:5020:10: lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionGeoSearchQueryFacetedQueryDefinitionGeoSearchQueryParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_62);
            	    lv_facetedQueryDefinitionGeoSearchQuery_9_0=ruleFacetedQueryDefinitionGeoSearchQuery();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionGeoSearchQuery",
            	    											lv_facetedQueryDefinitionGeoSearchQuery_9_0,
            	    											"io.vertigo.dsl.VertigoDsl.FacetedQueryDefinitionGeoSearchQuery");
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
            	    // InternalVertigoDsl.g:5042:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5042:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    // InternalVertigoDsl.g:5043:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:5043:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    // InternalVertigoDsl.g:5044:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:5047:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    // InternalVertigoDsl.g:5047:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5047:19: ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    // InternalVertigoDsl.g:5047:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    {
            	    // InternalVertigoDsl.g:5047:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    // InternalVertigoDsl.g:5048:10: lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderClassFacetedQueryDefinitionListFilterBuilderClassParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_62);
            	    lv_facetedQueryDefinitionListFilterBuilderClass_10_0=ruleFacetedQueryDefinitionListFilterBuilderClass();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionListFilterBuilderClass",
            	    											lv_facetedQueryDefinitionListFilterBuilderClass_10_0,
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
            	case 6 :
            	    // InternalVertigoDsl.g:5070:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5070:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    // InternalVertigoDsl.g:5071:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalVertigoDsl.g:5071:119: ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    // InternalVertigoDsl.g:5072:6: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5);
            	    					
            	    // InternalVertigoDsl.g:5075:9: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    // InternalVertigoDsl.g:5075:10: {...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5075:19: ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    // InternalVertigoDsl.g:5075:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    {
            	    // InternalVertigoDsl.g:5075:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    // InternalVertigoDsl.g:5076:10: lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionFacetsFacetedQueryDefinitionFacetsParserRuleCall_5_5_0());
            	    									
            	    pushFollow(FOLLOW_62);
            	    lv_facetedQueryDefinitionFacets_11_0=ruleFacetedQueryDefinitionFacets();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getFacetedQueryDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facetedQueryDefinitionFacets",
            	    											lv_facetedQueryDefinitionFacets_11_0,
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
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_12=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFacetedQueryDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalVertigoDsl.g:5114:1: entryRuleIndexDefinitionKeyConcept returns [EObject current=null] : iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF ;
    public final EObject entryRuleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:5114:66: (iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:5115:2: iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:5121:1: ruleIndexDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5127:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5128:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5128:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5129:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5137:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5138:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5138:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5139:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5150:3: (otherlv_3= ',' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==32) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalVertigoDsl.g:5151:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5160:1: entryRuleIndexDefinitionDtIndex returns [EObject current=null] : iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF ;
    public final EObject entryRuleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionDtIndex = null;


        try {
            // InternalVertigoDsl.g:5160:63: (iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF )
            // InternalVertigoDsl.g:5161:2: iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF
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
    // InternalVertigoDsl.g:5167:1: ruleIndexDefinitionDtIndex returns [EObject current=null] : (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5173:2: ( (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5174:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5174:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5175:3: otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionDtIndexAccess().getDtIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionDtIndexAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5183:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5184:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5184:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5185:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionDtIndexRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionDtIndexAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5196:3: (otherlv_3= ',' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==32) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalVertigoDsl.g:5197:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5206:1: entryRuleIndexDefinitionIndexCopyToString returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyToString = null;


        try {
            // InternalVertigoDsl.g:5206:73: (iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF )
            // InternalVertigoDsl.g:5207:2: iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF
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
    // InternalVertigoDsl.g:5213:1: ruleIndexDefinitionIndexCopyToString returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5219:2: ( (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:5220:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:5220:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:5221:3: otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getColonKeyword_2());
            		
            // InternalVertigoDsl.g:5233:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5234:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5234:4: (lv_string_3_0= RULE_STRING )
            // InternalVertigoDsl.g:5235:5: lv_string_3_0= RULE_STRING
            {
            lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5259:1: entryRuleIndexDefinitionIndexCopyTo returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyTo = null;


        try {
            // InternalVertigoDsl.g:5259:67: (iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF )
            // InternalVertigoDsl.g:5260:2: iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF
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
    // InternalVertigoDsl.g:5266:1: ruleIndexDefinitionIndexCopyTo returns [EObject current=null] : (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_indexDefinitionIndexCopyToString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:5272:2: ( (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5273:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5273:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5274:3: otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexCopyToKeyword_0());
            		
            // InternalVertigoDsl.g:5278:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:5279:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:5279:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:5280:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:5297:3: ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) )
            // InternalVertigoDsl.g:5298:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            {
            // InternalVertigoDsl.g:5298:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            // InternalVertigoDsl.g:5299:5: lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexDefinitionIndexCopyToStringIndexDefinitionIndexCopyToStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalVertigoDsl.g:5316:3: (otherlv_3= ',' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==32) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalVertigoDsl.g:5317:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5326:1: entryRuleIndexDefinitionLoaderId returns [EObject current=null] : iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF ;
    public final EObject entryRuleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionLoaderId = null;


        try {
            // InternalVertigoDsl.g:5326:64: (iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF )
            // InternalVertigoDsl.g:5327:2: iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF
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
    // InternalVertigoDsl.g:5333:1: ruleIndexDefinitionLoaderId returns [EObject current=null] : (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_loaderIdString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5339:2: ( (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5340:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5340:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5341:3: otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionLoaderIdAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5349:3: ( (lv_loaderIdString_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5350:4: (lv_loaderIdString_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5350:4: (lv_loaderIdString_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5351:5: lv_loaderIdString_2_0= RULE_STRING
            {
            lv_loaderIdString_2_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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

            // InternalVertigoDsl.g:5367:3: (otherlv_3= ',' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==32) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalVertigoDsl.g:5368:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5377:1: entryRuleIndexDefinition returns [EObject current=null] : iv_ruleIndexDefinition= ruleIndexDefinition EOF ;
    public final EObject entryRuleIndexDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinition = null;


        try {
            // InternalVertigoDsl.g:5377:56: (iv_ruleIndexDefinition= ruleIndexDefinition EOF )
            // InternalVertigoDsl.g:5378:2: iv_ruleIndexDefinition= ruleIndexDefinition EOF
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
    // InternalVertigoDsl.g:5384:1: ruleIndexDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:5390:2: ( (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:5391:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:5391:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:5392:3: otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,80,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5400:3: ()
            // InternalVertigoDsl.g:5401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexDefinitionAccess().getIndexDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5407:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5408:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5408:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5409:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_65); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5429:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5430:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5430:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5431:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5434:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5435:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5435:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+
            int cnt90=0;
            loop90:
            do {
                int alt90=5;
                int LA90_0 = input.LA(1);

                if ( LA90_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt90=1;
                }
                else if ( LA90_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt90=2;
                }
                else if ( LA90_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt90=3;
                }
                else if ( LA90_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt90=4;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalVertigoDsl.g:5436:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5436:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5437:5: {...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5437:112: ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5438:6: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5441:9: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5441:10: {...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5441:19: ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5441:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5441:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5442:10: lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyConceptIndexDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_66);
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
            	    // InternalVertigoDsl.g:5464:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5464:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    // InternalVertigoDsl.g:5465:5: {...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5465:112: ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    // InternalVertigoDsl.g:5466:6: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5469:9: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    // InternalVertigoDsl.g:5469:10: {...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5469:19: ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    // InternalVertigoDsl.g:5469:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    {
            	    // InternalVertigoDsl.g:5469:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    // InternalVertigoDsl.g:5470:10: lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionDtIndexIndexDefinitionDtIndexParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_66);
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
            	    // InternalVertigoDsl.g:5492:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5492:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    // InternalVertigoDsl.g:5493:5: {...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5493:112: ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    // InternalVertigoDsl.g:5494:6: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5497:9: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    // InternalVertigoDsl.g:5497:10: {...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5497:19: ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    // InternalVertigoDsl.g:5497:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    {
            	    // InternalVertigoDsl.g:5497:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    // InternalVertigoDsl.g:5498:10: lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionLoaderIdIndexDefinitionLoaderIdParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_66);
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
            	    // InternalVertigoDsl.g:5520:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5520:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    // InternalVertigoDsl.g:5521:5: {...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5521:112: ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    // InternalVertigoDsl.g:5522:6: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5525:9: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    // InternalVertigoDsl.g:5525:10: {...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5525:19: ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    // InternalVertigoDsl.g:5525:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    {
            	    // InternalVertigoDsl.g:5525:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    // InternalVertigoDsl.g:5526:10: lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionIndexCopyToIndexDefinitionIndexCopyToParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_66);
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
            	    if ( cnt90 >= 1 ) break loop90;
                        EarlyExitException eee =
                            new EarlyExitException(90, input);
                        throw eee;
                }
                cnt90++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5564:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) ;
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
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5570:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) )
            // InternalVertigoDsl.g:5571:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            {
            // InternalVertigoDsl.g:5571:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            int alt91=10;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt91=1;
                }
                break;
            case 82:
                {
                alt91=2;
                }
                break;
            case 83:
                {
                alt91=3;
                }
                break;
            case 84:
                {
                alt91=4;
                }
                break;
            case 85:
                {
                alt91=5;
                }
                break;
            case 86:
                {
                alt91=6;
                }
                break;
            case 87:
                {
                alt91=7;
                }
                break;
            case 88:
                {
                alt91=8;
                }
                break;
            case 89:
                {
                alt91=9;
                }
                break;
            case 90:
                {
                alt91=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalVertigoDsl.g:5572:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:5572:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:5573:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5580:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:5580:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:5581:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5588:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:5588:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:5589:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:5596:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:5596:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:5597:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:5604:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:5604:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:5605:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:5612:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:5612:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:5613:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:5620:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:5620:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:5621:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:5628:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:5628:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:5629:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:5636:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:5636:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:5637:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVertigoDsl.g:5644:3: (enumLiteral_9= 'ValueObject' )
                    {
                    // InternalVertigoDsl.g:5644:3: (enumLiteral_9= 'ValueObject' )
                    // InternalVertigoDsl.g:5645:4: enumLiteral_9= 'ValueObject'
                    {
                    enumLiteral_9=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getVALUE_OBJECTEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getVALUE_OBJECTEnumLiteralDeclaration_9());
                    			

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
    // InternalVertigoDsl.g:5655:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5661:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:5662:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:5662:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==91) ) {
                alt92=1;
            }
            else if ( (LA92_0==92) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // InternalVertigoDsl.g:5663:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:5663:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:5664:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5671:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:5671:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:5672:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,92,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5682:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5688:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) ) )
            // InternalVertigoDsl.g:5689:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) )
            {
            // InternalVertigoDsl.g:5689:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt93=1;
                }
                break;
            case 94:
                {
                alt93=2;
                }
                break;
            case 95:
                {
                alt93=3;
                }
                break;
            case 96:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalVertigoDsl.g:5690:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:5690:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:5691:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5698:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:5698:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:5699:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5706:3: (enumLiteral_2= '\"1..1\"' )
                    {
                    // InternalVertigoDsl.g:5706:3: (enumLiteral_2= '\"1..1\"' )
                    // InternalVertigoDsl.g:5707:4: enumLiteral_2= '\"1..1\"'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:5714:3: (enumLiteral_3= '\"1..*\"' )
                    {
                    // InternalVertigoDsl.g:5714:3: (enumLiteral_3= '\"1..*\"' )
                    // InternalVertigoDsl.g:5715:4: enumLiteral_3= '\"1..*\"'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getONE_NEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMultiplicityStringAccess().getONE_NEnumLiteralDeclaration_3());
                    			

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


    // $ANTLR start "ruleCardinalityString"
    // InternalVertigoDsl.g:5725:1: ruleCardinalityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) ;
    public final Enumerator ruleCardinalityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5731:2: ( ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) )
            // InternalVertigoDsl.g:5732:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            {
            // InternalVertigoDsl.g:5732:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            int alt94=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt94=1;
                }
                break;
            case 98:
                {
                alt94=2;
                }
                break;
            case 99:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalVertigoDsl.g:5733:3: (enumLiteral_0= '\"1\"' )
                    {
                    // InternalVertigoDsl.g:5733:3: (enumLiteral_0= '\"1\"' )
                    // InternalVertigoDsl.g:5734:4: enumLiteral_0= '\"1\"'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5741:3: (enumLiteral_1= '\"?\"' )
                    {
                    // InternalVertigoDsl.g:5741:3: (enumLiteral_1= '\"?\"' )
                    // InternalVertigoDsl.g:5742:4: enumLiteral_1= '\"?\"'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5749:3: (enumLiteral_2= '\"*\"' )
                    {
                    // InternalVertigoDsl.g:5749:3: (enumLiteral_2= '\"*\"' )
                    // InternalVertigoDsl.g:5750:4: enumLiteral_2= '\"*\"'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getMANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCardinalityStringAccess().getMANYEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleCardinalityString"


    // $ANTLR start "ruleAssociationTypeString"
    // InternalVertigoDsl.g:5760:1: ruleAssociationTypeString returns [Enumerator current=null] : ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) ) ;
    public final Enumerator ruleAssociationTypeString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5766:2: ( ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) ) )
            // InternalVertigoDsl.g:5767:2: ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) )
            {
            // InternalVertigoDsl.g:5767:2: ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt95=1;
                }
                break;
            case 101:
                {
                alt95=2;
                }
                break;
            case 102:
                {
                alt95=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalVertigoDsl.g:5768:3: (enumLiteral_0= '\"*>1\"' )
                    {
                    // InternalVertigoDsl.g:5768:3: (enumLiteral_0= '\"*>1\"' )
                    // InternalVertigoDsl.g:5769:4: enumLiteral_0= '\"*>1\"'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeStringAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssociationTypeStringAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5776:3: (enumLiteral_1= '\"*>?\"' )
                    {
                    // InternalVertigoDsl.g:5776:3: (enumLiteral_1= '\"*>?\"' )
                    // InternalVertigoDsl.g:5777:4: enumLiteral_1= '\"*>?\"'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeStringAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssociationTypeStringAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5784:3: (enumLiteral_2= '\"*>*\"' )
                    {
                    // InternalVertigoDsl.g:5784:3: (enumLiteral_2= '\"*>*\"' )
                    // InternalVertigoDsl.g:5785:4: enumLiteral_2= '\"*>*\"'
                    {
                    enumLiteral_2=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeStringAccess().getMANYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAssociationTypeStringAccess().getMANYEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleAssociationTypeString"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\21\3\22\14\uffff";
    static final String dfa_3s = "\1\37\1\120\2\23\14\uffff";
    static final String dfa_4s = "\4\uffff\1\14\1\5\1\10\1\11\1\3\1\12\1\13\1\1\1\7\1\2\1\6\1\4";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\2\uffff\1\1\12\uffff\1\2",
            "\1\13\1\5\1\uffff\1\10\25\uffff\1\6\17\uffff\1\7\6\uffff\1\11\10\uffff\1\4\4\uffff\1\12",
            "\1\15\1\14",
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
            return "275:2: (this_Domain_0= ruleDomain | this_AlterDomain_1= ruleAlterDomain | this_FileInfo_2= ruleFileInfo | this_DeclaredDomain_3= ruleDeclaredDomain | this_DtDefinition_4= ruleDtDefinition | this_DeclaredDtDefinition_5= ruleDeclaredDtDefinition | this_AlterDtDefinition_6= ruleAlterDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition | this_FacetDefinition_9= ruleFacetDefinition | this_IndexDefinition_10= ruleIndexDefinition | this_FacetedQueryDefinition_11= ruleFacetedQueryDefinition )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\31\15\uffff";
    static final String dfa_9s = "\1\66\15\uffff";
    static final String dfa_10s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_11s = "\1\0\15\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\15\20\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 2744:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==25) ) {s = 1;}

                        else if ( LA53_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA53_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA53_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA53_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA53_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA53_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA53_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA53_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA53_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA53_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA53_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA53_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FE0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000007A000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000102014000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002014000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600014000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000702014000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000602014000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000A00014000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000B02014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000A02014000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000007F002808000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000007B002808000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000007B002008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000007B002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000007A002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000078002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x007FF00008000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x007FF0010A000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x007FF0000A000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000302004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000202004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0580000002000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0180000002000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000102010000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000002010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xB000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xB000000002010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000002000000L,0x00000000000001F8L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x000000000000D008L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000002000000L,0x000000000000D008L});

}
