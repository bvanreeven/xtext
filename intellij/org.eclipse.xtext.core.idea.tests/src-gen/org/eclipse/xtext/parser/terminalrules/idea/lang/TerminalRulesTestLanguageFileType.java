package org.eclipse.xtext.parser.terminalrules.idea.lang;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;

public final class TerminalRulesTestLanguageFileType extends LanguageFileType {

	public static final TerminalRulesTestLanguageFileType INSTANCE = new TerminalRulesTestLanguageFileType();
	
	@NonNls 
	public static final String DEFAULT_EXTENSION = "terminalrulestestlanguage";

	private TerminalRulesTestLanguageFileType() {
		super(TerminalRulesTestLanguageLanguage.INSTANCE);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "TerminalRulesTestLanguage files";
	}

	@Override
	public Icon getIcon() {
		return null;
	}

	@Override
	public String getName() {
		return "TerminalRulesTestLanguage";
	}

}
