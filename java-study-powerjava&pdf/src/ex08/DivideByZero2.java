package ex08;

public class DivideByZero2 {

    static void divide(int n) {
        try {
            int result = 10 / n;
            System.out.printf("나눗셈결과 : %s", result);

        } catch (Exception e) {
            System.out.println("에러발생");
        }
    }

    public static void main(String[] args) {
        divide(0);
    }

}
