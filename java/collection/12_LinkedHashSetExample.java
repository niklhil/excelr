import java.util.LinkedHashSet;
import java.util.Iterator;

class Main
{
   public static void main(String args[])
   {
       LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
       lhs.add(2);      
       lhs.add(1);
       lhs.add(3);
       lhs.add(4);
       lhs.add(2);
       lhs.add(1);
       lhs.add(null);
       System.out.println(lhs);

       Iterator itr=lhs.iterator();
       while(itr.hasNext())
       {
          int v=(Integer)itr.next();
          System.out.println(v);  
       }
   }
}