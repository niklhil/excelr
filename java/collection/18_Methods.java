import java.util.*;

class Main
{
  public static void main(String args[])
  {
    ArrayList<String> al=new ArrayList<String>(5);
    al.add("A");
    al.add("C");
    al.add("D");
    al.add("E");
    al.add("C");
    al.add("G");

    System.out.println(al);
    
    al.add(1,"B"); 
    System.out.println("\n"+al);

    String v=(String)al.set(5,"F");
    System.out.println("\n"+al);
    System.out.println(v);
  
    al.remove("C"); 
    System.out.println("\n"+al);

    al.remove(3); 
    System.out.println("\n"+al);
 
    int l=al.size();
    System.out.println("\n"+l);

    al.clear();
    System.out.println("\n"+al);
  }
}