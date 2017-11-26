package pl.mj.sda.javaadv.rest.uslugi;

import java.util.UUID;

public interface ZamowienieInterface {

    Zamowienie stworz();
    Zamowienie pokazZamowienie(UUID idZamowienia);
    Zamowienie dodajProdukt(UUID idZamowienia, int idProdukt, int ilosc);
    Zamowienie usunProdukt(UUID idZamowienia, int idProdukt, int ilosc);
    void zrealizuj(UUID idZamowienia);
    void anuluj(UUID idZamowienia);
}
