import java.util.Scanner;

class HallowDiamondPattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1; i < n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=(2*i - 1); j++){
                if(j == 1 || j == 2*i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // Down side code
        
        for(int i = n - 1; i >= 1; i--){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++){
                if(j == 1 || j == 2*i - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
