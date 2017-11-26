package pl.javasdaanaa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //interface closeable

        try (FileInputStream fileInputStream = new FileInputStream("someFile.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("copiedFile.txt")
        ) {
            int s;
            // -1 znaczy, że skończył czytać plik
            while ((s = fileInputStream.read()) != -1) {
                fileOutputStream.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        int ch;
        System.out.println("Enter some text: ");
        try {
            while ((ch = System.in.read()) != '\n')
                System.out.println((char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
//to castowanie jest dlatego, że read() zwraca 7-bit ASCII code
    }
}
