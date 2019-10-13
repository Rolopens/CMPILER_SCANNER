import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {

    ArrayList<Token> unrecognizedTokens = null;

    public ArrayList<CharStream> convertInputs(List<String> inputs){
        ArrayList<CharStream> charStreams = new ArrayList<>();
        for (int i = 0; i<inputs.size(); i++){
            charStreams.add(CharStreams.fromString(inputs.get(i)));
        }
        return charStreams;
    }

    public void displayTokenClass(List<CharStream> inputs){
            unrecognizedTokens = new ArrayList<>();

            for (int i = 0; i < inputs.size(); i++) {
                try {
                    SHJava lexer = new SHJava(inputs.get(i));
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(CustomErrorListener.INSTANCE);
                    Token token = lexer.nextToken();

                    while (token.getType() != SHJava.EOF) {
                        System.out.println(getTokenType(token) + ": " + token.getText());
                        token = lexer.nextToken();
                    }
                }catch(ParseCancellationException e){
                    System.out.println("[NO CLASS] COULD NOT RECOGNIZE: "+ inputs.get(i));
                }
            }
    }

    private String getTokenType(Token token) {
        switch (token.getType()) {
            case SHJava.KEYWORD:
                return "KEYWORD";
            case SHJava.SEPARATOR:
                return "SEPARATOR";
            case SHJava.OPERATORS:
                return "OPERATORS";
            case SHJava.IDENTIFIER:
                return "IDENTIFIER";
            case SHJava.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case SHJava.FLOAT_LITERAL:
                return "FLOAT_LITERAL";
            case SHJava.BOOL_LITERAL:
                return "BOOL_LITERAL";
            case SHJava.CHAR_LITERAL:
                return "CHAR_LITERAL";
            case SHJava.STRING_LITERAL:
                return "STRING_LITERAL";
            case SHJava.NULL_LITERAL:
                return "NULL_LITERAL";
            case SHJava.COMMENT:
                return "COMMENT";
            default:
                unrecognizedTokens.add(token);
                return "Could not recognize: ";
        }
    }
}

class CustomErrorListener extends BaseErrorListener {

    public static final CustomErrorListener INSTANCE = new CustomErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        throw new ParseCancellationException();
    }
}
