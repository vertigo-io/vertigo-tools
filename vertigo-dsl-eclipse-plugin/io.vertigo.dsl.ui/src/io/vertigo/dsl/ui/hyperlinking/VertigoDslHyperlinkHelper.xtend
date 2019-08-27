package io.vertigo.dsl.ui.hyperlinking

import com.google.inject.Inject
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.Region
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor

class VertigoDslHyperlinkHelper extends  HyperlinkHelper {
	
	
	@Inject
	EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	override createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
	
		val EObject eObject = eObjectAtOffsetHelper.resolveElementAt(resource, offset)

		if (eObject !== null) {
			if (eObject instanceof DtDefinitionAction) {
				val INode node = NodeModelUtils.findActualNodeFor(eObject)
				if (node !== null) {
					val INode leaf = NodeModelUtils.findLeafNodeAtOffset(node, offset)
					if (leaf !== null) {
						if (leaf.grammarElement.eClass == VertigoDslPackage.Literals.DT_DEFINITION_ACTION__NAME) {
							val VertigoDslDtDefinitionHyperlink result = new VertigoDslDtDefinitionHyperlink(new Region(leaf.offset, leaf.length))
							acceptor.accept(result) 
						}
					}
				}
				
				 
			}
		}
		super.createHyperlinksByOffset(resource, offset, acceptor)
	}
}