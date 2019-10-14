
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

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
