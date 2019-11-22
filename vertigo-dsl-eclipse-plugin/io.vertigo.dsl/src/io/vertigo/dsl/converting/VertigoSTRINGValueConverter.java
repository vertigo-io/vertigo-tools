package io.vertigo.dsl.converting;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.ValueConverterWithValueException;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class VertigoSTRINGValueConverter extends STRINGValueConverter {

	@Override
	protected String toEscapedString(String value) {
		return '"' + Strings.convertToJavaString(value, false) + '"';
	}

	@Override
	public String toValue(String string, INode node) {
		if (string == null)
			return null;
		try {
			if (string.length() == 1) {
				throw new ValueConverterWithValueException(getStringNotClosedMessage(), node, "", null);
			}
			return convertFromString(string, node);
		} catch (IllegalArgumentException e) {
			throw new ValueConverterException(e.getMessage(), node, e);
		}
	}
	
	/**
	 * Converts a string literal (including leading and trailing single or double quote) to a semantic
	 * string value. Recovers from invalid escape sequences and announces the first problem with a
	 * {@link ValueConverterWithValueException}.
	 * 
	 * @since 2.7
	 * @throws ValueConverterWithValueException if the given string is syntactically invalid.
	 * @see Strings#convertFromJavaString(String, boolean)
	 */
	protected String convertFromString(String literal, INode node) throws ValueConverterWithValueException {
		MyImplementation converter = createConverter();
		String result = converter.convertFromJavaString(literal);
		if (converter.errorMessage != null) {
			throw new ValueConverterWithValueException(converter.errorMessage, node, result.toString(), converter.errorIndex,
					converter.errorLength, null);
		}
		return result;
	}

	/**
	 * @since 2.16
	 */
	protected MyImplementation createConverter() {
		return new MyImplementation();
	}
	
	/**
	 * @since 2.16
	 */
	protected class MyImplementation extends STRINGValueConverter.Implementation {
		String errorMessage = null;
		int errorIndex = -1;
		int errorLength = -1;
		int nextIndex = 1;
		
		
		
		
		protected MyImplementation() {}

		
		public String convertFromJavaString(String literal) {
			int idx = literal.indexOf('\\');
			if (idx < 0 && literal.length() > 1 && literal.charAt(0) == literal.charAt(literal.length() - 1)) {
				return literal.substring(1, literal.length() - 1);
			}
			return convertFromJavaString(literal, true, 1, new StringBuilder(literal.length()));
		}
		

		
		
		@Override
		protected String convertFromJavaString(String string, boolean useUnicode, int index, StringBuilder result) {
			int length = string.length();
			while(index < length - 1) {
				nextIndex = index = unescapeCharAndAppendTo(string, useUnicode, index, result);
			}
			if (nextIndex < length) {
				if (nextIndex != length - 1) {
					throw new IllegalStateException();
				}
				char next = string.charAt(nextIndex);
				if (string.charAt(0) != next) {
					result.append(next);
					if (errorMessage == null) {
						if (next == '\\') {
							errorMessage = getInvalidEscapeSequenceMessage();
							errorIndex = nextIndex;
							errorLength = 1;
						} else {
							errorMessage = getStringNotClosedMessage();
						}
					} else {
						errorMessage = getStringNotClosedMessage();
						errorIndex = -1;
						errorLength = -1;
					}
				}
			} else if (nextIndex == length) {
				errorMessage = getStringNotClosedMessage();
			}
			return result.toString();
		}
		
		@Override
		protected boolean isHexSequence(char[] in, int off, int chars) {
			// keep chance to use overridden methods by funneling it through STRINGValueConverter
			return VertigoSTRINGValueConverter.this.isHexSequence(in, off, chars);
		}
		
		@Override
		protected int handleInvalidUnicodeEscapeSequence(String string, int index, StringBuilder result) {
			result.append('u');
			errorMessage = "Invalid unicode";
			errorIndex = index - 2;
			errorLength = 2;
			return index;
		}
		
		@Override
		protected int doUnescapeCharAndAppendTo(String string, boolean useUnicode, int index, StringBuilder result) {
			if (string.length() == index) {
				if (errorMessage == null) {
					errorMessage = getInvalidEscapeSequenceMessage();
					errorIndex = index - 1;
					errorLength = 1;
				}
				return index;
			}
			return myDoUnescapeCharAndAppendTo(string, useUnicode, index, result);
		}
		
		@Override
		protected int handleUnknownEscapeSequence(String string, char c, boolean useUnicode, int index, StringBuilder result) {
			if (errorMessage == null) {
				errorMessage = getInvalidEscapeSequenceMessage();
				errorIndex = index - 2;
				errorLength = 2;
			}
			result.append(c);
			return index;
		}
		
		
		private int myDoUnescapeCharAndAppendTo(String string, boolean useUnicode, int index, StringBuilder result) {
			char c = string.charAt(index++);
			switch(c) {
				case 'b':
					c = '\b';
					break;	
				case 't':
					c = '\t';
					break;
				case 'n':
					c = '\n';
					break;
				case 'f':
					c = '\f';
					break;
				case 'r':
					c = '\r';
					break;
				case '"':
				case '\'':
				case '\\':
				case '.':
					// append as is
					break;
				case 'u':
					if (useUnicode) {
						return unescapeUnicodeSequence(string, index, result);
					}
					// intentional fallThrough
				default:
					return handleUnknownEscapeSequence(string, c, useUnicode, index, result);
			}
			validateAndAppendChar(c, result);
			return index;
		}

	}
		
	/**
	 * @since 2.7
	 */
	protected String getInvalidEscapeSequenceMessage() {
		return "Invalid escape sequence (valid ones are  \\b  \\t  \\n  \\f  \\r  \\\"  \\'  \\\\ )";
	}
	
	/**
	 * @since 2.7
	 */
	protected String getStringNotClosedMessage() {
		return "String literal is not properly closed";
	}
	
	/**
	 * @since 2.7
	 */
	protected boolean isHexSequence(char[] in, int off, int chars) {
		return Implementation.doIsHexSequence(in, off, chars);
	}
}
