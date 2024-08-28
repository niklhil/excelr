// public boolean equals(String value)

class Main
{
  public static void main(String args[])
 {
    String s1=new String("Scott");
    String s2=new String("Scott");
 
    if(s1.equals(s2))
    {
      System.out.println("Strings are equal");
    } 
    else
    {
      System.out.println("Unequal");
    }
  }
}