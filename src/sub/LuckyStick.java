package sub;

import static sub.Attribute.*;

public class LuckyStick extends Weapon{
    LuckyStick(int x,int y,int identifier,boolean isOnMap){
        super(2, EXP, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1012;
    }
    @Override
    public String getName() {
        return "幸運の杖";
    }
}
