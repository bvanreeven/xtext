package org.eclipse.xtext.testlanguages.backtracking.idea.lang;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.testlanguages.backtracking.idea.lang.psi.impl.ExBeeLangTestLanguageFileImpl;
import org.eclipse.xtext.testlanguages.backtracking.services.ExBeeLangTestLanguageGrammarAccess;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;

import com.intellij.psi.tree.IFileElementType;

public class ExBeeLangTestLanguageElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<ExBeeLangTestLanguageFileImpl>>(ExBeeLangTestLanguageLanguage.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final ExBeeLangTestLanguageGrammarAccess GRAMMAR_ACCESS = ExBeeLangTestLanguageLanguage.INSTANCE.getInstance(ExBeeLangTestLanguageGrammarAccess.class);

	private static class DelegateModelFactory {
		public static IGrammarAwareElementType createDelegateModelElementType() {
			return new IGrammarAwareElementType("DelegateModel_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDelegateModelRule());
		}
		public static IGrammarAwareElementType createDelegateModel_ModelParserRuleCallElementType() {
			return new IGrammarAwareElementType("DelegateModel_ModelParserRuleCall_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getDelegateModelAccess().getModelParserRuleCall());
		}
	}

	public static final IGrammarAwareElementType DelegateModel_ELEMENT_TYPE = associate(DelegateModelFactory.createDelegateModelElementType());

	public static final IGrammarAwareElementType DelegateModel_ModelParserRuleCall_ELEMENT_TYPE = associate(DelegateModelFactory.createDelegateModel_ModelParserRuleCallElementType());

	private static class ModelFactory {
		public static IGrammarAwareElementType createModelElementType() {
			return new IGrammarAwareElementType("Model_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelRule());
		}
		public static IGrammarAwareElementType createModel_AlternativesElementType() {
			return new IGrammarAwareElementType("Model_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createModel_UnitsAssignment_0ElementType() {
			return new IGrammarAwareElementType("Model_UnitsAssignment_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getUnitsAssignment_0());
		}
		public static IGrammarAwareElementType createModel_UnitsUnitParserRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("Model_UnitsUnitParserRuleCall_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getUnitsUnitParserRuleCall_0_0());
		}
		public static IGrammarAwareElementType createModel_FunctionsAssignment_1ElementType() {
			return new IGrammarAwareElementType("Model_FunctionsAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getFunctionsAssignment_1());
		}
		public static IGrammarAwareElementType createModel_FunctionsFunctionParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Model_FunctionsFunctionParserRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getFunctionsFunctionParserRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Model_ELEMENT_TYPE = associate(ModelFactory.createModelElementType());

	public static final IGrammarAwareElementType Model_Alternatives_ELEMENT_TYPE = associate(ModelFactory.createModel_AlternativesElementType());

	public static final IGrammarAwareElementType Model_UnitsAssignment_0_ELEMENT_TYPE = associate(ModelFactory.createModel_UnitsAssignment_0ElementType());

	public static final IGrammarAwareElementType Model_UnitsUnitParserRuleCall_0_0_ELEMENT_TYPE = associate(ModelFactory.createModel_UnitsUnitParserRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType Model_FunctionsAssignment_1_ELEMENT_TYPE = associate(ModelFactory.createModel_FunctionsAssignment_1ElementType());

	public static final IGrammarAwareElementType Model_FunctionsFunctionParserRuleCall_1_0_ELEMENT_TYPE = associate(ModelFactory.createModel_FunctionsFunctionParserRuleCall_1_0ElementType());

	private static class UnitFactory {
		public static IGrammarAwareElementType createUnitElementType() {
			return new IGrammarAwareElementType("Unit_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitRule());
		}
		public static IGrammarAwareElementType createUnit_GroupElementType() {
			return new IGrammarAwareElementType("Unit_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup());
		}
		public static IGrammarAwareElementType createUnit_UnitAction_0ElementType() {
			return new IGrammarAwareElementType("Unit_UnitAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getUnitAction_0());
		}
		public static IGrammarAwareElementType createUnit_DocumentationAssignment_1ElementType() {
			return new IGrammarAwareElementType("Unit_DocumentationAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getDocumentationAssignment_1());
		}
		public static IGrammarAwareElementType createUnit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Unit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createUnit_UnitKeyword_2ElementType() {
			return new IGrammarAwareElementType("Unit_UnitKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getUnitKeyword_2());
		}
		public static IGrammarAwareElementType createUnit_NameAssignment_3ElementType() {
			return new IGrammarAwareElementType("Unit_NameAssignment_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getNameAssignment_3());
		}
		public static IGrammarAwareElementType createUnit_NameIDTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("Unit_NameIDTerminalRuleCall_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getNameIDTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createUnit_Group_4ElementType() {
			return new IGrammarAwareElementType("Unit_Group_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createUnit_VersionKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("Unit_VersionKeyword_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getVersionKeyword_4_0());
		}
		public static IGrammarAwareElementType createUnit_VersionAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("Unit_VersionAssignment_4_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getVersionAssignment_4_1());
		}
		public static IGrammarAwareElementType createUnit_VersionIDTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("Unit_VersionIDTerminalRuleCall_4_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getVersionIDTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createUnit_Group_5ElementType() {
			return new IGrammarAwareElementType("Unit_Group_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_5());
		}
		public static IGrammarAwareElementType createUnit_ImplementsKeyword_5_0ElementType() {
			return new IGrammarAwareElementType("Unit_ImplementsKeyword_5_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getImplementsKeyword_5_0());
		}
		public static IGrammarAwareElementType createUnit_ImplementsAssignment_5_1ElementType() {
			return new IGrammarAwareElementType("Unit_ImplementsAssignment_5_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getImplementsAssignment_5_1());
		}
		public static IGrammarAwareElementType createUnit_ImplementsSimpleTypeRefParserRuleCall_5_1_0ElementType() {
			return new IGrammarAwareElementType("Unit_ImplementsSimpleTypeRefParserRuleCall_5_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_1_0());
		}
		public static IGrammarAwareElementType createUnit_Group_5_2ElementType() {
			return new IGrammarAwareElementType("Unit_Group_5_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_5_2());
		}
		public static IGrammarAwareElementType createUnit_CommaKeyword_5_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_CommaKeyword_5_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getCommaKeyword_5_2_0());
		}
		public static IGrammarAwareElementType createUnit_ImplementsAssignment_5_2_1ElementType() {
			return new IGrammarAwareElementType("Unit_ImplementsAssignment_5_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getImplementsAssignment_5_2_1());
		}
		public static IGrammarAwareElementType createUnit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0ElementType() {
			return new IGrammarAwareElementType("Unit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getImplementsSimpleTypeRefParserRuleCall_5_2_1_0());
		}
		public static IGrammarAwareElementType createUnit_LeftCurlyBracketKeyword_6ElementType() {
			return new IGrammarAwareElementType("Unit_LeftCurlyBracketKeyword_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getLeftCurlyBracketKeyword_6());
		}
		public static IGrammarAwareElementType createUnit_UnorderedGroup_7ElementType() {
			return new IGrammarAwareElementType("Unit_UnorderedGroup_7_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getUnorderedGroup_7());
		}
		public static IGrammarAwareElementType createUnit_Group_7_0ElementType() {
			return new IGrammarAwareElementType("Unit_Group_7_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_7_0());
		}
		public static IGrammarAwareElementType createUnit_SourceKeyword_7_0_0ElementType() {
			return new IGrammarAwareElementType("Unit_SourceKeyword_7_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSourceKeyword_7_0_0());
		}
		public static IGrammarAwareElementType createUnit_ColonKeyword_7_0_1ElementType() {
			return new IGrammarAwareElementType("Unit_ColonKeyword_7_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getColonKeyword_7_0_1());
		}
		public static IGrammarAwareElementType createUnit_SourceLocationAssignment_7_0_2ElementType() {
			return new IGrammarAwareElementType("Unit_SourceLocationAssignment_7_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSourceLocationAssignment_7_0_2());
		}
		public static IGrammarAwareElementType createUnit_SourceLocationPathParserRuleCall_7_0_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_SourceLocationPathParserRuleCall_7_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSourceLocationPathParserRuleCall_7_0_2_0());
		}
		public static IGrammarAwareElementType createUnit_SemicolonKeyword_7_0_3ElementType() {
			return new IGrammarAwareElementType("Unit_SemicolonKeyword_7_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSemicolonKeyword_7_0_3());
		}
		public static IGrammarAwareElementType createUnit_Group_7_1ElementType() {
			return new IGrammarAwareElementType("Unit_Group_7_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_7_1());
		}
		public static IGrammarAwareElementType createUnit_OutputKeyword_7_1_0ElementType() {
			return new IGrammarAwareElementType("Unit_OutputKeyword_7_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getOutputKeyword_7_1_0());
		}
		public static IGrammarAwareElementType createUnit_ColonKeyword_7_1_1ElementType() {
			return new IGrammarAwareElementType("Unit_ColonKeyword_7_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getColonKeyword_7_1_1());
		}
		public static IGrammarAwareElementType createUnit_OutputLocationAssignment_7_1_2ElementType() {
			return new IGrammarAwareElementType("Unit_OutputLocationAssignment_7_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getOutputLocationAssignment_7_1_2());
		}
		public static IGrammarAwareElementType createUnit_OutputLocationPathParserRuleCall_7_1_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_OutputLocationPathParserRuleCall_7_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getOutputLocationPathParserRuleCall_7_1_2_0());
		}
		public static IGrammarAwareElementType createUnit_SemicolonKeyword_7_1_3ElementType() {
			return new IGrammarAwareElementType("Unit_SemicolonKeyword_7_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSemicolonKeyword_7_1_3());
		}
		public static IGrammarAwareElementType createUnit_Group_7_2ElementType() {
			return new IGrammarAwareElementType("Unit_Group_7_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_7_2());
		}
		public static IGrammarAwareElementType createUnit_ProvidesKeyword_7_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_ProvidesKeyword_7_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getProvidesKeyword_7_2_0());
		}
		public static IGrammarAwareElementType createUnit_ColonKeyword_7_2_1ElementType() {
			return new IGrammarAwareElementType("Unit_ColonKeyword_7_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getColonKeyword_7_2_1());
		}
		public static IGrammarAwareElementType createUnit_ProvidedCapabilitiesAssignment_7_2_2ElementType() {
			return new IGrammarAwareElementType("Unit_ProvidedCapabilitiesAssignment_7_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getProvidedCapabilitiesAssignment_7_2_2());
		}
		public static IGrammarAwareElementType createUnit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0());
		}
		public static IGrammarAwareElementType createUnit_SemicolonKeyword_7_2_3ElementType() {
			return new IGrammarAwareElementType("Unit_SemicolonKeyword_7_2_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSemicolonKeyword_7_2_3());
		}
		public static IGrammarAwareElementType createUnit_Group_7_3ElementType() {
			return new IGrammarAwareElementType("Unit_Group_7_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_7_3());
		}
		public static IGrammarAwareElementType createUnit_RequiresKeyword_7_3_0ElementType() {
			return new IGrammarAwareElementType("Unit_RequiresKeyword_7_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getRequiresKeyword_7_3_0());
		}
		public static IGrammarAwareElementType createUnit_ColonKeyword_7_3_1ElementType() {
			return new IGrammarAwareElementType("Unit_ColonKeyword_7_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getColonKeyword_7_3_1());
		}
		public static IGrammarAwareElementType createUnit_RequiredCapabilitiesAssignment_7_3_2ElementType() {
			return new IGrammarAwareElementType("Unit_RequiredCapabilitiesAssignment_7_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getRequiredCapabilitiesAssignment_7_3_2());
		}
		public static IGrammarAwareElementType createUnit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0ElementType() {
			return new IGrammarAwareElementType("Unit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getRequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0());
		}
		public static IGrammarAwareElementType createUnit_SemicolonKeyword_7_3_3ElementType() {
			return new IGrammarAwareElementType("Unit_SemicolonKeyword_7_3_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSemicolonKeyword_7_3_3());
		}
		public static IGrammarAwareElementType createUnit_Group_7_4ElementType() {
			return new IGrammarAwareElementType("Unit_Group_7_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getGroup_7_4());
		}
		public static IGrammarAwareElementType createUnit_RequiresKeyword_7_4_0ElementType() {
			return new IGrammarAwareElementType("Unit_RequiresKeyword_7_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getRequiresKeyword_7_4_0());
		}
		public static IGrammarAwareElementType createUnit_EnvKeyword_7_4_1ElementType() {
			return new IGrammarAwareElementType("Unit_EnvKeyword_7_4_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getEnvKeyword_7_4_1());
		}
		public static IGrammarAwareElementType createUnit_ColonKeyword_7_4_2ElementType() {
			return new IGrammarAwareElementType("Unit_ColonKeyword_7_4_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getColonKeyword_7_4_2());
		}
		public static IGrammarAwareElementType createUnit_MetaRequiredCapabilitiesAssignment_7_4_3ElementType() {
			return new IGrammarAwareElementType("Unit_MetaRequiredCapabilitiesAssignment_7_4_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getMetaRequiredCapabilitiesAssignment_7_4_3());
		}
		public static IGrammarAwareElementType createUnit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0ElementType() {
			return new IGrammarAwareElementType("Unit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getMetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0());
		}
		public static IGrammarAwareElementType createUnit_SemicolonKeyword_7_4_4ElementType() {
			return new IGrammarAwareElementType("Unit_SemicolonKeyword_7_4_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getSemicolonKeyword_7_4_4());
		}
		public static IGrammarAwareElementType createUnit_FunctionsAssignment_7_5ElementType() {
			return new IGrammarAwareElementType("Unit_FunctionsAssignment_7_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getFunctionsAssignment_7_5());
		}
		public static IGrammarAwareElementType createUnit_FunctionsFunctionParserRuleCall_7_5_0ElementType() {
			return new IGrammarAwareElementType("Unit_FunctionsFunctionParserRuleCall_7_5_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getFunctionsFunctionParserRuleCall_7_5_0());
		}
		public static IGrammarAwareElementType createUnit_RightCurlyBracketKeyword_8ElementType() {
			return new IGrammarAwareElementType("Unit_RightCurlyBracketKeyword_8_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnitAccess().getRightCurlyBracketKeyword_8());
		}
	}

	public static final IGrammarAwareElementType Unit_ELEMENT_TYPE = associate(UnitFactory.createUnitElementType());

	public static final IGrammarAwareElementType Unit_Group_ELEMENT_TYPE = associate(UnitFactory.createUnit_GroupElementType());

	public static final IGrammarAwareElementType Unit_UnitAction_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_UnitAction_0ElementType());

	public static final IGrammarAwareElementType Unit_DocumentationAssignment_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_DocumentationAssignment_1ElementType());

	public static final IGrammarAwareElementType Unit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType Unit_UnitKeyword_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_UnitKeyword_2ElementType());

	public static final IGrammarAwareElementType Unit_NameAssignment_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_NameAssignment_3ElementType());

	public static final IGrammarAwareElementType Unit_NameIDTerminalRuleCall_3_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_NameIDTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType Unit_Group_4_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_4ElementType());

	public static final IGrammarAwareElementType Unit_VersionKeyword_4_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_VersionKeyword_4_0ElementType());

	public static final IGrammarAwareElementType Unit_VersionAssignment_4_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_VersionAssignment_4_1ElementType());

	public static final IGrammarAwareElementType Unit_VersionIDTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_VersionIDTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType Unit_Group_5_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_5ElementType());

	public static final IGrammarAwareElementType Unit_ImplementsKeyword_5_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_ImplementsKeyword_5_0ElementType());

	public static final IGrammarAwareElementType Unit_ImplementsAssignment_5_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ImplementsAssignment_5_1ElementType());

	public static final IGrammarAwareElementType Unit_ImplementsSimpleTypeRefParserRuleCall_5_1_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_ImplementsSimpleTypeRefParserRuleCall_5_1_0ElementType());

	public static final IGrammarAwareElementType Unit_Group_5_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_5_2ElementType());

	public static final IGrammarAwareElementType Unit_CommaKeyword_5_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_CommaKeyword_5_2_0ElementType());

	public static final IGrammarAwareElementType Unit_ImplementsAssignment_5_2_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ImplementsAssignment_5_2_1ElementType());

	public static final IGrammarAwareElementType Unit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0ElementType());

	public static final IGrammarAwareElementType Unit_LeftCurlyBracketKeyword_6_ELEMENT_TYPE = associate(UnitFactory.createUnit_LeftCurlyBracketKeyword_6ElementType());

	public static final IGrammarAwareElementType Unit_UnorderedGroup_7_ELEMENT_TYPE = associate(UnitFactory.createUnit_UnorderedGroup_7ElementType());

	public static final IGrammarAwareElementType Unit_Group_7_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_7_0ElementType());

	public static final IGrammarAwareElementType Unit_SourceKeyword_7_0_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_SourceKeyword_7_0_0ElementType());

	public static final IGrammarAwareElementType Unit_ColonKeyword_7_0_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ColonKeyword_7_0_1ElementType());

	public static final IGrammarAwareElementType Unit_SourceLocationAssignment_7_0_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_SourceLocationAssignment_7_0_2ElementType());

	public static final IGrammarAwareElementType Unit_SourceLocationPathParserRuleCall_7_0_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_SourceLocationPathParserRuleCall_7_0_2_0ElementType());

	public static final IGrammarAwareElementType Unit_SemicolonKeyword_7_0_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_SemicolonKeyword_7_0_3ElementType());

	public static final IGrammarAwareElementType Unit_Group_7_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_7_1ElementType());

	public static final IGrammarAwareElementType Unit_OutputKeyword_7_1_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_OutputKeyword_7_1_0ElementType());

	public static final IGrammarAwareElementType Unit_ColonKeyword_7_1_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ColonKeyword_7_1_1ElementType());

	public static final IGrammarAwareElementType Unit_OutputLocationAssignment_7_1_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_OutputLocationAssignment_7_1_2ElementType());

	public static final IGrammarAwareElementType Unit_OutputLocationPathParserRuleCall_7_1_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_OutputLocationPathParserRuleCall_7_1_2_0ElementType());

	public static final IGrammarAwareElementType Unit_SemicolonKeyword_7_1_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_SemicolonKeyword_7_1_3ElementType());

	public static final IGrammarAwareElementType Unit_Group_7_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_7_2ElementType());

	public static final IGrammarAwareElementType Unit_ProvidesKeyword_7_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_ProvidesKeyword_7_2_0ElementType());

	public static final IGrammarAwareElementType Unit_ColonKeyword_7_2_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ColonKeyword_7_2_1ElementType());

	public static final IGrammarAwareElementType Unit_ProvidedCapabilitiesAssignment_7_2_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_ProvidedCapabilitiesAssignment_7_2_2ElementType());

	public static final IGrammarAwareElementType Unit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0ElementType());

	public static final IGrammarAwareElementType Unit_SemicolonKeyword_7_2_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_SemicolonKeyword_7_2_3ElementType());

	public static final IGrammarAwareElementType Unit_Group_7_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_7_3ElementType());

	public static final IGrammarAwareElementType Unit_RequiresKeyword_7_3_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_RequiresKeyword_7_3_0ElementType());

	public static final IGrammarAwareElementType Unit_ColonKeyword_7_3_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_ColonKeyword_7_3_1ElementType());

	public static final IGrammarAwareElementType Unit_RequiredCapabilitiesAssignment_7_3_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_RequiredCapabilitiesAssignment_7_3_2ElementType());

	public static final IGrammarAwareElementType Unit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0ElementType());

	public static final IGrammarAwareElementType Unit_SemicolonKeyword_7_3_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_SemicolonKeyword_7_3_3ElementType());

	public static final IGrammarAwareElementType Unit_Group_7_4_ELEMENT_TYPE = associate(UnitFactory.createUnit_Group_7_4ElementType());

	public static final IGrammarAwareElementType Unit_RequiresKeyword_7_4_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_RequiresKeyword_7_4_0ElementType());

	public static final IGrammarAwareElementType Unit_EnvKeyword_7_4_1_ELEMENT_TYPE = associate(UnitFactory.createUnit_EnvKeyword_7_4_1ElementType());

	public static final IGrammarAwareElementType Unit_ColonKeyword_7_4_2_ELEMENT_TYPE = associate(UnitFactory.createUnit_ColonKeyword_7_4_2ElementType());

	public static final IGrammarAwareElementType Unit_MetaRequiredCapabilitiesAssignment_7_4_3_ELEMENT_TYPE = associate(UnitFactory.createUnit_MetaRequiredCapabilitiesAssignment_7_4_3ElementType());

	public static final IGrammarAwareElementType Unit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0ElementType());

	public static final IGrammarAwareElementType Unit_SemicolonKeyword_7_4_4_ELEMENT_TYPE = associate(UnitFactory.createUnit_SemicolonKeyword_7_4_4ElementType());

	public static final IGrammarAwareElementType Unit_FunctionsAssignment_7_5_ELEMENT_TYPE = associate(UnitFactory.createUnit_FunctionsAssignment_7_5ElementType());

	public static final IGrammarAwareElementType Unit_FunctionsFunctionParserRuleCall_7_5_0_ELEMENT_TYPE = associate(UnitFactory.createUnit_FunctionsFunctionParserRuleCall_7_5_0ElementType());

	public static final IGrammarAwareElementType Unit_RightCurlyBracketKeyword_8_ELEMENT_TYPE = associate(UnitFactory.createUnit_RightCurlyBracketKeyword_8ElementType());

	private static class ProvidedCapabilityFactory {
		public static IGrammarAwareElementType createProvidedCapabilityElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityRule());
		}
		public static IGrammarAwareElementType createProvidedCapability_GroupElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getGroup());
		}
		public static IGrammarAwareElementType createProvidedCapability_ProvidedCapabilityAction_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_ProvidedCapabilityAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getProvidedCapabilityAction_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Alternatives_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_NameSpaceAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getNameSpaceAssignment_1_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_UnitKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_UnitKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getUnitKeyword_1_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_Group_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Group_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createProvidedCapability_LeftCurlyBracketKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_LeftCurlyBracketKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getLeftCurlyBracketKeyword_2_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_UnorderedGroup_2_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_UnorderedGroup_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getUnorderedGroup_2_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_Group_2_1_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Group_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getGroup_2_1_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_WhenKeyword_2_1_0_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_WhenKeyword_2_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getWhenKeyword_2_1_0_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_ColonKeyword_2_1_0_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_ColonKeyword_2_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getColonKeyword_2_1_0_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_CondExprAssignment_2_1_0_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_CondExprAssignment_2_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getCondExprAssignment_2_1_0_2());
		}
		public static IGrammarAwareElementType createProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getCondExprExpressionParserRuleCall_2_1_0_2_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_SemicolonKeyword_2_1_0_3ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_SemicolonKeyword_2_1_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_0_3());
		}
		public static IGrammarAwareElementType createProvidedCapability_Group_2_1_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Group_2_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getGroup_2_1_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_NameKeyword_2_1_1_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_NameKeyword_2_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getNameKeyword_2_1_1_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_ColonKeyword_2_1_1_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_ColonKeyword_2_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getColonKeyword_2_1_1_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_NameAssignment_2_1_1_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_NameAssignment_2_1_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getNameAssignment_2_1_1_2());
		}
		public static IGrammarAwareElementType createProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getNameIDTerminalRuleCall_2_1_1_2_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_SemicolonKeyword_2_1_1_3ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_SemicolonKeyword_2_1_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_1_3());
		}
		public static IGrammarAwareElementType createProvidedCapability_Group_2_1_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_Group_2_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getGroup_2_1_2());
		}
		public static IGrammarAwareElementType createProvidedCapability_VersionKeyword_2_1_2_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_VersionKeyword_2_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getVersionKeyword_2_1_2_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_ColonKeyword_2_1_2_1ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_ColonKeyword_2_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getColonKeyword_2_1_2_1());
		}
		public static IGrammarAwareElementType createProvidedCapability_VersionAssignment_2_1_2_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_VersionAssignment_2_1_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getVersionAssignment_2_1_2_2());
		}
		public static IGrammarAwareElementType createProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getVersionIDTerminalRuleCall_2_1_2_2_0());
		}
		public static IGrammarAwareElementType createProvidedCapability_SemicolonKeyword_2_1_2_3ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_SemicolonKeyword_2_1_2_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getSemicolonKeyword_2_1_2_3());
		}
		public static IGrammarAwareElementType createProvidedCapability_RightCurlyBracketKeyword_2_2ElementType() {
			return new IGrammarAwareElementType("ProvidedCapability_RightCurlyBracketKeyword_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getProvidedCapabilityAccess().getRightCurlyBracketKeyword_2_2());
		}
	}

	public static final IGrammarAwareElementType ProvidedCapability_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapabilityElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Group_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_GroupElementType());

	public static final IGrammarAwareElementType ProvidedCapability_ProvidedCapabilityAction_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_ProvidedCapabilityAction_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Alternatives_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_Alternatives_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_NameSpaceAssignment_1_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_UnitKeyword_1_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_UnitKeyword_1_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Group_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_Group_2ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_LeftCurlyBracketKeyword_2_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_LeftCurlyBracketKeyword_2_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_UnorderedGroup_2_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_UnorderedGroup_2_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Group_2_1_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_Group_2_1_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_WhenKeyword_2_1_0_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_WhenKeyword_2_1_0_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_ColonKeyword_2_1_0_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_ColonKeyword_2_1_0_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_CondExprAssignment_2_1_0_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_CondExprAssignment_2_1_0_2ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_SemicolonKeyword_2_1_0_3_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_SemicolonKeyword_2_1_0_3ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Group_2_1_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_Group_2_1_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_NameKeyword_2_1_1_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_NameKeyword_2_1_1_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_ColonKeyword_2_1_1_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_ColonKeyword_2_1_1_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_NameAssignment_2_1_1_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_NameAssignment_2_1_1_2ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_SemicolonKeyword_2_1_1_3_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_SemicolonKeyword_2_1_1_3ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_Group_2_1_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_Group_2_1_2ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_VersionKeyword_2_1_2_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_VersionKeyword_2_1_2_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_ColonKeyword_2_1_2_1_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_ColonKeyword_2_1_2_1ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_VersionAssignment_2_1_2_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_VersionAssignment_2_1_2_2ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_SemicolonKeyword_2_1_2_3_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_SemicolonKeyword_2_1_2_3ElementType());

	public static final IGrammarAwareElementType ProvidedCapability_RightCurlyBracketKeyword_2_2_ELEMENT_TYPE = associate(ProvidedCapabilityFactory.createProvidedCapability_RightCurlyBracketKeyword_2_2ElementType());

	private static class AliasedRequiredCapabilityFactory {
		public static IGrammarAwareElementType createAliasedRequiredCapabilityElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityRule());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_GroupElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Alternatives_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Alternatives_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getAlternatives_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_NameSpaceAssignment_0_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_NameSpaceAssignment_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getNameSpaceAssignment_0_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_0_0_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_UnitKeyword_0_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_UnitKeyword_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getUnitKeyword_0_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_NameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_AsKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_AsKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getAsKeyword_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_AliasAssignment_2_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_AliasAssignment_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getAliasAssignment_2_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getAliasIDTerminalRuleCall_2_1_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_UnorderedGroup_3_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getUnorderedGroup_3_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3_1_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3_1_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_WhenKeyword_3_1_0_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getWhenKeyword_3_1_0_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_ColonKeyword_3_1_0_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_0_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_CondExprAssignment_3_1_0_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_SemicolonKeyword_3_1_0_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3_1_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3_1_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_GreedyAssignment_3_1_1_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_SemicolonKeyword_3_1_1_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3_1_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3_1_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_ColonKeyword_3_1_2_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_2_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_MinAssignment_3_1_2_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getMinAssignment_3_1_2_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_SemicolonKeyword_3_1_2_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3_1_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3_1_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_ColonKeyword_3_1_3_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_3_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_MaxAssignment_3_1_3_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getMaxAssignment_3_1_3_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_SemicolonKeyword_3_1_3_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_Group_3_1_4ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_Group_3_1_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getGroup_3_1_4());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_VersionKeyword_3_1_4_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getVersionKeyword_3_1_4_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_ColonKeyword_3_1_4_1ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getColonKeyword_3_1_4_1());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_SemicolonKeyword_3_1_4_3ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3());
		}
		public static IGrammarAwareElementType createAliasedRequiredCapability_RightCurlyBracketKeyword_3_2ElementType() {
			return new IGrammarAwareElementType("AliasedRequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAliasedRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2());
		}
	}

	public static final IGrammarAwareElementType AliasedRequiredCapability_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapabilityElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_GroupElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Alternatives_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Alternatives_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_NameSpaceAssignment_0_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_NameSpaceAssignment_0_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_UnitKeyword_0_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_UnitKeyword_0_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_NameAssignment_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_AsKeyword_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_AsKeyword_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_AliasAssignment_2_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_AliasAssignment_2_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_UnorderedGroup_3_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_1_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3_1_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_WhenKeyword_3_1_0_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_ColonKeyword_3_1_0_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_CondExprAssignment_3_1_0_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_SemicolonKeyword_3_1_0_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_1_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3_1_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_GreedyAssignment_3_1_1_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_SemicolonKeyword_3_1_1_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_1_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3_1_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_ColonKeyword_3_1_2_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_MinAssignment_3_1_2_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_SemicolonKeyword_3_1_2_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_1_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3_1_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_ColonKeyword_3_1_3_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_MaxAssignment_3_1_3_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_SemicolonKeyword_3_1_3_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_Group_3_1_4_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_Group_3_1_4ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_VersionKeyword_3_1_4_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_ColonKeyword_3_1_4_1ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_SemicolonKeyword_3_1_4_3ElementType());

	public static final IGrammarAwareElementType AliasedRequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE = associate(AliasedRequiredCapabilityFactory.createAliasedRequiredCapability_RightCurlyBracketKeyword_3_2ElementType());

	private static class RequiredCapabilityFactory {
		public static IGrammarAwareElementType createRequiredCapabilityElementType() {
			return new IGrammarAwareElementType("RequiredCapability_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityRule());
		}
		public static IGrammarAwareElementType createRequiredCapability_GroupElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup());
		}
		public static IGrammarAwareElementType createRequiredCapability_RequiredCapabilityAction_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_RequiredCapabilityAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getRequiredCapabilityAction_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Alternatives_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_NameSpaceAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getNameSpaceAssignment_1_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getNameSpaceIDTerminalRuleCall_1_0_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_UnitKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_UnitKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getUnitKeyword_1_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_NameAssignment_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_NameAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getNameAssignment_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_NameIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getNameIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getLeftCurlyBracketKeyword_3_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_UnorderedGroup_3_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getUnorderedGroup_3_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3_1_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3_1_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_WhenKeyword_3_1_0_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getWhenKeyword_3_1_0_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_ColonKeyword_3_1_0_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getColonKeyword_3_1_0_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_CondExprAssignment_3_1_0_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getCondExprAssignment_3_1_0_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getCondExprExpressionParserRuleCall_3_1_0_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_SemicolonKeyword_3_1_0_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_0_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3_1_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3_1_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_GreedyAssignment_3_1_1_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGreedyAssignment_3_1_1_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGreedyGreedyKeyword_3_1_1_0_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_SemicolonKeyword_3_1_1_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_1_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3_1_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3_1_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getRequiresMinKeyword_3_1_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_ColonKeyword_3_1_2_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getColonKeyword_3_1_2_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_MinAssignment_3_1_2_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getMinAssignment_3_1_2_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getMinINTTerminalRuleCall_3_1_2_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_SemicolonKeyword_3_1_2_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_2_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3_1_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3_1_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getRequiresMaxKeyword_3_1_3_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_ColonKeyword_3_1_3_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getColonKeyword_3_1_3_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_MaxAssignment_3_1_3_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getMaxAssignment_3_1_3_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getMaxINTTerminalRuleCall_3_1_3_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_SemicolonKeyword_3_1_3_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_3_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_Group_3_1_4ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_Group_3_1_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getGroup_3_1_4());
		}
		public static IGrammarAwareElementType createRequiredCapability_VersionKeyword_3_1_4_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getVersionKeyword_3_1_4_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_ColonKeyword_3_1_4_1ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getColonKeyword_3_1_4_1());
		}
		public static IGrammarAwareElementType createRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getVersionRangeAssignment_3_1_4_2());
		}
		public static IGrammarAwareElementType createRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getVersionRangeIDTerminalRuleCall_3_1_4_2_0());
		}
		public static IGrammarAwareElementType createRequiredCapability_SemicolonKeyword_3_1_4_3ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getSemicolonKeyword_3_1_4_3());
		}
		public static IGrammarAwareElementType createRequiredCapability_RightCurlyBracketKeyword_3_2ElementType() {
			return new IGrammarAwareElementType("RequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRequiredCapabilityAccess().getRightCurlyBracketKeyword_3_2());
		}
	}

	public static final IGrammarAwareElementType RequiredCapability_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapabilityElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_GroupElementType());

	public static final IGrammarAwareElementType RequiredCapability_RequiredCapabilityAction_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_RequiredCapabilityAction_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Alternatives_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Alternatives_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_NameSpaceAssignment_1_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_UnitKeyword_1_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_UnitKeyword_1_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_NameAssignment_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_NameAssignment_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_NameIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_UnorderedGroup_3_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_1_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3_1_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_WhenKeyword_3_1_0_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_ColonKeyword_3_1_0_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_CondExprAssignment_3_1_0_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_SemicolonKeyword_3_1_0_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_1_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3_1_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_GreedyAssignment_3_1_1_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_SemicolonKeyword_3_1_1_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_1_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3_1_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_ColonKeyword_3_1_2_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_MinAssignment_3_1_2_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_SemicolonKeyword_3_1_2_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_1_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3_1_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_ColonKeyword_3_1_3_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_MaxAssignment_3_1_3_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_SemicolonKeyword_3_1_3_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_Group_3_1_4_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_Group_3_1_4ElementType());

	public static final IGrammarAwareElementType RequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_VersionKeyword_3_1_4_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_ColonKeyword_3_1_4_1ElementType());

	public static final IGrammarAwareElementType RequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType());

	public static final IGrammarAwareElementType RequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType());

	public static final IGrammarAwareElementType RequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_SemicolonKeyword_3_1_4_3ElementType());

	public static final IGrammarAwareElementType RequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE = associate(RequiredCapabilityFactory.createRequiredCapability_RightCurlyBracketKeyword_3_2ElementType());

	private static class PathFactory {
		public static IGrammarAwareElementType createPathElementType() {
			return new IGrammarAwareElementType("Path_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathRule());
		}
		public static IGrammarAwareElementType createPath_AlternativesElementType() {
			return new IGrammarAwareElementType("Path_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createPath_STRINGTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Path_STRINGTerminalRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getSTRINGTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createPath_Group_1ElementType() {
			return new IGrammarAwareElementType("Path_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createPath_SolidusKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("Path_SolidusKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getSolidusKeyword_1_0());
		}
		public static IGrammarAwareElementType createPath_QIDParserRuleCall_1_1ElementType() {
			return new IGrammarAwareElementType("Path_QIDParserRuleCall_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getQIDParserRuleCall_1_1());
		}
		public static IGrammarAwareElementType createPath_Group_1_2ElementType() {
			return new IGrammarAwareElementType("Path_Group_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getGroup_1_2());
		}
		public static IGrammarAwareElementType createPath_SolidusKeyword_1_2_0ElementType() {
			return new IGrammarAwareElementType("Path_SolidusKeyword_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getSolidusKeyword_1_2_0());
		}
		public static IGrammarAwareElementType createPath_QIDParserRuleCall_1_2_1ElementType() {
			return new IGrammarAwareElementType("Path_QIDParserRuleCall_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getQIDParserRuleCall_1_2_1());
		}
		public static IGrammarAwareElementType createPath_SolidusKeyword_1_3ElementType() {
			return new IGrammarAwareElementType("Path_SolidusKeyword_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPathAccess().getSolidusKeyword_1_3());
		}
	}

	public static final IGrammarAwareElementType Path_ELEMENT_TYPE = associate(PathFactory.createPathElementType());

	public static final IGrammarAwareElementType Path_Alternatives_ELEMENT_TYPE = associate(PathFactory.createPath_AlternativesElementType());

	public static final IGrammarAwareElementType Path_STRINGTerminalRuleCall_0_ELEMENT_TYPE = associate(PathFactory.createPath_STRINGTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Path_Group_1_ELEMENT_TYPE = associate(PathFactory.createPath_Group_1ElementType());

	public static final IGrammarAwareElementType Path_SolidusKeyword_1_0_ELEMENT_TYPE = associate(PathFactory.createPath_SolidusKeyword_1_0ElementType());

	public static final IGrammarAwareElementType Path_QIDParserRuleCall_1_1_ELEMENT_TYPE = associate(PathFactory.createPath_QIDParserRuleCall_1_1ElementType());

	public static final IGrammarAwareElementType Path_Group_1_2_ELEMENT_TYPE = associate(PathFactory.createPath_Group_1_2ElementType());

	public static final IGrammarAwareElementType Path_SolidusKeyword_1_2_0_ELEMENT_TYPE = associate(PathFactory.createPath_SolidusKeyword_1_2_0ElementType());

	public static final IGrammarAwareElementType Path_QIDParserRuleCall_1_2_1_ELEMENT_TYPE = associate(PathFactory.createPath_QIDParserRuleCall_1_2_1ElementType());

	public static final IGrammarAwareElementType Path_SolidusKeyword_1_3_ELEMENT_TYPE = associate(PathFactory.createPath_SolidusKeyword_1_3ElementType());

	private static class ParameterListFactory {
		public static IGrammarAwareElementType createParameterListElementType() {
			return new IGrammarAwareElementType("ParameterList_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListRule());
		}
		public static IGrammarAwareElementType createParameterList_GroupElementType() {
			return new IGrammarAwareElementType("ParameterList_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getGroup());
		}
		public static IGrammarAwareElementType createParameterList_ParametersAssignment_0ElementType() {
			return new IGrammarAwareElementType("ParameterList_ParametersAssignment_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getParametersAssignment_0());
		}
		public static IGrammarAwareElementType createParameterList_ParametersFirstParameterParserRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("ParameterList_ParametersFirstParameterParserRuleCall_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getParametersFirstParameterParserRuleCall_0_0());
		}
		public static IGrammarAwareElementType createParameterList_Group_1ElementType() {
			return new IGrammarAwareElementType("ParameterList_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createParameterList_CommaKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("ParameterList_CommaKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getCommaKeyword_1_0());
		}
		public static IGrammarAwareElementType createParameterList_ParametersAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("ParameterList_ParametersAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getParametersAssignment_1_1());
		}
		public static IGrammarAwareElementType createParameterList_ParametersFirstParameterParserRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("ParameterList_ParametersFirstParameterParserRuleCall_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterListAccess().getParametersFirstParameterParserRuleCall_1_1_0());
		}
	}

	public static final IGrammarAwareElementType ParameterList_ELEMENT_TYPE = associate(ParameterListFactory.createParameterListElementType());

	public static final IGrammarAwareElementType ParameterList_Group_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_GroupElementType());

	public static final IGrammarAwareElementType ParameterList_ParametersAssignment_0_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_ParametersAssignment_0ElementType());

	public static final IGrammarAwareElementType ParameterList_ParametersFirstParameterParserRuleCall_0_0_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_ParametersFirstParameterParserRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType ParameterList_Group_1_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_Group_1ElementType());

	public static final IGrammarAwareElementType ParameterList_CommaKeyword_1_0_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_CommaKeyword_1_0ElementType());

	public static final IGrammarAwareElementType ParameterList_ParametersAssignment_1_1_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_ParametersAssignment_1_1ElementType());

	public static final IGrammarAwareElementType ParameterList_ParametersFirstParameterParserRuleCall_1_1_0_ELEMENT_TYPE = associate(ParameterListFactory.createParameterList_ParametersFirstParameterParserRuleCall_1_1_0ElementType());

	private static class FirstParameterFactory {
		public static IGrammarAwareElementType createFirstParameterElementType() {
			return new IGrammarAwareElementType("FirstParameter_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFirstParameterRule());
		}
		public static IGrammarAwareElementType createFirstParameter_AlternativesElementType() {
			return new IGrammarAwareElementType("FirstParameter_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFirstParameterAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createFirstParameter_ClosureParameterParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("FirstParameter_ClosureParameterParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFirstParameterAccess().getClosureParameterParserRuleCall_0());
		}
		public static IGrammarAwareElementType createFirstParameter_ParameterParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("FirstParameter_ParameterParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFirstParameterAccess().getParameterParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType FirstParameter_ELEMENT_TYPE = associate(FirstParameterFactory.createFirstParameterElementType());

	public static final IGrammarAwareElementType FirstParameter_Alternatives_ELEMENT_TYPE = associate(FirstParameterFactory.createFirstParameter_AlternativesElementType());

	public static final IGrammarAwareElementType FirstParameter_ClosureParameterParserRuleCall_0_ELEMENT_TYPE = associate(FirstParameterFactory.createFirstParameter_ClosureParameterParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType FirstParameter_ParameterParserRuleCall_1_ELEMENT_TYPE = associate(FirstParameterFactory.createFirstParameter_ParameterParserRuleCall_1ElementType());

	private static class ParameterFactory {
		public static IGrammarAwareElementType createParameterElementType() {
			return new IGrammarAwareElementType("Parameter_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterRule());
		}
		public static IGrammarAwareElementType createParameter_ExprAssignmentElementType() {
			return new IGrammarAwareElementType("Parameter_ExprAssignment_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterAccess().getExprAssignment());
		}
		public static IGrammarAwareElementType createParameter_ExprExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Parameter_ExprExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterAccess().getExprExpressionParserRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType Parameter_ELEMENT_TYPE = associate(ParameterFactory.createParameterElementType());

	public static final IGrammarAwareElementType Parameter_ExprAssignment_ELEMENT_TYPE = associate(ParameterFactory.createParameter_ExprAssignmentElementType());

	public static final IGrammarAwareElementType Parameter_ExprExpressionParserRuleCall_0_ELEMENT_TYPE = associate(ParameterFactory.createParameter_ExprExpressionParserRuleCall_0ElementType());

	private static class ClosureParameterFactory {
		public static IGrammarAwareElementType createClosureParameterElementType() {
			return new IGrammarAwareElementType("ClosureParameter_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureParameterRule());
		}
		public static IGrammarAwareElementType createClosureParameter_ExprAssignmentElementType() {
			return new IGrammarAwareElementType("ClosureParameter_ExprAssignment_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureParameterAccess().getExprAssignment());
		}
		public static IGrammarAwareElementType createClosureParameter_ExprClosureExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ClosureParameter_ExprClosureExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureParameterAccess().getExprClosureExpressionParserRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType ClosureParameter_ELEMENT_TYPE = associate(ClosureParameterFactory.createClosureParameterElementType());

	public static final IGrammarAwareElementType ClosureParameter_ExprAssignment_ELEMENT_TYPE = associate(ClosureParameterFactory.createClosureParameter_ExprAssignmentElementType());

	public static final IGrammarAwareElementType ClosureParameter_ExprClosureExpressionParserRuleCall_0_ELEMENT_TYPE = associate(ClosureParameterFactory.createClosureParameter_ExprClosureExpressionParserRuleCall_0ElementType());

	private static class ParameterDeclarationFactory {
		public static IGrammarAwareElementType createParameterDeclarationElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationRule());
		}
		public static IGrammarAwareElementType createParameterDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createParameterDeclaration_TypeAssignment_0ElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_TypeAssignment_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationAccess().getTypeAssignment_0());
		}
		public static IGrammarAwareElementType createParameterDeclaration_TypeTypeRefParserRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_TypeTypeRefParserRuleCall_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationAccess().getTypeTypeRefParserRuleCall_0_0());
		}
		public static IGrammarAwareElementType createParameterDeclaration_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_NameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createParameterDeclaration_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("ParameterDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType ParameterDeclaration_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclarationElementType());

	public static final IGrammarAwareElementType ParameterDeclaration_Group_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclaration_GroupElementType());

	public static final IGrammarAwareElementType ParameterDeclaration_TypeAssignment_0_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclaration_TypeAssignment_0ElementType());

	public static final IGrammarAwareElementType ParameterDeclaration_TypeTypeRefParserRuleCall_0_0_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclaration_TypeTypeRefParserRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType ParameterDeclaration_NameAssignment_1_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclaration_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType ParameterDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(ParameterDeclarationFactory.createParameterDeclaration_NameIDTerminalRuleCall_1_0ElementType());

	private static class FunctionFactory {
		public static IGrammarAwareElementType createFunctionElementType() {
			return new IGrammarAwareElementType("Function_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionRule());
		}
		public static IGrammarAwareElementType createFunction_GroupElementType() {
			return new IGrammarAwareElementType("Function_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup());
		}
		public static IGrammarAwareElementType createFunction_DocumentationAssignment_0ElementType() {
			return new IGrammarAwareElementType("Function_DocumentationAssignment_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getDocumentationAssignment_0());
		}
		public static IGrammarAwareElementType createFunction_DocumentationDOCUMENTATIONTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("Function_DocumentationDOCUMENTATIONTerminalRuleCall_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getDocumentationDOCUMENTATIONTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createFunction_VisibilityAssignment_1ElementType() {
			return new IGrammarAwareElementType("Function_VisibilityAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVisibilityAssignment_1());
		}
		public static IGrammarAwareElementType createFunction_VisibilityIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Function_VisibilityIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVisibilityIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createFunction_FinalAssignment_2ElementType() {
			return new IGrammarAwareElementType("Function_FinalAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFinalAssignment_2());
		}
		public static IGrammarAwareElementType createFunction_FinalFinalKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("Function_FinalFinalKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFinalFinalKeyword_2_0());
		}
		public static IGrammarAwareElementType createFunction_FunctionKeyword_3ElementType() {
			return new IGrammarAwareElementType("Function_FunctionKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFunctionKeyword_3());
		}
		public static IGrammarAwareElementType createFunction_ReturnTypeAssignment_4ElementType() {
			return new IGrammarAwareElementType("Function_ReturnTypeAssignment_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getReturnTypeAssignment_4());
		}
		public static IGrammarAwareElementType createFunction_ReturnTypeTypeRefParserRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("Function_ReturnTypeTypeRefParserRuleCall_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getReturnTypeTypeRefParserRuleCall_4_0());
		}
		public static IGrammarAwareElementType createFunction_NameAssignment_5ElementType() {
			return new IGrammarAwareElementType("Function_NameAssignment_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getNameAssignment_5());
		}
		public static IGrammarAwareElementType createFunction_NameIDTerminalRuleCall_5_0ElementType() {
			return new IGrammarAwareElementType("Function_NameIDTerminalRuleCall_5_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getNameIDTerminalRuleCall_5_0());
		}
		public static IGrammarAwareElementType createFunction_Group_6ElementType() {
			return new IGrammarAwareElementType("Function_Group_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_6());
		}
		public static IGrammarAwareElementType createFunction_LeftParenthesisKeyword_6_0ElementType() {
			return new IGrammarAwareElementType("Function_LeftParenthesisKeyword_6_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getLeftParenthesisKeyword_6_0());
		}
		public static IGrammarAwareElementType createFunction_Alternatives_6_1ElementType() {
			return new IGrammarAwareElementType("Function_Alternatives_6_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getAlternatives_6_1());
		}
		public static IGrammarAwareElementType createFunction_Group_6_1_0ElementType() {
			return new IGrammarAwareElementType("Function_Group_6_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_6_1_0());
		}
		public static IGrammarAwareElementType createFunction_ParametersAssignment_6_1_0_0ElementType() {
			return new IGrammarAwareElementType("Function_ParametersAssignment_6_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersAssignment_6_1_0_0());
		}
		public static IGrammarAwareElementType createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0ElementType() {
			return new IGrammarAwareElementType("Function_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_0_0());
		}
		public static IGrammarAwareElementType createFunction_Group_6_1_0_1ElementType() {
			return new IGrammarAwareElementType("Function_Group_6_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_6_1_0_1());
		}
		public static IGrammarAwareElementType createFunction_CommaKeyword_6_1_0_1_0ElementType() {
			return new IGrammarAwareElementType("Function_CommaKeyword_6_1_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getCommaKeyword_6_1_0_1_0());
		}
		public static IGrammarAwareElementType createFunction_ParametersAssignment_6_1_0_1_1ElementType() {
			return new IGrammarAwareElementType("Function_ParametersAssignment_6_1_0_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersAssignment_6_1_0_1_1());
		}
		public static IGrammarAwareElementType createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0ElementType() {
			return new IGrammarAwareElementType("Function_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0());
		}
		public static IGrammarAwareElementType createFunction_Group_6_1_0_2ElementType() {
			return new IGrammarAwareElementType("Function_Group_6_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_6_1_0_2());
		}
		public static IGrammarAwareElementType createFunction_CommaKeyword_6_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("Function_CommaKeyword_6_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getCommaKeyword_6_1_0_2_0());
		}
		public static IGrammarAwareElementType createFunction_VarArgsAssignment_6_1_0_2_1ElementType() {
			return new IGrammarAwareElementType("Function_VarArgsAssignment_6_1_0_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVarArgsAssignment_6_1_0_2_1());
		}
		public static IGrammarAwareElementType createFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0ElementType() {
			return new IGrammarAwareElementType("Function_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0());
		}
		public static IGrammarAwareElementType createFunction_ParametersAssignment_6_1_0_2_2ElementType() {
			return new IGrammarAwareElementType("Function_ParametersAssignment_6_1_0_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersAssignment_6_1_0_2_2());
		}
		public static IGrammarAwareElementType createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0ElementType() {
			return new IGrammarAwareElementType("Function_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0());
		}
		public static IGrammarAwareElementType createFunction_Group_6_1_1ElementType() {
			return new IGrammarAwareElementType("Function_Group_6_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_6_1_1());
		}
		public static IGrammarAwareElementType createFunction_VarArgsAssignment_6_1_1_0ElementType() {
			return new IGrammarAwareElementType("Function_VarArgsAssignment_6_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVarArgsAssignment_6_1_1_0());
		}
		public static IGrammarAwareElementType createFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("Function_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0());
		}
		public static IGrammarAwareElementType createFunction_ParametersAssignment_6_1_1_1ElementType() {
			return new IGrammarAwareElementType("Function_ParametersAssignment_6_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersAssignment_6_1_1_1());
		}
		public static IGrammarAwareElementType createFunction_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0ElementType() {
			return new IGrammarAwareElementType("Function_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getParametersParameterDeclarationParserRuleCall_6_1_1_1_0());
		}
		public static IGrammarAwareElementType createFunction_RightParenthesisKeyword_6_2ElementType() {
			return new IGrammarAwareElementType("Function_RightParenthesisKeyword_6_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getRightParenthesisKeyword_6_2());
		}
		public static IGrammarAwareElementType createFunction_Group_7ElementType() {
			return new IGrammarAwareElementType("Function_Group_7_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_7());
		}
		public static IGrammarAwareElementType createFunction_WhenKeyword_7_0ElementType() {
			return new IGrammarAwareElementType("Function_WhenKeyword_7_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getWhenKeyword_7_0());
		}
		public static IGrammarAwareElementType createFunction_GuardAssignment_7_1ElementType() {
			return new IGrammarAwareElementType("Function_GuardAssignment_7_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGuardAssignment_7_1());
		}
		public static IGrammarAwareElementType createFunction_GuardGuardExpressionParserRuleCall_7_1_0ElementType() {
			return new IGrammarAwareElementType("Function_GuardGuardExpressionParserRuleCall_7_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGuardGuardExpressionParserRuleCall_7_1_0());
		}
		public static IGrammarAwareElementType createFunction_Alternatives_8ElementType() {
			return new IGrammarAwareElementType("Function_Alternatives_8_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getAlternatives_8());
		}
		public static IGrammarAwareElementType createFunction_Group_8_0ElementType() {
			return new IGrammarAwareElementType("Function_Group_8_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getGroup_8_0());
		}
		public static IGrammarAwareElementType createFunction_ColonKeyword_8_0_0ElementType() {
			return new IGrammarAwareElementType("Function_ColonKeyword_8_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getColonKeyword_8_0_0());
		}
		public static IGrammarAwareElementType createFunction_FuncExprAssignment_8_0_1ElementType() {
			return new IGrammarAwareElementType("Function_FuncExprAssignment_8_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFuncExprAssignment_8_0_1());
		}
		public static IGrammarAwareElementType createFunction_FuncExprExpressionParserRuleCall_8_0_1_0ElementType() {
			return new IGrammarAwareElementType("Function_FuncExprExpressionParserRuleCall_8_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFuncExprExpressionParserRuleCall_8_0_1_0());
		}
		public static IGrammarAwareElementType createFunction_SemicolonKeyword_8_0_2ElementType() {
			return new IGrammarAwareElementType("Function_SemicolonKeyword_8_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getSemicolonKeyword_8_0_2());
		}
		public static IGrammarAwareElementType createFunction_FuncExprAssignment_8_1ElementType() {
			return new IGrammarAwareElementType("Function_FuncExprAssignment_8_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFuncExprAssignment_8_1());
		}
		public static IGrammarAwareElementType createFunction_FuncExprBlockExpressionParserRuleCall_8_1_0ElementType() {
			return new IGrammarAwareElementType("Function_FuncExprBlockExpressionParserRuleCall_8_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFunctionAccess().getFuncExprBlockExpressionParserRuleCall_8_1_0());
		}
	}

	public static final IGrammarAwareElementType Function_ELEMENT_TYPE = associate(FunctionFactory.createFunctionElementType());

	public static final IGrammarAwareElementType Function_Group_ELEMENT_TYPE = associate(FunctionFactory.createFunction_GroupElementType());

	public static final IGrammarAwareElementType Function_DocumentationAssignment_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_DocumentationAssignment_0ElementType());

	public static final IGrammarAwareElementType Function_DocumentationDOCUMENTATIONTerminalRuleCall_0_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_DocumentationDOCUMENTATIONTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType Function_VisibilityAssignment_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VisibilityAssignment_1ElementType());

	public static final IGrammarAwareElementType Function_VisibilityIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VisibilityIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType Function_FinalAssignment_2_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FinalAssignment_2ElementType());

	public static final IGrammarAwareElementType Function_FinalFinalKeyword_2_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FinalFinalKeyword_2_0ElementType());

	public static final IGrammarAwareElementType Function_FunctionKeyword_3_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FunctionKeyword_3ElementType());

	public static final IGrammarAwareElementType Function_ReturnTypeAssignment_4_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ReturnTypeAssignment_4ElementType());

	public static final IGrammarAwareElementType Function_ReturnTypeTypeRefParserRuleCall_4_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ReturnTypeTypeRefParserRuleCall_4_0ElementType());

	public static final IGrammarAwareElementType Function_NameAssignment_5_ELEMENT_TYPE = associate(FunctionFactory.createFunction_NameAssignment_5ElementType());

	public static final IGrammarAwareElementType Function_NameIDTerminalRuleCall_5_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_NameIDTerminalRuleCall_5_0ElementType());

	public static final IGrammarAwareElementType Function_Group_6_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_6ElementType());

	public static final IGrammarAwareElementType Function_LeftParenthesisKeyword_6_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_LeftParenthesisKeyword_6_0ElementType());

	public static final IGrammarAwareElementType Function_Alternatives_6_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Alternatives_6_1ElementType());

	public static final IGrammarAwareElementType Function_Group_6_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_6_1_0ElementType());

	public static final IGrammarAwareElementType Function_ParametersAssignment_6_1_0_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersAssignment_6_1_0_0ElementType());

	public static final IGrammarAwareElementType Function_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0ElementType());

	public static final IGrammarAwareElementType Function_Group_6_1_0_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_6_1_0_1ElementType());

	public static final IGrammarAwareElementType Function_CommaKeyword_6_1_0_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_CommaKeyword_6_1_0_1_0ElementType());

	public static final IGrammarAwareElementType Function_ParametersAssignment_6_1_0_1_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersAssignment_6_1_0_1_1ElementType());

	public static final IGrammarAwareElementType Function_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0ElementType());

	public static final IGrammarAwareElementType Function_Group_6_1_0_2_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_6_1_0_2ElementType());

	public static final IGrammarAwareElementType Function_CommaKeyword_6_1_0_2_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_CommaKeyword_6_1_0_2_0ElementType());

	public static final IGrammarAwareElementType Function_VarArgsAssignment_6_1_0_2_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VarArgsAssignment_6_1_0_2_1ElementType());

	public static final IGrammarAwareElementType Function_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0ElementType());

	public static final IGrammarAwareElementType Function_ParametersAssignment_6_1_0_2_2_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersAssignment_6_1_0_2_2ElementType());

	public static final IGrammarAwareElementType Function_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0ElementType());

	public static final IGrammarAwareElementType Function_Group_6_1_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_6_1_1ElementType());

	public static final IGrammarAwareElementType Function_VarArgsAssignment_6_1_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VarArgsAssignment_6_1_1_0ElementType());

	public static final IGrammarAwareElementType Function_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0ElementType());

	public static final IGrammarAwareElementType Function_ParametersAssignment_6_1_1_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersAssignment_6_1_1_1ElementType());

	public static final IGrammarAwareElementType Function_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0ElementType());

	public static final IGrammarAwareElementType Function_RightParenthesisKeyword_6_2_ELEMENT_TYPE = associate(FunctionFactory.createFunction_RightParenthesisKeyword_6_2ElementType());

	public static final IGrammarAwareElementType Function_Group_7_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_7ElementType());

	public static final IGrammarAwareElementType Function_WhenKeyword_7_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_WhenKeyword_7_0ElementType());

	public static final IGrammarAwareElementType Function_GuardAssignment_7_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_GuardAssignment_7_1ElementType());

	public static final IGrammarAwareElementType Function_GuardGuardExpressionParserRuleCall_7_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_GuardGuardExpressionParserRuleCall_7_1_0ElementType());

	public static final IGrammarAwareElementType Function_Alternatives_8_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Alternatives_8ElementType());

	public static final IGrammarAwareElementType Function_Group_8_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_Group_8_0ElementType());

	public static final IGrammarAwareElementType Function_ColonKeyword_8_0_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_ColonKeyword_8_0_0ElementType());

	public static final IGrammarAwareElementType Function_FuncExprAssignment_8_0_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FuncExprAssignment_8_0_1ElementType());

	public static final IGrammarAwareElementType Function_FuncExprExpressionParserRuleCall_8_0_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FuncExprExpressionParserRuleCall_8_0_1_0ElementType());

	public static final IGrammarAwareElementType Function_SemicolonKeyword_8_0_2_ELEMENT_TYPE = associate(FunctionFactory.createFunction_SemicolonKeyword_8_0_2ElementType());

	public static final IGrammarAwareElementType Function_FuncExprAssignment_8_1_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FuncExprAssignment_8_1ElementType());

	public static final IGrammarAwareElementType Function_FuncExprBlockExpressionParserRuleCall_8_1_0_ELEMENT_TYPE = associate(FunctionFactory.createFunction_FuncExprBlockExpressionParserRuleCall_8_1_0ElementType());

	private static class GuardExpressionFactory {
		public static IGrammarAwareElementType createGuardExpressionElementType() {
			return new IGrammarAwareElementType("GuardExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionRule());
		}
		public static IGrammarAwareElementType createGuardExpression_AlternativesElementType() {
			return new IGrammarAwareElementType("GuardExpression_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createGuardExpression_Group_0ElementType() {
			return new IGrammarAwareElementType("GuardExpression_Group_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getGroup_0());
		}
		public static IGrammarAwareElementType createGuardExpression_ColonKeyword_0_0ElementType() {
			return new IGrammarAwareElementType("GuardExpression_ColonKeyword_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getColonKeyword_0_0());
		}
		public static IGrammarAwareElementType createGuardExpression_GuardExprAssignment_0_1ElementType() {
			return new IGrammarAwareElementType("GuardExpression_GuardExprAssignment_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getGuardExprAssignment_0_1());
		}
		public static IGrammarAwareElementType createGuardExpression_GuardExprExpressionParserRuleCall_0_1_0ElementType() {
			return new IGrammarAwareElementType("GuardExpression_GuardExprExpressionParserRuleCall_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getGuardExprExpressionParserRuleCall_0_1_0());
		}
		public static IGrammarAwareElementType createGuardExpression_SemicolonKeyword_0_2ElementType() {
			return new IGrammarAwareElementType("GuardExpression_SemicolonKeyword_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getSemicolonKeyword_0_2());
		}
		public static IGrammarAwareElementType createGuardExpression_GuardExprAssignment_1ElementType() {
			return new IGrammarAwareElementType("GuardExpression_GuardExprAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getGuardExprAssignment_1());
		}
		public static IGrammarAwareElementType createGuardExpression_GuardExprBlockExpressionParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("GuardExpression_GuardExprBlockExpressionParserRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getGuardExpressionAccess().getGuardExprBlockExpressionParserRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType GuardExpression_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpressionElementType());

	public static final IGrammarAwareElementType GuardExpression_Alternatives_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_AlternativesElementType());

	public static final IGrammarAwareElementType GuardExpression_Group_0_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_Group_0ElementType());

	public static final IGrammarAwareElementType GuardExpression_ColonKeyword_0_0_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_ColonKeyword_0_0ElementType());

	public static final IGrammarAwareElementType GuardExpression_GuardExprAssignment_0_1_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_GuardExprAssignment_0_1ElementType());

	public static final IGrammarAwareElementType GuardExpression_GuardExprExpressionParserRuleCall_0_1_0_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_GuardExprExpressionParserRuleCall_0_1_0ElementType());

	public static final IGrammarAwareElementType GuardExpression_SemicolonKeyword_0_2_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_SemicolonKeyword_0_2ElementType());

	public static final IGrammarAwareElementType GuardExpression_GuardExprAssignment_1_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_GuardExprAssignment_1ElementType());

	public static final IGrammarAwareElementType GuardExpression_GuardExprBlockExpressionParserRuleCall_1_0_ELEMENT_TYPE = associate(GuardExpressionFactory.createGuardExpression_GuardExprBlockExpressionParserRuleCall_1_0ElementType());

	private static class AssignmentOperatorFactory {
		public static IGrammarAwareElementType createAssignmentOperatorElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorRule());
		}
		public static IGrammarAwareElementType createAssignmentOperator_AlternativesElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createAssignmentOperator_EqualsSignKeyword_0ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_EqualsSignKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getEqualsSignKeyword_0());
		}
		public static IGrammarAwareElementType createAssignmentOperator_PlusSignEqualsSignKeyword_1ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_PlusSignEqualsSignKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getPlusSignEqualsSignKeyword_1());
		}
		public static IGrammarAwareElementType createAssignmentOperator_HyphenMinusEqualsSignKeyword_2ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_HyphenMinusEqualsSignKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getHyphenMinusEqualsSignKeyword_2());
		}
		public static IGrammarAwareElementType createAssignmentOperator_AsteriskEqualsSignKeyword_3ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_AsteriskEqualsSignKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getAsteriskEqualsSignKeyword_3());
		}
		public static IGrammarAwareElementType createAssignmentOperator_SolidusEqualsSignKeyword_4ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_SolidusEqualsSignKeyword_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getSolidusEqualsSignKeyword_4());
		}
		public static IGrammarAwareElementType createAssignmentOperator_PercentSignEqualsSignKeyword_5ElementType() {
			return new IGrammarAwareElementType("AssignmentOperator_PercentSignEqualsSignKeyword_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentOperatorAccess().getPercentSignEqualsSignKeyword_5());
		}
	}

	public static final IGrammarAwareElementType AssignmentOperator_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperatorElementType());

	public static final IGrammarAwareElementType AssignmentOperator_Alternatives_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_AlternativesElementType());

	public static final IGrammarAwareElementType AssignmentOperator_EqualsSignKeyword_0_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_EqualsSignKeyword_0ElementType());

	public static final IGrammarAwareElementType AssignmentOperator_PlusSignEqualsSignKeyword_1_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_PlusSignEqualsSignKeyword_1ElementType());

	public static final IGrammarAwareElementType AssignmentOperator_HyphenMinusEqualsSignKeyword_2_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_HyphenMinusEqualsSignKeyword_2ElementType());

	public static final IGrammarAwareElementType AssignmentOperator_AsteriskEqualsSignKeyword_3_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_AsteriskEqualsSignKeyword_3ElementType());

	public static final IGrammarAwareElementType AssignmentOperator_SolidusEqualsSignKeyword_4_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_SolidusEqualsSignKeyword_4ElementType());

	public static final IGrammarAwareElementType AssignmentOperator_PercentSignEqualsSignKeyword_5_ELEMENT_TYPE = associate(AssignmentOperatorFactory.createAssignmentOperator_PercentSignEqualsSignKeyword_5ElementType());

	private static class RelationalOperatorFactory {
		public static IGrammarAwareElementType createRelationalOperatorElementType() {
			return new IGrammarAwareElementType("RelationalOperator_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorRule());
		}
		public static IGrammarAwareElementType createRelationalOperator_AlternativesElementType() {
			return new IGrammarAwareElementType("RelationalOperator_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createRelationalOperator_TildeEqualsSignKeyword_0ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_TildeEqualsSignKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getTildeEqualsSignKeyword_0());
		}
		public static IGrammarAwareElementType createRelationalOperator_EqualsSignEqualsSignKeyword_1ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_EqualsSignEqualsSignKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getEqualsSignEqualsSignKeyword_1());
		}
		public static IGrammarAwareElementType createRelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
		}
		public static IGrammarAwareElementType createRelationalOperator_ExclamationMarkEqualsSignKeyword_3ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_ExclamationMarkEqualsSignKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getExclamationMarkEqualsSignKeyword_3());
		}
		public static IGrammarAwareElementType createRelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getExclamationMarkEqualsSignEqualsSignKeyword_4());
		}
		public static IGrammarAwareElementType createRelationalOperator_GreaterThanSignEqualsSignKeyword_5ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_GreaterThanSignEqualsSignKeyword_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_5());
		}
		public static IGrammarAwareElementType createRelationalOperator_LessThanSignEqualsSignKeyword_6ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_LessThanSignEqualsSignKeyword_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_6());
		}
		public static IGrammarAwareElementType createRelationalOperator_GreaterThanSignKeyword_7ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_GreaterThanSignKeyword_7_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getGreaterThanSignKeyword_7());
		}
		public static IGrammarAwareElementType createRelationalOperator_LessThanSignKeyword_8ElementType() {
			return new IGrammarAwareElementType("RelationalOperator_LessThanSignKeyword_8_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalOperatorAccess().getLessThanSignKeyword_8());
		}
	}

	public static final IGrammarAwareElementType RelationalOperator_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperatorElementType());

	public static final IGrammarAwareElementType RelationalOperator_Alternatives_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_AlternativesElementType());

	public static final IGrammarAwareElementType RelationalOperator_TildeEqualsSignKeyword_0_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_TildeEqualsSignKeyword_0ElementType());

	public static final IGrammarAwareElementType RelationalOperator_EqualsSignEqualsSignKeyword_1_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_EqualsSignEqualsSignKeyword_1ElementType());

	public static final IGrammarAwareElementType RelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2ElementType());

	public static final IGrammarAwareElementType RelationalOperator_ExclamationMarkEqualsSignKeyword_3_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_ExclamationMarkEqualsSignKeyword_3ElementType());

	public static final IGrammarAwareElementType RelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4ElementType());

	public static final IGrammarAwareElementType RelationalOperator_GreaterThanSignEqualsSignKeyword_5_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_GreaterThanSignEqualsSignKeyword_5ElementType());

	public static final IGrammarAwareElementType RelationalOperator_LessThanSignEqualsSignKeyword_6_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_LessThanSignEqualsSignKeyword_6ElementType());

	public static final IGrammarAwareElementType RelationalOperator_GreaterThanSignKeyword_7_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_GreaterThanSignKeyword_7ElementType());

	public static final IGrammarAwareElementType RelationalOperator_LessThanSignKeyword_8_ELEMENT_TYPE = associate(RelationalOperatorFactory.createRelationalOperator_LessThanSignKeyword_8ElementType());

	private static class TopLevelExpressionFactory {
		public static IGrammarAwareElementType createTopLevelExpressionElementType() {
			return new IGrammarAwareElementType("TopLevelExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTopLevelExpressionRule());
		}
		public static IGrammarAwareElementType createTopLevelExpression_AlternativesElementType() {
			return new IGrammarAwareElementType("TopLevelExpression_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTopLevelExpressionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTopLevelExpression_VarDeclarationParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TopLevelExpression_VarDeclarationParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTopLevelExpressionAccess().getVarDeclarationParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTopLevelExpression_ValDeclarationParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TopLevelExpression_ValDeclarationParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTopLevelExpressionAccess().getValDeclarationParserRuleCall_1());
		}
		public static IGrammarAwareElementType createTopLevelExpression_AssignmentExpressionParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("TopLevelExpression_AssignmentExpressionParserRuleCall_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTopLevelExpressionAccess().getAssignmentExpressionParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType TopLevelExpression_ELEMENT_TYPE = associate(TopLevelExpressionFactory.createTopLevelExpressionElementType());

	public static final IGrammarAwareElementType TopLevelExpression_Alternatives_ELEMENT_TYPE = associate(TopLevelExpressionFactory.createTopLevelExpression_AlternativesElementType());

	public static final IGrammarAwareElementType TopLevelExpression_VarDeclarationParserRuleCall_0_ELEMENT_TYPE = associate(TopLevelExpressionFactory.createTopLevelExpression_VarDeclarationParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TopLevelExpression_ValDeclarationParserRuleCall_1_ELEMENT_TYPE = associate(TopLevelExpressionFactory.createTopLevelExpression_ValDeclarationParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType TopLevelExpression_AssignmentExpressionParserRuleCall_2_ELEMENT_TYPE = associate(TopLevelExpressionFactory.createTopLevelExpression_AssignmentExpressionParserRuleCall_2ElementType());

	private static class ExpressionFactory {
		public static IGrammarAwareElementType createExpressionElementType() {
			return new IGrammarAwareElementType("Expression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getExpressionRule());
		}
		public static IGrammarAwareElementType createExpression_AssignmentExpressionParserRuleCallElementType() {
			return new IGrammarAwareElementType("Expression_AssignmentExpressionParserRuleCall_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getExpressionAccess().getAssignmentExpressionParserRuleCall());
		}
	}

	public static final IGrammarAwareElementType Expression_ELEMENT_TYPE = associate(ExpressionFactory.createExpressionElementType());

	public static final IGrammarAwareElementType Expression_AssignmentExpressionParserRuleCall_ELEMENT_TYPE = associate(ExpressionFactory.createExpression_AssignmentExpressionParserRuleCallElementType());

	private static class AssignmentExpressionFactory {
		public static IGrammarAwareElementType createAssignmentExpressionElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionRule());
		}
		public static IGrammarAwareElementType createAssignmentExpression_GroupElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createAssignmentExpression_CachedExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_CachedExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getCachedExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createAssignmentExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createAssignmentExpression_AssignmentExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_AssignmentExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getAssignmentExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createAssignmentExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createAssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getFunctionNameAssignmentOperatorParserRuleCall_1_1_0());
		}
		public static IGrammarAwareElementType createAssignmentExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createAssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("AssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAssignmentExpressionAccess().getRightExprAssignmentExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType AssignmentExpression_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpressionElementType());

	public static final IGrammarAwareElementType AssignmentExpression_Group_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_GroupElementType());

	public static final IGrammarAwareElementType AssignmentExpression_CachedExpressionParserRuleCall_0_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_CachedExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_Group_1_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_Group_1ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_AssignmentExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_AssignmentExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType AssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(AssignmentExpressionFactory.createAssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0ElementType());

	private static class VarDeclarationFactory {
		public static IGrammarAwareElementType createVarDeclarationElementType() {
			return new IGrammarAwareElementType("VarDeclaration_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationRule());
		}
		public static IGrammarAwareElementType createVarDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("VarDeclaration_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createVarDeclaration_DefValueAction_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_DefValueAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getDefValueAction_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_FinalAssignment_1ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_FinalAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getFinalAssignment_1());
		}
		public static IGrammarAwareElementType createVarDeclaration_FinalFinalKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getFinalFinalKeyword_1_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_Group_2ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_Group_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createVarDeclaration_Alternatives_2_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_Alternatives_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getAlternatives_2_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_VarKeyword_2_0_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_VarKeyword_2_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getVarKeyword_2_0_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_TypeAssignment_2_0_1ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_TypeAssignment_2_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getTypeAssignment_2_0_1());
		}
		public static IGrammarAwareElementType createVarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getTypeTypeRefParserRuleCall_2_0_1_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_NameAssignment_2_1ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_NameAssignment_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getNameAssignment_2_1());
		}
		public static IGrammarAwareElementType createVarDeclaration_NameIDTerminalRuleCall_2_1_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_NameIDTerminalRuleCall_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getNameIDTerminalRuleCall_2_1_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_Group_3ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_Group_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createVarDeclaration_EqualsSignKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_EqualsSignKeyword_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getEqualsSignKeyword_3_0());
		}
		public static IGrammarAwareElementType createVarDeclaration_ValueExprAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_ValueExprAssignment_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getValueExprAssignment_3_1());
		}
		public static IGrammarAwareElementType createVarDeclaration_ValueExprExpressionParserRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("VarDeclaration_ValueExprExpressionParserRuleCall_3_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getVarDeclarationAccess().getValueExprExpressionParserRuleCall_3_1_0());
		}
	}

	public static final IGrammarAwareElementType VarDeclaration_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclarationElementType());

	public static final IGrammarAwareElementType VarDeclaration_Group_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_GroupElementType());

	public static final IGrammarAwareElementType VarDeclaration_DefValueAction_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_DefValueAction_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_FinalAssignment_1_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_FinalAssignment_1ElementType());

	public static final IGrammarAwareElementType VarDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_FinalFinalKeyword_1_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_Group_2_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_Group_2ElementType());

	public static final IGrammarAwareElementType VarDeclaration_Alternatives_2_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_Alternatives_2_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_VarKeyword_2_0_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_VarKeyword_2_0_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_TypeAssignment_2_0_1_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_TypeAssignment_2_0_1ElementType());

	public static final IGrammarAwareElementType VarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_NameAssignment_2_1_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_NameAssignment_2_1ElementType());

	public static final IGrammarAwareElementType VarDeclaration_NameIDTerminalRuleCall_2_1_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_NameIDTerminalRuleCall_2_1_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_Group_3_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_Group_3ElementType());

	public static final IGrammarAwareElementType VarDeclaration_EqualsSignKeyword_3_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_EqualsSignKeyword_3_0ElementType());

	public static final IGrammarAwareElementType VarDeclaration_ValueExprAssignment_3_1_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_ValueExprAssignment_3_1ElementType());

	public static final IGrammarAwareElementType VarDeclaration_ValueExprExpressionParserRuleCall_3_1_0_ELEMENT_TYPE = associate(VarDeclarationFactory.createVarDeclaration_ValueExprExpressionParserRuleCall_3_1_0ElementType());

	private static class ValDeclarationFactory {
		public static IGrammarAwareElementType createValDeclarationElementType() {
			return new IGrammarAwareElementType("ValDeclaration_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationRule());
		}
		public static IGrammarAwareElementType createValDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("ValDeclaration_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createValDeclaration_DefValueAction_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_DefValueAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getDefValueAction_0());
		}
		public static IGrammarAwareElementType createValDeclaration_FinalAssignment_1ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_FinalAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getFinalAssignment_1());
		}
		public static IGrammarAwareElementType createValDeclaration_FinalFinalKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getFinalFinalKeyword_1_0());
		}
		public static IGrammarAwareElementType createValDeclaration_ImmutableAssignment_2ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_ImmutableAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getImmutableAssignment_2());
		}
		public static IGrammarAwareElementType createValDeclaration_ImmutableValKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_ImmutableValKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getImmutableValKeyword_2_0());
		}
		public static IGrammarAwareElementType createValDeclaration_TypeAssignment_3ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_TypeAssignment_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getTypeAssignment_3());
		}
		public static IGrammarAwareElementType createValDeclaration_TypeTypeRefParserRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_TypeTypeRefParserRuleCall_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getTypeTypeRefParserRuleCall_3_0());
		}
		public static IGrammarAwareElementType createValDeclaration_NameAssignment_4ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_NameAssignment_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getNameAssignment_4());
		}
		public static IGrammarAwareElementType createValDeclaration_NameIDTerminalRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_NameIDTerminalRuleCall_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getNameIDTerminalRuleCall_4_0());
		}
		public static IGrammarAwareElementType createValDeclaration_EqualsSignKeyword_5ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_EqualsSignKeyword_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getEqualsSignKeyword_5());
		}
		public static IGrammarAwareElementType createValDeclaration_ValueExprAssignment_6ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_ValueExprAssignment_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getValueExprAssignment_6());
		}
		public static IGrammarAwareElementType createValDeclaration_ValueExprExpressionParserRuleCall_6_0ElementType() {
			return new IGrammarAwareElementType("ValDeclaration_ValueExprExpressionParserRuleCall_6_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValDeclarationAccess().getValueExprExpressionParserRuleCall_6_0());
		}
	}

	public static final IGrammarAwareElementType ValDeclaration_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclarationElementType());

	public static final IGrammarAwareElementType ValDeclaration_Group_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_GroupElementType());

	public static final IGrammarAwareElementType ValDeclaration_DefValueAction_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_DefValueAction_0ElementType());

	public static final IGrammarAwareElementType ValDeclaration_FinalAssignment_1_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_FinalAssignment_1ElementType());

	public static final IGrammarAwareElementType ValDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_FinalFinalKeyword_1_0ElementType());

	public static final IGrammarAwareElementType ValDeclaration_ImmutableAssignment_2_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_ImmutableAssignment_2ElementType());

	public static final IGrammarAwareElementType ValDeclaration_ImmutableValKeyword_2_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_ImmutableValKeyword_2_0ElementType());

	public static final IGrammarAwareElementType ValDeclaration_TypeAssignment_3_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_TypeAssignment_3ElementType());

	public static final IGrammarAwareElementType ValDeclaration_TypeTypeRefParserRuleCall_3_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_TypeTypeRefParserRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType ValDeclaration_NameAssignment_4_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_NameAssignment_4ElementType());

	public static final IGrammarAwareElementType ValDeclaration_NameIDTerminalRuleCall_4_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_NameIDTerminalRuleCall_4_0ElementType());

	public static final IGrammarAwareElementType ValDeclaration_EqualsSignKeyword_5_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_EqualsSignKeyword_5ElementType());

	public static final IGrammarAwareElementType ValDeclaration_ValueExprAssignment_6_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_ValueExprAssignment_6ElementType());

	public static final IGrammarAwareElementType ValDeclaration_ValueExprExpressionParserRuleCall_6_0_ELEMENT_TYPE = associate(ValDeclarationFactory.createValDeclaration_ValueExprExpressionParserRuleCall_6_0ElementType());

	private static class TypeRefFactory {
		public static IGrammarAwareElementType createTypeRefElementType() {
			return new IGrammarAwareElementType("TypeRef_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTypeRefRule());
		}
		public static IGrammarAwareElementType createTypeRef_AlternativesElementType() {
			return new IGrammarAwareElementType("TypeRef_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTypeRefAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createTypeRef_ClosureTypeRefParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("TypeRef_ClosureTypeRefParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTypeRefAccess().getClosureTypeRefParserRuleCall_0());
		}
		public static IGrammarAwareElementType createTypeRef_SimpleTypeRefParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("TypeRef_SimpleTypeRefParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getTypeRefAccess().getSimpleTypeRefParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType TypeRef_ELEMENT_TYPE = associate(TypeRefFactory.createTypeRefElementType());

	public static final IGrammarAwareElementType TypeRef_Alternatives_ELEMENT_TYPE = associate(TypeRefFactory.createTypeRef_AlternativesElementType());

	public static final IGrammarAwareElementType TypeRef_ClosureTypeRefParserRuleCall_0_ELEMENT_TYPE = associate(TypeRefFactory.createTypeRef_ClosureTypeRefParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType TypeRef_SimpleTypeRefParserRuleCall_1_ELEMENT_TYPE = associate(TypeRefFactory.createTypeRef_SimpleTypeRefParserRuleCall_1ElementType());

	private static class SimpleTypeRefFactory {
		public static IGrammarAwareElementType createSimpleTypeRefElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefRule());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_GroupElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getGroup());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_RawTypeAssignment_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_RawTypeAssignment_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getRawTypeAssignment_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_RawTypeIDTerminalRuleCall_0_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_RawTypeIDTerminalRuleCall_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getRawTypeIDTerminalRuleCall_0_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_Group_1ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_LessThanSignKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_LessThanSignKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getLessThanSignKeyword_1_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_ActualArgumentsListAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_ActualArgumentsListAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_1());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_1_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_Group_1_2ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_Group_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getGroup_1_2());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_CommaKeyword_1_2_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_CommaKeyword_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getCommaKeyword_1_2_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_ActualArgumentsListAssignment_1_2_1ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_ActualArgumentsListAssignment_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getActualArgumentsListAssignment_1_2_1());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getActualArgumentsListIDTerminalRuleCall_1_2_1_0());
		}
		public static IGrammarAwareElementType createSimpleTypeRef_GreaterThanSignKeyword_1_3ElementType() {
			return new IGrammarAwareElementType("SimpleTypeRef_GreaterThanSignKeyword_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSimpleTypeRefAccess().getGreaterThanSignKeyword_1_3());
		}
	}

	public static final IGrammarAwareElementType SimpleTypeRef_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRefElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_Group_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_GroupElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_RawTypeAssignment_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_RawTypeAssignment_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_RawTypeIDTerminalRuleCall_0_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_RawTypeIDTerminalRuleCall_0_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_Group_1_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_Group_1ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_LessThanSignKeyword_1_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_LessThanSignKeyword_1_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_ActualArgumentsListAssignment_1_1_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_ActualArgumentsListAssignment_1_1ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_Group_1_2_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_Group_1_2ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_CommaKeyword_1_2_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_CommaKeyword_1_2_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_ActualArgumentsListAssignment_1_2_1_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_ActualArgumentsListAssignment_1_2_1ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0ElementType());

	public static final IGrammarAwareElementType SimpleTypeRef_GreaterThanSignKeyword_1_3_ELEMENT_TYPE = associate(SimpleTypeRefFactory.createSimpleTypeRef_GreaterThanSignKeyword_1_3ElementType());

	private static class ClosureTypeRefFactory {
		public static IGrammarAwareElementType createClosureTypeRefElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefRule());
		}
		public static IGrammarAwareElementType createClosureTypeRef_GroupElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getGroup());
		}
		public static IGrammarAwareElementType createClosureTypeRef_LeftParenthesisKeyword_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_LeftParenthesisKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getLeftParenthesisKeyword_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Alternatives_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_Group_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Group_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getGroup_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesAssignment_1_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesAssignment_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_0_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_Group_1_0_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Group_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getGroup_1_0_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_CommaKeyword_1_0_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_CommaKeyword_1_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getCommaKeyword_1_0_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesAssignment_1_0_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesAssignment_1_0_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_1_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_1_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_Group_1_0_2ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Group_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getGroup_1_0_2());
		}
		public static IGrammarAwareElementType createClosureTypeRef_CommaKeyword_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_CommaKeyword_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getCommaKeyword_1_0_2_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_VarArgsAssignment_1_0_2_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_VarArgsAssignment_1_0_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getVarArgsAssignment_1_0_2_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesAssignment_1_0_2_2ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesAssignment_1_0_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesAssignment_1_0_2_2());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_0_2_2_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_Group_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_Group_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getGroup_1_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_VarArgsAssignment_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_VarArgsAssignment_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getVarArgsAssignment_1_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getVarArgsFullStopFullStopFullStopKeyword_1_1_0_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesAssignment_1_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesAssignment_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesAssignment_1_1_1());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getParameterTypesIDTerminalRuleCall_1_1_1_0());
		}
		public static IGrammarAwareElementType createClosureTypeRef_RightParenthesisKeyword_2ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_RightParenthesisKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getRightParenthesisKeyword_2());
		}
		public static IGrammarAwareElementType createClosureTypeRef_EqualsSignGreaterThanSignKeyword_3ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_EqualsSignGreaterThanSignKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getEqualsSignGreaterThanSignKeyword_3());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ReturnTypeAssignment_4ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ReturnTypeAssignment_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getReturnTypeAssignment_4());
		}
		public static IGrammarAwareElementType createClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("ClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureTypeRefAccess().getReturnTypeIDTerminalRuleCall_4_0());
		}
	}

	public static final IGrammarAwareElementType ClosureTypeRef_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRefElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Group_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_GroupElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_LeftParenthesisKeyword_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_LeftParenthesisKeyword_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Alternatives_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_Alternatives_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Group_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_Group_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesAssignment_1_0_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesAssignment_1_0_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Group_1_0_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_Group_1_0_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_CommaKeyword_1_0_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_CommaKeyword_1_0_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesAssignment_1_0_1_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesAssignment_1_0_1_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Group_1_0_2_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_Group_1_0_2ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_CommaKeyword_1_0_2_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_CommaKeyword_1_0_2_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_VarArgsAssignment_1_0_2_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_VarArgsAssignment_1_0_2_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesAssignment_1_0_2_2_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesAssignment_1_0_2_2ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_Group_1_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_Group_1_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_VarArgsAssignment_1_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_VarArgsAssignment_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesAssignment_1_1_1_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesAssignment_1_1_1ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_RightParenthesisKeyword_2_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_RightParenthesisKeyword_2ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_EqualsSignGreaterThanSignKeyword_3_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_EqualsSignGreaterThanSignKeyword_3ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ReturnTypeAssignment_4_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ReturnTypeAssignment_4ElementType());

	public static final IGrammarAwareElementType ClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0_ELEMENT_TYPE = associate(ClosureTypeRefFactory.createClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0ElementType());

	private static class CachedExpressionFactory {
		public static IGrammarAwareElementType createCachedExpressionElementType() {
			return new IGrammarAwareElementType("CachedExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionRule());
		}
		public static IGrammarAwareElementType createCachedExpression_AlternativesElementType() {
			return new IGrammarAwareElementType("CachedExpression_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createCachedExpression_Group_0ElementType() {
			return new IGrammarAwareElementType("CachedExpression_Group_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getGroup_0());
		}
		public static IGrammarAwareElementType createCachedExpression_CachedExpressionAction_0_0ElementType() {
			return new IGrammarAwareElementType("CachedExpression_CachedExpressionAction_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getCachedExpressionAction_0_0());
		}
		public static IGrammarAwareElementType createCachedExpression_CachedKeyword_0_1ElementType() {
			return new IGrammarAwareElementType("CachedExpression_CachedKeyword_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getCachedKeyword_0_1());
		}
		public static IGrammarAwareElementType createCachedExpression_ExprAssignment_0_2ElementType() {
			return new IGrammarAwareElementType("CachedExpression_ExprAssignment_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getExprAssignment_0_2());
		}
		public static IGrammarAwareElementType createCachedExpression_ExprOrExpressionParserRuleCall_0_2_0ElementType() {
			return new IGrammarAwareElementType("CachedExpression_ExprOrExpressionParserRuleCall_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getExprOrExpressionParserRuleCall_0_2_0());
		}
		public static IGrammarAwareElementType createCachedExpression_OrExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("CachedExpression_OrExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCachedExpressionAccess().getOrExpressionParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType CachedExpression_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpressionElementType());

	public static final IGrammarAwareElementType CachedExpression_Alternatives_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_AlternativesElementType());

	public static final IGrammarAwareElementType CachedExpression_Group_0_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_Group_0ElementType());

	public static final IGrammarAwareElementType CachedExpression_CachedExpressionAction_0_0_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_CachedExpressionAction_0_0ElementType());

	public static final IGrammarAwareElementType CachedExpression_CachedKeyword_0_1_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_CachedKeyword_0_1ElementType());

	public static final IGrammarAwareElementType CachedExpression_ExprAssignment_0_2_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_ExprAssignment_0_2ElementType());

	public static final IGrammarAwareElementType CachedExpression_ExprOrExpressionParserRuleCall_0_2_0_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_ExprOrExpressionParserRuleCall_0_2_0ElementType());

	public static final IGrammarAwareElementType CachedExpression_OrExpressionParserRuleCall_1_ELEMENT_TYPE = associate(CachedExpressionFactory.createCachedExpression_OrExpressionParserRuleCall_1ElementType());

	private static class OrExpressionFactory {
		public static IGrammarAwareElementType createOrExpressionElementType() {
			return new IGrammarAwareElementType("OrExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionRule());
		}
		public static IGrammarAwareElementType createOrExpression_GroupElementType() {
			return new IGrammarAwareElementType("OrExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createOrExpression_AndExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("OrExpression_AndExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createOrExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("OrExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createOrExpression_OrExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("OrExpression_OrExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getOrExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createOrExpression_VerticalLineVerticalLineKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("OrExpression_VerticalLineVerticalLineKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
		}
		public static IGrammarAwareElementType createOrExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("OrExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createOrExpression_RightExprAndExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("OrExpression_RightExprAndExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOrExpressionAccess().getRightExprAndExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType OrExpression_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpressionElementType());

	public static final IGrammarAwareElementType OrExpression_Group_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_GroupElementType());

	public static final IGrammarAwareElementType OrExpression_AndExpressionParserRuleCall_0_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_AndExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType OrExpression_Group_1_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_Group_1ElementType());

	public static final IGrammarAwareElementType OrExpression_OrExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_OrExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType OrExpression_VerticalLineVerticalLineKeyword_1_1_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_VerticalLineVerticalLineKeyword_1_1ElementType());

	public static final IGrammarAwareElementType OrExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType OrExpression_RightExprAndExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(OrExpressionFactory.createOrExpression_RightExprAndExpressionParserRuleCall_1_2_0ElementType());

	private static class AndExpressionFactory {
		public static IGrammarAwareElementType createAndExpressionElementType() {
			return new IGrammarAwareElementType("AndExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionRule());
		}
		public static IGrammarAwareElementType createAndExpression_GroupElementType() {
			return new IGrammarAwareElementType("AndExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createAndExpression_RelationalExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AndExpression_RelationalExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getRelationalExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createAndExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("AndExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createAndExpression_AndExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("AndExpression_AndExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getAndExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createAndExpression_AmpersandAmpersandKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("AndExpression_AmpersandAmpersandKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
		}
		public static IGrammarAwareElementType createAndExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("AndExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createAndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("AndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAndExpressionAccess().getRightExprRelationalExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType AndExpression_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpressionElementType());

	public static final IGrammarAwareElementType AndExpression_Group_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_GroupElementType());

	public static final IGrammarAwareElementType AndExpression_RelationalExpressionParserRuleCall_0_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_RelationalExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType AndExpression_Group_1_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_Group_1ElementType());

	public static final IGrammarAwareElementType AndExpression_AndExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_AndExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType AndExpression_AmpersandAmpersandKeyword_1_1_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_AmpersandAmpersandKeyword_1_1ElementType());

	public static final IGrammarAwareElementType AndExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType AndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(AndExpressionFactory.createAndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0ElementType());

	private static class RelationalExpressionFactory {
		public static IGrammarAwareElementType createRelationalExpressionElementType() {
			return new IGrammarAwareElementType("RelationalExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionRule());
		}
		public static IGrammarAwareElementType createRelationalExpression_GroupElementType() {
			return new IGrammarAwareElementType("RelationalExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createRelationalExpression_AdditiveExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_AdditiveExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createRelationalExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createRelationalExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createRelationalExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createRelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getFunctionNameRelationalOperatorParserRuleCall_1_1_0());
		}
		public static IGrammarAwareElementType createRelationalExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createRelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("RelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getRelationalExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType RelationalExpression_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpressionElementType());

	public static final IGrammarAwareElementType RelationalExpression_Group_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_GroupElementType());

	public static final IGrammarAwareElementType RelationalExpression_AdditiveExpressionParserRuleCall_0_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_AdditiveExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType RelationalExpression_Group_1_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_Group_1ElementType());

	public static final IGrammarAwareElementType RelationalExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_BinaryOpExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType RelationalExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType RelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0ElementType());

	public static final IGrammarAwareElementType RelationalExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType RelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(RelationalExpressionFactory.createRelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0ElementType());

	private static class AdditiveExpressionFactory {
		public static IGrammarAwareElementType createAdditiveExpressionElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionRule());
		}
		public static IGrammarAwareElementType createAdditiveExpression_GroupElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createAdditiveExpression_MultiplicativeExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_MultiplicativeExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createAdditiveExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createAdditiveExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createAdditiveExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createAdditiveExpression_FunctionNameAlternatives_1_1_0ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getFunctionNameAlternatives_1_1_0());
		}
		public static IGrammarAwareElementType createAdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getFunctionNamePlusSignKeyword_1_1_0_0());
		}
		public static IGrammarAwareElementType createAdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getFunctionNameHyphenMinusKeyword_1_1_0_1());
		}
		public static IGrammarAwareElementType createAdditiveExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createAdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("AdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getAdditiveExpressionAccess().getRightExprMultiplicativeExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType AdditiveExpression_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpressionElementType());

	public static final IGrammarAwareElementType AdditiveExpression_Group_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_GroupElementType());

	public static final IGrammarAwareElementType AdditiveExpression_MultiplicativeExpressionParserRuleCall_0_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_MultiplicativeExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_Group_1_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_Group_1ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_BinaryOpExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_FunctionNameAlternatives_1_1_0ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType AdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(AdditiveExpressionFactory.createAdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0ElementType());

	private static class MultiplicativeExpressionFactory {
		public static IGrammarAwareElementType createMultiplicativeExpressionElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionRule());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_GroupElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_SetExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_SetExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getSetExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_FunctionNameAlternatives_1_1_0ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getFunctionNameAlternatives_1_1_0());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getFunctionNameAsteriskKeyword_1_1_0_0());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getFunctionNameSolidusKeyword_1_1_0_1());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getFunctionNamePercentSignKeyword_1_1_0_2());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createMultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("MultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getMultiplicativeExpressionAccess().getRightExprSetExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType MultiplicativeExpression_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpressionElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_Group_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_GroupElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_SetExpressionParserRuleCall_0_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_SetExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_Group_1_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_Group_1ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_FunctionNameAlternatives_1_1_0ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType MultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(MultiplicativeExpressionFactory.createMultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0ElementType());

	private static class SetExpressionFactory {
		public static IGrammarAwareElementType createSetExpressionElementType() {
			return new IGrammarAwareElementType("SetExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionRule());
		}
		public static IGrammarAwareElementType createSetExpression_GroupElementType() {
			return new IGrammarAwareElementType("SetExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createSetExpression_UnaryOrInfixExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("SetExpression_UnaryOrInfixExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getUnaryOrInfixExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createSetExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("SetExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createSetExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("SetExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getBinaryOpExpressionLeftExprAction_1_0());
		}
		public static IGrammarAwareElementType createSetExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("SetExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createSetExpression_FunctionNameFullStopFullStopKeyword_1_1_0ElementType() {
			return new IGrammarAwareElementType("SetExpression_FunctionNameFullStopFullStopKeyword_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getFunctionNameFullStopFullStopKeyword_1_1_0());
		}
		public static IGrammarAwareElementType createSetExpression_RightExprAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("SetExpression_RightExprAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getRightExprAssignment_1_2());
		}
		public static IGrammarAwareElementType createSetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("SetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getSetExpressionAccess().getRightExprUnaryOrInfixExpressionParserRuleCall_1_2_0());
		}
	}

	public static final IGrammarAwareElementType SetExpression_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpressionElementType());

	public static final IGrammarAwareElementType SetExpression_Group_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_GroupElementType());

	public static final IGrammarAwareElementType SetExpression_UnaryOrInfixExpressionParserRuleCall_0_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_UnaryOrInfixExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType SetExpression_Group_1_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_Group_1ElementType());

	public static final IGrammarAwareElementType SetExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_BinaryOpExpressionLeftExprAction_1_0ElementType());

	public static final IGrammarAwareElementType SetExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType SetExpression_FunctionNameFullStopFullStopKeyword_1_1_0_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_FunctionNameFullStopFullStopKeyword_1_1_0ElementType());

	public static final IGrammarAwareElementType SetExpression_RightExprAssignment_1_2_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_RightExprAssignment_1_2ElementType());

	public static final IGrammarAwareElementType SetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0_ELEMENT_TYPE = associate(SetExpressionFactory.createSetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0ElementType());

	private static class UnaryOrInfixExpressionFactory {
		public static IGrammarAwareElementType createUnaryOrInfixExpressionElementType() {
			return new IGrammarAwareElementType("UnaryOrInfixExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryOrInfixExpressionRule());
		}
		public static IGrammarAwareElementType createUnaryOrInfixExpression_AlternativesElementType() {
			return new IGrammarAwareElementType("UnaryOrInfixExpression_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryOrInfixExpressionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createUnaryOrInfixExpression_PostopExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("UnaryOrInfixExpression_PostopExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryOrInfixExpressionAccess().getPostopExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createUnaryOrInfixExpression_UnaryExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("UnaryOrInfixExpression_UnaryExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryOrInfixExpressionAccess().getUnaryExpressionParserRuleCall_1());
		}
		public static IGrammarAwareElementType createUnaryOrInfixExpression_PreopExpressionParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("UnaryOrInfixExpression_PreopExpressionParserRuleCall_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryOrInfixExpressionAccess().getPreopExpressionParserRuleCall_2());
		}
	}

	public static final IGrammarAwareElementType UnaryOrInfixExpression_ELEMENT_TYPE = associate(UnaryOrInfixExpressionFactory.createUnaryOrInfixExpressionElementType());

	public static final IGrammarAwareElementType UnaryOrInfixExpression_Alternatives_ELEMENT_TYPE = associate(UnaryOrInfixExpressionFactory.createUnaryOrInfixExpression_AlternativesElementType());

	public static final IGrammarAwareElementType UnaryOrInfixExpression_PostopExpressionParserRuleCall_0_ELEMENT_TYPE = associate(UnaryOrInfixExpressionFactory.createUnaryOrInfixExpression_PostopExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType UnaryOrInfixExpression_UnaryExpressionParserRuleCall_1_ELEMENT_TYPE = associate(UnaryOrInfixExpressionFactory.createUnaryOrInfixExpression_UnaryExpressionParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType UnaryOrInfixExpression_PreopExpressionParserRuleCall_2_ELEMENT_TYPE = associate(UnaryOrInfixExpressionFactory.createUnaryOrInfixExpression_PreopExpressionParserRuleCall_2ElementType());

	private static class UnaryExpressionFactory {
		public static IGrammarAwareElementType createUnaryExpressionElementType() {
			return new IGrammarAwareElementType("UnaryExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionRule());
		}
		public static IGrammarAwareElementType createUnaryExpression_GroupElementType() {
			return new IGrammarAwareElementType("UnaryExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createUnaryExpression_UnaryOpExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_UnaryOpExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getUnaryOpExpressionAction_0());
		}
		public static IGrammarAwareElementType createUnaryExpression_FunctionNameAssignment_1ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_FunctionNameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getFunctionNameAssignment_1());
		}
		public static IGrammarAwareElementType createUnaryExpression_FunctionNameAlternatives_1_0ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getFunctionNameAlternatives_1_0());
		}
		public static IGrammarAwareElementType createUnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getFunctionNameExclamationMarkKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createUnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getFunctionNameHyphenMinusKeyword_1_0_1());
		}
		public static IGrammarAwareElementType createUnaryExpression_ExprAssignment_2ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_ExprAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getExprAssignment_2());
		}
		public static IGrammarAwareElementType createUnaryExpression_ExprInfixExpressionParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("UnaryExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getUnaryExpressionAccess().getExprInfixExpressionParserRuleCall_2_0());
		}
	}

	public static final IGrammarAwareElementType UnaryExpression_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpressionElementType());

	public static final IGrammarAwareElementType UnaryExpression_Group_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_GroupElementType());

	public static final IGrammarAwareElementType UnaryExpression_UnaryOpExpressionAction_0_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_UnaryOpExpressionAction_0ElementType());

	public static final IGrammarAwareElementType UnaryExpression_FunctionNameAssignment_1_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_FunctionNameAssignment_1ElementType());

	public static final IGrammarAwareElementType UnaryExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_FunctionNameAlternatives_1_0ElementType());

	public static final IGrammarAwareElementType UnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType UnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1ElementType());

	public static final IGrammarAwareElementType UnaryExpression_ExprAssignment_2_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_ExprAssignment_2ElementType());

	public static final IGrammarAwareElementType UnaryExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE = associate(UnaryExpressionFactory.createUnaryExpression_ExprInfixExpressionParserRuleCall_2_0ElementType());

	private static class PreopExpressionFactory {
		public static IGrammarAwareElementType createPreopExpressionElementType() {
			return new IGrammarAwareElementType("PreopExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionRule());
		}
		public static IGrammarAwareElementType createPreopExpression_GroupElementType() {
			return new IGrammarAwareElementType("PreopExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createPreopExpression_UnaryPreOpExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("PreopExpression_UnaryPreOpExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getUnaryPreOpExpressionAction_0());
		}
		public static IGrammarAwareElementType createPreopExpression_FunctionNameAssignment_1ElementType() {
			return new IGrammarAwareElementType("PreopExpression_FunctionNameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getFunctionNameAssignment_1());
		}
		public static IGrammarAwareElementType createPreopExpression_FunctionNameAlternatives_1_0ElementType() {
			return new IGrammarAwareElementType("PreopExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getFunctionNameAlternatives_1_0());
		}
		public static IGrammarAwareElementType createPreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("PreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createPreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1ElementType() {
			return new IGrammarAwareElementType("PreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0_1());
		}
		public static IGrammarAwareElementType createPreopExpression_ExprAssignment_2ElementType() {
			return new IGrammarAwareElementType("PreopExpression_ExprAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getExprAssignment_2());
		}
		public static IGrammarAwareElementType createPreopExpression_ExprInfixExpressionParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("PreopExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPreopExpressionAccess().getExprInfixExpressionParserRuleCall_2_0());
		}
	}

	public static final IGrammarAwareElementType PreopExpression_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpressionElementType());

	public static final IGrammarAwareElementType PreopExpression_Group_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_GroupElementType());

	public static final IGrammarAwareElementType PreopExpression_UnaryPreOpExpressionAction_0_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_UnaryPreOpExpressionAction_0ElementType());

	public static final IGrammarAwareElementType PreopExpression_FunctionNameAssignment_1_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_FunctionNameAssignment_1ElementType());

	public static final IGrammarAwareElementType PreopExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_FunctionNameAlternatives_1_0ElementType());

	public static final IGrammarAwareElementType PreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType PreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1ElementType());

	public static final IGrammarAwareElementType PreopExpression_ExprAssignment_2_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_ExprAssignment_2ElementType());

	public static final IGrammarAwareElementType PreopExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE = associate(PreopExpressionFactory.createPreopExpression_ExprInfixExpressionParserRuleCall_2_0ElementType());

	private static class PostopExpressionFactory {
		public static IGrammarAwareElementType createPostopExpressionElementType() {
			return new IGrammarAwareElementType("PostopExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionRule());
		}
		public static IGrammarAwareElementType createPostopExpression_GroupElementType() {
			return new IGrammarAwareElementType("PostopExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createPostopExpression_InfixExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("PostopExpression_InfixExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getInfixExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createPostopExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("PostopExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createPostopExpression_UnaryPostOpExpressionExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("PostopExpression_UnaryPostOpExpressionExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getUnaryPostOpExpressionExprAction_1_0());
		}
		public static IGrammarAwareElementType createPostopExpression_FunctionNameAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("PostopExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getFunctionNameAssignment_1_1());
		}
		public static IGrammarAwareElementType createPostopExpression_FunctionNameAlternatives_1_1_0ElementType() {
			return new IGrammarAwareElementType("PostopExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getFunctionNameAlternatives_1_1_0());
		}
		public static IGrammarAwareElementType createPostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0ElementType() {
			return new IGrammarAwareElementType("PostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0());
		}
		public static IGrammarAwareElementType createPostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1ElementType() {
			return new IGrammarAwareElementType("PostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPostopExpressionAccess().getFunctionNamePlusSignPlusSignKeyword_1_1_0_1());
		}
	}

	public static final IGrammarAwareElementType PostopExpression_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpressionElementType());

	public static final IGrammarAwareElementType PostopExpression_Group_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_GroupElementType());

	public static final IGrammarAwareElementType PostopExpression_InfixExpressionParserRuleCall_0_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_InfixExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType PostopExpression_Group_1_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_Group_1ElementType());

	public static final IGrammarAwareElementType PostopExpression_UnaryPostOpExpressionExprAction_1_0_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_UnaryPostOpExpressionExprAction_1_0ElementType());

	public static final IGrammarAwareElementType PostopExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_FunctionNameAssignment_1_1ElementType());

	public static final IGrammarAwareElementType PostopExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_FunctionNameAlternatives_1_1_0ElementType());

	public static final IGrammarAwareElementType PostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0ElementType());

	public static final IGrammarAwareElementType PostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1_ELEMENT_TYPE = associate(PostopExpressionFactory.createPostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1ElementType());

	private static class InfixExpressionFactory {
		public static IGrammarAwareElementType createInfixExpressionElementType() {
			return new IGrammarAwareElementType("InfixExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionRule());
		}
		public static IGrammarAwareElementType createInfixExpression_GroupElementType() {
			return new IGrammarAwareElementType("InfixExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createInfixExpression_CallExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_CallExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getCallExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createInfixExpression_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("InfixExpression_Alternatives_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createInfixExpression_Group_1_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_Group_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getGroup_1_0());
		}
		public static IGrammarAwareElementType createInfixExpression_CallFeatureFuncExprAction_1_0_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_CallFeatureFuncExprAction_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getCallFeatureFuncExprAction_1_0_0());
		}
		public static IGrammarAwareElementType createInfixExpression_FullStopKeyword_1_0_1ElementType() {
			return new IGrammarAwareElementType("InfixExpression_FullStopKeyword_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getFullStopKeyword_1_0_1());
		}
		public static IGrammarAwareElementType createInfixExpression_NameAssignment_1_0_2ElementType() {
			return new IGrammarAwareElementType("InfixExpression_NameAssignment_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getNameAssignment_1_0_2());
		}
		public static IGrammarAwareElementType createInfixExpression_NameIDTerminalRuleCall_1_0_2_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_NameIDTerminalRuleCall_1_0_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getNameIDTerminalRuleCall_1_0_2_0());
		}
		public static IGrammarAwareElementType createInfixExpression_LeftParenthesisKeyword_1_0_3ElementType() {
			return new IGrammarAwareElementType("InfixExpression_LeftParenthesisKeyword_1_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getLeftParenthesisKeyword_1_0_3());
		}
		public static IGrammarAwareElementType createInfixExpression_ParameterListAssignment_1_0_4ElementType() {
			return new IGrammarAwareElementType("InfixExpression_ParameterListAssignment_1_0_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getParameterListAssignment_1_0_4());
		}
		public static IGrammarAwareElementType createInfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getParameterListParameterListParserRuleCall_1_0_4_0());
		}
		public static IGrammarAwareElementType createInfixExpression_RightParenthesisKeyword_1_0_5ElementType() {
			return new IGrammarAwareElementType("InfixExpression_RightParenthesisKeyword_1_0_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getRightParenthesisKeyword_1_0_5());
		}
		public static IGrammarAwareElementType createInfixExpression_Group_1_1ElementType() {
			return new IGrammarAwareElementType("InfixExpression_Group_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getGroup_1_1());
		}
		public static IGrammarAwareElementType createInfixExpression_AtExpressionObjExprAction_1_1_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_AtExpressionObjExprAction_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getAtExpressionObjExprAction_1_1_0());
		}
		public static IGrammarAwareElementType createInfixExpression_LeftSquareBracketKeyword_1_1_1ElementType() {
			return new IGrammarAwareElementType("InfixExpression_LeftSquareBracketKeyword_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getLeftSquareBracketKeyword_1_1_1());
		}
		public static IGrammarAwareElementType createInfixExpression_IndexExprAssignment_1_1_2ElementType() {
			return new IGrammarAwareElementType("InfixExpression_IndexExprAssignment_1_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getIndexExprAssignment_1_1_2());
		}
		public static IGrammarAwareElementType createInfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getIndexExprExpressionParserRuleCall_1_1_2_0());
		}
		public static IGrammarAwareElementType createInfixExpression_RightSquareBracketKeyword_1_1_3ElementType() {
			return new IGrammarAwareElementType("InfixExpression_RightSquareBracketKeyword_1_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getRightSquareBracketKeyword_1_1_3());
		}
		public static IGrammarAwareElementType createInfixExpression_Group_1_2ElementType() {
			return new IGrammarAwareElementType("InfixExpression_Group_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getGroup_1_2());
		}
		public static IGrammarAwareElementType createInfixExpression_FeatureExpressionObjExprAction_1_2_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_FeatureExpressionObjExprAction_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getFeatureExpressionObjExprAction_1_2_0());
		}
		public static IGrammarAwareElementType createInfixExpression_FullStopKeyword_1_2_1ElementType() {
			return new IGrammarAwareElementType("InfixExpression_FullStopKeyword_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getFullStopKeyword_1_2_1());
		}
		public static IGrammarAwareElementType createInfixExpression_FeatureNameAssignment_1_2_2ElementType() {
			return new IGrammarAwareElementType("InfixExpression_FeatureNameAssignment_1_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getFeatureNameAssignment_1_2_2());
		}
		public static IGrammarAwareElementType createInfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0ElementType() {
			return new IGrammarAwareElementType("InfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInfixExpressionAccess().getFeatureNameIDTerminalRuleCall_1_2_2_0());
		}
	}

	public static final IGrammarAwareElementType InfixExpression_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpressionElementType());

	public static final IGrammarAwareElementType InfixExpression_Group_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_GroupElementType());

	public static final IGrammarAwareElementType InfixExpression_CallExpressionParserRuleCall_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_CallExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_Alternatives_1_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_Alternatives_1ElementType());

	public static final IGrammarAwareElementType InfixExpression_Group_1_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_Group_1_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_CallFeatureFuncExprAction_1_0_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_CallFeatureFuncExprAction_1_0_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_FullStopKeyword_1_0_1_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_FullStopKeyword_1_0_1ElementType());

	public static final IGrammarAwareElementType InfixExpression_NameAssignment_1_0_2_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_NameAssignment_1_0_2ElementType());

	public static final IGrammarAwareElementType InfixExpression_NameIDTerminalRuleCall_1_0_2_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_NameIDTerminalRuleCall_1_0_2_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_LeftParenthesisKeyword_1_0_3_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_LeftParenthesisKeyword_1_0_3ElementType());

	public static final IGrammarAwareElementType InfixExpression_ParameterListAssignment_1_0_4_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_ParameterListAssignment_1_0_4ElementType());

	public static final IGrammarAwareElementType InfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_RightParenthesisKeyword_1_0_5_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_RightParenthesisKeyword_1_0_5ElementType());

	public static final IGrammarAwareElementType InfixExpression_Group_1_1_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_Group_1_1ElementType());

	public static final IGrammarAwareElementType InfixExpression_AtExpressionObjExprAction_1_1_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_AtExpressionObjExprAction_1_1_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_LeftSquareBracketKeyword_1_1_1_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_LeftSquareBracketKeyword_1_1_1ElementType());

	public static final IGrammarAwareElementType InfixExpression_IndexExprAssignment_1_1_2_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_IndexExprAssignment_1_1_2ElementType());

	public static final IGrammarAwareElementType InfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_RightSquareBracketKeyword_1_1_3_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_RightSquareBracketKeyword_1_1_3ElementType());

	public static final IGrammarAwareElementType InfixExpression_Group_1_2_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_Group_1_2ElementType());

	public static final IGrammarAwareElementType InfixExpression_FeatureExpressionObjExprAction_1_2_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_FeatureExpressionObjExprAction_1_2_0ElementType());

	public static final IGrammarAwareElementType InfixExpression_FullStopKeyword_1_2_1_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_FullStopKeyword_1_2_1ElementType());

	public static final IGrammarAwareElementType InfixExpression_FeatureNameAssignment_1_2_2_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_FeatureNameAssignment_1_2_2ElementType());

	public static final IGrammarAwareElementType InfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0_ELEMENT_TYPE = associate(InfixExpressionFactory.createInfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0ElementType());

	private static class CallExpressionFactory {
		public static IGrammarAwareElementType createCallExpressionElementType() {
			return new IGrammarAwareElementType("CallExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionRule());
		}
		public static IGrammarAwareElementType createCallExpression_GroupElementType() {
			return new IGrammarAwareElementType("CallExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createCallExpression_PrimaryExpressionParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("CallExpression_PrimaryExpressionParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getPrimaryExpressionParserRuleCall_0());
		}
		public static IGrammarAwareElementType createCallExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("CallExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createCallExpression_CallFunctionFuncExprAction_1_0ElementType() {
			return new IGrammarAwareElementType("CallExpression_CallFunctionFuncExprAction_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getCallFunctionFuncExprAction_1_0());
		}
		public static IGrammarAwareElementType createCallExpression_LeftParenthesisKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("CallExpression_LeftParenthesisKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getLeftParenthesisKeyword_1_1());
		}
		public static IGrammarAwareElementType createCallExpression_ParameterListAssignment_1_2ElementType() {
			return new IGrammarAwareElementType("CallExpression_ParameterListAssignment_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getParameterListAssignment_1_2());
		}
		public static IGrammarAwareElementType createCallExpression_ParameterListParameterListParserRuleCall_1_2_0ElementType() {
			return new IGrammarAwareElementType("CallExpression_ParameterListParameterListParserRuleCall_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getParameterListParameterListParserRuleCall_1_2_0());
		}
		public static IGrammarAwareElementType createCallExpression_RightParenthesisKeyword_1_3ElementType() {
			return new IGrammarAwareElementType("CallExpression_RightParenthesisKeyword_1_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getCallExpressionAccess().getRightParenthesisKeyword_1_3());
		}
	}

	public static final IGrammarAwareElementType CallExpression_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpressionElementType());

	public static final IGrammarAwareElementType CallExpression_Group_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_GroupElementType());

	public static final IGrammarAwareElementType CallExpression_PrimaryExpressionParserRuleCall_0_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_PrimaryExpressionParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType CallExpression_Group_1_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_Group_1ElementType());

	public static final IGrammarAwareElementType CallExpression_CallFunctionFuncExprAction_1_0_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_CallFunctionFuncExprAction_1_0ElementType());

	public static final IGrammarAwareElementType CallExpression_LeftParenthesisKeyword_1_1_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_LeftParenthesisKeyword_1_1ElementType());

	public static final IGrammarAwareElementType CallExpression_ParameterListAssignment_1_2_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_ParameterListAssignment_1_2ElementType());

	public static final IGrammarAwareElementType CallExpression_ParameterListParameterListParserRuleCall_1_2_0_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_ParameterListParameterListParserRuleCall_1_2_0ElementType());

	public static final IGrammarAwareElementType CallExpression_RightParenthesisKeyword_1_3_ELEMENT_TYPE = associate(CallExpressionFactory.createCallExpression_RightParenthesisKeyword_1_3ElementType());

	private static class PrimaryExpressionFactory {
		public static IGrammarAwareElementType createPrimaryExpressionElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionRule());
		}
		public static IGrammarAwareElementType createPrimaryExpression_AlternativesElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createPrimaryExpression_FeatureCallParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_FeatureCallParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_0());
		}
		public static IGrammarAwareElementType createPrimaryExpression_ConstructorCallExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_ConstructorCallExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getConstructorCallExpressionParserRuleCall_1());
		}
		public static IGrammarAwareElementType createPrimaryExpression_ValueParserRuleCall_2ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_ValueParserRuleCall_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getValueParserRuleCall_2());
		}
		public static IGrammarAwareElementType createPrimaryExpression_LiteralParserRuleCall_3ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_LiteralParserRuleCall_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getLiteralParserRuleCall_3());
		}
		public static IGrammarAwareElementType createPrimaryExpression_KeywordVariablesParserRuleCall_4ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_KeywordVariablesParserRuleCall_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getKeywordVariablesParserRuleCall_4());
		}
		public static IGrammarAwareElementType createPrimaryExpression_ParanthesizedExpressionParserRuleCall_5ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_ParanthesizedExpressionParserRuleCall_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getParanthesizedExpressionParserRuleCall_5());
		}
		public static IGrammarAwareElementType createPrimaryExpression_BlockExpressionParserRuleCall_6ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_BlockExpressionParserRuleCall_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getBlockExpressionParserRuleCall_6());
		}
		public static IGrammarAwareElementType createPrimaryExpression_WithExpressionParserRuleCall_7ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_WithExpressionParserRuleCall_7_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getWithExpressionParserRuleCall_7());
		}
		public static IGrammarAwareElementType createPrimaryExpression_WithContextExpressionParserRuleCall_8ElementType() {
			return new IGrammarAwareElementType("PrimaryExpression_WithContextExpressionParserRuleCall_8_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getPrimaryExpressionAccess().getWithContextExpressionParserRuleCall_8());
		}
	}

	public static final IGrammarAwareElementType PrimaryExpression_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpressionElementType());

	public static final IGrammarAwareElementType PrimaryExpression_Alternatives_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_AlternativesElementType());

	public static final IGrammarAwareElementType PrimaryExpression_FeatureCallParserRuleCall_0_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_FeatureCallParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_ConstructorCallExpressionParserRuleCall_1_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_ConstructorCallExpressionParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_ValueParserRuleCall_2_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_ValueParserRuleCall_2ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_LiteralParserRuleCall_3_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_LiteralParserRuleCall_3ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_KeywordVariablesParserRuleCall_4_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_KeywordVariablesParserRuleCall_4ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_ParanthesizedExpressionParserRuleCall_5_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_ParanthesizedExpressionParserRuleCall_5ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_BlockExpressionParserRuleCall_6_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_BlockExpressionParserRuleCall_6ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_WithExpressionParserRuleCall_7_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_WithExpressionParserRuleCall_7ElementType());

	public static final IGrammarAwareElementType PrimaryExpression_WithContextExpressionParserRuleCall_8_ELEMENT_TYPE = associate(PrimaryExpressionFactory.createPrimaryExpression_WithContextExpressionParserRuleCall_8ElementType());

	private static class WithExpressionFactory {
		public static IGrammarAwareElementType createWithExpressionElementType() {
			return new IGrammarAwareElementType("WithExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionRule());
		}
		public static IGrammarAwareElementType createWithExpression_GroupElementType() {
			return new IGrammarAwareElementType("WithExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createWithExpression_WithKeyword_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_WithKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getWithKeyword_0());
		}
		public static IGrammarAwareElementType createWithExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createWithExpression_ReferencedAdviceAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_ReferencedAdviceAssignment_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getReferencedAdviceAssignment_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_0_0());
		}
		public static IGrammarAwareElementType createWithExpression_Group_1_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_Group_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getGroup_1_1());
		}
		public static IGrammarAwareElementType createWithExpression_CommaKeyword_1_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_CommaKeyword_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getCommaKeyword_1_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_ReferencedAdviceAssignment_1_1_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_ReferencedAdviceAssignment_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getReferencedAdviceAssignment_1_1_1());
		}
		public static IGrammarAwareElementType createWithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getReferencedAdviceIDTerminalRuleCall_1_1_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_Alternatives_2ElementType() {
			return new IGrammarAwareElementType("WithExpression_Alternatives_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getAlternatives_2());
		}
		public static IGrammarAwareElementType createWithExpression_Group_2_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_Group_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getGroup_2_0());
		}
		public static IGrammarAwareElementType createWithExpression_ColonKeyword_2_0_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_ColonKeyword_2_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getColonKeyword_2_0_0());
		}
		public static IGrammarAwareElementType createWithExpression_FuncExprAssignment_2_0_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_FuncExprAssignment_2_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getFuncExprAssignment_2_0_1());
		}
		public static IGrammarAwareElementType createWithExpression_FuncExprExpressionParserRuleCall_2_0_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_FuncExprExpressionParserRuleCall_2_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getFuncExprExpressionParserRuleCall_2_0_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_Group_2_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_Group_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getGroup_2_1());
		}
		public static IGrammarAwareElementType createWithExpression_LeftCurlyBracketKeyword_2_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_LeftCurlyBracketKeyword_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getLeftCurlyBracketKeyword_2_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_FuncExprAssignment_2_1_1ElementType() {
			return new IGrammarAwareElementType("WithExpression_FuncExprAssignment_2_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getFuncExprAssignment_2_1_1());
		}
		public static IGrammarAwareElementType createWithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0ElementType() {
			return new IGrammarAwareElementType("WithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getFuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0());
		}
		public static IGrammarAwareElementType createWithExpression_RightCurlyBracketKeyword_2_1_2ElementType() {
			return new IGrammarAwareElementType("WithExpression_RightCurlyBracketKeyword_2_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithExpressionAccess().getRightCurlyBracketKeyword_2_1_2());
		}
	}

	public static final IGrammarAwareElementType WithExpression_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpressionElementType());

	public static final IGrammarAwareElementType WithExpression_Group_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_GroupElementType());

	public static final IGrammarAwareElementType WithExpression_WithKeyword_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_WithKeyword_0ElementType());

	public static final IGrammarAwareElementType WithExpression_Group_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_Group_1ElementType());

	public static final IGrammarAwareElementType WithExpression_ReferencedAdviceAssignment_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_ReferencedAdviceAssignment_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0ElementType());

	public static final IGrammarAwareElementType WithExpression_Group_1_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_Group_1_1ElementType());

	public static final IGrammarAwareElementType WithExpression_CommaKeyword_1_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_CommaKeyword_1_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_ReferencedAdviceAssignment_1_1_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_ReferencedAdviceAssignment_1_1_1ElementType());

	public static final IGrammarAwareElementType WithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_Alternatives_2_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_Alternatives_2ElementType());

	public static final IGrammarAwareElementType WithExpression_Group_2_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_Group_2_0ElementType());

	public static final IGrammarAwareElementType WithExpression_ColonKeyword_2_0_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_ColonKeyword_2_0_0ElementType());

	public static final IGrammarAwareElementType WithExpression_FuncExprAssignment_2_0_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_FuncExprAssignment_2_0_1ElementType());

	public static final IGrammarAwareElementType WithExpression_FuncExprExpressionParserRuleCall_2_0_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_FuncExprExpressionParserRuleCall_2_0_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_Group_2_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_Group_2_1ElementType());

	public static final IGrammarAwareElementType WithExpression_LeftCurlyBracketKeyword_2_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_LeftCurlyBracketKeyword_2_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_FuncExprAssignment_2_1_1_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_FuncExprAssignment_2_1_1ElementType());

	public static final IGrammarAwareElementType WithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0ElementType());

	public static final IGrammarAwareElementType WithExpression_RightCurlyBracketKeyword_2_1_2_ELEMENT_TYPE = associate(WithExpressionFactory.createWithExpression_RightCurlyBracketKeyword_2_1_2ElementType());

	private static class WithContextExpressionFactory {
		public static IGrammarAwareElementType createWithContextExpressionElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionRule());
		}
		public static IGrammarAwareElementType createWithContextExpression_GroupElementType() {
			return new IGrammarAwareElementType("WithContextExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createWithContextExpression_WithKeyword_0ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_WithKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getWithKeyword_0());
		}
		public static IGrammarAwareElementType createWithContextExpression_ContextKeyword_1ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ContextKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getContextKeyword_1());
		}
		public static IGrammarAwareElementType createWithContextExpression_ExprAssignment_2ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ExprAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getExprAssignment_2());
		}
		public static IGrammarAwareElementType createWithContextExpression_ExprExpressionParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ExprExpressionParserRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getExprExpressionParserRuleCall_2_0());
		}
		public static IGrammarAwareElementType createWithContextExpression_Group_3ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_Group_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createWithContextExpression_AsKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_AsKeyword_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getAsKeyword_3_0());
		}
		public static IGrammarAwareElementType createWithContextExpression_AliasAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_AliasAssignment_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getAliasAssignment_3_1());
		}
		public static IGrammarAwareElementType createWithContextExpression_AliasIDTerminalRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_AliasIDTerminalRuleCall_3_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getAliasIDTerminalRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createWithContextExpression_ContextBlockAssignment_4ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ContextBlockAssignment_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getContextBlockAssignment_4());
		}
		public static IGrammarAwareElementType createWithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("WithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getWithContextExpressionAccess().getContextBlockBlockExpressionParserRuleCall_4_0());
		}
	}

	public static final IGrammarAwareElementType WithContextExpression_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpressionElementType());

	public static final IGrammarAwareElementType WithContextExpression_Group_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_GroupElementType());

	public static final IGrammarAwareElementType WithContextExpression_WithKeyword_0_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_WithKeyword_0ElementType());

	public static final IGrammarAwareElementType WithContextExpression_ContextKeyword_1_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_ContextKeyword_1ElementType());

	public static final IGrammarAwareElementType WithContextExpression_ExprAssignment_2_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_ExprAssignment_2ElementType());

	public static final IGrammarAwareElementType WithContextExpression_ExprExpressionParserRuleCall_2_0_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_ExprExpressionParserRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType WithContextExpression_Group_3_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_Group_3ElementType());

	public static final IGrammarAwareElementType WithContextExpression_AsKeyword_3_0_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_AsKeyword_3_0ElementType());

	public static final IGrammarAwareElementType WithContextExpression_AliasAssignment_3_1_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_AliasAssignment_3_1ElementType());

	public static final IGrammarAwareElementType WithContextExpression_AliasIDTerminalRuleCall_3_1_0_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_AliasIDTerminalRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType WithContextExpression_ContextBlockAssignment_4_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_ContextBlockAssignment_4ElementType());

	public static final IGrammarAwareElementType WithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0_ELEMENT_TYPE = associate(WithContextExpressionFactory.createWithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0ElementType());

	private static class BlockExpressionFactory {
		public static IGrammarAwareElementType createBlockExpressionElementType() {
			return new IGrammarAwareElementType("BlockExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionRule());
		}
		public static IGrammarAwareElementType createBlockExpression_GroupElementType() {
			return new IGrammarAwareElementType("BlockExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createBlockExpression_ChainedExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("BlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getChainedExpressionAction_0());
		}
		public static IGrammarAwareElementType createBlockExpression_LeftCurlyBracketKeyword_1ElementType() {
			return new IGrammarAwareElementType("BlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		public static IGrammarAwareElementType createBlockExpression_Group_2ElementType() {
			return new IGrammarAwareElementType("BlockExpression_Group_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createBlockExpression_ExpressionsAssignment_2_0ElementType() {
			return new IGrammarAwareElementType("BlockExpression_ExpressionsAssignment_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getExpressionsAssignment_2_0());
		}
		public static IGrammarAwareElementType createBlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0ElementType() {
			return new IGrammarAwareElementType("BlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getExpressionsTopLevelExpressionParserRuleCall_2_0_0());
		}
		public static IGrammarAwareElementType createBlockExpression_SemicolonKeyword_2_1ElementType() {
			return new IGrammarAwareElementType("BlockExpression_SemicolonKeyword_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getSemicolonKeyword_2_1());
		}
		public static IGrammarAwareElementType createBlockExpression_RightCurlyBracketKeyword_3ElementType() {
			return new IGrammarAwareElementType("BlockExpression_RightCurlyBracketKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionAccess().getRightCurlyBracketKeyword_3());
		}
	}

	public static final IGrammarAwareElementType BlockExpression_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpressionElementType());

	public static final IGrammarAwareElementType BlockExpression_Group_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_GroupElementType());

	public static final IGrammarAwareElementType BlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_ChainedExpressionAction_0ElementType());

	public static final IGrammarAwareElementType BlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_LeftCurlyBracketKeyword_1ElementType());

	public static final IGrammarAwareElementType BlockExpression_Group_2_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_Group_2ElementType());

	public static final IGrammarAwareElementType BlockExpression_ExpressionsAssignment_2_0_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_ExpressionsAssignment_2_0ElementType());

	public static final IGrammarAwareElementType BlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0ElementType());

	public static final IGrammarAwareElementType BlockExpression_SemicolonKeyword_2_1_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_SemicolonKeyword_2_1ElementType());

	public static final IGrammarAwareElementType BlockExpression_RightCurlyBracketKeyword_3_ELEMENT_TYPE = associate(BlockExpressionFactory.createBlockExpression_RightCurlyBracketKeyword_3ElementType());

	private static class ValueFactory {
		public static IGrammarAwareElementType createValueElementType() {
			return new IGrammarAwareElementType("Value_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueRule());
		}
		public static IGrammarAwareElementType createValue_GroupElementType() {
			return new IGrammarAwareElementType("Value_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getGroup());
		}
		public static IGrammarAwareElementType createValue_VariableExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("Value_VariableExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getVariableExpressionAction_0());
		}
		public static IGrammarAwareElementType createValue_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("Value_NameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createValue_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Value_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType Value_ELEMENT_TYPE = associate(ValueFactory.createValueElementType());

	public static final IGrammarAwareElementType Value_Group_ELEMENT_TYPE = associate(ValueFactory.createValue_GroupElementType());

	public static final IGrammarAwareElementType Value_VariableExpressionAction_0_ELEMENT_TYPE = associate(ValueFactory.createValue_VariableExpressionAction_0ElementType());

	public static final IGrammarAwareElementType Value_NameAssignment_1_ELEMENT_TYPE = associate(ValueFactory.createValue_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType Value_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(ValueFactory.createValue_NameIDTerminalRuleCall_1_0ElementType());

	private static class KeywordVariablesFactory {
		public static IGrammarAwareElementType createKeywordVariablesElementType() {
			return new IGrammarAwareElementType("KeywordVariables_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesRule());
		}
		public static IGrammarAwareElementType createKeywordVariables_GroupElementType() {
			return new IGrammarAwareElementType("KeywordVariables_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getGroup());
		}
		public static IGrammarAwareElementType createKeywordVariables_VariableExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_VariableExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getVariableExpressionAction_0());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameAlternatives_1_0ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameAlternatives_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameAlternatives_1_0());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameInputKeyword_1_0_0ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameInputKeyword_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameInputKeyword_1_0_0());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameOutputKeyword_1_0_1ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameOutputKeyword_1_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameOutputKeyword_1_0_1());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameSourceKeyword_1_0_2ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameSourceKeyword_1_0_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameSourceKeyword_1_0_2());
		}
		public static IGrammarAwareElementType createKeywordVariables_NamePropertiesKeyword_1_0_3ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NamePropertiesKeyword_1_0_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNamePropertiesKeyword_1_0_3());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameBuilderKeyword_1_0_4ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameBuilderKeyword_1_0_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameBuilderKeyword_1_0_4());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameUnitKeyword_1_0_5ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameUnitKeyword_1_0_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameUnitKeyword_1_0_5());
		}
		public static IGrammarAwareElementType createKeywordVariables_NameThisKeyword_1_0_6ElementType() {
			return new IGrammarAwareElementType("KeywordVariables_NameThisKeyword_1_0_6_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getKeywordVariablesAccess().getNameThisKeyword_1_0_6());
		}
	}

	public static final IGrammarAwareElementType KeywordVariables_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariablesElementType());

	public static final IGrammarAwareElementType KeywordVariables_Group_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_GroupElementType());

	public static final IGrammarAwareElementType KeywordVariables_VariableExpressionAction_0_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_VariableExpressionAction_0ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameAssignment_1_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameAlternatives_1_0_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameAlternatives_1_0ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameInputKeyword_1_0_0_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameInputKeyword_1_0_0ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameOutputKeyword_1_0_1_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameOutputKeyword_1_0_1ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameSourceKeyword_1_0_2_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameSourceKeyword_1_0_2ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NamePropertiesKeyword_1_0_3_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NamePropertiesKeyword_1_0_3ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameBuilderKeyword_1_0_4_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameBuilderKeyword_1_0_4ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameUnitKeyword_1_0_5_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameUnitKeyword_1_0_5ElementType());

	public static final IGrammarAwareElementType KeywordVariables_NameThisKeyword_1_0_6_ELEMENT_TYPE = associate(KeywordVariablesFactory.createKeywordVariables_NameThisKeyword_1_0_6ElementType());

	private static class FeatureCallFactory {
		public static IGrammarAwareElementType createFeatureCallElementType() {
			return new IGrammarAwareElementType("FeatureCall_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureCallRule());
		}
		public static IGrammarAwareElementType createFeatureCall_OperationCallParserRuleCallElementType() {
			return new IGrammarAwareElementType("FeatureCall_OperationCallParserRuleCall_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureCallAccess().getOperationCallParserRuleCall());
		}
	}

	public static final IGrammarAwareElementType FeatureCall_ELEMENT_TYPE = associate(FeatureCallFactory.createFeatureCallElementType());

	public static final IGrammarAwareElementType FeatureCall_OperationCallParserRuleCall_ELEMENT_TYPE = associate(FeatureCallFactory.createFeatureCall_OperationCallParserRuleCallElementType());

	private static class OperationCallFactory {
		public static IGrammarAwareElementType createOperationCallElementType() {
			return new IGrammarAwareElementType("OperationCall_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallRule());
		}
		public static IGrammarAwareElementType createOperationCall_GroupElementType() {
			return new IGrammarAwareElementType("OperationCall_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getGroup());
		}
		public static IGrammarAwareElementType createOperationCall_CallNamedFunctionAction_0ElementType() {
			return new IGrammarAwareElementType("OperationCall_CallNamedFunctionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getCallNamedFunctionAction_0());
		}
		public static IGrammarAwareElementType createOperationCall_NameAssignment_1ElementType() {
			return new IGrammarAwareElementType("OperationCall_NameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getNameAssignment_1());
		}
		public static IGrammarAwareElementType createOperationCall_NameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("OperationCall_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getNameIDTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createOperationCall_LeftParenthesisKeyword_2ElementType() {
			return new IGrammarAwareElementType("OperationCall_LeftParenthesisKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getLeftParenthesisKeyword_2());
		}
		public static IGrammarAwareElementType createOperationCall_ParameterListAssignment_3ElementType() {
			return new IGrammarAwareElementType("OperationCall_ParameterListAssignment_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getParameterListAssignment_3());
		}
		public static IGrammarAwareElementType createOperationCall_ParameterListParameterListParserRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("OperationCall_ParameterListParameterListParserRuleCall_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getParameterListParameterListParserRuleCall_3_0());
		}
		public static IGrammarAwareElementType createOperationCall_RightParenthesisKeyword_4ElementType() {
			return new IGrammarAwareElementType("OperationCall_RightParenthesisKeyword_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOperationCallAccess().getRightParenthesisKeyword_4());
		}
	}

	public static final IGrammarAwareElementType OperationCall_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCallElementType());

	public static final IGrammarAwareElementType OperationCall_Group_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_GroupElementType());

	public static final IGrammarAwareElementType OperationCall_CallNamedFunctionAction_0_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_CallNamedFunctionAction_0ElementType());

	public static final IGrammarAwareElementType OperationCall_NameAssignment_1_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_NameAssignment_1ElementType());

	public static final IGrammarAwareElementType OperationCall_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_NameIDTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType OperationCall_LeftParenthesisKeyword_2_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_LeftParenthesisKeyword_2ElementType());

	public static final IGrammarAwareElementType OperationCall_ParameterListAssignment_3_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_ParameterListAssignment_3ElementType());

	public static final IGrammarAwareElementType OperationCall_ParameterListParameterListParserRuleCall_3_0_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_ParameterListParameterListParserRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType OperationCall_RightParenthesisKeyword_4_ELEMENT_TYPE = associate(OperationCallFactory.createOperationCall_RightParenthesisKeyword_4ElementType());

	private static class ConstructorCallExpressionFactory {
		public static IGrammarAwareElementType createConstructorCallExpressionElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionRule());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_GroupElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_CreateExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_CreateExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getCreateExpressionAction_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_NewKeyword_1ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_NewKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getNewKeyword_1());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_TypeExprAssignment_2ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_TypeExprAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getTypeExprAssignment_2());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getTypeExprIDTerminalRuleCall_2_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_Group_3ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_Group_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_LeftParenthesisKeyword_3_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_LeftParenthesisKeyword_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getLeftParenthesisKeyword_3_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_ParameterListAssignment_3_1ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_ParameterListAssignment_3_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getParameterListAssignment_3_1());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getParameterListParameterListParserRuleCall_3_1_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_RightParenthesisKeyword_3_2ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_RightParenthesisKeyword_3_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getRightParenthesisKeyword_3_2());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_Group_4ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_Group_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getGroup_4());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_AsKeyword_4_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_AsKeyword_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getAsKeyword_4_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_AliasAssignment_4_1ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_AliasAssignment_4_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getAliasAssignment_4_1());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getAliasIDTerminalRuleCall_4_1_0());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_ContextBlockAssignment_5ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_ContextBlockAssignment_5_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getContextBlockAssignment_5());
		}
		public static IGrammarAwareElementType createConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0ElementType() {
			return new IGrammarAwareElementType("ConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getConstructorCallExpressionAccess().getContextBlockInitializationBlockExpressionParserRuleCall_5_0());
		}
	}

	public static final IGrammarAwareElementType ConstructorCallExpression_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpressionElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_Group_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_GroupElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_CreateExpressionAction_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_CreateExpressionAction_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_NewKeyword_1_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_NewKeyword_1ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_TypeExprAssignment_2_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_TypeExprAssignment_2ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_Group_3_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_Group_3ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_LeftParenthesisKeyword_3_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_LeftParenthesisKeyword_3_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_ParameterListAssignment_3_1_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_ParameterListAssignment_3_1ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_RightParenthesisKeyword_3_2_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_RightParenthesisKeyword_3_2ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_Group_4_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_Group_4ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_AsKeyword_4_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_AsKeyword_4_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_AliasAssignment_4_1_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_AliasAssignment_4_1ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_ContextBlockAssignment_5_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_ContextBlockAssignment_5ElementType());

	public static final IGrammarAwareElementType ConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0_ELEMENT_TYPE = associate(ConstructorCallExpressionFactory.createConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0ElementType());

	private static class InitializationBlockExpressionFactory {
		public static IGrammarAwareElementType createInitializationBlockExpressionElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionRule());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_GroupElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_ChainedExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getChainedExpressionAction_0());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_LeftCurlyBracketKeyword_1ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_ExpressionsAssignment_2ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_ExpressionsAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getExpressionsAssignment_2());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getExpressionsInitializationExpressionParserRuleCall_2_0());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_SemicolonKeyword_3ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_SemicolonKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getSemicolonKeyword_3());
		}
		public static IGrammarAwareElementType createInitializationBlockExpression_RightCurlyBracketKeyword_4ElementType() {
			return new IGrammarAwareElementType("InitializationBlockExpression_RightCurlyBracketKeyword_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationBlockExpressionAccess().getRightCurlyBracketKeyword_4());
		}
	}

	public static final IGrammarAwareElementType InitializationBlockExpression_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpressionElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_Group_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_GroupElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_ChainedExpressionAction_0ElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_LeftCurlyBracketKeyword_1ElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_ExpressionsAssignment_2_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_ExpressionsAssignment_2ElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0ElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_SemicolonKeyword_3_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_SemicolonKeyword_3ElementType());

	public static final IGrammarAwareElementType InitializationBlockExpression_RightCurlyBracketKeyword_4_ELEMENT_TYPE = associate(InitializationBlockExpressionFactory.createInitializationBlockExpression_RightCurlyBracketKeyword_4ElementType());

	private static class InitializationExpressionFactory {
		public static IGrammarAwareElementType createInitializationExpressionElementType() {
			return new IGrammarAwareElementType("InitializationExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionRule());
		}
		public static IGrammarAwareElementType createInitializationExpression_GroupElementType() {
			return new IGrammarAwareElementType("InitializationExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createInitializationExpression_AssignmentExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_AssignmentExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getAssignmentExpressionAction_0());
		}
		public static IGrammarAwareElementType createInitializationExpression_LeftExprAssignment_1ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_LeftExprAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getLeftExprAssignment_1());
		}
		public static IGrammarAwareElementType createInitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getLeftExprFeatureOfThisParserRuleCall_1_0());
		}
		public static IGrammarAwareElementType createInitializationExpression_FunctionNameAssignment_2ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_FunctionNameAssignment_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getFunctionNameAssignment_2());
		}
		public static IGrammarAwareElementType createInitializationExpression_FunctionNameColonKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_FunctionNameColonKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getFunctionNameColonKeyword_2_0());
		}
		public static IGrammarAwareElementType createInitializationExpression_RightExprAssignment_3ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_RightExprAssignment_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getRightExprAssignment_3());
		}
		public static IGrammarAwareElementType createInitializationExpression_RightExprExpressionParserRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("InitializationExpression_RightExprExpressionParserRuleCall_3_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getInitializationExpressionAccess().getRightExprExpressionParserRuleCall_3_0());
		}
	}

	public static final IGrammarAwareElementType InitializationExpression_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpressionElementType());

	public static final IGrammarAwareElementType InitializationExpression_Group_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_GroupElementType());

	public static final IGrammarAwareElementType InitializationExpression_AssignmentExpressionAction_0_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_AssignmentExpressionAction_0ElementType());

	public static final IGrammarAwareElementType InitializationExpression_LeftExprAssignment_1_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_LeftExprAssignment_1ElementType());

	public static final IGrammarAwareElementType InitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType InitializationExpression_FunctionNameAssignment_2_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_FunctionNameAssignment_2ElementType());

	public static final IGrammarAwareElementType InitializationExpression_FunctionNameColonKeyword_2_0_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_FunctionNameColonKeyword_2_0ElementType());

	public static final IGrammarAwareElementType InitializationExpression_RightExprAssignment_3_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_RightExprAssignment_3ElementType());

	public static final IGrammarAwareElementType InitializationExpression_RightExprExpressionParserRuleCall_3_0_ELEMENT_TYPE = associate(InitializationExpressionFactory.createInitializationExpression_RightExprExpressionParserRuleCall_3_0ElementType());

	private static class FeatureOfThisFactory {
		public static IGrammarAwareElementType createFeatureOfThisElementType() {
			return new IGrammarAwareElementType("FeatureOfThis_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureOfThisRule());
		}
		public static IGrammarAwareElementType createFeatureOfThis_GroupElementType() {
			return new IGrammarAwareElementType("FeatureOfThis_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureOfThisAccess().getGroup());
		}
		public static IGrammarAwareElementType createFeatureOfThis_FeatureExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("FeatureOfThis_FeatureExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureOfThisAccess().getFeatureExpressionAction_0());
		}
		public static IGrammarAwareElementType createFeatureOfThis_FeatureNameAssignment_1ElementType() {
			return new IGrammarAwareElementType("FeatureOfThis_FeatureNameAssignment_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureOfThisAccess().getFeatureNameAssignment_1());
		}
		public static IGrammarAwareElementType createFeatureOfThis_FeatureNameIDTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("FeatureOfThis_FeatureNameIDTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getFeatureOfThisAccess().getFeatureNameIDTerminalRuleCall_1_0());
		}
	}

	public static final IGrammarAwareElementType FeatureOfThis_ELEMENT_TYPE = associate(FeatureOfThisFactory.createFeatureOfThisElementType());

	public static final IGrammarAwareElementType FeatureOfThis_Group_ELEMENT_TYPE = associate(FeatureOfThisFactory.createFeatureOfThis_GroupElementType());

	public static final IGrammarAwareElementType FeatureOfThis_FeatureExpressionAction_0_ELEMENT_TYPE = associate(FeatureOfThisFactory.createFeatureOfThis_FeatureExpressionAction_0ElementType());

	public static final IGrammarAwareElementType FeatureOfThis_FeatureNameAssignment_1_ELEMENT_TYPE = associate(FeatureOfThisFactory.createFeatureOfThis_FeatureNameAssignment_1ElementType());

	public static final IGrammarAwareElementType FeatureOfThis_FeatureNameIDTerminalRuleCall_1_0_ELEMENT_TYPE = associate(FeatureOfThisFactory.createFeatureOfThis_FeatureNameIDTerminalRuleCall_1_0ElementType());

	private static class LiteralFactory {
		public static IGrammarAwareElementType createLiteralElementType() {
			return new IGrammarAwareElementType("Literal_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralRule());
		}
		public static IGrammarAwareElementType createLiteral_AlternativesElementType() {
			return new IGrammarAwareElementType("Literal_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createLiteral_ValueLiteralParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Literal_ValueLiteralParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralAccess().getValueLiteralParserRuleCall_0());
		}
		public static IGrammarAwareElementType createLiteral_LiteralFunctionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Literal_LiteralFunctionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralAccess().getLiteralFunctionParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Literal_ELEMENT_TYPE = associate(LiteralFactory.createLiteralElementType());

	public static final IGrammarAwareElementType Literal_Alternatives_ELEMENT_TYPE = associate(LiteralFactory.createLiteral_AlternativesElementType());

	public static final IGrammarAwareElementType Literal_ValueLiteralParserRuleCall_0_ELEMENT_TYPE = associate(LiteralFactory.createLiteral_ValueLiteralParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Literal_LiteralFunctionParserRuleCall_1_ELEMENT_TYPE = associate(LiteralFactory.createLiteral_LiteralFunctionParserRuleCall_1ElementType());

	private static class LiteralFunctionFactory {
		public static IGrammarAwareElementType createLiteralFunctionElementType() {
			return new IGrammarAwareElementType("LiteralFunction_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralFunctionRule());
		}
		public static IGrammarAwareElementType createLiteralFunction_GroupElementType() {
			return new IGrammarAwareElementType("LiteralFunction_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralFunctionAccess().getGroup());
		}
		public static IGrammarAwareElementType createLiteralFunction_LeftCurlyBracketKeyword_0ElementType() {
			return new IGrammarAwareElementType("LiteralFunction_LeftCurlyBracketKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralFunctionAccess().getLeftCurlyBracketKeyword_0());
		}
		public static IGrammarAwareElementType createLiteralFunction_ClosureExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("LiteralFunction_ClosureExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralFunctionAccess().getClosureExpressionParserRuleCall_1());
		}
		public static IGrammarAwareElementType createLiteralFunction_RightCurlyBracketKeyword_2ElementType() {
			return new IGrammarAwareElementType("LiteralFunction_RightCurlyBracketKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getLiteralFunctionAccess().getRightCurlyBracketKeyword_2());
		}
	}

	public static final IGrammarAwareElementType LiteralFunction_ELEMENT_TYPE = associate(LiteralFunctionFactory.createLiteralFunctionElementType());

	public static final IGrammarAwareElementType LiteralFunction_Group_ELEMENT_TYPE = associate(LiteralFunctionFactory.createLiteralFunction_GroupElementType());

	public static final IGrammarAwareElementType LiteralFunction_LeftCurlyBracketKeyword_0_ELEMENT_TYPE = associate(LiteralFunctionFactory.createLiteralFunction_LeftCurlyBracketKeyword_0ElementType());

	public static final IGrammarAwareElementType LiteralFunction_ClosureExpressionParserRuleCall_1_ELEMENT_TYPE = associate(LiteralFunctionFactory.createLiteralFunction_ClosureExpressionParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType LiteralFunction_RightCurlyBracketKeyword_2_ELEMENT_TYPE = associate(LiteralFunctionFactory.createLiteralFunction_RightCurlyBracketKeyword_2ElementType());

	private static class ClosureExpressionFactory {
		public static IGrammarAwareElementType createClosureExpressionElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionRule());
		}
		public static IGrammarAwareElementType createClosureExpression_GroupElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createClosureExpression_FunctionAction_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_FunctionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getFunctionAction_0());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createClosureExpression_LessThanSignKeyword_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_LessThanSignKeyword_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getLessThanSignKeyword_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_ReturnTypeAssignment_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ReturnTypeAssignment_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getReturnTypeAssignment_1_1());
		}
		public static IGrammarAwareElementType createClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getReturnTypeTypeRefParserRuleCall_1_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_GreaterThanSignKeyword_1_2ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_GreaterThanSignKeyword_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGreaterThanSignKeyword_1_2());
		}
		public static IGrammarAwareElementType createClosureExpression_Alternatives_2ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Alternatives_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getAlternatives_2());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_2_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_2_0());
		}
		public static IGrammarAwareElementType createClosureExpression_VerticalLineKeyword_2_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VerticalLineKeyword_2_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVerticalLineKeyword_2_0_0());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_2_0_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_2_0_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_2_0_1());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersAssignment_2_0_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersAssignment_2_0_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersAssignment_2_0_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_0_0());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_2_0_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_2_0_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_2_0_1_1());
		}
		public static IGrammarAwareElementType createClosureExpression_CommaKeyword_2_0_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_CommaKeyword_2_0_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getCommaKeyword_2_0_1_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersAssignment_2_0_1_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersAssignment_2_0_1_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersAssignment_2_0_1_1_1());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_2_0_1_2ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_2_0_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_2_0_1_2());
		}
		public static IGrammarAwareElementType createClosureExpression_CommaKeyword_2_0_1_2_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_CommaKeyword_2_0_1_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getCommaKeyword_2_0_1_2_0());
		}
		public static IGrammarAwareElementType createClosureExpression_VarArgsAssignment_2_0_1_2_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VarArgsAssignment_2_0_1_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVarArgsAssignment_2_0_1_2_1());
		}
		public static IGrammarAwareElementType createClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersAssignment_2_0_1_2_2ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersAssignment_2_0_1_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersAssignment_2_0_1_2_2());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0());
		}
		public static IGrammarAwareElementType createClosureExpression_Group_2_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_Group_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getGroup_2_1());
		}
		public static IGrammarAwareElementType createClosureExpression_VarArgsAssignment_2_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VarArgsAssignment_2_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVarArgsAssignment_2_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_1_0_0());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersAssignment_2_1_1ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersAssignment_2_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersAssignment_2_1_1());
		}
		public static IGrammarAwareElementType createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getParametersParameterDeclarationParserRuleCall_2_1_1_0());
		}
		public static IGrammarAwareElementType createClosureExpression_VerticalLineKeyword_3ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_VerticalLineKeyword_3_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getVerticalLineKeyword_3());
		}
		public static IGrammarAwareElementType createClosureExpression_FuncExprAssignment_4ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_FuncExprAssignment_4_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getFuncExprAssignment_4());
		}
		public static IGrammarAwareElementType createClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0ElementType() {
			return new IGrammarAwareElementType("ClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getClosureExpressionAccess().getFuncExprOneOrManyExpressionsParserRuleCall_4_0());
		}
	}

	public static final IGrammarAwareElementType ClosureExpression_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpressionElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_GroupElementType());

	public static final IGrammarAwareElementType ClosureExpression_FunctionAction_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_FunctionAction_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_LessThanSignKeyword_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_LessThanSignKeyword_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ReturnTypeAssignment_1_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ReturnTypeAssignment_1_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_GreaterThanSignKeyword_1_2_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_GreaterThanSignKeyword_1_2ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Alternatives_2_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Alternatives_2ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_2_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_2_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VerticalLineKeyword_2_0_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VerticalLineKeyword_2_0_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_2_0_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_2_0_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersAssignment_2_0_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersAssignment_2_0_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_2_0_1_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_2_0_1_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_CommaKeyword_2_0_1_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_CommaKeyword_2_0_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersAssignment_2_0_1_1_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersAssignment_2_0_1_1_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_2_0_1_2_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_2_0_1_2ElementType());

	public static final IGrammarAwareElementType ClosureExpression_CommaKeyword_2_0_1_2_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_CommaKeyword_2_0_1_2_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VarArgsAssignment_2_0_1_2_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VarArgsAssignment_2_0_1_2_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersAssignment_2_0_1_2_2_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersAssignment_2_0_1_2_2ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_Group_2_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_Group_2_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VarArgsAssignment_2_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VarArgsAssignment_2_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersAssignment_2_1_1_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersAssignment_2_1_1ElementType());

	public static final IGrammarAwareElementType ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0ElementType());

	public static final IGrammarAwareElementType ClosureExpression_VerticalLineKeyword_3_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_VerticalLineKeyword_3ElementType());

	public static final IGrammarAwareElementType ClosureExpression_FuncExprAssignment_4_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_FuncExprAssignment_4ElementType());

	public static final IGrammarAwareElementType ClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0_ELEMENT_TYPE = associate(ClosureExpressionFactory.createClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0ElementType());

	private static class OneOrManyExpressionsFactory {
		public static IGrammarAwareElementType createOneOrManyExpressionsElementType() {
			return new IGrammarAwareElementType("OneOrManyExpressions_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOneOrManyExpressionsRule());
		}
		public static IGrammarAwareElementType createOneOrManyExpressions_AlternativesElementType() {
			return new IGrammarAwareElementType("OneOrManyExpressions_Alternatives_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOneOrManyExpressionsAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createOneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("OneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOneOrManyExpressionsAccess().getBlockExpressionWithoutBracketsParserRuleCall_0());
		}
		public static IGrammarAwareElementType createOneOrManyExpressions_ExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("OneOrManyExpressions_ExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getOneOrManyExpressionsAccess().getExpressionParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType OneOrManyExpressions_ELEMENT_TYPE = associate(OneOrManyExpressionsFactory.createOneOrManyExpressionsElementType());

	public static final IGrammarAwareElementType OneOrManyExpressions_Alternatives_ELEMENT_TYPE = associate(OneOrManyExpressionsFactory.createOneOrManyExpressions_AlternativesElementType());

	public static final IGrammarAwareElementType OneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0_ELEMENT_TYPE = associate(OneOrManyExpressionsFactory.createOneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType OneOrManyExpressions_ExpressionParserRuleCall_1_ELEMENT_TYPE = associate(OneOrManyExpressionsFactory.createOneOrManyExpressions_ExpressionParserRuleCall_1ElementType());

	private static class BlockExpressionWithoutBracketsFactory {
		public static IGrammarAwareElementType createBlockExpressionWithoutBracketsElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsRule());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_GroupElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getGroup());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_ChainedExpressionAction_0ElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_ChainedExpressionAction_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getChainedExpressionAction_0());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_Group_1ElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_Group_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getGroup_1());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_ExpressionsAssignment_1_0ElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_ExpressionsAssignment_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getExpressionsAssignment_1_0());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0ElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getExpressionsTopLevelExpressionParserRuleCall_1_0_0());
		}
		public static IGrammarAwareElementType createBlockExpressionWithoutBrackets_SemicolonKeyword_1_1ElementType() {
			return new IGrammarAwareElementType("BlockExpressionWithoutBrackets_SemicolonKeyword_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getBlockExpressionWithoutBracketsAccess().getSemicolonKeyword_1_1());
		}
	}

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBracketsElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_Group_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_GroupElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_ChainedExpressionAction_0_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_ChainedExpressionAction_0ElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_Group_1_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_Group_1ElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_ExpressionsAssignment_1_0_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_ExpressionsAssignment_1_0ElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0ElementType());

	public static final IGrammarAwareElementType BlockExpressionWithoutBrackets_SemicolonKeyword_1_1_ELEMENT_TYPE = associate(BlockExpressionWithoutBracketsFactory.createBlockExpressionWithoutBrackets_SemicolonKeyword_1_1ElementType());

	private static class ValueLiteralFactory {
		public static IGrammarAwareElementType createValueLiteralElementType() {
			return new IGrammarAwareElementType("ValueLiteral_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueLiteralRule());
		}
		public static IGrammarAwareElementType createValueLiteral_ValueAssignmentElementType() {
			return new IGrammarAwareElementType("ValueLiteral_ValueAssignment_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueLiteralAccess().getValueAssignment());
		}
		public static IGrammarAwareElementType createValueLiteral_ValueSTRINGTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("ValueLiteral_ValueSTRINGTerminalRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getValueLiteralAccess().getValueSTRINGTerminalRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType ValueLiteral_ELEMENT_TYPE = associate(ValueLiteralFactory.createValueLiteralElementType());

	public static final IGrammarAwareElementType ValueLiteral_ValueAssignment_ELEMENT_TYPE = associate(ValueLiteralFactory.createValueLiteral_ValueAssignmentElementType());

	public static final IGrammarAwareElementType ValueLiteral_ValueSTRINGTerminalRuleCall_0_ELEMENT_TYPE = associate(ValueLiteralFactory.createValueLiteral_ValueSTRINGTerminalRuleCall_0ElementType());

	private static class ParanthesizedExpressionFactory {
		public static IGrammarAwareElementType createParanthesizedExpressionElementType() {
			return new IGrammarAwareElementType("ParanthesizedExpression_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParanthesizedExpressionRule());
		}
		public static IGrammarAwareElementType createParanthesizedExpression_GroupElementType() {
			return new IGrammarAwareElementType("ParanthesizedExpression_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParanthesizedExpressionAccess().getGroup());
		}
		public static IGrammarAwareElementType createParanthesizedExpression_LeftParenthesisKeyword_0ElementType() {
			return new IGrammarAwareElementType("ParanthesizedExpression_LeftParenthesisKeyword_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParanthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		}
		public static IGrammarAwareElementType createParanthesizedExpression_ExpressionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("ParanthesizedExpression_ExpressionParserRuleCall_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParanthesizedExpressionAccess().getExpressionParserRuleCall_1());
		}
		public static IGrammarAwareElementType createParanthesizedExpression_RightParenthesisKeyword_2ElementType() {
			return new IGrammarAwareElementType("ParanthesizedExpression_RightParenthesisKeyword_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getParanthesizedExpressionAccess().getRightParenthesisKeyword_2());
		}
	}

	public static final IGrammarAwareElementType ParanthesizedExpression_ELEMENT_TYPE = associate(ParanthesizedExpressionFactory.createParanthesizedExpressionElementType());

	public static final IGrammarAwareElementType ParanthesizedExpression_Group_ELEMENT_TYPE = associate(ParanthesizedExpressionFactory.createParanthesizedExpression_GroupElementType());

	public static final IGrammarAwareElementType ParanthesizedExpression_LeftParenthesisKeyword_0_ELEMENT_TYPE = associate(ParanthesizedExpressionFactory.createParanthesizedExpression_LeftParenthesisKeyword_0ElementType());

	public static final IGrammarAwareElementType ParanthesizedExpression_ExpressionParserRuleCall_1_ELEMENT_TYPE = associate(ParanthesizedExpressionFactory.createParanthesizedExpression_ExpressionParserRuleCall_1ElementType());

	public static final IGrammarAwareElementType ParanthesizedExpression_RightParenthesisKeyword_2_ELEMENT_TYPE = associate(ParanthesizedExpressionFactory.createParanthesizedExpression_RightParenthesisKeyword_2ElementType());

	private static class QIDFactory {
		public static IGrammarAwareElementType createQIDElementType() {
			return new IGrammarAwareElementType("QID_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDRule());
		}
		public static IGrammarAwareElementType createQID_GroupElementType() {
			return new IGrammarAwareElementType("QID_Group_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getGroup());
		}
		public static IGrammarAwareElementType createQID_IDTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("QID_IDTerminalRuleCall_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getIDTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createQID_Alternatives_1ElementType() {
			return new IGrammarAwareElementType("QID_Alternatives_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getAlternatives_1());
		}
		public static IGrammarAwareElementType createQID_INTTerminalRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("QID_INTTerminalRuleCall_1_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getINTTerminalRuleCall_1_0());
		}
		public static IGrammarAwareElementType createQID_HEXTerminalRuleCall_1_1ElementType() {
			return new IGrammarAwareElementType("QID_HEXTerminalRuleCall_1_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getHEXTerminalRuleCall_1_1());
		}
		public static IGrammarAwareElementType createQID_IDTerminalRuleCall_1_2ElementType() {
			return new IGrammarAwareElementType("QID_IDTerminalRuleCall_1_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getIDTerminalRuleCall_1_2());
		}
		public static IGrammarAwareElementType createQID_Group_2ElementType() {
			return new IGrammarAwareElementType("QID_Group_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createQID_FullStopKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("QID_FullStopKeyword_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getFullStopKeyword_2_0());
		}
		public static IGrammarAwareElementType createQID_IDTerminalRuleCall_2_1ElementType() {
			return new IGrammarAwareElementType("QID_IDTerminalRuleCall_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getIDTerminalRuleCall_2_1());
		}
		public static IGrammarAwareElementType createQID_Alternatives_2_2ElementType() {
			return new IGrammarAwareElementType("QID_Alternatives_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getAlternatives_2_2());
		}
		public static IGrammarAwareElementType createQID_INTTerminalRuleCall_2_2_0ElementType() {
			return new IGrammarAwareElementType("QID_INTTerminalRuleCall_2_2_0_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getINTTerminalRuleCall_2_2_0());
		}
		public static IGrammarAwareElementType createQID_HEXTerminalRuleCall_2_2_1ElementType() {
			return new IGrammarAwareElementType("QID_HEXTerminalRuleCall_2_2_1_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getHEXTerminalRuleCall_2_2_1());
		}
		public static IGrammarAwareElementType createQID_IDTerminalRuleCall_2_2_2ElementType() {
			return new IGrammarAwareElementType("QID_IDTerminalRuleCall_2_2_2_ELEMENT_TYPE", ExBeeLangTestLanguageLanguage.INSTANCE, GRAMMAR_ACCESS.getQIDAccess().getIDTerminalRuleCall_2_2_2());
		}
	}

	public static final IGrammarAwareElementType QID_ELEMENT_TYPE = associate(QIDFactory.createQIDElementType());

	public static final IGrammarAwareElementType QID_Group_ELEMENT_TYPE = associate(QIDFactory.createQID_GroupElementType());

	public static final IGrammarAwareElementType QID_IDTerminalRuleCall_0_ELEMENT_TYPE = associate(QIDFactory.createQID_IDTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType QID_Alternatives_1_ELEMENT_TYPE = associate(QIDFactory.createQID_Alternatives_1ElementType());

	public static final IGrammarAwareElementType QID_INTTerminalRuleCall_1_0_ELEMENT_TYPE = associate(QIDFactory.createQID_INTTerminalRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType QID_HEXTerminalRuleCall_1_1_ELEMENT_TYPE = associate(QIDFactory.createQID_HEXTerminalRuleCall_1_1ElementType());

	public static final IGrammarAwareElementType QID_IDTerminalRuleCall_1_2_ELEMENT_TYPE = associate(QIDFactory.createQID_IDTerminalRuleCall_1_2ElementType());

	public static final IGrammarAwareElementType QID_Group_2_ELEMENT_TYPE = associate(QIDFactory.createQID_Group_2ElementType());

	public static final IGrammarAwareElementType QID_FullStopKeyword_2_0_ELEMENT_TYPE = associate(QIDFactory.createQID_FullStopKeyword_2_0ElementType());

	public static final IGrammarAwareElementType QID_IDTerminalRuleCall_2_1_ELEMENT_TYPE = associate(QIDFactory.createQID_IDTerminalRuleCall_2_1ElementType());

	public static final IGrammarAwareElementType QID_Alternatives_2_2_ELEMENT_TYPE = associate(QIDFactory.createQID_Alternatives_2_2ElementType());

	public static final IGrammarAwareElementType QID_INTTerminalRuleCall_2_2_0_ELEMENT_TYPE = associate(QIDFactory.createQID_INTTerminalRuleCall_2_2_0ElementType());

	public static final IGrammarAwareElementType QID_HEXTerminalRuleCall_2_2_1_ELEMENT_TYPE = associate(QIDFactory.createQID_HEXTerminalRuleCall_2_2_1ElementType());

	public static final IGrammarAwareElementType QID_IDTerminalRuleCall_2_2_2_ELEMENT_TYPE = associate(QIDFactory.createQID_IDTerminalRuleCall_2_2_2ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getDelegateModelElementType() {
		return DelegateModel_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDelegateModel_ModelParserRuleCallElementType() {
		return DelegateModel_ModelParserRuleCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModelElementType() {
		return Model_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_AlternativesElementType() {
		return Model_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_UnitsAssignment_0ElementType() {
		return Model_UnitsAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_UnitsUnitParserRuleCall_0_0ElementType() {
		return Model_UnitsUnitParserRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_FunctionsAssignment_1ElementType() {
		return Model_FunctionsAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_FunctionsFunctionParserRuleCall_1_0ElementType() {
		return Model_FunctionsFunctionParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnitElementType() {
		return Unit_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_GroupElementType() {
		return Unit_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_UnitAction_0ElementType() {
		return Unit_UnitAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_DocumentationAssignment_1ElementType() {
		return Unit_DocumentationAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0ElementType() {
		return Unit_DocumentationDOCUMENTATIONTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_UnitKeyword_2ElementType() {
		return Unit_UnitKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_NameAssignment_3ElementType() {
		return Unit_NameAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_NameIDTerminalRuleCall_3_0ElementType() {
		return Unit_NameIDTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_4ElementType() {
		return Unit_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_VersionKeyword_4_0ElementType() {
		return Unit_VersionKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_VersionAssignment_4_1ElementType() {
		return Unit_VersionAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_VersionIDTerminalRuleCall_4_1_0ElementType() {
		return Unit_VersionIDTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_5ElementType() {
		return Unit_Group_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ImplementsKeyword_5_0ElementType() {
		return Unit_ImplementsKeyword_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ImplementsAssignment_5_1ElementType() {
		return Unit_ImplementsAssignment_5_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ImplementsSimpleTypeRefParserRuleCall_5_1_0ElementType() {
		return Unit_ImplementsSimpleTypeRefParserRuleCall_5_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_5_2ElementType() {
		return Unit_Group_5_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_CommaKeyword_5_2_0ElementType() {
		return Unit_CommaKeyword_5_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ImplementsAssignment_5_2_1ElementType() {
		return Unit_ImplementsAssignment_5_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0ElementType() {
		return Unit_ImplementsSimpleTypeRefParserRuleCall_5_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_LeftCurlyBracketKeyword_6ElementType() {
		return Unit_LeftCurlyBracketKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_UnorderedGroup_7ElementType() {
		return Unit_UnorderedGroup_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_7_0ElementType() {
		return Unit_Group_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SourceKeyword_7_0_0ElementType() {
		return Unit_SourceKeyword_7_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ColonKeyword_7_0_1ElementType() {
		return Unit_ColonKeyword_7_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SourceLocationAssignment_7_0_2ElementType() {
		return Unit_SourceLocationAssignment_7_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SourceLocationPathParserRuleCall_7_0_2_0ElementType() {
		return Unit_SourceLocationPathParserRuleCall_7_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SemicolonKeyword_7_0_3ElementType() {
		return Unit_SemicolonKeyword_7_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_7_1ElementType() {
		return Unit_Group_7_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_OutputKeyword_7_1_0ElementType() {
		return Unit_OutputKeyword_7_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ColonKeyword_7_1_1ElementType() {
		return Unit_ColonKeyword_7_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_OutputLocationAssignment_7_1_2ElementType() {
		return Unit_OutputLocationAssignment_7_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_OutputLocationPathParserRuleCall_7_1_2_0ElementType() {
		return Unit_OutputLocationPathParserRuleCall_7_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SemicolonKeyword_7_1_3ElementType() {
		return Unit_SemicolonKeyword_7_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_7_2ElementType() {
		return Unit_Group_7_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ProvidesKeyword_7_2_0ElementType() {
		return Unit_ProvidesKeyword_7_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ColonKeyword_7_2_1ElementType() {
		return Unit_ColonKeyword_7_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ProvidedCapabilitiesAssignment_7_2_2ElementType() {
		return Unit_ProvidedCapabilitiesAssignment_7_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0ElementType() {
		return Unit_ProvidedCapabilitiesProvidedCapabilityParserRuleCall_7_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SemicolonKeyword_7_2_3ElementType() {
		return Unit_SemicolonKeyword_7_2_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_7_3ElementType() {
		return Unit_Group_7_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_RequiresKeyword_7_3_0ElementType() {
		return Unit_RequiresKeyword_7_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ColonKeyword_7_3_1ElementType() {
		return Unit_ColonKeyword_7_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_RequiredCapabilitiesAssignment_7_3_2ElementType() {
		return Unit_RequiredCapabilitiesAssignment_7_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0ElementType() {
		return Unit_RequiredCapabilitiesAliasedRequiredCapabilityParserRuleCall_7_3_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SemicolonKeyword_7_3_3ElementType() {
		return Unit_SemicolonKeyword_7_3_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_Group_7_4ElementType() {
		return Unit_Group_7_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_RequiresKeyword_7_4_0ElementType() {
		return Unit_RequiresKeyword_7_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_EnvKeyword_7_4_1ElementType() {
		return Unit_EnvKeyword_7_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_ColonKeyword_7_4_2ElementType() {
		return Unit_ColonKeyword_7_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_MetaRequiredCapabilitiesAssignment_7_4_3ElementType() {
		return Unit_MetaRequiredCapabilitiesAssignment_7_4_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0ElementType() {
		return Unit_MetaRequiredCapabilitiesRequiredCapabilityParserRuleCall_7_4_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_SemicolonKeyword_7_4_4ElementType() {
		return Unit_SemicolonKeyword_7_4_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_FunctionsAssignment_7_5ElementType() {
		return Unit_FunctionsAssignment_7_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_FunctionsFunctionParserRuleCall_7_5_0ElementType() {
		return Unit_FunctionsFunctionParserRuleCall_7_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnit_RightCurlyBracketKeyword_8ElementType() {
		return Unit_RightCurlyBracketKeyword_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapabilityElementType() {
		return ProvidedCapability_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_GroupElementType() {
		return ProvidedCapability_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_ProvidedCapabilityAction_0ElementType() {
		return ProvidedCapability_ProvidedCapabilityAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_Alternatives_1ElementType() {
		return ProvidedCapability_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_NameSpaceAssignment_1_0ElementType() {
		return ProvidedCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType() {
		return ProvidedCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_UnitKeyword_1_1ElementType() {
		return ProvidedCapability_UnitKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_Group_2ElementType() {
		return ProvidedCapability_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_LeftCurlyBracketKeyword_2_0ElementType() {
		return ProvidedCapability_LeftCurlyBracketKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_UnorderedGroup_2_1ElementType() {
		return ProvidedCapability_UnorderedGroup_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_Group_2_1_0ElementType() {
		return ProvidedCapability_Group_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_WhenKeyword_2_1_0_0ElementType() {
		return ProvidedCapability_WhenKeyword_2_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_ColonKeyword_2_1_0_1ElementType() {
		return ProvidedCapability_ColonKeyword_2_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_CondExprAssignment_2_1_0_2ElementType() {
		return ProvidedCapability_CondExprAssignment_2_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0ElementType() {
		return ProvidedCapability_CondExprExpressionParserRuleCall_2_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_SemicolonKeyword_2_1_0_3ElementType() {
		return ProvidedCapability_SemicolonKeyword_2_1_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_Group_2_1_1ElementType() {
		return ProvidedCapability_Group_2_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_NameKeyword_2_1_1_0ElementType() {
		return ProvidedCapability_NameKeyword_2_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_ColonKeyword_2_1_1_1ElementType() {
		return ProvidedCapability_ColonKeyword_2_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_NameAssignment_2_1_1_2ElementType() {
		return ProvidedCapability_NameAssignment_2_1_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0ElementType() {
		return ProvidedCapability_NameIDTerminalRuleCall_2_1_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_SemicolonKeyword_2_1_1_3ElementType() {
		return ProvidedCapability_SemicolonKeyword_2_1_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_Group_2_1_2ElementType() {
		return ProvidedCapability_Group_2_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_VersionKeyword_2_1_2_0ElementType() {
		return ProvidedCapability_VersionKeyword_2_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_ColonKeyword_2_1_2_1ElementType() {
		return ProvidedCapability_ColonKeyword_2_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_VersionAssignment_2_1_2_2ElementType() {
		return ProvidedCapability_VersionAssignment_2_1_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0ElementType() {
		return ProvidedCapability_VersionIDTerminalRuleCall_2_1_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_SemicolonKeyword_2_1_2_3ElementType() {
		return ProvidedCapability_SemicolonKeyword_2_1_2_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getProvidedCapability_RightCurlyBracketKeyword_2_2ElementType() {
		return ProvidedCapability_RightCurlyBracketKeyword_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapabilityElementType() {
		return AliasedRequiredCapability_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_GroupElementType() {
		return AliasedRequiredCapability_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Alternatives_0ElementType() {
		return AliasedRequiredCapability_Alternatives_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_NameSpaceAssignment_0_0ElementType() {
		return AliasedRequiredCapability_NameSpaceAssignment_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0ElementType() {
		return AliasedRequiredCapability_NameSpaceIDTerminalRuleCall_0_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_UnitKeyword_0_1ElementType() {
		return AliasedRequiredCapability_UnitKeyword_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_NameAssignment_1ElementType() {
		return AliasedRequiredCapability_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_NameIDTerminalRuleCall_1_0ElementType() {
		return AliasedRequiredCapability_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_2ElementType() {
		return AliasedRequiredCapability_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_AsKeyword_2_0ElementType() {
		return AliasedRequiredCapability_AsKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_AliasAssignment_2_1ElementType() {
		return AliasedRequiredCapability_AliasAssignment_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0ElementType() {
		return AliasedRequiredCapability_AliasIDTerminalRuleCall_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3ElementType() {
		return AliasedRequiredCapability_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType() {
		return AliasedRequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_UnorderedGroup_3_1ElementType() {
		return AliasedRequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3_1_0ElementType() {
		return AliasedRequiredCapability_Group_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_WhenKeyword_3_1_0_0ElementType() {
		return AliasedRequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_ColonKeyword_3_1_0_1ElementType() {
		return AliasedRequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_CondExprAssignment_3_1_0_2ElementType() {
		return AliasedRequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType() {
		return AliasedRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_SemicolonKeyword_3_1_0_3ElementType() {
		return AliasedRequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3_1_1ElementType() {
		return AliasedRequiredCapability_Group_3_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_GreedyAssignment_3_1_1_0ElementType() {
		return AliasedRequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType() {
		return AliasedRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_SemicolonKeyword_3_1_1_1ElementType() {
		return AliasedRequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3_1_2ElementType() {
		return AliasedRequiredCapability_Group_3_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType() {
		return AliasedRequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_ColonKeyword_3_1_2_1ElementType() {
		return AliasedRequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_MinAssignment_3_1_2_2ElementType() {
		return AliasedRequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType() {
		return AliasedRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_SemicolonKeyword_3_1_2_3ElementType() {
		return AliasedRequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3_1_3ElementType() {
		return AliasedRequiredCapability_Group_3_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType() {
		return AliasedRequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_ColonKeyword_3_1_3_1ElementType() {
		return AliasedRequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_MaxAssignment_3_1_3_2ElementType() {
		return AliasedRequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType() {
		return AliasedRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_SemicolonKeyword_3_1_3_3ElementType() {
		return AliasedRequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_Group_3_1_4ElementType() {
		return AliasedRequiredCapability_Group_3_1_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_VersionKeyword_3_1_4_0ElementType() {
		return AliasedRequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_ColonKeyword_3_1_4_1ElementType() {
		return AliasedRequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType() {
		return AliasedRequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType() {
		return AliasedRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_SemicolonKeyword_3_1_4_3ElementType() {
		return AliasedRequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAliasedRequiredCapability_RightCurlyBracketKeyword_3_2ElementType() {
		return AliasedRequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapabilityElementType() {
		return RequiredCapability_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_GroupElementType() {
		return RequiredCapability_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_RequiredCapabilityAction_0ElementType() {
		return RequiredCapability_RequiredCapabilityAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Alternatives_1ElementType() {
		return RequiredCapability_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_NameSpaceAssignment_1_0ElementType() {
		return RequiredCapability_NameSpaceAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0ElementType() {
		return RequiredCapability_NameSpaceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_UnitKeyword_1_1ElementType() {
		return RequiredCapability_UnitKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_NameAssignment_2ElementType() {
		return RequiredCapability_NameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_NameIDTerminalRuleCall_2_0ElementType() {
		return RequiredCapability_NameIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3ElementType() {
		return RequiredCapability_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_LeftCurlyBracketKeyword_3_0ElementType() {
		return RequiredCapability_LeftCurlyBracketKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_UnorderedGroup_3_1ElementType() {
		return RequiredCapability_UnorderedGroup_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3_1_0ElementType() {
		return RequiredCapability_Group_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_WhenKeyword_3_1_0_0ElementType() {
		return RequiredCapability_WhenKeyword_3_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_ColonKeyword_3_1_0_1ElementType() {
		return RequiredCapability_ColonKeyword_3_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_CondExprAssignment_3_1_0_2ElementType() {
		return RequiredCapability_CondExprAssignment_3_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0ElementType() {
		return RequiredCapability_CondExprExpressionParserRuleCall_3_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_SemicolonKeyword_3_1_0_3ElementType() {
		return RequiredCapability_SemicolonKeyword_3_1_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3_1_1ElementType() {
		return RequiredCapability_Group_3_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_GreedyAssignment_3_1_1_0ElementType() {
		return RequiredCapability_GreedyAssignment_3_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_GreedyGreedyKeyword_3_1_1_0_0ElementType() {
		return RequiredCapability_GreedyGreedyKeyword_3_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_SemicolonKeyword_3_1_1_1ElementType() {
		return RequiredCapability_SemicolonKeyword_3_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3_1_2ElementType() {
		return RequiredCapability_Group_3_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_RequiresMinKeyword_3_1_2_0ElementType() {
		return RequiredCapability_RequiresMinKeyword_3_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_ColonKeyword_3_1_2_1ElementType() {
		return RequiredCapability_ColonKeyword_3_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_MinAssignment_3_1_2_2ElementType() {
		return RequiredCapability_MinAssignment_3_1_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0ElementType() {
		return RequiredCapability_MinINTTerminalRuleCall_3_1_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_SemicolonKeyword_3_1_2_3ElementType() {
		return RequiredCapability_SemicolonKeyword_3_1_2_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3_1_3ElementType() {
		return RequiredCapability_Group_3_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_RequiresMaxKeyword_3_1_3_0ElementType() {
		return RequiredCapability_RequiresMaxKeyword_3_1_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_ColonKeyword_3_1_3_1ElementType() {
		return RequiredCapability_ColonKeyword_3_1_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_MaxAssignment_3_1_3_2ElementType() {
		return RequiredCapability_MaxAssignment_3_1_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0ElementType() {
		return RequiredCapability_MaxINTTerminalRuleCall_3_1_3_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_SemicolonKeyword_3_1_3_3ElementType() {
		return RequiredCapability_SemicolonKeyword_3_1_3_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_Group_3_1_4ElementType() {
		return RequiredCapability_Group_3_1_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_VersionKeyword_3_1_4_0ElementType() {
		return RequiredCapability_VersionKeyword_3_1_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_ColonKeyword_3_1_4_1ElementType() {
		return RequiredCapability_ColonKeyword_3_1_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_VersionRangeAssignment_3_1_4_2ElementType() {
		return RequiredCapability_VersionRangeAssignment_3_1_4_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0ElementType() {
		return RequiredCapability_VersionRangeIDTerminalRuleCall_3_1_4_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_SemicolonKeyword_3_1_4_3ElementType() {
		return RequiredCapability_SemicolonKeyword_3_1_4_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRequiredCapability_RightCurlyBracketKeyword_3_2ElementType() {
		return RequiredCapability_RightCurlyBracketKeyword_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPathElementType() {
		return Path_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_AlternativesElementType() {
		return Path_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_STRINGTerminalRuleCall_0ElementType() {
		return Path_STRINGTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_Group_1ElementType() {
		return Path_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_SolidusKeyword_1_0ElementType() {
		return Path_SolidusKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_QIDParserRuleCall_1_1ElementType() {
		return Path_QIDParserRuleCall_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_Group_1_2ElementType() {
		return Path_Group_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_SolidusKeyword_1_2_0ElementType() {
		return Path_SolidusKeyword_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_QIDParserRuleCall_1_2_1ElementType() {
		return Path_QIDParserRuleCall_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPath_SolidusKeyword_1_3ElementType() {
		return Path_SolidusKeyword_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterListElementType() {
		return ParameterList_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_GroupElementType() {
		return ParameterList_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_ParametersAssignment_0ElementType() {
		return ParameterList_ParametersAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_ParametersFirstParameterParserRuleCall_0_0ElementType() {
		return ParameterList_ParametersFirstParameterParserRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_Group_1ElementType() {
		return ParameterList_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_CommaKeyword_1_0ElementType() {
		return ParameterList_CommaKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_ParametersAssignment_1_1ElementType() {
		return ParameterList_ParametersAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterList_ParametersFirstParameterParserRuleCall_1_1_0ElementType() {
		return ParameterList_ParametersFirstParameterParserRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFirstParameterElementType() {
		return FirstParameter_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFirstParameter_AlternativesElementType() {
		return FirstParameter_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFirstParameter_ClosureParameterParserRuleCall_0ElementType() {
		return FirstParameter_ClosureParameterParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFirstParameter_ParameterParserRuleCall_1ElementType() {
		return FirstParameter_ParameterParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterElementType() {
		return Parameter_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameter_ExprAssignmentElementType() {
		return Parameter_ExprAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameter_ExprExpressionParserRuleCall_0ElementType() {
		return Parameter_ExprExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureParameterElementType() {
		return ClosureParameter_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureParameter_ExprAssignmentElementType() {
		return ClosureParameter_ExprAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureParameter_ExprClosureExpressionParserRuleCall_0ElementType() {
		return ClosureParameter_ExprClosureExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclarationElementType() {
		return ParameterDeclaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclaration_GroupElementType() {
		return ParameterDeclaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclaration_TypeAssignment_0ElementType() {
		return ParameterDeclaration_TypeAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclaration_TypeTypeRefParserRuleCall_0_0ElementType() {
		return ParameterDeclaration_TypeTypeRefParserRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclaration_NameAssignment_1ElementType() {
		return ParameterDeclaration_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParameterDeclaration_NameIDTerminalRuleCall_1_0ElementType() {
		return ParameterDeclaration_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunctionElementType() {
		return Function_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_GroupElementType() {
		return Function_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_DocumentationAssignment_0ElementType() {
		return Function_DocumentationAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_DocumentationDOCUMENTATIONTerminalRuleCall_0_0ElementType() {
		return Function_DocumentationDOCUMENTATIONTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VisibilityAssignment_1ElementType() {
		return Function_VisibilityAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VisibilityIDTerminalRuleCall_1_0ElementType() {
		return Function_VisibilityIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FinalAssignment_2ElementType() {
		return Function_FinalAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FinalFinalKeyword_2_0ElementType() {
		return Function_FinalFinalKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FunctionKeyword_3ElementType() {
		return Function_FunctionKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ReturnTypeAssignment_4ElementType() {
		return Function_ReturnTypeAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ReturnTypeTypeRefParserRuleCall_4_0ElementType() {
		return Function_ReturnTypeTypeRefParserRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_NameAssignment_5ElementType() {
		return Function_NameAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_NameIDTerminalRuleCall_5_0ElementType() {
		return Function_NameIDTerminalRuleCall_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_6ElementType() {
		return Function_Group_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_LeftParenthesisKeyword_6_0ElementType() {
		return Function_LeftParenthesisKeyword_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Alternatives_6_1ElementType() {
		return Function_Alternatives_6_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_6_1_0ElementType() {
		return Function_Group_6_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersAssignment_6_1_0_0ElementType() {
		return Function_ParametersAssignment_6_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0ElementType() {
		return Function_ParametersParameterDeclarationParserRuleCall_6_1_0_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_6_1_0_1ElementType() {
		return Function_Group_6_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_CommaKeyword_6_1_0_1_0ElementType() {
		return Function_CommaKeyword_6_1_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersAssignment_6_1_0_1_1ElementType() {
		return Function_ParametersAssignment_6_1_0_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0ElementType() {
		return Function_ParametersParameterDeclarationParserRuleCall_6_1_0_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_6_1_0_2ElementType() {
		return Function_Group_6_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_CommaKeyword_6_1_0_2_0ElementType() {
		return Function_CommaKeyword_6_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VarArgsAssignment_6_1_0_2_1ElementType() {
		return Function_VarArgsAssignment_6_1_0_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0ElementType() {
		return Function_VarArgsFullStopFullStopFullStopKeyword_6_1_0_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersAssignment_6_1_0_2_2ElementType() {
		return Function_ParametersAssignment_6_1_0_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0ElementType() {
		return Function_ParametersParameterDeclarationParserRuleCall_6_1_0_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_6_1_1ElementType() {
		return Function_Group_6_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VarArgsAssignment_6_1_1_0ElementType() {
		return Function_VarArgsAssignment_6_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0ElementType() {
		return Function_VarArgsFullStopFullStopFullStopKeyword_6_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersAssignment_6_1_1_1ElementType() {
		return Function_ParametersAssignment_6_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0ElementType() {
		return Function_ParametersParameterDeclarationParserRuleCall_6_1_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_RightParenthesisKeyword_6_2ElementType() {
		return Function_RightParenthesisKeyword_6_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_7ElementType() {
		return Function_Group_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_WhenKeyword_7_0ElementType() {
		return Function_WhenKeyword_7_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_GuardAssignment_7_1ElementType() {
		return Function_GuardAssignment_7_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_GuardGuardExpressionParserRuleCall_7_1_0ElementType() {
		return Function_GuardGuardExpressionParserRuleCall_7_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Alternatives_8ElementType() {
		return Function_Alternatives_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_Group_8_0ElementType() {
		return Function_Group_8_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_ColonKeyword_8_0_0ElementType() {
		return Function_ColonKeyword_8_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FuncExprAssignment_8_0_1ElementType() {
		return Function_FuncExprAssignment_8_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FuncExprExpressionParserRuleCall_8_0_1_0ElementType() {
		return Function_FuncExprExpressionParserRuleCall_8_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_SemicolonKeyword_8_0_2ElementType() {
		return Function_SemicolonKeyword_8_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FuncExprAssignment_8_1ElementType() {
		return Function_FuncExprAssignment_8_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFunction_FuncExprBlockExpressionParserRuleCall_8_1_0ElementType() {
		return Function_FuncExprBlockExpressionParserRuleCall_8_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpressionElementType() {
		return GuardExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_AlternativesElementType() {
		return GuardExpression_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_Group_0ElementType() {
		return GuardExpression_Group_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_ColonKeyword_0_0ElementType() {
		return GuardExpression_ColonKeyword_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_GuardExprAssignment_0_1ElementType() {
		return GuardExpression_GuardExprAssignment_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_GuardExprExpressionParserRuleCall_0_1_0ElementType() {
		return GuardExpression_GuardExprExpressionParserRuleCall_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_SemicolonKeyword_0_2ElementType() {
		return GuardExpression_SemicolonKeyword_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_GuardExprAssignment_1ElementType() {
		return GuardExpression_GuardExprAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getGuardExpression_GuardExprBlockExpressionParserRuleCall_1_0ElementType() {
		return GuardExpression_GuardExprBlockExpressionParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperatorElementType() {
		return AssignmentOperator_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_AlternativesElementType() {
		return AssignmentOperator_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_EqualsSignKeyword_0ElementType() {
		return AssignmentOperator_EqualsSignKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_PlusSignEqualsSignKeyword_1ElementType() {
		return AssignmentOperator_PlusSignEqualsSignKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_HyphenMinusEqualsSignKeyword_2ElementType() {
		return AssignmentOperator_HyphenMinusEqualsSignKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_AsteriskEqualsSignKeyword_3ElementType() {
		return AssignmentOperator_AsteriskEqualsSignKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_SolidusEqualsSignKeyword_4ElementType() {
		return AssignmentOperator_SolidusEqualsSignKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentOperator_PercentSignEqualsSignKeyword_5ElementType() {
		return AssignmentOperator_PercentSignEqualsSignKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperatorElementType() {
		return RelationalOperator_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_AlternativesElementType() {
		return RelationalOperator_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_TildeEqualsSignKeyword_0ElementType() {
		return RelationalOperator_TildeEqualsSignKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_EqualsSignEqualsSignKeyword_1ElementType() {
		return RelationalOperator_EqualsSignEqualsSignKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2ElementType() {
		return RelationalOperator_EqualsSignEqualsSignEqualsSignKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_ExclamationMarkEqualsSignKeyword_3ElementType() {
		return RelationalOperator_ExclamationMarkEqualsSignKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4ElementType() {
		return RelationalOperator_ExclamationMarkEqualsSignEqualsSignKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_GreaterThanSignEqualsSignKeyword_5ElementType() {
		return RelationalOperator_GreaterThanSignEqualsSignKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_LessThanSignEqualsSignKeyword_6ElementType() {
		return RelationalOperator_LessThanSignEqualsSignKeyword_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_GreaterThanSignKeyword_7ElementType() {
		return RelationalOperator_GreaterThanSignKeyword_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalOperator_LessThanSignKeyword_8ElementType() {
		return RelationalOperator_LessThanSignKeyword_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTopLevelExpressionElementType() {
		return TopLevelExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTopLevelExpression_AlternativesElementType() {
		return TopLevelExpression_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTopLevelExpression_VarDeclarationParserRuleCall_0ElementType() {
		return TopLevelExpression_VarDeclarationParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTopLevelExpression_ValDeclarationParserRuleCall_1ElementType() {
		return TopLevelExpression_ValDeclarationParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTopLevelExpression_AssignmentExpressionParserRuleCall_2ElementType() {
		return TopLevelExpression_AssignmentExpressionParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getExpressionElementType() {
		return Expression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getExpression_AssignmentExpressionParserRuleCallElementType() {
		return Expression_AssignmentExpressionParserRuleCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpressionElementType() {
		return AssignmentExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_GroupElementType() {
		return AssignmentExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_CachedExpressionParserRuleCall_0ElementType() {
		return AssignmentExpression_CachedExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_Group_1ElementType() {
		return AssignmentExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_AssignmentExpressionLeftExprAction_1_0ElementType() {
		return AssignmentExpression_AssignmentExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_FunctionNameAssignment_1_1ElementType() {
		return AssignmentExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0ElementType() {
		return AssignmentExpression_FunctionNameAssignmentOperatorParserRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_RightExprAssignment_1_2ElementType() {
		return AssignmentExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0ElementType() {
		return AssignmentExpression_RightExprAssignmentExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclarationElementType() {
		return VarDeclaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_GroupElementType() {
		return VarDeclaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_DefValueAction_0ElementType() {
		return VarDeclaration_DefValueAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_FinalAssignment_1ElementType() {
		return VarDeclaration_FinalAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_FinalFinalKeyword_1_0ElementType() {
		return VarDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_Group_2ElementType() {
		return VarDeclaration_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_Alternatives_2_0ElementType() {
		return VarDeclaration_Alternatives_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_VarKeyword_2_0_0ElementType() {
		return VarDeclaration_VarKeyword_2_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_TypeAssignment_2_0_1ElementType() {
		return VarDeclaration_TypeAssignment_2_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0ElementType() {
		return VarDeclaration_TypeTypeRefParserRuleCall_2_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_NameAssignment_2_1ElementType() {
		return VarDeclaration_NameAssignment_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_NameIDTerminalRuleCall_2_1_0ElementType() {
		return VarDeclaration_NameIDTerminalRuleCall_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_Group_3ElementType() {
		return VarDeclaration_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_EqualsSignKeyword_3_0ElementType() {
		return VarDeclaration_EqualsSignKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_ValueExprAssignment_3_1ElementType() {
		return VarDeclaration_ValueExprAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarDeclaration_ValueExprExpressionParserRuleCall_3_1_0ElementType() {
		return VarDeclaration_ValueExprExpressionParserRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclarationElementType() {
		return ValDeclaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_GroupElementType() {
		return ValDeclaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_DefValueAction_0ElementType() {
		return ValDeclaration_DefValueAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_FinalAssignment_1ElementType() {
		return ValDeclaration_FinalAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_FinalFinalKeyword_1_0ElementType() {
		return ValDeclaration_FinalFinalKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_ImmutableAssignment_2ElementType() {
		return ValDeclaration_ImmutableAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_ImmutableValKeyword_2_0ElementType() {
		return ValDeclaration_ImmutableValKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_TypeAssignment_3ElementType() {
		return ValDeclaration_TypeAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_TypeTypeRefParserRuleCall_3_0ElementType() {
		return ValDeclaration_TypeTypeRefParserRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_NameAssignment_4ElementType() {
		return ValDeclaration_NameAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_NameIDTerminalRuleCall_4_0ElementType() {
		return ValDeclaration_NameIDTerminalRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_EqualsSignKeyword_5ElementType() {
		return ValDeclaration_EqualsSignKeyword_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_ValueExprAssignment_6ElementType() {
		return ValDeclaration_ValueExprAssignment_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValDeclaration_ValueExprExpressionParserRuleCall_6_0ElementType() {
		return ValDeclaration_ValueExprExpressionParserRuleCall_6_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTypeRefElementType() {
		return TypeRef_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTypeRef_AlternativesElementType() {
		return TypeRef_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTypeRef_ClosureTypeRefParserRuleCall_0ElementType() {
		return TypeRef_ClosureTypeRefParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getTypeRef_SimpleTypeRefParserRuleCall_1ElementType() {
		return TypeRef_SimpleTypeRefParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRefElementType() {
		return SimpleTypeRef_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_GroupElementType() {
		return SimpleTypeRef_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_RawTypeAssignment_0ElementType() {
		return SimpleTypeRef_RawTypeAssignment_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_RawTypeIDTerminalRuleCall_0_0ElementType() {
		return SimpleTypeRef_RawTypeIDTerminalRuleCall_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_Group_1ElementType() {
		return SimpleTypeRef_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_LessThanSignKeyword_1_0ElementType() {
		return SimpleTypeRef_LessThanSignKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_ActualArgumentsListAssignment_1_1ElementType() {
		return SimpleTypeRef_ActualArgumentsListAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0ElementType() {
		return SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_Group_1_2ElementType() {
		return SimpleTypeRef_Group_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_CommaKeyword_1_2_0ElementType() {
		return SimpleTypeRef_CommaKeyword_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_ActualArgumentsListAssignment_1_2_1ElementType() {
		return SimpleTypeRef_ActualArgumentsListAssignment_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0ElementType() {
		return SimpleTypeRef_ActualArgumentsListIDTerminalRuleCall_1_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSimpleTypeRef_GreaterThanSignKeyword_1_3ElementType() {
		return SimpleTypeRef_GreaterThanSignKeyword_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRefElementType() {
		return ClosureTypeRef_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_GroupElementType() {
		return ClosureTypeRef_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_LeftParenthesisKeyword_0ElementType() {
		return ClosureTypeRef_LeftParenthesisKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_Alternatives_1ElementType() {
		return ClosureTypeRef_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_Group_1_0ElementType() {
		return ClosureTypeRef_Group_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesAssignment_1_0_0ElementType() {
		return ClosureTypeRef_ParameterTypesAssignment_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0ElementType() {
		return ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_Group_1_0_1ElementType() {
		return ClosureTypeRef_Group_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_CommaKeyword_1_0_1_0ElementType() {
		return ClosureTypeRef_CommaKeyword_1_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesAssignment_1_0_1_1ElementType() {
		return ClosureTypeRef_ParameterTypesAssignment_1_0_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0ElementType() {
		return ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_Group_1_0_2ElementType() {
		return ClosureTypeRef_Group_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_CommaKeyword_1_0_2_0ElementType() {
		return ClosureTypeRef_CommaKeyword_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_VarArgsAssignment_1_0_2_1ElementType() {
		return ClosureTypeRef_VarArgsAssignment_1_0_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0ElementType() {
		return ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_0_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesAssignment_1_0_2_2ElementType() {
		return ClosureTypeRef_ParameterTypesAssignment_1_0_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0ElementType() {
		return ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_0_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_Group_1_1ElementType() {
		return ClosureTypeRef_Group_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_VarArgsAssignment_1_1_0ElementType() {
		return ClosureTypeRef_VarArgsAssignment_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0ElementType() {
		return ClosureTypeRef_VarArgsFullStopFullStopFullStopKeyword_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesAssignment_1_1_1ElementType() {
		return ClosureTypeRef_ParameterTypesAssignment_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0ElementType() {
		return ClosureTypeRef_ParameterTypesIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_RightParenthesisKeyword_2ElementType() {
		return ClosureTypeRef_RightParenthesisKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_EqualsSignGreaterThanSignKeyword_3ElementType() {
		return ClosureTypeRef_EqualsSignGreaterThanSignKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ReturnTypeAssignment_4ElementType() {
		return ClosureTypeRef_ReturnTypeAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0ElementType() {
		return ClosureTypeRef_ReturnTypeIDTerminalRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpressionElementType() {
		return CachedExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_AlternativesElementType() {
		return CachedExpression_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_Group_0ElementType() {
		return CachedExpression_Group_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_CachedExpressionAction_0_0ElementType() {
		return CachedExpression_CachedExpressionAction_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_CachedKeyword_0_1ElementType() {
		return CachedExpression_CachedKeyword_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_ExprAssignment_0_2ElementType() {
		return CachedExpression_ExprAssignment_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_ExprOrExpressionParserRuleCall_0_2_0ElementType() {
		return CachedExpression_ExprOrExpressionParserRuleCall_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCachedExpression_OrExpressionParserRuleCall_1ElementType() {
		return CachedExpression_OrExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpressionElementType() {
		return OrExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_GroupElementType() {
		return OrExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_AndExpressionParserRuleCall_0ElementType() {
		return OrExpression_AndExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_Group_1ElementType() {
		return OrExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_OrExpressionLeftExprAction_1_0ElementType() {
		return OrExpression_OrExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_VerticalLineVerticalLineKeyword_1_1ElementType() {
		return OrExpression_VerticalLineVerticalLineKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_RightExprAssignment_1_2ElementType() {
		return OrExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOrExpression_RightExprAndExpressionParserRuleCall_1_2_0ElementType() {
		return OrExpression_RightExprAndExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpressionElementType() {
		return AndExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_GroupElementType() {
		return AndExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_RelationalExpressionParserRuleCall_0ElementType() {
		return AndExpression_RelationalExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_Group_1ElementType() {
		return AndExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_AndExpressionLeftExprAction_1_0ElementType() {
		return AndExpression_AndExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_AmpersandAmpersandKeyword_1_1ElementType() {
		return AndExpression_AmpersandAmpersandKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_RightExprAssignment_1_2ElementType() {
		return AndExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0ElementType() {
		return AndExpression_RightExprRelationalExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpressionElementType() {
		return RelationalExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_GroupElementType() {
		return RelationalExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_AdditiveExpressionParserRuleCall_0ElementType() {
		return RelationalExpression_AdditiveExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_Group_1ElementType() {
		return RelationalExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
		return RelationalExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_FunctionNameAssignment_1_1ElementType() {
		return RelationalExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0ElementType() {
		return RelationalExpression_FunctionNameRelationalOperatorParserRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_RightExprAssignment_1_2ElementType() {
		return RelationalExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getRelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0ElementType() {
		return RelationalExpression_RightExprAdditiveExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpressionElementType() {
		return AdditiveExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_GroupElementType() {
		return AdditiveExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_MultiplicativeExpressionParserRuleCall_0ElementType() {
		return AdditiveExpression_MultiplicativeExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_Group_1ElementType() {
		return AdditiveExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
		return AdditiveExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_FunctionNameAssignment_1_1ElementType() {
		return AdditiveExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_FunctionNameAlternatives_1_1_0ElementType() {
		return AdditiveExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0ElementType() {
		return AdditiveExpression_FunctionNamePlusSignKeyword_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1ElementType() {
		return AdditiveExpression_FunctionNameHyphenMinusKeyword_1_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_RightExprAssignment_1_2ElementType() {
		return AdditiveExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0ElementType() {
		return AdditiveExpression_RightExprMultiplicativeExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpressionElementType() {
		return MultiplicativeExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_GroupElementType() {
		return MultiplicativeExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_SetExpressionParserRuleCall_0ElementType() {
		return MultiplicativeExpression_SetExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_Group_1ElementType() {
		return MultiplicativeExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
		return MultiplicativeExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_FunctionNameAssignment_1_1ElementType() {
		return MultiplicativeExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_FunctionNameAlternatives_1_1_0ElementType() {
		return MultiplicativeExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0ElementType() {
		return MultiplicativeExpression_FunctionNameAsteriskKeyword_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1ElementType() {
		return MultiplicativeExpression_FunctionNameSolidusKeyword_1_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2ElementType() {
		return MultiplicativeExpression_FunctionNamePercentSignKeyword_1_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_RightExprAssignment_1_2ElementType() {
		return MultiplicativeExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getMultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0ElementType() {
		return MultiplicativeExpression_RightExprSetExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpressionElementType() {
		return SetExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_GroupElementType() {
		return SetExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_UnaryOrInfixExpressionParserRuleCall_0ElementType() {
		return SetExpression_UnaryOrInfixExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_Group_1ElementType() {
		return SetExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_BinaryOpExpressionLeftExprAction_1_0ElementType() {
		return SetExpression_BinaryOpExpressionLeftExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_FunctionNameAssignment_1_1ElementType() {
		return SetExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_FunctionNameFullStopFullStopKeyword_1_1_0ElementType() {
		return SetExpression_FunctionNameFullStopFullStopKeyword_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_RightExprAssignment_1_2ElementType() {
		return SetExpression_RightExprAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getSetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0ElementType() {
		return SetExpression_RightExprUnaryOrInfixExpressionParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryOrInfixExpressionElementType() {
		return UnaryOrInfixExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryOrInfixExpression_AlternativesElementType() {
		return UnaryOrInfixExpression_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryOrInfixExpression_PostopExpressionParserRuleCall_0ElementType() {
		return UnaryOrInfixExpression_PostopExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryOrInfixExpression_UnaryExpressionParserRuleCall_1ElementType() {
		return UnaryOrInfixExpression_UnaryExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryOrInfixExpression_PreopExpressionParserRuleCall_2ElementType() {
		return UnaryOrInfixExpression_PreopExpressionParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpressionElementType() {
		return UnaryExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_GroupElementType() {
		return UnaryExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_UnaryOpExpressionAction_0ElementType() {
		return UnaryExpression_UnaryOpExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_FunctionNameAssignment_1ElementType() {
		return UnaryExpression_FunctionNameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_FunctionNameAlternatives_1_0ElementType() {
		return UnaryExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0ElementType() {
		return UnaryExpression_FunctionNameExclamationMarkKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1ElementType() {
		return UnaryExpression_FunctionNameHyphenMinusKeyword_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_ExprAssignment_2ElementType() {
		return UnaryExpression_ExprAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getUnaryExpression_ExprInfixExpressionParserRuleCall_2_0ElementType() {
		return UnaryExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpressionElementType() {
		return PreopExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_GroupElementType() {
		return PreopExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_UnaryPreOpExpressionAction_0ElementType() {
		return PreopExpression_UnaryPreOpExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_FunctionNameAssignment_1ElementType() {
		return PreopExpression_FunctionNameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_FunctionNameAlternatives_1_0ElementType() {
		return PreopExpression_FunctionNameAlternatives_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0ElementType() {
		return PreopExpression_FunctionNamePlusSignPlusSignKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1ElementType() {
		return PreopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_ExprAssignment_2ElementType() {
		return PreopExpression_ExprAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPreopExpression_ExprInfixExpressionParserRuleCall_2_0ElementType() {
		return PreopExpression_ExprInfixExpressionParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpressionElementType() {
		return PostopExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_GroupElementType() {
		return PostopExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_InfixExpressionParserRuleCall_0ElementType() {
		return PostopExpression_InfixExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_Group_1ElementType() {
		return PostopExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_UnaryPostOpExpressionExprAction_1_0ElementType() {
		return PostopExpression_UnaryPostOpExpressionExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_FunctionNameAssignment_1_1ElementType() {
		return PostopExpression_FunctionNameAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_FunctionNameAlternatives_1_1_0ElementType() {
		return PostopExpression_FunctionNameAlternatives_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0ElementType() {
		return PostopExpression_FunctionNameHyphenMinusHyphenMinusKeyword_1_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1ElementType() {
		return PostopExpression_FunctionNamePlusSignPlusSignKeyword_1_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpressionElementType() {
		return InfixExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_GroupElementType() {
		return InfixExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_CallExpressionParserRuleCall_0ElementType() {
		return InfixExpression_CallExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_Alternatives_1ElementType() {
		return InfixExpression_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_Group_1_0ElementType() {
		return InfixExpression_Group_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_CallFeatureFuncExprAction_1_0_0ElementType() {
		return InfixExpression_CallFeatureFuncExprAction_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_FullStopKeyword_1_0_1ElementType() {
		return InfixExpression_FullStopKeyword_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_NameAssignment_1_0_2ElementType() {
		return InfixExpression_NameAssignment_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_NameIDTerminalRuleCall_1_0_2_0ElementType() {
		return InfixExpression_NameIDTerminalRuleCall_1_0_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_LeftParenthesisKeyword_1_0_3ElementType() {
		return InfixExpression_LeftParenthesisKeyword_1_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_ParameterListAssignment_1_0_4ElementType() {
		return InfixExpression_ParameterListAssignment_1_0_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0ElementType() {
		return InfixExpression_ParameterListParameterListParserRuleCall_1_0_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_RightParenthesisKeyword_1_0_5ElementType() {
		return InfixExpression_RightParenthesisKeyword_1_0_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_Group_1_1ElementType() {
		return InfixExpression_Group_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_AtExpressionObjExprAction_1_1_0ElementType() {
		return InfixExpression_AtExpressionObjExprAction_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_LeftSquareBracketKeyword_1_1_1ElementType() {
		return InfixExpression_LeftSquareBracketKeyword_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_IndexExprAssignment_1_1_2ElementType() {
		return InfixExpression_IndexExprAssignment_1_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0ElementType() {
		return InfixExpression_IndexExprExpressionParserRuleCall_1_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_RightSquareBracketKeyword_1_1_3ElementType() {
		return InfixExpression_RightSquareBracketKeyword_1_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_Group_1_2ElementType() {
		return InfixExpression_Group_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_FeatureExpressionObjExprAction_1_2_0ElementType() {
		return InfixExpression_FeatureExpressionObjExprAction_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_FullStopKeyword_1_2_1ElementType() {
		return InfixExpression_FullStopKeyword_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_FeatureNameAssignment_1_2_2ElementType() {
		return InfixExpression_FeatureNameAssignment_1_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0ElementType() {
		return InfixExpression_FeatureNameIDTerminalRuleCall_1_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpressionElementType() {
		return CallExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_GroupElementType() {
		return CallExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_PrimaryExpressionParserRuleCall_0ElementType() {
		return CallExpression_PrimaryExpressionParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_Group_1ElementType() {
		return CallExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_CallFunctionFuncExprAction_1_0ElementType() {
		return CallExpression_CallFunctionFuncExprAction_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_LeftParenthesisKeyword_1_1ElementType() {
		return CallExpression_LeftParenthesisKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_ParameterListAssignment_1_2ElementType() {
		return CallExpression_ParameterListAssignment_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_ParameterListParameterListParserRuleCall_1_2_0ElementType() {
		return CallExpression_ParameterListParameterListParserRuleCall_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getCallExpression_RightParenthesisKeyword_1_3ElementType() {
		return CallExpression_RightParenthesisKeyword_1_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpressionElementType() {
		return PrimaryExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_AlternativesElementType() {
		return PrimaryExpression_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_FeatureCallParserRuleCall_0ElementType() {
		return PrimaryExpression_FeatureCallParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_ConstructorCallExpressionParserRuleCall_1ElementType() {
		return PrimaryExpression_ConstructorCallExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_ValueParserRuleCall_2ElementType() {
		return PrimaryExpression_ValueParserRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_LiteralParserRuleCall_3ElementType() {
		return PrimaryExpression_LiteralParserRuleCall_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_KeywordVariablesParserRuleCall_4ElementType() {
		return PrimaryExpression_KeywordVariablesParserRuleCall_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_ParanthesizedExpressionParserRuleCall_5ElementType() {
		return PrimaryExpression_ParanthesizedExpressionParserRuleCall_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_BlockExpressionParserRuleCall_6ElementType() {
		return PrimaryExpression_BlockExpressionParserRuleCall_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_WithExpressionParserRuleCall_7ElementType() {
		return PrimaryExpression_WithExpressionParserRuleCall_7_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getPrimaryExpression_WithContextExpressionParserRuleCall_8ElementType() {
		return PrimaryExpression_WithContextExpressionParserRuleCall_8_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpressionElementType() {
		return WithExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_GroupElementType() {
		return WithExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_WithKeyword_0ElementType() {
		return WithExpression_WithKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_Group_1ElementType() {
		return WithExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_ReferencedAdviceAssignment_1_0ElementType() {
		return WithExpression_ReferencedAdviceAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0ElementType() {
		return WithExpression_ReferencedAdviceIDTerminalRuleCall_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_Group_1_1ElementType() {
		return WithExpression_Group_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_CommaKeyword_1_1_0ElementType() {
		return WithExpression_CommaKeyword_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_ReferencedAdviceAssignment_1_1_1ElementType() {
		return WithExpression_ReferencedAdviceAssignment_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0ElementType() {
		return WithExpression_ReferencedAdviceIDTerminalRuleCall_1_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_Alternatives_2ElementType() {
		return WithExpression_Alternatives_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_Group_2_0ElementType() {
		return WithExpression_Group_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_ColonKeyword_2_0_0ElementType() {
		return WithExpression_ColonKeyword_2_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_FuncExprAssignment_2_0_1ElementType() {
		return WithExpression_FuncExprAssignment_2_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_FuncExprExpressionParserRuleCall_2_0_1_0ElementType() {
		return WithExpression_FuncExprExpressionParserRuleCall_2_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_Group_2_1ElementType() {
		return WithExpression_Group_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_LeftCurlyBracketKeyword_2_1_0ElementType() {
		return WithExpression_LeftCurlyBracketKeyword_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_FuncExprAssignment_2_1_1ElementType() {
		return WithExpression_FuncExprAssignment_2_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0ElementType() {
		return WithExpression_FuncExprBlockExpressionWithoutBracketsParserRuleCall_2_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithExpression_RightCurlyBracketKeyword_2_1_2ElementType() {
		return WithExpression_RightCurlyBracketKeyword_2_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpressionElementType() {
		return WithContextExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_GroupElementType() {
		return WithContextExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_WithKeyword_0ElementType() {
		return WithContextExpression_WithKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_ContextKeyword_1ElementType() {
		return WithContextExpression_ContextKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_ExprAssignment_2ElementType() {
		return WithContextExpression_ExprAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_ExprExpressionParserRuleCall_2_0ElementType() {
		return WithContextExpression_ExprExpressionParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_Group_3ElementType() {
		return WithContextExpression_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_AsKeyword_3_0ElementType() {
		return WithContextExpression_AsKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_AliasAssignment_3_1ElementType() {
		return WithContextExpression_AliasAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_AliasIDTerminalRuleCall_3_1_0ElementType() {
		return WithContextExpression_AliasIDTerminalRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_ContextBlockAssignment_4ElementType() {
		return WithContextExpression_ContextBlockAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getWithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0ElementType() {
		return WithContextExpression_ContextBlockBlockExpressionParserRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionElementType() {
		return BlockExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_GroupElementType() {
		return BlockExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_ChainedExpressionAction_0ElementType() {
		return BlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_LeftCurlyBracketKeyword_1ElementType() {
		return BlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_Group_2ElementType() {
		return BlockExpression_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_ExpressionsAssignment_2_0ElementType() {
		return BlockExpression_ExpressionsAssignment_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0ElementType() {
		return BlockExpression_ExpressionsTopLevelExpressionParserRuleCall_2_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_SemicolonKeyword_2_1ElementType() {
		return BlockExpression_SemicolonKeyword_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpression_RightCurlyBracketKeyword_3ElementType() {
		return BlockExpression_RightCurlyBracketKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValueElementType() {
		return Value_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_GroupElementType() {
		return Value_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_VariableExpressionAction_0ElementType() {
		return Value_VariableExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_NameAssignment_1ElementType() {
		return Value_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_NameIDTerminalRuleCall_1_0ElementType() {
		return Value_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariablesElementType() {
		return KeywordVariables_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_GroupElementType() {
		return KeywordVariables_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_VariableExpressionAction_0ElementType() {
		return KeywordVariables_VariableExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameAssignment_1ElementType() {
		return KeywordVariables_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameAlternatives_1_0ElementType() {
		return KeywordVariables_NameAlternatives_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameInputKeyword_1_0_0ElementType() {
		return KeywordVariables_NameInputKeyword_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameOutputKeyword_1_0_1ElementType() {
		return KeywordVariables_NameOutputKeyword_1_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameSourceKeyword_1_0_2ElementType() {
		return KeywordVariables_NameSourceKeyword_1_0_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NamePropertiesKeyword_1_0_3ElementType() {
		return KeywordVariables_NamePropertiesKeyword_1_0_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameBuilderKeyword_1_0_4ElementType() {
		return KeywordVariables_NameBuilderKeyword_1_0_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameUnitKeyword_1_0_5ElementType() {
		return KeywordVariables_NameUnitKeyword_1_0_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getKeywordVariables_NameThisKeyword_1_0_6ElementType() {
		return KeywordVariables_NameThisKeyword_1_0_6_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureCallElementType() {
		return FeatureCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureCall_OperationCallParserRuleCallElementType() {
		return FeatureCall_OperationCallParserRuleCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCallElementType() {
		return OperationCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_GroupElementType() {
		return OperationCall_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_CallNamedFunctionAction_0ElementType() {
		return OperationCall_CallNamedFunctionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_NameAssignment_1ElementType() {
		return OperationCall_NameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_NameIDTerminalRuleCall_1_0ElementType() {
		return OperationCall_NameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_LeftParenthesisKeyword_2ElementType() {
		return OperationCall_LeftParenthesisKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_ParameterListAssignment_3ElementType() {
		return OperationCall_ParameterListAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_ParameterListParameterListParserRuleCall_3_0ElementType() {
		return OperationCall_ParameterListParameterListParserRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOperationCall_RightParenthesisKeyword_4ElementType() {
		return OperationCall_RightParenthesisKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpressionElementType() {
		return ConstructorCallExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_GroupElementType() {
		return ConstructorCallExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_CreateExpressionAction_0ElementType() {
		return ConstructorCallExpression_CreateExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_NewKeyword_1ElementType() {
		return ConstructorCallExpression_NewKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_TypeExprAssignment_2ElementType() {
		return ConstructorCallExpression_TypeExprAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0ElementType() {
		return ConstructorCallExpression_TypeExprIDTerminalRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_Group_3ElementType() {
		return ConstructorCallExpression_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_LeftParenthesisKeyword_3_0ElementType() {
		return ConstructorCallExpression_LeftParenthesisKeyword_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_ParameterListAssignment_3_1ElementType() {
		return ConstructorCallExpression_ParameterListAssignment_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0ElementType() {
		return ConstructorCallExpression_ParameterListParameterListParserRuleCall_3_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_RightParenthesisKeyword_3_2ElementType() {
		return ConstructorCallExpression_RightParenthesisKeyword_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_Group_4ElementType() {
		return ConstructorCallExpression_Group_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_AsKeyword_4_0ElementType() {
		return ConstructorCallExpression_AsKeyword_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_AliasAssignment_4_1ElementType() {
		return ConstructorCallExpression_AliasAssignment_4_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0ElementType() {
		return ConstructorCallExpression_AliasIDTerminalRuleCall_4_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_ContextBlockAssignment_5ElementType() {
		return ConstructorCallExpression_ContextBlockAssignment_5_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0ElementType() {
		return ConstructorCallExpression_ContextBlockInitializationBlockExpressionParserRuleCall_5_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpressionElementType() {
		return InitializationBlockExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_GroupElementType() {
		return InitializationBlockExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_ChainedExpressionAction_0ElementType() {
		return InitializationBlockExpression_ChainedExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_LeftCurlyBracketKeyword_1ElementType() {
		return InitializationBlockExpression_LeftCurlyBracketKeyword_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_ExpressionsAssignment_2ElementType() {
		return InitializationBlockExpression_ExpressionsAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0ElementType() {
		return InitializationBlockExpression_ExpressionsInitializationExpressionParserRuleCall_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_SemicolonKeyword_3ElementType() {
		return InitializationBlockExpression_SemicolonKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationBlockExpression_RightCurlyBracketKeyword_4ElementType() {
		return InitializationBlockExpression_RightCurlyBracketKeyword_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpressionElementType() {
		return InitializationExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_GroupElementType() {
		return InitializationExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_AssignmentExpressionAction_0ElementType() {
		return InitializationExpression_AssignmentExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_LeftExprAssignment_1ElementType() {
		return InitializationExpression_LeftExprAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0ElementType() {
		return InitializationExpression_LeftExprFeatureOfThisParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_FunctionNameAssignment_2ElementType() {
		return InitializationExpression_FunctionNameAssignment_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_FunctionNameColonKeyword_2_0ElementType() {
		return InitializationExpression_FunctionNameColonKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_RightExprAssignment_3ElementType() {
		return InitializationExpression_RightExprAssignment_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getInitializationExpression_RightExprExpressionParserRuleCall_3_0ElementType() {
		return InitializationExpression_RightExprExpressionParserRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureOfThisElementType() {
		return FeatureOfThis_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureOfThis_GroupElementType() {
		return FeatureOfThis_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureOfThis_FeatureExpressionAction_0ElementType() {
		return FeatureOfThis_FeatureExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureOfThis_FeatureNameAssignment_1ElementType() {
		return FeatureOfThis_FeatureNameAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getFeatureOfThis_FeatureNameIDTerminalRuleCall_1_0ElementType() {
		return FeatureOfThis_FeatureNameIDTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralElementType() {
		return Literal_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteral_AlternativesElementType() {
		return Literal_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteral_ValueLiteralParserRuleCall_0ElementType() {
		return Literal_ValueLiteralParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteral_LiteralFunctionParserRuleCall_1ElementType() {
		return Literal_LiteralFunctionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralFunctionElementType() {
		return LiteralFunction_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralFunction_GroupElementType() {
		return LiteralFunction_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralFunction_LeftCurlyBracketKeyword_0ElementType() {
		return LiteralFunction_LeftCurlyBracketKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralFunction_ClosureExpressionParserRuleCall_1ElementType() {
		return LiteralFunction_ClosureExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getLiteralFunction_RightCurlyBracketKeyword_2ElementType() {
		return LiteralFunction_RightCurlyBracketKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpressionElementType() {
		return ClosureExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_GroupElementType() {
		return ClosureExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_FunctionAction_0ElementType() {
		return ClosureExpression_FunctionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_1ElementType() {
		return ClosureExpression_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_LessThanSignKeyword_1_0ElementType() {
		return ClosureExpression_LessThanSignKeyword_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ReturnTypeAssignment_1_1ElementType() {
		return ClosureExpression_ReturnTypeAssignment_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0ElementType() {
		return ClosureExpression_ReturnTypeTypeRefParserRuleCall_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_GreaterThanSignKeyword_1_2ElementType() {
		return ClosureExpression_GreaterThanSignKeyword_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Alternatives_2ElementType() {
		return ClosureExpression_Alternatives_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_2_0ElementType() {
		return ClosureExpression_Group_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VerticalLineKeyword_2_0_0ElementType() {
		return ClosureExpression_VerticalLineKeyword_2_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_2_0_1ElementType() {
		return ClosureExpression_Group_2_0_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersAssignment_2_0_1_0ElementType() {
		return ClosureExpression_ParametersAssignment_2_0_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0ElementType() {
		return ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_2_0_1_1ElementType() {
		return ClosureExpression_Group_2_0_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_CommaKeyword_2_0_1_1_0ElementType() {
		return ClosureExpression_CommaKeyword_2_0_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersAssignment_2_0_1_1_1ElementType() {
		return ClosureExpression_ParametersAssignment_2_0_1_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0ElementType() {
		return ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_2_0_1_2ElementType() {
		return ClosureExpression_Group_2_0_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_CommaKeyword_2_0_1_2_0ElementType() {
		return ClosureExpression_CommaKeyword_2_0_1_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VarArgsAssignment_2_0_1_2_1ElementType() {
		return ClosureExpression_VarArgsAssignment_2_0_1_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0ElementType() {
		return ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_0_1_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersAssignment_2_0_1_2_2ElementType() {
		return ClosureExpression_ParametersAssignment_2_0_1_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0ElementType() {
		return ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_0_1_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_Group_2_1ElementType() {
		return ClosureExpression_Group_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VarArgsAssignment_2_1_0ElementType() {
		return ClosureExpression_VarArgsAssignment_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0ElementType() {
		return ClosureExpression_VarArgsFullStopFullStopFullStopKeyword_2_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersAssignment_2_1_1ElementType() {
		return ClosureExpression_ParametersAssignment_2_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0ElementType() {
		return ClosureExpression_ParametersParameterDeclarationParserRuleCall_2_1_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_VerticalLineKeyword_3ElementType() {
		return ClosureExpression_VerticalLineKeyword_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_FuncExprAssignment_4ElementType() {
		return ClosureExpression_FuncExprAssignment_4_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0ElementType() {
		return ClosureExpression_FuncExprOneOrManyExpressionsParserRuleCall_4_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOneOrManyExpressionsElementType() {
		return OneOrManyExpressions_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOneOrManyExpressions_AlternativesElementType() {
		return OneOrManyExpressions_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0ElementType() {
		return OneOrManyExpressions_BlockExpressionWithoutBracketsParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getOneOrManyExpressions_ExpressionParserRuleCall_1ElementType() {
		return OneOrManyExpressions_ExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBracketsElementType() {
		return BlockExpressionWithoutBrackets_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_GroupElementType() {
		return BlockExpressionWithoutBrackets_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_ChainedExpressionAction_0ElementType() {
		return BlockExpressionWithoutBrackets_ChainedExpressionAction_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_Group_1ElementType() {
		return BlockExpressionWithoutBrackets_Group_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_ExpressionsAssignment_1_0ElementType() {
		return BlockExpressionWithoutBrackets_ExpressionsAssignment_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0ElementType() {
		return BlockExpressionWithoutBrackets_ExpressionsTopLevelExpressionParserRuleCall_1_0_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getBlockExpressionWithoutBrackets_SemicolonKeyword_1_1ElementType() {
		return BlockExpressionWithoutBrackets_SemicolonKeyword_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValueLiteralElementType() {
		return ValueLiteral_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValueLiteral_ValueAssignmentElementType() {
		return ValueLiteral_ValueAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValueLiteral_ValueSTRINGTerminalRuleCall_0ElementType() {
		return ValueLiteral_ValueSTRINGTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParanthesizedExpressionElementType() {
		return ParanthesizedExpression_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParanthesizedExpression_GroupElementType() {
		return ParanthesizedExpression_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParanthesizedExpression_LeftParenthesisKeyword_0ElementType() {
		return ParanthesizedExpression_LeftParenthesisKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParanthesizedExpression_ExpressionParserRuleCall_1ElementType() {
		return ParanthesizedExpression_ExpressionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getParanthesizedExpression_RightParenthesisKeyword_2ElementType() {
		return ParanthesizedExpression_RightParenthesisKeyword_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQIDElementType() {
		return QID_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_GroupElementType() {
		return QID_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_IDTerminalRuleCall_0ElementType() {
		return QID_IDTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_Alternatives_1ElementType() {
		return QID_Alternatives_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_INTTerminalRuleCall_1_0ElementType() {
		return QID_INTTerminalRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_HEXTerminalRuleCall_1_1ElementType() {
		return QID_HEXTerminalRuleCall_1_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_IDTerminalRuleCall_1_2ElementType() {
		return QID_IDTerminalRuleCall_1_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_Group_2ElementType() {
		return QID_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_FullStopKeyword_2_0ElementType() {
		return QID_FullStopKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_IDTerminalRuleCall_2_1ElementType() {
		return QID_IDTerminalRuleCall_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_Alternatives_2_2ElementType() {
		return QID_Alternatives_2_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_INTTerminalRuleCall_2_2_0ElementType() {
		return QID_INTTerminalRuleCall_2_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_HEXTerminalRuleCall_2_2_1ElementType() {
		return QID_HEXTerminalRuleCall_2_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getQID_IDTerminalRuleCall_2_2_2ElementType() {
		return QID_IDTerminalRuleCall_2_2_2_ELEMENT_TYPE;
	}

}
