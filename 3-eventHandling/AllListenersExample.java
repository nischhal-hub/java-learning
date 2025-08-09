import java.awt.*;
import java.awt.event.*;

public class AllListenersExample extends Frame
        implements ActionListener, MouseListener, KeyListener, ItemListener, WindowListener {

    Button btn;
    Checkbox checkbox;

    AllListenersExample() {
        btn = new Button("Click Me");
        btn.setBounds(50, 50, 80, 30);
        add(btn);

        checkbox = new Checkbox("Check Me");
        checkbox.setBounds(50, 100, 100, 30);
        add(checkbox);

        btn.addActionListener(this);
        checkbox.addItemListener(this);
        addMouseListener(this);
        addKeyListener(this);
        addWindowListener(this);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    // ActionListener
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    // MouseListener
    public void mouseClicked(MouseEvent e) { System.out.println("Mouse Clicked"); }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // KeyListener
    public void keyTyped(KeyEvent e) { System.out.println("Key Typed: " + e.getKeyChar()); }
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    // ItemListener
    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox state changed: " + (checkbox.getState() ? "Checked" : "Unchecked"));
    }

    // WindowListener
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new AllListenersExample();
    }
}
