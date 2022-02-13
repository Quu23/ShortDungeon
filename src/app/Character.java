package app;

import static app.Direction.*;

// 全ての生き物の親クラス
public abstract class Character implements Entity{

    private int hitPoint;       //現在のHP
    private int maxHitPoint;    //最大HP
    private int specialPoint;   //現在のSP。abilityを使う時に消費する。
    private int maxSpecialPoint;//最大SP
    private int attackPoint;    //攻撃力
    private int masicPoint;     //魔法攻撃力
    private int defencePoint;   //防御力
    
    Character(int maxhp,int maxsp,int ap,int mp,int dp){
        this.setMaxHitPoint(maxhp);
        this.setHitPoint(this.getMaxHitPoint());
        this.setMaxSpecialPoint(maxsp);
        this.setSpecialPoint(this.getMaxSpecialPoint());
        this.setAttackPoint(ap);
        this.setMasicPoint(mp);
        this.setDefencePoint(dp);
    }

    public int getHitPoint() {
        return this.hitPoint;
    }
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }
    public int getMaxHitPoint() {
        return this.maxHitPoint;
    }
    public void setMaxHitPoint(int maxHitPoint) {
        this.maxHitPoint = maxHitPoint;
    }
    public int getSpecialPoint() {
        return this.specialPoint;
    }
    public void setSpecialPoint(int specialPoint) {
        this.specialPoint = specialPoint;
    }
    public int getMaxSpecialPoint() {
        return this.maxSpecialPoint;
    }
    public void setMaxSpecialPoint(int maxSpecialPoint) {
        this.maxSpecialPoint = maxSpecialPoint;
    }
    public int getAttackPoint() {
        return this.attackPoint;
    }
    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
    public int getMasicPoint() {
        return this.masicPoint;
    }
    public void setMasicPoint(int masicPoint) {
        this.masicPoint = masicPoint;
    }
    public int getDefencePoint() {
        return this.defencePoint;
    }
    public void setDefencePoint(int defencePoint) {
        this.defencePoint = defencePoint;
    }
    
    public void move(Direction dire){
        //TODO:座標位置から進めるかを判断し進めたら座標を進める。
        
    }
    abstract void attack(Character chara);
    abstract void ability(Character chara);
}
