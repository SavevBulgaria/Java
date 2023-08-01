package OOP20_2;

interface Soundable {
    void makeSound();
}

class Dog implements Soundable {
    public void makeSound() {
        System.out.println("Barking");
    }
}

class Cat implements Soundable {
    public void makeSound() {
        System.out.println("Meowing");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
