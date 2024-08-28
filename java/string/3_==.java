class Main
{
   public static void main(String args[])
   {
     String s1=new String("X");   
     String s2=new String("X");   

     if(s1==s2)  
     {
       System.out.println("Same reference");
     } 
     else
     {
       System.out.println("Different references");      
     }
   }
 }