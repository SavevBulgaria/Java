package OOP20;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meowing");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}