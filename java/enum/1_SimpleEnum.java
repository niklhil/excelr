enum Days 
{ 
   SUN, MON, TUE, WED, THU, FRI, SAT; 
}

class Main
{
   public static void main(String args[])
   {
      Days d=null;
      System.out.println(d); //NULL
      System.out.println(d.SUN); //SUN
      System.out.println(Days.MON);//MON
      System.out.println(d.SAT.ordinal());
       //System.out.println(d.ordinal());//NPE
   }
}