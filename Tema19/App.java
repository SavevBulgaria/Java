package Tema19;

public class App {
    public static void main(String[] args) {
        House[] houses = new House[3];
        houses[0] = new House(120.5f, "123 Main St", 2, "John Doe");
        houses[1] = new House(200.0f, "456 Elm St", 3, "Jane Smith");
        houses[2] = new House(150.75f, "789 Oak St", 1, "Bob Johnson");

        // Print all houses
        for (House house : houses) {
            System.out.println(house);
        }

        // Find the house with the largest floor area
        House largestHouse = findLargestHouse(houses);
        System.out.println("\nHouse with the largest floor area:\n" + largestHouse);
    }

    public static House findLargestHouse(House[] houses) {
        House largestHouse = houses[0];
        float largestAreaPerFloor = largestHouse.getArea() / largestHouse.getNumberOfFloors();

        for (int i = 1; i < houses.length; i++) {
            float areaPerFloor = houses[i].getArea() / houses[i].getNumberOfFloors();
            if (areaPerFloor > largestAreaPerFloor) {
                largestHouse = houses[i];
                largestAreaPerFloor = areaPerFloor;
            }
        }

        return largestHouse;
    }
}