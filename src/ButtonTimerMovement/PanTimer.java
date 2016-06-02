package ButtonTimerMovement;

import TimerMovement.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanTimer {

    String sDirection, sSame;
    Timer timer;
    int nCount;
    PanDemo panDemo;

    public PanTimer(PanDemo _panDemo) {
        panDemo = _panDemo;
    }

    public void start(String _s) {

        timer = new Timer(80, updateTask);
        nCount = 0;
        timer.start();

    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount++;
            if (nCount >= 0) {
                panDemo.moveSprite();
            }
        }
    };

    public void stop(String _s) {
        timer.stop();
    }
}
