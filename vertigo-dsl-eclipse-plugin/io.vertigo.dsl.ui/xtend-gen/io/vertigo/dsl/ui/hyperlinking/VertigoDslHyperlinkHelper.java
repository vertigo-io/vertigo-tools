package io.vertigo.dsl.ui.hyperlinking;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import io.vertigo.dsl.ui.hyperlinking.VertigoDslDtDefinitionHyperlink;
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

@SuppressWarnings("all")
public class VertigoDslHyperlinkHelper extends HyperlinkHelper {
  @Inject
  private EObjectAtOffsetHelper eObjectAtOffsetHelper;
  
  @Override
  public void createHyperlinksByOffset(final XtextResource resource, final int offset, final IHyperlinkAcceptor acceptor) {
    final EObject eObject = this.eObjectAtOffsetHelper.resolveElementAt(resource, offset);
    if ((eObject != null)) {
      if ((eObject instanceof DtDefinitionAction)) {
        final INode node = NodeModelUtils.findActualNodeFor(eObject);
        if ((node != null)) {
          final INode leaf = NodeModelUtils.findLeafNodeAtOffset(node, offset);
          if ((leaf != null)) {
            EClass _eClass = leaf.getGrammarElement().eClass();
            boolean _equals = Objects.equal(_eClass, VertigoDslPackage.Literals.DT_DEFINITION_ACTION__NAME);
            if (_equals) {
              int _offset = leaf.getOffset();
              int _length = leaf.getLength();
              Region _region = new Region(_offset, _length);
              final VertigoDslDtDefinitionHyperlink result = new VertigoDslDtDefinitionHyperlink(_region);
              acceptor.accept(result);
            }
          }
        }
      }
    }
    super.createHyperlinksByOffset(resource, offset, acceptor);
  }
}
