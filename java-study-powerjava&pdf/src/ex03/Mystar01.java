package ex03;

import javax.print.event.PrintEvent;

public class Mystar01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= 5; i = i + 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 3; i >= 1; i = i - 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // 2 1 0 1 2 공백문자의 개수

        int rows = 5;
        int middleRow = (rows + 1) / 2;

        for (int i = 1; i <= rows; i++) {
            int numSpaces = Math.abs(middleRow - i);
            int numStars = rows - (2 * numSpaces);

            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= numStars; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
