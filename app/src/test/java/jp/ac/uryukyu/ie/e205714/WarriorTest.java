package jp.ac.uryukyu.ie.e205714;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test
    void attackTest() {
        int defaultSlimeHp = 100;
        int attackCount=0;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, 10);
        Enemy slime = new Enemy("テストスライム", defaultSlimeHp, 0);
        for(int i=0;i<3;i++){
            demoWarrior.attackWithWeponSkill(slime);
            if(demoWarrior.attack*1.5==defaultSlimeHp-slime.hitPoint){
                attackCount++;
            }
            slime.setHitPoint(defaultSlimeHp);
        }
        assertEquals(3,attackCount);
    }
}
