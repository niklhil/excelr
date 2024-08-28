//public char charAt(int v)

class Main
{
  public static void main(String args[])
  {
     String s="ABCD"; 
     char c=s.charAt(0);
     System.out.println(c); //A

     c=s.charAt(4); //StringIndexOutOfBoundsException
     System.out.println(c);
  }
}