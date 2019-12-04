package io.vertigo.dsl.resource

import io.vertigo.dsl.vertigoDsl.DeclaredDomain
import io.vertigo.dsl.vertigoDsl.DtDefinitionAction
import io.vertigo.dsl.vertigoDsl.VertigoDslFactory
import io.vertigo.dsl.vertigoDsl.VertigoDslPackage
import io.vertigo.dsl.vertigoDsl.impl.ModelImpl
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.resource.IDerivedStateComputer

class VertigoDslDerivedStateComputer implements IDerivedStateComputer {
	
	override discardDerivedState(DerivedStateAwareResource resource) {
		// Nothing
	}
	
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
			val Set<String> addedDomains = new HashSet<String>();
			
			for (EObject obj : resource.allContents.toIterable) {
				if (obj instanceof DtDefinitionAction) {
					addedDomains.add("Do"+ obj.getName().toString()+"Dto");
					addedDomains.add("Do"+ obj.getName().toString()+"Dtc");
				}
			}
			for (item : addedDomains) {
				val DeclaredDomain someObject = VertigoDslFactory.eINSTANCE.create(VertigoDslPackage.Literals.DECLARED_DOMAIN) as DeclaredDomain
				someObject.name = item
				if (resource.contents.get(0) instanceof ModelImpl) {
					val ModelImpl myModelImpl = resource.contents.get(0) as ModelImpl
					if (!myModelImpl.elements.exists[(it instanceof DeclaredDomain) && (it as DeclaredDomain).name.equals(someObject.name)]) {
						myModelImpl.elements.add(someObject)
					}
				}
			}
	}
	
}