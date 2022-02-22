package sub;


public abstract class Weapon extends Item {
    
    private int damage;
    private Attribute attribute;

    Weapon(int damage,Attribute attribute,int x,int y,int identifier,boolean isOnMap){
        super(x, y,identifier,isOnMap);
        this.setDamage(damage);
        this.setAttribute(attribute);
    }

    final public int getDamage() {
        return this.damage;
    }
    final private void setDamage(int damage) {
        this.damage = damage;
    }
    final public Attribute getAttribute() {
        return this.attribute;
    }
    final private void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
