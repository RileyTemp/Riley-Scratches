package Moving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSpeed extends JPanel {

    PanDemo panDemo;

    public PanSpeed(PanDemo _panDemo) {
        panDemo = _panDemo;
        setLayout(new GridLayout(2, 3));
        ActionListener speedChanger = new SpeedChanger();
        ActionListener mover = new Mover();
        JLabel lblname = new JLabel("Speed Change");
        JButton btnSpeedUp = new JButton("Speed up");
        JButton btnSlowDown = new JButton("Slow down");
        JLabel filler = new JLabel("");
        JButton btnUp = new JButton("Up");
        JButton btnDown = new JButton("Down");
        JButton btnLeft = new JButton("Left");
        JButton btnRight = new JButton("Right");
        add(lblname);
        add(btnSpeedUp);
        add(btnSlowDown);
        add(filler);
        add(btnUp);
        add(btnDown);
        add(btnLeft);
        add(btnRight);
        btnSpeedUp.addActionListener(speedChanger);
        btnSlowDown.addActionListener(speedChanger);
        btnUp.addActionListener(mover);
        btnDown.addActionListener(mover);
        btnLeft.addActionListener(mover);
        btnRight.addActionListener(mover);
    }

    class SpeedChanger implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            panDemo.SpeedChange(s);
        }
    }

    class Mover implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            panDemo.Move(s);
        }
    }
}
