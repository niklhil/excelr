import java.util.*;

class Main
{
   public static void main(String args[])
   {
     String x[]={"C","B","A","B","C"};
     List<String> l=Arrays.asList(x); 		//asList() creates a list based collection using an array
     TreeSet<String> s=new TreeSet<String>(l);
     System.out.println(s);
   }
}