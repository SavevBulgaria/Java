package runtime_Polymorphism;

public class app {
    public static void main(String[] args) {
        AnimalSounds dog = new Dog();
        AnimalSounds cat = new Cat();

        System.out.println("What does the dog say ?");
        dog.makeASound();
        System.out.println("What does the cat say ? ");
        cat.makeASound();
    }
}
