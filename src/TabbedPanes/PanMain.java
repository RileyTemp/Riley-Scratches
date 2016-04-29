package TabbedPanes;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDisp panDisp = new PanDisp();

    public PanMain() {
        setLayout(new FlowLayout());
        add(panDisp);
    }
}

