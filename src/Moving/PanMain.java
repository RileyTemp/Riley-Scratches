package Moving;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDemo panDemo = new PanDemo();
    PanSpeed panSpeed = new PanSpeed(panDemo);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panSpeed, BorderLayout.SOUTH);
        add(panDemo, BorderLayout.CENTER);
    }
}
