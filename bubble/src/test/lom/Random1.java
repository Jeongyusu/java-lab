package test.lom;

import java.util.Random;

public class Random1 {

    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println("뭐 먹지?");
        String[] weeks = { "가", "나", "다", "라", "마", "바", "사" };
        int rnum = rand.nextInt(weeks.length);
        System.out.println(weeks[rnum]);

    }

}