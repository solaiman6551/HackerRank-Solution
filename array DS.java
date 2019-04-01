import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
 
class utility
{
   public static void main(String args[]){
       
       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       
       int arr[] = new int[x];
       
       for(int i = 0; i <x; i++) {
           arr[i] = in.nextInt();
       }
       
       
       for(int i = arr.length-1; i >=0 ; i--) {
           System.out.print(arr[i]+ " ");
       }
   }
}