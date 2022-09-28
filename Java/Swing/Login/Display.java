import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class Display implements ActionListener, KeyListener {
    JFrame frame = new JFrame("User login");
    FieldMouseListener fieldMouseListener = new FieldMouseListener();
    JLabel labelUser = new JLabel("Usuário: ");
    JLabel labelPassword = new JLabel("Senha: ");
    JLabel messageLabel = new JLabel("Login");
    CustomTextInput userInput = new CustomTextInput("User");
    CustomPasswordInput passwordInput = new CustomPasswordInput("Password");
    CustomButton loginButton = new CustomButton("Login");
    CustomButton resetButton = new CustomButton("Reset");
    CustomButton newUserButton = new CustomButton("Criar Usuário");
    JLabel imagePanel = new JLabel();
    HashMap<String, String> copyLoginData;

    Display(HashMap<String, String> loginData) {
        copyLoginData = loginData;

        labelUser.setBounds(50, 180, 50, 20);
        frame.add(labelUser);

        labelPassword.setBounds(50, 220, 50, 20);
        frame.add(labelPassword);

        messageLabel.setBounds(180,340,100,30);
        messageLabel.setForeground(Color.WHITE);
        messageLabel.setFont(new Font("Verdana", Font.BOLD,20));

        frame.add(messageLabel);

        userInput.setBounds(110, 180, 200, 23);
        userInput.setEnabled(false);
        userInput.addMouseListener(fieldMouseListener);
        userInput.setForeground(Color.LIGHT_GRAY);
        frame.add(userInput);

        passwordInput.setBounds(110, 220, 200, 23);
        passwordInput.setEnabled(false);
        passwordInput.addMouseListener(fieldMouseListener);
        passwordInput.setForeground(Color.LIGHT_GRAY);
        frame.add(passwordInput);

        loginButton.setBounds(110, 270, 100, 20);
        loginButton.addActionListener(this);
        loginButton.addKeyListener(this);
        frame.add(loginButton);

        resetButton.setBounds(210, 270, 100, 20);
        resetButton.addActionListener(this);
        frame.add(resetButton);

        newUserButton.setBounds(110, 300, 200, 20);
        newUserButton.addActionListener(this);
        frame.add(newUserButton);

        imagePanel.setBounds(150,30,120,120);
        ImageIcon imageIcon = new ImageIcon("src/userIcon.png");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        imagePanel.setIcon(imageIcon);
        frame.add(imagePanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(167, 199, 231));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        ImageIcon img = new ImageIcon("src/userIcon.png");
        frame.setIconImage(img.getImage());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userInput.setText("");
            passwordInput.setText("");
        }
        if (e.getSource() == loginButton) {
            String user = userInput.getText();
            String password = String.valueOf(passwordInput.getPassword());
            if (copyLoginData.containsKey(user)) {
                if (copyLoginData.get(user).equals(password)) {
                    System.out.print("uhu");
                    frame.dispose();
                    new Program(user);
                }
            }
        }
        if (e.getSource() == newUserButton) {
            new NewUserScreen(copyLoginData);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==13){
            ActionEvent actionEvent = null;
            actionEvent.setSource(loginButton);
            actionPerformed(actionEvent);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    class FieldMouseListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource()==userInput){
                userInput.setEnabled(true);
                userInput.setText("");
                userInput.grabFocus();
                userInput.setForeground(Color.black);
            }
            if(e.getSource()==passwordInput){
                passwordInput.setEnabled(true);
                passwordInput.setText("");
                passwordInput.grabFocus();
                passwordInput.setForeground(Color.black);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }
    }
}
