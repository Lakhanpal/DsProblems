package com.practice.ds.stack;

import java.util.ArrayList;
import java.util.List;

public class FabonacciRecursion {

    public static void main(String[] args) {
        List<Integer>  list = fab(7, null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
    
    public static List<Integer> fab(int s, List<Integer> list)
    {
        if(list == null)
        {
            list = new ArrayList<>();
            list.add(1);
            list.add(1);
            s = s-2;
        }
        if(s == 0)
        {
            return list;
        }
        int size = list.size();
        list.add(list.get(size-1) + list.get(size-2));
        return fab(s-1,list);
    }
    
}
