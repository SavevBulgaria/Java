package PolymorphismPractice;

public class Main  {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        double c = 2.5;
        double d = 5.5;

        System.out.println(sum(a,b));
        System.out.println(sum(d,c));

    }
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a - b;
    }

}