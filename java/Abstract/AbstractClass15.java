/* Abstract class supports constructor */

abstract class P
{
  abstract void test();

  P(){ }
}

class C extends P
{
  void test()
 {
   System.out.println("Test-Method");
 } 
}

class Main
{
  public static void main(String args[])
  {
    C c=new C();
    c.test();
  }  
}