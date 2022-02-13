package app;


public abstract class Character implements Entity{

    private int hitPoint;
    private int maxHitPoint;
    private int specialPoint;
    private int maxSpecialPoint;
    private int attackPoint;
    private int masicPoint;
    private int defencePoint;
    
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
    
    abstract void move();
    abstract void attack();
}
