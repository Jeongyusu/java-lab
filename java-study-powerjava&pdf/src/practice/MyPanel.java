package practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

class Ball {
    private int x = 100;
    private int y = 100;
    private int size = 30;
    private int XSpeed = 10;
    private int ySpeed = 10;

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }

    public void update() {
        x += XSpeed;
        y += ySpeed;

        if ((x + size) > MyPanel.BOARD_WIDTH - size || x < 0) {
            XSpeed = -XSpeed;

        }
        if ((y + size) > MyPanel.BOARD_HEIGHT - size || y < 0) {
            ySpeed = -ySpeed;
        }

    }

}

public class MyPanel extends JPanel {
    static final int BOARD_WIDTH = 600;
    static final int BOARD_HEIGHT = 300;
    private Ball ball = new Ball();

    public MyPanel() {
        this.setBackground(Color.YELLOW);

        Runnable task = () -> {
            while (true) {
                ball.update();
                repaint();

                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignore) {
                    // TODO: handle exception
                }

            }

        };

        new Thread(task).start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
        frame.add(new MyPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
