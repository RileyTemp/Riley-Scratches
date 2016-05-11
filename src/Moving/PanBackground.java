package Moving;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class PanBackground extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP; // rectangles for the 3 sprites.
    PanPlayer panPlayer;
    //private Enemy e;
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int nChange = 1;
    JButton btnAcc;
    PanSpeed panSpeed;

    public PanBackground(PanSpeed _panSpeed, PanPlayer _panPlayer) {
        //super();
        panSpeed = _panSpeed;
        panPlayer = new PanPlayer();
        //e = new Enemy();
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("sidewalk.jpg");
        background = i1.getImage();
        timer = new Timer(80, this);
        timer.start();
        btnAcc = new JButton("Speed up");
        this.add(btnAcc);
    }

    public void actionPerformed(ActionEvent arg0) {
        //Label();
        panPlayer.move();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(panPlayer.getImage(), panPlayer.getX(), panPlayer.getY(), null);
        //g2d.drawImage(e.getImage(), e.getX(), e.getY(), null);
        //isHit();
    }

    /*boolean isHit() {
     rB = p.getRect();
     rE = e.getRect();
     if (rB.intersects(rE)) {
     System.out.println("HIT");
     return true;

     } else {
     return false;
     }

     }*/
    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            panPlayer.keyReleased(w);
        }

        @Override
        public void keyPressed(KeyEvent w) {
            panPlayer.keyPressed(w);
        }
    }

    void display(int n) {
    }
}
