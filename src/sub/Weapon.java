package sub;

public abstract class Weapon implements Item {
    private int damage;
    Weapon(int damage){
        setDamage(damage);
    }

    public int getDamage() {
        return this.damage;
    }
    private void setDamage(int damage) {
        this.damage = damage;
    }
}
