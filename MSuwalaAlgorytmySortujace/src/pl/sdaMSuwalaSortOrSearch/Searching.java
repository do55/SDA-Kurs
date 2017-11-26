package pl.sdaMSuwalaSortOrSearch;

public class Searching {

    public int binarySearch(int[] tab, int search) {
        int start, end, middle;
        start = 0;
        end = tab.length - 1;
        middle = tab.length / 2;

        while (start <= end) {
            if (tab[middle] < search) {
                start = middle + 1;
            } else if (tab[middle] == search) {
                return middle;
            } else {
                end = middle - 1;
            }
            middle = (start + end) / 2;
        }
        return -1;
    }
}