package OOP20_3;

class Animal_OOP20_3 {
    void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog_OOP20_3 extends Animal_OOP20_3 {
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat_OOP20_3 extends Animal_OOP20_3 {
    void sound() {
        System.out.println("Cat is meowing");
    }
}

class Cow_OOP20_3 extends Animal_OOP20_3 {
    void sound() {
        System.out.println("Cow is mooing");
    }
}

public class Main17 {
    public static void main(String[] args) {
        Animal_OOP20_3 animal1 = new Dog_OOP20_3();
        animal1.sound();

        Animal_OOP20_3 animal2 = new Cat_OOP20_3();
        animal2.sound();

        Animal_OOP20_3 animal3 = new Cow_OOP20_3();
        animal3.sound();
    }
}

