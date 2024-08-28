/* TreeSet stores the elements in sorted ascending order */

import java.util.*;

class Main
{
   public static void main(String args[])
  {
     TreeSet<String> ts=new TreeSet<String>();
      
     ts.add("Z");
     ts.add("A");
     ts.add("M");
     ts.add("B");
     ts.add("N");
     ts.add("M");
     //ts.add(10); //CE    
     //ts.add(null);   //NPE

     System.out.println(ts);

     for(Object c : ts)
     {
       System.out.println(c);
     }
   }
}