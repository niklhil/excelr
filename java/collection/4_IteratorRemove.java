import java.util.*;

class Main
{
  public static void main(String args[])
  {
    ArrayList<String> al=new ArrayList<String>(5);
    al.add("A");
    al.add("D");
    al.add("C");
    al.add("D");
    al.add("E");
    al.add("D");

    System.out.println(al); 

    Iterator itr=al.iterator();
   
    while(itr.hasNext())
    {
      String c=(String)itr.next();
      System.out.println("My-"+c);
      
      if(c.equals("D"))
      {
        itr.remove();
      }
    }
    System.out.println(al); 
  }
}