class Main
{
  public static void main(String args[])
  {
     int x=25;
     int y=5;
     int r=0;
 
     try
     {
        r=x/y;
        System.out.println(r);  //5
     }
     catch(ArithmeticException ae)
     {
        ae.printStackTrace();
     }

     try
     {
        int z[]={1,2,3};  
        System.out.println(z[r]); 
     }
     catch(ArrayIndexOutOfBoundsException are)
     {
       are.printStackTrace();
     }
   }
 }