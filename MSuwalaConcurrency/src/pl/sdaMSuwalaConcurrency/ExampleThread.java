package pl.sdaMSuwalaConcurrency;

public class ExampleThread {

    public static void main(String[] args) {

        System.out.println("przed zaśnięciem");
        try {
            Thread.sleep(10000); // 10 sekund, po 10 sekundach wchodzi do kolejki
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("po zaśnięciu");

    }
}
