class Main
{
   public static void main(String args[])
   {
      double d=10.0;

      //Byte b1=new Byte(d);	   //CE   
      //Byte b1=new Byte("20.0");   //NFE
      //Byte b1=new Byte("A");        //NFE
      //Byte b1=new Byte("20.");     //NFE
      //Byte b1=new Byte("20f");     //NFE    
      Byte b1=new Byte("20");        //20

      System.out.println(b1);
   }
}