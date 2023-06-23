package ex05.ch02;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {

        u2.setHp(u2.getHp() - u1.getAttack());

        System.out.println(u2.getName() + "이 공격당했습니다");
        System.out.println(u2.getName() + "의 남은 hp : " + u2.getHp());

    }

    static int sdkfi() {

        return 5;
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit z3 = new Dragoon("드라군1", 125, 20);
        ProtossUnit z4 = new Dragoon("드라군2", 125, 20);
        ProtossUnit z5 = new DarkTempler("다크1", 150, 15);
        ProtossUnit z6 = new DarkTempler("다크2", 150, 15);

        attack(z1, z6);
        attack(z3, z6);

    }

}