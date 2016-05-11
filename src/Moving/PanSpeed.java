package Moving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanSpeed extends JPanel {

    JButton btnSpeed;
    int Speed = 15;
    PanPlayer panPlayer;

    public PanSpeed(PanPlayer _panPlayer) {
        panPlayer = _panPlayer;
        ActionListener speedChanger = new SpeedChanger();
        JLabel lblname = new JLabel("Speed Change");
        JButton btnUp = new JButton("Speed up");
        JButton btnDown = new JButton("Slow down");
        add(lblname);
        add(btnUp);
        add(btnDown);
        btnUp.addActionListener(speedChanger);
        btnDown.addActionListener(speedChanger);
    }

    class SpeedChanger implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();
            panPlayer.Speed(s);
        }
    }
}
