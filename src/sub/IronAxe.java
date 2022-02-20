package sub;

import static sub.Attribute.*;

public class IronAxe extends Weapon{//鉄の斧
    @Override
    public int getId() {
        return 1005;
    }
    IronAxe(int x,int y,int identifier,boolean isOnMap){
        super(6, NORMAL,x,y,identifier,isOnMap);
    }
    @Override
    public String getName() {
        return "鉄の斧";
    }
}
