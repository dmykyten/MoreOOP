package lotr;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners.*;

public class CharacterFactory{
    private static Random random = new Random();


    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subCharacters = reflections.getSubTypesOf(Character.class);
        int randInt = random.nextInt(subCharacters.size());
        // i dont like code below
        // please, suggest something better mr.Dobosevych
        Object[] a = subCharacters.toArray();
        Class cl = (Class)a[randInt];
        try {
            Object instance = cl.getDeclaredConstructor().newInstance();
            return (Character)instance;
        } catch (InstantiationException | InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
