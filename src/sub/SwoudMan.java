package sub;

public class SwoudMan extends Player {
    @Override
    public void ability(Character chara) {
        for(int i=0;i<3;i++){
            this.attack(chara);
        }
    }
    SwoudMan(int maxhp,int maxsp,int ap,int mp,int dp,int x,int y){
        super(maxhp,maxsp,ap,mp,dp,x,y);
    }   
}
