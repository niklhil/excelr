import java.util.Scanner;

class Main
{
   public static void main(String[]args)
   {
      Scanner scr=new Scanner(System.in);   
      int rows=0, cols=0;

      System.out.println("How many rows?");    
      rows=scr.nextInt();

      System.out.println("How many columns?");
      cols=scr.nextInt();

      int x[][]=new int[rows][cols];  
 
      for(int i=0; i<rows; i++)
      {
         System.out.println("Enter elements for row "+ (i+1)); 

         for(int j=0; j<cols; j++)
         {
             x[i][j]=scr.nextInt();
         }
       
      }
          System.out.println();

     

      for(int i=0; i<rows; i++)
      {
          for(int j=0; j<cols; j++)
          {
              System.out.print(x[i][j] + "  ");
          }
          System.out.println();
      }
   }
}