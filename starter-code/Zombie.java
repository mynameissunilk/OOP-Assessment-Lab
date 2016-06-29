/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{

    public Zombie(int h, int d){
        super(h,d);
    }

    public void aboutMe(){
        System.out.println("I am a Zombie with " + this.getHealth() + " health and " + this.getDamage() + " damage!");
    }

}
