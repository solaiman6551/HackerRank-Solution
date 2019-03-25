import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) 
    {
        int x = 5;
        long res = 0;
        Scanner input = new Scanner(System.in);
        
        long first[] = new long[x];
        
        
        
        for (int p=0;p<x;p++) {
            first[p] = input.nextInt();
        }
    

        long largest = Long.MIN_VALUE;
        long smallest = Long.MAX_VALUE;
        
        for(long number : first) {
            if (number > largest)
              largest = number;
        }
        
        for(long number : first) {
             if (number < smallest) 
                smallest = number;    
            
        }
        
        
       
        for (int i = 0; i<5; i++) {
            res = res + first[i]; 
        }
        
        long minimum_sum = res - largest;
        long maximum_sum = res - smallest;
        
        System.out.print("" +minimum_sum);
        System.out.println(" " +maximum_sum);
    }
}
