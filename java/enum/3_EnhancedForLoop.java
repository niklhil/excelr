enum Days
{
   SUN,MON,TUE,WED,THU,FRI,SAT;
}

class Main
{
  public static void main(String args[])
  {
    for(Days x : Days.values())
    {
      System.out.println(x + " "+x.ordinal()); 
    } 
  }
}


