package pl.javasdaanaa;

import com.google.common.collect.Lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainStudent {

    public static void main(String[] args) {

        Student student1 = Student.builder()
                .name("Jan").lastName("Kowalski").age(22).scores(Arrays.asList(3,4,5,6,6)).build();

        Student student2 = Student.builder()
                .name("Jacek").lastName("Kruk").age(25).scores(Arrays.asList(3,4,5,2,2)).build();

        Student student3 = Student.builder()
                .name("Piotr").lastName("Bor").age(22).scores(Arrays.asList(1,2,3,4)).build();

        List<Student> students = Arrays.asList(student1, student2, student3);

            Map<Integer, List<Student>> studentByAge = students
            .stream()
            .collect(Collectors.groupingBy(p -> p.getAge()));

        System.out.println(studentByAge);

        Map<String, Integer> collect = students.stream().collect((Collectors.toMap(Student:: getLastName, Student:: getAge)));

        System.out.println(collect);

    /*    Map<String, Integer> collAvg = students.stream()
                .count();
*/

        List<Student> student = Lists.newArrayList();
        student.stream().anyMatch(p -> p.getAge() == 20);

        //lub

        boolean x = student.stream().anyMatch(p -> p.getAge() == 12);
        boolean y = student.stream().allMatch(p -> p.getAge() == 12);
        boolean z = student.stream().noneMatch(p -> p.getAge() == 12);


        Integer reduce = Arrays.asList(1,2,3,4,5).stream().reduce((i,c) -> i+c).orElse(null);
        System.out.println(reduce);

        Integer integer = Arrays.asList(20,1,3,4,5).stream().reduce((a,b) -> a-b).orElse(null);
        System.out.println(integer);

  /*      List<Worker> colle = student.stream().filter(p -> p.getAge() > 18)
                .map(p -> Worker.of(p.getName(), p.getAge()))
                .collect(Collectors.toList());
    */
        //najczesciej uzywane
        //filter, map
        //findFirst, findAny
    }

}





