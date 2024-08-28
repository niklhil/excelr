/* 
      System.out - out is object of PrintStream
      System.err  =err is object of PrintStream
      System.in   = in is object of InputStream
*/

/* Read primitives from keyboard */

import java.io.*;

class Main
{
 public static void main(String args[])
 {
   int n1=0;
   int n2=0;
   int sum=0;

    try{ 
          DataInputStream dis=new DataInputStream(System.in);
    
          System.out.println("Enter first no. :");
          n1=Integer.parseInt(dis.readLine());  
          System.out.println(n1);

          System.out.println("Enter second no. :");
          n2=Integer.parseInt(dis.readLine());  
          System.out.println(n2);
       }
       catch(IOException ioe) 
       {
          System.err.println(ioe); 
       }
       catch(NumberFormatException nfe)
       {
         System.err.println("Enter valid number");
         main(null);
         return;
       }
  
        sum=n1+n2;
        System.out.println("Sum : "+sum);
     }
}