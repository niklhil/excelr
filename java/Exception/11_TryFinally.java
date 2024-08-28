class Main
{
   public static void main(String args[])
   {
    try
    {
      int x=25/0;
      System.out.println(x); 
    }
    finally 
    {
      System.out.println("finally");
    }
  }
}



