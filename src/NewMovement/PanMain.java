package NewMovement;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDemo panDemo = new PanDemo();

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDemo, BorderLayout.CENTER);
    }
}
