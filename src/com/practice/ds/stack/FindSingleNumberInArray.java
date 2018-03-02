package com.practice.ds.stack;

public class FindSingleNumberInArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4,4,4,5};
        int countOf1 = 0;
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & 1) != 0) {
                    countOf1++;
                }
                arr[j] =  arr[j] >> 1;
            }
            int mod = countOf1 % 3;
            int multiply = 0;
            if(mod != 0)
            {
                multiply = 1;
            }
            Double double1= Math.pow(2, i) * multiply;
            ans = double1.intValue() + ans ;
            countOf1 = 0;
            
        }
        System.out.println(ans);

    }

}
