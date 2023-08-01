package OOP20;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}

