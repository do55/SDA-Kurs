package pl.javastart.zadanie1;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "BigInteger.txt";
        File file = new File(fileName);
        int a = 0, b = 0, c = 0;
        BigInteger aBig = null, bBig = null;

        boolean fileExists = file.exists();

        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się stworzyć pliku");
            }
        }
        if (fileExists) {
            System.out.println("Plik " + fileName + " już istnieje lub został utworzony");
        }
        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr);
                ) {
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            aBig = new BigInteger(br.readLine());
            bBig = new BigInteger(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono takiego pliku");
        } catch (IOException e) {
            System.out.println("Błąd odczytu danych");
        }
        System.out.println("Wynik intów: " + (a+b+c));
        System.out.println("Wynik BigIntegerów: " + (aBig.add(bBig)));


    }
}