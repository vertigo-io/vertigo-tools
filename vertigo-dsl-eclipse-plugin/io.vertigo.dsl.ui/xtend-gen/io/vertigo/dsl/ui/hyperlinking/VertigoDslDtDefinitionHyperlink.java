package io.vertigo.dsl.ui.hyperlinking;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.PreferencesUtil;

@SuppressWarnings("all")
public class VertigoDslDtDefinitionHyperlink implements IHyperlink {
  private IRegion myRegion;
  
  public VertigoDslDtDefinitionHyperlink(final IRegion region) {
    this.myRegion = region;
  }
  
  @Override
  public IRegion getHyperlinkRegion() {
    return this.myRegion;
  }
  
  @Override
  public String getHyperlinkText() {
    return "Open Java Entity";
  }
  
  @Override
  public String getTypeLabel() {
    return "mytypelabel";
  }
  
  @Override
  public void open() {
    PreferencesUtil.createPreferenceDialogOn(Display.getDefault().getActiveShell(), null, null, null).open();
  }
}
