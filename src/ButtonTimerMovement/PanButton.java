package ButtonTimerMovement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanButton extends JPanel {

    JButton btnStart, btnStop;

    PanTimer panTimer;
    ActionListener mover = new Mover();

    public PanButton(PanTimer _panTimer) {
        setLayout(new GridLayout(2, 1));

        panTimer = _panTimer;
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");
        add(btnStart);
        add(btnStop);
        btnStart.addActionListener(mover);
        btnStop.addActionListener(mover);
    }

    class Mover implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String q = e.getActionCommand();
            if (q.equals("Start")) {
                panTimer.start(q);
            } else if (q.equals("Stop")) {
                panTimer.stop(q);
            }
        }
    }
}
