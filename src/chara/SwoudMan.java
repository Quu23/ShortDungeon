package chara;

public class SwoudMan extends Player {
    //  ソードマン　攻撃力が高い
    @Override
    public void ability(Character chara) {

        for(int i=0;i<getAttackCount();i++){
            this.attack(chara);     
        }
    }
    public SwoudMan(int x,int y){
        super(/*maxhp=*/15,/*maxsp=*/3,/*ap=*/5,/*map=*/1,/*dp=*/4,x,y);
    }

    @Override
    public void levelUp() {
        // ステータスの上昇

        this.setLevel(this.getLevel()+1); // レベルの上昇

        this.setMaxHitPoint(this.getMaxHitPoint()+3);
        this.setMaxSpecialPoint(this.getMaxSpecialPoint()+1);
        this.setAttackPoint(this.getAttackPoint()+3);
        this.setMasicPoint(this.getMasicPoint()+1);
        this.setDefencePoint(this.getDefencePoint()+2);
        
        // HPとSPの回復
        this.setHitPoint(this.getMaxHitPoint());
        this.setSpecialPoint(this.getMaxSpecialPoint());
    }   
    private int getAttackCount() {

        int lv = this.getLevel(); //this.level()って書くのめんどいから説明変数を使う。
        
        if(lv < 4){
            return 3;
        }else if(lv < 8){
            return 5;
        }else if(lv < 11){
            return 7;
        }else{
            return 10;
        }

    }
}
