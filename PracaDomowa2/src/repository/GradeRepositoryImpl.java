package repository;

public class GradeRepositoryImpl implements GradeRepository {

    private int indexOfEmptyPosition;

    private int[] math;
    private int[] geo;
    private int[] bio;

    public GradeRepositoryImpl() {
        this.math = math;
        this.geo = geo;
        this.bio = bio;
    }

    @Override
    public boolean willPass(int[] tab) {
        double sum = 0;
        for (int a : tab) {
            sum = tab[a] + sum;
        }
    double avg = sum/tab.length;
    if(avg >= 2) {
        return true;
    }
    return false;
    }

    @Override
    public void printWillPass(int[] tab) {
        if (willPass(tab) == false) {
            System.out.println("Uczeń jest zagrożony");
        } else {
            System.out.println("Uczeń nie jest zagrożony");
        }
    }


    @Override
    public int findGrade1(int[] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 1) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void printGrades(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                System.out.print(tab[i] + ", ");
            }
        }
        System.out.println(" ");
    }


    @Override
    public void addGrade(int grade, int[] tab) {
        indexOfEmptyPosition = getIndexOfEmptyPosition(tab);
        if (isMathAccessibleToAddNewGrade(tab)) {
            tab[indexOfEmptyPosition] = grade;
            }
        }



    private boolean isMathAccessibleToAddNewGrade(int[] tab) {
            return indexOfEmptyPosition != 0 && indexOfEmptyPosition < tab.length;
    }

        private int getIndexOfEmptyPosition(int[] tab) {
        int index = 0;
        for (int d: tab) {
            if (tab[index] == 0) {
                return index;
            }
            index++;

        }
            return index;
    }
}

