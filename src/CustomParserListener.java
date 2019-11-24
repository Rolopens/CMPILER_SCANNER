public class CustomParserListener extends SHJavaParserBaseListener {

    public static final CustomParserListener INSTANCE = new CustomParserListener();

    @Override public void enterExpression(SHJavaParser.ExpressionContext ctx) {


        System.out.println(ctx.getText());
    }

    @Override public void exitExpression(SHJavaParser.ExpressionContext ctx) { }
}
