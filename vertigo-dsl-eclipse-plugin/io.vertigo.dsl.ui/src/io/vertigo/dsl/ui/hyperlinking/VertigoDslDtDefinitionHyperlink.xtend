package io.vertigo.dsl.ui.hyperlinking

import org.eclipse.jface.text.IRegion
import org.eclipse.jface.text.hyperlink.IHyperlink
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.dialogs.PreferencesUtil

class VertigoDslDtDefinitionHyperlink implements IHyperlink {
	
	IRegion myRegion
	
	new(IRegion region) {
		myRegion = region
	}
	
	override getHyperlinkRegion() {
		return myRegion
	}
	
	override getHyperlinkText() {
		return "Open Java Entity"
	}
	
	override getTypeLabel() {
		return "mytypelabel"
	}
	
	override open() {
		 PreferencesUtil.createPreferenceDialogOn(Display.getDefault().getActiveShell(), null, null, null).open();
	}
	
}