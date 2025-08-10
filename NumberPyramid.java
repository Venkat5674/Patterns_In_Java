import java.util.Scanner;

class PyriamidPattern{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Number: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
