package Item;

public class NormalPortion extends Portion{
    
    NormalPortion(int x,int y,int identifier,boolean isOnMap){
        super(10, x, y, identifier, isOnMap);
    }    

    @Override
    public int getId() {
        return 1015;
    }
    @Override
    public String getName() {
        return "普通のポーション";
    }
}
