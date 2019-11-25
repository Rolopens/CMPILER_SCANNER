import java.util.ArrayList;
import java.util.Stack;


public class CustomParserListener extends SHJavaParserBaseListener {


    public static final CustomParserListener INSTANCE = new CustomParserListener();
    Stack<String> values = new Stack<>();
    ArrayList<String> expressions = new ArrayList<>();
    int count = 0;

    @Override public void enterExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText()  + " " + ctx.getChildCount() + " Enter Rule");
    }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) {
//        System.out.println(ctx.getText()  + " " + ctx.getChildCount()+ " Exit Rule");
        if(ctx.getChildCount() == 1 && !ctx.getChild(0).getText().contains("(")){
//            for (int i = 0; i < ctx.getChildCount(); i++){
//                System.out.println("CHILD COUNT: " + i + " " + ctx.getChild(i).getText());
//            }
            values.push("T" + count);
            System.out.println("T" + count + " = " + ctx.getChild(0).getText());
            count++;


        }
        if(ctx.getChildCount() == 3){
//            for (int i = 0; i < ctx.getChildCount(); i++){
////                System.out.println("CHILD COUNT: " + i + " " + ctx.getChild(i).getText());
////            }
            String left, right;
            right = values.pop();
            left = values.pop();
            values.push("T" + count);
            System.out.println("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            count++;
        }

    }

    @Override public void enterVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) { }

    @Override public void exitVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) {
        if (values.empty()){
            String left, right;
            right = ctx.getChild(2).getText();
            left = ctx.getChild(0).getText();
            System.out.println("T"+count+ " = " +right);
            System.out.println(left + " = T" + count);
            count++;
        } else {
            System.out.println(ctx.getChild(0).getText() + " = " + values.pop());
//            count++;
        }
//          System.out.println(ctx.getText()  + " " + ctx.getChildCount()+ " VAssignment Exit Rule");
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
//        System.out.println("METHOD CALL CHILD COUNT" + ctx.getChildCount());
//        for (int i = 0 ; i < ctx.getChildCount(); i++){
//            System.out.println("CHILD NUMBER " + i + " " + ctx.getChild(i).getText());
//        }

    }

}
