package sub;

import static sub.Attribute.*;

public class Charmander extends Weapon{
    Charmander(){
        super(3, FIRE);
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
