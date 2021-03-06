package org.eclipse.xtext.valueconverter.idea.lang;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;

public final class QualifiedNameTestLanguageFileType extends LanguageFileType {

	public static final QualifiedNameTestLanguageFileType INSTANCE = new QualifiedNameTestLanguageFileType();
	
	@NonNls 
	public static final String DEFAULT_EXTENSION = "qualifiednametestlanguage";

	private QualifiedNameTestLanguageFileType() {
		super(QualifiedNameTestLanguageLanguage.INSTANCE);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "QualifiedNameTestLanguage files";
	}

	@Override
	public Icon getIcon() {
		return null;
	}

	@Override
	public String getName() {
		return "QualifiedNameTestLanguage";
	}

}
