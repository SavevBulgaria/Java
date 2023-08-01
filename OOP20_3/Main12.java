package OOP20_3;

class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat is meowing");
    }
}

public class Main12 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();

        Animal animal3 = new Cat();
        animal3.makeSound();
    }
}
