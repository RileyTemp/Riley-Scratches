package TimerMovement;

import KeyListenerMovement.SprPlayer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanDemo extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprPerson sprPerson = new SprPerson();
    private Timer timer;
    Timer timerMove;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int Speed = 5;
    PanTimer panTimer;
    String sDir;
    int nCount = 0;
    String sSame = "h";

    public PanDemo(PanTimer _panTimer) {
        panTimer = _panTimer;
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("sidewalk.jpg");
        background = i1.getImage();
        timer = new Timer(80, this);
        timer.start();

    }

    public void actionPerformed(ActionEvent arg0) {

        //sprPerson.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprPerson.getImage(), sprPerson.getX(), sprPerson.getY(), null);
    }

    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            if (nCount <= panTimer.nCount) {
                
            }
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            System.out.println(sSame);
            if (code == KeyEvent.VK_A) {
                sDir = "a";
                if (!sSame.equals(sDir)) {
                    Speed = 5;
                }
                sSame = sDir;
                panTimer.start(sDir);
                dx = -Speed;
                sprPerson.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_D) {
                sDir = "d";
                if (!sSame.equals(sDir)) {
                    Speed = 5;
                }
                sSame = sDir;
                panTimer.start(sDir);
                dx = Speed;
                sprPerson.setX(dx);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_W) {
                sDir = "w";
                if (!sSame.equals(sDir)) {
                    Speed = 5;
                }
                sSame = sDir;
                panTimer.start(sDir);
                dy = -Speed;
                sprPerson.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            } else if (code == KeyEvent.VK_S) {
                sDir = "s";
                if (!sSame.equals(sDir)) {
                    Speed = 5;
                }
                sSame = sDir;
                panTimer.start(sDir);
                dy = Speed;
                sprPerson.setY(dy);
                if (panTimer.nCount > nCount) {
                    Speed += 1;
                    nCount = panTimer.nCount;
                }
            }
        }
    }

    void display(int n) {
    }
}