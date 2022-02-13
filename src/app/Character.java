package app;

public abstract class Character {
    protected int ID;
    int hitPoint;
    int maxHitPoint;
    int specialPoint;
    int maxSpecialPoint;
    int attackPoint;
    int masicPoint;
    int defencePoint;
    Character(int hp,int maxhp,int sp,int maxsp,int ap,int mp,int dp){
        

    }
    public int getID() {
        return this.ID;
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
}
