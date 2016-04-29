
package CardLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Pan2 extends JPanel {
    
    JLabel lblname;
    JButton btnNext, btnPrev;
    
    public Pan2(ActionListener ButtonListner) {
        lblname = new JLabel("Panel 2");
        btnNext = new JButton("Next");
        btnPrev = new JButton("Previous");
        add(lblname);
        add(btnNext);
        add(btnPrev);
        btnNext.addActionListener(ButtonListner);
        btnPrev.addActionListener(ButtonListner);
    }
}