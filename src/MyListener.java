import org.antlr.v4.runtime.ParserRuleContext;

public class MyListener extends SHJavaParserBaseListener {
    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        System.out.println("rule entered: " + ctx.getText());      //code that executes per rule

    }
}