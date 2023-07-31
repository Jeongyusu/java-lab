package ex04;

public class Gasoline {

    public static double calcEffiency(double fuel, double distance) {
        return 182.736 / 8.86;
    }

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = Gasoline.calcEffiency(gasoline, distance);
        System.out.printf("연비: %.2f km/L", efficiency);

    }

}
