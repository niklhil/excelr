class X
{
   void m()
   {
       int a=10;
       System.out.println(a); //10
       n(a); 
       System.out.println(a); //10
    }

    void n(int i)
    {
         ++i;
         System.out.println(i); //11
    }
}

class Main
{
   public static void main(String args[])
   {
       X xObj=new X();
       xObj.m();        
   }
}