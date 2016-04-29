package Background;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PanRoad extends JPanel {

    JButton btnSpace;

    public PanRoad(ActionListener CardChanger) {
        btnSpace = new JButton("Space");
        btnSpace.addActionListener(CardChanger);
        //java-demos.blogspot.ca/2012/09/setting-background-image-in-jframe.html
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("road.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        background.add(btnSpace);
    }
}
/*setLayout(new BorderLayout());
 JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
 add(background);
 background.setLayout(new FlowLayout());*/
