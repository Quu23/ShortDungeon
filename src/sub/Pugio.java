package sub;

import static sub.Attribute.*;

public class Pugio extends Weapon {//短剣
    Pugio(){
        super(2,AQUA);
    }
    @Override
    public int getId() {
        return 1004;
    }
    
}
