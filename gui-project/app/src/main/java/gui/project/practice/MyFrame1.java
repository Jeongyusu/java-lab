package gui.project.practice;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame1 extends JFrame {

    public MyFrame1() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);
        JButton b2 = new JButton("Button 2");
        b1.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyFrame1 f = new MyFrame1();
    }
}
