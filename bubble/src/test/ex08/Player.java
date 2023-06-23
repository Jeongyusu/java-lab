package test.ex08;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player extends JLabel {
    // 위치 상태
    private int x;
    private int y;

    // 플레이어의 방향 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // 플레이어 속도 상태
    private final int SPEED = 10; // x축
    private final int JUMPSPEED = 4; // y축

    // 벽에 충돌한 상태
    private boolean leftWallCrash;
    private boolean rightWallCrash;
    private boolean downWallCrash;

    private ImageIcon playerR, playerL;

    public Player() {

        initObject();
        initSetting();
        new Thread(new BackgroundPlayerServiece(this)).start();

    }

    public void initObject() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");

    }

    private void initSetting() {
        x = 70;
        y = 535;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);

        left = false;
        right = false;
        up = false;
        left = false;

    }

    public void right() {
        System.out.println("right메서드 실행됨");
        right = true;

        new Thread(() -> {
            while (right) {
                setIcon(playerR);
                x = x + SPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();

    }

    public void left() {
        System.out.println("left메서드 실행됨");
        left = true;

        new Thread(() -> {
            while (left) {
                setIcon(playerL);
                x = x - SPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public void up() {
        System.out.println("up 메서드 실행됨");
        up = true;

        new Thread(() -> {
            for (int i = 0; i < 35; i++) {

                y = y - JUMPSPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            up = false;
            down();
        }).start();

    }

    public void down() {
        System.out.println("down 메서드 실행됨");
        down = true;

        new Thread(() -> {
            while (down) {

                y = y + JUMPSPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            down = false;
        }).start();

    }

}
