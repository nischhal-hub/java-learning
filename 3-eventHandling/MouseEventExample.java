import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JFrame;

public class MouseEventExample extends JFrame {
    MouseEventExample(){
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked");
                Graphics g = getGraphics();
                g.setColor(Color.RED); 
                g.fillOval(100, 100, 50, 50);
                g.dispose(); 
            }
        });
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
    public static void main(String[] args) {
        new MouseEventExample();
    }
}
