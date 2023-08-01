package OOP20_3;

class Vehicle {
    void speed() {
        System.out.println("Speed of Vehicle");
    }
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("Speed of Bike: 60 km/hr");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Speed of Car: 100 km/hr");
    }
}

public class Main16 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.speed();

        Vehicle bike = new Bike();
        bike.speed();

        Vehicle car = new Car();
        car.speed();
    }
}
