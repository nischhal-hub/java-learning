import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class UIComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ui components");
        frame.setSize(700, 600);
        frame.setLayout(new GridLayout(4,4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //btn group for radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        
        JLabel nameLabel = new JLabel("Name: ");
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        
        //
        JScrollPane scrollPane = new JScrollPane(nameField);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.add(scrollPane);
        JPasswordField passwordField = new JPasswordField();
        frame.add(passwordField);

        JButton submitBtn = new JButton("Submit");
        frame.add(submitBtn);

        submitBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                submitBtn.setBackground(Color.BLUE);
                frame.setBackground(Color.ORANGE);
                //to show dialogs..
                JOptionPane.showMessageDialog(frame, "Button Clicked!!");
            }
        });

        JCheckBox checkbox = new JCheckBox("Male");
        frame.add(checkbox);
        
        JCheckBox checkBox2 = new JCheckBox("FeMale");
        frame.add(checkBox2);

        JRadioButton maleButton = new JRadioButton("Male");
        genderGroup.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Female");
        genderGroup.add(femaleButton);

        frame.add(maleButton);
        frame.add(femaleButton);

        frame.setVisible(true);
    }
}
