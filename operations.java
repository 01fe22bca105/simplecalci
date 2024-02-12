// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class operations {
   public operations() {
   }

   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter two numbers:");
      double var2 = var1.nextDouble();
      double var4 = var1.nextDouble();
      double var6 = var2 + var4;
      double var8 = var2 - var4;
      double var10 = var2 * var4;
      double var12 = var2 / var4;
      System.out.println("Sum: " + var6);
      System.out.println("Difference: " + var8);
      System.out.println("Product: " + var10);
      System.out.println("Quotient: " + var12);
      var1.close();
   }
}
