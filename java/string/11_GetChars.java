// public void getChars(int startIndex, int endIndex, result char[], int resultStartIndex)

class Main
{
  public static void main(String args[])
  {
     String s="ABCD"; 
     char c[]=new char[5];
     c[0]='A';
     c[1]='B';
     s.getChars(2,4,c,2);
     System.out.println(c); //ABCD
   }
}