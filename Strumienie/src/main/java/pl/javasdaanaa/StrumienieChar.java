package pl.javasdaanaa;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StrumienieChar {

    public static void main(String[] args) {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("someFileReader.txt");
            outputStream = new FileWriter("secondCopied.txt");

            int c;
            while((c = inputStream.read()) != -1) {
                    outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
