package Item;

import static chara.Attribute.*;
public class Fist extends Weapon{
    public Fist(){
        super(/*damage=*/0,DROP,/*identifier=*/0,/*x=*/NULL,/*y=*/NULL,false);//こぶしはマップ上にはない！！！
    }
    @Override
    public int getId() {
        return 1001;
    }
    @Override
    public String getName() {
        return "素手";
    }    
}
