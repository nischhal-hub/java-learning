import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldExample extends JFrame implements ActionListener{
    JTextField textField = new JTextField(20);
    JButton button = new JButton("Submit");
    TextFieldExample() {
        setTitle("TextField Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        
        add(panel);
        button.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        textField.setText("Button Clicked");
    }
    public static void main(String[] args) {
        new TextFieldExample();
    }
}
