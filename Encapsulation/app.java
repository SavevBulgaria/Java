package Encapsulation;

public class app {
    public static void main(String[] args) {
        Person person1 = new Person("Johny", 20);
        System.out.println("Person's name: " + person1.getName());
        System.out.println("Person's age: " + person1.getAge());

        System.out.println("***********************");
        Person person2 = new Person();

        person2.setName("Daniel");
        person2.setAge(25);

        System.out.println("Person's name: " + person2.getName());
        System.out.println("Person's age: " + person2.getAge());

    }
}
