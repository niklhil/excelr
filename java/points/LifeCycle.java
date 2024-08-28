class Main
{
   int x;
   static int y;

   //Non-static block
    {  
        System.out.println("This is non-static block");    
        System.out.println(x); //0
    }
       
  //Static block
   static
   {
      System.out.println("This is static block");
      System.out.println(y); //0
   }

   //Default constructor 
   Main()
   {
      System.out.println("Default constructor");
   }

   //Parameterized constructor
   Main(int x, int y)
   {
      System.out.println("Parameterized constructor");
      this.x=x;
      this.y=y;       
   }

   //Method
   void show()
   {
      System.out.println(x);
      System.out.println(y);
   }

   public static void main(String args[])
   {
      System.out.println("Main starts");
      Main m=new Main(); 
      Main mm=new Main(10,20); 
      mm.show();
      System.out.println("Main ends");
   }
}