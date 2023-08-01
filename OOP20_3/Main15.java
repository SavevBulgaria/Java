package OOP20_3;

class Animal1 {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat1 extends Animal1 {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

class Cow extends Animal1 {
    void sound() {
        System.out.println("Cow is mooing");
    }
}

public class Main15 {
    public static void main(String[] args) {
        Animal1[] animals = new Animal1[3];
        animals[0] = new Dog1();
        animals[1] = new Cat1();
        animals[2] = new Cow();

        for (Animal1 animal : animals) {
            animal.sound();
        }
    }
}

