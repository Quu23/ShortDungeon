package Item;

import static chara.Attribute.*;

public class PetrSabre extends Weapon {//石の剣
    
    public PetrSabre(int x,int y,int identifier,boolean isOnMap){
        super(3,SOIL,x,y,identifier,isOnMap);
    }     
    @Override
    public int getId() {
        return 1003;
    }
    @Override
    public String getName() {
        return "石の剣";
    }
}
