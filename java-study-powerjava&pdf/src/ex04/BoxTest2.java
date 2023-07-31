package ex04;

public class BoxTest2 {

    int width;
    int length;
    int height;

    double getVolume() {
        return (double) width * height * length;
    }

    public static void main(String[] args) {

        BoxTest2 b = new BoxTest2();
        b.width = 20;
        b.length = 20;
        b.height = 30;

        System.out.println("상자의 가로, 세로, 높이는 " + b.width + "," + b.length + "," + b.height + "입니다.");
        b.getVolume();
        System.out.println("상자의 부피는 :" + b.getVolume() + "입니다.");
    }
}
