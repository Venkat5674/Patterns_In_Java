// Right Triangle
import java.util.Scanner;

class Pattern1 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 <= var3; ++var4) {
            System.out.print("* ");
         }

         System.out.println();
      }

      var1.close();
   }
}
