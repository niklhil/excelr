import java.util.*;

class Main
{
   static public void main(String args[])
  {
      LinkedList<String> ll=new LinkedList<String>();
      System.out.println(ll.size()); //0
      ll.add("B");
      ll.add("C");
      ll.add("D");
      ll.add("E");
      ll.add("Y");
      System.out.println(ll.size()); //5
      System.out.println(ll);

      ll.addFirst("A");
      ll.addLast("Z");
      System.out.println(ll);

      System.out.println(ll.contains("D"));
      ll.remove("D"); //Object
      System.out.println(ll.contains("D"));

      ll.remove(2);   //Index
      System.out.println(ll.contains("C"));

      System.out.println(ll.getFirst()); //A
      System.out.println(ll.getLast()); //Z
    }
}