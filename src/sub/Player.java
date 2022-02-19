package sub;

import java.util.ArrayList;
import java.util.List;

public abstract class Player extends Character {
    
    private int level;
    private Weapon weapon; 
    private List<Item> inventory;//プレイヤーのインベントリ,サイズは6こ

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
    public Item getInventory(int index) {
        return inventory.get(index);
    }
    public void removeItem(int index) {
        inventory.remove(index);
    }
    public void removeItem(Item item) {
        inventory.remove(item);
    }
    public void setInventory(Item item) {
        if(item!=null&&inventory.size()<6)this.inventory.add(item);
    }

    @Override
    public void attack(Character chara) {
        chara.setMaxHitPoint(chara.getHitPoint()-(this.getAttackPoint())+this.weapon.getDamage());
    }
    @Override
    public int getId() {
        return 1000;
    }
    @Override
    public String getName() {
        return "キャラ";
    }

    Player(int maxhp,int maxsp,int ap,int mp,int dp,int x,int y){
        super(maxhp, maxsp, ap, mp, dp,x,y);
        this.level=1;
        this.weapon = new Fist();
        this.inventory=new ArrayList<>();
    }


}
