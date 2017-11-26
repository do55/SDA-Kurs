package pl.sdacademy.thread_race;

public class ThreadRaceExample {

    public static void main(String[] args) {
        Runnable jobOne = () -> {
            System.out.println("jobOne a");
            System.out.println("jobOne b");
            System.out.println("jobOne c");
        };
        
        Runnable jobTwo = () -> {
            System.out.println("jobTwo a");
            System.out.println("jobTwo b");
            System.out.println("jobTwo c");
        };
        
        new Thread(jobOne).start();
        new Thread(jobTwo).start();
    }

}
