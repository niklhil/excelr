// public int indexOf(char c);
// public int indexOf(Sring s);   

class Main
{
   public static void main(String args[])
   {
      String s1="Java";
      int p1=s1.indexOf('a');
      System.out.println(p1); //1

      String s2="George Bush";
      int p2=s2.indexOf("Bush");
      System.out.println(p2); //7

      int p3=s2.indexOf("bush");
      System.out.println(p3); //-1

      int p4=s1.indexOf('j');
      System.out.println(p4); //-1
   }
}