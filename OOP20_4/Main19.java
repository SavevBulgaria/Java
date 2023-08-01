package OOP20_4;

class Student {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main19 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setRollNo(1);
        student.setAge(20);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Roll No: " + student.getRollNo());
        System.out.println("Student Age: " + student.getAge());
    }
}
