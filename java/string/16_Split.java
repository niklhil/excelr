// public String[] split(String delimiter)  

class Main
{
  public static void main(String args[])
  {
    String s="Banana,Apple,Mango";
    String r[]=s.split(",");
    
    for(String x : r)
    {
      System.out.println(x);
    }
  }
}

