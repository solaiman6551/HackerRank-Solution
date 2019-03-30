import java.util.Scanner;
public class utility {
public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
        for(int i = 0; i <= s.length() - k; i++) {
        	String se = s.substring(i, k + i);
        	if(smallest.compareTo(se)>0) {
        		smallest = se;
        	}
        	if(largest.compareTo(se)<0) {
        		largest = se;
        	}
        }				
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}