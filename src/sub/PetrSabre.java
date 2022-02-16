package sub;

import static sub.Attribute.*;

public class PetrSabre extends Weapon {//石の剣
    
    PetrSabre(){
        super(3,SOIL);
    }     
    @Override
    public int getId() {
        return 1003;
    }
}
