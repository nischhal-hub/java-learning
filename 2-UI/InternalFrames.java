import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.event.ActionListener;

    
public class InternalFrames {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        // frame.setLayout(new GridLayout(2,3,10,10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane dpane = new JDesktopPane();

        JInternalFrame iframe = new JInternalFrame(
            "Internal Frame",
            true,
            true,
            true,
            true
        );
        iframe.setSize(400,400);
        iframe.setVisible(true);

        dpane.add(iframe);

        frame.add(dpane);

        frame.setVisible(true);



}
}