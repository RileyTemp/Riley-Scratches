package TimerMovement;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanTimer panTimer = new PanTimer();
    PanDemo panDemo = new PanDemo(panTimer);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDemo, BorderLayout.CENTER);
    }
}
