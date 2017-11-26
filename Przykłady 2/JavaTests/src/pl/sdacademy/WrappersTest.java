package pl.sdacademy;

import java.util.HashMap;
import java.util.Map;

public class WrappersTest {

    public static void main(String[] args) {
        Integer i = 100;
        Integer j = i;
        i += 5;
        System.out.println("i = " + i + " j = " + j);

        final String kKey = "i";
        final String lKey = "l";
        Integer k = 5;
        Integer l = 10;
        Map<String, Integer> mapOfIntegers = new HashMap<>();
        mapOfIntegers.put(kKey, k);
        mapOfIntegers.put(lKey, l);


        System.out.println("l = " + l);
        System.out.println("l from map: " + mapOfIntegers.get(lKey));

        k++;
        k++;
        System.out.println("k = " + k);
        System.out.println("k from map: " + mapOfIntegers.get(kKey));
    }

}
