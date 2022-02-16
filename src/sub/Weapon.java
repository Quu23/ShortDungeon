package sub;


public abstract class Weapon implements Item {
    private int damage;
    private Attribute attribute;

    Weapon(int damage,Attribute attribute){
        this.setDamage(damage);
        this.setAttribute(attribute);
    }

    public int getDamage() {
        return this.damage;
    }
    private void setDamage(int damage) {
        this.damage = damage;
    }
    public Attribute getAttribute() {
        return this.attribute;
    }
    private void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
