/* Generics is a Java feature which provides application typesafety. When used with collections it ensures that only homogeneous elements are stored. */

import java.util.*;

class Main
{
  public static void main(String args[])
  {
    ArrayList<Integer> al=new ArrayList<Integer>(5); 
    al.add(new Integer(1)); 
    al.add(new Integer(2));
    al.add(new Integer(3));
    al.add(new Integer(4));
    al.add(new Integer(5));
    al.add(new Integer(6));
    //al.add("Z"); //CE

    System.out.println(al+"\n");   

    Iterator itr=al.iterator();
 
    while(itr.hasNext())
    {
      int i=(Integer)itr.next();
      System.out.println(i); 
    }
  }
}