package ex05.composit;

//상속의 주 목적 추상화 => 공통의 부모
public class BigBurger extends Burger {

    public BigBurger() {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price) {
        super(1500, "빅버거");
        System.out.println("빅버거가 만들어졌습니다.");
    }

    public BigBurger(int price, String desc) {
        super(price, desc);
        System.out.println("빅버거가 만들어졌습니다.");

    }

}
