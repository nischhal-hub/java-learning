import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        GridBagConstraints gbg = new GridBagConstraints();

        JButton btn1 = new JButton("Button1");
        gbg.gridx = 0; //index of column
        gbg.gridy = 0; //index of row
        frame.add(btn1, gbg);

         JButton btn2 = new JButton("Button2");
        gbg.gridx = 1; 
        gbg.gridy = 0;
        frame.add(btn2, gbg);

         JButton btn3 = new JButton("Button3");
        gbg.gridx = 0;
        gbg.gridy = 1;
        gbg.gridwidth = 4;
        gbg.weightx=1;
        gbg.fill = GridBagConstraints.HORIZONTAL;
        frame.add(btn3, gbg); 
        
        JButton btn4 = new JButton("Button4");
        gbg.gridx = 6;
        gbg.gridy = 1;
        gbg.gridheight=4;
        gbg.fill= GridBagConstraints.VERTICAL;
        frame.add(btn4, gbg); 
        
        // JButton btn1 = new JButton();
        // gbg.gridx = 0;
        // gbg.gridy = 0;
        // frame.add(btn1, gbg);
        
    }
}
