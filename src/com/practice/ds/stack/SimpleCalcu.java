package com.practice.ds.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SimpleCalcu {


    public static void main(String[] args) {
        
        int[] arr = {1, 4, 4 ,4, 5, 3,3,3,2,2,2};
        Map<Integer,Integer> commonMap = new HashMap<>();
        Arrays.sort(arr);
        int count = 1;
        int commonInt = arr[0];
        int highestCount = 1;
        int highestCountNumber = commonInt;
        for (int i = 1; i < arr.length;i++ ) {
            int temp = arr[i];
            
            if(commonInt == temp)
            {
                count++;
                if(count > highestCount)
                {
                    highestCount = count;
                    commonMap.keySet().removeAll(commonMap.keySet());
                    commonMap.remove(highestCountNumber);
                    highestCountNumber = temp;
                }
                
            }else{
                
                commonMap.put(commonInt, count);
                count = 1;
            }
            
            commonInt = temp;
            
        }
        commonMap.put(commonInt,count);
        if(commonMap.get(commonInt) < highestCountNumber)
        {
            commonMap.remove(commonInt);
        }
        
        System.out.println(commonMap.entrySet().iterator().next().getKey());
        
    }
}
