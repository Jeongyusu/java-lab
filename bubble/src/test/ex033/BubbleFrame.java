package test.ex033;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initSetting();
        initObject();
        initListener();
        setVisible(true);

    }

    public void initObject() {

        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        player = new Player();

        setContentPane(backgroundMap);
        add(player);

    }

    public void initSetting() {

        setSize(1000, 640);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.right();
                } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.left();

                }
            }

        }

        );
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }

}
