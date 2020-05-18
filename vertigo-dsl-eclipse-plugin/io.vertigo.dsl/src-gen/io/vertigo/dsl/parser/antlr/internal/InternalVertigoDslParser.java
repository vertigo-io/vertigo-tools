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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ESCAPED_CHAR", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'domain'", "'id'", "'label'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'type'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'unit'", "'alter'", "'cardinality'", "'persistent'", "'expression'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'handleField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'inOut'", "'attribute'", "'request'", "'Task'", "'dtDefinition'", "'fieldName'", "'filter'", "'range'", "'value'", "'params'", "'FacetDefinition'", "'keyConcept'", "'domainCriteria'", "'listFilterBuilderClass'", "'geoSearchQuery'", "'listFilterBuilderQuery'", "'facets'", "'FacetedQueryDefinition'", "'dtIndex'", "'from'", "'indexCopyTo'", "'loaderId'", "'IndexDefinition'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'ValueObject'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"1..1\"'", "'\"1..*\"'", "'\"1\"'", "'\"?\"'", "'\"*\"'", "'\"*>1\"'", "'\"*>?\"'", "'\"*>*\"'", "'\"in\"'", "'\"out\"'"
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
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
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
    // InternalVertigoDsl.g:2555:1: ruleDtDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_14=null;
        EObject lv_dtDefinitionStereotype_5_0 = null;

        EObject lv_dtDefinitionDataSpace_6_0 = null;

        EObject lv_dtDefinitionIdField_7_0 = null;

        EObject lv_dtDefinitionDataFields_8_0 = null;

        EObject lv_dtDefinitionComputedFields_9_0 = null;

        EObject lv_dtDefinitionSortField_11_0 = null;

        EObject lv_dtDefinitionHandleField_12_0 = null;

        EObject lv_dtDefinitionDisplayField_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2561:2: ( (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2562:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2562:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2563:3: otherlv_0= 'create' otherlv_1= 'DtDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_14= '}'
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

            // InternalVertigoDsl.g:2619:3: ( (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVertigoDsl.g:2620:4: (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace )
                    {
                    // InternalVertigoDsl.g:2620:4: (lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace )
                    // InternalVertigoDsl.g:2621:5: lv_dtDefinitionDataSpace_6_0= ruleDtDefinitionDataSpace
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalVertigoDsl.g:2638:3: ( (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVertigoDsl.g:2639:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2639:4: (lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2640:5: lv_dtDefinitionIdField_7_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_45);
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

            // InternalVertigoDsl.g:2657:3: ( (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==45) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVertigoDsl.g:2658:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2658:4: (lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2659:5: lv_dtDefinitionDataFields_8_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop44;
                }
            } while (true);

            // InternalVertigoDsl.g:2676:3: ( (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==46) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVertigoDsl.g:2677:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2677:4: (lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2678:5: lv_dtDefinitionComputedFields_9_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_46);
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
            	    break loop45;
                }
            } while (true);

            // InternalVertigoDsl.g:2695:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2696:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2696:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2697:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            				
            // InternalVertigoDsl.g:2700:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2701:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2701:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop46:
            do {
                int alt46=4;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2) ) {
                    alt46=3;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalVertigoDsl.g:2702:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2702:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2703:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2703:110: ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2704:6: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 0);
            	    					
            	    // InternalVertigoDsl.g:2707:9: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2707:10: {...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2707:19: ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2707:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2707:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2708:10: lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_10_0_0());
            	    									
            	    pushFollow(FOLLOW_47);
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
            	    // InternalVertigoDsl.g:2730:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2730:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2731:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2731:110: ( ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2732:6: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 1);
            	    					
            	    // InternalVertigoDsl.g:2735:9: ({...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2735:10: {...}? => ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2735:19: ( (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2735:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2735:20: (lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2736:10: lv_dtDefinitionHandleField_12_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_10_1_0());
            	    									
            	    pushFollow(FOLLOW_47);
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
            	    // InternalVertigoDsl.g:2758:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2758:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2759:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2759:110: ( ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2760:6: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10(), 2);
            	    					
            	    // InternalVertigoDsl.g:2763:9: ({...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2763:10: {...}? => ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2763:19: ( (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2763:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2763:20: (lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2764:10: lv_dtDefinitionDisplayField_13_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_10_2_0());
            	    									
            	    pushFollow(FOLLOW_47);
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

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_10());
            				

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalVertigoDsl.g:2801:1: entryRuleAlterDtDefinition returns [EObject current=null] : iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF ;
    public final EObject entryRuleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterDtDefinition = null;


        try {
            // InternalVertigoDsl.g:2801:58: (iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF )
            // InternalVertigoDsl.g:2802:2: iv_ruleAlterDtDefinition= ruleAlterDtDefinition EOF
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
    // InternalVertigoDsl.g:2808:1: ruleAlterDtDefinition returns [EObject current=null] : (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleAlterDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_13=null;
        EObject lv_dtDefinitionStereotype_4_0 = null;

        EObject lv_dtDefinitionDataSpace_5_0 = null;

        EObject lv_dtDefinitionIdField_6_0 = null;

        EObject lv_dtDefinitionDataFields_7_0 = null;

        EObject lv_dtDefinitionComputedFields_8_0 = null;

        EObject lv_dtDefinitionSortField_10_0 = null;

        EObject lv_dtDefinitionHandleField_11_0 = null;

        EObject lv_dtDefinitionDisplayField_12_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2814:2: ( (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalVertigoDsl.g:2815:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:2815:2: (otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalVertigoDsl.g:2816:3: otherlv_0= 'alter' otherlv_1= 'DtDefinition' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterDtDefinitionAccess().getAlterKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:2824:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:2825:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:2825:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:2826:5: otherlv_2= RULE_ID
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
            		
            // InternalVertigoDsl.g:2841:3: ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVertigoDsl.g:2842:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:2842:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:2843:5: lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype
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

            // InternalVertigoDsl.g:2860:3: ( (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVertigoDsl.g:2861:4: (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace )
                    {
                    // InternalVertigoDsl.g:2861:4: (lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace )
                    // InternalVertigoDsl.g:2862:5: lv_dtDefinitionDataSpace_5_0= ruleDtDefinitionDataSpace
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_44);
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

            // InternalVertigoDsl.g:2879:3: ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVertigoDsl.g:2880:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2880:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2881:5: lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_45);
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

            // InternalVertigoDsl.g:2898:3: ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==45) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalVertigoDsl.g:2899:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2899:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2900:5: lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_45);
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
            	    break loop50;
                }
            } while (true);

            // InternalVertigoDsl.g:2917:3: ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==46) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalVertigoDsl.g:2918:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2918:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2919:5: lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_46);
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
            	    break loop51;
                }
            } while (true);

            // InternalVertigoDsl.g:2936:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2937:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2937:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2938:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            				
            // InternalVertigoDsl.g:2941:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2942:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2942:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop52:
            do {
                int alt52=4;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
                    alt52=3;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalVertigoDsl.g:2943:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2943:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2944:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2944:114: ( ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2945:6: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 0);
            	    					
            	    // InternalVertigoDsl.g:2948:9: ({...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2948:10: {...}? => ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2948:19: ( (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2948:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2948:20: (lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2949:10: lv_dtDefinitionSortField_10_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_9_0_0());
            	    									
            	    pushFollow(FOLLOW_47);
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
            	    // InternalVertigoDsl.g:2971:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2971:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) ) )
            	    // InternalVertigoDsl.g:2972:5: {...}? => ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2972:114: ( ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) ) )
            	    // InternalVertigoDsl.g:2973:6: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 1);
            	    					
            	    // InternalVertigoDsl.g:2976:9: ({...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) ) )
            	    // InternalVertigoDsl.g:2976:10: {...}? => ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2976:19: ( (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField ) )
            	    // InternalVertigoDsl.g:2976:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    {
            	    // InternalVertigoDsl.g:2976:20: (lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField )
            	    // InternalVertigoDsl.g:2977:10: lv_dtDefinitionHandleField_11_0= ruleDtDefinitionHandleField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionHandleFieldDtDefinitionHandleFieldParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_47);
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
            	    // InternalVertigoDsl.g:2999:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2999:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:3000:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3000:114: ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:3001:6: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9(), 2);
            	    					
            	    // InternalVertigoDsl.g:3004:9: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:3004:10: {...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAlterDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:3004:19: ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:3004:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:3004:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:3005:10: lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getAlterDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_9_2_0());
            	    									
            	    pushFollow(FOLLOW_47);
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

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAlterDtDefinitionAccess().getUnorderedGroup_9());
            				

            }

            otherlv_13=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlterDtDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalVertigoDsl.g:3042:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:3042:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:3043:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:3049:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
            // InternalVertigoDsl.g:3055:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:3056:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:3056:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:3057:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:3065:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3066:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3066:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3067:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:3087:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3088:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3088:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3089:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:3092:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3093:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3093:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=13;
                alt64 = dfa64.predict(input);
                switch (alt64) {
            	case 1 :
            	    // InternalVertigoDsl.g:3094:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3094:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3095:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3095:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3096:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:3099:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:3099:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3099:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:3099:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,52,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:3107:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3108:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3108:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3109:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            	    // InternalVertigoDsl.g:3125:9: (otherlv_8= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==38) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3126:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3137:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3137:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3138:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3138:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3139:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:3142:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:3142:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3142:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:3142:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,53,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:3150:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:3151:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3151:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:3152:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3163:9: (otherlv_12= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==38) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3164:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3175:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3175:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3176:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3176:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3177:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:3180:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:3180:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3180:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:3180:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,54,FOLLOW_13); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:3188:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:3189:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:3189:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:3190:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_50); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:3201:9: (otherlv_16= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==38) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3202:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3213:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3213:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3214:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:3214:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3215:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:3218:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:3218:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3218:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:3218:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,55,FOLLOW_13); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,24,FOLLOW_37); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:3226:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3227:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3227:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3228:11: lv_navigabilityA_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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

            	    // InternalVertigoDsl.g:3245:9: (otherlv_20= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==38) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3246:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3257:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3257:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3258:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:3258:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3259:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:3262:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:3262:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3262:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:3262:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,56,FOLLOW_13); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,24,FOLLOW_37); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:3270:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:3271:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:3271:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:3272:11: lv_navigabilityB_23_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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

            	    // InternalVertigoDsl.g:3289:9: (otherlv_24= ',' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==38) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3290:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3301:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3301:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3302:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:3302:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3303:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:3306:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:3306:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3306:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:3306:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,57,FOLLOW_13); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,24,FOLLOW_52); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:3314:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3315:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3315:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3316:11: lv_multiplicityA_27_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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

            	    // InternalVertigoDsl.g:3333:9: (otherlv_28= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==38) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3334:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3345:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3345:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3346:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:3346:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3347:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:3350:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:3350:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3350:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:3350:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,58,FOLLOW_13); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,24,FOLLOW_52); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:3358:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:3359:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:3359:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:3360:11: lv_multiplicityB_31_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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

            	    // InternalVertigoDsl.g:3377:9: (otherlv_32= ',' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==38) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3378:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3389:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3389:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3390:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:3390:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3391:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:3394:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:3394:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3394:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:3394:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,59,FOLLOW_13); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:3402:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3403:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3403:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3404:11: lv_labelA_35_0= RULE_STRING
            	    {
            	    lv_labelA_35_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            	    // InternalVertigoDsl.g:3420:9: (otherlv_36= ',' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==38) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3421:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3432:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3432:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3433:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:3433:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3434:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:3437:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:3437:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3437:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:3437:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,60,FOLLOW_13); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:3445:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3446:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3446:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3447:11: lv_labelB_39_0= RULE_STRING
            	    {
            	    lv_labelB_39_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            	    // InternalVertigoDsl.g:3463:9: (otherlv_40= ',' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==38) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3464:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3475:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3475:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3476:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:3476:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3477:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:3480:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:3480:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3480:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:3480:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,61,FOLLOW_13); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:3488:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3489:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3489:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3490:11: lv_roleA_43_0= RULE_STRING
            	    {
            	    lv_roleA_43_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            	    // InternalVertigoDsl.g:3506:9: (otherlv_44= ',' )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==38) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3507:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3518:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3518:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3519:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:3519:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3520:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:3523:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:3523:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3523:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:3523:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,62,FOLLOW_13); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:3531:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:3532:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:3532:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:3533:11: lv_roleB_47_0= RULE_STRING
            	    {
            	    lv_roleB_47_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            	    // InternalVertigoDsl.g:3549:9: (otherlv_48= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==38) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3550:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,38,FOLLOW_51); 

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
            	    // InternalVertigoDsl.g:3561:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3561:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:3562:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:3562:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) )
            	    // InternalVertigoDsl.g:3563:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:3566:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) )
            	    // InternalVertigoDsl.g:3566:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:3566:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) )
            	    // InternalVertigoDsl.g:3566:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) )
            	    {
            	    otherlv_49=(Token)match(input,32,FOLLOW_13); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,24,FOLLOW_53); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:3574:9: ( (lv_type_51_0= ruleAssociationTypeString ) )
            	    // InternalVertigoDsl.g:3575:10: (lv_type_51_0= ruleAssociationTypeString )
            	    {
            	    // InternalVertigoDsl.g:3575:10: (lv_type_51_0= ruleAssociationTypeString )
            	    // InternalVertigoDsl.g:3576:11: lv_type_51_0= ruleAssociationTypeString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getTypeAssociationTypeStringEnumRuleCall_4_11_2_0());
            	    										
            	    pushFollow(FOLLOW_51);
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
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // InternalVertigoDsl.g:3615:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:3615:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:3616:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:3622:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:3628:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3629:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3629:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:3630:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:3634:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:3635:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:3635:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:3636:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:3639:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:3640:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:3640:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt68=0;
            loop68:
            do {
                int alt68=4;
                int LA68_0 = input.LA(1);

                if ( LA68_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt68=1;
                }
                else if ( LA68_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt68=2;
                }
                else if ( LA68_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt68=3;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalVertigoDsl.g:3641:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3641:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3642:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:3642:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3643:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:3646:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:3646:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3646:19: (otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:3646:20: otherlv_2= 'domain' otherlv_3= ':' ( (lv_refToDomainType_4_0= ruleRefToDomainType ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:3654:9: ( (lv_refToDomainType_4_0= ruleRefToDomainType ) )
            	    // InternalVertigoDsl.g:3655:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    {
            	    // InternalVertigoDsl.g:3655:10: (lv_refToDomainType_4_0= ruleRefToDomainType )
            	    // InternalVertigoDsl.g:3656:11: lv_refToDomainType_4_0= ruleRefToDomainType
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getRefToDomainTypeRefToDomainTypeParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
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

            	    // InternalVertigoDsl.g:3673:9: (otherlv_5= ',' )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==38) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3674:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_56); 

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
            	    // InternalVertigoDsl.g:3685:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3685:4: ({...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3686:5: {...}? => ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:3686:116: ( ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3687:6: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:3690:9: ({...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:3690:10: {...}? => (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3690:19: (otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:3690:20: otherlv_6= 'cardinality' otherlv_7= ':' ( (lv_cardinality_8_0= ruleCardinalityString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getCardinalityKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_36); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:3698:9: ( (lv_cardinality_8_0= ruleCardinalityString ) )
            	    // InternalVertigoDsl.g:3699:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    {
            	    // InternalVertigoDsl.g:3699:10: (lv_cardinality_8_0= ruleCardinalityString )
            	    // InternalVertigoDsl.g:3700:11: lv_cardinality_8_0= ruleCardinalityString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getCardinalityCardinalityStringEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
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

            	    // InternalVertigoDsl.g:3717:9: (otherlv_9= ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==38) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3718:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_56); 

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
            	    // InternalVertigoDsl.g:3729:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:3729:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:3730:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:3730:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:3731:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:3734:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:3734:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:3734:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:3734:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,63,FOLLOW_13); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,24,FOLLOW_57); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:3742:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:3743:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:3743:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:3744:11: lv_inout_12_0= ruleInOutString
            	    {

            	    											newCompositeNode(grammarAccess.getTaskAttributeStringAccess().getInoutInOutStringEnumRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
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

            	    // InternalVertigoDsl.g:3761:9: (otherlv_13= ',' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==38) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalVertigoDsl.g:3762:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,38,FOLLOW_56); 

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
            	    if ( cnt68 >= 1 ) break loop68;
                        EarlyExitException eee =
                            new EarlyExitException(68, input);
                        throw eee;
                }
                cnt68++;
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
    // InternalVertigoDsl.g:3789:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:3789:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:3790:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
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
    // InternalVertigoDsl.g:3796:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3802:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3803:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3803:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3804:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:3808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:3809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3809:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:3810:5: lv_name_1_0= RULE_ID
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

            // InternalVertigoDsl.g:3826:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:3827:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:3827:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:3828:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
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

            // InternalVertigoDsl.g:3845:3: (otherlv_3= ',' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==38) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalVertigoDsl.g:3846:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:3855:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:3855:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:3856:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:3862:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3868:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3869:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3869:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3870:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3878:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3879:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3879:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3880:5: lv_storeName_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:3896:3: (otherlv_3= ',' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalVertigoDsl.g:3897:4: otherlv_3= ','
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


    // $ANTLR start "entryRuleTaskClassName"
    // InternalVertigoDsl.g:3906:1: entryRuleTaskClassName returns [EObject current=null] : iv_ruleTaskClassName= ruleTaskClassName EOF ;
    public final EObject entryRuleTaskClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskClassName = null;


        try {
            // InternalVertigoDsl.g:3906:54: (iv_ruleTaskClassName= ruleTaskClassName EOF )
            // InternalVertigoDsl.g:3907:2: iv_ruleTaskClassName= ruleTaskClassName EOF
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
    // InternalVertigoDsl.g:3913:1: ruleTaskClassName returns [EObject current=null] : (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskClassName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_className_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3919:2: ( (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3920:2: (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3920:2: (otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3921:3: otherlv_0= 'className' otherlv_1= ':' ( (lv_className_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskClassNameAccess().getClassNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskClassNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3929:3: ( (lv_className_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3930:4: (lv_className_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3930:4: (lv_className_2_0= RULE_STRING )
            // InternalVertigoDsl.g:3931:5: lv_className_2_0= RULE_STRING
            {
            lv_className_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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

            // InternalVertigoDsl.g:3947:3: (otherlv_3= ',' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==38) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalVertigoDsl.g:3948:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3957:1: entryRuleTaskRequest returns [EObject current=null] : iv_ruleTaskRequest= ruleTaskRequest EOF ;
    public final EObject entryRuleTaskRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequest = null;


        try {
            // InternalVertigoDsl.g:3957:52: (iv_ruleTaskRequest= ruleTaskRequest EOF )
            // InternalVertigoDsl.g:3958:2: iv_ruleTaskRequest= ruleTaskRequest EOF
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
    // InternalVertigoDsl.g:3964:1: ruleTaskRequest returns [EObject current=null] : (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_request_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:3970:2: ( (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:3971:2: (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:3971:2: (otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:3972:3: otherlv_0= 'request' otherlv_1= ':' ( (lv_request_2_0= ruleTaskRequestString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskRequestAccess().getRequestKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRequestAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:3980:3: ( (lv_request_2_0= ruleTaskRequestString ) )
            // InternalVertigoDsl.g:3981:4: (lv_request_2_0= ruleTaskRequestString )
            {
            // InternalVertigoDsl.g:3981:4: (lv_request_2_0= ruleTaskRequestString )
            // InternalVertigoDsl.g:3982:5: lv_request_2_0= ruleTaskRequestString
            {

            					newCompositeNode(grammarAccess.getTaskRequestAccess().getRequestTaskRequestStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            // InternalVertigoDsl.g:3999:3: (otherlv_3= ',' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==38) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalVertigoDsl.g:4000:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVertigoDsl.g:4009:1: entryRuleTaskRequestString returns [EObject current=null] : iv_ruleTaskRequestString= ruleTaskRequestString EOF ;
    public final EObject entryRuleTaskRequestString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRequestString = null;


        try {
            // InternalVertigoDsl.g:4009:58: (iv_ruleTaskRequestString= ruleTaskRequestString EOF )
            // InternalVertigoDsl.g:4010:2: iv_ruleTaskRequestString= ruleTaskRequestString EOF
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
    // InternalVertigoDsl.g:4016:1: ruleTaskRequestString returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleTaskRequestString() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4022:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:4023:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalVertigoDsl.g:4023:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4024:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4024:3: (lv_string_0_0= RULE_STRING )
            // InternalVertigoDsl.g:4025:4: lv_string_0_0= RULE_STRING
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
    // InternalVertigoDsl.g:4044:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:4044:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:4045:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:4051:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )* otherlv_8= '}' ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_taskDataSpace_4_0 = null;

        EObject lv_className_5_0 = null;

        EObject lv_request_6_0 = null;

        EObject lv_taskAttributes_7_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4057:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )* otherlv_8= '}' ) )
            // InternalVertigoDsl.g:4058:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )* otherlv_8= '}' )
            {
            // InternalVertigoDsl.g:4058:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )* otherlv_8= '}' )
            // InternalVertigoDsl.g:4059:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )? ( (lv_className_5_0= ruleTaskClassName ) ) ( (lv_request_6_0= ruleTaskRequest ) )? ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,66,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:4067:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:4068:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4068:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:4069:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_59); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:4089:3: ( (lv_taskDataSpace_4_0= ruleTaskDataSpace ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==29) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalVertigoDsl.g:4090:4: (lv_taskDataSpace_4_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:4090:4: (lv_taskDataSpace_4_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:4091:5: lv_taskDataSpace_4_0= ruleTaskDataSpace
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskDataSpaceTaskDataSpaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_59);
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

            // InternalVertigoDsl.g:4108:3: ( (lv_className_5_0= ruleTaskClassName ) )
            // InternalVertigoDsl.g:4109:4: (lv_className_5_0= ruleTaskClassName )
            {
            // InternalVertigoDsl.g:4109:4: (lv_className_5_0= ruleTaskClassName )
            // InternalVertigoDsl.g:4110:5: lv_className_5_0= ruleTaskClassName
            {

            					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getClassNameTaskClassNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_60);
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

            // InternalVertigoDsl.g:4127:3: ( (lv_request_6_0= ruleTaskRequest ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==65) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalVertigoDsl.g:4128:4: (lv_request_6_0= ruleTaskRequest )
                    {
                    // InternalVertigoDsl.g:4128:4: (lv_request_6_0= ruleTaskRequest )
                    // InternalVertigoDsl.g:4129:5: lv_request_6_0= ruleTaskRequest
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getRequestTaskRequestParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_61);
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

            // InternalVertigoDsl.g:4146:3: ( (lv_taskAttributes_7_0= ruleTaskAttribute ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==64) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalVertigoDsl.g:4147:4: (lv_taskAttributes_7_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:4147:4: (lv_taskAttributes_7_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:4148:5: lv_taskAttributes_7_0= ruleTaskAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskAttributesTaskAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_61);
            	    lv_taskAttributes_7_0=ruleTaskAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"taskAttributes",
            	    						lv_taskAttributes_7_0,
            	    						"io.vertigo.dsl.VertigoDsl.TaskAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVertigoDsl.g:4173:1: entryRuleFacetDefinitionDtDefinition returns [EObject current=null] : iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF ;
    public final EObject entryRuleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionDtDefinition = null;


        try {
            // InternalVertigoDsl.g:4173:68: (iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF )
            // InternalVertigoDsl.g:4174:2: iv_ruleFacetDefinitionDtDefinition= ruleFacetDefinitionDtDefinition EOF
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
    // InternalVertigoDsl.g:4180:1: ruleFacetDefinitionDtDefinition returns [EObject current=null] : (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4186:2: ( (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4187:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4187:2: (otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4188:3: otherlv_0= 'dtDefinition' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionDtDefinitionAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4196:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4197:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4197:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4198:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetDefinitionDtDefinitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionDtDefinitionAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4209:3: (otherlv_3= ',' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==38) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalVertigoDsl.g:4210:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4219:1: entryRuleFacetDefinitionFieldName returns [EObject current=null] : iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF ;
    public final EObject entryRuleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionFieldName = null;


        try {
            // InternalVertigoDsl.g:4219:65: (iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF )
            // InternalVertigoDsl.g:4220:2: iv_ruleFacetDefinitionFieldName= ruleFacetDefinitionFieldName EOF
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
    // InternalVertigoDsl.g:4226:1: ruleFacetDefinitionFieldName returns [EObject current=null] : (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionFieldName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4232:2: ( (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4233:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4233:2: (otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4234:3: otherlv_0= 'fieldName' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionFieldNameAccess().getFieldNameKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionFieldNameAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4242:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4243:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4243:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4244:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4260:3: (otherlv_3= ',' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==38) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalVertigoDsl.g:4261:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4270:1: entryRuleFacetDefinitionLabel returns [EObject current=null] : iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF ;
    public final EObject entryRuleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionLabel = null;


        try {
            // InternalVertigoDsl.g:4270:61: (iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF )
            // InternalVertigoDsl.g:4271:2: iv_ruleFacetDefinitionLabel= ruleFacetDefinitionLabel EOF
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
    // InternalVertigoDsl.g:4277:1: ruleFacetDefinitionLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4283:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4284:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4284:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4285:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionLabelAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4293:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4294:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4294:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4295:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4311:3: (otherlv_3= ',' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==38) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalVertigoDsl.g:4312:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4321:1: entryRuleFacetDefinitionRangeString returns [EObject current=null] : iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF ;
    public final EObject entryRuleFacetDefinitionRangeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRangeString = null;


        try {
            // InternalVertigoDsl.g:4321:67: (iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF )
            // InternalVertigoDsl.g:4322:2: iv_ruleFacetDefinitionRangeString= ruleFacetDefinitionRangeString EOF
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
    // InternalVertigoDsl.g:4328:1: ruleFacetDefinitionRangeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:4334:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:4335:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:4335:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:4336:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_62); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4340:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4341:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4341:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4342:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:4345:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:4346:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4346:6: ( ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( LA81_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt81=1;
                }
                else if ( LA81_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalVertigoDsl.g:4347:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4347:4: ({...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4348:5: {...}? => ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4348:123: ( ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4349:6: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:4352:9: ({...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:4352:10: {...}? => (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4352:19: (otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:4352:20: otherlv_2= 'filter' otherlv_3= ':' ( (lv_filterString_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,69,FOLLOW_13); 

            	    									newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionRangeStringAccess().getFilterKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_3, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:4360:9: ( (lv_filterString_4_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4361:10: (lv_filterString_4_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4361:10: (lv_filterString_4_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4362:11: lv_filterString_4_0= RULE_STRING
            	    {
            	    lv_filterString_4_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

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

            	    // InternalVertigoDsl.g:4378:9: (otherlv_5= ',' )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==38) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4379:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,38,FOLLOW_64); 

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
            	    // InternalVertigoDsl.g:4390:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4390:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:4391:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4391:123: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:4392:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionRangeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:4395:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:4395:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinitionRangeString", "true");
            	    }
            	    // InternalVertigoDsl.g:4395:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:4395:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_labelString_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getFacetDefinitionRangeStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,24,FOLLOW_14); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFacetDefinitionRangeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:4403:9: ( (lv_labelString_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:4404:10: (lv_labelString_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:4404:10: (lv_labelString_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:4405:11: lv_labelString_8_0= RULE_STRING
            	    {
            	    lv_labelString_8_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

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

            	    // InternalVertigoDsl.g:4421:9: (otherlv_9= ',' )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==38) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // InternalVertigoDsl.g:4422:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,38,FOLLOW_64); 

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
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
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
    // InternalVertigoDsl.g:4449:1: entryRuleFacetDefinitionRange returns [EObject current=null] : iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF ;
    public final EObject entryRuleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionRange = null;


        try {
            // InternalVertigoDsl.g:4449:61: (iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF )
            // InternalVertigoDsl.g:4450:2: iv_ruleFacetDefinitionRange= ruleFacetDefinitionRange EOF
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
    // InternalVertigoDsl.g:4456:1: ruleFacetDefinitionRange returns [EObject current=null] : (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionRangeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4462:2: ( (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4463:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4463:2: (otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4464:3: otherlv_0= 'range' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionRangeAccess().getRangeKeyword_0());
            		
            // InternalVertigoDsl.g:4468:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4469:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4469:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4470:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:4487:3: ( (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString ) )
            // InternalVertigoDsl.g:4488:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            {
            // InternalVertigoDsl.g:4488:4: (lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString )
            // InternalVertigoDsl.g:4489:5: lv_facetDefinitionRangeString_2_0= ruleFacetDefinitionRangeString
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

            // InternalVertigoDsl.g:4506:3: (otherlv_3= ',' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==38) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalVertigoDsl.g:4507:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4516:1: entryRuleFacetDefinitionParamString returns [EObject current=null] : iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF ;
    public final EObject entryRuleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParamString = null;


        try {
            // InternalVertigoDsl.g:4516:67: (iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF )
            // InternalVertigoDsl.g:4517:2: iv_ruleFacetDefinitionParamString= ruleFacetDefinitionParamString EOF
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
    // InternalVertigoDsl.g:4523:1: ruleFacetDefinitionParamString returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFacetDefinitionParamString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_paramValueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4529:2: ( (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:4530:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:4530:2: (otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:4531:3: otherlv_0= '{' (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:4535:3: (otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:4536:4: otherlv_1= 'value' otherlv_2= ':' ( (lv_paramValueString_3_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,71,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionParamStringAccess().getValueKeyword_1_0());
            			
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            				newLeafNode(otherlv_2, grammarAccess.getFacetDefinitionParamStringAccess().getColonKeyword_1_1());
            			
            // InternalVertigoDsl.g:4544:4: ( (lv_paramValueString_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4545:5: (lv_paramValueString_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4545:5: (lv_paramValueString_3_0= RULE_STRING )
            // InternalVertigoDsl.g:4546:6: lv_paramValueString_3_0= RULE_STRING
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
    // InternalVertigoDsl.g:4571:1: entryRuleFacetDefinitionParam returns [EObject current=null] : iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF ;
    public final EObject entryRuleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinitionParam = null;


        try {
            // InternalVertigoDsl.g:4571:61: (iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF )
            // InternalVertigoDsl.g:4572:2: iv_ruleFacetDefinitionParam= ruleFacetDefinitionParam EOF
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
    // InternalVertigoDsl.g:4578:1: ruleFacetDefinitionParam returns [EObject current=null] : (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetDefinitionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_facetDefinitionParamString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4584:2: ( (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4585:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4585:2: (otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4586:3: otherlv_0= 'params' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionParamAccess().getParamsKeyword_0());
            		
            // InternalVertigoDsl.g:4590:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:4591:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:4591:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:4592:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:4609:3: ( (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString ) )
            // InternalVertigoDsl.g:4610:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            {
            // InternalVertigoDsl.g:4610:4: (lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString )
            // InternalVertigoDsl.g:4611:5: lv_facetDefinitionParamString_2_0= ruleFacetDefinitionParamString
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

            // InternalVertigoDsl.g:4628:3: (otherlv_3= ',' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==38) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalVertigoDsl.g:4629:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4638:1: entryRuleFacetDefinition returns [EObject current=null] : iv_ruleFacetDefinition= ruleFacetDefinition EOF ;
    public final EObject entryRuleFacetDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetDefinition = null;


        try {
            // InternalVertigoDsl.g:4638:56: (iv_ruleFacetDefinition= ruleFacetDefinition EOF )
            // InternalVertigoDsl.g:4639:2: iv_ruleFacetDefinition= ruleFacetDefinition EOF
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
    // InternalVertigoDsl.g:4645:1: ruleFacetDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
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
            // InternalVertigoDsl.g:4651:2: ( (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalVertigoDsl.g:4652:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalVertigoDsl.g:4652:2: (otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalVertigoDsl.g:4653:3: otherlv_0= 'create' otherlv_1= 'FacetDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetDefinitionAccess().getFacetDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:4661:3: ()
            // InternalVertigoDsl.g:4662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetDefinitionAccess().getFacetDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:4668:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:4669:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:4669:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:4670:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_67); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:4690:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:4691:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:4691:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?) )
            // InternalVertigoDsl.g:4692:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:4695:5: ( ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?)
            // InternalVertigoDsl.g:4696:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:4696:6: ( ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) ) )+
            int cnt86=0;
            loop86:
            do {
                int alt86=6;
                int LA86_0 = input.LA(1);

                if ( LA86_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt86=1;
                }
                else if ( LA86_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt86=2;
                }
                else if ( LA86_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt86=3;
                }
                else if ( LA86_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt86=4;
                }
                else if ( LA86_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt86=5;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalVertigoDsl.g:4697:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4697:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) ) )
            	    // InternalVertigoDsl.g:4698:5: {...}? => ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:4698:112: ( ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) ) )
            	    // InternalVertigoDsl.g:4699:6: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:4702:9: ({...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) ) )
            	    // InternalVertigoDsl.g:4702:10: {...}? => ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4702:19: ( (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition ) )
            	    // InternalVertigoDsl.g:4702:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    {
            	    // InternalVertigoDsl.g:4702:20: (lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition )
            	    // InternalVertigoDsl.g:4703:10: lv_facetDefinitionDtDefinition_6_0= ruleFacetDefinitionDtDefinition
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionDtDefinitionFacetDefinitionDtDefinitionParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_68);
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
            	    // InternalVertigoDsl.g:4725:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4725:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) ) )
            	    // InternalVertigoDsl.g:4726:5: {...}? => ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:4726:112: ( ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) ) )
            	    // InternalVertigoDsl.g:4727:6: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:4730:9: ({...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) ) )
            	    // InternalVertigoDsl.g:4730:10: {...}? => ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4730:19: ( (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName ) )
            	    // InternalVertigoDsl.g:4730:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    {
            	    // InternalVertigoDsl.g:4730:20: (lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName )
            	    // InternalVertigoDsl.g:4731:10: lv_facetDefinitionFieldName_7_0= ruleFacetDefinitionFieldName
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionFieldNameFacetDefinitionFieldNameParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_68);
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
            	    // InternalVertigoDsl.g:4753:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:4753:4: ({...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) ) )
            	    // InternalVertigoDsl.g:4754:5: {...}? => ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:4754:112: ( ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) ) )
            	    // InternalVertigoDsl.g:4755:6: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:4758:9: ({...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) ) )
            	    // InternalVertigoDsl.g:4758:10: {...}? => ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:4758:19: ( (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel ) )
            	    // InternalVertigoDsl.g:4758:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    {
            	    // InternalVertigoDsl.g:4758:20: (lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel )
            	    // InternalVertigoDsl.g:4759:10: lv_facetDefinitonLabel_8_0= ruleFacetDefinitionLabel
            	    {

            	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitonLabelFacetDefinitionLabelParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_68);
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
            	    // InternalVertigoDsl.g:4781:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4781:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ ) )
            	    // InternalVertigoDsl.g:4782:5: {...}? => ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:4782:112: ( ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+ )
            	    // InternalVertigoDsl.g:4783:6: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:4786:9: ({...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) ) )+
            	    int cnt84=0;
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( (LA84_0==70) ) {
            	            int LA84_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt84=1;
            	            }


            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4786:10: {...}? => ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4786:19: ( (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange ) )
            	    	    // InternalVertigoDsl.g:4786:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    {
            	    	    // InternalVertigoDsl.g:4786:20: (lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange )
            	    	    // InternalVertigoDsl.g:4787:10: lv_facetDefinitionRange_9_0= ruleFacetDefinitionRange
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionRangeFacetDefinitionRangeParserRuleCall_5_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_68);
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
            	    	    if ( cnt84 >= 1 ) break loop84;
            	                EarlyExitException eee =
            	                    new EarlyExitException(84, input);
            	                throw eee;
            	        }
            	        cnt84++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:4809:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    {
            	    // InternalVertigoDsl.g:4809:4: ({...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ ) )
            	    // InternalVertigoDsl.g:4810:5: {...}? => ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:4810:112: ( ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+ )
            	    // InternalVertigoDsl.g:4811:6: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:4814:9: ({...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) ) )+
            	    int cnt85=0;
            	    loop85:
            	    do {
            	        int alt85=2;
            	        int LA85_0 = input.LA(1);

            	        if ( (LA85_0==72) ) {
            	            int LA85_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt85=1;
            	            }


            	        }


            	        switch (alt85) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:4814:10: {...}? => ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleFacetDefinition", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:4814:19: ( (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam ) )
            	    	    // InternalVertigoDsl.g:4814:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    {
            	    	    // InternalVertigoDsl.g:4814:20: (lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam )
            	    	    // InternalVertigoDsl.g:4815:10: lv_facetDefinitionParam_10_0= ruleFacetDefinitionParam
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getFacetDefinitionAccess().getFacetDefinitionParamFacetDefinitionParamParserRuleCall_5_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_68);
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
            	    	    if ( cnt85 >= 1 ) break loop85;
            	                EarlyExitException eee =
            	                    new EarlyExitException(85, input);
            	                throw eee;
            	        }
            	        cnt85++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFacetDefinitionAccess().getUnorderedGroup_5());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
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
    // InternalVertigoDsl.g:4853:1: entryRuleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF ;
    public final EObject entryRuleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:4853:73: (iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:4854:2: iv_ruleFacetedQueryDefinitionKeyConcept= ruleFacetedQueryDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:4860:1: ruleFacetedQueryDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4866:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4867:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4867:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4868:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4876:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:4877:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:4877:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:4878:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:4889:3: (otherlv_3= ',' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==38) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalVertigoDsl.g:4890:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4899:1: entryRuleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF ;
    public final EObject entryRuleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionDomainCriteria = null;


        try {
            // InternalVertigoDsl.g:4899:77: (iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF )
            // InternalVertigoDsl.g:4900:2: iv_ruleFacetedQueryDefinitionDomainCriteria= ruleFacetedQueryDefinitionDomainCriteria EOF
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
    // InternalVertigoDsl.g:4906:1: ruleFacetedQueryDefinitionDomainCriteria returns [EObject current=null] : (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionDomainCriteria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_refToDomainType_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:4912:2: ( (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4913:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4913:2: (otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4914:3: otherlv_0= 'domainCriteria' otherlv_1= ':' ( (lv_refToDomainType_2_0= ruleRefToDomainType ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,75,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getDomainCriteriaKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionDomainCriteriaAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4922:3: ( (lv_refToDomainType_2_0= ruleRefToDomainType ) )
            // InternalVertigoDsl.g:4923:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            {
            // InternalVertigoDsl.g:4923:4: (lv_refToDomainType_2_0= ruleRefToDomainType )
            // InternalVertigoDsl.g:4924:5: lv_refToDomainType_2_0= ruleRefToDomainType
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

            // InternalVertigoDsl.g:4941:3: (otherlv_3= ',' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==38) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalVertigoDsl.g:4942:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:4951:1: entryRuleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderQuery = null;


        try {
            // InternalVertigoDsl.g:4951:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF )
            // InternalVertigoDsl.g:4952:2: iv_ruleFacetedQueryDefinitionListFilterBuilderQuery= ruleFacetedQueryDefinitionListFilterBuilderQuery EOF
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
    // InternalVertigoDsl.g:4958:1: ruleFacetedQueryDefinitionListFilterBuilderQuery returns [EObject current=null] : (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:4964:2: ( (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:4965:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:4965:2: (otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:4966:3: otherlv_0= 'listFilterBuilderClass' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getListFilterBuilderClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:4974:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:4975:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:4975:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:4976:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:4992:3: (otherlv_3= ',' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==38) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalVertigoDsl.g:4993:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5002:1: entryRuleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF ;
    public final EObject entryRuleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionGeoSearchQuery = null;


        try {
            // InternalVertigoDsl.g:5002:77: (iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF )
            // InternalVertigoDsl.g:5003:2: iv_ruleFacetedQueryDefinitionGeoSearchQuery= ruleFacetedQueryDefinitionGeoSearchQuery EOF
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
    // InternalVertigoDsl.g:5009:1: ruleFacetedQueryDefinitionGeoSearchQuery returns [EObject current=null] : (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionGeoSearchQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5015:2: ( (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5016:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5016:2: (otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5017:3: otherlv_0= 'geoSearchQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,77,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getGeoSearchQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionGeoSearchQueryAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5025:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5026:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5026:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5027:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:5043:3: (otherlv_3= ',' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==38) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalVertigoDsl.g:5044:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5053:1: entryRuleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF ;
    public final EObject entryRuleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionListFilterBuilderClass = null;


        try {
            // InternalVertigoDsl.g:5053:85: (iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF )
            // InternalVertigoDsl.g:5054:2: iv_ruleFacetedQueryDefinitionListFilterBuilderClass= ruleFacetedQueryDefinitionListFilterBuilderClass EOF
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
    // InternalVertigoDsl.g:5060:1: ruleFacetedQueryDefinitionListFilterBuilderClass returns [EObject current=null] : (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleFacetedQueryDefinitionListFilterBuilderClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5066:2: ( (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5067:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5067:2: (otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5068:3: otherlv_0= 'listFilterBuilderQuery' otherlv_1= ':' ( (lv_string_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getListFilterBuilderQueryKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionListFilterBuilderClassAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5076:3: ( (lv_string_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5077:4: (lv_string_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5077:4: (lv_string_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5078:5: lv_string_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:5094:3: (otherlv_3= ',' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==38) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalVertigoDsl.g:5095:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5104:1: entryRuleFacetedQueryDefinitionFacets returns [EObject current=null] : iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF ;
    public final EObject entryRuleFacetedQueryDefinitionFacets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinitionFacets = null;


        try {
            // InternalVertigoDsl.g:5104:69: (iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF )
            // InternalVertigoDsl.g:5105:2: iv_ruleFacetedQueryDefinitionFacets= ruleFacetedQueryDefinitionFacets EOF
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
    // InternalVertigoDsl.g:5111:1: ruleFacetedQueryDefinitionFacets returns [EObject current=null] : (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) ;
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
            // InternalVertigoDsl.g:5117:2: ( (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? ) )
            // InternalVertigoDsl.g:5118:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            {
            // InternalVertigoDsl.g:5118:2: (otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )? )
            // InternalVertigoDsl.g:5119:3: otherlv_0= 'facets' otherlv_1= ':' otherlv_2= '[' ( (otherlv_3= RULE_ID ) ) ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ']' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,79,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetsKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalVertigoDsl.g:5131:3: ( (otherlv_3= RULE_ID ) )
            // InternalVertigoDsl.g:5132:4: (otherlv_3= RULE_ID )
            {
            // InternalVertigoDsl.g:5132:4: (otherlv_3= RULE_ID )
            // InternalVertigoDsl.g:5133:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFacetedQueryDefinitionFacetsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_3, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getFacetDefinitionFacetDefinitionCrossReference_3_0());
            				

            }


            }

            // InternalVertigoDsl.g:5144:3: ( (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==38) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalVertigoDsl.g:5145:4: (otherlv_4= ',' )+ ( (otherlv_5= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:5145:4: (otherlv_4= ',' )+
            	    int cnt92=0;
            	    loop92:
            	    do {
            	        int alt92=2;
            	        int LA92_0 = input.LA(1);

            	        if ( (LA92_0==38) ) {
            	            alt92=1;
            	        }


            	        switch (alt92) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:5146:5: otherlv_4= ','
            	    	    {
            	    	    otherlv_4=(Token)match(input,38,FOLLOW_28); 

            	    	    					newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getCommaKeyword_4_0());
            	    	    				

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

            	    // InternalVertigoDsl.g:5151:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalVertigoDsl.g:5152:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:5152:5: (otherlv_5= RULE_ID )
            	    // InternalVertigoDsl.g:5153:6: otherlv_5= RULE_ID
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
            	    break loop93;
                }
            } while (true);

            otherlv_6=(Token)match(input,39,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getFacetedQueryDefinitionFacetsAccess().getRightSquareBracketKeyword_5());
            		
            // InternalVertigoDsl.g:5169:3: (otherlv_7= ',' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==38) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalVertigoDsl.g:5170:4: otherlv_7= ','
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
    // InternalVertigoDsl.g:5179:1: entryRuleFacetedQueryDefinition returns [EObject current=null] : iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF ;
    public final EObject entryRuleFacetedQueryDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFacetedQueryDefinition = null;


        try {
            // InternalVertigoDsl.g:5179:63: (iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF )
            // InternalVertigoDsl.g:5180:2: iv_ruleFacetedQueryDefinition= ruleFacetedQueryDefinition EOF
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
    // InternalVertigoDsl.g:5186:1: ruleFacetedQueryDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) ;
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
            // InternalVertigoDsl.g:5192:2: ( (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' ) )
            // InternalVertigoDsl.g:5193:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            {
            // InternalVertigoDsl.g:5193:2: (otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}' )
            // InternalVertigoDsl.g:5194:3: otherlv_0= 'create' otherlv_1= 'FacetedQueryDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_69); 

            			newLeafNode(otherlv_0, grammarAccess.getFacetedQueryDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,80,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5202:3: ()
            // InternalVertigoDsl.g:5203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5209:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5210:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5210:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5211:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_70); 

            			newLeafNode(otherlv_4, grammarAccess.getFacetedQueryDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5231:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5232:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5232:4: ( ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5233:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5236:5: ( ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5237:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5237:6: ( ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) ) )+
            int cnt95=0;
            loop95:
            do {
                int alt95=7;
                int LA95_0 = input.LA(1);

                if ( LA95_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt95=1;
                }
                else if ( LA95_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt95=2;
                }
                else if ( LA95_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt95=3;
                }
                else if ( LA95_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt95=4;
                }
                else if ( LA95_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                    alt95=5;
                }
                else if ( LA95_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                    alt95=6;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalVertigoDsl.g:5238:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5238:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5239:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5239:119: ( ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5240:6: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5243:9: ({...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5243:10: {...}? => ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5243:19: ( (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5243:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5243:20: (lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5244:10: lv_facetedQueryDefinitionKeyConcept_6_0= ruleFacetedQueryDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionKeyConceptFacetedQueryDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    // InternalVertigoDsl.g:5266:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5266:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) ) )
            	    // InternalVertigoDsl.g:5267:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5267:119: ( ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) ) )
            	    // InternalVertigoDsl.g:5268:6: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5271:9: ({...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) ) )
            	    // InternalVertigoDsl.g:5271:10: {...}? => ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5271:19: ( (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria ) )
            	    // InternalVertigoDsl.g:5271:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    {
            	    // InternalVertigoDsl.g:5271:20: (lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria )
            	    // InternalVertigoDsl.g:5272:10: lv_facetedQueryDefinitionDomainCriteria_7_0= ruleFacetedQueryDefinitionDomainCriteria
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionDomainCriteriaFacetedQueryDefinitionDomainCriteriaParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    // InternalVertigoDsl.g:5294:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5294:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:5295:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5295:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) ) )
            	    // InternalVertigoDsl.g:5296:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5299:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) ) )
            	    // InternalVertigoDsl.g:5299:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5299:19: ( (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery ) )
            	    // InternalVertigoDsl.g:5299:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    {
            	    // InternalVertigoDsl.g:5299:20: (lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery )
            	    // InternalVertigoDsl.g:5300:10: lv_facetedQueryDefinitionListFilterBuilderQuery_8_0= ruleFacetedQueryDefinitionListFilterBuilderQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderQueryFacetedQueryDefinitionListFilterBuilderQueryParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    // InternalVertigoDsl.g:5322:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5322:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) ) )
            	    // InternalVertigoDsl.g:5323:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5323:119: ( ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) ) )
            	    // InternalVertigoDsl.g:5324:6: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5327:9: ({...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) ) )
            	    // InternalVertigoDsl.g:5327:10: {...}? => ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5327:19: ( (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery ) )
            	    // InternalVertigoDsl.g:5327:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    {
            	    // InternalVertigoDsl.g:5327:20: (lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery )
            	    // InternalVertigoDsl.g:5328:10: lv_facetedQueryDefinitionGeoSearchQuery_9_0= ruleFacetedQueryDefinitionGeoSearchQuery
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionGeoSearchQueryFacetedQueryDefinitionGeoSearchQueryParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    // InternalVertigoDsl.g:5350:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5350:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) ) )
            	    // InternalVertigoDsl.g:5351:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // InternalVertigoDsl.g:5351:119: ( ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) ) )
            	    // InternalVertigoDsl.g:5352:6: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 4);
            	    					
            	    // InternalVertigoDsl.g:5355:9: ({...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) ) )
            	    // InternalVertigoDsl.g:5355:10: {...}? => ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5355:19: ( (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass ) )
            	    // InternalVertigoDsl.g:5355:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    {
            	    // InternalVertigoDsl.g:5355:20: (lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass )
            	    // InternalVertigoDsl.g:5356:10: lv_facetedQueryDefinitionListFilterBuilderClass_10_0= ruleFacetedQueryDefinitionListFilterBuilderClass
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionListFilterBuilderClassFacetedQueryDefinitionListFilterBuilderClassParserRuleCall_5_4_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    // InternalVertigoDsl.g:5378:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5378:4: ({...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) ) )
            	    // InternalVertigoDsl.g:5379:5: {...}? => ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // InternalVertigoDsl.g:5379:119: ( ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) ) )
            	    // InternalVertigoDsl.g:5380:6: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFacetedQueryDefinitionAccess().getUnorderedGroup_5(), 5);
            	    					
            	    // InternalVertigoDsl.g:5383:9: ({...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) ) )
            	    // InternalVertigoDsl.g:5383:10: {...}? => ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFacetedQueryDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5383:19: ( (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets ) )
            	    // InternalVertigoDsl.g:5383:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    {
            	    // InternalVertigoDsl.g:5383:20: (lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets )
            	    // InternalVertigoDsl.g:5384:10: lv_facetedQueryDefinitionFacets_11_0= ruleFacetedQueryDefinitionFacets
            	    {

            	    										newCompositeNode(grammarAccess.getFacetedQueryDefinitionAccess().getFacetedQueryDefinitionFacetsFacetedQueryDefinitionFacetsParserRuleCall_5_5_0());
            	    									
            	    pushFollow(FOLLOW_71);
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
            	    if ( cnt95 >= 1 ) break loop95;
                        EarlyExitException eee =
                            new EarlyExitException(95, input);
                        throw eee;
                }
                cnt95++;
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
    // InternalVertigoDsl.g:5422:1: entryRuleIndexDefinitionKeyConcept returns [EObject current=null] : iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF ;
    public final EObject entryRuleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionKeyConcept = null;


        try {
            // InternalVertigoDsl.g:5422:66: (iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF )
            // InternalVertigoDsl.g:5423:2: iv_ruleIndexDefinitionKeyConcept= ruleIndexDefinitionKeyConcept EOF
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
    // InternalVertigoDsl.g:5429:1: ruleIndexDefinitionKeyConcept returns [EObject current=null] : (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionKeyConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5435:2: ( (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5436:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5436:2: (otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5437:3: otherlv_0= 'keyConcept' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,74,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionKeyConceptAccess().getKeyConceptKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionKeyConceptAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5445:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5446:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5446:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5447:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionKeyConceptRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionKeyConceptAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5458:3: (otherlv_3= ',' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==38) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalVertigoDsl.g:5459:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5468:1: entryRuleIndexDefinitionDtIndex returns [EObject current=null] : iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF ;
    public final EObject entryRuleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionDtIndex = null;


        try {
            // InternalVertigoDsl.g:5468:63: (iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF )
            // InternalVertigoDsl.g:5469:2: iv_ruleIndexDefinitionDtIndex= ruleIndexDefinitionDtIndex EOF
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
    // InternalVertigoDsl.g:5475:1: ruleIndexDefinitionDtIndex returns [EObject current=null] : (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionDtIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5481:2: ( (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5482:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5482:2: (otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5483:3: otherlv_0= 'dtIndex' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,81,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionDtIndexAccess().getDtIndexKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionDtIndexAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5491:3: ( (otherlv_2= RULE_ID ) )
            // InternalVertigoDsl.g:5492:4: (otherlv_2= RULE_ID )
            {
            // InternalVertigoDsl.g:5492:4: (otherlv_2= RULE_ID )
            // InternalVertigoDsl.g:5493:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexDefinitionDtIndexRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

            					newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionDtIndexAccess().getDtDefinitionDtDefinitionTypeCrossReference_2_0());
            				

            }


            }

            // InternalVertigoDsl.g:5504:3: (otherlv_3= ',' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==38) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalVertigoDsl.g:5505:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5514:1: entryRuleIndexDefinitionIndexCopyToString returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyToString = null;


        try {
            // InternalVertigoDsl.g:5514:73: (iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF )
            // InternalVertigoDsl.g:5515:2: iv_ruleIndexDefinitionIndexCopyToString= ruleIndexDefinitionIndexCopyToString EOF
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
    // InternalVertigoDsl.g:5521:1: ruleIndexDefinitionIndexCopyToString returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIndexDefinitionIndexCopyToString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5527:2: ( (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalVertigoDsl.g:5528:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalVertigoDsl.g:5528:2: (otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalVertigoDsl.g:5529:3: otherlv_0= '{' otherlv_1= 'from' otherlv_2= ':' ( (lv_string_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_72); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getFromKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexDefinitionIndexCopyToStringAccess().getColonKeyword_2());
            		
            // InternalVertigoDsl.g:5541:3: ( (lv_string_3_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5542:4: (lv_string_3_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5542:4: (lv_string_3_0= RULE_STRING )
            // InternalVertigoDsl.g:5543:5: lv_string_3_0= RULE_STRING
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
    // InternalVertigoDsl.g:5567:1: entryRuleIndexDefinitionIndexCopyTo returns [EObject current=null] : iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF ;
    public final EObject entryRuleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionIndexCopyTo = null;


        try {
            // InternalVertigoDsl.g:5567:67: (iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF )
            // InternalVertigoDsl.g:5568:2: iv_ruleIndexDefinitionIndexCopyTo= ruleIndexDefinitionIndexCopyTo EOF
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
    // InternalVertigoDsl.g:5574:1: ruleIndexDefinitionIndexCopyTo returns [EObject current=null] : (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionIndexCopyTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_name_1_0 = null;

        EObject lv_indexDefinitionIndexCopyToString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:5580:2: ( (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5581:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5581:2: (otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5582:3: otherlv_0= 'indexCopyTo' ( (lv_name_1_0= ruleKEYWORDID ) ) ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,83,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionIndexCopyToAccess().getIndexCopyToKeyword_0());
            		
            // InternalVertigoDsl.g:5586:3: ( (lv_name_1_0= ruleKEYWORDID ) )
            // InternalVertigoDsl.g:5587:4: (lv_name_1_0= ruleKEYWORDID )
            {
            // InternalVertigoDsl.g:5587:4: (lv_name_1_0= ruleKEYWORDID )
            // InternalVertigoDsl.g:5588:5: lv_name_1_0= ruleKEYWORDID
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

            // InternalVertigoDsl.g:5605:3: ( (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString ) )
            // InternalVertigoDsl.g:5606:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            {
            // InternalVertigoDsl.g:5606:4: (lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString )
            // InternalVertigoDsl.g:5607:5: lv_indexDefinitionIndexCopyToString_2_0= ruleIndexDefinitionIndexCopyToString
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

            // InternalVertigoDsl.g:5624:3: (otherlv_3= ',' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==38) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalVertigoDsl.g:5625:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5634:1: entryRuleIndexDefinitionLoaderId returns [EObject current=null] : iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF ;
    public final EObject entryRuleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinitionLoaderId = null;


        try {
            // InternalVertigoDsl.g:5634:64: (iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF )
            // InternalVertigoDsl.g:5635:2: iv_ruleIndexDefinitionLoaderId= ruleIndexDefinitionLoaderId EOF
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
    // InternalVertigoDsl.g:5641:1: ruleIndexDefinitionLoaderId returns [EObject current=null] : (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleIndexDefinitionLoaderId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_loaderIdString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5647:2: ( (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:5648:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:5648:2: (otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:5649:3: otherlv_0= 'loaderId' otherlv_1= ':' ( (lv_loaderIdString_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionLoaderIdAccess().getLoaderIdKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionLoaderIdAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:5657:3: ( (lv_loaderIdString_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:5658:4: (lv_loaderIdString_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:5658:4: (lv_loaderIdString_2_0= RULE_STRING )
            // InternalVertigoDsl.g:5659:5: lv_loaderIdString_2_0= RULE_STRING
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

            // InternalVertigoDsl.g:5675:3: (otherlv_3= ',' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==38) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalVertigoDsl.g:5676:4: otherlv_3= ','
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
    // InternalVertigoDsl.g:5685:1: entryRuleIndexDefinition returns [EObject current=null] : iv_ruleIndexDefinition= ruleIndexDefinition EOF ;
    public final EObject entryRuleIndexDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexDefinition = null;


        try {
            // InternalVertigoDsl.g:5685:56: (iv_ruleIndexDefinition= ruleIndexDefinition EOF )
            // InternalVertigoDsl.g:5686:2: iv_ruleIndexDefinition= ruleIndexDefinition EOF
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
    // InternalVertigoDsl.g:5692:1: ruleIndexDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:5698:2: ( (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:5699:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:5699:2: (otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:5700:3: otherlv_0= 'create' otherlv_1= 'IndexDefinition' () ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,85,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:5708:3: ()
            // InternalVertigoDsl.g:5709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIndexDefinitionAccess().getIndexDefinitionActionAction_2(),
            					current);
            			

            }

            // InternalVertigoDsl.g:5715:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:5716:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:5716:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:5717:5: lv_name_3_0= RULE_ID
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

            otherlv_4=(Token)match(input,22,FOLLOW_74); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexDefinitionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVertigoDsl.g:5737:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:5738:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:5738:4: ( ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:5739:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5());
            				
            // InternalVertigoDsl.g:5742:5: ( ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:5743:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:5743:6: ( ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=5;
                int LA100_0 = input.LA(1);

                if ( LA100_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                    alt100=1;
                }
                else if ( LA100_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                    alt100=2;
                }
                else if ( LA100_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                    alt100=3;
                }
                else if ( LA100_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                    alt100=4;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalVertigoDsl.g:5744:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5744:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) ) )
            	    // InternalVertigoDsl.g:5745:5: {...}? => ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalVertigoDsl.g:5745:112: ( ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) ) )
            	    // InternalVertigoDsl.g:5746:6: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 0);
            	    					
            	    // InternalVertigoDsl.g:5749:9: ({...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) ) )
            	    // InternalVertigoDsl.g:5749:10: {...}? => ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5749:19: ( (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept ) )
            	    // InternalVertigoDsl.g:5749:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    {
            	    // InternalVertigoDsl.g:5749:20: (lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept )
            	    // InternalVertigoDsl.g:5750:10: lv_indexDefinitionKeyConcept_6_0= ruleIndexDefinitionKeyConcept
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionKeyConceptIndexDefinitionKeyConceptParserRuleCall_5_0_0());
            	    									
            	    pushFollow(FOLLOW_75);
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
            	    // InternalVertigoDsl.g:5772:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5772:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) ) )
            	    // InternalVertigoDsl.g:5773:5: {...}? => ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalVertigoDsl.g:5773:112: ( ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) ) )
            	    // InternalVertigoDsl.g:5774:6: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 1);
            	    					
            	    // InternalVertigoDsl.g:5777:9: ({...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) ) )
            	    // InternalVertigoDsl.g:5777:10: {...}? => ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5777:19: ( (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex ) )
            	    // InternalVertigoDsl.g:5777:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    {
            	    // InternalVertigoDsl.g:5777:20: (lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex )
            	    // InternalVertigoDsl.g:5778:10: lv_indexDefinitionDtIndex_7_0= ruleIndexDefinitionDtIndex
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionDtIndexIndexDefinitionDtIndexParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_75);
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
            	    // InternalVertigoDsl.g:5800:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5800:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) ) )
            	    // InternalVertigoDsl.g:5801:5: {...}? => ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // InternalVertigoDsl.g:5801:112: ( ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) ) )
            	    // InternalVertigoDsl.g:5802:6: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 2);
            	    					
            	    // InternalVertigoDsl.g:5805:9: ({...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) ) )
            	    // InternalVertigoDsl.g:5805:10: {...}? => ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5805:19: ( (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId ) )
            	    // InternalVertigoDsl.g:5805:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    {
            	    // InternalVertigoDsl.g:5805:20: (lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId )
            	    // InternalVertigoDsl.g:5806:10: lv_indexDefinitionLoaderId_8_0= ruleIndexDefinitionLoaderId
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionLoaderIdIndexDefinitionLoaderIdParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_75);
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
            	    // InternalVertigoDsl.g:5828:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:5828:4: ({...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) ) )
            	    // InternalVertigoDsl.g:5829:5: {...}? => ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // InternalVertigoDsl.g:5829:112: ( ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) ) )
            	    // InternalVertigoDsl.g:5830:6: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIndexDefinitionAccess().getUnorderedGroup_5(), 3);
            	    					
            	    // InternalVertigoDsl.g:5833:9: ({...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) ) )
            	    // InternalVertigoDsl.g:5833:10: {...}? => ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndexDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:5833:19: ( (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo ) )
            	    // InternalVertigoDsl.g:5833:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    {
            	    // InternalVertigoDsl.g:5833:20: (lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo )
            	    // InternalVertigoDsl.g:5834:10: lv_indexDefinitionIndexCopyTo_9_0= ruleIndexDefinitionIndexCopyTo
            	    {

            	    										newCompositeNode(grammarAccess.getIndexDefinitionAccess().getIndexDefinitionIndexCopyToIndexDefinitionIndexCopyToParserRuleCall_5_3_0());
            	    									
            	    pushFollow(FOLLOW_75);
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
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
    // InternalVertigoDsl.g:5872:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) ;
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
            // InternalVertigoDsl.g:5878:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) ) )
            // InternalVertigoDsl.g:5879:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            {
            // InternalVertigoDsl.g:5879:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) | (enumLiteral_9= 'ValueObject' ) )
            int alt101=10;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt101=1;
                }
                break;
            case 87:
                {
                alt101=2;
                }
                break;
            case 88:
                {
                alt101=3;
                }
                break;
            case 89:
                {
                alt101=4;
                }
                break;
            case 90:
                {
                alt101=5;
                }
                break;
            case 91:
                {
                alt101=6;
                }
                break;
            case 92:
                {
                alt101=7;
                }
                break;
            case 93:
                {
                alt101=8;
                }
                break;
            case 94:
                {
                alt101=9;
                }
                break;
            case 95:
                {
                alt101=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalVertigoDsl.g:5880:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:5880:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:5881:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5888:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:5888:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:5889:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:5896:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:5896:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:5897:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:5904:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:5904:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:5905:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:5912:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:5912:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:5913:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:5920:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:5920:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:5921:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:5928:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:5928:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:5929:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:5936:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:5936:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:5937:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:5944:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:5944:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:5945:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDATA_STREAMEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalVertigoDsl.g:5952:3: (enumLiteral_9= 'ValueObject' )
                    {
                    // InternalVertigoDsl.g:5952:3: (enumLiteral_9= 'ValueObject' )
                    // InternalVertigoDsl.g:5953:4: enumLiteral_9= 'ValueObject'
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
    // InternalVertigoDsl.g:5963:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5969:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:5970:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:5970:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==96) ) {
                alt102=1;
            }
            else if ( (LA102_0==97) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalVertigoDsl.g:5971:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:5971:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:5972:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:5979:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:5979:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:5980:4: enumLiteral_1= '\"false\"'
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
    // InternalVertigoDsl.g:5990:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:5996:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) ) )
            // InternalVertigoDsl.g:5997:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) )
            {
            // InternalVertigoDsl.g:5997:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) | (enumLiteral_2= '\"1..1\"' ) | (enumLiteral_3= '\"1..*\"' ) )
            int alt103=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt103=1;
                }
                break;
            case 99:
                {
                alt103=2;
                }
                break;
            case 100:
                {
                alt103=3;
                }
                break;
            case 101:
                {
                alt103=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalVertigoDsl.g:5998:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:5998:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:5999:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:6006:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:6006:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:6007:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMultiplicityStringAccess().getZERO_NEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:6014:3: (enumLiteral_2= '\"1..1\"' )
                    {
                    // InternalVertigoDsl.g:6014:3: (enumLiteral_2= '\"1..1\"' )
                    // InternalVertigoDsl.g:6015:4: enumLiteral_2= '\"1..1\"'
                    {
                    enumLiteral_2=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMultiplicityStringAccess().getONE_ONEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:6022:3: (enumLiteral_3= '\"1..*\"' )
                    {
                    // InternalVertigoDsl.g:6022:3: (enumLiteral_3= '\"1..*\"' )
                    // InternalVertigoDsl.g:6023:4: enumLiteral_3= '\"1..*\"'
                    {
                    enumLiteral_3=(Token)match(input,101,FOLLOW_2); 

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
    // InternalVertigoDsl.g:6033:1: ruleCardinalityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) ;
    public final Enumerator ruleCardinalityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:6039:2: ( ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) ) )
            // InternalVertigoDsl.g:6040:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            {
            // InternalVertigoDsl.g:6040:2: ( (enumLiteral_0= '\"1\"' ) | (enumLiteral_1= '\"?\"' ) | (enumLiteral_2= '\"*\"' ) )
            int alt104=3;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt104=1;
                }
                break;
            case 103:
                {
                alt104=2;
                }
                break;
            case 104:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // InternalVertigoDsl.g:6041:3: (enumLiteral_0= '\"1\"' )
                    {
                    // InternalVertigoDsl.g:6041:3: (enumLiteral_0= '\"1\"' )
                    // InternalVertigoDsl.g:6042:4: enumLiteral_0= '\"1\"'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCardinalityStringAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:6049:3: (enumLiteral_1= '\"?\"' )
                    {
                    // InternalVertigoDsl.g:6049:3: (enumLiteral_1= '\"?\"' )
                    // InternalVertigoDsl.g:6050:4: enumLiteral_1= '\"?\"'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCardinalityStringAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:6057:3: (enumLiteral_2= '\"*\"' )
                    {
                    // InternalVertigoDsl.g:6057:3: (enumLiteral_2= '\"*\"' )
                    // InternalVertigoDsl.g:6058:4: enumLiteral_2= '\"*\"'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

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
    // InternalVertigoDsl.g:6068:1: ruleAssociationTypeString returns [Enumerator current=null] : ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) ) ;
    public final Enumerator ruleAssociationTypeString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:6074:2: ( ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) ) )
            // InternalVertigoDsl.g:6075:2: ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) )
            {
            // InternalVertigoDsl.g:6075:2: ( (enumLiteral_0= '\"*>1\"' ) | (enumLiteral_1= '\"*>?\"' ) | (enumLiteral_2= '\"*>*\"' ) )
            int alt105=3;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt105=1;
                }
                break;
            case 106:
                {
                alt105=2;
                }
                break;
            case 107:
                {
                alt105=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // InternalVertigoDsl.g:6076:3: (enumLiteral_0= '\"*>1\"' )
                    {
                    // InternalVertigoDsl.g:6076:3: (enumLiteral_0= '\"*>1\"' )
                    // InternalVertigoDsl.g:6077:4: enumLiteral_0= '\"*>1\"'
                    {
                    enumLiteral_0=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeStringAccess().getONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssociationTypeStringAccess().getONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:6084:3: (enumLiteral_1= '\"*>?\"' )
                    {
                    // InternalVertigoDsl.g:6084:3: (enumLiteral_1= '\"*>?\"' )
                    // InternalVertigoDsl.g:6085:4: enumLiteral_1= '\"*>?\"'
                    {
                    enumLiteral_1=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getAssociationTypeStringAccess().getOPTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssociationTypeStringAccess().getOPTIONALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:6092:3: (enumLiteral_2= '\"*>*\"' )
                    {
                    // InternalVertigoDsl.g:6092:3: (enumLiteral_2= '\"*>*\"' )
                    // InternalVertigoDsl.g:6093:4: enumLiteral_2= '\"*>*\"'
                    {
                    enumLiteral_2=(Token)match(input,107,FOLLOW_2); 

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


    // $ANTLR start "ruleInOutString"
    // InternalVertigoDsl.g:6103:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:6109:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:6110:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:6110:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==108) ) {
                alt106=1;
            }
            else if ( (LA106_0==109) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalVertigoDsl.g:6111:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:6111:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:6112:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:6119:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:6119:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:6120:4: enumLiteral_1= '\"out\"'
                    {
                    enumLiteral_1=(Token)match(input,109,FOLLOW_2); 

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
    protected DFA64 dfa64 = new DFA64(this);
    static final String dfa_1s = "\50\uffff";
    static final String dfa_2s = "\1\21\1\22\6\30\1\uffff\2\22\11\uffff\1\5\1\4\2\5\1\45\1\5\4\uffff\4\33\1\4\1\33\1\46\1\4\1\33\1\46";
    static final String dfa_3s = "\1\51\1\125\6\30\1\uffff\2\23\11\uffff\1\5\1\4\2\5\1\45\1\5\4\uffff\4\50\1\4\1\50\1\47\1\46\1\50\1\47";
    static final String dfa_4s = "\10\uffff\1\3\2\uffff\1\2\1\14\1\5\1\15\1\7\1\16\1\12\1\13\1\1\6\uffff\1\4\1\11\1\10\1\6\12\uffff";
    static final String dfa_5s = "\50\uffff}>";
    static final String[] dfa_6s = {
            "\1\12\2\uffff\1\1\6\uffff\1\10\4\uffff\1\2\1\3\1\4\1\5\1\6\3\uffff\1\7\1\11",
            "\1\10\1\17\1\uffff\1\23\6\uffff\1\15\1\uffff\1\13\24\uffff\1\21\16\uffff\1\22\6\uffff\1\14\6\uffff\1\20\4\uffff\1\16",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32\1\33",
            "\1\35\1\34",
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
    static final String dfa_12s = "\2\uffff\1\6\1\2\1\3\1\0\1\4\1\1\1\7\1\5\2\uffff}>";
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
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_6);
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
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_8);
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
    static final String dfa_15s = "\2\uffff\1\2\1\5\1\0\1\6\1\1\1\7\1\3\1\4\2\uffff}>";
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
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 0) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getAlterDomainAccess().getUnorderedGroup(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getAlterDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index20_7);
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

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_17;
            this.eof = dfa_17;
            this.min = dfa_18;
            this.max = dfa_19;
            this.accept = dfa_20;
            this.special = dfa_21;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "()+ loopback of 3093:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= ruleAssociationTypeString ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_0 = input.LA(1);

                         
                        int index64_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA64_0==27) ) {s = 1;}

                        else if ( LA64_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA64_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA64_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA64_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA64_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA64_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA64_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA64_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA64_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA64_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA64_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA64_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
                        input.seek(index64_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
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
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000001C000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000014000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000104008014000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100008014000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0007E00028008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0007600028008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0007600008008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0007600008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0007400008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0007000008000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x7FF0000100000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x7FF0004108000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x7FF0000108000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x00000E0000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000040000004000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000044008004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000040008004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000004008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000158L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000008010000L,0x0000000000000158L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000008000000L,0x000000000000FC00L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x00000000001A0400L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000008000000L,0x00000000001A0400L});

}
