package Abstraction;

abstract class Shape {
    double h;

    abstract double perimeter();

    abstract double area();

    abstract double volume();
    abstract void print();
}

class Rectangle extends Shape {
    double x;

    Rectangle(double side, double height) {
        x = side;
        h = height;
    }
    @Override
    double perimeter() {
        double rectanglePerimeter = x * 4;
        System.out.println("P = " + rectanglePerimeter);
        return rectanglePerimeter;
    }
    @Override
    double area() {
        double rectangleArea = x * x;
        System.out.println("S = "+rectangleArea);
        return rectangleArea;
    }
    @Override
    double volume() {
        double volumeOfRectangle = perimeter() * h;
        System.out.println("V = " + volumeOfRectangle);
        return volumeOfRectangle;
    }

    @Override
    void print(){
        System.out.println("Data for Rectangle: \n");
    }
}

class Circle extends Shape {
    double r;

    Circle(double radius, double height) {
        r = radius;
        h = height;
    }

    @Override
    double perimeter() {
        double circlePerimeter = 2 * Math.PI * r;
        System.out.println("P = " + circlePerimeter);
        return circlePerimeter;
    }

    @Override
    double area() {
        double circleArea = Math.PI * r * r;
        System.out.println("S = "+circleArea);
        return circleArea;
    }

    @Override
    double volume() {
        double volumeOfCircle = area() * h;
        System.out.println("V = "+volumeOfCircle);
        return volumeOfCircle;
    }
    @Override
    void print(){
        System.out.println("Data for Circle: \n");
    }
}

class Triangle extends Shape {
    double x,y,z;

    Triangle(double a, double b, double c, double height) {
        x = a;
        y = b;
        z = c;
        h = height;
    }

    @Override
    double perimeter() {
        double perimeterOfTriangle = x + y + z;
        System.out.println("P = " + perimeterOfTriangle);
        return perimeterOfTriangle;
    }

    @Override
    double area() {
        double triangleArea = (y * h) / 2;
        System.out.println("S = " + triangleArea);
        return triangleArea;
    }

    double volume() {
        double volumeOfTriangle = area() * h;
        System.out.println("V = " + volumeOfTriangle);
        return volumeOfTriangle;
    }
    void print(){
        System.out.println("Data for Triangle: \n");
    }
}

