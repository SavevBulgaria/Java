package OOP9;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 dog default
        Dog myFirstDog = new Dog();

        //2 dog parm
        Dog mySecondDog = new Dog("Ivan Vazov", 2);
        //3 dog default
        Dog myThirdDog = new Dog();
        //ask user for name and set field name
        System.out.println("Please enter name : ");
        String name = scanner.nextLine();
        //ask user for age and set field age
        System.out.println("Please input age : ");
        int age = scanner.nextInt();

        myThirdDog.setName(name);
        myThirdDog.setAge(age);

        //define array and put dogs in it
        Dog[] dogs = {myFirstDog, mySecondDog, myThirdDog};
        //itterete over an array and print all info for dogs and call methods
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            dog.bark();
        }
    }
}
