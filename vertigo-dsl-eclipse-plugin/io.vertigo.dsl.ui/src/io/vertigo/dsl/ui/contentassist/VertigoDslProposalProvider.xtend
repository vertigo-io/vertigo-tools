/*
 * generated by Xtext 2.17.0
 */
package io.vertigo.dsl.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.util.Strings

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class VertigoDslProposalProvider extends AbstractVertigoDslProposalProvider {
	
	def String getAssignedFeature(RuleCall call) {
		val Assignment ass = GrammarUtil.containingAssignment(call);
		if (ass !== null) {
			var String result = ass.getFeature();
			if (result.equals(result.toLowerCase()))
				result = Strings.toFirstUpper(result);
			return result;
		}
		return null;
	}
	
	override  complete_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (doCreateStringProposals()) {
			val String feature = getAssignedFeature(ruleCall);
			createStringProposal(context, acceptor, feature, ruleCall);
		}
	}

	def createStringProposal(ContentAssistContext context, ICompletionProposalAcceptor acceptor,
			String feature, RuleCall ruleCall) {
		var String proposalText = feature !== null ? feature : Strings.toFirstUpper(ruleCall.getRule().getName().toLowerCase());
		proposalText = getValueConverter().toString(proposalText, ruleCall.getRule().getName());
		var String displayText = proposalText;
		if (feature !== null)
			displayText = displayText + " - " + ruleCall.getRule().getName();
		val ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setSelectionStart(configurable.getReplacementOffset() + 1);
			configurable.setSelectionLength(proposalText.length() - 2);
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), proposalText.charAt(0), '\t');
			
		}
		acceptor.accept(proposal);
	}
	
}
