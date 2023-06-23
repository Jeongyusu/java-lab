package ex04;

public class Programmers {

    int answer;
    int age;

    public int solution(int age) {

        boolean val = (0 <= age && age <= 120);
        if (val) {
            answer = 2022 - age + 1;
            return answer;
        } else
            return -1;
    }

    public Programmers(int age) {
        this.age = age;

    }

    public static void main(String[] args) {

        Programmers pro1 = new Programmers(40);
        System.out.println(pro1.age);

    }
}
