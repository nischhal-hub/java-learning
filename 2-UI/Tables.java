import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class Tables {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columns = {"SN", "Name", "CourseId"};
        Object[][] data = {{1, "Hello","CSC-212"},{2,"LOL","CSC-312"},{3, "Tockke","CSC-212"}};
        JTable table = new JTable(data, columns);
        table.setFont(new Font("Serif",Font.BOLD,16));
        table.setForeground(Color.WHITE);
        table.setBackground(Color.black);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        JScrollPane scrollPane = new JScrollPane(table);
        
        frame.add(scrollPane);


        frame.setVisible(true);
    }
}
