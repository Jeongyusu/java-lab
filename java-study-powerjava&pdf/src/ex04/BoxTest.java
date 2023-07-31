package ex04;

import javax.sound.sampled.SourceDataLine;

class Box {

    int width;
    int length;
    int height;

    double getVolume() {
        return (double) width * height * length;
    }

}

public class BoxTest {
    static int b;

    int c;

    void cool() {

    }

    public static void main(String[] args) {

        Box b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;

        System.out.println("상자의 가로, 세로, 높이는 " + b.width + "," + b.length + "," + b.height + "입니다.");
        b.getVolume();
        System.out.println("상자의 부피는 :" + b.getVolume() + "입니다.");

    }
}
