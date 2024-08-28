@FunctionalInterface
interface Test
{  
   void test();  
}  

class X 
{  
    static void show()
    {  
        System.out.println("Welcome! all");  
    }  
}

class Main
{ 
   public static void main(String args[])
    {  
       Test t = X::show;  
       t.test();  
    }  
}  






