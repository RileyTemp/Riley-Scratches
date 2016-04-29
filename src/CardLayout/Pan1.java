package CardLayout;

import java.awt.event.ActionListener;
import javax.swing.*;

public class Pan1 extends JPanel {
    
    JLabel lblname;
    JButton btnNext, btnPrev;
    
    public Pan1(ActionListener ButtonListener) {
        lblname = new JLabel("Panel 1");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        add(lblname);
        add(btnNext);
        add(btnPrev);
        btnNext.addActionListener(ButtonListener);
        btnPrev.addActionListener(ButtonListener);
    }
}

