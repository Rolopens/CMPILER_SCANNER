import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;


public class CustomErrorListener extends SHJavaParserBaseListener {

    private Stack<Variable> varStack = new Stack<>();
    private ArrayList<SHJavaClass> classes = new ArrayList<>();
    ArrayList<SHJavaFunction> functions = new ArrayList<>();

    ArrayList<SHJavaParser.LiteralContext> varExpressions = new ArrayList<>();

    ArrayList<String> errors = new ArrayList<>();

    private ArrayList<String> list;

    private ArrayList<String> keywords = new ArrayList<String>(){
        {
            add("abs");
            add("ass");
            add("boo");
            add("brk");
            add("cas");
            add("cha");
            add("cla");
            add("con");
            add("def");
            add("ddo");
            add("els");
            add("enu");
            add("ext");
            add("fin");
            add("flo");
            add("dur");
            add("iif");
            add("imp");
            add("iof");
            add("dec");
            add("ifa");
            add("cre");
            add("nul");
            add("pri");
            add("out");
            add("pro");
            add("pub");
            add("ret");
            add("inp");
            add("sta");
            add("str");
            add("sup");
            add("swi");
            add("thi");
            add("voi");
            add("whi");
        }
    };
    private ArrayList<Variable> variables = new ArrayList<>();
    private Variable variable;

    public CustomErrorListener(){
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
        return list;
    }
    public ArrayList<String> getErrors() { return errors; }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) { }

    @Override public void exitVariableAssignment(SHJavaParser.VariableAssignmentContext ctx) {
        System.out.println("------ (Variable Assignment) ------");
        System.out.println("This is the variable name: " + ctx.getChild(0).getText());
        System.out.println("This is the value of the variable:" + ctx.getChild(2).getText());

        if((ctx.getChild(2) instanceof SHJavaParser.ExpressionContext) &&
                checkIfVarExistsAndReturn(ctx.getChild(0).getText()) != null &&
                doesFunctionExist(ctx.getChild(2).getChild(0).getChild(0).getText())){
            if(!(checkIfVarExistsAndReturn(ctx.getChild(0).getText()).getType()
                    .equals(getFunction(ctx.getChild(2).getChild(0).getChild(0).getText()).getRetType()))){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : data type mismatch");
            }

        }else if((ctx.getChild(2) instanceof SHJavaParser.ExpressionContext) &&
                !doesFunctionExist(ctx.getChild(2).getChild(0).getChild(0).getText())) {
            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : function: " +
                    ctx.getChild(2).getChild(0).getChild(0).getText() + " does not exist");
        }else if(!checkIfVarIsConstant(ctx.getChild(0).getText()) && !checkIfVarIsAbstract(ctx.getChild(0).getText())) {

            int iTemp = 0; //temp int
            float fTemp = 0; //temp float
            //flag to check if an identifier is being assigned to another identifier
            boolean identifierFlag = true; //true means not being assigned to an identifier
            boolean varExists = false; //false means var does not exist

            for (int i = 0; i < variables.size(); i++) {
                if (variables.get(i).getName().equals(ctx.getChild(0).getText())) {

                    //for identifier to identifier
                    //if they have the same name and type, copy the value
                    for (int j = 0; j < variables.size(); j++) {
                        if (ctx.getChild(2).getText().equals(variables.get(j).getName())) {
                            if (variables.get(i).getType().equals(variables.get(j).getType())) {
                                variables.get(i).setValue(variables.get(j).getValue());
                            } else {
                                errors.add(variables.get(j).getName() + " is of type " + variables.get(j).getType() + " which is " +
                                        "incompatible with " + variables.get(i).getType() + ":" + variables.get(i).getName());
                            }
                            identifierFlag = false;
                        }
                    }

                    //for integer assignment
                    try {
                        if (variables.get(i).getType().equals("dec") && identifierFlag) {
                            iTemp = parseInt(ctx.getChild(2).getText());
                            variables.get(i).setValue(ctx.getChild(2).getText());
                        }
                    } catch (Exception e) {
                        errors.add(ctx.getChild(2).getText() + " is not an integer");
                    }

                    //for float assignment
                    try {
                        if (variables.get(i).getType().equals("flo") && identifierFlag) {
                            fTemp = parseFloat(ctx.getChild(2).getText());
                            variables.get(i).setValue(ctx.getChild(2).getText());
                        }
                    } catch (Exception e) {
                        errors.add(ctx.getChild(2).getText() + " is not a floating point number");
                    }

                    //for string assignments
                    if (identifierFlag) {
                        if (variables.get(i).getType().equals("str") && ctx.getChild(2).getText().contains("\"")) {
                            variables.get(i).setValue(ctx.getChild(2).getText().split("\"")[1]);
                        } else if (variables.get(i).getType().equals("str") && !ctx.getChild(2).getText().contains("\"")) {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + ctx.getChild(2).getText()
                                    + " is not a string");
                        }
                        //for character assignments
                        else if (variables.get(i).getType().equals("cha") && ctx.getChild(2).getText().contains("\'")) {
                            variables.get(i).setValue(ctx.getChild(2).getText());
                        } else if (variables.get(i).getType().equals("cha") && !ctx.getChild(2).getText().contains("\'")) {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + ctx.getChild(2).getText()
                                    + " is not a character");
                        }
                    }
                    varExists = true;
                }
            }

            if (!varExists) {
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + ctx.getChild(0).getText() + " does" +
                        " not exist");
            }
        }else if(checkIfVarIsConstant(ctx.getChild(0).getText())){
            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + ctx.getChild(0).getText() + " is " +
                    "a constant");
        }else if(checkIfVarIsAbstract(ctx.getChild(0).getText())){
            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + ctx.getChild(0).getText() + " is " +
                    "abstract");
        }

        System.out.println("------ (Printing variables list) -------");
        for (int i = 0; i < variables.size(); i++) {
            System.out.println(i + ": " + variables.get(i).getIsAbstract()+ ", " + variables.get(i).isConstant()
                    + ", " + variables.get(i).getAcc() + ", " + variables.get(i).getName() + ", "
                    + variables.get(i).getType() + ", " + variables.get(i).getValue());
        }

    }

    @Override public void enterForControl(SHJavaParser.ForControlContext ctx) {
//        System.out.println(ctx.getText() + " Enter Rule");
    }

    @Override public void enterPrimaryError(SHJavaParser.PrimaryErrorContext ctx) {
//        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Not a Statement");
        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Not a Statement");
    }

    @Override public void enterInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) {
//        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Extraneous '+' symbol");
        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Extraneous '+' symbol");
    }

    @Override public void enterInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) {
//        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Invalid Expression");
        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Invalid Expression");
    }

    @Override public void enterInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) {
//        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Lacking Quotation Marks");
        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Print Statement - Lacking Quotation Marks");
    }

    @Override public void exitComparisonExpression(SHJavaParser.ComparisonExpressionContext ctx) {
        if (ctx.getChildCount() == 0 ){
//            System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Comparison Expression");
            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Comparison Expression");
        }
    }
    @Override public void enterForWrongDeclaration(SHJavaParser.ForWrongDeclarationContext ctx) {
//        System.out.println("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Declaration within dur Loop");
        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Invalid Declaration within dur Loop");
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


    @Override public void exitCompilationUnit(SHJavaParser.CompilationUnitContext ctx) {
        for (int i = 0; i < ctx.getChildCount()-1; i++){
            if(!(ctx.getChild(i) instanceof SHJavaParser.TypeDeclarationContext)){
                errors.add("[ERROR] invalid text outside class declarations: " + ctx.getChild(i).getText());
            }
        }
    }

    @Override public void exitTypeDeclaration(SHJavaParser.TypeDeclarationContext ctx) { }

    @Override public void exitModifier(SHJavaParser.ModifierContext ctx) { }

    @Override public void exitClassOrInterfaceModifier(SHJavaParser.ClassOrInterfaceModifierContext ctx) { }

    @Override public void exitVariableModifier(SHJavaParser.VariableModifierContext ctx) { }

    @Override public void exitClassDeclaration(SHJavaParser.ClassDeclarationContext ctx) {
        if (ctx.getChildCount() == 3){
            SHJavaClass temp = new SHJavaClass();
            ArrayList<SHJavaFunction> functions2 = new ArrayList<>();
            ArrayList<Variable> vars = new ArrayList<>();
            temp.setName(ctx.getChild(1).getText());
            for (int i = 0; i < functions.size(); i++){
                if(functions.get(i).getFuncName().equals(ctx.getChild(1).getText())){
                    if(temp.getConstructor() != null){
                        System.out.println("[ERROR] Multiple constructor classes defined -" + ctx.getChild(1).getText());
                    } else {
                        temp.setConstructor(functions.get(i));
                    }

                } else {
                    functions2.add(functions.get(i));
                }
            }
            temp.setFunctions(functions2);
            functions.clear();
            if (ctx.getParent() instanceof SHJavaParser.TypeDeclarationContext) {
                for (int i = 0; i < ctx.getParent().getChildCount() - 1; i++) {
                    temp.addModifier(ctx.getParent().getChild(i).getText());
                }
            }
            while(!varStack.empty()){
                vars.add(varStack.pop());
            }
            temp.setClassVars(vars);
//            System.out.println("Clas Name: " + temp.getName() + " Constructor: " + temp.getConstructor()
//                    + " Functions: " + temp.getFunctions() + " Modifiers: " + temp.getModifiers().toString() + " Vars " + temp.getClassVars());
            classes.add(temp);
        }
    }

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

    @Override public void exitClassBodyDeclaration(SHJavaParser.ClassBodyDeclarationContext ctx) {

        String acc = ctx.getChild(0).getText();
        String type = "";
        String name = "";

        boolean fConstant = false;
        boolean vFlag = false; //for checking if we are handling a variable

        //automatically make vars/functions without a modifier to public
        //doing vars for now
        try {
            if(ctx.getChild(0).getText().equals("abs")){
                if(!ctx.getChild(1).getText().equals("pub") && !ctx.getChild(1).getText().equals("pri")){
                    if(ctx.getChild(1).getText().contains("dec")){
                        variable = new Variable(true, "pub",
                                ctx.getChild(1).getText().replaceAll("dec", "")
                                        .replaceAll(";", ""), "dec");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("flo")){
                        variable = new Variable(true, "pub",
                                ctx.getChild(1).getText().replaceAll("flo", "")
                                        .replaceAll(";", ""), "flo");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("cha")){
                        variable = new Variable(true, "pub",
                                ctx.getChild(1).getText().replaceAll("cha", "")
                                        .replaceAll(";", ""), "cha");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("str")){
                        variable = new Variable(true, "pub",
                                ctx.getChild(1).getText().replaceAll("str", "")
                                        .replaceAll(";", ""), "str");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                }else if(ctx.getChild(1).getText().equals("pub") || ctx.getChild(1).getText().equals("pri")){
                    if(ctx.getChild(2).getText().contains("dec")){
                        variable = new Variable(true, ctx.getChild(1).getText(),
                                ctx.getChild(2).getText().replaceAll("dec", "")
                                        .replaceAll(";", ""), "dec");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("flo")){
                        variable = new Variable(true, ctx.getChild(1).getText(),
                                ctx.getChild(2).getText().replaceAll("flo", "")
                                        .replaceAll(";", ""), "flo");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("cha")){
                        variable = new Variable(true, ctx.getChild(1).getText(),
                                ctx.getChild(2).getText().replaceAll("cha", "")
                                        .replaceAll(";", ""), "cha");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                    else if(ctx.getChild(1).getText().contains("str")){
                        variable = new Variable(true, ctx.getChild(1).getText(),
                                ctx.getChild(2).getText().replaceAll("str", "")
                                        .replaceAll(";", ""), "str");
                        variables.add(variable);
                        varStack.push(variable);
                    }
                }
            }else if(ctx.getChild(0).getText().equals("fin")){
                System.out.println("This is the variable fin: " +ctx.getChild(0).getText());
                System.out.println("This is the variable acc: " +ctx.getChild(1).getText());
                System.out.println("This is everything else: " +ctx.getChild(2).getText());

                acc = ctx.getChild(1).getText();
                fConstant = true;

                if(!(ctx.getChild(2).getChild(0) instanceof SHJavaParser.MethodDeclarationContext)){
                    vFlag = true;

                    System.out.println("in here: " + ctx.getChild(2).getText());
                    //this is the name of the variable
                    if (ctx.getChild(2).getText().contains("dec")) {
                        System.out.println(ctx.getChild(2).getText().replaceAll("dec", "").replaceAll(";", ""));
                        name = ctx.getChild(2).getText().replaceAll("dec", "").replaceAll(";", "");
                        type = "dec";
                    }
                    if (ctx.getChild(2).getText().contains("flo")) {
                        System.out.println(ctx.getChild(2).getText().replaceAll("flo", "").replaceAll(";", ""));
                        name = ctx.getChild(2).getText().replaceAll("flo", "").replaceAll(";", "");
                        type = "flo";
                    }
                    if (ctx.getChild(2).getText().contains("cha")) {
                        System.out.println(ctx.getChild(2).getText().replaceAll("cha", "").replaceAll(";", ""));
                        name = ctx.getChild(2).getText().replaceAll("cha", "").replaceAll(";", "");
                        type = "cha";
                    }
                    if (ctx.getChild(2).getText().contains("str")) {
                        System.out.println(ctx.getChild(2).getText().replaceAll("str", "").replaceAll(";", ""));
                        name = ctx.getChild(2).getText().replaceAll("str", "").replaceAll(";", "");
                        type = "str";
                    }
                }else {
                    vFlag = false;
                }
            }else if(!(ctx.getChild(1).getChild(0) instanceof SHJavaParser.MethodDeclarationContext)) {

                vFlag = true;
                fConstant = false;

                System.out.println("in here: " + ctx.getChild(1).getText());
                //this is the name of the variable
                if (ctx.getChild(1).getText().contains("dec")) {
                    System.out.println(ctx.getChild(1).getText().replaceAll("dec", "").replaceAll(";", ""));
                    name = ctx.getChild(1).getText().replaceAll("dec", "").replaceAll(";", "");
                    type = "dec";
                }
                if (ctx.getChild(1).getText().contains("flo")) {
                    System.out.println(ctx.getChild(1).getText().replaceAll("flo", "").replaceAll(";", ""));
                    name = ctx.getChild(1).getText().replaceAll("flo", "").replaceAll(";", "");
                    type = "flo";
                }
                if (ctx.getChild(1).getText().contains("cha")) {
                    System.out.println(ctx.getChild(1).getText().replaceAll("cha", "").replaceAll(";", ""));
                    name = ctx.getChild(1).getText().replaceAll("cha", "").replaceAll(";", "");
                    type = "cha";
                }
                if (ctx.getChild(1).getText().contains("str")) {
                    System.out.println(ctx.getChild(1).getText().replaceAll("str", "").replaceAll(";", ""));
                    name = ctx.getChild(1).getText().replaceAll("str", "").replaceAll(";", "");
                    type = "str";
                }
            }else {
                vFlag = false;
            }
        } catch (NullPointerException e) { //for when they dont have either pub or pri, we make it pub

            System.out.println("This is the variable fin: " +ctx.getChild(0).getText());
//            System.out.println("This is everything else: " +ctx.getChild(1).getText());

            acc = "pub";

            if(ctx.getChild(0).getText().equals("fin")) {
                fConstant = true;
                System.out.println("yes yes yes" + (ctx.getChild(1).getChild(0) instanceof SHJavaParser.MethodDeclarationContext));
                if(!(ctx.getChild(1).getChild(0) instanceof SHJavaParser.MethodDeclarationContext)) {
                    vFlag = true;
                    if (ctx.getChild(1).getText().contains("dec")) {
                        System.out.println("in the catch: " + ctx.getChild(1).getText().replaceAll("dec", "").replaceAll(";", ""));
                        name = ctx.getChild(1).getText().replaceAll("dec", "").replaceAll(";", "");
                        type = "dec";
                    }
                    if (ctx.getChild(1).getText().contains("flo")) {
                        System.out.println("in the catch: " + ctx.getChild(1).getText().replaceAll("flo", "").replaceAll(";", ""));
                        name = ctx.getChild(1).getText().replaceAll("flo", "").replaceAll(";", "");
                        type = "flo";
                    }
                    if (ctx.getChild(1).getText().contains("cha")) {
                        System.out.println("in the catch: " + ctx.getChild(1).getText().replaceAll("cha", "").replaceAll(";", ""));
                        name = ctx.getChild(1).getText().replaceAll("cha", "").replaceAll(";", "");
                        type = "cha";
                    }
                    if (ctx.getChild(1).getText().contains("str")) {
                        System.out.println("in the catch: " + ctx.getChild(1).getText().replaceAll("str", "").replaceAll(";", ""));
                        name = ctx.getChild(1).getText().replaceAll("str", "").replaceAll(";", "");
                        type = "str";
                    }
                }else{
                    vFlag = false;
                }
            }else if(!(ctx.getChild(0).getChild(0) instanceof SHJavaParser.MethodDeclarationContext)) {
                fConstant = false;
                vFlag = true;
                if (ctx.getChild(0).getText().contains("dec")) {
                    System.out.println("in the catch: " + ctx.getChild(0).getText().replaceAll("dec", "").replaceAll(";", ""));
                    name = ctx.getChild(0).getText().replaceAll("dec", "").replaceAll(";", "");
                    type = "dec";
                }
                if (ctx.getChild(0).getText().contains("flo")) {
                    System.out.println("in the catch: " + ctx.getChild(0).getText().replaceAll("flo", "").replaceAll(";", ""));
                    name = ctx.getChild(0).getText().replaceAll("flo", "").replaceAll(";", "");
                    type = "flo";
                }
                if (ctx.getChild(0).getText().contains("cha")) {
                    System.out.println("in the catch: " + ctx.getChild(0).getText().replaceAll("cha", "").replaceAll(";", ""));
                    name = ctx.getChild(0).getText().replaceAll("cha", "").replaceAll(";", "");
                    type = "cha";
                }
                if (ctx.getChild(0).getText().contains("str")) {
                    System.out.println("in the catch: " + ctx.getChild(0).getText().replaceAll("str", "").replaceAll(";", ""));
                    name = ctx.getChild(0).getText().replaceAll("str", "").replaceAll(";", "");
                    type = "str";
                }
            }else{
                vFlag = false;
            }
        }

        if(vFlag) {
            System.out.println("------ (Global Variable declaration) ------");
            System.out.println("This is the variable acc: " + acc);
            System.out.println("This is the variable type: " + type);
            System.out.println("This is the variable name: " + name);

            boolean allInt = false;
            boolean allFlo = false;
            boolean allCha = false;
            boolean allStr = false;

            for(int i = 0; i < varExpressions.size(); i++){
                System.out.println("oioioioi" + varExpressions.get(i).getText());
                if(varExpressions.get(i).getChild(0) instanceof SHJavaParser.IntegerLiteralContext){
                    allInt = true;
                    allFlo = true;
                    allCha = false;
                    allStr = false;
                }else if(varExpressions.get(i).getChild(0) instanceof SHJavaParser.FloatLiteralContext){
                    allInt = false;
                    allFlo = true;
                    allCha = false;
                    allStr = false;
                }else if(varExpressions.get(i).getText().contains("\'") && varExpressions.get(i).getText().length() == 1){
                    allInt = true;
                    allFlo = false;
                    allCha = true;
                    allStr = false;
                }else if(varExpressions.get(i).getText().contains("\"")){
                    allInt = false;
                    allFlo = false;
                    allCha = false;
                    allStr = true;
                }
            }

            if(!name.contains("=")) {
                if (!keywords.contains(name) && (checkIfVarExistsAndReturn(name)
                        == null)) {
                    //change this to pub priv or whatever
                    variable = new Variable(acc, name, type);
                    variables.add(variable);
                    varStack.push(variable);
                } else if (keywords.contains(name)) {
                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Cannot use " + name +
                            " as variable name because it is a keyword");
                } else if (checkIfVarExistsAndReturn(ctx.getChild(1).getText()) != null) {
                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Variable " + name +
                            " already exists");
                }
            }else if(name.contains("=")){
                if(!keywords.contains(name.split("=")[0]) && (checkIfVarExistsAndReturn
                        (name.split("=")[0]) == null)) {

                    String newName = name.split("=")[0];
                    System.out.println("test new name: " +newName);
                    String value = name.split("=")[1];
                    System.out.println("test new value: " +value);

                    int iTemp;
                    float fTemp;

                    boolean identifierFlag = true;

                    //for identifier to identifier
                    //if they have the same name and type, copy the value
                    for (int j = 0; j < variables.size(); j++) {
                        if (value.equals(variables.get(j).getName())) {
                            if (type.equals(variables.get(j).getType())) {
                                if(fConstant){
                                    variable = new Variable(true, acc, newName, type,
                                            variables.get(j).getValue());
                                }else {
                                    variable = new Variable(acc, newName, type,
                                            variables.get(j).getValue());
                                }
                                variables.add(variable);
                                varStack.push(variable);
                            } else {
                                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + variables.get(j).getName()
                                        + " is of type " + variables.get(j).getType() + " which is " +
                                        "incompatible with " + type + " : " + name);
                            }
                            identifierFlag = false;
                        }
                    }

                    //for integer assignment
//                    try {
                        if (type.equals("dec") && identifierFlag) {
//                            iTemp = parseInt(value);
                            if (allInt) {
                                if (fConstant) {
                                    variable = new Variable(true, acc, newName, "dec",
                                            value);
                                } else {
                                    variable = new Variable(acc, newName, "dec",
                                            value);
                                }
                                variables.add(variable);
                                varStack.push(variable);
                            }
                        }else{
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                                    value + " is not an integer");
                        }
//                    } catch (Exception e) {
//                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                                value + " is not an integer");
//                    }

                    //for float assignment
//                    try {
                        if (type.equals("flo") && identifierFlag) {
//                            fTemp = parseFloat(value);
                            if (allFlo) {
                                if (fConstant) {
                                    variable = new Variable(true, acc, newName, "flo",
                                            value);
                                }
                                variable = new Variable(acc, newName, "flo",
                                        value);
                                variables.add(variable);
                                varStack.push(variable);
                            }else{
                                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                                        value + " is not a floating point number");
                            }
                        }
//                    } catch (Exception e) {
//                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                                value + " is not a floating point number");
//                    }

                    //for string assignments
                    if (identifierFlag) {
                        if (type.equals("str") && allStr) {
                            if(fConstant){
                                variable = new Variable(true, acc, newName, type, value);
                            }else {
                                variable = new Variable(acc, newName, type, value);
                            }
                            variables.add(variable);
                            varStack.push(variable);
                        } else if (type.equals("str") && !value.contains("\"")) {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                    + " is not a string");
                        }
                        //for character assignments
                        else if (type.equals("cha") && allCha) {
                            if(fConstant) {
                                variable = new Variable(true, acc, newName, type, value);
                            }else{
                                variable = new Variable(acc, newName, type, value);
                            }
                            variables.add(variable);
                            varStack.push(variable);
                        } else if (type.equals("cha") && !value.contains("\'")) {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                    + " is not a character");
                        }
                    }
                }

            }
        }

    }

    @Override public void exitMemberDeclaration(SHJavaParser.MemberDeclarationContext ctx) { }

    @Override public void exitMethodDeclaration(SHJavaParser.MethodDeclarationContext ctx) {
        if(!doesFunctionExist(ctx.getChild(1).getText())){
            if (ctx.getChildCount() == 4) {
                SHJavaFunction temp = new SHJavaFunction();
                temp.setRetType(ctx.getChild(0).getText());
                if (ctx.getChild(2).getChildCount() == 3) {
                    if (ctx.getChild(2).getChild(1).getChildCount() % 2 == 1) {
                        for (int i = 0; i < ctx.getChild(2).getChild(1).getChildCount(); i = i + 2) {
                            temp.addParameter(new SHJavaParameter(ctx.getChild(2).getChild(1).getChild(i).getChild(0).getText(), ctx.getChild(2).getChild(1).getChild(i).getChild(1).getText()));
                        }
                    }
                }
                temp.setFuncName(ctx.getChild(1).getText());
                if (ctx.getParent().getParent() instanceof SHJavaParser.ClassBodyDeclarationContext) {
                    for (int i = 0; i < ctx.getParent().getParent().getChildCount() - 1; i++) {
                        temp.addModifier(ctx.getParent().getParent().getChild(i).getText());
                    }
                }
//            System.out.println("Name: " + temp.getFuncName() + " Paramaters: " + temp.getParameters()
//                    + " Return Type: " + temp.getRetType() + " Modifiers: " + temp.getModifiers().toString());
                functions.add(temp);
            }
        } else {
            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Function " +ctx.getChild(1).getText() +
                    " already exists");
        }

    }

    @Override public void exitReturnStatemet(SHJavaParser.ReturnStatemetContext ctx) {
//        System.out.println("HGWBAJKJ" + (ctx.getParent().getParent().getParent().getParent().getParent() instanceof SHJavaParser.MethodDeclarationContext));
    if(ctx.getParent().getParent().getParent().getParent().getParent() instanceof SHJavaParser.MethodDeclarationContext &&
            ctx.getParent().getParent().getParent().getParent().getParent().getChildCount() == 4){

        if(checkIfVarExistsAndReturn(ctx.getChild(1).getText()) != null &&
                !(checkIfVarExistsAndReturn(ctx.getChild(1).getText()).getType().
                        equals(ctx.getParent().getParent().getParent().getParent().getParent().getChild(0).getText()))) {
            if (ctx.getParent().getParent().getParent().getParent().getParent().getChild(0).getText().equals("voi")) {
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : cannot return since function is of type void");
            } else {
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : returning an incompatible data type, expecting "
                        + ctx.getParent().getParent().getParent().getParent().getParent().getChild(0).getText());
            }
        }

    }

    }

    @Override public void exitMethodBody(SHJavaParser.MethodBodyContext ctx) { }

    @Override public void exitTypeTypeOrVoid(SHJavaParser.TypeTypeOrVoidContext ctx) { }

    @Override public void exitGenericMethodDeclaration(SHJavaParser.GenericMethodDeclarationContext ctx) { }

    @Override public void exitGenericConstructorDeclaration(SHJavaParser.GenericConstructorDeclarationContext ctx) { }

    @Override public void exitConstructorDeclaration(SHJavaParser.ConstructorDeclarationContext ctx) {
        if(ctx.getChildCount() == 3){
            SHJavaFunction temp = new SHJavaFunction();
            temp.addModifier("pub");
            temp.setFuncName(ctx.getChild(0).getText());
            temp.setRetType(null);
            if (ctx.getChild(1).getChildCount() == 3 && ctx.getChild(1).getChild(1).getChildCount() % 2 == 1) {
                for (int i = 0; i < ctx.getChild(1).getChild(1).getChildCount(); i = i + 2) {
                    temp.addParameter(new SHJavaParameter(ctx.getChild(1).getChild(1).getChild(i).getChild(0).getText(), ctx.getChild(1).getChild(1).getChild(i).getChild(1).getText()));
                }
            }

//            System.out.println("CONSTRUCTOR Name: " + temp.getFuncName() + " Paramaters: " + temp.getParameters()
//                    + " Return Type: " + temp.getRetType() + " Modifiers: " + temp.getModifiers().toString());
            functions.add(temp);
        }
    }

    @Override public void enterFieldDeclaration(SHJavaParser.FieldDeclarationContext ctx) {
        varExpressions.clear();
    }

    @Override public void exitFieldDeclaration(SHJavaParser.FieldDeclarationContext ctx) {

//        System.out.println("------ (Global Variable declaration) ------");
//        System.out.println("This is the variable type: " +ctx.getChild(0).getText());
//        System.out.println("This is the variable name: " +ctx.getChild(1).getText());
//
//        if(!keywords.contains(ctx.getChild(1).getText()) && (checkIfVarExistsAndReturn(ctx.getChild(1).getText())
//                == null)){
//            //change this to pub priv or whatever
//            variable = new Variable("Global", ctx.getChild(1).getText(), ctx.getChild(0).getText());
//            variables.add(variable);
//        }else if(keywords.contains(ctx.getChild(1).getText())){
//            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Cannot use " +ctx.getChild(1).getText() +
//                    " as variable name because it is a keyword");
//        }else if(checkIfVarExistsAndReturn(ctx.getChild(1).getText()) != null){
//            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Variable " +ctx.getChild(1).getText() +
//                    " already exists");
//        }

    }

    @Override public void exitInterfaceBodyDeclaration(SHJavaParser.InterfaceBodyDeclarationContext ctx) { }

    @Override public void exitInterfaceMemberDeclaration(SHJavaParser.InterfaceMemberDeclarationContext ctx) { }

    @Override public void exitConstDeclaration(SHJavaParser.ConstDeclarationContext ctx) { }

    @Override public void exitConstantDeclarator(SHJavaParser.ConstantDeclaratorContext ctx) { }

    @Override public void exitInterfaceMethodDeclaration(SHJavaParser.InterfaceMethodDeclarationContext ctx) { }

    @Override public void exitInterfaceMethodModifier(SHJavaParser.InterfaceMethodModifierContext ctx) { }

    @Override public void exitGenericInterfaceMethodDeclaration(SHJavaParser.GenericInterfaceMethodDeclarationContext ctx) { }

    @Override public void exitVariableDeclarators(SHJavaParser.VariableDeclaratorsContext ctx) { }

    @Override public void exitVariableDeclarator(SHJavaParser.VariableDeclaratorContext ctx) {
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

    @Override public void exitLiteral(SHJavaParser.LiteralContext ctx) {
        varExpressions.add(ctx);
    }

    @Override public void exitIntegerLiteral(SHJavaParser.IntegerLiteralContext ctx) { }

    @Override public void exitFloatLiteral(SHJavaParser.FloatLiteralContext ctx) { }

    @Override public void exitBlock(SHJavaParser.BlockContext ctx) { }

    @Override public void exitBlockStatement(SHJavaParser.BlockStatementContext ctx) { }

    @Override public void enterLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx) {
        varExpressions.clear();
    }

    @Override public void exitLocalVariableDeclaration(SHJavaParser.LocalVariableDeclarationContext ctx) {

        boolean allInt = false;
        boolean allFlo = false;
        boolean allCha = false;
        boolean allStr = false;

        for(int i = 0; i < varExpressions.size(); i++){
            if(varExpressions.get(i).getChild(0) instanceof SHJavaParser.IntegerLiteralContext){
                allInt = true;
                allFlo = true;
                allCha = false;
                allStr = false;
            }else if(varExpressions.get(i).getChild(0) instanceof SHJavaParser.FloatLiteralContext){
                allInt = false;
                allFlo = true;
                allCha = false;
                allStr = false;
            }else if(varExpressions.get(i).getText().contains("\'") && varExpressions.get(i).getText().length() == 1){
                allInt = true;
                allFlo = false;
                allCha = true;
                allStr = false;
            }else if(varExpressions.get(i).getText().contains("\"")){
                allInt = false;
                allFlo = false;
                allCha = false;
                allStr = true;
            }
        }

        if(ctx.getChild(0).getText().equals("fin")){
            System.out.println("------ (Local Variable declaration) ------");
            System.out.println("This is the variable fin: " +ctx.getChild(0).getText());
            System.out.println("This is the variable type: " +ctx.getChild(1).getText());
            System.out.println("This is the variable name: " +ctx.getChild(2).getText().split("=")[0]);
//            System.out.println("This is the variable value: " +ctx.getChild(2).getText().split("=")[1]);


            if(!keywords.contains(ctx.getChild(2).getText().split("=")[0]) && (checkIfVarExistsAndReturn
                    (ctx.getChild(2).getText().split("=")[0]) == null)) {

                String type = ctx.getChild(1).getText();
                String name = ctx.getChild(2).getText().split("=")[0];
                String value = ctx.getChild(2).getText().split("=")[1];
                int iTemp;
                float fTemp;

                boolean identifierFlag = true;

                //for identifier to identifier
                //if they have the same name and type, copy the value
                for (int j = 0; j < variables.size(); j++) {
                    if (value.equals(variables.get(j).getName())) {
                        if (type.equals(variables.get(j).getType())) {
                            variable = new Variable(true,"Local", name, type,
                                    variables.get(j).getValue());
                            variables.add(variable);
                        } else {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + variables.get(j).getName()
                                    + " is of type " + variables.get(j).getType() + " which is " +
                                    "incompatible with " + type + " : " + name);
                        }
                        identifierFlag = false;
                    }
                }

                //for integer assignment
//                try {
                    if (type.equals("dec") && identifierFlag) {
//                        iTemp = parseInt(value);
                        if(allInt) {
                            variable = new Variable(true, "Local", name, "dec",
                                    value);
                            variables.add(variable);
                        }else{
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                            value + " is not an integer");
                        }
                    }
//                } catch (Exception e) {
//                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                            value + " is not an integer");
//                }

                //for float assignment
//                try {
                    if (type.equals("flo") && identifierFlag) {
//                        fTemp = parseFloat(value);
                        if(allFlo) {
                            variable = new Variable(true, "Local", name, "flo",
                                    value);
                            variables.add(variable);
                        }else{
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                            value + " is not a floating point number");
                        }
                    }
//                } catch (Exception e) {
//                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                            value + " is not a floating point number");
//                }

                //for string assignments
                if (identifierFlag) {
                    if (type.equals("str") && allStr) {
                        variable = new Variable(true,"Local", name, type, value);
                        variables.add(variable);
                    } else if (type.equals("str") && !value.contains("\"")) {
                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                + " is not a string");
                    }
                    //for character assignments
                    else if (type.equals("cha") && allCha) {
                        variable = new Variable(true,"Local", name, type, value);
                        variables.add(variable);
                    } else if (type.equals("cha") && !value.contains("\'")) {
                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                + " is not a character");
                    }
                }
            }else if(keywords.contains(ctx.getChild(2).getText().split("=")[0])){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Cannot use "
                        +ctx.getChild(2).getText().split("=")[0] +
                        " as variable name because it is a keyword");
            }else if(checkIfVarExistsAndReturn(ctx.getChild(2).getText().split("=")[0]) != null){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Variable "
                        +ctx.getChild(2).getText().split("=")[0] +
                        " already exists");
            }

        }else if(!ctx.getChild(1).getText().contains("=") && !ctx.getChild(0).getText().equals("fin")){
            System.out.println("------ (Local Variable declaration) ------");
            System.out.println("This is the variable type: " +ctx.getChild(0).getText());
            System.out.println("This is the variable name: " +ctx.getChild(1).getText());

            if(!keywords.contains(ctx.getChild(1).getText()) && (checkIfVarExistsAndReturn(ctx.getChild(1).getText())
                == null)){
                variable = new Variable("Local", ctx.getChild(1).getText(), ctx.getChild(0).getText());
                variables.add(variable);
            }else if(keywords.contains(ctx.getChild(1).getText())){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Cannot use " +ctx.getChild(1).getText() +
                    " as variable name because it is a keyword");
            }else if(checkIfVarExistsAndReturn(ctx.getChild(1).getText()) != null){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Variable " +ctx.getChild(1).getText() +
                    " already exists");
            }
        }else if(ctx.getChild(1).getText().contains("=")){
            if(!keywords.contains(ctx.getChild(1).getText().split("=")[0]) && (checkIfVarExistsAndReturn
                    (ctx.getChild(1).getText().split("=")[0]) == null)) {

                String type = ctx.getChild(0).getText();
                String name = ctx.getChild(1).getText().split("=")[0];
                String value = ctx.getChild(1).getText().split("=")[1];
                int iTemp;
                float fTemp;

                boolean identifierFlag = true;

                //for identifier to identifier
                //if they have the same name and type, copy the value
                for (int j = 0; j < variables.size(); j++) {
                    if (value.equals(variables.get(j).getName())) {
                        if (type.equals(variables.get(j).getType())) {
                            variable = new Variable("Local", name, type,
                                    variables.get(j).getValue());
                            variables.add(variable);
                        } else {
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + variables.get(j).getName()
                                    + " is of type " + variables.get(j).getType() + " which is " +
                                    "incompatible with " + type + " : " + name);
                        }
                        identifierFlag = false;
                    }
                }

                //for integer assignment
//                try {
                    if (type.equals("dec") && identifierFlag) {
//                        iTemp = parseInt(value);
                        if(allInt) {
                            variable = new Variable("Local", name, "dec",
                                    value);
                            variables.add(variable);
                        }else{
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                                    value + " is not an integer");
                        }
                    }
//                } catch (Exception e) {
//                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                            value + " is not an integer");
//                }

                //for float assignment
//                try {
                    if (type.equals("flo") && identifierFlag) {
//                        fTemp = parseFloat(value);
                        if(allFlo) {
                            variable = new Variable("Local", name, "flo",
                                    value);
                            variables.add(variable);
                        }else{
                            errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
                                    value + " is not a floating point number");
                        }
                    }
//                } catch (Exception e) {
//                    errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " :" +
//                            value + " is not a floating point number");
//                }

                //for string assignments
                if (identifierFlag) {
                    if (type.equals("str") && allStr) {
                        variable = new Variable("Local", name, type, value);
                        variables.add(variable);
                    } else if (type.equals("str") && !value.contains("\"")) {
                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                + " is not a string");
                    }
                    //for character assignments
                    else if (type.equals("cha") && allCha) {
                        variable = new Variable("Local", name, type, value);
                        variables.add(variable);
                    } else if (type.equals("cha") && !value.contains("\'")) {
                        errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : " + value
                                + " is not a character");
                    }
                }
            }else if(keywords.contains(ctx.getChild(1).getText().split("=")[0])){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Cannot use "
                        +ctx.getChild(1).getText().split("=")[0] +
                        " as variable name because it is a keyword");
            }else if(checkIfVarExistsAndReturn(ctx.getChild(1).getText().split("=")[0]) != null){
                errors.add("[ERROR] LINE " + ctx.getStart().getLine() + " : Variable "
                        +ctx.getChild(1).getText().split("=")[0] +
                        " already exists");
            }

        }
    }

    @Override public void exitLocalTypeDeclaration(SHJavaParser.LocalTypeDeclarationContext ctx) { }


    @Override public void exitSwitchBlockStatementGroup(SHJavaParser.SwitchBlockStatementGroupContext ctx) { }

    @Override public void exitSwitchLabel(SHJavaParser.SwitchLabelContext ctx) { }

    @Override public void exitForControl(SHJavaParser.ForControlContext ctx) { }

    @Override public void exitForInit(SHJavaParser.ForInitContext ctx) { }

    @Override public void exitForDeclaration(SHJavaParser.ForDeclarationContext ctx) { }

    @Override public void exitEnhancedForControl(SHJavaParser.EnhancedForControlContext ctx) { }

    @Override public void enterParExpression(SHJavaParser.ParExpressionContext ctx){

    }

    @Override public void exitParExpression(SHJavaParser.ParExpressionContext ctx) { }

    @Override public void exitExpressionList(SHJavaParser.ExpressionListContext ctx) { }

    @Override public void exitMethodExpressionList(SHJavaParser.MethodExpressionListContext ctx) { }

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

    @Override public void exitPrintStatement(SHJavaParser.PrintStatementContext ctx) {
        System.out.println(ctx.getChild(2).getText());

        if(!ctx.getChild(2).getText().contains("\"") && (checkIfVarExistsAndReturn(ctx.getChild(2).getText()) !=
                null)){
            errors.add(checkIfVarExistsAndReturn(ctx.getChild(2).getText()).getValue());
        }else if(!ctx.getChild(2).getText().contains("\"") && (checkIfVarExistsAndReturn(ctx.getChild(2)
                .getText()) == null) && !(doesFunctionExist(ctx.getChild(2).getChild(0).getChild(0).getText()))){
//            errors.add("String " + ctx.getChild(2).getChild(0).getChild(0).getText());
//            errors.add("ArrayList " + functions.size());
//            errors.add(ctx.getStart().getLine() + ": cannot resolve " + ctx.getChild(2).getText() + " because " +
//                    " symbol does not exist");
        }else if(ctx.getChild(2).getText().contains("+")){
            String[] splitArr = ctx.getChild(2).getText().split("\\+");
            boolean flag = true; //true if all vars exist
            String temp = "";
            for(int i = 0; i < splitArr.length; i++){
                if(splitArr[i].contains("\"")){
                    temp = temp.concat(splitArr[i].split("\"")[1]);
                }
                else if(checkIfVarExistsAndReturn(splitArr[i]) != null){
                    temp = temp.concat(checkIfVarExistsAndReturn(splitArr[i]).getValue());
                }else{
                    errors.add(ctx.getStart().getLine() + ": cannot print " + splitArr[i] + " because " +
                            " variable does not exist");
                    flag = false;
                }
            }
            if(flag){
                errors.add(temp);
            }
        }
    }

    @Override public void exitPrimaryError(SHJavaParser.PrimaryErrorContext ctx) { }

    @Override public void exitInvalidPrintStatmentPlus(SHJavaParser.InvalidPrintStatmentPlusContext ctx) { }

    @Override public void exitInvalidPrintStatmentExpression(SHJavaParser.InvalidPrintStatmentExpressionContext ctx) { }

    @Override public void exitInvalidExpressionForPrinting(SHJavaParser.InvalidExpressionForPrintingContext ctx) { }

    @Override public void exitInvalidPrintStatmentLackingQuotations(SHJavaParser.InvalidPrintStatmentLackingQuotationsContext ctx) { }

    public boolean checkIfVarIsAbstract(String name){
        for(int i = 0; i < variables.size(); i++){
            if(name.equals(variables.get(i).getName()) && variables.get(i).getIsAbstract())
                return true;
        }
        return false;
    }

    public boolean checkIfVarIsConstant(String name){
        for(int i = 0; i < variables.size(); i++){
            if(name.equals(variables.get(i).getName()) && variables.get(i).isConstant()){
                return true;
            }
        }
        return false;
    }

    public Variable checkIfVarExistsAndReturn(String name){
        for(int i = 0; i < variables.size(); i++){
            if(name.equals(variables.get(i).getName())){
                return variables.get(i);
            }
        }
        return null;
    }

    public boolean doesFunctionExist(String name){
        for(int i = 0; i < functions.size(); i++){
            if(name.equals(functions.get(i).getFuncName())){
                return true;
            }
        }
        return false;
    }

    public SHJavaFunction getFunction(String name){
        for(int i = 0; i < functions.size(); i++){
            if(name.equals(functions.get(i).getFuncName())){
                return functions.get(i);
            }
        }
        return null;
    }
}