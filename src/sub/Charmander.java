package sub;

import static sub.Attribute.*;

public class Charmander extends Weapon{
    Charmander(int x,int y,int identifier,boolean isOnMap){
        super(3, FIRE,x,y,identifier,isOnMap);
    }

    @Override
    public int getId() {
        return 1007;
    }
    @Override
    public String getName() {
        return "サラマンダー";
    }
}
