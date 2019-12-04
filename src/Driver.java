
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
        SHJavaIDE frame = new SHJavaIDE();
        frame.setVisible(true);
//        frame.runCode();



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
