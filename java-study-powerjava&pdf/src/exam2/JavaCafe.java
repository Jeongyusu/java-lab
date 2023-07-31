package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        // printPay(10.00, 40);
        // printPay(10.00, 50);
        // printPay(7.50, 38);
        // printPay(8.50, 66);
        printPay(10, 40);
    }

    public static void printPay(double basePay, int hours) {

        // 1. 예외처리

        if (basePay < 8) {
            System.out.println("최저 시급 에러");
            return; // 메서드 종료
        }

        if (hours > 60) {
            System.out.println("초과근무 시간에러");
            return;
        }
        // 2. 월급 계산 본 코드짜기
        double pay = basePay * hours;

        // 3. 추가 수당 계산
        // else 없이 사용하면 가독성 및 모듈화하기 좋음.
        if (hours > 40) {
            pay = pay + (hours - 40) * (basePay * 0.5);

        }
        System.out.printf("$ %.2f\n", pay);
    }

}
