package View;

import Io.LeaderBoardFiles;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class LeaderBoardFrame extends JDialog {
    public LeaderBoardFrame(EndGame owner) {
        super(owner, "LeadersBoard", true);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(500, 400);
        Map<String, Integer> leaderBoard = LeaderBoardFiles.read("D:\\Java_project\\Tetris\\src\\Files\\ListLeader.json");
        Map<String, Integer> sortMap = new LinkedHashMap<>();
        leaderBoard.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                forEach(entry -> sortMap.put(entry.getKey(), entry.getValue()));
        String string ="<html>";
        for (var entry : sortMap.entrySet()) {
            string = string + entry.getKey() + " " + entry.getValue() + "<br/>";
        }
        string = string +"<html>";
        JLabel textArea = new JLabel(string);
        textArea.setFont(new Font("Dialog", Font.PLAIN, 30));
        JScrollPane list = new JScrollPane(textArea);
        list.setBounds(200, 0 , 300, 400);
        list.setBorder(null);
        add(list);
        setVisible(true);
    }
}
