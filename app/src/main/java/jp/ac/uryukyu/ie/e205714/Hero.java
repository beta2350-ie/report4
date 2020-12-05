package jp.ac.uryukyu.ie.e205714;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    
    public Hero (String name, int maximumHP, int attack) {
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
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
     * @param _name heroの新たな名前
     */
    public void setName(String _name){
        this.name=_name;
    }

    /**
     * setterメソッドです。
     * _hitPointをフィールド変数hitPointに入れます。
     * @param _hitPoint heroの新たなHP
     */
    public void setHitPoint(int _hitPoint){
        this.hitPoint=_hitPoint;
    }

    /**
     * setterメソッドです。
     * _attackをフィールド変数attackに入れます。
     * @param _attack heroの新たな攻撃力
     */
    public void setAttack(int _attack){
        this.attack=_attack;
    }

    /**
     * setterメソッドです。
     * _deadをフィールド変数deadに入れます。
     * @param _dead heroの生死
     */
    public void setDead(boolean _dead){
        this.dead=_dead;
    }
}