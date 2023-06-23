package ex05.composit;

//생성자, 게터는 기본 생성 -> 세터는 필요할 때만
public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
        // 매개변수 자리에 new () -> 힙 주소 전달됨.
        // new Burger(); 라고만 적으면 가비지컬렉션 대상이지만, 위 방법 처럼하면 실제적으로 값이 전달되므로 가비지컬렉션 대상X
    }

    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}
