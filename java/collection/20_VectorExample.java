import java.util.Vector;
import java.util.Enumeration;

class Main
{
   public static void main(String args[])
   {
      Vector<String> v=new Vector<String>(4);
      System.out.println(v.capacity()); //4

      v.addElement("A");
      v.addElement("B");
      v.addElement("C");
      v.addElement("D");
      v.addElement("E");

      System.out.println(v);
      System.out.println(v.capacity());//8 

      v.addElement("F");
      v.addElement("G");
      v.addElement("H");
      v.addElement("I");
      System.out.println(v.capacity());//16 

      Enumeration e=v.elements();
      while(e.hasMoreElements())
      {
        String s=(String)e.nextElement();
        System.out.println(s);
      }
   }
}