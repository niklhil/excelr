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
    	      catch(NumberFormatException nfe)
	      {
      	           nfe.printStackTrace();
     	      }
	      catch(ArithmeticException ae)
     	      {
                          System.out.println("Nested one");
                          main(null);
                          return;
       	      } 
     }
     catch(ArithmeticException ae)
     {
       System.out.println("Enter non-zero value");
       main(null);
     }

     System.out.println("END"); 
   }
 }