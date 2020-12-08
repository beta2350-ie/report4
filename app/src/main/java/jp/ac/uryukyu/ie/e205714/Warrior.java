package jp.ac.uryukyu.ie.e205714;

public class Warrior extends Hero{
    public Warrior(String name,int hitPoint,int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing oppnents){
        int damage = (int)(1.5* attack);
        if(dead==false){
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, oppnents.getName(), damage);
        oppnents.wounded(damage);
        }
    }
}
