package OOP20_3;

class Shape1 {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle1 extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle1 extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle1();
        shapes[1] = new Rectangle1();
        shapes[2] = new Triangle1();

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

