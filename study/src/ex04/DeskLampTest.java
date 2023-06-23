package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();
        myLamp.turnOn();
        System.out.println(myLamp.print());
        myLamp.turnoff();
        System.out.println(myLamp.print());

    }
}
