package test.ex04;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
    // 위치 상태
    private int x;
    private int y;

    // 플레이어의 방향 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    private ImageIcon playerR, playerL;

    public Player() {

        initObject();
        initSetting();

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
                x = x + 10;
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
                x = x - 10;
                setLocation(x, y);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

}
