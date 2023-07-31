package ex06;

//싱글톤 패턴 - new해서 1개만 유지시키고 싶을 때, 더 이상 생성X(바론)

class 미니언 {

    public 미니언() {
        System.out.println("미니언이 생성되었습니다.");
    }

}

// 싱글톤 패턴 만들기
// 생성자에 Private 붙이기: 클래스 외부에서 해당 클래스의 인스턴스를 생성할 수 없게 만들고, 상속을 통한 새로운 인스턴스 생성을 방지
// private static 제어자를 활용하여 인스턴스를 생성하는 코드를 클래스 영역에 작성
// 이후 getInstance 메서드를 작성하여 instance값을 가져오기.

class 바론 {
    private static 바론 instance = new 바론();

    private 바론() {

    }

    public static 바론 getInstance() {
        return instance;
    }
}

public class Single01 {

    public static void main(String[] args) {

        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        바론 b1 = 바론.getInstance();
        바론 b2 = 바론.getInstance();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        if (b1 instanceof 바론) {
            System.out.println("같은 타입 입니다.");

        }

        if (b1 instanceof Object) {
            System.out.println("바론과 오브젝트는 같은 타입입니다.");
        }

    }

}
