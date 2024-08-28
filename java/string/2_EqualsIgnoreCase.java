//public boolean equalsIgnoreCase(String s)

class Main
{
  public static void main(String args[])
  {
    String s1=new String("Scott");
    String s2="scott";
 
    if(s1.equalsIgnoreCase(s2))
    {
      System.out.println("Strings are equal");
    } 
    else
    {
      System.out.println("Unequal");
    }
  }
}