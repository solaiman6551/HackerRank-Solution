import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class utility {

      public static void main(String[] args)  {
        
    	  Scanner input = new Scanner(System.in);
    	  int p = input.nextInt();
    	  
    	  for(int i = 0; i<p; i++) {
    		  for(int j = 0; j<p; j++) {
    			  if(j<p-1-i) {
    				  System.out.print(" ");
    			  }
    			  else {
    				  System.out.print("#");
    			  }
    	
    	  }
    		  System.out.println(" ");
    }
  }
}