package pl.sdaMSuwalaConcurrency;

public class ThreadMainMain {

    public static void main(String[] args) {

        ThreadMain trun = new ThreadMain();
        ThreadGroup tm = new ThreadGroup("Parent ThreadGroup");
        ThreadSub1 t1 = new ThreadSub1(tm, trun, "one");
        ThreadSub2 t2 = new ThreadSub2(tm, trun, "two");
        ThreadSub3 t3 = new ThreadSub3(tm, trun, "three");


        System.out.println(tm.activeCount());
        t1.start();
        System.out.println(tm.activeCount());
        t2.start();
        System.out.println(tm.activeCount());
        try {
            t2.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tm.activeCount());
        t3.start();
        System.out.println(tm.activeCount());
        try {
            t2.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(tm.activeCount());

        if (tm.activeCount() == 0) {
            System.out.println("Wątek główny zakończył działanie.");
        }
        System.out.println(tm.activeCount());
    }
}
