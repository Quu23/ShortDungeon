package app;

public abstract class Player extends Character {
    private int level;
    private Weapon weapon; 
    public int getLevel() {
        return this.level;
    }   
    public void setLevel(int level) {
        this.level = level;
    }
    public Weapon getWeapon() {
        return this.weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    void attack() {
        
    }
    @Override
    void move() {
        
    }
}
