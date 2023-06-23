package practice;

import javax.swing.*;
import java.awt.Toolkit;

public class FrameTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test");
        JFrame s = new JFrame("Frame Test2");
        f.setSize(300, 200);
        f.setVisible(true);
        s.setSize(300, 200);
        s.setVisible(true);

        for (int i = 0; i <= 1600; i = i + (int) (Math.random() * 100) * 2) {
            f.setLocation(i, 0);
            s.setLocation(i * 2, 0);
            try {
                Thread.sleep(1000); // 1초 딜레이
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
