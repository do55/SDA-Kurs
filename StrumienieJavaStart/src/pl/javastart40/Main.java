package pl.javastart40;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numbers = numbers.stream()
                .filter(x -> x % 2 == 0 && x > 5)
                .collect(Collectors.toCollection(ArrayList::new));
        numbers.forEach(System.out::println);

        Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
            List<String> stringList = strings.map(String::toUpperCase)
                                             .peek(System.out::println)
                                             .collect(Collectors.toList());

   /*   Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);
        List<Integer> numbersNew = numStream.filter(x -> x % 2 == 0).limit(100).collect(Collectors.toList());
        numbersNew.forEach(x -> System.out.print(x + " "));
        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());
        squareNumbers.forEach(x -> System.out.print(x + " "));
        List<Integer> negativeNumbers = numStream.map(x -> -x).limit(100).collect(Collectors.toList());
        negativeNumbers.forEach(x -> System.out.println(x + " "));
*/

        Stream<Integer> numbersZadanie = Stream.iterate(0, x -> x + 1);
        List<Integer> numbersZad = numbersZadanie.filter(x -> x > 100 && x < 1000 && x % 5 == 0).limit(10)
                .map(x -> x * 3).collect(Collectors.toList());
        numbersZad.forEach(x -> System.out.println(x + " "));


    }
}
