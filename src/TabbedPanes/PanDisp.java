package TabbedPanes;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class PanDisp extends JPanel {
//http:stackoverflow.com/questions/15032959/java-swing-add-tabs-into-jpanels

    JButton lblname;
    
    public PanDisp() {
        JTabbedPane tabbedPane = new JTabbedPane();
        JComponent panel1 = makeTextPanel("Pane");
        tabbedPane.addTab("Tabbed", panel1);
        lblname = new JButton("Added to Panel");
        panel1.add(lblname);
        panel1.setPreferredSize(new Dimension(200, 400));
        
        JComponent panel2 = makeTextPanel("Pane 2");
        tabbedPane.addTab("Tabbed", panel2);
        add(tabbedPane);
        
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    private static void createAndShowGUI() {
    }
}
