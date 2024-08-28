interface Vehicle {
    void start();

    default void displayStatus() {
        System.out.println("Vehicle is started");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting.");
    }
}

class SportsCar implements Vehicle {
    public void start() {
        System.out.println("SportsCar is starting.");
    }
}

 class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle sportsCar = new SportsCar();

        car.start();
        car.displayStatus();

        System.out.println();

        sportsCar.start();
        sportsCar.displayStatus();
    }
}
