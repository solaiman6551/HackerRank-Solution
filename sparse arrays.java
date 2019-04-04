import java.io.*;
import java.util.*;

public class utility {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	int x = scan.nextInt();
    	String[] arr = new String[x];
    	
    	for(int i = 0; i < x; i++) {
    		arr[i] = scan.next();
    	}
    	
    	int y = scan.nextInt();
    	for(int i = 0; i < y; i++) {
    		String s = scan.next();
    		
    		int count = 0;
    		for(int j = 0; j < x; j++) {
    			if(s.equals(arr[j])) {
    				count++;
    			}
    				
    		}
    		System.out.println(count);
    	}
    }
}