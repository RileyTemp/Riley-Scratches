package Moving;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanPlayer {

    private Image img;
    int i;
    int x, y, bx, by, dx, dy, backgroundX;
    private int SPEED = 15;
    boolean left, right, up, down;
    ImageIcon p1 = new ImageIcon("walking.png");// Looking Left
    ImageIcon p2 = new ImageIcon("walking.png");// Looking Right
    int imgWidth = p1.getIconHeight();
    int imgHeight = p2.getIconWidth();
    Image arnRunning_R[] = new Image[2];
    Rectangle r;

    public PanPlayer() {
        r = new Rectangle();
        x = 550;
        y = 200;
        dx = 0;
        dy = 0;
        left = false;
        right = false;
        up = false;
        down = false;
        arnRunning_R[0] = p1.getImage();
        arnRunning_R[1] = p2.getImage();

    }

    public Rectangle getRect() {
        r.setBounds(x, y, imgWidth, imgHeight);
        return r;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        img = arnRunning_R[i];
        return img;
    }

    public void keyPressed(KeyEvent w) {
        int code = w.getKeyCode();
        if (code == KeyEvent.VK_A) {
            i = 0;
            dx = -SPEED;
        } else if (code == KeyEvent.VK_D) {
            i = 1;
            dx = SPEED;
        } else if (code == KeyEvent.VK_W) {
            SPEED = SPEED + 5;
        } else if (code == KeyEvent.VK_S) {
            SPEED = SPEED - 5;
        }

    }

    public void keyReleased(KeyEvent w) {
        dy = 0;
        dx = 0;
    }

    void Speed(String _s) {
        String SpeedChange = _s;
        System.out.println(SpeedChange);
        if (SpeedChange.equals("Speed up")) {
            SPEED = SPEED + 5;
            System.out.println(SPEED);
        } else if (SpeedChange.equals("Slow down")) {
            SPEED = SPEED - 5;
            System.out.println(SPEED);
        }
    }
}
/*class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {*/