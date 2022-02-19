package sub;

import static sub.Attribute.*;

public class Regen extends Weapon{//やり
    Regen(){
        super(4, NORMAL);
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
