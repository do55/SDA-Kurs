package pl.sdacademy.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerCreatedSingleton instanceOne = EagerCreatedSingleton.getInstance();
        EagerCreatedSingleton instanceTwo = null;
        try {
            Constructor<EagerCreatedSingleton>[] constructors = (Constructor<EagerCreatedSingleton>[]) EagerCreatedSingleton.class.getDeclaredConstructors();
            for (Constructor<EagerCreatedSingleton> constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerCreatedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}