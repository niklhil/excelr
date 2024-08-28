import java.util.*;

class Main
{
  public static void main(String args[])
  {
      LinkedList<Double> l1=new LinkedList<Double>(); 
      l1.add(1.0);
      l1.add(2.0);
      l1.add(3.0);
      l1.add(4.0);
      l1.add(4.0);
      l1.add(5.0);

      for(Double v : l1)
      {
        System.out.println(v);  
      }
   }
}