package com.practice.ds.stack;

public class FrequancySort {

    public static void main(String[] args) {
        int arr[] = {2,-3,-2,-2,-1,-1,1,1,1,2,3,3};
        BubbleSort.bubbleSort(arr);
        
        
    }
    
    
    public void sort(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0]);
        }
    }
    
    
}
