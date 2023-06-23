package ex02;

class Hello {
    static int price1 = 1000;
    String name = "커피";

    void run() {
        int n = 100;
        System.out.println("달린다");
        /// 메서드 내부의 요소(변수,메서드)들은
        // stack영역에 저장(실행되는 동안만 데이터가 유지되다가 실행이 종료되면 삭제)
        // 메인 메서드의 경우도 동일함.
        // new 연산자로 heap 영역 내에 띄우는 것이 가능.
    }
}

public class Mem01 {

    static int price = 10000;

    public static void main(String[] args) {
        System.out.println(Mem01.price);
        System.out.println(Hello.price1); // static 속성이 붙은 변수 or 메서드는 "클래스명.변수(메서드)명"으로 호출하여 사용할 수 있음
        // Hello.price로 사용가능함. 그러나 static 속성이 없으면 호출 불가능.
        // Hello.name은 heap영역에 띄우기 전까지는 불가능 -> System.out.println(Hello.name); 에러발생

        Hello c = new Hello();

        // Hello 내의 변수와 메서드를 heap 영역에 띄우는 것. Hello 객체 생성 후 참조변수 C에 주소 할당
        System.out.println(c.name);
        System.out.println(Hello.price1);

        System.out.println(price);

        c.run();

    }
}