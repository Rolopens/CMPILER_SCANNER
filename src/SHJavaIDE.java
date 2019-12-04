import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;

public class SHJavaIDE extends JFrame{
    private JPanel mainPanel;
    private JButton parseButton;
    private JButton intermediateCodeButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton runButton;
    private JTextArea textArea3;

    String filepath = "./input.txt";
    InputConverter converter = new InputConverter();

    public SHJavaIDE(){
        super("SHJava IDE");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
//        this.setPreferredSize(new Dimension(800, 600));

        //fixing some jtextarea stuff
        this.textArea2.setEditable(false);
        this.textArea3.setEditable(false);
        this.textArea2.setForeground(Color.WHITE);
        this.textArea3.setForeground(Color.WHITE);
        PrintStream out = new PrintStream( new OutputTextArea( textArea2 ) );
        System.setOut( out );
        System.setErr( out );

        this.textArea1.setRows(20);
        this.textArea1.setColumns(100);
        this.textArea2.setRows(10);
        this.textArea3.setRows(10);
        this.pack();

        this.setButtonActions();
    }

    public void setButtonActions(){
        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea3.setText("");
                saveToFile();
                try {
                    CharStream input = CharStreams.fromFileName(filepath);
                    converter.displayTokenClass(input);

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex){
                    ex.printStackTrace();
                }

                CharStream input = null;
                try {
                    input = CharStreams.fromFileName(filepath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                SHJava lexer = new SHJava(input);
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        System.out.println("TOKEN STREAM: \n" + tokenStream.toString());
                SHJavaParser parser = new SHJavaParser(tokenStream);
                parser.removeErrorListeners();
//        parser.addErrorListener(CustomErrorListener.INSTANCE);
                CustomParserListener listener = new CustomParserListener();
                parser.addParseListener(listener);

//                System.out.println("INTERMEDIATE CODE:");
                ParseTree tree = parser.compilationUnit();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();

                textArea3.setText("ERRORS: \n");
                for(int i = 0; i < listener.getErrors().size();i++){
                    textArea3.append(listener.getErrors().get(i) + " \n");
//                    System.out.println(listener.getErrors().get(i));
                }
                for(int i = 0; i < listener.getList().size(); i++){
                    textArea3.append(listener.getErrors().get(i) + " \n");
//                    System.out.println(listener.getList().get(i));
                }

            }
        });
        intermediateCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea3.setText("");
                saveToFile();

                try {
                    CharStream input = CharStreams.fromFileName(filepath);
                    converter.displayTokenClass(input);

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex){
                    ex.printStackTrace();
                }

                CharStream input = null;
                try {
                    input = CharStreams.fromFileName(filepath);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                SHJava lexer = new SHJava(input);
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                SHJavaParser parser = new SHJavaParser(tokenStream);
                parser.removeErrorListeners();
                CustomParserListener listener = new CustomParserListener();
                parser.addParseListener(listener);


                ParseTree tree = parser.compilationUnit();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
//                viewer.open();
                textArea3.setText("INTERMEDIATE CODE: \n");
                for(int i = 0; i < listener.getCommands().size();i++){
//                    System.out.println(listener.getCommands().get(i));
                    textArea3.append(listener.getCommands().get(i) + "\n");
                }
            }
        });
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void saveToFile(){
        try	{
            String s = textArea1.getText();
            File f = new File(filepath);
            FileWriter fw = new FileWriter(f);
            fw.write(s);
            fw.close();
        }
        catch(IOException ioe) {
            System.out.println("Exception Caught : " +ioe.getMessage());
        }
    }


    public void runCode(){

    }



}
