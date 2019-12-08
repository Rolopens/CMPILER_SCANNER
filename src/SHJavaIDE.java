
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SHJavaIDE extends JFrame{
    private JPanel mainPanel;
    private JButton parseButton;
    private JButton intermediateCodeButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JButton runButton;
    private JTextArea textArea3;
    private JTextField textField1;
    private JButton executeButton;
    private Thread thread;
    private JTextArea textareatemp;

    private ArrayList<String> errorsCP = new ArrayList<>();
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
        textareatemp = new JTextArea();
        PrintStream temp = new PrintStream( new OutputTextArea( textareatemp ) );
        textareatemp.setText("");
        System.setOut( out );
        System.setErr( out );


        TextFieldStreamer ts = new TextFieldStreamer(textField1);
        textField1.addActionListener(ts);

        System.setIn(ts);

        this.textArea1.setRows(20);
        this.textArea1.setColumns(100);
        this.textArea2.setRows(10);
        this.textArea3.setRows(10);
        this.pack();

        this.setButtonActions();
        this.executeButton.setEnabled(false);

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
                CustomErrorListener listener = new CustomErrorListener();
                parser.addParseListener(listener);

//                System.out.println("INTERMEDIATE CODE:");
                ParseTree tree = parser.compilationUnit();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                viewer.open();

                textArea3.setText("ERRORS: \n-------------------------------- \n");
                for(int i = 0; i < listener.getErrors().size();i++){
                    textArea3.append(listener.getErrors().get(i) + " \n");
//                    System.out.println(listener.getErrors().get(i));
                }
                for(int i = 0; i < listener.getList().size(); i++){
                    textArea3.append(listener.getList().get(i) + " \n");
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
                textArea3.setText("INTERMEDIATE CODE: \n-------------------------------- \n");
                for(int i = 0; i < listener.getCommands().size();i++){
//                    System.out.println(listener.getCommands().get(i));
                    textArea3.append(listener.getCommands().get(i) + "\n");
                }
            }
        });
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interpretCode();
                interpretCode();
                executeButton.setEnabled(true);
            }
        });
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCode();
                executeButton.setEnabled(false);
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


    public void interpretCode() {
//        thread.stop();
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


        errorsCP.clear();
        textArea2.setText("Interpreting....");

//        textArea2.setText("PROGRAM OUTPUT: \n-------------------------------- \n");

        Process pro;
        String s = textArea1.getText();
        boolean pass = true;

        s = s.replaceAll("abs", "abstract");
        s = s.replaceAll("ass", "assert");
        s = s.replaceAll("boo", "boolean");
        s = s.replaceAll("brk", "break");
        s = s.replaceAll("cas", "case");
        s = s.replaceAll("cha", "char");
        s = s.replaceAll("cla", "class");
        s = s.replaceAll("con", "continue");
        s = s.replaceAll("def", "default");
        s = s.replaceAll("ddo", "do");
        s = s.replaceAll("els", "else");
        s = s.replaceAll("enu", "enum");
        s = s.replaceAll("ext", "extends");
        s = s.replaceAll("fin", "final");
        s = s.replaceAll("flo", "float");
        s = s.replaceAll("dur", "for");
        s = s.replaceAll("iif", "if");
        s = s.replaceAll("imp", "implements");
        s = s.replaceAll("iof", "instanceof");
        s = s.replaceAll("dec", "int");
        s = s.replaceAll("ifa", "ifa");
        s = s.replaceAll("cre", "new");
        s = s.replaceAll("nul", "null");
        s = s.replaceAll("out", "System.out.println");
        s = s.replaceAll("pro", "protected");
        s = s.replaceAll("pub", "public");
        s = s.replaceAll("ret", "return");
//        s = s.replaceAll("inp", "return");
        s = s.replaceAll("sta", "static");
        s = s.replaceAll("str", "String");
        s = s.replaceAll("sup", "super");
        s = s.replaceAll("swi", "switch");
        s = s.replaceAll("thi", "this");
        s = s.replaceAll("voi", "void");
        s = s.replaceAll("whi", "while");
        s = s.replaceAll("inp\\(boolean\\)", "sc.nextBoolean()");
        s = s.replaceAll("inp\\(char\\)", "sc.next().charAt(0)");
        s = s.replaceAll("inp\\(int\\)", "sc.nextInt()");
        s = s.replaceAll("inp\\(float\\)", "sc.nextFloat()");
        s = s.replaceAll("inp\\(String\\)", "sc.nextLine()");
        s = s.replaceAll("main\\(\\) \\{", "main(String[] args){\nScanner sc = new Scanner(System.in);\n");
//        s = "import java.util.Scanner; \n\n" + s;
//        System.out.println(listener.getFileName());
        if(!(listener.getFileName() == null)){
            if(!(listener.getFileName().equals("DemoFile2"))){
                s = s.replaceAll("public class", "class");
                s = "import java.util.Scanner; \n\n public class DemoFile2 { \n public static void main(String[] args) { \n" +
                        listener.getFileName()+".main(new String[0]);\n }\n}" + s;
            } else {
                s = "import java.util.Scanner; \n\n" + s;
            }
        } else {
            pass = false;
            System.out.println("[ERROR] Lacking public class with main function");
        }

        if(pass) {
            try {
                File f = new File("./src/DemoFile2.java");
                FileWriter fw = new FileWriter(f, false);
                fw.write(s);
                fw.close();

                try {
                    Process p = Runtime.getRuntime().exec("javac ./src/DemoFile2.java");
//                Process p2 = Runtime.getRuntime().exec("java  -cp ./SHJava DemoFile2");

                    BufferedReader stdError = new BufferedReader(new
                            InputStreamReader(p.getErrorStream()));
                    String line = null;
                    while ((line = stdError.readLine()) != null) {
                        errorsCP.add(line + "\n");
                    }
                    for (int i = 0; i < errorsCP.size(); i++) {
                        System.out.println(errorsCP.get(i));
                    }

                } catch (Exception ex) {
                    System.out.println("Exception Caught : " + ex.getMessage());
                }
            } catch (IOException ioe) {
                System.out.println("Exception Caught : " + ioe.getMessage());
            }
        }
    }


    public void executeCode(){
        textArea2.setText("PROGRAM OUTPUT: \n-------------------------------- \n");
        thread = new Thread(){
            public void run(){
                try {
                    DemoFile2.main(new String[0]);
                    System.out.println("\nProgram finished running");
                } catch (Exception e){
                    String str = "\n[RUNTIME ERROR] ";
                    if(e.toString().contains("InputMismatchException"))
                        str = str + "Wrong Input: Program finished prematurely";
                    else if (e.toString().contains("/ by zero"))
                        str = str + "Arithmetic Error: Cannot Divide by Zero";
                    else if (e.toString().contains("ArrayIndexOutOfBounds"))
                        str = str + "Indexing Error: Array Index Out of Bounds";
                    else if (e.toString().contains("NullPointer"))
                        str = str + "Referencing Error: Accessing a Null Values";
//                    System.out.println("\nRUNTIME ERROR: PROGRAM PREMATURELY FINISHED");
                    System.out.println(str);
//                    System.out.println(e);
                }
            }
        };

        thread.start();
    }
}

