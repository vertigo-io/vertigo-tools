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
		// TODO Auto-generated method stub
		System.out.println("UI UI UI UI");
		if(resource == null || resource.getParseResult() == null) {
	         return;
	      }
	      
	      INode root = resource.getParseResult().getRootNode();
	      for(INode node : root.getAsTreeIterable()){
	         EObject grammarElement = node.getGrammarElement(); 
	    	 if (grammarElement != null) {
	    		 if(grammarElement instanceof Keyword){
	    			 String value = ((Keyword)(node.getGrammarElement())).getValue();
	    			 if (value.equals("request")) {
	    				 System.out.println("Request Request Request Request Request ");
	    				 acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.COMMENT_ID);
	    			 }
	    		 }
	    	 }
	      }
		
	}
	
	

}
