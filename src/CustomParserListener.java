import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.Stack;


public class CustomParserListener extends SHJavaParserBaseListener {

    Stack<String> values = new Stack<>();
    ArrayList<String> commands = new ArrayList<>();

    Stack<String> ifStatements = new Stack<>();
    Stack<String> whiStatements = new Stack<>();
    Stack<String> forStatements = new Stack<>();
    Stack<String> doWhiStatements = new Stack<>();
    int count, jumpCount = 0;
    String prev, forPrev = null;


    public CustomParserListener(){

    }

    public ArrayList<String> getCommands() {
        return commands;
    }


    @Override public void enterExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText()  + " " + ctx.getChildCount() + " Enter Rule");
    }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText()  + " " + ctx.getChildCount()+ " Exit Rule");
        if(ctx.getChildCount() == 1 && !ctx.getChild(0).getText().contains("(") &&  !ctx.getChild(0).getText().contains(")")){
//            for (int i = 0; i < ctx.getChildCount(); i++){
//                System.out.println("CHILD COUNT: " + i + " " + ctx.getChild(i).getText());
//            }
            values.push("T" + count);
//            System.out.println("T" + count + " = " + ctx.getChild(0).getText());
            commands.add("T" + count + " = " + ctx.getChild(0).getText());
            count++;


        }
        if(ctx.getChildCount() == 3 && values.size() > 1){
//            for (int i = 0; i < ctx.getChildCount(); i++){
//                System.out.println("CHILD COUNT: " + i + " " + ctx.getChild(i).getText());}
//            }
            String left, right;
            right = values.pop();

            left = values.pop();
            values.push("T" + count);
//            System.out.println("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            commands.add("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            count++;
        }


    }

    @Override public void enterVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) { }

    @Override public void exitVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) {
        if (values.empty() && ctx.getChildCount() == 3){
            String left, right;
            right = ctx.getChild(2).getText();
            left = ctx.getChild(0).getText();
//            System.out.println("T"+count+ " = " +right);
            commands.add("T"+count+ " = " +right);
//            System.out.println(left + " = T" + count);
            commands.add(left + " = T" + count);
            count++;
        } else {
            String str = ctx.getChild(0).getText() + " = " + values.pop();
//            System.out.println(str);
            commands.add(str);
//            count++;
        }
//          System.out.println(ctx.getText()  + " " + ctx.getChildCount()+ " VAssignment Exit Rule");
    }

    @Override public void enterForControl(SHJavaParser.ForControlContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
    }

    @Override public void enterPrimaryError(SHJavaParser.PrimaryErrorContext ctx) {}

    @Override public void enterInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) {}

    @Override public void enterInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) {}

    @Override public void enterInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) {}

    @Override public void exitComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) {
        if(ctx.getChildCount() == 3){
//            for (int i = 0; i < ctx.getChildCount(); i++){
//                System.out.println("CHILD COUNT: " + i + " " + ctx.getChild(i).getText());}
//            }
            String left, right;
            right = values.pop();
            left = values.pop();
            values.push("T" + count);
//            System.out.println("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            commands.add("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            count++;
        }
        if(!forStatements.empty()){
            commands.add("IfZ " + values.peek() + " GOTO L" + jumpCount);
//            commands.add(values.peek());
            forPrev = forStatements.peek();
            forStatements.push("L" + jumpCount);

            jumpCount++;
        }
        if(!doWhiStatements.empty()){
            commands.add("IfZ " + values.pop() + " GOTO L" + jumpCount);
            commands.add("GOTO " + doWhiStatements.pop());
            commands.add("L" + jumpCount + ":");
            jumpCount++;
        }
    }

    @Override public void exitForStatement(SHJavaParser.ForStatementContext ctx) {
        if(!forStatements.empty()){
            commands.add("GOTO " + forPrev);
            commands.add(forStatements.pop() + ":");
//            int i = commands.indexOf(forStatements.pop())
            forStatements.pop();


        }
    }

    @Override public void enterDoWhileStatement(SHJavaParser.DoWhileStatementContext ctx){
        commands.add("L" + jumpCount + ":");
        doWhiStatements.push("L" + jumpCount);
        jumpCount++;
    }

    @Override public void enterForWrongDeclaration(SHJavaParser.ForWrongDeclarationContext ctx) {
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
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

    @Override public void exitMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) {
        if(ctx.getChildCount()==4 ){
            int i = commands.indexOf("TEMP METHOD NAME");
            commands.add("ENDFUNC");
            commands.set(i, "_"+ ctx.getChild(1).getText()+":");
        }
    }

    @Override public void enterMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) {
        commands.add("TEMP METHOD NAME");
        commands.add("BEGINFUNC");
    }

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

    @Override public void exitVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx) {
        if (values.empty()  && ctx.getChildCount() == 3){
            String left, right;
            right = ctx.getChild(2).getText();
            left = ctx.getChild(0).getText();
//            System.out.println("T"+count+ " = " +right);
            commands.add("T"+count+ " = " +right);
//            System.out.println(left + " = T" + count);
            commands.add(left + " = T" + count);
            count++;
        }
        else if (!values.empty()){
            String str = ctx.getChild(0).getText() + " = " + values.pop();
//            System.out.println(str);
            commands.add(str);
        }
    }

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

    @Override public void exitLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx) { }

    @Override public void exitLocalTypeDeclaration(SHJavaParser.LocalTypeDeclarationContext ctx) { }

    @Override public void enterStatement(SHJavaParser.StatementContext ctx) {

    }

    @Override public void enterElseStatement(SHJavaParser.ElseStatementContext ctx){
        int indexOfL = commands.indexOf(prev);
        commands.add(indexOfL, "GOTO L" + jumpCount);
        ifStatements.push("L" + jumpCount);
        jumpCount++;

    }

    @Override public void exitElseStatement(SHJavaParser.ElseStatementContext ctx){
//        if(!ifStatements.empty()){
//            commands.add("GOTO L" + jumpCount);
//            commands.add(ifStatements.pop() + ": ");
//            ifStatements.push("L"+jumpCount);
//        }
        if(!ifStatements.empty())
            commands.add(ifStatements.pop() + "");

    }

    @Override public void exitStatement(SHJavaParser.StatementContext ctx) {
        if(!ifStatements.empty() && whiStatements.empty()){
//            commands.add("GOTO L" + jumpCount);
            String str = ifStatements.pop() + ":";
            commands.add(str);
            prev = str;
//            ifStatements.push("L"+jumpCount);
        }
        if(!whiStatements.empty()){
            String str = "GOTO " + whiStatements.pop();
            commands.add(str);
        }
        if(ctx.getChildCount() == 3 && !values.empty()){
            commands.add("RETURN " + values.pop());
        }
    }

    @Override public void exitSwitchBlockStatementGroup(SHJavaParser.SwitchBlockStatementGroupContext ctx) { }

    @Override public void exitSwitchLabel(SHJavaParser.SwitchLabelContext ctx) { }

    @Override public void exitForControl(SHJavaParser.ForControlContext ctx) { }

    @Override public void exitForInit(SHJavaParser.ForInitContext ctx) { }

    @Override public void exitForDeclaration(SHJavaParser.ForDeclarationContext ctx) {
        if(ctx.getChildCount()== 4){
            String left, right;
            left = ctx.getChild(1).getText();
            right = ctx.getChild(3).getText();
            commands.add("T"+ count + " = " + right);
            commands.add(left + " = T" + count);
            count++;
            commands.add("L" + jumpCount + ":");
            forStatements.add("L" + jumpCount);
            jumpCount++;
        }
    }

    @Override public void exitEnhancedForControl(SHJavaParser.EnhancedForControlContext ctx) { }

    @Override public void enterParExpression(SHJavaParser.ParExpressionContext ctx){

    }

    @Override public void exitParExpression(SHJavaParser.ParExpressionContext ctx) {
        if(ctx.getChildCount() == 3 && !values.empty()){
//            commands.add("Child 1:" + ctx.getChild(0).getText() + "Child 2:" + ctx.getChild(1).getText() + "Child 3:" + ctx.getChild(2).getText());
//            commands.add(values.pop());
//            commands.add("DJHIUYUHFKEAJLK");
            commands.add("IfZ " + values.pop() + " GOTO L" + jumpCount);
            ifStatements.push("L" + jumpCount);

            jumpCount++;
        }
    }

    @Override public void enterWhileStatement(SHJavaParser.WhileStatementContext ctx){
        commands.add("L" + jumpCount + ":");
        whiStatements.push("L" + jumpCount);
        jumpCount++;
    }

    @Override public void exitWhileStatement(SHJavaParser.WhileStatementContext ctx){

    }


    @Override public void exitExpressionList(SHJavaParser.ExpressionListContext ctx) { }

    @Override public void exitMethodExpressionList(SHJavaParser.MethodExpressionListContext ctx) {
        if(ctx.getChildCount() % 2 == 1){
            for (int i = 0; i < ctx.getChildCount(); i = i + 2){
                commands.add("PUSHPARAMS " + ctx.getChild(i).getText());
            }
        }
    }

    @Override public void exitMethodExpression(SHJavaParser.MethodExpressionContext ctx) { }

    @Override public void exitPrimary(SHJavaParser.PrimaryContext ctx) {

        if(ctx.getChildCount() == 1 && ctx.getParent().getParent().getParent() instanceof SHJavaParser.StatementContext
        && !(ctx.getParent().getParent() instanceof SHJavaParser.PrintStatementContext) && !(ctx.getParent().getParent() instanceof SHJavaParser.ExpressionContext)){
//            System.out.println(ctx.getParent().getParent().getClass());
            commands.add("PUSHPARAMS " + ctx.getChild(0).getText());
        }

    }

    @Override public void exitMethodCall(SHJavaParser.MethodCallContext ctx){
        if(ctx.getChildCount() == 4 || ctx.getChildCount() == 3){
            commands.add("CALL " + ctx.getChild(0).getText());
        }
    }

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

    @Override public void exitPrintStatement(SHJavaParser.PrintStatementContext ctx) {
        if(!values.empty()) {
            String str = "print " + values.pop();
//            System.out.println(str);
            commands.add(str);
        } else if (ctx.getChildCount() == 4 && ctx.getChild(2).getText().contains("\"")){
//            System.out.println("print " + ctx.getChild(2).getText());
            commands.add("print " + ctx.getChild(2).getText());
        }

    }

    @Override public void exitPrimaryError(SHJavaParser.PrimaryErrorContext ctx) { }

    @Override public void exitInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) { }

    @Override public void exitInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) { }

    @Override public void exitInvalidExpressionForPrinting(SHJavaParser.InvalidExpressionForPrintingContext ctx) { }

    @Override public void exitInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) { }
}
