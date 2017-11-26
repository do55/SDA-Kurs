package pl.sdapracadomowa2;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.Student;
import repository.DataReader;
import repository.GradeRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        GradeRepositoryImpl gradeRepImpl = new GradeRepositoryImpl();
        Scanner sc = new Scanner(System.in);
        DataReader dt = new DataReader();

        Student student1 = new Student("Leo", "DiCaprio", "5d", "Robert DeNiro");
        Student student2 = new Student("Al", "Pacino", "4d", "Jon Stewart");
        Student student3 = new Student("Ryan", "Gosling", "1a", "Kathy Sierra");

        int[] student1Math = new int[10];
        student1Math[0] = 6;
        student1Math[1] = 5;
        student1Math[2] = 4;
        student1Math[3] = 4;
        student1Math[4] = 1;
        student1Math[5] = 4;

        int[] student1Geo = new int[10];
        student1Geo[0] = 2;
        student1Geo[1] = 1;
        student1Geo[2] = 1;
        student1Geo[3] = 3;
        student1Geo[4] = 4;

        int[] student1Bio = new int[10];
        student1Bio[0] = 6;
        student1Bio[1] = 6;
        student1Bio[2] = 5;
        student1Bio[3] = 1;
        student1Bio[4] = 1;
        student1Bio[5] = 6;

        int[] student2Math = new int[10];
        student2Math[0] = 1;
        student2Math[1] = 1;
        student2Math[2] = 3;
        student2Math[3] = 3;
        student2Math[4] = 3;

        int[] student2Geo = new int[10];
        student2Geo[0] = 5;
        student2Geo[1] = 5;
        student2Geo[2] = 3;
        student2Geo[3] = 3;
        student2Geo[4] = 6;
        student2Geo[5] = 6;
        student2Geo[6] = 5;

        int[] student2Bio = new int[10];
        student2Bio[0] = 4;
        student2Bio[1] = 4;
        student2Bio[2] = 3;
        student2Bio[3] = 3;
        student2Bio[4] = 3;
        student2Bio[5] = 4;
        student2Bio[6] = 5;
        student2Bio[7] = 1;

        int[] student3Math = new int[10];
        student3Math[0] = 1;
        student3Math[1] = 1;
        student3Math[2] = 1;
        student3Math[3] = 2;
        student3Math[4] = 1;

        int[] student3Geo = new int[10];
        student3Geo[0] = 1;
        student3Geo[1] = 1;
        student3Geo[2] = 2;
        student3Geo[3] = 3;
        student3Geo[4] = 1;
        student3Geo[5] = 1;
        student3Geo[6] = 1;

        int[] student3Bio = new int[10];
        student3Bio[0] = 3;
        student3Bio[1] = 2;
        student3Bio[2] = 2;
        student3Bio[3] = 1;
        student3Bio[4] = 1;
        student3Bio[5] = 2;
        student3Bio[6] = 1;
        student3Bio[7] = 1;
        student3Bio[8] = 1;


        System.out.println("Jeśli chcesz dodać ocenę wybierz 1. Jeśli chcesz wyświetlić informacje o uczniu wybierz  2");
            int reader = sc.nextInt();
        if (reader == 1) {
            Scanner opt = new Scanner(System.in);
            GradeRepositoryImpl grimpl = new GradeRepositoryImpl();
            System.out.println("Podaj numer ucznia. DiCaprio - 1, Pacino - 2, Gosling - 3. ");
            int number = opt.nextInt();
            Scanner sub = new Scanner(System.in);
            System.out.println("Do którego przedmiotu?  matematyka, biologia, geografia ");
            String subject = sub.nextLine();
            System.out.println("Podaj ocenę 1-6 ");
            Scanner gr = new Scanner(System.in);
            int grade = gr.nextInt();
            if (number == 1 && subject.equals("matematyka")) {
                gradeRepImpl.addGrade(grade, student1Math);
                gradeRepImpl.printGrades(student1Math);
            } else if (number == 1 && subject.equals("biologia")) {
                gradeRepImpl.addGrade(grade, student1Bio);
                gradeRepImpl.printGrades(student1Bio);
            } else if (number == 1 && subject.equals("geografia")) {
            gradeRepImpl.addGrade(grade, student1Geo);
                gradeRepImpl.printGrades(student1Geo);
            } else if (number == 2 && subject.equals("matematyka")) {
                gradeRepImpl.addGrade(grade, student2Math);
                gradeRepImpl.printGrades(student2Math);
            } else if (number == 2 && subject.equals("biologia")) {
                gradeRepImpl.addGrade(grade, student2Bio);
                gradeRepImpl.printGrades(student2Bio);
            } else if (number == 2 && subject.equals("geografia")) {
                gradeRepImpl.addGrade(grade, student2Geo);
                gradeRepImpl.printGrades(student2Geo);
            } else if (number == 3 && subject.equals("matematyka")) {
                gradeRepImpl.addGrade(grade, student3Math);
                gradeRepImpl.printGrades(student3Math);
            } else if (number == 3 && subject.equals("biologia")) {
                gradeRepImpl.addGrade(grade, student3Bio);
                gradeRepImpl.printGrades(student3Bio);
            } else if (number == 3 && subject.equals("geografia")) {
                gradeRepImpl.addGrade(grade, student3Geo);
                gradeRepImpl.printGrades(student3Geo);
            } else {
                System.out.println("Wprowadzone dane są nieprawidłowe");
            }

            gr.close();
            sub.close();
            opt.close();
        }
        if (reader == 2) {
            System.out.println("DiCaprio - 1, Pacino - 2, Gosling - 3. Wprowadź liczbę");
            Scanner scan = new Scanner(System.in);
            int name = scan.nextInt();
            switch (name) {
                case 1:
                    dt.studentInfo(student1, student1Bio, student1Geo, student1Math);
                    break;
                case 2:
                    dt.studentInfo(student2, student2Bio, student2Geo, student2Math);
                    break;
                case 3:
                    dt.studentInfo(student3, student3Bio, student3Geo, student3Math);
                    break;
                default:
                    System.out.println("Podana liczba jest nieprawidłowa");
            }
            sc.close();
        }

    }
}