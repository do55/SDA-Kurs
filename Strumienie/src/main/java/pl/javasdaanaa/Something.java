package pl.javasdaanaa;

import java.io.Serializable;

public class Something implements Serializable{

    String name;
    Integer year;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
