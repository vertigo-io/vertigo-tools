/*
 * generated by Xtext 2.17.0
 */
package io.vertigo.dsl.ui.outline

import com.google.inject.Inject
import io.vertigo.dsl.vertigoDsl.Association
import io.vertigo.dsl.vertigoDsl.DeclaredDomain
import io.vertigo.dsl.vertigoDsl.DeclaredDtDefinition
import io.vertigo.dsl.vertigoDsl.Domain
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction
import io.vertigo.dsl.vertigoDsl.FileInfo
import io.vertigo.dsl.vertigoDsl.Model
import io.vertigo.dsl.vertigoDsl.TaskDefinition
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage
import org.eclipse.xtext.ui.IImageHelper
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode

/**
 * Customization of the default outline structure.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class VertigoDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	@Inject
	IImageHelper imageHelper;
	
	// Declare elements as terminal in the outline tree
	def _isLeaf(DtDefinitionAction dtDefinitionAction) {
		true
	}
	
	def _isLeaf(DeclaredDtDefinition declaredDtDefinition) {
		true
	}
	
	def _isLeaf(Domain domain) {
		true
	}
	
	def _isLeaf(DeclaredDomain declaredDomain) {
		true
	}
	
	def _isLeaf(Association association) {
		true
	}
	
	def _isLeaf(TaskDefinition taskDefinition) {
		true
	}
	
	def _isLeaf(FileInfo fileInfo) {
		true
	}
	
	// create categories for outline nodes
	def protected _createChildren(DocumentRootNode parentNode, Model model) {
		//val List<VirtualOutlineNode> outlineNodes = new ArrayList<VirtualOutlineNode>()
		
		
		// create feature groups
		var VirtualOutlineNode domainOutlineNode = null
		var VirtualOutlineNode dtDefinitionOutlineNode = null
		var VirtualOutlineNode associationOutlineNode = null
		var VirtualOutlineNode constraintOutlineNode 	= null
		var VirtualOutlineNode formatterOutlineNode = null
		var VirtualOutlineNode taskOutlineNode = null
		var VirtualOutlineNode fileInfoOutlineNode = null
		var VirtualOutlineNode facetDefinitionOutlineNode = null
		var VirtualOutlineNode facetedQueryDefinitionOutlineNode = null
		var VirtualOutlineNode indexDefinitionOutlineNode = null
		
		for (element : model.elements) {
			if(element.eClass == VertigoDslPackage.Literals.DOMAIN || element.eClass == VertigoDslPackage.Literals.DECLARED_DOMAIN) {
				if (domainOutlineNode === null) {
					domainOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("domain.png"),"Domains", false)
				}
				createNode(domainOutlineNode, element);
			} else if (element.eClass == VertigoDslPackage.Literals.DT_DEFINITION_ACTION || element.eClass == VertigoDslPackage.Literals.DECLARED_DT_DEFINITION) {
				if (dtDefinitionOutlineNode === null) {
					dtDefinitionOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("dtdefinition.png"),"Dt Definitions", false)					
				}
				createNode(dtDefinitionOutlineNode, element); 
			} else if (element.eClass == VertigoDslPackage.Literals.ASSOCIATION) {
				if (associationOutlineNode === null) {
					associationOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("assoc.png"),"Associations", false)		
				}
				createNode(associationOutlineNode, element); 
			}  else if (element.eClass == VertigoDslPackage.Literals.TASK_DEFINITION) {
				if (taskOutlineNode === null) {
					taskOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("gear.png"),"Tasks", false)		
				}
				createNode(taskOutlineNode, element); 
			} else if (element.eClass == VertigoDslPackage.Literals.FILE_INFO) {
				if (fileInfoOutlineNode === null) {
					fileInfoOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("file.png"),"File Infos", false)		
				}
				createNode(fileInfoOutlineNode, element);
			} else if (element.eClass == VertigoDslPackage.Literals.FACET_DEFINITION_ACTION) {
				if (facetDefinitionOutlineNode === null) {
					facetDefinitionOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("file.png"),"Facet Definitions", false)			
				}
				createNode(facetDefinitionOutlineNode, element);
			} else if (element.eClass == VertigoDslPackage.Literals.FACETED_QUERY_DEFINITION_ACTION) {
				if (facetedQueryDefinitionOutlineNode === null) {
					facetedQueryDefinitionOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("file.png"),"Faceted Query Definitions", false)					
				}
				createNode(facetedQueryDefinitionOutlineNode, element);
			} else if (element.eClass == VertigoDslPackage.Literals.INDEX_DEFINITION_ACTION) {
				if (indexDefinitionOutlineNode === null) {
					indexDefinitionOutlineNode = new VirtualOutlineNode(parentNode, imageHelper.getImage("file.png"),"Index Definitions", false)					
				}
				createNode(indexDefinitionOutlineNode, element);
			}
		}
		
	
		
	}

	
	/*
	def Object _text(DtDefinitionAction dtDefinitionAction) {
		if (dtDefinitionAction.dtDefinitionStereotype !== null)
		{
			val StyledString res = new StyledString();
			res.append(dtDefinitionAction.getName());
			res.append(" (" + dtDefinitionAction.dtDefinitionStereotype. + ")", 
				StyledString.DECORATIONS_STYLER);
			return res;
 		} else {
 			return super._text(dtDefinitionAction)
 		}
	}
	* 
	*/
}
