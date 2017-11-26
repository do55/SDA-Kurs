package pl.sdaMSuwalaConcurrency;

public class PrinterMain {

    public static void main(String[] args) {

        Printer printer = new Printer();

        PrinterThread t1 = new PrinterThread(printer, "wątek 1");
        PrinterThread t2 = new PrinterThread(printer, "wątek 2");
        PrinterThread t3 = new PrinterThread(printer, "wątek 3");
        PrinterThread t4 = new PrinterThread(printer, "wątek 4");
        PrinterThread t5 = new PrinterThread(printer, "wątek 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
