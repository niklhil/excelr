/* Read character data from a keyboard */

import java.io.*;

class Main
{
  public static void main(String args[]){

     System.out.println("Enter 'quit' to stop...");
     
     try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            String str=br.readLine();
   
            while(!str.equals("quit"))
           {
             System.out.println(str);
             str=br.readLine();	
           }
 
           br.close();    
        }
        catch(IOException ioe)
        {
          ioe.printStackTrace();
        }  
    }
 }