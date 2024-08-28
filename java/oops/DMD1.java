import java.util.Scanner;

class Vehicle
{
   void move()
   {
      System.out.println("Vehicle is moving");
   }
}

class Car extends Vehicle
{
   void move()
   {
      System.out.println("Car is moving");
   }
}

class SportsCar extends Car
{
   void move()
   {
      System.out.println("SportsCar is moving");
   }
}

class Main
{
   public static void main(String args[])
   {
      Scanner scr=new Scanner(System.in);
      int i;
      Vehicle ref;

      System.out.println("Enter a value between 1 & 3, inclusive");   
      i=scr.nextInt();

      switch(i)
      {
         case 1:
          ref=new Vehicle();
         break;

         case 2:
          ref=new Car();
         break;

         case 3:
          ref=new SportsCar();
         break;

         default:
           System.out.println("Invalid entry");       
         return;  
      }
      ref.move();
   }
}


