package jp.ac.uryukyu.ie.e165701;

/**
 * Created by e165701 on 2016/11/22.
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
    @Override
    public void attack(LivingThing opponent) {
        if (getDead() == false) {
            int damage = (int) (Math.random() * getAttack());
            int ran = (int)(Math.random()*10);
            if(damage == 0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
            }
            else if (ran <= 3) {
                damage = damage * 2;
                System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            }
            opponent.wounded(damage);
        }
    }
}
