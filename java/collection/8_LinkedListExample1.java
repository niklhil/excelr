import java.util.*;

class Main
{
  public static void main(String args[])
  {
      LinkedList<Double> l1=new LinkedList<Double>();
      l1.add(1.0);
      l1.add(2.0F); //CE
      l1.add(3.0);
 
      for(Double v : l1)
      {
        System.out.println(v);  
      }
   }
}