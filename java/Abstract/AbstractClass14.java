/* Local variables can not be abstract.  */

abstract class X
{
  void test()
  {
     abstract int i;  //CE  
  }
}







