import java.util.*;

class Main
{
  public static void main(String args[])
  {
    ArrayList<Integer> al=new ArrayList<Integer>(5);
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(2);
    al.add(null);
    al.add(null);

    System.out.println(al);

    for(Integer ref : al)
    {
      System.out.println(ref);
    } 
  }
}