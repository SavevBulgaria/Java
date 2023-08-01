package OOP09Homework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Cars> cars = new ArrayList<Cars>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What function would you like to do : ADD/REMOVE/PRINT/EXIT");
        String function = "1";
        while (!function.equals("EXIT")) {
            System.out.println("Next function");
            function = scanner.nextLine();
            switch (function) {

                case "ADD":
                    System.out.println("Enter brand : ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter model : ");
                    String newModel = scanner.nextLine();
                    cars.add(addCar(newBrand, newModel));
                    break;
                case "REMOVE":
                    System.out.println("Pick a car by ID to remove");
                    int carID = scanner.nextInt();
                    Remove(carID);
                    break;
                case "PRINT":
                    Printer();

                case "EXIT":
                    break;
            }
        }
    }

    public static Cars addCar(String brand, String model) {
        Cars car1 = new Cars(brand, model);
        return car1;
    }

    public static void Remove(int carID) {
        cars.remove(carID);
        System.out.println("The car has been removed");
    }

    public static void Printer() {
        int number = 1;
        System.out.println("\n"+"{********[*]*******}"+"\n");
        for (Cars car : cars) {

            System.out.println("Car number " + number);
            System.out.println("Car brand : " + car.brand);
            System.out.println("Car model : " + car.model);
            System.out.println("\n"+"{********[*]*******}"+"\n");
            number++;
        }
    }
}





