// Empty Square Pattern of Stars
import java.util.Scanner;

public class StarPattern30 {
 
    public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
       
        int n = Scanner.nextInt();
        for(int i=1; i<=n; i++) {
             
            for(int j=1; j<=n; j++) {
                 
                if( i == 1 || j == 1 || i==n || j==n ) {
                 
                    System.out.print("*");
                }else {
                    
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
 
}
