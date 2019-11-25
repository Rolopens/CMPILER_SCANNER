
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;

public class Driver {

    public static void main(String[] args){
        //declare variables
        String filepath = "./input.txt";
        InputConverter converter = new InputConverter();
        try {
            CharStream input = CharStreams.fromFileName(filepath);
            converter.displayTokenClass(input);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        CharStream input = null;
        try {
            input = CharStreams.fromFileName(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SHJava lexer = new SHJava(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        System.out.println("TOKEN STREAM: \n" + tokenStream.toString());
        SHJavaParser parser = new SHJavaParser(tokenStream);
        parser.removeErrorListeners();
//        parser.addErrorListener(CustomErrorListener.INSTANCE);
        CustomParserListener listener = new CustomParserListener();
        parser.addParseListener(listener);

        System.out.println("INTERMEDIATE CODE:");
        ParseTree tree = parser.compilationUnit();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.open();

        System.out.println("\nSYNTAX ERRORS:");
        for(int i = 0; i < listener.getList().size(); i++){
            System.out.println(listener.getList().get(i));
        }

//        MyListener listener = new MyListener();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(listener,tree);

//        System.out.println("\n" + tree.toStringTree(parser));


//LEGACY CODE
//        ArrayList<String> inputs;
//        ArrayList<CharStream> charStreams;
//
//        //get our input from input.txt
//        FileConverter fileConverter = new FileConverter();
//        inputs = fileConverter.convert(filepath);
//
//        //print our token classes
//        converter.displayTokenClass(charStreams);

//        charStreams = converter.convertInputs(inputs);
    }
}
