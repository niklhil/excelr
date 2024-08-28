//Constructors can not be declared abstract since they can not be overridden

abstract class X
{
  abstract void test();
  abstract X();        //CE     
  abstract X(int i);   //CE
}







