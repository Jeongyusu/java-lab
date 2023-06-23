package ex05.ch02;

public class Zealot extends ProtossUnit {
    private String name;
    private int hp;
    private int attack;

    public Zealot(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public int getHp() {
        return hp;

    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public String getName() {
        return name;

    }

    @Override
    public void setHp(int restHp) {
        this.hp = restHp;

    }

}