import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton btn1 = new JButton("North");
        frame.add(btn1, BorderLayout.NORTH );

        JButton btn2 = new JButton("South");
        frame.add(btn2, BorderLayout.SOUTH );
        JButton btn3 = new JButton("East");
        frame.add(btn3, BorderLayout.EAST );
        JButton btn4 = new JButton("West");
        frame.add(btn4, BorderLayout.WEST );
        JButton btn5 = new JButton("Center");
        frame.add(btn5, BorderLayout.CENTER );

        frame.setVisible(true);
    }
}
