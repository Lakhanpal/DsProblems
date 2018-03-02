package com.practice.ds.stack;

public class MaxConcat {

    public static int getConcatNumber(int num1 , int num2)
    {
            if(num2 < 10 )
            {
                return (num1 * 10) + num2;
            }
            
            if(num2 > 9 && num2 < 100)
            {
                return num1 * 100 + num2;
            }
            
            if(num2 > 99 && num2 < 1000)
            {
                return num1 * 1000 + num2;
            }
            
            if(num2 == 1000)
            {
                return num1 * 10000 + num2;
            }
       
            return 0;    
    }
    
    
    
    
    public static int compare(int num1, int num2) {
        int first = getConcatNumber(num1, num2);
        int second = getConcatNumber(num2, num1);
        return first - second;
    }

    public static void findNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // int numb = greatestPossible(arr[j + 1]);
                // int num2 = greatestPossible(arr[j]);
                if (compare(arr[j + 1], arr[j]) < 0) {
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
        int n[] = {43, 432, 435, 433, 435, 43, 433, 432};
        findNumber(n);
    }

}
