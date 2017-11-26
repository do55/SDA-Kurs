package pl.javasdaanaa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class KlasaFile {

    public static void main(String[] args) {

        Path path = Paths.get("copiedFile.txt");
        //Paths to klasa utilowa i nie musimy tworzyć obiektu Paths new Paths, java robi to za nas
        //path to obiekt

        List<String> strings = new ArrayList<>();

        try {
            strings = Files.readAllLines(path);
        } catch (IOException e ) {
            e.printStackTrace();
        }

        for (String s : strings) {
            System.out.println(s);
        }

        strings.forEach(s -> System.out.println(s));
        //:: za każdym razem razem iterujemy po stringach i ta metoda przyjmuje tylko stringi, więc nie ma sensu
        //pisac, co (wywołanie metody po referencji)
        strings.forEach(System.out::println);
    }
}
