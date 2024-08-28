import java.util.Scanner;

class Main
{
   public static void main(String args[])
   {
       Scanner scr=new Scanner(System.in);
       int sum=100;

       do
       {
          System.out.println("Enter a value");
          sum=sum+scr.nextInt();

       }while(false);

       System.out.println(sum);
   }
}