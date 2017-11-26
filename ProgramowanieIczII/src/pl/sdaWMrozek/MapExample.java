package pl.sdaWMrozek;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person person = new Person("Jan", "Zysk", JobPosition.ANALYST, "Woronicza", 17, "92017152");
        Person person1 = new Person("Asia", "Kowalski", JobPosition.ANALYST, "Wiejska", 25, "765874638");
        Person person2 = new Person("Piotr", "Olo", JobPosition.SENIOR_DEVELOPER, "Orla", 17, "990765365");
        Person person3 = new Person("Arkadiusz", "Iksiński", JobPosition.TESTER, "Anielewicza", 21, "82555152");
        Person person4 = new Person("Oskar", "Kowalski", JobPosition.MANAGER, "Woronicza", 12, "02635544");

        Map<String, Person> map = new HashMap<>();

        map.put(person.getName(), person);
        map.put(person1.getName(), person1);
        map.put(person2.getName(), person2);
        map.put(person3.getName(), person3);
        map.put(person4.getName(), person4);

        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(String.format("Klucz %s ,wartość %s", entry.getKey(), entry.getValue().toString()));
        }

        System.out.println(">>>>>>>>>>>>>>>");

        for (String key : map.keySet()) {
            System.out.println(String.format("Klucz %s, wartość %s", key, map.get(key).toString()));
        }

        System.out.println("<<<<<<<<<<<,");

        for (Person p : map.values()) {
            System.out.println(String.format("Wartość %s", p.toString()));
        }

        Person p = map.get("Jan");

        boolean ifExists = map.containsKey("Klucz przykładowy");
        boolean valueExists = map.containsValue(person2);

        Map<String, Person> map1 = new HashMap<>();
        map1.put(person.getPesel(), person);
        map1.put(person1.getPesel(), person1);
        map1.put(person2.getPesel(), person2);
        map1.put(person3.getPesel(), person3);
        map1.put(person4.getPesel(), person4);

        //młodsze 25
        //nazwiska tylko Kowalski

    }
}
