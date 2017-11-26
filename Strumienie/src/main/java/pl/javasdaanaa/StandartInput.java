package pl.javasdaanaa;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Closeable;


public class StandartInput {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Wprowadź nazwę pliku: ");
            String firstLine = br.readLine();
            System.out.println("Jaki znak chcesz policzyć? ");
            int secondLine = br.read();

            System.out.println(CharCounter.countChars(firstLine, (char) secondLine));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

