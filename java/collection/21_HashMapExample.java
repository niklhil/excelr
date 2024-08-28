/*HashMap is not Synchronized  */

import java.util.HashMap;

class Main
{
  public static void main(String args[])
  {

     HashMap<String,String> names=new HashMap<String,String>(); 

     names.put("1","Scott");
     names.put("2","Mark");
     names.put("3","John");
     names.put("4",null);  // Multiple null values permitted
     names.put("5",null);  // Multiple null values permitted
     names.put(null,"Bush");
     names.put(null,null); // Only one null key permitted
     names.put("1","Rose");  // Will replace the first entry

     System.out.println(names);
   }
}