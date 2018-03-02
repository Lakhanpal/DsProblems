package com.practice.ds.stack;

public class Partition {

    public static boolean isValid(int[] arr, int part, int sum) {
        int sumN = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            sumN += arr[i];
            if (sumN > sum) {
                count++;
                sumN = arr[i];
            }
            if(sumN == sum && i != arr.length - 1)
            {
                count++;
                sumN = 0;
            }
        }
        if (count <= part)
            return true;
        return false;
    }

    public static int doPart(int workers, int[] array) {
        int sum = getSum(array);
        int low = sum / workers, high = sum, mid = low + (high - low) / 2;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (isValid(array, workers, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return high;
    }

    private static int getSum(int[] parti) {
        int sum = 0;
        for (int i = 0; i < parti.length; i++) {
            sum += parti[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        
        int workers = 3;
        int arr[] = {1 ,10 ,13 ,4 ,5, 12, 23, 12, 18, 8 };
       //System.out.println(isValid(arr, workers, 38));
        
         System.out.println(doPart(workers, arr));

    }

}
