package jp.ac.uryukyu.ie.e205714;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    /**
     * getterメソッドです。
     * フィールド変数hitPointの値を返します。
     * @return フィールド変数hitPointの値
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * getterメソッドです。
     * フィールド変数attackの値を返します。
     * @return フィールド変数attackの値
     */
    public int getAttack(){
        return this.attack;
    }

    /**
     * setterメソッドです。
     * _nameをフィールド変数nameに入れます。
     * @param _name enemyの新たな名前 
     */
    public void setName(String _name){
        this.name=_name;
    }

    /**
     * setterメソッドです。
     * _hitPointをフィールド変数hitPointに入れます。
     * @param _hitPoint enemyの新たなHP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint=_hitPoint;
    }

    /**
     * setterメソッドです。
     * _attackをフィールド変数attackに入れます。
     * @param _attack enemyの新たな攻撃力
     */
    public void setAttack(int _attack){
        this.attack=_attack;
    }
    /**
     * setterメソッドです。
     * _deadをフィールド変数deadに入れます。
     * @param _dead enemyの生死
     */
    public void setDead(boolean _dead){
        this.dead=_dead;
    }

}