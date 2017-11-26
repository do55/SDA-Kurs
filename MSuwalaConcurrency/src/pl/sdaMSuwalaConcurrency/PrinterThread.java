package pl.sdaMSuwalaConcurrency;

public class PrinterThread extends Thread {

    private Printer printer;


    public PrinterThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.print(getName());

        }
    }



