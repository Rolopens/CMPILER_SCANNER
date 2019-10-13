
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;

public class Driver {

    public static void main(String[] args){
        //declare variables
        String filepath = "./input.txt";
        ArrayList<String> inputs;
        ArrayList<CharStream> charStreams;

        //get our input from input.txt
        FileConverter fileConverter = new FileConverter();
        inputs = fileConverter.convert(filepath);

        //print our token classes
        InputConverter converter = new InputConverter();
        charStreams = converter.convertInputs(inputs);
        converter.displayTokenClass(charStreams);
    }
}
