package io.vertigo.dsl.resource

import io.vertigo.dsl.vertigoDsl.DeclaredDomain
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction
import io.vertigo.dsl.vertigoDsl.VertigoDslFactory
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage
import io.vertigo.dsl.vertigoDsl.impl.ModelImpl
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class VertigoDslDerivedStateComputer implements IDerivedStateComputer {
	
	override discardDerivedState(DerivedStateAwareResource resource) {
		val Set<String> addedDomains = new HashSet<String>();
			
		for (EObject obj : resource.allContents.toIterable) {
			if (obj instanceof DtDefinitionAction) {
				addedDomains.add("Do"+ obj.getName().toString());
			}
		}

		val List<EObject> derived = newArrayList();
		
		if (resource.contents.get(0) instanceof ModelImpl) {
			val ModelImpl myModelImpl = resource.contents.get(0) as ModelImpl
			for (item : addedDomains) {
				myModelImpl.elements.filter([(it instanceof DeclaredDomain) && (it as DeclaredDomain).name.equals(item)]).forEach[
					declaredDomain | 
						derived.add(declaredDomain)
				]
			}
			resource.contents.removeAll(derived)
		}
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val Set<String> addedDomains = new HashSet<String>();
		
		for (EObject obj : resource.allContents.toIterable) {
			if (obj instanceof DtDefinitionAction) {
				addedDomains.add("Do"+ obj.getName().toString());
			}
		}
		
		if (resource.contents.get(0) instanceof ModelImpl) {
			val ModelImpl myModelImpl = resource.contents.get(0) as ModelImpl
			for (item : addedDomains) {
				val DeclaredDomain someObject = VertigoDslFactory.eINSTANCE.create(VertigoDslPackage.Literals.DECLARED_DOMAIN) as DeclaredDomain
				someObject.name = item
				if (!myModelImpl.elements.exists[(it instanceof DeclaredDomain) && (it as DeclaredDomain).name.equals(someObject.name)]) {
					myModelImpl.elements.add(someObject)
				}
			}
		}	
	}
	
}