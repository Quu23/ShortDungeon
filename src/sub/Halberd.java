package sub;

import static  sub.Attribute.*;

public class Halberd extends Weapon {
    Halberd(int x,int y,int identifier,boolean isOnMap){
        super(5,NORMAL,x,y,identifier,isOnMap);
    }
        
    @Override
    public int getId() {
        return 1008;
    }
    @Override
    public String getName() {
        return"ハルバード";
    }
}
