package pl.sda.MJedryszka;

import java.util.concurrent.TimeUnit;

public class Violinist extends Musician {

    private String name;

    public Violinist(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Wiolonczela pięknie gra.");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        };

       Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();
    }


    @Override
    public String toString() {
        return "Violinist{" +
                "name='" + name + '\'' +
                '}';
    }
}
