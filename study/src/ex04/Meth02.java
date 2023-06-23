package ex04;

class Cal02 {

    // void 자리는 리턴할 자료형을 명시하는 곳
    void add(int n1, int n2) {
        System.out.println("더하기 : " + (n1 + n2));
    } // 스택을 종료하고 복귀주소를 확인하고 복귀한다.

    void minus(int n1, int n2) {
        System.out.println("minus 호출됨");

    }

    void multi(int n1, int n2) {
        System.out.println("multi 호출됨");
    }

    void divide(int n1, int n2) {
        System.out.println("divide 호출됨");
    }

}

public class Meth02 {
    public static void main(String[] args) {

        Cal02 c1 = new Cal02();
        c1.add(10, 5);

        Cal02 c2 = new Cal02();
        c2.add(20, 30);
        c2.minus(10, 20);
        c2.multi(20, 30);
        c2.divide(20, 30);

    }
}
