package ex04;

public class Pork {

    public static double calorieCalculator(int n) {
        return n * 180 * 5.179;

    }

    public static void main(String[] args) {
        int n = 3;
        double result = Pork.calorieCalculator(n);
        System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);

    }

}
