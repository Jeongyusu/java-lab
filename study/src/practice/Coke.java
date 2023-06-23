package practice;

public class Coke {
    private int price;
    private String desc;

    public Coke() {
        this(500, "콜라");
    }

    public Coke(int price) {
        this(price, "콜라");
    }

    public Coke(int price, String desc) {
        this.price = price;
        this.desc = desc;
        System.out.println("콜라가 만들어졌습니다.");
    }

    public int getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

}
