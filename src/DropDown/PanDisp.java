package DropDown;

import javax.swing.*;

public class PanDisp extends JPanel {

    public PanDisp() {
        //http://stackoverflow.com/questions/22506331/simple-dropdown-menu-in-java
        String[] backgrounds = {"Box 1", "Box 2", "Box 3", "Box 4"};
        final JComboBox cb = new JComboBox(backgrounds);
        add(cb);
    }
}
