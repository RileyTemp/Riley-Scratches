package ButtonTimerMovement;

import TimerMovement.*;
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
    String s;
    int nCount = 0;
    String sSame = "h";

    public PanDemo() {

        //addKeyListener(new Movement());
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
public void moveSprite(){
    System.out.println("bigger");
     sprPerson.falling();
}
    void display(int n) {
    }
}