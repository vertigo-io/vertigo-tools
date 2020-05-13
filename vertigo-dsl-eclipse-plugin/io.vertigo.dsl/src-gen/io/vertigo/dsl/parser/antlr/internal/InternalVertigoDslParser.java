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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'id'", "'label'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'type'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'unit'", "'alter'", "'cardinality'", "'persistent'", "'expression'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'handleField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'inOut'", "'attribute'", "'Task'", "'request'", "'dtDefinition'", "'fieldName'", "'filter'", "'range'", "'value'", "'params'", "'FacetDefinition'", "'keyConcept'", "'domainCriteria'", "'listFilterBuilderClass'", "'geoSearchQuery'", "'listFilterBuilderQuery'", "'facets'", "'FacetedQueryDefinition'", "'dtIndex'", "'from'", "'indexCopyTo'", "'loaderId'", "'IndexDefinition'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'ValueObject'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"1..1\"'", "'\"1\"'", "'\"?\"'", "'\"*\"'", "'\"in\"'", "'\"out\"'"
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
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__105=105;

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

                if ( (LA1_0==17||LA1_0==20||LA1_0==27||(LA1_0>=32 && LA1_0<=36)||(LA1_0>=40 && LA1_0<=41)) ) {
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
    // InternalVertigoDsl.g:823:1: ruleDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_type_10_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_storeType_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_indexType_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_unit_30_0=null;
        Token otherlv_31=null;
        Enumerator lv_dataType_7_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:829:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:830:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:830:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:831:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:831:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:832:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:835:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:836:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:836:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=3;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalVertigoDsl.g:837:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:837:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    // InternalVertigoDsl.g:838:4: {...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:838:100: ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    // InternalVertigoDsl.g:839:5: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:842:8: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    // InternalVertigoDsl.g:842:9: {...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:842:18: (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    // InternalVertigoDsl.g:842:19: otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getCreateKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,18,FOLLOW_8); 

            	    								newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:850:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:851:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:851:9: (lv_name_3_0= RULE_ID )
            	    // InternalVertigoDsl.g:852:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    										newLeafNode(lv_name_3_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_2_0());
            	    									

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

            	    								newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    otherlv_5=(Token)match(input,31,FOLLOW_13); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getDataTypeKeyword_0_4());
            	    							
            	    otherlv_6=(Token)match(input,24,FOLLOW_23); 

            	    								newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getColonKeyword_0_5());
            	    							
            	    // InternalVertigoDsl.g:880:8: ( (lv_dataType_7_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:881:9: (lv_dataType_7_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:881:9: (lv_dataType_7_0= ruleDataType )
            	    // InternalVertigoDsl.g:882:10: lv_dataType_7_0= ruleDataType
            	    {

            	    										newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0());
            	    									
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


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:905:3: ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:905:3: ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) )
            	    // InternalVertigoDsl.g:906:4: {...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:906:100: ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) )
            	    // InternalVertigoDsl.g:907:5: ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:910:8: ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) )
            	    // InternalVertigoDsl.g:910:9: {...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:910:18: ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' )
            	    // InternalVertigoDsl.g:910:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}'
            	    {
            	    // InternalVertigoDsl.g:910:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==32) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalVertigoDsl.g:911:9: otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) )
            	            {
            	            otherlv_8=(Token)match(input,32,FOLLOW_13); 

            	            									newLeafNode(otherlv_8, grammarAccess.getDomainAccess().getTypeKeyword_1_0_0());
            	            								
            	            otherlv_9=(Token)match(input,24,FOLLOW_14); 

            	            									newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getColonKeyword_1_0_1());
            	            								
            	            // InternalVertigoDsl.g:919:9: ( (lv_type_10_0= RULE_STRING ) )
            	            // InternalVertigoDsl.g:920:10: (lv_type_10_0= RULE_STRING )
            	            {
            	            // InternalVertigoDsl.g:920:10: (lv_type_10_0= RULE_STRING )
            	            // InternalVertigoDsl.g:921:11: lv_type_10_0= RULE_STRING
            	            {
            	            lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            											newLeafNode(lv_type_10_0, grammarAccess.getDomainAccess().getTypeSTRINGTerminalRuleCall_1_0_2_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDomainRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"type",
            	            												lv_type_10_0,
            	            												"io.vertigo.dsl.VertigoDsl.STRING");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVertigoDsl.g:938:8: ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=33 && LA13_0<=36)||LA13_0==40) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalVertigoDsl.g:939:9: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            	            {
            	            // InternalVertigoDsl.g:939:9: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            	            // InternalVertigoDsl.g:940:10: ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            	            {
            	             
            	            									  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            									
            	            // InternalVertigoDsl.g:943:10: ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            	            // InternalVertigoDsl.g:944:11: ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            	            {
            	            // InternalVertigoDsl.g:944:11: ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=6;
            	                int LA12_0 = input.LA(1);

            	                if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 0) ) {
            	                    alt12=1;
            	                }
            	                else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 1) ) {
            	                    alt12=2;
            	                }
            	                else if ( LA12_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 2) ) {
            	                    alt12=3;
            	                }
            	                else if ( LA12_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 3) ) {
            	                    alt12=4;
            	                }
            	                else if ( LA12_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 4) ) {
            	                    alt12=5;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalVertigoDsl.g:945:9: ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:945:9: ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:946:10: {...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 0) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 0)");
            	            	    }
            	            	    // InternalVertigoDsl.g:946:110: ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) )
            	            	    // InternalVertigoDsl.g:947:11: ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 0);
            	            	    										
            	            	    // InternalVertigoDsl.g:950:14: ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) )
            	            	    // InternalVertigoDsl.g:950:15: {...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:950:24: (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            	            	    // InternalVertigoDsl.g:950:25: otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,33,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getFormatterKeyword_1_1_0_0());
            	            	    													
            	            	    otherlv_13=(Token)match(input,24,FOLLOW_8); 

            	            	    														newLeafNode(otherlv_13, grammarAccess.getDomainAccess().getColonKeyword_1_1_0_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:958:14: ( (otherlv_14= RULE_ID ) )
            	            	    // InternalVertigoDsl.g:959:15: (otherlv_14= RULE_ID )
            	            	    {
            	            	    // InternalVertigoDsl.g:959:15: (otherlv_14= RULE_ID )
            	            	    // InternalVertigoDsl.g:960:16: otherlv_14= RULE_ID
            	            	    {

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getDomainRule());
            	            	    																}
            	            	    															
            	            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_25); 

            	            	    																newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_1_1_0_2_0());
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 2 :
            	            	    // InternalVertigoDsl.g:977:9: ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:977:9: ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:978:10: {...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 1) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 1)");
            	            	    }
            	            	    // InternalVertigoDsl.g:978:110: ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:979:11: ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 1);
            	            	    										
            	            	    // InternalVertigoDsl.g:982:14: ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:982:15: {...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:982:24: (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:982:25: otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_15=(Token)match(input,34,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getStoreTypeKeyword_1_1_1_0());
            	            	    													
            	            	    otherlv_16=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_16, grammarAccess.getDomainAccess().getColonKeyword_1_1_1_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:990:14: ( (lv_storeType_17_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:991:15: (lv_storeType_17_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:991:15: (lv_storeType_17_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:992:16: lv_storeType_17_0= RULE_STRING
            	            	    {
            	            	    lv_storeType_17_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_storeType_17_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_1_1_1_2_0());
            	            	    															

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getDomainRule());
            	            	    																}
            	            	    																setWithLastConsumed(
            	            	    																	current,
            	            	    																	"storeType",
            	            	    																	lv_storeType_17_0,
            	            	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 3 :
            	            	    // InternalVertigoDsl.g:1014:9: ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1014:9: ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1015:10: {...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 2) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 2)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1015:110: ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1016:11: ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 2);
            	            	    										
            	            	    // InternalVertigoDsl.g:1019:14: ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:1019:15: {...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1019:24: (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:1019:25: otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_18=(Token)match(input,35,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getIndexTypeKeyword_1_1_2_0());
            	            	    													
            	            	    otherlv_19=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getColonKeyword_1_1_2_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1027:14: ( (lv_indexType_20_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:1028:15: (lv_indexType_20_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:1028:15: (lv_indexType_20_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:1029:16: lv_indexType_20_0= RULE_STRING
            	            	    {
            	            	    lv_indexType_20_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_indexType_20_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_1_1_2_2_0());
            	            	    															

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getDomainRule());
            	            	    																}
            	            	    																setWithLastConsumed(
            	            	    																	current,
            	            	    																	"indexType",
            	            	    																	lv_indexType_20_0,
            	            	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 4 :
            	            	    // InternalVertigoDsl.g:1051:9: ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1051:9: ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) )
            	            	    // InternalVertigoDsl.g:1052:10: {...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 3) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 3)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1052:110: ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) )
            	            	    // InternalVertigoDsl.g:1053:11: ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 3);
            	            	    										
            	            	    // InternalVertigoDsl.g:1056:14: ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) )
            	            	    // InternalVertigoDsl.g:1056:15: {...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1056:24: (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' )
            	            	    // InternalVertigoDsl.g:1056:25: otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']'
            	            	    {
            	            	    otherlv_21=(Token)match(input,36,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getConstraintKeyword_1_1_3_0());
            	            	    													
            	            	    otherlv_22=(Token)match(input,24,FOLLOW_26); 

            	            	    														newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getColonKeyword_1_1_3_1());
            	            	    													
            	            	    otherlv_23=(Token)match(input,37,FOLLOW_8); 

            	            	    														newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_1_1_3_2());
            	            	    													
            	            	    // InternalVertigoDsl.g:1068:14: ( (otherlv_24= RULE_ID ) )
            	            	    // InternalVertigoDsl.g:1069:15: (otherlv_24= RULE_ID )
            	            	    {
            	            	    // InternalVertigoDsl.g:1069:15: (otherlv_24= RULE_ID )
            	            	    // InternalVertigoDsl.g:1070:16: otherlv_24= RULE_ID
            	            	    {

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getDomainRule());
            	            	    																}
            	            	    															
            	            	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            	    																newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_1_1_3_3_0());
            	            	    															

            	            	    }


            	            	    }

            	            	    // InternalVertigoDsl.g:1081:14: ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )*
            	            	    loop11:
            	            	    do {
            	            	        int alt11=2;
            	            	        int LA11_0 = input.LA(1);

            	            	        if ( (LA11_0==38) ) {
            	            	            alt11=1;
            	            	        }


            	            	        switch (alt11) {
            	            	    	case 1 :
            	            	    	    // InternalVertigoDsl.g:1082:15: (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) )
            	            	    	    {
            	            	    	    // InternalVertigoDsl.g:1082:15: (otherlv_25= ',' )+
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
            	            	    	    	    // InternalVertigoDsl.g:1083:16: otherlv_25= ','
            	            	    	    	    {
            	            	    	    	    otherlv_25=(Token)match(input,38,FOLLOW_28); 

            	            	    	    	    																newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getCommaKeyword_1_1_3_4_0());
            	            	    	    	    															

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

            	            	    	    // InternalVertigoDsl.g:1088:15: ( (otherlv_26= RULE_ID ) )
            	            	    	    // InternalVertigoDsl.g:1089:16: (otherlv_26= RULE_ID )
            	            	    	    {
            	            	    	    // InternalVertigoDsl.g:1089:16: (otherlv_26= RULE_ID )
            	            	    	    // InternalVertigoDsl.g:1090:17: otherlv_26= RULE_ID
            	            	    	    {

            	            	    	    																	if (current==null) {
            	            	    	    																		current = createModelElement(grammarAccess.getDomainRule());
            	            	    	    																	}
            	            	    	    																
            	            	    	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            	    	    																	newLeafNode(otherlv_26, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_1_1_3_4_1_0());
            	            	    	    																

            	            	    	    }


            	            	    	    }


            	            	    	    }
            	            	    	    break;

            	            	    	default :
            	            	    	    break loop11;
            	            	        }
            	            	    } while (true);

            	            	    otherlv_27=(Token)match(input,39,FOLLOW_25); 

            	            	    														newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_1_1_3_5());
            	            	    													

            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 5 :
            	            	    // InternalVertigoDsl.g:1112:9: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1112:9: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1113:10: {...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 4) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 4)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1113:110: ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1114:11: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_1(), 4);
            	            	    										
            	            	    // InternalVertigoDsl.g:1117:14: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:1117:15: {...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1117:24: (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:1117:25: otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_28=(Token)match(input,40,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_28, grammarAccess.getDomainAccess().getUnitKeyword_1_1_4_0());
            	            	    													
            	            	    otherlv_29=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_29, grammarAccess.getDomainAccess().getColonKeyword_1_1_4_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1125:14: ( (lv_unit_30_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:1126:15: (lv_unit_30_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:1126:15: (lv_unit_30_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:1127:16: lv_unit_30_0= RULE_STRING
            	            	    {
            	            	    lv_unit_30_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_unit_30_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_1_1_4_2_0());
            	            	    															

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

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            	    										

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

            	            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_1_1()) ) {
            	                throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup_1_1())");
            	            }

            	            }


            	            }

            	             
            	            									  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_31=(Token)match(input,27,FOLLOW_24); 

            	    								newLeafNode(otherlv_31, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

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


    // $ANTLR start "entryRuleAlterDomain"
    // InternalVertigoDsl.g:1178:1: entryRuleAlterDomain returns [EObject current=null] : iv_ruleAlterDomain= ruleAlterDomain EOF ;
    public final EObject entryRuleAlterDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDomain = null;


        try {
            // InternalVertigoDsl.g:1178:52: (iv_ruleAlterDomain= ruleAlterDomain EOF )
            // InternalVertigoDsl.g:1179:2: iv_ruleAlterDomain= ruleAlterDomain EOF
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
    // InternalVertigoDsl.g:1185:1: ruleAlterDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAlterDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_type_10_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_storeType_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_indexType_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_unit_30_0=null;
        Token otherlv_31=null;
        Enumerator lv_dataType_7_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1191:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:1192:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:1192:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1193:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1193:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1194:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAlterDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:1197:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1198:5: ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1198:5: ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=3;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalVertigoDsl.g:1199:3: ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1199:3: ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1200:4: {...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1200:105: ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    // InternalVertigoDsl.g:1201:5: ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:1204:8: ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    // InternalVertigoDsl.g:1204:9: {...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1204:18: (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    // InternalVertigoDsl.g:1204:19: otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getAlterDomainAccess().getAlterKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,18,FOLLOW_8); 

            	    								newLeafNode(otherlv_2, grammarAccess.getAlterDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:1212:8: ( (otherlv_3= RULE_ID ) )
            	    // InternalVertigoDsl.g:1213:9: (otherlv_3= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1213:9: (otherlv_3= RULE_ID )
            	    // InternalVertigoDsl.g:1214:10: otherlv_3= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAlterDomainRule());
            	    										}
            	    									
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    										newLeafNode(otherlv_3, grammarAccess.getAlterDomainAccess().getDomainDomainTypeCrossReference_0_2_0());
            	    									

            	    }


            	    }

            	    otherlv_4=(Token)match(input,22,FOLLOW_22); 

            	    								newLeafNode(otherlv_4, grammarAccess.getAlterDomainAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    otherlv_5=(Token)match(input,31,FOLLOW_13); 

            	    								newLeafNode(otherlv_5, grammarAccess.getAlterDomainAccess().getDataTypeKeyword_0_4());
            	    							
            	    otherlv_6=(Token)match(input,24,FOLLOW_23); 

            	    								newLeafNode(otherlv_6, grammarAccess.getAlterDomainAccess().getColonKeyword_0_5());
            	    							
            	    // InternalVertigoDsl.g:1237:8: ( (lv_dataType_7_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:1238:9: (lv_dataType_7_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:1238:9: (lv_dataType_7_0= ruleDataType )
            	    // InternalVertigoDsl.g:1239:10: lv_dataType_7_0= ruleDataType
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_29);
            	    lv_dataType_7_0=ruleDataType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAlterDomainRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataType",
            	    											lv_dataType_7_0,
            	    											"io.vertigo.dsl.VertigoDsl.DataType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1262:3: ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1262:3: ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) )
            	    // InternalVertigoDsl.g:1263:4: {...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1263:105: ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) )
            	    // InternalVertigoDsl.g:1264:5: ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:1267:8: ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) )
            	    // InternalVertigoDsl.g:1267:9: {...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:1267:18: ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' )
            	    // InternalVertigoDsl.g:1267:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}'
            	    {
            	    // InternalVertigoDsl.g:1267:19: (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==32) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1268:9: otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) )
            	            {
            	            otherlv_8=(Token)match(input,32,FOLLOW_13); 

            	            									newLeafNode(otherlv_8, grammarAccess.getAlterDomainAccess().getTypeKeyword_1_0_0());
            	            								
            	            otherlv_9=(Token)match(input,24,FOLLOW_14); 

            	            									newLeafNode(otherlv_9, grammarAccess.getAlterDomainAccess().getColonKeyword_1_0_1());
            	            								
            	            // InternalVertigoDsl.g:1276:9: ( (lv_type_10_0= RULE_STRING ) )
            	            // InternalVertigoDsl.g:1277:10: (lv_type_10_0= RULE_STRING )
            	            {
            	            // InternalVertigoDsl.g:1277:10: (lv_type_10_0= RULE_STRING )
            	            // InternalVertigoDsl.g:1278:11: lv_type_10_0= RULE_STRING
            	            {
            	            lv_type_10_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            											newLeafNode(lv_type_10_0, grammarAccess.getAlterDomainAccess().getTypeSTRINGTerminalRuleCall_1_0_2_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getAlterDomainRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"type",
            	            												lv_type_10_0,
            	            												"io.vertigo.dsl.VertigoDsl.STRING");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalVertigoDsl.g:1295:8: ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=33 && LA19_0<=36)||LA19_0==40) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1296:9: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            	            {
            	            // InternalVertigoDsl.g:1296:9: ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            	            // InternalVertigoDsl.g:1297:10: ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            	            {
            	             
            	            									  getUnorderedGroupHelper().enter(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            									
            	            // InternalVertigoDsl.g:1300:10: ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            	            // InternalVertigoDsl.g:1301:11: ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            	            {
            	            // InternalVertigoDsl.g:1301:11: ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=6;
            	                int LA18_0 = input.LA(1);

            	                if ( LA18_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 0) ) {
            	                    alt18=1;
            	                }
            	                else if ( LA18_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 1) ) {
            	                    alt18=2;
            	                }
            	                else if ( LA18_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 2) ) {
            	                    alt18=3;
            	                }
            	                else if ( LA18_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 3) ) {
            	                    alt18=4;
            	                }
            	                else if ( LA18_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 4) ) {
            	                    alt18=5;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // InternalVertigoDsl.g:1302:9: ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1302:9: ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1303:10: {...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 0) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 0)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1303:115: ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1304:11: ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 0);
            	            	    										
            	            	    // InternalVertigoDsl.g:1307:14: ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) )
            	            	    // InternalVertigoDsl.g:1307:15: {...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1307:24: (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )
            	            	    // InternalVertigoDsl.g:1307:25: otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,33,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_12, grammarAccess.getAlterDomainAccess().getFormatterKeyword_1_1_0_0());
            	            	    													
            	            	    otherlv_13=(Token)match(input,24,FOLLOW_8); 

            	            	    														newLeafNode(otherlv_13, grammarAccess.getAlterDomainAccess().getColonKeyword_1_1_0_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1315:14: ( (otherlv_14= RULE_ID ) )
            	            	    // InternalVertigoDsl.g:1316:15: (otherlv_14= RULE_ID )
            	            	    {
            	            	    // InternalVertigoDsl.g:1316:15: (otherlv_14= RULE_ID )
            	            	    // InternalVertigoDsl.g:1317:16: otherlv_14= RULE_ID
            	            	    {

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getAlterDomainRule());
            	            	    																}
            	            	    															
            	            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_25); 

            	            	    																newLeafNode(otherlv_14, grammarAccess.getAlterDomainAccess().getFormatterFormatterCrossReference_1_1_0_2_0());
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 2 :
            	            	    // InternalVertigoDsl.g:1334:9: ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1334:9: ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1335:10: {...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 1) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 1)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1335:115: ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1336:11: ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 1);
            	            	    										
            	            	    // InternalVertigoDsl.g:1339:14: ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:1339:15: {...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1339:24: (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:1339:25: otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_15=(Token)match(input,34,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_15, grammarAccess.getAlterDomainAccess().getStoreTypeKeyword_1_1_1_0());
            	            	    													
            	            	    otherlv_16=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_16, grammarAccess.getAlterDomainAccess().getColonKeyword_1_1_1_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1347:14: ( (lv_storeType_17_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:1348:15: (lv_storeType_17_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:1348:15: (lv_storeType_17_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:1349:16: lv_storeType_17_0= RULE_STRING
            	            	    {
            	            	    lv_storeType_17_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_storeType_17_0, grammarAccess.getAlterDomainAccess().getStoreTypeSTRINGTerminalRuleCall_1_1_1_2_0());
            	            	    															

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getAlterDomainRule());
            	            	    																}
            	            	    																setWithLastConsumed(
            	            	    																	current,
            	            	    																	"storeType",
            	            	    																	lv_storeType_17_0,
            	            	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 3 :
            	            	    // InternalVertigoDsl.g:1371:9: ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1371:9: ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1372:10: {...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 2) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 2)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1372:115: ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1373:11: ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 2);
            	            	    										
            	            	    // InternalVertigoDsl.g:1376:14: ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:1376:15: {...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1376:24: (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:1376:25: otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_18=(Token)match(input,35,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_18, grammarAccess.getAlterDomainAccess().getIndexTypeKeyword_1_1_2_0());
            	            	    													
            	            	    otherlv_19=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_19, grammarAccess.getAlterDomainAccess().getColonKeyword_1_1_2_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1384:14: ( (lv_indexType_20_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:1385:15: (lv_indexType_20_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:1385:15: (lv_indexType_20_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:1386:16: lv_indexType_20_0= RULE_STRING
            	            	    {
            	            	    lv_indexType_20_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_indexType_20_0, grammarAccess.getAlterDomainAccess().getIndexTypeSTRINGTerminalRuleCall_1_1_2_2_0());
            	            	    															

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getAlterDomainRule());
            	            	    																}
            	            	    																setWithLastConsumed(
            	            	    																	current,
            	            	    																	"indexType",
            	            	    																	lv_indexType_20_0,
            	            	    																	"io.vertigo.dsl.VertigoDsl.STRING");
            	            	    															

            	            	    }


            	            	    }


            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 4 :
            	            	    // InternalVertigoDsl.g:1408:9: ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1408:9: ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) )
            	            	    // InternalVertigoDsl.g:1409:10: {...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 3) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 3)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1409:115: ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) )
            	            	    // InternalVertigoDsl.g:1410:11: ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 3);
            	            	    										
            	            	    // InternalVertigoDsl.g:1413:14: ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) )
            	            	    // InternalVertigoDsl.g:1413:15: {...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1413:24: (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' )
            	            	    // InternalVertigoDsl.g:1413:25: otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']'
            	            	    {
            	            	    otherlv_21=(Token)match(input,36,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_21, grammarAccess.getAlterDomainAccess().getConstraintKeyword_1_1_3_0());
            	            	    													
            	            	    otherlv_22=(Token)match(input,24,FOLLOW_26); 

            	            	    														newLeafNode(otherlv_22, grammarAccess.getAlterDomainAccess().getColonKeyword_1_1_3_1());
            	            	    													
            	            	    otherlv_23=(Token)match(input,37,FOLLOW_8); 

            	            	    														newLeafNode(otherlv_23, grammarAccess.getAlterDomainAccess().getLeftSquareBracketKeyword_1_1_3_2());
            	            	    													
            	            	    // InternalVertigoDsl.g:1425:14: ( (otherlv_24= RULE_ID ) )
            	            	    // InternalVertigoDsl.g:1426:15: (otherlv_24= RULE_ID )
            	            	    {
            	            	    // InternalVertigoDsl.g:1426:15: (otherlv_24= RULE_ID )
            	            	    // InternalVertigoDsl.g:1427:16: otherlv_24= RULE_ID
            	            	    {

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getAlterDomainRule());
            	            	    																}
            	            	    															
            	            	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            	    																newLeafNode(otherlv_24, grammarAccess.getAlterDomainAccess().getConstraintConstraintCrossReference_1_1_3_3_0());
            	            	    															

            	            	    }


            	            	    }

            	            	    // InternalVertigoDsl.g:1438:14: ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )*
            	            	    loop17:
            	            	    do {
            	            	        int alt17=2;
            	            	        int LA17_0 = input.LA(1);

            	            	        if ( (LA17_0==38) ) {
            	            	            alt17=1;
            	            	        }


            	            	        switch (alt17) {
            	            	    	case 1 :
            	            	    	    // InternalVertigoDsl.g:1439:15: (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) )
            	            	    	    {
            	            	    	    // InternalVertigoDsl.g:1439:15: (otherlv_25= ',' )+
            	            	    	    int cnt16=0;
            	            	    	    loop16:
            	            	    	    do {
            	            	    	        int alt16=2;
            	            	    	        int LA16_0 = input.LA(1);

            	            	    	        if ( (LA16_0==38) ) {
            	            	    	            alt16=1;
            	            	    	        }


            	            	    	        switch (alt16) {
            	            	    	    	case 1 :
            	            	    	    	    // InternalVertigoDsl.g:1440:16: otherlv_25= ','
            	            	    	    	    {
            	            	    	    	    otherlv_25=(Token)match(input,38,FOLLOW_28); 

            	            	    	    	    																newLeafNode(otherlv_25, grammarAccess.getAlterDomainAccess().getCommaKeyword_1_1_3_4_0());
            	            	    	    	    															

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

            	            	    	    // InternalVertigoDsl.g:1445:15: ( (otherlv_26= RULE_ID ) )
            	            	    	    // InternalVertigoDsl.g:1446:16: (otherlv_26= RULE_ID )
            	            	    	    {
            	            	    	    // InternalVertigoDsl.g:1446:16: (otherlv_26= RULE_ID )
            	            	    	    // InternalVertigoDsl.g:1447:17: otherlv_26= RULE_ID
            	            	    	    {

            	            	    	    																	if (current==null) {
            	            	    	    																		current = createModelElement(grammarAccess.getAlterDomainRule());
            	            	    	    																	}
            	            	    	    																
            	            	    	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            	    	    																	newLeafNode(otherlv_26, grammarAccess.getAlterDomainAccess().getConstraintsConstraintCrossReference_1_1_3_4_1_0());
            	            	    	    																

            	            	    	    }


            	            	    	    }


            	            	    	    }
            	            	    	    break;

            	            	    	default :
            	            	    	    break loop17;
            	            	        }
            	            	    } while (true);

            	            	    otherlv_27=(Token)match(input,39,FOLLOW_25); 

            	            	    														newLeafNode(otherlv_27, grammarAccess.getAlterDomainAccess().getRightSquareBracketKeyword_1_1_3_5());
            	            	    													

            	            	    }


            	            	    }

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;
            	            	case 5 :
            	            	    // InternalVertigoDsl.g:1469:9: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	            	    {
            	            	    // InternalVertigoDsl.g:1469:9: ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1470:10: {...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	            	    {
            	            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 4) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 4)");
            	            	    }
            	            	    // InternalVertigoDsl.g:1470:115: ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) )
            	            	    // InternalVertigoDsl.g:1471:11: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	            	    {

            	            	    											getUnorderedGroupHelper().select(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1(), 4);
            	            	    										
            	            	    // InternalVertigoDsl.g:1474:14: ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) )
            	            	    // InternalVertigoDsl.g:1474:15: {...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	            	    {
            	            	    if ( !((true)) ) {
            	            	        throw new FailedPredicateException(input, "ruleAlterDomain", "true");
            	            	    }
            	            	    // InternalVertigoDsl.g:1474:24: (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) )
            	            	    // InternalVertigoDsl.g:1474:25: otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) )
            	            	    {
            	            	    otherlv_28=(Token)match(input,40,FOLLOW_13); 

            	            	    														newLeafNode(otherlv_28, grammarAccess.getAlterDomainAccess().getUnitKeyword_1_1_4_0());
            	            	    													
            	            	    otherlv_29=(Token)match(input,24,FOLLOW_14); 

            	            	    														newLeafNode(otherlv_29, grammarAccess.getAlterDomainAccess().getColonKeyword_1_1_4_1());
            	            	    													
            	            	    // InternalVertigoDsl.g:1482:14: ( (lv_unit_30_0= RULE_STRING ) )
            	            	    // InternalVertigoDsl.g:1483:15: (lv_unit_30_0= RULE_STRING )
            	            	    {
            	            	    // InternalVertigoDsl.g:1483:15: (lv_unit_30_0= RULE_STRING )
            	            	    // InternalVertigoDsl.g:1484:16: lv_unit_30_0= RULE_STRING
            	            	    {
            	            	    lv_unit_30_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	            	    																newLeafNode(lv_unit_30_0, grammarAccess.getAlterDomainAccess().getUnitSTRINGTerminalRuleCall_1_1_4_2_0());
            	            	    															

            	            	    																if (current==null) {
            	            	    																	current = createModelElement(grammarAccess.getAlterDomainRule());
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

            	            	     
            	            	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            	    										

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);

            	            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1()) ) {
            	                throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1())");
            	            }

            	            }


            	            }

            	             
            	            									  getUnorderedGroupHelper().leave(grammarAccess.getAlterDomainAccess().getUnorderedGroup_1_1());
            	            									

            	            }
            	            break;

            	    }

            	    otherlv_31=(Token)match(input,27,FOLLOW_29); 

            	    								newLeafNode(otherlv_31, grammarAccess.getAlterDomainAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDomainAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleAlterDomain", "getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getAlterDomainAccess().getUnorderedGroup());
            			

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
    // InternalVertigoDsl.g:1535:1: entryRuleRefToDomainType returns [EObject current=null] : iv_ruleRefToDomainType= ruleRefToDomainType EOF ;
    public final EObject entryRuleRefToDomainType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefToDomainType = null;


        try {
            // InternalVertigoDsl.g:1535:56: (iv_ruleRefToDomainType= ruleRefToDomainType EOF )
            // InternalVertigoDsl.g:1536:2: iv_ruleRefToDomainType= ruleRefToDomainType EOF
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
    // InternalVertigoDsl.g:1542:1: ruleRefToDomainType returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRefToDomainType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1548:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:1549:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:1549:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVertigoDsl.g:1550:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVertigoDsl.g:1550:3: ()
            // InternalVertigoDsl.g:1551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefToDomainTypeAccess().getRefToDomainTypeAction_0(),
            					current);
            			

            }

            // InternalVertigoDsl.g:1557:3: ( (otherlv_1= RULE_ID ) )
            // InternalVertigoDsl.g:1558:4: (otherlv_1= RULE_ID )
            {
            // InternalVertigoDsl.g:1558:4: (otherlv_1= RULE_ID )
            // InternalVertigoDsl.g:1559:5: otherlv_1= RULE_ID
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
    // InternalVertigoDsl.g:1574:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1574:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1575:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
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
    // InternalVertigoDsl.g:1581:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:1587:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1588:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1588:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1589:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1593:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1594:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1594:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1595:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1598:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1599:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1599:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVertigoDsl.g:1600:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1600:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1601:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1601:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1602:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1605:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1605:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1605:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1605:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1613:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1614:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1614:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1615:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:1632:9: (otherlv_5= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==38) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1633:10: otherlv_5= ','
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
            	    // InternalVertigoDsl.g:1644:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1644:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1645:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1645:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1646:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1649:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1649:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1649:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1649:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1657:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1658:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1658:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1659:11: lv_label_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:1675:9: (otherlv_9= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==38) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1676:10: otherlv_9= ','
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // InternalVertigoDsl.g:1703:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1703:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1704:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
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
    // InternalVertigoDsl.g:1710:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
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
            // InternalVertigoDsl.g:1716:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1717:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1717:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1718:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1722:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1723:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1723:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1724:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1727:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1728:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1728:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=5;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt28=3;
                }
                else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt28=4;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVertigoDsl.g:1729:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1729:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1730:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1730:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1731:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1734:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1734:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1734:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1734:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1742:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1743:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1743:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1744:11: lv_refToDomainType_4_0= ruleRefToDomainType
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

            	    // InternalVertigoDsl.g:1761:9: (otherlv_5= ',' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==38) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1762:10: otherlv_5= ','
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
            	    // InternalVertigoDsl.g:1773:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1773:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1774:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1774:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1775:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1778:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1778:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1778:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1778:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1786:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1787:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1787:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1788:11: lv_label_8_0= RULE_STRING
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

            	    // InternalVertigoDsl.g:1804:9: (otherlv_9= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==38) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1805:10: otherlv_9= ','
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
            	    // InternalVertigoDsl.g:1816:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1816:4: ({...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1817:5: {...}? => ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1817:124: ( ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1818:6: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1821:9: ({...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1821:10: {...}? => (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1821:19: (otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1821:20: otherlv_10= 'cardinality' otherlv_11= ':' ( (lv_cardinality_12_0= ruleCardinalityString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getCardinalityKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_36); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1829:9: ( (lv_cardinality_12_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:1830:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:1830:10: (lv_cardinality_12_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:1831:11: lv_cardinality_12_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionDataFieldStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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

            	    // InternalVertigoDsl.g:1848:9: (otherlv_13= ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==38) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1849:10: otherlv_13= ','
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
            	    // InternalVertigoDsl.g:1860:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1860:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1861:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1861:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1862:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1865:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1865:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1865:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1865:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,43,FOLLOW_13); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,24,FOLLOW_37); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1873:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1874:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1874:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1875:11: lv_persistent_16_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:1892:9: (otherlv_17= ',' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==38) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1893:10: otherlv_17= ','
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalVertigoDsl.g:1920:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1920:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1921:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
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
    // InternalVertigoDsl.g:1927:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:1933:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:1934:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:1934:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:1935:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1939:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1940:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1940:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1941:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1944:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1945:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1945:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVertigoDsl.g:1946:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1946:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1947:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1947:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1948:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1951:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1951:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1951:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1951:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1959:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:1960:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:1960:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:1961:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getDtDefinitionComputedFieldStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            	    // InternalVertigoDsl.g:1978:9: (otherlv_5= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==38) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1979:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:1990:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1990:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1991:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1991:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1992:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1995:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1995:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1995:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1995:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:2003:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2004:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2004:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2005:11: lv_label_8_0= RULE_STRING
            	    {
            	    lv_label_8_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:2021:9: (otherlv_9= ',' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==38) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2022:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_40); 

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
            	    // InternalVertigoDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2034:5: {...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2034:128: ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2035:6: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:2038:9: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:2038:10: {...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:2038:19: (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:2038:20: otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,44,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:2046:9: ( (lv_expressionString_12_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2047:10: (lv_expressionString_12_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2047:10: (lv_expressionString_12_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2048:11: lv_expressionString_12_0= RULE_STRING
            	    {
            	    lv_expressionString_12_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            	    // InternalVertigoDsl.g:2064:9: (otherlv_13= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==38) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2065:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_40); 

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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // InternalVertigoDsl.g:2092:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:2092:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:2093:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
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
    // InternalVertigoDsl.g:2099:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2105:2: ( (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2106:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2106:2: (otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2107:3: otherlv_0= 'id' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:2111:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2112:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2112:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2113:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:2130:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:2131:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:2131:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:2132:5: lv_idString_2_0= ruleDtDefinitionIdString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdFieldAccess().getIdStringDtDefinitionIdStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:2149:3: (otherlv_3= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVertigoDsl.g:2150:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2159:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:2159:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:2160:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
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
    // InternalVertigoDsl.g:2166:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2172:2: ( (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2173:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2173:2: (otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2174:3: otherlv_0= 'field' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:2178:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2179:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2179:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2180:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:2197:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:2198:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:2198:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:2199:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionDataFieldAccess().getDataFieldStringDtDefinitionDataFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:2216:3: (otherlv_3= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVertigoDsl.g:2217:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2226:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:2226:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:2227:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
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
    // InternalVertigoDsl.g:2233:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2239:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2240:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2240:2: (otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2241:3: otherlv_0= 'computed' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:2245:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:2246:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:2246:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:2247:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:2264:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:2265:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:2265:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:2266:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionComputedFieldAccess().getComputedFieldStringDtDefinitionComputedFieldStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:2283:3: (otherlv_3= ',' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVertigoDsl.g:2284:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2293:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:2293:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:2294:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:2300:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2306:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2307:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2307:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2308:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2316:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2317:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2317:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2318:5: lv_stereoType_2_0= RULE_STRING
            {
            lv_stereoType_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:2334:3: (otherlv_3= ',' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVertigoDsl.g:2335:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2344:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:2344:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:2345:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
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
    // InternalVertigoDsl.g:2351:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2357:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2358:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2358:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2359:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2367:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2368:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2368:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2369:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:2385:3: (otherlv_3= ',' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVertigoDsl.g:2386:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2395:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:2395:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:2396:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
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
    // InternalVertigoDsl.g:2402:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2408:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2409:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2409:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2410:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2418:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2419:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2419:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2420:5: lv_displayField_2_0= RULE_STRING
            {
            lv_displayField_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:2436:3: (otherlv_3= ',' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVertigoDsl.g:2437:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:2446:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:2446:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:2447:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
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
    // InternalVertigoDsl.g:2453:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2459:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2460:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2460:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2461:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2469:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2470:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2470:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2471:5: lv_sortField_2_0= RULE_STRING
            {
            lv_sortField_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:2487:3: (otherlv_3= ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==38) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVertigoDsl.g:2488:4: otherlv_3= ','
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


    // $ANTLR start "entryRuleDtDefinitionHandleField"
    // InternalVertigoDsl.g:2497:1: entryRuleDtDefinitionHandleField returns [EObject current=null] : iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF ;
    public final EObject entryRuleDtDefinitionHandleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionHandleField = null;


        try {
            // InternalVertigoDsl.g:2497:64: (iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF )
            // InternalVertigoDsl.g:2498:2: iv_ruleDtDefinitionHandleField= ruleDtDefinitionHandleField EOF
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
    // InternalVertigoDsl.g:2504:1: ruleDtDefinitionHandleField returns [EObject current=null] : (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionHandleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_handleField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2510:2: ( (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2511:2: (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2511:2: (otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2512:3: otherlv_0= 'handleField' otherlv_1= ':' ( (lv_handleField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,50,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionHandleFieldAccess().getHandleFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionHandleFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2520:3: ( (lv_handleField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2521:4: (lv_handleField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2521:4: (lv_handleField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2522:5: lv_handleField_2_0= RULE_STRING
            {
            lv_handleField_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:2538:3: (otherlv_3= ',' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==38) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVertigoDsl.g:2539:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:2548:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2548:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:2549:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:2555:1: ruleDtDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_14=null;
        EObject lv_dtDefinitionStereotype_5_0 = null;

        EObject lv_dtDefinitionIdField_6_0 = null;

        EObject lv_dtDefinitionDataFields_7_0 = null;

        EObject lv_dtDefinitionComputedFields_8_0 = null;

        EObject lv_dtDefinitionDataSpace_10_0 = null;

        EObject lv_dtDefinitionSortField_11_0 = null;

        EObject lv_dtDefinitionHandleField_12_0 = null;

        EObject lv_dtDefinitionDisplayField_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2561:2: ( (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2562:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2562:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2563:3: otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2571:3: ()
            // InternalVertigoDsl.g:2572:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDtDefinitionAccess().getDtDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:2578:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:2579:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2579:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:2580:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:2600:3: ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVertigoDsl.g:2601:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2601:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2602:5: lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_43);
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

            // InternalVertigoDsl.g:2619:3: ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVertigoDsl.g:2620:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2620:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2621:5: lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalVertigoDsl.g:2638:3: ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==45) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalVertigoDsl.g:2639:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2639:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2640:5: lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop43;
                }
            } while (true);

            // InternalVertigoDsl.g:2657:3: ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==46) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVertigoDsl.g:2658:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2658:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2659:5: lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop44;
                }
            } while (true);

            // InternalVertigoDsl.g:2676:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2677:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2677:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2678:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2681:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2682:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2682:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop45:
            do {
                int alt45=5;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
                    alt45=3;
                }
                else if ( LA45_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 3) ) {
                    alt45=4;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVertigoDsl.g:2683:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2683:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2684:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2684:109: ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2685:6: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2688:9: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2688:10: {...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2688:19: ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2688:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2688:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2689:10: lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_46);
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
            	    // InternalVertigoDsl.g:2711:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2711:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2712:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2712:109: ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2713:6: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2716:9: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2716:10: {...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2716:19: ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2716:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2716:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2717:10: lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_46);
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
            	    // InternalVertigoDsl.g:2739:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2739:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2740:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2740:109: ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2741:6: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:2744:9: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2744:10: {...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2744:19: ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2744:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2744:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2745:10: lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_46);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:2767:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2767:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2768:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2768:109: ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2769:6: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_9(), 3);
            	    					
            	    // InternalVertigoDsl.g:2772:9: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2772:10: {...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2772:19: ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2772:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2772:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2773:10: lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_3_0());
            	    									
            	    pushFollow(FOLLOW_46);
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
            	    break loop45;
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


    // $ANTLR start "entryRuleAlterDtDefinition"
    // InternalVertigoDsl.g:2810:1: entryRuleAlterDtDefinition returns [EObject current=null] : iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF ;
    public final EObject entryRuleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2810:58: (iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF )
            // InternalVertigoDsl.g:2811:2: iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF
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
    // InternalVertigoDsl.g:2817:1: ruleAlterDtDefinition returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_13=null;
        EObject lv_dtDefinitionStereotype_4_0 = null;

        EObject lv_dtDefinitionIdField_5_0 = null;

        EObject lv_dtDefinitionDataFields_6_0 = null;

        EObject lv_dtDefinitionComputedFields_7_0 = null;

        EObject lv_dtDefinitionDataSpace_9_0 = null;

        EObject lv_dtDefinitionSortField_10_0 = null;

        EObject lv_dtDefinitionHandleField_11_0 = null;

        EObject lv_dtDefinitionDisplayField_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2823:2: ( (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalVertigoDsl.g:2824:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:2824:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalVertigoDsl.g:2825:3: otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDtDefinitionAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2833:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:2834:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:2834:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:2835:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitioneDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterDtDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2850:3: ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVertigoDsl.g:2851:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2851:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2852:5: lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_43);
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

            // InternalVertigoDsl.g:2869:3: ( (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVertigoDsl.g:2870:4: (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2870:4: (lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2871:5: lv_dtDefinitionIdField_5_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalVertigoDsl.g:2888:3: ( (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==45) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalVertigoDsl.g:2889:4: (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2889:4: (lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2890:5: lv_dtDefinitionDataFields_6_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_44);
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
            	    break loop48;
                }
            } while (true);

            // InternalVertigoDsl.g:2907:3: ( (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==46) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalVertigoDsl.g:2908:4: (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2908:4: (lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2909:5: lv_dtDefinitionComputedFields_7_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop49;
                }
            } while (true);

            // InternalVertigoDsl.g:2926:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2927:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2927:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2928:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            				
            // InternalVertigoDsl.g:2931:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2932:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2932:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop50:
            do {
                int alt50=5;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
                    alt50=3;
                }
                else if ( LA50_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 3) ) {
                    alt50=4;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalVertigoDsl.g:2933:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2933:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2934:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2934:114: ( ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2935:6: ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 0);
            	    					
            	    // InternalVertigoDsl.g:2938:9: ({...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2938:10: {...}? => ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2938:19: ( (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2938:20: (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2938:20: (lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2939:10: lv_dtDefinitionDataSpace_9_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_8_0_0());
            	    									
            	    pushFollow(FOLLOW_46);
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
            	    // InternalVertigoDsl.g:2961:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2961:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2962:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2962:114: ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2963:6: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 1);
            	    					
            	    // InternalVertigoDsl.g:2966:9: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2966:10: {...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2966:19: ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2966:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2966:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2967:10: lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_8_1_0());
            	    									
            	    pushFollow(FOLLOW_46);
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
            	    // InternalVertigoDsl.g:2989:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2989:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2990:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2990:114: ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2991:6: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 2);
            	    					
            	    // InternalVertigoDsl.g:2994:9: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2994:10: {...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2994:19: ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2994:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2994:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2995:10: lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_8_2_0());
            	    									
            	    pushFollow(FOLLOW_46);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:3017:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3017:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:3018:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 3)");
            	    }
            	    // InternalVertigoDsl.g:3018:114: ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:3019:6: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8(), 3);
            	    					
            	    // InternalVertigoDsl.g:3022:9: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:3022:10: {...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:3022:19: ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:3022:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:3022:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:3023:10: lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_8_3_0());
            	    									
            	    pushFollow(FOLLOW_46);
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_8());
            				

            }

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlterDtDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalVertigoDsl.g:3060:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:3060:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:3061:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:3067:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
            // InternalVertigoDsl.g:3073:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:3074:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:3074:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:3075:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:3083:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3084:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3084:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3085:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:3105:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3106:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3106:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3107:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:3110:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3111:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3111:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=13;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // InternalVertigoDsl.g:3112:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3112:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3113:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3113:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3114:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:3117:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:3117:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3117:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:3117:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:3125:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3126:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3126:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3127:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            	    // InternalVertigoDsl.g:3143:9: (otherlv_8= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==38) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3144:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3155:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3155:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3156:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3156:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3157:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:3160:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:3160:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3160:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:3160:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:3168:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:3169:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3169:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:3170:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3181:9: (otherlv_12= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==38) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3182:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3193:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3193:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3194:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3194:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3195:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:3198:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:3198:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3198:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:3198:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:3206:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:3207:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3207:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:3208:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_49); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3219:9: (otherlv_16= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==38) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3220:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3231:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3231:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3232:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:3232:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3233:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:3236:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:3236:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3236:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:3236:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,55,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_37); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:3244:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3245:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3245:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3246:11: lv_navigabilityA_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_49);
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

            	    // InternalVertigoDsl.g:3263:9: (otherlv_20= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==38) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3264:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3275:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3275:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3276:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:3276:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3277:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:3280:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:3280:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3280:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:3280:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,56,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,24,FOLLOW_37); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:3288:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3289:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3289:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3290:11: lv_navigabilityB_23_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_49);
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

            	    // InternalVertigoDsl.g:3307:9: (otherlv_24= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==38) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3308:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3319:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3319:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3320:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:3320:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3321:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:3324:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:3324:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3324:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:3324:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_51); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:3332:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3333:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3333:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3334:11: lv_multiplicityA_27_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_49);
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

            	    // InternalVertigoDsl.g:3351:9: (otherlv_28= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==38) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3352:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3363:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3363:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3364:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:3364:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3365:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:3368:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:3368:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3368:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:3368:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,58,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,24,FOLLOW_51); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:3376:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3377:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3377:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3378:11: lv_multiplicityB_31_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_49);
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

            	    // InternalVertigoDsl.g:3395:9: (otherlv_32= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==38) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3396:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3407:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3407:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3408:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:3408:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3409:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:3412:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:3412:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3412:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:3412:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:3420:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3421:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3421:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3422:11: lv_labelA_35_0= RULE_STRING
            	    {
            	    lv_labelA_35_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            	    // InternalVertigoDsl.g:3438:9: (otherlv_36= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==38) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3439:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3450:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3450:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3451:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:3451:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3452:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:3455:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:3455:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3455:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:3455:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,60,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:3463:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3464:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3464:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3465:11: lv_labelB_39_0= RULE_STRING
            	    {
            	    lv_labelB_39_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            	    // InternalVertigoDsl.g:3481:9: (otherlv_40= ',' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==38) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3482:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3493:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3493:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3494:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:3494:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3495:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:3498:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:3498:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3498:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:3498:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,61,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:3506:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3507:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3507:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3508:11: lv_roleA_43_0= RULE_STRING
            	    {
            	    lv_roleA_43_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            	    // InternalVertigoDsl.g:3524:9: (otherlv_44= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==38) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3525:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3536:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3536:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3537:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:3537:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3538:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:3541:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:3541:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3541:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:3541:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:3549:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3550:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3550:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3551:11: lv_roleB_47_0= RULE_STRING
            	    {
            	    lv_roleB_47_0=(Token)match(input,RULE_STRING,FOLLOW_49); 

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

            	    // InternalVertigoDsl.g:3567:9: (otherlv_48= ',' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==38) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3568:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,38,FOLLOW_50); 

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
            	    // InternalVertigoDsl.g:3579:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3579:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:3580:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:3580:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:3581:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:3584:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:3584:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3584:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:3584:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) )
            	    {
            	    otherlv_49=(Token)match(input,32,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:3592:9: ( (lv_type_51_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3593:10: (lv_type_51_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3593:10: (lv_type_51_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3594:11: lv_type_51_0= RULE_STRING
            	    {
            	    lv_type_51_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // InternalVertigoDsl.g:3632:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:3632:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:3633:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:3639:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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

        Enumerator lv_cardinality_8_0 = null;

        Enumerator lv_inout_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3645:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3646:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3646:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:3647:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:3651:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3652:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3652:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3653:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:3656:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3657:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3657:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt66=0;
            loop66:
            do {
                int alt66=4;
                int LA66_0 = input.LA(1);

                if ( LA66_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt66=1;
                }
                else if ( LA66_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt66=2;
                }
                else if ( LA66_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt66=3;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalVertigoDsl.g:3658:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3658:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3659:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3659:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3660:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:3663:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:3663:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3663:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:3663:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:3671:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:3672:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:3672:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:3673:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_53);
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

            	    // InternalVertigoDsl.g:3690:9: (otherlv_5= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==38) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3691:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_54); 

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
            	    // InternalVertigoDsl.g:3702:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3702:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3703:5: {...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3703:116: ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3704:6: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:3707:9: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:3707:10: {...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3707:19: (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:3707:20: otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getCardinalityKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_36); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:3715:9: ( (lv_cardinality_8_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:3716:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:3716:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:3717:11: lv_cardinality_8_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_53);
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

            	    // InternalVertigoDsl.g:3734:9: (otherlv_9= ',' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==38) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3735:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_54); 

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
            	    // InternalVertigoDsl.g:3746:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3746:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3747:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3747:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3748:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:3751:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:3751:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3751:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:3751:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_55); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:3759:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:3760:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:3760:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:3761:11: lv_inout_12_0= ruleInOutString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getInoutInOutStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_53);
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

            	    // InternalVertigoDsl.g:3778:9: (otherlv_13= ',' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==38) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3779:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_54); 

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
            	    if ( cnt66 >= 1 ) break loop66;
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
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
    // InternalVertigoDsl.g:3806:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:3806:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:3807:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
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
    // InternalVertigoDsl.g:3813:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3819:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3820:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3820:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3821:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:3825:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3826:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3826:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3827:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:3843:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3844:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3844:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3845:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
            {

            					newCompositeNode(grammarAccess.getTaskAttributeAccess().getTaskAttributeStringTaskAttributeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:3862:3: (otherlv_3= ',' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==38) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalVertigoDsl.g:3863:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:3872:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3872:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3873:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:3879:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3885:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3886:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3886:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3887:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3895:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3896:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3896:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3897:5: lv_storeName_2_0= RULE_STRING
            {
            lv_storeName_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:3913:3: (otherlv_3= ',' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==38) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalVertigoDsl.g:3914:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:3923:1: entryRuleTaskRequestString returns [EObject current=null] : iv_ruleTaskRequestString= ruleTaskRequestString EOF ;
    public final EObject entryRuleTaskRequestString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequestString = null;


        try {
            // InternalVertigoDsl.g:3923:58: (iv_ruleTaskRequestString= ruleTaskRequestString EOF )
            // InternalVertigoDsl.g:3924:2: iv_ruleTaskRequestString= ruleTaskRequestString EOF
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
    // InternalVertigoDsl.g:3930:1: ruleTaskRequestString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleTaskRequestString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3936:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:3937:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalVertigoDsl.g:3937:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3938:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3938:3: (lv_string_0_0= RULE_STRING )
            // InternalVertigoDsl.g:3939:4: lv_string_0_0= RULE_STRING
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
    // InternalVertigoDsl.g:3958:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3958:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3959:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:3965:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:3971:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3972:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3972:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            // InternalVertigoDsl.g:3973:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= ruleTaskRequestString ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3981:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3982:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3982:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3983:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:4011:3: ( (lv_classname_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4012:4: (lv_classname_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4012:4: (lv_classname_6_0= RULE_STRING )
            // InternalVertigoDsl.g:4013:5: lv_classname_6_0= RULE_STRING
            {
            lv_classname_6_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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

            // InternalVertigoDsl.g:4029:3: (otherlv_7= ',' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalVertigoDsl.g:4030:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,66,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRequestKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getColonKeyword_9());
            		
            // InternalVertigoDsl.g:4043:3: ( (lv_request_10_0= ruleTaskRequestString ) )
            // InternalVertigoDsl.g:4044:4: (lv_request_10_0= ruleTaskRequestString )
            {
            // InternalVertigoDsl.g:4044:4: (lv_request_10_0= ruleTaskRequestString )
            // InternalVertigoDsl.g:4045:5: lv_request_10_0= ruleTaskRequestString
            {

            					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getRequestTaskRequestStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_59);
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

            // InternalVertigoDsl.g:4062:3: (otherlv_11= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalVertigoDsl.g:4063:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_60); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalVertigoDsl.g:4068:3: ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==64) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalVertigoDsl.g:4069:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:4069:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:4070:5: lv_taskAttributes_12_0= ruleTaskAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskAttributeParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_60);
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
            	    break loop71;
                }
            } while (true);

            // InternalVertigoDsl.g:4087:3: ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==29) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalVertigoDsl.g:4088:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:4088:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:4089:5: lv_taskDataSpace_13_0= ruleTaskDataSpace
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
    // InternalVertigoDsl.g:4114:1: entryRuleFacetDefinitionDtDefinition returns [EObject current=null] : iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF ;
    public final EObject entryRuleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionDtDefinition = null;


        try {
            // InternalVertigoDsl.g:4114:68: (iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF )
            // InternalVertigoDsl.g:4115:2: iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF
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
    // InternalVertigoDsl.g:4121:1: ruleFacetDefinitionDtDefinition returns [EObject current=null] : (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4127:2: ( (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4128:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4128:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4129:3: otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionDtDefinitionAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4137:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4138:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4138:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4139:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4150:3: (otherlv_3= ',' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==38) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalVertigoDsl.g:4151:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4160:1: entryRuleFacetDefinitionFieldName returns [EObject current=null] : iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF ;
    public final EObject entryRuleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionFieldName = null;


        try {
            // InternalVertigoDsl.g:4160:65: (iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF )
            // InternalVertigoDsl.g:4161:2: iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF
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
    // InternalVertigoDsl.g:4167:1: ruleFacetDefinitionFieldName returns [EObject current=null] : (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4173:2: ( (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4174:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4174:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4175:3: otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionFieldNameAccess().getFieldNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionFieldNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4183:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4184:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4184:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4185:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:4201:3: (otherlv_3= ',' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==38) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalVertigoDsl.g:4202:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4211:1: entryRuleFacetDefinitionLabel returns [EObject current=null] : iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF ;
    public final EObject entryRuleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionLabel = null;


        try {
            // InternalVertigoDsl.g:4211:61: (iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF )
            // InternalVertigoDsl.g:4212:2: iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF
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
    // InternalVertigoDsl.g:4218:1: ruleFacetDefinitionLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4224:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4225:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4225:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4226:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionLabelAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4234:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4235:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4235:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4236:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:4252:3: (otherlv_3= ',' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==38) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalVertigoDsl.g:4253:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4262:1: entryRuleFacetDefinitionRangeString returns [EObject current=null] : iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF ;
    public final EObject entryRuleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRangeString = null;


        try {
            // InternalVertigoDsl.g:4262:67: (iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF )
            // InternalVertigoDsl.g:4263:2: iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF
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
    // InternalVertigoDsl.g:4269:1: ruleFacetDefinitionRangeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:4275:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4276:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4276:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4277:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_61); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4281:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4282:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4282:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4283:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:4286:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4287:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4287:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt78=0;
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( LA78_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt78=1;
                }
                else if ( LA78_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalVertigoDsl.g:4288:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4288:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4289:5: {...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4289:123: ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4290:6: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:4293:9: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:4293:10: {...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4293:19: (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:4293:20: otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,69,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:4301:9: ( (lv_filterString_4_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4302:10: (lv_filterString_4_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4302:10: (lv_filterString_4_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4303:11: lv_filterString_4_0= RULE_STRING
            	    {
            	    lv_filterString_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

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

            	    // InternalVertigoDsl.g:4319:9: (otherlv_5= ',' )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==38) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4320:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_63); 

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
            	    // InternalVertigoDsl.g:4331:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4331:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4332:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4332:123: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4333:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:4336:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:4336:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4336:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:4336:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:4344:9: ( (lv_labelString_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4345:10: (lv_labelString_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4345:10: (lv_labelString_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4346:11: lv_labelString_8_0= RULE_STRING
            	    {
            	    lv_labelString_8_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

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

            	    // InternalVertigoDsl.g:4362:9: (otherlv_9= ',' )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==38) ) {
            	        alt77=1;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4363:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_63); 

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
            	    if ( cnt78 >= 1 ) break loop78;
                        EarlyExitException eee =
                            new EarlyExitException(78, input);
                        throw eee;
                }
                cnt78++;
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
    // InternalVertigoDsl.g:4390:1: entryRuleFacetDefinitionRange returns [EObject current=null] : iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF ;
    public final EObject entryRuleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRange = null;


        try {
            // InternalVertigoDsl.g:4390:61: (iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF )
            // InternalVertigoDsl.g:4391:2: iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF
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
    // InternalVertigoDsl.g:4397:1: ruleFacetDefinitionRange returns [EObject current=null] : (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionRangeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4403:2: ( (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4404:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4404:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4405:3: otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeAccess().getRangeKeyword_0());
            		
            // InternalVertigoDsl.g:4409:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4410:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4410:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4411:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:4428:3: ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) )
            // InternalVertigoDsl.g:4429:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            {
            // InternalVertigoDsl.g:4429:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            // InternalVertigoDsl.g:4430:5: lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionRangeAccess().getFacetDefinitionRangeStringFacetDefinitionRangeStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:4447:3: (otherlv_3= ',' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==38) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalVertigoDsl.g:4448:4: otherlv_3= ','
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


    // $ANTLR start "entryRuleFacetDefinitionParamString"
    // InternalVertigoDsl.g:4457:1: entryRuleFacetDefinitionParamString returns [EObject current=null] : iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF ;
    public final EObject entryRuleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParamString = null;


        try {
            // InternalVertigoDsl.g:4457:67: (iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF )
            // InternalVertigoDsl.g:4458:2: iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF
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
    // InternalVertigoDsl.g:4464:1: ruleFacetDefinitionParamString returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_paramValueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4470:2: ( (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:4471:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:4471:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:4472:3: otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_64); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4476:3: (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:4477:4: otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,71,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionParamStringAccess().getValueKeyword_1_0());
            			
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            				newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionParamStringAccess().getColonKeyword_1_1());
            			
            // InternalVertigoDsl.g:4485:4: ( (lv_paramValueString_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4486:5: (lv_paramValueString_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4486:5: (lv_paramValueString_3_0= RULE_STRING )
            // InternalVertigoDsl.g:4487:6: lv_paramValueString_3_0= RULE_STRING
            {
            lv_paramValueString_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4512:1: entryRuleFacetDefinitionParam returns [EObject current=null] : iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF ;
    public final EObject entryRuleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParam = null;


        try {
            // InternalVertigoDsl.g:4512:61: (iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF )
            // InternalVertigoDsl.g:4513:2: iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF
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
    // InternalVertigoDsl.g:4519:1: ruleFacetDefinitionParam returns [EObject current=null] : (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionParamString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4525:2: ( (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4526:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4526:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4527:3: otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamAccess().getParamsKeyword_0());
            		
            // InternalVertigoDsl.g:4531:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4532:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4532:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4533:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:4550:3: ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) )
            // InternalVertigoDsl.g:4551:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            {
            // InternalVertigoDsl.g:4551:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            // InternalVertigoDsl.g:4552:5: lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString
            {

            					newCompositeNode(grammarAccess.getFacetDefinitionParamAccess().getFacetDefinitionParamStringFacetDefinitionParamStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:4569:3: (otherlv_3= ',' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==38) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalVertigoDsl.g:4570:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4579:1: entryRuleFacetDefinition returns [EObject current=null] : iv_ruleFacetDefinition= ruleFacetDefinition EOF ;
    public final EObject entryRuleFacetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinition = null;


        try {
            // InternalVertigoDsl.g:4579:56: (iv_ruleFacetDefinition= ruleFacetDefinition EOF )
            // InternalVertigoDsl.g:4580:2: iv_ruleFacetDefinition= ruleFacetDefinition EOF
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
    // InternalVertigoDsl.g:4586:1: ruleFacetDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
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
            // InternalVertigoDsl.g:4592:2: ( (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalVertigoDsl.g:4593:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalVertigoDsl.g:4593:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalVertigoDsl.g:4594:3: otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionAccess().getFacetDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4602:3: ()
            // InternalVertigoDsl.g:4603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetDefinitionAccess().getFacetDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4609:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4610:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4610:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4611:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_66); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4631:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4632:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4632:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4633:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4636:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            // InternalVertigoDsl.g:4637:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4637:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+
            int cnt83=0;
            loop83:
            do {
                int alt83=6;
                int LA83_0 = input.LA(1);

                if ( LA83_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt83=1;
                }
                else if ( LA83_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt83=2;
                }
                else if ( LA83_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt83=3;
                }
                else if ( LA83_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt83=4;
                }
                else if ( LA83_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt83=5;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalVertigoDsl.g:4638:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4638:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    // InternalVertigoDsl.g:4639:5: {...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4639:112: ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    // InternalVertigoDsl.g:4640:6: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4643:9: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    // InternalVertigoDsl.g:4643:10: {...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4643:19: ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    // InternalVertigoDsl.g:4643:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    {
            	    // InternalVertigoDsl.g:4643:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    // InternalVertigoDsl.g:4644:10: lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionDtDefinitionFacetDefinitionDtDefinitionParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_67);
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
            	    // InternalVertigoDsl.g:4666:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4666:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    // InternalVertigoDsl.g:4667:5: {...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4667:112: ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    // InternalVertigoDsl.g:4668:6: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4671:9: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    // InternalVertigoDsl.g:4671:10: {...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4671:19: ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    // InternalVertigoDsl.g:4671:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    {
            	    // InternalVertigoDsl.g:4671:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    // InternalVertigoDsl.g:4672:10: lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionFieldNameFacetDefinitionFieldNameParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_67);
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
            	    // InternalVertigoDsl.g:4694:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4694:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    // InternalVertigoDsl.g:4695:5: {...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4695:112: ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    // InternalVertigoDsl.g:4696:6: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4699:9: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    // InternalVertigoDsl.g:4699:10: {...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4699:19: ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    // InternalVertigoDsl.g:4699:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    {
            	    // InternalVertigoDsl.g:4699:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    // InternalVertigoDsl.g:4700:10: lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitonLabelFacetDefinitionLabelParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_67);
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
            	    // InternalVertigoDsl.g:4722:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4722:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    // InternalVertigoDsl.g:4723:5: {...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:4723:112: ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    // InternalVertigoDsl.g:4724:6: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:4727:9: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    int cnt81=0;
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==70) ) {
            	            int LA81_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt81=1;
            	            }


            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4727:10: {...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4727:19: ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    // InternalVertigoDsl.g:4727:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    {
            	    	    // InternalVertigoDsl.g:4727:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    // InternalVertigoDsl.g:4728:10: lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionRangeFacetDefinitionRangeParserRuleCall_5_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_67);
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
            	    	    if ( cnt81 >= 1 ) break loop81;
            	                EarlyExitException eee =
            	                    new EarlyExitException(81, input);
            	                throw eee;
            	        }
            	        cnt81++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:4750:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4750:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    // InternalVertigoDsl.g:4751:5: {...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:4751:112: ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    // InternalVertigoDsl.g:4752:6: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:4755:9: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    int cnt82=0;
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( (LA82_0==72) ) {
            	            int LA82_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt82=1;
            	            }


            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4755:10: {...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4755:19: ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    // InternalVertigoDsl.g:4755:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    {
            	    	    // InternalVertigoDsl.g:4755:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    // InternalVertigoDsl.g:4756:10: lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionParamFacetDefinitionParamParserRuleCall_5_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_67);
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
            	    	    if ( cnt82 >= 1 ) break loop82;
            	                EarlyExitException eee =
            	                    new EarlyExitException(82, input);
            	                throw eee;
            	        }
            	        cnt82++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt83 >= 1 ) break loop83;
                        EarlyExitException eee =
                            new EarlyExitException(83, input);
                        throw eee;
                }
                cnt83++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4794:1: entryRuleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF ;
    public final EObject entryRuleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4794:73: (iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4795:2: iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:4801:1: ruleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4807:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4808:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4808:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4809:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4817:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4818:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4818:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4819:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4830:3: (otherlv_3= ',' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==38) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalVertigoDsl.g:4831:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4840:1: entryRuleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF ;
    public final EObject entryRuleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionDomainCriteria = null;


        try {
            // InternalVertigoDsl.g:4840:77: (iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF )
            // InternalVertigoDsl.g:4841:2: iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF
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
    // InternalVertigoDsl.g:4847:1: ruleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refToDomainType_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4853:2: ( (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4854:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4854:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4855:3: otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getDomainCriteriaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4863:3: ( (lv_refToDomainType_2_0= ruleRefToDomainType ) )
            // InternalVertigoDsl.g:4864:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            {
            // InternalVertigoDsl.g:4864:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            // InternalVertigoDsl.g:4865:5: lv_refToDomainType_2_0= ruleRefToDomainType
            {

            					newCompositeNode(grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:4882:3: (otherlv_3= ',' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==38) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalVertigoDsl.g:4883:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4892:1: entryRuleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderQuery = null;


        try {
            // InternalVertigoDsl.g:4892:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF )
            // InternalVertigoDsl.g:4893:2: iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF
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
    // InternalVertigoDsl.g:4899:1: ruleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4905:2: ( (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4906:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4906:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4907:3: otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getListFilterBuilderClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4915:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4916:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4916:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4917:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:4933:3: (otherlv_3= ',' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==38) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalVertigoDsl.g:4934:4: otherlv_3= ','
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


    // $ANTLR start "entryRuleFacetedQueryDefinitionGeoSearchQuery"
    // InternalVertigoDsl.g:4943:1: entryRuleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionGeoSearchQuery = null;


        try {
            // InternalVertigoDsl.g:4943:77: (iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF )
            // InternalVertigoDsl.g:4944:2: iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF
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
    // InternalVertigoDsl.g:4950:1: ruleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4956:2: ( (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4957:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4957:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4958:3: otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getGeoSearchQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4966:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4967:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4967:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4968:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:4984:3: (otherlv_3= ',' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==38) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalVertigoDsl.g:4985:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4994:1: entryRuleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderClass = null;


        try {
            // InternalVertigoDsl.g:4994:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF )
            // InternalVertigoDsl.g:4995:2: iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF
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
    // InternalVertigoDsl.g:5001:1: ruleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5007:2: ( (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5008:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5008:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5009:3: otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getListFilterBuilderQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5017:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5018:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5018:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5019:5: lv_string_2_0= RULE_STRING
            {
            lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:5035:3: (otherlv_3= ',' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==38) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalVertigoDsl.g:5036:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5045:1: entryRuleFacetedQueryDefinitionFacets returns [EObject current=null] : iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF ;
    public final EObject entryRuleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionFacets = null;


        try {
            // InternalVertigoDsl.g:5045:69: (iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF )
            // InternalVertigoDsl.g:5046:2: iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF
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
    // InternalVertigoDsl.g:5052:1: ruleFacetedQueryDefinitionFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) ;
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
            // InternalVertigoDsl.g:5058:2: ( (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) )
            // InternalVertigoDsl.g:5059:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            {
            // InternalVertigoDsl.g:5059:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            // InternalVertigoDsl.g:5060:3: otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVertigoDsl.g:5072:3: ( (otherlv_3= RULE_ID ) )
            // InternalVertigoDsl.g:5073:4: (otherlv_3= RULE_ID )
            {
            // InternalVertigoDsl.g:5073:4: (otherlv_3= RULE_ID )
            // InternalVertigoDsl.g:5074:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetDefinitionFacetDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalVertigoDsl.g:5085:3: ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==38) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalVertigoDsl.g:5086:4: (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:5086:4: (otherlv_4= ',' )+
            	    int cnt89=0;
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);

            	        if ( (LA89_0==38) ) {
            	            alt89=1;
            	        }


            	        switch (alt89) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:5087:5: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_28); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_4_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt89 >= 1 ) break loop89;
            	                EarlyExitException eee =
            	                    new EarlyExitException(89, input);
            	                throw eee;
            	        }
            	        cnt89++;
            	    } while (true);

            	    // InternalVertigoDsl.g:5092:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalVertigoDsl.g:5093:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:5093:5: (otherlv_5= RULE_ID )
            	    // InternalVertigoDsl.g:5094:6: otherlv_5= RULE_ID
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
            	    break loop90;
                }
            } while (true);

            otherlv_6=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getRightSquareBracketKeyword_5());
            		
            // InternalVertigoDsl.g:5110:3: (otherlv_7= ',' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==38) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalVertigoDsl.g:5111:4: otherlv_7= ','
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
    // InternalVertigoDsl.g:5120:1: entryRuleFacetedQueryDefinition returns [EObject current=null] : iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF ;
    public final EObject entryRuleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinition = null;


        try {
            // InternalVertigoDsl.g:5120:63: (iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF )
            // InternalVertigoDsl.g:5121:2: iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF
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
    // InternalVertigoDsl.g:5127:1: ruleFacetedQueryDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalVertigoDsl.g:5133:2: ( (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalVertigoDsl.g:5134:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalVertigoDsl.g:5134:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalVertigoDsl.g:5135:3: otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,80,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5143:3: ()
            // InternalVertigoDsl.g:5144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5150:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5151:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5151:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5152:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_69); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5172:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5173:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5173:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5174:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5177:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5178:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5178:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+
            int cnt92=0;
            loop92:
            do {
                int alt92=7;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt92=3;
                }
                else if ( LA92_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt92=4;
                }
                else if ( LA92_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt92=5;
                }
                else if ( LA92_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                    alt92=6;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalVertigoDsl.g:5179:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5179:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5180:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5180:119: ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5181:6: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5184:9: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5184:10: {...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5184:19: ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5184:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5184:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5185:10: lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyConceptFacetedQueryDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    // InternalVertigoDsl.g:5207:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5207:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    // InternalVertigoDsl.g:5208:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5208:119: ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    // InternalVertigoDsl.g:5209:6: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5212:9: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    // InternalVertigoDsl.g:5212:10: {...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5212:19: ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    // InternalVertigoDsl.g:5212:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    {
            	    // InternalVertigoDsl.g:5212:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    // InternalVertigoDsl.g:5213:10: lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionDomainCriteriaFacetedQueryDefinitionDomainCriteriaParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    // InternalVertigoDsl.g:5235:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5235:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:5236:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5236:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    // InternalVertigoDsl.g:5237:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5240:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    // InternalVertigoDsl.g:5240:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5240:19: ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    // InternalVertigoDsl.g:5240:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    {
            	    // InternalVertigoDsl.g:5240:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    // InternalVertigoDsl.g:5241:10: lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderQueryFacetedQueryDefinitionListFilterBuilderQueryParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    // InternalVertigoDsl.g:5263:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5263:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:5264:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5264:119: ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    // InternalVertigoDsl.g:5265:6: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5268:9: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    // InternalVertigoDsl.g:5268:10: {...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5268:19: ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    // InternalVertigoDsl.g:5268:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    {
            	    // InternalVertigoDsl.g:5268:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    // InternalVertigoDsl.g:5269:10: lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionGeoSearchQueryFacetedQueryDefinitionGeoSearchQueryParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    // InternalVertigoDsl.g:5291:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5291:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    // InternalVertigoDsl.g:5292:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:5292:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    // InternalVertigoDsl.g:5293:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:5296:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    // InternalVertigoDsl.g:5296:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5296:19: ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    // InternalVertigoDsl.g:5296:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    {
            	    // InternalVertigoDsl.g:5296:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    // InternalVertigoDsl.g:5297:10: lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderClassFacetedQueryDefinitionListFilterBuilderClassParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    // InternalVertigoDsl.g:5319:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5319:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    // InternalVertigoDsl.g:5320:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalVertigoDsl.g:5320:119: ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    // InternalVertigoDsl.g:5321:6: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5);
            	    					
            	    // InternalVertigoDsl.g:5324:9: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    // InternalVertigoDsl.g:5324:10: {...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5324:19: ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    // InternalVertigoDsl.g:5324:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    {
            	    // InternalVertigoDsl.g:5324:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    // InternalVertigoDsl.g:5325:10: lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionFacetsFacetedQueryDefinitionFacetsParserRuleCall_5_5_0());
            	    									
            	    pushFollow(FOLLOW_70);
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
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5()) ) {
                throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				

            }

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5363:1: entryRuleIndexDefinitionKeyConcept returns [EObject current=null] : iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF ;
    public final EObject entryRuleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:5363:66: (iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:5364:2: iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:5370:1: ruleIndexDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5376:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5377:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5377:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5378:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5386:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5387:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5387:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5388:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5399:3: (otherlv_3= ',' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==38) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalVertigoDsl.g:5400:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5409:1: entryRuleIndexDefinitionDtIndex returns [EObject current=null] : iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF ;
    public final EObject entryRuleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionDtIndex = null;


        try {
            // InternalVertigoDsl.g:5409:63: (iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF )
            // InternalVertigoDsl.g:5410:2: iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF
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
    // InternalVertigoDsl.g:5416:1: ruleIndexDefinitionDtIndex returns [EObject current=null] : (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5422:2: ( (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5423:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5423:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5424:3: otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionDtIndexAccess().getDtIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionDtIndexAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5432:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5433:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5433:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5434:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionDtIndexRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionDtIndexAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5445:3: (otherlv_3= ',' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==38) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalVertigoDsl.g:5446:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5455:1: entryRuleIndexDefinitionIndexCopyToString returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyToString = null;


        try {
            // InternalVertigoDsl.g:5455:73: (iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF )
            // InternalVertigoDsl.g:5456:2: iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF
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
    // InternalVertigoDsl.g:5462:1: ruleIndexDefinitionIndexCopyToString returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5468:2: ( (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:5469:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:5469:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:5470:3: otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getColonKeyword_2());
            		
            // InternalVertigoDsl.g:5482:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5483:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5483:4: (lv_string_3_0= RULE_STRING )
            // InternalVertigoDsl.g:5484:5: lv_string_3_0= RULE_STRING
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
    // InternalVertigoDsl.g:5508:1: entryRuleIndexDefinitionIndexCopyTo returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyTo = null;


        try {
            // InternalVertigoDsl.g:5508:67: (iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF )
            // InternalVertigoDsl.g:5509:2: iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF
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
    // InternalVertigoDsl.g:5515:1: ruleIndexDefinitionIndexCopyTo returns [EObject current=null] : (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_indexDefinitionIndexCopyToString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:5521:2: ( (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5522:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5522:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5523:3: otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexCopyToKeyword_0());
            		
            // InternalVertigoDsl.g:5527:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:5528:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:5528:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:5529:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:5546:3: ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) )
            // InternalVertigoDsl.g:5547:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            {
            // InternalVertigoDsl.g:5547:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            // InternalVertigoDsl.g:5548:5: lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString
            {

            					newCompositeNode(grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexDefinitionIndexCopyToStringIndexDefinitionIndexCopyToStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:5565:3: (otherlv_3= ',' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==38) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalVertigoDsl.g:5566:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5575:1: entryRuleIndexDefinitionLoaderId returns [EObject current=null] : iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF ;
    public final EObject entryRuleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionLoaderId = null;


        try {
            // InternalVertigoDsl.g:5575:64: (iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF )
            // InternalVertigoDsl.g:5576:2: iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF
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
    // InternalVertigoDsl.g:5582:1: ruleIndexDefinitionLoaderId returns [EObject current=null] : (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_loaderIdString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5588:2: ( (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5589:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5589:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5590:3: otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionLoaderIdAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5598:3: ( (lv_loaderIdString_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5599:4: (lv_loaderIdString_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5599:4: (lv_loaderIdString_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5600:5: lv_loaderIdString_2_0= RULE_STRING
            {
            lv_loaderIdString_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:5616:3: (otherlv_3= ',' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==38) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalVertigoDsl.g:5617:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5626:1: entryRuleIndexDefinition returns [EObject current=null] : iv_ruleIndexDefinition= ruleIndexDefinition EOF ;
    public final EObject entryRuleIndexDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinition = null;


        try {
            // InternalVertigoDsl.g:5626:56: (iv_ruleIndexDefinition= ruleIndexDefinition EOF )
            // InternalVertigoDsl.g:5627:2: iv_ruleIndexDefinition= ruleIndexDefinition EOF
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
    // InternalVertigoDsl.g:5633:1: ruleIndexDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:5639:2: ( (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:5640:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:5640:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:5641:3: otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,85,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5649:3: ()
            // InternalVertigoDsl.g:5650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexDefinitionAccess().getIndexDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5656:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5657:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5657:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5658:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_73); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5678:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5679:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5679:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5680:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5683:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5684:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5684:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+
            int cnt97=0;
            loop97:
            do {
                int alt97=5;
                int LA97_0 = input.LA(1);

                if ( LA97_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt97=1;
                }
                else if ( LA97_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt97=2;
                }
                else if ( LA97_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt97=3;
                }
                else if ( LA97_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt97=4;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalVertigoDsl.g:5685:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5685:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5686:5: {...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5686:112: ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5687:6: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5690:9: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5690:10: {...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5690:19: ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5690:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5690:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5691:10: lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyConceptIndexDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_74);
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
            	    // InternalVertigoDsl.g:5713:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5713:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    // InternalVertigoDsl.g:5714:5: {...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5714:112: ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    // InternalVertigoDsl.g:5715:6: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5718:9: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    // InternalVertigoDsl.g:5718:10: {...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5718:19: ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    // InternalVertigoDsl.g:5718:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    {
            	    // InternalVertigoDsl.g:5718:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    // InternalVertigoDsl.g:5719:10: lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionDtIndexIndexDefinitionDtIndexParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_74);
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
            	    // InternalVertigoDsl.g:5741:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5741:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    // InternalVertigoDsl.g:5742:5: {...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5742:112: ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    // InternalVertigoDsl.g:5743:6: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5746:9: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    // InternalVertigoDsl.g:5746:10: {...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5746:19: ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    // InternalVertigoDsl.g:5746:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    {
            	    // InternalVertigoDsl.g:5746:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    // InternalVertigoDsl.g:5747:10: lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionLoaderIdIndexDefinitionLoaderIdParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_74);
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
            	    // InternalVertigoDsl.g:5769:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5769:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    // InternalVertigoDsl.g:5770:5: {...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5770:112: ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    // InternalVertigoDsl.g:5771:6: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5774:9: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    // InternalVertigoDsl.g:5774:10: {...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5774:19: ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    // InternalVertigoDsl.g:5774:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    {
            	    // InternalVertigoDsl.g:5774:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    // InternalVertigoDsl.g:5775:10: lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionIndexCopyToIndexDefinitionIndexCopyToParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_74);
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
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
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
    // InternalVertigoDsl.g:5813:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) ;
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
            // InternalVertigoDsl.g:5819:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) )
            // InternalVertigoDsl.g:5820:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            {
            // InternalVertigoDsl.g:5820:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            int alt98=10;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt98=1;
                }
                break;
            case 87:
                {
                alt98=2;
                }
                break;
            case 88:
                {
                alt98=3;
                }
                break;
            case 89:
                {
                alt98=4;
                }
                break;
            case 90:
                {
                alt98=5;
                }
                break;
            case 91:
                {
                alt98=6;
                }
                break;
            case 92:
                {
                alt98=7;
                }
                break;
            case 93:
                {
                alt98=8;
                }
                break;
            case 94:
                {
                alt98=9;
                }
                break;
            case 95:
                {
                alt98=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalVertigoDsl.g:5821:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:5821:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:5822:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5829:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:5829:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:5830:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5837:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:5837:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:5838:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:5845:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:5845:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:5846:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:5853:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:5853:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:5854:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:5861:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:5861:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:5862:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:5869:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:5869:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:5870:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:5877:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:5877:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:5878:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:5885:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:5885:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:5886:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVertigoDsl.g:5893:3: (enumLiteral_9= 'ValueObject' )
                    {
                    // InternalVertigoDsl.g:5893:3: (enumLiteral_9= 'ValueObject' )
                    // InternalVertigoDsl.g:5894:4: enumLiteral_9= 'ValueObject'
                    {
                    enumLiteral_9=(Token)match(input,95,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5904:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5910:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:5911:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:5911:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==96) ) {
                alt99=1;
            }
            else if ( (LA99_0==97) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalVertigoDsl.g:5912:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:5912:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:5913:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5920:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:5920:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:5921:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

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
    // InternalVertigoDsl.g:5931:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5937:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) ) )
            // InternalVertigoDsl.g:5938:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) )
            {
            // InternalVertigoDsl.g:5938:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt100=1;
                }
                break;
            case 99:
                {
                alt100=2;
                }
                break;
            case 100:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalVertigoDsl.g:5939:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:5939:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:5940:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5947:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:5947:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:5948:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5955:3: (enumLiteral_2= '\"1..1\"' )
                    {
                    // InternalVertigoDsl.g:5955:3: (enumLiteral_2= '\"1..1\"' )
                    // InternalVertigoDsl.g:5956:4: enumLiteral_2= '\"1..1\"'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2());
                    			

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
    // InternalVertigoDsl.g:5966:1: ruleCardinalityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) ;
    public final Enumerator ruleCardinalityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5972:2: ( ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) )
            // InternalVertigoDsl.g:5973:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            {
            // InternalVertigoDsl.g:5973:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt101=1;
                }
                break;
            case 102:
                {
                alt101=2;
                }
                break;
            case 103:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalVertigoDsl.g:5974:3: (enumLiteral_0= '\"1\"' )
                    {
                    // InternalVertigoDsl.g:5974:3: (enumLiteral_0= '\"1\"' )
                    // InternalVertigoDsl.g:5975:4: enumLiteral_0= '\"1\"'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5982:3: (enumLiteral_1= '\"?\"' )
                    {
                    // InternalVertigoDsl.g:5982:3: (enumLiteral_1= '\"?\"' )
                    // InternalVertigoDsl.g:5983:4: enumLiteral_1= '\"?\"'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5990:3: (enumLiteral_2= '\"*\"' )
                    {
                    // InternalVertigoDsl.g:5990:3: (enumLiteral_2= '\"*\"' )
                    // InternalVertigoDsl.g:5991:4: enumLiteral_2= '\"*\"'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

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


    // $ANTLR start "ruleInOutString"
    // InternalVertigoDsl.g:6001:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:6007:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:6008:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:6008:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==104) ) {
                alt102=1;
            }
            else if ( (LA102_0==105) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalVertigoDsl.g:6009:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:6009:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:6010:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:6017:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:6017:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:6018:4: enumLiteral_1= '\"out\"'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

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
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\1\21\1\22\6\30\1\uffff\2\22\11\uffff\1\5\1\4\2\5\1\45\1\5\4\uffff\4\33\1\4\1\33\1\46\1\4\1\33\1\46";
    static final String dfa_3s = "\1\51\1\125\6\30\1\uffff\2\23\11\uffff\1\5\1\4\2\5\1\45\1\5\4\uffff\4\50\1\4\1\50\1\47\1\46\1\50\1\47";
    static final String dfa_4s = "\10\uffff\1\3\2\uffff\1\7\1\13\1\14\1\1\1\15\1\12\1\2\1\16\1\5\6\uffff\1\4\1\11\1\6\1\10\12\uffff";
    static final String dfa_5s = "\50\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\2\uffff\1\1\6\uffff\1\10\4\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\7\1\11",
            "\1\10\1\13\1\uffff\1\16\6\uffff\1\23\1\uffff\1\21\24\uffff\1\20\15\uffff\1\14\7\uffff\1\15\6\uffff\1\22\4\uffff\1\17",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32\1\33",
            "\1\34\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\44",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\45\1\46",
            "\1\47\41\uffff\1\45",
            "\1\10\5\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7",
            "\1\45\1\46"
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
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\21\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\51\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\1\1\4\1\6\1\2\1\7\1\3\1\0\1\5\2\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\2\uffff\1\2\6\uffff\1\11\4\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\10\1\1",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 836:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\1\uffff\1\3\10\uffff\1\2\1\1";
    static final String dfa_15s = "\2\uffff\1\3\1\4\1\0\1\5\1\1\1\6\1\2\1\7\2\uffff}>";
    static final String[] dfa_16s = {
            "\1\1\2\uffff\1\1\6\uffff\1\10\4\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\7\1\11",
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
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_14;
            this.special = dfa_15;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "()+ loopback of 1198:5: ( ({...}? => ( ({...}? => (otherlv_1= 'alter' otherlv_2= 'Domain' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'type' otherlv_9= ':' ( (lv_type_10_0= RULE_STRING ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_12= 'formatter' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'storeType' otherlv_16= ':' ( (lv_storeType_17_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'indexType' otherlv_19= ':' ( (lv_indexType_20_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'constraint' otherlv_22= ':' otherlv_23= '[' ( (otherlv_24= RULE_ID ) ) ( (otherlv_25= ',' )+ ( (otherlv_26= RULE_ID ) ) )* otherlv_27= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'unit' otherlv_29= ':' ( (lv_unit_30_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )? otherlv_31= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 0) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_17s = "\16\uffff";
    static final String dfa_18s = "\1\33\15\uffff";
    static final String dfa_19s = "\1\76\15\uffff";
    static final String dfa_20s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_21s = "\1\0\15\uffff}>";
    static final String[] dfa_22s = {
            "\1\1\4\uffff\1\15\23\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()+ loopback of 3111:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==27) ) {s = 1;}

                        else if ( LA62_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA62_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA62_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA62_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA62_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA62_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA62_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA62_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA62_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA62_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA62_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA62_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001C010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000031F08120002L});
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFC00000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000011F08100002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000011E08000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000031F08000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004008014000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008014000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000014000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000C4008014000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000C0008014000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000E000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000014000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000104008014000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100008014000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007E00028008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007600028008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0007600028000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0007400028000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0007000028000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7FF0000100000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x7FF0004108000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x7FF0000108000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000001C00000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000040000004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000044008004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000040008004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000004028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000028000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000004008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000158L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000158L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000008000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000001A0400L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000008000000L,0x00000000001A0400L});

}
