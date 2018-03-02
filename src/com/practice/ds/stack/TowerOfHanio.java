package com.practice.ds.stack;

public class TowerOfHanio {

    public static void main(String[] args) {
        tower(3,'a','c','b',null);
    }
    
    public static void tower(Integer n,char s,char d,char t,String functionN)
    {
     
        if(n == 0)
        {
            return ;
        }
        String tmp = "s = "+s+" ,t = "+t+ " ,d = "+d + " And n="+n;
        System.out.println( "1 = "+tmp);
        tower(n-1,s,t,d,"1 where ");
        
        
        System.out.println(" n:"+n + " Source = "+s+" Destination = "+d+" Temp = "+t);
        //tmp = "s = "+s+" ,t = "+t+ " ,d = "+d + " and n = "+n;
        //System.out.println(2 + " = " +tmp);
        tower(n-1,t,d,s,"2 where ");
        
    }
    
}
