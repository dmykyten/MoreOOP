package lotr;

import java.util.Random;

public class Knight extends Character{
    public Knight(){
        super(2, 12, 2, 12);
    }

    @Override
    public void kick(Character c) {
        kickHp(c, getPower());
    }
}
