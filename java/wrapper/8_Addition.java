class Main
{
  public static void main(String args[])
  {
     Integer i=new Integer(10);        //Boxing
     Short s=new Short((short)10);  //Boxing

     int sum=i.intValue() +  s.intValue();  //UnBoxing
     System.out.println(sum); //20
  }
}