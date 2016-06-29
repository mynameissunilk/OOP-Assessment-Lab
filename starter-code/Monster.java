/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    private int health;
    private int damage;

    public Monster(int h, int d){
        health = h;
        damage = d;
    }
    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 

    public void setHealth(int h){
        health = h;
    }

    public int getHealth() { return health; }

    public void setDamage(int d){
        damage = d;
    }

    public int getDamage(){return damage; }

    public abstract void aboutMe();
}
