package Item;

import static chara.Attribute.*;

public class ButterflyKnife extends Weapon {
    
    public ButterflyKnife(int x,int y,int identifier,boolean isOnMap){
        super(4, WIND, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1009;
    }
    @Override
    public String getName() {
        return "バタフライナイフ";
    }
}
