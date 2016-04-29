package CardLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FraCardLayout extends JFrame {

    JPanel panMaster;
    CardLayout cardLayout;

    public FraCardLayout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener buttonListener = new ButtonListener();
        setLayout(new BorderLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Final Project"); //Put Title on top of JFrame
        setResizable(true);
        setLocationRelativeTo(null);
        Pan1 pan1 = new Pan1(buttonListener);
        Pan2 pan2 = new Pan2(buttonListener);
        Pan3 pan3 = new Pan3(buttonListener);
        panMaster = new JPanel(new CardLayout());

        panMaster.add(pan1);
        panMaster.add(pan2);
        panMaster.add(pan3);
        getContentPane().add(panMaster);
        setVisible(true); //Make JFrame visible
        cardLayout = (CardLayout) panMaster.getLayout();
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String sAction;
            sAction = e.getActionCommand();
            if (sAction.equals("Next")) {
                cardLayout.next(panMaster);

            }
            if (sAction.equals("Previous")) {
                cardLayout.previous(panMaster);
            }
        }
    }
}