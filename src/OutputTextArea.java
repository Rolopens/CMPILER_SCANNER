import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

public class OutputTextArea extends OutputStream {
    private JTextArea textControl;

    public OutputTextArea( JTextArea control ) {
        textControl = control;
    }

    public void write( int b ) throws IOException {
        // append the data as characters to the JTextArea control
        textControl.append( String.valueOf( ( char )b ) );
    }
}
