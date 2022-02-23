package Item;

import static chara.Attribute.*;

public class Cosmos extends Weapon{
    // 最強の武器
    Cosmos(int x,int y,int identifier,boolean isOnMap){
        super(19, MASTER, x, y, identifier, isOnMap);
    }
    @Override
    public int getId() {
        return 1014;
    }
    @Override
    public String getName() {
        return "コスモス";
    }
}
