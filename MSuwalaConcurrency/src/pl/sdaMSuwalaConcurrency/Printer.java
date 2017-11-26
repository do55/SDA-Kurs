package pl.sdaMSuwalaConcurrency;

public class Printer {

    public  void print(String s) { //synchronizujemy nasz zasob, scheduler losuje bez naszej ingerencji
        System.out.println("Poza blokiem synchronizowanym " + s);
 //       synchronized (Printer.class) { PRZY METODZIE STATYCZNEJ
            synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + s);
            }
        }
    }
}
