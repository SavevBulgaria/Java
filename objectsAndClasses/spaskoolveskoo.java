package objectsAndClasses;

import java.util.Arrays;
import java.util.Scanner;

public class spaskoolveskoo {
    static Scanner scanner = new Scanner(System.in);
    static String input = "dEnd";

    public static void main(String[] args) {

        System.out.println("Enter size of the array");
        Class1 object1 = new Class1();
        Class2 object2 = new Class2();
        for (int i = 0; i < object1.x; i++) {
            object2.arr[i] = scanner.nextDouble();
        }
        System.out.println(Arrays.toString(object2.arr));
        do {

            switch (scanner.nextLine()) {
                case "end":
                    input = "end";
                    break;

                case "sum":
                    System.out.println("The sum of the two variables is : " + methods.sum(object2.arr));

                    break;
                case "avrg":
                    System.out.println("The average of the two variables is : " + methods.avrg(object1.x, object2.arr));
                    break;
                case "even?", "odd?":
                    double index = methods.evenOdd(object1.x, object2.arr);
                    if (index != 0) {
                        System.out.println("The sum is odd : " + methods.sum(object2.arr) + " remainder is : " + index);
                    } else {
                        System.out.println("The sum is even : " + methods.sum(object2.arr) + " remainder is 0");
                    }
                    break;
            }

            System.out.println("What function with 2 numbers do you wish to calculate : ");
        } while (!input.equals("end"));
    }
}