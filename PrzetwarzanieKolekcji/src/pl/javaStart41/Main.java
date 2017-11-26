package pl.javaStart41;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.jfr.events.FileReadEvent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        final String FILE_NAME = "loremipsum.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME))) {
            List<String> newList = new ArrayList<>();
            String newLine = null;
            while ((newLine = bufferedReader.readLine()) != null) {
                newList.addAll(Arrays.asList(newLine.split(" ")));

                newList = newList.stream()
                        .map(x -> x.replaceAll(",", "").replaceAll("\\.", ""))
                        .collect(Collectors.toList());

                long countWords = newList.stream()
                        .filter(s -> s.startsWith("s"))
                        .peek(s -> System.out.println(s + " "))
                        .count();
                System.out.println();

                long count5Words = newList.stream()
                        .filter(s -> s.length() == 5)
                        .peek(s -> System.out.println(s + " "))
                        .count();
                System.out.println();

                System.out.println("Ilość słów na s: " + countWords);
                System.out.println("Ilość słów 5-literowych; " + count5Words);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
