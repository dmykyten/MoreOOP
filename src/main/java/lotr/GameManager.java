package lotr;

import java.util.Dictionary;
import java.util.Random;

public class GameManager {
    private static Random random = new Random();
    private static String[] TypeOfAttack = {"violently", "aggresively", "defensively"};
    private static String[] TypeOfCharacter = {"Good", "Evil", "Greedy"};
    public static void fight(Character c1, Character c2) {
        String desc1 = TypeOfCharacter[random.nextInt(3)] + c1.getClass().getSimpleName();
        String desc2 = TypeOfCharacter[random.nextInt(3)] + c2.getClass().getSimpleName();
        boolean indicator = true;
        while (c1.isAlive() && c2.isAlive()) {
            if (indicator) {
                System.out.println(desc1 + "[" + c1.toString() +"] " + TypeOfAttack[random.nextInt(3)] + " attacked " + desc2 + "[" + c2.toString() +"] ");
                c1.kick(c2);
            } else {
                System.out.println(desc2 + "[" + c2.toString() +"] " + TypeOfAttack[random.nextInt(3)] + " attacked " + desc1  + "[" + c1.toString() +"] ");
                c2.kick(c1);
            }
            indicator = !indicator;
        }
        if(c1.isAlive()){
            System.out.println(desc1 + " is alive!");
        }else{
            System.out.println(desc2 + " is alive!");
        }
    }
}
