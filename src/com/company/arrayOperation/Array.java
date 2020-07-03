package com.company.arrayOperation;

public class Array {
    public static int sumArray(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void sqrtArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
    }

    public static int maxValue(int arr[]) {
        int arr_max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr_max) {
                arr_max = arr[i];
            }
        }
        return arr_max;
    }

    public static int minValue(int arr[]) {
        int arr_min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr_min) {
                arr_min = arr[i];
            }
        }
        return arr_min;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
