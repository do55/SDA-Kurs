package pl.sdacademy.streams_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by maniek on 03.07.17.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(180, "blue", "m"));
        persons.add(new Person(150, "gray", "f"));
        persons.add(new Person(165, "blue", "f"));

        Stream<Person> stream = persons.stream();
        List<Person> list = stream.filter(b -> b.getSex().equals("f"))
                .filter(person -> person.getEyesColour().equals("blue"))
                .filter(person -> person.getHeight() > 200)
                .collect(Collectors.toList());
    }
}
