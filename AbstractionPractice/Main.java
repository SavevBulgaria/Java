package AbstractionPractice;

public class Main {
    public static void main(String[] args) {

        Shape Rectagnle = new Rectangle(10, 15, 7);
        Shape Triagnle = new Triangle(5,10,15, 7, 9);



        System.out.println(Rectagnle.perimeter());
        System.out.println(Triagnle.perimeter());
        System.out.println("=======================================");
        System.out.println(Triagnle.area());
        System.out.println(Rectagnle.area());
        System.out.println("=======================================");
        System.out.println(Triagnle.volume());
        System.out.println(Rectagnle.volume());
    }
}
