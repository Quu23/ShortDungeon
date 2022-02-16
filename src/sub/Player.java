package sub;

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
    Player(int maxhp,int maxsp,int ap,int mp,int dp,int x,int y){
        super(maxhp, maxsp, ap, mp, dp,x,y);
        this.level=1;
        this.weapon = new Fist();
    }

}
