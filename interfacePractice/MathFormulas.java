package interfacePractice;

public class MathFormulas implements Sum, Formulas {
    @Override
    public double division(int a, int b) {
        System.out.println(a / b);
        return a / b;
    }

    @Override
    public double multiplication(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }

    @Override
    public double minus(int a, int b) {
        double answer = Math.abs(a - b);
        System.out.println(answer);
        return answer;
    }

    @Override
    public double sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }

    @Override
    public double volume(double a, double b, double h) {
        System.out.println(a * b * h);
        return a * b * h;
    }

    @Override
    public double perimetur(double a, double b) {
        double answer = (a + b) * 2;
        System.out.println(answer);
        return answer;
    }

    @Override
    public double summationValue(double a, double b) {
        double answer = a * b;
        System.out.println(answer);
        return answer;
    }
}
