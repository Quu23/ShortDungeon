package chara;

public abstract class Monster extends Character {
    @Override
    void attack(Character chara) {
        chara.setMaxHitPoint(chara.getHitPoint()-(this.getAttackPoint()));
    }
    Monster(int maxhp,int maxsp,int ap,int mp,int dp,int x,int y){
        super(maxhp, maxsp, ap, mp, dp,x,y);
    }
}
