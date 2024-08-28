class Vehicle
{
    void move()  //Overridden method
    {
       System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle
{
    void move()  //Overriding method
    {
       System.out.println("Car is moving");
    }
}

class Main
{
   public static void main(String args[])
   {
      Vehicle v=new Vehicle();
      v.move(); 	//Vehicle is moving 

      Car c=new Car();
      c.move();	//Car is moving
   }
}
