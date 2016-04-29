package DropDown;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    PanDisp panDisp = new PanDisp();

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
}
