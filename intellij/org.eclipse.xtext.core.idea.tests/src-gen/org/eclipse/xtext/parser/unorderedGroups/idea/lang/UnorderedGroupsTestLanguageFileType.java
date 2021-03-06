package org.eclipse.xtext.parser.unorderedGroups.idea.lang;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;

public final class UnorderedGroupsTestLanguageFileType extends LanguageFileType {

	public static final UnorderedGroupsTestLanguageFileType INSTANCE = new UnorderedGroupsTestLanguageFileType();
	
	@NonNls 
	public static final String DEFAULT_EXTENSION = "unorderedgroupstestlanguage";

	private UnorderedGroupsTestLanguageFileType() {
		super(UnorderedGroupsTestLanguageLanguage.INSTANCE);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "UnorderedGroupsTestLanguage files";
	}

	@Override
	public Icon getIcon() {
		return null;
	}

	@Override
	public String getName() {
		return "UnorderedGroupsTestLanguage";
	}

}
