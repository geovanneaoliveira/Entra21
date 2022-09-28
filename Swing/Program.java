import javax.swing.*;
import java.awt.*;

public class Program {
    JFrame frame = new JFrame("Programa");
    JLabel label = new JLabel();

    Program(String user) {
        label.setBounds(0, 0, 300, 30);
        label.setText("Bem-vindo, " + user + "!");
        frame.add(label);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(167, 199, 231));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
