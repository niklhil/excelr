/* Read character data from a keyboard */

import java.io.*;

class Main
{
  public static void main(String args[])
  {

     System.out.println("Enter 'q' to stop...");
     
     try{

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            char ch=(char)br.read();   
   
            while(ch!='q')
           {
             System.out.println(ch);
             ch=(char)br.read();
           }
 
         br.close();    
        }
       catch(IOException ioe)
       {
         ioe.printStackTrace();
       }  
    }
}