package pl.sdaMSuwalaSortOrSearch;

public class Recursion {

    public int silnia(int wartosc) {
        if (wartosc == 0) return 1;
        else return wartosc * silnia(wartosc - 1);
    }
}
