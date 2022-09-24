package com.cychew;

import java.util.Arrays;

public class InsertionSort {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {20, 30, -15, 3, -22, 0};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        System.out.println("Insertion Sort");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.println("Swap Count -> " + count);
    }

    private static void swap(int[] arr, int i, int j) {
        count++;

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
