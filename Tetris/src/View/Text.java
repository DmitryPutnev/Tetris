package View;

import javax.swing.*;
import java.awt.*;

public class Text extends JPanel {
    public Text() {
        setBounds(390, 350, Config.SIZE_BLOCK_TEXT, Config.SIZE_BLOCK_TEXT);
        setBackground(Color.lightGray);
        JLabel text = new JLabel(Config.CONTROL_TEXT);
        text.setBounds(0, 0, Config.SIZE_BLOCK_TEXT, Config.SIZE_BLOCK_TEXT);
        add(text);
    }
}