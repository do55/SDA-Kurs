package pl.sdaMSuwalaSortOrSearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {1,5,4,2,8,7};
        int[] tab1 = {7,8,2,6,1,9,2,5};
        int[] sorted = {1,2,4,6,8,9};

        Sorting sorting = new Sorting();
        sorting.bubbleSort(tab);
        System.out.println(" \n");

        Arrays.stream(tab).forEach(System.out::print);
        System.out.println(" \n");
        System.out.println("By choice");

        sorting.sortByChoice(tab1);

        System.out.println("Binary Search");
        Searching searching = new Searching();
        System.out.println(searching.binarySearch(sorted, 2));

        System.out.println("Recursion");
        Recursion recursion = new Recursion();
        System.out.println(recursion.silnia(4));

        System.out.println("Quick sort");
        sorting.quicksort(tab1,0,7);

        for (int a: tab1){
            System.out.println(a);
        }

        }

    }




