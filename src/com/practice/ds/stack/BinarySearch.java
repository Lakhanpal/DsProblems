package com.practice.ds.stack;

public class BinarySearch {

    static int itr = 0;
    
    public static void main(String[] args) {
        int[]  arr = new int[21];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = i;
            
        }
        arr[6] = 5;
        
        
        System.out.println(binarySearch(arr, 6, 0, arr.length - 1));
       // System.out.println(itr);
    }
    
    
    public static int binarySearch(int arr[],int search,int low,int high)
    {
        itr++;
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == search)
        {
            return mid;
        }
        if( search > arr[mid])
        {
          low = mid;
        }else{
            high = mid-1;
        }
        
        return binarySearch(arr,search,low,high);
    }
    
    
}
