//Checked exceptions must have try catch block or throws clause

import java.io.*;

class Main
{
   public static void main(String args[])
   {
      try
      {
        X.test();
      } 
      catch(IOException ioe)
      {
        System.out.println("IO Error");
      }
   }
}

class X
{
   static void test() throws IOException
   {
      DataInputStream dis=new DataInputStream(System.in);
      String s=null;
      System.out.println("Enter some value"); 
      s=dis.readLine(); 
      int v=Integer.parseInt(s);
      System.out.println(v);
   }
}