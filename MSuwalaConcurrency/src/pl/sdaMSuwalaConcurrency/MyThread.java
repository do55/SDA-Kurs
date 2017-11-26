package pl.sdaMSuwalaConcurrency;

public class MyThread extends Thread {

    //extends Thread, żeby nasza klasa mogłabyć wątkiem
    //metoda run - to, co umieścimy w tej metodzie będzie wykonywane w ramach wątku

    public MyThread(String name) {
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 20 ; i++) {
            System.out.println(getName() + " " + i);
        }
    }


}
