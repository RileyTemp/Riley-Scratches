package KeyListenerMovement;

import javax.swing.*;
import java.awt.*;

public class FraMain extends JFrame {

    public FraMain() {
        add(new PanMain());
        setTitle("Welp");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700); //1370, 730 for fullscreen for laptop        
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
