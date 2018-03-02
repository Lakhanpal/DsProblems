package com.practice.ds.stack;

public class PrintSubSet {

    
    public static void main(String[] args) {
       System.out.println(2^3);
        
        int[] i = {0,1,2,3};
        int n = i.length;
        int newArr[] = new int[2^n];
        for (int j = 0; j < newArr.length; j++) {
            int temp[] = new int[n];
            for (int j2 = 0; j2 < n; j2++) {
                
                if(checkBit(j, j2))
                {
                    System.out.print(i[j2]); 
                }
                
            }
            System.out.println("");
        }
       
        
    }
    
    
    public static boolean checkBit(int i,int n)
    {
        if((i & (1 << n)) != 0)
        {
            return true;
        }
        return false;
    }
    
}
