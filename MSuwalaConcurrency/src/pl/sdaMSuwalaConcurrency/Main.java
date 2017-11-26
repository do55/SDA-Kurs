package pl.sdaMSuwalaConcurrency;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//    MyThread t1 = new MyThread("wątek1");
//    t1.start();
//    MyThread t2 = new MyThread("wątek2");
//    t2.start();

//    MyThread tab[] = new MyThread[10];
//
//        for (int i = 0; i < tab.length ; i++) {
//            tab[i] = new MyThread("wątek " + i);
//        }
//        for (int i = 0; i < tab.length; i++) {
//            tab[i].start();
//            tab[i].join();
//        }

        //      MyThread t10 = new MyThread("uoureo");
        //     t10.run(); //wywołanie metody i NIE TWORZY NAM NOWEGO WĄTKU!!


//        MyThread t = new MyThread("iwuoerioew");
//        t.start();
//
//        t.start();

        MyThreadRunnable tr = new MyThreadRunnable("wątek runnable");
        Thread th = new Thread(tr);
        th.start();

        //to samo co wyżej
  //      new Thread(new MyThreadRunnable("wątek runnable")).start();

        //to samo za pomocą interfejsu funkcyjnego
        new Thread(
                () -> {     //run jest bezargumentowa, więc jest () zamiast zmiennej
                    for (int i = 0; i < 10; i++) {
                        System.out.println("wykonuje wątek z interfejsu funkcyjnego po raz " + (i + 1));
                    }
                }
            ).start();
    }
}
