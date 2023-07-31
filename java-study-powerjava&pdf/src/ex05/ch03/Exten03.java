package ex05.ch03;

//추상 클래스, new 불가
class Animal {

    void speak() {
    }

}

class Dog extends Animal {

    void speak() {
        System.out.println("멍멍");
    }

}

class Cat extends Animal {

    void speak() {
        System.out.println("야옹");

    }

}

public class Exten03 {

    static void start(Animal u) {
        u.speak();

    }

    public static void main(String[] args) {

        Animal b = new Cat();
        start(b);

        Animal c = new Dog();
        start(c);

    }

}
