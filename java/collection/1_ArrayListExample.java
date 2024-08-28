import java.util.ArrayList;

class Main
{
 public static void main(String []args)
 {
  ArrayList a=new ArrayList(5);
  a.add(new Integer(1));
  a.add(new Integer(2));
  a.add(new Integer(3));
  a.add(new Integer(4));
  a.add("Y");
  System.out.println(a);
 }
}