package Moving;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanPlayer panPlayer = new PanPlayer();
    PanSpeed panSpeed = new PanSpeed(panPlayer);
    PanBackground panBackground = new PanBackground(panSpeed, panPlayer);

    public PanMain() {
        setLayout(new BorderLayout());
        add(panSpeed, BorderLayout.SOUTH);
        add(panBackground, BorderLayout.CENTER);
    }
}
