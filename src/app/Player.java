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
    public void attack(Character chara) {
        chara.setMaxHitPoint(chara.getHitPoint()-(this.getAttackPoint())+this.weapon.getDamage());
    }
    @Override
    public int getId() {
        return 1000;
    }
    Player(int maxhp,int maxsp,int ap,int mp,int dp){
        super(maxhp, maxsp, ap, mp, dp);
    }

}
