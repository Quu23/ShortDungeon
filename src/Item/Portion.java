package Item;

public abstract class Portion extends Item{

    int effectPoint;

    Portion(int x,int y,int identifier,boolean isOnMap){
        super(x, y, identifier, isOnMap);
        setEffectPoint(effectPoint);
    }
    final public int getEffectPoint() {
        return effectPoint;
    }
    final private void setEffectPoint(int effectPoint) {
        this.effectPoint = effectPoint;
    }

}
