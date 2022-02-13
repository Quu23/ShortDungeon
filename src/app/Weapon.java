package app;

public abstract class Weapon implements Item {
    private int damage;

    public int getDamage() {
        return this.damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
