/*
    It is not compulsory for a child class to override all inherited abstract methods.
*/

abstract class P
{
  void m(){
    System.out.println("Hello");
  }
  abstract void n();
  abstract void k();
}

abstract class C extends P  			
{
   void n()
   {
     System.out.println("Hi");
   } 
}

class GC extends C
{
   void k()
   {
     System.out.println("Hey");
   } 
}

class Main
{
  public static void main(String args[])
  {
    GC gc=new GC();
    gc.m();
    gc.n();
    gc.k();
  }
}