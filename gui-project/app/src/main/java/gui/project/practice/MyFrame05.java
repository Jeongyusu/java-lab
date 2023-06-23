package gui.project.practice;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame05 extends JFrame {
    private JButton b1, b2;

    public MyFrame05() {
        setTitle("abolute Position Test");
        setSize(300, 150);
        setLayout(null);

        b1 = new JButton("Button #1");
        add(b1);
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 = new JButton("Button #2");
        add(b2);
        b2.setBounds(180, 30, 90, 20);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyFrame05 f = new MyFrame05();
    }

}
