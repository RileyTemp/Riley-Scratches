package TimerMovement;

import javax.swing.*;

public class FraMain extends JFrame {

    public FraMain() {
        setTitle("Timer Movement");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new PanMain());
        setVisible(true);
    }
}
