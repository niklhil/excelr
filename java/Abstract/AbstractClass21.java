abstract class Vehicle
{
  abstract void move();
}

class Car extends Vehicle
{
   void move()	//Overriding method
   {
     System.out.println("Car is moving"); 
   }
}

class SportsCar extends Car
{
   void move()	//Overriding method
   {
     System.out.println("SportsCar is moving");
   }
}

class Main
{
   public static void main(String args[])
   {
      Vehicle ref;
      
      ref=new Car();
      ref.move(); //Car moving

      ref=new SportsCar();
      ref.move(); //SportsCar moving
   }
}