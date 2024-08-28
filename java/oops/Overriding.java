class Vehicle
{
    void move()
    {
       System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle
{
}

class Main
{
   public static void main(String args[])
   {
      Vehicle v=new Vehicle();
      v.move(); 	//Vehicle is moving 

      Car c=new Car();
      c.move();	//Vehicle is moving
   }
}
