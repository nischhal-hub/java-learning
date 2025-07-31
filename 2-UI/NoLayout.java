import javax.swing.*;
public class NoLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);

        JButton btn1 = new JButton("Click");
        btn1.setBounds(10, 10, 100, 30);
        frame.add(btn1);

        JButton btn2 = new JButton("Yee haa");
        btn2.setBounds(10, 50, 100, 30);
        frame.add(btn2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
