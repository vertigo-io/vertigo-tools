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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'declare'", "'Domain'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'domain:'", "'label:'", "'required:'", "'id'", "'field'", "'stereotype'", "'DtDefinition'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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

                if ( (LA3_0==13||LA3_0==15||LA3_0==22||(LA3_0>=27 && LA3_0<=30)||(LA3_0>=34 && LA3_0<=35)) ) {
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
    // InternalVertigoDsl.g:158:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_Association_6= ruleAssociation ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Constraint_0 = null;

        EObject this_Formatter_1 = null;

        EObject this_Domain_2 = null;

        EObject this_FileInfo_3 = null;

        EObject this_DeclaredDomain_4 = null;

        EObject this_DtDefinition_5 = null;

        EObject this_Association_6 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:164:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_Association_6= ruleAssociation ) )
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_Association_6= ruleAssociation )
            {
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_Association_6= ruleAssociation )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                switch ( input.LA(2) ) {
                case 25:
                    {
                    alt4=2;
                    }
                    break;
                case 14:
                    {
                    alt4=3;
                    }
                    break;
                case 43:
                    {
                    alt4=7;
                    }
                    break;
                case 42:
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
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
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
            case 13:
                {
                alt4=5;
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
                case 7 :
                    // InternalVertigoDsl.g:220:3: this_Association_6= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAssociationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_6=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_6;
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
    // InternalVertigoDsl.g:232:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:232:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:233:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
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
    // InternalVertigoDsl.g:239:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:245:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:246:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:246:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:247:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:255:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:256:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:256:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:257:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:277:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:277:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:278:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalVertigoDsl.g:284:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // InternalVertigoDsl.g:290:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:291:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:291:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:292:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:300:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:301:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:301:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:302:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:330:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:331:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:331:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:332:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:348:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:349:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:357:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:358:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:358:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:359:6: lv_args_9_0= RULE_STRING
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

            // InternalVertigoDsl.g:376:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:377:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:385:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:386:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:386:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:387:6: lv_msg_12_0= RULE_STRING
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
    // InternalVertigoDsl.g:412:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:412:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:413:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:419:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:425:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:426:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:426:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:427:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:435:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:436:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:436:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:437:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:465:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:466:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:466:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:467:5: lv_storeName_6_0= RULE_STRING
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
    // InternalVertigoDsl.g:491:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:491:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:492:2: iv_ruleFormatter= ruleFormatter EOF
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
    // InternalVertigoDsl.g:498:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:504:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:505:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:505:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:506:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:514:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:515:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:515:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:516:5: lv_name_2_0= RULE_ID
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
            		
            // InternalVertigoDsl.g:544:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:545:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:545:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:546:5: lv_className_6_0= RULE_STRING
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

            // InternalVertigoDsl.g:562:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:563:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:571:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:572:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:572:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:573:6: lv_args_9_0= RULE_STRING
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
    // InternalVertigoDsl.g:598:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:598:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:599:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:605:1: ruleDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalVertigoDsl.g:611:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:612:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:612:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:613:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:613:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:614:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:617:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:618:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:618:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=9;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalVertigoDsl.g:619:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:619:3: ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) )
            	    // InternalVertigoDsl.g:620:4: {...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:620:100: ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) )
            	    // InternalVertigoDsl.g:621:5: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:624:8: ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) )
            	    // InternalVertigoDsl.g:624:9: {...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:624:18: (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) )
            	    // InternalVertigoDsl.g:624:19: otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getCreateKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:632:8: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:633:9: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:633:9: (lv_name_3_0= RULE_ID )
            	    // InternalVertigoDsl.g:634:10: lv_name_3_0= RULE_ID
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
            	    							
            	    // InternalVertigoDsl.g:662:8: ( (lv_dataType_7_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:663:9: (lv_dataType_7_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:663:9: (lv_dataType_7_0= ruleDataType )
            	    // InternalVertigoDsl.g:664:10: lv_dataType_7_0= ruleDataType
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
            	    // InternalVertigoDsl.g:687:3: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:687:3: ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:688:4: {...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:688:100: ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:689:5: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:692:8: ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:692:9: {...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:692:18: (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:692:19: otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,27,FOLLOW_11); 

            	    								newLeafNode(otherlv_8, grammarAccess.getDomainAccess().getFormatterKeyword_1_0());
            	    							
            	    otherlv_9=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getColonKeyword_1_1());
            	    							
            	    // InternalVertigoDsl.g:700:8: ( (otherlv_10= RULE_ID ) )
            	    // InternalVertigoDsl.g:701:9: (otherlv_10= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:701:9: (otherlv_10= RULE_ID )
            	    // InternalVertigoDsl.g:702:10: otherlv_10= RULE_ID
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
            	    // InternalVertigoDsl.g:719:3: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:719:3: ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:720:4: {...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalVertigoDsl.g:720:100: ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:721:5: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalVertigoDsl.g:724:8: ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:724:9: {...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:724:18: (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:724:19: otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) )
            	    {
            	    otherlv_11=(Token)match(input,28,FOLLOW_11); 

            	    								newLeafNode(otherlv_11, grammarAccess.getDomainAccess().getStoreTypeKeyword_2_0());
            	    							
            	    otherlv_12=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_12, grammarAccess.getDomainAccess().getColonKeyword_2_1());
            	    							
            	    // InternalVertigoDsl.g:732:8: ( (lv_storeType_13_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:733:9: (lv_storeType_13_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:733:9: (lv_storeType_13_0= RULE_STRING )
            	    // InternalVertigoDsl.g:734:10: lv_storeType_13_0= RULE_STRING
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
            	    // InternalVertigoDsl.g:756:3: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:756:3: ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:757:4: {...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalVertigoDsl.g:757:100: ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:758:5: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalVertigoDsl.g:761:8: ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:761:9: {...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:761:18: (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:761:19: otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) )
            	    {
            	    otherlv_14=(Token)match(input,29,FOLLOW_11); 

            	    								newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getIndexTypeKeyword_3_0());
            	    							
            	    otherlv_15=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_15, grammarAccess.getDomainAccess().getColonKeyword_3_1());
            	    							
            	    // InternalVertigoDsl.g:769:8: ( (lv_indexType_16_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:770:9: (lv_indexType_16_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:770:9: (lv_indexType_16_0= RULE_STRING )
            	    // InternalVertigoDsl.g:771:10: lv_indexType_16_0= RULE_STRING
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
            	    // InternalVertigoDsl.g:793:3: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:793:3: ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalVertigoDsl.g:794:4: {...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalVertigoDsl.g:794:100: ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) )
            	    // InternalVertigoDsl.g:795:5: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalVertigoDsl.g:798:8: ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) )
            	    // InternalVertigoDsl.g:798:9: {...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:798:18: (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' )
            	    // InternalVertigoDsl.g:798:19: otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']'
            	    {
            	    otherlv_17=(Token)match(input,30,FOLLOW_11); 

            	    								newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getConstraintKeyword_4_0());
            	    							
            	    otherlv_18=(Token)match(input,19,FOLLOW_23); 

            	    								newLeafNode(otherlv_18, grammarAccess.getDomainAccess().getColonKeyword_4_1());
            	    							
            	    otherlv_19=(Token)match(input,31,FOLLOW_3); 

            	    								newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_4_2());
            	    							
            	    // InternalVertigoDsl.g:810:8: ( (otherlv_20= RULE_ID ) )
            	    // InternalVertigoDsl.g:811:9: (otherlv_20= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:811:9: (otherlv_20= RULE_ID )
            	    // InternalVertigoDsl.g:812:10: otherlv_20= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    									
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    										newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_4_3_0());
            	    									

            	    }


            	    }

            	    // InternalVertigoDsl.g:823:8: ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==32) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:824:9: (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:824:9: (otherlv_21= ',' )+
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
            	    	    	    // InternalVertigoDsl.g:825:10: otherlv_21= ','
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

            	    	    // InternalVertigoDsl.g:830:9: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:831:10: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:831:10: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:832:11: otherlv_22= RULE_ID
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
            	    // InternalVertigoDsl.g:854:3: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:854:3: ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:855:4: {...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalVertigoDsl.g:855:100: ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:856:5: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalVertigoDsl.g:859:8: ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:859:9: {...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:859:18: (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:859:19: otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) )
            	    {
            	    otherlv_24=(Token)match(input,34,FOLLOW_11); 

            	    								newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getMultipleKeyword_5_0());
            	    							
            	    otherlv_25=(Token)match(input,19,FOLLOW_26); 

            	    								newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getColonKeyword_5_1());
            	    							
            	    // InternalVertigoDsl.g:867:8: ( (lv_multiple_26_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:868:9: (lv_multiple_26_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:868:9: (lv_multiple_26_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:869:10: lv_multiple_26_0= ruleBooleanString
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
            	    // InternalVertigoDsl.g:892:3: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:892:3: ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:893:4: {...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalVertigoDsl.g:893:100: ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:894:5: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalVertigoDsl.g:897:8: ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:897:9: {...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:897:18: (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:897:19: otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) )
            	    {
            	    otherlv_27=(Token)match(input,35,FOLLOW_11); 

            	    								newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getUnitKeyword_6_0());
            	    							
            	    otherlv_28=(Token)match(input,19,FOLLOW_12); 

            	    								newLeafNode(otherlv_28, grammarAccess.getDomainAccess().getColonKeyword_6_1());
            	    							
            	    // InternalVertigoDsl.g:905:8: ( (lv_unit_29_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:906:9: (lv_unit_29_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:906:9: (lv_unit_29_0= RULE_STRING )
            	    // InternalVertigoDsl.g:907:10: lv_unit_29_0= RULE_STRING
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
            	    // InternalVertigoDsl.g:929:3: ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:929:3: ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) )
            	    // InternalVertigoDsl.g:930:4: {...}? => ( ({...}? => (otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalVertigoDsl.g:930:100: ( ({...}? => (otherlv_30= '}' ) ) )
            	    // InternalVertigoDsl.g:931:5: ({...}? => (otherlv_30= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalVertigoDsl.g:934:8: ({...}? => (otherlv_30= '}' ) )
            	    // InternalVertigoDsl.g:934:9: {...}? => (otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:934:18: (otherlv_30= '}' )
            	    // InternalVertigoDsl.g:934:19: otherlv_30= '}'
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
    // InternalVertigoDsl.g:955:1: entryRuleFieldDescriptionString returns [EObject current=null] : iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF ;
    public final EObject entryRuleFieldDescriptionString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDescriptionString = null;


        try {
            // InternalVertigoDsl.g:955:63: (iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF )
            // InternalVertigoDsl.g:956:2: iv_ruleFieldDescriptionString= ruleFieldDescriptionString EOF
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
    // InternalVertigoDsl.g:962:1: ruleFieldDescriptionString returns [EObject current=null] : ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) ;
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
            // InternalVertigoDsl.g:968:2: ( ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' ) )
            // InternalVertigoDsl.g:969:2: ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            {
            // InternalVertigoDsl.g:969:2: ( ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}' )
            // InternalVertigoDsl.g:970:3: ( (lv_fieldDescriptionString_0_0= '{' ) ) ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) ) otherlv_9= '}'
            {
            // InternalVertigoDsl.g:970:3: ( (lv_fieldDescriptionString_0_0= '{' ) )
            // InternalVertigoDsl.g:971:4: (lv_fieldDescriptionString_0_0= '{' )
            {
            // InternalVertigoDsl.g:971:4: (lv_fieldDescriptionString_0_0= '{' )
            // InternalVertigoDsl.g:972:5: lv_fieldDescriptionString_0_0= '{'
            {
            lv_fieldDescriptionString_0_0=(Token)match(input,17,FOLLOW_27); 

            					newLeafNode(lv_fieldDescriptionString_0_0, grammarAccess.getFieldDescriptionStringAccess().getFieldDescriptionStringLeftCurlyBracketKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldDescriptionStringRule());
            					}
            					setWithLastConsumed(current, "fieldDescriptionString", lv_fieldDescriptionString_0_0, "{");
            				

            }


            }

            // InternalVertigoDsl.g:984:3: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:985:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:985:4: ( ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:986:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:989:5: ( ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )* )
            // InternalVertigoDsl.g:990:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:990:6: ( ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) ) )*
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
            	    // InternalVertigoDsl.g:991:4: ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:991:4: ({...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:992:5: {...}? => ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:992:119: ( ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:993:6: ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:996:9: ({...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:996:10: {...}? => ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:996:19: ( (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) ) | ( (otherlv_4= RULE_ID ) ) )
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
            	            // InternalVertigoDsl.g:996:20: (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) )
            	            {
            	            // InternalVertigoDsl.g:996:20: (otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) ) )
            	            // InternalVertigoDsl.g:997:10: otherlv_2= 'domain:' ( (otherlv_3= RULE_ID ) )
            	            {
            	            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            	            										newLeafNode(otherlv_2, grammarAccess.getFieldDescriptionStringAccess().getDomainKeyword_1_0_0_0());
            	            									
            	            // InternalVertigoDsl.g:1001:10: ( (otherlv_3= RULE_ID ) )
            	            // InternalVertigoDsl.g:1002:11: (otherlv_3= RULE_ID )
            	            {
            	            // InternalVertigoDsl.g:1002:11: (otherlv_3= RULE_ID )
            	            // InternalVertigoDsl.g:1003:12: otherlv_3= RULE_ID
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
            	            // InternalVertigoDsl.g:1016:9: ( (otherlv_4= RULE_ID ) )
            	            {
            	            // InternalVertigoDsl.g:1016:9: ( (otherlv_4= RULE_ID ) )
            	            // InternalVertigoDsl.g:1017:10: (otherlv_4= RULE_ID )
            	            {
            	            // InternalVertigoDsl.g:1017:10: (otherlv_4= RULE_ID )
            	            // InternalVertigoDsl.g:1018:11: otherlv_4= RULE_ID
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
            	    // InternalVertigoDsl.g:1035:4: ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1035:4: ({...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1036:5: {...}? => ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1036:119: ( ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1037:6: ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1040:9: ({...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1040:10: {...}? => (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:1040:19: (otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1040:20: otherlv_5= 'label:' ( (lv_label_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,37,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFieldDescriptionStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    // InternalVertigoDsl.g:1044:9: ( (lv_label_6_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1045:10: (lv_label_6_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1045:10: (lv_label_6_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1046:11: lv_label_6_0= RULE_STRING
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
            	    // InternalVertigoDsl.g:1068:4: ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1068:4: ({...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1069:5: {...}? => ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1069:119: ( ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1070:6: ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFieldDescriptionStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1073:9: ({...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1073:10: {...}? => (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFieldDescriptionString", "true");
            	    }
            	    // InternalVertigoDsl.g:1073:19: (otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1073:20: otherlv_7= 'required:' ( (lv_required_8_0= ruleBooleanString ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_26); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFieldDescriptionStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    // InternalVertigoDsl.g:1077:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1078:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1078:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1079:11: lv_required_8_0= ruleBooleanString
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


    // $ANTLR start "entryRuleDtDefinitionId"
    // InternalVertigoDsl.g:1117:1: entryRuleDtDefinitionId returns [EObject current=null] : iv_ruleDtDefinitionId= ruleDtDefinitionId EOF ;
    public final EObject entryRuleDtDefinitionId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionId = null;


        try {
            // InternalVertigoDsl.g:1117:55: (iv_ruleDtDefinitionId= ruleDtDefinitionId EOF )
            // InternalVertigoDsl.g:1118:2: iv_ruleDtDefinitionId= ruleDtDefinitionId EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionIdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionId=ruleDtDefinitionId();

            state._fsp--;

             current =iv_ruleDtDefinitionId; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDtDefinitionId"


    // $ANTLR start "ruleDtDefinitionId"
    // InternalVertigoDsl.g:1124:1: ruleDtDefinitionId returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) ) ) ;
    public final EObject ruleDtDefinitionId() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_idFieldDescriptionString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1130:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) ) ) )
            // InternalVertigoDsl.g:1131:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) ) )
            {
            // InternalVertigoDsl.g:1131:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) ) )
            // InternalVertigoDsl.g:1132:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:1136:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1137:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1137:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1138:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtDefinitionIdAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionIdRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:1154:3: ( (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString ) )
            // InternalVertigoDsl.g:1155:4: (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString )
            {
            // InternalVertigoDsl.g:1155:4: (lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString )
            // InternalVertigoDsl.g:1156:5: lv_idFieldDescriptionString_2_0= ruleFieldDescriptionString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionIdAccess().getIdFieldDescriptionStringFieldDescriptionStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_idFieldDescriptionString_2_0=ruleFieldDescriptionString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionIdRule());
            					}
            					set(
            						current,
            						"idFieldDescriptionString",
            						lv_idFieldDescriptionString_2_0,
            						"io.vertigo.dsl.VertigoDsl.FieldDescriptionString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDtDefinitionId"


    // $ANTLR start "entryRuleDtDefinitionField"
    // InternalVertigoDsl.g:1177:1: entryRuleDtDefinitionField returns [EObject current=null] : iv_ruleDtDefinitionField= ruleDtDefinitionField EOF ;
    public final EObject entryRuleDtDefinitionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionField = null;


        try {
            // InternalVertigoDsl.g:1177:58: (iv_ruleDtDefinitionField= ruleDtDefinitionField EOF )
            // InternalVertigoDsl.g:1178:2: iv_ruleDtDefinitionField= ruleDtDefinitionField EOF
            {
             newCompositeNode(grammarAccess.getDtDefinitionFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDtDefinitionField=ruleDtDefinitionField();

            state._fsp--;

             current =iv_ruleDtDefinitionField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDtDefinitionField"


    // $ANTLR start "ruleDtDefinitionField"
    // InternalVertigoDsl.g:1184:1: ruleDtDefinitionField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) ) ) ;
    public final EObject ruleDtDefinitionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_fieldDescriptionString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1190:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) ) ) )
            // InternalVertigoDsl.g:1191:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) ) )
            {
            // InternalVertigoDsl.g:1191:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) ) )
            // InternalVertigoDsl.g:1192:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:1196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1197:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDtDefinitionFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalVertigoDsl.g:1214:3: ( (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString ) )
            // InternalVertigoDsl.g:1215:4: (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString )
            {
            // InternalVertigoDsl.g:1215:4: (lv_fieldDescriptionString_2_0= ruleFieldDescriptionString )
            // InternalVertigoDsl.g:1216:5: lv_fieldDescriptionString_2_0= ruleFieldDescriptionString
            {

            					newCompositeNode(grammarAccess.getDtDefinitionFieldAccess().getFieldDescriptionStringFieldDescriptionStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_fieldDescriptionString_2_0=ruleFieldDescriptionString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDtDefinitionFieldRule());
            					}
            					set(
            						current,
            						"fieldDescriptionString",
            						lv_fieldDescriptionString_2_0,
            						"io.vertigo.dsl.VertigoDsl.FieldDescriptionString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDtDefinitionField"


    // $ANTLR start "entryRuleDtDefinitionStereotype"
    // InternalVertigoDsl.g:1237:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:1237:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:1238:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:1244:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1250:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) ) )
            // InternalVertigoDsl.g:1251:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) )
            {
            // InternalVertigoDsl.g:1251:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:1252:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1260:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1261:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1261:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1262:5: lv_stereoType_2_0= RULE_STRING
            {
            lv_stereoType_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_stereoType_2_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereoTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionStereotypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"stereoType",
            						lv_stereoType_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDtDefinitionStereotype"


    // $ANTLR start "entryRuleDtDefinition"
    // InternalVertigoDsl.g:1282:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:1282:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:1283:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:1289:1: ruleDtDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )? ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )* otherlv_7= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_dtDefinitionStereotype_4_0 = null;

        EObject lv_dtDefinitionId_5_0 = null;

        EObject lv_dtDefinitionFields_6_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1295:2: ( (otherlv_0= 'create' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )? ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )* otherlv_7= '}' ) )
            // InternalVertigoDsl.g:1296:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )? ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )* otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:1296:2: (otherlv_0= 'create' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )? ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )* otherlv_7= '}' )
            // InternalVertigoDsl.g:1297:3: otherlv_0= 'create' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )? ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:1305:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:1306:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1306:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:1307:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDtDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:1327:3: ( (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVertigoDsl.g:1328:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:1328:4: (lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:1329:5: lv_dtDefinitionStereotype_4_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_dtDefinitionStereotype_4_0=ruleDtDefinitionStereotype();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
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

            // InternalVertigoDsl.g:1346:3: ( (lv_dtDefinitionId_5_0= ruleDtDefinitionId ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVertigoDsl.g:1347:4: (lv_dtDefinitionId_5_0= ruleDtDefinitionId )
                    {
                    // InternalVertigoDsl.g:1347:4: (lv_dtDefinitionId_5_0= ruleDtDefinitionId )
                    // InternalVertigoDsl.g:1348:5: lv_dtDefinitionId_5_0= ruleDtDefinitionId
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdDtDefinitionIdParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_dtDefinitionId_5_0=ruleDtDefinitionId();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"dtDefinitionId",
                    						lv_dtDefinitionId_5_0,
                    						"io.vertigo.dsl.VertigoDsl.DtDefinitionId");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalVertigoDsl.g:1365:3: ( (lv_dtDefinitionFields_6_0= ruleDtDefinitionField ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==40) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVertigoDsl.g:1366:4: (lv_dtDefinitionFields_6_0= ruleDtDefinitionField )
            	    {
            	    // InternalVertigoDsl.g:1366:4: (lv_dtDefinitionFields_6_0= ruleDtDefinitionField )
            	    // InternalVertigoDsl.g:1367:5: lv_dtDefinitionFields_6_0= ruleDtDefinitionField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionFieldsDtDefinitionFieldParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_dtDefinitionFields_6_0=ruleDtDefinitionField();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDtDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dtDefinitionFields",
            	    						lv_dtDefinitionFields_6_0,
            	    						"io.vertigo.dsl.VertigoDsl.DtDefinitionField");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalVertigoDsl.g:1392:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:1392:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:1393:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:1399:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_labelA_28_0=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_labelB_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token lv_roleA_34_0=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_roleB_37_0=null;
        Token otherlv_38=null;
        Enumerator lv_navigabilityA_16_0 = null;

        Enumerator lv_navigabilityB_19_0 = null;

        Enumerator lv_multiplicityA_22_0 = null;

        Enumerator lv_multiplicityB_25_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1405:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' ) )
            // InternalVertigoDsl.g:1406:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            {
            // InternalVertigoDsl.g:1406:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}' )
            // InternalVertigoDsl.g:1407:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:1415:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:1416:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1416:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:1417:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_3=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:1437:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1438:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1439:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:1442:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1443:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=12;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalVertigoDsl.g:1444:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1444:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1445:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1445:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1446:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:1449:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1449:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1449:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1449:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,44,FOLLOW_11); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:1457:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1458:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1458:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1459:11: lv_fkFieldName_7_0= RULE_STRING
            	    {
            	    lv_fkFieldName_7_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_fkFieldName_7_0, grammarAccess.getAssociationAccess().getFkFieldNameSTRINGTerminalRuleCall_4_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"fkFieldName",
            	    												lv_fkFieldName_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:1481:4: ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1481:4: ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1482:5: {...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1482:108: ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:1483:6: ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:1486:9: ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:1486:10: {...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1486:19: (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:1486:20: otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,45,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_9=(Token)match(input,19,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:1494:9: ( (otherlv_10= RULE_ID ) )
            	    // InternalVertigoDsl.g:1495:10: (otherlv_10= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1495:10: (otherlv_10= RULE_ID )
            	    // InternalVertigoDsl.g:1496:11: otherlv_10= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    											newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionCrossReference_4_1_2_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:1513:4: ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1513:4: ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1514:5: {...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1514:108: ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:1515:6: ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:1518:9: ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:1518:10: {...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1518:19: (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:1518:20: otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,46,FOLLOW_11); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_12=(Token)match(input,19,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:1526:9: ( (otherlv_13= RULE_ID ) )
            	    // InternalVertigoDsl.g:1527:10: (otherlv_13= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1527:10: (otherlv_13= RULE_ID )
            	    // InternalVertigoDsl.g:1528:11: otherlv_13= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    											newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionCrossReference_4_2_2_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalVertigoDsl.g:1545:4: ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1545:4: ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1546:5: {...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1546:108: ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1547:6: ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:1550:9: ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1550:10: {...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1550:19: (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1550:20: otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) )
            	    {
            	    otherlv_14=(Token)match(input,47,FOLLOW_11); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_15=(Token)match(input,19,FOLLOW_26); 

            	    									newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:1558:9: ( (lv_navigabilityA_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1559:10: (lv_navigabilityA_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1559:10: (lv_navigabilityA_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1560:11: lv_navigabilityA_16_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityABooleanStringEnumRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_navigabilityA_16_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"navigabilityA",
            	    												lv_navigabilityA_16_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
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
            	case 5 :
            	    // InternalVertigoDsl.g:1583:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1583:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1584:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:1584:108: ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) )
            	    // InternalVertigoDsl.g:1585:6: ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:1588:9: ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) )
            	    // InternalVertigoDsl.g:1588:10: {...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1588:19: (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) )
            	    // InternalVertigoDsl.g:1588:20: otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) )
            	    {
            	    otherlv_17=(Token)match(input,48,FOLLOW_11); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_18=(Token)match(input,19,FOLLOW_26); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:1596:9: ( (lv_navigabilityB_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1597:10: (lv_navigabilityB_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1597:10: (lv_navigabilityB_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1598:11: lv_navigabilityB_19_0= ruleBooleanString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getNavigabilityBBooleanStringEnumRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_navigabilityB_19_0=ruleBooleanString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"navigabilityB",
            	    												lv_navigabilityB_19_0,
            	    												"io.vertigo.dsl.VertigoDsl.BooleanString");
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
            	case 6 :
            	    // InternalVertigoDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1622:5: {...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:1622:108: ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) )
            	    // InternalVertigoDsl.g:1623:6: ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:1626:9: ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) )
            	    // InternalVertigoDsl.g:1626:10: {...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1626:19: (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) )
            	    // InternalVertigoDsl.g:1626:20: otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) )
            	    {
            	    otherlv_20=(Token)match(input,49,FOLLOW_11); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_21=(Token)match(input,19,FOLLOW_35); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:1634:9: ( (lv_multiplicityA_22_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:1635:10: (lv_multiplicityA_22_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:1635:10: (lv_multiplicityA_22_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:1636:11: lv_multiplicityA_22_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityAMultiplicityStringEnumRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_multiplicityA_22_0=ruleMultiplicityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiplicityA",
            	    												lv_multiplicityA_22_0,
            	    												"io.vertigo.dsl.VertigoDsl.MultiplicityString");
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
            	case 7 :
            	    // InternalVertigoDsl.g:1659:4: ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1659:4: ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1660:5: {...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:1660:108: ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) )
            	    // InternalVertigoDsl.g:1661:6: ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:1664:9: ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) )
            	    // InternalVertigoDsl.g:1664:10: {...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1664:19: (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) )
            	    // InternalVertigoDsl.g:1664:20: otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) )
            	    {
            	    otherlv_23=(Token)match(input,50,FOLLOW_11); 

            	    									newLeafNode(otherlv_23, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_24=(Token)match(input,19,FOLLOW_35); 

            	    									newLeafNode(otherlv_24, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:1672:9: ( (lv_multiplicityB_25_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:1673:10: (lv_multiplicityB_25_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:1673:10: (lv_multiplicityB_25_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:1674:11: lv_multiplicityB_25_0= ruleMultiplicityString
            	    {

            	    											newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityBMultiplicityStringEnumRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_multiplicityB_25_0=ruleMultiplicityString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"multiplicityB",
            	    												lv_multiplicityB_25_0,
            	    												"io.vertigo.dsl.VertigoDsl.MultiplicityString");
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
            	case 8 :
            	    // InternalVertigoDsl.g:1697:4: ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1697:4: ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1698:5: {...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:1698:108: ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1699:6: ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:1702:9: ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1702:10: {...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1702:19: (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1702:20: otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) )
            	    {
            	    otherlv_26=(Token)match(input,51,FOLLOW_11); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_27=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:1710:9: ( (lv_labelA_28_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1711:10: (lv_labelA_28_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1711:10: (lv_labelA_28_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1712:11: lv_labelA_28_0= RULE_STRING
            	    {
            	    lv_labelA_28_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_labelA_28_0, grammarAccess.getAssociationAccess().getLabelASTRINGTerminalRuleCall_4_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"labelA",
            	    												lv_labelA_28_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalVertigoDsl.g:1734:4: ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1734:4: ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1735:5: {...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:1735:108: ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1736:6: ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:1739:9: ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1739:10: {...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1739:19: (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1739:20: otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) )
            	    {
            	    otherlv_29=(Token)match(input,52,FOLLOW_11); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_30=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:1747:9: ( (lv_labelB_31_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1748:10: (lv_labelB_31_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1748:10: (lv_labelB_31_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1749:11: lv_labelB_31_0= RULE_STRING
            	    {
            	    lv_labelB_31_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_labelB_31_0, grammarAccess.getAssociationAccess().getLabelBSTRINGTerminalRuleCall_4_8_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"labelB",
            	    												lv_labelB_31_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalVertigoDsl.g:1771:4: ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1771:4: ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1772:5: {...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:1772:108: ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1773:6: ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:1776:9: ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1776:10: {...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1776:19: (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1776:20: otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) )
            	    {
            	    otherlv_32=(Token)match(input,53,FOLLOW_11); 

            	    									newLeafNode(otherlv_32, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_33=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:1784:9: ( (lv_roleA_34_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1785:10: (lv_roleA_34_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1785:10: (lv_roleA_34_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1786:11: lv_roleA_34_0= RULE_STRING
            	    {
            	    lv_roleA_34_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_roleA_34_0, grammarAccess.getAssociationAccess().getRoleASTRINGTerminalRuleCall_4_9_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"roleA",
            	    												lv_roleA_34_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalVertigoDsl.g:1808:4: ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1808:4: ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:1809:5: {...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:1809:109: ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:1810:6: ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:1813:9: ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:1813:10: {...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:1813:19: (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:1813:20: otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) )
            	    {
            	    otherlv_35=(Token)match(input,54,FOLLOW_11); 

            	    									newLeafNode(otherlv_35, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_36=(Token)match(input,19,FOLLOW_12); 

            	    									newLeafNode(otherlv_36, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:1821:9: ( (lv_roleB_37_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1822:10: (lv_roleB_37_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1822:10: (lv_roleB_37_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1823:11: lv_roleB_37_0= RULE_STRING
            	    {
            	    lv_roleB_37_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    											newLeafNode(lv_roleB_37_0, grammarAccess.getAssociationAccess().getRoleBSTRINGTerminalRuleCall_4_10_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"roleB",
            	    												lv_roleB_37_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canLeave(grammarAccess.getAssociationAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				

            }

            otherlv_38=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "ruleDataType"
    // InternalVertigoDsl.g:1861:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
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
            // InternalVertigoDsl.g:1867:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:1868:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:1868:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt17=1;
                }
                break;
            case 56:
                {
                alt17=2;
                }
                break;
            case 57:
                {
                alt17=3;
                }
                break;
            case 58:
                {
                alt17=4;
                }
                break;
            case 59:
                {
                alt17=5;
                }
                break;
            case 60:
                {
                alt17=6;
                }
                break;
            case 61:
                {
                alt17=7;
                }
                break;
            case 62:
                {
                alt17=8;
                }
                break;
            case 63:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalVertigoDsl.g:1869:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:1869:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:1870:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1877:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:1877:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:1878:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:1885:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:1885:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:1886:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:1893:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:1893:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:1894:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:1901:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:1901:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:1902:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:1909:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:1909:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:1910:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:1917:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:1917:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:1918:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:1925:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:1925:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:1926:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:1933:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:1933:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:1934:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,63,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1944:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1950:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:1951:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:1951:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==64) ) {
                alt18=1;
            }
            else if ( (LA18_0==65) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalVertigoDsl.g:1952:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:1952:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:1953:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1960:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:1960:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:1961:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1971:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1977:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) )
            // InternalVertigoDsl.g:1978:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            {
            // InternalVertigoDsl.g:1978:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==66) ) {
                alt19=1;
            }
            else if ( (LA19_0==67) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalVertigoDsl.g:1979:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:1979:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:1980:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1987:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:1987:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:1988:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

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
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\1\21\uffff";
    static final String dfa_3s = "\1\15\1\uffff\10\0\10\uffff";
    static final String dfa_4s = "\1\43\1\uffff\10\0\10\uffff";
    static final String dfa_5s = "\1\uffff\1\11\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_6s = "\2\uffff\1\1\1\5\1\2\1\7\1\4\1\3\1\0\1\6\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\uffff\1\2\6\uffff\1\11\4\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7\1\10",
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
            return "()+ loopback of 618:5: ( ({...}? => ( ({...}? => (otherlv_1= 'create' otherlv_2= 'Domain' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' otherlv_5= 'dataType' otherlv_6= ':' ( (lv_dataType_7_0= ruleDataType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'formatter' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'storeType' otherlv_12= ':' ( (lv_storeType_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'indexType' otherlv_15= ':' ( (lv_indexType_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'constraint' otherlv_18= ':' otherlv_19= '[' ( (otherlv_20= RULE_ID ) ) ( (otherlv_21= ',' )+ ( (otherlv_22= RULE_ID ) ) )* otherlv_23= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'multiple' otherlv_25= ':' ( (lv_multiple_26_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'unit' otherlv_28= ':' ( (lv_unit_29_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 2) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 5) ) {s = 15;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 4) ) {s = 14;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 7) ) {s = 17;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 3) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\15\uffff";
    static final String dfa_9s = "\1\26\14\uffff";
    static final String dfa_10s = "\1\66\14\uffff";
    static final String dfa_11s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_12s = "\1\0\14\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\25\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 1443:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'dtDefinitionA' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'dtDefinitionB' otherlv_12= ':' ( (otherlv_13= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'navigabilityA' otherlv_15= ':' ( (lv_navigabilityA_16_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityB' otherlv_18= ':' ( (lv_navigabilityB_19_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'multiplicityA' otherlv_21= ':' ( (lv_multiplicityA_22_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'multiplicityB' otherlv_24= ':' ( (lv_multiplicityB_25_0= ruleMultiplicityString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'labelA' otherlv_27= ':' ( (lv_labelA_28_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'labelB' otherlv_30= ':' ( (lv_labelB_31_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'roleA' otherlv_33= ':' ( (lv_roleA_34_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'roleB' otherlv_36= ':' ( (lv_roleB_37_0= RULE_STRING ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==22) ) {s = 1;}

                        else if ( LA16_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA16_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA16_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA16_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA16_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA16_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA16_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA16_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA16_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA16_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA16_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000C7840B002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000C7840A002L});
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
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFF80000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C78408002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007000400010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000038000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000018000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x007FF00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x007FF00000400000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});

}
