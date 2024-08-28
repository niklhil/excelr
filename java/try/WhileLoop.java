import java util.Scanner;
class Main
{
   public static void main(String args[])
   {
    Scanner scr=new Scanner(System.in);
    int sum=0;

   while(sum<=4)
    {
     System.out.println("Enter the valaues");
     sum=sum+scr.nextInt();
    }
     System.out.println("Sum:"+sum);
    }
 }