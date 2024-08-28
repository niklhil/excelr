class Main
{
  public static void main(String args[])
  {
     Integer i1=127;
     Integer i2=new Integer(127);

     if(i1==i2)
     {
       System.out.println("Same reference");
     } 
     else
     {   
      System.out.println("Different references");
     }
   }
}