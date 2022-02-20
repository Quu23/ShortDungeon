package sub;

import java.util.Objects;

public abstract class Item implements Entity{
    
    private int x;          //マップ上になければx,yにNULLを代入する
    private int y;          
    private boolean isOnMap;//マップ上にあるか？もしなければプレイヤーが持っている
    private int identifier;

    Item(int x,int y,int identifier,boolean isOnMap){
        this.setIdentifier(identifier);
        this.setOnMap(isOnMap);

        if(this.getIsOnMap()){
            x=NULL;
            y=NULL;    
        }
        this.setX(x);
        this.setY(y);
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getIdentifier() {
        return identifier;
    }
    private void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
    private boolean getIsOnMap(){
        return isOnMap;
    }
    public void setOnMap(boolean isOnMap) {
        this.isOnMap = isOnMap;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null)return false;
        if(obj==this)return true;
        if(!(obj instanceof Item))return false;
        Item item = (Item)obj;
        if(!(this.getId()==item.getId()&&this.getName().equals(item.getName())&&this.getIdentifier()==item.getIdentifier()))return false;
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getId(),this.getIdentifier(),this.getName());
    }
    
    abstract public int getId();
    abstract public String getName();
}
