package Item;

import chara.Player;

public class NormalPortion extends Portion{
    
    NormalPortion(int x,int y,int identifier,boolean isOnMap){
        super(10, x, y, identifier, isOnMap);
    }    

    @Override
    public int getId() {
        return 1015;
    }
    @Override
    public String getName() {
        return "フツ-のポーション";
    }
    @Override
    public void usePortion(Player player) {
        player.setHitPoint(player.getHitPoint()+this.getEffectPoint());
    }
}
