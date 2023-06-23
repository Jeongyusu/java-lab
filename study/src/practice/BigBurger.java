package practice;

public class BigBurger extends Burger {

    public BigBurger() {
        super(1500, "빅버거");

    }

    public BigBurger(int price) {
        super(price, "빅버거");

    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다.");

    }

}
