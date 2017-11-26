package pl.javasdaanaa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

//lombok to nam umożliwia (dependency)
@Data
@EqualsAndHashCode
@AllArgsConstructor
@Builder
public class Student {

    private String name;
    private String lastName;

    private List<Integer> scores;
    private Integer age;

    public static Student of(String name, String lastName, List<Integer>integerList, Integer age) {
        return new Student(name, lastName, integerList, age);
    }

}
