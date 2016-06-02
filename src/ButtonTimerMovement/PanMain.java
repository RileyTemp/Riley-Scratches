package ButtonTimerMovement;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDemo panDemo = new PanDemo();
    PanTimer panTimer = new PanTimer(panDemo);
    PanButton panButton = new PanButton( panTimer);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDemo, BorderLayout.CENTER);
        add(panButton, BorderLayout.EAST);
    }
}
