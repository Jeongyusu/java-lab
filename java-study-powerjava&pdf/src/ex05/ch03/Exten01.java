package ex05.ch03;

class EarthPerson {

}

class EuropeanPerson extends EarthPerson {

}

class AsianPerson extends EarthPerson {
    void speak() {

        // 오버라이드 됨(부모의 메서드 무효화) --> 동적 바인딩(아래로 내려가면서 자식의 메서드 호출), 변수는 동적 바인딩이 없다. 메서드만
        // 해당.
        System.out.println("아시아어");
    }

}

class KoreanPerson extends AsianPerson {

}

class Person extends KoreanPerson {

    // 메서드 재정의 됨
    void speak() {

        System.out.println("한국어");
    }

    // 오버라이드(재정의) : 부모의 메서드를 자식에서 같은 이름으로 만드는 것
    // 오버라이드 :'무효화하다' 의 뜻

}

public class Exten01 {
    public static void main(String[] args) {
        // new 하면 다형성이 성립되는(상속) 타입이 전부 힙에 뜸 * 부모들이 같이 뜸
        // 참조변수 타입이 메모리 공간의 위치를 나타냄.
        // 힙
        // ----------
        // 지구
        // 아시아
        // 한국
        // 펄슨
        // --------
        // Person p1 = new Person();

        // AsianPerson p2 = new EarthPerson(); <--에러 발생
        // KoreanPerosn p1 = new AsianPerson(); <--에러 발생

        // 한국인에 String name이 있을 경우, p2.name 하면 못 찾음 , 위로 풀스캔 하기 떄문
        // AsianPerson p2 = new KoreanPerson();

        // System.out.println(p2.name);
        KoreanPerson p1 = new Person();
        p1.speak();

    }
}