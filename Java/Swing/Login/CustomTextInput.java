import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CustomTextInput extends JTextField {
    CustomTextInput(String label){
        this.setText(label);
        this.setBorder(new EmptyBorder(1,1,1,1));
    }
}
