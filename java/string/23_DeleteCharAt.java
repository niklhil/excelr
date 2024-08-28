// public StringBuffer deleteCharAt(int index)

class Main
{
  public static void main(String args[])
  {
     StringBuffer sb=new StringBuffer("I am a  student");
     System.out.println(sb); //Original
     sb.deleteCharAt(7); //Modified
     System.out.println(sb);
  }
}