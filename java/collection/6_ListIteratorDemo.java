import java.util.ArrayList;
import java.util.ListIterator;

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

    ListIterator litr=al.listIterator();

    String v;

    while(litr.hasNext())
    {
       v=(String)litr.next();
       System.out.println(v);
    }

    System.out.println();   

    while(litr.hasPrevious())
    {
       v=(String)litr.previous();
       System.out.println(v);
    }
  }
}