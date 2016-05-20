package KeyListenerMovement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanSpeed extends JPanel {

    PanDemo panDemo;

    public PanSpeed(PanDemo _panDemo) {
        panDemo = _panDemo;
        setLayout(new GridLayout(1, 3));
        ActionListener speedChanger = new SpeedChanger();
        JLabel lblname = new JLabel("Speed Change");
        JButton btnSpeedUp = new JButton("Speed up");
        JButton btnSlowDown = new JButton("Slow down");
        JLabel filler = new JLabel("");
        add(lblname);
        add(btnSpeedUp);
        add(btnSlowDown);
        add(filler);
        btnSpeedUp.addActionListener(speedChanger);
        btnSlowDown.addActionListener(speedChanger);

    }

    class SpeedChanger implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            panDemo.SpeedChange(s);
            panDemo.requestFocus();
        }
    }
}
