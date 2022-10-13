package lotr;

import java.util.Random;

public abstract class Character {
    private int power;
    private int hp;
    protected Random random = new Random();

    protected Character(int hp, int power){
        setHp(hp);
        setPower(power);
    }

    protected Character(int minHp, int maxHp, int minPower, int maxPower){
        setHp(random.nextInt(maxHp - minHp) + minHp);
        setPower(random.nextInt(maxPower - minPower) + minPower);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public abstract void kick(Character c);

    protected void kickHp(Character c, int range){
        c.setHp(c.getHp() - random.nextInt(range));
    }

    public boolean isAlive(){
        return this.getHp() > 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + '{' +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
