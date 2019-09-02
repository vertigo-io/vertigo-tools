package io.vertigo.dsl.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class VertigoDslHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String SQL_KEYWORD_ID = "sql-keyword";
	public static final String SQL_PARAMETER_ID = "sql-parameter";
	public static final String SQL_TABLE_FIELD_ID = "sql-table-field";
	
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(SQL_KEYWORD_ID, "sql-keyword", sqlKeywordStyle());
		acceptor.acceptDefaultHighlighting(SQL_PARAMETER_ID, "sql-parameter", sqlParameterStyle());
		acceptor.acceptDefaultHighlighting(SQL_TABLE_FIELD_ID, "sql-table-field", sqlTableFieldStyle());

	}


	private TextStyle sqlKeywordStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(0, 153, 153));
        return textStyle;
	}
	
	private TextStyle sqlParameterStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setColor(new RGB(255, 116, 0));
        return textStyle;
	}
	
	private TextStyle sqlTableFieldStyle() {
        TextStyle textStyle = super.stringTextStyle();
        textStyle.setStyle(SWT.BOLD);
        return textStyle;
	}

}

