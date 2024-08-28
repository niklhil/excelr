/*
   public String substring(int startIndex)
   public String substring(int startIndex, int endIndex)
*/

class Main
{
  public static void main(String args[])
  {
    StringBuffer s=new StringBuffer("George Bush");
    String r1=s.substring(0);
    System.out.println(r1); //George Bush

    String r2=s.substring(0,6);
    System.out.println(r2); //George

    String r3=s.substring(0,12); //Exception
    System.out.println(r3);
  }
}