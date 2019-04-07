import java.io.*;
import java.util.*;

public class utility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        long[] arr = new long[x+1];
        while(y-- > 0) {
            int a = sc.nextInt();
ut.println(m);
  }
}
            int b = sc.nextInt();
            int k = sc.nextInt();
            arr[a-1] = arr[a-1] + k;
            arr[b] = arr[b] - k;
        }
        sc.close();
        
        long s = 0, m = 0;
        for(int i = 0; i < x; i++) {
            s += arr[i];
            m = Math.max(m,s);
        }
        
        System.o