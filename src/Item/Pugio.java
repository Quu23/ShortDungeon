package Item;

import static chara.Attribute.*;

public class Pugio extends Weapon {//短剣
    
    public Pugio(int x,int y,int identifier,boolean isOnMap){
        super(2,AQUA,x,y,identifier,isOnMap);
    }
    @Override
    public int getId() {
        return 1004;
    }
    @Override
    public String getName() {
        return "濡れた短剣";
    }
    
}
