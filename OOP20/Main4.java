package OOP20;

abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for full-time employee");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for part-time employee");
    }
}

public class Main4 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculateSalary();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculateSalary();
    }
}
