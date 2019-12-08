import org.antlr.v4.runtime.ParserRuleContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class CustomParserListener extends SHJavaParserBaseListener {

    private Stack<String> values = new Stack<>();
    private ArrayList<String> commands = new ArrayList<>();
    private HashMap<String, ArrayList<String>> functionScopes = new HashMap<String, ArrayList<String>>();
    private Stack<String> ifStatements = new Stack<>();
    private Stack<String> whiStatements = new Stack<>();
    private Stack<String> forStatements = new Stack<>();
    private Stack<String> doWhiStatements = new Stack<>();
    private Stack<String> funcNames = new Stack<>();
    private Stack<String> arraySize = new Stack<>();
    int count, jumpCount = 0;
    private String prev, forPrev, curClass = null;
    private String fileName = null;

    public ArrayList<String> getCommands() {
        return commands;
    }
    public String getFileName(){
        return fileName;
    }

//    @Override public void enterTypeDeclaration(SHJavaParser.TypeDeclarationContext ctx) {
//        if (ctx.getChildCount() == 2){
//            if(ctx.getChild(1) instanceof SHJavaParser.ClassDeclarationContext){
//                fileName = ctx.getChild(1).getChild(1).getText();
//            }
//        }
//    }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) {
        if(ctx.getChildCount() == 1 && !ctx.getChild(0).getText().contains("(") &&  !ctx.getChild(0).getText().contains(")")
        ){

            if(ctx.getParent() instanceof SHJavaParser.ArrayCreatorRestContext){
                arraySize.push(ctx.getChild(0).getText());
            } else {
                values.push("T" + count);
//&& ctx.getParent() instanceof SHJavaParser.VariableInitializerContext
                commands.add("T" + count + " = " + ctx.getChild(0).getText());
                count++;
            }

        } else if (ctx.getChildCount() == 1 && !ctx.getChild(0).getText().contains("(") &&  !ctx.getChild(0).getText().contains(")")
                && ctx.getParent() instanceof SHJavaParser.StatementContext){
            commands.add("PUSHPARAMS " + ctx.getChild(0).getText());
        }

        if(ctx.getChildCount() == 3 && values.size() > 1){
//            System.out.println("ETNERED HERE");
            String left, right;
            right = values.pop();

            left = values.pop();
            values.push("T" + count);
            commands.add("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            count++;
        }


    }

    @Override public void exitArrayCreatorRest(SHJavaParser.ArrayCreatorRestContext ctx) {
        if(!arraySize.empty()){
            commands.add("T" + count + " = " + arraySize.pop());
            values.push("T" + count);
            count++;
        }
//        commands.add("AFTER IF: " + arraySize.empty());
        while(!arraySize.empty()){
            commands.add("T" + count + " = " + arraySize.pop());
            values.push("T" + count);
            count++;
            commands.add("T" + count + " = " + values.pop() + " * " + values.pop());
            values.push("T" + count);
            count++;
        } //expect a value to be in the stack and it will be taken care of by creator
    }

    @Override public void exitCreator(SHJavaParser.CreatorContext ctx) {
        if(ctx.getChildCount() == 2 && (ctx.getChild(1) instanceof SHJavaParser.ArrayCreatorRestContext) && !values.empty()){
            commands.add("T" + count + " = " + ctx.getChild(0).getText()+"["+values.pop()+"]");
            values.push("T" + count);
            count++;
        }
    }

    @Override public void exitVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) {
        if (values.empty() && ctx.getChildCount() == 3){
            String left, right;
            right = ctx.getChild(2).getText();
            left = ctx.getChild(0).getText();
            commands.add("T"+count+ " = " +right);
            commands.add(left + " = T" + count);
            count++;
        } else {
            String str = ctx.getChild(0).getText() + " = " + values.pop();
            commands.add(str);
        }
    }

    @Override public void exitComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) {
        if(ctx.getChildCount() == 3 && !values.empty()){
            String left, right;
            right = values.pop();
            left = values.pop();
            values.push("T" + count);
            commands.add("T" + count + " = " + left + ctx.getChild(1).getText() + right);
            count++;
        }
        if(!forStatements.empty()){
            commands.add("IfZ " + values.peek() + " GOTO L" + jumpCount);
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
            forStatements.pop();


        }
    }

    @Override public void enterDoWhileStatement(SHJavaParser.DoWhileStatementContext ctx){
        commands.add("L" + jumpCount + ":");
        doWhiStatements.push("L" + jumpCount);
        jumpCount++;
    }

    @Override public void exitClassDeclaration(SHJavaParser.ClassDeclarationContext ctx) {
        if(ctx.getChildCount() % 2 == 1){
            if (functionScopes.get(ctx.getChild(1).getText()) == null) {
                String curFunc;
                int i;
                ArrayList<String> funcs = new ArrayList<>();
                functionScopes.put(ctx.getChild(1).getText(), new ArrayList<String>());
                while(!funcNames.empty()){
                    curFunc = funcNames.pop();
                    i = commands.indexOf("TEMP."+curFunc);
                    commands.set(i, "_" + ctx.getChild(1).getText() + "." + curFunc+":");
                    funcs.add("_" + ctx.getChild(1).getText() + "." + curFunc);
                }
                commands.add("VTABLE " + ctx.getChild(1).getText()  + " =");
                for(int x = 0; x < funcs.size(); x++){
                    functionScopes.get(ctx.getChild(1).getText()).add(funcs.get(x));
                    commands.add("\t _" + funcs.get(x) + ",");
                }

            }

            if(ctx.getChildCount() >= 5){
                for ( int i = 3; i < ctx.getChildCount(); i+= 2){
                    ArrayList<String> funcs;
                    funcs = functionScopes.get(ctx.getChild(i).getText());
                    if(funcs == null){
                    } else {
                        for(int j = 0; j < funcs.size(); j++){
                            commands.add("\t _" +funcs.get(j)+",");
                        }
                    }

                }
            }
        }

    }

    @Override public void exitConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx){
        if(ctx.getChildCount()== 3){
            int i = commands.indexOf("TEMP METHOD NAME");
            commands.add("ENDFUNC");
            String str = "con_"+ ctx.getChild(0).getText();
            commands.set(i, "TEMP." + str);
            funcNames.push(str);
        }
    }

    @Override public void enterConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx) {
            commands.add("TEMP METHOD NAME");
            commands.add("BEGINFUNC");
    }

    @Override public void exitMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) {
        String temp;
        if(ctx.getChildCount()==4 ){
            int i = commands.indexOf("TEMP METHOD NAME");
            commands.add("ENDFUNC");
            String str = "_"+ ctx.getChild(1).getText();
            commands.set(i, "TEMP." + str);
            funcNames.push(str);
        }
        if(ctx.getChildCount() == 4 ){
            if (ctx.getChild(1).getText().equals("main")){
                if(ctx.getParent().getParent().getParent().getParent() instanceof SHJavaParser.ClassDeclarationContext){
                     temp = ctx.getParent().getParent().getParent().getParent().getChild(1).getText();
                     if(ctx.getParent().getParent().getParent().getParent().getParent() instanceof SHJavaParser.TypeDeclarationContext &&
                             ctx.getParent().getParent().getParent().getParent().getParent().getChildCount() == 2 &&
                             ctx.getParent().getParent().getParent().getParent().getParent().getChild(0).getText().equals("pub")){
                         fileName = temp;
                     }
                }
            }
        }
    }

    @Override public void enterMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) {
        commands.add("TEMP METHOD NAME");
        commands.add("BEGINFUNC");
    }

    @Override public void exitVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx) {
        if (values.empty()  && ctx.getChildCount() == 3){
            String left, right;
            right = ctx.getChild(2).getText();
            left = ctx.getChild(0).getText();
            commands.add("T"+count+ " = " +right);
            commands.add(left + " = T" + count);
            count++;
        }
        else if (!values.empty()){
            String str = ctx.getChild(0).getText() + " = " + values.pop();
            commands.add(str);
        }
    }

    @Override public void enterElseStatement(SHJavaParser.ElseStatementContext ctx){
        int indexOfL = commands.indexOf(prev);
        commands.add(indexOfL, "GOTO L" + jumpCount);
        ifStatements.push("L" + jumpCount);
        jumpCount++;

    }

    @Override public void exitElseStatement(SHJavaParser.ElseStatementContext ctx){
        if(!ifStatements.empty())
            commands.add(ifStatements.pop() + "");

    }

    @Override public void exitStatement(SHJavaParser.StatementContext ctx) {
        if(!ifStatements.empty() && whiStatements.empty()){
            String str = ifStatements.pop() + ":";
            commands.add(str);
            prev = str;
        }
        if(!whiStatements.empty()){
            String str = "GOTO " + whiStatements.pop();
            commands.add(str);
        }
        if(ctx.getChildCount() == 3 && !values.empty()){
            commands.add("RETURN " + values.pop());
        }
    }

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


    @Override public void exitParExpression(SHJavaParser.ParExpressionContext ctx) {
        if(ctx.getChildCount() == 3 && !values.empty()){
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

}
