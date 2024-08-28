class Main
{
  public static void main(String args[])
  {
     Integer i1=127; 
     Integer i2=127;
     Integer i3=127;

     if((i1==i2)&&(i2==i3))
     {
        System.out.println("Same reference");
     } 
     else
     {   
       System.out.println("Different references");
     }
   }
}