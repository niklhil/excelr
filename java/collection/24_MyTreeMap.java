import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

class Main
{
  public static void main(String[] args) 
  {
    TreeMap<String, String> tMap = new TreeMap<String, String>(); 

    tMap.put("4", "D");
    tMap.put("3", "C");
    tMap.put("1", "A");
    tMap.put("5", "E");
    tMap.put("2", "B");
    //tMap.put(null, "F"); //NPE
    tMap.put("6", null);

    System.out.println("Initial map contents : "+tMap);	

    System.out.println("Value for key 2 : " +tMap.get("2"));	

    tMap.remove("2"); 
    System.out.println("Contents after deleting key 2 : "+tMap);	

    tMap.remove("1");
    System.out.println("\nValue for key  1 present : " +tMap.containsKey("1"));

    System.out.println(tMap);
  }
}