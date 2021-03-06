/**
 * generated by Xtext 2.17.0
 */
package io.vertigo.dsl.ui.outline;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import io.vertigo.dsl.ui.outline.VirtualOutlineNode;
import io.vertigo.dsl.vertigoDsl.Association;
import io.vertigo.dsl.vertigoDsl.DeclaredDomain;
import io.vertigo.dsl.vertigoDsl.DeclaredDtDefinition;
import io.vertigo.dsl.vertigoDsl.Domain;
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction;
import io.vertigo.dsl.vertigoDsl.Element;
import io.vertigo.dsl.vertigoDsl.FileInfo;
import io.vertigo.dsl.vertigoDsl.Model;
import io.vertigo.dsl.vertigoDsl.TaskDefinition;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
@SuppressWarnings("all")
public class VertigoDslOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  private IImageHelper imageHelper;
  
  public boolean _isLeaf(final DtDefinitionAction dtDefinitionAction) {
    return true;
  }
  
  public boolean _isLeaf(final DeclaredDtDefinition declaredDtDefinition) {
    return true;
  }
  
  public boolean _isLeaf(final Domain domain) {
    return true;
  }
  
  public boolean _isLeaf(final DeclaredDomain declaredDomain) {
    return true;
  }
  
  public boolean _isLeaf(final Association association) {
    return true;
  }
  
  public boolean _isLeaf(final TaskDefinition taskDefinition) {
    return true;
  }
  
  public boolean _isLeaf(final FileInfo fileInfo) {
    return true;
  }
  
  protected void _createChildren(final DocumentRootNode parentNode, final Model model) {
    VirtualOutlineNode domainOutlineNode = null;
    VirtualOutlineNode dtDefinitionOutlineNode = null;
    VirtualOutlineNode associationOutlineNode = null;
    VirtualOutlineNode constraintOutlineNode = null;
    VirtualOutlineNode formatterOutlineNode = null;
    VirtualOutlineNode taskOutlineNode = null;
    VirtualOutlineNode fileInfoOutlineNode = null;
    VirtualOutlineNode facetDefinitionOutlineNode = null;
    VirtualOutlineNode facetedQueryDefinitionOutlineNode = null;
    VirtualOutlineNode indexDefinitionOutlineNode = null;
    EList<Element> _elements = model.getElements();
    for (final Element element : _elements) {
      if ((Objects.equal(element.eClass(), VertigoDslPackage.Literals.DOMAIN) || Objects.equal(element.eClass(), VertigoDslPackage.Literals.DECLARED_DOMAIN))) {
        if ((domainOutlineNode == null)) {
          Image _image = this.imageHelper.getImage("domain.png");
          VirtualOutlineNode _virtualOutlineNode = new VirtualOutlineNode(parentNode, _image, "Domains", false);
          domainOutlineNode = _virtualOutlineNode;
        }
        this.createNode(domainOutlineNode, element);
      } else {
        if ((Objects.equal(element.eClass(), VertigoDslPackage.Literals.DT_DEFINITION_ACTION) || Objects.equal(element.eClass(), VertigoDslPackage.Literals.DECLARED_DT_DEFINITION))) {
          if ((dtDefinitionOutlineNode == null)) {
            Image _image_1 = this.imageHelper.getImage("dtdefinition.png");
            VirtualOutlineNode _virtualOutlineNode_1 = new VirtualOutlineNode(parentNode, _image_1, "Dt Definitions", false);
            dtDefinitionOutlineNode = _virtualOutlineNode_1;
          }
          this.createNode(dtDefinitionOutlineNode, element);
        } else {
          EClass _eClass = element.eClass();
          boolean _equals = Objects.equal(_eClass, VertigoDslPackage.Literals.ASSOCIATION);
          if (_equals) {
            if ((associationOutlineNode == null)) {
              Image _image_2 = this.imageHelper.getImage("assoc.png");
              VirtualOutlineNode _virtualOutlineNode_2 = new VirtualOutlineNode(parentNode, _image_2, "Associations", false);
              associationOutlineNode = _virtualOutlineNode_2;
            }
            this.createNode(associationOutlineNode, element);
          } else {
            EClass _eClass_1 = element.eClass();
            boolean _equals_1 = Objects.equal(_eClass_1, VertigoDslPackage.Literals.TASK_DEFINITION);
            if (_equals_1) {
              if ((taskOutlineNode == null)) {
                Image _image_3 = this.imageHelper.getImage("gear.png");
                VirtualOutlineNode _virtualOutlineNode_3 = new VirtualOutlineNode(parentNode, _image_3, "Tasks", false);
                taskOutlineNode = _virtualOutlineNode_3;
              }
              this.createNode(taskOutlineNode, element);
            } else {
              EClass _eClass_2 = element.eClass();
              boolean _equals_2 = Objects.equal(_eClass_2, VertigoDslPackage.Literals.FILE_INFO);
              if (_equals_2) {
                if ((fileInfoOutlineNode == null)) {
                  Image _image_4 = this.imageHelper.getImage("file.png");
                  VirtualOutlineNode _virtualOutlineNode_4 = new VirtualOutlineNode(parentNode, _image_4, "File Infos", false);
                  fileInfoOutlineNode = _virtualOutlineNode_4;
                }
                this.createNode(fileInfoOutlineNode, element);
              } else {
                EClass _eClass_3 = element.eClass();
                boolean _equals_3 = Objects.equal(_eClass_3, VertigoDslPackage.Literals.FACET_DEFINITION_ACTION);
                if (_equals_3) {
                  if ((facetDefinitionOutlineNode == null)) {
                    Image _image_5 = this.imageHelper.getImage("file.png");
                    VirtualOutlineNode _virtualOutlineNode_5 = new VirtualOutlineNode(parentNode, _image_5, "Facet Definitions", false);
                    facetDefinitionOutlineNode = _virtualOutlineNode_5;
                  }
                  this.createNode(facetDefinitionOutlineNode, element);
                } else {
                  EClass _eClass_4 = element.eClass();
                  boolean _equals_4 = Objects.equal(_eClass_4, VertigoDslPackage.Literals.FACETED_QUERY_DEFINITION_ACTION);
                  if (_equals_4) {
                    if ((facetedQueryDefinitionOutlineNode == null)) {
                      Image _image_6 = this.imageHelper.getImage("file.png");
                      VirtualOutlineNode _virtualOutlineNode_6 = new VirtualOutlineNode(parentNode, _image_6, "Faceted Query Definitions", false);
                      facetedQueryDefinitionOutlineNode = _virtualOutlineNode_6;
                    }
                    this.createNode(facetedQueryDefinitionOutlineNode, element);
                  } else {
                    EClass _eClass_5 = element.eClass();
                    boolean _equals_5 = Objects.equal(_eClass_5, VertigoDslPackage.Literals.INDEX_DEFINITION_ACTION);
                    if (_equals_5) {
                      if ((indexDefinitionOutlineNode == null)) {
                        Image _image_7 = this.imageHelper.getImage("file.png");
                        VirtualOutlineNode _virtualOutlineNode_7 = new VirtualOutlineNode(parentNode, _image_7, "Index Definitions", false);
                        indexDefinitionOutlineNode = _virtualOutlineNode_7;
                      }
                      this.createNode(indexDefinitionOutlineNode, element);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
