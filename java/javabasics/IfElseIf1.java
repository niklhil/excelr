import java.util.Scanner;

class Main
{
   public static void main(String [] args)
   {
       Scanner scr=new Scanner(System.in);
       int marks; 
 
       System.out.println("Enter your marks");
       marks=scr.nextInt();

       if(marks>=90)
       {
            System.out.println("S-Grade");
       }
      else if(marks>=80)
      {
         System.out.println("A-Grade");
      } 
      else if(marks>=70)
      {
          System.out.println("B Grade");  
      }
      else if(marks>=60)
      {
          System.out.println("C Grade");  
      }
      else if(marks>=50)
      {
          System.out.println("D Grade");  
      }
      else
      {
           System.out.println("NO COMMENTS");
      }
   }
}












