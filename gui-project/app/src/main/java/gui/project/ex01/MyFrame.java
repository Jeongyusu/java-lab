package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    public MyFrame() {
        super.setSize(300, 500);
        setTitle("MyFrame");
        setVisible(true);

        this.setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("버튼");
        this.add(button);

        JButton button2 = new JButton("버튼");
        this.add(button2);

        JButton button3 = new JButton("버튼");
        this.add(button3);
    }

    public static void main(String[] args) {
        new MyFrame();

    }

}