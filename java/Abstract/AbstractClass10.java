// Child class should be declared abstract if it does not override any of the inherited abstract methods.

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

