import java.util.Scanner;

class Main
{
   public static void main(String args[])
   {
      Scanner scr=new Scanner(System.in);
      int x, y, z;

      System.out.println("Enter x value");
      x=scr.nextInt();

      System.out.println("Enter y value");
      y=scr.nextInt();

      try
      {   
         z=x/y;
         System.out.println("The result is : "+z);
      }
      catch(ArithmeticException ae)
      {
          System.out.println("Enter non-zero y value");
          main(null);
      }
   }
}