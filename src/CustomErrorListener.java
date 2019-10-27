import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class CustomErrorListener extends BaseErrorListener {

    public static final CustomErrorListener INSTANCE = new CustomErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
        if (msg.contains("missing")){
            msg = msg;
        }
        else if (msg.contains("no viable alternative")){
            String newMsg[] = msg.split("'");
            msg = "Invalid Syntax '" + newMsg[1] + "'";
        }
        else if (msg.contains("mismatched input")){
            String newMsg[] = msg.split("'");
            msg = "Invalid Syntax '" + newMsg[1] + "' expecting another token or expression";
        }
        else if (msg.contains("extraneous input")){
            String newMsg[] = msg.split("expecting");
            msg = newMsg[0];
        }

        System.out.println("line "+line+":"+charPositionInLine+" "+msg);
    }
}
