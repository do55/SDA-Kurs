package pl.sdazajec;


public class Main {

    // String myString1 = "Robert";
    // String myString2 = "Robert"; = referencja do obiektu pierwszego
    // String myString3 = new String ("Robert"); - nowy obiekt

    //myString1.concat("Wojcikiewicz"); - tworzy nowy obiekt, oprocz Robert jest teraz Robert Wojcikiewicz,
    // ale myString1 nie jest już referencją do Robert, tylko myString2

    // if(myString1 == myString2)) {
    //System.out.println("The same object")

    //equals - the same value

    public static void main(String[] args) {

        double[] grades1 = {4, 5, 2, 6, 6};
        double[] grades2 = {2, 2, 1, 1};
        double[] grades3 = {3, 3, 4, 4};

        double user1Average = calulateAvg(grades1);
        StudentLevel studentLevel = calculateStudentStatus(user1Average);
        System.out.println(studentLevel.getInfo());

    }

    private static StudentLevel calculateStudentStatus(double average) {
        if (average < 3) {
            return StudentLevel.NIEDOSTATECZNY;
        } else if (average < 4) {
            return StudentLevel.DOBRY;
        } else {
            return StudentLevel.WZOROWY;
        }
    }



    /*    if (calulateAvg(grades1) >= 5) {
            System.out.println(StudentLevel.WZOROWY.getInfo());
        } else if (calulateAvg(grades1) >= 4 && calulateAvg(grades1) < 5) {
            System.out.println(StudentLevel.BARDZO_DOBRY.getInfo());
        } else if (calulateAvg(grades1) >= 3 && calulateAvg(grades1) < 4) {
            System.out.println(StudentLevel.DOBRY.getInfo());
        } else {
            System.out.println(StudentLevel.NIEDOSTATECZNY.getInfo());

        }
    */
        // System.out.println(calculateSum(numbers2));


    //można jako argument wpisać tablicę albo kolekcję(varags) daje nam tę możliwość
    //metoda statyczna nie musi mieć obiektu do jej wywołania
    //w main nie można mieć metody niestatycznej

    private static double calulateAvg(double... grades) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum/grades.length;
    }

}


