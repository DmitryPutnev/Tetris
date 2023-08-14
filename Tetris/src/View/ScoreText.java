package View;

import javax.swing.*;
import java.awt.*;

public class ScoreText extends JPanel {
    private int score = 0;
    private int lvl = 1;
    private String textScore = "<html>Score: "+ score + "<br>Lvl: " + lvl + "</html>";
    public ScoreText() {
        setBounds(390, 480, Config.LONG_BLOCK_SCORE_TEXT, Config.WIDE_BLOCK_SCORE_TEXT);
        setLayout(null);
        setBackground(Color.lightGray);
        JLabel text = new JLabel(textScore);
        text.setBounds(50, 0, Config.LONG_BLOCK_SCORE_TEXT, Config.WIDE_BLOCK_SCORE_TEXT);
        add(text);
    }
    public boolean plusScore(int a) {
        boolean lvlUp = false;
        switch (a) {
            case 1: score += 100; break;
            case 2: score += 300; break;
            case 3: score += 700; break;
            case 4: score += 1500; break;
        }
        if ((score/Config.LIMIT) == lvl) {
            lvl++;
            lvlUp = true;
        }
        removeAll();
        textScore = "<html>Score: "+ score + "<br>Lvl: " + lvl + "</html>";
        JLabel text = new JLabel(textScore);
        text.setBounds(50, 0, Config.LONG_BLOCK_SCORE_TEXT, Config.WIDE_BLOCK_SCORE_TEXT);
        add(text);
        return lvlUp;
    }
    public int getScore() {
        return  score;
    }
}
