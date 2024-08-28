@FunctionalInterface
interface Test
{  
   void test();  
}  

class X
{  
    void show()
    {  
        System.out.println("Good morning");  
    }  
}
    
class Main
{ 
   public static void main(String args[])
    {  
        X x = new X(); 
        Test t = x::show;  
        t.test();  //Good morning

        Test t1  = new X()::show; 
        t1.test();  //Good morning
    }  
}