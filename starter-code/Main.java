import java.util.List;
import java.util.ArrayList;
/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {

    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        List<Monster> monsterList = new ArrayList<>();
        monsterList.add(new Zombie(30,50));
        monsterList.add(new Dragon(5000,7));

        //TODO: Loop through the array of Monsters, printing out something for each Monster
        for(Monster m : monsterList){
            m.aboutMe();
        }
    }
}
