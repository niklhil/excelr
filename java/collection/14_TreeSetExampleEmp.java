/* This program causes Runtime Error - ClassCastException */
import java.util. TreeSet;
class Emp
{
int id;
String name;
}
class Main
{
public static void main(String args[])
{
TreeSet<Emp> ts=new TreeSet<Emp>();
ts.add(new Emp());
ts.add(new Emp());
ts.add(new Emp());
ts.add(new Emp());
ts.add(new Emp());
System.out.println(ts);
}
}