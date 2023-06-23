package ex05.ch02;

public class DarkTempler extends ProtossUnit {
    private String name;
    private int hp;
    private int attack;

    public DarkTempler(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public void setHp(int restHp) {
        this.hp = restHp;
    }
}