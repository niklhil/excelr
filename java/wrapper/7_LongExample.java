class Main
{
    public static void main(String args[])
    {
      Long l =new Long(1);
      //Long l =new Long(1000000L);
      //Long l =new Long("1000000");
      //Long l =new Long(100.0); //CE
      //Long l =new Long('A');
      //Long l =new Long("A"); //NFE

       System.out.println(l);
    }
}


