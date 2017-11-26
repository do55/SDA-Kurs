package repository;

import data.Student;

public class DataReader {

        public void studentInfo(Student student, int[] tab, int[] tab1, int[] tab2) {
            GradeRepositoryImpl gradeRepImpl = new GradeRepositoryImpl();
            System.out.println(student);
            System.out.println("Oceny z biologii: ");
            gradeRepImpl.printGrades(tab);
            gradeRepImpl.printWillPass(tab);
            System.out.println("Oceny z geografii: ");
            gradeRepImpl.printGrades(tab1);
            gradeRepImpl.printWillPass(tab1);
            System.out.println("Oceny z matematyki: ");
            gradeRepImpl.printGrades(tab2);
            gradeRepImpl.printWillPass(tab2);

        }

}


