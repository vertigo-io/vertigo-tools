package io.vertigo.dsl.ui.highlighting;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

import io.vertigo.dsl.services.VertigoDslGrammarAccess;


public class VertigoUISemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Inject private VertigoDslGrammarAccess grammarAccess;	
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {

		if(resource == null || resource.getParseResult() == null) {
	         return;
	      }
	      
	      INode root = resource.getParseResult().getRootNode();
	      for(INode node : root.getAsTreeIterable()) {
	         EObject grammarElement = node.getGrammarElement(); 
	    	 if (grammarElement != null) {
	    		 if(grammarElement instanceof Keyword){
	    			 if (grammarAccess.getKEYWORDIDAccess().getKeywordIDDomainKeyword_0_1().equals(grammarElement)) {
		    			 acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
		    		 }
	    		 }
	    	 }
	      }
		
	      
	      
	}
	
//	class JPLSemanticHighlightingCalculator implements 
//	ISemanticHighlightingCalculator {
//		override provideHighlightingFor(XtextResource resource, 
//	IHighlightedPositionAcceptor acceptor,
//			CancelIndicator cancelIndicator) {
//			val ICompositeNode rootNode = resource.getParseResult().getRootNode();
//			val BidiTreeIterator<INode> it = rootNode.getAsTreeIterable().iterator();
//			while (it.hasNext) {
//				val INode node = it.next();
//				if (node.getGrammarElement() instanceof RuleCall) {
//					val rc = node.getGrammarElement() as RuleCall
//					val rule = rc.getRule()
//					if (rule instanceof TerminalRule) {
//						val s = node.text
//						println("Node ######################### " + s)
//						acceptor.addPosition(node.getOffset(), node.getLength(), 
//	DefaultHighlightingConfiguration.KEYWORD_ID);
//					}
//				}
//			}
//		}
//	}
//


}
