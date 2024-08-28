//public String concat(String s) 

class Main
{
  public static void main(String args[])
  {
    String s="George";   
    System.out.println(s.concat(" Bush"));//George Bush
    System.out.println(s); //George

    s=s.concat(" Bush");  
    System.out.println(s); //George Bush
  }
}