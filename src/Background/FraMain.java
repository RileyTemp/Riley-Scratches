package Background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FraMain extends JFrame {

    JPanel panMaster;
    CardLayout cardLayout;

    public FraMain() {
        setTitle("Background Color for JFrame");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        ActionListener cardChanger = new CardChanger();
        PanChooser panChooser = new PanChooser(cardChanger);
        PanRoad panRoad = new PanRoad(cardChanger);
        PanSpace panSpace = new PanSpace(cardChanger);
        panMaster = new JPanel(new CardLayout());
        panMaster.add(panChooser);
        panMaster.add(panRoad);
        panMaster.add(panSpace);
        getContentPane().add(panMaster);
        setVisible(true); //Make JFrame visible
        cardLayout = (CardLayout) panMaster.getLayout();
    }

    class CardChanger implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String sAction;
            sAction = e.getActionCommand();
            if (sAction.equals("Road")) {
                cardLayout.next(panMaster);
            } else if (sAction.equals("Space")) {
                cardLayout.last(panMaster);
            } else if (sAction.equals(" Road")) {
                cardLayout.previous(panMaster);
            }
        }
    }
}
/*setLayout(new BorderLayout());
 JLabel background = new JLabel(new ImageIcon("FHCI.jpg"));
 add(background);
 background.setLayout(new FlowLayout());*/
