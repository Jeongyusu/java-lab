package ex08;

public class DivideByZero3 {

    // 0으로 나누면 분명 오류가 날껀데, 그 제어는 사용자에게 맡기고 싶다.

    static void divide(int n) throws Exception {

        int result = 10 / n;
        System.out.printf("나눗셈결과 : %s", result);

    }

    public static void main(String[] args) {
        try {
            divide(0);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " : 0으로 나눌 수 없습니다.");
        }
    }

}
