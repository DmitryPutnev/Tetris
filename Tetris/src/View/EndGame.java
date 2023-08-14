package View;

import Io.LeaderBoardFiles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndGame extends JDialog {
    public EndGame (Window owner) {
        super(owner, "End Game", true);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        JPanel panelOk = new JPanel();
        JButton ok = new JButton("Okay");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });


        ok.setBounds(50,120, 100, 30);
        JTextField enter = new JTextField("Enter your name: ");
        enter.setBounds(50, 80 ,200, 30);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = enter.getText();
                LeaderBoardFiles.write(name, owner.getScore(),
                        "D:\\Java_project\\Tetris\\src\\Files\\ListLeader.json");
            }
        });

        JButton leaders = new JButton("Leaders");
        leaders.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LeaderBoardFrame frame = new LeaderBoardFrame(EndGame.this);
            }
        });

        leaders.setBounds(150,120, 100, 30);
        JLabel text = new JLabel("<html><h2>GAME OVER</h2> Your score: "+ owner.getScore() +"</html>");
        text.setBounds(80, 0, 150, 90);
        add(leaders);
        add(enter);
        add(ok);
        add(text);
    }
}
