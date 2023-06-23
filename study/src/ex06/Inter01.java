package ex06;

/**
 * 인터페이스는 new할 수 없다.
 * 인터페이스는 static 변수를 만들 수 있다.
 * 인터페이스는 추상메서드만 가진다.
 * 인터페이스는 두 가지 관점에서 사용 - 노출, 강제성
 */

interface Remote {
    int NUM = 10; // public static final 생략

    void run(); // public abstract 생략

}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(Remote.NUM);
    }

}
