package app;

public abstract class Monster extends Character {
    @Override
    void attack(Character chara) {
        chara.setMaxHitPoint(chara.getHitPoint()-(this.getAttackPoint()));
    }
}
