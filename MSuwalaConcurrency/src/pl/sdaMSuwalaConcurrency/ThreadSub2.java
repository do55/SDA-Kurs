package pl.sdaMSuwalaConcurrency;

import static java.lang.Thread.sleep;

public class ThreadSub2 extends Thread{

    public ThreadSub2(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    @Override
    public void run() {
        System.out.println("Wątek " + this.getName() + " rozpoczął działanie.");
        try {
            sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wątek " + this.getName() + " zakończył działanie.");
    }
}
