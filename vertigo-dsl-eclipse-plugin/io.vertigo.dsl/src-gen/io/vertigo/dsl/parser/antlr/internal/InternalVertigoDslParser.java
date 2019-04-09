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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'declare'", "'Domain'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'domain:'", "'label:'", "'required:'", "'DtDefinition'", "'stereoType'", "'id'", "'field'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'0..1'", "'0..*'"
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
    // InternalVertigoDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= RULE_ID ) ) ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )* ( (lv_elements_4_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_package_1_0=null;
        Token otherlv_2=null;
        Token lv_packages_3_0=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:78:2: ( (otherlv_0= 'package' ( (lv_package_1_0= RULE_ID ) ) ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )* ( (lv_elements_4_0= ruleElement ) )* ) )
            // InternalVertigoDsl.g:79:2: (otherlv_0= 'package' ( (lv_package_1_0= RULE_ID ) ) ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )* ( (lv_elements_4_0= ruleElement ) )* )
            {
            // InternalVertigoDsl.g:79:2: (otherlv_0= 'package' ( (lv_package_1_0= RULE_ID ) ) ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )* ( (lv_elements_4_0= ruleElement ) )* )
            // InternalVertigoDsl.g:80:3: otherlv_0= 'package' ( (lv_package_1_0= RULE_ID ) ) ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )* ( (lv_elements_4_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
            		
            // InternalVertigoDsl.g:84:3: ( (lv_package_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:85:4: (lv_package_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:85:4: (lv_package_1_0= RULE_ID )
            // InternalVertigoDsl.g:86:5: lv_package_1_0= RULE_ID
            {
            lv_package_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_package_1_0, grammarAccess.getModelAccess().getPackageIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					addWithLastConsumed(
            						current,
            						"package",
            						lv_package_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:102:3: ( (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVertigoDsl.g:103:4: (otherlv_2= '.' )+ ( (lv_packages_3_0= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:103:4: (otherlv_2= '.' )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:104:5: otherlv_2= '.'
            	    	    {
            	    	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFullStopKeyword_2_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    // InternalVertigoDsl.g:109:4: ( (lv_packages_3_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:110:5: (lv_packages_3_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:110:5: (lv_packages_3_0= RULE_ID )
            	    // InternalVertigoDsl.g:111:6: lv_packages_3_0= RULE_ID
            	    {
            	    lv_packages_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    						newLeafNode(lv_packages_3_0, grammarAccess.getModelAccess().getPackagesIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getModelRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"packages",
            	    							lv_packages_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalVertigoDsl.g:128:3: ( (lv_elements_4_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||LA3_0==15||LA3_0==22||(LA3_0>=27 && LA3_0<=30)||(LA3_0>=34 && LA3_0<=35)||(LA3_0>=41 && LA3_0<=42)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVertigoDsl.g:129:4: (lv_elements_4_0= ruleElement )
            	    {
            	    // InternalVertigoDsl.g:129:4: (lv_elements_4_0= ruleElement )
            	    // InternalVertigoDsl.g:130:5: lv_elements_4_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"io.vertigo.dsl.VertigoDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // InternalVertigoDsl.g:151:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalVertigoDsl.g:151:48: (iv_ruleElement= ruleElement EOF )
            // InternalVertigoDsl.g:152:2: iv_ruleElement= ruleElement EOF
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
    // InternalVertigoDsl.g:158:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Formatter_1 = null;

        EObject this_Domain_2 = null;

        EObject this_FileInfo_3 = null;

        EObject this_DeclaredDomain_4 = null;

        EObject this_DtDefinition_5 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:164:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition ) )
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition )
            {
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                switch ( input.LA(2) ) {
                case 14:
                    {
                    alt4=3;
                    }
                    break;
                case 39:
                    {
                    alt4=6;
                    }
                    break;
                case 23:
                    {
                    alt4=4;
                    }
                    break;
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 25:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 34:
            case 35:
                {
                alt4=3;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=5;
                }
                break;
            case 41:
            case 42:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVertigoDsl.g:166:3: this_Constraint_0= ruleConstraint
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
                    // InternalVertigoDsl.g:175:3: this_Formatter_1= ruleFormatter
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
                    // InternalVertigoDsl.g:184:3: this_Domain_2= ruleDomain
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
                    // InternalVertigoDsl.g:193:3: this_FileInfo_3= ruleFileInfo
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
                    // InternalVertigoDsl.g:202:3: this_DeclaredDomain_4= ruleDeclaredDomain
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
                    // InternalVertigoDsl.g:211:3: this_DtDefinition_5= ruleDtDefinition
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getDtDefinitionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DtDefinition_5=ruleDtDefinition();

                    state._fsp--;


                    			current = this_DtDefinition_5;
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
    // InternalVertigoDsl.g:223:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:223:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:224:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
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
    // InternalVertigoDsl.g:230:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:236:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:237:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:237:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:238:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:246:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:247:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:247:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:248:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleConstraint"
    // InternalVertigoDsl.g:268:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:268:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:269:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalVertigoDsl.g:275:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // InternalVertigoDsl.g:281:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:282:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:282:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:283:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:291:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:292:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:292:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:293:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:321:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:322:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:322:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:323:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_className_6_0, grammarAccess.getConstraintAccess().getClassNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:339:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:340:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:348:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:349:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:349:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:350:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_args_9_0, grammarAccess.getConstraintAccess().getArgsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"args",
                    							lv_args_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:367:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:368:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:376:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:377:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:377:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:378:6: lv_msg_12_0= RULE_STRING
                    {
                    lv_msg_12_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_msg_12_0, grammarAccess.getConstraintAccess().getMsgSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"msg",
                    							lv_msg_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,22,FOLLOW_2); 

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
    // InternalVertigoDsl.g:403:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:403:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:404:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:410:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:416:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:417:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:417:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:418:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:426:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:427:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:427:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:428:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getFileInfoAccess().getStoreNameKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFileInfoAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:456:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:457:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:457:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:458:5: lv_storeName_6_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalVertigoDsl.g:482:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:482:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:483:2: iv_ruleFormatter= ruleFormatter EOF
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
    // InternalVertigoDsl.g:489:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:495:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:496:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:496:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:497:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:505:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:506:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:506:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:507:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getFormatterAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getFormatterAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:535:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:536:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:536:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:537:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_className_6_0, grammarAccess.getFormatterAccess().getClassNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormatterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:553:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:554:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:562:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:563:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:563:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:564:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_args_9_0, grammarAccess.getFormatterAccess().getArgsSTRINGTerminalRuleCall_7_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFormatterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"args",
                    							lv_args_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalVertigoDsl.g:589:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:589:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:590:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:596:1: ruleDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) ;
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
        Enumerator lv_dataType_7_0 = null;

        Enumerator lv_multiple_26_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:602:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:603:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:603:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:604:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:604:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:605:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:608:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:609:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:609:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=9;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalVertigoDsl.g:610:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:610:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    // InternalVertigoDsl.g:611:4: {...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:611:100: ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    // InternalVertigoDsl.g:612:5: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:615:8: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    // InternalVertigoDsl.g:615:9: {...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:615:18: (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    // InternalVertigoDsl.g:615:19: otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getCreateKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:623:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:624:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:624:9: (lv_name_3_0= RULE_ID )
            	    // InternalVertigoDsl.g:625:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            	    otherlv_4=(Token)match(input,17,FOLLOW_20); 

            	    								newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    otherlv_5=(Token)match(input,26,FOLLOW_11); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getDataTypeKeyword_0_4());
            	    							
            	    otherlv_6=(Token)match(input,19,FOLLOW_21); 

            	    								newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getColonKeyword_0_5());
            	    							
            	    // InternalVertigoDsl.g:653:8: ( (lv_dataType_7_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:654:9: (lv_dataType_7_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:654:9: (lv_dataType_7_0= ruleDataType )
            	    // InternalVertigoDsl.g:655:10: lv_dataType_7_0= ruleDataType
            	    {

            	    										newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_22);
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
            	    // InternalVertigoDsl.g:678:3: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:678:3: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:679:4: {...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:679:100: ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:680:5: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:683:8: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:683:9: {...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:683:18: (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:683:19: otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_11); 

            	    								newLeafNode(otherlv_8, grammarAccess.getDomainAccess().getFormatterKeyword_1_0());
            	    							
            	    otherlv_9=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getColonKeyword_1_1());
            	    							
            	    // InternalVertigoDsl.g:691:8: ( (otherlv_10= RULE_ID ) )
            	    // InternalVertigoDsl.g:692:9: (otherlv_10= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:692:9: (otherlv_10= RULE_ID )
            	    // InternalVertigoDsl.g:693:10: otherlv_10= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    									
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    										newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getFormatterFormatterCrossReference_1_2_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:710:3: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:710:3: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:711:4: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalVertigoDsl.g:711:100: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:712:5: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalVertigoDsl.g:715:8: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:715:9: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:715:18: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:715:19: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FOLLOW_11); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getStoreTypeKeyword_2_0());
            	    							
            	    otherlv_12=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getColonKeyword_2_1());
            	    							
            	    // InternalVertigoDsl.g:723:8: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:724:9: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:724:9: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:725:10: lv_storeType_13_0= RULE_STRING
            	    {
            	    lv_storeType_13_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    										newLeafNode(lv_storeType_13_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_2_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"storeType",
            	    											lv_storeType_13_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:747:3: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:747:3: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:748:4: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalVertigoDsl.g:748:100: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:749:5: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalVertigoDsl.g:752:8: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:752:9: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:752:18: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:752:19: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getIndexTypeKeyword_3_0());
            	    							
            	    otherlv_15=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getColonKeyword_3_1());
            	    							
            	    // InternalVertigoDsl.g:760:8: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:761:9: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:761:9: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:762:10: lv_indexType_16_0= RULE_STRING
            	    {
            	    lv_indexType_16_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    										newLeafNode(lv_indexType_16_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"indexType",
            	    											lv_indexType_16_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalVertigoDsl.g:784:3: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:784:3: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalVertigoDsl.g:785:4: {...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalVertigoDsl.g:785:100: ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    // InternalVertigoDsl.g:786:5: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalVertigoDsl.g:789:8: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    // InternalVertigoDsl.g:789:9: {...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:789:18: (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    // InternalVertigoDsl.g:789:19: otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']'
            	    {
            	    otherlv_17=(Token)match(input,30,FOLLOW_11); 

            	    								newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getConstraintKeyword_4_0());
            	    							
            	    otherlv_18=(Token)match(input,19,FOLLOW_23); 

            	    								newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getColonKeyword_4_1());
            	    							
            	    otherlv_19=(Token)match(input,31,FOLLOW_3); 

            	    								newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_4_2());
            	    							
            	    // InternalVertigoDsl.g:801:8: ( (otherlv_20= RULE_ID ) )
            	    // InternalVertigoDsl.g:802:9: (otherlv_20= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:802:9: (otherlv_20= RULE_ID )
            	    // InternalVertigoDsl.g:803:10: otherlv_20= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    									
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    										newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_3_0());
            	    									

            	    }


            	    }

            	    // InternalVertigoDsl.g:814:8: ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==32) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:815:9: (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:815:9: (otherlv_21= ',' )+
            	    	    int cnt8=0;
            	    	    loop8:
            	    	    do {
            	    	        int alt8=2;
            	    	        int LA8_0 = input.LA(1);

            	    	        if ( (LA8_0==32) ) {
            	    	            alt8=1;
            	    	        }


            	    	        switch (alt8) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:816:10: otherlv_21= ','
            	    	    	    {
            	    	    	    otherlv_21=(Token)match(input,32,FOLLOW_25); 

            	    	    	    										newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getCommaKeyword_4_4_0());
            	    	    	    									

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt8 >= 1 ) break loop8;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(8, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt8++;
            	    	    } while (true);

            	    	    // InternalVertigoDsl.g:821:9: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:822:10: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:822:10: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:823:11: otherlv_22= RULE_ID
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getDomainRule());
            	    	    											}
            	    	    										
            	    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    	    											newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_4_4_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,33,FOLLOW_22); 

            	    								newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_4_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalVertigoDsl.g:845:3: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:845:3: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:846:4: {...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalVertigoDsl.g:846:100: ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:847:5: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalVertigoDsl.g:850:8: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:850:9: {...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:850:18: (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:850:19: otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) )
            	    {
            	    otherlv_24=(Token)match(input,34,FOLLOW_11); 

            	    								newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getMultipleKeyword_5_0());
            	    							
            	    otherlv_25=(Token)match(input,19,FOLLOW_26); 

            	    								newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getColonKeyword_5_1());
            	    							
            	    // InternalVertigoDsl.g:858:8: ( (lv_multiple_26_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:859:9: (lv_multiple_26_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:859:9: (lv_multiple_26_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:860:10: lv_multiple_26_0= ruleBooleanString
            	    {

            	    										newCompositeNode(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_22);
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalVertigoDsl.g:883:3: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:883:3: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:884:4: {...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalVertigoDsl.g:884:100: ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:885:5: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalVertigoDsl.g:888:8: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:888:9: {...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:888:18: (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:888:19: otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) )
            	    {
            	    otherlv_27=(Token)match(input,35,FOLLOW_11); 

            	    								newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getUnitKeyword_6_0());
            	    							
            	    otherlv_28=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_28, grammarAccess.getDomainAccess().getColonKeyword_6_1());
            	    							
            	    // InternalVertigoDsl.g:896:8: ( (lv_unit_29_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:897:9: (lv_unit_29_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:897:9: (lv_unit_29_0= RULE_STRING )
            	    // InternalVertigoDsl.g:898:10: lv_unit_29_0= RULE_STRING
            	    {
            	    lv_unit_29_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    										newLeafNode(lv_unit_29_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_6_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"unit",
            	    											lv_unit_29_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalVertigoDsl.g:920:3: ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:920:3: ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) )
            	    // InternalVertigoDsl.g:921:4: {...}? => ( ({...}? => (otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalVertigoDsl.g:921:100: ( ({...}? => (otherlv_30= '}' ) ) )
            	    // InternalVertigoDsl.g:922:5: ({...}? => (otherlv_30= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalVertigoDsl.g:925:8: ({...}? => (otherlv_30= '}' ) )
            	    // InternalVertigoDsl.g:925:9: {...}? => (otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:925:18: (otherlv_30= '}' )
            	    // InternalVertigoDsl.g:925:19: otherlv_30= '}'
            	    {
            	    otherlv_30=(Token)match(input,22,FOLLOW_22); 

            	    								newLeafNode(otherlv_30, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

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


    // $ANTLR start "entryRuleFieldDescriptionString"
    // InternalVertigoDsl.g:946:1: entryRuleFieldDescriptionString returns [EObject current=null] : iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF ;
    public final EObject entryRuleFieldDescriptionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDescriptionString = null;


        try {
            // InternalVertigoDsl.g:946:63: (iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF )
            // InternalVertigoDsl.g:947:2: iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF
            {
             newCompositeNode(grammarAccess.getFieldDescriptionStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldDescriptionString=ruleFieldDescriptionString();

            state._fsp--;

             current =iv_ruleFieldDescriptionString; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDescriptionString"


    // $ANTLR start "ruleFieldDescriptionString"
    // InternalVertigoDsl.g:953:1: ruleFieldDescriptionString returns [EObject current=null] : ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
    public final EObject ruleFieldDescriptionString() throws RecognitionException {
        EObject current = null;

        Token lv_fieldDescriptionString_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_required_8_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:959:2: ( ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalVertigoDsl.g:960:2: ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalVertigoDsl.g:960:2: ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalVertigoDsl.g:961:3: ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            // InternalVertigoDsl.g:961:3: ( (lv_fieldDescriptionString_0_0= '{' ) )
            // InternalVertigoDsl.g:962:4: (lv_fieldDescriptionString_0_0= '{' )
            {
            // InternalVertigoDsl.g:962:4: (lv_fieldDescriptionString_0_0= '{' )
            // InternalVertigoDsl.g:963:5: lv_fieldDescriptionString_0_0= '{'
            {
            lv_fieldDescriptionString_0_0=(Token)match(input,17,FOLLOW_27); 

            					newLeafNode(lv_fieldDescriptionString_0_0, grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDescriptionStringRule());
            					}
            					setWithLastConsumed(current, "fieldDescriptionString", lv_fieldDescriptionString_0_0, "{");
            				

            }


            }

            // InternalVertigoDsl.g:975:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:976:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:976:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:977:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:980:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* )
            // InternalVertigoDsl.g:981:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:981:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( ( LA12_0 == RULE_ID || LA12_0 == 36 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVertigoDsl.g:982:4: ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:982:4: ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:983:5: {...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:983:119: ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:984:6: ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:987:9: ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:987:10: {...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:987:19: ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==36) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==RULE_ID) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalVertigoDsl.g:987:20: (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) )
            	            {
            	            // InternalVertigoDsl.g:987:20: (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) )
            	            // InternalVertigoDsl.g:988:10: otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) )
            	            {
            	            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            	            										newLeafNode(otherlv_2, grammarAccess.getFieldDescriptionStringAccess().getDomainKeyword_1_0_0_0());
            	            									
            	            // InternalVertigoDsl.g:992:10: ( (otherlv_3= RULE_ID ) )
            	            // InternalVertigoDsl.g:993:11: (otherlv_3= RULE_ID )
            	            {
            	            // InternalVertigoDsl.g:993:11: (otherlv_3= RULE_ID )
            	            // InternalVertigoDsl.g:994:12: otherlv_3= RULE_ID
            	            {

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getFieldDescriptionStringRule());
            	            												}
            	            											
            	            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            												newLeafNode(otherlv_3, grammarAccess.getFieldDescriptionStringAccess().getDomainDomainCrossReference_1_0_0_1_0());
            	            											

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalVertigoDsl.g:1007:9: ( (otherlv_4= RULE_ID ) )
            	            {
            	            // InternalVertigoDsl.g:1007:9: ( (otherlv_4= RULE_ID ) )
            	            // InternalVertigoDsl.g:1008:10: (otherlv_4= RULE_ID )
            	            {
            	            // InternalVertigoDsl.g:1008:10: (otherlv_4= RULE_ID )
            	            // InternalVertigoDsl.g:1009:11: otherlv_4= RULE_ID
            	            {

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getFieldDescriptionStringRule());
            	            											}
            	            										
            	            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            											newLeafNode(otherlv_4, grammarAccess.getFieldDescriptionStringAccess().getDeclaredDomainDeclaredDomainCrossReference_1_0_1_0());
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1026:4: ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1026:4: ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1027:5: {...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1027:119: ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1028:6: ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1031:9: ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1031:10: {...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:1031:19: (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1031:20: otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,37,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFieldDescriptionStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalVertigoDsl.g:1035:9: ( (lv_label_6_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1036:10: (lv_label_6_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1036:10: (lv_label_6_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1037:11: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    											newLeafNode(lv_label_6_0, grammarAccess.getFieldDescriptionStringAccess().getLabelSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFieldDescriptionStringRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"label",
            	    												lv_label_6_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1059:4: ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1059:4: ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1060:5: {...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1060:119: ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1061:6: ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1064:9: ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1064:10: {...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:1064:19: (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1064:20: otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_26); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFieldDescriptionStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    // InternalVertigoDsl.g:1068:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1069:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1069:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1070:11: lv_required_8_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getFieldDescriptionStringAccess().getRequiredBooleanStringEnumRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_required_8_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getFieldDescriptionStringRule());
            	    											}
            	    											set(
            	    												current,
            	    												"required",
            	    												lv_required_8_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            				

            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFieldDescriptionStringAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDescriptionString"


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:1108:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:1108:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:1109:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:1115:1: ruleDtDefinition returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_stereoType_7_0=null;
        Token otherlv_8=null;
        Token this_ID_9=null;
        Token otherlv_11=null;
        Token this_ID_12=null;
        Token otherlv_14=null;
        EObject lv_idFieldDescriptionString_10_0 = null;

        EObject lv_fieldDescriptionString_13_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1121:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:1122:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:1122:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1123:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1123:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1124:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:1127:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1128:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1128:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=5;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalVertigoDsl.g:1129:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1129:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // InternalVertigoDsl.g:1130:4: {...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1130:106: ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) )
            	    // InternalVertigoDsl.g:1131:5: ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:1134:8: ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) )
            	    // InternalVertigoDsl.g:1134:9: {...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:1134:18: (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? )
            	    // InternalVertigoDsl.g:1134:19: otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_28); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,39,FOLLOW_3); 

            	    								newLeafNode(otherlv_2, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:1142:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:1143:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1143:9: (lv_name_3_0= RULE_ID )
            	    // InternalVertigoDsl.g:1144:10: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    										newLeafNode(lv_name_3_0, grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_0_2_0());
            	    									

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

            	    otherlv_4=(Token)match(input,17,FOLLOW_29); 

            	    								newLeafNode(otherlv_4, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    // InternalVertigoDsl.g:1164:8: (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==40) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1165:9: otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) )
            	            {
            	            otherlv_5=(Token)match(input,40,FOLLOW_11); 

            	            									newLeafNode(otherlv_5, grammarAccess.getDtDefinitionAccess().getStereoTypeKeyword_0_4_0());
            	            								
            	            otherlv_6=(Token)match(input,19,FOLLOW_12); 

            	            									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionAccess().getColonKeyword_0_4_1());
            	            								
            	            // InternalVertigoDsl.g:1173:9: ( (lv_stereoType_7_0= RULE_STRING ) )
            	            // InternalVertigoDsl.g:1174:10: (lv_stereoType_7_0= RULE_STRING )
            	            {
            	            // InternalVertigoDsl.g:1174:10: (lv_stereoType_7_0= RULE_STRING )
            	            // InternalVertigoDsl.g:1175:11: lv_stereoType_7_0= RULE_STRING
            	            {
            	            lv_stereoType_7_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	            											newLeafNode(lv_stereoType_7_0, grammarAccess.getDtDefinitionAccess().getStereoTypeSTRINGTerminalRuleCall_0_4_2_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getDtDefinitionRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"stereoType",
            	            												lv_stereoType_7_0,
            	            												"org.eclipse.xtext.common.Terminals.STRING");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1198:3: ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1198:3: ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1199:4: {...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1199:106: ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) )
            	    // InternalVertigoDsl.g:1200:5: ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:1203:8: ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) )
            	    // InternalVertigoDsl.g:1203:9: {...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:1203:18: (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) )
            	    // InternalVertigoDsl.g:1203:19: otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) )
            	    {
            	    otherlv_8=(Token)match(input,41,FOLLOW_3); 

            	    								newLeafNode(otherlv_8, grammarAccess.getDtDefinitionAccess().getIdKeyword_1_0());
            	    							
            	    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    								newLeafNode(this_ID_9, grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_1_1());
            	    							
            	    // InternalVertigoDsl.g:1211:8: ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) )
            	    // InternalVertigoDsl.g:1212:9: (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString )
            	    {
            	    // InternalVertigoDsl.g:1212:9: (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString )
            	    // InternalVertigoDsl.g:1213:10: lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getIdFieldDescriptionStringFieldDescriptionStringParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_idFieldDescriptionString_10_0=ruleFieldDescriptionString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"idFieldDescriptionString",
            	    											lv_idFieldDescriptionString_10_0,
            	    											"io.vertigo.dsl.VertigoDsl.FieldDescriptionString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1236:3: ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1236:3: ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1237:4: {...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1237:106: ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) )
            	    // InternalVertigoDsl.g:1238:5: ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalVertigoDsl.g:1241:8: ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) )
            	    // InternalVertigoDsl.g:1241:9: {...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:1241:18: (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) )
            	    // InternalVertigoDsl.g:1241:19: otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) )
            	    {
            	    otherlv_11=(Token)match(input,42,FOLLOW_3); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDtDefinitionAccess().getFieldKeyword_2_0());
            	    							
            	    this_ID_12=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    								newLeafNode(this_ID_12, grammarAccess.getDtDefinitionAccess().getIDTerminalRuleCall_2_1());
            	    							
            	    // InternalVertigoDsl.g:1249:8: ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) )
            	    // InternalVertigoDsl.g:1250:9: (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString )
            	    {
            	    // InternalVertigoDsl.g:1250:9: (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString )
            	    // InternalVertigoDsl.g:1251:10: lv_fieldDescriptionString_13_0= ruleFieldDescriptionString
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getFieldDescriptionStringFieldDescriptionStringParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_fieldDescriptionString_13_0=ruleFieldDescriptionString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"fieldDescriptionString",
            	    											lv_fieldDescriptionString_13_0,
            	    											"io.vertigo.dsl.VertigoDsl.FieldDescriptionString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:1274:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1274:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    // InternalVertigoDsl.g:1275:4: {...}? => ( ({...}? => (otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1275:106: ( ({...}? => (otherlv_14= '}' ) ) )
            	    // InternalVertigoDsl.g:1276:5: ({...}? => (otherlv_14= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalVertigoDsl.g:1279:8: ({...}? => (otherlv_14= '}' ) )
            	    // InternalVertigoDsl.g:1279:9: {...}? => (otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:1279:18: (otherlv_14= '}' )
            	    // InternalVertigoDsl.g:1279:19: otherlv_14= '}'
            	    {
            	    otherlv_14=(Token)match(input,22,FOLLOW_30); 

            	    								newLeafNode(otherlv_14, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleDataType"
    // InternalVertigoDsl.g:1300:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
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
            // InternalVertigoDsl.g:1306:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:1307:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:1307:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt15=9;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt15=1;
                }
                break;
            case 44:
                {
                alt15=2;
                }
                break;
            case 45:
                {
                alt15=3;
                }
                break;
            case 46:
                {
                alt15=4;
                }
                break;
            case 47:
                {
                alt15=5;
                }
                break;
            case 48:
                {
                alt15=6;
                }
                break;
            case 49:
                {
                alt15=7;
                }
                break;
            case 50:
                {
                alt15=8;
                }
                break;
            case 51:
                {
                alt15=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalVertigoDsl.g:1308:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:1308:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:1309:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1316:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:1316:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:1317:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:1324:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:1324:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:1325:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:1332:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:1332:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:1333:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:1340:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:1340:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:1341:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:1348:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:1348:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:1349:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:1356:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:1356:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:1357:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:1364:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:1364:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:1365:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:1372:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:1372:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:1373:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,51,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1383:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1389:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:1390:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:1390:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==52) ) {
                alt16=1;
            }
            else if ( (LA16_0==53) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVertigoDsl.g:1391:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:1391:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:1392:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1399:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:1399:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:1400:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1410:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '0..*' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1416:2: ( ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '0..*' ) ) )
            // InternalVertigoDsl.g:1417:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '0..*' ) )
            {
            // InternalVertigoDsl.g:1417:2: ( (enumLiteral_0= '0..1' ) | (enumLiteral_1= '0..*' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            else if ( (LA17_0==55) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalVertigoDsl.g:1418:3: (enumLiteral_0= '0..1' )
                    {
                    // InternalVertigoDsl.g:1418:3: (enumLiteral_0= '0..1' )
                    // InternalVertigoDsl.g:1419:4: enumLiteral_0= '0..1'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1426:3: (enumLiteral_1= '0..*' )
                    {
                    // InternalVertigoDsl.g:1426:3: (enumLiteral_1= '0..*' )
                    // InternalVertigoDsl.g:1427:4: enumLiteral_1= '0..*'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

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

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\1\21\uffff";
    static final String dfa_3s = "\1\15\1\uffff\10\0\10\uffff";
    static final String dfa_4s = "\1\52\1\uffff\10\0\10\uffff";
    static final String dfa_5s = "\1\uffff\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\2\uffff\1\3\1\7\1\4\1\0\1\6\1\5\1\1\1\2\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\6\uffff\1\11\4\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7\1\10\5\uffff\2\1",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 609:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 15;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\15\1\uffff\4\0\4\uffff";
    static final String dfa_11s = "\1\52\1\uffff\4\0\4\uffff";
    static final String dfa_12s = "\1\uffff\1\5\4\uffff\1\1\1\4\1\2\1\3";
    static final String dfa_13s = "\2\uffff\1\2\1\0\1\3\1\1\4\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\2\6\uffff\1\3\4\uffff\4\1\3\uffff\2\1\5\uffff\1\4\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 1128:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'stereoType' otherlv_6= ':' ( (lv_stereoType_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' this_ID_9= RULE_ID ( (lv_idFieldDescriptionString_10_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'field' this_ID_12= RULE_ID ( (lv_fieldDescriptionString_13_0= ruleFieldDescriptionString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 3) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 0) ) {s = 6;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000060C7840B002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000060C7840A002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000FF80000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C78408002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000400010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000070000408002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000408002L});

}
