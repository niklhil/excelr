class Main
{
  public static void main(String args[])
  {
     Integer i1=new Integer(10);
     Integer i2=new Integer(10);

      if(i1==i2)
      {
        System.out.println("Same Reference");
      } 
      else
      {   
       System.out.println("Different References");
      }

      if(i1.equals(i2)){
        System.out.println("Same content");
      } 
      else
      {   
       System.out.println("Different content");
      }
   }
}