/*
1) Create anonymous class
2) Make it implement Payment interface
3) Create object of the class and assign it to destination.
*/

interface Payment
{  
   void pay();  
} 
 
class Main
{  
    public static void main(String args[])
    {  
         double amount=100.0;  
  
         Payment p=new Payment()
         {  
            public void pay()
           {
              System.out.println("Collect your payment of Rs. "+amount);
           }  
        };
 
     p.pay();  
    }  
} 