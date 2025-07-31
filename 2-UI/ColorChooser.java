import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLayout(new GridLayout(2,3,10,10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("Picd color");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Color color = JColorChooser.showDialog(frame, "Select color", null);
                if(color != null){
                    btn1.setBackground(color);
                }
            }
        });
        frame.add(btn1);
        
        frame.setVisible(true);
    }
}
