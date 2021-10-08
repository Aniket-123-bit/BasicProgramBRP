package com.day14.mergesort;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read data from the file
        ReadFile read = new ReadFile();
        ArrayList<String> dataArray = read.readFile();

        //convert the arraylist into array to pass it to the generic class
        String[] array = new String[dataArray.size()];
        array = dataArray.toArray(array);

        System.out.print("Before sorting: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int startIndex = 0;
        int length = array.length;
        int lastIndex = length - 1;

        //call the bubble sort method
        MergeSortImplementation mergeSort = new MergeSortImplementation(array);
        mergeSort.sort(array, startIndex, lastIndex);
        mergeSort.printSortedArray();
    }
}

