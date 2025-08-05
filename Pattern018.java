import java.util.Scanner;
public class Pattern018 {
    public static void main(String [] args){
        
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
