//Checked exceptions must have try catch block or throws clause for compilation

import java.io.*;

class Main
{
   public static void main(String args[]) 
   {
      DataInputStream dis=new DataInputStream(System.in);
      String s=dis.readLine();  
      int v=Integer.parseInt(s);   
      System.out.println(v);
   }
}




