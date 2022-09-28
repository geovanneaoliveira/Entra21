import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class NewUserScreen implements ActionListener {
    JFrame frame = new JFrame("Criar novo Usuário");
    JLabel labelNewUser = new JLabel("Usuário:");
    JLabel labelNewPassword = new JLabel("Senha:");
    CustomTextInput userNewInput = new CustomTextInput("");
    CustomPasswordInput passwordNewInput = new CustomPasswordInput("");
    CustomButton createButton = new CustomButton("Criar");
    CustomButton resetButton = new CustomButton("Reset");
    CustomButton backButton = new CustomButton("Voltar");
    HashMap<String, String> copyLogin = new HashMap<>();

    NewUserScreen(HashMap<String, String> copyLoginData) {
        copyLogin = copyLoginData;

        labelNewUser.setBounds(50, 180, 50, 20);
        frame.add(labelNewUser);

        labelNewPassword.setBounds(50, 220, 50, 20);
        frame.add(labelNewPassword);

        userNewInput.setBounds(110, 180, 200, 23);
        frame.add(userNewInput);

        passwordNewInput.setBounds(110, 220, 200, 23);
        frame.add(passwordNewInput);

        createButton.setBounds(110, 270, 100, 20);
        createButton.addActionListener(this);
        frame.add(createButton);

        resetButton.setBounds(210, 270, 100, 20);
        resetButton.addActionListener(this);
        frame.add(resetButton);

        backButton.setBounds(110, 300, 200, 20);
        backButton.addActionListener(this);
        frame.add(backButton);

        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(167, 199, 231));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userNewInput.setText("");
            passwordNewInput.setText("");
        }
        if (e.getSource() == createButton) {
            copyLogin.put(userNewInput.getText(), String.valueOf(passwordNewInput.getPassword()));
            frame.dispose();
        }
        if (e.getSource() == backButton) {
            frame.dispose();
        }
    }
}
