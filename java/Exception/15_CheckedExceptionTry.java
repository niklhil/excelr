//Checked exception must have try catch block or throws clause

import java.io.*;

class Main
{
   public static void main(String args[])
   {
      DataInputStream dis=new DataInputStream(System.in);
      String s=null;
 
      try
      {
        System.out.println("Enter some value"); 
        s=dis.readLine(); 
      }
      catch(IOException ioe)
      {
        System.out.println("IO-Error");
      }  
 
      int v=Integer.parseInt(s);
      System.out.println(v);
   }
}