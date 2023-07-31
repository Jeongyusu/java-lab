package ex05.exam;

class Carnivore {
    void print() {
    }

}

class Tiger extends Carnivore {
    String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Lion extends Carnivore {
    String name;

    public Lion(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class ExtenExam {

    static void start(Carnivore v) {
        v.print();

    }

    public static void main(String[] args) {
        Lion lion = new Lion("사자1");
        Tiger tiger = new Tiger("호랑이1");
        start(lion);
        start(tiger);

    }
}

// 오버라이딩을 통해서 39 40이 실행될 때 //메서드를 통해 변수에 접근
