package pl.sda.MJedryszka;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {

    List<Musician> musicians;
    private Musician musician;

    public Orchestra(List<Musician> musicians) {
        this.musicians = musicians;   //inicjalizowanie jest w mainie, żeby nie wiązać orkiestry z listą muzyków
    }


    public void concert() throws InterruptedException {
            for (Musician m : musicians) {
                m.play();
            Thread.sleep(10000);
        }
    }

//    public void concert() throws InterruptedException {
////        for (Musician m: this.musicians) {
////            m.play();
//
//        for (int i = 0; i < 10; i++) {
//            for (Musician m : musicians) {
//                if (m instanceof Cellist && i % 2 == 0) {
//                    m.play();
//                }
//                if (m instanceof Violinist) {
//                    m.play();
//
//                }
//            }
//            Thread.sleep(1000);
//        }
//    }


}


