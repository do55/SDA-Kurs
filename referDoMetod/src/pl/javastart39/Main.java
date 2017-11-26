package pl.javastart39;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Zbyszek ", "Józia ", "Ania ", "Misia ", "Miś ");
        printNames(names, System.out::print);
        System.out.println(" ");
        Collections.sort(names, String::compareToIgnoreCase);
        printNames(names, System.out::print);

    }

    private static <T> void printNames(List<T> list, Consumer<T> cons) {
        for (T t: list) {
            cons.accept(t);
        }
    }


}


