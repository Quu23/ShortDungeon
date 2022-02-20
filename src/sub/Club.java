package sub;

import static sub.Attribute.*;
public class Club extends Weapon{
    Club(int x,int y,int identifier,boolean isOnMap) {
		super(1,WIND,x,y,identifier,isOnMap);
	}
	@Override
    public int getId() {
        return 1002;
    }
    @Override
    public String getName() {
        return "こん棒";
    }
}
