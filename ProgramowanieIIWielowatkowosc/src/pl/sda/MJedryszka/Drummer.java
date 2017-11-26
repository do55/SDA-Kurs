package pl.sda.MJedryszka;

import java.util.concurrent.TimeUnit;

public class Drummer extends Musician {

    private String name;

    public Drummer(String name) {
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
                        System.out.println("Perkusja pięknie gra.");
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
        return "Drummer {" +
                "name='" + name + '\'' +
                '}';
    }
}


