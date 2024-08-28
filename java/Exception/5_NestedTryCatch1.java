/* If a nested try block does not have required catch block then the enclosing try block's suitable catch block handles the exception. */

import java.io.DataInputStream;
import java.io.IOException;

class Main
{
   public static void main(String args[])
   {
     DataInputStream dis=new DataInputStream(System.in);  
    
     int x=25;
     int y=0;
     int r=0;

     try
     {    

  	 	try
    	   	{
       		  System.out.println("Enter value");
	  	  y=Integer.parseInt(dis.readLine()); 
       		  r=x/y;  
      		  System.out.println(r);
         		}
    	 	catch(IOException ioe)
	 	{
      		  ioe.printStackTrace();
               		}

   
     }
     catch(ArithmeticException ae)
     {
       	System.out.println("Dont enter zero!!");
       	main(null);
                return;
     } 

   System.out.println("END"); 
   }
 }