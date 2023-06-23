package ex03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오: ");

        int point = sc.nextInt();

        if (point >= 90) {

            System.out.println("학점 A");

        }

        else if (point >= 80) {
            System.out.println("학점 B");

        }

        else if (point >= 70) {
            System.out.println("학점 C");

        }

        else if (point >= 60) {
            System.out.println("학점 D");
        }

        else
            System.out.println("학점 F");

    }
}
