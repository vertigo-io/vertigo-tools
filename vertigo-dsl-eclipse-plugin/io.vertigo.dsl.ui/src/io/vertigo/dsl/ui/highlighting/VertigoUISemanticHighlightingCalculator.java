package io.vertigo.dsl.ui.highlighting;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

import io.vertigo.dsl.services.VertigoDslGrammarAccess;


public class VertigoUISemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	
	private final static List<String> SQL_KEYWORDS = Arrays.asList("ADD",
																	"ADD CONSTRAINT", 
																	"ALTER", 
																	"ALTER COLUMN",
																	"ALTER TABLE", 
																	"ALL", 
																	"AND", 
																	"ANY", 
																	"AS", 
																	"ASC", 
																	"BACKUP DATABASE", 
																	"BETWEEN", 
																	"CASE", 
																	"CHECK", 
																	"COLUMN", 
																	"CONSTRAINT", 
																	"CREATE", 
																	"CREATE DATABASE", 
																	"CREATE INDEX", 
																	"CREATE OR REPLACE VIEW", 
																	"CREATE TABLE", 
																	"CREATE PROCEDURE", 
																	"CREATE UNIQUE INDEX", 
																	"CREATE VIEW", 
																	"DATABASE",
																	"DEFAULT",
																	"DELETE",
																	"DESC",
																	"DISTINCT",
																	"DROP COLUMN",
																	"DROP CONSTRAINT",
																	"DROP DATABASE",
																	"DROP DEFAULT",
																	"DROP INDEX",
																	"DROP TABLE",
																	"DROP VIEW",
																	"EXEC",
																	"EXISTS",
																	"FOREIGN KEY",
																	"FROM",
																	"FULL OUTER JOIN",
																	"GROUP BY",
																	"HAVING",
																	"IN",
																	"INDEX",
																	"INNER JOIN",
																	"INSERT INTO",
																	"INSERT INTO SELECT",
																	"IS NULL",
																	"IS NOT NULL",
																	"JOIN",
																	"LEFT JOIN",
																	"LIKE",
																	"LIMIT",
																	"NOT",
																	"NOT NULL",
																	"OR",
																	"ORDER BY",
																	"OUTER JOIN",
																	"PRIMARY KEY",
																	"PROCEDURE",
																	"RIGHT JOIN",
																	"ROWNUM",
																	"SELECT",
																	"SELECT DISTINCT",
																	"SELECT INTO",
																	"SELECT TOP",
																	"SET",
																	"TOP",
																	"TRUNCATE TABLE",
																	"UNION",
																	"UNION ALL",
																	"UPDATE",
																	"VALUES",
																	"VIEW",
																	"WHERE"
																	); 
	
	@Inject
	private VertigoDslGrammarAccess grammarAccess;	
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {

		if(resource == null || resource.getParseResult() == null) {
			return;
		}

		INode root = resource.getParseResult().getRootNode();
		for(INode node : root.getAsTreeIterable()) {
			EObject grammarElement = node.getGrammarElement(); 
			
			if (grammarElement != null) {
				if(grammarElement instanceof Keyword){
					if (grammarAccess.getKEYWORDIDAccess().getKeywordIDDomainKeyword_0_1().equals(grammarElement)) {
						acceptor.addPosition(node.getOffset(), node.getLength(), DefaultHighlightingConfiguration.DEFAULT_ID);
					}
				}
				
				if(grammarElement instanceof RuleCall) {
					AbstractRule ruleCall = ((RuleCall) grammarElement).getRule();
					if (ruleCall.getName().equals("TaskRequestString")) {
						highlightSqlInNode(acceptor, node);
						highlightSqlTableFieldsInNode(acceptor, node);
						highlightVertigoParameterInNode(acceptor, node);
					}
				}
			}
		}
	}

	private void highlightSqlInNode(IHighlightedPositionAcceptor positionAcceptor, INode node) {
		Assert.isNotNull(node);
		Assert.isNotNull(positionAcceptor);
		
		String text = node.getText();
		Map<Integer, Integer> sqlKeywordPositionMap = getKeywordPositionMap(text, SQL_KEYWORDS); 
		for (Entry<Integer, Integer> mapEntry : sqlKeywordPositionMap.entrySet()) {
			positionAcceptor.addPosition(node.getOffset() + mapEntry.getKey() - 1, mapEntry.getValue(), VertigoDslHighlightingConfiguration.SQL_KEYWORD_ID);
		}
	}
	
	private void highlightVertigoParameterInNode(IHighlightedPositionAcceptor positionAcceptor, INode node) {
		Assert.isNotNull(node);
		Assert.isNotNull(positionAcceptor);
		
		String text = node.getText();
		Map<Integer, Integer> parameterPositionMap = getParameterPositionMap(text); 
		for (Entry<Integer, Integer> mapEntry : parameterPositionMap.entrySet()) {
			positionAcceptor.addPosition(node.getOffset() + mapEntry.getKey() - 1, mapEntry.getValue(), VertigoDslHighlightingConfiguration.SQL_PARAMETER_ID);
		}
		
	}
	
	private void highlightSqlTableFieldsInNode(IHighlightedPositionAcceptor positionAcceptor, INode node) {
		Assert.isNotNull(node);
		Assert.isNotNull(positionAcceptor);
		
		String text = node.getText();
		Map<Integer, Integer> parameterPositionMap = getSqlTableFieldPositionMap(text); 
		for (Entry<Integer, Integer> mapEntry : parameterPositionMap.entrySet()) {
			positionAcceptor.addPosition(node.getOffset() + mapEntry.getKey() - 1, mapEntry.getValue(), VertigoDslHighlightingConfiguration.SQL_TABLE_FIELD_ID);
		}
	}
	
	private static Map<Integer, Integer> getKeywordPositionMap(String stringToParse, List<String> keywordsToFind) {
		Map<Integer,Integer> keywordOffsetsAndLength = new HashMap<Integer, Integer>();
		for (String keyword : keywordsToFind) {
			String wholeWordPattern = "\\b" + keyword + "\\b";
			Pattern pattern = Pattern.compile(wholeWordPattern,Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(stringToParse);
			while (matcher.find()) {
				keywordOffsetsAndLength.put(matcher.start(), keyword.length());
			}
			
		}
		return keywordOffsetsAndLength;
	}
	
	private static Map<Integer, Integer> getParameterPositionMap(String stringToParse) {
		Map<Integer,Integer> keywordOffsetsAndLength = new HashMap<Integer, Integer>();
		String parameterPattern = "#[0-9a-zA-Z\\._]*#";
		Pattern pattern = Pattern.compile(parameterPattern,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stringToParse);
		while (matcher.find()) {
			keywordOffsetsAndLength.put(matcher.start(), matcher.end() - matcher.start());
		}
			
		return keywordOffsetsAndLength;
	}
	
	// 
	private static Map<Integer, Integer> getSqlTableFieldPositionMap(String stringToParse) {
		Map<Integer,Integer> keywordOffsetsAndLength = new HashMap<Integer, Integer>();
		String parameterPattern = "\\.(\\w)*\\b";
		Pattern pattern = Pattern.compile(parameterPattern,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(stringToParse);
		while (matcher.find()) {
			keywordOffsetsAndLength.put(matcher.start() + 1, matcher.end() - matcher.start() - 1);
		}
			
		return keywordOffsetsAndLength;
	}
	
}
