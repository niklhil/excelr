/*
   public StringBuffer append(String s)
   public StringBuffer append(primitiveType value)
*/

class Main
{
  public static void main(String args[])
  {
     StringBuffer sb=new StringBuffer("George");
     sb.append(" Bush is ").append(60).append(" years old.");
     System.out.println(sb);
  }
}