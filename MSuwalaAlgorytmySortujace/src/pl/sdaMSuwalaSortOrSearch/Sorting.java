package pl.sdaMSuwalaSortOrSearch;

public class Sorting {


    public void bubbleSort(int[] tab) {
        boolean flag = true;
        int counter = 1;
        int temp;
        while (flag) {
            flag = false;
            System.out.println("Obrót nr " + counter++);
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    System.out.println("Zamieniono " + tab[i] + " na " + tab[i + 1]);
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    flag = true;
                }

            }
        }
        for (int a : tab) {
            System.out.print(a);
        }
    }

    public void sortByChoice(int[] tab) {
        int index;
        int min;
        for (int i = 0; i < tab.length; i++) {
            min = tab[i];
            index = i;
            for (int j = i; j < tab.length; j++) {
                if (tab[j] < min) {
                    min = tab[j];
                    index = j;


                }
            }
        tab[index] = tab[i];
            tab[i] = min;
        }
        for (int a : tab) {
            System.out.print(a);
        }
    }

    public void quicksort(int tab[], int start, int end) {
        int i, j, pivot, temp;

        i = start;
        j = end;
        pivot = tab[(start + end) / 2];

        do {
            while (tab[i] < pivot)
                i++;

            while (pivot < tab[j])
                j--;

            if (i <= j) {
                temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (start < j)
            quicksort(tab, start, j);
        if (i < end)
            quicksort(tab, i, end);
    }

}