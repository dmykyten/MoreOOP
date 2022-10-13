package lotr;

import java.util.Random;

public class King extends Character{
    public King(){
        super(5,15, 5, 15);
    }

    @Override
    public void kick(Character c) {
        kickHp(c, getHp());
    }
}
