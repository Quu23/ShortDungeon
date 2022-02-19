package sub;

import static sub.Attribute.*;
public class Club extends Weapon{
    Club() {
		super(1,WIND);
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
