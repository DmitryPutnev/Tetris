package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Logo extends JPanel {
    public Logo() {
        setBounds(390, 255, Config.SIZE_BLOCK_TEXT, Config.SIZE_BLOCK_TEXT);
        BufferedImage imageLogo = null;
        try {
            imageLogo = ImageIO.read(new File("src\\Image\\Logotype.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JLabel picLabelLogo = new JLabel(new ImageIcon(imageLogo));
        picLabelLogo.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        add(picLabelLogo);
    }
}
