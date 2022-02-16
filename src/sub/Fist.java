package sub;

import static sub.Attribute.*;
public class Fist extends Weapon{
    Fist(){
        super(0,DROP);
    }
    @Override
    public int getId() {
        return 1001;
    }
}
