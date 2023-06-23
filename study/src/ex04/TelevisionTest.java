package ex04;

class Television {

    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o) {

        channel = c;
        volume = v;
        onOff = o;

    }

    void print() {
        System.out.println("채널 : " + channel + "볼륨 : " + volume);
    }

}

public class TelevisionTest {
    public static void main(String[] args) {

        Television tv = new Television(2, 3, true);
        tv.print();

    }
}
