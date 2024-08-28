/* Try block may have multiple catch blocks. However only one catch block executes at any point of time. */

import java.io.DataInputStream;
import java.io.IOException;

class Main
{
  public static void main(String args[])
  {
    DataInputStream dis=new DataInputStream(System.in); 
    
    try
      {   
         System.out.println("Enter x value");
         int x=Integer.parseInt(dis.readLine());   

         System.out.println("Enter y value");
         int y=Integer.parseInt(dis.readLine());  
   
         int r=x/y;
         System.out.println("Result : "+r); 
      }  
     catch(ArithmeticException ae)
     {
       System.out.println("Division by zero error");
       main(null);
       return;
     }
    catch(NumberFormatException nfe)
    {
      System.out.println("Enter valid number");
      main(null);
      return;
    }
    catch(IOException ioe)
    {
     System.out.println("IO-Error");
    }

    System.out.println("END");
  }
}