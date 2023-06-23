package test.ex08;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BackgroundPlayerServiece implements Runnable {

    // 의존하는 것들-->상태가 필요한 것은 전역변수로 뺌.
    private BufferedImage image;
    private Player player;

    public BackgroundPlayerServiece(Player player) {
        this.player = player;
        File file = new File("image/backgroundMaPService.png");

        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }

    public void run() {
        while (true) {
            // 색상 확인
            Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
            Color rightColor = new Color(image.getRGB(player.getX() + 50 + 15, player.getY() + 25));
            // System.out.println("leftColor : "+leftColor);
            // System.out.println("rightColor : "+rightColor);
            int bottomColor = image.getRGB(player.getX() + 10, player.getY() + 50 + 5) // -1
                    + image.getRGB(player.getX() + 50 - 10, player.getY() + 50 + 5); // -1

            // 바닥 충돌 확인
            if (bottomColor != -2) {
                // System.out.println("바텀 칼러 : "+bottomColor);
                System.out.println("바닥에 충돌함");
                player.setDown(false);
            } else {
                if (!player.isUp() && !player.isDown())
                    player.down();

            }

            // 벽 충돌확인

            if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
                System.out.println("왼쪽 벽에 충돌함");
                player.setLeftWallCrash(true);
                player.setLeft(false);

            } else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
                System.out.println("오른쪽 벽에 충돌함");
                player.setRightWallCrash(true);
                player.setRight(false);
            } else {
                player.setLeftWallCrash(false);
                player.setRightWallCrash(false);
            }

            try {
                System.out.println("나 이제 쉴꼐");
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 실의 길이

}
