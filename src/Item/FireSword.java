package Item;

import static chara.Attribute.*;

public class FireSword extends Weapon{
    public FireSword(int x,int y,int identifier,boolean isOnMap){
        super(7, FIRE, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1011;
    }
    @Override
    public String getName() {
        return "炎の剣";
    }
}
