// Child class should be declared abstract if it does not override any of the inherited abstract methods.

abstract class P
{
  void m()
  {
    System.out.println("Hello");
  }
  abstract void n();
  abstract void k();
}

class C extends P  	//CE		
{
   void n()
   {
     System.out.println("Hi");
   } 

}