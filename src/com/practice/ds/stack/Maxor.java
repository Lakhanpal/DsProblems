package com.practice.ds.stack;

public class Maxor {

    public static void main(String[] args) {
        int l = 10,r=15;
        int n = Integer.MIN_VALUE;
        int xor = l ^ r;
        System.out.println(xor);
        while ((n & xor) == 0 )
        {
            n = n >> 1;
            System.out.println(n);
        }
        System.out.println((n & xor));
        
        
    }
    
}
