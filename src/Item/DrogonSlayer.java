package Item;

import static chara.Attribute.*;

public class DrogonSlayer extends Weapon {
    //備考：ボス層のひとつ前の層にランダムで出現させる
    
    public DrogonSlayer(int x,int y,int identifier,boolean isOnMap){
        super(10, MASTER, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1013;
    }
    @Override
    public String getName() {
        return "ドラゴンスレイヤー";
    }
}
