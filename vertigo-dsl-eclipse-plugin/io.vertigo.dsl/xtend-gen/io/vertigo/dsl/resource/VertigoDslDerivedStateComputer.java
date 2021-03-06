package io.vertigo.dsl.resource;

import io.vertigo.dsl.vertigoDsl.DeclaredDomain;
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction;
import io.vertigo.dsl.vertigoDsl.Element;
import io.vertigo.dsl.vertigoDsl.VertigoDslFactory;
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage;
import io.vertigo.dsl.vertigoDsl.impl.ModelImpl;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class VertigoDslDerivedStateComputer implements IDerivedStateComputer {
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    final Set<String> addedDomains = new HashSet<String>();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject obj : _iterable) {
      if ((obj instanceof DtDefinitionAction)) {
        String _string = ((DtDefinitionAction)obj).getName().toString();
        String _plus = ("Do" + _string);
        addedDomains.add(_plus);
      }
    }
    final List<EObject> derived = CollectionLiterals.<EObject>newArrayList();
    if (((!resource.getContents().isEmpty()) && (resource.getContents().get(0) instanceof ModelImpl))) {
      EObject _get = resource.getContents().get(0);
      final ModelImpl myModelImpl = ((ModelImpl) _get);
      for (final String item : addedDomains) {
        final Function1<Element, Boolean> _function = (Element it) -> {
          return Boolean.valueOf(((it instanceof DeclaredDomain) && ((DeclaredDomain) it).getName().equals(item)));
        };
        final Consumer<Element> _function_1 = (Element declaredDomain) -> {
          derived.add(declaredDomain);
        };
        IterableExtensions.<Element>filter(myModelImpl.getElements(), _function).forEach(_function_1);
      }
      resource.getContents().removeAll(derived);
    }
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    final Set<String> addedDomains = new HashSet<String>();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject obj : _iterable) {
      if ((obj instanceof DtDefinitionAction)) {
        String _string = ((DtDefinitionAction)obj).getName().toString();
        String _plus = ("Do" + _string);
        addedDomains.add(_plus);
      }
    }
    EObject _get = resource.getContents().get(0);
    if ((_get instanceof ModelImpl)) {
      EObject _get_1 = resource.getContents().get(0);
      final ModelImpl myModelImpl = ((ModelImpl) _get_1);
      for (final String item : addedDomains) {
        {
          EObject _create = VertigoDslFactory.eINSTANCE.create(VertigoDslPackage.Literals.DECLARED_DOMAIN);
          final DeclaredDomain someObject = ((DeclaredDomain) _create);
          someObject.setName(item);
          final Function1<Element, Boolean> _function = (Element it) -> {
            return Boolean.valueOf(((it instanceof DeclaredDomain) && ((DeclaredDomain) it).getName().equals(someObject.getName())));
          };
          boolean _exists = IterableExtensions.<Element>exists(myModelImpl.getElements(), _function);
          boolean _not = (!_exists);
          if (_not) {
            myModelImpl.getElements().add(someObject);
          }
        }
      }
    }
  }
}
