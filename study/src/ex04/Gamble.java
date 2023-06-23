package ex04;

public class Gamble {

    public static int dice() {

        return (int) (Math.random() * 7);

    }

    public static double exchange(double dollar) {

        return dollar * 1082.25108;
    }

    public static void main(String[] args) {
        double dollar = dice() + dice() + dice();
        double won = exchange(dollar);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
    }

}
