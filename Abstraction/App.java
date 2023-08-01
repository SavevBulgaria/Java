package Abstraction;

public class App {
    public static void main(String[] args) {

        PrintClass.printBetween();

        Shape rectangle = new Rectangle(15,0);
        rectangle.print();
        rectangle.perimeter();
        rectangle.area();
        rectangle.volume();

        PrintClass.printBetween();

        Shape circle = new Circle(5,5);
        circle.print();
        circle.perimeter();
        circle.area();
        circle.volume();

        PrintClass.printBetween();

        Shape triangle = new Triangle(7,21,12,12);
        triangle.print();
        triangle.perimeter();
        triangle.area();
        triangle.volume();

        PrintClass.printBetween();

    }
}
