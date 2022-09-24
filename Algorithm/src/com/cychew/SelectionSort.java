package com.cychew;

import java.util.Arrays;

public class SelectionSort {
    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {20, 30, -15, 3, -22, 0};

        for (int i = 0; i < arr.length ; i++){
            int maxIndex = 0;
            for (int j = 0 ; j < arr.length - i ; j++){
                if (arr[j] > arr[maxIndex]){
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, arr.length - i - 1);
        }

        System.out.println("Selection Sort");
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
