package com.company;

import com.company.arrayOperation.Array;
import com.company.arrayOperation.ArrayDublicate;
import com.company.arrayOperation.BubbleSort;
import com.company.matrixOperation.Matrix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] dublicate = {10, 20, 13, 10, 2, 2, -3, -3};
        Random random = new Random();
        int[] testArr = new int[20];
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = random.nextInt();
        }

        System.out.println("Min value " + Array.minValue(testArr));
        System.out.println("Max value " + Array.maxValue(testArr));

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Sort Ascending ");
        bubbleSort.bubbleSortAscending(testArr);
        bubbleSort.printArray(testArr);

        bubbleSort.bubbleSortDescending(testArr);
        System.out.println("Sort Descending ");
        bubbleSort.printArray(testArr);

        System.out.println("Array sum " + Array.sumArray(testArr));

        Array.sqrtArray(testArr);
        System.out.println("Array sqrt ");
        Array.printArray(testArr);

        String[][] text = {
                {"one", "two", "test", "d"},
                {"asdas", "asdaf", "sdfsd", "asdfsdg"},
                {"A", "bb", "CC", "FF"},
                {"DFGD", "ASDFSDG", "SDFSDG", "TEST"}
        };
        System.out.println(Matrix.mainDiagonal(text));

        ArrayDublicate.arrayDublicate(dublicate);
        System.out.println("Deletting dublicate ");
        ArrayDublicate.printArray(dublicate);
    }
}