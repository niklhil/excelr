/* Creat a copy of a binary */

import java.io.*;

class Main
{
  public static void main(String args[]){

    FileInputStream fis=null;
    FileOutputStream fos=null;

    File f=new File("d:/video");
    f.mkdirs(); // It creates a folder

    try{
           fis=new FileInputStream("birds.mp4"); 
           fos=new FileOutputStream("d:/video/flamingos.mp4");  

           //fis=new FileInputStream("tiger.jpeg"); 
           //fos=new FileOutputStream("c:/excelrs/video/mytiger.jpeg");  

           BufferedInputStream in=new BufferedInputStream(fis);
           BufferedOutputStream out=new BufferedOutputStream(fos);

           int b=0;
           byte[] i=new byte[1]; 

           b=in.read(i);
            
           while(b!=-1)
           {
              out.write(i); 
              b=in.read(i);     
           }  
         }  
        catch(FileNotFoundException fne)
         {
           fne.printStackTrace();
         } 
         catch(IOException ioe)
         {
           ioe.printStackTrace();
         } 
         finally{
           
          try{

              if(fis!=null){
                 fis.close(); 
                } 
              if(fos!=null){
                 fos.close(); 
                } 
              }
            catch(IOException ioe){
               ioe.printStackTrace();   
            }
        }
    }
}