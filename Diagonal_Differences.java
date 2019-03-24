package hackerrank;
import java.io.PrintStream;
import static java.lang.System.in;
import java.util.Scanner;
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int diagonal[][] = new int[N][N];
        int leftDiagonal = 0 , rightDiagonal = 0;
        
        
        for(int p=0;p<N;p++){
            for(int q=0;q<N;q++){
                diagonal[p][q] = input.nextInt();
                 if(p==q){
                     leftDiagonal = leftDiagonal + diagonal[p][q];
                 }
                 if(p+q==N-1){
                     rightDiagonal = rightDiagonal + diagonal[p][q];
                 }
            }

        }
        System.out.println(Math.abs(rightDiagonal-leftDiagonal));
    }
    
}
