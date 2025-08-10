import java.util.Scanner;

class NumberTriangle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the Number start with : ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
