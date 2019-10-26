
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

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
        ParseTree tree = parser.compilationUnit();

        System.out.println("\n" + tree.toStringTree(parser));
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

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
