package OOP16;

public class Car {
    int modelYear;
    String modelName;

    String color;
    int hp;


    public Car(int year, String name, String color, int hp) {
        modelYear = year;
        modelName = name;
        this.color = color;
        this.hp = hp;
    }

    public Car(int year, String name, String color) {
        this(year, name, color, 500);
    }

    public Car(String name, String color, int hp) {
        this(1999, name, color, hp);
    }

    public Car(String name) {
        this(2005, name, "red", 250);
    }

    public Car(int year, int hp) {
        this(2011, "Toyota", "blue", 300);
    }

    public Car(String name, String color) {
        this(1987, name, color, 124);
    }

    @Override
    public String toString() {
        return " year: " + modelYear + " name: " + modelName + " color: " + color + " hp: " + hp;
    }
}


