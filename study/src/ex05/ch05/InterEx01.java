package ex05.ch05;

//주석 여러출 치면서 하기 /** 치고 */ 생기면 중간에서 엔터

/**
 * 인터페이스
 * 1. 필요한 메서드만 노출시키고 싶을 때!!
 * 2. 프로그램 설계할 때, 특정 메서드만 사용하도록 강제시키고 싶을 때!!
 * 3.
 */

// 인터페이스 이름 뒤에는 Able을 붙인다
interface CarAble {
    public abstract void 엑셀();

}

class Car implements CarAble {

    private void 엔진가열() {
        System.out.println("엔진가열");
    }

    private void 모터작동() {
        System.out.println("모터작동");
    }

    private void 바퀴회전() {
        System.out.println("바퀴회전");
    }

    @Override
    public void 엑셀() {
        엔진가열();
        모터작동();
        바퀴회전();
    }
}

// CarAble의 구현체는 Car이다. <---API문서(인터페이스+application->여기서 car)에 설명
public class InterEx01 {
    public static void main(String[] args) {

        // 다형성과 관계없음.
        CarAble carable = new Car();
        carable.엑셀();
    }

}
