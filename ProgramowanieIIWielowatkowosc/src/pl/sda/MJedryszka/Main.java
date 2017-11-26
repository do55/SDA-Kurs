package pl.sda.MJedryszka;

import javax.management.timer.Timer;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Violinist violinist1 = new Violinist("Josh Gerber");
        Cellist cellist1 = new Cellist("Rob Gronk");
        Drummer drummer =  new Drummer(("Bob Ross"));

        List<Musician> musicians = new ArrayList<>();

        musicians.add(violinist1);
        musicians.add(cellist1);
        musicians.add(drummer);


        Orchestra orchestra = new Orchestra(musicians);
        orchestra.concert();
    }
}