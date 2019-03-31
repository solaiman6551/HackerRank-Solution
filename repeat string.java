import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class utility {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	long n = in.nextLong();
    	
    	long cfs = 0, tc = 0;
        
        
    	for(int i = 0; i < s.length(); i++) {
    		if(s.charAt(i) == 'a') {
    			cfs++;
    		}
    	}
    	
        long d = n / s.length();
        
        tc = tc + d * cfs;
        
        long r = n % s.length();
        
        for(int i = 0; i < r; i++ ) {
        	if(s.charAt(i) == 'a') {
        		tc++;
        	}
        }
        System.out.println(tc);
    }
}
