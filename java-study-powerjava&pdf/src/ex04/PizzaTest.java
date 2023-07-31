package ex04;

import javax.sound.sampled.SourceDataLine;
import java.util.*;

class Pizza {

    int size;
    String type;

    public Pizza() {
        size = 12;
        type = "슈퍼슈프림";

    }

    public Pizza(int s, String t) {
        size = s;
        type = t;
    }

}

public class PizzaTest {

    public static void main(String[] args) {

        Pizza p = new Pizza();
        System.out.println(p.type + " , " + p.size);

        Pizza p2 = new Pizza(24, "포테이토");

        System.out.println(p2.type + p2.size);
    }

}
