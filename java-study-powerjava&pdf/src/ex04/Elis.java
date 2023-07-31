package ex04;

class Elis1 {

    static String name = "엘리스";
    int height = 160;

    public Elis1() {
    }

    void eat(int qty) {
        this.height = this.height + (10 * qty);
    }
}

public class Elis {
    public static void main(String[] args) {
        Elis1 e = new Elis1();
        e.eat(5);
    }
}