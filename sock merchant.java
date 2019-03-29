import java.util.*;
import java.util.Scanner;

public class utility {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int a[] = new int[x];
        
        for(int i = 0; i < x; i++){
            a[i] = input.nextInt();
        }
         
        Arrays.sort(a);
        int t = 0;
        for(int j = 0; j < x-1; j++){
           if(j < x && a[j] == a[j+1]){
               t++;
               j = j+1;
           }
        }
        System.out.println(t);
 
    }
}