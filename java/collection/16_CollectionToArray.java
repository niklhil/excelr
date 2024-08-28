import java.util.*;

class Main
{
   public static void main(String args[])
   {
      ArrayList<String> al=new ArrayList<String>(5);
      al.add("A");
      al.add("B");
      al.add("C");
      al.add("D");
      al.add("E");

      Object x[]=al.toArray();
      
      for(Object v : x)
      {
        System.out.println("My-"+v);
      }
   }
}