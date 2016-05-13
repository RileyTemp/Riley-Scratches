package Moving;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanDemo extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP;
    SprPlayer sprPlayer = new SprPlayer();
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int dx, dy;
    int Speed = 15;

    public PanDemo() {
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("sidewalk.jpg");
        background = i1.getImage();
        timer = new Timer(80, this);
        timer.start();
        System.out.println(sprPlayer.x);
        System.out.println(sprPlayer.y);
    }

    public void actionPerformed(ActionEvent arg0) {

        sprPlayer.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(sprPlayer.getImage(), sprPlayer.getX(), sprPlayer.getY(), null);
    }

    void SpeedChange(String _s) {
        String Change = _s;
        if (Change.equals("Speed up")) {
            Speed += 5;
        } else if (Change.equals("Slow down")) {
            Speed -= 5;
        }
        if (Speed < 0) {
            Speed = 5;
        }
    }

    void Move(String _s) {
        String Move = _s;
        if (Move.equals("Left")) {
            dx = -Speed;
            sprPlayer.x += dx;
        } else if (Move.equals("Right")) {
            dx = Speed;
            sprPlayer.x += dx;
        } else if (Move.equals("Up")) {
            dy = -Speed;
            sprPlayer.y += dy;
        } else if (Move.equals("Down")) {
            dy = Speed;
            sprPlayer.y += dy;
        }
    }

    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            dy = 0;
            dx = 0;
        }

        @Override
        public void keyPressed(KeyEvent w) {
            int code = w.getKeyCode();
            if (code == KeyEvent.VK_A) {
                dx = -Speed;
                sprPlayer.x += dx;
            } else if (code == KeyEvent.VK_D) {
                dx = Speed;
                sprPlayer.x += dx;
            } else if (code == KeyEvent.VK_W) {
                dy = -Speed;
                sprPlayer.y += dy;
            } else if (code == KeyEvent.VK_S) {
                dy = Speed;
                sprPlayer.y += dy;
            }
        }
    }

    void display(int n) {
    }
}
