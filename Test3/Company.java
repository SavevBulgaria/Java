package Test3;

import java.util.HashMap;
import java.util.Map;

public class Company {
    private String name;
    private Map<Employee, Double> employeesSalaries;

    public Company(String name) {
        this.name = name;
        employeesSalaries = new HashMap();
    }

    public void setEmployeeSalary(Employee employee, double salary) {
        employeesSalaries.put(employee, salary);
    }

    // Create method that prints the employees salaries, sorted by the name of the employee
    public void printEmployeesSalaries() {
        // ...
    }
}
