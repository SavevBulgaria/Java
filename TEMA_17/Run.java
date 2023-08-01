package TEMA_17;

public class Run {
    public static void main(String[] args) {

        Animal dog = new Dog("Sharo", 2);
        Animal cat = new Cat("James", 3);

        System.out.println(dog.toString());
        System.out.println(dog.talk());

        System.out.println();

        System.out.println(cat.toString());
        System.out.println(cat.talk());

    }
}

