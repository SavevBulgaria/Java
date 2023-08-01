package LessonI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Class car = new Class();
        System.out.println("name a color !");
        car.setColor(scanner.next());
        System.out.println("The car is: " + car.getColor());
    }
}