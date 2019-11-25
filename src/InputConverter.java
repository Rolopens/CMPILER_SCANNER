import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class InputConverter {

    ArrayList<String> unrecognizedTokens = new ArrayList<>();
    private SHJava lexer;

    //Legacy Code
//    public ArrayList<CharStream> convertInputs(List<String> inputs){
//        ArrayList<CharStream> charStreams = new ArrayList<>();
//        for (int i = 0; i<inputs.size(); i++){
//            charStreams.add(CharStreams.fromString(inputs.get(i)));
//        }
//        return charStreams;
//    }
//
//    public void displayTokenClass(List<CharStream> inputs){
//            unrecognizedTokens = new ArrayList<>();
//
//            for (int i = 0; i < inputs.size(); i++) {
//                try {
//                    SHJava lexer = new SHJava(inputs.get(i));
//                    lexer.removeErrorListeners();
//                    lexer.addErrorListener(CustomErrorListener.INSTANCE);
//                    Token token = lexer.nextToken();
//
//                    while (token.getType() != SHJava.EOF) {
//                        System.out.println(getTokenType(token) + ": " + token.getText());
//                        token = lexer.nextToken();
//                    }
//                }catch(ParseCancellationException e){
//                    System.out.println("[NO CLASS] COULD NOT RECOGNIZE: "+ inputs.get(i));
//                }
//            }
//    }

    public void displayTokenClass(CharStream input){
            lexer = new SHJava(input);
            Token token = lexer.nextToken();

//            System.out.println("RECOGNIZED TOKENS");
            while (token.getType() != SHJava.EOF) {
                if(token.getType() != SHJava.WS && token.getType() != SHJava.INVALIDCHAR_LITERAL && token.getType() != SHJava.UnknownToken && token.getType() != SHJava.INVALIDIDENTIFIER){
//                    System.out.println(getTokenType(token) + ": " + token.getText());
                }
                if(token.getType() == SHJava.INVALIDCHAR_LITERAL || token.getType() == SHJava.UnknownToken || token.getType() == SHJava.INVALIDIDENTIFIER){
                    unrecognizedTokens.add(token.getText());
                }
                token = lexer.nextToken();
            }

//            System.out.println("\nUNRECOGNIZED TOKENS");
//            printAllUnrecognizedTokens();

    }

    private String getTokenType(Token token) {
        switch (token.getType()) {
//            case SHJava.KEYWORD:
            case SHJava.ABSTRACT:
            case SHJava.ASSERT:
            case SHJava.BOOLEAN:
            case SHJava.BREAK:
            case SHJava.CASE:
            case SHJava.CHAR:
            case SHJava.CLASS:
            case SHJava.CONST:
            case SHJava.DEFAULT:
            case SHJava.DO:
            case SHJava.ELSE:
            case SHJava.ENUM:
            case SHJava.EXTENDS:
            case SHJava.FINAL:
            case SHJava.FLOAT:
            case SHJava.FOR:
            case SHJava.IF:
            case SHJava.IMPLEMENTS:
            case SHJava.INSTANCEOF:
            case SHJava.INT:
            case SHJava.INTERFACE:
            case SHJava.NEW:
            case SHJava.NULL:
            case SHJava.PRIVATE:
            case SHJava.PRINT:
            case SHJava.PROTECTED:
            case SHJava.PUBLIC:
            case SHJava.RETURN:
            case SHJava.SCAN:
            case SHJava.STATIC:
            case SHJava.STRING:
            case SHJava.SUPER:
            case SHJava.SWITCH:
            case SHJava.THIS:
            case SHJava.VOID:
            case SHJava.WHILE:
                return "KEYWORD";
//            case SHJava.SEPARATOR:
            case SHJava.LPAREN:
            case SHJava.RPAREN:
            case SHJava.LBRACE:
            case SHJava.RBRACE:
            case SHJava.LBRACK:
            case SHJava.RBRACK:
            case SHJava.SEMI:
            case SHJava.COMMA:
            case SHJava.DOT:
                return "SEPARATOR";
//            case SHJava.OPERATORS:
            case SHJava.ASSIGN:
            case SHJava.GT:
            case SHJava.LT:
            case SHJava.BANG:
            case SHJava.TILDE:
            case SHJava.QUESTION:
            case SHJava.COLON:
            case SHJava.EQUAL:
            case SHJava.LE:
            case SHJava.GE:
            case SHJava.NOTEQUAL:
            case SHJava.AND:
            case SHJava.OR:
            case SHJava.INC:
            case SHJava.DEC:
            case SHJava.ADD:
            case SHJava.SUB:
            case SHJava.MUL:
            case SHJava.DIV:
            case SHJava.MOD:
            case SHJava.ADD_ASSIGN:
            case SHJava.SUB_ASSIGN:
            case SHJava.MUL_ASSIGN:
            case SHJava.DIV_ASSIGN:
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
            case SHJava.LINE_COMMENT:
                return "LINE COMMENT";
            case SHJava.UnknownToken:
            case SHJava.INVALIDCHAR_LITERAL:
            case SHJava.INVALIDIDENTIFIER:
                unrecognizedTokens.add(token.getText());
                return "NO TOKEN CLASS";
            default:
                return "ERROR";
        }
    }

    public void printAllUnrecognizedTokens(){
        for (int i = 0; i < unrecognizedTokens.size(); i++){
            System.out.println("Token " + i + ": " + unrecognizedTokens.get(i));
        }
    }

    public SHJava getLexer(){
        return lexer;
    }

}


//Legacy Code
//class CustomErrorListener extends BaseErrorListener {
//
//    public static final CustomErrorListener INSTANCE = new CustomErrorListener();
//
//    @Override
//    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
//            throws ParseCancellationException {
//        throw new ParseCancellationException("NO CLASS: " + msg);
//    }
//}
