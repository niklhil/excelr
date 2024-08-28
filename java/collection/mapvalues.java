/*
public Collection values()
*/

import java.util.HashMap;
import java.util.Collection;
class Main
{
public static void main(String args[])
{
HashMap<Integer,String> emps=new HashMap<Integer, String>();
emps.put(3,null);
emps.put(1,"Scott");
emps.put(4,"Bush");
emps.put(2,"Mark");
emps.put(null,"Bush");

System.out.println(emps);
Collection c=emps.values();
for(Object v: c)
{
System.out.println("My name is "+v);
}
}
}