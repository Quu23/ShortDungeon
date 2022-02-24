package Item;

import chara.Player;

public class HyperPortion extends Portion{
    
    HyperPortion(int x,int y,int identifier,boolean isOnMap){
        super(40, x, y, identifier, isOnMap);        
    }
    @Override
    public int getId() {
        return 1017;
    }
    @Override
    public String getName() {
        return "はいぱーポーション";
    }
    @Override
    public void usePortion(Player player) {
        player.setHitPoint(player.getHitPoint()+this.getEffectPoint());
    }
}
