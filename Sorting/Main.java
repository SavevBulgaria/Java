package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars(1, "Mercedes", "Blue", "Car", "CG23141");
        Cars car2 = new Cars(1, "BMW", "Red", "Car", "BC12341");
        Cars car3 = new Cars(1, "Mercedes", "Red", "Car", "AC11101");
        Cars car4 = new Cars(1, "Mercedes", "Blue", "Car", "PH12414");

        ArrayList<Cars> listOfAllCars = new ArrayList<>();
        listOfAllCars.addAll(Arrays.asList(car1, car2, car3, car4));
        System.out.println(carsByModel(listOfAllCars, "Mercedes"));

    }
    public static ArrayList<Cars> carsByModel(ArrayList<Cars> listOfAllCars, String model) {
        ArrayList<Cars> listOfFilteredCars = new ArrayList<>();

        for (int i = 0; i < listOfAllCars.size(); i++) {
            if (listOfAllCars.get(i).getModel().equals(model)) {
                listOfFilteredCars.add(listOfAllCars.get(i));
            }
        }
        return listOfFilteredCars;
    }
}

