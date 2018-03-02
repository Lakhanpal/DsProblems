package com.practice.ds.stack;

public class GreatestPossible {
    
    
    
    public static int greatestPossible(int i) {
        if (i < 10) {
            return (((i * 10) + i) * 10 + i);
        }
        if (i > 9 && i < 100) {
            return (i * 10) + (i / 10);
        }
        if (i > 99 && i < 1000) {
            return i;

        }
        if (i == 1000) {
            return 1;
        }
        return i;
    }

    public static void findNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int numb = greatestPossible(arr[j + 1]);
                int num2 = greatestPossible(arr[j]);
                if (num2 > numb) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[n - i - 1] + ",");
        }
        System.out.print(arr[0]);

    }

    public static void main(String[] args) {
        int n[] = {43, 432, 435, 433, 435, 0,43, 433, 432,0};
        findNumber(n);
    }

}
