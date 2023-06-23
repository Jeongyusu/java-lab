package gui.project.practice;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame04 extends JFrame {

    public MyFrame04() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        setLayout(new GridLayout(2, 3, 2, 2));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame04();

    }
}
