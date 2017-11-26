package repository;

public interface GradeRepository {

    boolean willPass(int[] tab);

    void printWillPass(int[] tab);

    void addGrade(int grade, int[] tab);

     void printGrades(int[] tab);

    int findGrade1(int[] tab);


}
