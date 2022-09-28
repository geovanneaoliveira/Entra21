import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton{
    CustomButton(String label){
        this.setText(label);
        this.setFocusable(false);
        this.setBackground(Color.WHITE);
        this.setRolloverEnabled(false);
    }
}
