import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CustomPasswordInput extends JPasswordField {
    CustomPasswordInput(String label){
        this.setText(label);
        this.setBorder(new EmptyBorder(1,1,1,1));
    }
}
