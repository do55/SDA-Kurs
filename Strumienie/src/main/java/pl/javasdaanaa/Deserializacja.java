package pl.javasdaanaa;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Deserializacja {

    public static void main(String[] args) {

        //musimy castować, bo zwraca obiekt
        //możemy użyć transient przy zmiennej, żeby jej nieserializowac

        Something something = null;

        try (
                FileInputStream fileInputStream = new FileInputStream("serializowanyObiekt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
            ) {
            something = (Something) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserializowany obiekt: ");
        if (something != null) {
            System.out.println(something.getName());
            System.out.println(something.getYear());
        }
    }
}
