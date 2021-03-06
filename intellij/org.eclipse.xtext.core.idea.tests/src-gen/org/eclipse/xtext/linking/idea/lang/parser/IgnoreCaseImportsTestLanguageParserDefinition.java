package org.eclipse.xtext.linking.idea.lang.parser;

import org.eclipse.xtext.psi.impl.PsiEObjectReference;
import org.eclipse.xtext.linking.idea.lang.IgnoreCaseImportsTestLanguageElementTypeProvider;
import org.eclipse.xtext.linking.idea.lang.psi.impl.IgnoreCaseImportsTestLanguageFileImpl;
import org.eclipse.xtext.idea.parser.AbstractXtextParserDefinition;
import org.eclipse.xtext.psi.impl.PsiNamedEObjectImpl;

import com.google.inject.Inject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;

public class IgnoreCaseImportsTestLanguageParserDefinition extends AbstractXtextParserDefinition {

	@Inject 
	private IgnoreCaseImportsTestLanguageElementTypeProvider elementTypeProvider;

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new IgnoreCaseImportsTestLanguageFileImpl(viewProvider);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public PsiElement createElement(ASTNode node) {
		IElementType elementType = node.getElementType();
		if (elementType == elementTypeProvider.getModel_ElementsElementParserRuleCall_1_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getElement_NameIDTerminalRuleCall_0_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getElement_ElementsElementParserRuleCall_3_0ElementType()) {
			return new PsiNamedEObjectImpl(node,
				elementTypeProvider.getElement_NameIDTerminalRuleCall_0_0ElementType()
			);
		}
		if (elementType == elementTypeProvider.getElement_ReferenceElementCrossReference_1_0ElementType()) {
			return new PsiEObjectReference(node);
		}
		return super.createElement(node);
	}

}
