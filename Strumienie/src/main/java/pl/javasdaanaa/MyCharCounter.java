package pl.javasdaanaa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyCharCounter {

    public static int CharCounter(String fileName, char oneChar) {
        int counter = 0;
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                char someChar = (char) c;
                if (someChar == oneChar) {

                    counter++;
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter;
    }
}