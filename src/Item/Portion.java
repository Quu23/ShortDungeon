package Item;

import chara.Player;

public abstract class Portion extends Item{

    int effectPoint; //ポーションの効果値

    Portion(int effectPoint,int x,int y,int identifier,boolean isOnMap){
        super(x, y, identifier, isOnMap);
        setEffectPoint(effectPoint);
    }
    final public int getEffectPoint() {
        return effectPoint;
    }
    final private void setEffectPoint(int effectPoint) {
        this.effectPoint = effectPoint;
    }
    
    public abstract int getId();
    public abstract String getName();
    public abstract void usePortion(Player player);

}
