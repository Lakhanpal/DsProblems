package com.practice.ds.stack;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
              }
            System.out.print(arr[n-1-i]);
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,2,5,6,7};
        bubbleSort(arr);
    }

}
