//  public boolean startsWith(String s);
//  public boolean endsWith(String s);

class Main
{
  public static void main(String args[])
  {
    String s="Mr.John Smith";

    boolean v=s.startsWith("Mr."); 
    System.out.println(v); //true
    v=s.startsWith("Ms.");    
    System.out.println(v); //false

    v=s.endsWith("Smith"); 
    System.out.println(v); //true
    v=s.endsWith("Bush"); 
    System.out.println(v); //false
  }
}