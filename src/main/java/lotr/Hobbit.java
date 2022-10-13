package lotr;

public class Hobbit extends Character{
    public Hobbit(){
        super(3, 0);
    }

    void toCry(){
        System.out.println("*hobbitcrying*");
    }

    @Override
    public void kick(Character c) {
        toCry();
    }
}
