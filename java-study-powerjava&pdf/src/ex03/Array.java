package ex03;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // int[] s = new int[70];

        // for (int i = 0; i < s.length; i++) {
        // s[i] = i;

        // }

        // for (int i = 0; i < s.length; i++) {
        // System.out.print(s[i] + " ");
        // }

        // int[] scores = { 10, 20, 30, 40, 50 };

        // System.out.println(Arrays.toString(scores));

        // int[] list = { 1, 2, 3, 4, 5 };
        // for (int k : list) {
        // System.out.println(k);

        int[][] s = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                System.out.println(s[i][j]);

        int[][] testArray = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
    }
}
