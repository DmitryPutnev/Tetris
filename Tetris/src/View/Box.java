package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Box extends JPanel {
    private int color = 0;
    public Box(int x, int y) {
        setBounds(x*Config.SIZE_CELL, y*Config.SIZE_CELL, Config.SIZE_CELL, Config.SIZE_CELL);
        setLayout(null);
        setColor(color);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int k) {
       color = k;

        BufferedImage imageNon = null;
        BufferedImage imageS = null;
        BufferedImage imageZ = null;
        BufferedImage imageI = null;
        BufferedImage imageO = null;
        BufferedImage imageL = null;
        BufferedImage imageJ = null;
        BufferedImage imageT = null;
        BufferedImage imageHelp = null;
        try {
            imageNon = ImageIO.read(new File("src\\Image\\Non.jpg"));
            imageS = ImageIO.read(new File("src\\Image\\S.jpg"));
            imageZ = ImageIO.read(new File("src\\Image\\Z.jpg"));
            imageI = ImageIO.read(new File("src\\Image\\I.jpg"));
            imageO = ImageIO.read(new File("src\\Image\\O.jpg"));
            imageL = ImageIO.read(new File("src\\Image\\L.jpg"));
            imageJ = ImageIO.read(new File("src\\Image\\J.jpg"));
            imageT = ImageIO.read(new File("src\\Image\\T.jpg"));
            imageHelp = ImageIO.read(new File("src\\Image\\Help.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel picLabelNon = new JLabel(new ImageIcon(imageNon));
        picLabelNon.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelS = new JLabel(new ImageIcon(imageS));
        picLabelS.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelZ = new JLabel(new ImageIcon(imageZ));
        picLabelZ.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelI = new JLabel(new ImageIcon(imageI));
        picLabelI.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelO = new JLabel(new ImageIcon(imageO));
        picLabelO.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelL = new JLabel(new ImageIcon(imageL));
        picLabelL.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelJ = new JLabel(new ImageIcon(imageJ));
        picLabelJ.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelT = new JLabel(new ImageIcon(imageT));
        picLabelT.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);
        JLabel picLabelHelp = new JLabel(new ImageIcon(imageHelp));
        picLabelHelp.setBounds(0, 0, Config.SIZE_CELL, Config.SIZE_CELL);

        removeAll();

        if (color == 0)
            add(picLabelNon);
        if (color == 1)
            add(picLabelS);
        if (color == 2)
            add(picLabelZ);
        if (color == 3)
            add(picLabelI);
        if (color == 4)
            add(picLabelO);
        if (color == 5)
            add(picLabelL);
        if (color == 6)
            add(picLabelJ);
        if (color == 7)
            add(picLabelT);
        if (color == 8)
            add(picLabelHelp);
    }
}
