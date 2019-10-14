import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//not used
public class FileConverter {

    public ArrayList<String> convert(String filepath){
        Scanner s = null;
        try {
            s = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> inputStrings = new ArrayList<String>();
        while (s.hasNext()){
            inputStrings.add(s.next());
        }
        s.close();

        return inputStrings;
    }
}
