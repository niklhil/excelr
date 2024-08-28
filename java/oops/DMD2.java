import java.util.Scanner;

class Vehicle
{
   static void move()
   {
      System.out.println("Vehicle is moving");
   }
}

class Car extends Vehicle
{
   static void move()
   {
      System.out.println("Car is moving");
   }
}

class SportsCar extends Car
{
   static void move()
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
      Vehicle ref=null;

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
      }
      ref.move();
   }
}


