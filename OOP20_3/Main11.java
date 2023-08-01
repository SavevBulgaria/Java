package OOP20_3;

class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class Main11 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.draw();

        Shape shape3 = new Triangle();
        shape3.draw();
    }
}