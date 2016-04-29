package Background;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanSpace extends JPanel {

    JButton btnRoad;

    public PanSpace(ActionListener CardChanger) {
        btnRoad = new JButton(" Road");
        btnRoad.addActionListener(CardChanger);       
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("space.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        background.add(btnRoad);
    }
}
/*/*setLayout(new BorderLayout());
 JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
 add(background);
 background.setLayout(new FlowLayout());*/