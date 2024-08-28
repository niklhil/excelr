// public int lastIndexOf(char c);
// public int lastIndexOf(Sring s);

class Main
{
  public static void main(String args[])
  {
    String s1="Javaaa is a programming language";
    int p1=s1.lastIndexOf('a');
    System.out.println(p1); //29

    String s2="Java is a programming language, which is very very easy";
    int p2=s2.lastIndexOf("Very"); 
    System.out.println(p2); //-1 
  }
}