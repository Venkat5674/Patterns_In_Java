import java.util.Scanner;

class TreePattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
               System.out.print(" ");
                }
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }    
            System.out.println();
        }
        
       for(int i = 0; i < 2; i++){
           for(int j = 0; j < n - 2; j++){
               System.out.print(" ");
           }
           System.out.println("***");
       }
        
    }
}
