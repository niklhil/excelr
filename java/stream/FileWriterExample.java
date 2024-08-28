/* Write character data to a file */

import java.io.*;

class Main
{
  public static void main(String args[]){

   try{
   
        FileWriter fw=new FileWriter("result.doc",true);
        BufferedWriter out=new BufferedWriter(fw);
  
        out.write("Java coding......."+System.getProperty("line.separator"));  
   
        out.close();
        fw.close();
      }
      catch(IOException ioe)
      {
         ioe.printStackTrace();  
      }
  }
}