package pl.javasdaanaa;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    //klasa something implementuje Serializable
    //i tutaj chcemy zapisac obiekt, więc go serializujemy i zapisujemy pod nazwą serializowany obiekt

    public static void main(String[] args) {

        Something something = new Something();
        something.setName("whatever");
        something.setYear(1992);

        try (
            FileOutputStream fileOutputStream = new FileOutputStream("serializowanyObiekt");
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)
            ) {
                out.writeObject(something);
            } catch (IOException e) {
            e.printStackTrace();
            }
        }
    }

