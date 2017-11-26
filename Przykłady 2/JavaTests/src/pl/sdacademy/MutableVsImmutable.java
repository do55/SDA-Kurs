package pl.sdacademy;

import java.util.HashMap;
import java.util.Map;

class MutablePerson {
    private String name;
    private String surname;

    MutablePerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name: [" + name + "] surname: [" + surname + "]";
    }
}

class ImmutablePerson {
    private final String name;
    private final String surname;

    ImmutablePerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "name: [" + name + "] surname: [" + surname + "]";
    }
}

public class MutableVsImmutable {

    public static void main(String[] args) {
        MutablePerson mutable = new MutablePerson("Mariusz", "Zmienny");
        ImmutablePerson immutable = new ImmutablePerson("Mariusz", "Stały");

        final String mutableKey = "mutable";
        final String immutableKey = "immutable";
        Map<String, Object> map = new HashMap<>();
        map.put(mutableKey, mutable);
        map.put(immutableKey, immutable);

        MutablePerson changedMutablePerson = (MutablePerson) map.get(mutableKey);
        changedMutablePerson.setName("Zenon");

        System.out.println(changedMutablePerson);
        System.out.println(mutable);
        System.out.println(map.get(mutableKey));

        immutable = new ImmutablePerson("Zenon", "Niezmienny");

        System.out.println(immutable);
        System.out.println(map.get(immutableKey));
    }

}
