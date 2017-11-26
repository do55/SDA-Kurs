package pl.javasdaanaa;

import java.time.LocalDate;
import java.util.function.Function;

public class InterfFunkc {

    public static void main(String[] args) {

        //F przekazujemy, T zwracamy

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        Converter<Integer, String> converter1 = (from) -> String.valueOf(from);
        String converted1 = converter1.convert(555);
        System.out.println(converted1);

        //można from.to String lub String.valueOf(from)

        Converter<LocalDate, String> converter2 = (from) -> from.toString();
        String converted2 = converter2.convert(LocalDate.now());
        System.out.println(converted2);

        Function<Integer, Integer> addTen = i -> i + 10;
        Function<Integer, Integer> multiplyByTwo = i -> i * 2;
        Function<Integer, String> returnWynikTo = i -> "wynik to: " + i;


        Function<Integer, String> multiAndAdd = addTen.andThen(multiplyByTwo).andThen(returnWynikTo);
        String result = multiAndAdd.apply(24);
        System.out.println(result);

    }
}