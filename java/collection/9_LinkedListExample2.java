import java.util.*;

class Main
{
  public static void main(String args[])
  {
      LinkedList<Integer> ll=new LinkedList<Integer>();
      ll.add(10);
      ll.add(20);
      ll.add(30);
      ll.add(2);
      System.out.println(ll); 

      ll.remove(2);                // remove(int index) method
      ll.remove(new Integer(2)); //Removes element 2
      System.out.println(ll); // 10, 20
    }
}