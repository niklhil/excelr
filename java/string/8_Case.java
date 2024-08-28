// public String toUpperCase();
// public String toLowerCase();

class Main
{
  public static void main(String args[])
  {
     String s1="scott"+100;
     System.out.println(s1.toUpperCase()); //SCOTT100
     System.out.println(s1); //scott100

     String s2="SCOTT";
     System.out.println(s2.toLowerCase()); //scott
     System.out.println(s2); //SCOTT
  }
}