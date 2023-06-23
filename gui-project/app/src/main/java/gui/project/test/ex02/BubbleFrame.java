package gui.project.test.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        setSize(1000, 640);
        setLayout(null);// absolute 레이아웃
        setLocationRelativeTo(null);// J프레임 가운데배치하기
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BubbleFrame();

    }

}
