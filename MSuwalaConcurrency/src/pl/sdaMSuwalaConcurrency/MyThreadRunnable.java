package pl.sdaMSuwalaConcurrency;

public class MyThreadRunnable implements Runnable {

    private String name;

    public MyThreadRunnable(String name) {
        this.name = name;
    }

    @Override  //interface funkcyjny
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " " + i);
        }
    }
}
