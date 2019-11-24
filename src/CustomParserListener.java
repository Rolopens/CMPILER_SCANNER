public class CustomParserListener extends SHJavaParserBaseListener {

    public static final CustomParserListener INSTANCE = new CustomParserListener();

    @Override public void enterExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
    }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText() + " Exit Rule");
    }

    @Override public void enterForControl(SHJavaParser.ForControlContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
    }

    @Override public void exitForControl(SHJavaParser.ForControlContext ctx) {
//        System.out.println(ctx.getText() + " Exit Rule");
    }

    @Override public void enterPrintStatement(SHJavaParser.PrintStatementContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
//        if (ctx.getChildCount() == 0 ){
//            System.out.println("INVALID PRINT STATEMENT");
//        }
    }

    @Override public void exitPrintStatement(SHJavaParser.PrintStatementContext ctx) {
//        System.out.println(ctx.getText() + " Exit Rule");
//        System.out.println("LABELS "  + ctx.);
//        if (ctx.getChildCount() == 0 ){
//            System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement");
//        }
//        for (int i = 0 ; i < ctx.getChildCount(); i++){
//            System.out.println("CHILD NUMBER " + i + " " + ctx.getChild(i));
//        }
//        System.out.println("EXIT RULE: " + ctx.);
    }

    @Override public void enterClassBody(SHJavaParser.ClassBodyContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
//        try{
//            System.out.println("RBRACE IN ENTER: " + ctx.RBRACE().getText());
//        } catch (NullPointerException e){
//            System.out.println("Missing Curly Bracket");
//        }
    }

    @Override public void exitClassBody(SHJavaParser.ClassBodyContext ctx) {
//        System.out.println(ctx.getText() + " Exit Rule");
//        System.out.println("RBRACE IN Exit: " + ctx.RBRACE().getText());
//        try{
//            System.out.println("RBRACE IN Exit: " + ctx.RBRACE().getText());
//        } catch (NullPointerException e){
//            System.out.println("Missing Curly Bracket");
//        }
    }

    @Override public void enterPrimaryError(SHJavaParser.PrimaryErrorContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Not a Statement");

    }

    @Override public void exitPrimaryError(SHJavaParser.PrimaryErrorContext ctx) { }

    @Override public void enterInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Extraneous '+' symbol");
    }

    @Override public void exitInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) { }

    @Override public void enterInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Invalid Expression");
    }

    @Override public void exitInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) { }

    @Override public void enterInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Lacking Quotation Marks");
    }

    @Override public void exitInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) { }

    @Override public void enterComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) { }

    @Override public void exitComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) {
        if (ctx.getChildCount() == 0 ){
            System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Comparison Expression");
        }
    }
    @Override public void enterForWrongDeclaration(SHJavaParser.ForWrongDeclarationContext ctx) {
        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Declaration within dur Loop");
    }

    @Override public void exitForWrongDeclaration(SHJavaParser.ForWrongDeclarationContext ctx) {
//        this.hello(123 ++value);

    }

    @Override public void enterMethodCall(SHJavaParser.MethodCallContext ctx) {

    }

    @Override public void exitMethodCall(SHJavaParser.MethodCallContext ctx) {
        System.out.println("METHOD CALL CHILD COUNT" + ctx.getChildCount());
        for (int i = 0 ; i < ctx.getChildCount(); i++){
            System.out.println("CHILD NUMBER " + i + " " + ctx.getChild(i).getText());
        }
        int x = 2;
        hello();
    }


    public int hello(int i){

        return i;
    }

}
