package jp.ac.uryukyu.ie.e205714;


/**
 * LivigThingクラスです。
 * String name  //生き物の名前
 * int hitPoint //生き物の体力
 * int attack   //生き物の攻撃力
 * boolean dead //生き物の生死状態　true=死亡
 * を表します。
 */
public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタです。生き物の名前、体力、攻撃力を設定する。
     * @param name
     * @param hitPoint
     * @param attack
     */
    public LivingThing(String name,int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead=false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    /**
     * 生き物に対して攻撃を行うメソッドです。
     * ダメージは乱数によって変動します。
     * ダメージ処理自体はoppnents.wounded(damage)が行います
     * @param oppnents 攻撃の対象
     */
    public void attack(LivingThing oppnents){
        int damage = (int)(Math.random() * attack);
        if(dead==false){
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, oppnents.getName(), damage);
        oppnents.wounded(damage);
        }
    }

    /**
     * 生き物自身が攻撃を受けた場合のダメージ処理をするメソッド
     * damageをhitPointから引き、０より少なくなれば死亡判定とする。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

        /**
     * getterメソッドです。
     * 生き物の生死判定を返します。
     * falseならば生存、trueならば死亡を表します。
     * @return フィールド変数deadの値
     */
    public boolean isDead(){
        return this.dead;
    }

    /**
     * getterメソッドです。
     * 生き物の名前を返します。
     * @return フィールド変数nameの値
     */
    public String getName(){
        return this.name;
    }

    /**
     * getterメソッドです。
     * 生き物のhitPointの値を返します。
     * @return フィールド変数hitPointの値
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * getterメソッドです。
     * 生き物のattackの値を返します。
     * @return フィールド変数attackの値
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * setterメソッドです。
     * _nameをフィールド変数nameに入れます。
     * @param _name 生き物の新たな名前 
     */
    public void setName(String _name){
        this.name=_name;
    }

    /**
     * setterメソッドです。
     * _hitPointをフィールド変数hitPointに入れます。
     * @param _hitPoint 生き物の新たなHP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint=_hitPoint;
    }

    /**
     * setterメソッドです。
     * _attackをフィールド変数attackに入れます。
     * @param _attack 生き物の新たな攻撃力
     */
    public void setAttack(int _attack){
        this.attack=_attack;
    }
    /**
     * setterメソッドです。
     * _deadをフィールド変数deadに入れます。
     * @param _dead 生き物の生死
     */
    public void setDead(boolean _dead){
        this.dead=_dead;
    }
}
