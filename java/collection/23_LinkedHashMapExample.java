/* LinkedHashMap is not synchronized */

import java.util.LinkedHashMap;

class Main
{
  public static void main(String args[]){
     LinkedHashMap<String,String> names=new LinkedHashMap<String,String>();

     names.put("4",null);  // Multiple null value permitted
     names.put("2","Mark");
     names.put("1","Scott");
     names.put("3","John");
     names.put(null,"Bush");
     names.put(null,null); // Only one null key permitted
     names.put("1","Rose");  //Will replace the first entry

     System.out.println(names);
   }
}