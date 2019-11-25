import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class CustomParserListener extends SHJavaParserBaseListener {

//    public static final CustomParserListener INSTANCE = new CustomParserListener();
    private ArrayList<String> list;

    public CustomParserListener(){
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }

    @Override public void enterPrimaryError(SHJavaParser.PrimaryErrorContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Not a Statement");

    }

    @Override public void enterInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Extraneous '+' symbol");
    }

    @Override public void enterInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Invalid Expression");
    }

    @Override public void enterInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Lacking Quotation Marks");
    }

    @Override public void exitComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) {
        if (ctx.getChildCount() == 0 ){
            System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Comparison Expression");
        }
    }
    @Override public void enterForWrongDeclaration(SHJavaParser.ForWrongDeclarationContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Declaration within dur Loop");
    }


    @Override public void exitMethodCall(SHJavaParser.MethodCallContext ctx) {
//        for (int i = 0 ; i < ctx.getChildCount(); i++){
//            if(ctx.getChild(i).getText().contains("missing")){
//                System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Missing '" + ctx.getChild(i).getText
//                        ().split("'")[1] + "'");
//            }
//        }
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        for (int i = 0 ; i < ctx.getChildCount(); i++){
            if(ctx.getChild(i).getText().contains("missing") && (ctx.getChild(i).getText().length() < 14)){
                String temp = "[ERROR] LINE " + ctx.getStart().getLine() + " : Missing '" + ctx.getChild(i).getText
                        ().split("'")[1] + "'";
                if(!list.contains(temp)){
                    list.add(temp);
                }
            }
//            if(ctx.getChild(i).getText().contains("missing")){
//                System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Missing '" + ctx.getChild(i).getText
//                        ().split("'")[1] + "'");
//            }
        }
    }


    @Override public void exitCompilationUnit(SHJavaParser.CompilationUnitContext ctx) { }

    @Override public void exitTypeDeclaration(SHJavaParser.TypeDeclarationContext ctx) { }

    @Override public void exitModifier(SHJavaParser.ModifierContext ctx) { }

    @Override public void exitClassOrInterfaceModifier(SHJavaParser.ClassOrInterfaceModifierContext ctx) { }

    @Override public void exitVariableModifier(SHJavaParser.VariableModifierContext ctx) { }

    @Override public void exitClassDeclaration(SHJavaParser.ClassDeclarationContext ctx) { }

    @Override public void exitTypeParameters(SHJavaParser.TypeParametersContext ctx) { }

    @Override public void exitTypeParameter(SHJavaParser.TypeParameterContext ctx) { }

    @Override public void exitTypeBound(SHJavaParser.TypeBoundContext ctx) { }

    @Override public void exitEnumDeclaration(SHJavaParser.EnumDeclarationContext ctx) { }

    @Override public void exitEnumConstants(SHJavaParser.EnumConstantsContext ctx) { }

    @Override public void exitEnumConstant(SHJavaParser.EnumConstantContext ctx) { }

    @Override public void exitEnumBodyDeclarations(SHJavaParser.EnumBodyDeclarationsContext ctx) { }

    @Override public void exitInterfaceDeclaration(SHJavaParser.InterfaceDeclarationContext ctx) { }

    @Override public void exitClassBody(SHJavaParser.ClassBodyContext ctx) { }

    @Override public void exitInterfaceBody(SHJavaParser.InterfaceBodyContext ctx) { }

    @Override public void exitClassBodyDeclaration(SHJavaParser.ClassBodyDeclarationContext ctx) { }

    @Override public void exitMemberDeclaration(SHJavaParser.MemberDeclarationContext ctx) { }

    @Override public void exitMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) { }

    @Override public void exitMethodBody(SHJavaParser.MethodBodyContext ctx) { }

    @Override public void exitTypeTypeOrVoid(SHJavaParser.TypeTypeOrVoidContext ctx) { }

    @Override public void exitGenericMethodDeclaration(SHJavaParser.GenericMethodDeclarationContext ctx) { }

    @Override public void exitGenericConstructorDeclaration(SHJavaParser.GenericConstructorDeclarationContext ctx) { }

    @Override public void exitConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx) { }

    @Override public void exitFieldDeclaration(SHJavaParser.FieldDeclarationContext ctx) { }

    @Override public void exitInterfaceBodyDeclaration(SHJavaParser.InterfaceBodyDeclarationContext ctx) { }

    @Override public void exitInterfaceMemberDeclaration(SHJavaParser.InterfaceMemberDeclarationContext ctx) { }

    @Override public void exitConstDeclaration(SHJavaParser.ConstDeclarationContext ctx) { }

    @Override public void exitConstantDeclarator(SHJavaParser.ConstantDeclaratorContext ctx) { }

    @Override public void exitInterfaceMethodDeclaration(SHJavaParser.InterfaceMethodDeclarationContext ctx) { }

    @Override public void exitInterfaceMethodModifier(SHJavaParser.InterfaceMethodModifierContext ctx) { }

    @Override public void exitGenericInterfaceMethodDeclaration(SHJavaParser.GenericInterfaceMethodDeclarationContext ctx) { }

    @Override public void exitVariableDeclarators(SHJavaParser.VariableDeclaratorsContext ctx) { }

    @Override public void exitVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx) { }

    @Override public void exitVariableDeclaratorId(SHJavaParser.VariableDeclaratorIdContext ctx) { }

    @Override public void exitVariableInitializer(SHJavaParser.VariableInitializerContext ctx) { }

    @Override public void exitArrayInitializer(SHJavaParser.ArrayInitializerContext ctx) { }

    @Override public void exitClassOrInterfaceType(SHJavaParser.ClassOrInterfaceTypeContext ctx) { }

    @Override public void exitTypeArgument(SHJavaParser.TypeArgumentContext ctx) { }

    @Override public void exitQualifiedNameList(SHJavaParser.QualifiedNameListContext ctx) { }

    @Override public void exitFormalParameters(SHJavaParser.FormalParametersContext ctx) { }

    @Override public void exitFormalParameterList(SHJavaParser.FormalParameterListContext ctx) { }

    @Override public void exitFormalParameter(SHJavaParser.FormalParameterContext ctx) { }

    @Override public void exitQualifiedName(SHJavaParser.QualifiedNameContext ctx) { }

    @Override public void exitLiteral(SHJavaParser.LiteralContext ctx) { }

    @Override public void exitIntegerLiteral(SHJavaParser.IntegerLiteralContext ctx) { }

    @Override public void exitFloatLiteral(SHJavaParser.FloatLiteralContext ctx) { }

    @Override public void exitBlock(SHJavaParser.BlockContext ctx) { }

    @Override public void exitBlockStatement(SHJavaParser.BlockStatementContext ctx) { }

    @Override public void exitVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) { }

    @Override public void exitLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx) { }

    @Override public void exitLocalTypeDeclaration(SHJavaParser.LocalTypeDeclarationContext ctx) { }

    @Override public void exitStatement(SHJavaParser.StatementContext ctx) { }

    @Override public void exitSwitchBlockStatementGroup(SHJavaParser.SwitchBlockStatementGroupContext ctx) { }

    @Override public void exitSwitchLabel(SHJavaParser.SwitchLabelContext ctx) { }

    @Override public void exitForControl(SHJavaParser.ForControlContext ctx) { }

    @Override public void exitForInit(SHJavaParser.ForInitContext ctx) { }

    @Override public void exitForDeclaration(SHJavaParser.ForDeclarationContext ctx) { }

    @Override public void exitEnhancedForControl(SHJavaParser.EnhancedForControlContext ctx) { }

    @Override public void exitParExpression(SHJavaParser.ParExpressionContext ctx) { }

    @Override public void exitExpressionList(SHJavaParser.ExpressionListContext ctx) { }

    @Override public void exitMethodExpressionList(SHJavaParser.MethodExpressionListContext ctx) { }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) { }

    @Override public void exitMethodExpression(SHJavaParser.MethodExpressionContext ctx) { }

    @Override public void exitPrimary(SHJavaParser.PrimaryContext ctx) { }

    @Override public void exitClassType(SHJavaParser.ClassTypeContext ctx) { }

    @Override public void exitCreator(SHJavaParser.CreatorContext ctx) { }

    @Override public void exitCreatedName(SHJavaParser.CreatedNameContext ctx) { }

    @Override public void exitInnerCreator(SHJavaParser.InnerCreatorContext ctx) { }

    @Override public void exitArrayCreatorRest(SHJavaParser.ArrayCreatorRestContext ctx) { }

    @Override public void exitClassCreatorRest(SHJavaParser.ClassCreatorRestContext ctx) { }

    @Override public void exitTypeArgumentsOrDiamond(SHJavaParser.TypeArgumentsOrDiamondContext ctx) { }

    @Override public void exitNonWildcardTypeArgumentsOrDiamond(SHJavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) { }

    @Override public void exitNonWildcardTypeArguments(SHJavaParser.NonWildcardTypeArgumentsContext ctx) { }

    @Override public void exitTypeList(SHJavaParser.TypeListContext ctx) { }

    @Override public void exitTypeType(SHJavaParser.TypeTypeContext ctx) { }

    @Override public void exitPrimitiveType(SHJavaParser.PrimitiveTypeContext ctx) { }

    @Override public void exitTypeArguments(SHJavaParser.TypeArgumentsContext ctx) { }

    @Override public void exitSuperSuffix(SHJavaParser.SuperSuffixContext ctx) { }

    @Override public void exitArguments(SHJavaParser.ArgumentsContext ctx) { }

    @Override public void exitScanStatement(SHJavaParser.ScanStatementContext ctx) { }

    @Override public void exitPrintStatement(SHJavaParser.PrintStatementContext ctx) { }

    @Override public void exitPrimaryError(SHJavaParser.PrimaryErrorContext ctx) { }

    @Override public void exitInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) { }

    @Override public void exitInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) { }

    @Override public void exitInvalidExpressionForPrinting(SHJavaParser.InvalidExpressionForPrintingContext ctx) { }

    @Override public void exitInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) { }
}
