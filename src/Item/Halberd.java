package Item;

import static chara.Attribute.*;

public class Halberd extends Weapon {
    public Halberd(int x,int y,int identifier,boolean isOnMap){
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
