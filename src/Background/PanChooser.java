package Background;

import javax.swing.*;
import java.awt.event.*;

public class PanChooser extends JPanel {

    ActionListener cardChanger;
    JButton btnRoad, btnSpace;

    public PanChooser(ActionListener CardChanger) {
        btnRoad = new JButton("Road");
        btnSpace = new JButton("Space");
        btnRoad.addActionListener(CardChanger);
        btnSpace.addActionListener(CardChanger);
        add(btnRoad);
        add(btnSpace);
    }
}
