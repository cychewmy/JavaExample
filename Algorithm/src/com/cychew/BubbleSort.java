package com.cychew;

import java.util.Arrays;

public class BubbleSort {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {20, 30, -15, 3, -22, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        System.out.println("Bubble Sort");
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
