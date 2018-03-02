package com.practice.ds.stack;

public class RadioTransmission {
    static int hackerlandRadioTransmitters(int[] x, int k) {
        int count = 0;
        for(int i = 0; i < x.length;)
        {
            i = i + k;
            
            i = i + (2*k);
            count++;
        }
         return count;
     }

    public static void main(String[] args) {
        
    }
}
