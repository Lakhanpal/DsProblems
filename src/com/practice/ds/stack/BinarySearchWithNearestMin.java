package com.practice.ds.stack;

import java.util.Arrays;

public class BinarySearchWithNearestMin {

    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5};
        //System.out.println(binary(arr,8,0,arr.length -1));
       System.out.println(hackerlandRadioTransmitters(arr,1));
       
    }
    static int hackerlandRadioTransmitters(int[] x, int k) {
        int count = 0;
        Arrays.sort(x);
        int max = x[x.length -1];
        for(int i = x[0] + k; i < max;)
        {
            count++;
            i = i + 2*k;
            i = binary(x,i,0,x.length -1);
        }
         return count;
     }

     public static int binary(int[] arr,int search,int l,int h)
      {
          int mid = 0;
          while(l < h)
          {
              mid = l + (h - l + 1)/2;
              if( arr[mid] > search)
              {
                  h = mid - 1;
              }else{
                  l = mid;
              }   
          }
          return arr[l];
      }
    
}
