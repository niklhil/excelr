/*HashMap is not synchronized */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Main
{
  public static void main(String args[]){
    
     HashMap<Integer,String> emps=new HashMap<Integer,String>();

     emps.put(1,"Scott");
     emps.put(2,"Mark");
     emps.put(3,"John");
     emps.put(4,"Bush");
     emps.put(null,"Bush");
    
     Set keys=emps.keySet();
    
     Iterator itr=keys.iterator();

     while(itr.hasNext()){
       Integer key=(Integer)itr.next();
       System.out.println(key + "           : " +emps.get(key)); 
     }  
  }
}