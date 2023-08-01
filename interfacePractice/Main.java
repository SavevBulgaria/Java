package interfacePractice;

public class Main {
    public static void main(String[] args) {
        PrintMethod.printMethod();

        Circle circle1 = new Circle();
        circle1.draw();

        MathFormulas ex1 = new MathFormulas();
        ex1.division(12,3);
        PrintMethod.printMethod();
        ex1.minus(12,3);
        PrintMethod.printMethod();
        ex1.multiplication(12,3);
        PrintMethod.printMethod();
        ex1.perimetur(12,3);
        PrintMethod.printMethod();
        ex1.summationValue(12,3);
        PrintMethod.printMethod();
        ex1.volume(12,3,10);
    }
}
