package io.vertigo.dsl.errorhandling;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class VertigoDslSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {
	
	public static final String INCOMPLETE_UNORDERED_GROUP = "INCOMPLETE_UNORDERED_GROUP";
	
	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {

		if (context instanceof IUnorderedGroupErrorContext) {
			List<AbstractElement> missingElementsGroupsList = ((IUnorderedGroupErrorContext)context).getMissingMandatoryElements(); 
			
			StringBuilder syntaxErrorMessageStringBuilder = new StringBuilder();
			
			for(AbstractElement missingElementGroup : missingElementsGroupsList) {
				if(missingElementGroup instanceof Group ) {
					String missingElementsString = ((Group)missingElementGroup).getElements().stream()
							.filter((item) -> item instanceof Keyword)
							.map((item) -> (Keyword)item)
							.map((item) -> item.getValue())
							.filter((item) -> isAlphanumeric2(item))
							.collect(Collectors.joining(" "));
					syntaxErrorMessageStringBuilder.append(missingElementsString + ", ");
				}
				else if (missingElementGroup instanceof Assignment) {
					String missingAssignmentString = "";
					
					Assignment assignment = (Assignment)missingElementGroup;
					if (assignment.getTerminal() instanceof RuleCall) {
						RuleCall ruleCall = (RuleCall)(assignment.getTerminal());
						if (ruleCall != null) {
							ParserRule parserRule = (ParserRule)ruleCall.getRule();
							if (parserRule != null) {
								for (EObject item : parserRule.eContents()) {
									if (item instanceof Group) {
										List<AbstractElement> elementsList = ((Group)item).getElements();
										for(AbstractElement element : elementsList ) {
											if (element instanceof Keyword) {
												String keywordString = ((Keyword) element).getValue(); 
												if (isAlphanumeric2(keywordString)) {
													missingAssignmentString += " " + keywordString;
												}
											}
										}
									}
								}
							}
							
							syntaxErrorMessageStringBuilder.append(missingAssignmentString + ", ");
						}
					}
				}
				
			}
			return new SyntaxErrorMessage("Missing elements " + syntaxErrorMessageStringBuilder, INCOMPLETE_UNORDERED_GROUP);
		} else {
			return super.getSyntaxErrorMessage(context);	
		}
		
	}
	
	private boolean isAlphanumeric2(String str) {
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c < 0x30 || (c >= 0x3a && c <= 0x40) || (c > 0x5a && c <= 0x60) || c > 0x7a)
                return false;
        }
        return true;
	}
}
