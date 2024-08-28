class P
{
   int k=1;
   int i=10;
}

class C extends P
{
   int i=100;
}

class GC extends C
{
   int i=1000;

   void show()
   {
       System.out.println(k); //1
       System.out.println(i); //1000
       System.out.println(super.i);//100
       System.out.println(((P)(this)).i);//10
   }
}

class Main
{
   public static void main(String args[])  
   {
      GC gc=new GC();
      gc.show();
   }
}
















