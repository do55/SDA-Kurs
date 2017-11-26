package pl.javastart38;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Function<String, String> func = (String str) -> str.toLowerCase().trim();
        String original = " WIELKI NAPIS ";
        String lowerCaseTrim = func.apply(original);
        System.out.println(lowerCaseTrim);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Zygmunt", "Miłoszewski", 12));
        persons.add(new Person("Agatha", "Christie", 9));
        persons.add(new Person("Hercules", "Poirot", 65));
        persons.add(new Person("Bear", "Grylls", 43));
        persons.add(new Person("Harlan", "Coben", 51));


        consumeList(persons, p -> System.out.println(p));
        System.out.println(">>>");
        applyToList(persons, p -> {
            p.setAge(p.getAge() + 1);
            return p;
        });
        consumeList(persons, p -> System.out.println(p) );
        System.out.println(">>>");
        filterByPredicate(persons, p -> p.getAge() > 18);

    }

        private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
            for (T t: list) {
                consumer.accept(t);
            }

        }

        private static <T> void applyToList(List<T> list, Function<T,T> pre) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, pre.apply(list.get(i)));
        }
        }
        private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
        for (T t: list) {
            if (pre.test(t)) {
                System.out.println(t);
            }
        }
        }

    }

