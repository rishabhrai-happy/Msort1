package Main;
import mergesort.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        MergeSort.sort1(array);
        System.out.println("ARRAY SORTED BY MERGE SORT");
        System.out.println(Arrays.toString(array));
    }

}
