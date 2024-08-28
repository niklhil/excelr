//public StringBuffer delete(int startIndex, int endIndex);

class Main
{
  public static void main(String args[])
  {
     StringBuffer sb=new StringBuffer("I am a good student");
     sb.delete(7,12);
     System.out.println(sb);
  }
}