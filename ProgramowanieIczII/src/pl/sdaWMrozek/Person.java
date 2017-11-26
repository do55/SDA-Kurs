package pl.sdaWMrozek;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public class Person implements Serializable, Comparable<Person> {

    private String name;
    private String surname;
    private JobPosition position;
    private String streetName;
    private Integer streetNumber;
    private String pesel;

    public Person(String name, String surname, JobPosition position, String streetName, Integer streetNumber, String pesel) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public JobPosition getPosition() {
        return position;
    }

    public void setPosition(JobPosition position) {
        this.position = position;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", pesel='" + pesel + '\'' +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        if (this.streetName.compareTo(o.streetName) == 0) {
            if (this.streetNumber < o.streetNumber) {
                return -1;
            } else if (this.streetNumber > o.streetNumber) {
                return 1;
            } else {
                return 0;
            }
        }
        return this.streetName.compareTo(o.streetName);
    }

    @Override
    public boolean equals(Object o) { //teraz bazuje na ulicy
        return this.compareTo((Person) o) == 0;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        return result;
    }
}


