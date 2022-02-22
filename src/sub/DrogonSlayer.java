package sub;

import static sub.Attribute.*;

public class DrogonSlayer extends Weapon {
    //備考：最強の武器。ボス層のひとつ前の層にランダムで出現させる
    
    DrogonSlayer(int x,int y,int identifier,boolean isOnMap){
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
