import java.awt.*;
import java.awt.event.*;

public class AllAdaptersExample extends Frame {

    Button btn;
    Checkbox checkbox;

    AllAdaptersExample() {
        btn = new Button("Click Me");
        btn.setBounds(50, 50, 80, 30);
        add(btn);

        checkbox = new Checkbox("Check Me");
        checkbox.setBounds(50, 100, 100, 30);
        add(checkbox);

        // ActionListener
        btn.addActionListener(e -> System.out.println("Button Clicked!"));

        // ItemListener (no adapter, only one method)
        checkbox.addItemListener(e ->
                System.out.println("Checkbox state changed: " + (checkbox.getState() ? "Checked" : "Unchecked"))
        );

        // MouseAdapter
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }
        });

        // KeyAdapter
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }
        });

        // WindowAdapter
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                dispose();
            }
        });

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AllAdaptersExample();
    }
}
