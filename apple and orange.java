import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class utility {
    
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        
		String[] st = scanner.nextLine().split(" ");
        int s = Integer.parseInt(st[0]);
        int t = Integer.parseInt(st[1]);
        
        String[] ab = scanner.nextLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        
        String[] mn = scanner.nextLine().split(" ");
        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        
        int appleCount = 0;
        String[] applesItems = scanner.nextLine().split(" ");
        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            if(applesItem + a >= s && applesItem + a <= t) {
            	appleCount++;
            }
        }

        int orangeCount = 0;
        String[] orangesItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            if(orangesItem + b >= s && orangesItem + b  <= t) {
            	orangeCount++;
            }
        }
        
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
        
        scanner.close();

         
    }
}

