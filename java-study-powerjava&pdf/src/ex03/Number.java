package ex03;

import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하시오. ");
        int number = sc.nextInt();

        if (number % 2 == 1)
            System.out.println("입력된 정수는 " + "홀수 입니다.");

        else if (number == 0)
            System.out.println("입력된 정수는 짝수 또는 홀수가 아닙니다.");

        else
            System.out.println("입력된 정수는 짝수입니다.");

    }

}
