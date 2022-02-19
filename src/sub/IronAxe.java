package sub;

import static sub.Attribute.*;

public class IronAxe extends Weapon{//鉄の斧
    @Override
    public int getId() {
        return 1005;
    }
    IronAxe(){
        super(6, NORMAL);
    }
    @Override
    public String getName() {
        return "鉄の斧";
    }
}
