package sub;

import static sub.Attribute.*;

public class StoneStick extends Weapon{
    StoneStick(int x,int y,int identifier,boolean isOnMap){
        super(4, SOIL, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1010;
    }
    @Override
    public String getName() {
        return "石の杖";
    }
}
