package pl.mj.sda.javaadv.rest.uslugi;

import java.util.UUID;

public class Zamowienie {

    private UUID id;

    public Zamowienie() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
