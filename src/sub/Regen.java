package sub;

import static sub.Attribute.*;

public class Regen extends Weapon{//やり
    Regen(int x,int y,int identifier,boolean isOnMap){
        super(4, NORMAL,x,y,identifier,isOnMap);
    }
    @Override
    public int getId() {
        return 1006;
    }
    @Override
    public String getName() {
        return "やり";
    }
}
