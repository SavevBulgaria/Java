package OOP20;

abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    abstract void display();
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 123);
        student.display();
    }
}
