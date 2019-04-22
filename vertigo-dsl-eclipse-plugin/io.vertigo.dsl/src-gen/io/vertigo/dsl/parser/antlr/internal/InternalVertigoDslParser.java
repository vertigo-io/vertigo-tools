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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'declare'", "'Domain'", "'DtDefinition'", "'create'", "'Constraint'", "'{'", "'className'", "':'", "'args'", "'msg'", "'}'", "'FileInfo'", "'storeName'", "'Formatter'", "'alter'", "'dataType'", "'formatter'", "'storeType'", "'indexType'", "'constraint'", "'['", "','", "']'", "'multiple'", "'unit'", "'domain'", "'label'", "'required'", "'persistent'", "'expression'", "'id'", "'field'", "'computed'", "'stereotype'", "'displayField'", "'sortField'", "'Association'", "'fkFieldName'", "'dtDefinitionA'", "'dtDefinitionB'", "'navigabilityA'", "'navigabilityB'", "'multiplicityA'", "'multiplicityB'", "'labelA'", "'labelB'", "'roleA'", "'roleB'", "'type'", "'inOut'", "'attribute'", "'Task'", "'request'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'LocalDate'", "'Instant'", "'BigDecimal'", "'Long'", "'DataStream'", "'\"true\"'", "'\"false\"'", "'\"0..1\"'", "'\"0..*\"'", "'\"in\"'", "'\"out\"'"
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
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

                if ( (LA3_0==13||LA3_0==16||LA3_0==23||LA3_0==27||(LA3_0>=30 && LA3_0<=32)||(LA3_0>=36 && LA3_0<=37)) ) {
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
    // InternalVertigoDsl.g:158:1: ruleElement returns [EObject current=null] : (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition ) ;
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
            // InternalVertigoDsl.g:164:2: ( (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition ) )
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )
            {
            // InternalVertigoDsl.g:165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )
            int alt4=9;
            alt4 = dfa4.predict(input);
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
                    // InternalVertigoDsl.g:220:3: this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition
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
                    // InternalVertigoDsl.g:229:3: this_Association_7= ruleAssociation
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
                    // InternalVertigoDsl.g:238:3: this_TaskDefinition_8= ruleTaskDefinition
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
    // InternalVertigoDsl.g:250:1: entryRuleDeclaredDomain returns [EObject current=null] : iv_ruleDeclaredDomain= ruleDeclaredDomain EOF ;
    public final EObject entryRuleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDomain = null;


        try {
            // InternalVertigoDsl.g:250:55: (iv_ruleDeclaredDomain= ruleDeclaredDomain EOF )
            // InternalVertigoDsl.g:251:2: iv_ruleDeclaredDomain= ruleDeclaredDomain EOF
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
    // InternalVertigoDsl.g:257:1: ruleDeclaredDomain returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:263:2: ( (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:264:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:264:2: (otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:265:3: otherlv_0= 'declare' otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDomainAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDomainAccess().getDomainKeyword_1());
            		
            // InternalVertigoDsl.g:273:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:274:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:274:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:275:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:295:1: entryRuleDeclaredDtDefinition returns [EObject current=null] : iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF ;
    public final EObject entryRuleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredDtDefinition = null;


        try {
            // InternalVertigoDsl.g:295:61: (iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF )
            // InternalVertigoDsl.g:296:2: iv_ruleDeclaredDtDefinition= ruleDeclaredDtDefinition EOF
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
    // InternalVertigoDsl.g:302:1: ruleDeclaredDtDefinition returns [EObject current=null] : (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDeclaredDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:308:2: ( (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalVertigoDsl.g:309:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalVertigoDsl.g:309:2: (otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalVertigoDsl.g:310:3: otherlv_0= 'declare' otherlv_1= 'DtDefinition' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclaredDtDefinitionAccess().getDeclareKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclaredDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:318:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:319:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:319:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:320:5: lv_name_2_0= RULE_ID
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
    // InternalVertigoDsl.g:340:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalVertigoDsl.g:340:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalVertigoDsl.g:341:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalVertigoDsl.g:347:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) ;
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
            // InternalVertigoDsl.g:353:2: ( (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' ) )
            // InternalVertigoDsl.g:354:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:354:2: (otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}' )
            // InternalVertigoDsl.g:355:3: otherlv_0= 'create' otherlv_1= 'Constraint' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getConstraintKeyword_1());
            		
            // InternalVertigoDsl.g:363:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:364:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:364:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:365:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getConstraintAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:393:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:394:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:394:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:395:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            // InternalVertigoDsl.g:411:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVertigoDsl.g:412:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getConstraintAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:420:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:421:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:421:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:422:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            // InternalVertigoDsl.g:439:3: (otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVertigoDsl.g:440:4: otherlv_10= 'msg' otherlv_11= ':' ( (lv_msg_12_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getConstraintAccess().getMsgKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getColonKeyword_8_1());
                    			
                    // InternalVertigoDsl.g:448:4: ( (lv_msg_12_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:449:5: (lv_msg_12_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:449:5: (lv_msg_12_0= RULE_STRING )
                    // InternalVertigoDsl.g:450:6: lv_msg_12_0= RULE_STRING
                    {
                    lv_msg_12_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_13=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:475:1: entryRuleFileInfo returns [EObject current=null] : iv_ruleFileInfo= ruleFileInfo EOF ;
    public final EObject entryRuleFileInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileInfo = null;


        try {
            // InternalVertigoDsl.g:475:49: (iv_ruleFileInfo= ruleFileInfo EOF )
            // InternalVertigoDsl.g:476:2: iv_ruleFileInfo= ruleFileInfo EOF
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
    // InternalVertigoDsl.g:482:1: ruleFileInfo returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // InternalVertigoDsl.g:488:2: ( (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalVertigoDsl.g:489:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalVertigoDsl.g:489:2: (otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalVertigoDsl.g:490:3: otherlv_0= 'create' otherlv_1= 'FileInfo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'storeName' otherlv_5= ':' ( (lv_storeName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFileInfoAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFileInfoAccess().getFileInfoKeyword_1());
            		
            // InternalVertigoDsl.g:498:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:499:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:499:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:500:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getFileInfoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFileInfoAccess().getStoreNameKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getFileInfoAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:528:3: ( (lv_storeName_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:529:4: (lv_storeName_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:529:4: (lv_storeName_6_0= RULE_STRING )
            // InternalVertigoDsl.g:530:5: lv_storeName_6_0= RULE_STRING
            {
            lv_storeName_6_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:554:1: entryRuleFormatter returns [EObject current=null] : iv_ruleFormatter= ruleFormatter EOF ;
    public final EObject entryRuleFormatter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatter = null;


        try {
            // InternalVertigoDsl.g:554:50: (iv_ruleFormatter= ruleFormatter EOF )
            // InternalVertigoDsl.g:555:2: iv_ruleFormatter= ruleFormatter EOF
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
    // InternalVertigoDsl.g:561:1: ruleFormatter returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalVertigoDsl.g:567:2: ( (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalVertigoDsl.g:568:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:568:2: (otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalVertigoDsl.g:569:3: otherlv_0= 'create' otherlv_1= 'Formatter' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_className_6_0= RULE_STRING ) ) (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFormatterAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFormatterAccess().getFormatterKeyword_1());
            		
            // InternalVertigoDsl.g:577:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:578:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:578:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:579:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFormatterAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFormatterAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getFormatterAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:607:3: ( (lv_className_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:608:4: (lv_className_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:608:4: (lv_className_6_0= RULE_STRING )
            // InternalVertigoDsl.g:609:5: lv_className_6_0= RULE_STRING
            {
            lv_className_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            // InternalVertigoDsl.g:625:3: (otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVertigoDsl.g:626:4: otherlv_7= 'args' otherlv_8= ':' ( (lv_args_9_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getFormatterAccess().getArgsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getFormatterAccess().getColonKeyword_7_1());
                    			
                    // InternalVertigoDsl.g:634:4: ( (lv_args_9_0= RULE_STRING ) )
                    // InternalVertigoDsl.g:635:5: (lv_args_9_0= RULE_STRING )
                    {
                    // InternalVertigoDsl.g:635:5: (lv_args_9_0= RULE_STRING )
                    // InternalVertigoDsl.g:636:6: lv_args_9_0= RULE_STRING
                    {
                    lv_args_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:661:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // InternalVertigoDsl.g:661:47: (iv_ruleDomain= ruleDomain EOF )
            // InternalVertigoDsl.g:662:2: iv_ruleDomain= ruleDomain EOF
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
    // InternalVertigoDsl.g:668:1: ruleDomain returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalVertigoDsl.g:674:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalVertigoDsl.g:675:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalVertigoDsl.g:675:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:676:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:676:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:677:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup());
            			
            // InternalVertigoDsl.g:680:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:681:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:681:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=3;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalVertigoDsl.g:682:3: ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:682:3: ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) )
            	    // InternalVertigoDsl.g:683:4: {...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalVertigoDsl.g:683:100: ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) )
            	    // InternalVertigoDsl.g:684:5: ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalVertigoDsl.g:687:8: ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) )
            	    // InternalVertigoDsl.g:687:9: {...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:687:18: ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )
            	    // InternalVertigoDsl.g:687:19: (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
            	    {
            	    // InternalVertigoDsl.g:687:19: (otherlv_1= 'create' | otherlv_2= 'alter' )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==16) ) {
            	        alt8=1;
            	    }
            	    else if ( (LA8_0==27) ) {
            	        alt8=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalVertigoDsl.g:688:9: otherlv_1= 'create'
            	            {
            	            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            	            									newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getCreateKeyword_0_0_0());
            	            								

            	            }
            	            break;
            	        case 2 :
            	            // InternalVertigoDsl.g:693:9: otherlv_2= 'alter'
            	            {
            	            otherlv_2=(Token)match(input,27,FOLLOW_7); 

            	            									newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getAlterKeyword_0_0_1());
            	            								

            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDomainKeyword_0_1());
            	    							
            	    // InternalVertigoDsl.g:702:8: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalVertigoDsl.g:703:9: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:703:9: (lv_name_4_0= RULE_ID )
            	    // InternalVertigoDsl.g:704:10: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            	    otherlv_5=(Token)match(input,18,FOLLOW_21); 

            	    								newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_0_3());
            	    							
            	    otherlv_6=(Token)match(input,28,FOLLOW_12); 

            	    								newLeafNode(otherlv_6, grammarAccess.getDomainAccess().getDataTypeKeyword_0_4());
            	    							
            	    otherlv_7=(Token)match(input,20,FOLLOW_22); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getColonKeyword_0_5());
            	    							
            	    // InternalVertigoDsl.g:732:8: ( (lv_dataType_8_0= ruleDataType ) )
            	    // InternalVertigoDsl.g:733:9: (lv_dataType_8_0= ruleDataType )
            	    {
            	    // InternalVertigoDsl.g:733:9: (lv_dataType_8_0= ruleDataType )
            	    // InternalVertigoDsl.g:734:10: lv_dataType_8_0= ruleDataType
            	    {

            	    										newCompositeNode(grammarAccess.getDomainAccess().getDataTypeDataTypeEnumRuleCall_0_6_0());
            	    									
            	    pushFollow(FOLLOW_23);
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

            	    otherlv_9=(Token)match(input,29,FOLLOW_12); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDomainAccess().getFormatterKeyword_0_7());
            	    							
            	    otherlv_10=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_10, grammarAccess.getDomainAccess().getColonKeyword_0_8());
            	    							
            	    // InternalVertigoDsl.g:759:8: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:760:9: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:760:9: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:761:10: otherlv_11= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDomainRule());
            	    										}
            	    									
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_24); 

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
            	    // InternalVertigoDsl.g:778:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:778:3: ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) )
            	    // InternalVertigoDsl.g:779:4: {...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalVertigoDsl.g:779:100: ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) )
            	    // InternalVertigoDsl.g:780:5: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalVertigoDsl.g:783:8: ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) )
            	    // InternalVertigoDsl.g:783:9: {...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    }
            	    // InternalVertigoDsl.g:783:18: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' )
            	    // InternalVertigoDsl.g:783:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}'
            	    {
            	    // InternalVertigoDsl.g:783:19: ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            	    // InternalVertigoDsl.g:784:9: ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    {
            	    // InternalVertigoDsl.g:784:9: ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) )
            	    // InternalVertigoDsl.g:785:10: ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* )
            	    {
            	     
            	    									  getUnorderedGroupHelper().enter(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    									
            	    // InternalVertigoDsl.g:788:10: ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* )
            	    // InternalVertigoDsl.g:789:11: ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )*
            	    {
            	    // InternalVertigoDsl.g:789:11: ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )*
            	    loop11:
            	    do {
            	        int alt11=6;
            	        int LA11_0 = input.LA(1);

            	        if ( LA11_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0) ) {
            	            alt11=1;
            	        }
            	        else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1) ) {
            	            alt11=2;
            	        }
            	        else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2) ) {
            	            alt11=3;
            	        }
            	        else if ( LA11_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3) ) {
            	            alt11=4;
            	        }
            	        else if ( LA11_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4) ) {
            	            alt11=5;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalVertigoDsl.g:790:9: ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:790:9: ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:791:10: {...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0)");
            	    	    }
            	    	    // InternalVertigoDsl.g:791:110: ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:792:11: ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 0);
            	    	    										
            	    	    // InternalVertigoDsl.g:795:14: ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:795:15: {...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:795:24: (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:795:25: otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,30,FOLLOW_12); 

            	    	    														newLeafNode(otherlv_13, grammarAccess.getDomainAccess().getStoreTypeKeyword_1_0_0_0());
            	    	    													
            	    	    otherlv_14=(Token)match(input,20,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_14, grammarAccess.getDomainAccess().getColonKeyword_1_0_0_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:803:14: ( (lv_storeType_15_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:804:15: (lv_storeType_15_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:804:15: (lv_storeType_15_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:805:16: lv_storeType_15_0= RULE_STRING
            	    	    {
            	    	    lv_storeType_15_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    	    																newLeafNode(lv_storeType_15_0, grammarAccess.getDomainAccess().getStoreTypeSTRINGTerminalRuleCall_1_0_0_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"storeType",
            	    	    																	lv_storeType_15_0,
            	    	    																	"org.eclipse.xtext.common.Terminals.STRING");
            	    	    															

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
            	    	    // InternalVertigoDsl.g:827:9: ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:827:9: ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:828:10: {...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1)");
            	    	    }
            	    	    // InternalVertigoDsl.g:828:110: ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:829:11: ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 1);
            	    	    										
            	    	    // InternalVertigoDsl.g:832:14: ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:832:15: {...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:832:24: (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:832:25: otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_16=(Token)match(input,31,FOLLOW_12); 

            	    	    														newLeafNode(otherlv_16, grammarAccess.getDomainAccess().getIndexTypeKeyword_1_0_1_0());
            	    	    													
            	    	    otherlv_17=(Token)match(input,20,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_17, grammarAccess.getDomainAccess().getColonKeyword_1_0_1_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:840:14: ( (lv_indexType_18_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:841:15: (lv_indexType_18_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:841:15: (lv_indexType_18_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:842:16: lv_indexType_18_0= RULE_STRING
            	    	    {
            	    	    lv_indexType_18_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    	    																newLeafNode(lv_indexType_18_0, grammarAccess.getDomainAccess().getIndexTypeSTRINGTerminalRuleCall_1_0_1_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"indexType",
            	    	    																	lv_indexType_18_0,
            	    	    																	"org.eclipse.xtext.common.Terminals.STRING");
            	    	    															

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
            	    	    // InternalVertigoDsl.g:864:9: ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:864:9: ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) )
            	    	    // InternalVertigoDsl.g:865:10: {...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2)");
            	    	    }
            	    	    // InternalVertigoDsl.g:865:110: ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) )
            	    	    // InternalVertigoDsl.g:866:11: ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 2);
            	    	    										
            	    	    // InternalVertigoDsl.g:869:14: ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) )
            	    	    // InternalVertigoDsl.g:869:15: {...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:869:24: (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' )
            	    	    // InternalVertigoDsl.g:869:25: otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']'
            	    	    {
            	    	    otherlv_19=(Token)match(input,32,FOLLOW_12); 

            	    	    														newLeafNode(otherlv_19, grammarAccess.getDomainAccess().getConstraintKeyword_1_0_2_0());
            	    	    													
            	    	    otherlv_20=(Token)match(input,20,FOLLOW_26); 

            	    	    														newLeafNode(otherlv_20, grammarAccess.getDomainAccess().getColonKeyword_1_0_2_1());
            	    	    													
            	    	    otherlv_21=(Token)match(input,33,FOLLOW_3); 

            	    	    														newLeafNode(otherlv_21, grammarAccess.getDomainAccess().getLeftSquareBracketKeyword_1_0_2_2());
            	    	    													
            	    	    // InternalVertigoDsl.g:881:14: ( (otherlv_22= RULE_ID ) )
            	    	    // InternalVertigoDsl.g:882:15: (otherlv_22= RULE_ID )
            	    	    {
            	    	    // InternalVertigoDsl.g:882:15: (otherlv_22= RULE_ID )
            	    	    // InternalVertigoDsl.g:883:16: otherlv_22= RULE_ID
            	    	    {

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    															
            	    	    otherlv_22=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    	    																newLeafNode(otherlv_22, grammarAccess.getDomainAccess().getConstraintConstraintCrossReference_1_0_2_3_0());
            	    	    															

            	    	    }


            	    	    }

            	    	    // InternalVertigoDsl.g:894:14: ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )*
            	    	    loop10:
            	    	    do {
            	    	        int alt10=2;
            	    	        int LA10_0 = input.LA(1);

            	    	        if ( (LA10_0==34) ) {
            	    	            alt10=1;
            	    	        }


            	    	        switch (alt10) {
            	    	    	case 1 :
            	    	    	    // InternalVertigoDsl.g:895:15: (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) )
            	    	    	    {
            	    	    	    // InternalVertigoDsl.g:895:15: (otherlv_23= ',' )+
            	    	    	    int cnt9=0;
            	    	    	    loop9:
            	    	    	    do {
            	    	    	        int alt9=2;
            	    	    	        int LA9_0 = input.LA(1);

            	    	    	        if ( (LA9_0==34) ) {
            	    	    	            alt9=1;
            	    	    	        }


            	    	    	        switch (alt9) {
            	    	    	    	case 1 :
            	    	    	    	    // InternalVertigoDsl.g:896:16: otherlv_23= ','
            	    	    	    	    {
            	    	    	    	    otherlv_23=(Token)match(input,34,FOLLOW_28); 

            	    	    	    	    																newLeafNode(otherlv_23, grammarAccess.getDomainAccess().getCommaKeyword_1_0_2_4_0());
            	    	    	    	    															

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

            	    	    	    // InternalVertigoDsl.g:901:15: ( (otherlv_24= RULE_ID ) )
            	    	    	    // InternalVertigoDsl.g:902:16: (otherlv_24= RULE_ID )
            	    	    	    {
            	    	    	    // InternalVertigoDsl.g:902:16: (otherlv_24= RULE_ID )
            	    	    	    // InternalVertigoDsl.g:903:17: otherlv_24= RULE_ID
            	    	    	    {

            	    	    	    																	if (current==null) {
            	    	    	    																		current = createModelElement(grammarAccess.getDomainRule());
            	    	    	    																	}
            	    	    	    																
            	    	    	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    	    	    																	newLeafNode(otherlv_24, grammarAccess.getDomainAccess().getConstraintsConstraintCrossReference_1_0_2_4_1_0());
            	    	    	    																

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop10;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_25=(Token)match(input,35,FOLLOW_25); 

            	    	    														newLeafNode(otherlv_25, grammarAccess.getDomainAccess().getRightSquareBracketKeyword_1_0_2_5());
            	    	    													

            	    	    }


            	    	    }

            	    	     
            	    	    											getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalVertigoDsl.g:925:9: ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:925:9: ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:926:10: {...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3)");
            	    	    }
            	    	    // InternalVertigoDsl.g:926:110: ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) )
            	    	    // InternalVertigoDsl.g:927:11: ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 3);
            	    	    										
            	    	    // InternalVertigoDsl.g:930:14: ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) )
            	    	    // InternalVertigoDsl.g:930:15: {...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:930:24: (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) )
            	    	    // InternalVertigoDsl.g:930:25: otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,36,FOLLOW_12); 

            	    	    														newLeafNode(otherlv_26, grammarAccess.getDomainAccess().getMultipleKeyword_1_0_3_0());
            	    	    													
            	    	    otherlv_27=(Token)match(input,20,FOLLOW_29); 

            	    	    														newLeafNode(otherlv_27, grammarAccess.getDomainAccess().getColonKeyword_1_0_3_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:938:14: ( (lv_multiple_28_0= ruleBooleanString ) )
            	    	    // InternalVertigoDsl.g:939:15: (lv_multiple_28_0= ruleBooleanString )
            	    	    {
            	    	    // InternalVertigoDsl.g:939:15: (lv_multiple_28_0= ruleBooleanString )
            	    	    // InternalVertigoDsl.g:940:16: lv_multiple_28_0= ruleBooleanString
            	    	    {

            	    	    																newCompositeNode(grammarAccess.getDomainAccess().getMultipleBooleanStringEnumRuleCall_1_0_3_2_0());
            	    	    															
            	    	    pushFollow(FOLLOW_25);
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
            	    	    // InternalVertigoDsl.g:963:9: ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) )
            	    	    {
            	    	    // InternalVertigoDsl.g:963:9: ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) )
            	    	    // InternalVertigoDsl.g:964:10: {...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4)");
            	    	    }
            	    	    // InternalVertigoDsl.g:964:110: ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) )
            	    	    // InternalVertigoDsl.g:965:11: ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) )
            	    	    {

            	    	    											getUnorderedGroupHelper().select(grammarAccess.getDomainAccess().getUnorderedGroup_1_0(), 4);
            	    	    										
            	    	    // InternalVertigoDsl.g:968:14: ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) )
            	    	    // InternalVertigoDsl.g:968:15: {...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDomain", "true");
            	    	    }
            	    	    // InternalVertigoDsl.g:968:24: (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) )
            	    	    // InternalVertigoDsl.g:968:25: otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,37,FOLLOW_12); 

            	    	    														newLeafNode(otherlv_29, grammarAccess.getDomainAccess().getUnitKeyword_1_0_4_0());
            	    	    													
            	    	    otherlv_30=(Token)match(input,20,FOLLOW_13); 

            	    	    														newLeafNode(otherlv_30, grammarAccess.getDomainAccess().getColonKeyword_1_0_4_1());
            	    	    													
            	    	    // InternalVertigoDsl.g:976:14: ( (lv_unit_31_0= RULE_STRING ) )
            	    	    // InternalVertigoDsl.g:977:15: (lv_unit_31_0= RULE_STRING )
            	    	    {
            	    	    // InternalVertigoDsl.g:977:15: (lv_unit_31_0= RULE_STRING )
            	    	    // InternalVertigoDsl.g:978:16: lv_unit_31_0= RULE_STRING
            	    	    {
            	    	    lv_unit_31_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    	    																newLeafNode(lv_unit_31_0, grammarAccess.getDomainAccess().getUnitSTRINGTerminalRuleCall_1_0_4_2_0());
            	    	    															

            	    	    																if (current==null) {
            	    	    																	current = createModelElement(grammarAccess.getDomainRule());
            	    	    																}
            	    	    																setWithLastConsumed(
            	    	    																	current,
            	    	    																	"unit",
            	    	    																	lv_unit_31_0,
            	    	    																	"org.eclipse.xtext.common.Terminals.STRING");
            	    	    															

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
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    									  getUnorderedGroupHelper().leave(grammarAccess.getDomainAccess().getUnorderedGroup_1_0());
            	    									

            	    }

            	    otherlv_32=(Token)match(input,23,FOLLOW_24); 

            	    								newLeafNode(otherlv_32, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_1_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDomainAccess().getUnorderedGroup());
            	    				

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


    // $ANTLR start "entryRuleDtDefinitionIdString"
    // InternalVertigoDsl.g:1028:1: entryRuleDtDefinitionIdString returns [EObject current=null] : iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF ;
    public final EObject entryRuleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdString = null;


        try {
            // InternalVertigoDsl.g:1028:61: (iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF )
            // InternalVertigoDsl.g:1029:2: iv_ruleDtDefinitionIdString= ruleDtDefinitionIdString EOF
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
    // InternalVertigoDsl.g:1035:1: ruleDtDefinitionIdString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleDtDefinitionIdString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1041:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // InternalVertigoDsl.g:1042:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // InternalVertigoDsl.g:1042:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // InternalVertigoDsl.g:1043:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1047:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1048:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1048:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1049:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1052:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1053:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1053:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVertigoDsl.g:1054:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1054:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1055:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1055:117: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1056:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1059:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1059:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1059:19: (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1059:20: otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionIdStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1067:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalVertigoDsl.g:1068:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1068:10: (otherlv_4= RULE_ID )
            	    // InternalVertigoDsl.g:1069:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionIdStringRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    											newLeafNode(otherlv_4, grammarAccess.getDtDefinitionIdStringAccess().getDomainTypeDomainTypeCrossReference_1_0_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1080:9: (otherlv_5= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==34) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1081:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,34,FOLLOW_32); 

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
            	    // InternalVertigoDsl.g:1092:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1092:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1093:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1093:117: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1094:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionIdStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1097:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1097:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionIdString", "true");
            	    }
            	    // InternalVertigoDsl.g:1097:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1097:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionIdStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionIdStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1105:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1106:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1106:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1107:11: lv_label_8_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1123:9: (otherlv_9= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==34) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1124:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,34,FOLLOW_32); 

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

            otherlv_10=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1151:1: entryRuleDtDefinitionDataFieldString returns [EObject current=null] : iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF ;
    public final EObject entryRuleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataFieldString = null;


        try {
            // InternalVertigoDsl.g:1151:68: (iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF )
            // InternalVertigoDsl.g:1152:2: iv_ruleDtDefinitionDataFieldString= ruleDtDefinitionDataFieldString EOF
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
    // InternalVertigoDsl.g:1158:1: ruleDtDefinitionDataFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) ;
    public final EObject ruleDtDefinitionDataFieldString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
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
        Enumerator lv_required_12_0 = null;

        Enumerator lv_persistent_16_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1164:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' ) )
            // InternalVertigoDsl.g:1165:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            {
            // InternalVertigoDsl.g:1165:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}' )
            // InternalVertigoDsl.g:1166:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1170:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1171:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1171:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1172:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1175:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1176:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1176:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=5;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
                    alt20=4;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVertigoDsl.g:1177:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1177:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1178:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1178:124: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1179:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1182:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1182:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1182:19: (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1182:20: otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1190:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalVertigoDsl.g:1191:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1191:10: (otherlv_4= RULE_ID )
            	    // InternalVertigoDsl.g:1192:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionDataFieldStringRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    											newLeafNode(otherlv_4, grammarAccess.getDtDefinitionDataFieldStringAccess().getDomainTypeDomainTypeCrossReference_1_0_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1203:9: (otherlv_5= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==34) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1204:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,34,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1215:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1215:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1216:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1216:124: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1217:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1220:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1220:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1220:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1220:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionDataFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1228:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1229:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1229:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1230:11: lv_label_8_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1246:9: (otherlv_9= ',' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==34) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1247:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,34,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1258:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1258:4: ({...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1259:5: {...}? => ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1259:124: ( ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1260:6: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1263:9: ({...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1263:10: {...}? => (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1263:19: (otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1263:20: otherlv_10= 'required' otherlv_11= ':' ( (lv_required_12_0= ruleBooleanString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,40,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionDataFieldStringAccess().getRequiredKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,20,FOLLOW_29); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1271:9: ( (lv_required_12_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1272:10: (lv_required_12_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1272:10: (lv_required_12_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1273:11: lv_required_12_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:1290:9: (otherlv_13= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==34) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1291:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,34,FOLLOW_35); 

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
            	    // InternalVertigoDsl.g:1302:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1302:4: ({...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1303:5: {...}? => ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalVertigoDsl.g:1303:124: ( ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1304:6: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionDataFieldStringAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalVertigoDsl.g:1307:9: ({...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? ) )
            	    // InternalVertigoDsl.g:1307:10: {...}? => (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionDataFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1307:19: (otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )? )
            	    // InternalVertigoDsl.g:1307:20: otherlv_14= 'persistent' otherlv_15= ':' ( (lv_persistent_16_0= ruleBooleanString ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,41,FOLLOW_12); 

            	    									newLeafNode(otherlv_14, grammarAccess.getDtDefinitionDataFieldStringAccess().getPersistentKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,20,FOLLOW_29); 

            	    									newLeafNode(otherlv_15, grammarAccess.getDtDefinitionDataFieldStringAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalVertigoDsl.g:1315:9: ( (lv_persistent_16_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:1316:10: (lv_persistent_16_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:1316:10: (lv_persistent_16_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:1317:11: lv_persistent_16_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:1334:9: (otherlv_17= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==34) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1335:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,34,FOLLOW_35); 

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

            otherlv_18=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1362:1: entryRuleDtDefinitionComputedFieldString returns [EObject current=null] : iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF ;
    public final EObject entryRuleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedFieldString = null;


        try {
            // InternalVertigoDsl.g:1362:72: (iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF )
            // InternalVertigoDsl.g:1363:2: iv_ruleDtDefinitionComputedFieldString= ruleDtDefinitionComputedFieldString EOF
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
    // InternalVertigoDsl.g:1369:1: ruleDtDefinitionComputedFieldString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDtDefinitionComputedFieldString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
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


        	enterRule();

        try {
            // InternalVertigoDsl.g:1375:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:1376:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:1376:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:1377:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:1381:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:1382:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:1382:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:1383:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:1386:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:1387:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:1387:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalVertigoDsl.g:1388:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1388:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1389:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:1389:128: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1390:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:1393:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:1393:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1393:19: (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:1393:20: otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:1401:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalVertigoDsl.g:1402:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:1402:10: (otherlv_4= RULE_ID )
            	    // InternalVertigoDsl.g:1403:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDtDefinitionComputedFieldStringRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

            	    											newLeafNode(otherlv_4, grammarAccess.getDtDefinitionComputedFieldStringAccess().getDomainTypeDomainTypeCrossReference_1_0_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1414:9: (otherlv_5= ',' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==34) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1415:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,34,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1426:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1426:4: ({...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1427:5: {...}? => ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:1427:128: ( ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1428:6: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:1431:9: ({...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:1431:10: {...}? => (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1431:19: (otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:1431:20: otherlv_6= 'label' otherlv_7= ':' ( (lv_label_8_0= RULE_STRING ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getDtDefinitionComputedFieldStringAccess().getLabelKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:1439:9: ( (lv_label_8_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1440:10: (lv_label_8_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1440:10: (lv_label_8_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1441:11: lv_label_8_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1457:9: (otherlv_9= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==34) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1458:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,34,FOLLOW_38); 

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
            	    // InternalVertigoDsl.g:1469:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:1469:4: ({...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:1470:5: {...}? => ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:1470:128: ( ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:1471:6: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionComputedFieldStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:1474:9: ({...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:1474:10: {...}? => (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinitionComputedFieldString", "true");
            	    }
            	    // InternalVertigoDsl.g:1474:19: (otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:1474:20: otherlv_10= 'expression' otherlv_11= ':' ( (lv_expressionString_12_0= RULE_STRING ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,42,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDtDefinitionComputedFieldStringAccess().getExpressionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDtDefinitionComputedFieldStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:1482:9: ( (lv_expressionString_12_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:1483:10: (lv_expressionString_12_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:1483:10: (lv_expressionString_12_0= RULE_STRING )
            	    // InternalVertigoDsl.g:1484:11: lv_expressionString_12_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:1500:9: (otherlv_13= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==34) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalVertigoDsl.g:1501:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,34,FOLLOW_38); 

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

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1528:1: entryRuleDtDefinitionIdField returns [EObject current=null] : iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF ;
    public final EObject entryRuleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionIdField = null;


        try {
            // InternalVertigoDsl.g:1528:60: (iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF )
            // InternalVertigoDsl.g:1529:2: iv_ruleDtDefinitionIdField= ruleDtDefinitionIdField EOF
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
    // InternalVertigoDsl.g:1535:1: ruleDtDefinitionIdField returns [EObject current=null] : (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionIdField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_idString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1541:2: ( (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1542:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1542:2: (otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1543:3: otherlv_0= 'id' ( (lv_name_1_0= RULE_ID ) ) ( (lv_idString_2_0= ruleDtDefinitionIdString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionIdFieldAccess().getIdKeyword_0());
            		
            // InternalVertigoDsl.g:1547:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1548:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1549:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalVertigoDsl.g:1565:3: ( (lv_idString_2_0= ruleDtDefinitionIdString ) )
            // InternalVertigoDsl.g:1566:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            {
            // InternalVertigoDsl.g:1566:4: (lv_idString_2_0= ruleDtDefinitionIdString )
            // InternalVertigoDsl.g:1567:5: lv_idString_2_0= ruleDtDefinitionIdString
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

            // InternalVertigoDsl.g:1584:3: (otherlv_3= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVertigoDsl.g:1585:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1594:1: entryRuleDtDefinitionDataField returns [EObject current=null] : iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF ;
    public final EObject entryRuleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataField = null;


        try {
            // InternalVertigoDsl.g:1594:62: (iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF )
            // InternalVertigoDsl.g:1595:2: iv_ruleDtDefinitionDataField= ruleDtDefinitionDataField EOF
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
    // InternalVertigoDsl.g:1601:1: ruleDtDefinitionDataField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_dataFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1607:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1608:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1608:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1609:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataFieldAccess().getFieldKeyword_0());
            		
            // InternalVertigoDsl.g:1613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1614:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalVertigoDsl.g:1631:3: ( (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString ) )
            // InternalVertigoDsl.g:1632:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            {
            // InternalVertigoDsl.g:1632:4: (lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString )
            // InternalVertigoDsl.g:1633:5: lv_dataFieldString_2_0= ruleDtDefinitionDataFieldString
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

            // InternalVertigoDsl.g:1650:3: (otherlv_3= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVertigoDsl.g:1651:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1660:1: entryRuleDtDefinitionComputedField returns [EObject current=null] : iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF ;
    public final EObject entryRuleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionComputedField = null;


        try {
            // InternalVertigoDsl.g:1660:66: (iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF )
            // InternalVertigoDsl.g:1661:2: iv_ruleDtDefinitionComputedField= ruleDtDefinitionComputedField EOF
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
    // InternalVertigoDsl.g:1667:1: ruleDtDefinitionComputedField returns [EObject current=null] : (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionComputedField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_computedFieldString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:1673:2: ( (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1674:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1674:2: (otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1675:3: otherlv_0= 'computed' ( (lv_name_1_0= RULE_ID ) ) ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionComputedFieldAccess().getComputedKeyword_0());
            		
            // InternalVertigoDsl.g:1679:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:1680:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1680:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:1681:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalVertigoDsl.g:1697:3: ( (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString ) )
            // InternalVertigoDsl.g:1698:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            {
            // InternalVertigoDsl.g:1698:4: (lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString )
            // InternalVertigoDsl.g:1699:5: lv_computedFieldString_2_0= ruleDtDefinitionComputedFieldString
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

            // InternalVertigoDsl.g:1716:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVertigoDsl.g:1717:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1726:1: entryRuleDtDefinitionStereotype returns [EObject current=null] : iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF ;
    public final EObject entryRuleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionStereotype = null;


        try {
            // InternalVertigoDsl.g:1726:63: (iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF )
            // InternalVertigoDsl.g:1727:2: iv_ruleDtDefinitionStereotype= ruleDtDefinitionStereotype EOF
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
    // InternalVertigoDsl.g:1733:1: ruleDtDefinitionStereotype returns [EObject current=null] : (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionStereotype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_stereoType_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1739:2: ( (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1740:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1740:2: (otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1741:3: otherlv_0= 'stereotype' otherlv_1= ':' ( (lv_stereoType_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionStereotypeAccess().getStereotypeKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionStereotypeAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1749:3: ( (lv_stereoType_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1750:4: (lv_stereoType_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1750:4: (lv_stereoType_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1751:5: lv_stereoType_2_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1767:3: (otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVertigoDsl.g:1768:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1777:1: entryRuleDtDefinitionDataSpace returns [EObject current=null] : iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF ;
    public final EObject entryRuleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDataSpace = null;


        try {
            // InternalVertigoDsl.g:1777:62: (iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF )
            // InternalVertigoDsl.g:1778:2: iv_ruleDtDefinitionDataSpace= ruleDtDefinitionDataSpace EOF
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
    // InternalVertigoDsl.g:1784:1: ruleDtDefinitionDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1790:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1791:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1791:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1792:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1800:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1801:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1801:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1802:5: lv_storeName_2_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1818:3: (otherlv_3= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVertigoDsl.g:1819:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1828:1: entryRuleDtDefinitionDisplayField returns [EObject current=null] : iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF ;
    public final EObject entryRuleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionDisplayField = null;


        try {
            // InternalVertigoDsl.g:1828:65: (iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF )
            // InternalVertigoDsl.g:1829:2: iv_ruleDtDefinitionDisplayField= ruleDtDefinitionDisplayField EOF
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
    // InternalVertigoDsl.g:1835:1: ruleDtDefinitionDisplayField returns [EObject current=null] : (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionDisplayField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_displayField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1841:2: ( (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1842:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1842:2: (otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1843:3: otherlv_0= 'displayField' otherlv_1= ':' ( (lv_displayField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionDisplayFieldAccess().getDisplayFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionDisplayFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1851:3: ( (lv_displayField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1852:4: (lv_displayField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1852:4: (lv_displayField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1853:5: lv_displayField_2_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1869:3: (otherlv_3= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVertigoDsl.g:1870:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1879:1: entryRuleDtDefinitionSortField returns [EObject current=null] : iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF ;
    public final EObject entryRuleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinitionSortField = null;


        try {
            // InternalVertigoDsl.g:1879:62: (iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF )
            // InternalVertigoDsl.g:1880:2: iv_ruleDtDefinitionSortField= ruleDtDefinitionSortField EOF
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
    // InternalVertigoDsl.g:1886:1: ruleDtDefinitionSortField returns [EObject current=null] : (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleDtDefinitionSortField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sortField_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:1892:2: ( (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:1893:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:1893:2: (otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:1894:3: otherlv_0= 'sortField' otherlv_1= ':' ( (lv_sortField_2_0= RULE_STRING ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDtDefinitionSortFieldAccess().getSortFieldKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getDtDefinitionSortFieldAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:1902:3: ( (lv_sortField_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:1903:4: (lv_sortField_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:1903:4: (lv_sortField_2_0= RULE_STRING )
            // InternalVertigoDsl.g:1904:5: lv_sortField_2_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:1920:3: (otherlv_3= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVertigoDsl.g:1921:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:1930:1: entryRuleDtDefinition returns [EObject current=null] : iv_ruleDtDefinition= ruleDtDefinition EOF ;
    public final EObject entryRuleDtDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDtDefinition = null;


        try {
            // InternalVertigoDsl.g:1930:53: (iv_ruleDtDefinition= ruleDtDefinition EOF )
            // InternalVertigoDsl.g:1931:2: iv_ruleDtDefinition= ruleDtDefinition EOF
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
    // InternalVertigoDsl.g:1937:1: ruleDtDefinition returns [EObject current=null] : ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) ;
    public final EObject ruleDtDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
            // InternalVertigoDsl.g:1943:2: ( ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            // InternalVertigoDsl.g:1944:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            {
            // InternalVertigoDsl.g:1944:2: ( (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}' )
            // InternalVertigoDsl.g:1945:3: (otherlv_0= 'create' | otherlv_1= 'alter' ) otherlv_2= 'DtDefinition' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )? ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )? ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )* ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) ) otherlv_13= '}'
            {
            // InternalVertigoDsl.g:1945:3: (otherlv_0= 'create' | otherlv_1= 'alter' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            else if ( (LA32_0==27) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalVertigoDsl.g:1946:4: otherlv_0= 'create'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getDtDefinitionAccess().getCreateKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:1951:4: otherlv_1= 'alter'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getDtDefinitionAccess().getAlterKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDtDefinitionAccess().getDtDefinitionKeyword_1());
            		
            // InternalVertigoDsl.g:1960:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalVertigoDsl.g:1961:4: (lv_name_3_0= RULE_ID )
            {
            // InternalVertigoDsl.g:1961:4: (lv_name_3_0= RULE_ID )
            // InternalVertigoDsl.g:1962:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDtDefinitionAccess().getNameIDTerminalRuleCall_2_0());
            				

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

            otherlv_4=(Token)match(input,18,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getDtDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:1982:3: ( (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==46) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVertigoDsl.g:1983:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    {
                    // InternalVertigoDsl.g:1983:4: (lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype )
                    // InternalVertigoDsl.g:1984:5: lv_dtDefinitionStereotype_5_0= ruleDtDefinitionStereotype
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionStereotypeDtDefinitionStereotypeParserRuleCall_4_0());
                    				
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

            // InternalVertigoDsl.g:2001:3: ( (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVertigoDsl.g:2002:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    {
                    // InternalVertigoDsl.g:2002:4: (lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField )
                    // InternalVertigoDsl.g:2003:5: lv_dtDefinitionIdField_6_0= ruleDtDefinitionIdField
                    {

                    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionIdFieldDtDefinitionIdFieldParserRuleCall_5_0());
                    				
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

            // InternalVertigoDsl.g:2020:3: ( (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==44) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVertigoDsl.g:2021:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    {
            	    // InternalVertigoDsl.g:2021:4: (lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField )
            	    // InternalVertigoDsl.g:2022:5: lv_dtDefinitionDataFields_7_0= ruleDtDefinitionDataField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataFieldsDtDefinitionDataFieldParserRuleCall_6_0());
            	    				
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
            	    break loop35;
                }
            } while (true);

            // InternalVertigoDsl.g:2039:3: ( (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVertigoDsl.g:2040:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    {
            	    // InternalVertigoDsl.g:2040:4: (lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField )
            	    // InternalVertigoDsl.g:2041:5: lv_dtDefinitionComputedFields_8_0= ruleDtDefinitionComputedField
            	    {

            	    					newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionComputedFieldsDtDefinitionComputedFieldParserRuleCall_7_0());
            	    				
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
            	    break loop36;
                }
            } while (true);

            // InternalVertigoDsl.g:2058:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) ) )
            // InternalVertigoDsl.g:2059:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            {
            // InternalVertigoDsl.g:2059:4: ( ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* ) )
            // InternalVertigoDsl.g:2060:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8());
            				
            // InternalVertigoDsl.g:2063:5: ( ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )* )
            // InternalVertigoDsl.g:2064:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            {
            // InternalVertigoDsl.g:2064:6: ( ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) ) )*
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVertigoDsl.g:2065:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2065:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) ) )
            	    // InternalVertigoDsl.g:2066:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2066:109: ( ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) ) )
            	    // InternalVertigoDsl.g:2067:6: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 0);
            	    					
            	    // InternalVertigoDsl.g:2070:9: ({...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) ) )
            	    // InternalVertigoDsl.g:2070:10: {...}? => ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2070:19: ( (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace ) )
            	    // InternalVertigoDsl.g:2070:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    {
            	    // InternalVertigoDsl.g:2070:20: (lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace )
            	    // InternalVertigoDsl.g:2071:10: lv_dtDefinitionDataSpace_10_0= ruleDtDefinitionDataSpace
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDataSpaceDtDefinitionDataSpaceParserRuleCall_8_0_0());
            	    									
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVertigoDsl.g:2093:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2093:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) ) )
            	    // InternalVertigoDsl.g:2094:5: {...}? => ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2094:109: ( ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) ) )
            	    // InternalVertigoDsl.g:2095:6: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 1);
            	    					
            	    // InternalVertigoDsl.g:2098:9: ({...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) ) )
            	    // InternalVertigoDsl.g:2098:10: {...}? => ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2098:19: ( (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField ) )
            	    // InternalVertigoDsl.g:2098:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    {
            	    // InternalVertigoDsl.g:2098:20: (lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField )
            	    // InternalVertigoDsl.g:2099:10: lv_dtDefinitionSortField_11_0= ruleDtDefinitionSortField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionSortFieldDtDefinitionSortFieldParserRuleCall_8_1_0());
            	    									
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVertigoDsl.g:2121:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2121:4: ({...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) ) )
            	    // InternalVertigoDsl.g:2122:5: {...}? => ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2122:109: ( ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) ) )
            	    // InternalVertigoDsl.g:2123:6: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8(), 2);
            	    					
            	    // InternalVertigoDsl.g:2126:9: ({...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) ) )
            	    // InternalVertigoDsl.g:2126:10: {...}? => ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDtDefinition", "true");
            	    }
            	    // InternalVertigoDsl.g:2126:19: ( (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField ) )
            	    // InternalVertigoDsl.g:2126:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    {
            	    // InternalVertigoDsl.g:2126:20: (lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField )
            	    // InternalVertigoDsl.g:2127:10: lv_dtDefinitionDisplayField_12_0= ruleDtDefinitionDisplayField
            	    {

            	    										newCompositeNode(grammarAccess.getDtDefinitionAccess().getDtDefinitionDisplayFieldDtDefinitionDisplayFieldParserRuleCall_8_2_0());
            	    									
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDtDefinitionAccess().getUnorderedGroup_8());
            				

            }

            otherlv_13=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDtDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

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
    // InternalVertigoDsl.g:2164:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalVertigoDsl.g:2164:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalVertigoDsl.g:2165:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalVertigoDsl.g:2171:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) ;
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
            // InternalVertigoDsl.g:2177:2: ( (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' ) )
            // InternalVertigoDsl.g:2178:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            {
            // InternalVertigoDsl.g:2178:2: (otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}' )
            // InternalVertigoDsl.g:2179:3: otherlv_0= 'create' otherlv_1= 'Association' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) otherlv_52= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalVertigoDsl.g:2187:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:2188:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2188:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:2189:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVertigoDsl.g:2209:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2210:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2210:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2211:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAssociationAccess().getUnorderedGroup_4());
            				
            // InternalVertigoDsl.g:2214:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2215:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2215:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=13;
                alt49 = dfa49.predict(input);
                switch (alt49) {
            	case 1 :
            	    // InternalVertigoDsl.g:2216:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2216:4: ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2217:5: {...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2217:108: ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2218:6: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalVertigoDsl.g:2221:9: ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) )
            	    // InternalVertigoDsl.g:2221:10: {...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2221:19: (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? )
            	    // InternalVertigoDsl.g:2221:20: otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,50,FOLLOW_12); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getFkFieldNameKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalVertigoDsl.g:2229:9: ( (lv_fkFieldName_7_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2230:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2230:10: (lv_fkFieldName_7_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2231:11: lv_fkFieldName_7_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2247:9: (otherlv_8= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==34) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2248:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2259:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2259:4: ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2260:5: {...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2260:108: ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2261:6: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalVertigoDsl.g:2264:9: ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) )
            	    // InternalVertigoDsl.g:2264:10: {...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2264:19: (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? )
            	    // InternalVertigoDsl.g:2264:20: otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,51,FOLLOW_12); 

            	    									newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getDtDefinitionAKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalVertigoDsl.g:2272:9: ( (otherlv_11= RULE_ID ) )
            	    // InternalVertigoDsl.g:2273:10: (otherlv_11= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2273:10: (otherlv_11= RULE_ID )
            	    // InternalVertigoDsl.g:2274:11: otherlv_11= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_11, grammarAccess.getAssociationAccess().getDtDefinitionADtDefinitionTypeCrossReference_4_1_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2285:9: (otherlv_12= ',' )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==34) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2286:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2297:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2297:4: ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2298:5: {...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2298:108: ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2299:6: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalVertigoDsl.g:2302:9: ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) )
            	    // InternalVertigoDsl.g:2302:10: {...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2302:19: (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? )
            	    // InternalVertigoDsl.g:2302:20: otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,52,FOLLOW_12); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getDtDefinitionBKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalVertigoDsl.g:2310:9: ( (otherlv_15= RULE_ID ) )
            	    // InternalVertigoDsl.g:2311:10: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2311:10: (otherlv_15= RULE_ID )
            	    // InternalVertigoDsl.g:2312:11: otherlv_15= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAssociationRule());
            	    											}
            	    										
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_47); 

            	    											newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getDtDefinitionBDtDefinitionTypeCrossReference_4_2_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2323:9: (otherlv_16= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==34) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2324:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2335:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2335:4: ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2336:5: {...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalVertigoDsl.g:2336:108: ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2337:6: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalVertigoDsl.g:2340:9: ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) )
            	    // InternalVertigoDsl.g:2340:10: {...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2340:19: (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? )
            	    // InternalVertigoDsl.g:2340:20: otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,53,FOLLOW_12); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getNavigabilityAKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,20,FOLLOW_29); 

            	    									newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getColonKeyword_4_3_1());
            	    								
            	    // InternalVertigoDsl.g:2348:9: ( (lv_navigabilityA_19_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2349:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2349:10: (lv_navigabilityA_19_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2350:11: lv_navigabilityA_19_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:2367:9: (otherlv_20= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==34) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2368:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2379:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2379:4: ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2380:5: {...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalVertigoDsl.g:2380:108: ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2381:6: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalVertigoDsl.g:2384:9: ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) )
            	    // InternalVertigoDsl.g:2384:10: {...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2384:19: (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? )
            	    // InternalVertigoDsl.g:2384:20: otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )?
            	    {
            	    otherlv_21=(Token)match(input,54,FOLLOW_12); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAssociationAccess().getNavigabilityBKeyword_4_4_0());
            	    								
            	    otherlv_22=(Token)match(input,20,FOLLOW_29); 

            	    									newLeafNode(otherlv_22, grammarAccess.getAssociationAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalVertigoDsl.g:2392:9: ( (lv_navigabilityB_23_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2393:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2393:10: (lv_navigabilityB_23_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2394:11: lv_navigabilityB_23_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:2411:9: (otherlv_24= ',' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==34) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2412:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2423:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2423:4: ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2424:5: {...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalVertigoDsl.g:2424:108: ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2425:6: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalVertigoDsl.g:2428:9: ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) )
            	    // InternalVertigoDsl.g:2428:10: {...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2428:19: (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? )
            	    // InternalVertigoDsl.g:2428:20: otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,55,FOLLOW_12); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAssociationAccess().getMultiplicityAKeyword_4_5_0());
            	    								
            	    otherlv_26=(Token)match(input,20,FOLLOW_49); 

            	    									newLeafNode(otherlv_26, grammarAccess.getAssociationAccess().getColonKeyword_4_5_1());
            	    								
            	    // InternalVertigoDsl.g:2436:9: ( (lv_multiplicityA_27_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2437:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2437:10: (lv_multiplicityA_27_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2438:11: lv_multiplicityA_27_0= ruleMultiplicityString
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

            	    // InternalVertigoDsl.g:2455:9: (otherlv_28= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==34) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2456:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2467:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2467:4: ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2468:5: {...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalVertigoDsl.g:2468:108: ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2469:6: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalVertigoDsl.g:2472:9: ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) )
            	    // InternalVertigoDsl.g:2472:10: {...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2472:19: (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? )
            	    // InternalVertigoDsl.g:2472:20: otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )?
            	    {
            	    otherlv_29=(Token)match(input,56,FOLLOW_12); 

            	    									newLeafNode(otherlv_29, grammarAccess.getAssociationAccess().getMultiplicityBKeyword_4_6_0());
            	    								
            	    otherlv_30=(Token)match(input,20,FOLLOW_49); 

            	    									newLeafNode(otherlv_30, grammarAccess.getAssociationAccess().getColonKeyword_4_6_1());
            	    								
            	    // InternalVertigoDsl.g:2480:9: ( (lv_multiplicityB_31_0= ruleMultiplicityString ) )
            	    // InternalVertigoDsl.g:2481:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    {
            	    // InternalVertigoDsl.g:2481:10: (lv_multiplicityB_31_0= ruleMultiplicityString )
            	    // InternalVertigoDsl.g:2482:11: lv_multiplicityB_31_0= ruleMultiplicityString
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

            	    // InternalVertigoDsl.g:2499:9: (otherlv_32= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==34) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2500:10: otherlv_32= ','
            	            {
            	            otherlv_32=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2511:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2511:4: ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2512:5: {...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // InternalVertigoDsl.g:2512:108: ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2513:6: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7);
            	    					
            	    // InternalVertigoDsl.g:2516:9: ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) )
            	    // InternalVertigoDsl.g:2516:10: {...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2516:19: (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? )
            	    // InternalVertigoDsl.g:2516:20: otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )?
            	    {
            	    otherlv_33=(Token)match(input,57,FOLLOW_12); 

            	    									newLeafNode(otherlv_33, grammarAccess.getAssociationAccess().getLabelAKeyword_4_7_0());
            	    								
            	    otherlv_34=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_34, grammarAccess.getAssociationAccess().getColonKeyword_4_7_1());
            	    								
            	    // InternalVertigoDsl.g:2524:9: ( (lv_labelA_35_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2525:10: (lv_labelA_35_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2525:10: (lv_labelA_35_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2526:11: lv_labelA_35_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2542:9: (otherlv_36= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==34) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2543:10: otherlv_36= ','
            	            {
            	            otherlv_36=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2554:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2554:4: ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2555:5: {...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // InternalVertigoDsl.g:2555:108: ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2556:6: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8);
            	    					
            	    // InternalVertigoDsl.g:2559:9: ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) )
            	    // InternalVertigoDsl.g:2559:10: {...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2559:19: (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? )
            	    // InternalVertigoDsl.g:2559:20: otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )?
            	    {
            	    otherlv_37=(Token)match(input,58,FOLLOW_12); 

            	    									newLeafNode(otherlv_37, grammarAccess.getAssociationAccess().getLabelBKeyword_4_8_0());
            	    								
            	    otherlv_38=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_38, grammarAccess.getAssociationAccess().getColonKeyword_4_8_1());
            	    								
            	    // InternalVertigoDsl.g:2567:9: ( (lv_labelB_39_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2568:10: (lv_labelB_39_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2568:10: (lv_labelB_39_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2569:11: lv_labelB_39_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2585:9: (otherlv_40= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==34) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2586:10: otherlv_40= ','
            	            {
            	            otherlv_40=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2597:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2597:4: ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2598:5: {...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // InternalVertigoDsl.g:2598:108: ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2599:6: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9);
            	    					
            	    // InternalVertigoDsl.g:2602:9: ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) )
            	    // InternalVertigoDsl.g:2602:10: {...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2602:19: (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? )
            	    // InternalVertigoDsl.g:2602:20: otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )?
            	    {
            	    otherlv_41=(Token)match(input,59,FOLLOW_12); 

            	    									newLeafNode(otherlv_41, grammarAccess.getAssociationAccess().getRoleAKeyword_4_9_0());
            	    								
            	    otherlv_42=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_42, grammarAccess.getAssociationAccess().getColonKeyword_4_9_1());
            	    								
            	    // InternalVertigoDsl.g:2610:9: ( (lv_roleA_43_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2611:10: (lv_roleA_43_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2611:10: (lv_roleA_43_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2612:11: lv_roleA_43_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2628:9: (otherlv_44= ',' )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==34) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2629:10: otherlv_44= ','
            	            {
            	            otherlv_44=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2640:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2640:4: ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2641:5: {...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // InternalVertigoDsl.g:2641:109: ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2642:6: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10);
            	    					
            	    // InternalVertigoDsl.g:2645:9: ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) )
            	    // InternalVertigoDsl.g:2645:10: {...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2645:19: (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? )
            	    // InternalVertigoDsl.g:2645:20: otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )?
            	    {
            	    otherlv_45=(Token)match(input,60,FOLLOW_12); 

            	    									newLeafNode(otherlv_45, grammarAccess.getAssociationAccess().getRoleBKeyword_4_10_0());
            	    								
            	    otherlv_46=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_46, grammarAccess.getAssociationAccess().getColonKeyword_4_10_1());
            	    								
            	    // InternalVertigoDsl.g:2653:9: ( (lv_roleB_47_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2654:10: (lv_roleB_47_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2654:10: (lv_roleB_47_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2655:11: lv_roleB_47_0= RULE_STRING
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
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2671:9: (otherlv_48= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==34) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2672:10: otherlv_48= ','
            	            {
            	            otherlv_48=(Token)match(input,34,FOLLOW_48); 

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
            	    // InternalVertigoDsl.g:2683:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2683:4: ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) )
            	    // InternalVertigoDsl.g:2684:5: {...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // InternalVertigoDsl.g:2684:109: ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) )
            	    // InternalVertigoDsl.g:2685:6: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11);
            	    					
            	    // InternalVertigoDsl.g:2688:9: ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) )
            	    // InternalVertigoDsl.g:2688:10: {...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAssociation", "true");
            	    }
            	    // InternalVertigoDsl.g:2688:19: (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) )
            	    // InternalVertigoDsl.g:2688:20: otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) )
            	    {
            	    otherlv_49=(Token)match(input,61,FOLLOW_12); 

            	    									newLeafNode(otherlv_49, grammarAccess.getAssociationAccess().getTypeKeyword_4_11_0());
            	    								
            	    otherlv_50=(Token)match(input,20,FOLLOW_13); 

            	    									newLeafNode(otherlv_50, grammarAccess.getAssociationAccess().getColonKeyword_4_11_1());
            	    								
            	    // InternalVertigoDsl.g:2696:9: ( (lv_type_51_0= RULE_STRING ) )
            	    // InternalVertigoDsl.g:2697:10: (lv_type_51_0= RULE_STRING )
            	    {
            	    // InternalVertigoDsl.g:2697:10: (lv_type_51_0= RULE_STRING )
            	    // InternalVertigoDsl.g:2698:11: lv_type_51_0= RULE_STRING
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

            otherlv_52=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2736:1: entryRuleTaskAttributeString returns [EObject current=null] : iv_ruleTaskAttributeString= ruleTaskAttributeString EOF ;
    public final EObject entryRuleTaskAttributeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttributeString = null;


        try {
            // InternalVertigoDsl.g:2736:60: (iv_ruleTaskAttributeString= ruleTaskAttributeString EOF )
            // InternalVertigoDsl.g:2737:2: iv_ruleTaskAttributeString= ruleTaskAttributeString EOF
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
    // InternalVertigoDsl.g:2743:1: ruleTaskAttributeString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:2749:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' ) )
            // InternalVertigoDsl.g:2750:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:2750:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}' )
            // InternalVertigoDsl.g:2751:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalVertigoDsl.g:2755:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalVertigoDsl.g:2756:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalVertigoDsl.g:2756:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?) )
            // InternalVertigoDsl.g:2757:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1());
            				
            // InternalVertigoDsl.g:2760:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?)
            // InternalVertigoDsl.g:2761:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalVertigoDsl.g:2761:6: ( ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=4;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
                    alt53=3;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalVertigoDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2763:5: {...}? => ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalVertigoDsl.g:2763:116: ( ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2764:6: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalVertigoDsl.g:2767:9: ({...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // InternalVertigoDsl.g:2767:10: {...}? => (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2767:19: (otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // InternalVertigoDsl.g:2767:20: otherlv_2= 'domain' otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getTaskAttributeStringAccess().getDomainKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalVertigoDsl.g:2775:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalVertigoDsl.g:2776:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalVertigoDsl.g:2776:10: (otherlv_4= RULE_ID )
            	    // InternalVertigoDsl.g:2777:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getTaskAttributeStringRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_51); 

            	    											newLeafNode(otherlv_4, grammarAccess.getTaskAttributeStringAccess().getDomainDomainTypeCrossReference_1_0_2_0());
            	    										

            	    }


            	    }

            	    // InternalVertigoDsl.g:2788:9: (otherlv_5= ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==34) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2789:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,34,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2801:5: {...}? => ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalVertigoDsl.g:2801:116: ( ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2802:6: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalVertigoDsl.g:2805:9: ({...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? ) )
            	    // InternalVertigoDsl.g:2805:10: {...}? => (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2805:19: (otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )? )
            	    // InternalVertigoDsl.g:2805:20: otherlv_6= 'required' otherlv_7= ':' ( (lv_required_8_0= ruleBooleanString ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getTaskAttributeStringAccess().getRequiredKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,20,FOLLOW_29); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalVertigoDsl.g:2813:9: ( (lv_required_8_0= ruleBooleanString ) )
            	    // InternalVertigoDsl.g:2814:10: (lv_required_8_0= ruleBooleanString )
            	    {
            	    // InternalVertigoDsl.g:2814:10: (lv_required_8_0= ruleBooleanString )
            	    // InternalVertigoDsl.g:2815:11: lv_required_8_0= ruleBooleanString
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

            	    // InternalVertigoDsl.g:2832:9: (otherlv_9= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==34) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2833:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,34,FOLLOW_52); 

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
            	    // InternalVertigoDsl.g:2844:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalVertigoDsl.g:2844:4: ({...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalVertigoDsl.g:2845:5: {...}? => ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalVertigoDsl.g:2845:116: ( ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalVertigoDsl.g:2846:6: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTaskAttributeStringAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalVertigoDsl.g:2849:9: ({...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? ) )
            	    // InternalVertigoDsl.g:2849:10: {...}? => (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTaskAttributeString", "true");
            	    }
            	    // InternalVertigoDsl.g:2849:19: (otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )? )
            	    // InternalVertigoDsl.g:2849:20: otherlv_10= 'inOut' otherlv_11= ':' ( (lv_inout_12_0= ruleInOutString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,62,FOLLOW_12); 

            	    									newLeafNode(otherlv_10, grammarAccess.getTaskAttributeStringAccess().getInOutKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,20,FOLLOW_53); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTaskAttributeStringAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalVertigoDsl.g:2857:9: ( (lv_inout_12_0= ruleInOutString ) )
            	    // InternalVertigoDsl.g:2858:10: (lv_inout_12_0= ruleInOutString )
            	    {
            	    // InternalVertigoDsl.g:2858:10: (lv_inout_12_0= ruleInOutString )
            	    // InternalVertigoDsl.g:2859:11: lv_inout_12_0= ruleInOutString
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

            	    // InternalVertigoDsl.g:2876:9: (otherlv_13= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==34) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalVertigoDsl.g:2877:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,34,FOLLOW_52); 

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

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2904:1: entryRuleTaskAttribute returns [EObject current=null] : iv_ruleTaskAttribute= ruleTaskAttribute EOF ;
    public final EObject entryRuleTaskAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAttribute = null;


        try {
            // InternalVertigoDsl.g:2904:54: (iv_ruleTaskAttribute= ruleTaskAttribute EOF )
            // InternalVertigoDsl.g:2905:2: iv_ruleTaskAttribute= ruleTaskAttribute EOF
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
    // InternalVertigoDsl.g:2911:1: ruleTaskAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleTaskAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_taskAttributeString_2_0 = null;



        	enterRule();

        try {
            // InternalVertigoDsl.g:2917:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? ) )
            // InternalVertigoDsl.g:2918:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            {
            // InternalVertigoDsl.g:2918:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )? )
            // InternalVertigoDsl.g:2919:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) ) (otherlv_3= ',' )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAttributeAccess().getAttributeKeyword_0());
            		
            // InternalVertigoDsl.g:2923:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVertigoDsl.g:2924:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVertigoDsl.g:2924:4: (lv_name_1_0= RULE_ID )
            // InternalVertigoDsl.g:2925:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalVertigoDsl.g:2941:3: ( (lv_taskAttributeString_2_0= ruleTaskAttributeString ) )
            // InternalVertigoDsl.g:2942:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            {
            // InternalVertigoDsl.g:2942:4: (lv_taskAttributeString_2_0= ruleTaskAttributeString )
            // InternalVertigoDsl.g:2943:5: lv_taskAttributeString_2_0= ruleTaskAttributeString
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

            // InternalVertigoDsl.g:2960:3: (otherlv_3= ',' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==34) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalVertigoDsl.g:2961:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_2); 

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
    // InternalVertigoDsl.g:2970:1: entryRuleTaskDataSpace returns [EObject current=null] : iv_ruleTaskDataSpace= ruleTaskDataSpace EOF ;
    public final EObject entryRuleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDataSpace = null;


        try {
            // InternalVertigoDsl.g:2970:54: (iv_ruleTaskDataSpace= ruleTaskDataSpace EOF )
            // InternalVertigoDsl.g:2971:2: iv_ruleTaskDataSpace= ruleTaskDataSpace EOF
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
    // InternalVertigoDsl.g:2977:1: ruleTaskDataSpace returns [EObject current=null] : (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTaskDataSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_storeName_2_0=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:2983:2: ( (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) ) )
            // InternalVertigoDsl.g:2984:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) )
            {
            // InternalVertigoDsl.g:2984:2: (otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) ) )
            // InternalVertigoDsl.g:2985:3: otherlv_0= 'storeName' otherlv_1= ':' ( (lv_storeName_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDataSpaceAccess().getStoreNameKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDataSpaceAccess().getColonKeyword_1());
            		
            // InternalVertigoDsl.g:2993:3: ( (lv_storeName_2_0= RULE_STRING ) )
            // InternalVertigoDsl.g:2994:4: (lv_storeName_2_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:2994:4: (lv_storeName_2_0= RULE_STRING )
            // InternalVertigoDsl.g:2995:5: lv_storeName_2_0= RULE_STRING
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
    // $ANTLR end "ruleTaskDataSpace"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalVertigoDsl.g:3015:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalVertigoDsl.g:3015:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalVertigoDsl.g:3016:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
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
    // InternalVertigoDsl.g:3022:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) ;
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
            // InternalVertigoDsl.g:3028:2: ( (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' ) )
            // InternalVertigoDsl.g:3029:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            {
            // InternalVertigoDsl.g:3029:2: (otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}' )
            // InternalVertigoDsl.g:3030:3: otherlv_0= 'create' otherlv_1= 'Task' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'className' otherlv_5= ':' ( (lv_classname_6_0= RULE_STRING ) ) (otherlv_7= ',' )? otherlv_8= 'request' otherlv_9= ':' ( (lv_request_10_0= RULE_STRING ) ) (otherlv_11= ',' )? ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )* ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_1());
            		
            // InternalVertigoDsl.g:3038:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalVertigoDsl.g:3039:4: (lv_name_2_0= RULE_ID )
            {
            // InternalVertigoDsl.g:3039:4: (lv_name_2_0= RULE_ID )
            // InternalVertigoDsl.g:3040:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getClassNameKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskDefinitionAccess().getColonKeyword_5());
            		
            // InternalVertigoDsl.g:3068:3: ( (lv_classname_6_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3069:4: (lv_classname_6_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3069:4: (lv_classname_6_0= RULE_STRING )
            // InternalVertigoDsl.g:3070:5: lv_classname_6_0= RULE_STRING
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
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3086:3: (otherlv_7= ',' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==34) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVertigoDsl.g:3087:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_56); 

                    				newLeafNode(otherlv_7, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,65,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskDefinitionAccess().getRequestKeyword_8());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskDefinitionAccess().getColonKeyword_9());
            		
            // InternalVertigoDsl.g:3100:3: ( (lv_request_10_0= RULE_STRING ) )
            // InternalVertigoDsl.g:3101:4: (lv_request_10_0= RULE_STRING )
            {
            // InternalVertigoDsl.g:3101:4: (lv_request_10_0= RULE_STRING )
            // InternalVertigoDsl.g:3102:5: lv_request_10_0= RULE_STRING
            {
            lv_request_10_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            					newLeafNode(lv_request_10_0, grammarAccess.getTaskDefinitionAccess().getRequestSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"request",
            						lv_request_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVertigoDsl.g:3118:3: (otherlv_11= ',' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==34) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalVertigoDsl.g:3119:4: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_58); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskDefinitionAccess().getCommaKeyword_11());
                    			

                    }
                    break;

            }

            // InternalVertigoDsl.g:3124:3: ( (lv_taskAttributes_12_0= ruleTaskAttribute ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==63) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalVertigoDsl.g:3125:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    {
            	    // InternalVertigoDsl.g:3125:4: (lv_taskAttributes_12_0= ruleTaskAttribute )
            	    // InternalVertigoDsl.g:3126:5: lv_taskAttributes_12_0= ruleTaskAttribute
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
            	    break loop57;
                }
            } while (true);

            // InternalVertigoDsl.g:3143:3: ( (lv_taskDataSpace_13_0= ruleTaskDataSpace ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==25) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalVertigoDsl.g:3144:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    {
                    // InternalVertigoDsl.g:3144:4: (lv_taskDataSpace_13_0= ruleTaskDataSpace )
                    // InternalVertigoDsl.g:3145:5: lv_taskDataSpace_13_0= ruleTaskDataSpace
                    {

                    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getTaskDataSpaceTaskDataSpaceParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_16);
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

            otherlv_14=(Token)match(input,23,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3170:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) ;
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
            // InternalVertigoDsl.g:3176:2: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) ) )
            // InternalVertigoDsl.g:3177:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            {
            // InternalVertigoDsl.g:3177:2: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Double' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'String' ) | (enumLiteral_4= 'LocalDate' ) | (enumLiteral_5= 'Instant' ) | (enumLiteral_6= 'BigDecimal' ) | (enumLiteral_7= 'Long' ) | (enumLiteral_8= 'DataStream' ) )
            int alt59=9;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt59=1;
                }
                break;
            case 67:
                {
                alt59=2;
                }
                break;
            case 68:
                {
                alt59=3;
                }
                break;
            case 69:
                {
                alt59=4;
                }
                break;
            case 70:
                {
                alt59=5;
                }
                break;
            case 71:
                {
                alt59=6;
                }
                break;
            case 72:
                {
                alt59=7;
                }
                break;
            case 73:
                {
                alt59=8;
                }
                break;
            case 74:
                {
                alt59=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalVertigoDsl.g:3178:3: (enumLiteral_0= 'Integer' )
                    {
                    // InternalVertigoDsl.g:3178:3: (enumLiteral_0= 'Integer' )
                    // InternalVertigoDsl.g:3179:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3186:3: (enumLiteral_1= 'Double' )
                    {
                    // InternalVertigoDsl.g:3186:3: (enumLiteral_1= 'Double' )
                    // InternalVertigoDsl.g:3187:4: enumLiteral_1= 'Double'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalVertigoDsl.g:3194:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalVertigoDsl.g:3194:3: (enumLiteral_2= 'Boolean' )
                    // InternalVertigoDsl.g:3195:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalVertigoDsl.g:3202:3: (enumLiteral_3= 'String' )
                    {
                    // InternalVertigoDsl.g:3202:3: (enumLiteral_3= 'String' )
                    // InternalVertigoDsl.g:3203:4: enumLiteral_3= 'String'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalVertigoDsl.g:3210:3: (enumLiteral_4= 'LocalDate' )
                    {
                    // InternalVertigoDsl.g:3210:3: (enumLiteral_4= 'LocalDate' )
                    // InternalVertigoDsl.g:3211:4: enumLiteral_4= 'LocalDate'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getLOCAL_DATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalVertigoDsl.g:3218:3: (enumLiteral_5= 'Instant' )
                    {
                    // InternalVertigoDsl.g:3218:3: (enumLiteral_5= 'Instant' )
                    // InternalVertigoDsl.g:3219:4: enumLiteral_5= 'Instant'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getINSTANTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalVertigoDsl.g:3226:3: (enumLiteral_6= 'BigDecimal' )
                    {
                    // InternalVertigoDsl.g:3226:3: (enumLiteral_6= 'BigDecimal' )
                    // InternalVertigoDsl.g:3227:4: enumLiteral_6= 'BigDecimal'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalVertigoDsl.g:3234:3: (enumLiteral_7= 'Long' )
                    {
                    // InternalVertigoDsl.g:3234:3: (enumLiteral_7= 'Long' )
                    // InternalVertigoDsl.g:3235:4: enumLiteral_7= 'Long'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalVertigoDsl.g:3242:3: (enumLiteral_8= 'DataStream' )
                    {
                    // InternalVertigoDsl.g:3242:3: (enumLiteral_8= 'DataStream' )
                    // InternalVertigoDsl.g:3243:4: enumLiteral_8= 'DataStream'
                    {
                    enumLiteral_8=(Token)match(input,74,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3253:1: ruleBooleanString returns [Enumerator current=null] : ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) ;
    public final Enumerator ruleBooleanString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3259:2: ( ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) ) )
            // InternalVertigoDsl.g:3260:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            {
            // InternalVertigoDsl.g:3260:2: ( (enumLiteral_0= '\"true\"' ) | (enumLiteral_1= '\"false\"' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==75) ) {
                alt60=1;
            }
            else if ( (LA60_0==76) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalVertigoDsl.g:3261:3: (enumLiteral_0= '\"true\"' )
                    {
                    // InternalVertigoDsl.g:3261:3: (enumLiteral_0= '\"true\"' )
                    // InternalVertigoDsl.g:3262:4: enumLiteral_0= '\"true\"'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3269:3: (enumLiteral_1= '\"false\"' )
                    {
                    // InternalVertigoDsl.g:3269:3: (enumLiteral_1= '\"false\"' )
                    // InternalVertigoDsl.g:3270:4: enumLiteral_1= '\"false\"'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3280:1: ruleMultiplicityString returns [Enumerator current=null] : ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) ;
    public final Enumerator ruleMultiplicityString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3286:2: ( ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) ) )
            // InternalVertigoDsl.g:3287:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            {
            // InternalVertigoDsl.g:3287:2: ( (enumLiteral_0= '\"0..1\"' ) | (enumLiteral_1= '\"0..*\"' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==77) ) {
                alt61=1;
            }
            else if ( (LA61_0==78) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalVertigoDsl.g:3288:3: (enumLiteral_0= '\"0..1\"' )
                    {
                    // InternalVertigoDsl.g:3288:3: (enumLiteral_0= '\"0..1\"' )
                    // InternalVertigoDsl.g:3289:4: enumLiteral_0= '\"0..1\"'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMultiplicityStringAccess().getZERO_ONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3296:3: (enumLiteral_1= '\"0..*\"' )
                    {
                    // InternalVertigoDsl.g:3296:3: (enumLiteral_1= '\"0..*\"' )
                    // InternalVertigoDsl.g:3297:4: enumLiteral_1= '\"0..*\"'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

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
    // InternalVertigoDsl.g:3307:1: ruleInOutString returns [Enumerator current=null] : ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) ;
    public final Enumerator ruleInOutString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVertigoDsl.g:3313:2: ( ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) ) )
            // InternalVertigoDsl.g:3314:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            {
            // InternalVertigoDsl.g:3314:2: ( (enumLiteral_0= '\"in\"' ) | (enumLiteral_1= '\"out\"' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==79) ) {
                alt62=1;
            }
            else if ( (LA62_0==80) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalVertigoDsl.g:3315:3: (enumLiteral_0= '\"in\"' )
                    {
                    // InternalVertigoDsl.g:3315:3: (enumLiteral_0= '\"in\"' )
                    // InternalVertigoDsl.g:3316:4: enumLiteral_0= '\"in\"'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInOutStringAccess().getINOUT_INEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVertigoDsl.g:3323:3: (enumLiteral_1= '\"out\"' )
                    {
                    // InternalVertigoDsl.g:3323:3: (enumLiteral_1= '\"out\"' )
                    // InternalVertigoDsl.g:3324:4: enumLiteral_1= '\"out\"'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

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


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\15\2\16\1\uffff\1\16\10\uffff";
    static final String dfa_3s = "\1\45\1\100\1\17\1\uffff\1\17\10\uffff";
    static final String dfa_4s = "\3\uffff\1\3\1\uffff\1\4\1\6\1\1\1\10\1\11\1\2\1\7\1\5";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\2\uffff\1\1\6\uffff\1\3\3\uffff\1\2\2\uffff\3\3\3\uffff\2\3",
            "\1\3\1\6\1\uffff\1\7\6\uffff\1\5\1\uffff\1\12\26\uffff\1\10\16\uffff\1\11",
            "\1\3\1\6",
            "",
            "\1\14\1\13",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "165:2: (this_Constraint_0= ruleConstraint | this_Formatter_1= ruleFormatter | this_Domain_2= ruleDomain | this_FileInfo_3= ruleFileInfo | this_DeclaredDomain_4= ruleDeclaredDomain | this_DtDefinition_5= ruleDtDefinition | this_DeclaredDtDefinition_6= ruleDeclaredDtDefinition | this_Association_7= ruleAssociation | this_TaskDefinition_8= ruleTaskDefinition )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\1\13\uffff";
    static final String dfa_9s = "\1\15\1\uffff\10\0\2\uffff";
    static final String dfa_10s = "\1\45\1\uffff\10\0\2\uffff";
    static final String dfa_11s = "\1\uffff\1\3\10\uffff\1\1\1\2";
    static final String dfa_12s = "\2\uffff\1\6\1\7\1\3\1\4\1\5\1\0\1\1\1\2\2\uffff}>";
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 681:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'create' | otherlv_2= 'alter' ) otherlv_3= 'Domain' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '{' otherlv_6= 'dataType' otherlv_7= ':' ( (lv_dataType_8_0= ruleDataType ) ) otherlv_9= 'formatter' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_13= 'storeType' otherlv_14= ':' ( (lv_storeType_15_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'indexType' otherlv_17= ':' ( (lv_indexType_18_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'constraint' otherlv_20= ':' otherlv_21= '[' ( (otherlv_22= RULE_ID ) ) ( (otherlv_23= ',' )+ ( (otherlv_24= RULE_ID ) ) )* otherlv_25= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'multiple' otherlv_27= ':' ( (lv_multiple_28_0= ruleBooleanString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'unit' otherlv_30= ':' ( (lv_unit_31_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) otherlv_32= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_9 = input.LA(1);

                         
                        int index12_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 1) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDomainAccess().getUnorderedGroup(), 0) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getDomainAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\27\15\uffff";
    static final String dfa_16s = "\1\75\15\uffff";
    static final String dfa_17s = "\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14";
    static final String dfa_18s = "\1\0\15\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\32\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
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

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()+ loopback of 2215:6: ( ({...}? => ( ({...}? => (otherlv_5= 'fkFieldName' otherlv_6= ':' ( (lv_fkFieldName_7_0= RULE_STRING ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'dtDefinitionA' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'dtDefinitionB' otherlv_14= ':' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'navigabilityA' otherlv_18= ':' ( (lv_navigabilityA_19_0= ruleBooleanString ) ) (otherlv_20= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'navigabilityB' otherlv_22= ':' ( (lv_navigabilityB_23_0= ruleBooleanString ) ) (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'multiplicityA' otherlv_26= ':' ( (lv_multiplicityA_27_0= ruleMultiplicityString ) ) (otherlv_28= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'multiplicityB' otherlv_30= ':' ( (lv_multiplicityB_31_0= ruleMultiplicityString ) ) (otherlv_32= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'labelA' otherlv_34= ':' ( (lv_labelA_35_0= RULE_STRING ) ) (otherlv_36= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= 'labelB' otherlv_38= ':' ( (lv_labelB_39_0= RULE_STRING ) ) (otherlv_40= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'roleA' otherlv_42= ':' ( (lv_roleA_43_0= RULE_STRING ) ) (otherlv_44= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= 'roleB' otherlv_46= ':' ( (lv_roleB_47_0= RULE_STRING ) ) (otherlv_48= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= 'type' otherlv_50= ':' ( (lv_type_51_0= RULE_STRING ) ) ) ) ) ) )+";
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
                        if ( (LA49_0==23) ) {s = 1;}

                        else if ( LA49_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 0) ) {s = 2;}

                        else if ( LA49_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 1) ) {s = 3;}

                        else if ( LA49_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 2) ) {s = 4;}

                        else if ( LA49_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA49_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 4) ) {s = 6;}

                        else if ( LA49_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA49_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 6) ) {s = 8;}

                        else if ( LA49_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 7) ) {s = 9;}

                        else if ( LA49_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA49_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 9) ) {s = 11;}

                        else if ( LA49_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 10) ) {s = 12;}

                        else if ( LA49_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getAssociationAccess().getUnorderedGroup_4(), 11) ) {s = 13;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000031C8813002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000031C8812002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007FCL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000031C8810002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000031C0800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C400800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000C000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003C000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003C400800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000003C000800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000004C000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000004C400800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000004C000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001F80002800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001B80002800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001B00002800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001A00002800000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001800002800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3FFC000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x3FFC000400800000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x3FFC000000800000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000014000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000014400800000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000014000800000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000402800000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000002800000L});

}
