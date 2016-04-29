package CardLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Pan3 extends JPanel {

    JLabel lblname;
    JButton btnNext, btnPrev;

    public Pan3(ActionListener ButtonListener) {
        lblname = new JLabel("Panel 3");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        add(lblname);
        add(btnNext);
        add(btnPrev);
        btnNext.addActionListener(ButtonListener);
        btnPrev.addActionListener(ButtonListener);
    }
}
