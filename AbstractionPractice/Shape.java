package AbstractionPractice;

public abstract class Shape {

    double x;
    abstract public double perimeter();
    abstract public double area();
    abstract public double volume();


}

class Rectangle extends Shape {
    double a;
    double b;
    double x;

    public Rectangle(double a, double b, double height) {
        this.a = a;
        this.b = b;
        x = height;
    }

    @Override
    public double perimeter() {
        double result = 2 * a + 2 * b;
        return result;
    }

    public double area(){
        double result = a*b;
        return result;
    }
    public double volume(){
        double result = area()*x;
        return result;
    }
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    double h;
    double x;

    public Triangle(double a, double b, double c, double h, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        x = height;
    }

    @Override
    public double perimeter() {
        double result = a + b + c;
        return result;
    }
    public double area(){
        double result = (c*h)/2;
        return result;
    }
    public double volume(){
        double result = area()*x;
        return result;
    }
}
