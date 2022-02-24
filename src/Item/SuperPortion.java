package Item;

import chara.Player;

public class SuperPortion extends Portion {
    
    SuperPortion(int x,int y,int identifier,boolean isOnMap){
        super(25, x, y, identifier, isOnMap);
    }

    @Override
    public int getId() {
        return 1016;
    }
    @Override
    public String getName() {
        return "すーぱーポーション";
    }

    @Override
    public void usePortion(Player player) {
        player.setHitPoint(player.getHitPoint()+this.getEffectPoint());
    }
}
