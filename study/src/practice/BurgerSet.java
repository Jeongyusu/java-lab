package practice;

public class BurgerSet {
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() {
        this(new Burger(), new Coke(), new Potato());
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
