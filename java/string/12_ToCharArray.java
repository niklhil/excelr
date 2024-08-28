// public char[] toCharArray()

class Main
{
  public static void main(String args[])
  {
     String s="ABCD"; 
     char c[]=s.toCharArray();

     for(char x : c)
     {
       System.out.println(x);
     }
  }
}