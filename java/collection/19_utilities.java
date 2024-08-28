import java.util.*;

class Main
{
  public static void main(String args[])
 {
    ArrayList<String> al=new ArrayList<String>(5);
    al.add("C");
    al.add("A");
    al.add("D");
    al.add("G");
    al.add("D");
    al.add("E");
    al.add("D");

    System.out.println(al);

    Collections.sort(al);
    System.out.println("\n"+al);

    int i=Collections.binarySearch(al,"G");
    System.out.println("\n"+i+" "+al.get(i));    
   
    String max=Collections.max(al); 
    System.out.println("\n"+max);    
    
    String min=Collections.min(al); 
    System.out.println("\n"+min); 

    System.out.println("\n"+al); 

    Collections.rotate(al,2);
    System.out.println("\n"+al); 

    int f=Collections.frequency(al,"D"); 
    System.out.println(f); 
  }
}