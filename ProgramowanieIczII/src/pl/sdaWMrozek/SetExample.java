package pl.sdaWMrozek;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        Set<Person> treePeople = new TreeSet<>();
        List<Person> peopleList = new ArrayList<>();


        Person person = new Person("Jan", "Zysk", JobPosition.ANALYST, "Woronicza", 17, "92017152");
        Person person1 = new Person("Asia", "Kowalski", JobPosition.ANALYST, "Wiejska", 25, "765874638");
        Person person2 = new Person("Piotr", "Olo", JobPosition.SENIOR_DEVELOPER, "Orla", 17, "990765365");
        Person person3 = new Person("Arkadiusz", "Iksiński", JobPosition.TESTER, "Anielewicza", 21, "82555152");
        Person person4 = new Person("Oskar", "Kowalski", JobPosition.MANAGER, "Woronicza", 12, "02635544");


        people.add(person);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people.add(person));

        treePeople.add(person);
        treePeople.add(person1);
        treePeople.add(person2);
        treePeople.add(person3);
        treePeople.add(person4);
        treePeople.add(person);

        peopleList.add(person);
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);


        for (Person p : people) {  //na podstawie metody equals, możemy override equals i operować tym
            System.out.println(p);
        }
        System.out.println(">>>>>>>");
        for (Person p : treePeople) {  // na podstawie metody compareTo
            System.out.println(p);
        }
        System.out.println(">>>>>>>");
        Set<Person> peopleSet = new HashSet<>();

        peopleSet.addAll(people);
        for (Person p : peopleSet) {
            System.out.println(p);

        }
    }
}