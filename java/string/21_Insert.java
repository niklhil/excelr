/*
    StringBuffer()
    StringBuffer(int capacity)
    StringBuffer(String value)
*/

//public StringBuffer insert(int index, String value)

class Main
{
  public static void main(String args[])
  {
     StringBuffer sb=new StringBuffer("I am a student");
     sb.insert(6," good");
     System.out.println(sb); // I am a good student
  }
}