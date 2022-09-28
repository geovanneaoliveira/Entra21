import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Exemplo de botão");
        JButton b = new JButton("Botão",new ImageIcon("C:\\Users\\geovanneo\\Documents\\imgs\\euqueroibagens.jpg"));
        ImageIcon imageIcon;


        b.setName("Botão daora");
        b.setBounds(10,10,300,300);
        f.add(b);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
