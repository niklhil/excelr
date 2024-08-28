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

class Main
{
   public static void main(String args[])
   {
       Vehicle ref;
       ref=new Vehicle();
       ref.move();  //Vehicle is moving

       ref=new Car();
       ref.move();  //Car is moving
   }
}







