@FunctionalInterface
interface Test
{  
   void test(String msg);  
}  

class X implements Test
{  
    public void test(String msg)
    {  
        System.out.println(msg);  
    } 
}

class Main
{
  public static void main(String args[])
  {  
     X x=new X();     
     x.test("Welcome");  
  }  
}