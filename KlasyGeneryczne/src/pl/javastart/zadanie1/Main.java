package pl.javastart.zadanie1;


public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
        Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        Main.printPair(p1);
        Main.printPair(p2);
        Main.printPair(p3);
    }

    static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("<" + pair.getT() + " ; " + pair.getV() + ">");
    }
}

