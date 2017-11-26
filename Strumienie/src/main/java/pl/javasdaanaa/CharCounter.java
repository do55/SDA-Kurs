package pl.javasdaanaa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharCounter {


    public static int countChars(String fileName, char whatever) {
        int counter = 0;
        try (
                BufferedReader bufferedReader = new BufferedReader((new FileReader(fileName)));
        ) {
            int c;
        while ((c = bufferedReader.read()) != -1) {
            char someChar = (char) c;
            if(someChar == whatever) {
                counter++;
            }
        }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter;
    }
}