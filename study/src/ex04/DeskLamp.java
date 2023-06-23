package ex04;

public class DeskLamp {

    boolean isOn; // boolean 타입은 is를 붙인다.

    void turnOn() {
        isOn = true;

    }

    void turnoff() {
        isOn = false;
    }

    String print() {
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}
