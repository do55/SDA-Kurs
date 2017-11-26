package pl.sdaWMrozek;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExample {

    public static void main(String[] args) {

        Queue<Person> people = new PriorityQueue<>();

        Person person = new Person("Jan", "Zysk", JobPosition.ANALYST, "Woronicza", 17, "4343");
        Person person1 = new Person("Asia", "Kowal", JobPosition.ANALYST, "Woronicza", 25, "565");
        Person person2 = new Person("Piotr", "Olo", JobPosition.SENIOR_DEVELOPER, "Woronicza", 17, "343");
        Person person3 = new Person("Arkadiusz", "Iksiński", JobPosition.TESTER, "Woronicza", 21, "98798");
        Person person4 = new Person("Oskar", "Pawelec", JobPosition.MANAGER, "Woronicza", 12, "87685");

        people.offer(person);
        people.offer(person1);
        people.offer(person2);
        people.offer(person3);
        people.offer(person4);

        System.out.println(people); //nie posortował

        System.out.println(people.poll()); //posortował i usuwa element
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());

        System.out.println(people.peek()); //tylko podgląda bez usuwania
    }

    Queue<Person> people = new LinkedList<>(); //nie bierze pod uwagę metody compareTo, podaje tylko sekwencyjnie


}
