package practice;

public class Cote {

    static int solution(int num1, int num2) {
        int answer = 0;

        if ((0 < num1 && num1 <= 100) && (0 < num2 && num2 <= 100)) {

            answer = (int) (((double) num1 / num2) * 1000);
            return answer;
        }

        else {
            System.out.println("에러입니다.");
            return -1;

        }

    }

    public static void main(String[] args) {

        System.out.println(solution(100, 100));
    }

}
