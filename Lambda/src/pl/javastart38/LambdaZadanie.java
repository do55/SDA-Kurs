package pl.javastart38;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaZadanie {

    public static void main(String[] args) {

        Random r = new Random();
        List<Integer> numbers = new ArrayList<>();

        addNumbers(numbers, 10, () -> r.nextInt(100));
        printNumbers(numbers, p -> System.out.print(p + " "));
        System.out.println(" ");
        evenNumbers(numbers, p -> p % 2 == 0);
        printNumbers(numbers, p -> System.out.print(p + " "));
    }

    private static <T> void addNumbers(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }

    }
    private static <T> void printNumbers(List<T> list, Consumer<T> cons) {
        for (T t: list) {
            cons.accept(t);
        }
    }

    private static <T> void evenNumbers(List<T> list, Predicate<T> pre) {
        Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T tmp = it.next();
                if (pre.test(tmp)) {
                    it.remove();
            }
        }
    }
}
