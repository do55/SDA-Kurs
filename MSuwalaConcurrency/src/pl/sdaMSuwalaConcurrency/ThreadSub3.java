package pl.sdaMSuwalaConcurrency;

public class ThreadSub3 extends Thread {

    public ThreadSub3(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }


    @Override
    public void run() {
        System.out.println("Wątek " + this.getName() + " rozpoczął działanie.");
        try {
            sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wątek " + this.getName() + " zakończył działanie.");
    }
}
