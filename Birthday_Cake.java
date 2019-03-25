import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class utility {

      public static void main(String[] args)  {
    	  
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	
    	int arr[] = new int[n];
    	
    	for(int i = 0; i<n; i++) {
    		arr[i] = input.nextInt();
    	}
    	
    	int largest = Integer.MIN_VALUE;
    	
    	for(int number : arr) {
    		if (number > largest) {
    			largest = number;
    		}
    	}
    	
    	int count = 0;
    	for(int j = 0; j<arr.length;j++) {
    		if(arr[j] == largest) {
    			count++;
    		}
    		
    	}
    	
    	System.out.print("" +count);
    	
  }
}