// Generated from C:/Users/Rolo/Documents/GitHub/CMPILER_SCANNER/grammar\SHJavaParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SHJavaParser}.
 */
public interface SHJavaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SHJavaParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SHJavaParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(SHJavaParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(SHJavaParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(SHJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(SHJavaParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(SHJavaParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(SHJavaParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SHJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SHJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(SHJavaParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(SHJavaParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(SHJavaParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(SHJavaParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(SHJavaParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(SHJavaParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SHJavaParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SHJavaParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(SHJavaParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(SHJavaParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(SHJavaParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(SHJavaParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(SHJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(SHJavaParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(SHJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(SHJavaParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SHJavaParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SHJavaParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(SHJavaParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(SHJavaParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(SHJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(SHJavaParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(SHJavaParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(SHJavaParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(SHJavaParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(SHJavaParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(SHJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(SHJavaParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(SHJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(SHJavaParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(SHJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(SHJavaParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(SHJavaParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(SHJavaParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(SHJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(SHJavaParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(SHJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(SHJavaParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(SHJavaParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(SHJavaParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(SHJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(SHJavaParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(SHJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(SHJavaParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(SHJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(SHJavaParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(SHJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(SHJavaParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(SHJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(SHJavaParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(SHJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(SHJavaParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(SHJavaParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(SHJavaParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(SHJavaParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(SHJavaParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(SHJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(SHJavaParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(SHJavaParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(SHJavaParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SHJavaParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SHJavaParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(SHJavaParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(SHJavaParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(SHJavaParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(SHJavaParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(SHJavaParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(SHJavaParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SHJavaParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SHJavaParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SHJavaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SHJavaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SHJavaParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SHJavaParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(SHJavaParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(SHJavaParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SHJavaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SHJavaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SHJavaParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SHJavaParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(SHJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(SHJavaParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SHJavaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SHJavaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(SHJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(SHJavaParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(SHJavaParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(SHJavaParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(SHJavaParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(SHJavaParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(SHJavaParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(SHJavaParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(SHJavaParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(SHJavaParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(SHJavaParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(SHJavaParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SHJavaParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SHJavaParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(SHJavaParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(SHJavaParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SHJavaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SHJavaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SHJavaParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SHJavaParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(SHJavaParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(SHJavaParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(SHJavaParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(SHJavaParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(SHJavaParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(SHJavaParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(SHJavaParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(SHJavaParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(SHJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(SHJavaParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(SHJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(SHJavaParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(SHJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(SHJavaParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(SHJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(SHJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(SHJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(SHJavaParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(SHJavaParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(SHJavaParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(SHJavaParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(SHJavaParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(SHJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(SHJavaParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(SHJavaParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(SHJavaParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(SHJavaParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(SHJavaParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SHJavaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SHJavaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void enterScanStatement(SHJavaParser.ScanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#scanStatement}.
	 * @param ctx the parse tree
	 */
	void exitScanStatement(SHJavaParser.ScanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SHJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SHJavaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SHJavaParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SHJavaParser.PrintStatementContext ctx);
}