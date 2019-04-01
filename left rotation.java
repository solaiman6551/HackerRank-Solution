import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class utility {
      
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int r_num = in.nextInt();
		
		int arr[] = new int[s];
		
		for(int i = 0; i < s; i++) {
			if(r_num > i) {
				arr[s - r_num+i] = in.nextInt();
			}
			
			else {
				arr[i - r_num] = in.nextInt();
			}
		}
			
			for(int i = 0; i < s; i++) {
				System.out.print(arr[i]+ " ");
			}
		
	}
}
